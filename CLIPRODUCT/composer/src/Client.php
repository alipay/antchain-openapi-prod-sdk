<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CLIPRODUCT;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderzzzRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderzzzResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderpppRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderpppResponse;
use AntChain\CLIPRODUCT\Models\ApiaCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApiaCliCreateResponse;
use AntChain\CLIPRODUCT\Models\ApibCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApibCliCreateResponse;
use AntChain\CLIPRODUCT\Models\ApicCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApicCliCreateResponse;
use AntChain\CLIPRODUCT\Models\ApieCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApieCliCreateResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderaaaRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderaaaResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderbbbRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderbbbResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrdereeeRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrdereeeResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderdddRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderdddResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderabcRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderabcResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderfffRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderfffResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrdergggRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrdergggResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderhRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderhResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderiRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderiResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderjRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderjResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderkRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderkResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderlRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderlResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderoRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderoResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderrRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrderrResponse;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrdersRequest;
use AntChain\CLIPRODUCT\Models\CreateBusinessOrdersResponse;
use AntChain\CLIPRODUCT\Models\ApifCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApifCliCreateResponse;
use AntChain\CLIPRODUCT\Models\ApigCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApigCliCreateResponse;
use AntChain\CLIPRODUCT\Models\ApiCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApiCliCreateResponse;
use AntChain\CLIPRODUCT\Models\ApihCliCreateRequest;
use AntChain\CLIPRODUCT\Models\ApihCliCreateResponse;

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
            // 商品明细
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
                    "sdk_version" => "1.0.0",
                    "_prod_code" => "CLIPRODUCT",
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
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderzzzRequest $request
     * @return CreateBusinessOrderzzzResponse
     */
    public function createBusinessOrderzzz($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderzzzEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderzzzRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderzzzResponse
     */
    public function createBusinessOrderzzzEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderzzzResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderzzz.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderpppRequest $request
     * @return CreateBusinessOrderpppResponse
     */
    public function createBusinessOrderppp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderpppEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderpppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderpppResponse
     */
    public function createBusinessOrderpppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderpppResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderppp.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApiaCliCreateRequest $request
     * @return ApiaCliCreateResponse
     */
    public function apiaCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiaCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApiaCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiaCliCreateResponse
     */
    public function apiaCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApiaCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.apia", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApibCliCreateRequest $request
     * @return ApibCliCreateResponse
     */
    public function apibCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apibCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApibCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApibCliCreateResponse
     */
    public function apibCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApibCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.apib", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApicCliCreateRequest $request
     * @return ApicCliCreateResponse
     */
    public function apicCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apicCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApicCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApicCliCreateResponse
     */
    public function apicCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApicCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.apic", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApieCliCreateRequest $request
     * @return ApieCliCreateResponse
     */
    public function apieCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apieCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口A
     * Summary: cli创建测试接口A
     * @param ApieCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApieCliCreateResponse
     */
    public function apieCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApieCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.apie", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderaaaRequest $request
     * @return CreateBusinessOrderaaaResponse
     */
    public function createBusinessOrderaaa($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderaaaEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderaaaRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderaaaResponse
     */
    public function createBusinessOrderaaaEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderaaaResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderaaa.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderbbbRequest $request
     * @return CreateBusinessOrderbbbResponse
     */
    public function createBusinessOrderbbb($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderbbbEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderbbbRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderbbbResponse
     */
    public function createBusinessOrderbbbEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderbbbResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderbbb.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrdereeeRequest $request
     * @return CreateBusinessOrdereeeResponse
     */
    public function createBusinessOrdereee($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrdereeeEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrdereeeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrdereeeResponse
     */
    public function createBusinessOrdereeeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrdereeeResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.ordereee.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderdddRequest $request
     * @return CreateBusinessOrderdddResponse
     */
    public function createBusinessOrderddd($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderdddEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderdddRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderdddResponse
     */
    public function createBusinessOrderdddEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderdddResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderddd.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderabcRequest $request
     * @return CreateBusinessOrderabcResponse
     */
    public function createBusinessOrderabc($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderabcEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderabcRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderabcResponse
     */
    public function createBusinessOrderabcEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderabcResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderabc.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderfffRequest $request
     * @return CreateBusinessOrderfffResponse
     */
    public function createBusinessOrderfff($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderfffEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderfffRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderfffResponse
     */
    public function createBusinessOrderfffEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderfffResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderfff.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrdergggRequest $request
     * @return CreateBusinessOrdergggResponse
     */
    public function createBusinessOrderggg($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrdergggEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrdergggRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrdergggResponse
     */
    public function createBusinessOrdergggEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrdergggResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderggg.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderhRequest $request
     * @return CreateBusinessOrderhResponse
     */
    public function createBusinessOrderh($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderhEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderhRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderhResponse
     */
    public function createBusinessOrderhEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderhResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderh.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderiRequest $request
     * @return CreateBusinessOrderiResponse
     */
    public function createBusinessOrderi($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderiEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderiRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderiResponse
     */
    public function createBusinessOrderiEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderiResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderi.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderjRequest $request
     * @return CreateBusinessOrderjResponse
     */
    public function createBusinessOrderj($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderjEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderjRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderjResponse
     */
    public function createBusinessOrderjEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderjResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderj.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderkRequest $request
     * @return CreateBusinessOrderkResponse
     */
    public function createBusinessOrderk($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderkEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderkRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderkResponse
     */
    public function createBusinessOrderkEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderkResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderk.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderlRequest $request
     * @return CreateBusinessOrderlResponse
     */
    public function createBusinessOrderl($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderlEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderlRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderlResponse
     */
    public function createBusinessOrderlEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderlResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderl.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderoRequest $request
     * @return CreateBusinessOrderoResponse
     */
    public function createBusinessOrdero($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderoEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderoResponse
     */
    public function createBusinessOrderoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderoResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.ordero.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderrRequest $request
     * @return CreateBusinessOrderrResponse
     */
    public function createBusinessOrderr($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrderrEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrderrRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrderrResponse
     */
    public function createBusinessOrderrEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrderrResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orderr.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrdersRequest $request
     * @return CreateBusinessOrdersResponse
     */
    public function createBusinessOrders($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBusinessOrdersEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     * @param CreateBusinessOrdersRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBusinessOrdersResponse
     */
    public function createBusinessOrdersEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBusinessOrdersResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.business.orders.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口D
     * Summary: cli创建测试接口D
     * @param ApifCliCreateRequest $request
     * @return ApifCliCreateResponse
     */
    public function apifCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apifCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口D
     * Summary: cli创建测试接口D
     * @param ApifCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApifCliCreateResponse
     */
    public function apifCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApifCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.apif", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口G
     * Summary: cli创建测试接口G
     * @param ApigCliCreateRequest $request
     * @return ApigCliCreateResponse
     */
    public function apigCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apigCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口G
     * Summary: cli创建测试接口G
     * @param ApigCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApigCliCreateResponse
     */
    public function apigCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApigCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.apig", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口G
     * Summary: cli创建测试接口G
     * @param ApiCliCreateRequest $request
     * @return ApiCliCreateResponse
     */
    public function apiCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口G
     * Summary: cli创建测试接口G
     * @param ApiCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiCliCreateResponse
     */
    public function apiCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApiCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.api", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cli创建测试接口h
     * Summary: cli创建测试接口h
     * @param ApihCliCreateRequest $request
     * @return ApihCliCreateResponse
     */
    public function apihCliCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apihCliCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: cli创建测试接口h
     * Summary: cli创建测试接口h
     * @param ApihCliCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApihCliCreateResponse
     */
    public function apihCliCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApihCliCreateResponse::fromMap($this->doRequest("1.0", "antdigital.cliproduct.cli.create.apih", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
