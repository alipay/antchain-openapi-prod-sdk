<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\GOODSCHAIN\Models\BindUserRequest;
use AntChain\GOODSCHAIN\Models\BindUserResponse;
use AntChain\GOODSCHAIN\Models\CancelGoodsRequest;
use AntChain\GOODSCHAIN\Models\CancelGoodsResponse;
use AntChain\GOODSCHAIN\Models\CancelGoodstemplateRequest;
use AntChain\GOODSCHAIN\Models\CancelGoodstemplateResponse;
use AntChain\GOODSCHAIN\Models\CancelLeagueRequest;
use AntChain\GOODSCHAIN\Models\CancelLeagueResponse;
use AntChain\GOODSCHAIN\Models\CreateGoodsOperateRequest;
use AntChain\GOODSCHAIN\Models\CreateGoodsOperateResponse;
use AntChain\GOODSCHAIN\Models\CreateGoodsRequest;
use AntChain\GOODSCHAIN\Models\CreateGoodsResponse;
use AntChain\GOODSCHAIN\Models\CreateGoodstemplateRequest;
use AntChain\GOODSCHAIN\Models\CreateGoodstemplateResponse;
use AntChain\GOODSCHAIN\Models\CreateLeagueRequest;
use AntChain\GOODSCHAIN\Models\CreateLeagueResponse;
use AntChain\GOODSCHAIN\Models\CreateUserRequest;
use AntChain\GOODSCHAIN\Models\CreateUserResponse;
use AntChain\GOODSCHAIN\Models\DisableGoodsRequest;
use AntChain\GOODSCHAIN\Models\DisableGoodsResponse;
use AntChain\GOODSCHAIN\Models\GetHealthcodeRequest;
use AntChain\GOODSCHAIN\Models\GetHealthcodeResponse;
use AntChain\GOODSCHAIN\Models\PagequeryGoodsRequest;
use AntChain\GOODSCHAIN\Models\PagequeryGoodsResponse;
use AntChain\GOODSCHAIN\Models\QueryGoodsRequest;
use AntChain\GOODSCHAIN\Models\QueryGoodsResponse;
use AntChain\GOODSCHAIN\Models\QueryGoodstemplateRequest;
use AntChain\GOODSCHAIN\Models\QueryGoodstemplateResponse;
use AntChain\GOODSCHAIN\Models\SendGoodsRequest;
use AntChain\GOODSCHAIN\Models\SendGoodsResponse;
use AntChain\GOODSCHAIN\Models\UnbindUserRequest;
use AntChain\GOODSCHAIN\Models\UnbindUserResponse;
use AntChain\GOODSCHAIN\Models\UpdateGoodsRequest;
use AntChain\GOODSCHAIN\Models\UpdateGoodsResponse;
use AntChain\GOODSCHAIN\Models\UpdateGoodstemplateRequest;
use AntChain\GOODSCHAIN\Models\UpdateGoodstemplateResponse;
use AntChain\GOODSCHAIN\Models\UpdateUserRequest;
use AntChain\GOODSCHAIN\Models\UpdateUserResponse;
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
            // 区块链信息
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
                    'sdk_version'      => '1.0.4',
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
     * Description: 创建联盟
     * Summary: 创建联盟
     *
     * @param CreateLeagueRequest $request
     *
     * @return CreateLeagueResponse
     */
    public function createLeague($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeagueEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     *
     * @param CreateLeagueRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateLeagueResponse
     */
    public function createLeagueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeagueResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.league.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注销联盟
     * Summary: 注销联盟
     *
     * @param CancelLeagueRequest $request
     *
     * @return CancelLeagueResponse
     */
    public function cancelLeague($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelLeagueEx($request, $headers, $runtime);
    }

    /**
     * Description: 注销联盟
     * Summary: 注销联盟
     *
     * @param CancelLeagueRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CancelLeagueResponse
     */
    public function cancelLeagueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelLeagueResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.league.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建用户
     * Summary: 创建用户.
     *
     * @param CreateUserRequest $request
     *
     * @return CreateUserResponse
     */
    public function createUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建用户
     * Summary: 创建用户.
     *
     * @param CreateUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateUserResponse
     */
    public function createUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新用户
     * Summary: 更新用户.
     *
     * @param UpdateUserRequest $request
     *
     * @return UpdateUserResponse
     */
    public function updateUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新用户
     * Summary: 更新用户.
     *
     * @param UpdateUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UpdateUserResponse
     */
    public function updateUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUserResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.user.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 渠道用户绑定
     * Summary: 渠道用户绑定.
     *
     * @param BindUserRequest $request
     *
     * @return BindUserResponse
     */
    public function bindUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 渠道用户绑定
     * Summary: 渠道用户绑定.
     *
     * @param BindUserRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return BindUserResponse
     */
    public function bindUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindUserResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.user.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 渠道用户解绑
     * Summary: 渠道用户解绑.
     *
     * @param UnbindUserRequest $request
     *
     * @return UnbindUserResponse
     */
    public function unbindUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 渠道用户解绑
     * Summary: 渠道用户解绑.
     *
     * @param UnbindUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UnbindUserResponse
     */
    public function unbindUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindUserResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.user.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品模版定义
     * Summary: 链上商品模版定义.
     *
     * @param CreateGoodstemplateRequest $request
     *
     * @return CreateGoodstemplateResponse
     */
    public function createGoodstemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createGoodstemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品模版定义
     * Summary: 链上商品模版定义.
     *
     * @param CreateGoodstemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateGoodstemplateResponse
     */
    public function createGoodstemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateGoodstemplateResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goodstemplate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品模版更新
     * Summary: 链上商品模版更新.
     *
     * @param UpdateGoodstemplateRequest $request
     *
     * @return UpdateGoodstemplateResponse
     */
    public function updateGoodstemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGoodstemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品模版更新
     * Summary: 链上商品模版更新.
     *
     * @param UpdateGoodstemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateGoodstemplateResponse
     */
    public function updateGoodstemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGoodstemplateResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goodstemplate.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品模版注销
     * Summary: 链上商品模版注销
     *
     * @param CancelGoodstemplateRequest $request
     *
     * @return CancelGoodstemplateResponse
     */
    public function cancelGoodstemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelGoodstemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品模版注销
     * Summary: 链上商品模版注销
     *
     * @param CancelGoodstemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CancelGoodstemplateResponse
     */
    public function cancelGoodstemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelGoodstemplateResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goodstemplate.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品模版查询
     * Summary: 链上商品模版查询.
     *
     * @param QueryGoodstemplateRequest $request
     *
     * @return QueryGoodstemplateResponse
     */
    public function queryGoodstemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGoodstemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品模版查询
     * Summary: 链上商品模版查询.
     *
     * @param QueryGoodstemplateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryGoodstemplateResponse
     */
    public function queryGoodstemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGoodstemplateResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goodstemplate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品发行
     * Summary: 链上商品发行.
     *
     * @param CreateGoodsRequest $request
     *
     * @return CreateGoodsResponse
     */
    public function createGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品发行
     * Summary: 链上商品发行.
     *
     * @param CreateGoodsRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateGoodsResponse
     */
    public function createGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateGoodsResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品更新
     * Summary: 链上商品更新.
     *
     * @param UpdateGoodsRequest $request
     *
     * @return UpdateGoodsResponse
     */
    public function updateGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品更新
     * Summary: 链上商品更新.
     *
     * @param UpdateGoodsRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UpdateGoodsResponse
     */
    public function updateGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGoodsResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品转增
     * Summary: 链上商品转增.
     *
     * @param SendGoodsRequest $request
     *
     * @return SendGoodsResponse
     */
    public function sendGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品转增
     * Summary: 链上商品转增.
     *
     * @param SendGoodsRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return SendGoodsResponse
     */
    public function sendGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendGoodsResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品详情查询
     * Summary: 链上商品详情查询.
     *
     * @param QueryGoodsRequest $request
     *
     * @return QueryGoodsResponse
     */
    public function queryGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品详情查询
     * Summary: 链上商品详情查询.
     *
     * @param QueryGoodsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryGoodsResponse
     */
    public function queryGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGoodsResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上商品列表查询
     * Summary: 链上商品列表查询.
     *
     * @param PagequeryGoodsRequest $request
     *
     * @return PagequeryGoodsResponse
     */
    public function pagequeryGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上商品列表查询
     * Summary: 链上商品列表查询.
     *
     * @param PagequeryGoodsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return PagequeryGoodsResponse
     */
    public function pagequeryGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryGoodsResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自定义链上商品操作节点
     * Summary: 自定义链上商品操作节点.
     *
     * @param CreateGoodsOperateRequest $request
     *
     * @return CreateGoodsOperateResponse
     */
    public function createGoodsOperate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createGoodsOperateEx($request, $headers, $runtime);
    }

    /**
     * Description: 自定义链上商品操作节点
     * Summary: 自定义链上商品操作节点.
     *
     * @param CreateGoodsOperateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateGoodsOperateResponse
     */
    public function createGoodsOperateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateGoodsOperateResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.operate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品交收核销
     * Summary: 商品交收核销
     *
     * @param CancelGoodsRequest $request
     *
     * @return CancelGoodsResponse
     */
    public function cancelGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品交收核销
     * Summary: 商品交收核销
     *
     * @param CancelGoodsRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CancelGoodsResponse
     */
    public function cancelGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelGoodsResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品异常处置
     * Summary: 商品异常处置.
     *
     * @param DisableGoodsRequest $request
     *
     * @return DisableGoodsResponse
     */
    public function disableGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品异常处置
     * Summary: 商品异常处置.
     *
     * @param DisableGoodsRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DisableGoodsResponse
     */
    public function disableGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableGoodsResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.goods.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取健康码、核酸、疫苗、行程码等信息
     * Summary: 获取健康码、核酸、疫苗、行程码等信息.
     *
     * @param GetHealthcodeRequest $request
     *
     * @return GetHealthcodeResponse
     */
    public function getHealthcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getHealthcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取健康码、核酸、疫苗、行程码等信息
     * Summary: 获取健康码、核酸、疫苗、行程码等信息.
     *
     * @param GetHealthcodeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetHealthcodeResponse
     */
    public function getHealthcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetHealthcodeResponse::fromMap($this->doRequest('1.0', 'antchain.goodschain.healthcode.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
