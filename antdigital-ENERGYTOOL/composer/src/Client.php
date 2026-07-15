<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ENERGYTOOL\Models\QueryRealtimePriceforecastRequest;
use AntChain\ENERGYTOOL\Models\QueryRealtimePriceforecastResponse;
use AntChain\ENERGYTOOL\Models\QueryBiddingspaceRequest;
use AntChain\ENERGYTOOL\Models\QueryBiddingspaceResponse;
use AntChain\ENERGYTOOL\Models\QuerySimilardayRequest;
use AntChain\ENERGYTOOL\Models\QuerySimilardayResponse;
use AntChain\ENERGYTOOL\Models\QueryAheadrealtimePricecompareRequest;
use AntChain\ENERGYTOOL\Models\QueryAheadrealtimePricecompareResponse;
use AntChain\ENERGYTOOL\Models\QueryAheadrealtimePricediffpredictionRequest;
use AntChain\ENERGYTOOL\Models\QueryAheadrealtimePricediffpredictionResponse;
use AntChain\ENERGYTOOL\Models\QueryWeatherWarningRequest;
use AntChain\ENERGYTOOL\Models\QueryWeatherWarningResponse;
use AntChain\ENERGYTOOL\Models\QueryKmVersionRequest;
use AntChain\ENERGYTOOL\Models\QueryKmVersionResponse;
use AntChain\ENERGYTOOL\Models\SyncKmVersionRequest;
use AntChain\ENERGYTOOL\Models\SyncKmVersionResponse;
use AntChain\ENERGYTOOL\Models\SyncKmDocumentRequest;
use AntChain\ENERGYTOOL\Models\SyncKmDocumentResponse;
use AntChain\ENERGYTOOL\Models\QueryKmRagRequest;
use AntChain\ENERGYTOOL\Models\QueryKmRagResponse;
use AntChain\ENERGYTOOL\Models\QueryPanoraindexPolicyRequest;
use AntChain\ENERGYTOOL\Models\QueryPanoraindexPolicyResponse;
use AntChain\ENERGYTOOL\Models\QueryTraderesultRequest;
use AntChain\ENERGYTOOL\Models\QueryTraderesultResponse;
use AntChain\ENERGYTOOL\Models\QueryElectricMarketpriceRequest;
use AntChain\ENERGYTOOL\Models\QueryElectricMarketpriceResponse;

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
            // 文档切片信息
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
                    "sdk_version" => "1.1.2",
                    "_prod_code" => "ENERGYTOOL",
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
     * Description: 电力交易实时电价预测服务
     * Summary: 电力交易实时电价预测服务
     * @param QueryRealtimePriceforecastRequest $request
     * @return QueryRealtimePriceforecastResponse
     */
    public function queryRealtimePriceforecast($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRealtimePriceforecastEx($request, $headers, $runtime);
    }

    /**
     * Description: 电力交易实时电价预测服务
     * Summary: 电力交易实时电价预测服务
     * @param QueryRealtimePriceforecastRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRealtimePriceforecastResponse
     */
    public function queryRealtimePriceforecastEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRealtimePriceforecastResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.realtime.priceforecast.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电力交易竞价空间分析
     * Summary: 电力交易竞价空间分析
     * @param QueryBiddingspaceRequest $request
     * @return QueryBiddingspaceResponse
     */
    public function queryBiddingspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBiddingspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 电力交易竞价空间分析
     * Summary: 电力交易竞价空间分析
     * @param QueryBiddingspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBiddingspaceResponse
     */
    public function queryBiddingspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBiddingspaceResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.biddingspace.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电力交易相似日竞价空间分析
     * Summary: 电力交易相似日竞价空间分析
     * @param QuerySimilardayRequest $request
     * @return QuerySimilardayResponse
     */
    public function querySimilarday($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->querySimilardayEx($request, $headers, $runtime);
    }

    /**
     * Description: 电力交易相似日竞价空间分析
     * Summary: 电力交易相似日竞价空间分析
     * @param QuerySimilardayRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QuerySimilardayResponse
     */
    public function querySimilardayEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QuerySimilardayResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.similarday.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电力交易日前实时电价对比分析
     * Summary: 电力交易日前实时电价对比分析
     * @param QueryAheadrealtimePricecompareRequest $request
     * @return QueryAheadrealtimePricecompareResponse
     */
    public function queryAheadrealtimePricecompare($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAheadrealtimePricecompareEx($request, $headers, $runtime);
    }

    /**
     * Description: 电力交易日前实时电价对比分析
     * Summary: 电力交易日前实时电价对比分析
     * @param QueryAheadrealtimePricecompareRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAheadrealtimePricecompareResponse
     */
    public function queryAheadrealtimePricecompareEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAheadrealtimePricecompareResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.aheadrealtime.pricecompare.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电力交易日前与实时价差预测
     * Summary: 电力交易日前与实时价差预测
     * @param QueryAheadrealtimePricediffpredictionRequest $request
     * @return QueryAheadrealtimePricediffpredictionResponse
     */
    public function queryAheadrealtimePricediffprediction($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAheadrealtimePricediffpredictionEx($request, $headers, $runtime);
    }

    /**
     * Description: 电力交易日前与实时价差预测
     * Summary: 电力交易日前与实时价差预测
     * @param QueryAheadrealtimePricediffpredictionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAheadrealtimePricediffpredictionResponse
     */
    public function queryAheadrealtimePricediffpredictionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAheadrealtimePricediffpredictionResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.aheadrealtime.pricediffprediction.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 气象预警信息查询
     * Summary: 气象预警信息查询
     * @param QueryWeatherWarningRequest $request
     * @return QueryWeatherWarningResponse
     */
    public function queryWeatherWarning($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryWeatherWarningEx($request, $headers, $runtime);
    }

    /**
     * Description: 气象预警信息查询
     * Summary: 气象预警信息查询
     * @param QueryWeatherWarningRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryWeatherWarningResponse
     */
    public function queryWeatherWarningEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryWeatherWarningResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.weather.warning.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识版本查询
     * Summary: 知识版本查询
     * @param QueryKmVersionRequest $request
     * @return QueryKmVersionResponse
     */
    public function queryKmVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryKmVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识版本查询
     * Summary: 知识版本查询
     * @param QueryKmVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryKmVersionResponse
     */
    public function queryKmVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryKmVersionResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.km.version.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步版本内容详情
     * Summary: 同步版本内容详情
     * @param SyncKmVersionRequest $request
     * @return SyncKmVersionResponse
     */
    public function syncKmVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->syncKmVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步版本内容详情
     * Summary: 同步版本内容详情
     * @param SyncKmVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SyncKmVersionResponse
     */
    public function syncKmVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SyncKmVersionResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.km.version.sync", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取文档详情
     * Summary: 获取文档详情
     * @param SyncKmDocumentRequest $request
     * @return SyncKmDocumentResponse
     */
    public function syncKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->syncKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取文档详情
     * Summary: 获取文档详情
     * @param SyncKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SyncKmDocumentResponse
     */
    public function syncKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SyncKmDocumentResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.km.document.sync", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识图谱对外开放rag检索
     * Summary: 知识图谱对外开放rag检索
     * @param QueryKmRagRequest $request
     * @return QueryKmRagResponse
     */
    public function queryKmRag($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryKmRagEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识图谱对外开放rag检索
     * Summary: 知识图谱对外开放rag检索
     * @param QueryKmRagRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryKmRagResponse
     */
    public function queryKmRagEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryKmRagResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.km.rag.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 能源数采对外开放api
     * Summary: 能源数采对外开放api
     * @param QueryPanoraindexPolicyRequest $request
     * @return QueryPanoraindexPolicyResponse
     */
    public function queryPanoraindexPolicy($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryPanoraindexPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 能源数采对外开放api
     * Summary: 能源数采对外开放api
     * @param QueryPanoraindexPolicyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryPanoraindexPolicyResponse
     */
    public function queryPanoraindexPolicyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryPanoraindexPolicyResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.panoraindex.policy.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 虚拟交易团队接入appaccesscenter
     * Summary: 虚拟交易团队接入appaccesscenter
     * @param QueryTraderesultRequest $request
     * @return QueryTraderesultResponse
     */
    public function queryTraderesult($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryTraderesultEx($request, $headers, $runtime);
    }

    /**
     * Description: 虚拟交易团队接入appaccesscenter
     * Summary: 虚拟交易团队接入appaccesscenter
     * @param QueryTraderesultRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryTraderesultResponse
     */
    public function queryTraderesultEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryTraderesultResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.traderesult.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电力行情主数据接口
     * Summary: 电力行情主数据接口
     * @param QueryElectricMarketpriceRequest $request
     * @return QueryElectricMarketpriceResponse
     */
    public function queryElectricMarketprice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryElectricMarketpriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 电力行情主数据接口
     * Summary: 电力行情主数据接口
     * @param QueryElectricMarketpriceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryElectricMarketpriceResponse
     */
    public function queryElectricMarketpriceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryElectricMarketpriceResponse::fromMap($this->doRequest("1.0", "antcloud.energytool.electric.marketprice.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
