<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentChatCreativeRequest;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentChatCreativeResponse;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentCreativeChatRequest;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentCreativeChatResponse;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeResultRequest;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeResultResponse;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentTaskCreditRequest;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentTaskCreditResponse;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeMaterialRequest;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeMaterialResponse;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentCreativeVideoRequest;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentCreativeVideoResponse;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeVideoRequest;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeVideoResponse;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentCreativeImageeditRequest;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentCreativeImageeditResponse;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeImageeditRequest;
use AntChain\CREATIVERENDER\Models\QueryAntcloudMarketingagentCreativeImageeditResponse;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentFileUploadRequest;
use AntChain\CREATIVERENDER\Models\ExecAntcloudMarketingagentFileUploadResponse;
use AntChain\CREATIVERENDER\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\CREATIVERENDER\Models\CreateAntcloudGatewayxFileUploadResponse;

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
            // DataPart represents a structured blob.
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
                    "sdk_version" => "2.1.3",
                    "_prod_code" => "CREATIVERENDER",
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
     * Description: 创意素材中心chat生图接口
     * Summary: 创意素材中心chat生图接口
     * @param ExecAntcloudMarketingagentChatCreativeRequest $request
     * @return ExecAntcloudMarketingagentChatCreativeResponse
     */
    public function execAntcloudMarketingagentChatCreative($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execAntcloudMarketingagentChatCreativeEx($request, $headers, $runtime);
    }

    /**
     * Description: 创意素材中心chat生图接口
     * Summary: 创意素材中心chat生图接口
     * @param ExecAntcloudMarketingagentChatCreativeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecAntcloudMarketingagentChatCreativeResponse
     */
    public function execAntcloudMarketingagentChatCreativeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecAntcloudMarketingagentChatCreativeResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.chat.creative.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创意素材chat接口
     * Summary: 创意素材chat接口
     * @param ExecAntcloudMarketingagentCreativeChatRequest $request
     * @return ExecAntcloudMarketingagentCreativeChatResponse
     */
    public function execAntcloudMarketingagentCreativeChat($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execAntcloudMarketingagentCreativeChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 创意素材chat接口
     * Summary: 创意素材chat接口
     * @param ExecAntcloudMarketingagentCreativeChatRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecAntcloudMarketingagentCreativeChatResponse
     */
    public function execAntcloudMarketingagentCreativeChatEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecAntcloudMarketingagentCreativeChatResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.creative.chat.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: chat结果查询接口
     * Summary: chat结果查询接口
     * @param QueryAntcloudMarketingagentCreativeResultRequest $request
     * @return QueryAntcloudMarketingagentCreativeResultResponse
     */
    public function queryAntcloudMarketingagentCreativeResult($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudMarketingagentCreativeResultEx($request, $headers, $runtime);
    }

    /**
     * Description: chat结果查询接口
     * Summary: chat结果查询接口
     * @param QueryAntcloudMarketingagentCreativeResultRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudMarketingagentCreativeResultResponse
     */
    public function queryAntcloudMarketingagentCreativeResultEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudMarketingagentCreativeResultResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.creative.result.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: credit查询
     * Summary: credit查询
     * @param QueryAntcloudMarketingagentTaskCreditRequest $request
     * @return QueryAntcloudMarketingagentTaskCreditResponse
     */
    public function queryAntcloudMarketingagentTaskCredit($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudMarketingagentTaskCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: credit查询
     * Summary: credit查询
     * @param QueryAntcloudMarketingagentTaskCreditRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudMarketingagentTaskCreditResponse
     */
    public function queryAntcloudMarketingagentTaskCreditEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudMarketingagentTaskCreditResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.task.credit.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 素材查询接口
     * Summary: 素材查询接口
     * @param QueryAntcloudMarketingagentCreativeMaterialRequest $request
     * @return QueryAntcloudMarketingagentCreativeMaterialResponse
     */
    public function queryAntcloudMarketingagentCreativeMaterial($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudMarketingagentCreativeMaterialEx($request, $headers, $runtime);
    }

    /**
     * Description: 素材查询接口
     * Summary: 素材查询接口
     * @param QueryAntcloudMarketingagentCreativeMaterialRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudMarketingagentCreativeMaterialResponse
     */
    public function queryAntcloudMarketingagentCreativeMaterialEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudMarketingagentCreativeMaterialResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.creative.material.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI视频生成接口
     * Summary: AI视频生成接口
     * @param ExecAntcloudMarketingagentCreativeVideoRequest $request
     * @return ExecAntcloudMarketingagentCreativeVideoResponse
     */
    public function execAntcloudMarketingagentCreativeVideo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execAntcloudMarketingagentCreativeVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: AI视频生成接口
     * Summary: AI视频生成接口
     * @param ExecAntcloudMarketingagentCreativeVideoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecAntcloudMarketingagentCreativeVideoResponse
     */
    public function execAntcloudMarketingagentCreativeVideoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecAntcloudMarketingagentCreativeVideoResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.creative.video.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频任务查询接口
     * Summary: 视频任务查询接口
     * @param QueryAntcloudMarketingagentCreativeVideoRequest $request
     * @return QueryAntcloudMarketingagentCreativeVideoResponse
     */
    public function queryAntcloudMarketingagentCreativeVideo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudMarketingagentCreativeVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频任务查询接口
     * Summary: 视频任务查询接口
     * @param QueryAntcloudMarketingagentCreativeVideoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudMarketingagentCreativeVideoResponse
     */
    public function queryAntcloudMarketingagentCreativeVideoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudMarketingagentCreativeVideoResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.creative.video.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
     * Summary: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
     * @param ExecAntcloudMarketingagentCreativeImageeditRequest $request
     * @return ExecAntcloudMarketingagentCreativeImageeditResponse
     */
    public function execAntcloudMarketingagentCreativeImageedit($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execAntcloudMarketingagentCreativeImageeditEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
     * Summary: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
     * @param ExecAntcloudMarketingagentCreativeImageeditRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecAntcloudMarketingagentCreativeImageeditResponse
     */
    public function execAntcloudMarketingagentCreativeImageeditEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecAntcloudMarketingagentCreativeImageeditResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.creative.imageedit.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
     * Summary: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
     * @param QueryAntcloudMarketingagentCreativeImageeditRequest $request
     * @return QueryAntcloudMarketingagentCreativeImageeditResponse
     */
    public function queryAntcloudMarketingagentCreativeImageedit($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntcloudMarketingagentCreativeImageeditEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
     * Summary: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
     * @param QueryAntcloudMarketingagentCreativeImageeditRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntcloudMarketingagentCreativeImageeditResponse
     */
    public function queryAntcloudMarketingagentCreativeImageeditEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntcloudMarketingagentCreativeImageeditResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.creative.imageedit.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
     * Summary: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
     * @param ExecAntcloudMarketingagentFileUploadRequest $request
     * @return ExecAntcloudMarketingagentFileUploadResponse
     */
    public function execAntcloudMarketingagentFileUpload($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execAntcloudMarketingagentFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
     * Summary: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
     * @param ExecAntcloudMarketingagentFileUploadRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecAntcloudMarketingagentFileUploadResponse
     */
    public function execAntcloudMarketingagentFileUploadEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antcloud.marketingagent.file.upload.exec",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $execAntcloudMarketingagentFileUploadResponse = new ExecAntcloudMarketingagentFileUploadResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $execAntcloudMarketingagentFileUploadResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return ExecAntcloudMarketingagentFileUploadResponse::fromMap($this->doRequest("1.0", "antcloud.marketingagent.file.upload.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
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
