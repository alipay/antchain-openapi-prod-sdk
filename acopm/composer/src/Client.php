<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ACOPM\Models\AddProductMemberRequest;
use AntChain\ACOPM\Models\AddProductMemberResponse;
use AntChain\ACOPM\Models\CallbackJiuzhouPlanRequest;
use AntChain\ACOPM\Models\CallbackJiuzhouPlanResponse;
use AntChain\ACOPM\Models\CallbackMultisdkRequest;
use AntChain\ACOPM\Models\CallbackMultisdkResponse;
use AntChain\ACOPM\Models\CreateBusinessruleOperateRequest;
use AntChain\ACOPM\Models\CreateBusinessruleOperateResponse;
use AntChain\ACOPM\Models\CreateProductRequest;
use AntChain\ACOPM\Models\CreateProductResponse;
use AntChain\ACOPM\Models\DeleteProductRequest;
use AntChain\ACOPM\Models\DeleteProductResponse;
use AntChain\ACOPM\Models\EnableBusinessruleOperateRequest;
use AntChain\ACOPM\Models\EnableBusinessruleOperateResponse;
use AntChain\ACOPM\Models\ExecRobotBaasplusRequest;
use AntChain\ACOPM\Models\ExecRobotBaasplusResponse;
use AntChain\ACOPM\Models\ExecRobotIntelligentRequest;
use AntChain\ACOPM\Models\ExecRobotIntelligentResponse;
use AntChain\ACOPM\Models\GetBusinessruleServicesRequest;
use AntChain\ACOPM\Models\GetBusinessruleServicesResponse;
use AntChain\ACOPM\Models\GetProductSaassdkRequest;
use AntChain\ACOPM\Models\GetProductSaassdkResponse;
use AntChain\ACOPM\Models\GetSdkRequest;
use AntChain\ACOPM\Models\GetSdkResponse;
use AntChain\ACOPM\Models\InitProductRequest;
use AntChain\ACOPM\Models\InitProductResponse;
use AntChain\ACOPM\Models\ListProductRequest;
use AntChain\ACOPM\Models\ListProductResponse;
use AntChain\ACOPM\Models\PublishProductSaassdkRequest;
use AntChain\ACOPM\Models\PublishProductSaassdkResponse;
use AntChain\ACOPM\Models\PublishProductSdkRequest;
use AntChain\ACOPM\Models\PublishProductSdkResponse;
use AntChain\ACOPM\Models\QueryApiDetailRequest;
use AntChain\ACOPM\Models\QueryApiDetailResponse;
use AntChain\ACOPM\Models\QueryApiOwnerRequest;
use AntChain\ACOPM\Models\QueryApiOwnerResponse;
use AntChain\ACOPM\Models\QueryApiRatelimitRequest;
use AntChain\ACOPM\Models\QueryApiRatelimitResponse;
use AntChain\ACOPM\Models\QueryBusinessruleMatchRequest;
use AntChain\ACOPM\Models\QueryBusinessruleMatchResponse;
use AntChain\ACOPM\Models\QueryBusinessruleServicesRequest;
use AntChain\ACOPM\Models\QueryBusinessruleServicesResponse;
use AntChain\ACOPM\Models\QuerySdkApiRequest;
use AntChain\ACOPM\Models\QuerySdkApiResponse;
use AntChain\ACOPM\Models\QueryTenantRatelimitRequest;
use AntChain\ACOPM\Models\QueryTenantRatelimitResponse;
use AntChain\ACOPM\Models\UpdateApiRatelimitRequest;
use AntChain\ACOPM\Models\UpdateApiRatelimitResponse;
use AntChain\ACOPM\Models\UpdateApisStatusRequest;
use AntChain\ACOPM\Models\UpdateApisStatusResponse;
use AntChain\ACOPM\Models\UpdateGwCacheRequest;
use AntChain\ACOPM\Models\UpdateGwCacheResponse;
use AntChain\ACOPM\Models\UpdateInstanceRequest;
use AntChain\ACOPM\Models\UpdateInstanceResponse;
use AntChain\ACOPM\Models\UpdateInstanceTenantRequest;
use AntChain\ACOPM\Models\UpdateInstanceTenantResponse;
use AntChain\ACOPM\Models\UpdateTenantRatelimitRequest;
use AntChain\ACOPM\Models\UpdateTenantRatelimitResponse;
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
            // RateLimitEffectScopeValueDTO
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
                    'sdk_version'      => '1.3.39',
                    '_prod_code'       => 'ACOPM',
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
     * Description: 获取产品列表
     * Summary: 获取产品列表.
     *
     * @param ListProductRequest $request
     *
     * @return ListProductResponse
     */
    public function listProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取产品列表
     * Summary: 获取产品列表.
     *
     * @param ListProductRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListProductResponse
     */
    public function listProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListProductResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云Tea多语言SDK生成回调
     * Summary: 阿里云Tea多语言SDK生成回调.
     *
     * @param CallbackMultisdkRequest $request
     *
     * @return CallbackMultisdkResponse
     */
    public function callbackMultisdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackMultisdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云Tea多语言SDK生成回调
     * Summary: 阿里云Tea多语言SDK生成回调.
     *
     * @param CallbackMultisdkRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CallbackMultisdkResponse
     */
    public function callbackMultisdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackMultisdkResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.multisdk.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建产品
     * Summary: 创建产品
     *
     * @param CreateProductRequest $request
     *
     * @return CreateProductResponse
     */
    public function createProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建产品
     * Summary: 创建产品
     *
     * @param CreateProductRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateProductResponse
     */
    public function createProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateProductResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api初始化
     * Summary: api初始化.
     *
     * @param InitProductRequest $request
     *
     * @return InitProductResponse
     */
    public function initProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initProductEx($request, $headers, $runtime);
    }

    /**
     * Description: api初始化
     * Summary: api初始化.
     *
     * @param InitProductRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return InitProductResponse
     */
    public function initProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitProductResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除产品
     * Summary: 删除产品
     *
     * @param DeleteProductRequest $request
     *
     * @return DeleteProductResponse
     */
    public function deleteProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除产品
     * Summary: 删除产品
     *
     * @param DeleteProductRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteProductResponse
     */
    public function deleteProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteProductResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布sdk
     * Summary: 发布sdk.
     *
     * @param PublishProductSdkRequest $request
     *
     * @return PublishProductSdkResponse
     */
    public function publishProductSdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishProductSdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布sdk
     * Summary: 发布sdk.
     *
     * @param PublishProductSdkRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PublishProductSdkResponse
     */
    public function publishProductSdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishProductSdkResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.sdk.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取sdk元数据snapshot
     * Summary: 获取sdk元数据snapshot.
     *
     * @param GetSdkRequest $request
     *
     * @return GetSdkResponse
     */
    public function getSdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取sdk元数据snapshot
     * Summary: 获取sdk元数据snapshot.
     *
     * @param GetSdkRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetSdkResponse
     */
    public function getSdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSdkResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.sdk.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布共享能力中心sdk
     * Summary: 共享能力中心sdk发布.
     *
     * @param PublishProductSaassdkRequest $request
     *
     * @return PublishProductSaassdkResponse
     */
    public function publishProductSaassdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishProductSaassdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布共享能力中心sdk
     * Summary: 共享能力中心sdk发布.
     *
     * @param PublishProductSaassdkRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PublishProductSaassdkResponse
     */
    public function publishProductSaassdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishProductSaassdkResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.saassdk.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力中心获取sdk打包结果
     * Summary: 共享能力中心获取sdk打包结果.
     *
     * @param GetProductSaassdkRequest $request
     *
     * @return GetProductSaassdkResponse
     */
    public function getProductSaassdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getProductSaassdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力中心获取sdk打包结果
     * Summary: 共享能力中心获取sdk打包结果.
     *
     * @param GetProductSaassdkRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetProductSaassdkResponse
     */
    public function getProductSaassdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetProductSaassdkResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.saassdk.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步产品成员权限
     * Summary: 同步产品成员权限.
     *
     * @param AddProductMemberRequest $request
     *
     * @return AddProductMemberResponse
     */
    public function addProductMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addProductMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步产品成员权限
     * Summary: 同步产品成员权限.
     *
     * @param AddProductMemberRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddProductMemberResponse
     */
    public function addProductMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddProductMemberResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.product.member.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询api限流信息
     * Summary: 查询api限流信息（api）.
     *
     * @param QueryApiRatelimitRequest $request
     *
     * @return QueryApiRatelimitResponse
     */
    public function queryApiRatelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiRatelimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询api限流信息
     * Summary: 查询api限流信息（api）.
     *
     * @param QueryApiRatelimitRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryApiRatelimitResponse
     */
    public function queryApiRatelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiRatelimitResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.api.ratelimit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  查询api限流信息
     * Summary:  查询api限流信息（租户维度）.
     *
     * @param QueryTenantRatelimitRequest $request
     *
     * @return QueryTenantRatelimitResponse
     */
    public function queryTenantRatelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTenantRatelimitEx($request, $headers, $runtime);
    }

    /**
     * Description:  查询api限流信息
     * Summary:  查询api限流信息（租户维度）.
     *
     * @param QueryTenantRatelimitRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTenantRatelimitResponse
     */
    public function queryTenantRatelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTenantRatelimitResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.tenant.ratelimit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（api维度）.
     *
     * @param UpdateApiRatelimitRequest $request
     *
     * @return UpdateApiRatelimitResponse
     */
    public function updateApiRatelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiRatelimitEx($request, $headers, $runtime);
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（api维度）.
     *
     * @param UpdateApiRatelimitRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateApiRatelimitResponse
     */
    public function updateApiRatelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiRatelimitResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.api.ratelimit.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（租户维度）.
     *
     * @param UpdateTenantRatelimitRequest $request
     *
     * @return UpdateTenantRatelimitResponse
     */
    public function updateTenantRatelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTenantRatelimitEx($request, $headers, $runtime);
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（租户维度）.
     *
     * @param UpdateTenantRatelimitRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateTenantRatelimitResponse
     */
    public function updateTenantRatelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTenantRatelimitResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.tenant.ratelimit.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 九州工单回调接口
     * Summary: 九州工单回调接口.
     *
     * @param CallbackJiuzhouPlanRequest $request
     *
     * @return CallbackJiuzhouPlanResponse
     */
    public function callbackJiuzhouPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackJiuzhouPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 九州工单回调接口
     * Summary: 九州工单回调接口.
     *
     * @param CallbackJiuzhouPlanRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CallbackJiuzhouPlanResponse
     */
    public function callbackJiuzhouPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackJiuzhouPlanResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.jiuzhou.plan.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能排障机器人接口
     * Summary: 排障机器人接口.
     *
     * @param ExecRobotIntelligentRequest $request
     *
     * @return ExecRobotIntelligentResponse
     */
    public function execRobotIntelligent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRobotIntelligentEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能排障机器人接口
     * Summary: 排障机器人接口.
     *
     * @param ExecRobotIntelligentRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecRobotIntelligentResponse
     */
    public function execRobotIntelligentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRobotIntelligentResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.robot.intelligent.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生产环境api状态更新
     * Summary: 生产环境api状态更新.
     *
     * @param UpdateApisStatusRequest $request
     *
     * @return UpdateApisStatusResponse
     */
    public function updateApisStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApisStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 生产环境api状态更新
     * Summary: 生产环境api状态更新.
     *
     * @param UpdateApisStatusRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateApisStatusResponse
     */
    public function updateApisStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApisStatusResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.apis.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商业产品sdk版本api信息
     * Summary: 查询商业产品sdk版本api信息.
     *
     * @param QuerySdkApiRequest $request
     *
     * @return QuerySdkApiResponse
     */
    public function querySdkApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySdkApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商业产品sdk版本api信息
     * Summary: 查询商业产品sdk版本api信息.
     *
     * @param QuerySdkApiRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QuerySdkApiResponse
     */
    public function querySdkApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySdkApiResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.sdk.api.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证排障
     * Summary: 企业认证排障.
     *
     * @param ExecRobotBaasplusRequest $request
     *
     * @return ExecRobotBaasplusResponse
     */
    public function execRobotBaasplus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRobotBaasplusEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证排障
     * Summary: 企业认证排障.
     *
     * @param ExecRobotBaasplusRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecRobotBaasplusResponse
     */
    public function execRobotBaasplusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRobotBaasplusResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.robot.baasplus.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api数据获取
     * Summary: api数据获取.
     *
     * @param QueryApiDetailRequest $request
     *
     * @return QueryApiDetailResponse
     */
    public function queryApiDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: api数据获取
     * Summary: api数据获取.
     *
     * @param QueryApiDetailRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryApiDetailResponse
     */
    public function queryApiDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiDetailResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.api.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询api负责人信息
     * Summary: 查询api负责人信息.
     *
     * @param QueryApiOwnerRequest $request
     *
     * @return QueryApiOwnerResponse
     */
    public function queryApiOwner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiOwnerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询api负责人信息
     * Summary: 查询api负责人信息.
     *
     * @param QueryApiOwnerRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryApiOwnerResponse
     */
    public function queryApiOwnerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiOwnerResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.api.owner.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 请求刷新gw的缓存
     * Summary: 网关运行态gw cache刷新.
     *
     * @param UpdateGwCacheRequest $request
     *
     * @return UpdateGwCacheResponse
     */
    public function updateGwCache($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGwCacheEx($request, $headers, $runtime);
    }

    /**
     * Description: 请求刷新gw的缓存
     * Summary: 网关运行态gw cache刷新.
     *
     * @param UpdateGwCacheRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateGwCacheResponse
     */
    public function updateGwCacheEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGwCacheResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.gw.cache.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商业化规则创建
     * Summary: 商业化规则创建.
     *
     * @param CreateBusinessruleOperateRequest $request
     *
     * @return CreateBusinessruleOperateResponse
     */
    public function createBusinessruleOperate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBusinessruleOperateEx($request, $headers, $runtime);
    }

    /**
     * Description: 商业化规则创建
     * Summary: 商业化规则创建.
     *
     * @param CreateBusinessruleOperateRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateBusinessruleOperateResponse
     */
    public function createBusinessruleOperateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBusinessruleOperateResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.businessrule.operate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生效商业化规则
     * Summary: 生效商业化规则.
     *
     * @param EnableBusinessruleOperateRequest $request
     *
     * @return EnableBusinessruleOperateResponse
     */
    public function enableBusinessruleOperate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableBusinessruleOperateEx($request, $headers, $runtime);
    }

    /**
     * Description: 生效商业化规则
     * Summary: 生效商业化规则.
     *
     * @param EnableBusinessruleOperateRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return EnableBusinessruleOperateResponse
     */
    public function enableBusinessruleOperateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableBusinessruleOperateResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.businessrule.operate.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询规则匹配情况
     * Summary: 查询规则匹配情况.
     *
     * @param QueryBusinessruleMatchRequest $request
     *
     * @return QueryBusinessruleMatchResponse
     */
    public function queryBusinessruleMatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBusinessruleMatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询规则匹配情况
     * Summary: 查询规则匹配情况.
     *
     * @param QueryBusinessruleMatchRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryBusinessruleMatchResponse
     */
    public function queryBusinessruleMatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBusinessruleMatchResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.businessrule.match.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前登录人有权限的服务列表
     * Summary: 查询当前登录人有权限的服务列表.
     *
     * @param QueryBusinessruleServicesRequest $request
     *
     * @return QueryBusinessruleServicesResponse
     */
    public function queryBusinessruleServices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBusinessruleServicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前登录人有权限的服务列表
     * Summary: 查询当前登录人有权限的服务列表.
     *
     * @param QueryBusinessruleServicesRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryBusinessruleServicesResponse
     */
    public function queryBusinessruleServicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBusinessruleServicesResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.businessrule.services.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询单个服务的参数/返回等元信息
     * Summary: 查询单个服务的参数/返回等元信息.
     *
     * @param GetBusinessruleServicesRequest $request
     *
     * @return GetBusinessruleServicesResponse
     */
    public function getBusinessruleServices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getBusinessruleServicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询单个服务的参数/返回等元信息
     * Summary: 查询单个服务的参数/返回等元信息.
     *
     * @param GetBusinessruleServicesRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetBusinessruleServicesResponse
     */
    public function getBusinessruleServicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetBusinessruleServicesResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.businessrule.services.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实例更新
     * Summary: 实例更新.
     *
     * @param UpdateInstanceRequest $request
     *
     * @return UpdateInstanceResponse
     */
    public function updateInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 实例更新
     * Summary: 实例更新.
     *
     * @param UpdateInstanceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateInstanceResponse
     */
    public function updateInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInstanceResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.instance.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户实例更新
     * Summary: 租户实例更新.
     *
     * @param UpdateInstanceTenantRequest $request
     *
     * @return UpdateInstanceTenantResponse
     */
    public function updateInstanceTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInstanceTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 租户实例更新
     * Summary: 租户实例更新.
     *
     * @param UpdateInstanceTenantRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateInstanceTenantResponse
     */
    public function updateInstanceTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInstanceTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.acopm.instance.tenant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
