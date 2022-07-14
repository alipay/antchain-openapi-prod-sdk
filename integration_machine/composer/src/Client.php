<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\INTEGRATION_MACHINE\Models\GetHealthinfoRequest;
use AntChain\INTEGRATION_MACHINE\Models\GetHealthinfoResponse;
use AntChain\INTEGRATION_MACHINE\Models\InitDeviceargsRequest;
use AntChain\INTEGRATION_MACHINE\Models\InitDeviceargsResponse;
use AntChain\INTEGRATION_MACHINE\Models\PushHealthinfologRequest;
use AntChain\INTEGRATION_MACHINE\Models\PushHealthinfologResponse;
use AntChain\INTEGRATION_MACHINE\Models\QueryDeviceargsRequest;
use AntChain\INTEGRATION_MACHINE\Models\QueryDeviceargsResponse;
use AntChain\INTEGRATION_MACHINE\Models\QueryHealthinfologRequest;
use AntChain\INTEGRATION_MACHINE\Models\QueryHealthinfologResponse;
use AntChain\INTEGRATION_MACHINE\Models\QueryHealthinfoRequest;
use AntChain\INTEGRATION_MACHINE\Models\QueryHealthinfoResponse;
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
            // 场所信息
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
                    'sdk_version'      => '1.0.9',
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
     * Description: 查询防疫健康信息
     * Summary: 查询防疫健康信息.
     *
     * @param QueryHealthinfoRequest $request
     *
     * @return QueryHealthinfoResponse
     */
    public function queryHealthinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryHealthinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询防疫健康信息
     * Summary: 查询防疫健康信息.
     *
     * @param QueryHealthinfoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryHealthinfoResponse
     */
    public function queryHealthinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryHealthinfoResponse::fromMap($this->doRequest('1.0', 'antchain.antim.healthinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上报通行记录
     * Summary: 上报通行记录.
     *
     * @param PushHealthinfologRequest $request
     *
     * @return PushHealthinfologResponse
     */
    public function pushHealthinfolog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushHealthinfologEx($request, $headers, $runtime);
    }

    /**
     * Description: 上报通行记录
     * Summary: 上报通行记录.
     *
     * @param PushHealthinfologRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PushHealthinfologResponse
     */
    public function pushHealthinfologEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushHealthinfologResponse::fromMap($this->doRequest('1.0', 'antchain.antim.healthinfolog.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 健康身份二维码反查防疫健康信息
     * Summary: 健康身份二维码反查防疫健康信息.
     *
     * @param GetHealthinfoRequest $request
     *
     * @return GetHealthinfoResponse
     */
    public function getHealthinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getHealthinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 健康身份二维码反查防疫健康信息
     * Summary: 健康身份二维码反查防疫健康信息.
     *
     * @param GetHealthinfoRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetHealthinfoResponse
     */
    public function getHealthinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetHealthinfoResponse::fromMap($this->doRequest('1.0', 'antchain.antim.healthinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 健康码设备配置参数列表查询
     * Summary: 健康码设备配置参数列表查询.
     *
     * @param QueryDeviceargsRequest $request
     *
     * @return QueryDeviceargsResponse
     */
    public function queryDeviceargs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceargsEx($request, $headers, $runtime);
    }

    /**
     * Description: 健康码设备配置参数列表查询
     * Summary: 健康码设备配置参数列表查询.
     *
     * @param QueryDeviceargsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryDeviceargsResponse
     */
    public function queryDeviceargsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceargsResponse::fromMap($this->doRequest('1.0', 'antchain.antim.deviceargs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 健康码设备参数配置初始化
     * Summary: 健康码设备参数配置初始化.
     *
     * @param InitDeviceargsRequest $request
     *
     * @return InitDeviceargsResponse
     */
    public function initDeviceargs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initDeviceargsEx($request, $headers, $runtime);
    }

    /**
     * Description: 健康码设备参数配置初始化
     * Summary: 健康码设备参数配置初始化.
     *
     * @param InitDeviceargsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return InitDeviceargsResponse
     */
    public function initDeviceargsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitDeviceargsResponse::fromMap($this->doRequest('1.0', 'antchain.antim.deviceargs.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通行记录查询
     * Summary: 通行记录查询.
     *
     * @param QueryHealthinfologRequest $request
     *
     * @return QueryHealthinfologResponse
     */
    public function queryHealthinfolog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryHealthinfologEx($request, $headers, $runtime);
    }

    /**
     * Description: 通行记录查询
     * Summary: 通行记录查询.
     *
     * @param QueryHealthinfologRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryHealthinfologResponse
     */
    public function queryHealthinfologEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryHealthinfologResponse::fromMap($this->doRequest('1.0', 'antchain.antim.healthinfolog.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
