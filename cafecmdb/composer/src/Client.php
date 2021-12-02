<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CAFECMDB\Models\CreateAttributegroupRequest;
use AntChain\CAFECMDB\Models\CreateAttributegroupResponse;
use AntChain\CAFECMDB\Models\CreateItemRequest;
use AntChain\CAFECMDB\Models\CreateItemResponse;
use AntChain\CAFECMDB\Models\CreateModelAttributeRequest;
use AntChain\CAFECMDB\Models\CreateModelAttributeResponse;
use AntChain\CAFECMDB\Models\CreateModelcategoryRequest;
use AntChain\CAFECMDB\Models\CreateModelcategoryResponse;
use AntChain\CAFECMDB\Models\CreateModelrelationshipRequest;
use AntChain\CAFECMDB\Models\CreateModelrelationshipResponse;
use AntChain\CAFECMDB\Models\CreateModelRequest;
use AntChain\CAFECMDB\Models\CreateModelResponse;
use AntChain\CAFECMDB\Models\DeleteAttributegroupRequest;
use AntChain\CAFECMDB\Models\DeleteAttributegroupResponse;
use AntChain\CAFECMDB\Models\DeleteItemRequest;
use AntChain\CAFECMDB\Models\DeleteItemResponse;
use AntChain\CAFECMDB\Models\DeleteModelAttributeRequest;
use AntChain\CAFECMDB\Models\DeleteModelAttributeResponse;
use AntChain\CAFECMDB\Models\DeleteModelcategoryRequest;
use AntChain\CAFECMDB\Models\DeleteModelcategoryResponse;
use AntChain\CAFECMDB\Models\DeleteModelrelationshipRequest;
use AntChain\CAFECMDB\Models\DeleteModelrelationshipResponse;
use AntChain\CAFECMDB\Models\DeleteModelRequest;
use AntChain\CAFECMDB\Models\DeleteModelResponse;
use AntChain\CAFECMDB\Models\ExistItemIdRequest;
use AntChain\CAFECMDB\Models\ExistItemIdResponse;
use AntChain\CAFECMDB\Models\ExportItemRequest;
use AntChain\CAFECMDB\Models\ExportItemResponse;
use AntChain\CAFECMDB\Models\GetItemRequest;
use AntChain\CAFECMDB\Models\GetItemResponse;
use AntChain\CAFECMDB\Models\GetModelAttributeRequest;
use AntChain\CAFECMDB\Models\GetModelAttributeResponse;
use AntChain\CAFECMDB\Models\GetModelcategoryRequest;
use AntChain\CAFECMDB\Models\GetModelcategoryResponse;
use AntChain\CAFECMDB\Models\GetModelrelationshipRequest;
use AntChain\CAFECMDB\Models\GetModelrelationshipResponse;
use AntChain\CAFECMDB\Models\GetModelRequest;
use AntChain\CAFECMDB\Models\GetModelResponse;
use AntChain\CAFECMDB\Models\ImportItemRequest;
use AntChain\CAFECMDB\Models\ImportItemResponse;
use AntChain\CAFECMDB\Models\PullParamRequest;
use AntChain\CAFECMDB\Models\PullParamResponse;
use AntChain\CAFECMDB\Models\PushParamRequest;
use AntChain\CAFECMDB\Models\PushParamResponse;
use AntChain\CAFECMDB\Models\QueryAttributegroupRequest;
use AntChain\CAFECMDB\Models\QueryAttributegroupResponse;
use AntChain\CAFECMDB\Models\QueryAuditlogRequest;
use AntChain\CAFECMDB\Models\QueryAuditlogResponse;
use AntChain\CAFECMDB\Models\QueryItemRelationsRequest;
use AntChain\CAFECMDB\Models\QueryItemRelationsResponse;
use AntChain\CAFECMDB\Models\QueryItemRequest;
use AntChain\CAFECMDB\Models\QueryItemResponse;
use AntChain\CAFECMDB\Models\QueryModelAttributeRequest;
use AntChain\CAFECMDB\Models\QueryModelAttributeResponse;
use AntChain\CAFECMDB\Models\QueryModelcategoryRequest;
use AntChain\CAFECMDB\Models\QueryModelcategoryResponse;
use AntChain\CAFECMDB\Models\QueryModelrelationshipRequest;
use AntChain\CAFECMDB\Models\QueryModelrelationshipResponse;
use AntChain\CAFECMDB\Models\QueryModelRequest;
use AntChain\CAFECMDB\Models\QueryModelResponse;
use AntChain\CAFECMDB\Models\UpdateAttributegroupRequest;
use AntChain\CAFECMDB\Models\UpdateAttributegroupResponse;
use AntChain\CAFECMDB\Models\UpdateItemRequest;
use AntChain\CAFECMDB\Models\UpdateItemResponse;
use AntChain\CAFECMDB\Models\UpdateModelAttributeRequest;
use AntChain\CAFECMDB\Models\UpdateModelAttributeResponse;
use AntChain\CAFECMDB\Models\UpdateModelcategoryRequest;
use AntChain\CAFECMDB\Models\UpdateModelcategoryResponse;
use AntChain\CAFECMDB\Models\UpdateModelrelationshipRequest;
use AntChain\CAFECMDB\Models\UpdateModelrelationshipResponse;
use AntChain\CAFECMDB\Models\UpdateModelRequest;
use AntChain\CAFECMDB\Models\UpdateModelResponse;
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
            // 由于OP不支持MAP对象，此对象用来模拟Map中的Entry
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
                    'sdk_version'      => '1.0.27',
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
     * Description: 查询资源
     * Summary: 查询资源.
     *
     * @param QueryItemRequest $request
     *
     * @return QueryItemResponse
     */
    public function queryItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询资源
     * Summary: 查询资源.
     *
     * @param QueryItemRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryItemResponse
     */
    public function queryItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryItemResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建资源
     * Summary: 创建资源.
     *
     * @param CreateItemRequest $request
     *
     * @return CreateItemResponse
     */
    public function createItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建资源
     * Summary: 创建资源.
     *
     * @param CreateItemRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateItemResponse
     */
    public function createItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateItemResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
     * Summary: 更新资源属性.
     *
     * @param UpdateItemRequest $request
     *
     * @return UpdateItemResponse
     */
    public function updateItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
     * Summary: 更新资源属性.
     *
     * @param UpdateItemRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UpdateItemResponse
     */
    public function updateItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateItemResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个资源
     * Summary: 删除单个资源.
     *
     * @param DeleteItemRequest $request
     *
     * @return DeleteItemResponse
     */
    public function deleteItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个资源
     * Summary: 删除单个资源.
     *
     * @param DeleteItemRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DeleteItemResponse
     */
    public function deleteItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteItemResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个Item的详细信息
     * Summary: 获取单个Item的详细信息.
     *
     * @param GetItemRequest $request
     *
     * @return GetItemResponse
     */
    public function getItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个Item的详细信息
     * Summary: 获取单个Item的详细信息.
     *
     * @param GetItemRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetItemResponse
     */
    public function getItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetItemResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个模型
     * Summary: 获取单个模型.
     *
     * @param GetModelRequest $request
     *
     * @return GetModelResponse
     */
    public function getModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个模型
     * Summary: 获取单个模型.
     *
     * @param GetModelRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetModelResponse
     */
    public function getModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetModelResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询模型
     * Summary: 查询模型.
     *
     * @param QueryModelRequest $request
     *
     * @return QueryModelResponse
     */
    public function queryModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询模型
     * Summary: 查询模型.
     *
     * @param QueryModelRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryModelResponse
     */
    public function queryModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建模型
     * Summary: 创建模型.
     *
     * @param CreateModelRequest $request
     *
     * @return CreateModelResponse
     */
    public function createModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建模型
     * Summary: 创建模型.
     *
     * @param CreateModelRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateModelResponse
     */
    public function createModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateModelResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型.
     *
     * @param UpdateModelRequest $request
     *
     * @return UpdateModelResponse
     */
    public function updateModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型.
     *
     * @param UpdateModelRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UpdateModelResponse
     */
    public function updateModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateModelResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个模型分组
     * Summary: 获取单个模型分组.
     *
     * @param GetModelcategoryRequest $request
     *
     * @return GetModelcategoryResponse
     */
    public function getModelcategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getModelcategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个模型分组
     * Summary: 获取单个模型分组.
     *
     * @param GetModelcategoryRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetModelcategoryResponse
     */
    public function getModelcategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetModelcategoryResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelcategory.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除模型
     * Summary: 删除模型.
     *
     * @param DeleteModelRequest $request
     *
     * @return DeleteModelResponse
     */
    public function deleteModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除模型
     * Summary: 删除模型.
     *
     * @param DeleteModelRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return DeleteModelResponse
     */
    public function deleteModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteModelResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询模型分组
     * Summary: 查询模型分组.
     *
     * @param QueryModelcategoryRequest $request
     *
     * @return QueryModelcategoryResponse
     */
    public function queryModelcategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelcategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询模型分组
     * Summary: 查询模型分组.
     *
     * @param QueryModelcategoryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryModelcategoryResponse
     */
    public function queryModelcategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelcategoryResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelcategory.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建模型分组
     * Summary: 创建模型分组.
     *
     * @param CreateModelcategoryRequest $request
     *
     * @return CreateModelcategoryResponse
     */
    public function createModelcategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createModelcategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建模型分组
     * Summary: 创建模型分组.
     *
     * @param CreateModelcategoryRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateModelcategoryResponse
     */
    public function createModelcategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateModelcategoryResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelcategory.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新模型分组
     * Summary: 更新模型分组.
     *
     * @param UpdateModelcategoryRequest $request
     *
     * @return UpdateModelcategoryResponse
     */
    public function updateModelcategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateModelcategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新模型分组
     * Summary: 更新模型分组.
     *
     * @param UpdateModelcategoryRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateModelcategoryResponse
     */
    public function updateModelcategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateModelcategoryResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelcategory.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除模型分组
     * Summary: 删除模型分组.
     *
     * @param DeleteModelcategoryRequest $request
     *
     * @return DeleteModelcategoryResponse
     */
    public function deleteModelcategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteModelcategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除模型分组
     * Summary: 删除模型分组.
     *
     * @param DeleteModelcategoryRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteModelcategoryResponse
     */
    public function deleteModelcategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteModelcategoryResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelcategory.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个模型字段
     * Summary: 获取单个模型字段.
     *
     * @param GetModelAttributeRequest $request
     *
     * @return GetModelAttributeResponse
     */
    public function getModelAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getModelAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个模型字段
     * Summary: 获取单个模型字段.
     *
     * @param GetModelAttributeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetModelAttributeResponse
     */
    public function getModelAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetModelAttributeResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.attribute.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询模型字段
     * Summary: 查询模型字段.
     *
     * @param QueryModelAttributeRequest $request
     *
     * @return QueryModelAttributeResponse
     */
    public function queryModelAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询模型字段
     * Summary: 查询模型字段.
     *
     * @param QueryModelAttributeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryModelAttributeResponse
     */
    public function queryModelAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelAttributeResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.attribute.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建模型字段
     * Summary: 创建模型字段.
     *
     * @param CreateModelAttributeRequest $request
     *
     * @return CreateModelAttributeResponse
     */
    public function createModelAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createModelAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建模型字段
     * Summary: 创建模型字段.
     *
     * @param CreateModelAttributeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateModelAttributeResponse
     */
    public function createModelAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateModelAttributeResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.attribute.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新模型字段
     * Summary: 更新模型字段.
     *
     * @param UpdateModelAttributeRequest $request
     *
     * @return UpdateModelAttributeResponse
     */
    public function updateModelAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateModelAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新模型字段
     * Summary: 更新模型字段.
     *
     * @param UpdateModelAttributeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateModelAttributeResponse
     */
    public function updateModelAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateModelAttributeResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.attribute.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除模型字段
     * Summary: 删除模型字段.
     *
     * @param DeleteModelAttributeRequest $request
     *
     * @return DeleteModelAttributeResponse
     */
    public function deleteModelAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteModelAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除模型字段
     * Summary: 删除模型字段.
     *
     * @param DeleteModelAttributeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteModelAttributeResponse
     */
    public function deleteModelAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteModelAttributeResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.model.attribute.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: id是否存在
     * Summary: id是否存在.
     *
     * @param ExistItemIdRequest $request
     *
     * @return ExistItemIdResponse
     */
    public function existItemId($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existItemIdEx($request, $headers, $runtime);
    }

    /**
     * Description: id是否存在
     * Summary: id是否存在.
     *
     * @param ExistItemIdRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ExistItemIdResponse
     */
    public function existItemIdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistItemIdResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.id.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前item的关系资源，注意区分上钻和下钻
     * Summary: 查询当前item的关系资源.
     *
     * @param QueryItemRelationsRequest $request
     *
     * @return QueryItemRelationsResponse
     */
    public function queryItemRelations($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryItemRelationsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前item的关系资源，注意区分上钻和下钻
     * Summary: 查询当前item的关系资源.
     *
     * @param QueryItemRelationsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryItemRelationsResponse
     */
    public function queryItemRelationsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryItemRelationsResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.relations.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入ITEM
     * Summary: 导入ITEM.
     *
     * @param ImportItemRequest $request
     *
     * @return ImportItemResponse
     */
    public function importItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入ITEM
     * Summary: 导入ITEM.
     *
     * @param ImportItemRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ImportItemResponse
     */
    public function importItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportItemResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导出资源
     * Summary: 导出资源.
     *
     * @param ExportItemRequest $request
     *
     * @return ExportItemResponse
     */
    public function exportItem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportItemEx($request, $headers, $runtime);
    }

    /**
     * Description: 导出资源
     * Summary: 导出资源.
     *
     * @param ExportItemRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ExportItemResponse
     */
    public function exportItemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportItemResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.item.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个模型关联
     * Summary: 获取单个模型关联.
     *
     * @param GetModelrelationshipRequest $request
     *
     * @return GetModelrelationshipResponse
     */
    public function getModelrelationship($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getModelrelationshipEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个模型关联
     * Summary: 获取单个模型关联.
     *
     * @param GetModelrelationshipRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetModelrelationshipResponse
     */
    public function getModelrelationshipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetModelrelationshipResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelrelationship.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询模型关联
     * Summary: 查询模型关联.
     *
     * @param QueryModelrelationshipRequest $request
     *
     * @return QueryModelrelationshipResponse
     */
    public function queryModelrelationship($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryModelrelationshipEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询模型关联
     * Summary: 查询模型关联.
     *
     * @param QueryModelrelationshipRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryModelrelationshipResponse
     */
    public function queryModelrelationshipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryModelrelationshipResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelrelationship.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建模型关联
     * Summary: 创建模型关联.
     *
     * @param CreateModelrelationshipRequest $request
     *
     * @return CreateModelrelationshipResponse
     */
    public function createModelrelationship($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createModelrelationshipEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建模型关联
     * Summary: 创建模型关联.
     *
     * @param CreateModelrelationshipRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateModelrelationshipResponse
     */
    public function createModelrelationshipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateModelrelationshipResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelrelationship.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新模型关联
     * Summary: 更新模型关联.
     *
     * @param UpdateModelrelationshipRequest $request
     *
     * @return UpdateModelrelationshipResponse
     */
    public function updateModelrelationship($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateModelrelationshipEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新模型关联
     * Summary: 更新模型关联.
     *
     * @param UpdateModelrelationshipRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateModelrelationshipResponse
     */
    public function updateModelrelationshipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateModelrelationshipResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelrelationship.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除模型关联
     * Summary: 删除模型关联.
     *
     * @param DeleteModelrelationshipRequest $request
     *
     * @return DeleteModelrelationshipResponse
     */
    public function deleteModelrelationship($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteModelrelationshipEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除模型关联
     * Summary: 删除模型关联.
     *
     * @param DeleteModelrelationshipRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteModelrelationshipResponse
     */
    public function deleteModelrelationshipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteModelrelationshipResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.modelrelationship.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拉取当前环境的参数表
     * Summary: 拉取当前环境的参数表.
     *
     * @param PullParamRequest $request
     *
     * @return PullParamResponse
     */
    public function pullParam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullParamEx($request, $headers, $runtime);
    }

    /**
     * Description: 拉取当前环境的参数表
     * Summary: 拉取当前环境的参数表.
     *
     * @param PullParamRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return PullParamResponse
     */
    public function pullParamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullParamResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.param.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新配置信息
     * Summary: 更新配置信息.
     *
     * @param PushParamRequest $request
     *
     * @return PushParamResponse
     */
    public function pushParam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushParamEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新配置信息
     * Summary: 更新配置信息.
     *
     * @param PushParamRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return PushParamResponse
     */
    public function pushParamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushParamResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.param.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建字段组
     * Summary: 创建字段组.
     *
     * @param CreateAttributegroupRequest $request
     *
     * @return CreateAttributegroupResponse
     */
    public function createAttributegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAttributegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建字段组
     * Summary: 创建字段组.
     *
     * @param CreateAttributegroupRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateAttributegroupResponse
     */
    public function createAttributegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAttributegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.attributegroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询字段组
     * Summary: 查询字段组.
     *
     * @param QueryAttributegroupRequest $request
     *
     * @return QueryAttributegroupResponse
     */
    public function queryAttributegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAttributegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询字段组
     * Summary: 查询字段组.
     *
     * @param QueryAttributegroupRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryAttributegroupResponse
     */
    public function queryAttributegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAttributegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.attributegroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除字段组
     * Summary: 删除字段组.
     *
     * @param DeleteAttributegroupRequest $request
     *
     * @return DeleteAttributegroupResponse
     */
    public function deleteAttributegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAttributegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除字段组
     * Summary: 删除字段组.
     *
     * @param DeleteAttributegroupRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteAttributegroupResponse
     */
    public function deleteAttributegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAttributegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.attributegroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新字段组
     * Summary: 更新字段组.
     *
     * @param UpdateAttributegroupRequest $request
     *
     * @return UpdateAttributegroupResponse
     */
    public function updateAttributegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAttributegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新字段组
     * Summary: 更新字段组.
     *
     * @param UpdateAttributegroupRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateAttributegroupResponse
     */
    public function updateAttributegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAttributegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.attributegroup.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 审计日志查询
     * Summary: 审计日志查询.
     *
     * @param QueryAuditlogRequest $request
     *
     * @return QueryAuditlogResponse
     */
    public function queryAuditlog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditlogEx($request, $headers, $runtime);
    }

    /**
     * Description: 审计日志查询
     * Summary: 审计日志查询.
     *
     * @param QueryAuditlogRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryAuditlogResponse
     */
    public function queryAuditlogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditlogResponse::fromMap($this->doRequest('1.0', 'antcloud.cmdb.auditlog.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
