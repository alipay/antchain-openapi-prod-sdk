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
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceSolutionkycdetailRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceSolutionkycdetailResponse;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceSolutionkycRequest;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceSolutionkycResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwmcpdefaultChatRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwmcpdefaultChatResponse;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsurancePlanningtargetsRequest;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsurancePlanningtargetsResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsurancePlanningtargetsRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsurancePlanningtargetsResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsurancePlanningtargetslatestRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsurancePlanningtargetslatestResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceRecommendationplandetailRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceRecommendationplandetailResponse;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceRecommendationplanadjustRequest;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceRecommendationplanadjustResponse;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceRecommendationplanconfirmRequest;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceRecommendationplanconfirmResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceRecommendationplanhistoryRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceRecommendationplanhistoryResponse;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceActivetargetRequest;
use AntChain\AIOSPRODUCT\Models\SaveGwchildinsuranceActivetargetResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceActivetargetRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceActivetargetResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceRecommendationcandidateRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceRecommendationcandidateResponse;
use AntChain\AIOSPRODUCT\Models\ResetGwchildinsuranceRecommendationcandidateRequest;
use AntChain\AIOSPRODUCT\Models\ResetGwchildinsuranceRecommendationcandidateResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductlistRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductlistResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductdetailRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductdetailResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductlistidsRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductlistidsResponse;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductbyidsRequest;
use AntChain\AIOSPRODUCT\Models\QueryGwchildinsuranceCompareproductbyidsResponse;
use AntChain\AIOSPRODUCT\Models\DetailGwchildinsuranceOptionalresponsibilityplanRequest;
use AntChain\AIOSPRODUCT\Models\DetailGwchildinsuranceOptionalresponsibilityplanResponse;
use AntChain\AIOSPRODUCT\Models\ResolveGwchildinsuranceOptionalresponsibilityplanRequest;
use AntChain\AIOSPRODUCT\Models\ResolveGwchildinsuranceOptionalresponsibilityplanResponse;

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
                    "sdk_version" => "1.0.16",
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

    /**
     * Description: 少儿保险 KYC 查询
     * Summary: 少儿保险 KYC 查询
     * @param QueryGwchildinsuranceSolutionkycdetailRequest $request
     * @return QueryGwchildinsuranceSolutionkycdetailResponse
     */
    public function queryGwchildinsuranceSolutionkycdetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceSolutionkycdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险 KYC 查询
     * Summary: 少儿保险 KYC 查询
     * @param QueryGwchildinsuranceSolutionkycdetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceSolutionkycdetailResponse
     */
    public function queryGwchildinsuranceSolutionkycdetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceSolutionkycdetailResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.solutionkycdetail.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 少儿保险 KYC 保存
     * Summary: 少儿保险 KYC 保存
     * @param SaveGwchildinsuranceSolutionkycRequest $request
     * @return SaveGwchildinsuranceSolutionkycResponse
     */
    public function saveGwchildinsuranceSolutionkyc($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveGwchildinsuranceSolutionkycEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险 KYC 保存
     * Summary: 少儿保险 KYC 保存
     * @param SaveGwchildinsuranceSolutionkycRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveGwchildinsuranceSolutionkycResponse
     */
    public function saveGwchildinsuranceSolutionkycEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveGwchildinsuranceSolutionkycResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.solutionkyc.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: mcp网关调用
     * Summary: mcp网关调用
     * @param QueryGwmcpdefaultChatRequest $request
     * @return QueryGwmcpdefaultChatResponse
     */
    public function queryGwmcpdefaultChat($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwmcpdefaultChatEx($request, $headers, $runtime);
    }

    /**
     * Description: mcp网关调用
     * Summary: mcp网关调用
     * @param QueryGwmcpdefaultChatRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwmcpdefaultChatResponse
     */
    public function queryGwmcpdefaultChatEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwmcpdefaultChatResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwmcpdefault.chat.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
     * Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
     * @param SaveGwchildinsurancePlanningtargetsRequest $request
     * @return SaveGwchildinsurancePlanningtargetsResponse
     */
    public function saveGwchildinsurancePlanningtargets($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveGwchildinsurancePlanningtargetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
     * Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
     * @param SaveGwchildinsurancePlanningtargetsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveGwchildinsurancePlanningtargetsResponse
     */
    public function saveGwchildinsurancePlanningtargetsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveGwchildinsurancePlanningtargetsResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.planningtargets.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定用户和会话当前生效的少儿保险规划目标。
     * Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
     * @param QueryGwchildinsurancePlanningtargetsRequest $request
     * @return QueryGwchildinsurancePlanningtargetsResponse
     */
    public function queryGwchildinsurancePlanningtargets($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsurancePlanningtargetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定用户和会话当前生效的少儿保险规划目标。
     * Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
     * @param QueryGwchildinsurancePlanningtargetsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsurancePlanningtargetsResponse
     */
    public function queryGwchildinsurancePlanningtargetsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsurancePlanningtargetsResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.planningtargets.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询最近选择的孩子
     * Summary: 查询最近选择的孩子
     * @param QueryGwchildinsurancePlanningtargetslatestRequest $request
     * @return QueryGwchildinsurancePlanningtargetslatestResponse
     */
    public function queryGwchildinsurancePlanningtargetslatest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsurancePlanningtargetslatestEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询最近选择的孩子
     * Summary: 查询最近选择的孩子
     * @param QueryGwchildinsurancePlanningtargetslatestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsurancePlanningtargetslatestResponse
     */
    public function queryGwchildinsurancePlanningtargetslatestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsurancePlanningtargetslatestResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.planningtargetslatest.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询推荐方案详情
     * Summary: 查询推荐方案详情
     * @param QueryGwchildinsuranceRecommendationplandetailRequest $request
     * @return QueryGwchildinsuranceRecommendationplandetailResponse
     */
    public function queryGwchildinsuranceRecommendationplandetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceRecommendationplandetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询推荐方案详情
     * Summary: 查询推荐方案详情
     * @param QueryGwchildinsuranceRecommendationplandetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceRecommendationplandetailResponse
     */
    public function queryGwchildinsuranceRecommendationplandetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceRecommendationplandetailResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplandetail.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存H5调整后的方案版本
     * Summary: 保存H5调整后的方案版本
     * @param SaveGwchildinsuranceRecommendationplanadjustRequest $request
     * @return SaveGwchildinsuranceRecommendationplanadjustResponse
     */
    public function saveGwchildinsuranceRecommendationplanadjust($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveGwchildinsuranceRecommendationplanadjustEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存H5调整后的方案版本
     * Summary: 保存H5调整后的方案版本
     * @param SaveGwchildinsuranceRecommendationplanadjustRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveGwchildinsuranceRecommendationplanadjustResponse
     */
    public function saveGwchildinsuranceRecommendationplanadjustEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveGwchildinsuranceRecommendationplanadjustResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplanadjust.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认方案及最终价格
     * Summary: 确认方案及最终价格
     * @param SaveGwchildinsuranceRecommendationplanconfirmRequest $request
     * @return SaveGwchildinsuranceRecommendationplanconfirmResponse
     */
    public function saveGwchildinsuranceRecommendationplanconfirm($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveGwchildinsuranceRecommendationplanconfirmEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认方案及最终价格
     * Summary: 确认方案及最终价格
     * @param SaveGwchildinsuranceRecommendationplanconfirmRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveGwchildinsuranceRecommendationplanconfirmResponse
     */
    public function saveGwchildinsuranceRecommendationplanconfirmEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveGwchildinsuranceRecommendationplanconfirmResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplanconfirm.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询历史推荐方案
     * Summary: 查询历史推荐方案
     * @param QueryGwchildinsuranceRecommendationplanhistoryRequest $request
     * @return QueryGwchildinsuranceRecommendationplanhistoryResponse
     */
    public function queryGwchildinsuranceRecommendationplanhistory($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceRecommendationplanhistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询历史推荐方案
     * Summary: 查询历史推荐方案
     * @param QueryGwchildinsuranceRecommendationplanhistoryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceRecommendationplanhistoryResponse
     */
    public function queryGwchildinsuranceRecommendationplanhistoryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceRecommendationplanhistoryResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplanhistory.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 少儿保险当前孩子设置
     * Summary: 少儿保险当前孩子设置
     * @param SaveGwchildinsuranceActivetargetRequest $request
     * @return SaveGwchildinsuranceActivetargetResponse
     */
    public function saveGwchildinsuranceActivetarget($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveGwchildinsuranceActivetargetEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险当前孩子设置
     * Summary: 少儿保险当前孩子设置
     * @param SaveGwchildinsuranceActivetargetRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveGwchildinsuranceActivetargetResponse
     */
    public function saveGwchildinsuranceActivetargetEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveGwchildinsuranceActivetargetResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.activetarget.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 少儿保险当前孩子查询
     * Summary: 少儿保险当前孩子查询
     * @param QueryGwchildinsuranceActivetargetRequest $request
     * @return QueryGwchildinsuranceActivetargetResponse
     */
    public function queryGwchildinsuranceActivetarget($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceActivetargetEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险当前孩子查询
     * Summary: 少儿保险当前孩子查询
     * @param QueryGwchildinsuranceActivetargetRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceActivetargetResponse
     */
    public function queryGwchildinsuranceActivetargetEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceActivetargetResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.activetarget.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 少儿保险推荐候选详情查询
     * Summary: 少儿保险推荐候选详情查询
     * @param QueryGwchildinsuranceRecommendationcandidateRequest $request
     * @return QueryGwchildinsuranceRecommendationcandidateResponse
     */
    public function queryGwchildinsuranceRecommendationcandidate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceRecommendationcandidateEx($request, $headers, $runtime);
    }

    /**
     * Description: 少儿保险推荐候选详情查询
     * Summary: 少儿保险推荐候选详情查询
     * @param QueryGwchildinsuranceRecommendationcandidateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceRecommendationcandidateResponse
     */
    public function queryGwchildinsuranceRecommendationcandidateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceRecommendationcandidateResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 选择预览
     * Summary: 选择预览
     * @param ResetGwchildinsuranceRecommendationcandidateRequest $request
     * @return ResetGwchildinsuranceRecommendationcandidateResponse
     */
    public function resetGwchildinsuranceRecommendationcandidate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->resetGwchildinsuranceRecommendationcandidateEx($request, $headers, $runtime);
    }

    /**
     * Description: 选择预览
     * Summary: 选择预览
     * @param ResetGwchildinsuranceRecommendationcandidateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ResetGwchildinsuranceRecommendationcandidateResponse
     */
    public function resetGwchildinsuranceRecommendationcandidateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ResetGwchildinsuranceRecommendationcandidateResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.reset", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品对比列表查询
     * Summary: 商品对比列表查询
     * @param QueryGwchildinsuranceCompareproductlistRequest $request
     * @return QueryGwchildinsuranceCompareproductlistResponse
     */
    public function queryGwchildinsuranceCompareproductlist($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceCompareproductlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品对比列表查询
     * Summary: 商品对比列表查询
     * @param QueryGwchildinsuranceCompareproductlistRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceCompareproductlistResponse
     */
    public function queryGwchildinsuranceCompareproductlistEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceCompareproductlistResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductlist.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品对比详情查询
     * Summary: 商品对比详情查询
     * @param QueryGwchildinsuranceCompareproductdetailRequest $request
     * @return QueryGwchildinsuranceCompareproductdetailResponse
     */
    public function queryGwchildinsuranceCompareproductdetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceCompareproductdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品对比详情查询
     * Summary: 商品对比详情查询
     * @param QueryGwchildinsuranceCompareproductdetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceCompareproductdetailResponse
     */
    public function queryGwchildinsuranceCompareproductdetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceCompareproductdetailResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductdetail.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 产品对比 ID 列表查询
     * Summary: 产品对比 ID 列表查询
     * @param QueryGwchildinsuranceCompareproductlistidsRequest $request
     * @return QueryGwchildinsuranceCompareproductlistidsResponse
     */
    public function queryGwchildinsuranceCompareproductlistids($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceCompareproductlistidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 产品对比 ID 列表查询
     * Summary: 产品对比 ID 列表查询
     * @param QueryGwchildinsuranceCompareproductlistidsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceCompareproductlistidsResponse
     */
    public function queryGwchildinsuranceCompareproductlistidsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceCompareproductlistidsResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductlistids.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按 ID 获取产品对比数据
     * Summary: 按 ID 获取产品对比数据
     * @param QueryGwchildinsuranceCompareproductbyidsRequest $request
     * @return QueryGwchildinsuranceCompareproductbyidsResponse
     */
    public function queryGwchildinsuranceCompareproductbyids($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGwchildinsuranceCompareproductbyidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 按 ID 获取产品对比数据
     * Summary: 按 ID 获取产品对比数据
     * @param QueryGwchildinsuranceCompareproductbyidsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGwchildinsuranceCompareproductbyidsResponse
     */
    public function queryGwchildinsuranceCompareproductbyidsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGwchildinsuranceCompareproductbyidsResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductbyids.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可选责任计划详情查询
     * Summary: 可选责任计划详情查询
     * @param DetailGwchildinsuranceOptionalresponsibilityplanRequest $request
     * @return DetailGwchildinsuranceOptionalresponsibilityplanResponse
     */
    public function detailGwchildinsuranceOptionalresponsibilityplan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->detailGwchildinsuranceOptionalresponsibilityplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 可选责任计划详情查询
     * Summary: 可选责任计划详情查询
     * @param DetailGwchildinsuranceOptionalresponsibilityplanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DetailGwchildinsuranceOptionalresponsibilityplanResponse
     */
    public function detailGwchildinsuranceOptionalresponsibilityplanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DetailGwchildinsuranceOptionalresponsibilityplanResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.detail", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可选责任计划按因子反查
     * Summary: 可选责任计划按因子反查
     * @param ResolveGwchildinsuranceOptionalresponsibilityplanRequest $request
     * @return ResolveGwchildinsuranceOptionalresponsibilityplanResponse
     */
    public function resolveGwchildinsuranceOptionalresponsibilityplan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->resolveGwchildinsuranceOptionalresponsibilityplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 可选责任计划按因子反查
     * Summary: 可选责任计划按因子反查
     * @param ResolveGwchildinsuranceOptionalresponsibilityplanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ResolveGwchildinsuranceOptionalresponsibilityplanResponse
     */
    public function resolveGwchildinsuranceOptionalresponsibilityplanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ResolveGwchildinsuranceOptionalresponsibilityplanResponse::fromMap($this->doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.resolve", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
