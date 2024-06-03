<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\GetMaxCopilotFileRequest;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\GetMaxCopilotFileResponse;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\GetMaxCopilotFinRequest;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\GetMaxCopilotFinResponse;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\QueryMaxCopilotFileRequest;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\QueryMaxCopilotFileResponse;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\QueryMaxCopilotFinRequest;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\QueryMaxCopilotFinResponse;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\UploadMaxCopilotKnowledgeRequest;
use AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models\UploadMaxCopilotKnowledgeResponse;
use AntChain\Util\UtilClient;
use Exception;

class Client
{
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
     * Init client with Config.
     *
     * @param config config contains the necessary information to create a client
     * @param mixed $config
     */
    public function __construct($config)
    {
        if (Utils::isUnset($config)) {
            throw new TeaError([
                'code'    => 'ParameterMissing',
                'message' => "'config' can not be unset",
            ]);
        }
        $this->_accessKeyId             = $config->accessKeyId;
        $this->_accessKeySecret         = $config->accessKeySecret;
        $this->_securityToken           = $config->securityToken;
        $this->_endpoint                = $config->endpoint;
        $this->_protocol                = $config->protocol;
        $this->_userAgent               = $config->userAgent;
        $this->_readTimeout             = Utils::defaultNumber($config->readTimeout, 20000);
        $this->_connectTimeout          = Utils::defaultNumber($config->connectTimeout, 20000);
        $this->_httpProxy               = $config->httpProxy;
        $this->_httpsProxy              = $config->httpsProxy;
        $this->_noProxy                 = $config->noProxy;
        $this->_socks5Proxy             = $config->socks5Proxy;
        $this->_socks5NetWork           = $config->socks5NetWork;
        $this->_maxIdleConns            = Utils::defaultNumber($config->maxIdleConns, 60000);
        $this->_maxIdleTimeMillis       = Utils::defaultNumber($config->maxIdleTimeMillis, 5);
        $this->_keepAliveDurationMillis = Utils::defaultNumber($config->keepAliveDurationMillis, 5000);
        $this->_maxRequests             = Utils::defaultNumber($config->maxRequests, 100);
        $this->_maxRequestsPerHost      = Utils::defaultNumber($config->maxRequestsPerHost, 100);
    }

