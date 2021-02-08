<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INDUSTRY;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\INDUSTRY\Models\CreateMerchantSellerRequest;
use AntChain\INDUSTRY\Models\CreateMerchantSellerResponse;
use AntChain\INDUSTRY\Models\QueryMerchantSignRequest;
use AntChain\INDUSTRY\Models\QueryMerchantSignResponse;
use AntChain\INDUSTRY\Models\PayTradePageRequest;
use AntChain\INDUSTRY\Models\PayTradePageResponse;
use AntChain\INDUSTRY\Models\QueryTradeOrderRequest;
use AntChain\INDUSTRY\Models\QueryTradeOrderResponse;

class Client {
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
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public function __construct($config){
        if (Utils::isUnset($config)) {
            throw new TeaError([
                "code" => "ParameterMissing",
                "message" => "'config' can not be unset"
            ]);
        }
        $this->_accessKeyId = $config->accessKeyId;
        $this->_accessKeySecret = $config->accessKeySecret;
        $this->_securityToken = $config->securityToken;
        $this->_endpoint = $config->endpoint;
        $this->_protocol = $config->protocol;
        $this->_userAgent = $config->userAgent;
        $this->_readTimeout = Utils::defaultNumber($config->readTimeout, 20000);
        $this->_connectTimeout = Utils::defaultNumber($config->connectTimeout, 20000);
        $this->_httpProxy = $config->httpProxy;
        $this->_httpsProxy = $config->httpsProxy;
        $this->_noProxy = $config->noProxy;
        $this->_socks5Proxy = $config->socks5Proxy;
        $this->_socks5NetWork = $config->socks5NetWork;
        $this->_maxIdleConns = Utils::defaultNumber($config->maxIdleConns, 60000);
        $this->_maxIdleTimeMillis = Utils::defaultNumber($config->maxIdleTimeMillis, 5);
        $this->_keepAliveDurationMillis = Utils::defaultNumber($config->keepAliveDurationMillis, 5000);
        $this->_maxRequests = Utils::defaultNumber($config->maxRequests, 100);
        $this->_maxRequestsPerHost = Utils::defaultNumber($config->maxRequestsPerHost, 100);
    }

    /**
     * Encapsulate the request and invoke the network
     * @param string $version
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param mixed[] $request which contains request params
     * @param string[] $headers
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return array the response
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $headers, $runtime){
        $runtime->validate();
        $_runtime = [
            "timeouted" => "retry",
            "readTimeout" => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            "connectTimeout" => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            "httpProxy" => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            "httpsProxy" => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            "noProxy" => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            "maxIdleConns" => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            "maxIdleTimeMillis" => $this->_maxIdleTimeMillis,
            "keepAliveDurationMillis" => $this->_keepAliveDurationMillis,
            "maxRequests" => $this->_maxRequests,
            "maxRequestsPerHost" => $this->_maxRequestsPerHost,
            "retry" => [
                "retryable" => $runtime->autoretry,
                "maxAttempts" => Utils::defaultNumber($runtime->maxAttempts, 3)
            ],
            "backoff" => [
                "policy" => Utils::defaultString($runtime->backoffPolicy, "no"),
                "period" => Utils::defaultNumber($runtime->backoffPeriod, 1)
            ],
            "ignoreSSL" => $runtime->ignoreSSL,
            // 银行卡信息
        ];
        $_lastRequest = null;
        $_lastException = null;
        $_now = time();
        $_retryTimes = 0;
        while (Tea::allowRetry(@$_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime(@$_runtime["backoff"], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;
            try {
                $_request = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method = $method;
                $_request->pathname = $pathname;
                $_request->query = [
                    "method" => $action,
                    "version" => $version,
                    "sign_type" => "HmacSHA1",
                    "req_time" => UtilClient::getTimestamp(),
                    "req_msg_id" => UtilClient::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "base_sdk_version" => "TeaSDK-2.0",
                    "sdk_version" => "1.0.7"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    "host" => Utils::defaultString($this->_endpoint, "openapi.antchain.antgroup.com"),
                    "user-agent" => Utils::getUserAgent($this->_userAgent)
                ], $headers);
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $raw = Utils::readAsString($_response->body);
                $obj = Utils::parseJSON($raw);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap(@$res["response"]);
                if (UtilClient::hasError($raw, $this->_accessKeySecret)) {
                    throw new TeaError([
                        "message" => @$resp["result_msg"],
                        "data" => $resp,
                        "code" => @$resp["result_code"]
                    ]);
                }
                return $resp;
            }
            catch (Exception $e) {
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
     * Description: 商业卖家商户注册
     * Summary: 行业卖家商户注册
     * @param CreateMerchantSellerRequest $request
     * @return CreateMerchantSellerResponse
     */
    public function createMerchantSeller($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createMerchantSellerEx($request, $headers, $runtime);
    }

    /**
     * Description: 商业卖家商户注册
     * Summary: 行业卖家商户注册
     * @param CreateMerchantSellerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateMerchantSellerResponse
     */
    public function createMerchantSellerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateMerchantSellerResponse::fromMap($this->doRequest("1.0", "antcloud.industry.merchant.seller.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 行业卖家商户注册结果查询服务
     * Summary: 行业卖家商户注册结果查询服务
     * @param QueryMerchantSignRequest $request
     * @return QueryMerchantSignResponse
     */
    public function queryMerchantSign($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMerchantSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 行业卖家商户注册结果查询服务
     * Summary: 行业卖家商户注册结果查询服务
     * @param QueryMerchantSignRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMerchantSignResponse
     */
    public function queryMerchantSignEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMerchantSignResponse::fromMap($this->doRequest("1.0", "antcloud.industry.merchant.sign.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 买家卖家收单交易，直接收款给卖家过渡户
     * Summary: 买家卖家收单交易
     * @param PayTradePageRequest $request
     * @return PayTradePageResponse
     */
    public function payTradePage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->payTradePageEx($request, $headers, $runtime);
    }

    /**
     * Description: 买家卖家收单交易，直接收款给卖家过渡户
     * Summary: 买家卖家收单交易
     * @param PayTradePageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PayTradePageResponse
     */
    public function payTradePageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PayTradePageResponse::fromMap($this->doRequest("1.0", "antcloud.industry.trade.page.pay", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 交易支付结果查询接口
     * Summary: 交易结果查询
     * @param QueryTradeOrderRequest $request
     * @return QueryTradeOrderResponse
     */
    public function queryTradeOrder($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryTradeOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 交易支付结果查询接口
     * Summary: 交易结果查询
     * @param QueryTradeOrderRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryTradeOrderResponse
     */
    public function queryTradeOrderEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryTradeOrderResponse::fromMap($this->doRequest("1.0", "antcloud.industry.trade.order.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
