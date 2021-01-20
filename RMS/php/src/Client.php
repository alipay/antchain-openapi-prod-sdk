<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\RMS\Models\QueryRmsAgentloglocateRequest;
use AntChain\RMS\Models\QueryRmsAgentloglocateResponse;
use AntChain\RMS\Models\QueryRmsAgenttailRequest;
use AntChain\RMS\Models\QueryRmsAgenttailResponse;
use AntChain\RMS\Models\QueryRmsAgentbrowserRequest;
use AntChain\RMS\Models\QueryRmsAgentbrowserResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistorytypeRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistorytypeResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistorylevelRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistorylevelResponse;
use AntChain\RMS\Models\QueryRmsNotifyhistoryRequest;
use AntChain\RMS\Models\QueryRmsNotifyhistoryResponse;
use AntChain\RMS\Models\QueryRmsStackentityRequest;
use AntChain\RMS\Models\QueryRmsStackentityResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappcountRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappcountResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappstatsRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappstatsResponse;
use AntChain\RMS\Models\QueryRmsAppstatspageableRequest;
use AntChain\RMS\Models\QueryRmsAppstatspageableResponse;
use AntChain\RMS\Models\QueryRmsLogreaderrorRequest;
use AntChain\RMS\Models\QueryRmsLogreaderrorResponse;
use AntChain\RMS\Models\QueryRmsUniversalreadRequest;
use AntChain\RMS\Models\QueryRmsUniversalreadResponse;
use AntChain\RMS\Models\QueryRmsUniversalwriteRequest;
use AntChain\RMS\Models\QueryRmsUniversalwriteResponse;
use AntChain\RMS\Models\CreateRmsPluginRequest;
use AntChain\RMS\Models\CreateRmsPluginResponse;
use AntChain\RMS\Models\DeleteRmsPluginRequest;
use AntChain\RMS\Models\DeleteRmsPluginResponse;
use AntChain\RMS\Models\CloseRmsPluginRequest;
use AntChain\RMS\Models\CloseRmsPluginResponse;
use AntChain\RMS\Models\OpenRmsPluginRequest;
use AntChain\RMS\Models\OpenRmsPluginResponse;
use AntChain\RMS\Models\UpdateRmsPluginRequest;
use AntChain\RMS\Models\UpdateRmsPluginResponse;
use AntChain\RMS\Models\QueryRmsPluginbytypeRequest;
use AntChain\RMS\Models\QueryRmsPluginbytypeResponse;
use AntChain\RMS\Models\QueryRmsPluginbyfolderRequest;
use AntChain\RMS\Models\QueryRmsPluginbyfolderResponse;
use AntChain\RMS\Models\QueryRmsPluginRequest;
use AntChain\RMS\Models\QueryRmsPluginResponse;
use AntChain\RMS\Models\QueryRmsPlugintestRequest;
use AntChain\RMS\Models\QueryRmsPlugintestResponse;
use AntChain\RMS\Models\QueryRmsPathRequest;
use AntChain\RMS\Models\QueryRmsPathResponse;
use AntChain\RMS\Models\ExecRmsUniversalcleankeyRequest;
use AntChain\RMS\Models\ExecRmsUniversalcleankeyResponse;
use AntChain\RMS\Models\QueryRmsUniversalRequest;
use AntChain\RMS\Models\QueryRmsUniversalResponse;
use AntChain\RMS\Models\QueryRmsTracespanRequest;
use AntChain\RMS\Models\QueryRmsTracespanResponse;
use AntChain\RMS\Models\GetRmsTracespanqueryconfigRequest;
use AntChain\RMS\Models\GetRmsTracespanqueryconfigResponse;
use AntChain\RMS\Models\DescribeRmsTracetreeRequest;
use AntChain\RMS\Models\DescribeRmsTracetreeResponse;
use AntChain\RMS\Models\CallbackSpiCompletecommodityRequest;
use AntChain\RMS\Models\CallbackSpiCompletecommodityResponse;
use AntChain\RMS\Models\CallbackSpiPayordercallbackRequest;
use AntChain\RMS\Models\CallbackSpiPayordercallbackResponse;
use AntChain\RMS\Models\CallbackSpiCompleteorderparamRequest;
use AntChain\RMS\Models\CallbackSpiCompleteorderparamResponse;
use AntChain\RMS\Models\CallbackSpiVerifyRequest;
use AntChain\RMS\Models\CallbackSpiVerifyResponse;
use AntChain\RMS\Models\CallbackSpiRefundRequest;
use AntChain\RMS\Models\CallbackSpiRefundResponse;
use AntChain\RMS\Models\CallbackSpiLifecycleRequest;
use AntChain\RMS\Models\CallbackSpiLifecycleResponse;
use AntChain\RMS\Models\DescribeRmsTimeseriesmetricsRequest;
use AntChain\RMS\Models\DescribeRmsTimeseriesmetricsResponse;
use AntChain\RMS\Models\DescribeRmsTopologyRequest;
use AntChain\RMS\Models\DescribeRmsTopologyResponse;
use AntChain\RMS\Models\QueryMetricsRequest;
use AntChain\RMS\Models\QueryMetricsResponse;
use AntChain\RMS\Models\QueryTraceSpanRequest;
use AntChain\RMS\Models\QueryTraceSpanResponse;
use AntChain\RMS\Models\ListAppRequest;
use AntChain\RMS\Models\ListAppResponse;
use AntChain\RMS\Models\CreateCustompluginRequest;
use AntChain\RMS\Models\CreateCustompluginResponse;
use AntChain\RMS\Models\DeleteCustompluginRequest;
use AntChain\RMS\Models\DeleteCustompluginResponse;
use AntChain\RMS\Models\CreateFolderRequest;
use AntChain\RMS\Models\CreateFolderResponse;
use AntChain\RMS\Models\UpdateFolderRequest;
use AntChain\RMS\Models\UpdateFolderResponse;
use AntChain\RMS\Models\QueryTraceConfigRequest;
use AntChain\RMS\Models\QueryTraceConfigResponse;
use AntChain\RMS\Models\QueryFolderPathRequest;
use AntChain\RMS\Models\QueryFolderPathResponse;
use AntChain\RMS\Models\QueryTraceDetailRequest;
use AntChain\RMS\Models\QueryTraceDetailResponse;
use AntChain\RMS\Models\QueryTraceTopologyRequest;
use AntChain\RMS\Models\QueryTraceTopologyResponse;
use AntChain\RMS\Models\QueryTraceMetricsRequest;
use AntChain\RMS\Models\QueryTraceMetricsResponse;
use AntChain\RMS\Models\GetCustompluginRequest;
use AntChain\RMS\Models\GetCustompluginResponse;

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
        $this->_readTimeout = $config->readTimeout;
        $this->_connectTimeout = $config->connectTimeout;
        $this->_httpProxy = $config->httpProxy;
        $this->_httpsProxy = $config->httpsProxy;
        $this->_noProxy = $config->noProxy;
        $this->_socks5Proxy = $config->socks5Proxy;
        $this->_socks5NetWork = $config->socks5NetWork;
        $this->_maxIdleConns = $config->maxIdleConns;
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
            "retry" => [
                "retryable" => $runtime->autoretry,
                "maxAttempts" => Utils::defaultNumber($runtime->maxAttempts, 3)
            ],
            "backoff" => [
                "policy" => Utils::defaultString($runtime->backoffPolicy, "no"),
                "period" => Utils::defaultNumber($runtime->backoffPeriod, 1)
            ],
            "ignoreSSL" => $runtime->ignoreSSL,
            // AiExtraAttr
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
                    "sdk_version" => "1.1.0"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    "host" => Utils::defaultString($this->_endpoint, "undefined"),
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
     * Description: /agent/logLocate
     * Summary: /agent/logLocate
     * @param QueryRmsAgentloglocateRequest $request
     * @return QueryRmsAgentloglocateResponse
     */
    public function queryRmsAgentloglocate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAgentloglocateEx($request, $headers, $runtime);
    }

    /**
     * Description: /agent/logLocate
     * Summary: /agent/logLocate
     * @param QueryRmsAgentloglocateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAgentloglocateResponse
     */
    public function queryRmsAgentloglocateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAgentloglocateResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.agentloglocate.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /agent/tail
     * Summary: /agent/tail
     * @param QueryRmsAgenttailRequest $request
     * @return QueryRmsAgenttailResponse
     */
    public function queryRmsAgenttail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAgenttailEx($request, $headers, $runtime);
    }

    /**
     * Description: /agent/tail
     * Summary: /agent/tail
     * @param QueryRmsAgenttailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAgenttailResponse
     */
    public function queryRmsAgenttailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAgenttailResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.agenttail.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /agent/browser
     * Summary: /agent/browser
     * @param QueryRmsAgentbrowserRequest $request
     * @return QueryRmsAgentbrowserResponse
     */
    public function queryRmsAgentbrowser($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAgentbrowserEx($request, $headers, $runtime);
    }

    /**
     * Description: /agent/browser
     * Summary: /agent/browser
     * @param QueryRmsAgentbrowserRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAgentbrowserResponse
     */
    public function queryRmsAgentbrowserEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAgentbrowserResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.agentbrowser.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: rms.alarmhistorytype.query
     * Summary: alarmTypeStats
     * @param QueryRmsAlarmhistorytypeRequest $request
     * @return QueryRmsAlarmhistorytypeResponse
     */
    public function queryRmsAlarmhistorytype($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAlarmhistorytypeEx($request, $headers, $runtime);
    }

    /**
     * Description: rms.alarmhistorytype.query
     * Summary: alarmTypeStats
     * @param QueryRmsAlarmhistorytypeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAlarmhistorytypeResponse
     */
    public function queryRmsAlarmhistorytypeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAlarmhistorytypeResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.alarmhistorytype.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: alarmLevelStats
     * Summary: alarmLevelStats
     * @param QueryRmsAlarmhistorylevelRequest $request
     * @return QueryRmsAlarmhistorylevelResponse
     */
    public function queryRmsAlarmhistorylevel($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAlarmhistorylevelEx($request, $headers, $runtime);
    }

    /**
     * Description: alarmLevelStats
     * Summary: alarmLevelStats
     * @param QueryRmsAlarmhistorylevelRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAlarmhistorylevelResponse
     */
    public function queryRmsAlarmhistorylevelEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAlarmhistorylevelResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.alarmhistorylevel.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /stats/notify/history
     * Summary: notifyHistoryStatsV2
     * @param QueryRmsNotifyhistoryRequest $request
     * @return QueryRmsNotifyhistoryResponse
     */
    public function queryRmsNotifyhistory($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsNotifyhistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: /stats/notify/history
     * Summary: notifyHistoryStatsV2
     * @param QueryRmsNotifyhistoryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsNotifyhistoryResponse
     */
    public function queryRmsNotifyhistoryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsNotifyhistoryResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.notifyhistory.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /stats/stack/entity
     * Summary: stackEntityStats
     * @param QueryRmsStackentityRequest $request
     * @return QueryRmsStackentityResponse
     */
    public function queryRmsStackentity($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsStackentityEx($request, $headers, $runtime);
    }

    /**
     * Description: /stats/stack/entity
     * Summary: stackEntityStats
     * @param QueryRmsStackentityRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsStackentityResponse
     */
    public function queryRmsStackentityEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsStackentityResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.stackentity.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /stats/alarm/history/appCount
     * Summary: alarmHistoryAppCount
     * @param QueryRmsAlarmhistoryappcountRequest $request
     * @return QueryRmsAlarmhistoryappcountResponse
     */
    public function queryRmsAlarmhistoryappcount($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAlarmhistoryappcountEx($request, $headers, $runtime);
    }

    /**
     * Description: /stats/alarm/history/appCount
     * Summary: alarmHistoryAppCount
     * @param QueryRmsAlarmhistoryappcountRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAlarmhistoryappcountResponse
     */
    public function queryRmsAlarmhistoryappcountEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAlarmhistoryappcountResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.alarmhistoryappcount.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /alarm/history/appStats
     * Summary: alarmHistoryAppStats
     * @param QueryRmsAlarmhistoryappstatsRequest $request
     * @return QueryRmsAlarmhistoryappstatsResponse
     */
    public function queryRmsAlarmhistoryappstats($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAlarmhistoryappstatsEx($request, $headers, $runtime);
    }

    /**
     * Description: /alarm/history/appStats
     * Summary: alarmHistoryAppStats
     * @param QueryRmsAlarmhistoryappstatsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAlarmhistoryappstatsResponse
     */
    public function queryRmsAlarmhistoryappstatsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAlarmhistoryappstatsResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.alarmhistoryappstats.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /alarm/history/appStatsPageable
     * Summary: appstatspageable
     * @param QueryRmsAppstatspageableRequest $request
     * @return QueryRmsAppstatspageableResponse
     */
    public function queryRmsAppstatspageable($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsAppstatspageableEx($request, $headers, $runtime);
    }

    /**
     * Description: /alarm/history/appStatsPageable
     * Summary: appstatspageable
     * @param QueryRmsAppstatspageableRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsAppstatspageableResponse
     */
    public function queryRmsAppstatspageableEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsAppstatspageableResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.appstatspageable.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /logread/error
     * Summary: /logread/error
     * @param QueryRmsLogreaderrorRequest $request
     * @return QueryRmsLogreaderrorResponse
     */
    public function queryRmsLogreaderror($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsLogreaderrorEx($request, $headers, $runtime);
    }

    /**
     * Description: /logread/error
     * Summary: /logread/error
     * @param QueryRmsLogreaderrorRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsLogreaderrorResponse
     */
    public function queryRmsLogreaderrorEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsLogreaderrorResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.logreaderror.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /universal/read
     * Summary: /universal/read
     * @param QueryRmsUniversalreadRequest $request
     * @return QueryRmsUniversalreadResponse
     */
    public function queryRmsUniversalread($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsUniversalreadEx($request, $headers, $runtime);
    }

    /**
     * Description: /universal/read
     * Summary: /universal/read
     * @param QueryRmsUniversalreadRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsUniversalreadResponse
     */
    public function queryRmsUniversalreadEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsUniversalreadResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.universalread.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /universal/write
     * Summary: /universal/write
     * @param QueryRmsUniversalwriteRequest $request
     * @return QueryRmsUniversalwriteResponse
     */
    public function queryRmsUniversalwrite($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsUniversalwriteEx($request, $headers, $runtime);
    }

    /**
     * Description: /universal/write
     * Summary: /universal/write
     * @param QueryRmsUniversalwriteRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsUniversalwriteResponse
     */
    public function queryRmsUniversalwriteEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsUniversalwriteResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.universalwrite.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/create
     * Summary: create
     * @param CreateRmsPluginRequest $request
     * @return CreateRmsPluginResponse
     */
    public function createRmsPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/create
     * Summary: create
     * @param CreateRmsPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateRmsPluginResponse
     */
    public function createRmsPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateRmsPluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.plugin.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/delete
     * Summary: delete
     * @param DeleteRmsPluginRequest $request
     * @return DeleteRmsPluginResponse
     */
    public function deleteRmsPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/delete
     * Summary: delete
     * @param DeleteRmsPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteRmsPluginResponse
     */
    public function deleteRmsPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteRmsPluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.plugin.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/close
     * Summary: close
     * @param CloseRmsPluginRequest $request
     * @return CloseRmsPluginResponse
     */
    public function closeRmsPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->closeRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/close
     * Summary: close
     * @param CloseRmsPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CloseRmsPluginResponse
     */
    public function closeRmsPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CloseRmsPluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.plugin.close", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/open
     * Summary: open
     * @param OpenRmsPluginRequest $request
     * @return OpenRmsPluginResponse
     */
    public function openRmsPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->openRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/open
     * Summary: open
     * @param OpenRmsPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return OpenRmsPluginResponse
     */
    public function openRmsPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return OpenRmsPluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.plugin.open", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/update
     * Summary: update
     * @param UpdateRmsPluginRequest $request
     * @return UpdateRmsPluginResponse
     */
    public function updateRmsPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/update
     * Summary: update
     * @param UpdateRmsPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateRmsPluginResponse
     */
    public function updateRmsPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateRmsPluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.plugin.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/queryByPluginType
     * Summary: queryByPluginType
     * @param QueryRmsPluginbytypeRequest $request
     * @return QueryRmsPluginbytypeResponse
     */
    public function queryRmsPluginbytype($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsPluginbytypeEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/queryByPluginType
     * Summary: queryByPluginType
     * @param QueryRmsPluginbytypeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsPluginbytypeResponse
     */
    public function queryRmsPluginbytypeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsPluginbytypeResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.pluginbytype.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/queryByFolder
     * Summary: queryByFolder
     * @param QueryRmsPluginbyfolderRequest $request
     * @return QueryRmsPluginbyfolderResponse
     */
    public function queryRmsPluginbyfolder($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsPluginbyfolderEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/queryByFolder
     * Summary: queryByFolder
     * @param QueryRmsPluginbyfolderRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsPluginbyfolderResponse
     */
    public function queryRmsPluginbyfolderEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsPluginbyfolderResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.pluginbyfolder.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/query
     * Summary: query
     * @param QueryRmsPluginRequest $request
     * @return QueryRmsPluginResponse
     */
    public function queryRmsPlugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/query
     * Summary: query
     * @param QueryRmsPluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsPluginResponse
     */
    public function queryRmsPluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsPluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.plugin.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/querytest
     * Summary: querytest
     * @param QueryRmsPlugintestRequest $request
     * @return QueryRmsPlugintestResponse
     */
    public function queryRmsPlugintest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsPlugintestEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/querytest
     * Summary: querytest
     * @param QueryRmsPlugintestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsPlugintestResponse
     */
    public function queryRmsPlugintestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsPlugintestResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.plugintest.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/folder/path
     * Summary: queryPath
     * @param QueryRmsPathRequest $request
     * @return QueryRmsPathResponse
     */
    public function queryRmsPath($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsPathEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/folder/path
     * Summary: queryPath
     * @param QueryRmsPathRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsPathResponse
     */
    public function queryRmsPathEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsPathResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.path.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /{tenantId}/webapi/cleankey
     * Summary: cleankey
     * @param ExecRmsUniversalcleankeyRequest $request
     * @return ExecRmsUniversalcleankeyResponse
     */
    public function execRmsUniversalcleankey($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execRmsUniversalcleankeyEx($request, $headers, $runtime);
    }

    /**
     * Description: /{tenantId}/webapi/cleankey
     * Summary: cleankey
     * @param ExecRmsUniversalcleankeyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecRmsUniversalcleankeyResponse
     */
    public function execRmsUniversalcleankeyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecRmsUniversalcleankeyResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.universalcleankey.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /{tenantId}/universalQuery
     * Summary: universalQuery
     * @param QueryRmsUniversalRequest $request
     * @return QueryRmsUniversalResponse
     */
    public function queryRmsUniversal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsUniversalEx($request, $headers, $runtime);
    }

    /**
     * Description: /{tenantId}/universalQuery
     * Summary: universalQuery
     * @param QueryRmsUniversalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsUniversalResponse
     */
    public function queryRmsUniversalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsUniversalResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.universal.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链路搜索
     * Summary: 链路搜索
     * @param QueryRmsTracespanRequest $request
     * @return QueryRmsTracespanResponse
     */
    public function queryRmsTracespan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRmsTracespanEx($request, $headers, $runtime);
    }

    /**
     * Description: 链路搜索
     * Summary: 链路搜索
     * @param QueryRmsTracespanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRmsTracespanResponse
     */
    public function queryRmsTracespanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRmsTracespanResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.tracespan.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链路搜索页面的配置
     * Summary: 查询链路搜索页面的配置
     * @param GetRmsTracespanqueryconfigRequest $request
     * @return GetRmsTracespanqueryconfigResponse
     */
    public function getRmsTracespanqueryconfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getRmsTracespanqueryconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链路搜索页面的配置
     * Summary: 查询链路搜索页面的配置
     * @param GetRmsTracespanqueryconfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetRmsTracespanqueryconfigResponse
     */
    public function getRmsTracespanqueryconfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetRmsTracespanqueryconfigResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.tracespanqueryconfig.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单链路树状图查询
     * Summary: 单链路树状图查询
     * @param DescribeRmsTracetreeRequest $request
     * @return DescribeRmsTracetreeResponse
     */
    public function describeRmsTracetree($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->describeRmsTracetreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 单链路树状图查询
     * Summary: 单链路树状图查询
     * @param DescribeRmsTracetreeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DescribeRmsTracetreeResponse
     */
    public function describeRmsTracetreeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DescribeRmsTracetreeResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.tracetree.describe", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 商品补全接口
     * Summary: 南天门 - 商品补全接口
     * @param CallbackSpiCompletecommodityRequest $request
     * @return CallbackSpiCompletecommodityResponse
     */
    public function callbackSpiCompletecommodity($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackSpiCompletecommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 商品补全接口
     * Summary: 南天门 - 商品补全接口
     * @param CallbackSpiCompletecommodityRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackSpiCompletecommodityResponse
     */
    public function callbackSpiCompletecommodityEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackSpiCompletecommodityResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.spi.completecommodity.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 支付后回调
     * Summary: 南天门 - 支付后回调
     * @param CallbackSpiPayordercallbackRequest $request
     * @return CallbackSpiPayordercallbackResponse
     */
    public function callbackSpiPayordercallback($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackSpiPayordercallbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 支付后回调
     * Summary: 南天门 - 支付后回调
     * @param CallbackSpiPayordercallbackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackSpiPayordercallbackResponse
     */
    public function callbackSpiPayordercallbackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackSpiPayordercallbackResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.spi.payordercallback.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 补全订单
     * Summary: 南天门 - 补全订单
     * @param CallbackSpiCompleteorderparamRequest $request
     * @return CallbackSpiCompleteorderparamResponse
     */
    public function callbackSpiCompleteorderparam($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackSpiCompleteorderparamEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 补全订单
     * Summary: 南天门 - 补全订单
     * @param CallbackSpiCompleteorderparamRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackSpiCompleteorderparamResponse
     */
    public function callbackSpiCompleteorderparamEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackSpiCompleteorderparamResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.spi.completeorderparam.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 订单校验回调
     * Summary: 南天门 - 订单校验回调
     * @param CallbackSpiVerifyRequest $request
     * @return CallbackSpiVerifyResponse
     */
    public function callbackSpiVerify($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackSpiVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 订单校验回调
     * Summary: 南天门 - 订单校验回调
     * @param CallbackSpiVerifyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackSpiVerifyResponse
     */
    public function callbackSpiVerifyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackSpiVerifyResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.spi.verify.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 退款
     * Summary: 南天门 - 退款
     * @param CallbackSpiRefundRequest $request
     * @return CallbackSpiRefundResponse
     */
    public function callbackSpiRefund($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackSpiRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 退款
     * Summary: 南天门 - 退款
     * @param CallbackSpiRefundRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackSpiRefundResponse
     */
    public function callbackSpiRefundEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackSpiRefundResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.spi.refund.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 商品实例生命周期回调
     * Summary: 南天门 - 商品实例生命周期回调
     * @param CallbackSpiLifecycleRequest $request
     * @return CallbackSpiLifecycleResponse
     */
    public function callbackSpiLifecycle($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackSpiLifecycleEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 商品实例生命周期回调
     * Summary: 南天门 - 商品实例生命周期回调
     * @param CallbackSpiLifecycleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackSpiLifecycleResponse
     */
    public function callbackSpiLifecycleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackSpiLifecycleResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.spi.lifecycle.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询时序指标
     * Summary: 查询时序指标
     * @param DescribeRmsTimeseriesmetricsRequest $request
     * @return DescribeRmsTimeseriesmetricsResponse
     */
    public function describeRmsTimeseriesmetrics($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->describeRmsTimeseriesmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询时序指标
     * Summary: 查询时序指标
     * @param DescribeRmsTimeseriesmetricsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DescribeRmsTimeseriesmetricsResponse
     */
    public function describeRmsTimeseriesmetricsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DescribeRmsTimeseriesmetricsResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.timeseriesmetrics.describe", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取调用拓扑
     * Summary: 获取调用拓扑
     * @param DescribeRmsTopologyRequest $request
     * @return DescribeRmsTopologyResponse
     */
    public function describeRmsTopology($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->describeRmsTopologyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取调用拓扑
     * Summary: 获取调用拓扑
     * @param DescribeRmsTopologyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DescribeRmsTopologyResponse
     */
    public function describeRmsTopologyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DescribeRmsTopologyResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.rms.topology.describe", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监控指标数据查询
     * Summary: 监控指标数据查询
     * @param QueryMetricsRequest $request
     * @return QueryMetricsResponse
     */
    public function queryMetrics($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 监控指标数据查询
     * Summary: 监控指标数据查询
     * @param QueryMetricsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMetricsResponse
     */
    public function queryMetricsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMetricsResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.metrics.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链路Span查询搜索
     * Summary: 链路查询
     * @param QueryTraceSpanRequest $request
     * @return QueryTraceSpanResponse
     */
    public function queryTraceSpan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryTraceSpanEx($request, $headers, $runtime);
    }

    /**
     * Description: 链路Span查询搜索
     * Summary: 链路查询
     * @param QueryTraceSpanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryTraceSpanResponse
     */
    public function queryTraceSpanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryTraceSpanResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.trace.span.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表
     * @param ListAppRequest $request
     * @return ListAppResponse
     */
    public function listApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表
     * @param ListAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListAppResponse
     */
    public function listAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListAppResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.app.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建自定义监控指标
     * Summary: 创建自定义监控指标
     * @param CreateCustompluginRequest $request
     * @return CreateCustompluginResponse
     */
    public function createCustomplugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建自定义监控指标
     * Summary: 创建自定义监控指标
     * @param CreateCustompluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateCustompluginResponse
     */
    public function createCustompluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateCustompluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.customplugin.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除自定义监控指标
     * Summary: 删除自定义监控指标
     * @param DeleteCustompluginRequest $request
     * @return DeleteCustompluginResponse
     */
    public function deleteCustomplugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除自定义监控指标
     * Summary: 删除自定义监控指标
     * @param DeleteCustompluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteCustompluginResponse
     */
    public function deleteCustompluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteCustompluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.customplugin.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自定义监控 - 添加文件夹
     * Summary: 自定义监控 - 添加文件夹
     * @param CreateFolderRequest $request
     * @return CreateFolderResponse
     */
    public function createFolder($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createFolderEx($request, $headers, $runtime);
    }

    /**
     * Description: 自定义监控 - 添加文件夹
     * Summary: 自定义监控 - 添加文件夹
     * @param CreateFolderRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateFolderResponse
     */
    public function createFolderEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateFolderResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.folder.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自定义监控 - 文件夹更新
     * Summary: 自定义监控 - 文件夹更新
     * @param UpdateFolderRequest $request
     * @return UpdateFolderResponse
     */
    public function updateFolder($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateFolderEx($request, $headers, $runtime);
    }

    /**
     * Description: 自定义监控 - 文件夹更新
     * Summary: 自定义监控 - 文件夹更新
     * @param UpdateFolderRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateFolderResponse
     */
    public function updateFolderEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateFolderResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.folder.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链路查询时可选参数的配置查询
     * Summary: 链路查询时可选参数的配置查询
     * @param QueryTraceConfigRequest $request
     * @return QueryTraceConfigResponse
     */
    public function queryTraceConfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryTraceConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 链路查询时可选参数的配置查询
     * Summary: 链路查询时可选参数的配置查询
     * @param QueryTraceConfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryTraceConfigResponse
     */
    public function queryTraceConfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryTraceConfigResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.trace.config.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询文件夹路径
     * Summary: 查询文件夹路径
     * @param QueryFolderPathRequest $request
     * @return QueryFolderPathResponse
     */
    public function queryFolderPath($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryFolderPathEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询文件夹路径
     * Summary: 查询文件夹路径
     * @param QueryFolderPathRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryFolderPathResponse
     */
    public function queryFolderPathEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryFolderPathResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.folder.path.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链路详情
     * Summary: 查询链路详情
     * @param QueryTraceDetailRequest $request
     * @return QueryTraceDetailResponse
     */
    public function queryTraceDetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryTraceDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链路详情
     * Summary: 查询链路详情
     * @param QueryTraceDetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryTraceDetailResponse
     */
    public function queryTraceDetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryTraceDetailResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.trace.detail.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链路拓扑图
     * Summary: 获取链路拓扑图
     * @param QueryTraceTopologyRequest $request
     * @return QueryTraceTopologyResponse
     */
    public function queryTraceTopology($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryTraceTopologyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链路拓扑图
     * Summary: 获取链路拓扑图
     * @param QueryTraceTopologyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryTraceTopologyResponse
     */
    public function queryTraceTopologyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryTraceTopologyResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.trace.topology.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链路关联指标
     * Summary: 查询链路关联指标
     * @param QueryTraceMetricsRequest $request
     * @return QueryTraceMetricsResponse
     */
    public function queryTraceMetrics($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryTraceMetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链路关联指标
     * Summary: 查询链路关联指标
     * @param QueryTraceMetricsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryTraceMetricsResponse
     */
    public function queryTraceMetricsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryTraceMetricsResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.trace.metrics.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取自定义监控指标详情
     * Summary: 获取自定义监控指标详情
     * @param GetCustompluginRequest $request
     * @return GetCustompluginResponse
     */
    public function getCustomplugin($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取自定义监控指标详情
     * Summary: 获取自定义监控指标详情
     * @param GetCustompluginRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetCustompluginResponse
     */
    public function getCustompluginEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetCustompluginResponse::fromMap($this->doRequest("1.0", "antcloud.monitor.customplugin.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
