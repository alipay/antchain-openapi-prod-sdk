<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ACS_USER\Models\CreateTenantRequest;
use AntChain\ACS_USER\Models\CreateTenantResponse;
use AntChain\ACS_USER\Models\CreateUserRequest;
use AntChain\ACS_USER\Models\CreateUserResponse;
use AntChain\ACS_USER\Models\DeleteUserRequest;
use AntChain\ACS_USER\Models\DeleteUserResponse;
use AntChain\ACS_USER\Models\JudgeAuthorityRequest;
use AntChain\ACS_USER\Models\JudgeAuthorityResponse;
use AntChain\ACS_USER\Models\ListAuthActionRequest;
use AntChain\ACS_USER\Models\ListAuthActionResponse;
use AntChain\ACS_USER\Models\ListPolicyRequest;
use AntChain\ACS_USER\Models\ListPolicyResponse;
use AntChain\ACS_USER\Models\ListRoleRequest;
use AntChain\ACS_USER\Models\ListRoleResponse;
use AntChain\ACS_USER\Models\ListUserwithroleRequest;
use AntChain\ACS_USER\Models\ListUserwithroleResponse;
use AntChain\ACS_USER\Models\QueryAccessorRequest;
use AntChain\ACS_USER\Models\QueryAccessorResponse;
use AntChain\ACS_USER\Models\QueryUserRequest;
use AntChain\ACS_USER\Models\QueryUserResponse;
use AntChain\ACS_USER\Models\UpdateUserRequest;
use AntChain\ACS_USER\Models\UpdateUserResponse;
use AntChain\ACS_USER\Models\VerifySessionTokenRequest;
use AntChain\ACS_USER\Models\VerifySessionTokenResponse;
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
            // 功能点信息
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
                    'sdk_version'      => '1.3.3',
                    '_prod_code'       => 'ACS_USER',
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
     * Description: acsgw来根据ak查询accessor的信息
     * Summary: 根据ak查询accessor信息.
     *
     * @param QueryAccessorRequest $request
     *
     * @return QueryAccessorResponse
     */
    public function queryAccessor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAccessorEx($request, $headers, $runtime);
    }

    /**
     * Description: acsgw来根据ak查询accessor的信息
     * Summary: 根据ak查询accessor信息.
     *
     * @param QueryAccessorRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryAccessorResponse
     */
    public function queryAccessorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAccessorResponse::fromMap($this->doRequest('1.0', 'acs.user.accessor.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所有的用户与权限关系列表
     * Summary: 获取用户角色信息列表.
     *
     * @param ListUserwithroleRequest $request
     *
     * @return ListUserwithroleResponse
     */
    public function listUserwithrole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUserwithroleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所有的用户与权限关系列表
     * Summary: 获取用户角色信息列表.
     *
     * @param ListUserwithroleRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListUserwithroleResponse
     */
    public function listUserwithroleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUserwithroleResponse::fromMap($this->doRequest('1.0', 'acs.user.userwithrole.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 私有化场景用户登录态验证
     * Summary: 私有化场景用户登录态验证
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
     * Description: 私有化场景用户登录态验证
     * Summary: 私有化场景用户登录态验证
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

        return VerifySessionTokenResponse::fromMap($this->doRequest('1.0', 'acs.user.session.token.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户权限校验
     * Summary: 用户权限校验.
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
     * Description: 用户权限校验
     * Summary: 用户权限校验.
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

        return JudgeAuthorityResponse::fromMap($this->doRequest('1.0', 'acs.user.authority.judge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询某个用户的权限
     * Summary: 用户权限查询.
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
     * Description: 查询某个用户的权限
     * Summary: 用户权限查询.
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

        return ListPolicyResponse::fromMap($this->doRequest('1.0', 'acs.user.policy.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询.
     *
     * @param QueryUserRequest $request
     *
     * @return QueryUserResponse
     */
    public function queryUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询.
     *
     * @param QueryUserRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryUserResponse
     */
    public function queryUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserResponse::fromMap($this->doRequest('1.0', 'acs.user.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户创建
     * Summary: 租户创建.
     *
     * @param CreateTenantRequest $request
     *
     * @return CreateTenantResponse
     */
    public function createTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 租户创建
     * Summary: 租户创建.
     *
     * @param CreateTenantRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateTenantResponse
     */
    public function createTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTenantResponse::fromMap($this->doRequest('1.0', 'acs.user.tenant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取归属某个产品的有效权限点列表
     * Summary: 获取归属某个产品的有效权限点列表.
     *
     * @param ListAuthActionRequest $request
     *
     * @return ListAuthActionResponse
     */
    public function listAuthAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAuthActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取归属某个产品的有效权限点列表
     * Summary: 获取归属某个产品的有效权限点列表.
     *
     * @param ListAuthActionRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListAuthActionResponse
     */
    public function listAuthActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAuthActionResponse::fromMap($this->doRequest('1.0', 'acs.user.auth.action.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询角色列表
     * Summary: 角色列表.
     *
     * @param ListRoleRequest $request
     *
     * @return ListRoleResponse
     */
    public function listRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询角色列表
     * Summary: 角色列表.
     *
     * @param ListRoleRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return ListRoleResponse
     */
    public function listRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRoleResponse::fromMap($this->doRequest('1.0', 'acs.user.role.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加用户
     * Summary: 添加用户.
     *
     * @param CreateUserRequest $request
     *
     * @return CreateUserResponse
     */
    public function createUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加用户
     * Summary: 添加用户.
     *
     * @param CreateUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateUserResponse
     */
    public function createUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserResponse::fromMap($this->doRequest('1.0', 'acs.user.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新用户角色
     * Summary: 更新用户角色.
     *
     * @param UpdateUserRequest $request
     *
     * @return UpdateUserResponse
     */
    public function updateUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新用户角色
     * Summary: 更新用户角色.
     *
     * @param UpdateUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UpdateUserResponse
     */
    public function updateUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUserResponse::fromMap($this->doRequest('1.0', 'acs.user.user.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除用户
     * Summary: 删除用户.
     *
     * @param DeleteUserRequest $request
     *
     * @return DeleteUserResponse
     */
    public function deleteUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除用户
     * Summary: 删除用户.
     *
     * @param DeleteUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DeleteUserResponse
     */
    public function deleteUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteUserResponse::fromMap($this->doRequest('1.0', 'acs.user.user.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
