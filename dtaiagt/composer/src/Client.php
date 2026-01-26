<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DTAIAGT\Models\CancelAgentChatRequest;
use AntChain\DTAIAGT\Models\CancelAgentChatResponse;
use AntChain\DTAIAGT\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DTAIAGT\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DTAIAGT\Models\DeleteAgentChatRequest;
use AntChain\DTAIAGT\Models\DeleteAgentChatResponse;
use AntChain\DTAIAGT\Models\DetailAgentChatRequest;
use AntChain\DTAIAGT\Models\DetailAgentChatResponse;
use AntChain\DTAIAGT\Models\DetailAgentInfoRequest;
use AntChain\DTAIAGT\Models\DetailAgentInfoResponse;
use AntChain\DTAIAGT\Models\DetailMcpMymcpRequest;
use AntChain\DTAIAGT\Models\DetailMcpMymcpResponse;
use AntChain\DTAIAGT\Models\DownloadLibraryDocRequest;
use AntChain\DTAIAGT\Models\DownloadLibraryDocResponse;
use AntChain\DTAIAGT\Models\ExecLibraryDocsplitRequest;
use AntChain\DTAIAGT\Models\ExecLibraryDocsplitResponse;
use AntChain\DTAIAGT\Models\ListAgentChatRequest;
use AntChain\DTAIAGT\Models\ListAgentChatResponse;
use AntChain\DTAIAGT\Models\ListLibraryDocRequest;
use AntChain\DTAIAGT\Models\ListLibraryDocResponse;
use AntChain\DTAIAGT\Models\ListLibraryTaskRequest;
use AntChain\DTAIAGT\Models\ListLibraryTaskResponse;
use AntChain\DTAIAGT\Models\OperateAgentTaskRequest;
use AntChain\DTAIAGT\Models\OperateAgentTaskResponse;
use AntChain\DTAIAGT\Models\PagequeryMcpMymcpRequest;
use AntChain\DTAIAGT\Models\PagequeryMcpMymcpResponse;
use AntChain\DTAIAGT\Models\StartAgentCchatRequest;
use AntChain\DTAIAGT\Models\StartAgentCchatResponse;
use AntChain\DTAIAGT\Models\StartAgentChatRequest;
use AntChain\DTAIAGT\Models\StartAgentChatResponse;
use AntChain\DTAIAGT\Models\StartAgentTaskRequest;
use AntChain\DTAIAGT\Models\StartAgentTaskResponse;
use AntChain\DTAIAGT\Models\StartOpenaiChatRequest;
use AntChain\DTAIAGT\Models\StartOpenaiChatResponse;
use AntChain\DTAIAGT\Models\StopAgentChatRequest;
use AntChain\DTAIAGT\Models\StopAgentChatResponse;
use AntChain\DTAIAGT\Models\StopAgentTaskRequest;
use AntChain\DTAIAGT\Models\StopAgentTaskResponse;
use AntChain\DTAIAGT\Models\UpdateAgentChatRequest;
use AntChain\DTAIAGT\Models\UpdateAgentChatResponse;
use AntChain\DTAIAGT\Models\UploadAgentPortalchatRequest;
use AntChain\DTAIAGT\Models\UploadAgentPortalchatResponse;
use AntChain\DTAIAGT\Models\UploadAlipayAgentchatRequest;
use AntChain\DTAIAGT\Models\UploadAlipayAgentchatResponse;
use AntChain\DTAIAGT\Models\UploadAlipayLibraryRequest;
use AntChain\DTAIAGT\Models\UploadAlipayLibraryResponse;
use AntChain\DTAIAGT\Models\UploadSaasAgentchatRequest;
use AntChain\DTAIAGT\Models\UploadSaasAgentchatResponse;
use AntChain\DTAIAGT\Models\UploadSaasLibraryRequest;
use AntChain\DTAIAGT\Models\UploadSaasLibraryResponse;
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
            // Agent对话-对应的工具/工作流参数列表
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
                    'sdk_version'      => '3.3.0',
                    '_prod_code'       => 'DTAIAGT',
                    '_prod_channel'    => 'default',
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
     * Description: 大模型流式/同步对话接口
     * Summary: 大模型流式/同步对话接口.
     *
     * @param StartOpenaiChatRequest $request
     *
     * @return StartOpenaiChatResponse
     */
    public function startOpenaiChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startOpenaiChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 大模型流式/同步对话接口
     * Summary: 大模型流式/同步对话接口.
     *
     * @param StartOpenaiChatRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return StartOpenaiChatResponse
     */
    public function startOpenaiChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartOpenaiChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.openai.chat.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体流式对话接口
     * Summary: 智能体流式对话接口.
     *
     * @param StartAgentChatRequest $request
     *
     * @return StartAgentChatResponse
     */
    public function startAgentChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startAgentChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体流式对话接口
     * Summary: 智能体流式对话接口.
     *
     * @param StartAgentChatRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return StartAgentChatResponse
     */
    public function startAgentChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartAgentChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.chat.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能体同步对话接口
     * Summary: 智能体同步对话接口.
     *
     * @param StartAgentCchatRequest $request
     *
     * @return StartAgentCchatResponse
     */
    public function startAgentCchat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startAgentCchatEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能体同步对话接口
     * Summary: 智能体同步对话接口.
     *
     * @param StartAgentCchatRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return StartAgentCchatResponse
     */
    public function startAgentCchatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartAgentCchatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.cchat.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消对话接口
     * Summary: 取消对话接口.
     *
     * @param CancelAgentChatRequest $request
     *
     * @return CancelAgentChatResponse
     */
    public function cancelAgentChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelAgentChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消对话接口
     * Summary: 取消对话接口.
     *
     * @param CancelAgentChatRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CancelAgentChatResponse
     */
    public function cancelAgentChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelAgentChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.chat.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主站-知识库文件上传
     * Summary: 主站-知识库文件上传.
     *
     * @param UploadAlipayLibraryRequest $request
     *
     * @return UploadAlipayLibraryResponse
     */
    public function uploadAlipayLibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAlipayLibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 主站-知识库文件上传
     * Summary: 主站-知识库文件上传.
     *
     * @param UploadAlipayLibraryRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadAlipayLibraryResponse
     */
    public function uploadAlipayLibraryEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antdigital.dtaiagt.alipay.library.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAlipayLibraryResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadAlipayLibraryResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.alipay.library.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主站-Agent对话-上传文件
     * Summary: 主站-Agent对话-上传文件.
     *
     * @param UploadAlipayAgentchatRequest $request
     *
     * @return UploadAlipayAgentchatResponse
     */
    public function uploadAlipayAgentchat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAlipayAgentchatEx($request, $headers, $runtime);
    }

    /**
     * Description: 主站-Agent对话-上传文件
     * Summary: 主站-Agent对话-上传文件.
     *
     * @param UploadAlipayAgentchatRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UploadAlipayAgentchatResponse
     */
    public function uploadAlipayAgentchatEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antdigital.dtaiagt.alipay.agentchat.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAlipayAgentchatResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadAlipayAgentchatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.alipay.agentchat.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已订阅的mcp清单
     * Summary: 查询已订阅的mcp清单.
     *
     * @param PagequeryMcpMymcpRequest $request
     *
     * @return PagequeryMcpMymcpResponse
     */
    public function pagequeryMcpMymcp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryMcpMymcpEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已订阅的mcp清单
     * Summary: 查询已订阅的mcp清单.
     *
     * @param PagequeryMcpMymcpRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PagequeryMcpMymcpResponse
     */
    public function pagequeryMcpMymcpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryMcpMymcpResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.mcp.mymcp.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: mcp详情查询
     * Summary: mcp详情.
     *
     * @param DetailMcpMymcpRequest $request
     *
     * @return DetailMcpMymcpResponse
     */
    public function detailMcpMymcp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailMcpMymcpEx($request, $headers, $runtime);
    }

    /**
     * Description: mcp详情查询
     * Summary: mcp详情.
     *
     * @param DetailMcpMymcpRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DetailMcpMymcpResponse
     */
    public function detailMcpMymcpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailMcpMymcpResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.mcp.mymcp.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库-文档分页查询
     * Summary: 知识库-文档分页查询.
     *
     * @param ListLibraryDocRequest $request
     *
     * @return ListLibraryDocResponse
     */
    public function listLibraryDoc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listLibraryDocEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库-文档分页查询
     * Summary: 知识库-文档分页查询.
     *
     * @param ListLibraryDocRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListLibraryDocResponse
     */
    public function listLibraryDocEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListLibraryDocResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.library.doc.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库-任务列表
     * Summary: 知识库-任务列表.
     *
     * @param ListLibraryTaskRequest $request
     *
     * @return ListLibraryTaskResponse
     */
    public function listLibraryTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listLibraryTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库-任务列表
     * Summary: 知识库-任务列表.
     *
     * @param ListLibraryTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListLibraryTaskResponse
     */
    public function listLibraryTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListLibraryTaskResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.library.task.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库-文档切片
     * Summary: 知识库-文档切片.
     *
     * @param ExecLibraryDocsplitRequest $request
     *
     * @return ExecLibraryDocsplitResponse
     */
    public function execLibraryDocsplit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execLibraryDocsplitEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库-文档切片
     * Summary: 知识库-文档切片.
     *
     * @param ExecLibraryDocsplitRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecLibraryDocsplitResponse
     */
    public function execLibraryDocsplitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecLibraryDocsplitResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.library.docsplit.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询Agent历史会话列表
     * Summary: 查询Agent历史会话列表.
     *
     * @param ListAgentChatRequest $request
     *
     * @return ListAgentChatResponse
     */
    public function listAgentChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAgentChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询Agent历史会话列表
     * Summary: 查询Agent历史会话列表.
     *
     * @param ListAgentChatRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ListAgentChatResponse
     */
    public function listAgentChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAgentChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.chat.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看Agent历史会话详情信息
     * Summary: 查看Agent历史会话详情.
     *
     * @param DetailAgentChatRequest $request
     *
     * @return DetailAgentChatResponse
     */
    public function detailAgentChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailAgentChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看Agent历史会话详情信息
     * Summary: 查看Agent历史会话详情.
     *
     * @param DetailAgentChatRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DetailAgentChatResponse
     */
    public function detailAgentChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailAgentChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.chat.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除Agent会话
     * Summary: 删除Agent会话.
     *
     * @param DeleteAgentChatRequest $request
     *
     * @return DeleteAgentChatResponse
     */
    public function deleteAgentChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAgentChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除Agent会话
     * Summary: 删除Agent会话.
     *
     * @param DeleteAgentChatRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteAgentChatResponse
     */
    public function deleteAgentChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAgentChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.chat.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Agent对话-点赞点踩反馈&删除消息评价
     * Summary: Agent对话-赞/踩反馈&删除消息评价.
     *
     * @param UpdateAgentChatRequest $request
     *
     * @return UpdateAgentChatResponse
     */
    public function updateAgentChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAgentChatEx($request, $headers, $runtime);
    }

    /**
     * Description: Agent对话-点赞点踩反馈&删除消息评价
     * Summary: Agent对话-赞/踩反馈&删除消息评价.
     *
     * @param UpdateAgentChatRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateAgentChatResponse
     */
    public function updateAgentChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAgentChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.chat.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取 Agent 详情
     * Summary: 获取 Agent 详情.
     *
     * @param DetailAgentInfoRequest $request
     *
     * @return DetailAgentInfoResponse
     */
    public function detailAgentInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailAgentInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取 Agent 详情
     * Summary: 获取 Agent 详情.
     *
     * @param DetailAgentInfoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DetailAgentInfoResponse
     */
    public function detailAgentInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailAgentInfoResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.info.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Agent停止对话
     * Summary: Agent停止对话.
     *
     * @param StopAgentChatRequest $request
     *
     * @return StopAgentChatResponse
     */
    public function stopAgentChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopAgentChatEx($request, $headers, $runtime);
    }

    /**
     * Description: Agent停止对话
     * Summary: Agent停止对话.
     *
     * @param StopAgentChatRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return StopAgentChatResponse
     */
    public function stopAgentChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopAgentChatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.chat.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Agent对话-上传文件
     * Summary: Agent对话-上传文件.
     *
     * @param UploadAgentPortalchatRequest $request
     *
     * @return UploadAgentPortalchatResponse
     */
    public function uploadAgentPortalchat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAgentPortalchatEx($request, $headers, $runtime);
    }

    /**
     * Description: Agent对话-上传文件
     * Summary: Agent对话-上传文件.
     *
     * @param UploadAgentPortalchatRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UploadAgentPortalchatResponse
     */
    public function uploadAgentPortalchatEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antdigital.dtaiagt.agent.portalchat.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAgentPortalchatResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadAgentPortalchatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.portalchat.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库-文档库-文档下载
     * Summary: 知识库-文档库-文档下载.
     *
     * @param DownloadLibraryDocRequest $request
     *
     * @return DownloadLibraryDocResponse
     */
    public function downloadLibraryDoc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadLibraryDocEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库-文档库-文档下载
     * Summary: 知识库-文档库-文档下载.
     *
     * @param DownloadLibraryDocRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DownloadLibraryDocResponse
     */
    public function downloadLibraryDocEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadLibraryDocResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.library.doc.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: SAAS-知识库文件上传
     * Summary: SAAS-知识库文件上传.
     *
     * @param UploadSaasLibraryRequest $request
     *
     * @return UploadSaasLibraryResponse
     */
    public function uploadSaasLibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSaasLibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: SAAS-知识库文件上传
     * Summary: SAAS-知识库文件上传.
     *
     * @param UploadSaasLibraryRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UploadSaasLibraryResponse
     */
    public function uploadSaasLibraryEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antdigital.dtaiagt.saas.library.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadSaasLibraryResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadSaasLibraryResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.saas.library.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: SAAS-Agent对话-上传文件
     * Summary: SAAS-Agent对话-上传文件.
     *
     * @param UploadSaasAgentchatRequest $request
     *
     * @return UploadSaasAgentchatResponse
     */
    public function uploadSaasAgentchat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSaasAgentchatEx($request, $headers, $runtime);
    }

    /**
     * Description: SAAS-Agent对话-上传文件
     * Summary: SAAS-Agent对话-上传文件.
     *
     * @param UploadSaasAgentchatRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadSaasAgentchatResponse
     */
    public function uploadSaasAgentchatEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antdigital.dtaiagt.saas.agentchat.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadSaasAgentchatResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadSaasAgentchatResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.saas.agentchat.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 长任务对话，发起任务&重连任务
     * Summary: 长任务对话.
     *
     * @param StartAgentTaskRequest $request
     *
     * @return StartAgentTaskResponse
     */
    public function startAgentTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startAgentTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 长任务对话，发起任务&重连任务
     * Summary: 长任务对话.
     *
     * @param StartAgentTaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return StartAgentTaskResponse
     */
    public function startAgentTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartAgentTaskResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.task.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 终止任务
     * Summary: 终止任务
     *
     * @param StopAgentTaskRequest $request
     *
     * @return StopAgentTaskResponse
     */
    public function stopAgentTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopAgentTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 终止任务
     * Summary: 终止任务
     *
     * @param StopAgentTaskRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return StopAgentTaskResponse
     */
    public function stopAgentTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopAgentTaskResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.task.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取前序消息流
     * Summary: 获取前序消息流
     *
     * @param OperateAgentTaskRequest $request
     *
     * @return OperateAgentTaskResponse
     */
    public function operateAgentTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateAgentTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取前序消息流
     * Summary: 获取前序消息流
     *
     * @param OperateAgentTaskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return OperateAgentTaskResponse
     */
    public function operateAgentTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateAgentTaskResponse::fromMap($this->doRequest('1.0', 'antdigital.dtaiagt.agent.task.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
