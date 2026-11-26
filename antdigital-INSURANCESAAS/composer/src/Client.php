<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCESAAS;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\INSURANCESAAS\Models\UploadAntcloudInsuranceMktFileRequest;
use AntChain\INSURANCESAAS\Models\UploadAntcloudInsuranceMktFileResponse;
use AntChain\INSURANCESAAS\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktEffectRequest;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktEffectResponse;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktLiveeffectRequest;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktLiveeffectResponse;
use AntChain\INSURANCESAAS\Models\ApplyAntcloudInsuranceMktRealtimemktRequest;
use AntChain\INSURANCESAAS\Models\ApplyAntcloudInsuranceMktRealtimemktResponse;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktMonitordataRequest;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktMonitordataResponse;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktMediastatisticaldataRequest;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktMediastatisticaldataResponse;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktEffectsimpleRequest;
use AntChain\INSURANCESAAS\Models\CallbackAntcloudInsuranceMktEffectsimpleResponse;
use AntChain\INSURANCESAAS\Models\ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest;
use AntChain\INSURANCESAAS\Models\ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse;
use AntChain\INSURANCESAAS\Models\GetAntcloudInsuranceMktExtresulturlRequest;
use AntChain\INSURANCESAAS\Models\GetAntcloudInsuranceMktExtresulturlResponse;
use AntChain\INSURANCESAAS\Models\ReceiveAntcloudInsuranceLeadOpportunitiesRequest;
use AntChain\INSURANCESAAS\Models\ReceiveAntcloudInsuranceLeadOpportunitiesResponse;
use AntChain\INSURANCESAAS\Models\PostbackAntcloudInsuranceLeadReceiveRequest;
use AntChain\INSURANCESAAS\Models\PostbackAntcloudInsuranceLeadReceiveResponse;
use AntChain\INSURANCESAAS\Models\CreateAntcloudGatewayxFileUploadResponse;

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
            // 转化数据条目
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
                    "sdk_version" => "1.1.0",
                    "_prod_code" => "INSURANCESAAS",
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
     * Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
     * Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
     * @param UploadAntcloudInsuranceMktFileRequest $request
     * @return UploadAntcloudInsuranceMktFileResponse
     */
    public function uploadAntcloudInsuranceMktFile($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadAntcloudInsuranceMktFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
     * Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
     * @param UploadAntcloudInsuranceMktFileRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadAntcloudInsuranceMktFileResponse
     */
    public function uploadAntcloudInsuranceMktFileEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antcloud.insurance.mkt.file.upload",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $uploadAntcloudInsuranceMktFileResponse = new UploadAntcloudInsuranceMktFileResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $uploadAntcloudInsuranceMktFileResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return UploadAntcloudInsuranceMktFileResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.file.upload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险营销效果回传
     * Summary: 保险营销效果回传
     * @param CallbackAntcloudInsuranceMktEffectRequest $request
     * @return CallbackAntcloudInsuranceMktEffectResponse
     */
    public function callbackAntcloudInsuranceMktEffect($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackAntcloudInsuranceMktEffectEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险营销效果回传
     * Summary: 保险营销效果回传
     * @param CallbackAntcloudInsuranceMktEffectRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackAntcloudInsuranceMktEffectResponse
     */
    public function callbackAntcloudInsuranceMktEffectEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackAntcloudInsuranceMktEffectResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.effect.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险营销效果回传接口——媒体
     * Summary: 保险营销效果回传接口——媒体
     * @param CallbackAntcloudInsuranceMktLiveeffectRequest $request
     * @return CallbackAntcloudInsuranceMktLiveeffectResponse
     */
    public function callbackAntcloudInsuranceMktLiveeffect($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackAntcloudInsuranceMktLiveeffectEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险营销效果回传接口——媒体
     * Summary: 保险营销效果回传接口——媒体
     * @param CallbackAntcloudInsuranceMktLiveeffectRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackAntcloudInsuranceMktLiveeffectResponse
     */
    public function callbackAntcloudInsuranceMktLiveeffectEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackAntcloudInsuranceMktLiveeffectResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.liveeffect.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险实时营销提交
     * Summary: 保险实时营销提交
     * @param ApplyAntcloudInsuranceMktRealtimemktRequest $request
     * @return ApplyAntcloudInsuranceMktRealtimemktResponse
     */
    public function applyAntcloudInsuranceMktRealtimemkt($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->applyAntcloudInsuranceMktRealtimemktEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险实时营销提交
     * Summary: 保险实时营销提交
     * @param ApplyAntcloudInsuranceMktRealtimemktRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApplyAntcloudInsuranceMktRealtimemktResponse
     */
    public function applyAntcloudInsuranceMktRealtimemktEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApplyAntcloudInsuranceMktRealtimemktResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.realtimemkt.apply", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保司营销监测数据回传
     * Summary: 保司营销监测数据回传
     * @param CallbackAntcloudInsuranceMktMonitordataRequest $request
     * @return CallbackAntcloudInsuranceMktMonitordataResponse
     */
    public function callbackAntcloudInsuranceMktMonitordata($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackAntcloudInsuranceMktMonitordataEx($request, $headers, $runtime);
    }

    /**
     * Description: 保司营销监测数据回传
     * Summary: 保司营销监测数据回传
     * @param CallbackAntcloudInsuranceMktMonitordataRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackAntcloudInsuranceMktMonitordataResponse
     */
    public function callbackAntcloudInsuranceMktMonitordataEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackAntcloudInsuranceMktMonitordataResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.monitordata.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 媒体点击统计数据回传
     * Summary: 媒体点击统计数据回传
     * @param CallbackAntcloudInsuranceMktMediastatisticaldataRequest $request
     * @return CallbackAntcloudInsuranceMktMediastatisticaldataResponse
     */
    public function callbackAntcloudInsuranceMktMediastatisticaldata($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackAntcloudInsuranceMktMediastatisticaldataEx($request, $headers, $runtime);
    }

    /**
     * Description: 媒体点击统计数据回传
     * Summary: 媒体点击统计数据回传
     * @param CallbackAntcloudInsuranceMktMediastatisticaldataRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackAntcloudInsuranceMktMediastatisticaldataResponse
     */
    public function callbackAntcloudInsuranceMktMediastatisticaldataEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackAntcloudInsuranceMktMediastatisticaldataResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.mediastatisticaldata.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销效果节点数据（简版）
     * Summary: 营销效果节点数据（简版）
     * @param CallbackAntcloudInsuranceMktEffectsimpleRequest $request
     * @return CallbackAntcloudInsuranceMktEffectsimpleResponse
     */
    public function callbackAntcloudInsuranceMktEffectsimple($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callbackAntcloudInsuranceMktEffectsimpleEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销效果节点数据（简版）
     * Summary: 营销效果节点数据（简版）
     * @param CallbackAntcloudInsuranceMktEffectsimpleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallbackAntcloudInsuranceMktEffectsimpleResponse
     */
    public function callbackAntcloudInsuranceMktEffectsimpleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallbackAntcloudInsuranceMktEffectsimpleResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.effectsimple.callback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险营销服务商人群圈选
     * Summary: 保险营销服务商人群圈选
     * @param ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest $request
     * @return ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse
     */
    public function applyAntcloudInsuranceMktserviceproviderAudiencecircle($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->applyAntcloudInsuranceMktserviceproviderAudiencecircleEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险营销服务商人群圈选
     * Summary: 保险营销服务商人群圈选
     * @param ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse
     */
    public function applyAntcloudInsuranceMktserviceproviderAudiencecircleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mktserviceprovider.audiencecircle.apply", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销人群底包析出结果查询
     * Summary: 营销人群底包析出结果查询
     * @param GetAntcloudInsuranceMktExtresulturlRequest $request
     * @return GetAntcloudInsuranceMktExtresulturlResponse
     */
    public function getAntcloudInsuranceMktExtresulturl($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getAntcloudInsuranceMktExtresulturlEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销人群底包析出结果查询
     * Summary: 营销人群底包析出结果查询
     * @param GetAntcloudInsuranceMktExtresulturlRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetAntcloudInsuranceMktExtresulturlResponse
     */
    public function getAntcloudInsuranceMktExtresulturlEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetAntcloudInsuranceMktExtresulturlResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.mkt.extresulturl.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商机接收-既往症人群评分-对客
     * Summary: 商机接收-既往症人群评分-对客
     * @param ReceiveAntcloudInsuranceLeadOpportunitiesRequest $request
     * @return ReceiveAntcloudInsuranceLeadOpportunitiesResponse
     */
    public function receiveAntcloudInsuranceLeadOpportunities($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->receiveAntcloudInsuranceLeadOpportunitiesEx($request, $headers, $runtime);
    }

    /**
     * Description: 商机接收-既往症人群评分-对客
     * Summary: 商机接收-既往症人群评分-对客
     * @param ReceiveAntcloudInsuranceLeadOpportunitiesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReceiveAntcloudInsuranceLeadOpportunitiesResponse
     */
    public function receiveAntcloudInsuranceLeadOpportunitiesEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antcloud.insurance.lead.opportunities.receive",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $receiveAntcloudInsuranceLeadOpportunitiesResponse = new ReceiveAntcloudInsuranceLeadOpportunitiesResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $receiveAntcloudInsuranceLeadOpportunitiesResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return ReceiveAntcloudInsuranceLeadOpportunitiesResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.lead.opportunities.receive", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 既往症线索供给方评分结果文件回传
     * Summary: 既往症线索供给方评分结果文件回传
     * @param PostbackAntcloudInsuranceLeadReceiveRequest $request
     * @return PostbackAntcloudInsuranceLeadReceiveResponse
     */
    public function postbackAntcloudInsuranceLeadReceive($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->postbackAntcloudInsuranceLeadReceiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 既往症线索供给方评分结果文件回传
     * Summary: 既往症线索供给方评分结果文件回传
     * @param PostbackAntcloudInsuranceLeadReceiveRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PostbackAntcloudInsuranceLeadReceiveResponse
     */
    public function postbackAntcloudInsuranceLeadReceiveEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antcloud.insurance.lead.receive.postback",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $postbackAntcloudInsuranceLeadReceiveResponse = new PostbackAntcloudInsuranceLeadReceiveResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $postbackAntcloudInsuranceLeadReceiveResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return PostbackAntcloudInsuranceLeadReceiveResponse::fromMap($this->doRequest("1.0", "antcloud.insurance.lead.receive.postback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
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
