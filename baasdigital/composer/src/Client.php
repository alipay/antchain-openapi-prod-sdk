<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BAASDIGITAL\Models\CancelContractApproveRequest;
use AntChain\BAASDIGITAL\Models\CancelContractApproveResponse;
use AntChain\BAASDIGITAL\Models\CancelContractRoleRequest;
use AntChain\BAASDIGITAL\Models\CancelContractRoleResponse;
use AntChain\BAASDIGITAL\Models\CheckAccountRequest;
use AntChain\BAASDIGITAL\Models\CheckAccountResponse;
use AntChain\BAASDIGITAL\Models\CheckAliyunAccessRequest;
use AntChain\BAASDIGITAL\Models\CheckAliyunAccessResponse;
use AntChain\BAASDIGITAL\Models\CheckResourceRequest;
use AntChain\BAASDIGITAL\Models\CheckResourceResponse;
use AntChain\BAASDIGITAL\Models\CreateAccountKmsRequest;
use AntChain\BAASDIGITAL\Models\CreateAccountKmsResponse;
use AntChain\BAASDIGITAL\Models\CreateAsseturiRequest;
use AntChain\BAASDIGITAL\Models\CreateAsseturiResponse;
use AntChain\BAASDIGITAL\Models\CreateProjectRequest;
use AntChain\BAASDIGITAL\Models\CreateProjectResponse;
use AntChain\BAASDIGITAL\Models\CreateResourcePolicyRequest;
use AntChain\BAASDIGITAL\Models\CreateResourcePolicyResponse;
use AntChain\BAASDIGITAL\Models\DetailAliyunServiceRequest;
use AntChain\BAASDIGITAL\Models\DetailAliyunServiceResponse;
use AntChain\BAASDIGITAL\Models\ExecContractAddsupplyRequest;
use AntChain\BAASDIGITAL\Models\ExecContractAddsupplyResponse;
use AntChain\BAASDIGITAL\Models\ExecContractApproveRequest;
use AntChain\BAASDIGITAL\Models\ExecContractApproveResponse;
use AntChain\BAASDIGITAL\Models\ExecContractBatchissueRequest;
use AntChain\BAASDIGITAL\Models\ExecContractBatchissueResponse;
use AntChain\BAASDIGITAL\Models\ExecContractBurnoffRequest;
use AntChain\BAASDIGITAL\Models\ExecContractBurnoffResponse;
use AntChain\BAASDIGITAL\Models\ExecContractIssueRequest;
use AntChain\BAASDIGITAL\Models\ExecContractIssueResponse;
use AntChain\BAASDIGITAL\Models\ExecContractListissueRequest;
use AntChain\BAASDIGITAL\Models\ExecContractListissueResponse;
use AntChain\BAASDIGITAL\Models\ExecContractTransferRequest;
use AntChain\BAASDIGITAL\Models\ExecContractTransferResponse;
use AntChain\BAASDIGITAL\Models\ExecContractWriteoffRequest;
use AntChain\BAASDIGITAL\Models\ExecContractWriteoffResponse;
use AntChain\BAASDIGITAL\Models\JudgeAliyunServiceRequest;
use AntChain\BAASDIGITAL\Models\JudgeAliyunServiceResponse;
use AntChain\BAASDIGITAL\Models\ListProjectRequest;
use AntChain\BAASDIGITAL\Models\ListProjectResponse;
use AntChain\BAASDIGITAL\Models\OpenAliyunServiceRequest;
use AntChain\BAASDIGITAL\Models\OpenAliyunServiceResponse;
use AntChain\BAASDIGITAL\Models\QueryAliyunProjectRequest;
use AntChain\BAASDIGITAL\Models\QueryAliyunProjectResponse;
use AntChain\BAASDIGITAL\Models\QueryContractAssetRequest;
use AntChain\BAASDIGITAL\Models\QueryContractAssetResponse;
use AntChain\BAASDIGITAL\Models\QueryContractAsseturiRequest;
use AntChain\BAASDIGITAL\Models\QueryContractAsseturiResponse;
use AntChain\BAASDIGITAL\Models\QueryContractReceiptRequest;
use AntChain\BAASDIGITAL\Models\QueryContractReceiptResponse;
use AntChain\BAASDIGITAL\Models\QueryContractTransactionRequest;
use AntChain\BAASDIGITAL\Models\QueryContractTransactionResponse;
use AntChain\BAASDIGITAL\Models\QueryProjectRequest;
use AntChain\BAASDIGITAL\Models\QueryProjectResponse;
use AntChain\BAASDIGITAL\Models\SetContractRoleRequest;
use AntChain\BAASDIGITAL\Models\SetContractRoleResponse;
use AntChain\BAASDIGITAL\Models\UpdateProjectRequest;
use AntChain\BAASDIGITAL\Models\UpdateProjectResponse;
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
            'timeouted'               => 'retry',
            'readTimeout'             => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout'          => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'               => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'              => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'                 => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'            => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'maxIdleTimeMillis'       => $this->_maxIdleTimeMillis,
            'keepAliveDurationMillis' => $this->_keepAliveDurationMillis,
            'maxRequests'             => $this->_maxRequests,
            'maxRequestsPerHost'      => $this->_maxRequestsPerHost,
            'retry'                   => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
            // 查询所有数字权证项目接口结构体
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
                    'sdk_version'      => '1.1.1',
                    '_prod_code'       => 'BAASDIGITAL',
                    '_prod_channel'    => 'undefined',
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
     * Description: 数字权证服务开通状态检测
     * Summary: 数字权证服务开通状态检测.
     *
     * @param JudgeAliyunServiceRequest $request
     *
     * @return JudgeAliyunServiceResponse
     */
    public function judgeAliyunService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->judgeAliyunServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字权证服务开通状态检测
     * Summary: 数字权证服务开通状态检测.
     *
     * @param JudgeAliyunServiceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return JudgeAliyunServiceResponse
     */
    public function judgeAliyunServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return JudgeAliyunServiceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.aliyun.service.judge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通数字权证链服务
     * Summary: 开通数字权证链服务
     *
     * @param OpenAliyunServiceRequest $request
     *
     * @return OpenAliyunServiceResponse
     */
    public function openAliyunService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openAliyunServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通数字权证链服务
     * Summary: 开通数字权证链服务
     *
     * @param OpenAliyunServiceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return OpenAliyunServiceResponse
     */
    public function openAliyunServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenAliyunServiceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.aliyun.service.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数字权证服务开通详情
     * Summary: 数字权证服务开通信息详情.
     *
     * @param DetailAliyunServiceRequest $request
     *
     * @return DetailAliyunServiceResponse
     */
    public function detailAliyunService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailAliyunServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数字权证服务开通详情
     * Summary: 数字权证服务开通信息详情.
     *
     * @param DetailAliyunServiceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DetailAliyunServiceResponse
     */
    public function detailAliyunServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailAliyunServiceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.aliyun.service.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数字权证项目列表内容
     * Summary: 查询数字权证项目列表内容.
     *
     * @param QueryAliyunProjectRequest $request
     *
     * @return QueryAliyunProjectResponse
     */
    public function queryAliyunProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAliyunProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数字权证项目列表内容
     * Summary: 查询数字权证项目列表内容.
     *
     * @param QueryAliyunProjectRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAliyunProjectResponse
     */
    public function queryAliyunProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAliyunProjectResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.aliyun.project.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检测链ID是否为数字权证链
     * Summary: 检测链ID是否为数字权证链.
     *
     * @param CheckAliyunAccessRequest $request
     *
     * @return CheckAliyunAccessResponse
     */
    public function checkAliyunAccess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAliyunAccessEx($request, $headers, $runtime);
    }

    /**
     * Description: 检测链ID是否为数字权证链
     * Summary: 检测链ID是否为数字权证链.
     *
     * @param CheckAliyunAccessRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CheckAliyunAccessResponse
     */
    public function checkAliyunAccessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAliyunAccessResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.aliyun.access.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检测账户名称是否已经在区块链注册
     * Summary: 检测账户名称是否已经在区块链注册.
     *
     * @param CheckAccountRequest $request
     *
     * @return CheckAccountResponse
     */
    public function checkAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 检测账户名称是否已经在区块链注册
     * Summary: 检测账户名称是否已经在区块链注册.
     *
     * @param CheckAccountRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CheckAccountResponse
     */
    public function checkAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAccountResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.account.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建MyChain托管账户
     * Summary: 创建MyChain托管账户.
     *
     * @param CreateAccountKmsRequest $request
     *
     * @return CreateAccountKmsResponse
     */
    public function createAccountKms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAccountKmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建MyChain托管账户
     * Summary: 创建MyChain托管账户.
     *
     * @param CreateAccountKmsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateAccountKmsResponse
     */
    public function createAccountKmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAccountKmsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.account.kms.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建oss上传policy，客户端使用http方式自主上传文件
     * Summary: 创建资源上传规则url.
     *
     * @param CreateResourcePolicyRequest $request
     *
     * @return CreateResourcePolicyResponse
     */
    public function createResourcePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createResourcePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建oss上传policy，客户端使用http方式自主上传文件
     * Summary: 创建资源上传规则url.
     *
     * @param CreateResourcePolicyRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateResourcePolicyResponse
     */
    public function createResourcePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateResourcePolicyResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.resource.policy.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传文件状态检测
     * Summary: 上传文件状态检测.
     *
     * @param CheckResourceRequest $request
     *
     * @return CheckResourceResponse
     */
    public function checkResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传文件状态检测
     * Summary: 上传文件状态检测.
     *
     * @param CheckResourceRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CheckResourceResponse
     */
    public function checkResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckResourceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.resource.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 定义数字权证AssetUri，包括权证所需各种属性
     * Summary: 定义数字权证AssetUri.
     *
     * @param CreateAsseturiRequest $request
     *
     * @return CreateAsseturiResponse
     */
    public function createAsseturi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAsseturiEx($request, $headers, $runtime);
    }

    /**
     * Description: 定义数字权证AssetUri，包括权证所需各种属性
     * Summary: 定义数字权证AssetUri.
     *
     * @param CreateAsseturiRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateAsseturiResponse
     */
    public function createAsseturiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAsseturiResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.asseturi.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询项目信息
     * Summary: 查询项目初始信息.
     *
     * @param QueryProjectRequest $request
     *
     * @return QueryProjectResponse
     */
    public function queryProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询项目信息
     * Summary: 查询项目初始信息.
     *
     * @param QueryProjectRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryProjectResponse
     */
    public function queryProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryProjectResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.project.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数字权证项目
     * Summary: 创建数字权证项目.
     *
     * @param CreateProjectRequest $request
     *
     * @return CreateProjectResponse
     */
    public function createProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数字权证项目
     * Summary: 创建数字权证项目.
     *
     * @param CreateProjectRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateProjectResponse
     */
    public function createProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateProjectResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新数字权证项目信息
     * Summary: 更新数字权证项目信息.
     *
     * @param UpdateProjectRequest $request
     *
     * @return UpdateProjectResponse
     */
    public function updateProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新数字权证项目信息
     * Summary: 更新数字权证项目信息.
     *
     * @param UpdateProjectRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateProjectResponse
     */
    public function updateProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateProjectResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.project.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字权证签发(异步)
     * Summary: 数字权证签发(异步).
     *
     * @param ExecContractIssueRequest $request
     *
     * @return ExecContractIssueResponse
     */
    public function execContractIssue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractIssueEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字权证签发(异步)
     * Summary: 数字权证签发(异步).
     *
     * @param ExecContractIssueRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecContractIssueResponse
     */
    public function execContractIssueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractIssueResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.issue.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所有项目ID列表
     * Summary: 查询所有项目ID列表.
     *
     * @param ListProjectRequest $request
     *
     * @return ListProjectResponse
     */
    public function listProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所有项目ID列表
     * Summary: 查询所有项目ID列表.
     *
     * @param ListProjectRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListProjectResponse
     */
    public function listProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListProjectResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.project.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询发送到链上的交易内容
     * Summary: 查询交易.
     *
     * @param QueryContractTransactionRequest $request
     *
     * @return QueryContractTransactionResponse
     */
    public function queryContractTransaction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractTransactionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询发送到链上的交易内容
     * Summary: 查询交易.
     *
     * @param QueryContractTransactionRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryContractTransactionResponse
     */
    public function queryContractTransactionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractTransactionResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.transaction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询发送到链上的交易执行的结果
     * Summary: 查询交易执行回执.
     *
     * @param QueryContractReceiptRequest $request
     *
     * @return QueryContractReceiptResponse
     */
    public function queryContractReceipt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractReceiptEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询发送到链上的交易执行的结果
     * Summary: 查询交易执行回执.
     *
     * @param QueryContractReceiptRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryContractReceiptResponse
     */
    public function queryContractReceiptEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractReceiptResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.receipt.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字权证增发(异步)，高性能版本暂不支持此接口
     * Summary: 数字权证增发(异步).
     *
     * @param ExecContractAddsupplyRequest $request
     *
     * @return ExecContractAddsupplyResponse
     */
    public function execContractAddsupply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractAddsupplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字权证增发(异步)，高性能版本暂不支持此接口
     * Summary: 数字权证增发(异步).
     *
     * @param ExecContractAddsupplyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExecContractAddsupplyResponse
     */
    public function execContractAddsupplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractAddsupplyResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.addsupply.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字权证转移(异步)
     * Summary: 数字权证转移(异步).
     *
     * @param ExecContractTransferRequest $request
     *
     * @return ExecContractTransferResponse
     */
    public function execContractTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字权证转移(异步)
     * Summary: 数字权证转移(异步).
     *
     * @param ExecContractTransferRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecContractTransferResponse
     */
    public function execContractTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractTransferResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.transfer.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字权证核销(异步)
     * Summary: 数字权证核销(异步).
     *
     * @param ExecContractWriteoffRequest $request
     *
     * @return ExecContractWriteoffResponse
     */
    public function execContractWriteoff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractWriteoffEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字权证核销(异步)
     * Summary: 数字权证核销(异步).
     *
     * @param ExecContractWriteoffRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecContractWriteoffResponse
     */
    public function execContractWriteoffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractWriteoffResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.writeoff.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字权证销毁(异步)
     * Summary: 数字权证销毁(异步).
     *
     * @param ExecContractBurnoffRequest $request
     *
     * @return ExecContractBurnoffResponse
     */
    public function execContractBurnoff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractBurnoffEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字权证销毁(异步)
     * Summary: 数字权证销毁(异步).
     *
     * @param ExecContractBurnoffRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecContractBurnoffResponse
     */
    public function execContractBurnoffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractBurnoffResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.burnoff.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
     * Summary: 查询特定账户下的权证信息.
     *
     * @param QueryContractAssetRequest $request
     *
     * @return QueryContractAssetResponse
     */
    public function queryContractAsset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
     * Summary: 查询特定账户下的权证信息.
     *
     * @param QueryContractAssetRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryContractAssetResponse
     */
    public function queryContractAssetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractAssetResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.asset.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询特定权证的uri meta信息
     * Summary: 查询特定权证的uri meta信息.
     *
     * @param QueryContractAsseturiRequest $request
     *
     * @return QueryContractAsseturiResponse
     */
    public function queryContractAsseturi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractAsseturiEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询特定权证的uri meta信息
     * Summary: 查询特定权证的uri meta信息.
     *
     * @param QueryContractAsseturiRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryContractAsseturiResponse
     */
    public function queryContractAsseturiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractAsseturiResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.asseturi.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权权证给某个账户
     * Summary: 数字权证授权(异步).
     *
     * @param ExecContractApproveRequest $request
     *
     * @return ExecContractApproveResponse
     */
    public function execContractApprove($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractApproveEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权权证给某个账户
     * Summary: 数字权证授权(异步).
     *
     * @param ExecContractApproveRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecContractApproveResponse
     */
    public function execContractApproveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractApproveResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.approve.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消数字权证授权
     * Summary: 取消数字权证授权(异步).
     *
     * @param CancelContractApproveRequest $request
     *
     * @return CancelContractApproveResponse
     */
    public function cancelContractApprove($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelContractApproveEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消数字权证授权
     * Summary: 取消数字权证授权(异步).
     *
     * @param CancelContractApproveRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CancelContractApproveResponse
     */
    public function cancelContractApproveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelContractApproveResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.approve.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
     * 同一个账户可具备多个角色，同一个角色可有多个账户。
     * Summary: 授权项目权证管理角色(异步).
     *
     * @param SetContractRoleRequest $request
     *
     * @return SetContractRoleResponse
     */
    public function setContractRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setContractRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
     * 同一个账户可具备多个角色，同一个角色可有多个账户。
     * Summary: 授权项目权证管理角色(异步).
     *
     * @param SetContractRoleRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SetContractRoleResponse
     */
    public function setContractRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetContractRoleResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.role.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
     * Summary: 取消项目管理角色(异步).
     *
     * @param CancelContractRoleRequest $request
     *
     * @return CancelContractRoleResponse
     */
    public function cancelContractRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelContractRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
     * Summary: 取消项目管理角色(异步).
     *
     * @param CancelContractRoleRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CancelContractRoleResponse
     */
    public function cancelContractRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelContractRoleResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.role.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
     * Summary: 批量发行权证到指定账户(异步).
     *
     * @param ExecContractBatchissueRequest $request
     *
     * @return ExecContractBatchissueResponse
     */
    public function execContractBatchissue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractBatchissueEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
     * Summary: 批量发行权证到指定账户(异步).
     *
     * @param ExecContractBatchissueRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ExecContractBatchissueResponse
     */
    public function execContractBatchissueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractBatchissueResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.batchissue.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
     * Summary: 批量发行权证到指定账户(异步).
     *
     * @param ExecContractListissueRequest $request
     *
     * @return ExecContractListissueResponse
     */
    public function execContractListissue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractListissueEx($request, $headers, $runtime);
    }

    /**
     * Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
     * Summary: 批量发行权证到指定账户(异步).
     *
     * @param ExecContractListissueRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExecContractListissueResponse
     */
    public function execContractListissueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractListissueResponse::fromMap($this->doRequest('1.0', 'antchain.baasdigital.contract.listissue.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
