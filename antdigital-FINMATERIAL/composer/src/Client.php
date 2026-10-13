<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\FINMATERIAL\Models\QueryMcpGetcurtimeRequest;
use AntChain\FINMATERIAL\Models\QueryMcpGetcurtimeResponse;
use AntChain\FINMATERIAL\Models\QueryMcpAssetRequest;
use AntChain\FINMATERIAL\Models\QueryMcpAssetResponse;
use AntChain\FINMATERIAL\Models\QueryAntsearchSearchRequest;
use AntChain\FINMATERIAL\Models\QueryAntsearchSearchResponse;
use AntChain\FINMATERIAL\Models\QueryAntsearchFetchRequest;
use AntChain\FINMATERIAL\Models\QueryAntsearchFetchResponse;

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
            // 本次搜索的上下文信息
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
                    "sdk_version" => "1.0.12",
                    "_prod_code" => "FINMATERIAL",
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
     * Description: 获取当前时间
     * Summary: 获取当前时间
     * @param QueryMcpGetcurtimeRequest $request
     * @return QueryMcpGetcurtimeResponse
     */
    public function queryMcpGetcurtime($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMcpGetcurtimeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前时间
     * Summary: 获取当前时间
     * @param QueryMcpGetcurtimeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMcpGetcurtimeResponse
     */
    public function queryMcpGetcurtimeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMcpGetcurtimeResponse::fromMap($this->doRequest("1.0", "antdigital.finmaterial.mcp.getcurtime.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询板块信息
     * Summary: 查询板块信息
     * @param QueryMcpAssetRequest $request
     * @return QueryMcpAssetResponse
     */
    public function queryMcpAsset($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMcpAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询板块信息
     * Summary: 查询板块信息
     * @param QueryMcpAssetRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMcpAssetResponse
     */
    public function queryMcpAssetEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMcpAssetResponse::fromMap($this->doRequest("1.0", "antdigital.finmaterial.mcp.asset.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全网搜主搜接口
     * Summary: 全网搜主搜接口
     * @param QueryAntsearchSearchRequest $request
     * @return QueryAntsearchSearchResponse
     */
    public function queryAntsearchSearch($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntsearchSearchEx($request, $headers, $runtime);
    }

    /**
     * Description: 全网搜主搜接口
     * Summary: 全网搜主搜接口
     * @param QueryAntsearchSearchRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntsearchSearchResponse
     */
    public function queryAntsearchSearchEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntsearchSearchResponse::fromMap($this->doRequest("1.0", "antdigital.finmaterial.antsearch.search.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
     * Summary: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
     * @param QueryAntsearchFetchRequest $request
     * @return QueryAntsearchFetchResponse
     */
    public function queryAntsearchFetch($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntsearchFetchEx($request, $headers, $runtime);
    }

    /**
     * Description: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
     * Summary: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
     * @param QueryAntsearchFetchRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntsearchFetchResponse
     */
    public function queryAntsearchFetchEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntsearchFetchResponse::fromMap($this->doRequest("1.0", "antdigital.finmaterial.antsearch.fetch.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
