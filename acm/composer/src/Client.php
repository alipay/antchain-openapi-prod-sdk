<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Acm\Models\AddServiceaccountAuthpolicyRequest;
use AntChain\Acm\Models\AddServiceaccountAuthpolicyResponse;
use AntChain\Acm\Models\AddTenantBusinesstagRequest;
use AntChain\Acm\Models\AddTenantBusinesstagResponse;
use AntChain\Acm\Models\AddTenantMemberRequest;
use AntChain\Acm\Models\AddTenantMemberResponse;
use AntChain\Acm\Models\ApplyTrustloginTokenRequest;
use AntChain\Acm\Models\ApplyTrustloginTokenResponse;
use AntChain\Acm\Models\CheckAlipayTenantRequest;
use AntChain\Acm\Models\CheckAlipayTenantResponse;
use AntChain\Acm\Models\CheckLoginnameRequest;
use AntChain\Acm\Models\CheckLoginnameResponse;
use AntChain\Acm\Models\CreateAntchainTenantRequest;
use AntChain\Acm\Models\CreateAntchainTenantResponse;
use AntChain\Acm\Models\CreateOauthServiceaccountRequest;
use AntChain\Acm\Models\CreateOauthServiceaccountResponse;
use AntChain\Acm\Models\CreateOperatorRequest;
use AntChain\Acm\Models\CreateOperatorResponse;
use AntChain\Acm\Models\CreateServiceaccountOnepartyRequest;
use AntChain\Acm\Models\CreateServiceaccountOnepartyResponse;
use AntChain\Acm\Models\CreateTenantRequest;
use AntChain\Acm\Models\CreateTenantResponse;
use AntChain\Acm\Models\CreateUserTokenRequest;
use AntChain\Acm\Models\CreateUserTokenResponse;
use AntChain\Acm\Models\DeleteOperatorRequest;
use AntChain\Acm\Models\DeleteOperatorResponse;
use AntChain\Acm\Models\DeleteTrustloginTokenRequest;
use AntChain\Acm\Models\DeleteTrustloginTokenResponse;
use AntChain\Acm\Models\DisableOauthMobileloginRequest;
use AntChain\Acm\Models\DisableOauthMobileloginResponse;
use AntChain\Acm\Models\EnableOauthMobileloginRequest;
use AntChain\Acm\Models\EnableOauthMobileloginResponse;
use AntChain\Acm\Models\GetAntpassportTenantRequest;
use AntChain\Acm\Models\GetAntpassportTenantResponse;
use AntChain\Acm\Models\GetCurrentidRequest;
use AntChain\Acm\Models\GetCurrentidResponse;
use AntChain\Acm\Models\GetCustomerRequest;
use AntChain\Acm\Models\GetCustomerResponse;
use AntChain\Acm\Models\GetMasterTenantRequest;
use AntChain\Acm\Models\GetMasterTenantResponse;
use AntChain\Acm\Models\GetOauthServiceaccountRequest;
use AntChain\Acm\Models\GetOauthServiceaccountResponse;
use AntChain\Acm\Models\GetOperatorRequest;
use AntChain\Acm\Models\GetOperatorResponse;
use AntChain\Acm\Models\GetServiceaccountOnepartyRequest;
use AntChain\Acm\Models\GetServiceaccountOnepartyResponse;
use AntChain\Acm\Models\GetTenantDingtokenRequest;
use AntChain\Acm\Models\GetTenantDingtokenResponse;
use AntChain\Acm\Models\GetTenantIaasaccountRequest;
use AntChain\Acm\Models\GetTenantIaasaccountResponse;
use AntChain\Acm\Models\GetTenantRequest;
use AntChain\Acm\Models\GetTenantResponse;
use AntChain\Acm\Models\ListCustomerRequest;
use AntChain\Acm\Models\ListCustomerResponse;
use AntChain\Acm\Models\QueryAdminRequest;
use AntChain\Acm\Models\QueryAdminResponse;
use AntChain\Acm\Models\QueryOperatorRequest;
use AntChain\Acm\Models\QueryOperatorResponse;
use AntChain\Acm\Models\QueryRoleActionRequest;
use AntChain\Acm\Models\QueryRoleActionResponse;
use AntChain\Acm\Models\QueryTenantRequest;
use AntChain\Acm\Models\QueryTenantResponse;
use AntChain\Acm\Models\QueryTenantStatusRequest;
use AntChain\Acm\Models\QueryTenantStatusResponse;
use AntChain\Acm\Models\QueryTenantTagRequest;
use AntChain\Acm\Models\QueryTenantTagResponse;
use AntChain\Acm\Models\QueryUserRoleRequest;
use AntChain\Acm\Models\QueryUserRoleResponse;
use AntChain\Acm\Models\RefreshUserTokenRequest;
use AntChain\Acm\Models\RefreshUserTokenResponse;
use AntChain\Acm\Models\RemoveTenantBusinesstagRequest;
use AntChain\Acm\Models\RemoveTenantBusinesstagResponse;
use AntChain\Acm\Models\SearchOperatorRequest;
use AntChain\Acm\Models\SearchOperatorResponse;
use AntChain\Acm\Models\SendOperatorActiveemailRequest;
use AntChain\Acm\Models\SendOperatorActiveemailResponse;
use AntChain\Acm\Models\SyncTenantInfoRequest;
use AntChain\Acm\Models\SyncTenantInfoResponse;
use AntChain\Acm\Models\UpdateCustomerIdentityRequest;
use AntChain\Acm\Models\UpdateCustomerIdentityResponse;
use AntChain\Acm\Models\UpdateOperatorRequest;
use AntChain\Acm\Models\UpdateOperatorResponse;
use AntChain\Acm\Models\VerifyServiceaccountSignatureRequest;
use AntChain\Acm\Models\VerifyServiceaccountSignatureResponse;
use AntChain\Acm\Models\VerifyTrustloginTokenRequest;
use AntChain\Acm\Models\VerifyTrustloginTokenResponse;
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
            // 访问IaaS层的身份
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
                    'sdk_version'      => '1.6.0',
                    '_prod_code'       => 'acm',
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
     * Description: 查询企业详情
     * Summary: 获取企业.
     *
     * @param GetCustomerRequest $request
     *
     * @return GetCustomerResponse
     */
    public function getCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业详情
     * Summary: 获取企业.
     *
     * @param GetCustomerRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetCustomerResponse
     */
    public function getCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCustomerResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.customer.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一个操作员的详情
     * Summary: 获取操作员.
     *
     * @param GetOperatorRequest $request
     *
     * @return GetOperatorResponse
     */
    public function getOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一个操作员的详情
     * Summary: 获取操作员.
     *
     * @param GetOperatorRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetOperatorResponse
     */
    public function getOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.operator.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询操作员列表
     * Summary: 查询操作员.
     *
     * @param QueryOperatorRequest $request
     *
     * @return QueryOperatorResponse
     */
    public function queryOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询操作员列表
     * Summary: 查询操作员.
     *
     * @param QueryOperatorRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryOperatorResponse
     */
    public function queryOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.operator.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 搜索操作员
     * Summary: 搜索操作员.
     *
     * @param SearchOperatorRequest $request
     *
     * @return SearchOperatorResponse
     */
    public function searchOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->searchOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 搜索操作员
     * Summary: 搜索操作员.
     *
     * @param SearchOperatorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SearchOperatorResponse
     */
    public function searchOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SearchOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.operator.search', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建操作员
     * Summary: 创建操作员.
     *
     * @param CreateOperatorRequest $request
     *
     * @return CreateOperatorResponse
     */
    public function createOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建操作员
     * Summary: 创建操作员.
     *
     * @param CreateOperatorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateOperatorResponse
     */
    public function createOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.operator.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新操作员
     * Summary: 更新操作员.
     *
     * @param UpdateOperatorRequest $request
     *
     * @return UpdateOperatorResponse
     */
    public function updateOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新操作员
     * Summary: 更新操作员.
     *
     * @param UpdateOperatorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateOperatorResponse
     */
    public function updateOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.operator.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除操作员
     * Summary: 删除操作员.
     *
     * @param DeleteOperatorRequest $request
     *
     * @return DeleteOperatorResponse
     */
    public function deleteOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除操作员
     * Summary: 删除操作员.
     *
     * @param DeleteOperatorRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteOperatorResponse
     */
    public function deleteOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteOperatorResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.operator.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return AddTenantMemberResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.member.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 初始化租户
     * Summary: 初始化租户.
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
     * Description: 初始化租户
     * Summary: 初始化租户.
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

        return CreateTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户详情
     * Summary: 获取用户信息.
     *
     * @param GetTenantRequest $request
     *
     * @return GetTenantResponse
     */
    public function getTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户详情
     * Summary: 获取用户信息.
     *
     * @param GetTenantRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return GetTenantResponse
     */
    public function getTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户列表
     * Summary: 查询租户列表.
     *
     * @param QueryTenantRequest $request
     *
     * @return QueryTenantResponse
     */
    public function queryTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户列表
     * Summary: 查询租户列表.
     *
     * @param QueryTenantRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryTenantResponse
     */
    public function queryTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据蚂蚁通行证uid查询租户id
     * Summary: 查询租户ID.
     *
     * @param GetAntpassportTenantRequest $request
     *
     * @return GetAntpassportTenantResponse
     */
    public function getAntpassportTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntpassportTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据蚂蚁通行证uid查询租户id
     * Summary: 查询租户ID.
     *
     * @param GetAntpassportTenantRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetAntpassportTenantResponse
     */
    public function getAntpassportTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntpassportTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.antpassport.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取调用接口所使用AccessKey对应的身份实体信息
     * Summary: 获取调用接口所使用AccessKey对应的身份实体信息.
     *
     * @param GetCurrentidRequest $request
     *
     * @return GetCurrentidResponse
     */
    public function getCurrentid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCurrentidEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取调用接口所使用AccessKey对应的身份实体信息
     * Summary: 获取调用接口所使用AccessKey对应的身份实体信息.
     *
     * @param GetCurrentidRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetCurrentidResponse
     */
    public function getCurrentidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCurrentidResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.currentid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户对应的钉钉授权token信息，内部接口
     * Summary: 获取租户的钉钉授权.
     *
     * @param GetTenantDingtokenRequest $request
     *
     * @return GetTenantDingtokenResponse
     */
    public function getTenantDingtoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTenantDingtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户对应的钉钉授权token信息，内部接口
     * Summary: 获取租户的钉钉授权.
     *
     * @param GetTenantDingtokenRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetTenantDingtokenResponse
     */
    public function getTenantDingtokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTenantDingtokenResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.dingtoken.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询管理员，内部接口
     * Summary: 分页查询管理员.
     *
     * @param QueryAdminRequest $request
     *
     * @return QueryAdminResponse
     */
    public function queryAdmin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAdminEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询管理员，内部接口
     * Summary: 分页查询管理员.
     *
     * @param QueryAdminRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryAdminResponse
     */
    public function queryAdminEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAdminResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.admin.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户的IaaS账号
     * Summary: 获取租户的IaaS账号.
     *
     * @param GetTenantIaasaccountRequest $request
     *
     * @return GetTenantIaasaccountResponse
     */
    public function getTenantIaasaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTenantIaasaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户的IaaS账号
     * Summary: 获取租户的IaaS账号.
     *
     * @param GetTenantIaasaccountRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetTenantIaasaccountResponse
     */
    public function getTenantIaasaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTenantIaasaccountResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.iaasaccount.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业列表(内部接口,私有云开放)
     * Summary: 查询企业列表.
     *
     * @param ListCustomerRequest $request
     *
     * @return ListCustomerResponse
     */
    public function listCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业列表(内部接口,私有云开放)
     * Summary: 查询企业列表.
     *
     * @param ListCustomerRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListCustomerResponse
     */
    public function listCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCustomerResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.customer.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付宝账号证书信息校验及校验、入驻、打标
     * Summary: 支付宝账号证书信息校验、入驻、打标.
     *
     * @param CheckAlipayTenantRequest $request
     *
     * @return CheckAlipayTenantResponse
     */
    public function checkAlipayTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAlipayTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付宝账号证书信息校验及校验、入驻、打标
     * Summary: 支付宝账号证书信息校验、入驻、打标.
     *
     * @param CheckAlipayTenantRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CheckAlipayTenantResponse
     */
    public function checkAlipayTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAlipayTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.alipay.tenant.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户入住状态查询
     * Summary: 租户入住状态查询.
     *
     * @param QueryTenantStatusRequest $request
     *
     * @return QueryTenantStatusResponse
     */
    public function queryTenantStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTenantStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 租户入住状态查询
     * Summary: 租户入住状态查询.
     *
     * @param QueryTenantStatusRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryTenantStatusResponse
     */
    public function queryTenantStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTenantStatusResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账号创建
     * Summary: 账号创建.
     *
     * @param CreateAntchainTenantRequest $request
     *
     * @return CreateAntchainTenantResponse
     */
    public function createAntchainTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 账号创建
     * Summary: 账号创建.
     *
     * @param CreateAntchainTenantRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateAntchainTenantResponse
     */
    public function createAntchainTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.antchain.tenant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户认证信息更新
     * Summary: 客户认证信息更新.
     *
     * @param UpdateCustomerIdentityRequest $request
     *
     * @return UpdateCustomerIdentityResponse
     */
    public function updateCustomerIdentity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCustomerIdentityEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户认证信息更新
     * Summary: 客户认证信息更新.
     *
     * @param UpdateCustomerIdentityRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateCustomerIdentityResponse
     */
    public function updateCustomerIdentityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCustomerIdentityResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.customer.identity.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用用户ID或用户CODE查询用户信息
     * Summary: 使用用户ID或用户CODE查询用户信息.
     *
     * @param GetMasterTenantRequest $request
     *
     * @return GetMasterTenantResponse
     */
    public function getMasterTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMasterTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用用户ID或用户CODE查询用户信息
     * Summary: 使用用户ID或用户CODE查询用户信息.
     *
     * @param GetMasterTenantRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetMasterTenantResponse
     */
    public function getMasterTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMasterTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.master.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检查邮箱是否可以用来注册
     * Summary: 检查邮箱是否可以用来注册.
     *
     * @param CheckLoginnameRequest $request
     *
     * @return CheckLoginnameResponse
     */
    public function checkLoginname($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkLoginnameEx($request, $headers, $runtime);
    }

    /**
     * Description: 检查邮箱是否可以用来注册
     * Summary: 检查邮箱是否可以用来注册.
     *
     * @param CheckLoginnameRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CheckLoginnameResponse
     */
    public function checkLoginnameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckLoginnameResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.loginname.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户的标签
     * Summary: 查询租户的标签列表.
     *
     * @param QueryTenantTagRequest $request
     *
     * @return QueryTenantTagResponse
     */
    public function queryTenantTag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTenantTagEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户的标签
     * Summary: 查询租户的标签列表.
     *
     * @param QueryTenantTagRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryTenantTagResponse
     */
    public function queryTenantTagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTenantTagResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.tag.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户增加业务标签
     * Summary: 租户增加业务标签.
     *
     * @param AddTenantBusinesstagRequest $request
     *
     * @return AddTenantBusinesstagResponse
     */
    public function addTenantBusinesstag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTenantBusinesstagEx($request, $headers, $runtime);
    }

    /**
     * Description: 租户增加业务标签
     * Summary: 租户增加业务标签.
     *
     * @param AddTenantBusinesstagRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return AddTenantBusinesstagResponse
     */
    public function addTenantBusinesstagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTenantBusinesstagResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.businesstag.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除业务标签
     * Summary: 删除业务标签.
     *
     * @param RemoveTenantBusinesstagRequest $request
     *
     * @return RemoveTenantBusinesstagResponse
     */
    public function removeTenantBusinesstag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeTenantBusinesstagEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除业务标签
     * Summary: 删除业务标签.
     *
     * @param RemoveTenantBusinesstagRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return RemoveTenantBusinesstagResponse
     */
    public function removeTenantBusinesstagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveTenantBusinesstagResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.businesstag.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户发送操作员的激活邮件
     * Summary: 操作员发送激活邮件.
     *
     * @param SendOperatorActiveemailRequest $request
     *
     * @return SendOperatorActiveemailResponse
     */
    public function sendOperatorActiveemail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendOperatorActiveemailEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户发送操作员的激活邮件
     * Summary: 操作员发送激活邮件.
     *
     * @param SendOperatorActiveemailRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SendOperatorActiveemailResponse
     */
    public function sendOperatorActiveemailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendOperatorActiveemailResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.operator.activeemail.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账号信息同步
     * Summary: 账号信息同步.
     *
     * @param SyncTenantInfoRequest $request
     *
     * @return SyncTenantInfoResponse
     */
    public function syncTenantInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTenantInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 账号信息同步
     * Summary: 账号信息同步.
     *
     * @param SyncTenantInfoRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SyncTenantInfoResponse
     */
    public function syncTenantInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTenantInfoResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.tenant.info.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方授权创建服务账号
     * Summary: 三方授权创建服务账号.
     *
     * @param CreateOauthServiceaccountRequest $request
     *
     * @return CreateOauthServiceaccountResponse
     */
    public function createOauthServiceaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOauthServiceaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方授权创建服务账号
     * Summary: 三方授权创建服务账号.
     *
     * @param CreateOauthServiceaccountRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateOauthServiceaccountResponse
     */
    public function createOauthServiceaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOauthServiceaccountResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.oauth.serviceaccount.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方授权获取服务账号信息
     * Summary: 三方授权获取服务账号信息.
     *
     * @param GetOauthServiceaccountRequest $request
     *
     * @return GetOauthServiceaccountResponse
     */
    public function getOauthServiceaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getOauthServiceaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方授权获取服务账号信息
     * Summary: 三方授权获取服务账号信息.
     *
     * @param GetOauthServiceaccountRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetOauthServiceaccountResponse
     */
    public function getOauthServiceaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetOauthServiceaccountResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.oauth.serviceaccount.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方授权开通手机号登陆
     * Summary: 三方授权开通手机号登陆.
     *
     * @param EnableOauthMobileloginRequest $request
     *
     * @return EnableOauthMobileloginResponse
     */
    public function enableOauthMobilelogin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableOauthMobileloginEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方授权开通手机号登陆
     * Summary: 三方授权开通手机号登陆.
     *
     * @param EnableOauthMobileloginRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return EnableOauthMobileloginResponse
     */
    public function enableOauthMobileloginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableOauthMobileloginResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.oauth.mobilelogin.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方授权关闭手机号登陆
     * Summary: 三方授权关闭手机号登陆.
     *
     * @param DisableOauthMobileloginRequest $request
     *
     * @return DisableOauthMobileloginResponse
     */
    public function disableOauthMobilelogin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableOauthMobileloginEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方授权关闭手机号登陆
     * Summary: 三方授权关闭手机号登陆.
     *
     * @param DisableOauthMobileloginRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DisableOauthMobileloginResponse
     */
    public function disableOauthMobileloginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableOauthMobileloginResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.oauth.mobilelogin.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给一方化平台代客创建服务账号（ak sk）
     * Summary: 一方化会员服务账号创建.
     *
     * @param CreateServiceaccountOnepartyRequest $request
     *
     * @return CreateServiceaccountOnepartyResponse
     */
    public function createServiceaccountOneparty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createServiceaccountOnepartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给一方化平台代客创建服务账号（ak sk）
     * Summary: 一方化会员服务账号创建.
     *
     * @param CreateServiceaccountOnepartyRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateServiceaccountOnepartyResponse
     */
    public function createServiceaccountOnepartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateServiceaccountOnepartyResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.serviceaccount.oneparty.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一方化会员服务账号查询（ak sk）
     * Summary: 一方化会员服务账号查询.
     *
     * @param GetServiceaccountOnepartyRequest $request
     *
     * @return GetServiceaccountOnepartyResponse
     */
    public function getServiceaccountOneparty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getServiceaccountOnepartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 一方化会员服务账号查询（ak sk）
     * Summary: 一方化会员服务账号查询.
     *
     * @param GetServiceaccountOnepartyRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetServiceaccountOnepartyResponse
     */
    public function getServiceaccountOnepartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetServiceaccountOnepartyResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.serviceaccount.oneparty.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return ApplyTrustloginTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.trustlogin.token.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return VerifyTrustloginTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.trustlogin.token.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一方化会员创建的服务账号授权
     * Summary: 一方化会员创建的服务账号授权.
     *
     * @param AddServiceaccountAuthpolicyRequest $request
     *
     * @return AddServiceaccountAuthpolicyResponse
     */
    public function addServiceaccountAuthpolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addServiceaccountAuthpolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 一方化会员创建的服务账号授权
     * Summary: 一方化会员创建的服务账号授权.
     *
     * @param AddServiceaccountAuthpolicyRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return AddServiceaccountAuthpolicyResponse
     */
    public function addServiceaccountAuthpolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddServiceaccountAuthpolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.serviceaccount.authpolicy.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户所具有的角色，用于平台型产品管控用户
     * Summary: 查询用户所具有的角色.
     *
     * @param QueryUserRoleRequest $request
     *
     * @return QueryUserRoleResponse
     */
    public function queryUserRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户所具有的角色，用于平台型产品管控用户
     * Summary: 查询用户所具有的角色.
     *
     * @param QueryUserRoleRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryUserRoleResponse
     */
    public function queryUserRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserRoleResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.user.role.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 角色权限点查询，用于平台型产品
     * Summary: 角色权限点查询.
     *
     * @param QueryRoleActionRequest $request
     *
     * @return QueryRoleActionResponse
     */
    public function queryRoleAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRoleActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 角色权限点查询，用于平台型产品
     * Summary: 角色权限点查询.
     *
     * @param QueryRoleActionRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryRoleActionResponse
     */
    public function queryRoleActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRoleActionResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.role.action.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 服务账号（AK）验签
     * Summary: 服务账号（AK）验签.
     *
     * @param VerifyServiceaccountSignatureRequest $request
     *
     * @return VerifyServiceaccountSignatureResponse
     */
    public function verifyServiceaccountSignature($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyServiceaccountSignatureEx($request, $headers, $runtime);
    }

    /**
     * Description: 服务账号（AK）验签
     * Summary: 服务账号（AK）验签.
     *
     * @param VerifyServiceaccountSignatureRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return VerifyServiceaccountSignatureResponse
     */
    public function verifyServiceaccountSignatureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyServiceaccountSignatureResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.serviceaccount.signature.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建用户登录态（线下环境使用）
     * Summary: 创建用户登录态（线下环境使用）.
     *
     * @param CreateUserTokenRequest $request
     *
     * @return CreateUserTokenResponse
     */
    public function createUserToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建用户登录态（线下环境使用）
     * Summary: 创建用户登录态（线下环境使用）.
     *
     * @param CreateUserTokenRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateUserTokenResponse
     */
    public function createUserTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.user.token.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 刷新用户登录态（线下环境使用）
     * Summary: 刷新用户登录态（线下环境使用）.
     *
     * @param RefreshUserTokenRequest $request
     *
     * @return RefreshUserTokenResponse
     */
    public function refreshUserToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refreshUserTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 刷新用户登录态（线下环境使用）
     * Summary: 刷新用户登录态（线下环境使用）.
     *
     * @param RefreshUserTokenRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return RefreshUserTokenResponse
     */
    public function refreshUserTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefreshUserTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.user.token.refresh', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方会员免密登录token删除
     * Summary: 三方会员免密登录token删除.
     *
     * @param DeleteTrustloginTokenRequest $request
     *
     * @return DeleteTrustloginTokenResponse
     */
    public function deleteTrustloginToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTrustloginTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方会员免密登录token删除
     * Summary: 三方会员免密登录token删除.
     *
     * @param DeleteTrustloginTokenRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteTrustloginTokenResponse
     */
    public function deleteTrustloginTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTrustloginTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.acm.trustlogin.token.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