    /**
     * Encapsulate the request and invoke the network.
     *
     * @param string         $version
     * @param string         $action   api name
     * @param string         $protocol http or https
     * @param string         $method   e.g. GET
     * @param string         $pathname pathname of every api
     * @param mixed[]        $request  which contains request params
     * @param string[]       $headers
     * @param RuntimeOptions $runtime  which controls some details of call api, such as retry times
     *
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     *
     * @return array the response
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $headers, $runtime)
    {
        $runtime->validate();
        $_runtime = [
            'timeouted'          => 'retry',
            'readTimeout'        => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout'     => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'          => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'         => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'            => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'       => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'maxIdleTimeMillis'  => $this->_maxIdleTimeMillis,
            'keepAliveDuration'  => $this->_keepAliveDurationMillis,
            'maxRequests'        => $this->_maxRequests,
            'maxRequestsPerHost' => $this->_maxRequestsPerHost,
            'retry'              => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
            // 键值对
        ];
        $_lastRequest   = null;
        $_lastException = null;
        $_now           = time();
        $_retryTimes    = 0;
        while (Tea::allowRetry(@$_runtime['retry'], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime(@$_runtime['backoff'], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;

            try {
                $_request           = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method   = $method;
                $_request->pathname = $pathname;
                $_request->query    = [
                    'method'           => $action,
                    'version'          => $version,
                    'sign_type'        => 'HmacSHA1',
                    'req_time'         => UtilClient::getTimestamp(),
                    'req_msg_id'       => UtilClient::getNonce(),
                    'access_key'       => $this->_accessKeyId,
                    'base_sdk_version' => 'TeaSDK-2.0',
                    'sdk_version'      => '1.0.0',
                    '_prod_code'       => 'ak_f0f16236ed254bd499e3fe0f9600e0d5',
                    '_prod_channel'    => 'saas',
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query['security_token'] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    'host'       => Utils::defaultString($this->_endpoint, 'openapi.antchain.antgroup.com'),
                    'user-agent' => Utils::getUserAgent($this->_userAgent),
                ], $headers);
                $tmp                               = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body                    = Utils::toFormString($tmp);
                $_request->headers['content-type'] = 'application/x-www-form-urlencoded';
                $signedParam                       = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query['sign']           = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest                      = $_request;
                $_response                         = Tea::send($_request, $_runtime);
                $raw                               = Utils::readAsString($_response->body);
                $obj                               = Utils::parseJSON($raw);
                $res                               = Utils::assertAsMap($obj);
                $resp                              = Utils::assertAsMap(@$res['response']);
                if (UtilClient::hasError($raw, $this->_accessKeySecret)) {
                    throw new TeaError([
                        'message' => @$resp['result_msg'],
                        'data'    => $resp,
                        'code'    => @$resp['result_code'],
                    ]);
                }

                return $resp;
            } catch (Exception $e) {
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
     * Description: 上传报告到知识库接口
     * Summary: 上传报告到知识库.
     *
     * @param UploadMaxCopilotKnowledgeRequest $request
     *
     * @return UploadMaxCopilotKnowledgeResponse
     */
    public function uploadMaxCopilotKnowledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadMaxCopilotKnowledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传报告到知识库接口
     * Summary: 上传报告到知识库.
     *
     * @param UploadMaxCopilotKnowledgeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UploadMaxCopilotKnowledgeResponse
     */
    public function uploadMaxCopilotKnowledgeEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'max.copilot.knowledge.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadMaxCopilotKnowledgeResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadMaxCopilotKnowledgeResponse::fromMap($this->doRequest('1.0', 'max.copilot.knowledge.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 金融解读发送
     * Summary: 金融解读发送
     *
     * @param QueryMaxCopilotFinRequest $request
     *
     * @return QueryMaxCopilotFinResponse
     */
    public function queryMaxCopilotFin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMaxCopilotFinEx($request, $headers, $runtime);
    }

    /**
     * Description: 金融解读发送
     * Summary: 金融解读发送
     *
     * @param QueryMaxCopilotFinRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryMaxCopilotFinResponse
     */
    public function queryMaxCopilotFinEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMaxCopilotFinResponse::fromMap($this->doRequest('1.0', 'max.copilot.fin.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报告解读发送
     * Summary: 报告解读发送
     *
     * @param QueryMaxCopilotFileRequest $request
     *
     * @return QueryMaxCopilotFileResponse
     */
    public function queryMaxCopilotFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMaxCopilotFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 报告解读发送
     * Summary: 报告解读发送
     *
     * @param QueryMaxCopilotFileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryMaxCopilotFileResponse
     */
    public function queryMaxCopilotFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMaxCopilotFileResponse::fromMap($this->doRequest('1.0', 'max.copilot.file.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 金融解读结果查询
     * Summary: 金融解读结果查询.
     *
     * @param GetMaxCopilotFinRequest $request
     *
     * @return GetMaxCopilotFinResponse
     */
    public function getMaxCopilotFin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMaxCopilotFinEx($request, $headers, $runtime);
    }

    /**
     * Description: 金融解读结果查询
     * Summary: 金融解读结果查询.
     *
     * @param GetMaxCopilotFinRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetMaxCopilotFinResponse
     */
    public function getMaxCopilotFinEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMaxCopilotFinResponse::fromMap($this->doRequest('1.0', 'max.copilot.fin.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报告解读结果查询
     * Summary: 报告解读结果查询.
     *
     * @param GetMaxCopilotFileRequest $request
     *
     * @return GetMaxCopilotFileResponse
     */
    public function getMaxCopilotFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMaxCopilotFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 报告解读结果查询
     * Summary: 报告解读结果查询.
     *
     * @param GetMaxCopilotFileRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetMaxCopilotFileResponse
     */
    public function getMaxCopilotFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMaxCopilotFileResponse::fromMap($this->doRequest('1.0', 'max.copilot.file.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUpload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntcloudGatewayxFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUploadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntcloudGatewayxFileUploadResponse::fromMap($this->doRequest('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
