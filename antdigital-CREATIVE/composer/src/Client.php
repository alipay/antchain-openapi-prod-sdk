<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CREATIVE\Models\PushVideogenerationRequest;
use AntChain\CREATIVE\Models\PushVideogenerationResponse;
use AntChain\CREATIVE\Models\QueryVideogenerationRequest;
use AntChain\CREATIVE\Models\QueryVideogenerationResponse;
use AntChain\CREATIVE\Models\UploadAssetRequest;
use AntChain\CREATIVE\Models\UploadAssetResponse;
use AntChain\CREATIVE\Models\QueryAssetRequest;
use AntChain\CREATIVE\Models\QueryAssetResponse;
use AntChain\CREATIVE\Models\UploadMaasAssetRequest;
use AntChain\CREATIVE\Models\UploadMaasAssetResponse;
use AntChain\CREATIVE\Models\QueryMaasAssetRequest;
use AntChain\CREATIVE\Models\QueryMaasAssetResponse;
use AntChain\CREATIVE\Models\PushMaasVideoRequest;
use AntChain\CREATIVE\Models\PushMaasVideoResponse;
use AntChain\CREATIVE\Models\QueryMaasVideoRequest;
use AntChain\CREATIVE\Models\QueryMaasVideoResponse;
use AntChain\CREATIVE\Models\PushMaasImageRequest;
use AntChain\CREATIVE\Models\PushMaasImageResponse;
use AntChain\CREATIVE\Models\QueryMaasImageRequest;
use AntChain\CREATIVE\Models\QueryMaasImageResponse;
use AntChain\CREATIVE\Models\PushMaasAudioRequest;
use AntChain\CREATIVE\Models\PushMaasAudioResponse;
use AntChain\CREATIVE\Models\QueryMaasAudioRequest;
use AntChain\CREATIVE\Models\QueryMaasAudioResponse;
use AntChain\CREATIVE\Models\ExecMaasChatsyncRequest;
use AntChain\CREATIVE\Models\ExecMaasChatsyncResponse;
use AntChain\CREATIVE\Models\ExecMaasPriceRequest;
use AntChain\CREATIVE\Models\ExecMaasPriceResponse;

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
            // 只计一次的请求级费用明细
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
                    "_prod_code" => "CREATIVE",
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
     * Description: 内容创作平台-视频生成-推送
     * Summary: 内容创作平台-视频生成-推送
     * @param PushVideogenerationRequest $request
     * @return PushVideogenerationResponse
     */
    public function pushVideogeneration($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushVideogenerationEx($request, $headers, $runtime);
    }

    /**
     * Description: 内容创作平台-视频生成-推送
     * Summary: 内容创作平台-视频生成-推送
     * @param PushVideogenerationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushVideogenerationResponse
     */
    public function pushVideogenerationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushVideogenerationResponse::fromMap($this->doRequest("1.0", "antdigital.creative.videogeneration.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频创作接口查询
     * Summary: 视频创作接口查询
     * @param QueryVideogenerationRequest $request
     * @return QueryVideogenerationResponse
     */
    public function queryVideogeneration($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryVideogenerationEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频创作接口查询
     * Summary: 视频创作接口查询
     * @param QueryVideogenerationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryVideogenerationResponse
     */
    public function queryVideogenerationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryVideogenerationResponse::fromMap($this->doRequest("1.0", "antdigital.creative.videogeneration.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产上传接口
     * Summary: 资产上传接口
     * @param UploadAssetRequest $request
     * @return UploadAssetResponse
     */
    public function uploadAsset($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产上传接口
     * Summary: 资产上传接口
     * @param UploadAssetRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadAssetResponse
     */
    public function uploadAssetEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UploadAssetResponse::fromMap($this->doRequest("1.0", "antdigital.creative.asset.upload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产查询接口
     * Summary: 资产查询接口
     * @param QueryAssetRequest $request
     * @return QueryAssetResponse
     */
    public function queryAsset($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产查询接口
     * Summary: 资产查询接口
     * @param QueryAssetRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAssetResponse
     */
    public function queryAssetEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAssetResponse::fromMap($this->doRequest("1.0", "antdigital.creative.asset.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传资产
     * Summary: 上传资产
     * @param UploadMaasAssetRequest $request
     * @return UploadMaasAssetResponse
     */
    public function uploadMaasAsset($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadMaasAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传资产
     * Summary: 上传资产
     * @param UploadMaasAssetRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadMaasAssetResponse
     */
    public function uploadMaasAssetEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UploadMaasAssetResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.asset.upload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询资产
     * Summary: 查询资产
     * @param QueryMaasAssetRequest $request
     * @return QueryMaasAssetResponse
     */
    public function queryMaasAsset($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMaasAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询资产
     * Summary: 查询资产
     * @param QueryMaasAssetRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMaasAssetResponse
     */
    public function queryMaasAssetEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMaasAssetResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.asset.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建视频任务
     * Summary: 创建视频任务
     * @param PushMaasVideoRequest $request
     * @return PushMaasVideoResponse
     */
    public function pushMaasVideo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushMaasVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建视频任务
     * Summary: 创建视频任务
     * @param PushMaasVideoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushMaasVideoResponse
     */
    public function pushMaasVideoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushMaasVideoResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.video.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询视频任务
     * Summary: 查询视频任务
     * @param QueryMaasVideoRequest $request
     * @return QueryMaasVideoResponse
     */
    public function queryMaasVideo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMaasVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询视频任务
     * Summary: 查询视频任务
     * @param QueryMaasVideoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMaasVideoResponse
     */
    public function queryMaasVideoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMaasVideoResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.video.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生成图片
     * Summary: 生成图片
     * @param PushMaasImageRequest $request
     * @return PushMaasImageResponse
     */
    public function pushMaasImage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushMaasImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 生成图片
     * Summary: 生成图片
     * @param PushMaasImageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushMaasImageResponse
     */
    public function pushMaasImageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushMaasImageResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.image.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询图片任务
     * Summary: 查询图片任务
     * @param QueryMaasImageRequest $request
     * @return QueryMaasImageResponse
     */
    public function queryMaasImage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMaasImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询图片任务
     * Summary: 查询图片任务
     * @param QueryMaasImageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMaasImageResponse
     */
    public function queryMaasImageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMaasImageResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.image.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建音频任务
     * Summary: 创建音频任务
     * @param PushMaasAudioRequest $request
     * @return PushMaasAudioResponse
     */
    public function pushMaasAudio($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushMaasAudioEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建音频任务
     * Summary: 创建音频任务
     * @param PushMaasAudioRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushMaasAudioResponse
     */
    public function pushMaasAudioEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushMaasAudioResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.audio.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询音频任务
     * Summary: 查询音频任务
     * @param QueryMaasAudioRequest $request
     * @return QueryMaasAudioResponse
     */
    public function queryMaasAudio($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMaasAudioEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询音频任务
     * Summary: 查询音频任务
     * @param QueryMaasAudioRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMaasAudioResponse
     */
    public function queryMaasAudioEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMaasAudioResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.audio.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本同步调用
     * Summary: 文本同步调用
     * @param ExecMaasChatsyncRequest $request
     * @return ExecMaasChatsyncResponse
     */
    public function execMaasChatsync($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execMaasChatsyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本同步调用
     * Summary: 文本同步调用
     * @param ExecMaasChatsyncRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecMaasChatsyncResponse
     */
    public function execMaasChatsyncEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecMaasChatsyncResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.chatsync.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 价格试算
     * Summary: 价格试算
     * @param ExecMaasPriceRequest $request
     * @return ExecMaasPriceResponse
     */
    public function execMaasPrice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execMaasPriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 价格试算
     * Summary: 价格试算
     * @param ExecMaasPriceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecMaasPriceResponse
     */
    public function execMaasPriceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecMaasPriceResponse::fromMap($this->doRequest("1.0", "antdigital.creative.maas.price.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
