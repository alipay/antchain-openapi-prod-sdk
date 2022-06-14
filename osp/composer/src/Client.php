<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Osp\Models\BindMiddlewareInstanceRequest;
use AntChain\Osp\Models\BindMiddlewareInstanceResponse;
use AntChain\Osp\Models\CreateAccesskeyRequest;
use AntChain\Osp\Models\CreateAccesskeyResponse;
use AntChain\Osp\Models\GetAccesskeyRequest;
use AntChain\Osp\Models\GetAccesskeyResponse;
use AntChain\Osp\Models\GetInstancesRequest;
use AntChain\Osp\Models\GetInstancesResponse;
use AntChain\Osp\Models\GetMiddlewareMetaRequest;
use AntChain\Osp\Models\GetMiddlewareMetaResponse;
use AntChain\Osp\Models\GetWorkspacegroupInstanceRequest;
use AntChain\Osp\Models\GetWorkspacegroupInstanceResponse;
use AntChain\Osp\Models\QueryEndpointsRequest;
use AntChain\Osp\Models\QueryEndpointsResponse;
use AntChain\Osp\Models\QueryInstancesRequest;
use AntChain\Osp\Models\QueryInstancesResponse;
use AntChain\Osp\Models\QueryMiddlewareClustermodeRequest;
use AntChain\Osp\Models\QueryMiddlewareClustermodeResponse;
use AntChain\Osp\Models\QueryMiddlewareClustersRequest;
use AntChain\Osp\Models\QueryMiddlewareClustersResponse;
use AntChain\Osp\Models\QueryProductsRequest;
use AntChain\Osp\Models\QueryProductsResponse;
use AntChain\Osp\Models\ScaleinClusterRequest;
use AntChain\Osp\Models\ScaleinClusterResponse;
use AntChain\Osp\Models\ScaleoutClustersRequest;
use AntChain\Osp\Models\ScaleoutClustersResponse;
use AntChain\Osp\Models\SetClustersRequest;
use AntChain\Osp\Models\SetClustersResponse;
use AntChain\Osp\Models\UnbindMiddlewareInstanceRequest;
use AntChain\Osp\Models\UnbindMiddlewareInstanceResponse;
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
            // 集群信息
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
                    'sdk_version'      => '1.1.5',
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
     * Description: 查询实例信息
     * Summary: 查询实例信息.
     *
     * @param QueryInstancesRequest $request
     *
     * @return QueryInstancesResponse
     */
    public function queryInstances($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInstancesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实例信息
     * Summary: 查询实例信息.
     *
     * @param QueryInstancesRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryInstancesResponse
     */
    public function queryInstancesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInstancesResponse::fromMap($this->doRequest('2.0', 'sofa.osp.instances.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询产品信息
     * Summary: 查询产品信息.
     *
     * @param QueryProductsRequest $request
     *
     * @return QueryProductsResponse
     */
    public function queryProducts($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryProductsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询产品信息
     * Summary: 查询产品信息.
     *
     * @param QueryProductsRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryProductsResponse
     */
    public function queryProductsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryProductsResponse::fromMap($this->doRequest('2.0', 'sofa.osp.products.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取共享中间件参数信息
     * Summary: 获取共享中间件参数信息.
     *
     * @param QueryEndpointsRequest $request
     *
     * @return QueryEndpointsResponse
     */
    public function queryEndpoints($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEndpointsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取共享中间件参数信息
     * Summary: 获取共享中间件参数信息.
     *
     * @param QueryEndpointsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryEndpointsResponse
     */
    public function queryEndpointsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEndpointsResponse::fromMap($this->doRequest('2.0', 'sofa.osp.endpoints.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对 domain 进行扩容操作
     * Summary: 扩容接口.
     *
     * @param ScaleoutClustersRequest $request
     *
     * @return ScaleoutClustersResponse
     */
    public function scaleoutClusters($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->scaleoutClustersEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对 domain 进行扩容操作
     * Summary: 扩容接口.
     *
     * @param ScaleoutClustersRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ScaleoutClustersResponse
     */
    public function scaleoutClustersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ScaleoutClustersResponse::fromMap($this->doRequest('1.0', 'sofa.osp.clusters.scaleout', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对 domain 进行缩容
     * Summary: 缩容接口.
     *
     * @param ScaleinClusterRequest $request
     *
     * @return ScaleinClusterResponse
     */
    public function scaleinCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->scaleinClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对 domain 进行缩容
     * Summary: 缩容接口.
     *
     * @param ScaleinClusterRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ScaleinClusterResponse
     */
    public function scaleinClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ScaleinClusterResponse::fromMap($this->doRequest('1.0', 'sofa.osp.cluster.scalein', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置节点是否生效（上下线）
     * Summary: 设置节点是否生效（上下线）.
     *
     * @param SetClustersRequest $request
     *
     * @return SetClustersResponse
     */
    public function setClusters($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setClustersEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置节点是否生效（上下线）
     * Summary: 设置节点是否生效（上下线）.
     *
     * @param SetClustersRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return SetClustersResponse
     */
    public function setClustersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetClustersResponse::fromMap($this->doRequest('1.0', 'sofa.osp.clusters.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据instanceId获取对应的tenant和workspace的信息
     * Summary: 获取instance详情.
     *
     * @param GetInstancesRequest $request
     *
     * @return GetInstancesResponse
     */
    public function getInstances($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInstancesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据instanceId获取对应的tenant和workspace的信息
     * Summary: 获取instance详情.
     *
     * @param GetInstancesRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetInstancesResponse
     */
    public function getInstancesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInstancesResponse::fromMap($this->doRequest('1.0', 'sofa.osp.instances.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
     * Summary: 创建AK/SK的接口.
     *
     * @param CreateAccesskeyRequest $request
     *
     * @return CreateAccesskeyResponse
     */
    public function createAccesskey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAccesskeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
     * Summary: 创建AK/SK的接口.
     *
     * @param CreateAccesskeyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateAccesskeyResponse
     */
    public function createAccesskeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAccesskeyResponse::fromMap($this->doRequest('1.0', 'sofa.osp.accesskey.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据 instanceId 和 name获取AK/SK的接口
     * Summary: 获取AK/SK的接口.
     *
     * @param GetAccesskeyRequest $request
     *
     * @return GetAccesskeyResponse
     */
    public function getAccesskey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAccesskeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据 instanceId 和 name获取AK/SK的接口
     * Summary: 获取AK/SK的接口.
     *
     * @param GetAccesskeyRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetAccesskeyResponse
     */
    public function getAccesskeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAccesskeyResponse::fromMap($this->doRequest('1.0', 'sofa.osp.accesskey.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 中间件元数据获取
     * Summary: 中间件元数据获取.
     *
     * @param GetMiddlewareMetaRequest $request
     *
     * @return GetMiddlewareMetaResponse
     */
    public function getMiddlewareMeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMiddlewareMetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 中间件元数据获取
     * Summary: 中间件元数据获取.
     *
     * @param GetMiddlewareMetaRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetMiddlewareMetaResponse
     */
    public function getMiddlewareMetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMiddlewareMetaResponse::fromMap($this->doRequest('1.0', 'sofa.osp.middleware.meta.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据workspaceGroup查询instanceId
     * Summary: 查询instanceId.
     *
     * @param GetWorkspacegroupInstanceRequest $request
     *
     * @return GetWorkspacegroupInstanceResponse
     */
    public function getWorkspacegroupInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getWorkspacegroupInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据workspaceGroup查询instanceId
     * Summary: 查询instanceId.
     *
     * @param GetWorkspacegroupInstanceRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetWorkspacegroupInstanceResponse
     */
    public function getWorkspacegroupInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetWorkspacegroupInstanceResponse::fromMap($this->doRequest('1.0', 'sofa.osp.workspacegroup.instance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询中间件集群模式
     * Summary: 查询中间件集群模式.
     *
     * @param QueryMiddlewareClustermodeRequest $request
     *
     * @return QueryMiddlewareClustermodeResponse
     */
    public function queryMiddlewareClustermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMiddlewareClustermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询中间件集群模式
     * Summary: 查询中间件集群模式.
     *
     * @param QueryMiddlewareClustermodeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryMiddlewareClustermodeResponse
     */
    public function queryMiddlewareClustermodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMiddlewareClustermodeResponse::fromMap($this->doRequest('1.0', 'sofa.osp.middleware.clustermode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询中间件集群列表
     * Summary: 查询中间件集群列表.
     *
     * @param QueryMiddlewareClustersRequest $request
     *
     * @return QueryMiddlewareClustersResponse
     */
    public function queryMiddlewareClusters($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMiddlewareClustersEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询中间件集群列表
     * Summary: 查询中间件集群列表.
     *
     * @param QueryMiddlewareClustersRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryMiddlewareClustersResponse
     */
    public function queryMiddlewareClustersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMiddlewareClustersResponse::fromMap($this->doRequest('1.0', 'sofa.osp.middleware.clusters.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定中间件列表
     * Summary: 绑定中间件列表.
     *
     * @param BindMiddlewareInstanceRequest $request
     *
     * @return BindMiddlewareInstanceResponse
     */
    public function bindMiddlewareInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindMiddlewareInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定中间件列表
     * Summary: 绑定中间件列表.
     *
     * @param BindMiddlewareInstanceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BindMiddlewareInstanceResponse
     */
    public function bindMiddlewareInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindMiddlewareInstanceResponse::fromMap($this->doRequest('1.0', 'sofa.osp.middleware.instance.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: paas 解绑中间件
     * Summary: 解绑中间件实例.
     *
     * @param UnbindMiddlewareInstanceRequest $request
     *
     * @return UnbindMiddlewareInstanceResponse
     */
    public function unbindMiddlewareInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindMiddlewareInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: paas 解绑中间件
     * Summary: 解绑中间件实例.
     *
     * @param UnbindMiddlewareInstanceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UnbindMiddlewareInstanceResponse
     */
    public function unbindMiddlewareInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindMiddlewareInstanceResponse::fromMap($this->doRequest('1.0', 'sofa.osp.middleware.instance.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
