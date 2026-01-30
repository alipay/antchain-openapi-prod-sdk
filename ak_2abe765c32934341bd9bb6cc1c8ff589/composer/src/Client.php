<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoFundOrderfulfillmentRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoFundOrderfulfillmentResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfinancialRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfinancialResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfulfillmentRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfulfillmentResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundSplittingRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundSplittingResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundWithholdingcontractRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundWithholdingcontractResponse;
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
                    'sdk_version'      => '1.1.1',
                    '_prod_code'       => 'ak_2abe765c32934341bd9bb6cc1c8ff589',
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
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步.
     *
     * @param SyncAntchainAtoFundSplittingRequest $request
     *
     * @return SyncAntchainAtoFundSplittingResponse
     */
    public function syncAntchainAtoFundSplitting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundSplittingEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步.
     *
     * @param SyncAntchainAtoFundSplittingRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SyncAntchainAtoFundSplittingResponse
     */
    public function syncAntchainAtoFundSplittingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundSplittingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步.
     *
     * @param SyncAntchainAtoFundOrderfinancialRequest $request
     *
     * @return SyncAntchainAtoFundOrderfinancialResponse
     */
    public function syncAntchainAtoFundOrderfinancial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundOrderfinancialEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步.
     *
     * @param SyncAntchainAtoFundOrderfinancialRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return SyncAntchainAtoFundOrderfinancialResponse
     */
    public function syncAntchainAtoFundOrderfinancialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundOrderfinancialResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议.
     *
     * @param SyncAntchainAtoFundWithholdingcontractRequest $request
     *
     * @return SyncAntchainAtoFundWithholdingcontractResponse
     */
    public function syncAntchainAtoFundWithholdingcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundWithholdingcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议.
     *
     * @param SyncAntchainAtoFundWithholdingcontractRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return SyncAntchainAtoFundWithholdingcontractResponse
     */
    public function syncAntchainAtoFundWithholdingcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundWithholdingcontractResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息.
     *
     * @param SyncAntchainAtoFundOrderfulfillmentRequest $request
     *
     * @return SyncAntchainAtoFundOrderfulfillmentResponse
     */
    public function syncAntchainAtoFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息.
     *
     * @param SyncAntchainAtoFundOrderfulfillmentRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return SyncAntchainAtoFundOrderfulfillmentResponse
     */
    public function syncAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息.
     *
     * @param GetAntchainAtoFundOrderfulfillmentRequest $request
     *
     * @return GetAntchainAtoFundOrderfulfillmentResponse
     */
    public function getAntchainAtoFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息.
     *
     * @param GetAntchainAtoFundOrderfulfillmentRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return GetAntchainAtoFundOrderfulfillmentResponse
     */
    public function getAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
