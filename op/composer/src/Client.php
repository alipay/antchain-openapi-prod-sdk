<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\OP\Models\CreateApiserviceGroupRequest;
use AntChain\OP\Models\CreateApiserviceGroupResponse;
use AntChain\OP\Models\CreateApiserviceProductRequest;
use AntChain\OP\Models\CreateApiserviceProductResponse;
use AntChain\OP\Models\CreateApiserviceSuiteRequest;
use AntChain\OP\Models\CreateApiserviceSuiteResponse;
use AntChain\OP\Models\CreateGatewayStaticrouterRequest;
use AntChain\OP\Models\CreateGatewayStaticrouterResponse;
use AntChain\OP\Models\ExportSpecRequest;
use AntChain\OP\Models\ExportSpecResponse;
use AntChain\OP\Models\GetProviderRequest;
use AntChain\OP\Models\GetProviderResponse;
use AntChain\OP\Models\ImportApiserviceRequest;
use AntChain\OP\Models\ImportApiserviceResponse;
use AntChain\OP\Models\ImportChannelapiRequest;
use AntChain\OP\Models\ImportChannelapiResponse;
use AntChain\OP\Models\ImportGatewaySpecRequest;
use AntChain\OP\Models\ImportGatewaySpecResponse;
use AntChain\OP\Models\ImportSdkRequest;
use AntChain\OP\Models\ImportSdkResponse;
use AntChain\OP\Models\ImportSpecRequest;
use AntChain\OP\Models\ImportSpecResponse;
use AntChain\OP\Models\QueryApiserviceRequest;
use AntChain\OP\Models\QueryApiserviceResponse;
use AntChain\OP\Models\QueryGatewayClusterhostRequest;
use AntChain\OP\Models\QueryGatewayClusterhostResponse;
use AntChain\OP\Models\ServiceGatewayCheckRequest;
use AntChain\OP\Models\ServiceGatewayCheckResponse;
use AntChain\OP\Models\UpdateGatewayClusterhostRequest;
use AntChain\OP\Models\UpdateGatewayClusterhostResponse;
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
            // 数组元素类型
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
                    'sdk_version'      => '3.2.3',
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
     * Description: 查询api详情
     * Summary: 查询api.
     *
     * @param QueryApiserviceRequest $request
     *
     * @return QueryApiserviceResponse
     */
    public function queryApiservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询api详情
     * Summary: 查询api.
     *
     * @param QueryApiserviceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryApiserviceResponse
     */
    public function queryApiserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.apiservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入api信息
     * Summary: 导入api信息.
     *
     * @param ImportApiserviceRequest $request
     *
     * @return ImportApiserviceResponse
     */
    public function importApiservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importApiserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入api信息
     * Summary: 导入api信息.
     *
     * @param ImportApiserviceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportApiserviceResponse
     */
    public function importApiserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportApiserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.apiservice.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用apicore创建产品
     * Summary: 创建产品
     *
     * @param CreateApiserviceProductRequest $request
     *
     * @return CreateApiserviceProductResponse
     */
    public function createApiserviceProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApiserviceProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用apicore创建产品
     * Summary: 创建产品
     *
     * @param CreateApiserviceProductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateApiserviceProductResponse
     */
    public function createApiserviceProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApiserviceProductResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.apiservice.product.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建分组
     * Summary: 创建分组.
     *
     * @param CreateApiserviceGroupRequest $request
     *
     * @return CreateApiserviceGroupResponse
     */
    public function createApiserviceGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApiserviceGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建分组
     * Summary: 创建分组.
     *
     * @param CreateApiserviceGroupRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateApiserviceGroupResponse
     */
    public function createApiserviceGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApiserviceGroupResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.apiservice.group.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建suite
     * Summary: 创建suite.
     *
     * @param CreateApiserviceSuiteRequest $request
     *
     * @return CreateApiserviceSuiteResponse
     */
    public function createApiserviceSuite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApiserviceSuiteEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建suite
     * Summary: 创建suite.
     *
     * @param CreateApiserviceSuiteRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateApiserviceSuiteResponse
     */
    public function createApiserviceSuiteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApiserviceSuiteResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.apiservice.suite.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置.
     *
     * @param ImportSpecRequest $request
     *
     * @return ImportSpecResponse
     */
    public function importSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置.
     *
     * @param ImportSpecRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ImportSpecResponse
     */
    public function importSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.spec.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导出Spec
     * Summary: 导出Spec.
     *
     * @param ExportSpecRequest $request
     *
     * @return ExportSpecResponse
     */
    public function exportSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 导出Spec
     * Summary: 导出Spec.
     *
     * @param ExportSpecRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ExportSpecResponse
     */
    public function exportSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.spec.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取OpenAPI提供方详情
     * Summary: 获取OpenAPI提供方详情.
     *
     * @param GetProviderRequest $request
     *
     * @return GetProviderResponse
     */
    public function getProvider($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getProviderEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取OpenAPI提供方详情
     * Summary: 获取OpenAPI提供方详情.
     *
     * @param GetProviderRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetProviderResponse
     */
    public function getProviderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetProviderResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.provider.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 渠道API导入
     * Summary: 渠道API导入.
     *
     * @param ImportChannelapiRequest $request
     *
     * @return ImportChannelapiResponse
     */
    public function importChannelapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importChannelapiEx($request, $headers, $runtime);
    }

    /**
     * Description: 渠道API导入
     * Summary: 渠道API导入.
     *
     * @param ImportChannelapiRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportChannelapiResponse
     */
    public function importChannelapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportChannelapiResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.channelapi.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检测金融云网关目前的健康状态
     * Summary: 网关健康检查1.
     *
     * @param ServiceGatewayCheckRequest $request
     *
     * @return ServiceGatewayCheckResponse
     */
    public function serviceGatewayCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->serviceGatewayCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 检测金融云网关目前的健康状态
     * Summary: 网关健康检查1.
     *
     * @param ServiceGatewayCheckRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ServiceGatewayCheckResponse
     */
    public function serviceGatewayCheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ServiceGatewayCheckResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.gateway.check.service', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置.
     *
     * @param ImportGatewaySpecRequest $request
     *
     * @return ImportGatewaySpecResponse
     */
    public function importGatewaySpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importGatewaySpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过XML Spec形式导入产品的API配置
     * Summary: 导入API配置.
     *
     * @param ImportGatewaySpecRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ImportGatewaySpecResponse
     */
    public function importGatewaySpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportGatewaySpecResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.gateway.spec.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新集群路由host
     * Summary: 更新集群路由host.
     *
     * @param UpdateGatewayClusterhostRequest $request
     *
     * @return UpdateGatewayClusterhostResponse
     */
    public function updateGatewayClusterhost($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGatewayClusterhostEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新集群路由host
     * Summary: 更新集群路由host.
     *
     * @param UpdateGatewayClusterhostRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateGatewayClusterhostResponse
     */
    public function updateGatewayClusterhostEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGatewayClusterhostResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.gateway.clusterhost.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建静态路由
     * Summary: 创建静态路由.
     *
     * @param CreateGatewayStaticrouterRequest $request
     *
     * @return CreateGatewayStaticrouterResponse
     */
    public function createGatewayStaticrouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createGatewayStaticrouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建静态路由
     * Summary: 创建静态路由.
     *
     * @param CreateGatewayStaticrouterRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateGatewayStaticrouterResponse
     */
    public function createGatewayStaticrouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateGatewayStaticrouterResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.gateway.staticrouter.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询集群路由host
     * Summary: 查询集群路由host.
     *
     * @param QueryGatewayClusterhostRequest $request
     *
     * @return QueryGatewayClusterhostResponse
     */
    public function queryGatewayClusterhost($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayClusterhostEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询集群路由host
     * Summary: 查询集群路由host.
     *
     * @param QueryGatewayClusterhostRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryGatewayClusterhostResponse
     */
    public function queryGatewayClusterhostEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayClusterhostResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.gateway.clusterhost.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入SDK信息
     * Summary: 导入SDK信息.
     *
     * @param ImportSdkRequest $request
     *
     * @return ImportSdkResponse
     */
    public function importSdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importSdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入SDK信息
     * Summary: 导入SDK信息.
     *
     * @param ImportSdkRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return ImportSdkResponse
     */
    public function importSdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportSdkResponse::fromMap($this->doRequest('1.0', 'antcloud.openapi.sdk.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
