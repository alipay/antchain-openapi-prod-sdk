<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentUseridsRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentUseridsResponse;
use AntChain\IOTAGENT\Models\TestBlockchainBotIotagentPluginRequest;
use AntChain\IOTAGENT\Models\TestBlockchainBotIotagentPluginResponse;
use AntChain\IOTAGENT\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIoaAgentRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIoaAgentResponse;
use AntChain\IOTAGENT\Models\SaveBlockchainBotIoaAgentRequest;
use AntChain\IOTAGENT\Models\SaveBlockchainBotIoaAgentResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIoaTemplatesRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIoaTemplatesResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotAgentchatHistoryRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotAgentchatHistoryResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotAgentSessionsRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotAgentSessionsResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentAideviceRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentAideviceResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentThingmodelrangeRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentThingmodelrangeResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentThingmodeldataRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentThingmodeldataResponse;
use AntChain\IOTAGENT\Models\GetsignurlBlockchainBotIotagentPlugincontractRequest;
use AntChain\IOTAGENT\Models\GetsignurlBlockchainBotIotagentPlugincontractResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentPlugincontractRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentPlugincontractResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentUseridRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentUseridResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentFeatureRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentFeatureResponse;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotagentAgentRequest;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotagentAgentResponse;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotagentAgentRequest;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotagentAgentResponse;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotagentAgentRequest;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotagentAgentResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentAgentRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentAgentResponse;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotagentAgentteamRequest;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotagentAgentteamResponse;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotagentAgentteamRequest;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotagentAgentteamResponse;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotagentAgentRequest;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotagentAgentResponse;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\RenameBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\RenameBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\HistoryBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\HistoryBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\ChatBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\ChatBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\InterruptBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\InterruptBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\PushBlockchainBotIotagentMessageRequest;
use AntChain\IOTAGENT\Models\PushBlockchainBotIotagentMessageResponse;
use AntChain\IOTAGENT\Models\QuerypushstatusBlockchainBotIotagentMessageRequest;
use AntChain\IOTAGENT\Models\QuerypushstatusBlockchainBotIotagentMessageResponse;
use AntChain\IOTAGENT\Models\ListfilesBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\ListfilesBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\FliedownloadBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\FliedownloadBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\FilepreviewBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\FilepreviewBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\PushBlockchainBotIotagentAudioscribeRequest;
use AntChain\IOTAGENT\Models\PushBlockchainBotIotagentAudioscribeResponse;
use AntChain\IOTAGENT\Models\ExecBlockchainBotIotagentPluginRequest;
use AntChain\IOTAGENT\Models\ExecBlockchainBotIotagentPluginResponse;
use AntChain\IOTAGENT\Models\PushBlockchainBotIotagentWorkspaceRequest;
use AntChain\IOTAGENT\Models\PushBlockchainBotIotagentWorkspaceResponse;
use AntChain\IOTAGENT\Models\ConfirmBlockchainBotIotagentWorkspaceRequest;
use AntChain\IOTAGENT\Models\ConfirmBlockchainBotIotagentWorkspaceResponse;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\LoginurlBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\LoginurlBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\PlayhistoryBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\PlayhistoryBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\FavoritesBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\FavoritesBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\LyricsBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\LyricsBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\LikeBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\LikeBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\LogoutBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\LogoutBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\CreateAntcloudGatewayxFileUploadResponse;

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
            // 版本范围边界定义
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
                    "sdk_version" => "1.2.14",
                    "_prod_code" => "IOTAGENT",
                    "_prod_channel" => "undefined"
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
     * Description: 查询租户下的userid
     * Summary: 查询租户下的userid
     * @param QueryBlockchainBotIotagentUseridsRequest $request
     * @return QueryBlockchainBotIotagentUseridsResponse
     */
    public function queryBlockchainBotIotagentUserids($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentUseridsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户下的userid
     * Summary: 查询租户下的userid
     * @param QueryBlockchainBotIotagentUseridsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentUseridsResponse
     */
    public function queryBlockchainBotIotagentUseridsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentUseridsResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.userids.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试用
     * Summary: 测试用
     * @param TestBlockchainBotIotagentPluginRequest $request
     * @return TestBlockchainBotIotagentPluginResponse
     */
    public function testBlockchainBotIotagentPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->testBlockchainBotIotagentPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试用
     * Summary: 测试用
     * @param TestBlockchainBotIotagentPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return TestBlockchainBotIotagentPluginResponse
     */
    public function testBlockchainBotIotagentPluginEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "blockchain.bot.iotagent.plugin.test",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $testBlockchainBotIotagentPluginResponse = new TestBlockchainBotIotagentPluginResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $testBlockchainBotIotagentPluginResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return TestBlockchainBotIotagentPluginResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.plugin.test", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取智能体信息
     * Summary: 获取智能体信息
     * @param QueryBlockchainBotIoaAgentRequest $request
     * @return QueryBlockchainBotIoaAgentResponse
     */
    public function queryBlockchainBotIoaAgent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIoaAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取智能体信息
     * Summary: 获取智能体信息
     * @param QueryBlockchainBotIoaAgentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIoaAgentResponse
     */
    public function queryBlockchainBotIoaAgentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIoaAgentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.ioa.agent.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新智能体信息
     * Summary: 更新智能体信息
     * @param SaveBlockchainBotIoaAgentRequest $request
     * @return SaveBlockchainBotIoaAgentResponse
     */
    public function saveBlockchainBotIoaAgent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveBlockchainBotIoaAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新智能体信息
     * Summary: 更新智能体信息
     * @param SaveBlockchainBotIoaAgentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveBlockchainBotIoaAgentResponse
     */
    public function saveBlockchainBotIoaAgentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveBlockchainBotIoaAgentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.ioa.agent.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户可选的模板列表详情
     * Summary: 查询用户可选的模板列表详情
     * @param QueryBlockchainBotIoaTemplatesRequest $request
     * @return QueryBlockchainBotIoaTemplatesResponse
     */
    public function queryBlockchainBotIoaTemplates($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIoaTemplatesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户可选的模板列表详情
     * Summary: 查询用户可选的模板列表详情
     * @param QueryBlockchainBotIoaTemplatesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIoaTemplatesResponse
     */
    public function queryBlockchainBotIoaTemplatesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIoaTemplatesResponse::fromMap($this->doRequest("1.0", "blockchain.bot.ioa.templates.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询聊天记录
     * Summary: 查询聊天记录
     * @param QueryBlockchainBotAgentchatHistoryRequest $request
     * @return QueryBlockchainBotAgentchatHistoryResponse
     */
    public function queryBlockchainBotAgentchatHistory($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotAgentchatHistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询聊天记录
     * Summary: 查询聊天记录
     * @param QueryBlockchainBotAgentchatHistoryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotAgentchatHistoryResponse
     */
    public function queryBlockchainBotAgentchatHistoryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotAgentchatHistoryResponse::fromMap($this->doRequest("1.0", "blockchain.bot.agentchat.history.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询 Session 列表
     * Summary: 查询 Session 列表
     * @param QueryBlockchainBotAgentSessionsRequest $request
     * @return QueryBlockchainBotAgentSessionsResponse
     */
    public function queryBlockchainBotAgentSessions($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotAgentSessionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询 Session 列表
     * Summary: 查询 Session 列表
     * @param QueryBlockchainBotAgentSessionsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotAgentSessionsResponse
     */
    public function queryBlockchainBotAgentSessionsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotAgentSessionsResponse::fromMap($this->doRequest("1.0", "blockchain.bot.agent.sessions.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询ai设备可用状态
     * Summary: 查询ai设备可用状态
     * @param QueryBlockchainBotIotagentAideviceRequest $request
     * @return QueryBlockchainBotIotagentAideviceResponse
     */
    public function queryBlockchainBotIotagentAidevice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentAideviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询ai设备可用状态
     * Summary: 查询ai设备可用状态
     * @param QueryBlockchainBotIotagentAideviceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentAideviceResponse
     */
    public function queryBlockchainBotIotagentAideviceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentAideviceResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.aidevice.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询物模型上报数据时间范围
     * Summary: 查询物模型上报数据时间范围
     * @param QueryBlockchainBotIotagentThingmodelrangeRequest $request
     * @return QueryBlockchainBotIotagentThingmodelrangeResponse
     */
    public function queryBlockchainBotIotagentThingmodelrange($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentThingmodelrangeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询物模型上报数据时间范围
     * Summary: 查询物模型上报数据时间范围
     * @param QueryBlockchainBotIotagentThingmodelrangeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentThingmodelrangeResponse
     */
    public function queryBlockchainBotIotagentThingmodelrangeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentThingmodelrangeResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.thingmodelrange.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询物模型上报数据
     * Summary: 查询物模型上报数据
     * @param QueryBlockchainBotIotagentThingmodeldataRequest $request
     * @return QueryBlockchainBotIotagentThingmodeldataResponse
     */
    public function queryBlockchainBotIotagentThingmodeldata($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentThingmodeldataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询物模型上报数据
     * Summary: 查询物模型上报数据
     * @param QueryBlockchainBotIotagentThingmodeldataRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentThingmodeldataResponse
     */
    public function queryBlockchainBotIotagentThingmodeldataEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentThingmodeldataResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.thingmodeldata.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT智能体插件签约URL获取接口
     * Summary: IoT智能体插件签约URL获取接口
     * @param GetsignurlBlockchainBotIotagentPlugincontractRequest $request
     * @return GetsignurlBlockchainBotIotagentPlugincontractResponse
     */
    public function getsignurlBlockchainBotIotagentPlugincontract($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getsignurlBlockchainBotIotagentPlugincontractEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT智能体插件签约URL获取接口
     * Summary: IoT智能体插件签约URL获取接口
     * @param GetsignurlBlockchainBotIotagentPlugincontractRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetsignurlBlockchainBotIotagentPlugincontractResponse
     */
    public function getsignurlBlockchainBotIotagentPlugincontractEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetsignurlBlockchainBotIotagentPlugincontractResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.plugincontract.getsignurl", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT智能体插件签约查询接口
     * Summary: IoT智能体插件签约查询接口
     * @param QueryBlockchainBotIotagentPlugincontractRequest $request
     * @return QueryBlockchainBotIotagentPlugincontractResponse
     */
    public function queryBlockchainBotIotagentPlugincontract($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentPlugincontractEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT智能体插件签约查询接口
     * Summary: IoT智能体插件签约查询接口
     * @param QueryBlockchainBotIotagentPlugincontractRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentPlugincontractResponse
     */
    public function queryBlockchainBotIotagentPlugincontractEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentPlugincontractResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.plugincontract.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据tenant获取tenant下的userId
     * Summary: 根据tenant获取tenant下的userId
     * @param QueryBlockchainBotIotagentUseridRequest $request
     * @return QueryBlockchainBotIotagentUseridResponse
     */
    public function queryBlockchainBotIotagentUserid($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentUseridEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据tenant获取tenant下的userId
     * Summary: 根据tenant获取tenant下的userId
     * @param QueryBlockchainBotIotagentUseridRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentUseridResponse
     */
    public function queryBlockchainBotIotagentUseridEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentUseridResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.userid.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据tenant获取featureId
     * Summary: 根据tenant获取featureId
     * @param QueryBlockchainBotIotagentFeatureRequest $request
     * @return QueryBlockchainBotIotagentFeatureResponse
     */
    public function queryBlockchainBotIotagentFeature($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentFeatureEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据tenant获取featureId
     * Summary: 根据tenant获取featureId
     * @param QueryBlockchainBotIotagentFeatureRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentFeatureResponse
     */
    public function queryBlockchainBotIotagentFeatureEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentFeatureResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.feature.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体创建
     * Summary: 智能体创建
     * @param CreateBlockchainBotIotagentAgentRequest $request
     * @return CreateBlockchainBotIotagentAgentResponse
     */
    public function createBlockchainBotIotagentAgent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBlockchainBotIotagentAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体创建
     * Summary: 智能体创建
     * @param CreateBlockchainBotIotagentAgentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBlockchainBotIotagentAgentResponse
     */
    public function createBlockchainBotIotagentAgentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBlockchainBotIotagentAgentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.agent.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体更新
     * Summary: 智能体更新
     * @param UpdateBlockchainBotIotagentAgentRequest $request
     * @return UpdateBlockchainBotIotagentAgentResponse
     */
    public function updateBlockchainBotIotagentAgent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBlockchainBotIotagentAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体更新
     * Summary: 智能体更新
     * @param UpdateBlockchainBotIotagentAgentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBlockchainBotIotagentAgentResponse
     */
    public function updateBlockchainBotIotagentAgentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBlockchainBotIotagentAgentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.agent.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体删除
     * Summary: 智能体删除
     * @param DeleteBlockchainBotIotagentAgentRequest $request
     * @return DeleteBlockchainBotIotagentAgentResponse
     */
    public function deleteBlockchainBotIotagentAgent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteBlockchainBotIotagentAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体删除
     * Summary: 智能体删除
     * @param DeleteBlockchainBotIotagentAgentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteBlockchainBotIotagentAgentResponse
     */
    public function deleteBlockchainBotIotagentAgentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteBlockchainBotIotagentAgentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.agent.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体列表
     * Summary: 智能体列表
     * @param ListBlockchainBotIotagentAgentRequest $request
     * @return ListBlockchainBotIotagentAgentResponse
     */
    public function listBlockchainBotIotagentAgent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotagentAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体列表
     * Summary: 智能体列表
     * @param ListBlockchainBotIotagentAgentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotagentAgentResponse
     */
    public function listBlockchainBotIotagentAgentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotagentAgentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.agent.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体团队创建
     * Summary: 智能体团队创建
     * @param CreateBlockchainBotIotagentAgentteamRequest $request
     * @return CreateBlockchainBotIotagentAgentteamResponse
     */
    public function createBlockchainBotIotagentAgentteam($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBlockchainBotIotagentAgentteamEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体团队创建
     * Summary: 智能体团队创建
     * @param CreateBlockchainBotIotagentAgentteamRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBlockchainBotIotagentAgentteamResponse
     */
    public function createBlockchainBotIotagentAgentteamEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBlockchainBotIotagentAgentteamResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.agentteam.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体团队编辑
     * Summary: 智能体团队编辑
     * @param UpdateBlockchainBotIotagentAgentteamRequest $request
     * @return UpdateBlockchainBotIotagentAgentteamResponse
     */
    public function updateBlockchainBotIotagentAgentteam($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBlockchainBotIotagentAgentteamEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体团队编辑
     * Summary: 智能体团队编辑
     * @param UpdateBlockchainBotIotagentAgentteamRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBlockchainBotIotagentAgentteamResponse
     */
    public function updateBlockchainBotIotagentAgentteamEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBlockchainBotIotagentAgentteamResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.agentteam.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体详情
     * Summary: 智能体详情
     * @param DetailBlockchainBotIotagentAgentRequest $request
     * @return DetailBlockchainBotIotagentAgentResponse
     */
    public function detailBlockchainBotIotagentAgent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->detailBlockchainBotIotagentAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体详情
     * Summary: 智能体详情
     * @param DetailBlockchainBotIotagentAgentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DetailBlockchainBotIotagentAgentResponse
     */
    public function detailBlockchainBotIotagentAgentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DetailBlockchainBotIotagentAgentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.agent.detail", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: session创建
     * Summary: session创建
     * @param CreateBlockchainBotIotagentSessionRequest $request
     * @return CreateBlockchainBotIotagentSessionResponse
     */
    public function createBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: session创建
     * Summary: session创建
     * @param CreateBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBlockchainBotIotagentSessionResponse
     */
    public function createBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: seesion名字修改
     * Summary: seesion名字修改
     * @param RenameBlockchainBotIotagentSessionRequest $request
     * @return RenameBlockchainBotIotagentSessionResponse
     */
    public function renameBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->renameBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: seesion名字修改
     * Summary: seesion名字修改
     * @param RenameBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RenameBlockchainBotIotagentSessionResponse
     */
    public function renameBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RenameBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.rename", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: session删除
     * Summary: session删除
     * @param DeleteBlockchainBotIotagentSessionRequest $request
     * @return DeleteBlockchainBotIotagentSessionResponse
     */
    public function deleteBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: session删除
     * Summary: session删除
     * @param DeleteBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteBlockchainBotIotagentSessionResponse
     */
    public function deleteBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: session对话历史
     * Summary: session对话历史
     * @param HistoryBlockchainBotIotagentSessionRequest $request
     * @return HistoryBlockchainBotIotagentSessionResponse
     */
    public function historyBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->historyBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: session对话历史
     * Summary: session对话历史
     * @param HistoryBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return HistoryBlockchainBotIotagentSessionResponse
     */
    public function historyBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return HistoryBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.history", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: session 列表
     * Summary: session 列表
     * @param ListBlockchainBotIotagentSessionRequest $request
     * @return ListBlockchainBotIotagentSessionResponse
     */
    public function listBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: session 列表
     * Summary: session 列表
     * @param ListBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotagentSessionResponse
     */
    public function listBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sse聊天
     * Summary: sse聊天
     * @param ChatBlockchainBotIotagentSessionRequest $request
     * @return ChatBlockchainBotIotagentSessionResponse
     */
    public function chatBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->chatBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: sse聊天
     * Summary: sse聊天
     * @param ChatBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ChatBlockchainBotIotagentSessionResponse
     */
    public function chatBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ChatBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.chat", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 会话打断
     * Summary: 会话打断
     * @param InterruptBlockchainBotIotagentSessionRequest $request
     * @return InterruptBlockchainBotIotagentSessionResponse
     */
    public function interruptBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->interruptBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: 会话打断
     * Summary: 会话打断
     * @param InterruptBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return InterruptBlockchainBotIotagentSessionResponse
     */
    public function interruptBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return InterruptBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.interrupt", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体消息/指令推送
     * Summary: 智能体消息/指令推送
     * @param PushBlockchainBotIotagentMessageRequest $request
     * @return PushBlockchainBotIotagentMessageResponse
     */
    public function pushBlockchainBotIotagentMessage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushBlockchainBotIotagentMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体消息/指令推送
     * Summary: 智能体消息/指令推送
     * @param PushBlockchainBotIotagentMessageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushBlockchainBotIotagentMessageResponse
     */
    public function pushBlockchainBotIotagentMessageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushBlockchainBotIotagentMessageResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.message.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询智能体消息/指令推送状态
     * Summary: 查询智能体消息/指令推送状态
     * @param QuerypushstatusBlockchainBotIotagentMessageRequest $request
     * @return QuerypushstatusBlockchainBotIotagentMessageResponse
     */
    public function querypushstatusBlockchainBotIotagentMessage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->querypushstatusBlockchainBotIotagentMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询智能体消息/指令推送状态
     * Summary: 查询智能体消息/指令推送状态
     * @param QuerypushstatusBlockchainBotIotagentMessageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QuerypushstatusBlockchainBotIotagentMessageResponse
     */
    public function querypushstatusBlockchainBotIotagentMessageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QuerypushstatusBlockchainBotIotagentMessageResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.message.querypushstatus", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: session下的文件列表
     * Summary: session下的文件列表
     * @param ListfilesBlockchainBotIotagentSessionRequest $request
     * @return ListfilesBlockchainBotIotagentSessionResponse
     */
    public function listfilesBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listfilesBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: session下的文件列表
     * Summary: session下的文件列表
     * @param ListfilesBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListfilesBlockchainBotIotagentSessionResponse
     */
    public function listfilesBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListfilesBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.listfiles", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件下载
     * Summary: 文件下载
     * @param FliedownloadBlockchainBotIotagentSessionRequest $request
     * @return FliedownloadBlockchainBotIotagentSessionResponse
     */
    public function fliedownloadBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->fliedownloadBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件下载
     * Summary: 文件下载
     * @param FliedownloadBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return FliedownloadBlockchainBotIotagentSessionResponse
     */
    public function fliedownloadBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return FliedownloadBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.fliedownload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件预览
     * Summary: 文件预览
     * @param FilepreviewBlockchainBotIotagentSessionRequest $request
     * @return FilepreviewBlockchainBotIotagentSessionResponse
     */
    public function filepreviewBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->filepreviewBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件预览
     * Summary: 文件预览
     * @param FilepreviewBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return FilepreviewBlockchainBotIotagentSessionResponse
     */
    public function filepreviewBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return FilepreviewBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.filepreview", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 插件接口
     * Summary: 插件接口
     * @param PushBlockchainBotIotagentAudioscribeRequest $request
     * @return PushBlockchainBotIotagentAudioscribeResponse
     */
    public function pushBlockchainBotIotagentAudioscribe($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushBlockchainBotIotagentAudioscribeEx($request, $headers, $runtime);
    }

    /**
     * Description: 插件接口
     * Summary: 插件接口
     * @param PushBlockchainBotIotagentAudioscribeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushBlockchainBotIotagentAudioscribeResponse
     */
    public function pushBlockchainBotIotagentAudioscribeEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "blockchain.bot.iotagent.audioscribe.push",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $pushBlockchainBotIotagentAudioscribeResponse = new PushBlockchainBotIotagentAudioscribeResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $pushBlockchainBotIotagentAudioscribeResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return PushBlockchainBotIotagentAudioscribeResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.audioscribe.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 插件通用HTTP接口
     * Summary: 插件通用HTTP接口
     * @param ExecBlockchainBotIotagentPluginRequest $request
     * @return ExecBlockchainBotIotagentPluginResponse
     */
    public function execBlockchainBotIotagentPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execBlockchainBotIotagentPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 插件通用HTTP接口
     * Summary: 插件通用HTTP接口
     * @param ExecBlockchainBotIotagentPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecBlockchainBotIotagentPluginResponse
     */
    public function execBlockchainBotIotagentPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecBlockchainBotIotagentPluginResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.plugin.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件上传
     * Summary: 文件上传
     * @param PushBlockchainBotIotagentWorkspaceRequest $request
     * @return PushBlockchainBotIotagentWorkspaceResponse
     */
    public function pushBlockchainBotIotagentWorkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushBlockchainBotIotagentWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件上传
     * Summary: 文件上传
     * @param PushBlockchainBotIotagentWorkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushBlockchainBotIotagentWorkspaceResponse
     */
    public function pushBlockchainBotIotagentWorkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushBlockchainBotIotagentWorkspaceResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.workspace.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件上传确认
     * Summary: 文件上传确认
     * @param ConfirmBlockchainBotIotagentWorkspaceRequest $request
     * @return ConfirmBlockchainBotIotagentWorkspaceResponse
     */
    public function confirmBlockchainBotIotagentWorkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmBlockchainBotIotagentWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件上传确认
     * Summary: 文件上传确认
     * @param ConfirmBlockchainBotIotagentWorkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmBlockchainBotIotagentWorkspaceResponse
     */
    public function confirmBlockchainBotIotagentWorkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmBlockchainBotIotagentWorkspaceResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.workspace.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询设备的云音乐登录状态及用户/VIP 信息。
     * Summary: 查询设备的云音乐登录状态及用户/VIP 信息。
     * @param StatusBlockchainBotIotagentMusicRequest $request
     * @return StatusBlockchainBotIotagentMusicResponse
     */
    public function statusBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->statusBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询设备的云音乐登录状态及用户/VIP 信息。
     * Summary: 查询设备的云音乐登录状态及用户/VIP 信息。
     * @param StatusBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StatusBlockchainBotIotagentMusicResponse
     */
    public function statusBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StatusBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.status", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
     * Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
     * @param LoginurlBlockchainBotIotagentMusicRequest $request
     * @return LoginurlBlockchainBotIotagentMusicResponse
     */
    public function loginurlBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->loginurlBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
     * Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
     * @param LoginurlBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return LoginurlBlockchainBotIotagentMusicResponse
     */
    public function loginurlBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return LoginurlBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.loginurl", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询云音乐播放历史
     * Summary: 查询云音乐播放历史
     * @param PlayhistoryBlockchainBotIotagentMusicRequest $request
     * @return PlayhistoryBlockchainBotIotagentMusicResponse
     */
    public function playhistoryBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->playhistoryBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询云音乐播放历史
     * Summary: 查询云音乐播放历史
     * @param PlayhistoryBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PlayhistoryBlockchainBotIotagentMusicResponse
     */
    public function playhistoryBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PlayhistoryBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.playhistory", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询红心歌曲
     * Summary: 分页查询红心歌曲
     * @param FavoritesBlockchainBotIotagentMusicRequest $request
     * @return FavoritesBlockchainBotIotagentMusicResponse
     */
    public function favoritesBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->favoritesBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询红心歌曲
     * Summary: 分页查询红心歌曲
     * @param FavoritesBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return FavoritesBlockchainBotIotagentMusicResponse
     */
    public function favoritesBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return FavoritesBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.favorites", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定歌曲的歌词。
     * Summary: 查询指定歌曲的歌词。
     * @param LyricsBlockchainBotIotagentMusicRequest $request
     * @return LyricsBlockchainBotIotagentMusicResponse
     */
    public function lyricsBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->lyricsBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定歌曲的歌词。
     * Summary: 查询指定歌曲的歌词。
     * @param LyricsBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return LyricsBlockchainBotIotagentMusicResponse
     */
    public function lyricsBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return LyricsBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.lyrics", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一首歌进行红心/取消红心操作。
     * Summary: 对一首歌进行红心/取消红心操作。
     * @param LikeBlockchainBotIotagentMusicRequest $request
     * @return LikeBlockchainBotIotagentMusicResponse
     */
    public function likeBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->likeBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一首歌进行红心/取消红心操作。
     * Summary: 对一首歌进行红心/取消红心操作。
     * @param LikeBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return LikeBlockchainBotIotagentMusicResponse
     */
    public function likeBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return LikeBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.like", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退出云音乐登录，清理 token
     * Summary: 退出云音乐登录，清理 token
     * @param LogoutBlockchainBotIotagentMusicRequest $request
     * @return LogoutBlockchainBotIotagentMusicResponse
     */
    public function logoutBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->logoutBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 退出云音乐登录，清理 token
     * Summary: 退出云音乐登录，清理 token
     * @param LogoutBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return LogoutBlockchainBotIotagentMusicResponse
     */
    public function logoutBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return LogoutBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.logout", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
     * Summary: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
     * @param QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @return QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function querycontractBlockchainBotAiotdatalinkAntfinanceassistant($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->querycontractBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
     * Summary: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
     * @param QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function querycontractBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse::fromMap($this->doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.querycontract", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
     * Summary: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
     * @param SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @return SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function signcontractBlockchainBotAiotdatalinkAntfinanceassistant($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->signcontractBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
     * Summary: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
     * @param SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function signcontractBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse::fromMap($this->doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.signcontract", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * Summary: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * @param ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @return ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function chatBlockchainBotAiotdatalinkAntfinanceassistant($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->chatBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * Summary: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * @param ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function chatBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse::fromMap($this->doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.chat", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * Summary: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * @param StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @return StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function streamchatBlockchainBotAiotdatalinkAntfinanceassistant($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->streamchatBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * Summary: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
     * @param StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse
     */
    public function streamchatBlockchainBotAiotdatalinkAntfinanceassistantEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse::fromMap($this->doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.streamchat", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
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
