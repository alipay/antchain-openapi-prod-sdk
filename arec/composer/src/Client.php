<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\AREC\Models\AuthRcpRtcRequest;
use AntChain\AREC\Models\AuthRcpRtcResponse;
use AntChain\AREC\Models\CloseRcpMgvtwoRequest;
use AntChain\AREC\Models\CloseRcpMgvtwoResponse;
use AntChain\AREC\Models\ConfirmRcpMgRequest;
use AntChain\AREC\Models\ConfirmRcpMgResponse;
use AntChain\AREC\Models\ConfirmRcpMgrRequest;
use AntChain\AREC\Models\ConfirmRcpMgrResponse;
use AntChain\AREC\Models\ConfirmRcpMgvtwoRequest;
use AntChain\AREC\Models\ConfirmRcpMgvtwoResponse;
use AntChain\AREC\Models\CreateRealtytradeOrgRequest;
use AntChain\AREC\Models\CreateRealtytradeOrgResponse;
use AntChain\AREC\Models\CreateRealtytradeOrgsealRequest;
use AntChain\AREC\Models\CreateRealtytradeOrgsealResponse;
use AntChain\AREC\Models\CreateRealtytradePersonalRequest;
use AntChain\AREC\Models\CreateRealtytradePersonalResponse;
use AntChain\AREC\Models\CreateRealtytradePersonalsealRequest;
use AntChain\AREC\Models\CreateRealtytradePersonalsealResponse;
use AntChain\AREC\Models\FinishRcpNingboRequest;
use AntChain\AREC\Models\FinishRcpNingboResponse;
use AntChain\AREC\Models\FinishRcpRtcRequest;
use AntChain\AREC\Models\FinishRcpRtcResponse;
use AntChain\AREC\Models\GetRcpHqRequest;
use AntChain\AREC\Models\GetRcpHqResponse;
use AntChain\AREC\Models\GetRcpMgRequest;
use AntChain\AREC\Models\GetRcpMgResponse;
use AntChain\AREC\Models\GetRcpMgrRequest;
use AntChain\AREC\Models\GetRcpMgrResponse;
use AntChain\AREC\Models\GetRcpMgvtwoRequest;
use AntChain\AREC\Models\GetRcpMgvtwoResponse;
use AntChain\AREC\Models\InitRcpMgRequest;
use AntChain\AREC\Models\InitRcpMgResponse;
use AntChain\AREC\Models\QueryRealtytradeSigningRequest;
use AntChain\AREC\Models\QueryRealtytradeSigningResponse;
use AntChain\AREC\Models\RefuseRcpNingboRequest;
use AntChain\AREC\Models\RefuseRcpNingboResponse;
use AntChain\AREC\Models\StartRcpHqRequest;
use AntChain\AREC\Models\StartRcpHqResponse;
use AntChain\AREC\Models\StartRcpMgRequest;
use AntChain\AREC\Models\StartRcpMgResponse;
use AntChain\AREC\Models\StartRcpMgrRequest;
use AntChain\AREC\Models\StartRcpMgrResponse;
use AntChain\AREC\Models\StartRcpMgvtwoRequest;
use AntChain\AREC\Models\StartRcpMgvtwoResponse;
use AntChain\AREC\Models\StartRealtytradeSigningRequest;
use AntChain\AREC\Models\StartRealtytradeSigningResponse;
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
            // 个人
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
                    'sdk_version'      => '1.4.10',
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
     * Description: 发起房产查询
     * Summary: 发起房产查询.
     *
     * @param StartRcpHqRequest $request
     *
     * @return StartRcpHqResponse
     */
    public function startRcpHq($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRcpHqEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起房产查询
     * Summary: 发起房产查询.
     *
     * @param StartRcpHqRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return StartRcpHqResponse
     */
    public function startRcpHqEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRcpHqResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.hq.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取房产查询单信息
     * Summary: 获取房产查询单信息.
     *
     * @param GetRcpHqRequest $request
     *
     * @return GetRcpHqResponse
     */
    public function getRcpHq($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRcpHqEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取房产查询单信息
     * Summary: 获取房产查询单信息.
     *
     * @param GetRcpHqRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetRcpHqResponse
     */
    public function getRcpHqEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRcpHqResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.hq.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起解抵押(宁波模式)
     * Summary: 发起解抵押(宁波模式).
     *
     * @param StartRcpMgrRequest $request
     *
     * @return StartRcpMgrResponse
     */
    public function startRcpMgr($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRcpMgrEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起解抵押(宁波模式)
     * Summary: 发起解抵押(宁波模式).
     *
     * @param StartRcpMgrRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return StartRcpMgrResponse
     */
    public function startRcpMgrEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRcpMgrResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mgr.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认解抵押(宁波模式)
     * Summary: 确认解抵押(宁波模式).
     *
     * @param ConfirmRcpMgrRequest $request
     *
     * @return ConfirmRcpMgrResponse
     */
    public function confirmRcpMgr($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmRcpMgrEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认解抵押(宁波模式)
     * Summary: 确认解抵押(宁波模式).
     *
     * @param ConfirmRcpMgrRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ConfirmRcpMgrResponse
     */
    public function confirmRcpMgrEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmRcpMgrResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mgr.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询解抵押单(宁波模式)
     * Summary: 查询解抵押单(宁波模式).
     *
     * @param GetRcpMgrRequest $request
     *
     * @return GetRcpMgrResponse
     */
    public function getRcpMgr($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRcpMgrEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询解抵押单(宁波模式)
     * Summary: 查询解抵押单(宁波模式).
     *
     * @param GetRcpMgrRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return GetRcpMgrResponse
     */
    public function getRcpMgrEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRcpMgrResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mgr.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 房屋抵押贷款业务，发起抵押登记服务
     * Summary: 发起抵押登记.
     *
     * @param StartRcpMgRequest $request
     *
     * @return StartRcpMgResponse
     */
    public function startRcpMg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRcpMgEx($request, $headers, $runtime);
    }

    /**
     * Description: 房屋抵押贷款业务，发起抵押登记服务
     * Summary: 发起抵押登记.
     *
     * @param StartRcpMgRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return StartRcpMgResponse
     */
    public function startRcpMgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRcpMgResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mg.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据抵押单号查询抵押单
     * Summary: 查询抵押单.
     *
     * @param GetRcpMgRequest $request
     *
     * @return GetRcpMgResponse
     */
    public function getRcpMg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRcpMgEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据抵押单号查询抵押单
     * Summary: 查询抵押单.
     *
     * @param GetRcpMgRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetRcpMgResponse
     */
    public function getRcpMgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRcpMgResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mg.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 房屋抵押登记业务，银行确认抵押登记服务
     * Summary: 确认抵押登记.
     *
     * @param ConfirmRcpMgRequest $request
     *
     * @return ConfirmRcpMgResponse
     */
    public function confirmRcpMg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmRcpMgEx($request, $headers, $runtime);
    }

    /**
     * Description: 房屋抵押登记业务，银行确认抵押登记服务
     * Summary: 确认抵押登记.
     *
     * @param ConfirmRcpMgRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ConfirmRcpMgResponse
     */
    public function confirmRcpMgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmRcpMgResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mg.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
     * Summary: 确认进行预抵押登记.
     *
     * @param InitRcpMgRequest $request
     *
     * @return InitRcpMgResponse
     */
    public function initRcpMg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initRcpMgEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
     * Summary: 确认进行预抵押登记.
     *
     * @param InitRcpMgRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return InitRcpMgResponse
     */
    public function initRcpMgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitRcpMgResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mg.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起抵押(宁波模式)
     * Summary: 发起抵押(宁波模式).
     *
     * @param StartRcpMgvtwoRequest $request
     *
     * @return StartRcpMgvtwoResponse
     */
    public function startRcpMgvtwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRcpMgvtwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起抵押(宁波模式)
     * Summary: 发起抵押(宁波模式).
     *
     * @param StartRcpMgvtwoRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return StartRcpMgvtwoResponse
     */
    public function startRcpMgvtwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRcpMgvtwoResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mgvtwo.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认抵押(宁波模式)
     * Summary: 确认抵押(宁波模式).
     *
     * @param ConfirmRcpMgvtwoRequest $request
     *
     * @return ConfirmRcpMgvtwoResponse
     */
    public function confirmRcpMgvtwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmRcpMgvtwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认抵押(宁波模式)
     * Summary: 确认抵押(宁波模式).
     *
     * @param ConfirmRcpMgvtwoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ConfirmRcpMgvtwoResponse
     */
    public function confirmRcpMgvtwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmRcpMgvtwoResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mgvtwo.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 终止抵押(宁波模式)
     * Summary: 终止抵押(宁波模式).
     *
     * @param CloseRcpMgvtwoRequest $request
     *
     * @return CloseRcpMgvtwoResponse
     */
    public function closeRcpMgvtwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->closeRcpMgvtwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 终止抵押(宁波模式)
     * Summary: 终止抵押(宁波模式).
     *
     * @param CloseRcpMgvtwoRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CloseRcpMgvtwoResponse
     */
    public function closeRcpMgvtwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloseRcpMgvtwoResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mgvtwo.close', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询抵押单(宁波模式)
     * Summary: 查询抵押单(宁波模式).
     *
     * @param GetRcpMgvtwoRequest $request
     *
     * @return GetRcpMgvtwoResponse
     */
    public function getRcpMgvtwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRcpMgvtwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询抵押单(宁波模式)
     * Summary: 查询抵押单(宁波模式).
     *
     * @param GetRcpMgvtwoRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetRcpMgvtwoResponse
     */
    public function getRcpMgvtwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRcpMgvtwoResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.mgvtwo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
     * Summary: 接收不动产中心授权签约列表.
     *
     * @param AuthRcpRtcRequest $request
     *
     * @return AuthRcpRtcResponse
     */
    public function authRcpRtc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authRcpRtcEx($request, $headers, $runtime);
    }

    /**
     * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
     * Summary: 接收不动产中心授权签约列表.
     *
     * @param AuthRcpRtcRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AuthRcpRtcResponse
     */
    public function authRcpRtcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthRcpRtcResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.rtc.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
     * Summary: 接收不动产中心业务处理结果.
     *
     * @param FinishRcpRtcRequest $request
     *
     * @return FinishRcpRtcResponse
     */
    public function finishRcpRtc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishRcpRtcEx($request, $headers, $runtime);
    }

    /**
     * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
     * Summary: 接收不动产中心业务处理结果.
     *
     * @param FinishRcpRtcRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return FinishRcpRtcResponse
     */
    public function finishRcpRtcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishRcpRtcResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.rtc.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
     * Summary: 通知抵押结果完成(宁波).
     *
     * @param FinishRcpNingboRequest $request
     *
     * @return FinishRcpNingboResponse
     */
    public function finishRcpNingbo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishRcpNingboEx($request, $headers, $runtime);
    }

    /**
     * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
     * Summary: 通知抵押结果完成(宁波).
     *
     * @param FinishRcpNingboRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return FinishRcpNingboResponse
     */
    public function finishRcpNingboEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishRcpNingboResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.ningbo.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通知抵押驳回
     * Summary: 通知抵押驳回(宁波).
     *
     * @param RefuseRcpNingboRequest $request
     *
     * @return RefuseRcpNingboResponse
     */
    public function refuseRcpNingbo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseRcpNingboEx($request, $headers, $runtime);
    }

    /**
     * Description: 通知抵押驳回
     * Summary: 通知抵押驳回(宁波).
     *
     * @param RefuseRcpNingboRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return RefuseRcpNingboResponse
     */
    public function refuseRcpNingboEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseRcpNingboResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.rcp.ningbo.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
     * Summary: 注册企业账户.
     *
     * @param CreateRealtytradeOrgRequest $request
     *
     * @return CreateRealtytradeOrgResponse
     */
    public function createRealtytradeOrg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRealtytradeOrgEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
     * Summary: 注册企业账户.
     *
     * @param CreateRealtytradeOrgRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateRealtytradeOrgResponse
     */
    public function createRealtytradeOrgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRealtytradeOrgResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.realtytrade.org.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
     * Summary: 创建企业印章.
     *
     * @param CreateRealtytradeOrgsealRequest $request
     *
     * @return CreateRealtytradeOrgsealResponse
     */
    public function createRealtytradeOrgseal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRealtytradeOrgsealEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
     * Summary: 创建企业印章.
     *
     * @param CreateRealtytradeOrgsealRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateRealtytradeOrgsealResponse
     */
    public function createRealtytradeOrgsealEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRealtytradeOrgsealResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.realtytrade.orgseal.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
     * Summary: 注册个人账户.
     *
     * @param CreateRealtytradePersonalRequest $request
     *
     * @return CreateRealtytradePersonalResponse
     */
    public function createRealtytradePersonal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRealtytradePersonalEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
     * Summary: 注册个人账户.
     *
     * @param CreateRealtytradePersonalRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateRealtytradePersonalResponse
     */
    public function createRealtytradePersonalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRealtytradePersonalResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.realtytrade.personal.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
     * Summary: 创建个人图片印章.
     *
     * @param CreateRealtytradePersonalsealRequest $request
     *
     * @return CreateRealtytradePersonalsealResponse
     */
    public function createRealtytradePersonalseal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRealtytradePersonalsealEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
     * Summary: 创建个人图片印章.
     *
     * @param CreateRealtytradePersonalsealRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateRealtytradePersonalsealResponse
     */
    public function createRealtytradePersonalsealEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRealtytradePersonalsealResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.realtytrade.personalseal.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
     * Summary: 发起签署流程.
     *
     * @param StartRealtytradeSigningRequest $request
     *
     * @return StartRealtytradeSigningResponse
     */
    public function startRealtytradeSigning($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRealtytradeSigningEx($request, $headers, $runtime);
    }

    /**
     * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
     * Summary: 发起签署流程.
     *
     * @param StartRealtytradeSigningRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return StartRealtytradeSigningResponse
     */
    public function startRealtytradeSigningEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRealtytradeSigningResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.realtytrade.signing.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
     * Summary: 查看签署流程.
     *
     * @param QueryRealtytradeSigningRequest $request
     *
     * @return QueryRealtytradeSigningResponse
     */
    public function queryRealtytradeSigning($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRealtytradeSigningEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
     * Summary: 查看签署流程.
     *
     * @param QueryRealtytradeSigningRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryRealtytradeSigningResponse
     */
    public function queryRealtytradeSigningEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRealtytradeSigningResponse::fromMap($this->doRequest('1.0', 'blockchain.arec.realtytrade.signing.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
