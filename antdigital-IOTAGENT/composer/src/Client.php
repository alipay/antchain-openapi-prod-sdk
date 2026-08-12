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
                    "sdk_version" => "1.2.3",
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
}
