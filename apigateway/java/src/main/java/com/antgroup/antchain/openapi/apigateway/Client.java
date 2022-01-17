// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.apigateway.models.*;
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
                    new TeaPair("sdk_version", "1.1.309")
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
     * Description: 创建API分组
     * Summary: 创建API分组
     */
    public CreateApigroupResponse createApigroup(CreateApigroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApigroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建API分组
     * Summary: 创建API分组
     */
    public CreateApigroupResponse createApigroupEx(CreateApigroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApigroupResponse());
    }

    /**
     * Description: 查询API分组列表
     * Summary: 查询API分组列表
     */
    public AllApigroupResponse allApigroup(AllApigroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allApigroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询API分组列表
     * Summary: 查询API分组列表
     */
    public AllApigroupResponse allApigroupEx(AllApigroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllApigroupResponse());
    }

    /**
     * Description: 查询API分组分页列表
     * Summary: 查询API分组分页列表
     */
    public ListApigroupResponse listApigroup(ListApigroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApigroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询API分组分页列表
     * Summary: 查询API分组分页列表
     */
    public ListApigroupResponse listApigroupEx(ListApigroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApigroupResponse());
    }

    /**
     * Description: 创建后端集群
     * Summary: 创建后端集群
     */
    public CreateSysResponse createSys(CreateSysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSysEx(request, headers, runtime);
    }

    /**
     * Description: 创建后端集群
     * Summary: 创建后端集群
     */
    public CreateSysResponse createSysEx(CreateSysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSysResponse());
    }

    /**
     * Description: 查询后端集群列表
     * Summary: 查询后端集群列表
     */
    public AllSysResponse allSys(AllSysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allSysEx(request, headers, runtime);
    }

    /**
     * Description: 查询后端集群列表
     * Summary: 查询后端集群列表
     */
    public AllSysResponse allSysEx(AllSysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllSysResponse());
    }

    /**
     * Description: 查询后端集群分页列表
     * Summary: 查询后端集群分页列表
     */
    public ListSysResponse listSys(ListSysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSysEx(request, headers, runtime);
    }

    /**
     * Description: 查询后端集群分页列表
     * Summary: 查询后端集群分页列表
     */
    public ListSysResponse listSysEx(ListSysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSysResponse());
    }

    /**
     * Description: 通过ID查询API分组
     * Summary: 通过ID查询API分组
     */
    public GetApigroupResponse getApigroup(GetApigroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApigroupEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询API分组
     * Summary: 通过ID查询API分组
     */
    public GetApigroupResponse getApigroupEx(GetApigroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApigroupResponse());
    }

    /**
     * Description: 更新API分组
     * Summary: 更新API分组
     */
    public UpdateApigroupResponse updateApigroup(UpdateApigroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApigroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新API分组
     * Summary: 更新API分组
     */
    public UpdateApigroupResponse updateApigroupEx(UpdateApigroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApigroupResponse());
    }

    /**
     * Description: 删除API分组
     * Summary: 删除API分组
     */
    public DeleteApigroupResponse deleteApigroup(DeleteApigroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApigroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除API分组
     * Summary: 删除API分组
     */
    public DeleteApigroupResponse deleteApigroupEx(DeleteApigroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApigroupResponse());
    }

    /**
     * Description: 创建API信息
     * Summary: 创建API信息
     */
    public CreateApiResponse createApi(CreateApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiEx(request, headers, runtime);
    }

    /**
     * Description: 创建API信息
     * Summary: 创建API信息
     */
    public CreateApiResponse createApiEx(CreateApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiResponse());
    }

    /**
     * Description: 更新API信息
     * Summary: 更新API信息
     */
    public UpdateApiResponse updateApi(UpdateApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiEx(request, headers, runtime);
    }

    /**
     * Description: 更新API信息
     * Summary: 更新API信息
     */
    public UpdateApiResponse updateApiEx(UpdateApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiResponse());
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表
     */
    public AllApiResponse allApi(AllApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allApiEx(request, headers, runtime);
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表
     */
    public AllApiResponse allApiEx(AllApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllApiResponse());
    }

    /**
     * Description: 查询API分页列表
     * Summary: 查询API分页列表
     */
    public ListApiResponse listApi(ListApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiEx(request, headers, runtime);
    }

    /**
     * Description: 查询API分页列表
     * Summary: 查询API分页列表
     */
    public ListApiResponse listApiEx(ListApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApiResponse());
    }

    /**
     * Description: 通过ID查询API
     * Summary: 通过ID查询API
     */
    public GetApiResponse getApi(GetApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询API
     * Summary: 通过ID查询API
     */
    public GetApiResponse getApiEx(GetApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApiResponse());
    }

    /**
     * Description: 创建App
     * Summary: 创建App
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppEx(request, headers, runtime);
    }

    /**
     * Description: 创建App
     * Summary: 创建App
     */
    public CreateAppResponse createAppEx(CreateAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppResponse());
    }

    /**
     * Description: 更新App信息
     * Summary: 更新App信息
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppEx(request, headers, runtime);
    }

    /**
     * Description: 更新App信息
     * Summary: 更新App信息
     */
    public UpdateAppResponse updateAppEx(UpdateAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppResponse());
    }

    /**
     * Description: 查询App列表
     * Summary: 查询App列表
     */
    public AllAppResponse allApp(AllAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAppEx(request, headers, runtime);
    }

    /**
     * Description: 查询App列表
     * Summary: 查询App列表
     */
    public AllAppResponse allAppEx(AllAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAppResponse());
    }

    /**
     * Description: 查询App分页列表
     * Summary: 查询App分页列表
     */
    public ListAppResponse listApp(ListAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppEx(request, headers, runtime);
    }

    /**
     * Description: 查询App分页列表
     * Summary: 查询App分页列表
     */
    public ListAppResponse listAppEx(ListAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppResponse());
    }

    /**
     * Description: 通过ID查询App
     * Summary: 通过ID查询App
     */
    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询App
     * Summary: 通过ID查询App
     */
    public GetAppResponse getAppEx(GetAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppResponse());
    }

    /**
     * Description: 创建授权App
     * Summary: 创建授权App
     */
    public CreateAuthappResponse createAuthapp(CreateAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 创建授权App
     * Summary: 创建授权App
     */
    public CreateAuthappResponse createAuthappEx(CreateAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthappResponse());
    }

    /**
     * Description: 更新授权App
     * Summary: 更新授权App
     */
    public UpdateAuthappResponse updateAuthapp(UpdateAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 更新授权App
     * Summary: 更新授权App
     */
    public UpdateAuthappResponse updateAuthappEx(UpdateAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAuthappResponse());
    }

    /**
     * Description: 删除授权App
     * Summary: 删除授权App
     */
    public DeleteAuthappResponse deleteAuthapp(DeleteAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 删除授权App
     * Summary: 删除授权App
     */
    public DeleteAuthappResponse deleteAuthappEx(DeleteAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAuthappResponse());
    }

    /**
     * Description: 查询授权App列表
     * Summary: 查询授权App列表
     */
    public AllAuthappResponse allAuthapp(AllAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 查询授权App列表
     * Summary: 查询授权App列表
     */
    public AllAuthappResponse allAuthappEx(AllAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAuthappResponse());
    }

    /**
     * Description: 查询获取授权App分页列表
     * Summary: 查询授权App分页列表
     */
    public ListAuthappResponse listAuthapp(ListAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 查询获取授权App分页列表
     * Summary: 查询授权App分页列表
     */
    public ListAuthappResponse listAuthappEx(ListAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAuthappResponse());
    }

    /**
     * Description: 通过ID查询授权App
     * Summary: 通过ID查询授权App
     */
    public GetAuthappResponse getAuthapp(GetAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询授权App
     * Summary: 通过ID查询授权App
     */
    public GetAuthappResponse getAuthappEx(GetAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAuthappResponse());
    }

    /**
     * Description: 创建路由规则
     * Summary: 创建路由规则
     */
    public CreateRouterResponse createRouter(CreateRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRouterEx(request, headers, runtime);
    }

    /**
     * Description: 创建路由规则
     * Summary: 创建路由规则
     */
    public CreateRouterResponse createRouterEx(CreateRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRouterResponse());
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则
     */
    public UpdateRouterResponse updateRouter(UpdateRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRouterEx(request, headers, runtime);
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则
     */
    public UpdateRouterResponse updateRouterEx(UpdateRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRouterResponse());
    }

    /**
     * Description: 通过ID删除路由规则
     * Summary: 通过ID删除路由规则
     */
    public DeleteRouterResponse deleteRouter(DeleteRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRouterEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID删除路由规则
     * Summary: 通过ID删除路由规则
     */
    public DeleteRouterResponse deleteRouterEx(DeleteRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteRouterResponse());
    }

    /**
     * Description: 查询路由信息列表
     * Summary: 查询路由信息列表
     */
    public AllRouterResponse allRouter(AllRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allRouterEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由信息列表
     * Summary: 查询路由信息列表
     */
    public AllRouterResponse allRouterEx(AllRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllRouterResponse());
    }

    /**
     * Description: 查询路由规则分页列表
     * Summary: 查询路由规则分页列表
     */
    public ListRouterResponse listRouter(ListRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRouterEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由规则分页列表
     * Summary: 查询路由规则分页列表
     */
    public ListRouterResponse listRouterEx(ListRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRouterResponse());
    }

    /**
     * Description: 通过ID查询路由规则
     * Summary: 通过ID查询路由规则
     */
    public GetRouterResponse getRouter(GetRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRouterEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询路由规则
     * Summary: 通过ID查询路由规则
     */
    public GetRouterResponse getRouterEx(GetRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRouterResponse());
    }

    /**
     * Description: 更新后端集群
     * Summary: 更新后端集群
     */
    public UpdateSysResponse updateSys(UpdateSysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSysEx(request, headers, runtime);
    }

    /**
     * Description: 更新后端集群
     * Summary: 更新后端集群
     */
    public UpdateSysResponse updateSysEx(UpdateSysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSysResponse());
    }

    /**
     * Description: 通过ID删除后端集群
     * Summary: 通过ID删除后端集群
     */
    public DeleteSysResponse deleteSys(DeleteSysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSysEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID删除后端集群
     * Summary: 通过ID删除后端集群
     */
    public DeleteSysResponse deleteSysEx(DeleteSysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSysResponse());
    }

    /**
     * Description: 通过ID查询后端集群
     * Summary: 通过ID查询后端集群
     */
    public GetSysResponse getSys(GetSysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSysEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询后端集群
     * Summary: 通过ID查询后端集群
     */
    public GetSysResponse getSysEx(GetSysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSysResponse());
    }

    /**
     * Description: 通过API分组ID查询API列表
     * Summary: 通过API分组ID查询API列表
     */
    public AllApigroupApiResponse allApigroupApi(AllApigroupApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allApigroupApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过API分组ID查询API列表
     * Summary: 通过API分组ID查询API列表
     */
    public AllApigroupApiResponse allApigroupApiEx(AllApigroupApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllApigroupApiResponse());
    }

    /**
     * Description: 通过ID删除App
     * Summary: 通过ID删除App
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID删除App
     * Summary: 通过ID删除App
     */
    public DeleteAppResponse deleteAppEx(DeleteAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppResponse());
    }

    /**
     * Description: 通过ID删除API
     * Summary: 通过ID删除API
     */
    public DeleteApiResponse deleteApi(DeleteApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID删除API
     * Summary: 通过ID删除API
     */
    public DeleteApiResponse deleteApiEx(DeleteApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApiResponse());
    }

    /**
     * Description: 通过API分组ID查询API分页列表
     * Summary: 通过API分组ID查询API分页列表
     */
    public ListApigroupApiResponse listApigroupApi(ListApigroupApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApigroupApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过API分组ID查询API分页列表
     * Summary: 通过API分组ID查询API分页列表
     */
    public ListApigroupApiResponse listApigroupApiEx(ListApigroupApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApigroupApiResponse());
    }

    /**
     * Description: 通过授权App ID查询API分页列表
     * Summary: 通过授权App ID查询API分页列表
     */
    public ListAuthappApiResponse listAuthappApi(ListAuthappApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthappApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过授权App ID查询API分页列表
     * Summary: 通过授权App ID查询API分页列表
     */
    public ListAuthappApiResponse listAuthappApiEx(ListAuthappApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAuthappApiResponse());
    }

    /**
     * Description: 通过后端集群ID查询API列表
     * Summary: 通过后端集群ID查询API列表
     */
    public AllSysApiResponse allSysApi(AllSysApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allSysApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过后端集群ID查询API列表
     * Summary: 通过后端集群ID查询API列表
     */
    public AllSysApiResponse allSysApiEx(AllSysApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllSysApiResponse());
    }

    /**
     * Description: 通过后端集群ID查询API分页列表
     * Summary: 通过后端集群ID查询API分页列表
     */
    public ListSysApiResponse listSysApi(ListSysApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSysApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过后端集群ID查询API分页列表
     * Summary: 通过后端集群ID查询API分页列表
     */
    public ListSysApiResponse listSysApiEx(ListSysApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSysApiResponse());
    }

    /**
     * Description: 通过路由规则ID查询API列表
     * Summary: 通过路由规则ID查询API列表
     */
    public AllRouterApiResponse allRouterApi(AllRouterApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allRouterApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过路由规则ID查询API列表
     * Summary: 通过路由规则ID查询API列表
     */
    public AllRouterApiResponse allRouterApiEx(AllRouterApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllRouterApiResponse());
    }

    /**
     * Description: 通过路由规则ID查询API分页列表
     * Summary: 通过路由规则ID查询API分页列表
     */
    public ListRouterApiResponse listRouterApi(ListRouterApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRouterApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过路由规则ID查询API分页列表
     * Summary: 通过路由规则ID查询API分页列表
     */
    public ListRouterApiResponse listRouterApiEx(ListRouterApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.router.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRouterApiResponse());
    }

    /**
     * Description: 更新API版本号
     * Summary: 更新API版本号
     */
    public UpdateApiVersionnoResponse updateApiVersionno(UpdateApiVersionnoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiVersionnoEx(request, headers, runtime);
    }

    /**
     * Description: 更新API版本号
     * Summary: 更新API版本号
     */
    public UpdateApiVersionnoResponse updateApiVersionnoEx(UpdateApiVersionnoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.versionno.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiVersionnoResponse());
    }

    /**
     * Description: 下线API
     * Summary: 下线API
     */
    public OfflineApiResponse offlineApi(OfflineApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineApiEx(request, headers, runtime);
    }

    /**
     * Description: 下线API
     * Summary: 下线API
     */
    public OfflineApiResponse offlineApiEx(OfflineApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineApiResponse());
    }

    /**
     * Description: 通过授权App ID查询API列表
     * Summary: 通过授权App ID查询API列表
     */
    public AllAuthappApiResponse allAuthappApi(AllAuthappApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAuthappApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过授权App ID查询API列表
     * Summary: 通过授权App ID查询API列表
     */
    public AllAuthappApiResponse allAuthappApiEx(AllAuthappApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAuthappApiResponse());
    }

    /**
     * Description: api挂载授权App
     * Summary: api挂载授权App
     */
    public MountApiAuthappResponse mountApiAuthapp(MountApiAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mountApiAuthappEx(request, headers, runtime);
    }

    /**
     * Description: api挂载授权App
     * Summary: api挂载授权App
     */
    public MountApiAuthappResponse mountApiAuthappEx(MountApiAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.authapp.mount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MountApiAuthappResponse());
    }

    /**
     * Description: 上线API
     * Summary: 上线API
     */
    public OnlineApiResponse onlineApi(OnlineApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineApiEx(request, headers, runtime);
    }

    /**
     * Description: 上线API
     * Summary: 上线API
     */
    public OnlineApiResponse onlineApiEx(OnlineApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineApiResponse());
    }

    /**
     * Description: 通过API ID查询授权App列表
     * Summary: 通过API ID查询授权App列表
     */
    public AllApiAuthappResponse allApiAuthapp(AllApiAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allApiAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 通过API ID查询授权App列表
     * Summary: 通过API ID查询授权App列表
     */
    public AllApiAuthappResponse allApiAuthappEx(AllApiAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.authapp.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllApiAuthappResponse());
    }

    /**
     * Description: 通过API ID查询授权App分页列表
     * Summary: 通过API ID查询授权App分页列表
     */
    public ListApiAuthappResponse listApiAuthapp(ListApiAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 通过API ID查询授权App分页列表
     * Summary: 通过API ID查询授权App分页列表
     */
    public ListApiAuthappResponse listApiAuthappEx(ListApiAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.authapp.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApiAuthappResponse());
    }

    /**
     * Description: 通过App ID查询API列表
     * Summary: 通过App ID查询API列表
     */
    public AllAppApiResponse allAppApi(AllAppApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAppApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过App ID查询API列表
     * Summary: 通过App ID查询API列表
     */
    public AllAppApiResponse allAppApiEx(AllAppApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAppApiResponse());
    }

    /**
     * Description: 通过App ID查询API分页列表
     * Summary: 通过App ID查询API分页列表
     */
    public ListAppApiResponse listAppApi(ListAppApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过App ID查询API分页列表
     * Summary: 通过App ID查询API分页列表
     */
    public ListAppApiResponse listAppApiEx(ListAppApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppApiResponse());
    }

    /**
     * Description: 获取随机密钥
     * Summary: 获取随机密钥
     */
    public GetCommonRandomakskResponse getCommonRandomaksk(GetCommonRandomakskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCommonRandomakskEx(request, headers, runtime);
    }

    /**
     * Description: 获取随机密钥
     * Summary: 获取随机密钥
     */
    public GetCommonRandomakskResponse getCommonRandomakskEx(GetCommonRandomakskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.common.randomaksk.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCommonRandomakskResponse());
    }

    /**
     * Description: 创建联系方式
     * Summary: 创建联系方式
     */
    public CreateContactResponse createContact(CreateContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContactEx(request, headers, runtime);
    }

    /**
     * Description: 创建联系方式
     * Summary: 创建联系方式
     */
    public CreateContactResponse createContactEx(CreateContactRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.contact.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContactResponse());
    }

    /**
     * Description: 更新联系方式
     * Summary: 更新联系方式
     */
    public UpdateContactResponse updateContact(UpdateContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContactEx(request, headers, runtime);
    }

    /**
     * Description: 更新联系方式
     * Summary: 更新联系方式
     */
    public UpdateContactResponse updateContactEx(UpdateContactRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.contact.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContactResponse());
    }

    /**
     * Description: 删除联系方式
     * Summary: 删除联系方式
     */
    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContactEx(request, headers, runtime);
    }

    /**
     * Description: 删除联系方式
     * Summary: 删除联系方式
     */
    public DeleteContactResponse deleteContactEx(DeleteContactRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.contact.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContactResponse());
    }

    /**
     * Description: 通过ID查询联系方式
     * Summary: 通过ID查询联系方式
     */
    public GetContactResponse getContact(GetContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContactEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询联系方式
     * Summary: 通过ID查询联系方式
     */
    public GetContactResponse getContactEx(GetContactRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.contact.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContactResponse());
    }

    /**
     * Description: 查询联系方式分页列表
     * Summary: 查询联系方式分页列表
     */
    public ListContactResponse listContact(ListContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContactEx(request, headers, runtime);
    }

    /**
     * Description: 查询联系方式分页列表
     * Summary: 查询联系方式分页列表
     */
    public ListContactResponse listContactEx(ListContactRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.contact.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContactResponse());
    }

    /**
     * Description: 通过授权App ID查询联系方式列表
     * Summary: 通过授权App ID查询联系方式列表
     */
    public ListContactAuthappResponse listContactAuthapp(ListContactAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContactAuthappEx(request, headers, runtime);
    }

    /**
     * Description: 通过授权App ID查询联系方式列表
     * Summary: 通过授权App ID查询联系方式列表
     */
    public ListContactAuthappResponse listContactAuthappEx(ListContactAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.contact.authapp.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContactAuthappResponse());
    }

    /**
     * Description: api解除授权App
     * Summary: api解除授权App
     */
    public UnmountApiAuthappResponse unmountApiAuthapp(UnmountApiAuthappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unmountApiAuthappEx(request, headers, runtime);
    }

    /**
     * Description: api解除授权App
     * Summary: api解除授权App
     */
    public UnmountApiAuthappResponse unmountApiAuthappEx(UnmountApiAuthappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.authapp.unmount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnmountApiAuthappResponse());
    }

    /**
     * Description: 获取指定版本的api
     * Summary: 获取指定版本的api
     */
    public GetApiVersionapiResponse getApiVersionapi(GetApiVersionapiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiVersionapiEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定版本的api
     * Summary: 获取指定版本的api
     */
    public GetApiVersionapiResponse getApiVersionapiEx(GetApiVersionapiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.versionapi.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApiVersionapiResponse());
    }

    /**
     * Description: 创建cors
     * Summary: 创建cors
     */
    public CreateCorsResponse createCors(CreateCorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCorsEx(request, headers, runtime);
    }

    /**
     * Description: 创建cors
     * Summary: 创建cors
     */
    public CreateCorsResponse createCorsEx(CreateCorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCorsResponse());
    }

    /**
     * Description: 编辑cors
     * Summary: 编辑cors
     */
    public UpdateCorsResponse updateCors(UpdateCorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCorsEx(request, headers, runtime);
    }

    /**
     * Description: 编辑cors
     * Summary: 编辑cors
     */
    public UpdateCorsResponse updateCorsEx(UpdateCorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCorsResponse());
    }

    /**
     * Description: 删除cors
     * Summary: 删除cors
     */
    public DeleteCorsResponse deleteCors(DeleteCorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCorsEx(request, headers, runtime);
    }

    /**
     * Description: 删除cors
     * Summary: 删除cors
     */
    public DeleteCorsResponse deleteCorsEx(DeleteCorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCorsResponse());
    }

    /**
     * Description: 查询cors列表
     * Summary: 查询cors列表
     */
    public AllCorsResponse allCors(AllCorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allCorsEx(request, headers, runtime);
    }

    /**
     * Description: 查询cors列表
     * Summary: 查询cors列表
     */
    public AllCorsResponse allCorsEx(AllCorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllCorsResponse());
    }

    /**
     * Description: 查询cors分页列表
     * Summary: 查询cors分页列表
     */
    public ListCorsResponse listCors(ListCorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCorsEx(request, headers, runtime);
    }

    /**
     * Description: 查询cors分页列表
     * Summary: 查询cors分页列表
     */
    public ListCorsResponse listCorsEx(ListCorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCorsResponse());
    }

    /**
     * Description: 根据ID查询cors
     * Summary: 根据ID查询cors
     */
    public GetCorsResponse getCors(GetCorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCorsEx(request, headers, runtime);
    }

    /**
     * Description: 根据ID查询cors
     * Summary: 根据ID查询cors
     */
    public GetCorsResponse getCorsEx(GetCorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCorsResponse());
    }

    /**
     * Description: 根据 cors ID 查询 API 列表
     * Summary: 根据 cors ID 查询 API 列表
     */
    public AllCorsApiResponse allCorsApi(AllCorsApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allCorsApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据 cors ID 查询 API 列表
     * Summary: 根据 cors ID 查询 API 列表
     */
    public AllCorsApiResponse allCorsApiEx(AllCorsApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllCorsApiResponse());
    }

    /**
     * Description: 根据cors ID查询API分页列表
     * Summary: 根据cors ID查询API分页列表
     */
    public ListCorsApiResponse listCorsApi(ListCorsApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCorsApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据cors ID查询API分页列表
     * Summary: 根据cors ID查询API分页列表
     */
    public ListCorsApiResponse listCorsApiEx(ListCorsApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCorsApiResponse());
    }

    /**
     * Description: 根据cors ID绑定API
     * Summary: 根据cors ID绑定API
     */
    public MountCorsApiResponse mountCorsApi(MountCorsApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mountCorsApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据cors ID绑定API
     * Summary: 根据cors ID绑定API
     */
    public MountCorsApiResponse mountCorsApiEx(MountCorsApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.api.mount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MountCorsApiResponse());
    }

    /**
     * Description: 根据cors ID 解绑API
     * Summary: 根据cors ID 解绑API
     */
    public UnmountCorsApiResponse unmountCorsApi(UnmountCorsApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unmountCorsApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据cors ID 解绑API
     * Summary: 根据cors ID 解绑API
     */
    public UnmountCorsApiResponse unmountCorsApiEx(UnmountCorsApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.cors.api.unmount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnmountCorsApiResponse());
    }

    /**
     * Description: API调试
     * Summary: API调试
     */
    public ExecTestHttpResponse execTestHttp(ExecTestHttpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execTestHttpEx(request, headers, runtime);
    }

    /**
     * Description: API调试
     * Summary: API调试
     */
    public ExecTestHttpResponse execTestHttpEx(ExecTestHttpRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.test.http.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecTestHttpResponse());
    }

    /**
     * Description: 更新授权应用限流
     * Summary: 更新授权应用限流
     */
    public UpdateApiAuthapplimitResponse updateApiAuthapplimit(UpdateApiAuthapplimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiAuthapplimitEx(request, headers, runtime);
    }

    /**
     * Description: 更新授权应用限流
     * Summary: 更新授权应用限流
     */
    public UpdateApiAuthapplimitResponse updateApiAuthapplimitEx(UpdateApiAuthapplimitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.authapplimit.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiAuthapplimitResponse());
    }

    /**
     * Description: 查询授权应用限制
     * Summary: 查询授权应用限制
     */
    public GetApiAuthapplimitResponse getApiAuthapplimit(GetApiAuthapplimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiAuthapplimitEx(request, headers, runtime);
    }

    /**
     * Description: 查询授权应用限制
     * Summary: 查询授权应用限制
     */
    public GetApiAuthapplimitResponse getApiAuthapplimitEx(GetApiAuthapplimitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.authapplimit.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApiAuthapplimitResponse());
    }

    /**
     * Description: 编辑限流配置
     * Summary: 编辑限流配置
     */
    public UpdateApiLimitconfigResponse updateApiLimitconfig(UpdateApiLimitconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiLimitconfigEx(request, headers, runtime);
    }

    /**
     * Description: 编辑限流配置
     * Summary: 编辑限流配置
     */
    public UpdateApiLimitconfigResponse updateApiLimitconfigEx(UpdateApiLimitconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.limitconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiLimitconfigResponse());
    }

    /**
     * Description: 更新缓存信息
     * Summary: 更新缓存信息
     */
    public UpdateApiCacheinfoResponse updateApiCacheinfo(UpdateApiCacheinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiCacheinfoEx(request, headers, runtime);
    }

    /**
     * Description: 更新缓存信息
     * Summary: 更新缓存信息
     */
    public UpdateApiCacheinfoResponse updateApiCacheinfoEx(UpdateApiCacheinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.cacheinfo.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiCacheinfoResponse());
    }

    /**
     * Description: 查询监控
     * Summary: 查询监控
     */
    public QueryMonitorResponse queryMonitor(QueryMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMonitorEx(request, headers, runtime);
    }

    /**
     * Description: 查询监控
     * Summary: 查询监控
     */
    public QueryMonitorResponse queryMonitorEx(QueryMonitorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.monitor.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMonitorResponse());
    }

    /**
     * Description: 查询结果码
     * Summary: 查询结果码
     */
    public QueryResultcodeResponse queryResultcode(QueryResultcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResultcodeEx(request, headers, runtime);
    }

    /**
     * Description: 查询结果码
     * Summary: 查询结果码
     */
    public QueryResultcodeResponse queryResultcodeEx(QueryResultcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.resultcode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResultcodeResponse());
    }

    /**
     * Description: 上线指定版本api
     * Summary: 上线指定版本api
     */
    public OnlineApiVersionResponse onlineApiVersion(OnlineApiVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineApiVersionEx(request, headers, runtime);
    }

    /**
     * Description: 上线指定版本api
     * Summary: 上线指定版本api
     */
    public OnlineApiVersionResponse onlineApiVersionEx(OnlineApiVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.version.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineApiVersionResponse());
    }

    /**
     * Description: 创建LDC规则
     * Summary: 创建LDC规则
     */
    public CreateLdcResponse createLdc(CreateLdcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLdcEx(request, headers, runtime);
    }

    /**
     * Description: 创建LDC规则
     * Summary: 创建LDC规则
     */
    public CreateLdcResponse createLdcEx(CreateLdcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.ldc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLdcResponse());
    }

    /**
     * Description: 修改 LDC规则
     * Summary: 修改 LDC规则
     */
    public UpdateLdcResponse updateLdc(UpdateLdcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLdcEx(request, headers, runtime);
    }

    /**
     * Description: 修改 LDC规则
     * Summary: 修改 LDC规则
     */
    public UpdateLdcResponse updateLdcEx(UpdateLdcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.ldc.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLdcResponse());
    }

    /**
     * Description: 删除LDC规则
     * Summary: 删除LDC规则
     */
    public DeleteLdcResponse deleteLdc(DeleteLdcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLdcEx(request, headers, runtime);
    }

    /**
     * Description: 删除LDC规则
     * Summary: 删除LDC规则
     */
    public DeleteLdcResponse deleteLdcEx(DeleteLdcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.ldc.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteLdcResponse());
    }

    /**
     * Description: 查询ldc规则
     * Summary: 查询ldc规则
     */
    public GetLdcResponse getLdc(GetLdcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLdcEx(request, headers, runtime);
    }

    /**
     * Description: 查询ldc规则
     * Summary: 查询ldc规则
     */
    public GetLdcResponse getLdcEx(GetLdcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.ldc.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLdcResponse());
    }

    /**
     * Description: 保存ldc规则
     * Summary: 保存ldc规则
     */
    public SaveLdcResponse saveLdc(SaveLdcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveLdcEx(request, headers, runtime);
    }

    /**
     * Description: 保存ldc规则
     * Summary: 保存ldc规则
     */
    public SaveLdcResponse saveLdcEx(SaveLdcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.ldc.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveLdcResponse());
    }

    /**
     * Description: 授权APP绑定API
     * Summary: 授权APP绑定API
     */
    public MountAuthappApiResponse mountAuthappApi(MountAuthappApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mountAuthappApiEx(request, headers, runtime);
    }

    /**
     * Description: 授权APP绑定API
     * Summary: 授权APP绑定API
     */
    public MountAuthappApiResponse mountAuthappApiEx(MountAuthappApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.api.mount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MountAuthappApiResponse());
    }

    /**
     * Description: 授权app解除绑定Api
     * Summary: 授权app解除绑定Api
     */
    public UnmountAuthappApiResponse unmountAuthappApi(UnmountAuthappApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unmountAuthappApiEx(request, headers, runtime);
    }

    /**
     * Description: 授权app解除绑定Api
     * Summary: 授权app解除绑定Api
     */
    public UnmountAuthappApiResponse unmountAuthappApiEx(UnmountAuthappApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.authapp.api.unmount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnmountAuthappApiResponse());
    }

    /**
     * Description: 导入 API
     * Summary: 导入 API
     */
    public ImportApiResponse importApi(ImportApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importApiEx(request, headers, runtime);
    }

    /**
     * Description: 导入 API
     * Summary: 导入 API
     */
    public ImportApiResponse importApiEx(ImportApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportApiResponse());
    }

    /**
     * Description: api批量导出
     * Summary: api批量导出
     */
    public ExportApiResponse exportApi(ExportApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportApiEx(request, headers, runtime);
    }

    /**
     * Description: api批量导出
     * Summary: api批量导出
     */
    public ExportApiResponse exportApiEx(ExportApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportApiResponse());
    }

    /**
     * Description: 根据API分组ID导出API
     * Summary: 根据API分组ID导出API
     */
    public ExportApigroupApiResponse exportApigroupApi(ExportApigroupApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportApigroupApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据API分组ID导出API
     * Summary: 根据API分组ID导出API
     */
    public ExportApigroupApiResponse exportApigroupApiEx(ExportApigroupApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.api.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportApigroupApiResponse());
    }

    /**
     * Description: 创建参数映射
     * Summary: 创建参数映射
     */
    public CreateParammappingResponse createParammapping(CreateParammappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createParammappingEx(request, headers, runtime);
    }

    /**
     * Description: 创建参数映射
     * Summary: 创建参数映射
     */
    public CreateParammappingResponse createParammappingEx(CreateParammappingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.parammapping.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateParammappingResponse());
    }

    /**
     * Description:  更新参数映射
     * Summary:  更新参数映射
     */
    public UpdateParammappingResponse updateParammapping(UpdateParammappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateParammappingEx(request, headers, runtime);
    }

    /**
     * Description:  更新参数映射
     * Summary:  更新参数映射
     */
    public UpdateParammappingResponse updateParammappingEx(UpdateParammappingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.parammapping.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateParammappingResponse());
    }

    /**
     * Description: 删除参数映射
     * Summary: 删除参数映射
     */
    public DeleteParammappingResponse deleteParammapping(DeleteParammappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteParammappingEx(request, headers, runtime);
    }

    /**
     * Description: 删除参数映射
     * Summary: 删除参数映射
     */
    public DeleteParammappingResponse deleteParammappingEx(DeleteParammappingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.parammapping.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteParammappingResponse());
    }

    /**
     * Description: 查询参数映射分页列表
     * Summary: 查询参数映射分页列表
     */
    public ListParammappingResponse listParammapping(ListParammappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listParammappingEx(request, headers, runtime);
    }

    /**
     * Description: 查询参数映射分页列表
     * Summary: 查询参数映射分页列表
     */
    public ListParammappingResponse listParammappingEx(ListParammappingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.parammapping.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListParammappingResponse());
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表
     */
    public AllParammappingResponse allParammapping(AllParammappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allParammappingEx(request, headers, runtime);
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表
     */
    public AllParammappingResponse allParammappingEx(AllParammappingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.parammapping.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllParammappingResponse());
    }

    /**
     * Description: 通过IDF查询参数映射
     * Summary: 通过IDF查询参数映射
     */
    public GetParammappingResponse getParammapping(GetParammappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getParammappingEx(request, headers, runtime);
    }

    /**
     * Description: 通过IDF查询参数映射
     * Summary: 通过IDF查询参数映射
     */
    public GetParammappingResponse getParammappingEx(GetParammappingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.parammapping.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetParammappingResponse());
    }

    /**
     * Description: 根据映射参数ID查询api分页列表
     * Summary: 根据映射参数ID查询api分页列表
     */
    public ListParammappingApiResponse listParammappingApi(ListParammappingApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listParammappingApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据映射参数ID查询api分页列表
     * Summary: 根据映射参数ID查询api分页列表
     */
    public ListParammappingApiResponse listParammappingApiEx(ListParammappingApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.parammapping.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListParammappingApiResponse());
    }

    /**
     * Description: 查询模型列表
     * Summary: 查询模型列表
     */
    public AllApimodelResponse allApimodel(AllApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 查询模型列表
     * Summary: 查询模型列表
     */
    public AllApimodelResponse allApimodelEx(AllApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllApimodelResponse());
    }

    /**
     * Description: 查询api模板分页列表
     * Summary: 查询模型分页列表
     */
    public ListApimodelResponse listApimodel(ListApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 查询api模板分页列表
     * Summary: 查询模型分页列表
     */
    public ListApimodelResponse listApimodelEx(ListApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApimodelResponse());
    }

    /**
     * Description: 创建api模型
     * Summary: 创建api模型
     */
    public CreateApimodelResponse createApimodel(CreateApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 创建api模型
     * Summary: 创建api模型
     */
    public CreateApimodelResponse createApimodelEx(CreateApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApimodelResponse());
    }

    /**
     * Description: 删除api模型
     * Summary: 删除api模型
     */
    public DeleteApimodelResponse deleteApimodel(DeleteApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 删除api模型
     * Summary: 删除api模型
     */
    public DeleteApimodelResponse deleteApimodelEx(DeleteApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApimodelResponse());
    }

    /**
     * Description: 根据模型ID查询模型
     * Summary: 根据模型ID查询模型
     */
    public GetApimodelResponse getApimodel(GetApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 根据模型ID查询模型
     * Summary: 根据模型ID查询模型
     */
    public GetApimodelResponse getApimodelEx(GetApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApimodelResponse());
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型
     */
    public UpdateApimodelResponse updateApimodel(UpdateApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型
     */
    public UpdateApimodelResponse updateApimodelEx(UpdateApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApimodelResponse());
    }

    /**
     * Description: 通过模型ID查询使用的API列表
     * Summary: 通过模型ID查询使用的API列表
     */
    public AllApimodelApiResponse allApimodelApi(AllApimodelApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allApimodelApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过模型ID查询使用的API列表
     * Summary: 通过模型ID查询使用的API列表
     */
    public AllApimodelApiResponse allApimodelApiEx(AllApimodelApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllApimodelApiResponse());
    }

    /**
     * Description: 通过模型ID查询使用的API分页列表
     * Summary: 通过模型ID查询使用的API分页列表
     */
    public ListApimodelApiResponse listApimodelApi(ListApimodelApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApimodelApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过模型ID查询使用的API分页列表
     * Summary: 通过模型ID查询使用的API分页列表
     */
    public ListApimodelApiResponse listApimodelApiEx(ListApimodelApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApimodelApiResponse());
    }

    /**
     * Description: 创建外部授权
     * Summary: 创建外部授权
     */
    public CreateExternalauthResponse createExternalauth(CreateExternalauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExternalauthEx(request, headers, runtime);
    }

    /**
     * Description: 创建外部授权
     * Summary: 创建外部授权
     */
    public CreateExternalauthResponse createExternalauthEx(CreateExternalauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateExternalauthResponse());
    }

    /**
     * Description: 更新外部系统
     * Summary: 更新外部系统
     */
    public UpdateExternalauthResponse updateExternalauth(UpdateExternalauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExternalauthEx(request, headers, runtime);
    }

    /**
     * Description: 更新外部系统
     * Summary: 更新外部系统
     */
    public UpdateExternalauthResponse updateExternalauthEx(UpdateExternalauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateExternalauthResponse());
    }

    /**
     * Description: 删除外部授权
     * Summary: 删除外部授权
     */
    public DeleteExternalauthResponse deleteExternalauth(DeleteExternalauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExternalauthEx(request, headers, runtime);
    }

    /**
     * Description: 删除外部授权
     * Summary: 删除外部授权
     */
    public DeleteExternalauthResponse deleteExternalauthEx(DeleteExternalauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteExternalauthResponse());
    }

    /**
     * Description: 通过ID查询外部授权
     * Summary: 通过ID查询外部授权
     */
    public GetExternalauthResponse getExternalauth(GetExternalauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExternalauthEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询外部授权
     * Summary: 通过ID查询外部授权
     */
    public GetExternalauthResponse getExternalauthEx(GetExternalauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetExternalauthResponse());
    }

    /**
     * Description: 查询外部授权分页列表
     * Summary: 查询外部授权分页列表
     */
    public ListExternalauthResponse listExternalauth(ListExternalauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExternalauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询外部授权分页列表
     * Summary: 查询外部授权分页列表
     */
    public ListExternalauthResponse listExternalauthEx(ListExternalauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListExternalauthResponse());
    }

    /**
     * Description:  查询外部系统列表
     * Summary:  查询外部系统列表
     */
    public AllExternalauthResponse allExternalauth(AllExternalauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allExternalauthEx(request, headers, runtime);
    }

    /**
     * Description:  查询外部系统列表
     * Summary:  查询外部系统列表
     */
    public AllExternalauthResponse allExternalauthEx(AllExternalauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllExternalauthResponse());
    }

    /**
     * Description: 外部授权绑定api
     * Summary: 外部授权绑定api
     */
    public MountExternalauthApiResponse mountExternalauthApi(MountExternalauthApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mountExternalauthApiEx(request, headers, runtime);
    }

    /**
     * Description: 外部授权绑定api
     * Summary: 外部授权绑定api
     */
    public MountExternalauthApiResponse mountExternalauthApiEx(MountExternalauthApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.api.mount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MountExternalauthApiResponse());
    }

    /**
     * Description: 外部授权解绑api
     * Summary: 外部授权解绑api
     */
    public UnmountExternalauthApiResponse unmountExternalauthApi(UnmountExternalauthApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unmountExternalauthApiEx(request, headers, runtime);
    }

    /**
     * Description: 外部授权解绑api
     * Summary: 外部授权解绑api
     */
    public UnmountExternalauthApiResponse unmountExternalauthApiEx(UnmountExternalauthApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.api.unmount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnmountExternalauthApiResponse());
    }

    /**
     * Description: 删除模型参数
     * Summary: 删除模型参数
     */
    public DeleteApimodelParamResponse deleteApimodelParam(DeleteApimodelParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApimodelParamEx(request, headers, runtime);
    }

    /**
     * Description: 删除模型参数
     * Summary: 删除模型参数
     */
    public DeleteApimodelParamResponse deleteApimodelParamEx(DeleteApimodelParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.param.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApimodelParamResponse());
    }

    /**
     * Description: 更新模型参数
     * Summary: 更新模型参数
     */
    public UpdateApimodelParamResponse updateApimodelParam(UpdateApimodelParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApimodelParamEx(request, headers, runtime);
    }

    /**
     * Description: 更新模型参数
     * Summary: 更新模型参数
     */
    public UpdateApimodelParamResponse updateApimodelParamEx(UpdateApimodelParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.param.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApimodelParamResponse());
    }

    /**
     * Description: 新增模型参数
     * Summary: 新增模型参数
     */
    public CreateApimodelParamResponse createApimodelParam(CreateApimodelParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApimodelParamEx(request, headers, runtime);
    }

    /**
     * Description: 新增模型参数
     * Summary: 新增模型参数
     */
    public CreateApimodelParamResponse createApimodelParamEx(CreateApimodelParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.param.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApimodelParamResponse());
    }

    /**
     * Description: 通过外部授权ID查询API分页列表
     * Summary: 通过外部授权ID查询API分页列表
     */
    public ListExternalauthApiResponse listExternalauthApi(ListExternalauthApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExternalauthApiEx(request, headers, runtime);
    }

    /**
     * Description: 通过外部授权ID查询API分页列表
     * Summary: 通过外部授权ID查询API分页列表
     */
    public ListExternalauthApiResponse listExternalauthApiEx(ListExternalauthApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.externalauth.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListExternalauthApiResponse());
    }

    /**
     * Description: 校检 模型引用是否死循环
     * Summary: 校检 模型引用是否死循环
     */
    public CheckApimodelParamResponse checkApimodelParam(CheckApimodelParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkApimodelParamEx(request, headers, runtime);
    }

    /**
     * Description: 校检 模型引用是否死循环
     * Summary: 校检 模型引用是否死循环
     */
    public CheckApimodelParamResponse checkApimodelParamEx(CheckApimodelParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.param.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckApimodelParamResponse());
    }

    /**
     * Description: 解析数据模型
     * Summary: 解析数据模型
     */
    public ResolveApimodelResponse resolveApimodel(ResolveApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resolveApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 解析数据模型
     * Summary: 解析数据模型
     */
    public ResolveApimodelResponse resolveApimodelEx(ResolveApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.resolve", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResolveApimodelResponse());
    }

    /**
     * Description: 侯志波
     * Summary: 导入数据模型
     */
    public ImportApimodelResponse importApimodel(ImportApimodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importApimodelEx(request, headers, runtime);
    }

    /**
     * Description: 侯志波
     * Summary: 导入数据模型
     */
    public ImportApimodelResponse importApimodelEx(ImportApimodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportApimodelResponse());
    }

    /**
     * Description: mgs模型转换 为网关模型
     * Summary: （mgs模型数据迁移）转换 为网关模型
     */
    public ApplyApimodelMgsResponse applyApimodelMgs(ApplyApimodelMgsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyApimodelMgsEx(request, headers, runtime);
    }

    /**
     * Description: mgs模型转换 为网关模型
     * Summary: （mgs模型数据迁移）转换 为网关模型
     */
    public ApplyApimodelMgsResponse applyApimodelMgsEx(ApplyApimodelMgsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.mgs.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyApimodelMgsResponse());
    }

    /**
     * Description: 查询操作人分页列表
     * Summary: 查询操作人分页列表
     */
    public ListOperatorResponse listOperator(ListOperatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 查询操作人分页列表
     * Summary: 查询操作人分页列表
     */
    public ListOperatorResponse listOperatorEx(ListOperatorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.operator.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListOperatorResponse());
    }

    /**
     * Description: 更新api分组授权用户配置
     * Summary: 更新api分组授权用户配置
     */
    public UpdateApigroupAuthuserconfigResponse updateApigroupAuthuserconfig(UpdateApigroupAuthuserconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApigroupAuthuserconfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新api分组授权用户配置
     * Summary: 更新api分组授权用户配置
     */
    public UpdateApigroupAuthuserconfigResponse updateApigroupAuthuserconfigEx(UpdateApigroupAuthuserconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.authuserconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApigroupAuthuserconfigResponse());
    }

    /**
     * Description: 查询api分组授权用户配置
     * Summary: 查询api分组授权用户配置
     */
    public GetApigroupAuthuserconfigResponse getApigroupAuthuserconfig(GetApigroupAuthuserconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApigroupAuthuserconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询api分组授权用户配置
     * Summary: 查询api分组授权用户配置
     */
    public GetApigroupAuthuserconfigResponse getApigroupAuthuserconfigEx(GetApigroupAuthuserconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.authuserconfig.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApigroupAuthuserconfigResponse());
    }

    /**
     * Description: api分组添加用户
     * Summary: api分组添加用户
     */
    public AddApigroupAuthuserResponse addApigroupAuthuser(AddApigroupAuthuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addApigroupAuthuserEx(request, headers, runtime);
    }

    /**
     * Description: api分组添加用户
     * Summary: api分组添加用户
     */
    public AddApigroupAuthuserResponse addApigroupAuthuserEx(AddApigroupAuthuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddApigroupAuthuserResponse());
    }

    /**
     * Description:  api分组授权用户使用权限
     * Summary:  api分组授权用户使用权限
     */
    public MountApigroupAuthuserResponse mountApigroupAuthuser(MountApigroupAuthuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mountApigroupAuthuserEx(request, headers, runtime);
    }

    /**
     * Description:  api分组授权用户使用权限
     * Summary:  api分组授权用户使用权限
     */
    public MountApigroupAuthuserResponse mountApigroupAuthuserEx(MountApigroupAuthuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.mount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MountApigroupAuthuserResponse());
    }

    /**
     * Description: 
    api解除用户使用权限
     * Summary:  api解除用户使用权限
     */
    public UnmountApigroupAuthuserResponse unmountApigroupAuthuser(UnmountApigroupAuthuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unmountApigroupAuthuserEx(request, headers, runtime);
    }

    /**
     * Description: 
    api解除用户使用权限
     * Summary:  api解除用户使用权限
     */
    public UnmountApigroupAuthuserResponse unmountApigroupAuthuserEx(UnmountApigroupAuthuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.unmount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnmountApigroupAuthuserResponse());
    }

    /**
     * Description: 查询api分组授权用户分页列表
     * Summary: 查询api分组授权用户分页列表
     */
    public ListApigroupAuthuserResponse listApigroupAuthuser(ListApigroupAuthuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApigroupAuthuserEx(request, headers, runtime);
    }

    /**
     * Description: 查询api分组授权用户分页列表
     * Summary: 查询api分组授权用户分页列表
     */
    public ListApigroupAuthuserResponse listApigroupAuthuserEx(ListApigroupAuthuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApigroupAuthuserResponse());
    }

    /**
     * Description: api分组删除用户
     * Summary: api分组删除用户
     */
    public DeleteApigroupAuthuserResponse deleteApigroupAuthuser(DeleteApigroupAuthuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApigroupAuthuserEx(request, headers, runtime);
    }

    /**
     * Description: api分组删除用户
     * Summary: api分组删除用户
     */
    public DeleteApigroupAuthuserResponse deleteApigroupAuthuserEx(DeleteApigroupAuthuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApigroupAuthuserResponse());
    }

    /**
     * Description: 校验是否有api分组权限
     * Summary: 校验是否有api分组权限
     */
    public VerifyApiApigroupResponse verifyApiApigroup(VerifyApiApigroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyApiApigroupEx(request, headers, runtime);
    }

    /**
     * Description: 校验是否有api分组权限
     * Summary: 校验是否有api分组权限
     */
    public VerifyApiApigroupResponse verifyApiApigroupEx(VerifyApiApigroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.apigroup.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyApiApigroupResponse());
    }

    /**
     * Description: 修改app绑定api加密状态
     * Summary: 修改app绑定api加密状态
     */
    public UpdateAppAuthapiResponse updateAppAuthapi(UpdateAppAuthapiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppAuthapiEx(request, headers, runtime);
    }

    /**
     * Description: 修改app绑定api加密状态
     * Summary: 修改app绑定api加密状态
     */
    public UpdateAppAuthapiResponse updateAppAuthapiEx(UpdateAppAuthapiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.app.authapi.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppAuthapiResponse());
    }

    /**
     * Description: 配置zone
     * Summary: 全局配置zone
     */
    public CreateGwconfigResponse createGwconfig(CreateGwconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGwconfigEx(request, headers, runtime);
    }

    /**
     * Description: 配置zone
     * Summary: 全局配置zone
     */
    public CreateGwconfigResponse createGwconfigEx(CreateGwconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateGwconfigResponse());
    }

    /**
     * Description: 查询全局网关配置
     * Summary: 查询全局网关配置
     */
    public GetGwconfigResponse getGwconfig(GetGwconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询全局网关配置
     * Summary: 查询全局网关配置
     */
    public GetGwconfigResponse getGwconfigEx(GetGwconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGwconfigResponse());
    }

    /**
     * Description: 更新全局网关配置
     * Summary: 更新全局网关配置
     */
    public UpdateGwconfigResponse updateGwconfig(UpdateGwconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGwconfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新全局网关配置
     * Summary: 更新全局网关配置
     */
    public UpdateGwconfigResponse updateGwconfigEx(UpdateGwconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGwconfigResponse());
    }

    /**
     * Description: 查询全局网关列表
     * Summary: 查询全局网关列表
     */
    public AllGwconfigResponse allGwconfig(AllGwconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allGwconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询全局网关列表
     * Summary: 查询全局网关列表
     */
    public AllGwconfigResponse allGwconfigEx(AllGwconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllGwconfigResponse());
    }

    /**
     * Description: 查询instance_id
     * Summary: 查询instance_id
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询instance_id
     * Summary: 查询instance_id
     */
    public GetInstanceResponse getInstanceEx(GetInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.instance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInstanceResponse());
    }

    /**
     * Description: 删除zone、网关效验
     * Summary: 删除zone、网关效验
     */
    public CheckGwconfigDeleteResponse checkGwconfigDelete(CheckGwconfigDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkGwconfigDeleteEx(request, headers, runtime);
    }

    /**
     * Description: 删除zone、网关效验
     * Summary: 删除zone、网关效验
     */
    public CheckGwconfigDeleteResponse checkGwconfigDeleteEx(CheckGwconfigDeleteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.delete.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckGwconfigDeleteResponse());
    }

    /**
     * Description: 更新zone、网关效验
     * Summary: 更新zone、网关效验
     */
    public CheckGwconfigUpdateResponse checkGwconfigUpdate(CheckGwconfigUpdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkGwconfigUpdateEx(request, headers, runtime);
    }

    /**
     * Description: 更新zone、网关效验
     * Summary: 更新zone、网关效验
     */
    public CheckGwconfigUpdateResponse checkGwconfigUpdateEx(CheckGwconfigUpdateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.update.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckGwconfigUpdateResponse());
    }

    /**
     * Description: 创建跨云互通代理模式
     * Summary: 创建跨云互通代理模式
     */
    public CreateApiGwconfigResponse createApiGwconfig(CreateApiGwconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiGwconfigEx(request, headers, runtime);
    }

    /**
     * Description: 创建跨云互通代理模式
     * Summary: 创建跨云互通代理模式
     */
    public CreateApiGwconfigResponse createApiGwconfigEx(CreateApiGwconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.gwconfig.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiGwconfigResponse());
    }

    /**
     * Description: 更新跨云互通API
     * Summary: 更新跨云互通API
     */
    public UpdateApiGwconfigResponse updateApiGwconfig(UpdateApiGwconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiGwconfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新跨云互通API
     * Summary: 更新跨云互通API
     */
    public UpdateApiGwconfigResponse updateApiGwconfigEx(UpdateApiGwconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.gwconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiGwconfigResponse());
    }

    /**
     * Description: 录入api时的参数效验
     * Summary: 录入api时的参数效验
     */
    public CheckApiResponse checkApi(CheckApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkApiEx(request, headers, runtime);
    }

    /**
     * Description: 录入api时的参数效验
     * Summary: 录入api时的参数效验
     */
    public CheckApiResponse checkApiEx(CheckApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckApiResponse());
    }

    /**
     * Description: 系统集群修改校验
     * Summary: 系统集群修改校验是否可修改
     */
    public CheckSysUpdateResponse checkSysUpdate(CheckSysUpdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSysUpdateEx(request, headers, runtime);
    }

    /**
     * Description: 系统集群修改校验
     * Summary: 系统集群修改校验是否可修改
     */
    public CheckSysUpdateResponse checkSysUpdateEx(CheckSysUpdateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.sys.update.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSysUpdateResponse());
    }

    /**
     * Description: api查看历史版本信息
     * Summary: api查看历史版本信息
     */
    public GetApiHistoryversionapiResponse getApiHistoryversionapi(GetApiHistoryversionapiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiHistoryversionapiEx(request, headers, runtime);
    }

    /**
     * Description: api查看历史版本信息
     * Summary: api查看历史版本信息
     */
    public GetApiHistoryversionapiResponse getApiHistoryversionapiEx(GetApiHistoryversionapiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.historyversionapi.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApiHistoryversionapiResponse());
    }

    /**
     * Description: 查询策略列表
     * Summary: 查询策略列表
     */
    public AllStrategyResponse allStrategy(AllStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 查询策略列表
     * Summary: 查询策略列表
     */
    public AllStrategyResponse allStrategyEx(AllStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllStrategyResponse());
    }

    /**
     * Description: 根据strategyID查询API列表
     * Summary: 根据strategyID查询API列表
     */
    public AllStrategyApiResponse allStrategyApi(AllStrategyApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allStrategyApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据strategyID查询API列表
     * Summary: 根据strategyID查询API列表
     */
    public AllStrategyApiResponse allStrategyApiEx(AllStrategyApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.api.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllStrategyApiResponse());
    }

    /**
     * Description: 根据strategyID查询API分页
     * Summary: 根据strategyID查询API分页
     */
    public ListStrategyApiResponse listStrategyApi(ListStrategyApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStrategyApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据strategyID查询API分页
     * Summary: 根据strategyID查询API分页
     */
    public ListStrategyApiResponse listStrategyApiEx(ListStrategyApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.api.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListStrategyApiResponse());
    }

    /**
     * Description:  根据strategy ID绑定API
     * Summary:  根据strategy ID绑定API
     */
    public MountStrategyApiResponse mountStrategyApi(MountStrategyApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mountStrategyApiEx(request, headers, runtime);
    }

    /**
     * Description:  根据strategy ID绑定API
     * Summary:  根据strategy ID绑定API
     */
    public MountStrategyApiResponse mountStrategyApiEx(MountStrategyApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.api.mount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MountStrategyApiResponse());
    }

    /**
     * Description: 根据strategyID 解绑API
     * Summary: 根据strategyID 解绑API
     */
    public UnmountStrategyApiResponse unmountStrategyApi(UnmountStrategyApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unmountStrategyApiEx(request, headers, runtime);
    }

    /**
     * Description: 根据strategyID 解绑API
     * Summary: 根据strategyID 解绑API
     */
    public UnmountStrategyApiResponse unmountStrategyApiEx(UnmountStrategyApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.api.unmount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnmountStrategyApiResponse());
    }

    /**
     * Description:  创建策略
     * Summary:  创建策略
     */
    public CreateStrategyResponse createStrategy(CreateStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStrategyEx(request, headers, runtime);
    }

    /**
     * Description:  创建策略
     * Summary:  创建策略
     */
    public CreateStrategyResponse createStrategyEx(CreateStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStrategyResponse());
    }

    /**
     * Description: 删除策略
     * Summary: 删除策略
     */
    public DeleteStrategyResponse deleteStrategy(DeleteStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 删除策略
     * Summary: 删除策略
     */
    public DeleteStrategyResponse deleteStrategyEx(DeleteStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteStrategyResponse());
    }

    /**
     * Description: 根据ID查询strategy
     * Summary: 根据ID查询strategy
     */
    public GetStrategyResponse getStrategy(GetStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 根据ID查询strategy
     * Summary: 根据ID查询strategy
     */
    public GetStrategyResponse getStrategyEx(GetStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetStrategyResponse());
    }

    /**
     * Description: 查询strategy分页列表
     * Summary: 查询strategy分页列表
     */
    public ListStrategyResponse listStrategy(ListStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 查询strategy分页列表
     * Summary: 查询strategy分页列表
     */
    public ListStrategyResponse listStrategyEx(ListStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListStrategyResponse());
    }

    /**
     * Description:  编辑strategy
     * Summary:  编辑strategy
     */
    public UpdateStrategyResponse updateStrategy(UpdateStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStrategyEx(request, headers, runtime);
    }

    /**
     * Description:  编辑strategy
     * Summary:  编辑strategy
     */
    public UpdateStrategyResponse updateStrategyEx(UpdateStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.strategy.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateStrategyResponse());
    }

    /**
     * Description: 查询数量
     * Summary: 查询数量
     */
    public GetHomeResponse getHome(GetHomeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHomeEx(request, headers, runtime);
    }

    /**
     * Description: 查询数量
     * Summary: 查询数量
     */
    public GetHomeResponse getHomeEx(GetHomeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.home.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetHomeResponse());
    }

    /**
     * Description: 录入域名时的效验
     * Summary: 录入域名时的效验
     */
    public CheckApigroupDomainResponse checkApigroupDomain(CheckApigroupDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkApigroupDomainEx(request, headers, runtime);
    }

    /**
     * Description: 录入域名时的效验
     * Summary: 录入域名时的效验
     */
    public CheckApigroupDomainResponse checkApigroupDomainEx(CheckApigroupDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.domain.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckApigroupDomainResponse());
    }

    /**
     * Description: 查询域名后缀
     * Summary: 查询域名后缀
     */
    public GetApigroupDomainResponse getApigroupDomain(GetApigroupDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApigroupDomainEx(request, headers, runtime);
    }

    /**
     * Description: 查询域名后缀
     * Summary: 查询域名后缀
     */
    public GetApigroupDomainResponse getApigroupDomainEx(GetApigroupDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apigroup.domain.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApigroupDomainResponse());
    }

    /**
     * Description: 查看api生成的swagger文档
     * Summary: 查看api生成的swagger文档
     */
    public GetApiSwaggerResponse getApiSwagger(GetApiSwaggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiSwaggerEx(request, headers, runtime);
    }

    /**
     * Description: 查看api生成的swagger文档
     * Summary: 查看api生成的swagger文档
     */
    public GetApiSwaggerResponse getApiSwaggerEx(GetApiSwaggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.swagger.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApiSwaggerResponse());
    }

    /**
     * Description: api文档下载
     * Summary: api文档下载
     */
    public DownloadApiSwaggerResponse downloadApiSwagger(DownloadApiSwaggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadApiSwaggerEx(request, headers, runtime);
    }

    /**
     * Description: api文档下载
     * Summary: api文档下载
     */
    public DownloadApiSwaggerResponse downloadApiSwaggerEx(DownloadApiSwaggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.api.swagger.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadApiSwaggerResponse());
    }

    /**
     * Description: 代码生成
     * Summary: 代码生成
     */
    public DownloadApimodelCodegenResponse downloadApimodelCodegen(DownloadApimodelCodegenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadApimodelCodegenEx(request, headers, runtime);
    }

    /**
     * Description: 代码生成
     * Summary: 代码生成
     */
    public DownloadApimodelCodegenResponse downloadApimodelCodegenEx(DownloadApimodelCodegenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.codegen.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadApimodelCodegenResponse());
    }

    /**
     * Description: 获取双网模块开关
     * Summary: 获取双网模块开关
     */
    public GetGwconfigGatewayswitchResponse getGwconfigGatewayswitch(GetGwconfigGatewayswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwconfigGatewayswitchEx(request, headers, runtime);
    }

    /**
     * Description: 获取双网模块开关
     * Summary: 获取双网模块开关
     */
    public GetGwconfigGatewayswitchResponse getGwconfigGatewayswitchEx(GetGwconfigGatewayswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.gatewayswitch.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGwconfigGatewayswitchResponse());
    }

    /**
     * Description: 查询注册中心列表
     * Summary: 查询注册中心列表
     */
    public AllRegistryResponse allRegistry(AllRegistryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allRegistryEx(request, headers, runtime);
    }

    /**
     * Description: 查询注册中心列表
     * Summary: 查询注册中心列表
     */
    public AllRegistryResponse allRegistryEx(AllRegistryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllRegistryResponse());
    }

    /**
     * Description: 查询注册中心绑定的集群列表
     * Summary: 查询注册中心绑定的集群列表
     */
    public AllRegistrySysResponse allRegistrySys(AllRegistrySysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allRegistrySysEx(request, headers, runtime);
    }

    /**
     * Description: 查询注册中心绑定的集群列表
     * Summary: 查询注册中心绑定的集群列表
     */
    public AllRegistrySysResponse allRegistrySysEx(AllRegistrySysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.sys.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllRegistrySysResponse());
    }

    /**
     * Description: 分页查询注册中心绑定的集群列表
     * Summary: 分页查询注册中心绑定的集群列表
     */
    public ListRegistrySysResponse listRegistrySys(ListRegistrySysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistrySysEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询注册中心绑定的集群列表
     * Summary: 分页查询注册中心绑定的集群列表
     */
    public ListRegistrySysResponse listRegistrySysEx(ListRegistrySysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.sys.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRegistrySysResponse());
    }

    /**
     * Description: 创建注册中心
     * Summary: 创建注册中心
     */
    public CreateRegistryResponse createRegistry(CreateRegistryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRegistryEx(request, headers, runtime);
    }

    /**
     * Description: 创建注册中心
     * Summary: 创建注册中心
     */
    public CreateRegistryResponse createRegistryEx(CreateRegistryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRegistryResponse());
    }

    /**
     * Description:  通过ID删除注册中心
     * Summary:  通过ID删除注册中心
     */
    public DeleteRegistryResponse deleteRegistry(DeleteRegistryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryEx(request, headers, runtime);
    }

    /**
     * Description:  通过ID删除注册中心
     * Summary:  通过ID删除注册中心
     */
    public DeleteRegistryResponse deleteRegistryEx(DeleteRegistryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteRegistryResponse());
    }

    /**
     * Description: 通过ID查询注册中心
     * Summary: 通过ID查询注册中心
     */
    public GetRegistryResponse getRegistry(GetRegistryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegistryEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询注册中心
     * Summary: 通过ID查询注册中心
     */
    public GetRegistryResponse getRegistryEx(GetRegistryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRegistryResponse());
    }

    /**
     * Description:  查询注册中心分页列表
     * Summary:  查询注册中心分页列表
     */
    public ListRegistryResponse listRegistry(ListRegistryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistryEx(request, headers, runtime);
    }

    /**
     * Description:  查询注册中心分页列表
     * Summary:  查询注册中心分页列表
     */
    public ListRegistryResponse listRegistryEx(ListRegistryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRegistryResponse());
    }

    /**
     * Description: 更新注册中心
     * Summary: 更新注册中心
     */
    public UpdateRegistryResponse updateRegistry(UpdateRegistryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRegistryEx(request, headers, runtime);
    }

    /**
     * Description: 更新注册中心
     * Summary: 更新注册中心
     */
    public UpdateRegistryResponse updateRegistryEx(UpdateRegistryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.registry.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRegistryResponse());
    }

    /**
     * Description: 执行流程编排
     * Summary: 执行流程编排
     */
    public ExecApiflowResponse execApiflow(ExecApiflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execApiflowEx(request, headers, runtime);
    }

    /**
     * Description: 执行流程编排
     * Summary: 执行流程编排
     */
    public ExecApiflowResponse execApiflowEx(ExecApiflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apiflow.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecApiflowResponse());
    }

    /**
     * Description: 通过ID删除编排
     * Summary: 通过ID删除编排
     */
    public DeleteApiflowResponse deleteApiflow(DeleteApiflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiflowEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID删除编排
     * Summary: 通过ID删除编排
     */
    public DeleteApiflowResponse deleteApiflowEx(DeleteApiflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apiflow.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApiflowResponse());
    }

    /**
     * Description: 查询全部编排列表
     * Summary: 查询全部编排列表
     */
    public AllApiflowResponse allApiflow(AllApiflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allApiflowEx(request, headers, runtime);
    }

    /**
     * Description: 查询全部编排列表
     * Summary: 查询全部编排列表
     */
    public AllApiflowResponse allApiflowEx(AllApiflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apiflow.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllApiflowResponse());
    }

    /**
     * Description: 查询编排分页列表
     * Summary: 查询编排分页列表
     */
    public ListApiflowResponse listApiflow(ListApiflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiflowEx(request, headers, runtime);
    }

    /**
     * Description: 查询编排分页列表
     * Summary: 查询编排分页列表
     */
    public ListApiflowResponse listApiflowEx(ListApiflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apiflow.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApiflowResponse());
    }

    /**
     * Description: 创建API形式的编排
     * Summary: 创建API形式的编排
     */
    public CreateApiflowResponse createApiflow(CreateApiflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiflowEx(request, headers, runtime);
    }

    /**
     * Description: 创建API形式的编排
     * Summary: 创建API形式的编排
     */
    public CreateApiflowResponse createApiflowEx(CreateApiflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apiflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiflowResponse());
    }

    /**
     * Description: 通过ID查询编排
     * Summary: 通过ID查询编排
     */
    public GetApiflowResponse getApiflow(GetApiflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiflowEx(request, headers, runtime);
    }

    /**
     * Description: 通过ID查询编排
     * Summary: 通过ID查询编排
     */
    public GetApiflowResponse getApiflowEx(GetApiflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apiflow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApiflowResponse());
    }

    /**
     * Description: 更新编排信息
     * Summary: 更新编排信息
     */
    public UpdateApiflowResponse updateApiflow(UpdateApiflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiflowEx(request, headers, runtime);
    }

    /**
     * Description: 更新编排信息
     * Summary: 更新编排信息
     */
    public UpdateApiflowResponse updateApiflowEx(UpdateApiflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apiflow.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiflowResponse());
    }

    /**
     * Description: 数据模型转json
     * Summary: 数据模型转json
     */
    public GetApimodelJsonResponse getApimodelJson(GetApimodelJsonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApimodelJsonEx(request, headers, runtime);
    }

    /**
     * Description: 数据模型转json
     * Summary: 数据模型转json
     */
    public GetApimodelJsonResponse getApimodelJsonEx(GetApimodelJsonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.json.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApimodelJsonResponse());
    }

    /**
     * Description: 替换成apiflow所需的json
     * Summary: 替换成apiflow所需的json
     */
    public ReplaceApimodelJsonResponse replaceApimodelJson(ReplaceApimodelJsonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceApimodelJsonEx(request, headers, runtime);
    }

    /**
     * Description: 替换成apiflow所需的json
     * Summary: 替换成apiflow所需的json
     */
    public ReplaceApimodelJsonResponse replaceApimodelJsonEx(ReplaceApimodelJsonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.apimodel.json.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceApimodelJsonResponse());
    }

    /**
     * Description: 获取triple协议开关
     * Summary: 获取triple协议开关
     */
    public GetGwconfigTripleswitchResponse getGwconfigTripleswitch(GetGwconfigTripleswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwconfigTripleswitchEx(request, headers, runtime);
    }

    /**
     * Description: 获取triple协议开关
     * Summary: 获取triple协议开关
     */
    public GetGwconfigTripleswitchResponse getGwconfigTripleswitchEx(GetGwconfigTripleswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.tripleswitch.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGwconfigTripleswitchResponse());
    }

    /**
     * Description: 专有云triple查询开关
     * Summary: 专有云triple查询开关
     */
    public QueryGwconfigTripleswitchResponse queryGwconfigTripleswitch(QueryGwconfigTripleswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGwconfigTripleswitchEx(request, headers, runtime);
    }

    /**
     * Description: 专有云triple查询开关
     * Summary: 专有云triple查询开关
     */
    public QueryGwconfigTripleswitchResponse queryGwconfigTripleswitchEx(QueryGwconfigTripleswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.apigateway.gwconfig.tripleswitch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGwconfigTripleswitchResponse());
    }
}
