<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AIOSPRODUCT;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\AIOSPRODUCT\Models\QueryGwdefaultChatstreamRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwdefaultChatstreamResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwdefaultChatRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwdefaultChatResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceChatstreamRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceChatstreamResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceChatRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceChatResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceProfilelatestRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceProfilelatestResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceProfiledetailRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceProfiledetailResponse;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceProfileRequest;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceProfileResponse;

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
            "ignoreSSL" => $runtime->ignoreSSL
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
                    "sdk_version" => "1.0.5",
                    "_prod_code" => "AIOSPRODUCT",
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
     * Description: AIOS GwDefault流式输出
     * Summary: AIOS GwDefault流式输出
     * @param QueryGwdefaultChatstreamRequest $request
     * @return QueryGwdefaultChatstreamResponse
     */
    public function queryGwdefaultChatstream($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwdefaultChatstreamEx($request, $headers, $runtime);
    }

    /**
     * Description: AIOS GwDefault流式输出
     * Summary: AIOS GwDefault流式输出
     * @param QueryGwdefaultChatstreamRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwdefaultChatstreamResponse
     */
    public function queryGwdefaultChatstreamEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwdefaultChatstreamResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwdefault.chatstream.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AIOS同步对话
     * Summary: AIOS同步对话
     * @param QueryGwdefaultChatRequest $request
     * @return QueryGwdefaultChatResponse
     */
    public function queryGwdefaultChat($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwdefaultChatEx($request, $headers, $runtime);
    }

    /**
     * Description: AIOS同步对话
     * Summary: AIOS同步对话
     * @param QueryGwdefaultChatRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwdefaultChatResponse
     */
    public function queryGwdefaultChatEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwdefaultChatResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwdefault.chat.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AIOS 少儿保险 流式对话
     * Summary: AIOS 少儿保险 流式对话
     * @param QueryGwchildinsuranceChatstreamRequest $request
     * @return QueryGwchildinsuranceChatstreamResponse
     */
    public function queryGwchildinsuranceChatstream($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceChatstreamEx($request, $headers, $runtime);
    }

    /**
     * Description: AIOS 少儿保险 流式对话
     * Summary: AIOS 少儿保险 流式对话
     * @param QueryGwchildinsuranceChatstreamRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceChatstreamResponse
     */
    public function queryGwchildinsuranceChatstreamEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceChatstreamResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.chatstream.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AIOS 少儿保险 非流式对话
     * Summary: AIOS 少儿保险 非流式对话
     * @param QueryGwchildinsuranceChatRequest $request
     * @return QueryGwchildinsuranceChatResponse
     */
    public function queryGwchildinsuranceChat($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceChatEx($request, $headers, $runtime);
    }

    /**
     * Description: AIOS 少儿保险 非流式对话
     * Summary: AIOS 少儿保险 非流式对话
     * @param QueryGwchildinsuranceChatRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceChatResponse
     */
    public function queryGwchildinsuranceChatEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceChatResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.chat.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 少儿保险最近档案查询
     * Summary: 少儿保险最近档案查询
     * @param QueryGwchildinsuranceProfilelatestRequest $request
     * @return QueryGwchildinsuranceProfilelatestResponse
     */
    public function queryGwchildinsuranceProfilelatest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceProfilelatestEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险最近档案查询
     * Summary: 少儿保险最近档案查询
     * @param QueryGwchildinsuranceProfilelatestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceProfilelatestResponse
     */
    public function queryGwchildinsuranceProfilelatestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceProfilelatestResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.profilelatest.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 少儿保险当前会话档案查询
     * Summary: 少儿保险当前会话档案查询
     * @param QueryGwchildinsuranceProfiledetailRequest $request
     * @return QueryGwchildinsuranceProfiledetailResponse
     */
    public function queryGwchildinsuranceProfiledetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceProfiledetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险当前会话档案查询
     * Summary: 少儿保险当前会话档案查询
     * @param QueryGwchildinsuranceProfiledetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceProfiledetailResponse
     */
    public function queryGwchildinsuranceProfiledetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceProfiledetailResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.profiledetail.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 少儿保险家庭与孩子档案保存
     * Summary: 少儿保险家庭与孩子档案保存
     * @param SaveGwchildinsuranceProfileRequest $request
     * @return SaveGwchildinsuranceProfileResponse
     */
    public function saveGwchildinsuranceProfile($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveGwchildinsuranceProfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险家庭与孩子档案保存
     * Summary: 少儿保险家庭与孩子档案保存
     * @param SaveGwchildinsuranceProfileRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveGwchildinsuranceProfileResponse
     */
    public function saveGwchildinsuranceProfileEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveGwchildinsuranceProfileResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.profile.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
