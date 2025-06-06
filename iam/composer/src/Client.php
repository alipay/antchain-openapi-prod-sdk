<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\IAM\Models\AddGroupMemberRequest;
use AntChain\IAM\Models\AddGroupMemberResponse;
use AntChain\IAM\Models\AddRoleActionRequest;
use AntChain\IAM\Models\AddRoleActionResponse;
use AntChain\IAM\Models\AddTenantMemberRequest;
use AntChain\IAM\Models\AddTenantMemberResponse;
use AntChain\IAM\Models\ApplyTrustloginTokenRequest;
use AntChain\IAM\Models\ApplyTrustloginTokenResponse;
use AntChain\IAM\Models\ApplyTrustloginUrlRequest;
use AntChain\IAM\Models\ApplyTrustloginUrlResponse;
use AntChain\IAM\Models\AssumeStsRequest;
use AntChain\IAM\Models\AssumeStsResponse;
use AntChain\IAM\Models\AttachPolicyRequest;
use AntChain\IAM\Models\AttachPolicyResponse;
use AntChain\IAM\Models\BatchqueryDepartmentRequest;
use AntChain\IAM\Models\BatchqueryDepartmentResponse;
use AntChain\IAM\Models\BatchqueryOperatorRequest;
use AntChain\IAM\Models\BatchqueryOperatorResponse;
use AntChain\IAM\Models\CreateDepartmentRequest;
use AntChain\IAM\Models\CreateDepartmentResponse;
use AntChain\IAM\Models\CreateGroupRequest;
use AntChain\IAM\Models\CreateGroupResponse;
use AntChain\IAM\Models\CreatePolicyRequest;
use AntChain\IAM\Models\CreatePolicyResponse;
use AntChain\IAM\Models\CreateProductActionRequest;
use AntChain\IAM\Models\CreateProductActionResponse;
use AntChain\IAM\Models\CreateRoleRequest;
use AntChain\IAM\Models\CreateRoleResponse;
use AntChain\IAM\Models\CreateServiceaccountRequest;
use AntChain\IAM\Models\CreateServiceaccountResponse;
use AntChain\IAM\Models\CreateStsActorRequest;
use AntChain\IAM\Models\CreateStsActorResponse;
use AntChain\IAM\Models\DeleteDepartmentRequest;
use AntChain\IAM\Models\DeleteDepartmentResponse;
use AntChain\IAM\Models\DeleteGroupRequest;
use AntChain\IAM\Models\DeleteGroupResponse;
use AntChain\IAM\Models\DeletePolicyRequest;
use AntChain\IAM\Models\DeletePolicyResponse;
use AntChain\IAM\Models\DeleteRoleRequest;
use AntChain\IAM\Models\DeleteRoleResponse;
use AntChain\IAM\Models\DeleteServiceaccountRequest;
use AntChain\IAM\Models\DeleteServiceaccountResponse;
use AntChain\IAM\Models\DeleteStsActorRequest;
use AntChain\IAM\Models\DeleteStsActorResponse;
use AntChain\IAM\Models\DetachPolicyRequest;
use AntChain\IAM\Models\DetachPolicyResponse;
use AntChain\IAM\Models\DisableMfaRequest;
use AntChain\IAM\Models\DisableMfaResponse;
use AntChain\IAM\Models\EnableMfaRequest;
use AntChain\IAM\Models\EnableMfaResponse;
use AntChain\IAM\Models\FreezeOperatorRequest;
use AntChain\IAM\Models\FreezeOperatorResponse;
use AntChain\IAM\Models\GetAccessorCurrentRequest;
use AntChain\IAM\Models\GetAccessorCurrentResponse;
use AntChain\IAM\Models\GetAliyunUserRequest;
use AntChain\IAM\Models\GetAliyunUserResponse;
use AntChain\IAM\Models\GetDepartmentRequest;
use AntChain\IAM\Models\GetDepartmentResponse;
use AntChain\IAM\Models\GetGroupRequest;
use AntChain\IAM\Models\GetGroupResponse;
use AntChain\IAM\Models\GetIaasaccountBaseinfoRequest;
use AntChain\IAM\Models\GetIaasaccountBaseinfoResponse;
use AntChain\IAM\Models\GetInternalMasterRequest;
use AntChain\IAM\Models\GetInternalMasterResponse;
use AntChain\IAM\Models\GetLoginconfigRequest;
use AntChain\IAM\Models\GetLoginconfigResponse;
use AntChain\IAM\Models\GetMfaRequest;
use AntChain\IAM\Models\GetMfaResponse;
use AntChain\IAM\Models\GetMfaStatusRequest;
use AntChain\IAM\Models\GetMfaStatusResponse;
use AntChain\IAM\Models\GetOperationtypeRequest;
use AntChain\IAM\Models\GetOperationtypeResponse;
use AntChain\IAM\Models\GetOperatorLogintokenRequest;
use AntChain\IAM\Models\GetOperatorLogintokenResponse;
use AntChain\IAM\Models\GetRoleRequest;
use AntChain\IAM\Models\GetRoleResponse;
use AntChain\IAM\Models\GetServiceaccountRequest;
use AntChain\IAM\Models\GetServiceaccountResponse;
use AntChain\IAM\Models\GetSessionAccessorRequest;
use AntChain\IAM\Models\GetSessionAccessorResponse;
use AntChain\IAM\Models\GetStsActorRequest;
use AntChain\IAM\Models\GetStsActorResponse;
use AntChain\IAM\Models\InitMfaRequest;
use AntChain\IAM\Models\InitMfaResponse;
use AntChain\IAM\Models\JudgeAliyunAuthorityRequest;
use AntChain\IAM\Models\JudgeAliyunAuthorityResponse;
use AntChain\IAM\Models\JudgeAliyunMultiauthorityRequest;
use AntChain\IAM\Models\JudgeAliyunMultiauthorityResponse;
use AntChain\IAM\Models\JudgeAuthorityRequest;
use AntChain\IAM\Models\JudgeAuthorityResponse;
use AntChain\IAM\Models\JudgeMultiauthorityRequest;
use AntChain\IAM\Models\JudgeMultiauthorityResponse;
use AntChain\IAM\Models\ListOperatorGroupRequest;
use AntChain\IAM\Models\ListOperatorGroupResponse;
use AntChain\IAM\Models\ListPolicyRequest;
use AntChain\IAM\Models\ListPolicyResponse;
use AntChain\IAM\Models\ListRoleOperatorRequest;
use AntChain\IAM\Models\ListRoleOperatorResponse;
use AntChain\IAM\Models\ListStsActorRequest;
use AntChain\IAM\Models\ListStsActorResponse;
use AntChain\IAM\Models\PagequeryDepartmentRequest;
use AntChain\IAM\Models\PagequeryDepartmentResponse;
use AntChain\IAM\Models\PushOperationRequest;
use AntChain\IAM\Models\PushOperationResponse;
use AntChain\IAM\Models\QueryDepartmentUserRequest;
use AntChain\IAM\Models\QueryDepartmentUserResponse;
use AntChain\IAM\Models\QueryGroupMemberRequest;
use AntChain\IAM\Models\QueryGroupMemberResponse;
use AntChain\IAM\Models\QueryGroupRequest;
use AntChain\IAM\Models\QueryGroupResponse;
use AntChain\IAM\Models\QueryOperationtypeRequest;
use AntChain\IAM\Models\QueryOperationtypeResponse;
use AntChain\IAM\Models\QueryPolicyRequest;
use AntChain\IAM\Models\QueryPolicyResponse;
use AntChain\IAM\Models\QueryRoleRequest;
use AntChain\IAM\Models\QueryRoleResponse;
use AntChain\IAM\Models\RemoveDepartmentUserRequest;
use AntChain\IAM\Models\RemoveDepartmentUserResponse;
use AntChain\IAM\Models\RemoveGroupMemberRequest;
use AntChain\IAM\Models\RemoveGroupMemberResponse;
use AntChain\IAM\Models\RemoveRoleActionRequest;
use AntChain\IAM\Models\RemoveRoleActionResponse;
use AntChain\IAM\Models\RemoveTenantMemberRequest;
use AntChain\IAM\Models\RemoveTenantMemberResponse;
use AntChain\IAM\Models\ResetOperatorPasswordRequest;
use AntChain\IAM\Models\ResetOperatorPasswordResponse;
use AntChain\IAM\Models\SaveDepartmentUserRequest;
use AntChain\IAM\Models\SaveDepartmentUserResponse;
use AntChain\IAM\Models\UnfreezeOperatorRequest;
use AntChain\IAM\Models\UnfreezeOperatorResponse;
use AntChain\IAM\Models\UpdateDepartmentRequest;
use AntChain\IAM\Models\UpdateDepartmentResponse;
use AntChain\IAM\Models\UpdateGroupRequest;
use AntChain\IAM\Models\UpdateGroupResponse;
use AntChain\IAM\Models\UpdateLoginconfigRequest;
use AntChain\IAM\Models\UpdateLoginconfigResponse;
use AntChain\IAM\Models\UpdateOperatorPasswordRequest;
use AntChain\IAM\Models\UpdateOperatorPasswordResponse;
use AntChain\IAM\Models\UpdateOperatorStatusRequest;
use AntChain\IAM\Models\UpdateOperatorStatusResponse;
use AntChain\IAM\Models\UpdatePasswordRequest;
use AntChain\IAM\Models\UpdatePasswordResponse;
use AntChain\IAM\Models\UpdateRoleRequest;
use AntChain\IAM\Models\UpdateRoleResponse;
use AntChain\IAM\Models\UpdateServiceaccountRequest;
use AntChain\IAM\Models\UpdateServiceaccountResponse;
use AntChain\IAM\Models\UpdateStsActorRequest;
use AntChain\IAM\Models\UpdateStsActorResponse;
use AntChain\IAM\Models\VerifyMfaRequest;
use AntChain\IAM\Models\VerifyMfaResponse;
use AntChain\IAM\Models\VerifyOauthTokenRequest;
use AntChain\IAM\Models\VerifyOauthTokenResponse;
use AntChain\IAM\Models\VerifyPasswordRequest;
use AntChain\IAM\Models\VerifyPasswordResponse;
use AntChain\IAM\Models\VerifySessionTokenRequest;
use AntChain\IAM\Models\VerifySessionTokenResponse;
use AntChain\IAM\Models\VerifyTrustloginTokenRequest;
use AntChain\IAM\Models\VerifyTrustloginTokenResponse;
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
                    'sdk_version'      => '3.13.1',
                    '_prod_code'       => 'IAM',
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
     * Description: 获取Role
     * Summary: 获取角色.
     *
     * @param GetRoleRequest $request
     *
     * @return GetRoleResponse
     */
    public function getRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取Role
     * Summary: 获取角色.
     *
     * @param GetRoleRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetRoleResponse
     */
    public function getRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRoleResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略
     * Summary: 查询授权.
     *
     * @param QueryPolicyRequest $request
     *
     * @return QueryPolicyResponse
     */
    public function queryPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略
     * Summary: 查询授权.
     *
     * @param QueryPolicyRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryPolicyResponse
     */
    public function queryPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户下的权限组
     * Summary: 查询授权组.
     *
     * @param QueryGroupRequest $request
     *
     * @return QueryGroupResponse
     */
    public function queryGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户下的权限组
     * Summary: 查询授权组.
     *
     * @param QueryGroupRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryGroupResponse
     */
    public function queryGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGroupResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建授权策略
     * Summary: 创建授权策略.
     *
     * @param CreatePolicyRequest $request
     *
     * @return CreatePolicyResponse
     */
    public function createPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建授权策略
     * Summary: 创建授权策略.
     *
     * @param CreatePolicyRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreatePolicyResponse
     */
    public function createPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreatePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.policy.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除授权策略
     * Summary: 删除授权策略.
     *
     * @param DeletePolicyRequest $request
     *
     * @return DeletePolicyResponse
     */
    public function deletePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deletePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除授权策略
     * Summary: 删除授权策略.
     *
     * @param DeletePolicyRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DeletePolicyResponse
     */
    public function deletePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeletePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.policy.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权策略赋予某个对象
     * Summary: 添加授权.
     *
     * @param AttachPolicyRequest $request
     *
     * @return AttachPolicyResponse
     */
    public function attachPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->attachPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权策略赋予某个对象
     * Summary: 添加授权.
     *
     * @param AttachPolicyRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AttachPolicyResponse
     */
    public function attachPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AttachPolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.policy.attach', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解除授权对象的授权策略
     * Summary: 解除授权.
     *
     * @param DetachPolicyRequest $request
     *
     * @return DetachPolicyResponse
     */
    public function detachPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detachPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 解除授权对象的授权策略
     * Summary: 解除授权.
     *
     * @param DetachPolicyRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DetachPolicyResponse
     */
    public function detachPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetachPolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.policy.detach', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
     * Summary: 查询授权.
     *
     * @param ListPolicyRequest $request
     *
     * @return ListPolicyResponse
     */
    public function listPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
     * Summary: 查询授权.
     *
     * @param ListPolicyRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListPolicyResponse
     */
    public function listPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListPolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.policy.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权对象的权限校验
     * Summary: 校验权限.
     *
     * @param JudgeAuthorityRequest $request
     *
     * @return JudgeAuthorityResponse
     */
    public function judgeAuthority($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->judgeAuthorityEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权对象的权限校验
     * Summary: 校验权限.
     *
     * @param JudgeAuthorityRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return JudgeAuthorityResponse
     */
    public function judgeAuthorityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return JudgeAuthorityResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.authority.judge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加产品操作元数据
     * Summary: 创建产品操作点.
     *
     * @param CreateProductActionRequest $request
     *
     * @return CreateProductActionResponse
     */
    public function createProductAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createProductActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加产品操作元数据
     * Summary: 创建产品操作点.
     *
     * @param CreateProductActionRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateProductActionResponse
     */
    public function createProductActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateProductActionResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.product.action.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验token合法性
     * Summary: 校验token合法性.
     *
     * @param VerifyOauthTokenRequest $request
     *
     * @return VerifyOauthTokenResponse
     */
    public function verifyOauthToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyOauthTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验token合法性
     * Summary: 校验token合法性.
     *
     * @param VerifyOauthTokenRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return VerifyOauthTokenResponse
     */
    public function verifyOauthTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyOauthTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.oauth.token.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验中枢登录态合法性
     * Summary: 校验中枢登录态合法性.
     *
     * @param VerifySessionTokenRequest $request
     *
     * @return VerifySessionTokenResponse
     */
    public function verifySessionToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifySessionTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验中枢登录态合法性
     * Summary: 校验中枢登录态合法性.
     *
     * @param VerifySessionTokenRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return VerifySessionTokenResponse
     */
    public function verifySessionTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifySessionTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.session.token.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取授予角色的操作员列表
     * Summary: 授予角色的操作员列表.
     *
     * @param ListRoleOperatorRequest $request
     *
     * @return ListRoleOperatorResponse
     */
    public function listRoleOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRoleOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授予角色的操作员列表
     * Summary: 授予角色的操作员列表.
     *
     * @param ListRoleOperatorRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListRoleOperatorResponse
     */
    public function listRoleOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRoleOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.operator.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请信任登录URL
     * Summary: 申请信任登录URL.
     *
     * @param ApplyTrustloginUrlRequest $request
     *
     * @return ApplyTrustloginUrlResponse
     */
    public function applyTrustloginUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyTrustloginUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请信任登录URL
     * Summary: 申请信任登录URL.
     *
     * @param ApplyTrustloginUrlRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyTrustloginUrlResponse
     */
    public function applyTrustloginUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyTrustloginUrlResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.trustlogin.url.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 扮演虚拟身份，获取安全令牌
     * Summary: 扮演虚拟身份，获取安全令牌.
     *
     * @param AssumeStsRequest $request
     *
     * @return AssumeStsResponse
     */
    public function assumeSts($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->assumeStsEx($request, $headers, $runtime);
    }

    /**
     * Description: 扮演虚拟身份，获取安全令牌
     * Summary: 扮演虚拟身份，获取安全令牌.
     *
     * @param AssumeStsRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return AssumeStsResponse
     */
    public function assumeStsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AssumeStsResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.sts.assume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建虚拟身份
     * Summary: 创建虚拟身份.
     *
     * @param CreateStsActorRequest $request
     *
     * @return CreateStsActorResponse
     */
    public function createStsActor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createStsActorEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建虚拟身份
     * Summary: 创建虚拟身份.
     *
     * @param CreateStsActorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateStsActorResponse
     */
    public function createStsActorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateStsActorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.sts.actor.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除虚拟身份
     * Summary: 删除虚拟身份.
     *
     * @param DeleteStsActorRequest $request
     *
     * @return DeleteStsActorResponse
     */
    public function deleteStsActor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteStsActorEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除虚拟身份
     * Summary: 删除虚拟身份.
     *
     * @param DeleteStsActorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteStsActorResponse
     */
    public function deleteStsActorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteStsActorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.sts.actor.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 唯一查询虚拟身份
     * Summary: 唯一查询虚拟身份.
     *
     * @param GetStsActorRequest $request
     *
     * @return GetStsActorResponse
     */
    public function getStsActor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getStsActorEx($request, $headers, $runtime);
    }

    /**
     * Description: 唯一查询虚拟身份
     * Summary: 唯一查询虚拟身份.
     *
     * @param GetStsActorRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetStsActorResponse
     */
    public function getStsActorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetStsActorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.sts.actor.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户内的虚拟身份
     * Summary: 获取租户内的虚拟身份.
     *
     * @param ListStsActorRequest $request
     *
     * @return ListStsActorResponse
     */
    public function listStsActor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listStsActorEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户内的虚拟身份
     * Summary: 获取租户内的虚拟身份.
     *
     * @param ListStsActorRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListStsActorResponse
     */
    public function listStsActorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListStsActorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.sts.actor.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新虚拟身份
     * Summary: 更新虚拟身份.
     *
     * @param UpdateStsActorRequest $request
     *
     * @return UpdateStsActorResponse
     */
    public function updateStsActor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateStsActorEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新虚拟身份
     * Summary: 更新虚拟身份.
     *
     * @param UpdateStsActorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateStsActorResponse
     */
    public function updateStsActorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateStsActorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.sts.actor.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户内可见的角色
     * Summary: 角色查询.
     *
     * @param QueryRoleRequest $request
     *
     * @return QueryRoleResponse
     */
    public function queryRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户内可见的角色
     * Summary: 角色查询.
     *
     * @param QueryRoleRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryRoleResponse
     */
    public function queryRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRoleResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户Iaas账号基本信息
     * Summary: 获取租户Iaas账号基本信息.
     *
     * @param GetIaasaccountBaseinfoRequest $request
     *
     * @return GetIaasaccountBaseinfoResponse
     */
    public function getIaasaccountBaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getIaasaccountBaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户Iaas账号基本信息
     * Summary: 获取租户Iaas账号基本信息.
     *
     * @param GetIaasaccountBaseinfoRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetIaasaccountBaseinfoResponse
     */
    public function getIaasaccountBaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetIaasaccountBaseinfoResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.iaasaccount.baseinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
     * Summary: 校验密码是否正确.
     *
     * @param VerifyPasswordRequest $request
     *
     * @return VerifyPasswordResponse
     */
    public function verifyPassword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyPasswordEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
     * Summary: 校验密码是否正确.
     *
     * @param VerifyPasswordRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return VerifyPasswordResponse
     */
    public function verifyPasswordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyPasswordResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.password.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
     * Summary: 更新操作员状态
     *
     * @param UpdateOperatorStatusRequest $request
     *
     * @return UpdateOperatorStatusResponse
     */
    public function updateOperatorStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateOperatorStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
     * Summary: 更新操作员状态
     *
     * @param UpdateOperatorStatusRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateOperatorStatusResponse
     */
    public function updateOperatorStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateOperatorStatusResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 冻结操作员
     * Summary: 冻结操作员.
     *
     * @param FreezeOperatorRequest $request
     *
     * @return FreezeOperatorResponse
     */
    public function freezeOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->freezeOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 冻结操作员
     * Summary: 冻结操作员.
     *
     * @param FreezeOperatorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return FreezeOperatorResponse
     */
    public function freezeOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FreezeOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.freeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解冻操作员
     * Summary: 解冻操作员.
     *
     * @param UnfreezeOperatorRequest $request
     *
     * @return UnfreezeOperatorResponse
     */
    public function unfreezeOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unfreezeOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 解冻操作员
     * Summary: 解冻操作员.
     *
     * @param UnfreezeOperatorRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UnfreezeOperatorResponse
     */
    public function unfreezeOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnfreezeOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.unfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取主账号信息
     * Summary: 获取主账号信息.
     *
     * @param GetInternalMasterRequest $request
     *
     * @return GetInternalMasterResponse
     */
    public function getInternalMaster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInternalMasterEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取主账号信息
     * Summary: 获取主账号信息.
     *
     * @param GetInternalMasterRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetInternalMasterResponse
     */
    public function getInternalMasterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInternalMasterResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.internal.master.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
     * Summary: 获取阿里云用户信息.
     *
     * @param GetAliyunUserRequest $request
     *
     * @return GetAliyunUserResponse
     */
    public function getAliyunUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAliyunUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
     * Summary: 获取阿里云用户信息.
     *
     * @param GetAliyunUserRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetAliyunUserResponse
     */
    public function getAliyunUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAliyunUserResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.aliyun.user.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云RAM权限校验
     * Summary: 阿里云RAM权限校验.
     *
     * @param JudgeAliyunAuthorityRequest $request
     *
     * @return JudgeAliyunAuthorityResponse
     */
    public function judgeAliyunAuthority($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->judgeAliyunAuthorityEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云RAM权限校验
     * Summary: 阿里云RAM权限校验.
     *
     * @param JudgeAliyunAuthorityRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return JudgeAliyunAuthorityResponse
     */
    public function judgeAliyunAuthorityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return JudgeAliyunAuthorityResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.aliyun.authority.judge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据登录态获取ak
     * Summary: 根据登录态获取ak.
     *
     * @param GetSessionAccessorRequest $request
     *
     * @return GetSessionAccessorResponse
     */
    public function getSessionAccessor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSessionAccessorEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据登录态获取ak
     * Summary: 根据登录态获取ak.
     *
     * @param GetSessionAccessorRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetSessionAccessorResponse
     */
    public function getSessionAccessorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSessionAccessorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.session.accessor.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新密码
     * Summary: 更新密码
     *
     * @param UpdatePasswordRequest $request
     *
     * @return UpdatePasswordResponse
     */
    public function updatePassword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updatePasswordEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新密码
     * Summary: 更新密码
     *
     * @param UpdatePasswordRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdatePasswordResponse
     */
    public function updatePasswordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdatePasswordResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.password.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚂蚁侧批量鉴权
     * Summary: 蚂蚁侧批量鉴权.
     *
     * @param JudgeMultiauthorityRequest $request
     *
     * @return JudgeMultiauthorityResponse
     */
    public function judgeMultiauthority($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->judgeMultiauthorityEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚂蚁侧批量鉴权
     * Summary: 蚂蚁侧批量鉴权.
     *
     * @param JudgeMultiauthorityRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return JudgeMultiauthorityResponse
     */
    public function judgeMultiauthorityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return JudgeMultiauthorityResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.multiauthority.judge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云批量鉴权
     * Summary: 阿里云批量鉴权.
     *
     * @param JudgeAliyunMultiauthorityRequest $request
     *
     * @return JudgeAliyunMultiauthorityResponse
     */
    public function judgeAliyunMultiauthority($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->judgeAliyunMultiauthorityEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云批量鉴权
     * Summary: 阿里云批量鉴权.
     *
     * @param JudgeAliyunMultiauthorityRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return JudgeAliyunMultiauthorityResponse
     */
    public function judgeAliyunMultiauthorityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return JudgeAliyunMultiauthorityResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.aliyun.multiauthority.judge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 辰霖
     * Summary: 获取当前AK关联的用户实体信息.
     *
     * @param GetAccessorCurrentRequest $request
     *
     * @return GetAccessorCurrentResponse
     */
    public function getAccessorCurrent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAccessorCurrentEx($request, $headers, $runtime);
    }

    /**
     * Description: 辰霖
     * Summary: 获取当前AK关联的用户实体信息.
     *
     * @param GetAccessorCurrentRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetAccessorCurrentResponse
     */
    public function getAccessorCurrentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAccessorCurrentResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.accessor.current.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个服务账号信息
     * Summary: 获取单个服务账号信息.
     *
     * @param GetServiceaccountRequest $request
     *
     * @return GetServiceaccountResponse
     */
    public function getServiceaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getServiceaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个服务账号信息
     * Summary: 获取单个服务账号信息.
     *
     * @param GetServiceaccountRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetServiceaccountResponse
     */
    public function getServiceaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetServiceaccountResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.serviceaccount.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建服务账号
     * Summary: 创建服务账号.
     *
     * @param CreateServiceaccountRequest $request
     *
     * @return CreateServiceaccountResponse
     */
    public function createServiceaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createServiceaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建服务账号
     * Summary: 创建服务账号.
     *
     * @param CreateServiceaccountRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateServiceaccountResponse
     */
    public function createServiceaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateServiceaccountResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.serviceaccount.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除服务账号
     * Summary: 删除服务账号.
     *
     * @param DeleteServiceaccountRequest $request
     *
     * @return DeleteServiceaccountResponse
     */
    public function deleteServiceaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteServiceaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除服务账号
     * Summary: 删除服务账号.
     *
     * @param DeleteServiceaccountRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteServiceaccountResponse
     */
    public function deleteServiceaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteServiceaccountResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.serviceaccount.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新服务账号信息
     * Summary: 更新服务账号信息.
     *
     * @param UpdateServiceaccountRequest $request
     *
     * @return UpdateServiceaccountResponse
     */
    public function updateServiceaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateServiceaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新服务账号信息
     * Summary: 更新服务账号信息.
     *
     * @param UpdateServiceaccountRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateServiceaccountResponse
     */
    public function updateServiceaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateServiceaccountResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.serviceaccount.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 移除租户成员
     * Summary: 移除租户成员.
     *
     * @param RemoveTenantMemberRequest $request
     *
     * @return RemoveTenantMemberResponse
     */
    public function removeTenantMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeTenantMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 移除租户成员
     * Summary: 移除租户成员.
     *
     * @param RemoveTenantMemberRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return RemoveTenantMemberResponse
     */
    public function removeTenantMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveTenantMemberResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.tenant.member.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建成员组
     * Summary: 创建成员组.
     *
     * @param CreateGroupRequest $request
     *
     * @return CreateGroupResponse
     */
    public function createGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建成员组
     * Summary: 创建成员组.
     *
     * @param CreateGroupRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateGroupResponse
     */
    public function createGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateGroupResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除成员组
     * Summary: 删除成员组.
     *
     * @param DeleteGroupRequest $request
     *
     * @return DeleteGroupResponse
     */
    public function deleteGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除成员组
     * Summary: 删除成员组.
     *
     * @param DeleteGroupRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return DeleteGroupResponse
     */
    public function deleteGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteGroupResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新成员组
     * Summary: 更新成员组.
     *
     * @param UpdateGroupRequest $request
     *
     * @return UpdateGroupResponse
     */
    public function updateGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新成员组
     * Summary: 更新成员组.
     *
     * @param UpdateGroupRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UpdateGroupResponse
     */
    public function updateGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGroupResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加成员组成员
     * Summary: 添加成员组成员.
     *
     * @param AddGroupMemberRequest $request
     *
     * @return AddGroupMemberResponse
     */
    public function addGroupMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addGroupMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加成员组成员
     * Summary: 添加成员组成员.
     *
     * @param AddGroupMemberRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddGroupMemberResponse
     */
    public function addGroupMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddGroupMemberResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.member.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 移除成员组成员
     * Summary: 移除成员组成员.
     *
     * @param RemoveGroupMemberRequest $request
     *
     * @return RemoveGroupMemberResponse
     */
    public function removeGroupMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeGroupMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 移除成员组成员
     * Summary: 移除成员组成员.
     *
     * @param RemoveGroupMemberRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RemoveGroupMemberResponse
     */
    public function removeGroupMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveGroupMemberResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.member.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 成员组基本信息查询
     * Summary: 成员组基本信息查询.
     *
     * @param GetGroupRequest $request
     *
     * @return GetGroupResponse
     */
    public function getGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 成员组基本信息查询
     * Summary: 成员组基本信息查询.
     *
     * @param GetGroupRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetGroupResponse
     */
    public function getGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGroupResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 成员组成员查询
     * Summary: 成员组成员查询.
     *
     * @param QueryGroupMemberRequest $request
     *
     * @return QueryGroupMemberResponse
     */
    public function queryGroupMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGroupMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 成员组成员查询
     * Summary: 成员组成员查询.
     *
     * @param QueryGroupMemberRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryGroupMemberResponse
     */
    public function queryGroupMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGroupMemberResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.group.member.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取用户所在成员组
     * Summary: 获取用户所在成员组.
     *
     * @param ListOperatorGroupRequest $request
     *
     * @return ListOperatorGroupResponse
     */
    public function listOperatorGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listOperatorGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取用户所在成员组
     * Summary: 获取用户所在成员组.
     *
     * @param ListOperatorGroupRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListOperatorGroupResponse
     */
    public function listOperatorGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListOperatorGroupResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.group.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为角色添加权限码
     * Summary: 为角色添加权限码
     *
     * @param AddRoleActionRequest $request
     *
     * @return AddRoleActionResponse
     */
    public function addRoleAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addRoleActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 为角色添加权限码
     * Summary: 为角色添加权限码
     *
     * @param AddRoleActionRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddRoleActionResponse
     */
    public function addRoleActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddRoleActionResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.action.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 移除角色权限
     * Summary: 移除角色权限.
     *
     * @param RemoveRoleActionRequest $request
     *
     * @return RemoveRoleActionResponse
     */
    public function removeRoleAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeRoleActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 移除角色权限
     * Summary: 移除角色权限.
     *
     * @param RemoveRoleActionRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return RemoveRoleActionResponse
     */
    public function removeRoleActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveRoleActionResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.action.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建自定义角色
     * Summary: 创建自定义角色.
     *
     * @param CreateRoleRequest $request
     *
     * @return CreateRoleResponse
     */
    public function createRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建自定义角色
     * Summary: 创建自定义角色.
     *
     * @param CreateRoleRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateRoleResponse
     */
    public function createRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRoleResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除角色
     * Summary: 删除角色.
     *
     * @param DeleteRoleRequest $request
     *
     * @return DeleteRoleResponse
     */
    public function deleteRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除角色
     * Summary: 删除角色.
     *
     * @param DeleteRoleRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DeleteRoleResponse
     */
    public function deleteRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteRoleResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新角色
     * Summary: 更新角色.
     *
     * @param UpdateRoleRequest $request
     *
     * @return UpdateRoleResponse
     */
    public function updateRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新角色
     * Summary: 更新角色.
     *
     * @param UpdateRoleRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UpdateRoleResponse
     */
    public function updateRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRoleResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.role.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个部门信息
     * Summary: 获取单个部门信息.
     *
     * @param GetDepartmentRequest $request
     *
     * @return GetDepartmentResponse
     */
    public function getDepartment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDepartmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个部门信息
     * Summary: 获取单个部门信息.
     *
     * @param GetDepartmentRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetDepartmentResponse
     */
    public function getDepartmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDepartmentResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建部门
     * Summary: 创建部门.
     *
     * @param CreateDepartmentRequest $request
     *
     * @return CreateDepartmentResponse
     */
    public function createDepartment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDepartmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建部门
     * Summary: 创建部门.
     *
     * @param CreateDepartmentRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateDepartmentResponse
     */
    public function createDepartmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDepartmentResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新部门信息
     * Summary: 更新部门信息.
     *
     * @param UpdateDepartmentRequest $request
     *
     * @return UpdateDepartmentResponse
     */
    public function updateDepartment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDepartmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新部门信息
     * Summary: 更新部门信息.
     *
     * @param UpdateDepartmentRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateDepartmentResponse
     */
    public function updateDepartmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDepartmentResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除部门
     * Summary: 删除部门.
     *
     * @param DeleteDepartmentRequest $request
     *
     * @return DeleteDepartmentResponse
     */
    public function deleteDepartment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDepartmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除部门
     * Summary: 删除部门.
     *
     * @param DeleteDepartmentRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteDepartmentResponse
     */
    public function deleteDepartmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDepartmentResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询部门信息
     * Summary: 分页查询部门信息.
     *
     * @param PagequeryDepartmentRequest $request
     *
     * @return PagequeryDepartmentResponse
     */
    public function pagequeryDepartment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDepartmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询部门信息
     * Summary: 分页查询部门信息.
     *
     * @param PagequeryDepartmentRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PagequeryDepartmentResponse
     */
    public function pagequeryDepartmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDepartmentResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询部门
     * Summary: 批量查询部门.
     *
     * @param BatchqueryDepartmentRequest $request
     *
     * @return BatchqueryDepartmentResponse
     */
    public function batchqueryDepartment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryDepartmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询部门
     * Summary: 批量查询部门.
     *
     * @param BatchqueryDepartmentRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return BatchqueryDepartmentResponse
     */
    public function batchqueryDepartmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryDepartmentResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加或更新部门成员
     * Summary: 添加或更新部门成员.
     *
     * @param SaveDepartmentUserRequest $request
     *
     * @return SaveDepartmentUserResponse
     */
    public function saveDepartmentUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveDepartmentUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加或更新部门成员
     * Summary: 添加或更新部门成员.
     *
     * @param SaveDepartmentUserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SaveDepartmentUserResponse
     */
    public function saveDepartmentUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveDepartmentUserResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.user.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 移除部门成员
     * Summary: 移除部门成员.
     *
     * @param RemoveDepartmentUserRequest $request
     *
     * @return RemoveDepartmentUserResponse
     */
    public function removeDepartmentUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeDepartmentUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 移除部门成员
     * Summary: 移除部门成员.
     *
     * @param RemoveDepartmentUserRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return RemoveDepartmentUserResponse
     */
    public function removeDepartmentUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveDepartmentUserResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.user.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询部门成员信息
     * Summary: 分页查询部门成员信息.
     *
     * @param QueryDepartmentUserRequest $request
     *
     * @return QueryDepartmentUserResponse
     */
    public function queryDepartmentUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDepartmentUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询部门成员信息
     * Summary: 分页查询部门成员信息.
     *
     * @param QueryDepartmentUserRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDepartmentUserResponse
     */
    public function queryDepartmentUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDepartmentUserResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.department.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户级安全设置
     * Summary: 获取租户级安全设置.
     *
     * @param GetLoginconfigRequest $request
     *
     * @return GetLoginconfigResponse
     */
    public function getLoginconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLoginconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户级安全设置
     * Summary: 获取租户级安全设置.
     *
     * @param GetLoginconfigRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetLoginconfigResponse
     */
    public function getLoginconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLoginconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.loginconfig.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新租户级安全设置
     * Summary: 更新租户级安全设置.
     *
     * @param UpdateLoginconfigRequest $request
     *
     * @return UpdateLoginconfigResponse
     */
    public function updateLoginconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLoginconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新租户级安全设置
     * Summary: 更新租户级安全设置.
     *
     * @param UpdateLoginconfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateLoginconfigResponse
     */
    public function updateLoginconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLoginconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.loginconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 唯一条件查询MFA状态
     * Summary: 唯一条件查询MFA状态
     *
     * @param GetMfaStatusRequest $request
     *
     * @return GetMfaStatusResponse
     */
    public function getMfaStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMfaStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 唯一条件查询MFA状态
     * Summary: 唯一条件查询MFA状态
     *
     * @param GetMfaStatusRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetMfaStatusResponse
     */
    public function getMfaStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMfaStatusResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.mfa.status.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开启MFA
     * Summary: 开启MFA.
     *
     * @param EnableMfaRequest $request
     *
     * @return EnableMfaResponse
     */
    public function enableMfa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableMfaEx($request, $headers, $runtime);
    }

    /**
     * Description: 开启MFA
     * Summary: 开启MFA.
     *
     * @param EnableMfaRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return EnableMfaResponse
     */
    public function enableMfaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableMfaResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.mfa.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 关闭MFA
     * Summary: 关闭MFA.
     *
     * @param DisableMfaRequest $request
     *
     * @return DisableMfaResponse
     */
    public function disableMfa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableMfaEx($request, $headers, $runtime);
    }

    /**
     * Description: 关闭MFA
     * Summary: 关闭MFA.
     *
     * @param DisableMfaRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DisableMfaResponse
     */
    public function disableMfaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableMfaResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.mfa.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 初始化MFA
     * Summary: 初始化MFA.
     *
     * @param InitMfaRequest $request
     *
     * @return InitMfaResponse
     */
    public function initMfa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initMfaEx($request, $headers, $runtime);
    }

    /**
     * Description: 初始化MFA
     * Summary: 初始化MFA.
     *
     * @param InitMfaRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return InitMfaResponse
     */
    public function initMfaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitMfaResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.mfa.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验 MFA
     * Summary: 校验 MFA.
     *
     * @param VerifyMfaRequest $request
     *
     * @return VerifyMfaResponse
     */
    public function verifyMfa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyMfaEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验 MFA
     * Summary: 校验 MFA.
     *
     * @param VerifyMfaRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return VerifyMfaResponse
     */
    public function verifyMfaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyMfaResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.mfa.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 唯一条件查询MFA配置
     * Summary: 唯一条件查询MFA配置.
     *
     * @param GetMfaRequest $request
     *
     * @return GetMfaResponse
     */
    public function getMfa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMfaEx($request, $headers, $runtime);
    }

    /**
     * Description: 唯一条件查询MFA配置
     * Summary: 唯一条件查询MFA配置.
     *
     * @param GetMfaRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetMfaResponse
     */
    public function getMfaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMfaResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.mfa.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新密码
     * Summary: 更新密码
     *
     * @param UpdateOperatorPasswordRequest $request
     *
     * @return UpdateOperatorPasswordResponse
     */
    public function updateOperatorPassword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateOperatorPasswordEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新密码
     * Summary: 更新密码
     *
     * @param UpdateOperatorPasswordRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateOperatorPasswordResponse
     */
    public function updateOperatorPasswordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateOperatorPasswordResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.password.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重置账号密码
     * Summary: 重置账号密码
     *
     * @param ResetOperatorPasswordRequest $request
     *
     * @return ResetOperatorPasswordResponse
     */
    public function resetOperatorPassword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetOperatorPasswordEx($request, $headers, $runtime);
    }

    /**
     * Description: 重置账号密码
     * Summary: 重置账号密码
     *
     * @param ResetOperatorPasswordRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ResetOperatorPasswordResponse
     */
    public function resetOperatorPasswordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetOperatorPasswordResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.password.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询操作员
     * Summary: 批量查询操作员.
     *
     * @param BatchqueryOperatorRequest $request
     *
     * @return BatchqueryOperatorResponse
     */
    public function batchqueryOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询操作员
     * Summary: 批量查询操作员.
     *
     * @param BatchqueryOperatorRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return BatchqueryOperatorResponse
     */
    public function batchqueryOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 推送操作事件，事件需要事先定义
     * Summary: 推送操作事件.
     *
     * @param PushOperationRequest $request
     *
     * @return PushOperationResponse
     */
    public function pushOperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushOperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 推送操作事件，事件需要事先定义
     * Summary: 推送操作事件.
     *
     * @param PushOperationRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return PushOperationResponse
     */
    public function pushOperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushOperationResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operation.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询操作类型
     * Summary: 查询操作类型.
     *
     * @param QueryOperationtypeRequest $request
     *
     * @return QueryOperationtypeResponse
     */
    public function queryOperationtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOperationtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询操作类型
     * Summary: 查询操作类型.
     *
     * @param QueryOperationtypeRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryOperationtypeResponse
     */
    public function queryOperationtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOperationtypeResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operationtype.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 唯一查询操作类型
     * Summary: 唯一查询操作类型.
     *
     * @param GetOperationtypeRequest $request
     *
     * @return GetOperationtypeResponse
     */
    public function getOperationtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getOperationtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 唯一查询操作类型
     * Summary: 唯一查询操作类型.
     *
     * @param GetOperationtypeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetOperationtypeResponse
     */
    public function getOperationtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetOperationtypeResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operationtype.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加租户成员
     * Summary: 添加租户成员.
     *
     * @param AddTenantMemberRequest $request
     *
     * @return AddTenantMemberResponse
     */
    public function addTenantMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTenantMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加租户成员
     * Summary: 添加租户成员.
     *
     * @param AddTenantMemberRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddTenantMemberResponse
     */
    public function addTenantMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTenantMemberResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.tenant.member.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
     * Summary: 获取操作员 signtoken.
     *
     * @param GetOperatorLogintokenRequest $request
     *
     * @return GetOperatorLogintokenResponse
     */
    public function getOperatorLogintoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getOperatorLogintokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
     * Summary: 获取操作员 signtoken.
     *
     * @param GetOperatorLogintokenRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetOperatorLogintokenResponse
     */
    public function getOperatorLogintokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetOperatorLogintokenResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.operator.logintoken.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: token用于三方会员免密登录，与数科官网token不通用
     * Summary: 三方会员免密登录token申请.
     *
     * @param ApplyTrustloginTokenRequest $request
     *
     * @return ApplyTrustloginTokenResponse
     */
    public function applyTrustloginToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyTrustloginTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: token用于三方会员免密登录，与数科官网token不通用
     * Summary: 三方会员免密登录token申请.
     *
     * @param ApplyTrustloginTokenRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyTrustloginTokenResponse
     */
    public function applyTrustloginTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyTrustloginTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.trustlogin.token.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方会员免密登录token校验，与数科官网token不通用
     * Summary: 三方会员免密登录token校验.
     *
     * @param VerifyTrustloginTokenRequest $request
     *
     * @return VerifyTrustloginTokenResponse
     */
    public function verifyTrustloginToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyTrustloginTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方会员免密登录token校验，与数科官网token不通用
     * Summary: 三方会员免密登录token校验.
     *
     * @param VerifyTrustloginTokenRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return VerifyTrustloginTokenResponse
     */
    public function verifyTrustloginTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyTrustloginTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.iam.trustlogin.token.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
