// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.deps.models.*;
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
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.Client.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "3.2.2")
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
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.Client.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.Client.hasError(raw, _accessKeySecret)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    continue;
                }
                throw new RuntimeException(e);
            }
        }

        throw new TeaUnretryableException(_lastRequest);
    }

    /**
     * Description: 创建一个应用。
     * Summary: 创建应用
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个应用。
     * Summary: 创建应用
     */
    public CreateApplicationResponse createApplicationEx(CreateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApplicationResponse());
    }

    /**
     * Description: 创建一个应用服务实例。
     * Summary: 创建应用服务实例
     */
    public CreateApplicationServiceResponse createApplicationService(CreateApplicationServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个应用服务实例。
     * Summary: 创建应用服务实例
     */
    public CreateApplicationServiceResponse createApplicationServiceEx(CreateApplicationServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.service.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApplicationServiceResponse());
    }

    /**
     * Description: 查询是否启用应用服务实例。
     * Summary: 查询是否启用应用服务实例
     */
    public EnabledApplicationServiceResponse enabledApplicationService(EnabledApplicationServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enabledApplicationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否启用应用服务实例。
     * Summary: 查询是否启用应用服务实例
     */
    public EnabledApplicationServiceResponse enabledApplicationServiceEx(EnabledApplicationServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.service.enabled", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnabledApplicationServiceResponse());
    }

    /**
     * Description: 获取一个应用详情。
     * Summary: 获取应用
     */
    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 获取一个应用详情。
     * Summary: 获取应用
     */
    public GetApplicationResponse getApplicationEx(GetApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationResponse());
    }

    /**
     * Description: 获取一个应用服务详情。
     * Summary: 获取应用服务
     */
    public GetApplicationServiceResponse getApplicationService(GetApplicationServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 获取一个应用服务详情。
     * Summary: 获取应用服务
     */
    public GetApplicationServiceResponse getApplicationServiceEx(GetApplicationServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.service.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationServiceResponse());
    }

    /**
     * Description: 查询应用服务实例列表。
     * Summary: 查询应用服务实例列表
     */
    public QueryApplicationServiceResponse queryApplicationService(QueryApplicationServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用服务实例列表。
     * Summary: 查询应用服务实例列表
     */
    public QueryApplicationServiceResponse queryApplicationServiceEx(QueryApplicationServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.service.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationServiceResponse());
    }

    /**
     * Description: 删除一个应用服务实例
     * Summary: 删除一个应用服务实例
     */
    public DeleteApplicationServiceResponse deleteApplicationService(DeleteApplicationServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 删除一个应用服务实例
     * Summary: 删除一个应用服务实例
     */
    public DeleteApplicationServiceResponse deleteApplicationServiceEx(DeleteApplicationServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.service.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApplicationServiceResponse());
    }

    /**
     * Description: 获取应用发布包详情包括下载地址、校验码等。
     * Summary: 获取应用发布包详情包括下载地址、校验码等。
     */
    public GetApplicationPackageResponse getApplicationPackage(GetApplicationPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationPackageEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用发布包详情包括下载地址、校验码等。
     * Summary: 获取应用发布包详情包括下载地址、校验码等。
     */
    public GetApplicationPackageResponse getApplicationPackageEx(GetApplicationPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.package.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationPackageResponse());
    }

    /**
     * Description: 查询应用发布包版本详情
     * Summary: 查询应用发布包版本详情
     */
    public QueryAppVersionResponse queryAppVersion(QueryAppVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppVersionEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用发布包版本详情
     * Summary: 查询应用发布包版本详情
     */
    public QueryAppVersionResponse queryAppVersionEx(QueryAppVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.version.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppVersionResponse());
    }

    /**
     * Description: 删除一个应用。
     * Summary: 删除应用
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 删除一个应用。
     * Summary: 删除应用
     */
    public DeleteApplicationResponse deleteApplicationEx(DeleteApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApplicationResponse());
    }

    /**
     * Description: 获取租户应用列表。
     * Summary: 列出应用
     */
    public ListApplicationResponse listApplication(ListApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 获取租户应用列表。
     * Summary: 列出应用
     */
    public ListApplicationResponse listApplicationEx(ListApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApplicationResponse());
    }

    /**
     * Description: 获取租户应用分组列表。
     * Summary: 列出应用分组
     */
    public ListAppgroupResponse listAppgroup(ListAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取租户应用分组列表。
     * Summary: 列出应用分组
     */
    public ListAppgroupResponse listAppgroupEx(ListAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appgroup.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppgroupResponse());
    }

    /**
     * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
     * Summary: 查询应用计算资源
     */
    public QueryApplicationComputerResponse queryApplicationComputer(QueryApplicationComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationComputerEx(request, headers, runtime);
    }

    /**
     * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
     * Summary: 查询应用计算资源
     */
    public QueryApplicationComputerResponse queryApplicationComputerEx(QueryApplicationComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.computer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationComputerResponse());
    }

    /**
     * Description: 获取一个应用的代码库信息。
     * Summary: 获取一个应用的代码库信息
     */
    public GetApplicationRepositoryResponse getApplicationRepository(GetApplicationRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationRepositoryEx(request, headers, runtime);
    }

    /**
     * Description: 获取一个应用的代码库信息。
     * Summary: 获取一个应用的代码库信息
     */
    public GetApplicationRepositoryResponse getApplicationRepositoryEx(GetApplicationRepositoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.repository.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationRepositoryResponse());
    }

    /**
     * Description: 根据名称查询应用分组信息
     * Summary: 应用分组查询
     */
    public QueryAppgroupResponse queryAppgroup(QueryAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 根据名称查询应用分组信息
     * Summary: 应用分组查询
     */
    public QueryAppgroupResponse queryAppgroupEx(QueryAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appgroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppgroupResponse());
    }

    /**
     * Description: 根据条件查询应用等级
     * Summary: 查询应用等级
     */
    public QueryApplevelResponse queryApplevel(QueryApplevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplevelEx(request, headers, runtime);
    }

    /**
     * Description: 根据条件查询应用等级
     * Summary: 查询应用等级
     */
    public QueryApplevelResponse queryApplevelEx(QueryApplevelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.applevel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplevelResponse());
    }

    /**
     * Description: 根据查询条件查询应用列表。
     * Summary: 查询应用
     */
    public QueryApplicationResponse queryApplication(QueryApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 根据查询条件查询应用列表。
     * Summary: 查询应用
     */
    public QueryApplicationResponse queryApplicationEx(QueryApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationResponse());
    }

    /**
     * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
    当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
     * Summary: 创建应用版本
     */
    public CreateAppVersionResponse createAppVersion(CreateAppVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppVersionEx(request, headers, runtime);
    }

    /**
     * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
    当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
     * Summary: 创建应用版本
     */
    public CreateAppVersionResponse createAppVersionEx(CreateAppVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.version.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppVersionResponse());
    }

    /**
     * Description: 查询应用增量统计信息
     * Summary: 查询应用增量统计信息
     */
    public QueryAppDeltaResponse queryAppDelta(QueryAppDeltaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppDeltaEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用增量统计信息
     * Summary: 查询应用增量统计信息
     */
    public QueryAppDeltaResponse queryAppDeltaEx(QueryAppDeltaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.delta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppDeltaResponse());
    }

    /**
     * Description: 根据指定的查询条件查询负载均衡资源列表
     * Summary: loadbalancer查询
     */
    public QueryApplicationLoadbalancerResponse queryApplicationLoadbalancer(QueryApplicationLoadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationLoadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: 根据指定的查询条件查询负载均衡资源列表
     * Summary: loadbalancer查询
     */
    public QueryApplicationLoadbalancerResponse queryApplicationLoadbalancerEx(QueryApplicationLoadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.loadbalancer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationLoadbalancerResponse());
    }

    /**
     * Description: 根据指定的查询条件查询数据库资源列表
     * Summary: database查询
     */
    public QueryApplicationDatabaseResponse queryApplicationDatabase(QueryApplicationDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: 根据指定的查询条件查询数据库资源列表
     * Summary: database查询
     */
    public QueryApplicationDatabaseResponse queryApplicationDatabaseEx(QueryApplicationDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.database.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationDatabaseResponse());
    }

    /**
     * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
     * Summary: 获取上传应用发布包临时签名地址
     */
    public UploadApplicationPackageResponse uploadApplicationPackage(UploadApplicationPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadApplicationPackageEx(request, headers, runtime);
    }

    /**
     * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
     * Summary: 获取上传应用发布包临时签名地址
     */
    public UploadApplicationPackageResponse uploadApplicationPackageEx(UploadApplicationPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.package.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadApplicationPackageResponse());
    }

    /**
     * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
    调用步骤如下：
    调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
    通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
    调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
     * Summary: 同步创建对应的发布包版本信息
     */
    public SyncreateApplicationVersionResponse syncreateApplicationVersion(SyncreateApplicationVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncreateApplicationVersionEx(request, headers, runtime);
    }

    /**
     * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
    调用步骤如下：
    调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
    通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
    调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
     * Summary: 同步创建对应的发布包版本信息
     */
    public SyncreateApplicationVersionResponse syncreateApplicationVersionEx(SyncreateApplicationVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.version.syncreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncreateApplicationVersionResponse());
    }

    /**
     * Description: 获取connection
     * Summary: 获取connection
     */
    public ListCloudconnectorConnectionResponse listCloudconnectorConnection(ListCloudconnectorConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCloudconnectorConnectionEx(request, headers, runtime);
    }

    /**
     * Description: 获取connection
     * Summary: 获取connection
     */
    public ListCloudconnectorConnectionResponse listCloudconnectorConnectionEx(ListCloudconnectorConnectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconnector.connection.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCloudconnectorConnectionResponse());
    }

    /**
     * Description: 查询技术栈关系
     * Summary: 查询技术栈关系
     */
    public QueryAppservicebuildpackrelationResponse queryAppservicebuildpackrelation(QueryAppservicebuildpackrelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppservicebuildpackrelationEx(request, headers, runtime);
    }

    /**
     * Description: 查询技术栈关系
     * Summary: 查询技术栈关系
     */
    public QueryAppservicebuildpackrelationResponse queryAppservicebuildpackrelationEx(QueryAppservicebuildpackrelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appservicebuildpackrelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppservicebuildpackrelationResponse());
    }

    /**
     * Description: 更新应用关系
     * Summary: 更新应用关系
     */
    public UpdateAppservicebuildpackrelationResponse updateAppservicebuildpackrelation(UpdateAppservicebuildpackrelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppservicebuildpackrelationEx(request, headers, runtime);
    }

    /**
     * Description: 更新应用关系
     * Summary: 更新应用关系
     */
    public UpdateAppservicebuildpackrelationResponse updateAppservicebuildpackrelationEx(UpdateAppservicebuildpackrelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appservicebuildpackrelation.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppservicebuildpackrelationResponse());
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     */
    public QueryAppserviceenvparamResponse queryAppserviceenvparam(QueryAppserviceenvparamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppserviceenvparamEx(request, headers, runtime);
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     */
    public QueryAppserviceenvparamResponse queryAppserviceenvparamEx(QueryAppserviceenvparamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appserviceenvparam.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppserviceenvparamResponse());
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     */
    public QueryAppserviceenvparamGroupbyappservicesResponse queryAppserviceenvparamGroupbyappservices(QueryAppserviceenvparamGroupbyappservicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppserviceenvparamGroupbyappservicesEx(request, headers, runtime);
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     */
    public QueryAppserviceenvparamGroupbyappservicesResponse queryAppserviceenvparamGroupbyappservicesEx(QueryAppserviceenvparamGroupbyappservicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appserviceenvparam.groupbyappservices.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppserviceenvparamGroupbyappservicesResponse());
    }

    /**
     * Description: 和修改点比较查询
     * Summary: 和修改点比较查询
     */
    public QueryAppserviceenvparamQuerywithdiffResponse queryAppserviceenvparamQuerywithdiff(QueryAppserviceenvparamQuerywithdiffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppserviceenvparamQuerywithdiffEx(request, headers, runtime);
    }

    /**
     * Description: 和修改点比较查询
     * Summary: 和修改点比较查询
     */
    public QueryAppserviceenvparamQuerywithdiffResponse queryAppserviceenvparamQuerywithdiffEx(QueryAppserviceenvparamQuerywithdiffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appserviceenvparam.querywithdiff.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppserviceenvparamQuerywithdiffResponse());
    }

    /**
     * Description: 更新参数
     * Summary: 更新参数
     */
    public UpdateAppserviceenvparamUpdateparamsResponse updateAppserviceenvparamUpdateparams(UpdateAppserviceenvparamUpdateparamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppserviceenvparamUpdateparamsEx(request, headers, runtime);
    }

    /**
     * Description: 更新参数
     * Summary: 更新参数
     */
    public UpdateAppserviceenvparamUpdateparamsResponse updateAppserviceenvparamUpdateparamsEx(UpdateAppserviceenvparamUpdateparamsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appserviceenvparam.updateparams.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppserviceenvparamUpdateparamsResponse());
    }

    /**
     * Description: 根据应用查询技术栈关系
     * Summary: 查询技术栈关系
     */
    public QueryApptechstackrelationResponse queryApptechstackrelation(QueryApptechstackrelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApptechstackrelationEx(request, headers, runtime);
    }

    /**
     * Description: 根据应用查询技术栈关系
     * Summary: 查询技术栈关系
     */
    public QueryApptechstackrelationResponse queryApptechstackrelationEx(QueryApptechstackrelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.apptechstackrelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApptechstackrelationResponse());
    }

    /**
     * Description: 更新应用技术栈关系
     * Summary: 更新技术栈关系
     */
    public UpdateApptechstackrelationResponse updateApptechstackrelation(UpdateApptechstackrelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApptechstackrelationEx(request, headers, runtime);
    }

    /**
     * Description: 更新应用技术栈关系
     * Summary: 更新技术栈关系
     */
    public UpdateApptechstackrelationResponse updateApptechstackrelationEx(UpdateApptechstackrelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.apptechstackrelation.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApptechstackrelationResponse());
    }

    /**
     * Description: 应用管理-创建应用
     * Summary: 应用管理-创建应用
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-创建应用
     * Summary: 应用管理-创建应用
     */
    public CreateAppResponse createAppEx(CreateAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppResponse());
    }

    /**
     * Description: 应用管理-应用分组创建
     * Summary: 应用管理-应用分组创建
     */
    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppGroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-应用分组创建
     * Summary: 应用管理-应用分组创建
     */
    public CreateAppGroupResponse createAppGroupEx(CreateAppGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.group.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppGroupResponse());
    }

    /**
     * Description: 应用管理-获取应用基本信息
     * Summary: 应用管理-获取应用基本信息
     */
    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-获取应用基本信息
     * Summary: 应用管理-获取应用基本信息
     */
    public GetAppResponse getAppEx(GetAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppResponse());
    }

    /**
     * Description: 应用管理-查看应用所有应用服务数量
     * Summary: 应用管理-查看应用所有应用服务数量
     */
    public CountAppServiceResponse countAppService(CountAppServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countAppServiceEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-查看应用所有应用服务数量
     * Summary: 应用管理-查看应用所有应用服务数量
     */
    public CountAppServiceResponse countAppServiceEx(CountAppServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.service.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountAppServiceResponse());
    }

    /**
     * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
     * Summary: (废弃)获取应用所有环境的部署图(经典)
     */
    public AllAppDeployviewResponse allAppDeployview(AllAppDeployviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAppDeployviewEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
     * Summary: (废弃)获取应用所有环境的部署图(经典)
     */
    public AllAppDeployviewResponse allAppDeployviewEx(AllAppDeployviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.deployview.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAppDeployviewResponse());
    }

    /**
     * Description: 应用管理-批量查询应用
     * Summary: 应用管理-批量查询应用
     */
    public QueryAppResponse queryApp(QueryAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-批量查询应用
     * Summary: 应用管理-批量查询应用
     */
    public QueryAppResponse queryAppEx(QueryAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppResponse());
    }

    /**
     * Description: 应用管理-获取应用分组
     * Summary: 应用管理-获取单个应用分组
     */
    public GetAppGroupResponse getAppGroup(GetAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppGroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-获取应用分组
     * Summary: 应用管理-获取单个应用分组
     */
    public GetAppGroupResponse getAppGroupEx(GetAppGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.group.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppGroupResponse());
    }

    /**
     * Description: 应用管理-批量查询应用分组
     * Summary: 应用管理-批量查询应用分组
     */
    public QueryAppGroupResponse queryAppGroup(QueryAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppGroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-批量查询应用分组
     * Summary: 应用管理-批量查询应用分组
     */
    public QueryAppGroupResponse queryAppGroupEx(QueryAppGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.group.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppGroupResponse());
    }

    /**
     * Description: 应用管理-查询当前应用的所有应用服务
     * Summary: 应用管理-查询当前应用的所有应用服务
     */
    public QueryAppServiceResponse queryAppService(QueryAppServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppServiceEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-查询当前应用的所有应用服务
     * Summary: 应用管理-查询当前应用的所有应用服务
     */
    public QueryAppServiceResponse queryAppServiceEx(QueryAppServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.service.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppServiceResponse());
    }

    /**
     * Description: 应用管理-用户收藏应用
     * Summary: 应用管理-用户收藏应用
     */
    public CreateAppFavouriteResponse createAppFavourite(CreateAppFavouriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppFavouriteEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-用户收藏应用
     * Summary: 应用管理-用户收藏应用
     */
    public CreateAppFavouriteResponse createAppFavouriteEx(CreateAppFavouriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.favourite.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppFavouriteResponse());
    }

    /**
     * Description: 应用管理-用户取消收藏某应用
     * Summary: 应用管理-用户取消收藏某应用
     */
    public DeleteAppFavouriteResponse deleteAppFavourite(DeleteAppFavouriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppFavouriteEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-用户取消收藏某应用
     * Summary: 应用管理-用户取消收藏某应用
     */
    public DeleteAppFavouriteResponse deleteAppFavouriteEx(DeleteAppFavouriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.favourite.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppFavouriteResponse());
    }

    /**
     * Description: 应用管理-更新应用信息
     * Summary: 应用管理-更新应用信息
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-更新应用信息
     * Summary: 应用管理-更新应用信息
     */
    public UpdateAppResponse updateAppEx(UpdateAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppResponse());
    }

    /**
     * Description: 应用管理-更新应用分组信息
     * Summary: 应用管理-更新应用分组信息
     */
    public UpdateAppGroupResponse updateAppGroup(UpdateAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppGroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-更新应用分组信息
     * Summary: 应用管理-更新应用分组信息
     */
    public UpdateAppGroupResponse updateAppGroupEx(UpdateAppGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.group.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppGroupResponse());
    }

    /**
     * Description: 应用管理-列出当前用户收藏的应用
     * Summary: 应用管理-列出当前用户收藏的应用
     */
    public ListAppFavouriteResponse listAppFavourite(ListAppFavouriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppFavouriteEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-列出当前用户收藏的应用
     * Summary: 应用管理-列出当前用户收藏的应用
     */
    public ListAppFavouriteResponse listAppFavouriteEx(ListAppFavouriteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.favourite.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppFavouriteResponse());
    }

    /**
     * Description: 应用管理-删除应用
     * Summary: 应用管理-删除应用
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-删除应用
     * Summary: 应用管理-删除应用
     */
    public DeleteAppResponse deleteAppEx(DeleteAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppResponse());
    }

    /**
     * Description: 应用管理-删除应用分组
     * Summary: 应用管理-删除应用分组
     */
    public DeleteAppGroupResponse deleteAppGroup(DeleteAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppGroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-删除应用分组
     * Summary: 应用管理-删除应用分组
     */
    public DeleteAppGroupResponse deleteAppGroupEx(DeleteAppGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.group.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppGroupResponse());
    }

    /**
     * Description: 应用管理-应用维度查询经典应用服务发布单
     * Summary: 应用管理-应用维度查询经典应用服务发布单
     */
    public QueryAppPlanResponse queryAppPlan(QueryAppPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppPlanEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-应用维度查询经典应用服务发布单
     * Summary: 应用管理-应用维度查询经典应用服务发布单
     */
    public QueryAppPlanResponse queryAppPlanEx(QueryAppPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.plan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppPlanResponse());
    }

    /**
     * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
     * Summary: 应用管理-判断应用分组是否存在
     */
    public ExistAppGroupResponse existAppGroup(ExistAppGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existAppGroupEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
     * Summary: 应用管理-判断应用分组是否存在
     */
    public ExistAppGroupResponse existAppGroupEx(ExistAppGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.group.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistAppGroupResponse());
    }

    /**
     * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
     * Summary: 应用管理-当前登录用户信息查询（已废弃）
     */
    public QueryUserResponse queryUser(QueryUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
     * Summary: 应用管理-当前登录用户信息查询（已废弃）
     */
    public QueryUserResponse queryUserEx(QueryUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserResponse());
    }

    /**
     * Description: 应用管理-判断应用是否存在
     * Summary: 应用管理-判断应用是否存在
     */
    public ExistAppResponse existApp(ExistAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existAppEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-判断应用是否存在
     * Summary: 应用管理-判断应用是否存在
     */
    public ExistAppResponse existAppEx(ExistAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistAppResponse());
    }

    /**
     * Description: 根据应用服务实例查询对应的技术栈信息
     * Summary: 查询技术栈信息
     */
    public GetApplicationBuildpackResponse getApplicationBuildpack(GetApplicationBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 根据应用服务实例查询对应的技术栈信息
     * Summary: 查询技术栈信息
     */
    public GetApplicationBuildpackResponse getApplicationBuildpackEx(GetApplicationBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.buildpack.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationBuildpackResponse());
    }

    /**
     * Description: 查询指定应用的技术栈框架信息
     * Summary: 查询指定应用的技术栈框架信息
     */
    public GetApplicationTechstackResponse getApplicationTechstack(GetApplicationTechstackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationTechstackEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定应用的技术栈框架信息
     * Summary: 查询指定应用的技术栈框架信息
     */
    public GetApplicationTechstackResponse getApplicationTechstackEx(GetApplicationTechstackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.application.techstack.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationTechstackResponse());
    }

    /**
     * Description: 获取技术栈信息
     * Summary: 获取技术栈信息
     */
    public GetBuildpackResponse getBuildpack(GetBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 获取技术栈信息
     * Summary: 获取技术栈信息
     */
    public GetBuildpackResponse getBuildpackEx(GetBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBuildpackResponse());
    }

    /**
     * Description: 列出系统支持的所有技术栈框架
     * Summary: 列出系统支持的所有技术栈框架
     */
    public ListTechstackResponse listTechstack(ListTechstackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTechstackEx(request, headers, runtime);
    }

    /**
     * Description: 列出系统支持的所有技术栈框架
     * Summary: 列出系统支持的所有技术栈框架
     */
    public ListTechstackResponse listTechstackEx(ListTechstackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.techstack.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTechstackResponse());
    }

    /**
     * Description: 搜索技术栈
     * Summary: 搜索技术栈
     */
    public QueryBuildpackResponse queryBuildpack(QueryBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 搜索技术栈
     * Summary: 搜索技术栈
     */
    public QueryBuildpackResponse queryBuildpackEx(QueryBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackResponse());
    }

    /**
     * Description: 创建一个技术栈
     * Summary: 创建一个技术栈
     */
    public CreateBuildpackResponse createBuildpack(CreateBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个技术栈
     * Summary: 创建一个技术栈
     */
    public CreateBuildpackResponse createBuildpackEx(CreateBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBuildpackResponse());
    }

    /**
     * Description: 更新技术栈包状态
     * Summary: 更新技术栈包状态
     */
    public UploadfinishBuildpackResponse uploadfinishBuildpack(UploadfinishBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadfinishBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 更新技术栈包状态
     * Summary: 更新技术栈包状态
     */
    public UploadfinishBuildpackResponse uploadfinishBuildpackEx(UploadfinishBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.uploadfinish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadfinishBuildpackResponse());
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     */
    public PublishBuildpackResponse publishBuildpack(PublishBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     */
    public PublishBuildpackResponse publishBuildpackEx(PublishBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishBuildpackResponse());
    }

    /**
     * Description: 更新一个技术栈
     * Summary: 更新一个技术栈
     */
    public UpdateBuildpackResponse updateBuildpack(UpdateBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 更新一个技术栈
     * Summary: 更新一个技术栈
     */
    public UpdateBuildpackResponse updateBuildpackEx(UpdateBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBuildpackResponse());
    }

    /**
     * Description: 根据名称查询
     * Summary: 根据名称查询
     */
    public QueryBuildpackFindbynamesResponse queryBuildpackFindbynames(QueryBuildpackFindbynamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindbynamesEx(request, headers, runtime);
    }

    /**
     * Description: 根据名称查询
     * Summary: 根据名称查询
     */
    public QueryBuildpackFindbynamesResponse queryBuildpackFindbynamesEx(QueryBuildpackFindbynamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findbynames.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindbynamesResponse());
    }

    /**
     * Description: 计算
     * Summary: 计算
     */
    public CountBuildpackResponse countBuildpack(CountBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 计算
     * Summary: 计算
     */
    public CountBuildpackResponse countBuildpackEx(CountBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountBuildpackResponse());
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     */
    public DeprecateBuildpackResponse deprecateBuildpack(DeprecateBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deprecateBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     */
    public DeprecateBuildpackResponse deprecateBuildpackEx(DeprecateBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.deprecate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeprecateBuildpackResponse());
    }

    /**
     * Description: 批量删除
     * Summary: 批量删除
     */
    public BatchdeleteBuildpackResponse batchdeleteBuildpack(BatchdeleteBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除
     * Summary: 批量删除
     */
    public BatchdeleteBuildpackResponse batchdeleteBuildpackEx(BatchdeleteBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteBuildpackResponse());
    }

    /**
     * Description: 查询是否存在
     * Summary: 查询是否存在
     */
    public ExistBuildpackResponse existBuildpack(ExistBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否存在
     * Summary: 查询是否存在
     */
    public ExistBuildpackResponse existBuildpackEx(ExistBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistBuildpackResponse());
    }

    /**
     * Description: 更新打包状态
     * Summary: 更新打包状态
     */
    public UpdateBuildpackUpdatepackagesstatusResponse updateBuildpackUpdatepackagesstatus(UpdateBuildpackUpdatepackagesstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBuildpackUpdatepackagesstatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新打包状态
     * Summary: 更新打包状态
     */
    public UpdateBuildpackUpdatepackagesstatusResponse updateBuildpackUpdatepackagesstatusEx(UpdateBuildpackUpdatepackagesstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.updatepackagesstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBuildpackUpdatepackagesstatusResponse());
    }

    /**
     * Description: 查询版本
     * Summary: 查询版本
     */
    public QueryBuildpackFindidversionpairsbyversionResponse queryBuildpackFindidversionpairsbyversion(QueryBuildpackFindidversionpairsbyversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindidversionpairsbyversionEx(request, headers, runtime);
    }

    /**
     * Description: 查询版本
     * Summary: 查询版本
     */
    public QueryBuildpackFindidversionpairsbyversionResponse queryBuildpackFindidversionpairsbyversionEx(QueryBuildpackFindidversionpairsbyversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findidversionpairsbyversion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindidversionpairsbyversionResponse());
    }

    /**
     * Description: 根据技术栈分组查询
     * Summary: 根据技术栈分组查询
     */
    public QueryBuildpackGroupbytechstackResponse queryBuildpackGroupbytechstack(QueryBuildpackGroupbytechstackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackGroupbytechstackEx(request, headers, runtime);
    }

    /**
     * Description: 根据技术栈分组查询
     * Summary: 根据技术栈分组查询
     */
    public QueryBuildpackGroupbytechstackResponse queryBuildpackGroupbytechstackEx(QueryBuildpackGroupbytechstackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.groupbytechstack.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackGroupbytechstackResponse());
    }

    /**
     * Description: 查询可见技术栈
     * Summary: 查询可见技术栈
     */
    public QueryBuildpackFindvisibletechstacksResponse queryBuildpackFindvisibletechstacks(QueryBuildpackFindvisibletechstacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindvisibletechstacksEx(request, headers, runtime);
    }

    /**
     * Description: 查询可见技术栈
     * Summary: 查询可见技术栈
     */
    public QueryBuildpackFindvisibletechstacksResponse queryBuildpackFindvisibletechstacksEx(QueryBuildpackFindvisibletechstacksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findvisibletechstacks.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindvisibletechstacksResponse());
    }

    /**
     * Description: 查询可写技术栈
     * Summary: 查询可写技术栈
     */
    public QueryBuildpackFindwritabletechstacksResponse queryBuildpackFindwritabletechstacks(QueryBuildpackFindwritabletechstacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindwritabletechstacksEx(request, headers, runtime);
    }

    /**
     * Description: 查询可写技术栈
     * Summary: 查询可写技术栈
     */
    public QueryBuildpackFindwritabletechstacksResponse queryBuildpackFindwritabletechstacksEx(QueryBuildpackFindwritabletechstacksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findwritabletechstacks.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindwritabletechstacksResponse());
    }

    /**
     * Description: 查询os通过当前云
     * Summary: 查询os通过当前云
     */
    public QueryBuildpackFindosbycurrentcloudResponse queryBuildpackFindosbycurrentcloud(QueryBuildpackFindosbycurrentcloudRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindosbycurrentcloudEx(request, headers, runtime);
    }

    /**
     * Description: 查询os通过当前云
     * Summary: 查询os通过当前云
     */
    public QueryBuildpackFindosbycurrentcloudResponse queryBuildpackFindosbycurrentcloudEx(QueryBuildpackFindosbycurrentcloudRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findosbycurrentcloud.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindosbycurrentcloudResponse());
    }

    /**
     * Description: 通过appv1查询buildpack
     * Summary: 查询buildpack
     */
    public QueryBuildpackFindbyappsvResponse queryBuildpackFindbyappsv(QueryBuildpackFindbyappsvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindbyappsvEx(request, headers, runtime);
    }

    /**
     * Description: 通过appv1查询buildpack
     * Summary: 查询buildpack
     */
    public QueryBuildpackFindbyappsvResponse queryBuildpackFindbyappsvEx(QueryBuildpackFindbyappsvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findbyappsv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindbyappsvResponse());
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     */
    public QueryBuildpackFindbyappsResponse queryBuildpackFindbyapps(QueryBuildpackFindbyappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindbyappsEx(request, headers, runtime);
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     */
    public QueryBuildpackFindbyappsResponse queryBuildpackFindbyappsEx(QueryBuildpackFindbyappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findbyapps.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindbyappsResponse());
    }

    /**
     * Description: 通过app服务查询
     * Summary: 通过app服务查询
     */
    public QueryBuildpackFindbyappservicesResponse queryBuildpackFindbyappservices(QueryBuildpackFindbyappservicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindbyappservicesEx(request, headers, runtime);
    }

    /**
     * Description: 通过app服务查询
     * Summary: 通过app服务查询
     */
    public QueryBuildpackFindbyappservicesResponse queryBuildpackFindbyappservicesEx(QueryBuildpackFindbyappservicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findbyappservices.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindbyappservicesResponse());
    }

    /**
     * Description: 通过appv1查询
     * Summary: 通过appv1查询
     */
    public QueryBuildpackFindbyappvResponse queryBuildpackFindbyappv(QueryBuildpackFindbyappvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindbyappvEx(request, headers, runtime);
    }

    /**
     * Description: 通过appv1查询
     * Summary: 通过appv1查询
     */
    public QueryBuildpackFindbyappvResponse queryBuildpackFindbyappvEx(QueryBuildpackFindbyappvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findbyappv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindbyappvResponse());
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     */
    public QueryBuildpackFindbyappResponse queryBuildpackFindbyapp(QueryBuildpackFindbyappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindbyappEx(request, headers, runtime);
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     */
    public QueryBuildpackFindbyappResponse queryBuildpackFindbyappEx(QueryBuildpackFindbyappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findbyapp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindbyappResponse());
    }

    /**
     * Description: 生成url
     * Summary: 生成url
     */
    public CreateBuildpackGeneratesignurlResponse createBuildpackGeneratesignurl(CreateBuildpackGeneratesignurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBuildpackGeneratesignurlEx(request, headers, runtime);
    }

    /**
     * Description: 生成url
     * Summary: 生成url
     */
    public CreateBuildpackGeneratesignurlResponse createBuildpackGeneratesignurlEx(CreateBuildpackGeneratesignurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.generatesignurl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBuildpackGeneratesignurlResponse());
    }

    /**
     * Description: 查询pagessize
     * Summary: 查询pagessize
     */
    public QueryBuildpackSumpackagessizeResponse queryBuildpackSumpackagessize(QueryBuildpackSumpackagessizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackSumpackagessizeEx(request, headers, runtime);
    }

    /**
     * Description: 查询pagessize
     * Summary: 查询pagessize
     */
    public QueryBuildpackSumpackagessizeResponse queryBuildpackSumpackagessizeEx(QueryBuildpackSumpackagessizeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.sumpackagessize.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackSumpackagessizeResponse());
    }

    /**
     * Description: 查询是否supportcode
     * Summary: 查询是否supportcode
     */
    public QueryBuildpackSupportcoderepoResponse queryBuildpackSupportcoderepo(QueryBuildpackSupportcoderepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackSupportcoderepoEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否supportcode
     * Summary: 查询是否supportcode
     */
    public QueryBuildpackSupportcoderepoResponse queryBuildpackSupportcoderepoEx(QueryBuildpackSupportcoderepoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.supportcoderepo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackSupportcoderepoResponse());
    }

    /**
     * Description: 通过可用的app服务id查询Composite信息
     * Summary: 查询Composite信息
     */
    public QueryBuildpackFindavailablebyappserviceidsResponse queryBuildpackFindavailablebyappserviceids(QueryBuildpackFindavailablebyappserviceidsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackFindavailablebyappserviceidsEx(request, headers, runtime);
    }

    /**
     * Description: 通过可用的app服务id查询Composite信息
     * Summary: 查询Composite信息
     */
    public QueryBuildpackFindavailablebyappserviceidsResponse queryBuildpackFindavailablebyappserviceidsEx(QueryBuildpackFindavailablebyappserviceidsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.findavailablebyappserviceids.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackFindavailablebyappserviceidsResponse());
    }

    /**
     * Description: pageQuery
     * Summary: pageQuery
     */
    public QueryBuildpacknewResponse queryBuildpacknew(QueryBuildpacknewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpacknewEx(request, headers, runtime);
    }

    /**
     * Description: pageQuery
     * Summary: pageQuery
     */
    public QueryBuildpacknewResponse queryBuildpacknewEx(QueryBuildpacknewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpacknew.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpacknewResponse());
    }

    /**
     * Description: buildpacknewget
     * Summary: buildpacknewget
     */
    public GetBuildpacknewResponse getBuildpacknew(GetBuildpacknewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBuildpacknewEx(request, headers, runtime);
    }

    /**
     * Description: buildpacknewget
     * Summary: buildpacknewget
     */
    public GetBuildpacknewResponse getBuildpacknewEx(GetBuildpacknewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpacknew.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBuildpacknewResponse());
    }

    /**
     * Description: update
     * Summary: update
     */
    public UpdateBuildpacknewUploadfinishResponse updateBuildpacknewUploadfinish(UpdateBuildpacknewUploadfinishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBuildpacknewUploadfinishEx(request, headers, runtime);
    }

    /**
     * Description: update
     * Summary: update
     */
    public UpdateBuildpacknewUploadfinishResponse updateBuildpacknewUploadfinishEx(UpdateBuildpacknewUploadfinishRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpacknew.uploadfinish.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBuildpacknewUploadfinishResponse());
    }

    /**
     * Description: update
     * Summary: update
     */
    public UpdateBuildpacknewResponse updateBuildpacknew(UpdateBuildpacknewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBuildpacknewEx(request, headers, runtime);
    }

    /**
     * Description: update
     * Summary: update
     */
    public UpdateBuildpacknewResponse updateBuildpacknewEx(UpdateBuildpacknewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpacknew.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBuildpacknewResponse());
    }

    /**
     * Description: 创建技术栈
     * Summary: 创建技术栈
     */
    public CreateBuildpacknewResponse createBuildpacknew(CreateBuildpacknewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBuildpacknewEx(request, headers, runtime);
    }

    /**
     * Description: 创建技术栈
     * Summary: 创建技术栈
     */
    public CreateBuildpacknewResponse createBuildpacknewEx(CreateBuildpacknewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpacknew.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBuildpacknewResponse());
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     */
    public OnlineBuildpackResponse onlineBuildpack(OnlineBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     */
    public OnlineBuildpackResponse onlineBuildpackEx(OnlineBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.buildpack.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineBuildpackResponse());
    }

    /**
     * Description: 创建一个全局参数
     * Summary: 创建一个全局参数
     */
    public CreateConfigGlobalResponse createConfigGlobal(CreateConfigGlobalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigGlobalEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个全局参数
     * Summary: 创建一个全局参数
     */
    public CreateConfigGlobalResponse createConfigGlobalEx(CreateConfigGlobalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.global.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConfigGlobalResponse());
    }

    /**
     * Description: 删除一个全局参数
     * Summary: 删除一个全局参数
     */
    public DeleteConfigGlobalResponse deleteConfigGlobal(DeleteConfigGlobalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigGlobalEx(request, headers, runtime);
    }

    /**
     * Description: 删除一个全局参数
     * Summary: 删除一个全局参数
     */
    public DeleteConfigGlobalResponse deleteConfigGlobalEx(DeleteConfigGlobalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.global.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteConfigGlobalResponse());
    }

    /**
     * Description: 更新指定的全局参数
     * Summary: 更新指定的全局参数
     */
    public UpdateConfigGlobalResponse updateConfigGlobal(UpdateConfigGlobalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigGlobalEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定的全局参数
     * Summary: 更新指定的全局参数
     */
    public UpdateConfigGlobalResponse updateConfigGlobalEx(UpdateConfigGlobalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.global.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateConfigGlobalResponse());
    }

    /**
     * Description: 根据条件查询符合条件的全局参数
     * Summary: 根据条件查询符合条件的全局参数
     */
    public QueryConfigGlobalResponse queryConfigGlobal(QueryConfigGlobalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConfigGlobalEx(request, headers, runtime);
    }

    /**
     * Description: 根据条件查询符合条件的全局参数
     * Summary: 根据条件查询符合条件的全局参数
     */
    public QueryConfigGlobalResponse queryConfigGlobalEx(QueryConfigGlobalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.global.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConfigGlobalResponse());
    }

    /**
     * Description: 获取单个全局参数
     * Summary: 获取单个全局参数
     */
    public GetConfigGlobalResponse getConfigGlobal(GetConfigGlobalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigGlobalEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个全局参数
     * Summary: 获取单个全局参数
     */
    public GetConfigGlobalResponse getConfigGlobalEx(GetConfigGlobalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.global.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConfigGlobalResponse());
    }

    /**
     * Description: 创建一个应用参数
     * Summary: 创建一个应用参数
     */
    public CreateConfigAppResponse createConfigApp(CreateConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigAppEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个应用参数
     * Summary: 创建一个应用参数
     */
    public CreateConfigAppResponse createConfigAppEx(CreateConfigAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.app.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConfigAppResponse());
    }

    /**
     * Description: 删除一个应用参数
     * Summary: 删除一个应用参数
     */
    public DeleteConfigAppResponse deleteConfigApp(DeleteConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigAppEx(request, headers, runtime);
    }

    /**
     * Description: 删除一个应用参数
     * Summary: 删除一个应用参数
     */
    public DeleteConfigAppResponse deleteConfigAppEx(DeleteConfigAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.app.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteConfigAppResponse());
    }

    /**
     * Description: 更新指定的应用参数
     * Summary: 更新指定的应用参数
     */
    public UpdateConfigAppResponse updateConfigApp(UpdateConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigAppEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定的应用参数
     * Summary: 更新指定的应用参数
     */
    public UpdateConfigAppResponse updateConfigAppEx(UpdateConfigAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.app.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateConfigAppResponse());
    }

    /**
     * Description: 获取指定的应用参数
     * Summary: 获取指定的应用参数
     */
    public GetConfigAppResponse getConfigApp(GetConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigAppEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定的应用参数
     * Summary: 获取指定的应用参数
     */
    public GetConfigAppResponse getConfigAppEx(GetConfigAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.app.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConfigAppResponse());
    }

    /**
     * Description: 查询符合条件的应用参数
     * Summary: 查询符合条件的应用参数
     */
    public QueryConfigAppResponse queryConfigApp(QueryConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConfigAppEx(request, headers, runtime);
    }

    /**
     * Description: 查询符合条件的应用参数
     * Summary: 查询符合条件的应用参数
     */
    public QueryConfigAppResponse queryConfigAppEx(QueryConfigAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.app.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConfigAppResponse());
    }

    /**
     * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
     * Summary: 将一个应用参数模板保存为草稿
     */
    public SaveConfigTemplateResponse saveConfigTemplate(SaveConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveConfigTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
     * Summary: 将一个应用参数模板保存为草稿
     */
    public SaveConfigTemplateResponse saveConfigTemplateEx(SaveConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.template.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveConfigTemplateResponse());
    }

    /**
     * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
     * Summary: 发布一个应用参数模板
     */
    public CreateConfigTemplateResponse createConfigTemplate(CreateConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
     * Summary: 发布一个应用参数模板
     */
    public CreateConfigTemplateResponse createConfigTemplateEx(CreateConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConfigTemplateResponse());
    }

    /**
     * Description: 获取某个应用最新版本的应用参数模板
     * Summary: 获取某个应用最新版本的应用参数模板
     */
    public PullConfigTemplateResponse pullConfigTemplate(PullConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullConfigTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 获取某个应用最新版本的应用参数模板
     * Summary: 获取某个应用最新版本的应用参数模板
     */
    public PullConfigTemplateResponse pullConfigTemplateEx(PullConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.template.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullConfigTemplateResponse());
    }

    /**
     * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
     * Summary: 删除一个应用参数模板草稿
     */
    public DeleteConfigTemplatedraftResponse deleteConfigTemplatedraft(DeleteConfigTemplatedraftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigTemplatedraftEx(request, headers, runtime);
    }

    /**
     * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
     * Summary: 删除一个应用参数模板草稿
     */
    public DeleteConfigTemplatedraftResponse deleteConfigTemplatedraftEx(DeleteConfigTemplatedraftRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.templatedraft.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteConfigTemplatedraftResponse());
    }

    /**
     * Description: 获取某个指定的应用参数模板
     * Summary: 获取某个指定的应用参数模板
     */
    public GetConfigTemplateResponse getConfigTemplate(GetConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 获取某个指定的应用参数模板
     * Summary: 获取某个指定的应用参数模板
     */
    public GetConfigTemplateResponse getConfigTemplateEx(GetConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.template.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConfigTemplateResponse());
    }

    /**
     * Description: 查询符合条件的应用参数模板
     * Summary: 查询符合条件的应用参数模板
     */
    public QueryConfigTemplateResponse queryConfigTemplate(QueryConfigTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConfigTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 查询符合条件的应用参数模板
     * Summary: 查询符合条件的应用参数模板
     */
    public QueryConfigTemplateResponse queryConfigTemplateEx(QueryConfigTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConfigTemplateResponse());
    }

    /**
     * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
     * Summary: 渲染一个指定的参数列表
     */
    public ExecConfigParseResponse execConfigParse(ExecConfigParseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConfigParseEx(request, headers, runtime);
    }

    /**
     * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
     * Summary: 渲染一个指定的参数列表
     */
    public ExecConfigParseResponse execConfigParseEx(ExecConfigParseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.parse.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConfigParseResponse());
    }

    /**
     * Description: 批量创建全局参数
     * Summary: 批量创建全局参数
     */
    public BatchcreateConfigGlobalResponse batchcreateConfigGlobal(BatchcreateConfigGlobalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateConfigGlobalEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建全局参数
     * Summary: 批量创建全局参数
     */
    public BatchcreateConfigGlobalResponse batchcreateConfigGlobalEx(BatchcreateConfigGlobalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.global.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateConfigGlobalResponse());
    }

    /**
     * Description: 批量创建应用参数
     * Summary: 批量创建应用参数
     */
    public BatchcreateConfigAppResponse batchcreateConfigApp(BatchcreateConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateConfigAppEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建应用参数
     * Summary: 批量创建应用参数
     */
    public BatchcreateConfigAppResponse batchcreateConfigAppEx(BatchcreateConfigAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.app.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateConfigAppResponse());
    }

    /**
     * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
     * Summary: 获取当前租户下的站点管理员视角的树形结构
     */
    public GetConfigSitetreeResponse getConfigSitetree(GetConfigSitetreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigSitetreeEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
     * Summary: 获取当前租户下的站点管理员视角的树形结构
     */
    public GetConfigSitetreeResponse getConfigSitetreeEx(GetConfigSitetreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.sitetree.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConfigSitetreeResponse());
    }

    /**
     * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
     * Summary: 获取当前租户下的租户管理员视角的树形结构
     */
    public GetConfigTenanttreeResponse getConfigTenanttree(GetConfigTenanttreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigTenanttreeEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
     * Summary: 获取当前租户下的租户管理员视角的树形结构
     */
    public GetConfigTenanttreeResponse getConfigTenanttreeEx(GetConfigTenanttreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.tenanttree.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConfigTenanttreeResponse());
    }

    /**
     * Description: 检查应用参数是否已存在
     * Summary: 检查应用参数是否已存在
     */
    public ExistConfigAppResponse existConfigApp(ExistConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existConfigAppEx(request, headers, runtime);
    }

    /**
     * Description: 检查应用参数是否已存在
     * Summary: 检查应用参数是否已存在
     */
    public ExistConfigAppResponse existConfigAppEx(ExistConfigAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.app.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistConfigAppResponse());
    }

    /**
     * Description: 检查全局参数是否已存在
     * Summary: 检查全局参数是否已存在
     */
    public ExistConfigGlobalResponse existConfigGlobal(ExistConfigGlobalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existConfigGlobalEx(request, headers, runtime);
    }

    /**
     * Description: 检查全局参数是否已存在
     * Summary: 检查全局参数是否已存在
     */
    public ExistConfigGlobalResponse existConfigGlobalEx(ExistConfigGlobalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.config.global.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistConfigGlobalResponse());
    }

    /**
     * Description: 列出指定租户下所有环境
     * Summary: 列出指定租户下所有环境
     */
    public ListWorkspacegroupResponse listWorkspacegroup(ListWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 列出指定租户下所有环境
     * Summary: 列出指定租户下所有环境
     */
    public ListWorkspacegroupResponse listWorkspacegroupEx(ListWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspacegroup.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWorkspacegroupResponse());
    }

    /**
     * Description: 查询指定环境信息
     * Summary: 查询指定环境信息
     */
    public GetWorkspacegroupResponse getWorkspacegroup(GetWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定环境信息
     * Summary: 查询指定环境信息
     */
    public GetWorkspacegroupResponse getWorkspacegroupEx(GetWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspacegroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspacegroupResponse());
    }

    /**
     * Description: 查询部署单元列表
     * Summary: 查询部署单元列表
     */
    public QueryCellResponse queryCell(QueryCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元列表
     * Summary: 查询部署单元列表
     */
    public QueryCellResponse queryCellEx(QueryCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCellResponse());
    }

    /**
     * Description: 查询环境增量统计信息
     * Summary: 查询环境增量统计信息
     */
    public QueryWorkspaceDeltaResponse queryWorkspaceDelta(QueryWorkspaceDeltaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWorkspaceDeltaEx(request, headers, runtime);
    }

    /**
     * Description: 查询环境增量统计信息
     * Summary: 查询环境增量统计信息
     */
    public QueryWorkspaceDeltaResponse queryWorkspaceDeltaEx(QueryWorkspaceDeltaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspace.delta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWorkspaceDeltaResponse());
    }

    /**
     * Description: 创建工作空间组。
     * Summary: 创建工作空间组
     */
    public CreateWorkspacegroupResponse createWorkspacegroup(CreateWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建工作空间组。
     * Summary: 创建工作空间组
     */
    public CreateWorkspacegroupResponse createWorkspacegroupEx(CreateWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspacegroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWorkspacegroupResponse());
    }

    /**
     * Description: 查询环境组详细信息
     * Summary: 查询环境组详细信息
     */
    public QueryWorkspacegroupResponse queryWorkspacegroup(QueryWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询环境组详细信息
     * Summary: 查询环境组详细信息
     */
    public QueryWorkspacegroupResponse queryWorkspacegroupEx(QueryWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspacegroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWorkspacegroupResponse());
    }

    /**
     * Description: 删除指定工作空间组。
     * Summary: 删除指定工作空间组。
     */
    public DeleteWorkspacegroupResponse deleteWorkspacegroup(DeleteWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除指定工作空间组。
     * Summary: 删除指定工作空间组。
     */
    public DeleteWorkspacegroupResponse deleteWorkspacegroupEx(DeleteWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspacegroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteWorkspacegroupResponse());
    }

    /**
     * Description: 查询workspace信息(V2)。
     * Summary: 查询workspace信息(V2)。
     */
    public GetSingleworkspaceResponse getSingleworkspace(GetSingleworkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSingleworkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询workspace信息(V2)。
     * Summary: 查询workspace信息(V2)。
     */
    public GetSingleworkspaceResponse getSingleworkspaceEx(GetSingleworkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.singleworkspace.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSingleworkspaceResponse());
    }

    /**
     * Description: 查询指定环境信息。
     * Summary: 查询指定环境信息。
     */
    public GetSingleworkspacegroupResponse getSingleworkspacegroup(GetSingleworkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSingleworkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定环境信息。
     * Summary: 查询指定环境信息。
     */
    public GetSingleworkspacegroupResponse getSingleworkspacegroupEx(GetSingleworkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.singleworkspacegroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSingleworkspacegroupResponse());
    }

    /**
     * Description: 查询部署单元列表。
     * Summary: 查询部署单元列表。
     */
    public ListCellResponse listCell(ListCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元列表。
     * Summary: 查询部署单元列表。
     */
    public ListCellResponse listCellEx(ListCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cell.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCellResponse());
    }

    /**
     * Description: 创建workspace信息(V2)
     * Summary: 创建workspace信息(V2)
     */
    public CreateSingleworkspaceResponse createSingleworkspace(CreateSingleworkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSingleworkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 创建workspace信息(V2)
     * Summary: 创建workspace信息(V2)
     */
    public CreateSingleworkspaceResponse createSingleworkspaceEx(CreateSingleworkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.singleworkspace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSingleworkspaceResponse());
    }

    /**
     * Description: 删除workspace信息(V2)
     * Summary: 删除workspace信息(V2)
     */
    public DeleteSingleworkspaceResponse deleteSingleworkspace(DeleteSingleworkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSingleworkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 删除workspace信息(V2)
     * Summary: 删除workspace信息(V2)
     */
    public DeleteSingleworkspaceResponse deleteSingleworkspaceEx(DeleteSingleworkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.singleworkspace.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSingleworkspaceResponse());
    }

    /**
     * Description: 创建专有网络vpc
     * Summary: 创建专有网络vpc
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcEx(request, headers, runtime);
    }

    /**
     * Description: 创建专有网络vpc
     * Summary: 创建专有网络vpc
     */
    public CreateVpcResponse createVpcEx(CreateVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.vpc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateVpcResponse());
    }

    /**
     * Description: 更新workspacegroup。
     * Summary: 更新workspacegroup。
     */
    public UpdateWorkspacegroupResponse updateWorkspacegroup(UpdateWorkspacegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspacegroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新workspacegroup。
     * Summary: 更新workspacegroup。
     */
    public UpdateWorkspacegroupResponse updateWorkspacegroupEx(UpdateWorkspacegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspacegroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateWorkspacegroupResponse());
    }

    /**
     * Description: update workspace meta data
     * Summary: update workspace
     */
    public UpdateSingleworkspaceResponse updateSingleworkspace(UpdateSingleworkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSingleworkspaceEx(request, headers, runtime);
    }

    /**
     * Description: update workspace meta data
     * Summary: update workspace
     */
    public UpdateSingleworkspaceResponse updateSingleworkspaceEx(UpdateSingleworkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.singleworkspace.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSingleworkspaceResponse());
    }

    /**
     * Description: list regions
     * Summary: list regions
     */
    public ListRegionResponse listRegion(ListRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionEx(request, headers, runtime);
    }

    /**
     * Description: list regions
     * Summary: list regions
     */
    public ListRegionResponse listRegionEx(ListRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.region.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRegionResponse());
    }

    /**
     * Description: zone list
     * Summary: zone list
     */
    public ListZoneResponse listZone(ListZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listZoneEx(request, headers, runtime);
    }

    /**
     * Description: zone list
     * Summary: zone list
     */
    public ListZoneResponse listZoneEx(ListZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.zone.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListZoneResponse());
    }

    /**
     * Description: 创建逻辑单元
     * Summary: 创建逻辑单元
     */
    public CreateCellgroupResponse createCellgroup(CreateCellgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCellgroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建逻辑单元
     * Summary: 创建逻辑单元
     */
    public CreateCellgroupResponse createCellgroupEx(CreateCellgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cellgroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCellgroupResponse());
    }

    /**
     * Description: 删除逻辑单元
     * Summary: 删除逻辑单元
     */
    public DeleteCellgroupResponse deleteCellgroup(DeleteCellgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCellgroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除逻辑单元
     * Summary: 删除逻辑单元
     */
    public DeleteCellgroupResponse deleteCellgroupEx(DeleteCellgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cellgroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCellgroupResponse());
    }

    /**
     * Description: 查询逻辑单元
     * Summary: 查询逻辑单元
     */
    public QueryCellgroupResponse queryCellgroup(QueryCellgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCellgroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询逻辑单元
     * Summary: 查询逻辑单元
     */
    public QueryCellgroupResponse queryCellgroupEx(QueryCellgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cellgroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCellgroupResponse());
    }

    /**
     * Description: 配置逻辑单元灾备信息
     * Summary: 配置逻辑单元灾备信息
     */
    public UpdateCellgroupDisasterinfoResponse updateCellgroupDisasterinfo(UpdateCellgroupDisasterinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCellgroupDisasterinfoEx(request, headers, runtime);
    }

    /**
     * Description: 配置逻辑单元灾备信息
     * Summary: 配置逻辑单元灾备信息
     */
    public UpdateCellgroupDisasterinfoResponse updateCellgroupDisasterinfoEx(UpdateCellgroupDisasterinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cellgroup.disasterinfo.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCellgroupDisasterinfoResponse());
    }

    /**
     * Description: 创建部署单元
     * Summary: 创建部署单元
     */
    public CreateDeploymentCellResponse createDeploymentCell(CreateDeploymentCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeploymentCellEx(request, headers, runtime);
    }

    /**
     * Description: 创建部署单元
     * Summary: 创建部署单元
     */
    public CreateDeploymentCellResponse createDeploymentCellEx(CreateDeploymentCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.cell.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDeploymentCellResponse());
    }

    /**
     * Description: 删除部署单元
     * Summary: 删除部署单元
     */
    public DeleteDeploymentCellResponse deleteDeploymentCell(DeleteDeploymentCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeploymentCellEx(request, headers, runtime);
    }

    /**
     * Description: 删除部署单元
     * Summary: 删除部署单元
     */
    public DeleteDeploymentCellResponse deleteDeploymentCellEx(DeleteDeploymentCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.cell.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDeploymentCellResponse());
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     */
    public QueryDeploymentCellResponse queryDeploymentCell(QueryDeploymentCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeploymentCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     */
    public QueryDeploymentCellResponse queryDeploymentCellEx(QueryDeploymentCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeploymentCellResponse());
    }

    /**
     * Description: 更新部署单元
     * Summary: 更新部署单元
     */
    public UpdateDeploymentCellResponse updateDeploymentCell(UpdateDeploymentCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeploymentCellEx(request, headers, runtime);
    }

    /**
     * Description: 更新部署单元
     * Summary: 更新部署单元
     */
    public UpdateDeploymentCellResponse updateDeploymentCellEx(UpdateDeploymentCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.cell.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDeploymentCellResponse());
    }

    /**
     * Description: 批量查询部署单基础信息
     * Summary: 批量查询部署单基础信息
     */
    public QueryDeploymentResponse queryDeployment(QueryDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询部署单基础信息
     * Summary: 批量查询部署单基础信息
     */
    public QueryDeploymentResponse queryDeploymentEx(QueryDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeploymentResponse());
    }

    /**
     * Description: 对一个部署单执行取消操作。
    当部署单处于以下状态时可执行取消操作：
    INITED：初始化完成
    INIT_FAILED：初始化失败
     * Summary: 取消发布
     */
    public CancelDeploymentResponse cancelDeployment(CancelDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 对一个部署单执行取消操作。
    当部署单处于以下状态时可执行取消操作：
    INITED：初始化完成
    INIT_FAILED：初始化失败
     * Summary: 取消发布
     */
    public CancelDeploymentResponse cancelDeploymentEx(CancelDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDeploymentResponse());
    }

    /**
     * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
    - 部署依赖示例
    假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
    applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
     * Summary: 创建发布
     */
    public CreateDeploymentResponse createDeployment(CreateDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
    - 部署依赖示例
    假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
    applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
     * Summary: 创建发布
     */
    public CreateDeploymentResponse createDeploymentEx(CreateDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDeploymentResponse());
    }

    /**
     * Description: 查询一个已经创建成功的部署操作。
     * Summary: 获取部署
     */
    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个已经创建成功的部署操作。
     * Summary: 获取部署
     */
    public GetDeploymentResponse getDeploymentEx(GetDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeploymentResponse());
    }

    /**
     * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
    当部署单处于以下状态时可执行重试操作：
    - FAILED：执行失败
     * Summary: 重试部署
     */
    public RetryDeploymentResponse retryDeployment(RetryDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
    当部署单处于以下状态时可执行重试操作：
    - FAILED：执行失败
     * Summary: 重试部署
     */
    public RetryDeploymentResponse retryDeploymentEx(RetryDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryDeploymentResponse());
    }

    /**
     * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始部署
     */
    public StartDeploymentResponse startDeployment(StartDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始部署
     */
    public StartDeploymentResponse startDeploymentEx(StartDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDeploymentResponse());
    }

    /**
     * Description: 查询一个部署操作中某个应用（服务）的详情。
     * Summary: 获取部署应用（服务）
     */
    public GetDeploymentApplicationResponse getDeploymentApplication(GetDeploymentApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeploymentApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个部署操作中某个应用（服务）的详情。
     * Summary: 获取部署应用（服务）
     */
    public GetDeploymentApplicationResponse getDeploymentApplicationEx(GetDeploymentApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.application.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeploymentApplicationResponse());
    }

    /**
     * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
    当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
    - EXECUTING：执行中
    - SUCCESS：执行成功
    - FAILED：执行失败
     * Summary: 回滚部署
     */
    public RollbackDeploymentApplicationResponse rollbackDeploymentApplication(RollbackDeploymentApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackDeploymentApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
    当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
    - EXECUTING：执行中
    - SUCCESS：执行成功
    - FAILED：执行失败
     * Summary: 回滚部署
     */
    public RollbackDeploymentApplicationResponse rollbackDeploymentApplicationEx(RollbackDeploymentApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.application.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackDeploymentApplicationResponse());
    }

    /**
     * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化部署
     */
    public ReinitDeploymentResponse reinitDeployment(ReinitDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化部署
     */
    public ReinitDeploymentResponse reinitDeploymentEx(ReinitDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.deployment.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitDeploymentResponse());
    }

    /**
     * Description: 根据查询条件查询指令模板。
     * Summary: 查询指令模板
     */
    public QueryCmdtemplateResponse queryCmdtemplate(QueryCmdtemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCmdtemplateEx(request, headers, runtime);
    }

    /**
     * Description: 根据查询条件查询指令模板。
     * Summary: 查询指令模板
     */
    public QueryCmdtemplateResponse queryCmdtemplateEx(QueryCmdtemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cmdtemplate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCmdtemplateResponse());
    }

    /**
     * Description: 获取指令模板详情。
     * Summary: 获取指令模板详情。
     */
    public GetCmdtemplateResponse getCmdtemplate(GetCmdtemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCmdtemplateEx(request, headers, runtime);
    }

    /**
     * Description: 获取指令模板详情。
     * Summary: 获取指令模板详情。
     */
    public GetCmdtemplateResponse getCmdtemplateEx(GetCmdtemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cmdtemplate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCmdtemplateResponse());
    }

    /**
     * Description: 同步执行指令。
     * Summary: 同步执行指令。
     */
    public SyncexecuteCmdTaskResponse syncexecuteCmdTask(SyncexecuteCmdTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncexecuteCmdTaskEx(request, headers, runtime);
    }

    /**
     * Description: 同步执行指令。
     * Summary: 同步执行指令。
     */
    public SyncexecuteCmdTaskResponse syncexecuteCmdTaskEx(SyncexecuteCmdTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cmd.task.syncexecute", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncexecuteCmdTaskResponse());
    }

    /**
     * Description: 异步执行指令。
     * Summary: 异步执行指令。
     */
    public AsyncexecuteCmdTaskResponse asyncexecuteCmdTask(AsyncexecuteCmdTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.asyncexecuteCmdTaskEx(request, headers, runtime);
    }

    /**
     * Description: 异步执行指令。
     * Summary: 异步执行指令。
     */
    public AsyncexecuteCmdTaskResponse asyncexecuteCmdTaskEx(AsyncexecuteCmdTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cmd.task.asyncexecute", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AsyncexecuteCmdTaskResponse());
    }

    /**
     * Description: 查询执行指令任务结果。
     * Summary: 查询执行指令任务结果。
     */
    public GetCmdTaskResponse getCmdTask(GetCmdTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCmdTaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询执行指令任务结果。
     * Summary: 查询执行指令任务结果。
     */
    public GetCmdTaskResponse getCmdTaskEx(GetCmdTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cmd.task.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCmdTaskResponse());
    }

    /**
     * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
     * Summary: 创建一个应用（服务）运维单
     */
    public CreateAppopsResponse createAppops(CreateAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
     * Summary: 创建一个应用（服务）运维单
     */
    public CreateAppopsResponse createAppopsEx(CreateAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appops.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppopsResponse());
    }

    /**
     * Description: 查询一个已经创建成功的运维操作。
     * Summary: 获取运维单
     */
    public GetAppopsResponse getAppops(GetAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个已经创建成功的运维操作。
     * Summary: 获取运维单
     */
    public GetAppopsResponse getAppopsEx(GetAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appops.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppopsResponse());
    }

    /**
     * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     */
    public StartAppopsResponse startAppops(StartAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     */
    public StartAppopsResponse startAppopsEx(StartAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appops.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAppopsResponse());
    }

    /**
     * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     */
    public ReinitAppopsResponse reinitAppops(ReinitAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     */
    public ReinitAppopsResponse reinitAppopsEx(ReinitAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appops.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitAppopsResponse());
    }

    /**
     * Description: 对一个运维单执行取消操作。
    当运维单处于以下状态时可执行取消操作：
    INITED：初始化完成
    INIT_FAILED：初始化失败
     * Summary: 取消发布
     */
    public CancelAppopsResponse cancelAppops(CancelAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 对一个运维单执行取消操作。
    当运维单处于以下状态时可执行取消操作：
    INITED：初始化完成
    INIT_FAILED：初始化失败
     * Summary: 取消发布
     */
    public CancelAppopsResponse cancelAppopsEx(CancelAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appops.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAppopsResponse());
    }

    /**
     * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
    当运维单处于以下状态时可执行重试操作：
    - FAILED：执行失败
     * Summary: 重试运维
     */
    public RetryAppopsResponse retryAppops(RetryAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
    当运维单处于以下状态时可执行重试操作：
    - FAILED：执行失败
     * Summary: 重试运维
     */
    public RetryAppopsResponse retryAppopsEx(RetryAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appops.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryAppopsResponse());
    }

    /**
     * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
     * Summary: 创建一个机器运维单
     */
    public CreateComputeropsResponse createComputerops(CreateComputeropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputeropsEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
     * Summary: 创建一个机器运维单
     */
    public CreateComputeropsResponse createComputeropsEx(CreateComputeropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computerops.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateComputeropsResponse());
    }

    /**
     * Description: 查询一个已经创建成功的机器运维操作。
     * Summary: 获取运维单
     */
    public GetComputeropsResponse getComputerops(GetComputeropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeropsEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个已经创建成功的机器运维操作。
     * Summary: 获取运维单
     */
    public GetComputeropsResponse getComputeropsEx(GetComputeropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computerops.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetComputeropsResponse());
    }

    /**
     * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     */
    public StartComputeropsResponse startComputerops(StartComputeropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startComputeropsEx(request, headers, runtime);
    }

    /**
     * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     */
    public StartComputeropsResponse startComputeropsEx(StartComputeropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computerops.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartComputeropsResponse());
    }

    /**
     * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     */
    public ReinitComputeropsResponse reinitComputerops(ReinitComputeropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitComputeropsEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     */
    public ReinitComputeropsResponse reinitComputeropsEx(ReinitComputeropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computerops.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitComputeropsResponse());
    }

    /**
     * Description: 对一个机器运维单执行取消操作。
    当运维单处于以下状态时可执行取消操作：
    INITED：初始化完成
    INIT_FAILED：初始化失败
     * Summary: 取消发布
     */
    public CancelComputeropsResponse cancelComputerops(CancelComputeropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelComputeropsEx(request, headers, runtime);
    }

    /**
     * Description: 对一个机器运维单执行取消操作。
    当运维单处于以下状态时可执行取消操作：
    INITED：初始化完成
    INIT_FAILED：初始化失败
     * Summary: 取消发布
     */
    public CancelComputeropsResponse cancelComputeropsEx(CancelComputeropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computerops.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelComputeropsResponse());
    }

    /**
     * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
    当运维单处于以下状态时可执行重试操作：
    - FAILED：执行失败
     * Summary: 重试运维
     */
    public RetryComputeropsResponse retryComputerops(RetryComputeropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryComputeropsEx(request, headers, runtime);
    }

    /**
     * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
    当运维单处于以下状态时可执行重试操作：
    - FAILED：执行失败
     * Summary: 重试运维
     */
    public RetryComputeropsResponse retryComputeropsEx(RetryComputeropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computerops.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryComputeropsResponse());
    }

    /**
     * Description: 查询应用服务的运维历史。
     * Summary: 查询应用服务的运维历史。
     */
    public QueryOpsappsvcResponse queryOpsappsvc(QueryOpsappsvcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsappsvcEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用服务的运维历史。
     * Summary: 查询应用服务的运维历史。
     */
    public QueryOpsappsvcResponse queryOpsappsvcEx(QueryOpsappsvcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.opsappsvc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsappsvcResponse());
    }

    /**
     * Description: 异步执行Bash命令。
     * Summary: 异步执行Bash命令。
     */
    public AsyncexecuteBashcmdResponse asyncexecuteBashcmd(AsyncexecuteBashcmdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.asyncexecuteBashcmdEx(request, headers, runtime);
    }

    /**
     * Description: 异步执行Bash命令。
     * Summary: 异步执行Bash命令。
     */
    public AsyncexecuteBashcmdResponse asyncexecuteBashcmdEx(AsyncexecuteBashcmdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bashcmd.asyncexecute", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AsyncexecuteBashcmdResponse());
    }

    /**
     * Description: 根据异步执行bash命令的任务ID查询结果。
     * Summary: 根据异步执行bash命令的任务ID查询结果。
     */
    public GetBashcmdResultResponse getBashcmdResult(GetBashcmdResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBashcmdResultEx(request, headers, runtime);
    }

    /**
     * Description: 根据异步执行bash命令的任务ID查询结果。
     * Summary: 根据异步执行bash命令的任务ID查询结果。
     */
    public GetBashcmdResultResponse getBashcmdResultEx(GetBashcmdResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bashcmd.result.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBashcmdResultResponse());
    }

    /**
     * Description: 查询当前环境是否已开通蓝绿发布
     * Summary: 查询当前环境是否已开通蓝绿发布
     */
    public CheckCloudconfigBgreleaseResponse checkCloudconfigBgrelease(CheckCloudconfigBgreleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigBgreleaseEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前环境是否已开通蓝绿发布
     * Summary: 查询当前环境是否已开通蓝绿发布
     */
    public CheckCloudconfigBgreleaseResponse checkCloudconfigBgreleaseEx(CheckCloudconfigBgreleaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.bgrelease.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigBgreleaseResponse());
    }

    /**
     * Description: 查询是否已开通蓝绿发布部署单元
     * Summary: 查询是否已开通蓝绿发布部署单元
     */
    public CheckCloudconfigBgdeploymentcellResponse checkCloudconfigBgdeploymentcell(CheckCloudconfigBgdeploymentcellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigBgdeploymentcellEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否已开通蓝绿发布部署单元
     * Summary: 查询是否已开通蓝绿发布部署单元
     */
    public CheckCloudconfigBgdeploymentcellResponse checkCloudconfigBgdeploymentcellEx(CheckCloudconfigBgdeploymentcellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.bgdeploymentcell.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigBgdeploymentcellResponse());
    }

    /**
     * Description: 查询是否已开通应用服务
     * Summary: 查询是否已开通应用服务
     */
    public CheckCloudconfigAppserviceResponse checkCloudconfigAppservice(CheckCloudconfigAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否已开通应用服务
     * Summary: 查询是否已开通应用服务
     */
    public CheckCloudconfigAppserviceResponse checkCloudconfigAppserviceEx(CheckCloudconfigAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.appservice.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigAppserviceResponse());
    }

    /**
     * Description: 查询是否已开通共享中间件
     * Summary: 查询是否已开通共享中间件
     */
    public CheckCloudconfigSharedmwResponse checkCloudconfigSharedmw(CheckCloudconfigSharedmwRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigSharedmwEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否已开通共享中间件
     * Summary: 查询是否已开通共享中间件
     */
    public CheckCloudconfigSharedmwResponse checkCloudconfigSharedmwEx(CheckCloudconfigSharedmwRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.sharedmw.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigSharedmwResponse());
    }

    /**
     * Description: 查询是否使用 v1 发布策略
     * Summary: 查询是否使用 v1 发布策略
     */
    public CheckCloudconfigVonereleaseResponse checkCloudconfigVonerelease(CheckCloudconfigVonereleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigVonereleaseEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否使用 v1 发布策略
     * Summary: 查询是否使用 v1 发布策略
     */
    public CheckCloudconfigVonereleaseResponse checkCloudconfigVonereleaseEx(CheckCloudconfigVonereleaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.vonerelease.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigVonereleaseResponse());
    }

    /**
     * Description: 查询是否使用 v1 应用运维策略
     * Summary: 查询是否使用 v1 应用运维策略
     */
    public CheckCloudconfigVoneappopsResponse checkCloudconfigVoneappops(CheckCloudconfigVoneappopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigVoneappopsEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否使用 v1 应用运维策略
     * Summary: 查询是否使用 v1 应用运维策略
     */
    public CheckCloudconfigVoneappopsResponse checkCloudconfigVoneappopsEx(CheckCloudconfigVoneappopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.voneappops.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigVoneappopsResponse());
    }

    /**
     * Description: 查询是否使用老版本界面
     * Summary: 查询是否使用老版本界面
     */
    public CheckCloudconfigOlduiResponse checkCloudconfigOldui(CheckCloudconfigOlduiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigOlduiEx(request, headers, runtime);
    }

    /**
     * Description: 查询是否使用老版本界面
     * Summary: 查询是否使用老版本界面
     */
    public CheckCloudconfigOlduiResponse checkCloudconfigOlduiEx(CheckCloudconfigOlduiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.oldui.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigOlduiResponse());
    }

    /**
     * Description: 是否禁用 XDC LB
     * Summary: 是否禁用 XDC LB
     */
    public CheckCloudconfigXdclbforbiddenResponse checkCloudconfigXdclbforbidden(CheckCloudconfigXdclbforbiddenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCloudconfigXdclbforbiddenEx(request, headers, runtime);
    }

    /**
     * Description: 是否禁用 XDC LB
     * Summary: 是否禁用 XDC LB
     */
    public CheckCloudconfigXdclbforbiddenResponse checkCloudconfigXdclbforbiddenEx(CheckCloudconfigXdclbforbiddenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.xdclbforbidden.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCloudconfigXdclbforbiddenResponse());
    }

    /**
     * Description: 查询 openapi 配置信息
     * Summary: 查询 openapi 配置信息
     */
    public QueryCloudconfigOpenapiconfigResponse queryCloudconfigOpenapiconfig(QueryCloudconfigOpenapiconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCloudconfigOpenapiconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询 openapi 配置信息
     * Summary: 查询 openapi 配置信息
     */
    public QueryCloudconfigOpenapiconfigResponse queryCloudconfigOpenapiconfigEx(QueryCloudconfigOpenapiconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.cloudconfig.openapiconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCloudconfigOpenapiconfigResponse());
    }

    /**
     * Description: 查询应用包个数
     * Summary: 查询应用包个数
     */
    public CountAppsPkgResponse countAppsPkg(CountAppsPkgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countAppsPkgEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用包个数
     * Summary: 查询应用包个数
     */
    public CountAppsPkgResponse countAppsPkgEx(CountAppsPkgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.apps.pkg.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountAppsPkgResponse());
    }

    /**
     * Description: 查询app下的资源统计
     * Summary: 查询app下的资源统计
     */
    public QueryAppUnitresourcesResponse queryAppUnitresources(QueryAppUnitresourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppUnitresourcesEx(request, headers, runtime);
    }

    /**
     * Description: 查询app下的资源统计
     * Summary: 查询app下的资源统计
     */
    public QueryAppUnitresourcesResponse queryAppUnitresourcesEx(QueryAppUnitresourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.app.unitresources.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppUnitresourcesResponse());
    }

    /**
     * Description: 查询认证 token
     * Summary: 查询认证 token
     */
    public QueryOauthTokenResponse queryOauthToken(QueryOauthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOauthTokenEx(request, headers, runtime);
    }

    /**
     * Description: 查询认证 token
     * Summary: 查询认证 token
     */
    public QueryOauthTokenResponse queryOauthTokenEx(QueryOauthTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.oauth.token.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOauthTokenResponse());
    }

    /**
     * Description: 创建或更新 token
     * Summary: 创建或更新 token
     */
    public UpdateOauthTokenResponse updateOauthToken(UpdateOauthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOauthTokenEx(request, headers, runtime);
    }

    /**
     * Description: 创建或更新 token
     * Summary: 创建或更新 token
     */
    public UpdateOauthTokenResponse updateOauthTokenEx(UpdateOauthTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.oauth.token.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateOauthTokenResponse());
    }

    /**
     * Description: 删除 token
     * Summary: 删除 token
     */
    public DeleteOauthTokenResponse deleteOauthToken(DeleteOauthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOauthTokenEx(request, headers, runtime);
    }

    /**
     * Description: 删除 token
     * Summary: 删除 token
     */
    public DeleteOauthTokenResponse deleteOauthTokenEx(DeleteOauthTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.oauth.token.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteOauthTokenResponse());
    }

    /**
     * Description: 查询 DZ
     * Summary: 查询 DZ
     */
    public QueryBaseinfoDeploymentzonesResponse queryBaseinfoDeploymentzones(QueryBaseinfoDeploymentzonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaseinfoDeploymentzonesEx(request, headers, runtime);
    }

    /**
     * Description: 查询 DZ
     * Summary: 查询 DZ
     */
    public QueryBaseinfoDeploymentzonesResponse queryBaseinfoDeploymentzonesEx(QueryBaseinfoDeploymentzonesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.baseinfo.deploymentzones.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaseinfoDeploymentzonesResponse());
    }

    /**
     * Description: 获取蓝绿发布概览
     * Summary: 获取蓝绿发布概览
     */
    public GetBgreleaseArrangementResponse getBgreleaseArrangement(GetBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 获取蓝绿发布概览
     * Summary: 获取蓝绿发布概览
     */
    public GetBgreleaseArrangementResponse getBgreleaseArrangementEx(GetBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBgreleaseArrangementResponse());
    }

    /**
     * Description: 查询蓝绿发布概览
     * Summary: 查询蓝绿发布概览
     */
    public QueryBgreleaseArrangementResponse queryBgreleaseArrangement(QueryBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 查询蓝绿发布概览
     * Summary: 查询蓝绿发布概览
     */
    public QueryBgreleaseArrangementResponse queryBgreleaseArrangementEx(QueryBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBgreleaseArrangementResponse());
    }

    /**
     * Description: 查询蓝绿发布进度
     * Summary: 查询蓝绿发布进度
     */
    public QueryBgreleaseArrangementprogressResponse queryBgreleaseArrangementprogress(QueryBgreleaseArrangementprogressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBgreleaseArrangementprogressEx(request, headers, runtime);
    }

    /**
     * Description: 查询蓝绿发布进度
     * Summary: 查询蓝绿发布进度
     */
    public QueryBgreleaseArrangementprogressResponse queryBgreleaseArrangementprogressEx(QueryBgreleaseArrangementprogressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangementprogress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBgreleaseArrangementprogressResponse());
    }

    /**
     * Description: 查询蓝绿发布任务进度
     * Summary: 查询蓝绿发布任务进度
     */
    public QueryBgreleaseTaskprogressResponse queryBgreleaseTaskprogress(QueryBgreleaseTaskprogressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBgreleaseTaskprogressEx(request, headers, runtime);
    }

    /**
     * Description: 查询蓝绿发布任务进度
     * Summary: 查询蓝绿发布任务进度
     */
    public QueryBgreleaseTaskprogressResponse queryBgreleaseTaskprogressEx(QueryBgreleaseTaskprogressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.taskprogress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBgreleaseTaskprogressResponse());
    }

    /**
     * Description: 执行蓝绿发布
     * Summary: 执行蓝绿发布
     */
    public ExecBgreleaseArrangementResponse execBgreleaseArrangement(ExecBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 执行蓝绿发布
     * Summary: 执行蓝绿发布
     */
    public ExecBgreleaseArrangementResponse execBgreleaseArrangementEx(ExecBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecBgreleaseArrangementResponse());
    }

    /**
     * Description: 验证确认蓝绿发布
     * Summary: 验证确认蓝绿发布
     */
    public ConfirmBgreleaseArrangementResponse confirmBgreleaseArrangement(ConfirmBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 验证确认蓝绿发布
     * Summary: 验证确认蓝绿发布
     */
    public ConfirmBgreleaseArrangementResponse confirmBgreleaseArrangementEx(ConfirmBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmBgreleaseArrangementResponse());
    }

    /**
     * Description: 蓝绿验证确认
     * Summary: 蓝绿验证确认
     */
    public ConfirmBgreleaseArrangementvalidationResponse confirmBgreleaseArrangementvalidation(ConfirmBgreleaseArrangementvalidationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmBgreleaseArrangementvalidationEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿验证确认
     * Summary: 蓝绿验证确认
     */
    public ConfirmBgreleaseArrangementvalidationResponse confirmBgreleaseArrangementvalidationEx(ConfirmBgreleaseArrangementvalidationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangementvalidation.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmBgreleaseArrangementvalidationResponse());
    }

    /**
     * Description: 重试蓝绿发布
     * Summary: 重试蓝绿发布
     */
    public RetryBgreleaseArrangementResponse retryBgreleaseArrangement(RetryBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 重试蓝绿发布
     * Summary: 重试蓝绿发布
     */
    public RetryBgreleaseArrangementResponse retryBgreleaseArrangementEx(RetryBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryBgreleaseArrangementResponse());
    }

    /**
     * Description: 重试蓝绿发布任务
     * Summary: 重试蓝绿发布任务
     */
    public RetryBgreleaseTaskResponse retryBgreleaseTask(RetryBgreleaseTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryBgreleaseTaskEx(request, headers, runtime);
    }

    /**
     * Description: 重试蓝绿发布任务
     * Summary: 重试蓝绿发布任务
     */
    public RetryBgreleaseTaskResponse retryBgreleaseTaskEx(RetryBgreleaseTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.task.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryBgreleaseTaskResponse());
    }

    /**
     * Description: 跳过蓝绿发布任务
     * Summary: 跳过蓝绿发布任务
     */
    public SkipBgreleaseTaskResponse skipBgreleaseTask(SkipBgreleaseTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipBgreleaseTaskEx(request, headers, runtime);
    }

    /**
     * Description: 跳过蓝绿发布任务
     * Summary: 跳过蓝绿发布任务
     */
    public SkipBgreleaseTaskResponse skipBgreleaseTaskEx(SkipBgreleaseTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.task.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipBgreleaseTaskResponse());
    }

    /**
     * Description: 跳过蓝绿发布
     * Summary: 跳过蓝绿发布
     */
    public SkipBgreleaseArrangementResponse skipBgreleaseArrangement(SkipBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 跳过蓝绿发布
     * Summary: 跳过蓝绿发布
     */
    public SkipBgreleaseArrangementResponse skipBgreleaseArrangementEx(SkipBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipBgreleaseArrangementResponse());
    }

    /**
     * Description: 取消蓝绿发布
     * Summary: 取消蓝绿发布
     */
    public CancelBgreleaseArrangementResponse cancelBgreleaseArrangement(CancelBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 取消蓝绿发布
     * Summary: 取消蓝绿发布
     */
    public CancelBgreleaseArrangementResponse cancelBgreleaseArrangementEx(CancelBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBgreleaseArrangementResponse());
    }

    /**
     * Description: 回滚蓝绿发布
     * Summary: 回滚蓝绿发布
     */
    public RollbackBgreleaseArrangementResponse rollbackBgreleaseArrangement(RollbackBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 回滚蓝绿发布
     * Summary: 回滚蓝绿发布
     */
    public RollbackBgreleaseArrangementResponse rollbackBgreleaseArrangementEx(RollbackBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackBgreleaseArrangementResponse());
    }

    /**
     * Description: 蓝绿发布回滚重试
     * Summary: 蓝绿发布回滚重试
     */
    public RetryrollbackBgreleaseArrangementResponse retryrollbackBgreleaseArrangement(RetryrollbackBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryrollbackBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿发布回滚重试
     * Summary: 蓝绿发布回滚重试
     */
    public RetryrollbackBgreleaseArrangementResponse retryrollbackBgreleaseArrangementEx(RetryrollbackBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.retryrollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryrollbackBgreleaseArrangementResponse());
    }

    /**
     * Description: 蓝绿发布回滚确认
     * Summary: 蓝绿发布回滚确认
     */
    public ConfirmrollbackBgreleaseArrangementResponse confirmrollbackBgreleaseArrangement(ConfirmrollbackBgreleaseArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmrollbackBgreleaseArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿发布回滚确认
     * Summary: 蓝绿发布回滚确认
     */
    public ConfirmrollbackBgreleaseArrangementResponse confirmrollbackBgreleaseArrangementEx(ConfirmrollbackBgreleaseArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirmrollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmrollbackBgreleaseArrangementResponse());
    }

    /**
     * Description: 蓝绿发布灰度流量迁移
     * Summary: 蓝绿发布灰度流量迁移
     */
    public SwitchBgreleaseGraytrafficResponse switchBgreleaseGraytraffic(SwitchBgreleaseGraytrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchBgreleaseGraytrafficEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿发布灰度流量迁移
     * Summary: 蓝绿发布灰度流量迁移
     */
    public SwitchBgreleaseGraytrafficResponse switchBgreleaseGraytrafficEx(SwitchBgreleaseGraytrafficRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.graytraffic.switch", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SwitchBgreleaseGraytrafficResponse());
    }

    /**
     * Description: 蓝绿发布灰度流量回滚
     * Summary: 蓝绿发布灰度流量回滚
     */
    public RollbackBgreleaseGraytrafficResponse rollbackBgreleaseGraytraffic(RollbackBgreleaseGraytrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackBgreleaseGraytrafficEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿发布灰度流量回滚
     * Summary: 蓝绿发布灰度流量回滚
     */
    public RollbackBgreleaseGraytrafficResponse rollbackBgreleaseGraytrafficEx(RollbackBgreleaseGraytrafficRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.graytraffic.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackBgreleaseGraytrafficResponse());
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     */
    public QueryBgreleaseGrayprogressResponse queryBgreleaseGrayprogress(QueryBgreleaseGrayprogressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBgreleaseGrayprogressEx(request, headers, runtime);
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     */
    public QueryBgreleaseGrayprogressResponse queryBgreleaseGrayprogressEx(QueryBgreleaseGrayprogressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.bgrelease.grayprogress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBgreleaseGrayprogressResponse());
    }

    /**
     * Description: 获取灰度引流进度
     * Summary: 获取灰度引流进度
     */
    public GetGrayProcessResponse getGrayProcess(GetGrayProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGrayProcessEx(request, headers, runtime);
    }

    /**
     * Description: 获取灰度引流进度
     * Summary: 获取灰度引流进度
     */
    public GetGrayProcessResponse getGrayProcessEx(GetGrayProcessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.gray.process.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGrayProcessResponse());
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     */
    public QueryGrayProgressResponse queryGrayProgress(QueryGrayProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGrayProgressEx(request, headers, runtime);
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     */
    public QueryGrayProgressResponse queryGrayProgressEx(QueryGrayProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.gray.progress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGrayProgressResponse());
    }

    /**
     * Description: 重新初始化灰度发布
     * Summary: 重新初始化灰度发布
     */
    public ReinitGrayProcessResponse reinitGrayProcess(ReinitGrayProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitGrayProcessEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化灰度发布
     * Summary: 重新初始化灰度发布
     */
    public ReinitGrayProcessResponse reinitGrayProcessEx(ReinitGrayProcessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.gray.process.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitGrayProcessResponse());
    }

    /**
     * Description: 重试灰度发布子任务
     * Summary: 重试灰度发布子任务
     */
    public RetryGrayTaskResponse retryGrayTask(RetryGrayTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryGrayTaskEx(request, headers, runtime);
    }

    /**
     * Description: 重试灰度发布子任务
     * Summary: 重试灰度发布子任务
     */
    public RetryGrayTaskResponse retryGrayTaskEx(RetryGrayTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.gray.task.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryGrayTaskResponse());
    }

    /**
     * Description: 跳过灰度发布子任务
     * Summary: 跳过灰度发布子任务
     */
    public SkipGrayTaskResponse skipGrayTask(SkipGrayTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipGrayTaskEx(request, headers, runtime);
    }

    /**
     * Description: 跳过灰度发布子任务
     * Summary: 跳过灰度发布子任务
     */
    public SkipGrayTaskResponse skipGrayTaskEx(SkipGrayTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.gray.task.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipGrayTaskResponse());
    }

    /**
     * Description: 查询发布机器信息
     * Summary: 查询发布机器信息
     */
    public QueryMachineResponse queryMachine(QueryMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMachineEx(request, headers, runtime);
    }

    /**
     * Description: 查询发布机器信息
     * Summary: 查询发布机器信息
     */
    public QueryMachineResponse queryMachineEx(QueryMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machine.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMachineResponse());
    }

    /**
     * Description: 获取发布机器信息
     * Summary: 获取发布机器信息
     */
    public GetMachineResponse getMachine(GetMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMachineEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布机器信息
     * Summary: 获取发布机器信息
     */
    public GetMachineResponse getMachineEx(GetMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machine.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMachineResponse());
    }

    /**
     * Description: 查询机器发布进度
     * Summary: 查询机器发布进度
     */
    public QueryMachineProgressResponse queryMachineProgress(QueryMachineProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMachineProgressEx(request, headers, runtime);
    }

    /**
     * Description: 查询机器发布进度
     * Summary: 查询机器发布进度
     */
    public QueryMachineProgressResponse queryMachineProgressEx(QueryMachineProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machine.progress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMachineProgressResponse());
    }

    /**
     * Description: 重试发布机器
     * Summary: 重试发布机器
     */
    public RetryMachineResponse retryMachine(RetryMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryMachineEx(request, headers, runtime);
    }

    /**
     * Description: 重试发布机器
     * Summary: 重试发布机器
     */
    public RetryMachineResponse retryMachineEx(RetryMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machine.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryMachineResponse());
    }

    /**
     * Description: 忽略机器发布
     * Summary: 忽略机器发布
     */
    public SkipMachineResponse skipMachine(SkipMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipMachineEx(request, headers, runtime);
    }

    /**
     * Description: 忽略机器发布
     * Summary: 忽略机器发布
     */
    public SkipMachineResponse skipMachineEx(SkipMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machine.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipMachineResponse());
    }

    /**
     * Description: 取消机器发布
     * Summary: 取消机器发布
     */
    public CancelMachineResponse cancelMachine(CancelMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelMachineEx(request, headers, runtime);
    }

    /**
     * Description: 取消机器发布
     * Summary: 取消机器发布
     */
    public CancelMachineResponse cancelMachineEx(CancelMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machine.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelMachineResponse());
    }

    /**
     * Description: 触发执行机器发布
     * Summary: 触发执行机器发布
     */
    public ExecMachineResponse execMachine(ExecMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execMachineEx(request, headers, runtime);
    }

    /**
     * Description: 触发执行机器发布
     * Summary: 触发执行机器发布
     */
    public ExecMachineResponse execMachineEx(ExecMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machine.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecMachineResponse());
    }

    /**
     * Description: 查询机器分组发布进度
     * Summary: 查询机器分组发布进度
     */
    public QueryMachinegroupProgressResponse queryMachinegroupProgress(QueryMachinegroupProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMachinegroupProgressEx(request, headers, runtime);
    }

    /**
     * Description: 查询机器分组发布进度
     * Summary: 查询机器分组发布进度
     */
    public QueryMachinegroupProgressResponse queryMachinegroupProgressEx(QueryMachinegroupProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.progress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMachinegroupProgressResponse());
    }

    /**
     * Description: 重试机器分组
     * Summary: 重试机器分组
     */
    public RetryMachinegroupResponse retryMachinegroup(RetryMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 重试机器分组
     * Summary: 重试机器分组
     */
    public RetryMachinegroupResponse retryMachinegroupEx(RetryMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryMachinegroupResponse());
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     */
    public SkipMachinegroupResponse skipMachinegroup(SkipMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     */
    public SkipMachinegroupResponse skipMachinegroupEx(SkipMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipMachinegroupResponse());
    }

    /**
     * Description: 分组取消
     * Summary: 分组取消
     */
    public CancelMachinegroupResponse cancelMachinegroup(CancelMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 分组取消
     * Summary: 分组取消
     */
    public CancelMachinegroupResponse cancelMachinegroupEx(CancelMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelMachinegroupResponse());
    }

    /**
     * Description: 分组删除
     * Summary: 分组删除
     */
    public DeleteMachinegroupResponse deleteMachinegroup(DeleteMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 分组删除
     * Summary: 分组删除
     */
    public DeleteMachinegroupResponse deleteMachinegroupEx(DeleteMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMachinegroupResponse());
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组
     */
    public UpdateMachinegroupResponse updateMachinegroup(UpdateMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组
     */
    public UpdateMachinegroupResponse updateMachinegroupEx(UpdateMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMachinegroupResponse());
    }

    /**
     * Description: 机器分组确认
     * Summary: 机器分组确认
     */
    public ConfirmMachinegroupResponse confirmMachinegroup(ConfirmMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 机器分组确认
     * Summary: 机器分组确认
     */
    public ConfirmMachinegroupResponse confirmMachinegroupEx(ConfirmMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmMachinegroupResponse());
    }

    /**
     * Description: 机器分组进度批量查询
     * Summary: 机器分组进度批量查询
     */
    public BatchqueryMachinegroupProgressResponse batchqueryMachinegroupProgress(BatchqueryMachinegroupProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryMachinegroupProgressEx(request, headers, runtime);
    }

    /**
     * Description: 机器分组进度批量查询
     * Summary: 机器分组进度批量查询
     */
    public BatchqueryMachinegroupProgressResponse batchqueryMachinegroupProgressEx(BatchqueryMachinegroupProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.progress.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryMachinegroupProgressResponse());
    }

    /**
     * Description: 分区预确认
     * Summary: 分区预确认
     */
    public ConfirmMachinegroupReserveResponse confirmMachinegroupReserve(ConfirmMachinegroupReserveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmMachinegroupReserveEx(request, headers, runtime);
    }

    /**
     * Description: 分区预确认
     * Summary: 分区预确认
     */
    public ConfirmMachinegroupReserveResponse confirmMachinegroupReserveEx(ConfirmMachinegroupReserveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.reserve.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmMachinegroupReserveResponse());
    }

    /**
     * Description: 修改分组 SLB 权重
     * Summary: 修改分组 SLB 权重
     */
    public UpdateMachinegroupSlbmountweightResponse updateMachinegroupSlbmountweight(UpdateMachinegroupSlbmountweightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMachinegroupSlbmountweightEx(request, headers, runtime);
    }

    /**
     * Description: 修改分组 SLB 权重
     * Summary: 修改分组 SLB 权重
     */
    public UpdateMachinegroupSlbmountweightResponse updateMachinegroupSlbmountweightEx(UpdateMachinegroupSlbmountweightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.slbmountweight.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMachinegroupSlbmountweightResponse());
    }

    /**
     * Description: 查询分组 SLB 挂载进度
     * Summary: 查询分组 SLB 挂载进度
     */
    public QueryMachinegroupSlbmountprogressResponse queryMachinegroupSlbmountprogress(QueryMachinegroupSlbmountprogressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMachinegroupSlbmountprogressEx(request, headers, runtime);
    }

    /**
     * Description: 查询分组 SLB 挂载进度
     * Summary: 查询分组 SLB 挂载进度
     */
    public QueryMachinegroupSlbmountprogressResponse queryMachinegroupSlbmountprogressEx(QueryMachinegroupSlbmountprogressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMachinegroupSlbmountprogressResponse());
    }

    /**
     * Description: 查询 slb 挂载状态
     * Summary: 查询 slb 挂载状态
     */
    public QueryMachinegroupSlbmountResponse queryMachinegroupSlbmount(QueryMachinegroupSlbmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMachinegroupSlbmountEx(request, headers, runtime);
    }

    /**
     * Description: 查询 slb 挂载状态
     * Summary: 查询 slb 挂载状态
     */
    public QueryMachinegroupSlbmountResponse queryMachinegroupSlbmountEx(QueryMachinegroupSlbmountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.slbmount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMachinegroupSlbmountResponse());
    }

    /**
     * Description: 获取分组信息
     * Summary: 获取分组信息
     */
    public GetMachinegroupResponse getMachinegroup(GetMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取分组信息
     * Summary: 获取分组信息
     */
    public GetMachinegroupResponse getMachinegroupEx(GetMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinegroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMachinegroupResponse());
    }

    /**
     * Description: 忽略分组任务
     * Summary: 忽略分组任务
     */
    public SkipMachinetaskResponse skipMachinetask(SkipMachinetaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipMachinetaskEx(request, headers, runtime);
    }

    /**
     * Description: 忽略分组任务
     * Summary: 忽略分组任务
     */
    public SkipMachinetaskResponse skipMachinetaskEx(SkipMachinetaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinetask.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipMachinetaskResponse());
    }

    /**
     * Description: 机器任务重试
     * Summary: 机器任务重试
     */
    public RetryMachinetaskResponse retryMachinetask(RetryMachinetaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryMachinetaskEx(request, headers, runtime);
    }

    /**
     * Description: 机器任务重试
     * Summary: 机器任务重试
     */
    public RetryMachinetaskResponse retryMachinetaskEx(RetryMachinetaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.machinetask.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryMachinetaskResponse());
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     */
    public QueryMetaCellResponse queryMetaCell(QueryMetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetaCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     */
    public QueryMetaCellResponse queryMetaCellEx(QueryMetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetaCellResponse());
    }

    /**
     * Description: 创建 deployment cell
     * Summary: 创建 deployment cell
     */
    public CreateMetaDeploymentcellResponse createMetaDeploymentcell(CreateMetaDeploymentcellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetaDeploymentcellEx(request, headers, runtime);
    }

    /**
     * Description: 创建 deployment cell
     * Summary: 创建 deployment cell
     */
    public CreateMetaDeploymentcellResponse createMetaDeploymentcellEx(CreateMetaDeploymentcellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMetaDeploymentcellResponse());
    }

    /**
     * Description: 更新 deployment zone
     * Summary: 更新 deployment zone
     */
    public UpdateMetaDeploymentcellResponse updateMetaDeploymentcell(UpdateMetaDeploymentcellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetaDeploymentcellEx(request, headers, runtime);
    }

    /**
     * Description: 更新 deployment zone
     * Summary: 更新 deployment zone
     */
    public UpdateMetaDeploymentcellResponse updateMetaDeploymentcellEx(UpdateMetaDeploymentcellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMetaDeploymentcellResponse());
    }

    /**
     * Description: 获取 deployment cell
     * Summary: 获取 deployment cell
     */
    public GetMetaDeploymentcellResponse getMetaDeploymentcell(GetMetaDeploymentcellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetaDeploymentcellEx(request, headers, runtime);
    }

    /**
     * Description: 获取 deployment cell
     * Summary: 获取 deployment cell
     */
    public GetMetaDeploymentcellResponse getMetaDeploymentcellEx(GetMetaDeploymentcellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMetaDeploymentcellResponse());
    }

    /**
     * Description: 批量获取 deployment cell
     * Summary: 批量获取 deployment cell
     */
    public QueryMetaDeploymentcellResponse queryMetaDeploymentcell(QueryMetaDeploymentcellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetaDeploymentcellEx(request, headers, runtime);
    }

    /**
     * Description: 批量获取 deployment cell
     * Summary: 批量获取 deployment cell
     */
    public QueryMetaDeploymentcellResponse queryMetaDeploymentcellEx(QueryMetaDeploymentcellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetaDeploymentcellResponse());
    }

    /**
     * Description: 创建通知配置
     * Summary: 创建通知配置
     */
    public CreateNotificationConfigResponse createNotificationConfig(CreateNotificationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotificationConfigEx(request, headers, runtime);
    }

    /**
     * Description: 创建通知配置
     * Summary: 创建通知配置
     */
    public CreateNotificationConfigResponse createNotificationConfigEx(CreateNotificationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.notification.config.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotificationConfigResponse());
    }

    /**
     * Description: 更新通知配置
     * Summary: 更新通知配置
     */
    public UpdateNotificationConfigResponse updateNotificationConfig(UpdateNotificationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNotificationConfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新通知配置
     * Summary: 更新通知配置
     */
    public UpdateNotificationConfigResponse updateNotificationConfigEx(UpdateNotificationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.notification.config.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateNotificationConfigResponse());
    }

    /**
     * Description: 查询通知配置
     * Summary: 查询通知配置
     */
    public QueryNotificationConfigResponse queryNotificationConfig(QueryNotificationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotificationConfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询通知配置
     * Summary: 查询通知配置
     */
    public QueryNotificationConfigResponse queryNotificationConfigEx(QueryNotificationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.notification.config.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotificationConfigResponse());
    }

    /**
     * Description: 删除通知配置
     * Summary: 删除通知配置
     */
    public DeleteNotificationConfigResponse deleteNotificationConfig(DeleteNotificationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteNotificationConfigEx(request, headers, runtime);
    }

    /**
     * Description: 删除通知配置
     * Summary: 删除通知配置
     */
    public DeleteNotificationConfigResponse deleteNotificationConfigEx(DeleteNotificationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.notification.config.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteNotificationConfigResponse());
    }

    /**
     * Description: 查询用户信息
     * Summary: 查询用户信息
     */
    public QueryOperatorResponse queryOperator(QueryOperatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户信息
     * Summary: 查询用户信息
     */
    public QueryOperatorResponse queryOperatorEx(QueryOperatorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.operator.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOperatorResponse());
    }

    /**
     * Description: 回滚
     * Summary: 回滚
     */
    public RollbackPlanServiceResponse rollbackPlanService(RollbackPlanServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackPlanServiceEx(request, headers, runtime);
    }

    /**
     * Description: 回滚
     * Summary: 回滚
     */
    public RollbackPlanServiceResponse rollbackPlanServiceEx(RollbackPlanServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.service.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackPlanServiceResponse());
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     */
    public CreatePlanResponse createPlan(CreatePlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlanEx(request, headers, runtime);
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     */
    public CreatePlanResponse createPlanEx(CreatePlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePlanResponse());
    }

    /**
     * Description: 发布单校验
     * Summary: 发布单校验
     */
    public CheckPlanResponse checkPlan(CheckPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPlanEx(request, headers, runtime);
    }

    /**
     * Description: 发布单校验
     * Summary: 发布单校验
     */
    public CheckPlanResponse checkPlanEx(CheckPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckPlanResponse());
    }

    /**
     * Description: 校验运维单请求
     * Summary: 校验运维单请求
     */
    public CheckPlanOperationResponse checkPlanOperation(CheckPlanOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPlanOperationEx(request, headers, runtime);
    }

    /**
     * Description: 校验运维单请求
     * Summary: 校验运维单请求
     */
    public CheckPlanOperationResponse checkPlanOperationEx(CheckPlanOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.operation.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckPlanOperationResponse());
    }

    /**
     * Description: 创建运维单
     * Summary: 创建运维单
     */
    public CreatePlanOperationResponse createPlanOperation(CreatePlanOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlanOperationEx(request, headers, runtime);
    }

    /**
     * Description: 创建运维单
     * Summary: 创建运维单
     */
    public CreatePlanOperationResponse createPlanOperationEx(CreatePlanOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.operation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePlanOperationResponse());
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     */
    public CreatePlanAdvancedResponse createPlanAdvanced(CreatePlanAdvancedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlanAdvancedEx(request, headers, runtime);
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     */
    public CreatePlanAdvancedResponse createPlanAdvancedEx(CreatePlanAdvancedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.advanced.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePlanAdvancedResponse());
    }

    /**
     * Description: 重新初始化发布单
     * Summary: 重新初始化发布单
     */
    public ReinitPlanResponse reinitPlan(ReinitPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitPlanEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化发布单
     * Summary: 重新初始化发布单
     */
    public ReinitPlanResponse reinitPlanEx(ReinitPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitPlanResponse());
    }

    /**
     * Description: 获取发布单信息
     * Summary: 获取发布单信息
     */
    public GetPlanResponse getPlan(GetPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPlanEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布单信息
     * Summary: 获取发布单信息
     */
    public GetPlanResponse getPlanEx(GetPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPlanResponse());
    }

    /**
     * Description: 获取发布单基本信息
     * Summary: 获取发布单基本信息
     */
    public GetPlanBasicResponse getPlanBasic(GetPlanBasicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPlanBasicEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布单基本信息
     * Summary: 获取发布单基本信息
     */
    public GetPlanBasicResponse getPlanBasicEx(GetPlanBasicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.basic.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPlanBasicResponse());
    }

    /**
     * Description: 获取发布进度
     * Summary: 获取发布进度
     */
    public GetPlanProgressResponse getPlanProgress(GetPlanProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPlanProgressEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布进度
     * Summary: 获取发布进度
     */
    public GetPlanProgressResponse getPlanProgressEx(GetPlanProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.progress.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPlanProgressResponse());
    }

    /**
     * Description: 查询发布单
     * Summary: 查询发布单
     */
    public QueryPlanResponse queryPlan(QueryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPlanEx(request, headers, runtime);
    }

    /**
     * Description: 查询发布单
     * Summary: 查询发布单
     */
    public QueryPlanResponse queryPlanEx(QueryPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPlanResponse());
    }

    /**
     * Description: 发布单状态统计
     * Summary: 发布单状态统计
     */
    public CountPlanStateResponse countPlanState(CountPlanStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countPlanStateEx(request, headers, runtime);
    }

    /**
     * Description: 发布单状态统计
     * Summary: 发布单状态统计
     */
    public CountPlanStateResponse countPlanStateEx(CountPlanStateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.state.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountPlanStateResponse());
    }

    /**
     * Description:  执行
     * Summary:  执行
     */
    public ExecPlanResponse execPlan(ExecPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execPlanEx(request, headers, runtime);
    }

    /**
     * Description:  执行
     * Summary:  执行
     */
    public ExecPlanResponse execPlanEx(ExecPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecPlanResponse());
    }

    /**
     * Description: 重试
     * Summary: 重试
     */
    public RetryPlanResponse retryPlan(RetryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryPlanEx(request, headers, runtime);
    }

    /**
     * Description: 重试
     * Summary: 重试
     */
    public RetryPlanResponse retryPlanEx(RetryPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryPlanResponse());
    }

    /**
     * Description: 取消发布
     * Summary: 取消发布
     */
    public CancelPlanResponse cancelPlan(CancelPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelPlanEx(request, headers, runtime);
    }

    /**
     * Description: 取消发布
     * Summary: 取消发布
     */
    public CancelPlanResponse cancelPlanEx(CancelPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelPlanResponse());
    }

    /**
     * Description: 回滚发布单
     * Summary: 回滚发布单
     */
    public RollbackPlanResponse rollbackPlan(RollbackPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackPlanEx(request, headers, runtime);
    }

    /**
     * Description: 回滚发布单
     * Summary: 回滚发布单
     */
    public RollbackPlanResponse rollbackPlanEx(RollbackPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.plan.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackPlanResponse());
    }

    /**
     * Description: 获取任务详情
     * Summary: 获取任务详情
     */
    public GetTaskSummaryResponse getTaskSummary(GetTaskSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskSummaryEx(request, headers, runtime);
    }

    /**
     * Description: 获取任务详情
     * Summary: 获取任务详情
     */
    public GetTaskSummaryResponse getTaskSummaryEx(GetTaskSummaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.task.summary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTaskSummaryResponse());
    }

    /**
     * Description: 忽略任务
     * Summary: 忽略任务
     */
    public SkipTaskResponse skipTask(SkipTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipTaskEx(request, headers, runtime);
    }

    /**
     * Description: 忽略任务
     * Summary: 忽略任务
     */
    public SkipTaskResponse skipTaskEx(SkipTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.task.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipTaskResponse());
    }

    /**
     * Description: 重试任务
     * Summary: 重试任务
     */
    public RetryTaskResponse retryTask(RetryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryTaskEx(request, headers, runtime);
    }

    /**
     * Description: 重试任务
     * Summary: 重试任务
     */
    public RetryTaskResponse retryTaskEx(RetryTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.task.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryTaskResponse());
    }

    /**
     * Description: 查询角色信息
     * Summary: 查询角色信息
     */
    public QueryRoleResponse queryRole(QueryRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRoleEx(request, headers, runtime);
    }

    /**
     * Description: 查询角色信息
     * Summary: 查询角色信息
     */
    public QueryRoleResponse queryRoleEx(QueryRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.role.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRoleResponse());
    }

    /**
     * Description: 创建应用服务分组集合
     * Summary: 创建应用服务分组集合
     */
    public CreateServicegroupcollectionResponse createServicegroupcollection(CreateServicegroupcollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServicegroupcollectionEx(request, headers, runtime);
    }

    /**
     * Description: 创建应用服务分组集合
     * Summary: 创建应用服务分组集合
     */
    public CreateServicegroupcollectionResponse createServicegroupcollectionEx(CreateServicegroupcollectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroupcollection.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateServicegroupcollectionResponse());
    }

    /**
     * Description: 清除应用服务发布分组集合
     * Summary: 清除应用服务发布分组集合
     */
    public DeleteServicegroupcollectionResponse deleteServicegroupcollection(DeleteServicegroupcollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServicegroupcollectionEx(request, headers, runtime);
    }

    /**
     * Description: 清除应用服务发布分组集合
     * Summary: 清除应用服务发布分组集合
     */
    public DeleteServicegroupcollectionResponse deleteServicegroupcollectionEx(DeleteServicegroupcollectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroupcollection.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteServicegroupcollectionResponse());
    }

    /**
     * Description: 重试分组
     * Summary: 重试分组
     */
    public RetryServicegroupResponse retryServicegroup(RetryServicegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryServicegroupEx(request, headers, runtime);
    }

    /**
     * Description: 重试分组
     * Summary: 重试分组
     */
    public RetryServicegroupResponse retryServicegroupEx(RetryServicegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroup.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryServicegroupResponse());
    }

    /**
     * Description: 执行发布分组
     * Summary: 执行发布分组
     */
    public ExecServicegroupResponse execServicegroup(ExecServicegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execServicegroupEx(request, headers, runtime);
    }

    /**
     * Description: 执行发布分组
     * Summary: 执行发布分组
     */
    public ExecServicegroupResponse execServicegroupEx(ExecServicegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroup.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecServicegroupResponse());
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     */
    public SkipServicegroupResponse skipServicegroup(SkipServicegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipServicegroupEx(request, headers, runtime);
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     */
    public SkipServicegroupResponse skipServicegroupEx(SkipServicegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroup.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipServicegroupResponse());
    }

    /**
     * Description: 创建发布分组
     * Summary: 创建发布分组
     */
    public CreateServicegroupResponse createServicegroup(CreateServicegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServicegroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建发布分组
     * Summary: 创建发布分组
     */
    public CreateServicegroupResponse createServicegroupEx(CreateServicegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateServicegroupResponse());
    }

    /**
     * Description: 删除发布分组
     * Summary: 删除发布分组
     */
    public DeleteServicegroupResponse deleteServicegroup(DeleteServicegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServicegroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除发布分组
     * Summary: 删除发布分组
     */
    public DeleteServicegroupResponse deleteServicegroupEx(DeleteServicegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteServicegroupResponse());
    }

    /**
     * Description: 转换分组
     * Summary: 转换分组
     */
    public SwitchServicegroupResponse switchServicegroup(SwitchServicegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchServicegroupEx(request, headers, runtime);
    }

    /**
     * Description: 转换分组
     * Summary: 转换分组
     */
    public SwitchServicegroupResponse switchServicegroupEx(SwitchServicegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.servicegroup.switch", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SwitchServicegroupResponse());
    }

    /**
     * Description: 获取发布服务详情
     * Summary: 获取发布服务详情
     */
    public GetServiceResponse getService(GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布服务详情
     * Summary: 获取发布服务详情
     */
    public GetServiceResponse getServiceEx(GetServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetServiceResponse());
    }

    /**
     * Description: 获取应用发布信息
     * Summary: 获取应用发布信息
     */
    public GetServiceProgressResponse getServiceProgress(GetServiceProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceProgressEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用发布信息
     * Summary: 获取应用发布信息
     */
    public GetServiceProgressResponse getServiceProgressEx(GetServiceProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.progress.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetServiceProgressResponse());
    }

    /**
     * Description: 查询发布进度
     * Summary: 查询发布进度
     */
    public QueryServiceProgressResponse queryServiceProgress(QueryServiceProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceProgressEx(request, headers, runtime);
    }

    /**
     * Description: 查询发布进度
     * Summary: 查询发布进度
     */
    public QueryServiceProgressResponse queryServiceProgressEx(QueryServiceProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.progress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceProgressResponse());
    }

    /**
     * Description: 查询SLB挂载信息
     * Summary: 查询SLB挂载信息
     */
    public QueryServiceSlbmountResponse queryServiceSlbmount(QueryServiceSlbmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceSlbmountEx(request, headers, runtime);
    }

    /**
     * Description: 查询SLB挂载信息
     * Summary: 查询SLB挂载信息
     */
    public QueryServiceSlbmountResponse queryServiceSlbmountEx(QueryServiceSlbmountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.slbmount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceSlbmountResponse());
    }

    /**
     * Description: 批量查询 SLB 挂载信息
     * Summary: 批量查询 SLB 挂载信息
     */
    public BatchqueryServiceSlbmountResponse batchqueryServiceSlbmount(BatchqueryServiceSlbmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryServiceSlbmountEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询 SLB 挂载信息
     * Summary: 批量查询 SLB 挂载信息
     */
    public BatchqueryServiceSlbmountResponse batchqueryServiceSlbmountEx(BatchqueryServiceSlbmountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.slbmount.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryServiceSlbmountResponse());
    }

    /**
     * Description: 更新slb挂载权重
     * Summary: 更新slb挂载权重
     */
    public UpdateServiceSlbmountResponse updateServiceSlbmount(UpdateServiceSlbmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceSlbmountEx(request, headers, runtime);
    }

    /**
     * Description: 更新slb挂载权重
     * Summary: 更新slb挂载权重
     */
    public UpdateServiceSlbmountResponse updateServiceSlbmountEx(UpdateServiceSlbmountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.slbmount.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateServiceSlbmountResponse());
    }

    /**
     * Description: 查询挂载进度
     * Summary: 查询挂载进度
     */
    public QueryServiceSlbmountprogressResponse queryServiceSlbmountprogress(QueryServiceSlbmountprogressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceSlbmountprogressEx(request, headers, runtime);
    }

    /**
     * Description: 查询挂载进度
     * Summary: 查询挂载进度
     */
    public QueryServiceSlbmountprogressResponse queryServiceSlbmountprogressEx(QueryServiceSlbmountprogressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceSlbmountprogressResponse());
    }

    /**
     * Description: 查询最近一次发布成功的应用记录
     * Summary: 查询最近一次发布成功的应用记录
     */
    public QueryServiceLatestsuccessResponse queryServiceLatestsuccess(QueryServiceLatestsuccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceLatestsuccessEx(request, headers, runtime);
    }

    /**
     * Description: 查询最近一次发布成功的应用记录
     * Summary: 查询最近一次发布成功的应用记录
     */
    public QueryServiceLatestsuccessResponse queryServiceLatestsuccessEx(QueryServiceLatestsuccessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.latestsuccess.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceLatestsuccessResponse());
    }

    /**
     * Description: 重新初始化
     * Summary: 重新初始化
     */
    public ReinitServiceResponse reinitService(ReinitServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitServiceEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化
     * Summary: 重新初始化
     */
    public ReinitServiceResponse reinitServiceEx(ReinitServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitServiceResponse());
    }

    /**
     * Description: 执行发布单
     * Summary: 执行发布单
     */
    public ExecServiceResponse execService(ExecServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execServiceEx(request, headers, runtime);
    }

    /**
     * Description: 执行发布单
     * Summary: 执行发布单
     */
    public ExecServiceResponse execServiceEx(ExecServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecServiceResponse());
    }

    /**
     * Description: 取消应用发布
     * Summary: 取消应用发布
     */
    public CancelServiceResponse cancelService(CancelServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelServiceEx(request, headers, runtime);
    }

    /**
     * Description: 取消应用发布
     * Summary: 取消应用发布
     */
    public CancelServiceResponse cancelServiceEx(CancelServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelServiceResponse());
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     */
    public SkipServiceResponse skipService(SkipServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipServiceEx(request, headers, runtime);
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     */
    public SkipServiceResponse skipServiceEx(SkipServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipServiceResponse());
    }

    /**
     * Description: 触发服务发布
     * Summary: 触发服务发布
     */
    public StartServiceResponse startService(StartServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startServiceEx(request, headers, runtime);
    }

    /**
     * Description: 触发服务发布
     * Summary: 触发服务发布
     */
    public StartServiceResponse startServiceEx(StartServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartServiceResponse());
    }

    /**
     * Description: 发布确认
     * Summary: 发布确认
     */
    public ConfirmServiceResponse confirmService(ConfirmServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmServiceEx(request, headers, runtime);
    }

    /**
     * Description: 发布确认
     * Summary: 发布确认
     */
    public ConfirmServiceResponse confirmServiceEx(ConfirmServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmServiceResponse());
    }

    /**
     * Description: 配置机器分组
     * Summary: 配置机器分组
     */
    public SetServiceMachinegroupResponse setServiceMachinegroup(SetServiceMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setServiceMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 配置机器分组
     * Summary: 配置机器分组
     */
    public SetServiceMachinegroupResponse setServiceMachinegroupEx(SetServiceMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.machinegroup.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetServiceMachinegroupResponse());
    }

    /**
     * Description: 重新初始化机器分组
     * Summary: 重新初始化机器分组
     */
    public ReinitServiceMachinegroupResponse reinitServiceMachinegroup(ReinitServiceMachinegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitServiceMachinegroupEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化机器分组
     * Summary: 重新初始化机器分组
     */
    public ReinitServiceMachinegroupResponse reinitServiceMachinegroupEx(ReinitServiceMachinegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.machinegroup.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitServiceMachinegroupResponse());
    }

    /**
     * Description: 查询可回滚服务
     * Summary: 查询可回滚服务
     */
    public ListServiceRollbackversionResponse listServiceRollbackversion(ListServiceRollbackversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceRollbackversionEx(request, headers, runtime);
    }

    /**
     * Description: 查询可回滚服务
     * Summary: 查询可回滚服务
     */
    public ListServiceRollbackversionResponse listServiceRollbackversionEx(ListServiceRollbackversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.rollbackversion.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListServiceRollbackversionResponse());
    }

    /**
     * Description: 查询可回滚版本
     * Summary: 查询可回滚版本
     */
    public QueryServiceRollbackversionResponse queryServiceRollbackversion(QueryServiceRollbackversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceRollbackversionEx(request, headers, runtime);
    }

    /**
     * Description: 查询可回滚版本
     * Summary: 查询可回滚版本
     */
    public QueryServiceRollbackversionResponse queryServiceRollbackversionEx(QueryServiceRollbackversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.rollbackversion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceRollbackversionResponse());
    }

    /**
     * Description: 回滚应用
     * Summary: 回滚应用
     */
    public RollbackServiceResponse rollbackService(RollbackServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackServiceEx(request, headers, runtime);
    }

    /**
     * Description: 回滚应用
     * Summary: 回滚应用
     */
    public RollbackServiceResponse rollbackServiceEx(RollbackServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackServiceResponse());
    }

    /**
     * Description: 回滚确认
     * Summary: 回滚确认
     */
    public ConfirmrollbackServiceResponse confirmrollbackService(ConfirmrollbackServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmrollbackServiceEx(request, headers, runtime);
    }

    /**
     * Description: 回滚确认
     * Summary: 回滚确认
     */
    public ConfirmrollbackServiceResponse confirmrollbackServiceEx(ConfirmrollbackServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.confirmrollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmrollbackServiceResponse());
    }

    /**
     * Description: 回滚重试
     * Summary: 回滚重试
     */
    public RetryrollbackServiceResponse retryrollbackService(RetryrollbackServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryrollbackServiceEx(request, headers, runtime);
    }

    /**
     * Description: 回滚重试
     * Summary: 回滚重试
     */
    public RetryrollbackServiceResponse retryrollbackServiceEx(RetryrollbackServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.retryrollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryrollbackServiceResponse());
    }

    /**
     * Description: 获取子流程进度
     * Summary: 获取子流程进度
     */
    public GetServiceArrangementResponse getServiceArrangement(GetServiceArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 获取子流程进度
     * Summary: 获取子流程进度
     */
    public GetServiceArrangementResponse getServiceArrangementEx(GetServiceArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.arrangement.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetServiceArrangementResponse());
    }

    /**
     * Description: 重试子流程
     * Summary: 重试子流程
     */
    public RetryServiceArrangementResponse retryServiceArrangement(RetryServiceArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryServiceArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 重试子流程
     * Summary: 重试子流程
     */
    public RetryServiceArrangementResponse retryServiceArrangementEx(RetryServiceArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.arrangement.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryServiceArrangementResponse());
    }

    /**
     * Description: 忽略子流程
     * Summary: 忽略子流程
     */
    public SkipServiceArrangementResponse skipServiceArrangement(SkipServiceArrangementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipServiceArrangementEx(request, headers, runtime);
    }

    /**
     * Description: 忽略子流程
     * Summary: 忽略子流程
     */
    public SkipServiceArrangementResponse skipServiceArrangementEx(SkipServiceArrangementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.arrangement.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipServiceArrangementResponse());
    }

    /**
     * Description: query op log
     * Summary: query op log
     */
    public QueryOperationlogResponse queryOperationlog(QueryOperationlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOperationlogEx(request, headers, runtime);
    }

    /**
     * Description: query op log
     * Summary: query op log
     */
    public QueryOperationlogResponse queryOperationlogEx(QueryOperationlogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.operationlog.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOperationlogResponse());
    }

    /**
     * Description: operation time line
     * Summary: operation time line
     */
    public QueryOperationlogTimelineResponse queryOperationlogTimeline(QueryOperationlogTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOperationlogTimelineEx(request, headers, runtime);
    }

    /**
     * Description: operation time line
     * Summary: operation time line
     */
    public QueryOperationlogTimelineResponse queryOperationlogTimelineEx(QueryOperationlogTimelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.operationlog.timeline.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOperationlogTimelineResponse());
    }

    /**
     * Description: 获取发布应用详情
     * Summary: 获取发布应用详情
     */
    public GetServiceDetailResponse getServiceDetail(GetServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceDetailEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布应用详情
     * Summary: 获取发布应用详情
     */
    public GetServiceDetailResponse getServiceDetailEx(GetServiceDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.service.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetServiceDetailResponse());
    }

    /**
     * Description: create cell
     * Summary: create cell
     */
    public CreateMetaCellResponse createMetaCell(CreateMetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetaCellEx(request, headers, runtime);
    }

    /**
     * Description: create cell
     * Summary: create cell
     */
    public CreateMetaCellResponse createMetaCellEx(CreateMetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.cell.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMetaCellResponse());
    }

    /**
     * Description: update cell
     * Summary: update cell
     */
    public UpdateMetaCellResponse updateMetaCell(UpdateMetaCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetaCellEx(request, headers, runtime);
    }

    /**
     * Description: update cell
     * Summary: update cell
     */
    public UpdateMetaCellResponse updateMetaCellEx(UpdateMetaCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.cell.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMetaCellResponse());
    }

    /**
     * Description: 关联 master zone
     * Summary: 关联 master zone
     */
    public AddMetaMasterzonerelResponse addMetaMasterzonerel(AddMetaMasterzonerelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMetaMasterzonerelEx(request, headers, runtime);
    }

    /**
     * Description: 关联 master zone
     * Summary: 关联 master zone
     */
    public AddMetaMasterzonerelResponse addMetaMasterzonerelEx(AddMetaMasterzonerelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.meta.masterzonerel.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddMetaMasterzonerelResponse());
    }

    /**
     * Description: 分配指定的一个或者多个计算资源到指定的应用
     * Summary: 分配应用计算资源
     */
    public AssignComputerResponse assignComputer(AssignComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.assignComputerEx(request, headers, runtime);
    }

    /**
     * Description: 分配指定的一个或者多个计算资源到指定的应用
     * Summary: 分配应用计算资源
     */
    public AssignComputerResponse assignComputerEx(AssignComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computer.assign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AssignComputerResponse());
    }

    /**
     * Description: 从指定应用释放一个或者多个计算资源
     * Summary: 释放应用计算资源
     */
    public ReleaseComputerResponse releaseComputer(ReleaseComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseComputerEx(request, headers, runtime);
    }

    /**
     * Description: 从指定应用释放一个或者多个计算资源
     * Summary: 释放应用计算资源
     */
    public ReleaseComputerResponse releaseComputerEx(ReleaseComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computer.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseComputerResponse());
    }

    /**
     * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
     * Summary: 获取异步任务
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
     * Summary: 获取异步任务
     */
    public GetTaskResponse getTaskEx(GetTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.task.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTaskResponse());
    }

    /**
     * Description: 创建 ecs 实例
     * Summary: 创建 ecs 实例
     */
    public CreateComputerResponse createComputer(CreateComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputerEx(request, headers, runtime);
    }

    /**
     * Description: 创建 ecs 实例
     * Summary: 创建 ecs 实例
     */
    public CreateComputerResponse createComputerEx(CreateComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.computer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateComputerResponse());
    }

    /**
     * Description: 创建sidecar元数据信息
     * Summary: 创建sidecar元数据信息
     */
    public CreateSidecarResponse createSidecar(CreateSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 创建sidecar元数据信息
     * Summary: 创建sidecar元数据信息
     */
    public CreateSidecarResponse createSidecarEx(CreateSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSidecarResponse());
    }

    /**
     * Description: 查询sidecar元信息列表
     * Summary: 查询sidecar元信息列表
     */
    public ListSidecarResponse listSidecar(ListSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 查询sidecar元信息列表
     * Summary: 查询sidecar元信息列表
     */
    public ListSidecarResponse listSidecarEx(ListSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSidecarResponse());
    }

    /**
     * Description: 创建sidecar模板
     * Summary: 创建sidecar版本
     */
    public CreateSidecarVersionResponse createSidecarVersion(CreateSidecarVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSidecarVersionEx(request, headers, runtime);
    }

    /**
     * Description: 创建sidecar模板
     * Summary: 创建sidecar版本
     */
    public CreateSidecarVersionResponse createSidecarVersionEx(CreateSidecarVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.version.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSidecarVersionResponse());
    }

    /**
     * Description: 查询sidecar模板列表
     * Summary: 查询sidecar模板列表
     */
    public ListSidecarVersionResponse listSidecarVersion(ListSidecarVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSidecarVersionEx(request, headers, runtime);
    }

    /**
     * Description: 查询sidecar模板列表
     * Summary: 查询sidecar模板列表
     */
    public ListSidecarVersionResponse listSidecarVersionEx(ListSidecarVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.version.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSidecarVersionResponse());
    }

    /**
     * Description: 获取sidecar版本详情
     * Summary: 获取sidecar版本详情
     */
    public GetSidecarVersionResponse getSidecarVersion(GetSidecarVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSidecarVersionEx(request, headers, runtime);
    }

    /**
     * Description: 获取sidecar版本详情
     * Summary: 获取sidecar版本详情
     */
    public GetSidecarVersionResponse getSidecarVersionEx(GetSidecarVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.version.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSidecarVersionResponse());
    }

    /**
     * Description: 创建sidecar规则
     * Summary: 创建sidecar规则
     */
    public CreateSidecarRuleResponse createSidecarRule(CreateSidecarRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSidecarRuleEx(request, headers, runtime);
    }

    /**
     * Description: 创建sidecar规则
     * Summary: 创建sidecar规则
     */
    public CreateSidecarRuleResponse createSidecarRuleEx(CreateSidecarRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.rule.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSidecarRuleResponse());
    }

    /**
     * Description: 获取sidecar单个规则详情
     * Summary: 获取sidecar单个规则详情
     */
    public GetSidecarRuleResponse getSidecarRule(GetSidecarRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSidecarRuleEx(request, headers, runtime);
    }

    /**
     * Description: 获取sidecar单个规则详情
     * Summary: 获取sidecar单个规则详情
     */
    public GetSidecarRuleResponse getSidecarRuleEx(GetSidecarRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.rule.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSidecarRuleResponse());
    }

    /**
     * Description: 获取sidecar规则列表
     * Summary: 获取sidecar规则列表
     */
    public ListSidecarRuleResponse listSidecarRule(ListSidecarRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSidecarRuleEx(request, headers, runtime);
    }

    /**
     * Description: 获取sidecar规则列表
     * Summary: 获取sidecar规则列表
     */
    public ListSidecarRuleResponse listSidecarRuleEx(ListSidecarRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.rule.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSidecarRuleResponse());
    }

    /**
     * Description: 创建sidecar版本实例
     * Summary: 创建sidecar版本实例
     */
    public CreateSidecarInstanceResponse createSidecarInstance(CreateSidecarInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSidecarInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 创建sidecar版本实例
     * Summary: 创建sidecar版本实例
     */
    public CreateSidecarInstanceResponse createSidecarInstanceEx(CreateSidecarInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.instance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSidecarInstanceResponse());
    }

    /**
     * Description: 查询sidecar版本实例列表
     * Summary: 查询sidecar版本实例列表
     */
    public ListSidecarInstanceResponse listSidecarInstance(ListSidecarInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSidecarInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询sidecar版本实例列表
     * Summary: 查询sidecar版本实例列表
     */
    public ListSidecarInstanceResponse listSidecarInstanceEx(ListSidecarInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.instance.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSidecarInstanceResponse());
    }

    /**
     * Description: 获取sidecar版本实例
     * Summary: 获取sidecar版本实例
     */
    public GetSidecarInstanceResponse getSidecarInstance(GetSidecarInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSidecarInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 获取sidecar版本实例
     * Summary: 获取sidecar版本实例
     */
    public GetSidecarInstanceResponse getSidecarInstanceEx(GetSidecarInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.instance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSidecarInstanceResponse());
    }

    /**
     * Description: 获取sidecar类型
     * Summary: 获取sidecar类型
     */
    public GetSidecarResponse getSidecar(GetSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 获取sidecar类型
     * Summary: 获取sidecar类型
     */
    public GetSidecarResponse getSidecarEx(GetSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSidecarResponse());
    }

    /**
     * Description: 更新sidecar类型信息
     * Summary: 更新sidecar类型信息
     */
    public UpdateSidecarResponse updateSidecar(UpdateSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar类型信息
     * Summary: 更新sidecar类型信息
     */
    public UpdateSidecarResponse updateSidecarEx(UpdateSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecarResponse());
    }

    /**
     * Description: 删除sidecar类型
     * Summary: 删除sidecar类型
     */
    public DeleteSidecarResponse deleteSidecar(DeleteSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 删除sidecar类型
     * Summary: 删除sidecar类型
     */
    public DeleteSidecarResponse deleteSidecarEx(DeleteSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSidecarResponse());
    }

    /**
     * Description: 更新sidecar版本
     * Summary: 更新sidecar版本
     */
    public UpdateSidecarVersionResponse updateSidecarVersion(UpdateSidecarVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecarVersionEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar版本
     * Summary: 更新sidecar版本
     */
    public UpdateSidecarVersionResponse updateSidecarVersionEx(UpdateSidecarVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.version.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecarVersionResponse());
    }

    /**
     * Description: 删除sidecar模板
     * Summary: 删除sidecar模板
     */
    public DeleteSidecarVersionResponse deleteSidecarVersion(DeleteSidecarVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSidecarVersionEx(request, headers, runtime);
    }

    /**
     * Description: 删除sidecar模板
     * Summary: 删除sidecar模板
     */
    public DeleteSidecarVersionResponse deleteSidecarVersionEx(DeleteSidecarVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.version.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSidecarVersionResponse());
    }

    /**
     * Description: 更新sidecar版本实例
     * Summary: 更新sidecar版本实例
     */
    public UpdateSidecarInstanceResponse updateSidecarInstance(UpdateSidecarInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecarInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar版本实例
     * Summary: 更新sidecar版本实例
     */
    public UpdateSidecarInstanceResponse updateSidecarInstanceEx(UpdateSidecarInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.instance.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecarInstanceResponse());
    }

    /**
     * Description: 删除sidecar版本实例
     * Summary: 删除sidecar版本实例
     */
    public DeleteSidecarInstanceResponse deleteSidecarInstance(DeleteSidecarInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSidecarInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 删除sidecar版本实例
     * Summary: 删除sidecar版本实例
     */
    public DeleteSidecarInstanceResponse deleteSidecarInstanceEx(DeleteSidecarInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.instance.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSidecarInstanceResponse());
    }

    /**
     * Description: 更新sidecar规则
     * Summary: 更新sidecar规则
     */
    public UpdateSidecarRuleResponse updateSidecarRule(UpdateSidecarRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecarRuleEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar规则
     * Summary: 更新sidecar规则
     */
    public UpdateSidecarRuleResponse updateSidecarRuleEx(UpdateSidecarRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.rule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecarRuleResponse());
    }

    /**
     * Description: 删除sidecar规则
     * Summary: 删除sidecar规则
     */
    public DeleteSidecarRuleResponse deleteSidecarRule(DeleteSidecarRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSidecarRuleEx(request, headers, runtime);
    }

    /**
     * Description: 删除sidecar规则
     * Summary: 删除sidecar规则
     */
    public DeleteSidecarRuleResponse deleteSidecarRuleEx(DeleteSidecarRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.rule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSidecarRuleResponse());
    }

    /**
     * Description: 更新sidecar版本状态
     * Summary: 更新sidecar版本状态
     */
    public UpdateSidecarVersionstatusResponse updateSidecarVersionstatus(UpdateSidecarVersionstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecarVersionstatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar版本状态
     * Summary: 更新sidecar版本状态
     */
    public UpdateSidecarVersionstatusResponse updateSidecarVersionstatusEx(UpdateSidecarVersionstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.versionstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecarVersionstatusResponse());
    }

    /**
     * Description: 更新sidecar版本实例状态
     * Summary: 更新sidecar版本实例状态
     */
    public UpdateSidecarInstancestatusResponse updateSidecarInstancestatus(UpdateSidecarInstancestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecarInstancestatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar版本实例状态
     * Summary: 更新sidecar版本实例状态
     */
    public UpdateSidecarInstancestatusResponse updateSidecarInstancestatusEx(UpdateSidecarInstancestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.instancestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecarInstancestatusResponse());
    }

    /**
     * Description: 更新sidecar规则状态
     * Summary: 更新sidecar规则状态
     */
    public UpdateSidecarRulestatusResponse updateSidecarRulestatus(UpdateSidecarRulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecarRulestatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar规则状态
     * Summary: 更新sidecar规则状态
     */
    public UpdateSidecarRulestatusResponse updateSidecarRulestatusEx(UpdateSidecarRulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.sidecar.rulestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecarRulestatusResponse());
    }

    /**
     * Description: 创建应用sidecar基线
     * Summary: 创建应用sidecar基线
     */
    public CreateAppbaselineSidecarResponse createAppbaselineSidecar(CreateAppbaselineSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppbaselineSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 创建应用sidecar基线
     * Summary: 创建应用sidecar基线
     */
    public CreateAppbaselineSidecarResponse createAppbaselineSidecarEx(CreateAppbaselineSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppbaselineSidecarResponse());
    }

    /**
     * Description: 查询应用sidecar基线
     * Summary: 查询应用sidecar基线
     */
    public ListAppbaselineSidecarResponse listAppbaselineSidecar(ListAppbaselineSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppbaselineSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用sidecar基线
     * Summary: 查询应用sidecar基线
     */
    public ListAppbaselineSidecarResponse listAppbaselineSidecarEx(ListAppbaselineSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppbaselineSidecarResponse());
    }

    /**
     * Description: 删除应用sidecar基线
     * Summary: 删除应用sidecar基线
     */
    public DeleteAppbaselineSidecarResponse deleteAppbaselineSidecar(DeleteAppbaselineSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppbaselineSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 删除应用sidecar基线
     * Summary: 删除应用sidecar基线
     */
    public DeleteAppbaselineSidecarResponse deleteAppbaselineSidecarEx(DeleteAppbaselineSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppbaselineSidecarResponse());
    }

    /**
     * Description: 更新应用sidecar基线
     * Summary: 更新应用sidecar基线
     */
    public UpdateAppbaselineSidecarResponse updateAppbaselineSidecar(UpdateAppbaselineSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppbaselineSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 更新应用sidecar基线
     * Summary: 更新应用sidecar基线
     */
    public UpdateAppbaselineSidecarResponse updateAppbaselineSidecarEx(UpdateAppbaselineSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppbaselineSidecarResponse());
    }

    /**
     * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
     * Summary: 创建或更新应用sidecar基线
     */
    public SaveAppbaselineSidecarResponse saveAppbaselineSidecar(SaveAppbaselineSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAppbaselineSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
     * Summary: 创建或更新应用sidecar基线
     */
    public SaveAppbaselineSidecarResponse saveAppbaselineSidecarEx(SaveAppbaselineSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveAppbaselineSidecarResponse());
    }

    /**
     * Description: 查询workspace详情
     * Summary: 获取workspace
     */
    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询workspace详情
     * Summary: 获取workspace
     */
    public GetWorkspaceResponse getWorkspaceEx(GetWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspace.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspaceResponse());
    }

    /**
     * Description: 查询workspace列表，可根据状态过滤。
     * Summary: 查询workspace
     */
    public QueryWorkspaceResponse queryWorkspace(QueryWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询workspace列表，可根据状态过滤。
     * Summary: 查询workspace
     */
    public QueryWorkspaceResponse queryWorkspaceEx(QueryWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWorkspaceResponse());
    }

    /**
     * Description: 创建workspace
     * Summary: 创建workspace
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 创建workspace
     * Summary: 创建workspace
     */
    public CreateWorkspaceResponse createWorkspaceEx(CreateWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWorkspaceResponse());
    }

    /**
     * Description: 查询workspace列表2.0。
     * Summary: 查询workspace列表2.0
     */
    public ListWorkspaceResponse listWorkspace(ListWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询workspace列表2.0。
     * Summary: 查询workspace列表2.0
     */
    public ListWorkspaceResponse listWorkspaceEx(ListWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.deps.workspace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWorkspaceResponse());
    }
}
