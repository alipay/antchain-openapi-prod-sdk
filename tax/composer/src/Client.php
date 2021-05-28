<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TAX\Models\AuthCorpRequest;
use AntChain\TAX\Models\AuthCorpResponse;
use AntChain\TAX\Models\PushChargeRequest;
use AntChain\TAX\Models\PushChargeResponse;
use AntChain\TAX\Models\PushIcmInvoiceinfoRequest;
use AntChain\TAX\Models\PushIcmInvoiceinfoResponse;
use AntChain\TAX\Models\PushIcmInvoiceRequest;
use AntChain\TAX\Models\PushIcmInvoiceResponse;
use AntChain\TAX\Models\QueryChargeAuthRequest;
use AntChain\TAX\Models\QueryChargeAuthResponse;
use AntChain\TAX\Models\QueryIcmInvoiceRequest;
use AntChain\TAX\Models\QueryIcmInvoiceResponse;
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
            // 发票明细
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
                    'sdk_version'      => '1.1.6',
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
     * Description: 目前仅用于广州区块链发票开通企业信息推送
     * Summary: 区块链发票开通企业信息推送
     *
     * @param AuthCorpRequest $request
     *
     * @return AuthCorpResponse
     */
    public function authCorp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authCorpEx($request, $headers, $runtime);
    }

    /**
     * Description: 目前仅用于广州区块链发票开通企业信息推送
     * Summary: 区块链发票开通企业信息推送
     *
     * @param AuthCorpRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return AuthCorpResponse
     */
    public function authCorpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthCorpResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.corp.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
     * Summary: 计费推送
     *
     * @param PushChargeRequest $request
     *
     * @return PushChargeResponse
     */
    public function pushCharge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushChargeEx($request, $headers, $runtime);
    }

    /**
     * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
     * Summary: 计费推送
     *
     * @param PushChargeRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return PushChargeResponse
     */
    public function pushChargeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushChargeResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.charge.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询计收费授权情况
     * Summary: 查询计收费授权情况.
     *
     * @param QueryChargeAuthRequest $request
     *
     * @return QueryChargeAuthResponse
     */
    public function queryChargeAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChargeAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询计收费授权情况
     * Summary: 查询计收费授权情况.
     *
     * @param QueryChargeAuthRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryChargeAuthResponse
     */
    public function queryChargeAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChargeAuthResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.charge.auth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 目前仅用于广州区块链发票信息推送
     * Summary:  区块链发票信息推送
     *
     * @param PushIcmInvoiceRequest $request
     *
     * @return PushIcmInvoiceResponse
     */
    public function pushIcmInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushIcmInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 目前仅用于广州区块链发票信息推送
     * Summary:  区块链发票信息推送
     *
     * @param PushIcmInvoiceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return PushIcmInvoiceResponse
     */
    public function pushIcmInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushIcmInvoiceResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoice.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
     * Summary:  区块链发票信息查询.
     *
     * @param QueryIcmInvoiceRequest $request
     *
     * @return QueryIcmInvoiceResponse
     */
    public function queryIcmInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIcmInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
     * Summary:  区块链发票信息查询.
     *
     * @param QueryIcmInvoiceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryIcmInvoiceResponse
     */
    public function queryIcmInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIcmInvoiceResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标准发票推送
     * Summary: 标准发票推送
     *
     * @param PushIcmInvoiceinfoRequest $request
     *
     * @return PushIcmInvoiceinfoResponse
     */
    public function pushIcmInvoiceinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushIcmInvoiceinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 标准发票推送
     * Summary: 标准发票推送
     *
     * @param PushIcmInvoiceinfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PushIcmInvoiceinfoResponse
     */
    public function pushIcmInvoiceinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushIcmInvoiceinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoiceinfo.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
