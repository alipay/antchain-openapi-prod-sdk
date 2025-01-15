<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\MARKETING\Models\AddLeadBusinessRequest;
use AntChain\MARKETING\Models\AddLeadBusinessResponse;
use AntChain\MARKETING\Models\CreateLeadClueRequest;
use AntChain\MARKETING\Models\CreateLeadClueResponse;
use AntChain\MARKETING\Models\QueryCouponAvaliableRequest;
use AntChain\MARKETING\Models\QueryCouponAvaliableResponse;
use AntChain\MARKETING\Models\QueryCouponPagelistRequest;
use AntChain\MARKETING\Models\QueryCouponPagelistResponse;
use AntChain\MARKETING\Models\QueryCouponPageRequest;
use AntChain\MARKETING\Models\QueryCouponPageResponse;
use AntChain\MARKETING\Models\QueryCouponRequest;
use AntChain\MARKETING\Models\QueryCouponResponse;
use AntChain\MARKETING\Models\QueryDocChildRequest;
use AntChain\MARKETING\Models\QueryDocChildResponse;
use AntChain\MARKETING\Models\QueryDocRequest;
use AntChain\MARKETING\Models\QueryDocResponse;
use AntChain\MARKETING\Models\QueryYouhuiTemplateRequest;
use AntChain\MARKETING\Models\QueryYouhuiTemplateResponse;
use AntChain\MARKETING\Models\SendCouponAnnotatedRequest;
use AntChain\MARKETING\Models\SendCouponAnnotatedResponse;
use AntChain\MARKETING\Models\SendCouponRequest;
use AntChain\MARKETING\Models\SendCouponResponse;
use AntChain\MARKETING\Models\SubmitActivityInformationRequest;
use AntChain\MARKETING\Models\SubmitActivityInformationResponse;
use AntChain\MARKETING\Models\SyncActivityAssetsRequest;
use AntChain\MARKETING\Models\SyncActivityAssetsResponse;
use AntChain\Util\UtilClient;
use Exception;

class Client
{
    protected $_endpoint;

    protected $_regionId;

    protected $_accessKeyId;

    protected $_accessKeySecret;

    protected $_protocol;

    protected $_userAgent;

    protected $_readTimeout;

    protected $_connectTimeout;

    protected $_httpProxy;

    protected $_httpsProxy;

    protected $_socks5Proxy;

    protected $_socks5NetWork;

    protected $_noProxy;

    protected $_maxIdleConns;

    protected $_securityToken;

    protected $_maxIdleTimeMillis;

    protected $_keepAliveDurationMillis;

    protected $_maxRequests;

    protected $_maxRequestsPerHost;

    /**
     * Init client with Config.
     *
     * @param config config contains the necessary information to create a client
     * @param mixed $config
     */
    public function __construct($config)
    {
        if (Utils::isUnset($config)) {
            throw new TeaError([
                'code'    => 'ParameterMissing',
                'message' => "'config' can not be unset",
            ]);
        }
        $this->_accessKeyId             = $config->accessKeyId;
        $this->_accessKeySecret         = $config->accessKeySecret;
        $this->_securityToken           = $config->securityToken;
        $this->_endpoint                = $config->endpoint;
        $this->_protocol                = $config->protocol;
        $this->_userAgent               = $config->userAgent;
        $this->_readTimeout             = Utils::defaultNumber($config->readTimeout, 20000);
        $this->_connectTimeout          = Utils::defaultNumber($config->connectTimeout, 20000);
        $this->_httpProxy               = $config->httpProxy;
        $this->_httpsProxy              = $config->httpsProxy;
        $this->_noProxy                 = $config->noProxy;
        $this->_socks5Proxy             = $config->socks5Proxy;
        $this->_socks5NetWork           = $config->socks5NetWork;
        $this->_maxIdleConns            = Utils::defaultNumber($config->maxIdleConns, 60000);
        $this->_maxIdleTimeMillis       = Utils::defaultNumber($config->maxIdleTimeMillis, 5);
        $this->_keepAliveDurationMillis = Utils::defaultNumber($config->keepAliveDurationMillis, 5000);
        $this->_maxRequests             = Utils::defaultNumber($config->maxRequests, 100);
        $this->_maxRequestsPerHost      = Utils::defaultNumber($config->maxRequestsPerHost, 100);
    }

