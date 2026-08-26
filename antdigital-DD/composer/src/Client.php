<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DD\Models\QueryDemoTestJltestRequest;
use AntChain\DD\Models\QueryDemoTestJltestResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderxRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderxResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderzRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderzResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderyRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderyResponse;
use AntChain\DD\Models\CreateDemoBusinessOrdernRequest;
use AntChain\DD\Models\CreateDemoBusinessOrdernResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderaaRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderaaResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderqRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderqResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderbRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderbResponse;
use AntChain\DD\Models\TestDemoTestApiRequest;
use AntChain\DD\Models\TestDemoTestApiResponse;
use AntChain\DD\Models\CreateDemoBusinessOrdercRequest;
use AntChain\DD\Models\CreateDemoBusinessOrdercResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderdRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderdResponse;
use AntChain\DD\Models\QueryDemoTestTestjlRequest;
use AntChain\DD\Models\QueryDemoTestTestjlResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderppRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderppResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderxxxRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderxxxResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderResponse;
use AntChain\DD\Models\CreateDemoBusinessOrderzzzRequest;
use AntChain\DD\Models\CreateDemoBusinessOrderzzzResponse;
use AntChain\DD\Models\ApixaDemoCliCreateRequest;
use AntChain\DD\Models\ApixaDemoCliCreateResponse;
use AntChain\DD\Models\ApixbDemoCliCreateRequest;
use AntChain\DD\Models\ApixbDemoCliCreateResponse;
use AntChain\DD\Models\ApizDemoCliCreateRequest;
use AntChain\DD\Models\ApizDemoCliCreateResponse;
use AntChain\DD\Models\CreateAntcloudAcmAntchainTenantRequest;
use AntChain\DD\Models\CreateAntcloudAcmAntchainTenantResponse;
use AntChain\DD\Models\UpdateAntcloudAcmCustomerIdentityRequest;
use AntChain\DD\Models\UpdateAntcloudAcmCustomerIdentityResponse;
use AntChain\DD\Models\QueryAntcloudAcmUserProjectRequest;
use AntChain\DD\Models\QueryAntcloudAcmUserProjectResponse;
use AntChain\DD\Models\UpdateAntcloudAcmTenantCountryRequest;
use AntChain\DD\Models\UpdateAntcloudAcmTenantCountryResponse;
use AntChain\DD\Models\QueryAntcloudAcmTenantProjectRequest;
use AntChain\DD\Models\QueryAntcloudAcmTenantProjectResponse;
use AntChain\DD\Models\CreateAntcloudAcmTenantProjectRequest;
use AntChain\DD\Models\CreateAntcloudAcmTenantProjectResponse;
use AntChain\DD\Models\UpdateAntcloudAcmTenantProjectRequest;
use AntChain\DD\Models\UpdateAntcloudAcmTenantProjectResponse;
use AntChain\DD\Models\UpdateAntcloudAcmProjectStatusRequest;
use AntChain\DD\Models\UpdateAntcloudAcmProjectStatusResponse;
use AntChain\DD\Models\QueryAntcloudAcmProjectMemberRequest;
use AntChain\DD\Models\QueryAntcloudAcmProjectMemberResponse;
use AntChain\DD\Models\AddAntcloudAcmProjectMemberRequest;
use AntChain\DD\Models\AddAntcloudAcmProjectMemberResponse;
use AntChain\DD\Models\RemoveAntcloudAcmProjectMemberRequest;
use AntChain\DD\Models\RemoveAntcloudAcmProjectMemberResponse;
use AntChain\DD\Models\QueryAntcloudAcmProjectUserRequest;
use AntChain\DD\Models\QueryAntcloudAcmProjectUserResponse;
use AntChain\DD\Models\ListAntcloudOfferInstanceRequest;
use AntChain\DD\Models\ListAntcloudOfferInstanceResponse;
use AntChain\DD\Models\ApplyAntcloudBillingRespackageCountRequest;
use AntChain\DD\Models\ApplyAntcloudBillingRespackageCountResponse;
use AntChain\DD\Models\QueryAntcloudBillingRespackageBalanceRequest;
use AntChain\DD\Models\QueryAntcloudBillingRespackageBalanceResponse;
use AntChain\DD\Models\CheckAntcloudBillingConfigPreRequest;
use AntChain\DD\Models\CheckAntcloudBillingConfigPreResponse;
use AntChain\DD\Models\SendAntcloudMarketingPartnerCouponRequest;
use AntChain\DD\Models\SendAntcloudMarketingPartnerCouponResponse;
use AntChain\DD\Models\QueryAntcloudMarketingPartnerCouponstockRequest;
use AntChain\DD\Models\QueryAntcloudMarketingPartnerCouponstockResponse;
use AntChain\DD\Models\QueryAntcloudMarketingPartnerCouponRequest;
use AntChain\DD\Models\QueryAntcloudMarketingPartnerCouponResponse;
use AntChain\DD\Models\ListAntcloudMarketingPartnerCoupontemplateRequest;
use AntChain\DD\Models\ListAntcloudMarketingPartnerCoupontemplateResponse;
use AntChain\DD\Models\QueryAntcloudTradeComboPriceRequest;
use AntChain\DD\Models\QueryAntcloudTradeComboPriceResponse;
use AntChain\DD\Models\PayAntcloudTradeComboOrderRequest;
use AntChain\DD\Models\PayAntcloudTradeComboOrderResponse;
use AntChain\DD\Models\QueryAntcloudTradePriceRequest;
use AntChain\DD\Models\QueryAntcloudTradePriceResponse;
use AntChain\DD\Models\QueryAntcloudTradeComboOptionsRequest;
use AntChain\DD\Models\QueryAntcloudTradeComboOptionsResponse;
use AntChain\DD\Models\CreatewithoptionsAntcloudTradeComboRequest;
use AntChain\DD\Models\CreatewithoptionsAntcloudTradeComboResponse;
use AntChain\DD\Models\CancelAntcloudTradeComboRequest;
use AntChain\DD\Models\CancelAntcloudTradeComboResponse;
use AntChain\DD\Models\CreateAntcloudTradeComboOptionsRequest;
use AntChain\DD\Models\CreateAntcloudTradeComboOptionsResponse;
use AntChain\DD\Models\GetAntcloudTradeOrderRequest;
use AntChain\DD\Models\GetAntcloudTradeOrderResponse;
use AntChain\DD\Models\UseAntchainAbcJustTestRequest;
use AntChain\DD\Models\UseAntchainAbcJustTestResponse;
use AntChain\DD\Models\QueryAntcloudPccCommodityPriceRequest;
use AntChain\DD\Models\QueryAntcloudPccCommodityPriceResponse;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlconfigUserinfoRequest;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlconfigUserinfoResponse;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlamountRcptRequest;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlamountRcptResponse;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlinvoicesApplyRequest;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlinvoicesApplyResponse;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlinvoicesFileurlRequest;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlinvoicesFileurlResponse;
use AntChain\DD\Models\PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest;
use AntChain\DD\Models\PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest;
use AntChain\DD\Models\QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse;
use AntChain\DD\Models\ApiaAntdigitalTestliuyzpCliCreateRequest;
use AntChain\DD\Models\ApiaAntdigitalTestliuyzpCliCreateResponse;
use AntChain\DD\Models\QueryAntcloudDemositdevsyTesxXxxRequest;
use AntChain\DD\Models\QueryAntcloudDemositdevsyTesxXxxResponse;
use AntChain\DD\Models\ApiaAntcloudDemositdevsyCliCreateRequest;
use AntChain\DD\Models\ApiaAntcloudDemositdevsyCliCreateResponse;
use AntChain\DD\Models\ApiaAntcloudWorkbenchphaseiiaCliCreateRequest;
use AntChain\DD\Models\ApiaAntcloudWorkbenchphaseiiaCliCreateResponse;
use AntChain\DD\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DD\Models\ApibAntcloudWorkbenchphaseiiaCliCreateRequest;
use AntChain\DD\Models\ApibAntcloudWorkbenchphaseiiaCliCreateResponse;
use AntChain\DD\Models\CreateAntcloudGatewayxFileUploadResponse;

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
            "keepAliveDuration" => $this->_keepAliveDurationMillis,
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
            // 键值对，兼容map用
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
                    "sdk_version" => "1.1.1",
                    "_prod_code" => "DD",
                    "_prod_channel" => "default"
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
     * Description: 测试使用
     * Summary: 测试使用
     * @param QueryDemoTestJltestRequest $request
     * @return QueryDemoTestJltestResponse
     */
    public function queryDemoTestJltest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDemoTestJltestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用
     * @param QueryDemoTestJltestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDemoTestJltestResponse
     */
    public function queryDemoTestJltestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDemoTestJltestResponse::fromMap($this->doRequest("1.0", "demo.test.jltest.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderxRequest $request
     * @return CreateDemoBusinessOrderxResponse
     */
    public function createDemoBusinessOrderx($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderxEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderxRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderxResponse
     */
    public function createDemoBusinessOrderxEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderxResponse::fromMap($this->doRequest("1.0", "demo.business.orderx.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderzRequest $request
     * @return CreateDemoBusinessOrderzResponse
     */
    public function createDemoBusinessOrderz($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderzEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderzRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderzResponse
     */
    public function createDemoBusinessOrderzEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderzResponse::fromMap($this->doRequest("1.0", "demo.business.orderz.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderyRequest $request
     * @return CreateDemoBusinessOrderyResponse
     */
    public function createDemoBusinessOrdery($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderyResponse
     */
    public function createDemoBusinessOrderyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderyResponse::fromMap($this->doRequest("1.0", "demo.business.ordery.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单N
     * Summary: 创建订单N
     * @param CreateDemoBusinessOrdernRequest $request
     * @return CreateDemoBusinessOrdernResponse
     */
    public function createDemoBusinessOrdern($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrdernEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单N
     * Summary: 创建订单N
     * @param CreateDemoBusinessOrdernRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrdernResponse
     */
    public function createDemoBusinessOrdernEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrdernResponse::fromMap($this->doRequest("1.0", "demo.business.ordern.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderaaRequest $request
     * @return CreateDemoBusinessOrderaaResponse
     */
    public function createDemoBusinessOrderaa($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderaaEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderaaRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderaaResponse
     */
    public function createDemoBusinessOrderaaEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderaaResponse::fromMap($this->doRequest("1.0", "demo.business.orderaa.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderqRequest $request
     * @return CreateDemoBusinessOrderqResponse
     */
    public function createDemoBusinessOrderq($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderqEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderqRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderqResponse
     */
    public function createDemoBusinessOrderqEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderqResponse::fromMap($this->doRequest("1.0", "demo.business.orderq.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderbRequest $request
     * @return CreateDemoBusinessOrderbResponse
     */
    public function createDemoBusinessOrderb($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderbEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderbRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderbResponse
     */
    public function createDemoBusinessOrderbEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderbResponse::fromMap($this->doRequest("1.0", "demo.business.orderb.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口
     * @param TestDemoTestApiRequest $request
     * @return TestDemoTestApiResponse
     */
    public function testDemoTestApi($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->testDemoTestApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口
     * @param TestDemoTestApiRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return TestDemoTestApiResponse
     */
    public function testDemoTestApiEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return TestDemoTestApiResponse::fromMap($this->doRequest("1.0", "demo.test.api.test", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrdercRequest $request
     * @return CreateDemoBusinessOrdercResponse
     */
    public function createDemoBusinessOrderc($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrdercEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrdercRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrdercResponse
     */
    public function createDemoBusinessOrdercEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrdercResponse::fromMap($this->doRequest("1.0", "demo.business.orderc.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderdRequest $request
     * @return CreateDemoBusinessOrderdResponse
     */
    public function createDemoBusinessOrderd($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderdEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderdRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderdResponse
     */
    public function createDemoBusinessOrderdEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderdResponse::fromMap($this->doRequest("1.0", "demo.business.orderd.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test
     * @param QueryDemoTestTestjlRequest $request
     * @return QueryDemoTestTestjlResponse
     */
    public function queryDemoTestTestjl($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDemoTestTestjlEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test
     * @param QueryDemoTestTestjlRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDemoTestTestjlResponse
     */
    public function queryDemoTestTestjlEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDemoTestTestjlResponse::fromMap($this->doRequest("1.0", "demo.test.testjl.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderppRequest $request
     * @return CreateDemoBusinessOrderppResponse
     */
    public function createDemoBusinessOrderpp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderppEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderppResponse
     */
    public function createDemoBusinessOrderppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderppResponse::fromMap($this->doRequest("1.0", "demo.business.orderpp.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderxxxRequest $request
     * @return CreateDemoBusinessOrderxxxResponse
     */
    public function createDemoBusinessOrderxxx($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderxxxEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderxxxRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderxxxResponse
     */
    public function createDemoBusinessOrderxxxEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderxxxResponse::fromMap($this->doRequest("1.0", "demo.business.orderxxx.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderRequest $request
     * @return CreateDemoBusinessOrderResponse
     */
    public function createDemoBusinessOrder($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderResponse
     */
    public function createDemoBusinessOrderEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderResponse::fromMap($this->doRequest("1.0", "demo.business.order.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderzzzRequest $request
     * @return CreateDemoBusinessOrderzzzResponse
     */
    public function createDemoBusinessOrderzzz($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDemoBusinessOrderzzzEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateDemoBusinessOrderzzzRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDemoBusinessOrderzzzResponse
     */
    public function createDemoBusinessOrderzzzEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDemoBusinessOrderzzzResponse::fromMap($this->doRequest("1.0", "demo.business.orderzzz.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApixaDemoCliCreateRequest $request
     * @return ApixaDemoCliCreateResponse
     */
    public function apixaDemoCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apixaDemoCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApixaDemoCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApixaDemoCliCreateResponse
     */
    public function apixaDemoCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApixaDemoCliCreateResponse::fromMap($this->doRequest("1.0", "demo.cli.create.apixa", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApixbDemoCliCreateRequest $request
     * @return ApixbDemoCliCreateResponse
     */
    public function apixbDemoCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apixbDemoCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApixbDemoCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApixbDemoCliCreateResponse
     */
    public function apixbDemoCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApixbDemoCliCreateResponse::fromMap($this->doRequest("1.0", "demo.cli.create.apixb", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApizDemoCliCreateRequest $request
     * @return ApizDemoCliCreateResponse
     */
    public function apizDemoCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apizDemoCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApizDemoCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApizDemoCliCreateResponse
     */
    public function apizDemoCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApizDemoCliCreateResponse::fromMap($this->doRequest("1.0", "demo.cli.create.apiz", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账号创建
     * Summary: 账号创建
     * @param CreateAntcloudAcmAntchainTenantRequest $request
     * @return CreateAntcloudAcmAntchainTenantResponse
     */
    public function createAntcloudAcmAntchainTenant($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAntcloudAcmAntchainTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 账号创建
     * Summary: 账号创建
     * @param CreateAntcloudAcmAntchainTenantRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAntcloudAcmAntchainTenantResponse
     */
    public function createAntcloudAcmAntchainTenantEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAntcloudAcmAntchainTenantResponse::fromMap($this->doRequest("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户认证信息更新
     * Summary: 客户认证信息更新
     * @param UpdateAntcloudAcmCustomerIdentityRequest $request
     * @return UpdateAntcloudAcmCustomerIdentityResponse
     */
    public function updateAntcloudAcmCustomerIdentity($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAntcloudAcmCustomerIdentityEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户认证信息更新
     * Summary: 客户认证信息更新
     * @param UpdateAntcloudAcmCustomerIdentityRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAntcloudAcmCustomerIdentityResponse
     */
    public function updateAntcloudAcmCustomerIdentityEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAntcloudAcmCustomerIdentityResponse::fromMap($this->doRequest("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户所属项目列表
     * Summary: 查询用户所属项目列表
     * @param QueryAntcloudAcmUserProjectRequest $request
     * @return QueryAntcloudAcmUserProjectResponse
     */
    public function queryAntcloudAcmUserProject($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudAcmUserProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户所属项目列表
     * Summary: 查询用户所属项目列表
     * @param QueryAntcloudAcmUserProjectRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudAcmUserProjectResponse
     */
    public function queryAntcloudAcmUserProjectEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudAcmUserProjectResponse::fromMap($this->doRequest("1.0", "antcloud.acm.user.project.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新蚂蚁链账号的国家代码
     * Summary: 更新蚂蚁链账号的国家代码
     * @param UpdateAntcloudAcmTenantCountryRequest $request
     * @return UpdateAntcloudAcmTenantCountryResponse
     */
    public function updateAntcloudAcmTenantCountry($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAntcloudAcmTenantCountryEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新蚂蚁链账号的国家代码
     * Summary: 更新蚂蚁链账号的国家代码
     * @param UpdateAntcloudAcmTenantCountryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAntcloudAcmTenantCountryResponse
     */
    public function updateAntcloudAcmTenantCountryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAntcloudAcmTenantCountryResponse::fromMap($this->doRequest("1.0", "antcloud.acm.tenant.country.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户下项目列表
     * Summary: 查询租户下项目列表
     * @param QueryAntcloudAcmTenantProjectRequest $request
     * @return QueryAntcloudAcmTenantProjectResponse
     */
    public function queryAntcloudAcmTenantProject($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudAcmTenantProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户下项目列表
     * Summary: 查询租户下项目列表
     * @param QueryAntcloudAcmTenantProjectRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudAcmTenantProjectResponse
     */
    public function queryAntcloudAcmTenantProjectEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudAcmTenantProjectResponse::fromMap($this->doRequest("1.0", "antcloud.acm.tenant.project.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目
     * @param CreateAntcloudAcmTenantProjectRequest $request
     * @return CreateAntcloudAcmTenantProjectResponse
     */
    public function createAntcloudAcmTenantProject($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAntcloudAcmTenantProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目
     * @param CreateAntcloudAcmTenantProjectRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAntcloudAcmTenantProjectResponse
     */
    public function createAntcloudAcmTenantProjectEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAntcloudAcmTenantProjectResponse::fromMap($this->doRequest("1.0", "antcloud.acm.tenant.project.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑项目
     * Summary: 编辑项目
     * @param UpdateAntcloudAcmTenantProjectRequest $request
     * @return UpdateAntcloudAcmTenantProjectResponse
     */
    public function updateAntcloudAcmTenantProject($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAntcloudAcmTenantProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑项目
     * Summary: 编辑项目
     * @param UpdateAntcloudAcmTenantProjectRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAntcloudAcmTenantProjectResponse
     */
    public function updateAntcloudAcmTenantProjectEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAntcloudAcmTenantProjectResponse::fromMap($this->doRequest("1.0", "antcloud.acm.tenant.project.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新项目状态
     * Summary: 更新项目状态
     * @param UpdateAntcloudAcmProjectStatusRequest $request
     * @return UpdateAntcloudAcmProjectStatusResponse
     */
    public function updateAntcloudAcmProjectStatus($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAntcloudAcmProjectStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新项目状态
     * Summary: 更新项目状态
     * @param UpdateAntcloudAcmProjectStatusRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAntcloudAcmProjectStatusResponse
     */
    public function updateAntcloudAcmProjectStatusEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAntcloudAcmProjectStatusResponse::fromMap($this->doRequest("1.0", "antcloud.acm.project.status.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询项目成员列表
     * Summary: 分页查询项目成员列表
     * @param QueryAntcloudAcmProjectMemberRequest $request
     * @return QueryAntcloudAcmProjectMemberResponse
     */
    public function queryAntcloudAcmProjectMember($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudAcmProjectMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询项目成员列表
     * Summary: 分页查询项目成员列表
     * @param QueryAntcloudAcmProjectMemberRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudAcmProjectMemberResponse
     */
    public function queryAntcloudAcmProjectMemberEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudAcmProjectMemberResponse::fromMap($this->doRequest("1.0", "antcloud.acm.project.member.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量添加项目成员
     * Summary: 批量添加项目成员
     * @param AddAntcloudAcmProjectMemberRequest $request
     * @return AddAntcloudAcmProjectMemberResponse
     */
    public function addAntcloudAcmProjectMember($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->addAntcloudAcmProjectMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量添加项目成员
     * Summary: 批量添加项目成员
     * @param AddAntcloudAcmProjectMemberRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return AddAntcloudAcmProjectMemberResponse
     */
    public function addAntcloudAcmProjectMemberEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return AddAntcloudAcmProjectMemberResponse::fromMap($this->doRequest("1.0", "antcloud.acm.project.member.add", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 移除项目成员
     * Summary: 移除项目成员
     * @param RemoveAntcloudAcmProjectMemberRequest $request
     * @return RemoveAntcloudAcmProjectMemberResponse
     */
    public function removeAntcloudAcmProjectMember($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->removeAntcloudAcmProjectMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 移除项目成员
     * Summary: 移除项目成员
     * @param RemoveAntcloudAcmProjectMemberRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RemoveAntcloudAcmProjectMemberResponse
     */
    public function removeAntcloudAcmProjectMemberEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RemoveAntcloudAcmProjectMemberResponse::fromMap($this->doRequest("1.0", "antcloud.acm.project.member.remove", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询尚未加入该项目的用户列表
     * Summary: 查询尚未加入该项目的用户列表
     * @param QueryAntcloudAcmProjectUserRequest $request
     * @return QueryAntcloudAcmProjectUserResponse
     */
    public function queryAntcloudAcmProjectUser($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudAcmProjectUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询尚未加入该项目的用户列表
     * Summary: 查询尚未加入该项目的用户列表
     * @param QueryAntcloudAcmProjectUserRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudAcmProjectUserResponse
     */
    public function queryAntcloudAcmProjectUserEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudAcmProjectUserResponse::fromMap($this->doRequest("1.0", "antcloud.acm.project.user.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据租户查询实例列表
     * Summary: 根据租户查询实例列表
     * @param ListAntcloudOfferInstanceRequest $request
     * @return ListAntcloudOfferInstanceResponse
     */
    public function listAntcloudOfferInstance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listAntcloudOfferInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据租户查询实例列表
     * Summary: 根据租户查询实例列表
     * @param ListAntcloudOfferInstanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListAntcloudOfferInstanceResponse
     */
    public function listAntcloudOfferInstanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListAntcloudOfferInstanceResponse::fromMap($this->doRequest("1.0", "antcloud.offer.instance.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 由外部业务系统来调用触发抵扣接口
     * Summary: 由外部业务系统来调用触发抵扣接口
     * @param ApplyAntcloudBillingRespackageCountRequest $request
     * @return ApplyAntcloudBillingRespackageCountResponse
     */
    public function applyAntcloudBillingRespackageCount($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->applyAntcloudBillingRespackageCountEx($request, $headers, $runtime);
    }

    /**
     * Description: 由外部业务系统来调用触发抵扣接口
     * Summary: 由外部业务系统来调用触发抵扣接口
     * @param ApplyAntcloudBillingRespackageCountRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApplyAntcloudBillingRespackageCountResponse
     */
    public function applyAntcloudBillingRespackageCountEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApplyAntcloudBillingRespackageCountResponse::fromMap($this->doRequest("1.0", "antcloud.billing.respackage.count.apply", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据租户、抵扣的量价商品查询资源包余量
     * Summary: 根据租户、抵扣的量价商品查询资源包余量
     * @param QueryAntcloudBillingRespackageBalanceRequest $request
     * @return QueryAntcloudBillingRespackageBalanceResponse
     */
    public function queryAntcloudBillingRespackageBalance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudBillingRespackageBalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据租户、抵扣的量价商品查询资源包余量
     * Summary: 根据租户、抵扣的量价商品查询资源包余量
     * @param QueryAntcloudBillingRespackageBalanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudBillingRespackageBalanceResponse
     */
    public function queryAntcloudBillingRespackageBalanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudBillingRespackageBalanceResponse::fromMap($this->doRequest("1.0", "antcloud.billing.respackage.balance.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线上对比线下计量计费资源包配置接口
     * Summary: 线上对比线下计量计费资源包配置接口
     * @param CheckAntcloudBillingConfigPreRequest $request
     * @return CheckAntcloudBillingConfigPreResponse
     */
    public function checkAntcloudBillingConfigPre($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkAntcloudBillingConfigPreEx($request, $headers, $runtime);
    }

    /**
     * Description: 线上对比线下计量计费资源包配置接口
     * Summary: 线上对比线下计量计费资源包配置接口
     * @param CheckAntcloudBillingConfigPreRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckAntcloudBillingConfigPreResponse
     */
    public function checkAntcloudBillingConfigPreEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckAntcloudBillingConfigPreResponse::fromMap($this->doRequest("1.0", "antcloud.billing.config.pre.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部发券
     * Summary: 外部发券
     * @param SendAntcloudMarketingPartnerCouponRequest $request
     * @return SendAntcloudMarketingPartnerCouponResponse
     */
    public function sendAntcloudMarketingPartnerCoupon($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->sendAntcloudMarketingPartnerCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部发券
     * Summary: 外部发券
     * @param SendAntcloudMarketingPartnerCouponRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SendAntcloudMarketingPartnerCouponResponse
     */
    public function sendAntcloudMarketingPartnerCouponEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SendAntcloudMarketingPartnerCouponResponse::fromMap($this->doRequest("1.0", "antcloud.marketing.partner.coupon.send", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户查询券余量
     * Summary: 外部客户查询券余量
     * @param QueryAntcloudMarketingPartnerCouponstockRequest $request
     * @return QueryAntcloudMarketingPartnerCouponstockResponse
     */
    public function queryAntcloudMarketingPartnerCouponstock($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudMarketingPartnerCouponstockEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户查询券余量
     * Summary: 外部客户查询券余量
     * @param QueryAntcloudMarketingPartnerCouponstockRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudMarketingPartnerCouponstockResponse
     */
    public function queryAntcloudMarketingPartnerCouponstockEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudMarketingPartnerCouponstockResponse::fromMap($this->doRequest("1.0", "antcloud.marketing.partner.couponstock.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定租户指定产品列表可用优惠券
     * Summary: 查询指定租户指定产品列表可用优惠券
     * @param QueryAntcloudMarketingPartnerCouponRequest $request
     * @return QueryAntcloudMarketingPartnerCouponResponse
     */
    public function queryAntcloudMarketingPartnerCoupon($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudMarketingPartnerCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定租户指定产品列表可用优惠券
     * Summary: 查询指定租户指定产品列表可用优惠券
     * @param QueryAntcloudMarketingPartnerCouponRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudMarketingPartnerCouponResponse
     */
    public function queryAntcloudMarketingPartnerCouponEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudMarketingPartnerCouponResponse::fromMap($this->doRequest("1.0", "antcloud.marketing.partner.coupon.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于查询可用的优惠券模板信息
     * Summary: 用于查询可用的优惠券模板信息
     * @param ListAntcloudMarketingPartnerCoupontemplateRequest $request
     * @return ListAntcloudMarketingPartnerCoupontemplateResponse
     */
    public function listAntcloudMarketingPartnerCoupontemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listAntcloudMarketingPartnerCoupontemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于查询可用的优惠券模板信息
     * Summary: 用于查询可用的优惠券模板信息
     * @param ListAntcloudMarketingPartnerCoupontemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListAntcloudMarketingPartnerCoupontemplateResponse
     */
    public function listAntcloudMarketingPartnerCoupontemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListAntcloudMarketingPartnerCoupontemplateResponse::fromMap($this->doRequest("1.0", "antcloud.marketing.partner.coupontemplate.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 套餐询价接口
     * Summary: 套餐询价接口
     * @param QueryAntcloudTradeComboPriceRequest $request
     * @return QueryAntcloudTradeComboPriceResponse
     */
    public function queryAntcloudTradeComboPrice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudTradeComboPriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 套餐询价接口
     * Summary: 套餐询价接口
     * @param QueryAntcloudTradeComboPriceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudTradeComboPriceResponse
     */
    public function queryAntcloudTradeComboPriceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudTradeComboPriceResponse::fromMap($this->doRequest("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口
     * @param PayAntcloudTradeComboOrderRequest $request
     * @return PayAntcloudTradeComboOrderResponse
     */
    public function payAntcloudTradeComboOrder($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->payAntcloudTradeComboOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口
     * @param PayAntcloudTradeComboOrderRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PayAntcloudTradeComboOrderResponse
     */
    public function payAntcloudTradeComboOrderEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PayAntcloudTradeComboOrderResponse::fromMap($this->doRequest("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * @param QueryAntcloudTradePriceRequest $request
     * @return QueryAntcloudTradePriceResponse
     */
    public function queryAntcloudTradePrice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudTradePriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * @param QueryAntcloudTradePriceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudTradePriceResponse
     */
    public function queryAntcloudTradePriceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudTradePriceResponse::fromMap($this->doRequest("1.0", "antcloud.trade.price.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * @param QueryAntcloudTradeComboOptionsRequest $request
     * @return QueryAntcloudTradeComboOptionsResponse
     */
    public function queryAntcloudTradeComboOptions($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudTradeComboOptionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * @param QueryAntcloudTradeComboOptionsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudTradeComboOptionsResponse
     */
    public function queryAntcloudTradeComboOptionsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudTradeComboOptionsResponse::fromMap($this->doRequest("1.0", "antcloud.trade.combo.options.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * @param CreatewithoptionsAntcloudTradeComboRequest $request
     * @return CreatewithoptionsAntcloudTradeComboResponse
     */
    public function createwithoptionsAntcloudTradeCombo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createwithoptionsAntcloudTradeComboEx($request, $headers, $runtime);
    }

    /**
     * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * @param CreatewithoptionsAntcloudTradeComboRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreatewithoptionsAntcloudTradeComboResponse
     */
    public function createwithoptionsAntcloudTradeComboEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreatewithoptionsAntcloudTradeComboResponse::fromMap($this->doRequest("1.0", "antcloud.trade.combo.createwithoptions", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * @param CancelAntcloudTradeComboRequest $request
     * @return CancelAntcloudTradeComboResponse
     */
    public function cancelAntcloudTradeCombo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelAntcloudTradeComboEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * @param CancelAntcloudTradeComboRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelAntcloudTradeComboResponse
     */
    public function cancelAntcloudTradeComboEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelAntcloudTradeComboResponse::fromMap($this->doRequest("1.0", "antcloud.trade.combo.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * @param CreateAntcloudTradeComboOptionsRequest $request
     * @return CreateAntcloudTradeComboOptionsResponse
     */
    public function createAntcloudTradeComboOptions($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAntcloudTradeComboOptionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * @param CreateAntcloudTradeComboOptionsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAntcloudTradeComboOptionsResponse
     */
    public function createAntcloudTradeComboOptionsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAntcloudTradeComboOptionsResponse::fromMap($this->doRequest("1.0", "antcloud.trade.combo.options.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单商品订单履约状态查询
     * Summary: 单商品订单履约状态查询
     * @param GetAntcloudTradeOrderRequest $request
     * @return GetAntcloudTradeOrderResponse
     */
    public function getAntcloudTradeOrder($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getAntcloudTradeOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 单商品订单履约状态查询
     * Summary: 单商品订单履约状态查询
     * @param GetAntcloudTradeOrderRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetAntcloudTradeOrderResponse
     */
    public function getAntcloudTradeOrderEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetAntcloudTradeOrderResponse::fromMap($this->doRequest("1.0", "antcloud.trade.order.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test
     * @param UseAntchainAbcJustTestRequest $request
     * @return UseAntchainAbcJustTestResponse
     */
    public function useAntchainAbcJustTest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->useAntchainAbcJustTestEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test
     * @param UseAntchainAbcJustTestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UseAntchainAbcJustTestResponse
     */
    public function useAntchainAbcJustTestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UseAntchainAbcJustTestResponse::fromMap($this->doRequest("1.0", "antchain.abc.just.test.use", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品定价查询
     * Summary: 商品定价查询
     * @param QueryAntcloudPccCommodityPriceRequest $request
     * @return QueryAntcloudPccCommodityPriceResponse
     */
    public function queryAntcloudPccCommodityPrice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudPccCommodityPriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品定价查询
     * Summary: 商品定价查询
     * @param QueryAntcloudPccCommodityPriceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudPccCommodityPriceResponse
     */
    public function queryAntcloudPccCommodityPriceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudPccCommodityPriceResponse::fromMap($this->doRequest("1.0", "antcloud.pcc.commodity.price.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 国际开票场景下查询客户信息
     * Summary: 国际开票场景下查询客户信息
     * @param QueryAntcloudInvoiceIntlconfigUserinfoRequest $request
     * @return QueryAntcloudInvoiceIntlconfigUserinfoResponse
     */
    public function queryAntcloudInvoiceIntlconfigUserinfo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudInvoiceIntlconfigUserinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 国际开票场景下查询客户信息
     * Summary: 国际开票场景下查询客户信息
     * @param QueryAntcloudInvoiceIntlconfigUserinfoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudInvoiceIntlconfigUserinfoResponse
     */
    public function queryAntcloudInvoiceIntlconfigUserinfoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudInvoiceIntlconfigUserinfoResponse::fromMap($this->doRequest("1.0", "antcloud.invoice.intlconfig.userinfo.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 国际发票场景果询可开票单据
     * Summary: 国际发票场景果询可开票单据
     * @param QueryAntcloudInvoiceIntlamountRcptRequest $request
     * @return QueryAntcloudInvoiceIntlamountRcptResponse
     */
    public function queryAntcloudInvoiceIntlamountRcpt($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudInvoiceIntlamountRcptEx($request, $headers, $runtime);
    }

    /**
     * Description: 国际发票场景果询可开票单据
     * Summary: 国际发票场景果询可开票单据
     * @param QueryAntcloudInvoiceIntlamountRcptRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudInvoiceIntlamountRcptResponse
     */
    public function queryAntcloudInvoiceIntlamountRcptEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudInvoiceIntlamountRcptResponse::fromMap($this->doRequest("1.0", "antcloud.invoice.intlamount.rcpt.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 国际发票场景下查询开票申请列表
     * Summary: 国际发票场景下查询开票申请列表
     * @param QueryAntcloudInvoiceIntlinvoicesApplyRequest $request
     * @return QueryAntcloudInvoiceIntlinvoicesApplyResponse
     */
    public function queryAntcloudInvoiceIntlinvoicesApply($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudInvoiceIntlinvoicesApplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 国际发票场景下查询开票申请列表
     * Summary: 国际发票场景下查询开票申请列表
     * @param QueryAntcloudInvoiceIntlinvoicesApplyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudInvoiceIntlinvoicesApplyResponse
     */
    public function queryAntcloudInvoiceIntlinvoicesApplyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudInvoiceIntlinvoicesApplyResponse::fromMap($this->doRequest("1.0", "antcloud.invoice.intlinvoices.apply.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据业务号和发票ID获取国际发票文件下载地址
     * Summary: 根据业务号和发票ID获取国际发票文件下载地址
     * @param QueryAntcloudInvoiceIntlinvoicesFileurlRequest $request
     * @return QueryAntcloudInvoiceIntlinvoicesFileurlResponse
     */
    public function queryAntcloudInvoiceIntlinvoicesFileurl($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudInvoiceIntlinvoicesFileurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据业务号和发票ID获取国际发票文件下载地址
     * Summary: 根据业务号和发票ID获取国际发票文件下载地址
     * @param QueryAntcloudInvoiceIntlinvoicesFileurlRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudInvoiceIntlinvoicesFileurlResponse
     */
    public function queryAntcloudInvoiceIntlinvoicesFileurlEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudInvoiceIntlinvoicesFileurlResponse::fromMap($this->doRequest("1.0", "antcloud.invoice.intlinvoices.fileurl.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交国际形式发票开票申请
     * Summary: 提交国际形式发票开票申请
     * @param PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest $request
     * @return PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse
     */
    public function pushAntcloudInvoiceIntlinvoicesProformainvoice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushAntcloudInvoiceIntlinvoicesProformainvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交国际形式发票开票申请
     * Summary: 提交国际形式发票开票申请
     * @param PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse
     */
    public function pushAntcloudInvoiceIntlinvoicesProformainvoiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse::fromMap($this->doRequest("1.0", "antcloud.invoice.intlinvoices.proformainvoice.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询国家代码选择信息
     * Summary: 查询国家代码选择信息
     * @param QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest $request
     * @return QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse
     */
    public function queryAntcloudInvoiceIntlconfigAllcountrycnen($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudInvoiceIntlconfigAllcountrycnenEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询国家代码选择信息
     * Summary: 查询国家代码选择信息
     * @param QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse
     */
    public function queryAntcloudInvoiceIntlconfigAllcountrycnenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse::fromMap($this->doRequest("1.0", "antcloud.invoice.intlconfig.allcountrycnen.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口a
     * Summary: cli创建测试接口a
     * @param ApiaAntdigitalTestliuyzpCliCreateRequest $request
     * @return ApiaAntdigitalTestliuyzpCliCreateResponse
     */
    public function apiaAntdigitalTestliuyzpCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiaAntdigitalTestliuyzpCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口a
     * Summary: cli创建测试接口a
     * @param ApiaAntdigitalTestliuyzpCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiaAntdigitalTestliuyzpCliCreateResponse
     */
    public function apiaAntdigitalTestliuyzpCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApiaAntdigitalTestliuyzpCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.testliuyzp.cli.create.apia", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: plugin测试编辑接口
     * Summary: plugin测试编辑接口
     * @param QueryAntcloudDemositdevsyTesxXxxRequest $request
     * @return QueryAntcloudDemositdevsyTesxXxxResponse
     */
    public function queryAntcloudDemositdevsyTesxXxx($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudDemositdevsyTesxXxxEx($request, $headers, $runtime);
    }

    /**
     * Description: plugin测试编辑接口
     * Summary: plugin测试编辑接口
     * @param QueryAntcloudDemositdevsyTesxXxxRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudDemositdevsyTesxXxxResponse
     */
    public function queryAntcloudDemositdevsyTesxXxxEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudDemositdevsyTesxXxxResponse::fromMap($this->doRequest("1.0", "antcloud.demositdevsy.tesx.xxx.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口a
     * Summary: cli创建测试接口a
     * @param ApiaAntcloudDemositdevsyCliCreateRequest $request
     * @return ApiaAntcloudDemositdevsyCliCreateResponse
     */
    public function apiaAntcloudDemositdevsyCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiaAntcloudDemositdevsyCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口a
     * Summary: cli创建测试接口a
     * @param ApiaAntcloudDemositdevsyCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiaAntcloudDemositdevsyCliCreateResponse
     */
    public function apiaAntcloudDemositdevsyCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApiaAntcloudDemositdevsyCliCreateResponse::fromMap($this->doRequest("1.0", "antcloud.demositdevsy.cli.create.apia", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: gatewat-plugin创建接口a
     * Summary: gatewat-plugin创建接口a
     * @param ApiaAntcloudWorkbenchphaseiiaCliCreateRequest $request
     * @return ApiaAntcloudWorkbenchphaseiiaCliCreateResponse
     */
    public function apiaAntcloudWorkbenchphaseiiaCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiaAntcloudWorkbenchphaseiiaCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: gatewat-plugin创建接口a
     * Summary: gatewat-plugin创建接口a
     * @param ApiaAntcloudWorkbenchphaseiiaCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiaAntcloudWorkbenchphaseiiaCliCreateResponse
     */
    public function apiaAntcloudWorkbenchphaseiiaCliCreateEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antcloud.workbenchphaseiia.cli.create.apia",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $apiaAntcloudWorkbenchphaseiiaCliCreateResponse = new ApiaAntcloudWorkbenchphaseiiaCliCreateResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $apiaAntcloudWorkbenchphaseiiaCliCreateResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return ApiaAntcloudWorkbenchphaseiiaCliCreateResponse::fromMap($this->doRequest("1.0", "antcloud.workbenchphaseiia.cli.create.apia", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: gateway-plugin创建接口b
     * Summary: gateway-plugin创建接口b
     * @param ApibAntcloudWorkbenchphaseiiaCliCreateRequest $request
     * @return ApibAntcloudWorkbenchphaseiiaCliCreateResponse
     */
    public function apibAntcloudWorkbenchphaseiiaCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apibAntcloudWorkbenchphaseiiaCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: gateway-plugin创建接口b
     * Summary: gateway-plugin创建接口b
     * @param ApibAntcloudWorkbenchphaseiiaCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApibAntcloudWorkbenchphaseiiaCliCreateResponse
     */
    public function apibAntcloudWorkbenchphaseiiaCliCreateEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antcloud.workbenchphaseiia.cli.create.apib",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $apibAntcloudWorkbenchphaseiiaCliCreateResponse = new ApibAntcloudWorkbenchphaseiiaCliCreateResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $apibAntcloudWorkbenchphaseiiaCliCreateResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return ApibAntcloudWorkbenchphaseiiaCliCreateResponse::fromMap($this->doRequest("1.0", "antcloud.workbenchphaseiia.cli.create.apib", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUpload($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAntcloudGatewayxFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUploadEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAntcloudGatewayxFileUploadResponse::fromMap($this->doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
