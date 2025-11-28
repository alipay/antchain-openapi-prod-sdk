<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\COLLABINV\Models\AddCaruserPrdRequest;
use AntChain\COLLABINV\Models\AddCaruserPrdResponse;
use AntChain\COLLABINV\Models\AddCaruserTestRequest;
use AntChain\COLLABINV\Models\AddCaruserTestResponse;
use AntChain\COLLABINV\Models\AddCaruserUsersRequest;
use AntChain\COLLABINV\Models\AddCaruserUsersResponse;
use AntChain\COLLABINV\Models\BatchdeleteAgentConversationRequest;
use AntChain\COLLABINV\Models\BatchdeleteAgentConversationResponse;
use AntChain\COLLABINV\Models\BatchqueryCarloanPrdRequest;
use AntChain\COLLABINV\Models\BatchqueryCarloanPrdResponse;
use AntChain\COLLABINV\Models\BatchqueryCarloanTestRequest;
use AntChain\COLLABINV\Models\BatchqueryCarloanTestResponse;
use AntChain\COLLABINV\Models\BatchqueryCarloanUsersRequest;
use AntChain\COLLABINV\Models\BatchqueryCarloanUsersResponse;
use AntChain\COLLABINV\Models\BatchqueryModelCommonscoreRequest;
use AntChain\COLLABINV\Models\BatchqueryModelCommonscoreResponse;
use AntChain\COLLABINV\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\COLLABINV\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\COLLABINV\Models\DeleteAgentConversationRequest;
use AntChain\COLLABINV\Models\DeleteAgentConversationResponse;
use AntChain\COLLABINV\Models\ExecModelSampletaskRequest;
use AntChain\COLLABINV\Models\ExecModelSampletaskResponse;
use AntChain\COLLABINV\Models\ImportCarloanUsersRequest;
use AntChain\COLLABINV\Models\ImportCarloanUsersResponse;
use AntChain\COLLABINV\Models\ImportIdmapPsiresultfileRequest;
use AntChain\COLLABINV\Models\ImportIdmapPsiresultfileResponse;
use AntChain\COLLABINV\Models\ImportIdmapSamplefileRequest;
use AntChain\COLLABINV\Models\ImportIdmapSamplefileResponse;
use AntChain\COLLABINV\Models\ListAgentConversationRequest;
use AntChain\COLLABINV\Models\ListAgentConversationResponse;
use AntChain\COLLABINV\Models\ListAgentMessageRequest;
use AntChain\COLLABINV\Models\ListAgentMessageResponse;
use AntChain\COLLABINV\Models\MatchCarloanUsersRequest;
use AntChain\COLLABINV\Models\MatchCarloanUsersResponse;
use AntChain\COLLABINV\Models\PushModelSamplefileRequest;
use AntChain\COLLABINV\Models\PushModelSamplefileResponse;
use AntChain\COLLABINV\Models\QueryAgentCompletionRequest;
use AntChain\COLLABINV\Models\QueryAgentCompletionResponse;
use AntChain\COLLABINV\Models\QueryAgentSseRequest;
use AntChain\COLLABINV\Models\QueryAgentSseResponse;
use AntChain\COLLABINV\Models\QueryCarloanUsersRequest;
use AntChain\COLLABINV\Models\QueryCarloanUsersResponse;
use AntChain\COLLABINV\Models\QueryIndexresearchBrandindexRequest;
use AntChain\COLLABINV\Models\QueryIndexresearchBrandindexResponse;
use AntChain\COLLABINV\Models\QueryIndexresearchBrandRequest;
use AntChain\COLLABINV\Models\QueryIndexresearchBrandResponse;
use AntChain\COLLABINV\Models\QueryIndexresearchConsumeindustryRequest;
use AntChain\COLLABINV\Models\QueryIndexresearchConsumeindustryResponse;
use AntChain\COLLABINV\Models\QueryIndexresearchIndustryRequest;
use AntChain\COLLABINV\Models\QueryIndexresearchIndustryResponse;
use AntChain\COLLABINV\Models\QueryLocationInternalRequest;
use AntChain\COLLABINV\Models\QueryLocationInternalResponse;
use AntChain\COLLABINV\Models\QueryLocationTradeRequest;
use AntChain\COLLABINV\Models\QueryLocationTradeResponse;
use AntChain\COLLABINV\Models\QueryModelCommonscoreRequest;
use AntChain\COLLABINV\Models\QueryModelCommonscoreResponse;
use AntChain\COLLABINV\Models\QueryModelFeaturesetRequest;
use AntChain\COLLABINV\Models\QueryModelFeaturesetResponse;
use AntChain\COLLABINV\Models\QueryModelFusionmodelRequest;
use AntChain\COLLABINV\Models\QueryModelFusionmodelResponse;
use AntChain\COLLABINV\Models\QueryModelMultiscoreRequest;
use AntChain\COLLABINV\Models\QueryModelMultiscoreResponse;
use AntChain\COLLABINV\Models\QueryModelSampletaskRequest;
use AntChain\COLLABINV\Models\QueryModelSampletaskResponse;
use AntChain\COLLABINV\Models\QueryModelStatsRequest;
use AntChain\COLLABINV\Models\QueryModelStatsResponse;
use AntChain\COLLABINV\Models\QueryModelWorkscoreRequest;
use AntChain\COLLABINV\Models\QueryModelWorkscoreResponse;
use AntChain\COLLABINV\Models\SubmitModelInstanceRequest;
use AntChain\COLLABINV\Models\SubmitModelInstanceResponse;
use AntChain\COLLABINV\Models\UpdateAgentConversationRequest;
use AntChain\COLLABINV\Models\UpdateAgentConversationResponse;
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
            // 聊天消息
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
                    'sdk_version'      => '1.0.58',
                    '_prod_code'       => 'COLLABINV',
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
     * Description: sse查询
     * Summary: sse查询.
     *
     * @param QueryAgentSseRequest $request
     *
     * @return QueryAgentSseResponse
     */
    public function queryAgentSse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAgentSseEx($request, $headers, $runtime);
    }

    /**
     * Description: sse查询
     * Summary: sse查询.
     *
     * @param QueryAgentSseRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryAgentSseResponse
     */
    public function queryAgentSseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAgentSseResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.agent.sse.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据用户id查询用户会话列表
     * Summary: 根据用户id查询用户会话列表.
     *
     * @param ListAgentConversationRequest $request
     *
     * @return ListAgentConversationResponse
     */
    public function listAgentConversation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAgentConversationEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据用户id查询用户会话列表
     * Summary: 根据用户id查询用户会话列表.
     *
     * @param ListAgentConversationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListAgentConversationResponse
     */
    public function listAgentConversationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAgentConversationResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.agent.conversation.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据用户Id会话ID删除会话
     * Summary: 删除会话.
     *
     * @param DeleteAgentConversationRequest $request
     *
     * @return DeleteAgentConversationResponse
     */
    public function deleteAgentConversation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAgentConversationEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据用户Id会话ID删除会话
     * Summary: 删除会话.
     *
     * @param DeleteAgentConversationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteAgentConversationResponse
     */
    public function deleteAgentConversationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAgentConversationResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.agent.conversation.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除用户所有会话
     * Summary: 删除用户所有会话.
     *
     * @param BatchdeleteAgentConversationRequest $request
     *
     * @return BatchdeleteAgentConversationResponse
     */
    public function batchdeleteAgentConversation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteAgentConversationEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除用户所有会话
     * Summary: 删除用户所有会话.
     *
     * @param BatchdeleteAgentConversationRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchdeleteAgentConversationResponse
     */
    public function batchdeleteAgentConversationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteAgentConversationResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.agent.conversation.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取会话消息列表
     * Summary: 获取会话消息列表.
     *
     * @param ListAgentMessageRequest $request
     *
     * @return ListAgentMessageResponse
     */
    public function listAgentMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAgentMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取会话消息列表
     * Summary: 获取会话消息列表.
     *
     * @param ListAgentMessageRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListAgentMessageResponse
     */
    public function listAgentMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAgentMessageResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.agent.message.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑会话信息
     * Summary: 编辑会话信息.
     *
     * @param UpdateAgentConversationRequest $request
     *
     * @return UpdateAgentConversationResponse
     */
    public function updateAgentConversation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAgentConversationEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑会话信息
     * Summary: 编辑会话信息.
     *
     * @param UpdateAgentConversationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateAgentConversationResponse
     */
    public function updateAgentConversationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAgentConversationResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.agent.conversation.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: agent api 同步
     * Summary: agent api.
     *
     * @param QueryAgentCompletionRequest $request
     *
     * @return QueryAgentCompletionResponse
     */
    public function queryAgentCompletion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAgentCompletionEx($request, $headers, $runtime);
    }

    /**
     * Description: agent api 同步
     * Summary: agent api.
     *
     * @param QueryAgentCompletionRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryAgentCompletionResponse
     */
    public function queryAgentCompletionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAgentCompletionResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.agent.completion.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车抵贷人群匹配
     * Summary: 车抵贷人群匹配.
     *
     * @param MatchCarloanUsersRequest $request
     *
     * @return MatchCarloanUsersResponse
     */
    public function matchCarloanUsers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->matchCarloanUsersEx($request, $headers, $runtime);
    }

    /**
     * Description: 车抵贷人群匹配
     * Summary: 车抵贷人群匹配.
     *
     * @param MatchCarloanUsersRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return MatchCarloanUsersResponse
     */
    public function matchCarloanUsersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MatchCarloanUsersResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.carloan.users.match', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量碰撞人群数据
     * Summary: 批量碰撞人群数据.
     *
     * @param BatchqueryCarloanUsersRequest $request
     *
     * @return BatchqueryCarloanUsersResponse
     */
    public function batchqueryCarloanUsers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryCarloanUsersEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量碰撞人群数据
     * Summary: 批量碰撞人群数据.
     *
     * @param BatchqueryCarloanUsersRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchqueryCarloanUsersResponse
     */
    public function batchqueryCarloanUsersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryCarloanUsersResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.carloan.users.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入人群文件
     * Summary: 导入人群文件.
     *
     * @param ImportCarloanUsersRequest $request
     *
     * @return ImportCarloanUsersResponse
     */
    public function importCarloanUsers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importCarloanUsersEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入人群文件
     * Summary: 导入人群文件.
     *
     * @param ImportCarloanUsersRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ImportCarloanUsersResponse
     */
    public function importCarloanUsersEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.zkcollabinv.carloan.users.import',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ImportCarloanUsersResponse([
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

        return ImportCarloanUsersResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.carloan.users.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加用户
     * Summary: 添加天猫用户.
     *
     * @param AddCaruserUsersRequest $request
     *
     * @return AddCaruserUsersResponse
     */
    public function addCaruserUsers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCaruserUsersEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加用户
     * Summary: 添加天猫用户.
     *
     * @param AddCaruserUsersRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddCaruserUsersResponse
     */
    public function addCaruserUsersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCaruserUsersResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.caruser.users.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询匹配结果
     * Summary: 查询结果.
     *
     * @param QueryCarloanUsersRequest $request
     *
     * @return QueryCarloanUsersResponse
     */
    public function queryCarloanUsers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarloanUsersEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询匹配结果
     * Summary: 查询结果.
     *
     * @param QueryCarloanUsersRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryCarloanUsersResponse
     */
    public function queryCarloanUsersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarloanUsersResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.carloan.users.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口添加用户
     * Summary: 测试接口添加用户.
     *
     * @param AddCaruserTestRequest $request
     *
     * @return AddCaruserTestResponse
     */
    public function addCaruserTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCaruserTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口添加用户
     * Summary: 测试接口添加用户.
     *
     * @param AddCaruserTestRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddCaruserTestResponse
     */
    public function addCaruserTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCaruserTestResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.caruser.test.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生产接口增加人群
     * Summary: 生产接口增加人群.
     *
     * @param AddCaruserPrdRequest $request
     *
     * @return AddCaruserPrdResponse
     */
    public function addCaruserPrd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCaruserPrdEx($request, $headers, $runtime);
    }

    /**
     * Description: 生产接口增加人群
     * Summary: 生产接口增加人群.
     *
     * @param AddCaruserPrdRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddCaruserPrdResponse
     */
    public function addCaruserPrdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCaruserPrdResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.caruser.prd.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碰撞人群数据测试接口碰撞人群数据
     * Summary: 测试接口碰撞人群数据.
     *
     * @param BatchqueryCarloanTestRequest $request
     *
     * @return BatchqueryCarloanTestResponse
     */
    public function batchqueryCarloanTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryCarloanTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 碰撞人群数据测试接口碰撞人群数据
     * Summary: 测试接口碰撞人群数据.
     *
     * @param BatchqueryCarloanTestRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return BatchqueryCarloanTestResponse
     */
    public function batchqueryCarloanTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryCarloanTestResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.carloan.test.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生产接口碰撞人群数据
     * Summary: 生产接口碰撞人群数据.
     *
     * @param BatchqueryCarloanPrdRequest $request
     *
     * @return BatchqueryCarloanPrdResponse
     */
    public function batchqueryCarloanPrd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryCarloanPrdEx($request, $headers, $runtime);
    }

    /**
     * Description: 生产接口碰撞人群数据
     * Summary: 生产接口碰撞人群数据.
     *
     * @param BatchqueryCarloanPrdRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return BatchqueryCarloanPrdResponse
     */
    public function batchqueryCarloanPrdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryCarloanPrdResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.carloan.prd.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: idMapping碰撞
     * Summary: idMapping碰撞.
     *
     * @param ImportIdmapSamplefileRequest $request
     *
     * @return ImportIdmapSamplefileResponse
     */
    public function importIdmapSamplefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importIdmapSamplefileEx($request, $headers, $runtime);
    }

    /**
     * Description: idMapping碰撞
     * Summary: idMapping碰撞.
     *
     * @param ImportIdmapSamplefileRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ImportIdmapSamplefileResponse
     */
    public function importIdmapSamplefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportIdmapSamplefileResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.idmap.samplefile.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: psi求交结果导入
     * Summary: psi求交结果导入.
     *
     * @param ImportIdmapPsiresultfileRequest $request
     *
     * @return ImportIdmapPsiresultfileResponse
     */
    public function importIdmapPsiresultfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importIdmapPsiresultfileEx($request, $headers, $runtime);
    }

    /**
     * Description: psi求交结果导入
     * Summary: psi求交结果导入.
     *
     * @param ImportIdmapPsiresultfileRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ImportIdmapPsiresultfileResponse
     */
    public function importIdmapPsiresultfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportIdmapPsiresultfileResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.idmap.psiresultfile.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 投行研究，品牌调用
     * Summary: 投行研究，品牌调用.
     *
     * @param QueryIndexresearchBrandRequest $request
     *
     * @return QueryIndexresearchBrandResponse
     */
    public function queryIndexresearchBrand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndexresearchBrandEx($request, $headers, $runtime);
    }

    /**
     * Description: 投行研究，品牌调用
     * Summary: 投行研究，品牌调用.
     *
     * @param QueryIndexresearchBrandRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryIndexresearchBrandResponse
     */
    public function queryIndexresearchBrandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndexresearchBrandResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.indexresearch.brand.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 投行研究，查询品牌指标结果
     * Summary: 查询品牌指标.
     *
     * @param QueryIndexresearchBrandindexRequest $request
     *
     * @return QueryIndexresearchBrandindexResponse
     */
    public function queryIndexresearchBrandindex($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndexresearchBrandindexEx($request, $headers, $runtime);
    }

    /**
     * Description: 投行研究，查询品牌指标结果
     * Summary: 查询品牌指标.
     *
     * @param QueryIndexresearchBrandindexRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryIndexresearchBrandindexResponse
     */
    public function queryIndexresearchBrandindexEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndexresearchBrandindexResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.indexresearch.brandindex.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费行业报告查询
     * Summary: 消费行业报告查询.
     *
     * @param QueryIndexresearchConsumeindustryRequest $request
     *
     * @return QueryIndexresearchConsumeindustryResponse
     */
    public function queryIndexresearchConsumeindustry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndexresearchConsumeindustryEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费行业报告查询
     * Summary: 消费行业报告查询.
     *
     * @param QueryIndexresearchConsumeindustryRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryIndexresearchConsumeindustryResponse
     */
    public function queryIndexresearchConsumeindustryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndexresearchConsumeindustryResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.indexresearch.consumeindustry.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费行业报告行业查询
     * Summary: 消费行业报告行业查询.
     *
     * @param QueryIndexresearchIndustryRequest $request
     *
     * @return QueryIndexresearchIndustryResponse
     */
    public function queryIndexresearchIndustry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndexresearchIndustryEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费行业报告行业查询
     * Summary: 消费行业报告行业查询.
     *
     * @param QueryIndexresearchIndustryRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryIndexresearchIndustryResponse
     */
    public function queryIndexresearchIndustryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndexresearchIndustryResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.indexresearch.industry.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于交易数据的定位信息协查
     * Summary: 定位协查.
     *
     * @param QueryLocationInternalRequest $request
     *
     * @return QueryLocationInternalResponse
     */
    public function queryLocationInternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLocationInternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于交易数据的定位信息协查
     * Summary: 定位协查.
     *
     * @param QueryLocationInternalRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryLocationInternalResponse
     */
    public function queryLocationInternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLocationInternalResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.location.internal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于交易数据的定位信息协查对外接口
     * Summary: 定位协查对外接口.
     *
     * @param QueryLocationTradeRequest $request
     *
     * @return QueryLocationTradeResponse
     */
    public function queryLocationTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLocationTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于交易数据的定位信息协查对外接口
     * Summary: 定位协查对外接口.
     *
     * @param QueryLocationTradeRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryLocationTradeResponse
     */
    public function queryLocationTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLocationTradeResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.location.trade.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 样本文件摘要
     * Summary: 样本文件摘要
     *
     * @param PushModelSamplefileRequest $request
     *
     * @return PushModelSamplefileResponse
     */
    public function pushModelSamplefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushModelSamplefileEx($request, $headers, $runtime);
    }

    /**
     * Description: 样本文件摘要
     * Summary: 样本文件摘要
     *
     * @param PushModelSamplefileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PushModelSamplefileResponse
     */
    public function pushModelSamplefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushModelSamplefileResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.samplefile.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 样本任务执行
     * Summary: 样本任务执行.
     *
     * @param ExecModelSampletaskRequest $request
     *
     * @return ExecModelSampletaskResponse
     */
    public function execModelSampletask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execModelSampletaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 样本任务执行
     * Summary: 样本任务执行.
     *
     * @param ExecModelSampletaskRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecModelSampletaskResponse
     */
    public function execModelSampletaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecModelSampletaskResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.sampletask.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 任务状态查询
     * Summary: 任务状态查询.
     *
     * @param QueryModelSampletaskRequest $request
     *
     * @return QueryModelSampletaskResponse
     */
    public function queryModelSampletask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelSampletaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 任务状态查询
     * Summary: 任务状态查询.
     *
     * @param QueryModelSampletaskRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryModelSampletaskResponse
     */
    public function queryModelSampletaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelSampletaskResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.sampletask.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 特征集查询
     * Summary: 特征集查询.
     *
     * @param QueryModelFeaturesetRequest $request
     *
     * @return QueryModelFeaturesetResponse
     */
    public function queryModelFeatureset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelFeaturesetEx($request, $headers, $runtime);
    }

    /**
     * Description: 特征集查询
     * Summary: 特征集查询.
     *
     * @param QueryModelFeaturesetRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryModelFeaturesetResponse
     */
    public function queryModelFeaturesetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelFeaturesetResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.featureset.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 模型保存
     * Summary: 模型保存.
     *
     * @param SubmitModelInstanceRequest $request
     *
     * @return SubmitModelInstanceResponse
     */
    public function submitModelInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitModelInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 模型保存
     * Summary: 模型保存.
     *
     * @param SubmitModelInstanceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SubmitModelInstanceResponse
     */
    public function submitModelInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitModelInstanceResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.instance.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 模型调用统计查询
     * Summary: 模型调用统计查询.
     *
     * @param QueryModelStatsRequest $request
     *
     * @return QueryModelStatsResponse
     */
    public function queryModelStats($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelStatsEx($request, $headers, $runtime);
    }

    /**
     * Description: 模型调用统计查询
     * Summary: 模型调用统计查询.
     *
     * @param QueryModelStatsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryModelStatsResponse
     */
    public function queryModelStatsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelStatsResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.stats.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用查询
     * Summary: 通用查询.
     *
     * @param QueryModelCommonscoreRequest $request
     *
     * @return QueryModelCommonscoreResponse
     */
    public function queryModelCommonscore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelCommonscoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用查询
     * Summary: 通用查询.
     *
     * @param QueryModelCommonscoreRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryModelCommonscoreResponse
     */
    public function queryModelCommonscoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelCommonscoreResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.commonscore.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用查询批次，仅针对外部使用PIR场景
     * Summary: 通用查询批次
     *
     * @param BatchqueryModelCommonscoreRequest $request
     *
     * @return BatchqueryModelCommonscoreResponse
     */
    public function batchqueryModelCommonscore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryModelCommonscoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用查询批次，仅针对外部使用PIR场景
     * Summary: 通用查询批次
     *
     * @param BatchqueryModelCommonscoreRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchqueryModelCommonscoreResponse
     */
    public function batchqueryModelCommonscoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryModelCommonscoreResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.commonscore.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 多模型预测值
     * Summary: 多模型预测值
     *
     * @param QueryModelMultiscoreRequest $request
     *
     * @return QueryModelMultiscoreResponse
     */
    public function queryModelMultiscore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelMultiscoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 多模型预测值
     * Summary: 多模型预测值
     *
     * @param QueryModelMultiscoreRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryModelMultiscoreResponse
     */
    public function queryModelMultiscoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelMultiscoreResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.multiscore.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融合模型的调用
     * Summary: 融合模型调用.
     *
     * @param QueryModelFusionmodelRequest $request
     *
     * @return QueryModelFusionmodelResponse
     */
    public function queryModelFusionmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelFusionmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 融合模型的调用
     * Summary: 融合模型调用.
     *
     * @param QueryModelFusionmodelRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryModelFusionmodelResponse
     */
    public function queryModelFusionmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelFusionmodelResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.fusionmodel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用工分
     * Summary: 用工分调用.
     *
     * @param QueryModelWorkscoreRequest $request
     *
     * @return QueryModelWorkscoreResponse
     */
    public function queryModelWorkscore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelWorkscoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 用工分
     * Summary: 用工分调用.
     *
     * @param QueryModelWorkscoreRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryModelWorkscoreResponse
     */
    public function queryModelWorkscoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelWorkscoreResponse::fromMap($this->doRequest('1.0', 'antchain.zkcollabinv.model.workscore.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