    /**
     * Encapsulate the request and invoke the network.
     *
     * @param string         $version
     * @param string         $action   api name
     * @param string         $protocol http or https
     * @param string         $method   e.g. GET
     * @param string         $pathname pathname of every api
     * @param mixed[]        $request  which contains request params
     * @param string[]       $headers
     * @param RuntimeOptions $runtime  which controls some details of call api, such as retry times
     *
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     *
     * @return array the response
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $headers, $runtime)
    {
        $runtime->validate();
        $_runtime = [
            'timeouted'          => 'retry',
            'readTimeout'        => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout'     => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'          => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'         => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'            => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'       => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'maxIdleTimeMillis'  => $this->_maxIdleTimeMillis,
            'keepAliveDuration'  => $this->_keepAliveDurationMillis,
            'maxRequests'        => $this->_maxRequests,
            'maxRequestsPerHost' => $this->_maxRequestsPerHost,
            'retry'              => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
            // 目录对象
        ];
        $_lastRequest   = null;
        $_lastException = null;
        $_now           = time();
        $_retryTimes    = 0;
        while (Tea::allowRetry(@$_runtime['retry'], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime(@$_runtime['backoff'], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;

            try {
                $_request           = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method   = $method;
                $_request->pathname = $pathname;
                $_request->query    = [
                    'method'           => $action,
                    'version'          => $version,
                    'sign_type'        => 'HmacSHA1',
                    'req_time'         => UtilClient::getTimestamp(),
                    'req_msg_id'       => UtilClient::getNonce(),
                    'access_key'       => $this->_accessKeyId,
                    'base_sdk_version' => 'TeaSDK-2.0',
                    'sdk_version'      => '1.2.0',
                    '_prod_code'       => 'MARKETING',
                    '_prod_channel'    => 'undefined',
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query['security_token'] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    'host'       => Utils::defaultString($this->_endpoint, 'openapi.antchain.antgroup.com'),
                    'user-agent' => Utils::getUserAgent($this->_userAgent),
                ], $headers);
                $tmp                               = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body                    = Utils::toFormString($tmp);
                $_request->headers['content-type'] = 'application/x-www-form-urlencoded';
                $signedParam                       = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query['sign']           = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest                      = $_request;
                $_response                         = Tea::send($_request, $_runtime);
                $raw                               = Utils::readAsString($_response->body);
                $obj                               = Utils::parseJSON($raw);
                $res                               = Utils::assertAsMap($obj);
                $resp                              = Utils::assertAsMap(@$res['response']);
                if (UtilClient::hasError($raw, $this->_accessKeySecret)) {
                    throw new TeaError([
                        'message' => @$resp['result_msg'],
                        'data'    => $resp,
                        'code'    => @$resp['result_code'],
                    ]);
                }

                return $resp;
            } catch (Exception $e) {
                if (!($e instanceof TeaError)) {
                    $e = new TeaError([], $e->getMessage(), $e->getCode(), $e);
                }
                if (Tea::isRetryable($e)) {
                    $_lastException = $e;

                    continue;
                }

                throw $e;
            }
        }

        throw new TeaUnableRetryError($_lastRequest, $_lastException);
    }

    /**
     * Description: 优惠券列表查询接口
     * Summary: 优惠券列表查询接口.
     *
     * @param QueryCouponRequest $request
     *
     * @return QueryCouponResponse
     */
    public function queryCoupon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券列表查询接口
     * Summary: 优惠券列表查询接口.
     *
     * @param QueryCouponRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryCouponResponse
     */
    public function queryCouponEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCouponResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.coupon.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口.
     *
     * @param SendCouponRequest $request
     *
     * @return SendCouponResponse
     */
    public function sendCoupon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口.
     *
     * @param SendCouponRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return SendCouponResponse
     */
    public function sendCouponEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCouponResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.coupon.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 会员信息首次创建
     * Summary: 线索数据同步.
     *
     * @param CreateLeadClueRequest $request
     *
     * @return CreateLeadClueResponse
     */
    public function createLeadClue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeadClueEx($request, $headers, $runtime);
    }

    /**
     * Description: 会员信息首次创建
     * Summary: 线索数据同步.
     *
     * @param CreateLeadClueRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateLeadClueResponse
     */
    public function createLeadClueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeadClueResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.lead.clue.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新/添加商机
     * Summary: 添加商机.
     *
     * @param AddLeadBusinessRequest $request
     *
     * @return AddLeadBusinessResponse
     */
    public function addLeadBusiness($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addLeadBusinessEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新/添加商机
     * Summary: 添加商机.
     *
     * @param AddLeadBusinessRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddLeadBusinessResponse
     */
    public function addLeadBusinessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddLeadBusinessResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.lead.business.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠券查询(不区分可用与不可用)
     * 先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
     * Summary: 分页查询优惠券列表.
     *
     * @param QueryCouponPageRequest $request
     *
     * @return QueryCouponPageResponse
     */
    public function queryCouponPage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCouponPageEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券查询(不区分可用与不可用)
     * 先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
     * Summary: 分页查询优惠券列表.
     *
     * @param QueryCouponPageRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryCouponPageResponse
     */
    public function queryCouponPageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCouponPageResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.coupon.page.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠券查询(不区分可用与不可用)
     * 商品过滤放在SQL里面，从而每页数量一样
     * Summary: 分页查询优惠券列表V2.
     *
     * @param QueryCouponPagelistRequest $request
     *
     * @return QueryCouponPagelistResponse
     */
    public function queryCouponPagelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCouponPagelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券查询(不区分可用与不可用)
     * 商品过滤放在SQL里面，从而每页数量一样
     * Summary: 分页查询优惠券列表V2.
     *
     * @param QueryCouponPagelistRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryCouponPagelistResponse
     */
    public function queryCouponPagelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCouponPagelistResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.coupon.pagelist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠模板详情
     * Summary: 优惠模板详情.
     *
     * @param QueryYouhuiTemplateRequest $request
     *
     * @return QueryYouhuiTemplateResponse
     */
    public function queryYouhuiTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYouhuiTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠模板详情
     * Summary: 优惠模板详情.
     *
     * @param QueryYouhuiTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryYouhuiTemplateResponse
     */
    public function queryYouhuiTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYouhuiTemplateResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.youhui.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口,含错误返回.
     *
     * @param SendCouponAnnotatedRequest $request
     *
     * @return SendCouponAnnotatedResponse
     */
    public function sendCouponAnnotated($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCouponAnnotatedEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口,含错误返回.
     *
     * @param SendCouponAnnotatedRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SendCouponAnnotatedResponse
     */
    public function sendCouponAnnotatedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCouponAnnotatedResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.coupon.annotated.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取文档内容
     * Summary: 获取文档内容.
     *
     * @param QueryDocRequest $request
     *
     * @return QueryDocResponse
     */
    public function queryDoc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDocEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取文档内容
     * Summary: 获取文档内容.
     *
     * @param QueryDocRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return QueryDocResponse
     */
    public function queryDocEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDocResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.doc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据内容库id和目录id查询子目录
     * Summary: 根据内容库id和目录id查询子目录.
     *
     * @param QueryDocChildRequest $request
     *
     * @return QueryDocChildResponse
     */
    public function queryDocChild($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDocChildEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据内容库id和目录id查询子目录
     * Summary: 根据内容库id和目录id查询子目录.
     *
     * @param QueryDocChildRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryDocChildResponse
     */
    public function queryDocChildEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDocChildResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.doc.child.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
     * Summary: 查询所有可用优惠券列表.
     *
     * @param QueryCouponAvaliableRequest $request
     *
     * @return QueryCouponAvaliableResponse
     */
    public function queryCouponAvaliable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCouponAvaliableEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
     * Summary: 查询所有可用优惠券列表.
     *
     * @param QueryCouponAvaliableRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCouponAvaliableResponse
     */
    public function queryCouponAvaliableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCouponAvaliableResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.coupon.avaliable.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交活动情报数据
     * Summary: 提交活动情报数据.
     *
     * @param SubmitActivityInformationRequest $request
     *
     * @return SubmitActivityInformationResponse
     */
    public function submitActivityInformation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitActivityInformationEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交活动情报数据
     * Summary: 提交活动情报数据.
     *
     * @param SubmitActivityInformationRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SubmitActivityInformationResponse
     */
    public function submitActivityInformationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitActivityInformationResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.activity.information.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步活动资产信息
     * Summary: 同步活动资产信息.
     *
     * @param SyncActivityAssetsRequest $request
     *
     * @return SyncActivityAssetsResponse
     */
    public function syncActivityAssets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncActivityAssetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步活动资产信息
     * Summary: 同步活动资产信息.
     *
     * @param SyncActivityAssetsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SyncActivityAssetsResponse
     */
    public function syncActivityAssetsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncActivityAssetsResponse::fromMap($this->doRequest('1.0', 'antcloud.marketing.activity.assets.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
