<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\AuthAntchainBbpCustomerRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\AuthAntchainBbpCustomerResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\BindDemoAaaBbbCccRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\BindDemoAaaBbbCccResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\CheckAntchainBbpVerifyRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\CheckAntchainBbpVerifyResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\CreateAntchainBbpCustomerRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\CreateAntchainBbpCustomerResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\InitAntchainBbpInsuranceUserRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\InitAntchainBbpInsuranceUserResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\InitAntchainBbpVerifyRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\InitAntchainBbpVerifyResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\MatchAntchainBbpDidAccountRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\MatchAntchainBbpDidAccountResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\OperateAntchainBbpInsuranceRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\OperateAntchainBbpInsuranceResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\QueryAntchainBbpCustomerRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\QueryAntchainBbpCustomerResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\StartAntchainBbpVerifyRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\StartAntchainBbpVerifyResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\SyncAntchainBbpInsuranceRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\SyncAntchainBbpInsuranceResponse;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\UploadAntchainBbpInsuranceRequest;
use AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models\UploadAntchainBbpInsuranceResponse;
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
            'timeouted'               => 'retry',
            'readTimeout'             => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout'          => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'               => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'              => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'                 => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'            => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'maxIdleTimeMillis'       => $this->_maxIdleTimeMillis,
            'keepAliveDurationMillis' => $this->_keepAliveDurationMillis,
            'maxRequests'             => $this->_maxRequests,
            'maxRequestsPerHost'      => $this->_maxRequestsPerHost,
            'retry'                   => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
            // 键值对，兼容map用
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
                    'sdk_version'      => '1.0.1',
                    '_prod_code'       => 'ak_b14fc97503f943f48147eb72b47b244d',
                    '_prod_channel'    => 'saas',
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
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口.
     *
     * @param AuthAntchainBbpCustomerRequest $request
     *
     * @return AuthAntchainBbpCustomerResponse
     */
    public function authAntchainBbpCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authAntchainBbpCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口.
     *
     * @param AuthAntchainBbpCustomerRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AuthAntchainBbpCustomerResponse
     */
    public function authAntchainBbpCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthAntchainBbpCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口.
     *
     * @param CreateAntchainBbpCustomerRequest $request
     *
     * @return CreateAntchainBbpCustomerResponse
     */
    public function createAntchainBbpCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainBbpCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口.
     *
     * @param CreateAntchainBbpCustomerRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateAntchainBbpCustomerResponse
     */
    public function createAntchainBbpCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainBbpCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询.
     *
     * @param QueryAntchainBbpCustomerRequest $request
     *
     * @return QueryAntchainBbpCustomerResponse
     */
    public function queryAntchainBbpCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainBbpCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询.
     *
     * @param QueryAntchainBbpCustomerRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryAntchainBbpCustomerResponse
     */
    public function queryAntchainBbpCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainBbpCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 身份关联链上账户
     * Summary: 身份关联链上账户.
     *
     * @param MatchAntchainBbpDidAccountRequest $request
     *
     * @return MatchAntchainBbpDidAccountResponse
     */
    public function matchAntchainBbpDidAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->matchAntchainBbpDidAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 身份关联链上账户
     * Summary: 身份关联链上账户.
     *
     * @param MatchAntchainBbpDidAccountRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return MatchAntchainBbpDidAccountResponse
     */
    public function matchAntchainBbpDidAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MatchAntchainBbpDidAccountResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.did.account.match', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链.
     *
     * @param OperateAntchainBbpInsuranceRequest $request
     *
     * @return OperateAntchainBbpInsuranceResponse
     */
    public function operateAntchainBbpInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateAntchainBbpInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链.
     *
     * @param OperateAntchainBbpInsuranceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return OperateAntchainBbpInsuranceResponse
     */
    public function operateAntchainBbpInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateAntchainBbpInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链.
     *
     * @param SyncAntchainBbpInsuranceRequest $request
     *
     * @return SyncAntchainBbpInsuranceResponse
     */
    public function syncAntchainBbpInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainBbpInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链.
     *
     * @param SyncAntchainBbpInsuranceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SyncAntchainBbpInsuranceResponse
     */
    public function syncAntchainBbpInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainBbpInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件.
     *
     * @param UploadAntchainBbpInsuranceRequest $request
     *
     * @return UploadAntchainBbpInsuranceResponse
     */
    public function uploadAntchainBbpInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainBbpInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件.
     *
     * @param UploadAntchainBbpInsuranceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UploadAntchainBbpInsuranceResponse
     */
    public function uploadAntchainBbpInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadAntchainBbpInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitAntchainBbpInsuranceUserRequest $request
     *
     * @return InitAntchainBbpInsuranceUserResponse
     */
    public function initAntchainBbpInsuranceUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntchainBbpInsuranceUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitAntchainBbpInsuranceUserRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return InitAntchainBbpInsuranceUserResponse
     */
    public function initAntchainBbpInsuranceUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntchainBbpInsuranceUserResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.user.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询.
     *
     * @param CheckAntchainBbpVerifyRequest $request
     *
     * @return CheckAntchainBbpVerifyResponse
     */
    public function checkAntchainBbpVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAntchainBbpVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询.
     *
     * @param CheckAntchainBbpVerifyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CheckAntchainBbpVerifyResponse
     */
    public function checkAntchainBbpVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAntchainBbpVerifyResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.verify.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口.
     *
     * @param InitAntchainBbpVerifyRequest $request
     *
     * @return InitAntchainBbpVerifyResponse
     */
    public function initAntchainBbpVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntchainBbpVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口.
     *
     * @param InitAntchainBbpVerifyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return InitAntchainBbpVerifyResponse
     */
    public function initAntchainBbpVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntchainBbpVerifyResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.verify.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口.
     *
     * @param StartAntchainBbpVerifyRequest $request
     *
     * @return StartAntchainBbpVerifyResponse
     */
    public function startAntchainBbpVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startAntchainBbpVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口.
     *
     * @param StartAntchainBbpVerifyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return StartAntchainBbpVerifyResponse
     */
    public function startAntchainBbpVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartAntchainBbpVerifyResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.verify.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建，用于测试新建&修改功能
     * Summary: 自动化测试创建，用于测试新建&修改功能.
     *
     * @param BindDemoAaaBbbCccRequest $request
     *
     * @return BindDemoAaaBbbCccResponse
     */
    public function bindDemoAaaBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDemoAaaBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建，用于测试新建&修改功能
     * Summary: 自动化测试创建，用于测试新建&修改功能.
     *
     * @param BindDemoAaaBbbCccRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BindDemoAaaBbbCccResponse
     */
    public function bindDemoAaaBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDemoAaaBbbCccResponse::fromMap($this->doRequest('1.0', 'demo.aaa.bbb.ccc.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
