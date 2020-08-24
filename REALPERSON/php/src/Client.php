<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\REALPERSON\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\REALPERSON\Models\QueryIRealpersonFacevrfServerRequest;
use AntChain\REALPERSON\Models\QueryIRealpersonFacevrfServerResponse;
use AntChain\REALPERSON\Models\CreateIRealpersonFacevrfServerRequest;
use AntChain\REALPERSON\Models\CreateIRealpersonFacevrfServerResponse;
use AntChain\REALPERSON\Models\ExecIRealpersonFacevrfServerRequest;
use AntChain\REALPERSON\Models\ExecIRealpersonFacevrfServerResponse;
use AntChain\REALPERSON\Models\GetIRealpersonFacevrfEvidenceRequest;
use AntChain\REALPERSON\Models\GetIRealpersonFacevrfEvidenceResponse;

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
     * @param array $request which contains request params
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return array the response
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $runtime){
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
            "ignoreSSL" => $runtime->ignoreSSL
        ];
        $_lastRequest = null;
        $_lastException = null;
        $_now = time();
        $_retryTimes = 0;
        while (Tea::allowRetry($_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime($_runtime["backoff"], $_retryTimes);
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
                    "req_msg_id" => Utils::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "charset" => "UTF-8",
                    "baseSdkVersion" => "Tea-SDK",
                    "sdkVersion" => "Tea-SDK-20200824"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = [
                    "host" => $this->_endpoint,
                    "user-agent" => $this->getUserAgent()
                ];
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $obj = Utils::readAsJSON($_response->body);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap($res["response"]);
                if (UtilClient::hasError($res)) {
                    throw new TeaError([
                        "message" => $resp["result_msg"],
                        "data" => $resp,
                        "code" => $resp["result_code"]
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
     * Get user agent
     * @return string user agent
     */
    public function getUserAgent(){
        $userAgent = "TeaClient/1.0.0";
        return Utils::getUserAgent($userAgent);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询
     * @param QueryIRealpersonFacevrfServerRequest $request
     * @return QueryIRealpersonFacevrfServerResponse
     */
    public function queryIRealpersonFacevrfServer($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryIRealpersonFacevrfServerEx($request, $runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询
     * @param QueryIRealpersonFacevrfServerRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryIRealpersonFacevrfServerResponse
     */
    public function queryIRealpersonFacevrfServerEx($request, $runtime){
        Utils::validateModel($request);
        return QueryIRealpersonFacevrfServerResponse::fromMap($this->doRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建
     * @param CreateIRealpersonFacevrfServerRequest $request
     * @return CreateIRealpersonFacevrfServerResponse
     */
    public function createIRealpersonFacevrfServer($request){
        $runtime = new RuntimeOptions([]);
        return $this->createIRealpersonFacevrfServerEx($request, $runtime);
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建
     * @param CreateIRealpersonFacevrfServerRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateIRealpersonFacevrfServerResponse
     */
    public function createIRealpersonFacevrfServerEx($request, $runtime){
        Utils::validateModel($request);
        return CreateIRealpersonFacevrfServerResponse::fromMap($this->doRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对
     * @param ExecIRealpersonFacevrfServerRequest $request
     * @return ExecIRealpersonFacevrfServerResponse
     */
    public function execIRealpersonFacevrfServer($request){
        $runtime = new RuntimeOptions([]);
        return $this->execIRealpersonFacevrfServerEx($request, $runtime);
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对
     * @param ExecIRealpersonFacevrfServerRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecIRealpersonFacevrfServerResponse
     */
    public function execIRealpersonFacevrfServerEx($request, $runtime){
        Utils::validateModel($request);
        return ExecIRealpersonFacevrfServerResponse::fromMap($this->doRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID
     * @param GetIRealpersonFacevrfEvidenceRequest $request
     * @return GetIRealpersonFacevrfEvidenceResponse
     */
    public function getIRealpersonFacevrfEvidence($request){
        $runtime = new RuntimeOptions([]);
        return $this->getIRealpersonFacevrfEvidenceEx($request, $runtime);
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID
     * @param GetIRealpersonFacevrfEvidenceRequest $request
     * @param RuntimeOptions $runtime
     * @return GetIRealpersonFacevrfEvidenceResponse
     */
    public function getIRealpersonFacevrfEvidenceEx($request, $runtime){
        Utils::validateModel($request);
        return GetIRealpersonFacevrfEvidenceResponse::fromMap($this->doRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}
