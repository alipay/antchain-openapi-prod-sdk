// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.osp.models.*;
import com.antgroup.antchain.openapi.antchain.util.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;

public class Client {

    public String _endpoint;
    public String _regionId;
    public String _accessKeyId;
    public String _accessKeySecret;
    public String _protocol;
    public String _userAgent;
    public Number _readTimeout;
    public Number _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Number _maxIdleConns;
    public String _securityToken;
    public Number _maxIdleTimeMillis;
    public Number _keepAliveDurationMillis;
    public Number _maxRequests;
    public Number _maxRequestsPerHost;
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._securityToken = config.securityToken;
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._userAgent = config.userAgent;
        this._readTimeout = com.aliyun.teautil.Common.defaultNumber(config.readTimeout, 20000);
        this._connectTimeout = com.aliyun.teautil.Common.defaultNumber(config.connectTimeout, 20000);
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = com.aliyun.teautil.Common.defaultNumber(config.maxIdleConns, 60000);
        this._maxIdleTimeMillis = com.aliyun.teautil.Common.defaultNumber(config.maxIdleTimeMillis, 5);
        this._keepAliveDurationMillis = com.aliyun.teautil.Common.defaultNumber(config.keepAliveDurationMillis, 5000);
        this._maxRequests = com.aliyun.teautil.Common.defaultNumber(config.maxRequests, 100);
        this._maxRequestsPerHost = com.aliyun.teautil.Common.defaultNumber(config.maxRequestsPerHost, 100);
    }

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDurationMillis", _keepAliveDurationMillis),
            new TeaPair("maxRequests", _maxRequests),
            new TeaPair("maxRequestsPerHost", _maxRequestsPerHost),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = TeaConverter.buildMap(
                    new TeaPair("method", action),
                    new TeaPair("version", version),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.1.4")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "openapi.antchain.antgroup.com")),
                        new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(_userAgent))
                    ),
                    headers
                );
                java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(request));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                request_.headers.put("content-type", "application/x-www-form-urlencoded");
                java.util.Map<String, String> signedParam = TeaConverter.merge(String.class,
                    request_.query,
                    com.aliyun.common.Common.query(request)
                );
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.AntchainUtils.hasError(raw, _accessKeySecret)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }

        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    /**
     * Description: 查询实例信息
     * Summary: 查询实例信息
     */
    public QueryInstancesResponse queryInstances(QueryInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInstancesEx(request, headers, runtime);
    }

    /**
     * Description: 查询实例信息
     * Summary: 查询实例信息
     */
    public QueryInstancesResponse queryInstancesEx(QueryInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.osp.instances.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInstancesResponse());
    }

    /**
     * Description: 查询产品信息
     * Summary: 查询产品信息
     */
    public QueryProductsResponse queryProducts(QueryProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProductsEx(request, headers, runtime);
    }

    /**
     * Description: 查询产品信息
     * Summary: 查询产品信息
     */
    public QueryProductsResponse queryProductsEx(QueryProductsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.osp.products.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryProductsResponse());
    }

    /**
     * Description: 获取共享中间件参数信息
     * Summary: 获取共享中间件参数信息
     */
    public QueryEndpointsResponse queryEndpoints(QueryEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEndpointsEx(request, headers, runtime);
    }

    /**
     * Description: 获取共享中间件参数信息
     * Summary: 获取共享中间件参数信息
     */
    public QueryEndpointsResponse queryEndpointsEx(QueryEndpointsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.osp.endpoints.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEndpointsResponse());
    }

    /**
     * Description: 针对 domain 进行扩容操作
     * Summary: 扩容接口
     */
    public ScaleoutClustersResponse scaleoutClusters(ScaleoutClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleoutClustersEx(request, headers, runtime);
    }

    /**
     * Description: 针对 domain 进行扩容操作
     * Summary: 扩容接口
     */
    public ScaleoutClustersResponse scaleoutClustersEx(ScaleoutClustersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.clusters.scaleout", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleoutClustersResponse());
    }

    /**
     * Description: 针对 domain 进行缩容
     * Summary: 缩容接口
     */
    public ScaleinClusterResponse scaleinCluster(ScaleinClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleinClusterEx(request, headers, runtime);
    }

    /**
     * Description: 针对 domain 进行缩容
     * Summary: 缩容接口
     */
    public ScaleinClusterResponse scaleinClusterEx(ScaleinClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.cluster.scalein", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleinClusterResponse());
    }

    /**
     * Description: 设置节点是否生效（上下线）
     * Summary: 设置节点是否生效（上下线）
     */
    public SetClustersResponse setClusters(SetClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setClustersEx(request, headers, runtime);
    }

    /**
     * Description: 设置节点是否生效（上下线）
     * Summary: 设置节点是否生效（上下线）
     */
    public SetClustersResponse setClustersEx(SetClustersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.clusters.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetClustersResponse());
    }

    /**
     * Description: 根据instanceId获取对应的tenant和workspace的信息
     * Summary: 获取instance详情
     */
    public GetInstancesResponse getInstances(GetInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstancesEx(request, headers, runtime);
    }

    /**
     * Description: 根据instanceId获取对应的tenant和workspace的信息
     * Summary: 获取instance详情
     */
    public GetInstancesResponse getInstancesEx(GetInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.instances.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInstancesResponse());
    }

    /**
     * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
     * Summary: 创建AK/SK的接口
     */
    public CreateAccesskeyResponse createAccesskey(CreateAccesskeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAccesskeyEx(request, headers, runtime);
    }

    /**
     * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
     * Summary: 创建AK/SK的接口
     */
    public CreateAccesskeyResponse createAccesskeyEx(CreateAccesskeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.accesskey.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAccesskeyResponse());
    }

    /**
     * Description: 根据 instanceId 和 name获取AK/SK的接口
     * Summary: 获取AK/SK的接口
     */
    public GetAccesskeyResponse getAccesskey(GetAccesskeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccesskeyEx(request, headers, runtime);
    }

    /**
     * Description: 根据 instanceId 和 name获取AK/SK的接口
     * Summary: 获取AK/SK的接口
     */
    public GetAccesskeyResponse getAccesskeyEx(GetAccesskeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.accesskey.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAccesskeyResponse());
    }

    /**
     * Description: 中间件元数据获取
     * Summary: 中间件元数据获取
     */
    public GetMiddlewareMetaResponse getMiddlewareMeta(GetMiddlewareMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMiddlewareMetaEx(request, headers, runtime);
    }

    /**
     * Description: 中间件元数据获取
     * Summary: 中间件元数据获取
     */
    public GetMiddlewareMetaResponse getMiddlewareMetaEx(GetMiddlewareMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.middleware.meta.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMiddlewareMetaResponse());
    }

    /**
     * Description: 根据workspaceGroup查询instanceId
     * Summary: 查询instanceId
     */
    public GetWorkspacegroupInstanceResponse getWorkspacegroupInstance(GetWorkspacegroupInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspacegroupInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 根据workspaceGroup查询instanceId
     * Summary: 查询instanceId
     */
    public GetWorkspacegroupInstanceResponse getWorkspacegroupInstanceEx(GetWorkspacegroupInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.workspacegroup.instance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspacegroupInstanceResponse());
    }

    /**
     * Description: 查询中间件集群模式
     * Summary: 查询中间件集群模式
     */
    public QueryMiddlewareClustermodeResponse queryMiddlewareClustermode(QueryMiddlewareClustermodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMiddlewareClustermodeEx(request, headers, runtime);
    }

    /**
     * Description: 查询中间件集群模式
     * Summary: 查询中间件集群模式
     */
    public QueryMiddlewareClustermodeResponse queryMiddlewareClustermodeEx(QueryMiddlewareClustermodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.middleware.clustermode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMiddlewareClustermodeResponse());
    }

    /**
     * Description: 查询中间件集群列表
     * Summary: 查询中间件集群列表
     */
    public QueryMiddlewareClustersResponse queryMiddlewareClusters(QueryMiddlewareClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMiddlewareClustersEx(request, headers, runtime);
    }

    /**
     * Description: 查询中间件集群列表
     * Summary: 查询中间件集群列表
     */
    public QueryMiddlewareClustersResponse queryMiddlewareClustersEx(QueryMiddlewareClustersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.middleware.clusters.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMiddlewareClustersResponse());
    }

    /**
     * Description: 绑定中间件列表
     * Summary: 绑定中间件列表
     */
    public BindMiddlewareInstanceResponse bindMiddlewareInstance(BindMiddlewareInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindMiddlewareInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 绑定中间件列表
     * Summary: 绑定中间件列表
     */
    public BindMiddlewareInstanceResponse bindMiddlewareInstanceEx(BindMiddlewareInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.middleware.instance.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindMiddlewareInstanceResponse());
    }

    /**
     * Description: paas 解绑中间件
     * Summary: 解绑中间件实例
     */
    public UnbindMiddlewareInstanceResponse unbindMiddlewareInstance(UnbindMiddlewareInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindMiddlewareInstanceEx(request, headers, runtime);
    }

    /**
     * Description: paas 解绑中间件
     * Summary: 解绑中间件实例
     */
    public UnbindMiddlewareInstanceResponse unbindMiddlewareInstanceEx(UnbindMiddlewareInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.middleware.instance.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindMiddlewareInstanceResponse());
    }
}
