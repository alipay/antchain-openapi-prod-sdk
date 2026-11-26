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
use AntChain\IOTAGENT\Models\CallbackBlockchainBotIotagentMusicRequest;
use AntChain\IOTAGENT\Models\CallbackBlockchainBotIotagentMusicResponse;
use AntChain\IOTAGENT\Models\UsageBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\UsageBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\ActionBlockchainBotIotagentSessioncontextRequest;
use AntChain\IOTAGENT\Models\ActionBlockchainBotIotagentSessioncontextResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentSessioncontextactionRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotIotagentSessioncontextactionResponse;
use AntChain\IOTAGENT\Models\QueryBlockchainBotAgentDailysummaryRequest;
use AntChain\IOTAGENT\Models\QueryBlockchainBotAgentDailysummaryResponse;
use AntChain\IOTAGENT\Models\GenerateBlockchainBotAgentDailysummaryRequest;
use AntChain\IOTAGENT\Models\GenerateBlockchainBotAgentDailysummaryResponse;
use AntChain\IOTAGENT\Models\TrajectoryBlockchainBotIotagentSessionRequest;
use AntChain\IOTAGENT\Models\TrajectoryBlockchainBotIotagentSessionResponse;
use AntChain\IOTAGENT\Models\StepsBlockchainBotIotagentSessionTrajectoryRequest;
use AntChain\IOTAGENT\Models\StepsBlockchainBotIotagentSessionTrajectoryResponse;
use AntChain\IOTAGENT\Models\UploadurlBlockchainBotIotagentFilesRequest;
use AntChain\IOTAGENT\Models\UploadurlBlockchainBotIotagentFilesResponse;
use AntChain\IOTAGENT\Models\ConfirmBlockchainBotIotagentFilesRequest;
use AntChain\IOTAGENT\Models\ConfirmBlockchainBotIotagentFilesResponse;
use AntChain\IOTAGENT\Models\FileurlBlockchainBotIotagentFilesRequest;
use AntChain\IOTAGENT\Models\FileurlBlockchainBotIotagentFilesResponse;
use AntChain\IOTAGENT\Models\MountBlockchainBotIotagentKbRequest;
use AntChain\IOTAGENT\Models\MountBlockchainBotIotagentKbResponse;
use AntChain\IOTAGENT\Models\UnmountBlockchainBotIotagentKbRequest;
use AntChain\IOTAGENT\Models\UnmountBlockchainBotIotagentKbResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentKbRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentKbResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentModelRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotagentModelResponse;
use AntChain\IOTAGENT\Models\QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest;
use AntChain\IOTAGENT\Models\StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductRequest;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductResponse;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotsuccessProductRequest;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotsuccessProductResponse;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductRequest;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductCategoryRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductCategoryResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductTemplateGlobalRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductTemplateGlobalResponse;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductTemplateRequest;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductTemplateResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductTemplateRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductTemplateResponse;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotsuccessProductTemplateRequest;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotsuccessProductTemplateResponse;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductTemplateRequest;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductTemplateResponse;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductTemplateRequest;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductTemplateResponse;
use AntChain\IOTAGENT\Models\DefaultBlockchainBotIotsuccessProductTemplateRequest;
use AntChain\IOTAGENT\Models\DefaultBlockchainBotIotsuccessProductTemplateResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductVoiceRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductVoiceResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductModelRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductModelResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductPluginStoreRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductPluginStoreResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductPluginBindingRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductPluginBindingResponse;
use AntChain\IOTAGENT\Models\BindBlockchainBotIotsuccessProductPluginRequest;
use AntChain\IOTAGENT\Models\BindBlockchainBotIotsuccessProductPluginResponse;
use AntChain\IOTAGENT\Models\UnbindBlockchainBotIotsuccessProductPluginRequest;
use AntChain\IOTAGENT\Models\UnbindBlockchainBotIotsuccessProductPluginResponse;
use AntChain\IOTAGENT\Models\UploadBlockchainBotIotsuccessProductSkillRequest;
use AntChain\IOTAGENT\Models\UploadBlockchainBotIotsuccessProductSkillResponse;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotsuccessProductSkillRequest;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotsuccessProductSkillResponse;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductMcpRequest;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductMcpResponse;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductMcpRequest;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductMcpResponse;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductMcpRequest;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductMcpResponse;
use AntChain\IOTAGENT\Models\ValidateBlockchainBotIotsuccessProductMcpRequest;
use AntChain\IOTAGENT\Models\ValidateBlockchainBotIotsuccessProductMcpResponse;
use AntChain\IOTAGENT\Models\ImportBlockchainBotIotsuccessProductDeviceRequest;
use AntChain\IOTAGENT\Models\ImportBlockchainBotIotsuccessProductDeviceResponse;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotsuccessProductDeviceImportRequest;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotsuccessProductDeviceImportResponse;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductKnowledgebaseRequest;
use AntChain\IOTAGENT\Models\CreateBlockchainBotIotsuccessProductKnowledgebaseResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductKnowledgebaseRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductKnowledgebaseResponse;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotsuccessProductKnowledgebaseRequest;
use AntChain\IOTAGENT\Models\DetailBlockchainBotIotsuccessProductKnowledgebaseResponse;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest;
use AntChain\IOTAGENT\Models\UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse;
use AntChain\IOTAGENT\Models\UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest;
use AntChain\IOTAGENT\Models\UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest;
use AntChain\IOTAGENT\Models\DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse;
use AntChain\IOTAGENT\Models\SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest;
use AntChain\IOTAGENT\Models\SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse;
use AntChain\IOTAGENT\Models\TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest;
use AntChain\IOTAGENT\Models\TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductLicenseRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductLicenseResponse;
use AntChain\IOTAGENT\Models\OverviewBlockchainBotIotsuccessProductQuotaRequest;
use AntChain\IOTAGENT\Models\OverviewBlockchainBotIotsuccessProductQuotaResponse;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductQuotaConsumptionRequest;
use AntChain\IOTAGENT\Models\ListBlockchainBotIotsuccessProductQuotaConsumptionResponse;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIoaProductDeviceImportRequest;
use AntChain\IOTAGENT\Models\StatusBlockchainBotIoaProductDeviceImportResponse;
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
                    "sdk_version" => "1.5.2",
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
     * Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
     * Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
     * @param ChatBlockchainBotIotagentSessionRequest $request
     * @return ChatBlockchainBotIotagentSessionResponse
     */
    public function chatBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->chatBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
     * Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
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
     * Description: 云音乐回调接口
     * Summary: 云音乐回调接口
     * @param CallbackBlockchainBotIotagentMusicRequest $request
     * @return CallbackBlockchainBotIotagentMusicResponse
     */
    public function callbackBlockchainBotIotagentMusic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackBlockchainBotIotagentMusicEx($request, $headers, $runtime);
    }

    /**
     * Description: 云音乐回调接口
     * Summary: 云音乐回调接口
     * @param CallbackBlockchainBotIotagentMusicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackBlockchainBotIotagentMusicResponse
     */
    public function callbackBlockchainBotIotagentMusicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackBlockchainBotIotagentMusicResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.music.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
     * Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
     * @param UsageBlockchainBotIotagentSessionRequest $request
     * @return UsageBlockchainBotIotagentSessionResponse
     */
    public function usageBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->usageBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
     * Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
     * @param UsageBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UsageBlockchainBotIotagentSessionResponse
     */
    public function usageBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UsageBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.usage", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 会话上下文处理操作
     * Summary: 会话上下文处理操作
     * @param ActionBlockchainBotIotagentSessioncontextRequest $request
     * @return ActionBlockchainBotIotagentSessioncontextResponse
     */
    public function actionBlockchainBotIotagentSessioncontext($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->actionBlockchainBotIotagentSessioncontextEx($request, $headers, $runtime);
    }

    /**
     * Description: 会话上下文处理操作
     * Summary: 会话上下文处理操作
     * @param ActionBlockchainBotIotagentSessioncontextRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ActionBlockchainBotIotagentSessioncontextResponse
     */
    public function actionBlockchainBotIotagentSessioncontextEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ActionBlockchainBotIotagentSessioncontextResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.sessioncontext.action", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询上下文压缩操作结果
     * Summary: 查询上下文压缩操作结果
     * @param QueryBlockchainBotIotagentSessioncontextactionRequest $request
     * @return QueryBlockchainBotIotagentSessioncontextactionResponse
     */
    public function queryBlockchainBotIotagentSessioncontextaction($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotIotagentSessioncontextactionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询上下文压缩操作结果
     * Summary: 查询上下文压缩操作结果
     * @param QueryBlockchainBotIotagentSessioncontextactionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotIotagentSessioncontextactionResponse
     */
    public function queryBlockchainBotIotagentSessioncontextactionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotIotagentSessioncontextactionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.sessioncontextaction.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
     * Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
     * @param QueryBlockchainBotAgentDailysummaryRequest $request
     * @return QueryBlockchainBotAgentDailysummaryResponse
     */
    public function queryBlockchainBotAgentDailysummary($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBlockchainBotAgentDailysummaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
     * Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
     * @param QueryBlockchainBotAgentDailysummaryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBlockchainBotAgentDailysummaryResponse
     */
    public function queryBlockchainBotAgentDailysummaryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBlockchainBotAgentDailysummaryResponse::fromMap($this->doRequest("1.0", "blockchain.bot.agent.dailysummary.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
     * Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
     * @param GenerateBlockchainBotAgentDailysummaryRequest $request
     * @return GenerateBlockchainBotAgentDailysummaryResponse
     */
    public function generateBlockchainBotAgentDailysummary($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->generateBlockchainBotAgentDailysummaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
     * Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
     * @param GenerateBlockchainBotAgentDailysummaryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GenerateBlockchainBotAgentDailysummaryResponse
     */
    public function generateBlockchainBotAgentDailysummaryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GenerateBlockchainBotAgentDailysummaryResponse::fromMap($this->doRequest("1.0", "blockchain.bot.agent.dailysummary.generate", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
     * Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
     * @param TrajectoryBlockchainBotIotagentSessionRequest $request
     * @return TrajectoryBlockchainBotIotagentSessionResponse
     */
    public function trajectoryBlockchainBotIotagentSession($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->trajectoryBlockchainBotIotagentSessionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
     * Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
     * @param TrajectoryBlockchainBotIotagentSessionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return TrajectoryBlockchainBotIotagentSessionResponse
     */
    public function trajectoryBlockchainBotIotagentSessionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return TrajectoryBlockchainBotIotagentSessionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.trajectory", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询单轮/操作的执行步骤详情，展开执行树
     * Summary: 查询单轮/操作的执行步骤详情，展开执行树
     * @param StepsBlockchainBotIotagentSessionTrajectoryRequest $request
     * @return StepsBlockchainBotIotagentSessionTrajectoryResponse
     */
    public function stepsBlockchainBotIotagentSessionTrajectory($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->stepsBlockchainBotIotagentSessionTrajectoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询单轮/操作的执行步骤详情，展开执行树
     * Summary: 查询单轮/操作的执行步骤详情，展开执行树
     * @param StepsBlockchainBotIotagentSessionTrajectoryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StepsBlockchainBotIotagentSessionTrajectoryResponse
     */
    public function stepsBlockchainBotIotagentSessionTrajectoryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StepsBlockchainBotIotagentSessionTrajectoryResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.session.trajectory.steps", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
     * Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
     * @param UploadurlBlockchainBotIotagentFilesRequest $request
     * @return UploadurlBlockchainBotIotagentFilesResponse
     */
    public function uploadurlBlockchainBotIotagentFiles($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadurlBlockchainBotIotagentFilesEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
     * Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
     * @param UploadurlBlockchainBotIotagentFilesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadurlBlockchainBotIotagentFilesResponse
     */
    public function uploadurlBlockchainBotIotagentFilesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UploadurlBlockchainBotIotagentFilesResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.files.uploadurl", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
     * Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
     * @param ConfirmBlockchainBotIotagentFilesRequest $request
     * @return ConfirmBlockchainBotIotagentFilesResponse
     */
    public function confirmBlockchainBotIotagentFiles($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmBlockchainBotIotagentFilesEx($request, $headers, $runtime);
    }

    /**
     * Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
     * Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
     * @param ConfirmBlockchainBotIotagentFilesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmBlockchainBotIotagentFilesResponse
     */
    public function confirmBlockchainBotIotagentFilesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmBlockchainBotIotagentFilesResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.files.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
     * Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
     * @param FileurlBlockchainBotIotagentFilesRequest $request
     * @return FileurlBlockchainBotIotagentFilesResponse
     */
    public function fileurlBlockchainBotIotagentFiles($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->fileurlBlockchainBotIotagentFilesEx($request, $headers, $runtime);
    }

    /**
     * Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
     * Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
     * @param FileurlBlockchainBotIotagentFilesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return FileurlBlockchainBotIotagentFilesResponse
     */
    public function fileurlBlockchainBotIotagentFilesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return FileurlBlockchainBotIotagentFilesResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.files.fileurl", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
     * Summary: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
     * @param MountBlockchainBotIotagentKbRequest $request
     * @return MountBlockchainBotIotagentKbResponse
     */
    public function mountBlockchainBotIotagentKb($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->mountBlockchainBotIotagentKbEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
     * Summary: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
     * @param MountBlockchainBotIotagentKbRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return MountBlockchainBotIotagentKbResponse
     */
    public function mountBlockchainBotIotagentKbEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return MountBlockchainBotIotagentKbResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.kb.mount", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
     * Summary: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
     * @param UnmountBlockchainBotIotagentKbRequest $request
     * @return UnmountBlockchainBotIotagentKbResponse
     */
    public function unmountBlockchainBotIotagentKb($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->unmountBlockchainBotIotagentKbEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
     * Summary: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
     * @param UnmountBlockchainBotIotagentKbRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UnmountBlockchainBotIotagentKbResponse
     */
    public function unmountBlockchainBotIotagentKbEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UnmountBlockchainBotIotagentKbResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.kb.unmount", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
     * Summary: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
     * @param ListBlockchainBotIotagentKbRequest $request
     * @return ListBlockchainBotIotagentKbResponse
     */
    public function listBlockchainBotIotagentKb($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotagentKbEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
     * Summary: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
     * @param ListBlockchainBotIotagentKbRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotagentKbResponse
     */
    public function listBlockchainBotIotagentKbEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotagentKbResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.kb.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
     * Summary: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
     * @param ListBlockchainBotIotagentModelRequest $request
     * @return ListBlockchainBotIotagentModelResponse
     */
    public function listBlockchainBotIotagentModel($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotagentModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
     * Summary: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
     * @param ListBlockchainBotIotagentModelRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotagentModelResponse
     */
    public function listBlockchainBotIotagentModelEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotagentModelResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotagent.model.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
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
     * Description: P01 创建产品，一次性返回明文产品密钥
     * Summary: P01 创建产品，一次性返回明文产品密钥
     * @param CreateBlockchainBotIotsuccessProductRequest $request
     * @return CreateBlockchainBotIotsuccessProductResponse
     */
    public function createBlockchainBotIotsuccessProduct($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBlockchainBotIotsuccessProductEx($request, $headers, $runtime);
    }

    /**
     * Description: P01 创建产品，一次性返回明文产品密钥
     * Summary: P01 创建产品，一次性返回明文产品密钥
     * @param CreateBlockchainBotIotsuccessProductRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBlockchainBotIotsuccessProductResponse
     */
    public function createBlockchainBotIotsuccessProductEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBlockchainBotIotsuccessProductResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: P02 产品详情，不含产品密钥
     * Summary: P02 产品详情，不含产品密钥
     * @param DetailBlockchainBotIotsuccessProductRequest $request
     * @return DetailBlockchainBotIotsuccessProductResponse
     */
    public function detailBlockchainBotIotsuccessProduct($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->detailBlockchainBotIotsuccessProductEx($request, $headers, $runtime);
    }

    /**
     * Description: P02 产品详情，不含产品密钥
     * Summary: P02 产品详情，不含产品密钥
     * @param DetailBlockchainBotIotsuccessProductRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DetailBlockchainBotIotsuccessProductResponse
     */
    public function detailBlockchainBotIotsuccessProductEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DetailBlockchainBotIotsuccessProductResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.detail", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: P03 更新产品，至少一个可更新字段
     * Summary: P03 更新产品，至少一个可更新字段
     * @param UpdateBlockchainBotIotsuccessProductRequest $request
     * @return UpdateBlockchainBotIotsuccessProductResponse
     */
    public function updateBlockchainBotIotsuccessProduct($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBlockchainBotIotsuccessProductEx($request, $headers, $runtime);
    }

    /**
     * Description: P03 更新产品，至少一个可更新字段
     * Summary: P03 更新产品，至少一个可更新字段
     * @param UpdateBlockchainBotIotsuccessProductRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBlockchainBotIotsuccessProductResponse
     */
    public function updateBlockchainBotIotsuccessProductEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBlockchainBotIotsuccessProductResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: P04 当前租户产品列表
     * Summary: P04 当前租户产品列表
     * @param ListBlockchainBotIotsuccessProductRequest $request
     * @return ListBlockchainBotIotsuccessProductResponse
     */
    public function listBlockchainBotIotsuccessProduct($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductEx($request, $headers, $runtime);
    }

    /**
     * Description: P04 当前租户产品列表
     * Summary: P04 当前租户产品列表
     * @param ListBlockchainBotIotsuccessProductRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductResponse
     */
    public function listBlockchainBotIotsuccessProductEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: P05 可选品类与服务形态、入网及激活组合
     * Summary: P05 可选品类与服务形态、入网及激活组合
     * @param ListBlockchainBotIotsuccessProductCategoryRequest $request
     * @return ListBlockchainBotIotsuccessProductCategoryResponse
     */
    public function listBlockchainBotIotsuccessProductCategory($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: P05 可选品类与服务形态、入网及激活组合
     * Summary: P05 可选品类与服务形态、入网及激活组合
     * @param ListBlockchainBotIotsuccessProductCategoryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductCategoryResponse
     */
    public function listBlockchainBotIotsuccessProductCategoryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductCategoryResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.category.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T01 只读全局模板基线
     * Summary: T01 只读全局模板基线
     * @param ListBlockchainBotIotsuccessProductTemplateGlobalRequest $request
     * @return ListBlockchainBotIotsuccessProductTemplateGlobalResponse
     */
    public function listBlockchainBotIotsuccessProductTemplateGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductTemplateGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: T01 只读全局模板基线
     * Summary: T01 只读全局模板基线
     * @param ListBlockchainBotIotsuccessProductTemplateGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductTemplateGlobalResponse
     */
    public function listBlockchainBotIotsuccessProductTemplateGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductTemplateGlobalResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.template.global.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T02 从零或全局模板创建产品模板
     * Summary: T02 从零或全局模板创建产品模板
     * @param CreateBlockchainBotIotsuccessProductTemplateRequest $request
     * @return CreateBlockchainBotIotsuccessProductTemplateResponse
     */
    public function createBlockchainBotIotsuccessProductTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: T02 从零或全局模板创建产品模板
     * Summary: T02 从零或全局模板创建产品模板
     * @param CreateBlockchainBotIotsuccessProductTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBlockchainBotIotsuccessProductTemplateResponse
     */
    public function createBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBlockchainBotIotsuccessProductTemplateResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.template.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T03 产品模板列表与默认标记
     * Summary: T03 产品模板列表与默认标记
     * @param ListBlockchainBotIotsuccessProductTemplateRequest $request
     * @return ListBlockchainBotIotsuccessProductTemplateResponse
     */
    public function listBlockchainBotIotsuccessProductTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: T03 产品模板列表与默认标记
     * Summary: T03 产品模板列表与默认标记
     * @param ListBlockchainBotIotsuccessProductTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductTemplateResponse
     */
    public function listBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductTemplateResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.template.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T04 模板全部配置
     * Summary: T04 模板全部配置
     * @param DetailBlockchainBotIotsuccessProductTemplateRequest $request
     * @return DetailBlockchainBotIotsuccessProductTemplateResponse
     */
    public function detailBlockchainBotIotsuccessProductTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->detailBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: T04 模板全部配置
     * Summary: T04 模板全部配置
     * @param DetailBlockchainBotIotsuccessProductTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DetailBlockchainBotIotsuccessProductTemplateResponse
     */
    public function detailBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DetailBlockchainBotIotsuccessProductTemplateResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.template.detail", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T05 更新模板语言、音色、角色、模型及语音参数
     * Summary: T05 更新模板语言、音色、角色、模型及语音参数
     * @param UpdateBlockchainBotIotsuccessProductTemplateRequest $request
     * @return UpdateBlockchainBotIotsuccessProductTemplateResponse
     */
    public function updateBlockchainBotIotsuccessProductTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: T05 更新模板语言、音色、角色、模型及语音参数
     * Summary: T05 更新模板语言、音色、角色、模型及语音参数
     * @param UpdateBlockchainBotIotsuccessProductTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBlockchainBotIotsuccessProductTemplateResponse
     */
    public function updateBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBlockchainBotIotsuccessProductTemplateResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.template.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T06 默认模板需先切换，最后一个模板不可删
     * Summary: T06 默认模板需先切换，最后一个模板不可删
     * @param DeleteBlockchainBotIotsuccessProductTemplateRequest $request
     * @return DeleteBlockchainBotIotsuccessProductTemplateResponse
     */
    public function deleteBlockchainBotIotsuccessProductTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: T06 默认模板需先切换，最后一个模板不可删
     * Summary: T06 默认模板需先切换，最后一个模板不可删
     * @param DeleteBlockchainBotIotsuccessProductTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteBlockchainBotIotsuccessProductTemplateResponse
     */
    public function deleteBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteBlockchainBotIotsuccessProductTemplateResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.template.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T07 设置唯一默认，只影响新激活设备
     * Summary: T07 设置唯一默认，只影响新激活设备
     * @param DefaultBlockchainBotIotsuccessProductTemplateRequest $request
     * @return DefaultBlockchainBotIotsuccessProductTemplateResponse
     */
    public function defaultBlockchainBotIotsuccessProductTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->defaultBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: T07 设置唯一默认，只影响新激活设备
     * Summary: T07 设置唯一默认，只影响新激活设备
     * @param DefaultBlockchainBotIotsuccessProductTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DefaultBlockchainBotIotsuccessProductTemplateResponse
     */
    public function defaultBlockchainBotIotsuccessProductTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DefaultBlockchainBotIotsuccessProductTemplateResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.template.default", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T08 按语言筛选可选音色
     * Summary: T08 按语言筛选可选音色
     * @param ListBlockchainBotIotsuccessProductVoiceRequest $request
     * @return ListBlockchainBotIotsuccessProductVoiceResponse
     */
    public function listBlockchainBotIotsuccessProductVoice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductVoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: T08 按语言筛选可选音色
     * Summary: T08 按语言筛选可选音色
     * @param ListBlockchainBotIotsuccessProductVoiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductVoiceResponse
     */
    public function listBlockchainBotIotsuccessProductVoiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductVoiceResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.voice.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: T09 按产品授权和地区筛选模型
     * Summary: T09 按产品授权和地区筛选模型
     * @param ListBlockchainBotIotsuccessProductModelRequest $request
     * @return ListBlockchainBotIotsuccessProductModelResponse
     */
    public function listBlockchainBotIotsuccessProductModel($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductModelEx($request, $headers, $runtime);
    }

    /**
     * Description: T09 按产品授权和地区筛选模型
     * Summary: T09 按产品授权和地区筛选模型
     * @param ListBlockchainBotIotsuccessProductModelRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductModelResponse
     */
    public function listBlockchainBotIotsuccessProductModelEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductModelResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.model.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G01 官方、本租户及显式授权插件目录
     * Summary: G01 官方、本租户及显式授权插件目录
     * @param ListBlockchainBotIotsuccessProductPluginStoreRequest $request
     * @return ListBlockchainBotIotsuccessProductPluginStoreResponse
     */
    public function listBlockchainBotIotsuccessProductPluginStore($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductPluginStoreEx($request, $headers, $runtime);
    }

    /**
     * Description: G01 官方、本租户及显式授权插件目录
     * Summary: G01 官方、本租户及显式授权插件目录
     * @param ListBlockchainBotIotsuccessProductPluginStoreRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductPluginStoreResponse
     */
    public function listBlockchainBotIotsuccessProductPluginStoreEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductPluginStoreResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.store.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G02 产品已绑定插件与生效状态
     * Summary: G02 产品已绑定插件与生效状态
     * @param ListBlockchainBotIotsuccessProductPluginBindingRequest $request
     * @return ListBlockchainBotIotsuccessProductPluginBindingResponse
     */
    public function listBlockchainBotIotsuccessProductPluginBinding($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductPluginBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: G02 产品已绑定插件与生效状态
     * Summary: G02 产品已绑定插件与生效状态
     * @param ListBlockchainBotIotsuccessProductPluginBindingRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductPluginBindingResponse
     */
    public function listBlockchainBotIotsuccessProductPluginBindingEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductPluginBindingResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.binding.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
     * Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
     * @param BindBlockchainBotIotsuccessProductPluginRequest $request
     * @return BindBlockchainBotIotsuccessProductPluginResponse
     */
    public function bindBlockchainBotIotsuccessProductPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->bindBlockchainBotIotsuccessProductPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
     * Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
     * @param BindBlockchainBotIotsuccessProductPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BindBlockchainBotIotsuccessProductPluginResponse
     */
    public function bindBlockchainBotIotsuccessProductPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BindBlockchainBotIotsuccessProductPluginResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.bind", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G04 高风险解绑，必须显式confirm=true
     * Summary: G04 高风险解绑，必须显式confirm=true
     * @param UnbindBlockchainBotIotsuccessProductPluginRequest $request
     * @return UnbindBlockchainBotIotsuccessProductPluginResponse
     */
    public function unbindBlockchainBotIotsuccessProductPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->unbindBlockchainBotIotsuccessProductPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: G04 高风险解绑，必须显式confirm=true
     * Summary: G04 高风险解绑，必须显式confirm=true
     * @param UnbindBlockchainBotIotsuccessProductPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UnbindBlockchainBotIotsuccessProductPluginResponse
     */
    public function unbindBlockchainBotIotsuccessProductPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UnbindBlockchainBotIotsuccessProductPluginResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.unbind", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G05 上传并解析Skill包，返回现有插件创建结果
     * Summary: G05 上传并解析Skill包，返回现有插件创建结果
     * @param UploadBlockchainBotIotsuccessProductSkillRequest $request
     * @return UploadBlockchainBotIotsuccessProductSkillResponse
     */
    public function uploadBlockchainBotIotsuccessProductSkill($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadBlockchainBotIotsuccessProductSkillEx($request, $headers, $runtime);
    }

    /**
     * Description: G05 上传并解析Skill包，返回现有插件创建结果
     * Summary: G05 上传并解析Skill包，返回现有插件创建结果
     * @param UploadBlockchainBotIotsuccessProductSkillRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadBlockchainBotIotsuccessProductSkillResponse
     */
    public function uploadBlockchainBotIotsuccessProductSkillEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UploadBlockchainBotIotsuccessProductSkillResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.skill.upload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G06 按pluginId查询已有Skill资产状态
     * Summary: G06 按pluginId查询已有Skill资产状态
     * @param StatusBlockchainBotIotsuccessProductSkillRequest $request
     * @return StatusBlockchainBotIotsuccessProductSkillResponse
     */
    public function statusBlockchainBotIotsuccessProductSkill($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->statusBlockchainBotIotsuccessProductSkillEx($request, $headers, $runtime);
    }

    /**
     * Description: G06 按pluginId查询已有Skill资产状态
     * Summary: G06 按pluginId查询已有Skill资产状态
     * @param StatusBlockchainBotIotsuccessProductSkillRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StatusBlockchainBotIotsuccessProductSkillResponse
     */
    public function statusBlockchainBotIotsuccessProductSkillEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StatusBlockchainBotIotsuccessProductSkillResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.skill.status", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G07 创建MCP站点，保存前校验
     * Summary: G07 创建MCP站点，保存前校验
     * @param CreateBlockchainBotIotsuccessProductMcpRequest $request
     * @return CreateBlockchainBotIotsuccessProductMcpResponse
     */
    public function createBlockchainBotIotsuccessProductMcp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime);
    }

    /**
     * Description: G07 创建MCP站点，保存前校验
     * Summary: G07 创建MCP站点，保存前校验
     * @param CreateBlockchainBotIotsuccessProductMcpRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBlockchainBotIotsuccessProductMcpResponse
     */
    public function createBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBlockchainBotIotsuccessProductMcpResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G08 更新本租户MCP，headers整体替换，省略保持
     * Summary: G08 更新本租户MCP，headers整体替换，省略保持
     * @param UpdateBlockchainBotIotsuccessProductMcpRequest $request
     * @return UpdateBlockchainBotIotsuccessProductMcpResponse
     */
    public function updateBlockchainBotIotsuccessProductMcp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime);
    }

    /**
     * Description: G08 更新本租户MCP，headers整体替换，省略保持
     * Summary: G08 更新本租户MCP，headers整体替换，省略保持
     * @param UpdateBlockchainBotIotsuccessProductMcpRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBlockchainBotIotsuccessProductMcpResponse
     */
    public function updateBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBlockchainBotIotsuccessProductMcpResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G09 被产品或智能体引用不可删除
     * Summary: G09 被产品或智能体引用不可删除
     * @param DeleteBlockchainBotIotsuccessProductMcpRequest $request
     * @return DeleteBlockchainBotIotsuccessProductMcpResponse
     */
    public function deleteBlockchainBotIotsuccessProductMcp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime);
    }

    /**
     * Description: G09 被产品或智能体引用不可删除
     * Summary: G09 被产品或智能体引用不可删除
     * @param DeleteBlockchainBotIotsuccessProductMcpRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteBlockchainBotIotsuccessProductMcpResponse
     */
    public function deleteBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteBlockchainBotIotsuccessProductMcpResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: G10 校验wss可达与鉴权，不持久化输入
     * Summary: G10 校验wss可达与鉴权，不持久化输入
     * @param ValidateBlockchainBotIotsuccessProductMcpRequest $request
     * @return ValidateBlockchainBotIotsuccessProductMcpResponse
     */
    public function validateBlockchainBotIotsuccessProductMcp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->validateBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime);
    }

    /**
     * Description: G10 校验wss可达与鉴权，不持久化输入
     * Summary: G10 校验wss可达与鉴权，不持久化输入
     * @param ValidateBlockchainBotIotsuccessProductMcpRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ValidateBlockchainBotIotsuccessProductMcpResponse
     */
    public function validateBlockchainBotIotsuccessProductMcpEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ValidateBlockchainBotIotsuccessProductMcpResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.validate", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: D01 调用已有设备导入，返回成功/已有/无效名单
     * Summary: D01 调用已有设备导入，返回成功/已有/无效名单
     * @param ImportBlockchainBotIotsuccessProductDeviceRequest $request
     * @return ImportBlockchainBotIotsuccessProductDeviceResponse
     */
    public function importBlockchainBotIotsuccessProductDevice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->importBlockchainBotIotsuccessProductDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: D01 调用已有设备导入，返回成功/已有/无效名单
     * Summary: D01 调用已有设备导入，返回成功/已有/无效名单
     * @param ImportBlockchainBotIotsuccessProductDeviceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ImportBlockchainBotIotsuccessProductDeviceResponse
     */
    public function importBlockchainBotIotsuccessProductDeviceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ImportBlockchainBotIotsuccessProductDeviceResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.device.import", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态
     * @param StatusBlockchainBotIotsuccessProductDeviceImportRequest $request
     * @return StatusBlockchainBotIotsuccessProductDeviceImportResponse
     */
    public function statusBlockchainBotIotsuccessProductDeviceImport($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->statusBlockchainBotIotsuccessProductDeviceImportEx($request, $headers, $runtime);
    }

    /**
     * Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态
     * @param StatusBlockchainBotIotsuccessProductDeviceImportRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StatusBlockchainBotIotsuccessProductDeviceImportResponse
     */
    public function statusBlockchainBotIotsuccessProductDeviceImportEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StatusBlockchainBotIotsuccessProductDeviceImportResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.device.import.status", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K01 创建知识库
     * Summary: K01 创建知识库
     * @param CreateBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @return CreateBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function createBlockchainBotIotsuccessProductKnowledgebase($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime);
    }

    /**
     * Description: K01 创建知识库
     * Summary: K01 创建知识库
     * @param CreateBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function createBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBlockchainBotIotsuccessProductKnowledgebaseResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K02 按名称类型分页
     * Summary: K02 按名称类型分页
     * @param ListBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @return ListBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function listBlockchainBotIotsuccessProductKnowledgebase($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime);
    }

    /**
     * Description: K02 按名称类型分页
     * Summary: K02 按名称类型分页
     * @param ListBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function listBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductKnowledgebaseResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K03 基本信息、内容统计、关联产品
     * Summary: K03 基本信息、内容统计、关联产品
     * @param DetailBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @return DetailBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function detailBlockchainBotIotsuccessProductKnowledgebase($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->detailBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime);
    }

    /**
     * Description: K03 基本信息、内容统计、关联产品
     * Summary: K03 基本信息、内容统计、关联产品
     * @param DetailBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DetailBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function detailBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DetailBlockchainBotIotsuccessProductKnowledgebaseResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.detail", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K04 更新名称描述
     * Summary: K04 更新名称描述
     * @param UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @return UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function updateBlockchainBotIotsuccessProductKnowledgebase($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime);
    }

    /**
     * Description: K04 更新名称描述
     * Summary: K04 更新名称描述
     * @param UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function updateBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K05 被产品绑定不可删
     * Summary: K05 被产品绑定不可删
     * @param DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @return DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function deleteBlockchainBotIotsuccessProductKnowledgebase($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime);
    }

    /**
     * Description: K05 被产品绑定不可删
     * Summary: K05 被产品绑定不可删
     * @param DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse
     */
    public function deleteBlockchainBotIotsuccessProductKnowledgebaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K06 创建已有知识文档并交给现有解析链
     * Summary: K06 创建已有知识文档并交给现有解析链
     * @param UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest $request
     * @return UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse
     */
    public function uploadBlockchainBotIotsuccessProductKnowledgebaseContent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadBlockchainBotIotsuccessProductKnowledgebaseContentEx($request, $headers, $runtime);
    }

    /**
     * Description: K06 创建已有知识文档并交给现有解析链
     * Summary: K06 创建已有知识文档并交给现有解析链
     * @param UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse
     */
    public function uploadBlockchainBotIotsuccessProductKnowledgebaseContentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.content.upload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K07 按kbId/docId查询已有文档解析状态
     * Summary: K07 按kbId/docId查询已有文档解析状态
     * @param StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest $request
     * @return StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse
     */
    public function statusBlockchainBotIotsuccessProductKnowledgebaseContent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->statusBlockchainBotIotsuccessProductKnowledgebaseContentEx($request, $headers, $runtime);
    }

    /**
     * Description: K07 按kbId/docId查询已有文档解析状态
     * Summary: K07 按kbId/docId查询已有文档解析状态
     * @param StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse
     */
    public function statusBlockchainBotIotsuccessProductKnowledgebaseContentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.content.status", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K08 调用已有文档删除与索引清理
     * Summary: K08 调用已有文档删除与索引清理
     * @param DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest $request
     * @return DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse
     */
    public function deleteBlockchainBotIotsuccessProductKnowledgebaseContent($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteBlockchainBotIotsuccessProductKnowledgebaseContentEx($request, $headers, $runtime);
    }

    /**
     * Description: K08 调用已有文档删除与索引清理
     * Summary: K08 调用已有文档删除与索引清理
     * @param DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse
     */
    public function deleteBlockchainBotIotsuccessProductKnowledgebaseContentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.content.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K09 关键词、意图、实体组合触发
     * Summary: K09 关键词、意图、实体组合触发
     * @param SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest $request
     * @return SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse
     */
    public function setBlockchainBotIotsuccessProductKnowledgebaseTrigger($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->setBlockchainBotIotsuccessProductKnowledgebaseTriggerEx($request, $headers, $runtime);
    }

    /**
     * Description: K09 关键词、意图、实体组合触发
     * Summary: K09 关键词、意图、实体组合触发
     * @param SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse
     */
    public function setBlockchainBotIotsuccessProductKnowledgebaseTriggerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.trigger.set", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: K10 已生效版本召回测试
     * Summary: K10 已生效版本召回测试
     * @param TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest $request
     * @return TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse
     */
    public function testBlockchainBotIotsuccessProductKnowledgebaseRecall($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->testBlockchainBotIotsuccessProductKnowledgebaseRecallEx($request, $headers, $runtime);
    }

    /**
     * Description: K10 已生效版本召回测试
     * Summary: K10 已生效版本召回测试
     * @param TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse
     */
    public function testBlockchainBotIotsuccessProductKnowledgebaseRecallEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.recall.test", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Q01 License码、激活状态、设备、消耗与剩余
     * Summary: Q01 License码、激活状态、设备、消耗与剩余
     * @param ListBlockchainBotIotsuccessProductLicenseRequest $request
     * @return ListBlockchainBotIotsuccessProductLicenseResponse
     */
    public function listBlockchainBotIotsuccessProductLicense($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductLicenseEx($request, $headers, $runtime);
    }

    /**
     * Description: Q01 License码、激活状态、设备、消耗与剩余
     * Summary: Q01 License码、激活状态、设备、消耗与剩余
     * @param ListBlockchainBotIotsuccessProductLicenseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductLicenseResponse
     */
    public function listBlockchainBotIotsuccessProductLicenseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductLicenseResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.license.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Q02 额度总览，带单位和数据时间
     * Summary: Q02 额度总览，带单位和数据时间
     * @param OverviewBlockchainBotIotsuccessProductQuotaRequest $request
     * @return OverviewBlockchainBotIotsuccessProductQuotaResponse
     */
    public function overviewBlockchainBotIotsuccessProductQuota($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->overviewBlockchainBotIotsuccessProductQuotaEx($request, $headers, $runtime);
    }

    /**
     * Description: Q02 额度总览，带单位和数据时间
     * Summary: Q02 额度总览，带单位和数据时间
     * @param OverviewBlockchainBotIotsuccessProductQuotaRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return OverviewBlockchainBotIotsuccessProductQuotaResponse
     */
    public function overviewBlockchainBotIotsuccessProductQuotaEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return OverviewBlockchainBotIotsuccessProductQuotaResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.quota.overview", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
     * Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
     * @param ListBlockchainBotIotsuccessProductQuotaConsumptionRequest $request
     * @return ListBlockchainBotIotsuccessProductQuotaConsumptionResponse
     */
    public function listBlockchainBotIotsuccessProductQuotaConsumption($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listBlockchainBotIotsuccessProductQuotaConsumptionEx($request, $headers, $runtime);
    }

    /**
     * Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
     * Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
     * @param ListBlockchainBotIotsuccessProductQuotaConsumptionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListBlockchainBotIotsuccessProductQuotaConsumptionResponse
     */
    public function listBlockchainBotIotsuccessProductQuotaConsumptionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListBlockchainBotIotsuccessProductQuotaConsumptionResponse::fromMap($this->doRequest("1.0", "blockchain.bot.iotsuccess.product.quota.consumption.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态
     * @param StatusBlockchainBotIoaProductDeviceImportRequest $request
     * @return StatusBlockchainBotIoaProductDeviceImportResponse
     */
    public function statusBlockchainBotIoaProductDeviceImport($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->statusBlockchainBotIoaProductDeviceImportEx($request, $headers, $runtime);
    }

    /**
     * Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态
     * @param StatusBlockchainBotIoaProductDeviceImportRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StatusBlockchainBotIoaProductDeviceImportResponse
     */
    public function statusBlockchainBotIoaProductDeviceImportEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StatusBlockchainBotIoaProductDeviceImportResponse::fromMap($this->doRequest("1.0", "blockchain.bot.ioa.product.device.import.status", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
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
