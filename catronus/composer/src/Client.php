<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CATRONUS\Models\AddClusterRequest;
use AntChain\CATRONUS\Models\AddClusterResponse;
use AntChain\CATRONUS\Models\AddStrategyRequest;
use AntChain\CATRONUS\Models\AddStrategyResponse;
use AntChain\CATRONUS\Models\BindStrategyRequest;
use AntChain\CATRONUS\Models\BindStrategyResponse;
use AntChain\CATRONUS\Models\CancelRiskTaskRequest;
use AntChain\CATRONUS\Models\CancelRiskTaskResponse;
use AntChain\CATRONUS\Models\CloseRiskTaskRequest;
use AntChain\CATRONUS\Models\CloseRiskTaskResponse;
use AntChain\CATRONUS\Models\ConfirmRiskTaskRequest;
use AntChain\CATRONUS\Models\ConfirmRiskTaskResponse;
use AntChain\CATRONUS\Models\CreateImageRepoRequest;
use AntChain\CATRONUS\Models\CreateImageRepoResponse;
use AntChain\CATRONUS\Models\CreateImageReposcanstrategyRequest;
use AntChain\CATRONUS\Models\CreateImageReposcanstrategyResponse;
use AntChain\CATRONUS\Models\CreateRiskSolutionRequest;
use AntChain\CATRONUS\Models\CreateRiskSolutionResponse;
use AntChain\CATRONUS\Models\CreateRiskTaskRequest;
use AntChain\CATRONUS\Models\CreateRiskTaskResponse;
use AntChain\CATRONUS\Models\CreateRuntimePolicyRequest;
use AntChain\CATRONUS\Models\CreateRuntimePolicyResponse;
use AntChain\CATRONUS\Models\DeleteImageRepoRequest;
use AntChain\CATRONUS\Models\DeleteImageRepoResponse;
use AntChain\CATRONUS\Models\DeleteImageReposcanstrategyRequest;
use AntChain\CATRONUS\Models\DeleteImageReposcanstrategyResponse;
use AntChain\CATRONUS\Models\DeleteRiskSolutionRequest;
use AntChain\CATRONUS\Models\DeleteRiskSolutionResponse;
use AntChain\CATRONUS\Models\DeleteRuntimePolicyRequest;
use AntChain\CATRONUS\Models\DeleteRuntimePolicyResponse;
use AntChain\CATRONUS\Models\GetImageRepoRequest;
use AntChain\CATRONUS\Models\GetImageRepoResponse;
use AntChain\CATRONUS\Models\GetImageRiskdetailurlRequest;
use AntChain\CATRONUS\Models\GetImageRiskdetailurlResponse;
use AntChain\CATRONUS\Models\GetRiskSolutionRequest;
use AntChain\CATRONUS\Models\GetRiskSolutionResponse;
use AntChain\CATRONUS\Models\GetRiskStatisticsRequest;
use AntChain\CATRONUS\Models\GetRiskStatisticsResponse;
use AntChain\CATRONUS\Models\GetRiskTaskRequest;
use AntChain\CATRONUS\Models\GetRiskTaskResponse;
use AntChain\CATRONUS\Models\GetRuntimePolicyRequest;
use AntChain\CATRONUS\Models\GetRuntimePolicyResponse;
use AntChain\CATRONUS\Models\GetStrategyDefaultRequest;
use AntChain\CATRONUS\Models\GetStrategyDefaultResponse;
use AntChain\CATRONUS\Models\ImportClusterRequest;
use AntChain\CATRONUS\Models\ImportClusterResponse;
use AntChain\CATRONUS\Models\ListClusterImagesRequest;
use AntChain\CATRONUS\Models\ListClusterImagesResponse;
use AntChain\CATRONUS\Models\ListRuntimePoliciesRequest;
use AntChain\CATRONUS\Models\ListRuntimePoliciesResponse;
use AntChain\CATRONUS\Models\ListRuntimepolicyNodesRequest;
use AntChain\CATRONUS\Models\ListRuntimepolicyNodesResponse;
use AntChain\CATRONUS\Models\ListRuntimepolicyPodsRequest;
use AntChain\CATRONUS\Models\ListRuntimepolicyPodsResponse;
use AntChain\CATRONUS\Models\QueryClusterBaselineRequest;
use AntChain\CATRONUS\Models\QueryClusterBaselineResponse;
use AntChain\CATRONUS\Models\QueryClusterBriefRequest;
use AntChain\CATRONUS\Models\QueryClusterBriefResponse;
use AntChain\CATRONUS\Models\QueryClusterNamespaceRequest;
use AntChain\CATRONUS\Models\QueryClusterNamespaceResponse;
use AntChain\CATRONUS\Models\QueryClusterRequest;
use AntChain\CATRONUS\Models\QueryClusterResponse;
use AntChain\CATRONUS\Models\QueryClusterScanRequest;
use AntChain\CATRONUS\Models\QueryClusterScanResponse;
use AntChain\CATRONUS\Models\QueryImagerepoProjectsRequest;
use AntChain\CATRONUS\Models\QueryImagerepoProjectsResponse;
use AntChain\CATRONUS\Models\QueryImagerepoRepositoriesRequest;
use AntChain\CATRONUS\Models\QueryImagerepoRepositoriesResponse;
use AntChain\CATRONUS\Models\QueryImageReposcanstrategiesRequest;
use AntChain\CATRONUS\Models\QueryImageReposcanstrategiesResponse;
use AntChain\CATRONUS\Models\QueryImageReposRequest;
use AntChain\CATRONUS\Models\QueryImageReposResponse;
use AntChain\CATRONUS\Models\QueryRiskAuditsRequest;
use AntChain\CATRONUS\Models\QueryRiskAuditsResponse;
use AntChain\CATRONUS\Models\QueryRiskSolutionsRequest;
use AntChain\CATRONUS\Models\QueryRiskSolutionsResponse;
use AntChain\CATRONUS\Models\QueryRisksRequest;
use AntChain\CATRONUS\Models\QueryRisksResponse;
use AntChain\CATRONUS\Models\QueryRiskTasksRequest;
use AntChain\CATRONUS\Models\QueryRiskTasksResponse;
use AntChain\CATRONUS\Models\QueryStrategyRequest;
use AntChain\CATRONUS\Models\QueryStrategyResponse;
use AntChain\CATRONUS\Models\ReclaimClusterRequest;
use AntChain\CATRONUS\Models\ReclaimClusterResponse;
use AntChain\CATRONUS\Models\RefuseRiskTaskRequest;
use AntChain\CATRONUS\Models\RefuseRiskTaskResponse;
use AntChain\CATRONUS\Models\ScaleRiskTaskRequest;
use AntChain\CATRONUS\Models\ScaleRiskTaskResponse;
use AntChain\CATRONUS\Models\SendRiskTaskRequest;
use AntChain\CATRONUS\Models\SendRiskTaskResponse;
use AntChain\CATRONUS\Models\SkipClusterBaselineRequest;
use AntChain\CATRONUS\Models\SkipClusterBaselineResponse;
use AntChain\CATRONUS\Models\StartClusterQuickscanRequest;
use AntChain\CATRONUS\Models\StartClusterQuickscanResponse;
use AntChain\CATRONUS\Models\SubmitImagesReposcanRequest;
use AntChain\CATRONUS\Models\SubmitImagesReposcanResponse;
use AntChain\CATRONUS\Models\UpdateImageRepoRequest;
use AntChain\CATRONUS\Models\UpdateImageRepoResponse;
use AntChain\CATRONUS\Models\UpdateImageReposcanstrategyRequest;
use AntChain\CATRONUS\Models\UpdateImageReposcanstrategyResponse;
use AntChain\CATRONUS\Models\UpdateRiskSolutionRequest;
use AntChain\CATRONUS\Models\UpdateRiskSolutionResponse;
use AntChain\CATRONUS\Models\UpdateRiskTaskRequest;
use AntChain\CATRONUS\Models\UpdateRiskTaskResponse;
use AntChain\CATRONUS\Models\UpdateRuntimePolicyRequest;
use AntChain\CATRONUS\Models\UpdateRuntimePolicyResponse;
use AntChain\CATRONUS\Models\UpdateStrategyRequest;
use AntChain\CATRONUS\Models\UpdateStrategyResponse;
use AntChain\CATRONUS\Models\VerifyImageRepoRequest;
use AntChain\CATRONUS\Models\VerifyImageRepoResponse;
use AntChain\CATRONUS\Models\VerifyRiskTaskRequest;
use AntChain\CATRONUS\Models\VerifyRiskTaskResponse;
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
            // fixpath
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
                    'sdk_version'      => '1.0.80',
                    '_prod_code'       => 'CATRONUS',
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
     * Description: 创建风险工单/任务
     * Summary: 创建风险工单/任务
     *
     * @param CreateRiskTaskRequest $request
     *
     * @return CreateRiskTaskResponse
     */
    public function createRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建风险工单/任务
     * Summary: 创建风险工单/任务
     *
     * @param CreateRiskTaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateRiskTaskResponse
     */
    public function createRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询风险任务列表
     * Summary: 查询风险任务列表.
     *
     * @param QueryRiskTasksRequest $request
     *
     * @return QueryRiskTasksResponse
     */
    public function queryRiskTasks($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskTasksEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询风险任务列表
     * Summary: 查询风险任务列表.
     *
     * @param QueryRiskTasksRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryRiskTasksResponse
     */
    public function queryRiskTasksEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskTasksResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.tasks.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取风险更单详情
     * Summary: 获取风险更单详情.
     *
     * @param GetRiskTaskRequest $request
     *
     * @return GetRiskTaskResponse
     */
    public function getRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取风险更单详情
     * Summary: 获取风险更单详情.
     *
     * @param GetRiskTaskRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetRiskTaskResponse
     */
    public function getRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
     * Summary: 更新风险工单.
     *
     * @param UpdateRiskTaskRequest $request
     *
     * @return UpdateRiskTaskResponse
     */
    public function updateRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
     * Summary: 更新风险工单.
     *
     * @param UpdateRiskTaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateRiskTaskResponse
     */
    public function updateRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认风险工单
     * Summary: 确认风险工单.
     *
     * @param ConfirmRiskTaskRequest $request
     *
     * @return ConfirmRiskTaskResponse
     */
    public function confirmRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认风险工单
     * Summary: 确认风险工单.
     *
     * @param ConfirmRiskTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ConfirmRiskTaskResponse
     */
    public function confirmRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 撤销风险工单
     * Summary: 撤销风险工单.
     *
     * @param CancelRiskTaskRequest $request
     *
     * @return CancelRiskTaskResponse
     */
    public function cancelRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 撤销风险工单
     * Summary: 撤销风险工单.
     *
     * @param CancelRiskTaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CancelRiskTaskResponse
     */
    public function cancelRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 驳回风险工单
     * Summary: 驳回风险工单.
     *
     * @param RefuseRiskTaskRequest $request
     *
     * @return RefuseRiskTaskResponse
     */
    public function refuseRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 驳回风险工单
     * Summary: 驳回风险工单.
     *
     * @param RefuseRiskTaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RefuseRiskTaskResponse
     */
    public function refuseRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认风险工单修复
     * Summary: 确认风险工单修复.
     *
     * @param VerifyRiskTaskRequest $request
     *
     * @return VerifyRiskTaskResponse
     */
    public function verifyRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认风险工单修复
     * Summary: 确认风险工单修复.
     *
     * @param VerifyRiskTaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return VerifyRiskTaskResponse
     */
    public function verifyRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 转派工单负责人
     * Summary: 转派工单负责人.
     *
     * @param SendRiskTaskRequest $request
     *
     * @return SendRiskTaskResponse
     */
    public function sendRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 转派工单负责人
     * Summary: 转派工单负责人.
     *
     * @param SendRiskTaskRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SendRiskTaskResponse
     */
    public function sendRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认风险工单修复，待安全Owner确认
     * Summary: 确认风险工单修复.
     *
     * @param CloseRiskTaskRequest $request
     *
     * @return CloseRiskTaskResponse
     */
    public function closeRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->closeRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认风险工单修复，待安全Owner确认
     * Summary: 确认风险工单修复.
     *
     * @param CloseRiskTaskRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CloseRiskTaskResponse
     */
    public function closeRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloseRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.close', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取个人风险项统计
     * Summary: 获取个人风险项统计
     *
     * @param GetRiskStatisticsRequest $request
     *
     * @return GetRiskStatisticsResponse
     */
    public function getRiskStatistics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRiskStatisticsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取个人风险项统计
     * Summary: 获取个人风险项统计
     *
     * @param GetRiskStatisticsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetRiskStatisticsResponse
     */
    public function getRiskStatisticsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRiskStatisticsResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.statistics.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询风险日志审计
     * Summary: 查询风险日志审计
     *
     * @param QueryRiskAuditsRequest $request
     *
     * @return QueryRiskAuditsResponse
     */
    public function queryRiskAudits($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskAuditsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询风险日志审计
     * Summary: 查询风险日志审计
     *
     * @param QueryRiskAuditsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryRiskAuditsResponse
     */
    public function queryRiskAuditsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskAuditsResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.audits.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建风险解决方案
     * Summary: 创建风险解决方案.
     *
     * @param CreateRiskSolutionRequest $request
     *
     * @return CreateRiskSolutionResponse
     */
    public function createRiskSolution($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRiskSolutionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建风险解决方案
     * Summary: 创建风险解决方案.
     *
     * @param CreateRiskSolutionRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateRiskSolutionResponse
     */
    public function createRiskSolutionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRiskSolutionResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.solution.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询风险解决方案列表
     * Summary: 查询风险解决方案.
     *
     * @param QueryRiskSolutionsRequest $request
     *
     * @return QueryRiskSolutionsResponse
     */
    public function queryRiskSolutions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskSolutionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询风险解决方案列表
     * Summary: 查询风险解决方案.
     *
     * @param QueryRiskSolutionsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryRiskSolutionsResponse
     */
    public function queryRiskSolutionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskSolutionsResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.solutions.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取风险解决方案详情
     * Summary: 获取风险解决方案.
     *
     * @param GetRiskSolutionRequest $request
     *
     * @return GetRiskSolutionResponse
     */
    public function getRiskSolution($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRiskSolutionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取风险解决方案详情
     * Summary: 获取风险解决方案.
     *
     * @param GetRiskSolutionRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetRiskSolutionResponse
     */
    public function getRiskSolutionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRiskSolutionResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.solution.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新风险解决方案
     * Summary: 更新风险解决方案.
     *
     * @param UpdateRiskSolutionRequest $request
     *
     * @return UpdateRiskSolutionResponse
     */
    public function updateRiskSolution($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRiskSolutionEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新风险解决方案
     * Summary: 更新风险解决方案.
     *
     * @param UpdateRiskSolutionRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateRiskSolutionResponse
     */
    public function updateRiskSolutionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRiskSolutionResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.solution.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除风险解决方案
     * Summary: 删除风险解决方案.
     *
     * @param DeleteRiskSolutionRequest $request
     *
     * @return DeleteRiskSolutionResponse
     */
    public function deleteRiskSolution($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteRiskSolutionEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除风险解决方案
     * Summary: 删除风险解决方案.
     *
     * @param DeleteRiskSolutionRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteRiskSolutionResponse
     */
    public function deleteRiskSolutionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteRiskSolutionResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.solution.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纳管目标k8s集群
     * Summary: 导入（纳管）集群.
     *
     * @param ImportClusterRequest $request
     *
     * @return ImportClusterResponse
     */
    public function importCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 纳管目标k8s集群
     * Summary: 导入（纳管）集群.
     *
     * @param ImportClusterRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ImportClusterResponse
     */
    public function importClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportClusterResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 手动新增集群
     * Summary: 手动新增集群.
     *
     * @param AddClusterRequest $request
     *
     * @return AddClusterResponse
     */
    public function addCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 手动新增集群
     * Summary: 手动新增集群.
     *
     * @param AddClusterRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AddClusterResponse
     */
    public function addClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddClusterResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询集群
     * Summary: 查询集群.
     *
     * @param QueryClusterRequest $request
     *
     * @return QueryClusterResponse
     */
    public function queryCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询集群
     * Summary: 查询集群.
     *
     * @param QueryClusterRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryClusterResponse
     */
    public function queryClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryClusterResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询集群namespace
     * Summary: 查询集群namespace.
     *
     * @param QueryClusterNamespaceRequest $request
     *
     * @return QueryClusterNamespaceResponse
     */
    public function queryClusterNamespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryClusterNamespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询集群namespace
     * Summary: 查询集群namespace.
     *
     * @param QueryClusterNamespaceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryClusterNamespaceResponse
     */
    public function queryClusterNamespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryClusterNamespaceResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.namespace.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解绑集群
     * Summary: 解绑集群.
     *
     * @param ReclaimClusterRequest $request
     *
     * @return ReclaimClusterResponse
     */
    public function reclaimCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reclaimClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 解绑集群
     * Summary: 解绑集群.
     *
     * @param ReclaimClusterRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ReclaimClusterResponse
     */
    public function reclaimClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReclaimClusterResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.reclaim', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取集群安全简报列表
     * Summary: 获取集群安全简报列表.
     *
     * @param QueryClusterBriefRequest $request
     *
     * @return QueryClusterBriefResponse
     */
    public function queryClusterBrief($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryClusterBriefEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取集群安全简报列表
     * Summary: 获取集群安全简报列表.
     *
     * @param QueryClusterBriefRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryClusterBriefResponse
     */
    public function queryClusterBriefEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryClusterBriefResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.brief.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取默认策略
     * Summary: 获取默认策略.
     *
     * @param GetStrategyDefaultRequest $request
     *
     * @return GetStrategyDefaultResponse
     */
    public function getStrategyDefault($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getStrategyDefaultEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取默认策略
     * Summary: 获取默认策略.
     *
     * @param GetStrategyDefaultRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetStrategyDefaultResponse
     */
    public function getStrategyDefaultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetStrategyDefaultResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.strategy.default.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置安全策略
     * Summary: 设置安全策略.
     *
     * @param AddStrategyRequest $request
     *
     * @return AddStrategyResponse
     */
    public function addStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置安全策略
     * Summary: 设置安全策略.
     *
     * @param AddStrategyRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddStrategyResponse
     */
    public function addStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddStrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.strategy.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定集群
     * Summary: 绑定集群.
     *
     * @param BindStrategyRequest $request
     *
     * @return BindStrategyResponse
     */
    public function bindStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定集群
     * Summary: 绑定集群.
     *
     * @param BindStrategyRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return BindStrategyResponse
     */
    public function bindStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindStrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.strategy.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险列表
     * Summary: 风险列表.
     *
     * @param QueryRisksRequest $request
     *
     * @return QueryRisksResponse
     */
    public function queryRisks($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRisksEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险列表
     * Summary: 风险列表.
     *
     * @param QueryRisksRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryRisksResponse
     */
    public function queryRisksEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRisksResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risks.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新策略
     * Summary: 更新策略.
     *
     * @param UpdateStrategyRequest $request
     *
     * @return UpdateStrategyResponse
     */
    public function updateStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新策略
     * Summary: 更新策略.
     *
     * @param UpdateStrategyRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateStrategyResponse
     */
    public function updateStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateStrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.strategy.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拉策略列表
     * Summary: 拉策略列表.
     *
     * @param QueryStrategyRequest $request
     *
     * @return QueryStrategyResponse
     */
    public function queryStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 拉策略列表
     * Summary: 拉策略列表.
     *
     * @param QueryStrategyRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryStrategyResponse
     */
    public function queryStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.strategy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险任务延期
     * Summary: 风险任务延期
     *
     * @param ScaleRiskTaskRequest $request
     *
     * @return ScaleRiskTaskResponse
     */
    public function scaleRiskTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->scaleRiskTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险任务延期
     * Summary: 风险任务延期
     *
     * @param ScaleRiskTaskRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ScaleRiskTaskResponse
     */
    public function scaleRiskTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ScaleRiskTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.risk.task.scale', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询集群镜像列表
     * Summary: 查询集群镜像列表.
     *
     * @param ListClusterImagesRequest $request
     *
     * @return ListClusterImagesResponse
     */
    public function listClusterImages($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listClusterImagesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询集群镜像列表
     * Summary: 查询集群镜像列表.
     *
     * @param ListClusterImagesRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListClusterImagesResponse
     */
    public function listClusterImagesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListClusterImagesResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.images.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主动触发快速扫描
     * Summary: 主动触发快速扫描.
     *
     * @param StartClusterQuickscanRequest $request
     *
     * @return StartClusterQuickscanResponse
     */
    public function startClusterQuickscan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startClusterQuickscanEx($request, $headers, $runtime);
    }

    /**
     * Description: 主动触发快速扫描
     * Summary: 主动触发快速扫描.
     *
     * @param StartClusterQuickscanRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return StartClusterQuickscanResponse
     */
    public function startClusterQuickscanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartClusterQuickscanResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.quickscan.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询扫描结果
     * Summary: 查询扫描结果.
     *
     * @param QueryClusterScanRequest $request
     *
     * @return QueryClusterScanResponse
     */
    public function queryClusterScan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryClusterScanEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询扫描结果
     * Summary: 查询扫描结果.
     *
     * @param QueryClusterScanRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryClusterScanResponse
     */
    public function queryClusterScanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryClusterScanResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.scan.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建运行时策略
     * Summary: 创建运行时策略.
     *
     * @param CreateRuntimePolicyRequest $request
     *
     * @return CreateRuntimePolicyResponse
     */
    public function createRuntimePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRuntimePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建运行时策略
     * Summary: 创建运行时策略.
     *
     * @param CreateRuntimePolicyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateRuntimePolicyResponse
     */
    public function createRuntimePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRuntimePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.runtime.policy.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询运行时策略列表
     * Summary: 查询运行时策略列表.
     *
     * @param ListRuntimePoliciesRequest $request
     *
     * @return ListRuntimePoliciesResponse
     */
    public function listRuntimePolicies($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRuntimePoliciesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询运行时策略列表
     * Summary: 查询运行时策略列表.
     *
     * @param ListRuntimePoliciesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListRuntimePoliciesResponse
     */
    public function listRuntimePoliciesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRuntimePoliciesResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.runtime.policies.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新运行时策略
     * Summary: 更新运行时策略.
     *
     * @param UpdateRuntimePolicyRequest $request
     *
     * @return UpdateRuntimePolicyResponse
     */
    public function updateRuntimePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRuntimePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新运行时策略
     * Summary: 更新运行时策略.
     *
     * @param UpdateRuntimePolicyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateRuntimePolicyResponse
     */
    public function updateRuntimePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRuntimePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.runtime.policy.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除运行时策略
     * Summary: 删除运行时策略.
     *
     * @param DeleteRuntimePolicyRequest $request
     *
     * @return DeleteRuntimePolicyResponse
     */
    public function deleteRuntimePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteRuntimePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除运行时策略
     * Summary: 删除运行时策略.
     *
     * @param DeleteRuntimePolicyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteRuntimePolicyResponse
     */
    public function deleteRuntimePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteRuntimePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.runtime.policy.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取运行时策略目标Pods
     * Summary: 获取运行时策略Pods.
     *
     * @param ListRuntimepolicyPodsRequest $request
     *
     * @return ListRuntimepolicyPodsResponse
     */
    public function listRuntimepolicyPods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRuntimepolicyPodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取运行时策略目标Pods
     * Summary: 获取运行时策略Pods.
     *
     * @param ListRuntimepolicyPodsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListRuntimepolicyPodsResponse
     */
    public function listRuntimepolicyPodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRuntimepolicyPodsResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.runtimepolicy.pods.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取运行时策略Nodes
     * Summary: 获取运行时策略Nodes.
     *
     * @param ListRuntimepolicyNodesRequest $request
     *
     * @return ListRuntimepolicyNodesResponse
     */
    public function listRuntimepolicyNodes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRuntimepolicyNodesEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取运行时策略Nodes
     * Summary: 获取运行时策略Nodes.
     *
     * @param ListRuntimepolicyNodesRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListRuntimepolicyNodesResponse
     */
    public function listRuntimepolicyNodesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRuntimepolicyNodesResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.runtimepolicy.nodes.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取运行时策略详情
     * Summary: 获取运行时策略详情.
     *
     * @param GetRuntimePolicyRequest $request
     *
     * @return GetRuntimePolicyResponse
     */
    public function getRuntimePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRuntimePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取运行时策略详情
     * Summary: 获取运行时策略详情.
     *
     * @param GetRuntimePolicyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetRuntimePolicyResponse
     */
    public function getRuntimePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRuntimePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.runtime.policy.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基线扫描结果查询
     * Summary: 基线扫描结果查询.
     *
     * @param QueryClusterBaselineRequest $request
     *
     * @return QueryClusterBaselineResponse
     */
    public function queryClusterBaseline($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryClusterBaselineEx($request, $headers, $runtime);
    }

    /**
     * Description: 基线扫描结果查询
     * Summary: 基线扫描结果查询.
     *
     * @param QueryClusterBaselineRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryClusterBaselineResponse
     */
    public function queryClusterBaselineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryClusterBaselineResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.baseline.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交镜像扫描触发任务
     * Summary: 提交镜像扫描触发任务
     *
     * @param SubmitImagesReposcanRequest $request
     *
     * @return SubmitImagesReposcanResponse
     */
    public function submitImagesReposcan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitImagesReposcanEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交镜像扫描触发任务
     * Summary: 提交镜像扫描触发任务
     *
     * @param SubmitImagesReposcanRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SubmitImagesReposcanResponse
     */
    public function submitImagesReposcanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitImagesReposcanResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.images.reposcan.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建镜像仓库
     * Summary: 创建镜像仓库.
     *
     * @param CreateImageRepoRequest $request
     *
     * @return CreateImageRepoResponse
     */
    public function createImageRepo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createImageRepoEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建镜像仓库
     * Summary: 创建镜像仓库.
     *
     * @param CreateImageRepoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateImageRepoResponse
     */
    public function createImageRepoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateImageRepoResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.repo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询镜像仓库列表
     * Summary: 查询镜像仓库列表.
     *
     * @param QueryImageReposRequest $request
     *
     * @return QueryImageReposResponse
     */
    public function queryImageRepos($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryImageReposEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询镜像仓库列表
     * Summary: 查询镜像仓库列表.
     *
     * @param QueryImageReposRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryImageReposResponse
     */
    public function queryImageReposEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryImageReposResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.repos.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除镜像仓库
     * Summary: 删除镜像仓库.
     *
     * @param DeleteImageRepoRequest $request
     *
     * @return DeleteImageRepoResponse
     */
    public function deleteImageRepo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteImageRepoEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除镜像仓库
     * Summary: 删除镜像仓库.
     *
     * @param DeleteImageRepoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteImageRepoResponse
     */
    public function deleteImageRepoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteImageRepoResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.repo.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取镜像漏洞详情地址
     * Summary: 获取镜像漏洞详情地址
     *
     * @param GetImageRiskdetailurlRequest $request
     *
     * @return GetImageRiskdetailurlResponse
     */
    public function getImageRiskdetailurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getImageRiskdetailurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取镜像漏洞详情地址
     * Summary: 获取镜像漏洞详情地址
     *
     * @param GetImageRiskdetailurlRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetImageRiskdetailurlResponse
     */
    public function getImageRiskdetailurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetImageRiskdetailurlResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.riskdetailurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建镜像仓库扫描策略
     * Summary: 创建镜像仓库扫描策略.
     *
     * @param CreateImageReposcanstrategyRequest $request
     *
     * @return CreateImageReposcanstrategyResponse
     */
    public function createImageReposcanstrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createImageReposcanstrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建镜像仓库扫描策略
     * Summary: 创建镜像仓库扫描策略.
     *
     * @param CreateImageReposcanstrategyRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateImageReposcanstrategyResponse
     */
    public function createImageReposcanstrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateImageReposcanstrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.reposcanstrategy.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询仓库项目列表
     * Summary: 查询仓库项目列表.
     *
     * @param QueryImagerepoProjectsRequest $request
     *
     * @return QueryImagerepoProjectsResponse
     */
    public function queryImagerepoProjects($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryImagerepoProjectsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询仓库项目列表
     * Summary: 查询仓库项目列表.
     *
     * @param QueryImagerepoProjectsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryImagerepoProjectsResponse
     */
    public function queryImagerepoProjectsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryImagerepoProjectsResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.imagerepo.projects.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询仓库列表
     * Summary: 查询仓库列表.
     *
     * @param QueryImagerepoRepositoriesRequest $request
     *
     * @return QueryImagerepoRepositoriesResponse
     */
    public function queryImagerepoRepositories($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryImagerepoRepositoriesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询仓库列表
     * Summary: 查询仓库列表.
     *
     * @param QueryImagerepoRepositoriesRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryImagerepoRepositoriesResponse
     */
    public function queryImagerepoRepositoriesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryImagerepoRepositoriesResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.imagerepo.repositories.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新镜像仓库
     * Summary: 更新镜像仓库.
     *
     * @param UpdateImageRepoRequest $request
     *
     * @return UpdateImageRepoResponse
     */
    public function updateImageRepo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateImageRepoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新镜像仓库
     * Summary: 更新镜像仓库.
     *
     * @param UpdateImageRepoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateImageRepoResponse
     */
    public function updateImageRepoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateImageRepoResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.repo.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取镜像仓库详情
     * Summary: 获取镜像仓库详情.
     *
     * @param GetImageRepoRequest $request
     *
     * @return GetImageRepoResponse
     */
    public function getImageRepo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getImageRepoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取镜像仓库详情
     * Summary: 获取镜像仓库详情.
     *
     * @param GetImageRepoRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetImageRepoResponse
     */
    public function getImageRepoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetImageRepoResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.repo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验仓库配置
     * Summary: 校验仓库配置.
     *
     * @param VerifyImageRepoRequest $request
     *
     * @return VerifyImageRepoResponse
     */
    public function verifyImageRepo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyImageRepoEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验仓库配置
     * Summary: 校验仓库配置.
     *
     * @param VerifyImageRepoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return VerifyImageRepoResponse
     */
    public function verifyImageRepoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyImageRepoResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.repo.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询镜像扫描策略
     * Summary: 查询镜像扫描策略.
     *
     * @param QueryImageReposcanstrategiesRequest $request
     *
     * @return QueryImageReposcanstrategiesResponse
     */
    public function queryImageReposcanstrategies($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryImageReposcanstrategiesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询镜像扫描策略
     * Summary: 查询镜像扫描策略.
     *
     * @param QueryImageReposcanstrategiesRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryImageReposcanstrategiesResponse
     */
    public function queryImageReposcanstrategiesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryImageReposcanstrategiesResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.reposcanstrategies.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除镜像扫描策略
     * Summary: 删除镜像扫描策略.
     *
     * @param DeleteImageReposcanstrategyRequest $request
     *
     * @return DeleteImageReposcanstrategyResponse
     */
    public function deleteImageReposcanstrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteImageReposcanstrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除镜像扫描策略
     * Summary: 删除镜像扫描策略.
     *
     * @param DeleteImageReposcanstrategyRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteImageReposcanstrategyResponse
     */
    public function deleteImageReposcanstrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteImageReposcanstrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.reposcanstrategy.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新镜像仓库扫描策略
     * Summary: 更新镜像仓库扫描策略.
     *
     * @param UpdateImageReposcanstrategyRequest $request
     *
     * @return UpdateImageReposcanstrategyResponse
     */
    public function updateImageReposcanstrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateImageReposcanstrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新镜像仓库扫描策略
     * Summary: 更新镜像仓库扫描策略.
     *
     * @param UpdateImageReposcanstrategyRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateImageReposcanstrategyResponse
     */
    public function updateImageReposcanstrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateImageReposcanstrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.image.reposcanstrategy.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略某个baseline风险
     * Summary: 忽略某个baseline风险.
     *
     * @param SkipClusterBaselineRequest $request
     *
     * @return SkipClusterBaselineResponse
     */
    public function skipClusterBaseline($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->skipClusterBaselineEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略某个baseline风险
     * Summary: 忽略某个baseline风险.
     *
     * @param SkipClusterBaselineRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SkipClusterBaselineResponse
     */
    public function skipClusterBaselineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SkipClusterBaselineResponse::fromMap($this->doRequest('1.0', 'antcloud.catronus.cluster.baseline.skip', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
