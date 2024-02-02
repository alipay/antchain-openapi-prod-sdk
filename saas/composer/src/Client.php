<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\SAAS\Models\BindAbilityApiRequest;
use AntChain\SAAS\Models\BindAbilityApiResponse;
use AntChain\SAAS\Models\BindAbilityRequest;
use AntChain\SAAS\Models\BindAbilityResponse;
use AntChain\SAAS\Models\CallbackAbilityRequest;
use AntChain\SAAS\Models\CallbackAbilityResponse;
use AntChain\SAAS\Models\CreateMeteringItemRequest;
use AntChain\SAAS\Models\CreateMeteringItemResponse;
use AntChain\SAAS\Models\CreateMeteringRuleRequest;
use AntChain\SAAS\Models\CreateMeteringRuleResponse;
use AntChain\SAAS\Models\PagequeryAbilityRequest;
use AntChain\SAAS\Models\PagequeryAbilityResponse;
use AntChain\SAAS\Models\QueryAbilityBusinesscodeRequest;
use AntChain\SAAS\Models\QueryAbilityBusinesscodeResponse;
use AntChain\SAAS\Models\QueryAbilityResultcodeRequest;
use AntChain\SAAS\Models\QueryAbilityResultcodeResponse;
use AntChain\SAAS\Models\QueryAbilityWithapinameRequest;
use AntChain\SAAS\Models\QueryAbilityWithapinameResponse;
use AntChain\SAAS\Models\QueryAbilityWithproductRequest;
use AntChain\SAAS\Models\QueryAbilityWithproductResponse;
use AntChain\SAAS\Models\QueryBusinessProductRequest;
use AntChain\SAAS\Models\QueryBusinessProductResponse;
use AntChain\SAAS\Models\QueryFoundationProtobufRequest;
use AntChain\SAAS\Models\QueryFoundationProtobufResponse;
use AntChain\SAAS\Models\QueryMarketSolutionRequest;
use AntChain\SAAS\Models\QueryMarketSolutionResponse;
use AntChain\SAAS\Models\QueryMeteringItemRequest;
use AntChain\SAAS\Models\QueryMeteringItemResponse;
use AntChain\SAAS\Models\QueryMeteringRuleRequest;
use AntChain\SAAS\Models\QueryMeteringRuleResponse;
use AntChain\SAAS\Models\RunMarketServiceRequest;
use AntChain\SAAS\Models\RunMarketServiceResponse;
use AntChain\SAAS\Models\UpdateMeteringItemRequest;
use AntChain\SAAS\Models\UpdateMeteringItemResponse;
use AntChain\SAAS\Models\UpdateMeteringRuleRequest;
use AntChain\SAAS\Models\UpdateMeteringRuleResponse;
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
            // api信息结构体
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
                    'sdk_version'      => '1.1.29',
                    '_prod_code'       => 'SAAS',
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
     * Description: SaaS服务调用
     * Summary: SaaS服务调用.
     *
     * @param RunMarketServiceRequest $request
     *
     * @return RunMarketServiceResponse
     */
    public function runMarketService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runMarketServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: SaaS服务调用
     * Summary: SaaS服务调用.
     *
     * @param RunMarketServiceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return RunMarketServiceResponse
     */
    public function runMarketServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunMarketServiceResponse::fromMap($this->doRequest('1.0', 'antchain.saas.market.service.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询解决方案，包括能力列表
     * Summary: 查询解决方案，包括能力列表.
     *
     * @param QueryMarketSolutionRequest $request
     *
     * @return QueryMarketSolutionResponse
     */
    public function queryMarketSolution($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMarketSolutionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询解决方案，包括能力列表
     * Summary: 查询解决方案，包括能力列表.
     *
     * @param QueryMarketSolutionRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryMarketSolutionResponse
     */
    public function queryMarketSolutionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMarketSolutionResponse::fromMap($this->doRequest('1.0', 'antchain.saas.market.solution.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询本产品下所有的能力标签
     * Summary: 查询本产品下所有的能力标签.
     *
     * @param QueryAbilityWithproductRequest $request
     *
     * @return QueryAbilityWithproductResponse
     */
    public function queryAbilityWithproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbilityWithproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询本产品下所有的能力标签
     * Summary: 查询本产品下所有的能力标签.
     *
     * @param QueryAbilityWithproductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryAbilityWithproductResponse
     */
    public function queryAbilityWithproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbilityWithproductResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.withproduct.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询能力数据
     * Summary: 分页查询能力数据.
     *
     * @param PagequeryAbilityRequest $request
     *
     * @return PagequeryAbilityResponse
     */
    public function pagequeryAbility($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryAbilityEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询能力数据
     * Summary: 分页查询能力数据.
     *
     * @param PagequeryAbilityRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return PagequeryAbilityResponse
     */
    public function pagequeryAbilityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryAbilityResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定API
     * Summary: 绑定能力与API关系.
     *
     * @param BindAbilityRequest $request
     *
     * @return BindAbilityResponse
     */
    public function bindAbility($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindAbilityEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定API
     * Summary: 绑定能力与API关系.
     *
     * @param BindAbilityRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return BindAbilityResponse
     */
    public function bindAbilityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindAbilityResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据api名称列表查询能力标签列表
     * Summary: 根据api名称列表查询能力标签列表.
     *
     * @param QueryAbilityWithapinameRequest $request
     *
     * @return QueryAbilityWithapinameResponse
     */
    public function queryAbilityWithapiname($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbilityWithapinameEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据api名称列表查询能力标签列表
     * Summary: 根据api名称列表查询能力标签列表.
     *
     * @param QueryAbilityWithapinameRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryAbilityWithapinameResponse
     */
    public function queryAbilityWithapinameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbilityWithapinameResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.withapiname.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api上线回调接口
     * Summary: api上线回调接口.
     *
     * @param CallbackAbilityRequest $request
     *
     * @return CallbackAbilityResponse
     */
    public function callbackAbility($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackAbilityEx($request, $headers, $runtime);
    }

    /**
     * Description: api上线回调接口
     * Summary: api上线回调接口.
     *
     * @param CallbackAbilityRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CallbackAbilityResponse
     */
    public function callbackAbilityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackAbilityResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据产品码+api code查询api protobuf信息
     * Summary: 查询api protobuf信息（勿删）.
     *
     * @param QueryFoundationProtobufRequest $request
     *
     * @return QueryFoundationProtobufResponse
     */
    public function queryFoundationProtobuf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFoundationProtobufEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据产品码+api code查询api protobuf信息
     * Summary: 查询api protobuf信息（勿删）.
     *
     * @param QueryFoundationProtobufRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryFoundationProtobufResponse
     */
    public function queryFoundationProtobufEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFoundationProtobufResponse::fromMap($this->doRequest('1.0', 'antchain.saas.foundation.protobuf.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试网关结果码和计量接口
     * Summary: 网关结果码测试接口.
     *
     * @param QueryAbilityResultcodeRequest $request
     *
     * @return QueryAbilityResultcodeResponse
     */
    public function queryAbilityResultcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbilityResultcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试网关结果码和计量接口
     * Summary: 网关结果码测试接口.
     *
     * @param QueryAbilityResultcodeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryAbilityResultcodeResponse
     */
    public function queryAbilityResultcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbilityResultcodeResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.resultcode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定能力的api信息
     * Summary: 绑定能力的api信息.
     *
     * @param BindAbilityApiRequest $request
     *
     * @return BindAbilityApiResponse
     */
    public function bindAbilityApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindAbilityApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定能力的api信息
     * Summary: 绑定能力的api信息.
     *
     * @param BindAbilityApiRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return BindAbilityApiResponse
     */
    public function bindAbilityApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindAbilityApiResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.api.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据能力id查询能力信息
     * Summary: 根据能力id查询能力信息.
     *
     * @param QueryAbilityBusinesscodeRequest $request
     *
     * @return QueryAbilityBusinesscodeResponse
     */
    public function queryAbilityBusinesscode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbilityBusinesscodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据能力id查询能力信息
     * Summary: 根据能力id查询能力信息.
     *
     * @param QueryAbilityBusinesscodeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryAbilityBusinesscodeResponse
     */
    public function queryAbilityBusinesscodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbilityBusinesscodeResponse::fromMap($this->doRequest('1.0', 'antchain.saas.ability.businesscode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据商业编码查询sdk依赖和api信息
     * Summary: 根据商业编码查询sdk依赖和api信息.
     *
     * @param QueryBusinessProductRequest $request
     *
     * @return QueryBusinessProductResponse
     */
    public function queryBusinessProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBusinessProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据商业编码查询sdk依赖和api信息
     * Summary: 根据商业编码查询sdk依赖和api信息.
     *
     * @param QueryBusinessProductRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryBusinessProductResponse
     */
    public function queryBusinessProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBusinessProductResponse::fromMap($this->doRequest('1.0', 'antchain.saas.business.product.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询计量规则信息
     * Summary: 查询计量规则信息.
     *
     * @param QueryMeteringRuleRequest $request
     *
     * @return QueryMeteringRuleResponse
     */
    public function queryMeteringRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeteringRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询计量规则信息
     * Summary: 查询计量规则信息.
     *
     * @param QueryMeteringRuleRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryMeteringRuleResponse
     */
    public function queryMeteringRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeteringRuleResponse::fromMap($this->doRequest('1.0', 'antchain.saas.metering.rule.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建计量规则
     * Summary: 创建计量规则.
     *
     * @param CreateMeteringRuleRequest $request
     *
     * @return CreateMeteringRuleResponse
     */
    public function createMeteringRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMeteringRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建计量规则
     * Summary: 创建计量规则.
     *
     * @param CreateMeteringRuleRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateMeteringRuleResponse
     */
    public function createMeteringRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMeteringRuleResponse::fromMap($this->doRequest('1.0', 'antchain.saas.metering.rule.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新计量规则信息
     * Summary: 更新计量规则信息.
     *
     * @param UpdateMeteringRuleRequest $request
     *
     * @return UpdateMeteringRuleResponse
     */
    public function updateMeteringRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeteringRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新计量规则信息
     * Summary: 更新计量规则信息.
     *
     * @param UpdateMeteringRuleRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateMeteringRuleResponse
     */
    public function updateMeteringRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeteringRuleResponse::fromMap($this->doRequest('1.0', 'antchain.saas.metering.rule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询计量项信息
     * Summary: 查询计量项信息.
     *
     * @param QueryMeteringItemRequest $request
     *
     * @return QueryMeteringItemResponse
     */
    public function queryMeteringItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeteringItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询计量项信息
     * Summary: 查询计量项信息.
     *
     * @param QueryMeteringItemRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryMeteringItemResponse
     */
    public function queryMeteringItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeteringItemResponse::fromMap($this->doRequest('1.0', 'antchain.saas.metering.item.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增计量项
     * Summary: 新增计量项.
     *
     * @param CreateMeteringItemRequest $request
     *
     * @return CreateMeteringItemResponse
     */
    public function createMeteringItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMeteringItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增计量项
     * Summary: 新增计量项.
     *
     * @param CreateMeteringItemRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateMeteringItemResponse
     */
    public function createMeteringItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMeteringItemResponse::fromMap($this->doRequest('1.0', 'antchain.saas.metering.item.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新计量规则
     * Summary: 更新计量规则.
     *
     * @param UpdateMeteringItemRequest $request
     *
     * @return UpdateMeteringItemResponse
     */
    public function updateMeteringItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeteringItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新计量规则
     * Summary: 更新计量规则.
     *
     * @param UpdateMeteringItemRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateMeteringItemResponse
     */
    public function updateMeteringItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeteringItemResponse::fromMap($this->doRequest('1.0', 'antchain.saas.metering.item.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
