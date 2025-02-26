<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CallbackBlockchainBccrDciPayresultRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CallbackBlockchainBccrDciPayresultResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CloseBlockchainBccrDciRegistrationRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CloseBlockchainBccrDciRegistrationResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CreateBlockchainBccrDciRegistrationcertRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CreateBlockchainBccrDciRegistrationcertResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CreateBlockchainBccrDciRegistrationRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CreateBlockchainBccrDciRegistrationResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CreateBlockchainBccrOrderRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\CreateBlockchainBccrOrderResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\FinishBlockchainBccrDciRegistrationcertRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\FinishBlockchainBccrDciRegistrationcertResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\GetBlockchainBccrDciPayurlRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\GetBlockchainBccrDciPayurlResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\GetBlockchainBccrDciRegistrationcertRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\GetBlockchainBccrDciRegistrationcertResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciPayRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciPayResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciRegistrationcertRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciRegistrationcertResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciRegistrationRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciRegistrationResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciRegistrationsubmitRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrDciRegistrationsubmitResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrOrderPayurlRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\QueryBlockchainBccrOrderPayurlResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\RefuseBlockchainBccrDciRegistrationRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\RefuseBlockchainBccrDciRegistrationResponse;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\RetryBlockchainBccrDciRegistrationRequest;
use AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models\RetryBlockchainBccrDciRegistrationResponse;
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
            // 联系人信息
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
                    'sdk_version'      => '1.0.0',
                    '_prod_code'       => 'ak_9705ae7650f74f47b1e8158151cc122f',
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
     * Description: 发起数登申请
     * Summary: 发起数登申请.
     *
     * @param CreateBlockchainBccrDciRegistrationRequest $request
     *
     * @return CreateBlockchainBccrDciRegistrationResponse
     */
    public function createBlockchainBccrDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBlockchainBccrDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起数登申请
     * Summary: 发起数登申请.
     *
     * @param CreateBlockchainBccrDciRegistrationRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return CreateBlockchainBccrDciRegistrationResponse
     */
    public function createBlockchainBccrDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBlockchainBccrDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryBlockchainBccrDciRegistrationsubmitRequest $request
     *
     * @return QueryBlockchainBccrDciRegistrationsubmitResponse
     */
    public function queryBlockchainBccrDciRegistrationsubmit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockchainBccrDciRegistrationsubmitEx($request, $headers, $runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryBlockchainBccrDciRegistrationsubmitRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return QueryBlockchainBccrDciRegistrationsubmitResponse
     */
    public function queryBlockchainBccrDciRegistrationsubmitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockchainBccrDciRegistrationsubmitResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationsubmit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果.
     *
     * @param QueryBlockchainBccrDciRegistrationRequest $request
     *
     * @return QueryBlockchainBccrDciRegistrationResponse
     */
    public function queryBlockchainBccrDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockchainBccrDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果.
     *
     * @param QueryBlockchainBccrDciRegistrationRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryBlockchainBccrDciRegistrationResponse
     */
    public function queryBlockchainBccrDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockchainBccrDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接.
     *
     * @param GetBlockchainBccrDciRegistrationcertRequest $request
     *
     * @return GetBlockchainBccrDciRegistrationcertResponse
     */
    public function getBlockchainBccrDciRegistrationcert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接.
     *
     * @param GetBlockchainBccrDciRegistrationcertRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return GetBlockchainBccrDciRegistrationcertResponse
     */
    public function getBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetBlockchainBccrDciRegistrationcertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationcert.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书.
     *
     * @param CreateBlockchainBccrDciRegistrationcertRequest $request
     *
     * @return CreateBlockchainBccrDciRegistrationcertResponse
     */
    public function createBlockchainBccrDciRegistrationcert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书.
     *
     * @param CreateBlockchainBccrDciRegistrationcertRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return CreateBlockchainBccrDciRegistrationcertResponse
     */
    public function createBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBlockchainBccrDciRegistrationcertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationcert.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryBlockchainBccrDciRegistrationcertRequest $request
     *
     * @return QueryBlockchainBccrDciRegistrationcertResponse
     */
    public function queryBlockchainBccrDciRegistrationcert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryBlockchainBccrDciRegistrationcertRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return QueryBlockchainBccrDciRegistrationcertResponse
     */
    public function queryBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockchainBccrDciRegistrationcertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationcert.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付.
     *
     * @param GetBlockchainBccrDciPayurlRequest $request
     *
     * @return GetBlockchainBccrDciPayurlResponse
     */
    public function getBlockchainBccrDciPayurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getBlockchainBccrDciPayurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付.
     *
     * @param GetBlockchainBccrDciPayurlRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetBlockchainBccrDciPayurlResponse
     */
    public function getBlockchainBccrDciPayurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetBlockchainBccrDciPayurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.payurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果.
     *
     * @param QueryBlockchainBccrDciPayRequest $request
     *
     * @return QueryBlockchainBccrDciPayResponse
     */
    public function queryBlockchainBccrDciPay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockchainBccrDciPayEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果.
     *
     * @param QueryBlockchainBccrDciPayRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryBlockchainBccrDciPayResponse
     */
    public function queryBlockchainBccrDciPayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockchainBccrDciPayResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.pay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调.
     *
     * @param CallbackBlockchainBccrDciPayresultRequest $request
     *
     * @return CallbackBlockchainBccrDciPayresultResponse
     */
    public function callbackBlockchainBccrDciPayresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackBlockchainBccrDciPayresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调.
     *
     * @param CallbackBlockchainBccrDciPayresultRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return CallbackBlockchainBccrDciPayresultResponse
     */
    public function callbackBlockchainBccrDciPayresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackBlockchainBccrDciPayresultResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.payresult.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调.
     *
     * @param RefuseBlockchainBccrDciRegistrationRequest $request
     *
     * @return RefuseBlockchainBccrDciRegistrationResponse
     */
    public function refuseBlockchainBccrDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseBlockchainBccrDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调.
     *
     * @param RefuseBlockchainBccrDciRegistrationRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return RefuseBlockchainBccrDciRegistrationResponse
     */
    public function refuseBlockchainBccrDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseBlockchainBccrDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请.
     *
     * @param RetryBlockchainBccrDciRegistrationRequest $request
     *
     * @return RetryBlockchainBccrDciRegistrationResponse
     */
    public function retryBlockchainBccrDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryBlockchainBccrDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请.
     *
     * @param RetryBlockchainBccrDciRegistrationRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return RetryBlockchainBccrDciRegistrationResponse
     */
    public function retryBlockchainBccrDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryBlockchainBccrDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请.
     *
     * @param CloseBlockchainBccrDciRegistrationRequest $request
     *
     * @return CloseBlockchainBccrDciRegistrationResponse
     */
    public function closeBlockchainBccrDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->closeBlockchainBccrDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请.
     *
     * @param CloseBlockchainBccrDciRegistrationRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return CloseBlockchainBccrDciRegistrationResponse
     */
    public function closeBlockchainBccrDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloseBlockchainBccrDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.close', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单.
     *
     * @param CreateBlockchainBccrOrderRequest $request
     *
     * @return CreateBlockchainBccrOrderResponse
     */
    public function createBlockchainBccrOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBlockchainBccrOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单.
     *
     * @param CreateBlockchainBccrOrderRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateBlockchainBccrOrderResponse
     */
    public function createBlockchainBccrOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBlockchainBccrOrderResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询订单支付链接
     * Summary: 查询订单支付链接.
     *
     * @param QueryBlockchainBccrOrderPayurlRequest $request
     *
     * @return QueryBlockchainBccrOrderPayurlResponse
     */
    public function queryBlockchainBccrOrderPayurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockchainBccrOrderPayurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询订单支付链接
     * Summary: 查询订单支付链接.
     *
     * @param QueryBlockchainBccrOrderPayurlRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryBlockchainBccrOrderPayurlResponse
     */
    public function queryBlockchainBccrOrderPayurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockchainBccrOrderPayurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.order.payurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版保完成数登证书回调
     * Summary: 版保完成数登证书回调.
     *
     * @param FinishBlockchainBccrDciRegistrationcertRequest $request
     *
     * @return FinishBlockchainBccrDciRegistrationcertResponse
     */
    public function finishBlockchainBccrDciRegistrationcert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime);
    }

    /**
     * Description: 版保完成数登证书回调
     * Summary: 版保完成数登证书回调.
     *
     * @param FinishBlockchainBccrDciRegistrationcertRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return FinishBlockchainBccrDciRegistrationcertResponse
     */
    public function finishBlockchainBccrDciRegistrationcertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishBlockchainBccrDciRegistrationcertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationcert.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
