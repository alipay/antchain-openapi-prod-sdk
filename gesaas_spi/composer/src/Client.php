<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\GESAAS_SPI\Models\CallbackOrderSettlementRequest;
use AntChain\GESAAS_SPI\Models\CallbackOrderSettlementResponse;
use AntChain\GESAAS_SPI\Models\CallbackRightsprodOperationRequest;
use AntChain\GESAAS_SPI\Models\CallbackRightsprodOperationResponse;
use AntChain\GESAAS_SPI\Models\CallbackRightsprodStatusRequest;
use AntChain\GESAAS_SPI\Models\CallbackRightsprodStatusResponse;
use AntChain\GESAAS_SPI\Models\PushRightsprodGrantrightsRequest;
use AntChain\GESAAS_SPI\Models\PushRightsprodGrantrightsResponse;
use AntChain\GESAAS_SPI\Models\PushRightsprodVoucherRequest;
use AntChain\GESAAS_SPI\Models\PushRightsprodVoucherResponse;
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
            // 分账通知明细
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
                    'sdk_version'      => '1.1.3',
                    '_prod_code'       => 'GESAAS_SPI',
                    '_prod_channel'    => 'default',
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
     * Description: 分账结果通知第三方
     * Summary: 分账结果通知第三方.
     *
     * @param CallbackOrderSettlementRequest $request
     *
     * @return CallbackOrderSettlementResponse
     */
    public function callbackOrderSettlement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackOrderSettlementEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账结果通知第三方
     * Summary: 分账结果通知第三方.
     *
     * @param CallbackOrderSettlementRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CallbackOrderSettlementResponse
     */
    public function callbackOrderSettlementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackOrderSettlementResponse::fromMap($this->doRequest('1.0', 'antdigital.gesaasspi.order.settlement.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 权益中心权益券状态推送
     * Summary: 券状态推送
     *
     * @param PushRightsprodVoucherRequest $request
     *
     * @return PushRightsprodVoucherResponse
     */
    public function pushRightsprodVoucher($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRightsprodVoucherEx($request, $headers, $runtime);
    }

    /**
     * Description: 权益中心权益券状态推送
     * Summary: 券状态推送
     *
     * @param PushRightsprodVoucherRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PushRightsprodVoucherResponse
     */
    public function pushRightsprodVoucherEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRightsprodVoucherResponse::fromMap($this->doRequest('1.0', 'antdigital.gesaasspi.rightsprod.voucher.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 权益中心券状态变更回调通知
     * Summary: 权益中心券状态变更回调通知.
     *
     * @param CallbackRightsprodStatusRequest $request
     *
     * @return CallbackRightsprodStatusResponse
     */
    public function callbackRightsprodStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackRightsprodStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 权益中心券状态变更回调通知
     * Summary: 权益中心券状态变更回调通知.
     *
     * @param CallbackRightsprodStatusRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CallbackRightsprodStatusResponse
     */
    public function callbackRightsprodStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackRightsprodStatusResponse::fromMap($this->doRequest('1.0', 'antdigital.gesaasspi.rightsprod.status.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 券操作回调通知
     * Summary: 券操作回调通知.
     *
     * @param CallbackRightsprodOperationRequest $request
     *
     * @return CallbackRightsprodOperationResponse
     */
    public function callbackRightsprodOperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackRightsprodOperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 券操作回调通知
     * Summary: 券操作回调通知.
     *
     * @param CallbackRightsprodOperationRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CallbackRightsprodOperationResponse
     */
    public function callbackRightsprodOperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackRightsprodOperationResponse::fromMap($this->doRequest('1.0', 'antdigital.gesaasspi.rightsprod.operation.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 权益供应商权益发放spi
     * Summary: 权益供应商权益发放spi.
     *
     * @param PushRightsprodGrantrightsRequest $request
     *
     * @return PushRightsprodGrantrightsResponse
     */
    public function pushRightsprodGrantrights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRightsprodGrantrightsEx($request, $headers, $runtime);
    }

    /**
     * Description: 权益供应商权益发放spi
     * Summary: 权益供应商权益发放spi.
     *
     * @param PushRightsprodGrantrightsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return PushRightsprodGrantrightsResponse
     */
    public function pushRightsprodGrantrightsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRightsprodGrantrightsResponse::fromMap($this->doRequest('1.0', 'antdigital.gesaasspi.rightsprod.grantrights.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
