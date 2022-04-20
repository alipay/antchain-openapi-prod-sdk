// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.yunqing.models.*;
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
                    new TeaPair("sdk_version", "3.14.14")
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
     * Description: 创建一个运维单。
     * Summary: 创建一个运维单。
     */
    public CreateAppopsResponse createAppops(CreateAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个运维单。
     * Summary: 创建一个运维单。
     */
    public CreateAppopsResponse createAppopsEx(CreateAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.appops.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppopsResponse());
    }

    /**
     * Description: 查询一个运维单详情。
     * Summary: 查询一个运维单详情。
     */
    public GetAppopsResponse getAppops(GetAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个运维单详情。
     * Summary: 查询一个运维单详情。
     */
    public GetAppopsResponse getAppopsEx(GetAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.appops.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppopsResponse());
    }

    /**
     * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
     * Summary: 重试一个运维单。
     */
    public RetryAppopsResponse retryAppops(RetryAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
     * Summary: 重试一个运维单。
     */
    public RetryAppopsResponse retryAppopsEx(RetryAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.appops.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryAppopsResponse());
    }

    /**
     * Description: 取消一个发布单。
     * Summary: 取消一个发布单。
     */
    public CancelAppopsResponse cancelAppops(CancelAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 取消一个发布单。
     * Summary: 取消一个发布单。
     */
    public CancelAppopsResponse cancelAppopsEx(CancelAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.appops.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAppopsResponse());
    }

    /**
     * Description: 变更应用服务实例集群大小。
     * Summary: 已废弃，勿用！！！
     */
    public ScaleProdinstanceAppserviceResponse scaleProdinstanceAppservice(ScaleProdinstanceAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleProdinstanceAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 变更应用服务实例集群大小。
     * Summary: 已废弃，勿用！！！
     */
    public ScaleProdinstanceAppserviceResponse scaleProdinstanceAppserviceEx(ScaleProdinstanceAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scale", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleProdinstanceAppserviceResponse());
    }

    /**
     * Description: 获取环境列表。
     * Summary: 获取环境列表。
     */
    public ListEnvResponse listEnv(ListEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvEx(request, headers, runtime);
    }

    /**
     * Description: 获取环境列表。
     * Summary: 获取环境列表。
     */
    public ListEnvResponse listEnvEx(ListEnvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.env.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListEnvResponse());
    }

    /**
     * Description: 获取应用服务实例详情信息。
     * Summary: 获取应用服务实例详情信息。
     */
    public GetProdinstanceAppserviceResponse getProdinstanceAppservice(GetProdinstanceAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProdinstanceAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用服务实例详情信息。
     * Summary: 获取应用服务实例详情信息。
     */
    public GetProdinstanceAppserviceResponse getProdinstanceAppserviceEx(GetProdinstanceAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetProdinstanceAppserviceResponse());
    }

    /**
     * Description: 查询产品实例。
     * Summary: 查询产品实例。
     */
    public QueryProdinstanceResponse queryProdinstance(QueryProdinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProdinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询产品实例。
     * Summary: 查询产品实例。
     */
    public QueryProdinstanceResponse queryProdinstanceEx(QueryProdinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryProdinstanceResponse());
    }

    /**
     * Description: 卸载基线产品实例
     * Summary: 卸载基线产品实例
     */
    public UninstallProdinstanceAppserviceResponse uninstallProdinstanceAppservice(UninstallProdinstanceAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallProdinstanceAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 卸载基线产品实例
     * Summary: 卸载基线产品实例
     */
    public UninstallProdinstanceAppserviceResponse uninstallProdinstanceAppserviceEx(UninstallProdinstanceAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.uninstall", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UninstallProdinstanceAppserviceResponse());
    }

    /**
     * Description: 创建部署单元实例
     * Summary: 创建部署单元实例
     */
    public CreateProdinstanceDeployunitResponse createProdinstanceDeployunit(CreateProdinstanceDeployunitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProdinstanceDeployunitEx(request, headers, runtime);
    }

    /**
     * Description: 创建部署单元实例
     * Summary: 创建部署单元实例
     */
    public CreateProdinstanceDeployunitResponse createProdinstanceDeployunitEx(CreateProdinstanceDeployunitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProdinstanceDeployunitResponse());
    }

    /**
     * Description: 查询部署单元实例创建状态
     * Summary: 废弃，勿用！！！
     */
    public QueryUnitinstanceCreationResponse queryUnitinstanceCreation(QueryUnitinstanceCreationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnitinstanceCreationEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元实例创建状态
     * Summary: 废弃，勿用！！！
     */
    public QueryUnitinstanceCreationResponse queryUnitinstanceCreationEx(QueryUnitinstanceCreationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.unitinstance.creation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnitinstanceCreationResponse());
    }

    /**
     * Description: 获取部署单元详情
     * Summary: 废弃，勿用！！！
     */
    public GetUnitDetailResponse getUnitDetail(GetUnitDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnitDetailEx(request, headers, runtime);
    }

    /**
     * Description: 获取部署单元详情
     * Summary: 废弃，勿用！！！
     */
    public GetUnitDetailResponse getUnitDetailEx(GetUnitDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.unit.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnitDetailResponse());
    }

    /**
     * Description: 查询应用服务实例信息。
     * Summary: 查询应用服务实例信息。
     */
    public QueryProdinstanceAppserviceResponse queryProdinstanceAppservice(QueryProdinstanceAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProdinstanceAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用服务实例信息。
     * Summary: 查询应用服务实例信息。
     */
    public QueryProdinstanceAppserviceResponse queryProdinstanceAppserviceEx(QueryProdinstanceAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryProdinstanceAppserviceResponse());
    }

    /**
     * Description: 获取单元实例信息
     * Summary: 获取单元实例信息
     */
    public GetProdinstanceDeployunitResponse getProdinstanceDeployunit(GetProdinstanceDeployunitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProdinstanceDeployunitEx(request, headers, runtime);
    }

    /**
     * Description: 获取单元实例信息
     * Summary: 获取单元实例信息
     */
    public GetProdinstanceDeployunitResponse getProdinstanceDeployunitEx(GetProdinstanceDeployunitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetProdinstanceDeployunitResponse());
    }

    /**
     * Description: 获取产品实例下的部署单元列表。
     * Summary: 获取产品实例下的部署单元列表
     */
    public ListProdinstanceDeployunitResponse listProdinstanceDeployunit(ListProdinstanceDeployunitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProdinstanceDeployunitEx(request, headers, runtime);
    }

    /**
     * Description: 获取产品实例下的部署单元列表。
     * Summary: 获取产品实例下的部署单元列表
     */
    public ListProdinstanceDeployunitResponse listProdinstanceDeployunitEx(ListProdinstanceDeployunitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListProdinstanceDeployunitResponse());
    }

    /**
     * Description: 指定应用服务扩容。
     * Summary: 指定应用服务扩容。
     */
    public ScaleoutProdinstanceAppserviceResponse scaleoutProdinstanceAppservice(ScaleoutProdinstanceAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleoutProdinstanceAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 指定应用服务扩容。
     * Summary: 指定应用服务扩容。
     */
    public ScaleoutProdinstanceAppserviceResponse scaleoutProdinstanceAppserviceEx(ScaleoutProdinstanceAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scaleout", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleoutProdinstanceAppserviceResponse());
    }

    /**
     * Description: 查询用户授权信息
     * Summary: 查询用户授权信息
     */
    public QueryAuthResponse queryAuth(QueryAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户授权信息
     * Summary: 查询用户授权信息
     */
    public QueryAuthResponse queryAuthEx(QueryAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.auth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthResponse());
    }

    /**
     * Description: 导入用户授权
     * Summary: 导入用户授权
     */
    public ImportAuthResponse importAuth(ImportAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importAuthEx(request, headers, runtime);
    }

    /**
     * Description: 导入用户授权
     * Summary: 导入用户授权
     */
    public ImportAuthResponse importAuthEx(ImportAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.auth.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportAuthResponse());
    }

    /**
     * Description: 系统信息
     * Summary: 获取Local系统信息
     */
    public GetSystemResponse getSystem(GetSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSystemEx(request, headers, runtime);
    }

    /**
     * Description: 系统信息
     * Summary: 获取Local系统信息
     */
    public GetSystemResponse getSystemEx(GetSystemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.system.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSystemResponse());
    }

    /**
     * Description: 应用服务缩容。
     * Summary: 应用服务缩容。
     */
    public ScaleinProdinstanceAppserviceResponse scaleinProdinstanceAppservice(ScaleinProdinstanceAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleinProdinstanceAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 应用服务缩容。
     * Summary: 应用服务缩容。
     */
    public ScaleinProdinstanceAppserviceResponse scaleinProdinstanceAppserviceEx(ScaleinProdinstanceAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scalein", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleinProdinstanceAppserviceResponse());
    }

    /**
     * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
     * Summary: 查询一个环境内的全部应用服务实例信息。
     */
    public AllProdinstanceAppserviceResponse allProdinstanceAppservice(AllProdinstanceAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allProdinstanceAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
     * Summary: 查询一个环境内的全部应用服务实例信息。
     */
    public AllProdinstanceAppserviceResponse allProdinstanceAppserviceEx(AllProdinstanceAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllProdinstanceAppserviceResponse());
    }

    /**
     * Description: 输入产品码，自动创建一个测试单，并开始执行
     * Summary: 创建一个自动巡检测试单
     */
    public CreateAutotestopsResponse createAutotestops(CreateAutotestopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutotestopsEx(request, headers, runtime);
    }

    /**
     * Description: 输入产品码，自动创建一个测试单，并开始执行
     * Summary: 创建一个自动巡检测试单
     */
    public CreateAutotestopsResponse createAutotestopsEx(CreateAutotestopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.autotestops.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAutotestopsResponse());
    }

    /**
     * Description: 获取测试单状态和case
     * Summary: 获取测试单详情
     */
    public GetAutotestopsResponse getAutotestops(GetAutotestopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAutotestopsEx(request, headers, runtime);
    }

    /**
     * Description: 获取测试单状态和case
     * Summary: 获取测试单详情
     */
    public GetAutotestopsResponse getAutotestopsEx(GetAutotestopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.autotestops.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAutotestopsResponse());
    }

    /**
     * Description: 基线数据回流
     * Summary: 基线数据回流
     */
    public ExportBaselineResponse exportBaseline(ExportBaselineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportBaselineEx(request, headers, runtime);
    }

    /**
     * Description: 基线数据回流
     * Summary: 基线数据回流
     */
    public ExportBaselineResponse exportBaselineEx(ExportBaselineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.baseline.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportBaselineResponse());
    }

    /**
     * Description: 创建一个发布单
     * Summary: 创建一个发布单
     */
    public CreateAppdeployResponse createAppdeploy(CreateAppdeployRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppdeployEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个发布单
     * Summary: 创建一个发布单
     */
    public CreateAppdeployResponse createAppdeployEx(CreateAppdeployRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.appdeploy.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppdeployResponse());
    }

    /**
     * Description: 查询环境中的解决方案实例
     * Summary: 查询环境中的解决方案实例
     */
    public QuerySolutioninstanceResponse querySolutioninstance(QuerySolutioninstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySolutioninstanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询环境中的解决方案实例
     * Summary: 查询环境中的解决方案实例
     */
    public QuerySolutioninstanceResponse querySolutioninstanceEx(QuerySolutioninstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solutioninstance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySolutioninstanceResponse());
    }

    /**
     * Description: 导入解决方案
     * Summary: 导入解决方案
     */
    public ImportSolutioninstanceResponse importSolutioninstance(ImportSolutioninstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importSolutioninstanceEx(request, headers, runtime);
    }

    /**
     * Description: 导入解决方案
     * Summary: 导入解决方案
     */
    public ImportSolutioninstanceResponse importSolutioninstanceEx(ImportSolutioninstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solutioninstance.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportSolutioninstanceResponse());
    }

    /**
     * Description: 检查解决方案是否可以导入
     * Summary: 检查解决方案是否可以导入
     */
    public CheckSolutioninstanceImportResponse checkSolutioninstanceImport(CheckSolutioninstanceImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSolutioninstanceImportEx(request, headers, runtime);
    }

    /**
     * Description: 检查解决方案是否可以导入
     * Summary: 检查解决方案是否可以导入
     */
    public CheckSolutioninstanceImportResponse checkSolutioninstanceImportEx(CheckSolutioninstanceImportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solutioninstance.import.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSolutioninstanceImportResponse());
    }

    /**
     * Description: 返回解决方案支持的操作列表
     * Summary: 返回解决方案支持的操作列表
     */
    public DescribeSolutioninstanceResponse describeSolutioninstance(DescribeSolutioninstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSolutioninstanceEx(request, headers, runtime);
    }

    /**
     * Description: 返回解决方案支持的操作列表
     * Summary: 返回解决方案支持的操作列表
     */
    public DescribeSolutioninstanceResponse describeSolutioninstanceEx(DescribeSolutioninstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solutioninstance.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeSolutioninstanceResponse());
    }

    /**
     * Description: 废弃一个解决方案
     * Summary: 废弃一个解决方案
     */
    public DeprecateSolutioninstanceResponse deprecateSolutioninstance(DeprecateSolutioninstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deprecateSolutioninstanceEx(request, headers, runtime);
    }

    /**
     * Description: 废弃一个解决方案
     * Summary: 废弃一个解决方案
     */
    public DeprecateSolutioninstanceResponse deprecateSolutioninstanceEx(DeprecateSolutioninstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solutioninstance.deprecate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeprecateSolutioninstanceResponse());
    }

    /**
     * Description: 完成一个解决方案
     * Summary: 完成一个解决方案
     */
    public FinishSolutioninstanceResponse finishSolutioninstance(FinishSolutioninstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishSolutioninstanceEx(request, headers, runtime);
    }

    /**
     * Description: 完成一个解决方案
     * Summary: 完成一个解决方案
     */
    public FinishSolutioninstanceResponse finishSolutioninstanceEx(FinishSolutioninstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solutioninstance.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishSolutioninstanceResponse());
    }

    /**
     * Description: reopen一个解决方案
     * Summary: reopen一个解决方案
     */
    public ReopenSolutioninstanceResponse reopenSolutioninstance(ReopenSolutioninstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reopenSolutioninstanceEx(request, headers, runtime);
    }

    /**
     * Description: reopen一个解决方案
     * Summary: reopen一个解决方案
     */
    public ReopenSolutioninstanceResponse reopenSolutioninstanceEx(ReopenSolutioninstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solutioninstance.reopen", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReopenSolutioninstanceResponse());
    }

    /**
     * Description: 导入一个云架构
     * Summary: 导入一个云架构
     */
    public ImportEnvMetaResponse importEnvMeta(ImportEnvMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importEnvMetaEx(request, headers, runtime);
    }

    /**
     * Description: 导入一个云架构
     * Summary: 导入一个云架构
     */
    public ImportEnvMetaResponse importEnvMetaEx(ImportEnvMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.env.meta.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportEnvMetaResponse());
    }

    /**
     * Description: 导入产品元数据
     * Summary: 导入产品元数据
     */
    public ImportProdMetaResponse importProdMeta(ImportProdMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importProdMetaEx(request, headers, runtime);
    }

    /**
     * Description: 导入产品元数据
     * Summary: 导入产品元数据
     */
    public ImportProdMetaResponse importProdMetaEx(ImportProdMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prod.meta.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportProdMetaResponse());
    }

    /**
     * Description: 卸载部署单元实例
     * Summary: 卸载部署单元实例
     */
    public UninstallProdinstanceDeployunitResponse uninstallProdinstanceDeployunit(UninstallProdinstanceDeployunitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallProdinstanceDeployunitEx(request, headers, runtime);
    }

    /**
     * Description: 卸载部署单元实例
     * Summary: 卸载部署单元实例
     */
    public UninstallProdinstanceDeployunitResponse uninstallProdinstanceDeployunitEx(UninstallProdinstanceDeployunitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.uninstall", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UninstallProdinstanceDeployunitResponse());
    }

    /**
     * Description: 集群内部pod信息查询，巡检使用
     * Summary: 集群内部pod信息查询，巡检使用
     */
    public QueryClusterPodsResponse queryClusterPods(QueryClusterPodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterPodsEx(request, headers, runtime);
    }

    /**
     * Description: 集群内部pod信息查询，巡检使用
     * Summary: 集群内部pod信息查询，巡检使用
     */
    public QueryClusterPodsResponse queryClusterPodsEx(QueryClusterPodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.cluster.pods.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterPodsResponse());
    }

    /**
     * Description: 集群内部kubeconfig查询巡检使用
     * Summary: 集群内部kubeconfig查询巡检使用
     */
    public QueryClusterKubeconfigResponse queryClusterKubeconfig(QueryClusterKubeconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterKubeconfigEx(request, headers, runtime);
    }

    /**
     * Description: 集群内部kubeconfig查询巡检使用
     * Summary: 集群内部kubeconfig查询巡检使用
     */
    public QueryClusterKubeconfigResponse queryClusterKubeconfigEx(QueryClusterKubeconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.cluster.kubeconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterKubeconfigResponse());
    }

    /**
     * Description: 【ODP虚商迁移】公有云支持创建公网SLB
    https://aone.alipay.com/req/33161543?from=ak&
     * Summary: 生成公网访问的slb
     */
    public EnableDynamicslbResponse enableDynamicslb(EnableDynamicslbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableDynamicslbEx(request, headers, runtime);
    }

    /**
     * Description: 【ODP虚商迁移】公有云支持创建公网SLB
    https://aone.alipay.com/req/33161543?from=ak&
     * Summary: 生成公网访问的slb
     */
    public EnableDynamicslbResponse enableDynamicslbEx(EnableDynamicslbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.dynamicslb.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableDynamicslbResponse());
    }

    /**
     * Description: 移除公网SLB
    【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
     * Summary: 移除公网访问的slb
     */
    public DisableDynamicslbResponse disableDynamicslb(DisableDynamicslbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableDynamicslbEx(request, headers, runtime);
    }

    /**
     * Description: 移除公网SLB
    【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
     * Summary: 移除公网访问的slb
     */
    public DisableDynamicslbResponse disableDynamicslbEx(DisableDynamicslbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.dynamicslb.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableDynamicslbResponse());
    }

    /**
     * Description: 云游环境下应用dns的上下线
     * Summary: 云游环境下应用dns的上下线
     */
    public ExecClusterDnsResponse execClusterDns(ExecClusterDnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execClusterDnsEx(request, headers, runtime);
    }

    /**
     * Description: 云游环境下应用dns的上下线
     * Summary: 云游环境下应用dns的上下线
     */
    public ExecClusterDnsResponse execClusterDnsEx(ExecClusterDnsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.cluster.dns.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecClusterDnsResponse());
    }

    /**
     * Description: 云游环境下应用容器的下线
     * Summary: 云游环境下应用容器的下线
     */
    public OfflineClusterContainerResponse offlineClusterContainer(OfflineClusterContainerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineClusterContainerEx(request, headers, runtime);
    }

    /**
     * Description: 云游环境下应用容器的下线
     * Summary: 云游环境下应用容器的下线
     */
    public OfflineClusterContainerResponse offlineClusterContainerEx(OfflineClusterContainerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.cluster.container.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineClusterContainerResponse());
    }

    /**
     * Description: 云游环境下应用容器的上线
     * Summary: 云游环境下应用容器的上线
     */
    public OnlineClusterContainerResponse onlineClusterContainer(OnlineClusterContainerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineClusterContainerEx(request, headers, runtime);
    }

    /**
     * Description: 云游环境下应用容器的上线
     * Summary: 云游环境下应用容器的上线
     */
    public OnlineClusterContainerResponse onlineClusterContainerEx(OnlineClusterContainerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.cluster.container.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineClusterContainerResponse());
    }

    /**
     * Description: 查询应用启动参数
     * Summary: 查询应用启动参数
     */
    public QueryAppparamResponse queryAppparam(QueryAppparamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppparamEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用启动参数
     * Summary: 查询应用启动参数
     */
    public QueryAppparamResponse queryAppparamEx(QueryAppparamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.appparam.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppparamResponse());
    }

    /**
     * Description: 查询产品解决方案的所有发布单
     * Summary: 查询产品解决方案的所有发布单
     */
    public PagequerySolutionOpsplanResponse pagequerySolutionOpsplan(PagequerySolutionOpsplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequerySolutionOpsplanEx(request, headers, runtime);
    }

    /**
     * Description: 查询产品解决方案的所有发布单
     * Summary: 查询产品解决方案的所有发布单
     */
    public PagequerySolutionOpsplanResponse pagequerySolutionOpsplanEx(PagequerySolutionOpsplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solution.opsplan.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequerySolutionOpsplanResponse());
    }

    /**
     * Description: 确认解决方案的各种规划
     * Summary: 确认解决方案规划
     */
    public ConfirmSolutionPlanResponse confirmSolutionPlan(ConfirmSolutionPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmSolutionPlanEx(request, headers, runtime);
    }

    /**
     * Description: 确认解决方案的各种规划
     * Summary: 确认解决方案规划
     */
    public ConfirmSolutionPlanResponse confirmSolutionPlanEx(ConfirmSolutionPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solution.plan.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmSolutionPlanResponse());
    }

    /**
     * Description: 解决方案是否完成规划
     * Summary: 解决方案是否完成规划
     */
    public GetSolutionPlanstatusResponse getSolutionPlanstatus(GetSolutionPlanstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSolutionPlanstatusEx(request, headers, runtime);
    }

    /**
     * Description: 解决方案是否完成规划
     * Summary: 解决方案是否完成规划
     */
    public GetSolutionPlanstatusResponse getSolutionPlanstatusEx(GetSolutionPlanstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.solution.planstatus.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSolutionPlanstatusResponse());
    }

    /**
     * Description: 分页查询迭代详情
     * Summary: 分页查询迭代详情
     */
    public PagequeryProditerationResponse pagequeryProditeration(PagequeryProditerationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryProditerationEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询迭代详情
     * Summary: 分页查询迭代详情
     */
    public PagequeryProditerationResponse pagequeryProditerationEx(PagequeryProditerationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.proditeration.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryProditerationResponse());
    }

    /**
     * Description: 部署单元批量创建
     * Summary: 部署单元批量创建
     */
    public CreateProdinstanceDeployunitbatchResponse createProdinstanceDeployunitbatch(CreateProdinstanceDeployunitbatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProdinstanceDeployunitbatchEx(request, headers, runtime);
    }

    /**
     * Description: 部署单元批量创建
     * Summary: 部署单元批量创建
     */
    public CreateProdinstanceDeployunitbatchResponse createProdinstanceDeployunitbatchEx(CreateProdinstanceDeployunitbatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunitbatch.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProdinstanceDeployunitbatchResponse());
    }

    /**
     * Description: 发布单应用回滚
     * Summary: 发布单应用回滚
     */
    public RollbackOpsAppResponse rollbackOpsApp(RollbackOpsAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackOpsAppEx(request, headers, runtime);
    }

    /**
     * Description: 发布单应用回滚
     * Summary: 发布单应用回滚
     */
    public RollbackOpsAppResponse rollbackOpsAppEx(RollbackOpsAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.ops.app.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackOpsAppResponse());
    }

    /**
     * Description: 发布单产品回滚
     * Summary: 发布单产品回滚
     */
    public RollbackOpsProductResponse rollbackOpsProduct(RollbackOpsProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackOpsProductEx(request, headers, runtime);
    }

    /**
     * Description: 发布单产品回滚
     * Summary: 发布单产品回滚
     */
    public RollbackOpsProductResponse rollbackOpsProductEx(RollbackOpsProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.ops.product.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackOpsProductResponse());
    }

    /**
     * Description: 直接查询集群的pod信息，不是查询云游的基线！
     * Summary: 查询集群pod信息
     */
    public QueryClusterNativepodResponse queryClusterNativepod(QueryClusterNativepodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterNativepodEx(request, headers, runtime);
    }

    /**
     * Description: 直接查询集群的pod信息，不是查询云游的基线！
     * Summary: 查询集群pod信息
     */
    public QueryClusterNativepodResponse queryClusterNativepodEx(QueryClusterNativepodRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.cluster.nativepod.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterNativepodResponse());
    }

    /**
     * Description: 查询基线应用容器
     * Summary: 查询基线应用容器
     */
    public PagequeryBaselineAppcontainersResponse pagequeryBaselineAppcontainers(PagequeryBaselineAppcontainersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryBaselineAppcontainersEx(request, headers, runtime);
    }

    /**
     * Description: 查询基线应用容器
     * Summary: 查询基线应用容器
     */
    public PagequeryBaselineAppcontainersResponse pagequeryBaselineAppcontainersEx(PagequeryBaselineAppcontainersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.baseline.appcontainers.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryBaselineAppcontainersResponse());
    }

    /**
     * Description: 回滚快照查询
     * Summary: 回滚快照查询
     */
    public PagequeryRollbackSnapshotversionResponse pagequeryRollbackSnapshotversion(PagequeryRollbackSnapshotversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryRollbackSnapshotversionEx(request, headers, runtime);
    }

    /**
     * Description: 回滚快照查询
     * Summary: 回滚快照查询
     */
    public PagequeryRollbackSnapshotversionResponse pagequeryRollbackSnapshotversionEx(PagequeryRollbackSnapshotversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "yunyou.yunqing.rollback.snapshotversion.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryRollbackSnapshotversionResponse());
    }
}
