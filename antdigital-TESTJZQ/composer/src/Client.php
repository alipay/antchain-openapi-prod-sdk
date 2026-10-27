<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TESTJZQ\Models\ApiCreateFileRequest;
use AntChain\TESTJZQ\Models\ApiCreateFileResponse;
use AntChain\TESTJZQ\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\TESTJZQ\Models\TestAddStructRequest;
use AntChain\TESTJZQ\Models\TestAddStructResponse;
use AntChain\TESTJZQ\Models\ADemoTestRequest;
use AntChain\TESTJZQ\Models\ADemoTestResponse;
use AntChain\TESTJZQ\Models\BDemoTestRequest;
use AntChain\TESTJZQ\Models\BDemoTestResponse;
use AntChain\TESTJZQ\Models\CDemoTestRequest;
use AntChain\TESTJZQ\Models\CDemoTestResponse;
use AntChain\TESTJZQ\Models\QQQRequest;
use AntChain\TESTJZQ\Models\QQQResponse;
use AntChain\TESTJZQ\Models\ZzZZRequest;
use AntChain\TESTJZQ\Models\ZzZZResponse;
use AntChain\TESTJZQ\Models\ApiPreAcceptanceRequest;
use AntChain\TESTJZQ\Models\ApiPreAcceptanceResponse;
use AntChain\TESTJZQ\Models\AaaPreTestApiRequest;
use AntChain\TESTJZQ\Models\AaaPreTestApiResponse;
use AntChain\TESTJZQ\Models\QuerySsRequest;
use AntChain\TESTJZQ\Models\QuerySsResponse;
use AntChain\TESTJZQ\Models\CreateAntcloudGatewayxFileUploadResponse;

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
            // ceshi
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
                    "sdk_version" => "1.0.18",
                    "_prod_code" => "TESTJZQ",
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
     * Description: 测试使用
     * Summary: 测试使用
     * @param ApiCreateFileRequest $request
     * @return ApiCreateFileResponse
     */
    public function apiCreateFile($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiCreateFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用
     * @param ApiCreateFileRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiCreateFileResponse
     */
    public function apiCreateFileEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antdigital.testjzq.create.file.api",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $apiCreateFileResponse = new ApiCreateFileResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $apiCreateFileResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return ApiCreateFileResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.create.file.api", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试结构体的部署同步
     * Summary: 测试结构体的部署同步
     * @param TestAddStructRequest $request
     * @return TestAddStructResponse
     */
    public function testAddStruct($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->testAddStructEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试结构体的部署同步
     * Summary: 测试结构体的部署同步
     * @param TestAddStructRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return TestAddStructResponse
     */
    public function testAddStructEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return TestAddStructResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.add.struct.test", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 111
     * Summary: 111
     * @param ADemoTestRequest $request
     * @return ADemoTestResponse
     */
    public function aDemoTest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->aDemoTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 111
     * Summary: 111
     * @param ADemoTestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ADemoTestResponse
     */
    public function aDemoTestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ADemoTestResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.demo.test.a", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 111
     * Summary: 111
     * @param BDemoTestRequest $request
     * @return BDemoTestResponse
     */
    public function bDemoTest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->bDemoTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 111
     * Summary: 111
     * @param BDemoTestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BDemoTestResponse
     */
    public function bDemoTestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BDemoTestResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.demo.test.b", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ccccc
     * Summary: ccccc
     * @param CDemoTestRequest $request
     * @return CDemoTestResponse
     */
    public function cDemoTest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cDemoTestEx($request, $headers, $runtime);
    }

    /**
     * Description: ccccc
     * Summary: ccccc
     * @param CDemoTestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CDemoTestResponse
     */
    public function cDemoTestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CDemoTestResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.demo.test.c", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aaaaa
     * Summary: aaaaa
     * @param QQQRequest $request
     * @return QQQResponse
     */
    public function qQQ($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->qQQEx($request, $headers, $runtime);
    }

    /**
     * Description: aaaaa
     * Summary: aaaaa
     * @param QQQRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QQQResponse
     */
    public function qQQEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QQQResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.q.q.q", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: zzzzzzz
     * Summary: zzzzzzz
     * @param ZzZZRequest $request
     * @return ZzZZResponse
     */
    public function zzZZ($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->zzZZEx($request, $headers, $runtime);
    }

    /**
     * Description: zzzzzzz
     * Summary: zzzzzzz
     * @param ZzZZRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ZzZZResponse
     */
    public function zzZZEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ZzZZResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.z.z.zz", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 预发验收创建api
     * Summary: 预发验收创建api
     * @param ApiPreAcceptanceRequest $request
     * @return ApiPreAcceptanceResponse
     */
    public function apiPreAcceptance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiPreAcceptanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 预发验收创建api
     * Summary: 预发验收创建api
     * @param ApiPreAcceptanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiPreAcceptanceResponse
     */
    public function apiPreAcceptanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApiPreAcceptanceResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.pre.acceptance.api", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test
     * @param AaaPreTestApiRequest $request
     * @return AaaPreTestApiResponse
     */
    public function aaaPreTestApi($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->aaaPreTestApiEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test
     * @param AaaPreTestApiRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return AaaPreTestApiResponse
     */
    public function aaaPreTestApiEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return AaaPreTestApiResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.pre.test.api.aaa", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试流程使用
     * Summary: 测试流程使用
     * @param QuerySsRequest $request
     * @return QuerySsResponse
     */
    public function querySs($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->querySsEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试流程使用
     * Summary: 测试流程使用
     * @param QuerySsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QuerySsResponse
     */
    public function querySsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QuerySsResponse::fromMap($this->doRequest("1.0", "antdigital.testjzq.ss.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
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
