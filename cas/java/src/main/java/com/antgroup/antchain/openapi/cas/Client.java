// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.cas.models.*;
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
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.Client.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.3.17")
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
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }

        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    /**
     * Description: 批量删除构建记录
     * Summary: 批量删除构建记录
     */
    public BatchdeleteApplicationBuildResponse batchdeleteApplicationBuild(BatchdeleteApplicationBuildRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteApplicationBuildEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除构建记录
     * Summary: 批量删除构建记录
     */
    public BatchdeleteApplicationBuildResponse batchdeleteApplicationBuildEx(BatchdeleteApplicationBuildRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.build.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteApplicationBuildResponse());
    }

    /**
     * Description: 批量查询应用明细
     * Summary: 批量查询应用明细
     */
    public ListApplicationManifestResponse listApplicationManifest(ListApplicationManifestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationManifestEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询应用明细
     * Summary: 批量查询应用明细
     */
    public ListApplicationManifestResponse listApplicationManifestEx(ListApplicationManifestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.manifest.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApplicationManifestResponse());
    }

    /**
     * Description: 批量删除应用发布包
     * Summary: 批量删除应用发布包
     */
    public BatchdeleteApplicationPackageResponse batchdeleteApplicationPackage(BatchdeleteApplicationPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteApplicationPackageEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除应用发布包
     * Summary: 批量删除应用发布包
     */
    public BatchdeleteApplicationPackageResponse batchdeleteApplicationPackageEx(BatchdeleteApplicationPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.package.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteApplicationPackageResponse());
    }

    /**
     * Description: 创建应用发布包
     * Summary: 创建应用发布包
     */
    public CreateApplicationPackageResponse createApplicationPackage(CreateApplicationPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationPackageEx(request, headers, runtime);
    }

    /**
     * Description: 创建应用发布包
     * Summary: 创建应用发布包
     */
    public CreateApplicationPackageResponse createApplicationPackageEx(CreateApplicationPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.package.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApplicationPackageResponse());
    }

    /**
     * Description: 删除应用发布包
     * Summary: 删除应用发布包
     */
    public DeleteApplicationPackageResponse deleteApplicationPackage(DeleteApplicationPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationPackageEx(request, headers, runtime);
    }

    /**
     * Description: 删除应用发布包
     * Summary: 删除应用发布包
     */
    public DeleteApplicationPackageResponse deleteApplicationPackageEx(DeleteApplicationPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.package.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApplicationPackageResponse());
    }

    /**
     * Description: 批量获取应用发布包
     * Summary: 批量获取应用发布包
     */
    public ListApplicationPackageResponse listApplicationPackage(ListApplicationPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationPackageEx(request, headers, runtime);
    }

    /**
     * Description: 批量获取应用发布包
     * Summary: 批量获取应用发布包
     */
    public ListApplicationPackageResponse listApplicationPackageEx(ListApplicationPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.package.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApplicationPackageResponse());
    }

    /**
     * Description: 获取上传应用发布包下载配置
     * Summary: 获取上传应用发布包下载配置
     */
    public UploadApplicationPackageconfigResponse uploadApplicationPackageconfig(UploadApplicationPackageconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadApplicationPackageconfigEx(request, headers, runtime);
    }

    /**
     * Description: 获取上传应用发布包下载配置
     * Summary: 获取上传应用发布包下载配置
     */
    public UploadApplicationPackageconfigResponse uploadApplicationPackageconfigEx(UploadApplicationPackageconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.packageconfig.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadApplicationPackageconfigResponse());
    }

    /**
     * Description: 批量获取应用实例的 cell
     * Summary: 批量获取应用实例的 cell
     */
    public ListAppserviceCellResponse listAppserviceCell(ListAppserviceCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppserviceCellEx(request, headers, runtime);
    }

    /**
     * Description: 批量获取应用实例的 cell
     * Summary: 批量获取应用实例的 cell
     */
    public ListAppserviceCellResponse listAppserviceCellEx(ListAppserviceCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.cell.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppserviceCellResponse());
    }

    /**
     * Description: 创建应用实例
     * Summary: 创建应用实例
     */
    public CreateAppserviceResponse createAppservice(CreateAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 创建应用实例
     * Summary: 创建应用实例
     */
    public CreateAppserviceResponse createAppserviceEx(CreateAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppserviceResponse());
    }

    /**
     * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
     * Summary: 旧版应用管理-获取默认的应用服务
     */
    public GetAppserviceDefaultResponse getAppserviceDefault(GetAppserviceDefaultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppserviceDefaultEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
     * Summary: 旧版应用管理-获取默认的应用服务
     */
    public GetAppserviceDefaultResponse getAppserviceDefaultEx(GetAppserviceDefaultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.default.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppserviceDefaultResponse());
    }

    /**
     * Description: 判断应用实例是否存在
     * Summary: 判断应用实例是否存在
     */
    public ExistAppserviceResponse existAppservice(ExistAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 判断应用实例是否存在
     * Summary: 判断应用实例是否存在
     */
    public ExistAppserviceResponse existAppserviceEx(ExistAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistAppserviceResponse());
    }

    /**
     * Description: 更新应用实例
     * Summary: 更新应用实例
     */
    public UpdateAppserviceResponse updateAppservice(UpdateAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 更新应用实例
     * Summary: 更新应用实例
     */
    public UpdateAppserviceResponse updateAppserviceEx(UpdateAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppserviceResponse());
    }

    /**
     * Description: 技术栈1.0查询（opsware）
     * Summary: 技术栈查询
     */
    public QueryBuildpackResponse queryBuildpack(QueryBuildpackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackEx(request, headers, runtime);
    }

    /**
     * Description: 技术栈1.0查询（opsware）
     * Summary: 技术栈查询
     */
    public QueryBuildpackResponse queryBuildpackEx(QueryBuildpackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.buildpack.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackResponse());
    }

    /**
     * Description: 旧版应用管理-获取指定应用详情
     * Summary: 旧版应用管理-获取应用详情
     */
    public GetApplicationDetailResponse getApplicationDetail(GetApplicationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationDetailEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-获取指定应用详情
     * Summary: 旧版应用管理-获取应用详情
     */
    public GetApplicationDetailResponse getApplicationDetailEx(GetApplicationDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationDetailResponse());
    }

    /**
     * Description: 查询用户信息
     * Summary: 查询用户信息
     */
    public QueryUserResponse queryUser(QueryUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户信息
     * Summary: 查询用户信息
     */
    public QueryUserResponse queryUserEx(QueryUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserResponse());
    }

    /**
     * Description: 获取应用分组列表
     * Summary: 获取应用分组列表
     */
    public ListAppgroupResponse listAppgroup(ListAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用分组列表
     * Summary: 获取应用分组列表
     */
    public ListAppgroupResponse listAppgroupEx(ListAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppgroupResponse());
    }

    /**
     * Description: 检查应用分组是否存在
     * Summary: 检查应用分组是否存在
     */
    public ExistAppgroupResponse existAppgroup(ExistAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 检查应用分组是否存在
     * Summary: 检查应用分组是否存在
     */
    public ExistAppgroupResponse existAppgroupEx(ExistAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistAppgroupResponse());
    }

    /**
     * Description: 创建应用分组
     * Summary: 创建应用分组
     */
    public CreateAppgroupResponse createAppgroup(CreateAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建应用分组
     * Summary: 创建应用分组
     */
    public CreateAppgroupResponse createAppgroupEx(CreateAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppgroupResponse());
    }

    /**
     * Description: 获取应用owner列表
     * Summary: 获取应用owner列表
     */
    public ListAppgroupOwnerResponse listAppgroupOwner(ListAppgroupOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppgroupOwnerEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用owner列表
     * Summary: 获取应用owner列表
     */
    public ListAppgroupOwnerResponse listAppgroupOwnerEx(ListAppgroupOwnerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.owner.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppgroupOwnerResponse());
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询
     */
    public GetAppgroupTreeResponse getAppgroupTree(GetAppgroupTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppgroupTreeEx(request, headers, runtime);
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询
     */
    public GetAppgroupTreeResponse getAppgroupTreeEx(GetAppgroupTreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.tree.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppgroupTreeResponse());
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询
     */
    public GetAppgroupSystemtreeResponse getAppgroupSystemtree(GetAppgroupSystemtreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppgroupSystemtreeEx(request, headers, runtime);
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询
     */
    public GetAppgroupSystemtreeResponse getAppgroupSystemtreeEx(GetAppgroupSystemtreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.systemtree.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppgroupSystemtreeResponse());
    }

    /**
     * Description: 删除分组
     * Summary: 删除分组
     */
    public DeleteAppgroupResponse deleteAppgroup(DeleteAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除分组
     * Summary: 删除分组
     */
    public DeleteAppgroupResponse deleteAppgroupEx(DeleteAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppgroupResponse());
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组
     */
    public UpdateAppgroupResponse updateAppgroup(UpdateAppgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppgroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组
     */
    public UpdateAppgroupResponse updateAppgroupEx(UpdateAppgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAppgroupResponse());
    }

    /**
     * Description: 列出所有应用等级
     * Summary: 列出所有应用等级
     */
    public ListApplevelResponse listApplevel(ListApplevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplevelEx(request, headers, runtime);
    }

    /**
     * Description: 列出所有应用等级
     * Summary: 列出所有应用等级
     */
    public ListApplevelResponse listApplevelEx(ListApplevelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.applevel.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApplevelResponse());
    }

    /**
     * Description: 应用等级是否存在
     * Summary: 应用等级是否存在
     */
    public ExistApplevelResponse existApplevel(ExistApplevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existApplevelEx(request, headers, runtime);
    }

    /**
     * Description: 应用等级是否存在
     * Summary: 应用等级是否存在
     */
    public ExistApplevelResponse existApplevelEx(ExistApplevelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.applevel.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistApplevelResponse());
    }

    /**
     * Description: 创建应用等级
     * Summary: 创建应用等级
     */
    public CreateApplevelResponse createApplevel(CreateApplevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplevelEx(request, headers, runtime);
    }

    /**
     * Description: 创建应用等级
     * Summary: 创建应用等级
     */
    public CreateApplevelResponse createApplevelEx(CreateApplevelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.applevel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApplevelResponse());
    }

    /**
     * Description: 删除应用分组
     * Summary: 删除应用分组
     */
    public DeleteApplevelResponse deleteApplevel(DeleteApplevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplevelEx(request, headers, runtime);
    }

    /**
     * Description: 删除应用分组
     * Summary: 删除应用分组
     */
    public DeleteApplevelResponse deleteApplevelEx(DeleteApplevelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.applevel.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApplevelResponse());
    }

    /**
     * Description: 更新应用等级
     * Summary: 更新应用等级
     */
    public UpdateApplevelResponse updateApplevel(UpdateApplevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplevelEx(request, headers, runtime);
    }

    /**
     * Description: 更新应用等级
     * Summary: 更新应用等级
     */
    public UpdateApplevelResponse updateApplevelEx(UpdateApplevelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.applevel.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApplevelResponse());
    }

    /**
     * Description: 旧版应用管理-获取应用列表
     * Summary: 旧版应用管理-获取应用列表
     */
    public ListApplicationResponse listApplication(ListApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-获取应用列表
     * Summary: 旧版应用管理-获取应用列表
     */
    public ListApplicationResponse listApplicationEx(ListApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListApplicationResponse());
    }

    /**
     * Description: 旧版应用管理-更新应用
     * Summary: 旧版应用管理-更新应用
     */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-更新应用
     * Summary: 旧版应用管理-更新应用
     */
    public UpdateApplicationResponse updateApplicationEx(UpdateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApplicationResponse());
    }

    /**
     * Description: 旧版应用管理-批量查询应用服务
     * Summary: 旧版应用管理-批量查询应用服务
     */
    public ListAppserviceResponse listAppservice(ListAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-批量查询应用服务
     * Summary: 旧版应用管理-批量查询应用服务
     */
    public ListAppserviceResponse listAppserviceEx(ListAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAppserviceResponse());
    }

    /**
     * Description: 旧版应用管理-删除应用服务
     * Summary: 旧版应用管理-删除应用服务
     */
    public DeleteAppserviceResponse deleteAppservice(DeleteAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-删除应用服务
     * Summary: 旧版应用管理-删除应用服务
     */
    public DeleteAppserviceResponse deleteAppserviceEx(DeleteAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAppserviceResponse());
    }

    /**
     * Description: 旧版应用管理-获取应用服务详情
     * Summary: 旧版应用管理-获取应用服务详情
     */
    public GetAppserviceDetailResponse getAppserviceDetail(GetAppserviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppserviceDetailEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-获取应用服务详情
     * Summary: 旧版应用管理-获取应用服务详情
     */
    public GetAppserviceDetailResponse getAppserviceDetailEx(GetAppserviceDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppserviceDetailResponse());
    }

    /**
     * Description: 旧版应用管理-检查应用发布包是否存在
     * Summary: 旧版应用管理-检查应用发布包是否存在
     */
    public ExistApplicationPackageResponse existApplicationPackage(ExistApplicationPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existApplicationPackageEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-检查应用发布包是否存在
     * Summary: 旧版应用管理-检查应用发布包是否存在
     */
    public ExistApplicationPackageResponse existApplicationPackageEx(ExistApplicationPackageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.package.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistApplicationPackageResponse());
    }

    /**
     * Description: 旧版应用管理-获取应用包上传策略
     * Summary: 旧版应用管理-获取应用包上传策略
     */
    public GetApplicationPackageuploadpolicyResponse getApplicationPackageuploadpolicy(GetApplicationPackageuploadpolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationPackageuploadpolicyEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-获取应用包上传策略
     * Summary: 旧版应用管理-获取应用包上传策略
     */
    public GetApplicationPackageuploadpolicyResponse getApplicationPackageuploadpolicyEx(GetApplicationPackageuploadpolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.packageuploadpolicy.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationPackageuploadpolicyResponse());
    }

    /**
     * Description: 旧版应用管理-获取发布包下载链接
     * Summary: 旧版应用管理-获取发布包下载链接
     */
    public GetApplicationPackagedownloadurlResponse getApplicationPackagedownloadurl(GetApplicationPackagedownloadurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationPackagedownloadurlEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-获取发布包下载链接
     * Summary: 旧版应用管理-获取发布包下载链接
     */
    public GetApplicationPackagedownloadurlResponse getApplicationPackagedownloadurlEx(GetApplicationPackagedownloadurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.packagedownloadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationPackagedownloadurlResponse());
    }

    /**
     * Description: 旧版应用管理-判断应用是否存在
     * Summary: 旧版应用管理-判断应用是否存在
     */
    public ExistApplicationResponse existApplication(ExistApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-判断应用是否存在
     * Summary: 旧版应用管理-判断应用是否存在
     */
    public ExistApplicationResponse existApplicationEx(ExistApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistApplicationResponse());
    }

    /**
     * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
     * Summary: 根据应用服务ids查询应用服务
     */
    public QueryAppserviceResponse queryAppservice(QueryAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
     * Summary: 根据应用服务ids查询应用服务
     */
    public QueryAppserviceResponse queryAppserviceEx(QueryAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppserviceResponse());
    }

    /**
     * Description: 历史遗留接口-获取开关配置清单
     * Summary: 历史遗留接口-获取开关配置清单
     */
    public GetAppgrayconfigsResponse getAppgrayconfigs(GetAppgrayconfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppgrayconfigsEx(request, headers, runtime);
    }

    /**
     * Description: 历史遗留接口-获取开关配置清单
     * Summary: 历史遗留接口-获取开关配置清单
     */
    public GetAppgrayconfigsResponse getAppgrayconfigsEx(GetAppgrayconfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.appgrayconfigs.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppgrayconfigsResponse());
    }

    /**
     * Description: 创建 computer 实例
     * Summary: 创建 computer 实例
     */
    public CreateComputerResponse createComputer(CreateComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputerEx(request, headers, runtime);
    }

    /**
     * Description: 创建 computer 实例
     * Summary: 创建 computer 实例
     */
    public CreateComputerResponse createComputerEx(CreateComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateComputerResponse());
    }

    /**
     * Description: computer 删除
     * Summary: computer 删除
     */
    public DeleteComputerResponse deleteComputer(DeleteComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComputerEx(request, headers, runtime);
    }

    /**
     * Description: computer 删除
     * Summary: computer 删除
     */
    public DeleteComputerResponse deleteComputerEx(DeleteComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteComputerResponse());
    }

    /**
     * Description: computer 导入
     * Summary: computer 导入
     */
    public ImportComputerResponse importComputer(ImportComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importComputerEx(request, headers, runtime);
    }

    /**
     * Description: computer 导入
     * Summary: computer 导入
     */
    public ImportComputerResponse importComputerEx(ImportComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportComputerResponse());
    }

    /**
     * Description: database 创建
     * Summary: database 创建
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: database 创建
     * Summary: database 创建
     */
    public CreateDatabaseResponse createDatabaseEx(CreateDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDatabaseResponse());
    }

    /**
     * Description: database 导入
     * Summary: database 导入
     */
    public ImportDatabaseResponse importDatabase(ImportDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: database 导入
     * Summary: database 导入
     */
    public ImportDatabaseResponse importDatabaseEx(ImportDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDatabaseResponse());
    }

    /**
     * Description: database 删除
     * Summary: database 删除
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: database 删除
     * Summary: database 删除
     */
    public DeleteDatabaseResponse deleteDatabaseEx(DeleteDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDatabaseResponse());
    }

    /**
     * Description: loadbalance 创建
     * Summary: loadbalance 创建
     */
    public CreateLoadbalanceResponse createLoadbalance(CreateLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: loadbalance 创建
     * Summary: loadbalance 创建
     */
    public CreateLoadbalanceResponse createLoadbalanceEx(CreateLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLoadbalanceResponse());
    }

    /**
     * Description: loadbalance 删除
     * Summary: loadbalance 删除
     */
    public DeleteLoadbalanceResponse deleteLoadbalance(DeleteLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: loadbalance 删除
     * Summary: loadbalance 删除
     */
    public DeleteLoadbalanceResponse deleteLoadbalanceEx(DeleteLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteLoadbalanceResponse());
    }

    /**
     * Description: loadbalance 导入
     * Summary: loadbalance 导入
     */
    public ImportLoadbalanceResponse importLoadbalance(ImportLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: loadbalance 导入
     * Summary: loadbalance 导入
     */
    public ImportLoadbalanceResponse importLoadbalanceEx(ImportLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportLoadbalanceResponse());
    }

    /**
     * Description: vpc 创建
     * Summary: vpc 创建
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcEx(request, headers, runtime);
    }

    /**
     * Description: vpc 创建
     * Summary: vpc 创建
     */
    public CreateVpcResponse createVpcEx(CreateVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateVpcResponse());
    }

    /**
     * Description: vpc 删除
     * Summary: vpc 删除
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcEx(request, headers, runtime);
    }

    /**
     * Description: vpc 删除
     * Summary: vpc 删除
     */
    public DeleteVpcResponse deleteVpcEx(DeleteVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteVpcResponse());
    }

    /**
     * Description: computer 从应用中释放
     * Summary: computer 从应用中释放
     */
    public ReleaseComputerResponse releaseComputer(ReleaseComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseComputerEx(request, headers, runtime);
    }

    /**
     * Description: computer 从应用中释放
     * Summary: computer 从应用中释放
     */
    public ReleaseComputerResponse releaseComputerEx(ReleaseComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseComputerResponse());
    }

    /**
     * Description: 重置 computer 密码
     * Summary: 重置 computer 密码
     */
    public ReinitComputerPasswordResponse reinitComputerPassword(ReinitComputerPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitComputerPasswordEx(request, headers, runtime);
    }

    /**
     * Description: 重置 computer 密码
     * Summary: 重置 computer 密码
     */
    public ReinitComputerPasswordResponse reinitComputerPasswordEx(ReinitComputerPasswordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.password.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitComputerPasswordResponse());
    }

    /**
     * Description: database 从应用中释放
     * Summary: database 从应用中释放
     */
    public ReleaseDatabaseResponse releaseDatabase(ReleaseDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: database 从应用中释放
     * Summary: database 从应用中释放
     */
    public ReleaseDatabaseResponse releaseDatabaseEx(ReleaseDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseDatabaseResponse());
    }

    /**
     * Description: 移除 computer 
     * Summary: 移除 computer 
     */
    public RemoveComputerResponse removeComputer(RemoveComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeComputerEx(request, headers, runtime);
    }

    /**
     * Description: 移除 computer 
     * Summary: 移除 computer 
     */
    public RemoveComputerResponse removeComputerEx(RemoveComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveComputerResponse());
    }

    /**
     * Description: loadbalance 移除
     * Summary: loadbalance 移除
     */
    public RemoveLoadbalanceResponse removeLoadbalance(RemoveLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: loadbalance 移除
     * Summary: loadbalance 移除
     */
    public RemoveLoadbalanceResponse removeLoadbalanceEx(RemoveLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveLoadbalanceResponse());
    }

    /**
     * Description: database 移除
     * Summary: database 移除
     */
    public RemoveDatabaseResponse removeDatabase(RemoveDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: database 移除
     * Summary: database 移除
     */
    public RemoveDatabaseResponse removeDatabaseEx(RemoveDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveDatabaseResponse());
    }

    /**
     * Description: loadbalance 从应用中释放
     * Summary: loadbalance 从应用中释放
     */
    public ReleaseLoadbalanceResponse releaseLoadbalance(ReleaseLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: loadbalance 从应用中释放
     * Summary: loadbalance 从应用中释放
     */
    public ReleaseLoadbalanceResponse releaseLoadbalanceEx(ReleaseLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseLoadbalanceResponse());
    }

    /**
     * Description: database account 创建
     * Summary: database account 创建
     */
    public CreateDatabaseAccountResponse createDatabaseAccount(CreateDatabaseAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatabaseAccountEx(request, headers, runtime);
    }

    /**
     * Description: database account 创建
     * Summary: database account 创建
     */
    public CreateDatabaseAccountResponse createDatabaseAccountEx(CreateDatabaseAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDatabaseAccountResponse());
    }

    /**
     * Description: 安全域/组 创建
     * Summary: 安全域/组 创建
     */
    public CreateSecuritygroupResponse createSecuritygroup(CreateSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: 安全域/组 创建
     * Summary: 安全域/组 创建
     */
    public CreateSecuritygroupResponse createSecuritygroupEx(CreateSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSecuritygroupResponse());
    }

    /**
     * Description: securitygroup 导入
     * Summary: securitygroup 导入
     */
    public ImportSecuritygroupResponse importSecuritygroup(ImportSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: securitygroup 导入
     * Summary: securitygroup 导入
     */
    public ImportSecuritygroupResponse importSecuritygroupEx(ImportSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportSecuritygroupResponse());
    }

    /**
     * Description: securitygroup 移除
     * Summary: securitygroup 移除
     */
    public RemoveSecuritygroupResponse removeSecuritygroup(RemoveSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: securitygroup 移除
     * Summary: securitygroup 移除
     */
    public RemoveSecuritygroupResponse removeSecuritygroupEx(RemoveSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveSecuritygroupResponse());
    }

    /**
     * Description: securitygroup 删除
     * Summary: securitygroup 删除
     */
    public DeleteSecuritygroupResponse deleteSecuritygroup(DeleteSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: securitygroup 删除
     * Summary: securitygroup 删除
     */
    public DeleteSecuritygroupResponse deleteSecuritygroupEx(DeleteSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSecuritygroupResponse());
    }

    /**
     * Description: schema 删除
     * Summary: schema 删除
     */
    public DeleteDatabaseSchemaResponse deleteDatabaseSchema(DeleteDatabaseSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatabaseSchemaEx(request, headers, runtime);
    }

    /**
     * Description: schema 删除
     * Summary: schema 删除
     */
    public DeleteDatabaseSchemaResponse deleteDatabaseSchemaEx(DeleteDatabaseSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.schema.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDatabaseSchemaResponse());
    }

    /**
     * Description: account 删除
     * Summary: account 删除
     */
    public DeleteDatabaseAccountResponse deleteDatabaseAccount(DeleteDatabaseAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatabaseAccountEx(request, headers, runtime);
    }

    /**
     * Description: account 删除
     * Summary: account 删除
     */
    public DeleteDatabaseAccountResponse deleteDatabaseAccountEx(DeleteDatabaseAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.account.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDatabaseAccountResponse());
    }

    /**
     * Description: vswitch 删除
     * Summary: vswitch 删除
     */
    public DeleteVpcVswitchResponse deleteVpcVswitch(DeleteVpcVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcVswitchEx(request, headers, runtime);
    }

    /**
     * Description: vswitch 删除
     * Summary: vswitch 删除
     */
    public DeleteVpcVswitchResponse deleteVpcVswitchEx(DeleteVpcVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.vswitch.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteVpcVswitchResponse());
    }

    /**
     * Description: listener 删除
     * Summary: listener 删除
     */
    public DeleteLoadbalanceListenerResponse deleteLoadbalanceListener(DeleteLoadbalanceListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLoadbalanceListenerEx(request, headers, runtime);
    }

    /**
     * Description: listener 删除
     * Summary: listener 删除
     */
    public DeleteLoadbalanceListenerResponse deleteLoadbalanceListenerEx(DeleteLoadbalanceListenerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.listener.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteLoadbalanceListenerResponse());
    }

    /**
     * Description: 路由表删除
     * Summary: 路由表删除
     */
    public DeleteVpcVroutertableResponse deleteVpcVroutertable(DeleteVpcVroutertableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcVroutertableEx(request, headers, runtime);
    }

    /**
     * Description: 路由表删除
     * Summary: 路由表删除
     */
    public DeleteVpcVroutertableResponse deleteVpcVroutertableEx(DeleteVpcVroutertableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.vroutertable.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteVpcVroutertableResponse());
    }

    /**
     * Description: 安全组中实例移除
     * Summary: 安全组中实例移除
     */
    public RemoveSecuritygroupInstanceResponse removeSecuritygroupInstance(RemoveSecuritygroupInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSecuritygroupInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 安全组中实例移除
     * Summary: 安全组中实例移除
     */
    public RemoveSecuritygroupInstanceResponse removeSecuritygroupInstanceEx(RemoveSecuritygroupInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.instance.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveSecuritygroupInstanceResponse());
    }

    /**
     * Description: 安全组 permission 删除
     * Summary: 安全组 permission 删除
     */
    public DeleteSecuritygroupPermissionResponse deleteSecuritygroupPermission(DeleteSecuritygroupPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSecuritygroupPermissionEx(request, headers, runtime);
    }

    /**
     * Description: 安全组 permission 删除
     * Summary: 安全组 permission 删除
     */
    public DeleteSecuritygroupPermissionResponse deleteSecuritygroupPermissionEx(DeleteSecuritygroupPermissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.permission.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSecuritygroupPermissionResponse());
    }

    /**
     * Description: lb 监听器访问 ip 删除
     * Summary: lb 监听器访问 ip 删除
     */
    public RemoveLoadbalanceSecurityipResponse removeLoadbalanceSecurityip(RemoveLoadbalanceSecurityipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeLoadbalanceSecurityipEx(request, headers, runtime);
    }

    /**
     * Description: lb 监听器访问 ip 删除
     * Summary: lb 监听器访问 ip 删除
     */
    public RemoveLoadbalanceSecurityipResponse removeLoadbalanceSecurityipEx(RemoveLoadbalanceSecurityipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.securityip.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveLoadbalanceSecurityipResponse());
    }

    /**
     * Description: 应用创建
     * Summary: 应用创建
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 应用创建
     * Summary: 应用创建
     */
    public CreateApplicationResponse createApplicationEx(CreateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApplicationResponse());
    }

    /**
     * Description: 应用删除
     * Summary: 应用删除
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 应用删除
     * Summary: 应用删除
     */
    public DeleteApplicationResponse deleteApplicationEx(DeleteApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.application.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteApplicationResponse());
    }

    /**
     * Description: vswitch 创建
     * Summary: vswitch 创建
     */
    public CreateVpcVswitchResponse createVpcVswitch(CreateVpcVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcVswitchEx(request, headers, runtime);
    }

    /**
     * Description: vswitch 创建
     * Summary: vswitch 创建
     */
    public CreateVpcVswitchResponse createVpcVswitchEx(CreateVpcVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.vswitch.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateVpcVswitchResponse());
    }

    /**
     * Description: vRouterTable 创建
     * Summary: vRouterTable 创建
     */
    public CreateVpcVroutertableResponse createVpcVroutertable(CreateVpcVroutertableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcVroutertableEx(request, headers, runtime);
    }

    /**
     * Description: vRouterTable 创建
     * Summary: vRouterTable 创建
     */
    public CreateVpcVroutertableResponse createVpcVroutertableEx(CreateVpcVroutertableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.vroutertable.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateVpcVroutertableResponse());
    }

    /**
     * Description: 安全组添加实例
     * Summary: 安全组添加实例
     */
    public AddSecuritygroupInstanceResponse addSecuritygroupInstance(AddSecuritygroupInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSecuritygroupInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 安全组添加实例
     * Summary: 安全组添加实例
     */
    public AddSecuritygroupInstanceResponse addSecuritygroupInstanceEx(AddSecuritygroupInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.instance.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSecuritygroupInstanceResponse());
    }

    /**
     * Description: db 规格修改
     * Summary: db 规格修改
     */
    public UpdateDatabaseSpecResponse updateDatabaseSpec(UpdateDatabaseSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatabaseSpecEx(request, headers, runtime);
    }

    /**
     * Description: db 规格修改
     * Summary: db 规格修改
     */
    public UpdateDatabaseSpecResponse updateDatabaseSpecEx(UpdateDatabaseSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.spec.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDatabaseSpecResponse());
    }

    /**
     * Description: lb 访问控制修改
     * Summary: lb 访问控制修改
     */
    public UpdateLoadbalanceAccesscontrolResponse updateLoadbalanceAccesscontrol(UpdateLoadbalanceAccesscontrolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoadbalanceAccesscontrolEx(request, headers, runtime);
    }

    /**
     * Description: lb 访问控制修改
     * Summary: lb 访问控制修改
     */
    public UpdateLoadbalanceAccesscontrolResponse updateLoadbalanceAccesscontrolEx(UpdateLoadbalanceAccesscontrolRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.accesscontrol.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLoadbalanceAccesscontrolResponse());
    }

    /**
     * Description: lb 规格修改
     * Summary: lb 规格修改
     */
    public UpdateLoadbalanceSpecResponse updateLoadbalanceSpec(UpdateLoadbalanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoadbalanceSpecEx(request, headers, runtime);
    }

    /**
     * Description: lb 规格修改
     * Summary: lb 规格修改
     */
    public UpdateLoadbalanceSpecResponse updateLoadbalanceSpecEx(UpdateLoadbalanceSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.spec.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLoadbalanceSpecResponse());
    }

    /**
     * Description: vswitch 信息修改
     * Summary: vswitch 信息修改
     */
    public UpdateVpcVswitchResponse updateVpcVswitch(UpdateVpcVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVpcVswitchEx(request, headers, runtime);
    }

    /**
     * Description: vswitch 信息修改
     * Summary: vswitch 信息修改
     */
    public UpdateVpcVswitchResponse updateVpcVswitchEx(UpdateVpcVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.vswitch.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateVpcVswitchResponse());
    }

    /**
     * Description: 创建 workspace
     * Summary: 创建 workspace
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 创建 workspace
     * Summary: 创建 workspace
     */
    public CreateWorkspaceResponse createWorkspaceEx(CreateWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.workspace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWorkspaceResponse());
    }

    /**
     * Description: 元数据workspace创建
     * Summary: 元数据workspace创建
     */
    public CreateMetaWorkspaceResponse createMetaWorkspace(CreateMetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 元数据workspace创建
     * Summary: 元数据workspace创建
     */
    public CreateMetaWorkspaceResponse createMetaWorkspaceEx(CreateMetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.meta.workspace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMetaWorkspaceResponse());
    }

    /**
     * Description: workspace查询
     * Summary: workspace查询
     */
    public QueryMetaWorkspaceResponse queryMetaWorkspace(QueryMetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: workspace查询
     * Summary: workspace查询
     */
    public QueryMetaWorkspaceResponse queryMetaWorkspaceEx(QueryMetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.meta.workspace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetaWorkspaceResponse());
    }

    /**
     * Description: 元数据workspace删除
     * Summary: 元数据workspace删除
     */
    public DeleteMetaWorkspaceResponse deleteMetaWorkspace(DeleteMetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 元数据workspace删除
     * Summary: 元数据workspace删除
     */
    public DeleteMetaWorkspaceResponse deleteMetaWorkspaceEx(DeleteMetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.meta.workspace.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMetaWorkspaceResponse());
    }

    /**
     * Description: 资源VPC创建
     * Summary: 资源VPC创建
     */
    public CreateResourceVpcResponse createResourceVpc(CreateResourceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceVpcEx(request, headers, runtime);
    }

    /**
     * Description: 资源VPC创建
     * Summary: 资源VPC创建
     */
    public CreateResourceVpcResponse createResourceVpcEx(CreateResourceVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.vpc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateResourceVpcResponse());
    }

    /**
     * Description: 资源VPC查询
     * Summary: 资源VPC查询
     */
    public QueryResourceVpcResponse queryResourceVpc(QueryResourceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourceVpcEx(request, headers, runtime);
    }

    /**
     * Description: 资源VPC查询
     * Summary: 资源VPC查询
     */
    public QueryResourceVpcResponse queryResourceVpcEx(QueryResourceVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.vpc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourceVpcResponse());
    }

    /**
     * Description: 资源VPC删除
     * Summary: 资源VPC删除
     */
    public DeleteResourceVpcResponse deleteResourceVpc(DeleteResourceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceVpcEx(request, headers, runtime);
    }

    /**
     * Description: 资源VPC删除
     * Summary: 资源VPC删除
     */
    public DeleteResourceVpcResponse deleteResourceVpcEx(DeleteResourceVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.vpc.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteResourceVpcResponse());
    }

    /**
     * Description: 资源vswitch创建
     * Summary: 资源vswitch创建
     */
    public CreateResourceVswitchResponse createResourceVswitch(CreateResourceVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceVswitchEx(request, headers, runtime);
    }

    /**
     * Description: 资源vswitch创建
     * Summary: 资源vswitch创建
     */
    public CreateResourceVswitchResponse createResourceVswitchEx(CreateResourceVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.vswitch.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateResourceVswitchResponse());
    }

    /**
     * Description: 资源vswitch查询
     * Summary: 资源vswitch查询
     */
    public QueryResourceVswitchResponse queryResourceVswitch(QueryResourceVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourceVswitchEx(request, headers, runtime);
    }

    /**
     * Description: 资源vswitch查询
     * Summary: 资源vswitch查询
     */
    public QueryResourceVswitchResponse queryResourceVswitchEx(QueryResourceVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.vswitch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourceVswitchResponse());
    }

    /**
     * Description: 资源vswitch删除
     * Summary: 资源vswitch删除
     */
    public DeleteResourceVswitchResponse deleteResourceVswitch(DeleteResourceVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceVswitchEx(request, headers, runtime);
    }

    /**
     * Description: 资源vswitch删除
     * Summary: 资源vswitch删除
     */
    public DeleteResourceVswitchResponse deleteResourceVswitchEx(DeleteResourceVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.vswitch.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteResourceVswitchResponse());
    }

    /**
     * Description: 资源securitygroup查询
     * Summary: 资源securitygroup查询
     */
    public QueryResourceSecuritygroupResponse queryResourceSecuritygroup(QueryResourceSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourceSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: 资源securitygroup查询
     * Summary: 资源securitygroup查询
     */
    public QueryResourceSecuritygroupResponse queryResourceSecuritygroupEx(QueryResourceSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.securitygroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourceSecuritygroupResponse());
    }

    /**
     * Description: workspace 列表
     * Summary: workspace 列表
     */
    public ListMetaWorkspaceResponse listMetaWorkspace(ListMetaWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetaWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: workspace 列表
     * Summary: workspace 列表
     */
    public ListMetaWorkspaceResponse listMetaWorkspaceEx(ListMetaWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.meta.workspace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMetaWorkspaceResponse());
    }

    /**
     * Description: 创建安全组资源
     * Summary: 创建安全组
     */
    public CreateResourceSecuritygroupResponse createResourceSecuritygroup(CreateResourceSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建安全组资源
     * Summary: 创建安全组
     */
    public CreateResourceSecuritygroupResponse createResourceSecuritygroupEx(CreateResourceSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.securitygroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateResourceSecuritygroupResponse());
    }

    /**
     * Description: 删除安全组
     * Summary: 删除安全组
     */
    public DeleteResourceSecuritygroupResponse deleteResourceSecuritygroup(DeleteResourceSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除安全组
     * Summary: 删除安全组
     */
    public DeleteResourceSecuritygroupResponse deleteResourceSecuritygroupEx(DeleteResourceSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.securitygroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteResourceSecuritygroupResponse());
    }

    /**
     * Description: 创建云主机instance
     * Summary: 创建云主机instance
     */
    public CreateResourceComputerResponse createResourceComputer(CreateResourceComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceComputerEx(request, headers, runtime);
    }

    /**
     * Description: 创建云主机instance
     * Summary: 创建云主机instance
     */
    public CreateResourceComputerResponse createResourceComputerEx(CreateResourceComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateResourceComputerResponse());
    }

    /**
     * Description: computer 查询
     * Summary: computer 查询
     */
    public QueryResourceComputerResponse queryResourceComputer(QueryResourceComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourceComputerEx(request, headers, runtime);
    }

    /**
     * Description: computer 查询
     * Summary: computer 查询
     */
    public QueryResourceComputerResponse queryResourceComputerEx(QueryResourceComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourceComputerResponse());
    }

    /**
     * Description: 根据CPU内存机器规格查询api
     * Summary: 机器规格查询api
     */
    public QueryResourceComputerspecResponse queryResourceComputerspec(QueryResourceComputerspecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourceComputerspecEx(request, headers, runtime);
    }

    /**
     * Description: 根据CPU内存机器规格查询api
     * Summary: 机器规格查询api
     */
    public QueryResourceComputerspecResponse queryResourceComputerspecEx(QueryResourceComputerspecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computerspec.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourceComputerspecResponse());
    }

    /**
     * Description: 删除computer
     * Summary: 删除computer
     */
    public DeleteResourceComputerResponse deleteResourceComputer(DeleteResourceComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceComputerEx(request, headers, runtime);
    }

    /**
     * Description: 删除computer
     * Summary: 删除computer
     */
    public DeleteResourceComputerResponse deleteResourceComputerEx(DeleteResourceComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computer.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteResourceComputerResponse());
    }

    /**
     * Description: 重置computer密码
     * Summary: 重置computer密码
     */
    public ReinitResourceComputerpasswordResponse reinitResourceComputerpassword(ReinitResourceComputerpasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitResourceComputerpasswordEx(request, headers, runtime);
    }

    /**
     * Description: 重置computer密码
     * Summary: 重置computer密码
     */
    public ReinitResourceComputerpasswordResponse reinitResourceComputerpasswordEx(ReinitResourceComputerpasswordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computerpassword.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitResourceComputerpasswordResponse());
    }

    /**
     * Description: 启动computer
     * Summary: 启动computer
     */
    public StartResourceComputerResponse startResourceComputer(StartResourceComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startResourceComputerEx(request, headers, runtime);
    }

    /**
     * Description: 启动computer
     * Summary: 启动computer
     */
    public StartResourceComputerResponse startResourceComputerEx(StartResourceComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computer.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartResourceComputerResponse());
    }

    /**
     * Description: 停止机器
     * Summary: 停止机器
     */
    public StopResourceComputerResponse stopResourceComputer(StopResourceComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopResourceComputerEx(request, headers, runtime);
    }

    /**
     * Description: 停止机器
     * Summary: 停止机器
     */
    public StopResourceComputerResponse stopResourceComputerEx(StopResourceComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computer.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopResourceComputerResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志项目
     * Summary: 创建日志项目
     */
    public CreateSlsProjectResponse createSlsProject(CreateSlsProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSlsProjectEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志项目
     * Summary: 创建日志项目
     */
    public CreateSlsProjectResponse createSlsProjectEx(CreateSlsProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSlsProjectResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志项目列表
     * Summary: 获取日志项目列表
     */
    public ListSlsProjectResponse listSlsProject(ListSlsProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlsProjectEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志项目列表
     * Summary: 获取日志项目列表
     */
    public ListSlsProjectResponse listSlsProjectEx(ListSlsProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.project.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSlsProjectResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志库
     * Summary: 创建日志库
     */
    public CreateSlsLogstoreResponse createSlsLogstore(CreateSlsLogstoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSlsLogstoreEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志库
     * Summary: 创建日志库
     */
    public CreateSlsLogstoreResponse createSlsLogstoreEx(CreateSlsLogstoreRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.logstore.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSlsLogstoreResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志库列表
     * Summary: 获取日志库列表
     */
    public ListSlsLogstoreResponse listSlsLogstore(ListSlsLogstoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlsLogstoreEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志库列表
     * Summary: 获取日志库列表
     */
    public ListSlsLogstoreResponse listSlsLogstoreEx(ListSlsLogstoreRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.logstore.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSlsLogstoreResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取单个日志库
     * Summary: 获取单个日志库
     */
    public GetSlsLogstoreResponse getSlsLogstore(GetSlsLogstoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSlsLogstoreEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取单个日志库
     * Summary: 获取单个日志库
     */
    public GetSlsLogstoreResponse getSlsLogstoreEx(GetSlsLogstoreRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.logstore.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSlsLogstoreResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志配置
     * Summary: 创建日志配置
     */
    public CreateSlsConfigResponse createSlsConfig(CreateSlsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSlsConfigEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志配置
     * Summary: 创建日志配置
     */
    public CreateSlsConfigResponse createSlsConfigEx(CreateSlsConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.config.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSlsConfigResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志配置列表
     * Summary: 获取日志配置列表
     */
    public ListSlsConfigResponse listSlsConfig(ListSlsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlsConfigEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志配置列表
     * Summary: 获取日志配置列表
     */
    public ListSlsConfigResponse listSlsConfigEx(ListSlsConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.config.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSlsConfigResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-更新日志配置
     * Summary: 更新日志配置
     */
    public UpdateSlsConfigResponse updateSlsConfig(UpdateSlsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSlsConfigEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-更新日志配置
     * Summary: 更新日志配置
     */
    public UpdateSlsConfigResponse updateSlsConfigEx(UpdateSlsConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.config.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSlsConfigResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS)-删除日志配置
     * Summary: 删除日志配置
     */
    public DeleteSlsConfigResponse deleteSlsConfig(DeleteSlsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSlsConfigEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-删除日志配置
     * Summary: 删除日志配置
     */
    public DeleteSlsConfigResponse deleteSlsConfigEx(DeleteSlsConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.config.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSlsConfigResponse());
    }

    /**
     * Description: 阿里云日志服务(SLS) - 查询日志
     * Summary: 查询日志
     */
    public QuerySlsLogResponse querySlsLog(QuerySlsLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySlsLogEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS) - 查询日志
     * Summary: 查询日志
     */
    public QuerySlsLogResponse querySlsLogEx(QuerySlsLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.sls.log.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySlsLogResponse());
    }

    /**
     * Description: 批量添加安全组入规则
     * Summary: 批量添加安全组规则
     */
    public BatchcreateResourceIngressrulesResponse batchcreateResourceIngressrules(BatchcreateResourceIngressrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateResourceIngressrulesEx(request, headers, runtime);
    }

    /**
     * Description: 批量添加安全组入规则
     * Summary: 批量添加安全组规则
     */
    public BatchcreateResourceIngressrulesResponse batchcreateResourceIngressrulesEx(BatchcreateResourceIngressrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.ingressrules.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateResourceIngressrulesResponse());
    }

    /**
     * Description: 批量添加安全组出方向规则
     * Summary: 批量添加安全组出方向规则
     */
    public BatchcreateResourceEgressrulesResponse batchcreateResourceEgressrules(BatchcreateResourceEgressrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateResourceEgressrulesEx(request, headers, runtime);
    }

    /**
     * Description: 批量添加安全组出方向规则
     * Summary: 批量添加安全组出方向规则
     */
    public BatchcreateResourceEgressrulesResponse batchcreateResourceEgressrulesEx(BatchcreateResourceEgressrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.egressrules.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateResourceEgressrulesResponse());
    }

    /**
     * Description: loadbalance查询
     * Summary: loadbalance查询
     */
    public QueryLoadbalanceResponse queryLoadbalance(QueryLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: loadbalance查询
     * Summary: loadbalance查询
     */
    public QueryLoadbalanceResponse queryLoadbalanceEx(QueryLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceResponse());
    }

    /**
     * Description: 获取单个LB的健康状态
     * Summary: 获取单个LB的健康状态
     */
    public GetLoadbalanceHealthResponse getLoadbalanceHealth(GetLoadbalanceHealthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoadbalanceHealthEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个LB的健康状态
     * Summary: 获取单个LB的健康状态
     */
    public GetLoadbalanceHealthResponse getLoadbalanceHealthEx(GetLoadbalanceHealthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.health.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLoadbalanceHealthResponse());
    }

    /**
     * Description: 获取所有的vip类型
     * Summary: 获取所有的vip类型
     */
    public AllLoadbalanceViptypeResponse allLoadbalanceViptype(AllLoadbalanceViptypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allLoadbalanceViptypeEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有的vip类型
     * Summary: 获取所有的vip类型
     */
    public AllLoadbalanceViptypeResponse allLoadbalanceViptypeEx(AllLoadbalanceViptypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.viptype.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllLoadbalanceViptypeResponse());
    }

    /**
     * Description: 获取所有的LB集群
     * Summary: 获取所有的LB集群
     */
    public AllLoadbalanceClusterResponse allLoadbalanceCluster(AllLoadbalanceClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allLoadbalanceClusterEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有的LB集群
     * Summary: 获取所有的LB集群
     */
    public AllLoadbalanceClusterResponse allLoadbalanceClusterEx(AllLoadbalanceClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.cluster.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllLoadbalanceClusterResponse());
    }

    /**
     * Description: 查询vpc详细信息
     * Summary: 查询vpc详细信息
     */
    public QueryVpcResponse queryVpc(QueryVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryVpcEx(request, headers, runtime);
    }

    /**
     * Description: 查询vpc详细信息
     * Summary: 查询vpc详细信息
     */
    public QueryVpcResponse queryVpcEx(QueryVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryVpcResponse());
    }

    /**
     * Description: 查询已导入workspace的vpc
     * Summary: 查询已导入workspace的vpc
     */
    public ListVpcImportResponse listVpcImport(ListVpcImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcImportEx(request, headers, runtime);
    }

    /**
     * Description: 查询已导入workspace的vpc
     * Summary: 查询已导入workspace的vpc
     */
    public ListVpcImportResponse listVpcImportEx(ListVpcImportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.import.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListVpcImportResponse());
    }

    /**
     * Description: 查询vpc cidrblock信息
     * Summary: 查询vpc cidrblock信息
     */
    public ListVpcCidrblockResponse listVpcCidrblock(ListVpcCidrblockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcCidrblockEx(request, headers, runtime);
    }

    /**
     * Description: 查询vpc cidrblock信息
     * Summary: 查询vpc cidrblock信息
     */
    public ListVpcCidrblockResponse listVpcCidrblockEx(ListVpcCidrblockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.cidrblock.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListVpcCidrblockResponse());
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息
     */
    public QueryVpcVswitchResponse queryVpcVswitch(QueryVpcVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryVpcVswitchEx(request, headers, runtime);
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息
     */
    public QueryVpcVswitchResponse queryVpcVswitchEx(QueryVpcVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.vswitch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryVpcVswitchResponse());
    }

    /**
     * Description: 查询路由表信息
     * Summary: 查询路由表信息
     */
    public QueryVpcVroutertableResponse queryVpcVroutertable(QueryVpcVroutertableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryVpcVroutertableEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由表信息
     * Summary: 查询路由表信息
     */
    public QueryVpcVroutertableResponse queryVpcVroutertableEx(QueryVpcVroutertableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.vpc.vroutertable.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryVpcVroutertableResponse());
    }

    /**
     * Description: 获取单个rule
     * Summary: 获取单个rule
     */
    public GetLoadbalanceRuleResponse getLoadbalanceRule(GetLoadbalanceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoadbalanceRuleEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个rule
     * Summary: 获取单个rule
     */
    public GetLoadbalanceRuleResponse getLoadbalanceRuleEx(GetLoadbalanceRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.rule.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLoadbalanceRuleResponse());
    }

    /**
     * Description: 批量查询Lb rule
     * Summary: 批量查询Lb rule
     */
    public QueryLoadbalanceRuleResponse queryLoadbalanceRule(QueryLoadbalanceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceRuleEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询Lb rule
     * Summary: 批量查询Lb rule
     */
    public QueryLoadbalanceRuleResponse queryLoadbalanceRuleEx(QueryLoadbalanceRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.rule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceRuleResponse());
    }

    /**
     * Description: 获取单个Lb ById
     * Summary: 获取单个Lb ById
     */
    public GetLoadbalanceResponse getLoadbalance(GetLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个Lb ById
     * Summary: 获取单个Lb ById
     */
    public GetLoadbalanceResponse getLoadbalanceEx(GetLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLoadbalanceResponse());
    }

    /**
     * Description: 获取LB后端所有主机
     * Summary: 获取LB后端所有主机
     */
    public AllLoadbalanceMountResponse allLoadbalanceMount(AllLoadbalanceMountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allLoadbalanceMountEx(request, headers, runtime);
    }

    /**
     * Description: 获取LB后端所有主机
     * Summary: 获取LB后端所有主机
     */
    public AllLoadbalanceMountResponse allLoadbalanceMountEx(AllLoadbalanceMountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.mount.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllLoadbalanceMountResponse());
    }

    /**
     * Description: 根据条件查询后端的主机
     * Summary: 根据条件查询后端的主机
     */
    public QueryLoadbalanceMountResponse queryLoadbalanceMount(QueryLoadbalanceMountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceMountEx(request, headers, runtime);
    }

    /**
     * Description: 根据条件查询后端的主机
     * Summary: 根据条件查询后端的主机
     */
    public QueryLoadbalanceMountResponse queryLoadbalanceMountEx(QueryLoadbalanceMountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.mount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceMountResponse());
    }

    /**
     * Description: 获取单个vcomputergroup
     * Summary: 获取单个vcomputergroup
     */
    public GetLoadbalanceVcomputergroupResponse getLoadbalanceVcomputergroup(GetLoadbalanceVcomputergroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoadbalanceVcomputergroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个vcomputergroup
     * Summary: 获取单个vcomputergroup
     */
    public GetLoadbalanceVcomputergroupResponse getLoadbalanceVcomputergroupEx(GetLoadbalanceVcomputergroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetLoadbalanceVcomputergroupResponse());
    }

    /**
     * Description: 查询vcomputergroup
     * Summary: 查询vcomputergroup
     */
    public QueryLoadbalanceVcomputergroupResponse queryLoadbalanceVcomputergroup(QueryLoadbalanceVcomputergroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceVcomputergroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询vcomputergroup
     * Summary: 查询vcomputergroup
     */
    public QueryLoadbalanceVcomputergroupResponse queryLoadbalanceVcomputergroupEx(QueryLoadbalanceVcomputergroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceVcomputergroupResponse());
    }

    /**
     * Description: 获取所有vcomputergroup
     * Summary: 获取所有vcomputergroup
     */
    public AllLoadbalanceVcomputergroupResponse allLoadbalanceVcomputergroup(AllLoadbalanceVcomputergroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allLoadbalanceVcomputergroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有vcomputergroup
     * Summary: 获取所有vcomputergroup
     */
    public AllLoadbalanceVcomputergroupResponse allLoadbalanceVcomputergroupEx(AllLoadbalanceVcomputergroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllLoadbalanceVcomputergroupResponse());
    }

    /**
     * Description: 获取vcomputer
     * Summary: 获取vcomputer
     */
    public QueryLoadbalanceVcomputerResponse queryLoadbalanceVcomputer(QueryLoadbalanceVcomputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceVcomputerEx(request, headers, runtime);
    }

    /**
     * Description: 获取vcomputer
     * Summary: 获取vcomputer
     */
    public QueryLoadbalanceVcomputerResponse queryLoadbalanceVcomputerEx(QueryLoadbalanceVcomputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceVcomputerResponse());
    }

    /**
     * Description: 查询listener
     * Summary: 查询listener
     */
    public QueryLoadbalanceListenerResponse queryLoadbalanceListener(QueryLoadbalanceListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceListenerEx(request, headers, runtime);
    }

    /**
     * Description: 查询listener
     * Summary: 查询listener
     */
    public QueryLoadbalanceListenerResponse queryLoadbalanceListenerEx(QueryLoadbalanceListenerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.listener.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceListenerResponse());
    }

    /**
     * Description: 获取所有listener
     * Summary: 获取所有listener
     */
    public AllLoadbalanceListenerResponse allLoadbalanceListener(AllLoadbalanceListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allLoadbalanceListenerEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有listener
     * Summary: 获取所有listener
     */
    public AllLoadbalanceListenerResponse allLoadbalanceListenerEx(AllLoadbalanceListenerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.listener.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllLoadbalanceListenerResponse());
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip
     */
    public QueryLoadbalanceSecurityipResponse queryLoadbalanceSecurityip(QueryLoadbalanceSecurityipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceSecurityipEx(request, headers, runtime);
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip
     */
    public QueryLoadbalanceSecurityipResponse queryLoadbalanceSecurityipEx(QueryLoadbalanceSecurityipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.securityip.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceSecurityipResponse());
    }

    /**
     * Description: 获取单个database
     * Summary: 获取单个database
     */
    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个database
     * Summary: 获取单个database
     */
    public GetDatabaseResponse getDatabaseEx(GetDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDatabaseResponse());
    }

    /**
     * Description: 获取所有masterzone
     * Summary: 获取所有masterzone
     */
    public AllDatabaseMasterzoneResponse allDatabaseMasterzone(AllDatabaseMasterzoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDatabaseMasterzoneEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有masterzone
     * Summary: 获取所有masterzone
     */
    public AllDatabaseMasterzoneResponse allDatabaseMasterzoneEx(AllDatabaseMasterzoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.masterzone.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDatabaseMasterzoneResponse());
    }

    /**
     * Description: 查询数据库
     * Summary: 查询数据库
     */
    public QueryDatabaseResponse queryDatabase(QueryDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据库
     * Summary: 查询数据库
     */
    public QueryDatabaseResponse queryDatabaseEx(QueryDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseResponse());
    }

    /**
     * Description: 查询数据库规格
     * Summary: 查询数据库规格
     */
    public QueryDatabaseSpecResponse queryDatabaseSpec(QueryDatabaseSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseSpecEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据库规格
     * Summary: 查询数据库规格
     */
    public QueryDatabaseSpecResponse queryDatabaseSpecEx(QueryDatabaseSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.spec.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseSpecResponse());
    }

    /**
     * Description: 查询数据引擎
     * Summary: 查询数据引擎
     */
    public AllDatabaseEngineResponse allDatabaseEngine(AllDatabaseEngineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDatabaseEngineEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据引擎
     * Summary: 查询数据引擎
     */
    public AllDatabaseEngineResponse allDatabaseEngineEx(AllDatabaseEngineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.engine.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDatabaseEngineResponse());
    }

    /**
     * Description: 查询数据库quota
     * Summary: 查询数据库quota
     */
    public AllDatabaseQuotaResponse allDatabaseQuota(AllDatabaseQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDatabaseQuotaEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据库quota
     * Summary: 查询数据库quota
     */
    public AllDatabaseQuotaResponse allDatabaseQuotaEx(AllDatabaseQuotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.quota.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDatabaseQuotaResponse());
    }

    /**
     * Description: 查询数据库所有securityip
     * Summary: 查询数据库所有securityip
     */
    public AllDatabaseSecurityipResponse allDatabaseSecurityip(AllDatabaseSecurityipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDatabaseSecurityipEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据库所有securityip
     * Summary: 查询数据库所有securityip
     */
    public AllDatabaseSecurityipResponse allDatabaseSecurityipEx(AllDatabaseSecurityipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.securityip.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDatabaseSecurityipResponse());
    }

    /**
     * Description: ！！！！不要用，typo
     * Summary: ！！！！不要用，typo
     */
    public QueryDatabaseSchemeResponse queryDatabaseScheme(QueryDatabaseSchemeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseSchemeEx(request, headers, runtime);
    }

    /**
     * Description: ！！！！不要用，typo
     * Summary: ！！！！不要用，typo
     */
    public QueryDatabaseSchemeResponse queryDatabaseSchemeEx(QueryDatabaseSchemeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.scheme.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseSchemeResponse());
    }

    /**
     * Description: 获取数据库导入记录
     * Summary: 获取数据库导入记录
     */
    public AllDatabaseImportResponse allDatabaseImport(AllDatabaseImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDatabaseImportEx(request, headers, runtime);
    }

    /**
     * Description: 获取数据库导入记录
     * Summary: 获取数据库导入记录
     */
    public AllDatabaseImportResponse allDatabaseImportEx(AllDatabaseImportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.import.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDatabaseImportResponse());
    }

    /**
     * Description: 查询computer agent状态
     * Summary: 查询computer agent状态
     */
    public QueryComputerAgentstatusResponse queryComputerAgentstatus(QueryComputerAgentstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerAgentstatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询computer agent状态
     * Summary: 查询computer agent状态
     */
    public QueryComputerAgentstatusResponse queryComputerAgentstatusEx(QueryComputerAgentstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.agentstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerAgentstatusResponse());
    }

    /**
     * Description: 查询computer staragent 启动命令
     * Summary: 查询 staragent 启动命令
     */
    public QueryComputerAgentsetupcommandResponse queryComputerAgentsetupcommand(QueryComputerAgentsetupcommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerAgentsetupcommandEx(request, headers, runtime);
    }

    /**
     * Description: 查询computer staragent 启动命令
     * Summary: 查询 staragent 启动命令
     */
    public QueryComputerAgentsetupcommandResponse queryComputerAgentsetupcommandEx(QueryComputerAgentsetupcommandRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.agentsetupcommand.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerAgentsetupcommandResponse());
    }

    /**
     * Description: 查询已导入的computer信息
     * Summary: 查询已导入的computer信息
     */
    public QueryComputerImportResponse queryComputerImport(QueryComputerImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerImportEx(request, headers, runtime);
    }

    /**
     * Description: 查询已导入的computer信息
     * Summary: 查询已导入的computer信息
     */
    public QueryComputerImportResponse queryComputerImportEx(QueryComputerImportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.import.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerImportResponse());
    }

    /**
     * Description: list computers
     * Summary: list computers
     */
    public ListComputerResponse listComputer(ListComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComputerEx(request, headers, runtime);
    }

    /**
     * Description: list computers
     * Summary: list computers
     */
    public ListComputerResponse listComputerEx(ListComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListComputerResponse());
    }

    /**
     * Description: query computer specs
     * Summary: query computer specs
     */
    public QueryComputerSpecResponse queryComputerSpec(QueryComputerSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerSpecEx(request, headers, runtime);
    }

    /**
     * Description: query computer specs
     * Summary: query computer specs
     */
    public QueryComputerSpecResponse queryComputerSpecEx(QueryComputerSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.spec.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerSpecResponse());
    }

    /**
     * Description: query computer common image
     * Summary: query common image
     */
    public QueryComputerCommonimageResponse queryComputerCommonimage(QueryComputerCommonimageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerCommonimageEx(request, headers, runtime);
    }

    /**
     * Description: query computer common image
     * Summary: query common image
     */
    public QueryComputerCommonimageResponse queryComputerCommonimageEx(QueryComputerCommonimageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.commonimage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerCommonimageResponse());
    }

    /**
     * Description: 获取所有loadbalance
     * Summary: 获取所有loadbalance
     */
    public AllLoadbalanceResponse allLoadbalance(AllLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有loadbalance
     * Summary: 获取所有loadbalance
     */
    public AllLoadbalanceResponse allLoadbalanceEx(AllLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllLoadbalanceResponse());
    }

    /**
     * Description: 查询导入信息
     * Summary: 查询导入信息
     */
    public QueryLoadbalanceImportResponse queryLoadbalanceImport(QueryLoadbalanceImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalanceImportEx(request, headers, runtime);
    }

    /**
     * Description: 查询导入信息
     * Summary: 查询导入信息
     */
    public QueryLoadbalanceImportResponse queryLoadbalanceImportEx(QueryLoadbalanceImportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.import.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalanceImportResponse());
    }

    /**
     * Description: 查询数据库导入记录
     * Summary: 查询数据库导入记录
     */
    public QueryDatabaseImportResponse queryDatabaseImport(QueryDatabaseImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseImportEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据库导入记录
     * Summary: 查询数据库导入记录
     */
    public QueryDatabaseImportResponse queryDatabaseImportEx(QueryDatabaseImportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.import.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseImportResponse());
    }

    /**
     * Description: 查询masterzone
     * Summary: 查询masterzone
     */
    public QueryDatabaseMasterzoneResponse queryDatabaseMasterzone(QueryDatabaseMasterzoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseMasterzoneEx(request, headers, runtime);
    }

    /**
     * Description: 查询masterzone
     * Summary: 查询masterzone
     */
    public QueryDatabaseMasterzoneResponse queryDatabaseMasterzoneEx(QueryDatabaseMasterzoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.masterzone.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseMasterzoneResponse());
    }

    /**
     * Description: 查询数据库额度
     * Summary: 查询数据库额度
     */
    public QueryDatabaseQuotaResponse queryDatabaseQuota(QueryDatabaseQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseQuotaEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据库额度
     * Summary: 查询数据库额度
     */
    public QueryDatabaseQuotaResponse queryDatabaseQuotaEx(QueryDatabaseQuotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.quota.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseQuotaResponse());
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip
     */
    public QueryDatabaseSecurityipResponse queryDatabaseSecurityip(QueryDatabaseSecurityipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseSecurityipEx(request, headers, runtime);
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip
     */
    public QueryDatabaseSecurityipResponse queryDatabaseSecurityipEx(QueryDatabaseSecurityipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.securityip.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseSecurityipResponse());
    }

    /**
     * Description: 查询当前数据库的schema
     * Summary: 查询当前数据库的schema
     */
    public QueryDatabaseSchemaResponse queryDatabaseSchema(QueryDatabaseSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前数据库的schema
     * Summary: 查询当前数据库的schema
     */
    public QueryDatabaseSchemaResponse queryDatabaseSchemaEx(QueryDatabaseSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.schema.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseSchemaResponse());
    }

    /**
     * Description: 查询数据库的账号
     * Summary: 查询数据库的账号
     */
    public QueryDatabaseAccountResponse queryDatabaseAccount(QueryDatabaseAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatabaseAccountEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据库的账号
     * Summary: 查询数据库的账号
     */
    public QueryDatabaseAccountResponse queryDatabaseAccountEx(QueryDatabaseAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatabaseAccountResponse());
    }

    /**
     * Description: 查询workspace
     * Summary: 查询workspace
     */
    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询workspace
     * Summary: 查询workspace
     */
    public GetWorkspaceResponse getWorkspaceEx(GetWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.workspace.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspaceResponse());
    }

    /**
     * Description: 查询region
     * Summary: 查询region
     */
    public ListRegionResponse listRegion(ListRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionEx(request, headers, runtime);
    }

    /**
     * Description: 查询region
     * Summary: 查询region
     */
    public ListRegionResponse listRegionEx(ListRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.region.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRegionResponse());
    }

    /**
     * Description: 租户可用region
     * Summary: 租户可用region
     */
    public ListRegionAccessibleResponse listRegionAccessible(ListRegionAccessibleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionAccessibleEx(request, headers, runtime);
    }

    /**
     * Description: 租户可用region
     * Summary: 租户可用region
     */
    public ListRegionAccessibleResponse listRegionAccessibleEx(ListRegionAccessibleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.region.accessible.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRegionAccessibleResponse());
    }

    /**
     * Description: 更新基本信息
     * Summary: 更新基本信息
     */
    public UpdateDatabaseInfoResponse updateDatabaseInfo(UpdateDatabaseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatabaseInfoEx(request, headers, runtime);
    }

    /**
     * Description: 更新基本信息
     * Summary: 更新基本信息
     */
    public UpdateDatabaseInfoResponse updateDatabaseInfoEx(UpdateDatabaseInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDatabaseInfoResponse());
    }

    /**
     * Description: 把数据库分配给应用
     * Summary: 把数据库分配给应用
     */
    public SetDatabaseAssignResponse setDatabaseAssign(SetDatabaseAssignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDatabaseAssignEx(request, headers, runtime);
    }

    /**
     * Description: 把数据库分配给应用
     * Summary: 把数据库分配给应用
     */
    public SetDatabaseAssignResponse setDatabaseAssignEx(SetDatabaseAssignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.assign.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDatabaseAssignResponse());
    }

    /**
     * Description: 共享数据库给其他workspace
     * Summary: 共享数据库给其他workspace
     */
    public SetDatabaseShareResponse setDatabaseShare(SetDatabaseShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDatabaseShareEx(request, headers, runtime);
    }

    /**
     * Description: 共享数据库给其他workspace
     * Summary: 共享数据库给其他workspace
     */
    public SetDatabaseShareResponse setDatabaseShareEx(SetDatabaseShareRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.share.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDatabaseShareResponse());
    }

    /**
     * Description: 重启数据库
     * Summary: 重启数据库
     */
    public RebootDatabaseResponse rebootDatabase(RebootDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebootDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: 重启数据库
     * Summary: 重启数据库
     */
    public RebootDatabaseResponse rebootDatabaseEx(RebootDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.reboot", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RebootDatabaseResponse());
    }

    /**
     * Description: 更新账户信息
     * Summary: 更新账户信息
     */
    public UpdateDatabaseAccountResponse updateDatabaseAccount(UpdateDatabaseAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatabaseAccountEx(request, headers, runtime);
    }

    /**
     * Description: 更新账户信息
     * Summary: 更新账户信息
     */
    public UpdateDatabaseAccountResponse updateDatabaseAccountEx(UpdateDatabaseAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.account.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDatabaseAccountResponse());
    }

    /**
     * Description: 重设databaseaccount密码
     * Summary: 重设databaseaccount密码
     */
    public SetDatabaseAccountpasswordResponse setDatabaseAccountpassword(SetDatabaseAccountpasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDatabaseAccountpasswordEx(request, headers, runtime);
    }

    /**
     * Description: 重设databaseaccount密码
     * Summary: 重设databaseaccount密码
     */
    public SetDatabaseAccountpasswordResponse setDatabaseAccountpasswordEx(SetDatabaseAccountpasswordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.accountpassword.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDatabaseAccountpasswordResponse());
    }

    /**
     * Description: 数据库账户授权schema
     * Summary: 数据库账户授权schema
     */
    public AuthDatabaseAccountResponse authDatabaseAccount(AuthDatabaseAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authDatabaseAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数据库账户授权schema
     * Summary: 数据库账户授权schema
     */
    public AuthDatabaseAccountResponse authDatabaseAccountEx(AuthDatabaseAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.account.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthDatabaseAccountResponse());
    }

    /**
     * Description: 查询tenantRegion
     * Summary: 查询tenantRegion
     */
    public GetRegionTenantResponse getRegionTenant(GetRegionTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionTenantEx(request, headers, runtime);
    }

    /**
     * Description: 查询tenantRegion
     * Summary: 查询tenantRegion
     */
    public GetRegionTenantResponse getRegionTenantEx(GetRegionTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.region.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRegionTenantResponse());
    }

    /**
     * Description: getRegionAliasById
     * Summary: getRegionAliasById
     */
    public GetRegionAliasbyidResponse getRegionAliasbyid(GetRegionAliasbyidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionAliasbyidEx(request, headers, runtime);
    }

    /**
     * Description: getRegionAliasById
     * Summary: getRegionAliasById
     */
    public GetRegionAliasbyidResponse getRegionAliasbyidEx(GetRegionAliasbyidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.region.aliasbyid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRegionAliasbyidResponse());
    }

    /**
     * Description: 查询disk信息
     * Summary: 查询disk信息
     */
    public QueryDiskResponse queryDisk(QueryDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDiskEx(request, headers, runtime);
    }

    /**
     * Description: 查询disk信息
     * Summary: 查询disk信息
     */
    public QueryDiskResponse queryDiskEx(QueryDiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.disk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDiskResponse());
    }

    /**
     * Description: 查询computer image信息
     * Summary: 查询computer image信息
     */
    public QueryImageResponse queryImage(QueryImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImageEx(request, headers, runtime);
    }

    /**
     * Description: 查询computer image信息
     * Summary: 查询computer image信息
     */
    public QueryImageResponse queryImageEx(QueryImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.image.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryImageResponse());
    }

    /**
     * Description: 创建数据库schema
     * Summary: 创建数据库schema
     */
    public CreateDatabaseSchemaResponse createDatabaseSchema(CreateDatabaseSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatabaseSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 创建数据库schema
     * Summary: 创建数据库schema
     */
    public CreateDatabaseSchemaResponse createDatabaseSchemaEx(CreateDatabaseSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.schema.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDatabaseSchemaResponse());
    }

    /**
     * Description: LB挂载后端主机
     * Summary: LB挂载后端主机
     */
    public CreateLoadbalanceMountResponse createLoadbalanceMount(CreateLoadbalanceMountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLoadbalanceMountEx(request, headers, runtime);
    }

    /**
     * Description: LB挂载后端主机
     * Summary: LB挂载后端主机
     */
    public CreateLoadbalanceMountResponse createLoadbalanceMountEx(CreateLoadbalanceMountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.mount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLoadbalanceMountResponse());
    }

    /**
     * Description: 创建监听器
     * Summary: 创建监听器
     */
    public CreateLoadbalanceListenerResponse createLoadbalanceListener(CreateLoadbalanceListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLoadbalanceListenerEx(request, headers, runtime);
    }

    /**
     * Description: 创建监听器
     * Summary: 创建监听器
     */
    public CreateLoadbalanceListenerResponse createLoadbalanceListenerEx(CreateLoadbalanceListenerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.listener.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLoadbalanceListenerResponse());
    }

    /**
     * Description: 停止监听器
     * Summary: 停止监听器
     */
    public StopLoadbalanceListenerResponse stopLoadbalanceListener(StopLoadbalanceListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopLoadbalanceListenerEx(request, headers, runtime);
    }

    /**
     * Description: 停止监听器
     * Summary: 停止监听器
     */
    public StopLoadbalanceListenerResponse stopLoadbalanceListenerEx(StopLoadbalanceListenerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.listener.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopLoadbalanceListenerResponse());
    }

    /**
     * Description: 启动lb
     * Summary: 启动lb
     */
    public StartLoadbalanceListenerResponse startLoadbalanceListener(StartLoadbalanceListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startLoadbalanceListenerEx(request, headers, runtime);
    }

    /**
     * Description: 启动lb
     * Summary: 启动lb
     */
    public StartLoadbalanceListenerResponse startLoadbalanceListenerEx(StartLoadbalanceListenerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.listener.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartLoadbalanceListenerResponse());
    }

    /**
     * Description: 更新listener配置
     * Summary: 更新listener配置
     */
    public UpdateLoadbalanceListenerResponse updateLoadbalanceListener(UpdateLoadbalanceListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoadbalanceListenerEx(request, headers, runtime);
    }

    /**
     * Description: 更新listener配置
     * Summary: 更新listener配置
     */
    public UpdateLoadbalanceListenerResponse updateLoadbalanceListenerEx(UpdateLoadbalanceListenerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.listener.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLoadbalanceListenerResponse());
    }

    /**
     * Description: 查询disk spec信息
     * Summary: 查询disk spec信息
     */
    public QueryDiskspecResponse queryDiskspec(QueryDiskspecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDiskspecEx(request, headers, runtime);
    }

    /**
     * Description: 查询disk spec信息
     * Summary: 查询disk spec信息
     */
    public QueryDiskspecResponse queryDiskspecEx(QueryDiskspecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.diskspec.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDiskspecResponse());
    }

    /**
     * Description: 查询computer quota
     * Summary: 查询computer quota
     */
    public QueryComputerquotaResponse queryComputerquota(QueryComputerquotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerquotaEx(request, headers, runtime);
    }

    /**
     * Description: 查询computer quota
     * Summary: 查询computer quota
     */
    public QueryComputerquotaResponse queryComputerquotaEx(QueryComputerquotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computerquota.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerquotaResponse());
    }

    /**
     * Description: 停止computer
     * Summary: 停止computer
     */
    public StopComputerResponse stopComputer(StopComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopComputerEx(request, headers, runtime);
    }

    /**
     * Description: 停止computer
     * Summary: 停止computer
     */
    public StopComputerResponse stopComputerEx(StopComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopComputerResponse());
    }

    /**
     * Description: 重启computer
     * Summary: 重启computer
     */
    public RebootComputerResponse rebootComputer(RebootComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebootComputerEx(request, headers, runtime);
    }

    /**
     * Description: 重启computer
     * Summary: 重启computer
     */
    public RebootComputerResponse rebootComputerEx(RebootComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.reboot", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RebootComputerResponse());
    }

    /**
     * Description: 查询computer所属安全组
     * Summary: 查询computer所属安全组
     */
    public QueryComputerSecuritygroupResponse queryComputerSecuritygroup(QueryComputerSecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerSecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询computer所属安全组
     * Summary: 查询computer所属安全组
     */
    public QueryComputerSecuritygroupResponse queryComputerSecuritygroupEx(QueryComputerSecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.securitygroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerSecuritygroupResponse());
    }

    /**
     * Description: 查询安全组信息
     * Summary: 查询安全组信息
     */
    public QuerySecuritygroupResponse querySecuritygroup(QuerySecuritygroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecuritygroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询安全组信息
     * Summary: 查询安全组信息
     */
    public QuerySecuritygroupResponse querySecuritygroupEx(QuerySecuritygroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecuritygroupResponse());
    }

    /**
     * Description: 创建安全组规则
     * Summary: 创建安全组规则
     */
    public CreateSecuritygroupPermissionResponse createSecuritygroupPermission(CreateSecuritygroupPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecuritygroupPermissionEx(request, headers, runtime);
    }

    /**
     * Description: 创建安全组规则
     * Summary: 创建安全组规则
     */
    public CreateSecuritygroupPermissionResponse createSecuritygroupPermissionEx(CreateSecuritygroupPermissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.permission.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSecuritygroupPermissionResponse());
    }

    /**
     * Description: 查询安全组规则信息
     * Summary: 查询安全组规则信息
     */
    public QuerySecuritygroupPermissionResponse querySecuritygroupPermission(QuerySecuritygroupPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecuritygroupPermissionEx(request, headers, runtime);
    }

    /**
     * Description: 查询安全组规则信息
     * Summary: 查询安全组规则信息
     */
    public QuerySecuritygroupPermissionResponse querySecuritygroupPermissionEx(QuerySecuritygroupPermissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.securitygroup.permission.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecuritygroupPermissionResponse());
    }

    /**
     * Description: 更新监听器的安全控制
     * Summary: 更新监听器的安全控制
     */
    public UpdateLoadbalanaceSecurityipResponse updateLoadbalanaceSecurityip(UpdateLoadbalanaceSecurityipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoadbalanaceSecurityipEx(request, headers, runtime);
    }

    /**
     * Description: 更新监听器的安全控制
     * Summary: 更新监听器的安全控制
     */
    public UpdateLoadbalanaceSecurityipResponse updateLoadbalanaceSecurityipEx(UpdateLoadbalanaceSecurityipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalanace.securityip.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLoadbalanaceSecurityipResponse());
    }

    /**
     * Description: 创建lb监听器的安全控制
     * Summary: 创建lb监听器的安全控制
     */
    public CreateLoadbalanceSecurityipResponse createLoadbalanceSecurityip(CreateLoadbalanceSecurityipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLoadbalanceSecurityipEx(request, headers, runtime);
    }

    /**
     * Description: 创建lb监听器的安全控制
     * Summary: 创建lb监听器的安全控制
     */
    public CreateLoadbalanceSecurityipResponse createLoadbalanceSecurityipEx(CreateLoadbalanceSecurityipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.securityip.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLoadbalanceSecurityipResponse());
    }

    /**
     * Description: 编辑数据库的基本属性
     * Summary: 编辑数据库的基本属性
     */
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatabaseEx(request, headers, runtime);
    }

    /**
     * Description: 编辑数据库的基本属性
     * Summary: 编辑数据库的基本属性
     */
    public UpdateDatabaseResponse updateDatabaseEx(UpdateDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.database.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDatabaseResponse());
    }

    /**
     * Description: 更新后端权重
     * Summary: 更新后端权重
     */
    public UpdateLoadbalanceMountResponse updateLoadbalanceMount(UpdateLoadbalanceMountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoadbalanceMountEx(request, headers, runtime);
    }

    /**
     * Description: 更新后端权重
     * Summary: 更新后端权重
     */
    public UpdateLoadbalanceMountResponse updateLoadbalanceMountEx(UpdateLoadbalanceMountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.mount.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLoadbalanceMountResponse());
    }

    /**
     * Description: 删除LB后端挂载主机
     * Summary: 删除LB后端挂载主机
     */
    public DeleteLoadbalanceMountResponse deleteLoadbalanceMount(DeleteLoadbalanceMountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLoadbalanceMountEx(request, headers, runtime);
    }

    /**
     * Description: 删除LB后端挂载主机
     * Summary: 删除LB后端挂载主机
     */
    public DeleteLoadbalanceMountResponse deleteLoadbalanceMountEx(DeleteLoadbalanceMountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.mount.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteLoadbalanceMountResponse());
    }

    /**
     * Description: 查询任务记录
     * Summary: 查询任务记录
     */
    public QueryRequestResponse queryRequest(QueryRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRequestEx(request, headers, runtime);
    }

    /**
     * Description: 查询任务记录
     * Summary: 查询任务记录
     */
    public QueryRequestResponse queryRequestEx(QueryRequestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.request.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRequestResponse());
    }

    /**
     * Description: 获取单个request
     * Summary: 获取单个request
     */
    public GetRequestResponse getRequest(GetRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRequestEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个request
     * Summary: 获取单个request
     */
    public GetRequestResponse getRequestEx(GetRequestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.request.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRequestResponse());
    }

    /**
     * Description: 查询task
     * Summary: 查询task
     */
    public QueryRequestTaskResponse queryRequestTask(QueryRequestTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRequestTaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询task
     * Summary: 查询task
     */
    public QueryRequestTaskResponse queryRequestTaskEx(QueryRequestTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.request.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRequestTaskResponse());
    }

    /**
     * Description: 查询任务日志
     * Summary: 查询任务日志
     */
    public QueryTaskLogResponse queryTaskLog(QueryTaskLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTaskLogEx(request, headers, runtime);
    }

    /**
     * Description: 查询任务日志
     * Summary: 查询任务日志
     */
    public QueryTaskLogResponse queryTaskLogEx(QueryTaskLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.task.log.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTaskLogResponse());
    }

    /**
     * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
     * Summary: 列出 tenant workspace
     */
    public ListTenantworkspaceResponse listTenantworkspace(ListTenantworkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTenantworkspaceEx(request, headers, runtime);
    }

    /**
     * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
     * Summary: 列出 tenant workspace
     */
    public ListTenantworkspaceResponse listTenantworkspaceEx(ListTenantworkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.tenantworkspace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTenantworkspaceResponse());
    }

    /**
     * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
     * Summary: 环境filterStatus
     */
    public QueryTenantworkspaceFilterResponse queryTenantworkspaceFilter(QueryTenantworkspaceFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTenantworkspaceFilterEx(request, headers, runtime);
    }

    /**
     * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
     * Summary: 环境filterStatus
     */
    public QueryTenantworkspaceFilterResponse queryTenantworkspaceFilterEx(QueryTenantworkspaceFilterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.tenantworkspace.filter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTenantworkspaceFilterResponse());
    }

    /**
     * Description: group by region列表
     * Summary: group by region列表
     */
    public ListRegionGroupbyResponse listRegionGroupby(ListRegionGroupbyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionGroupbyEx(request, headers, runtime);
    }

    /**
     * Description: group by region列表
     * Summary: group by region列表
     */
    public ListRegionGroupbyResponse listRegionGroupbyEx(ListRegionGroupbyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.region.groupby.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRegionGroupbyResponse());
    }

    /**
     * Description: 查询任务最后的步骤
     * Summary: 查询任务最后的步骤
     */
    public QueryRequestFinaltaskResponse queryRequestFinaltask(QueryRequestFinaltaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRequestFinaltaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询任务最后的步骤
     * Summary: 查询任务最后的步骤
     */
    public QueryRequestFinaltaskResponse queryRequestFinaltaskEx(QueryRequestFinaltaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.request.finaltask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRequestFinaltaskResponse());
    }

    /**
     * Description: 查询当前支持的功能
     * Summary: 查询当前支持的功能
     */
    public QueryFeatureResponse queryFeature(QueryFeatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFeatureEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前支持的功能
     * Summary: 查询当前支持的功能
     */
    public QueryFeatureResponse queryFeatureEx(QueryFeatureRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.feature.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFeatureResponse());
    }

    /**
     * Description: start computer
     * Summary: start computer
     */
    public StartComputerResponse startComputer(StartComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startComputerEx(request, headers, runtime);
    }

    /**
     * Description: start computer
     * Summary: start computer
     */
    public StartComputerResponse startComputerEx(StartComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartComputerResponse());
    }

    /**
     * Description: 开启lb
     * Summary: 开启lb
     */
    public StartLoadbalanceResponse startLoadbalance(StartLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 开启lb
     * Summary: 开启lb
     */
    public StartLoadbalanceResponse startLoadbalanceEx(StartLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartLoadbalanceResponse());
    }

    /**
     * Description: 停止lb
     * Summary: 停止lb
     */
    public StopLoadbalanceResponse stopLoadbalance(StopLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 停止lb
     * Summary: 停止lb
     */
    public StopLoadbalanceResponse stopLoadbalanceEx(StopLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopLoadbalanceResponse());
    }

    /**
     * Description: 更新lb信息
     * Summary: 更新lb信息
     */
    public UpdateLoadbalanceResponse updateLoadbalance(UpdateLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 更新lb信息
     * Summary: 更新lb信息
     */
    public UpdateLoadbalanceResponse updateLoadbalanceEx(UpdateLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLoadbalanceResponse());
    }

    /**
     * Description: 把LB分配给应用
     * Summary: 把LB分配给应用
     */
    public AddLoadbalanceAssignResponse addLoadbalanceAssign(AddLoadbalanceAssignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addLoadbalanceAssignEx(request, headers, runtime);
    }

    /**
     * Description: 把LB分配给应用
     * Summary: 把LB分配给应用
     */
    public AddLoadbalanceAssignResponse addLoadbalanceAssignEx(AddLoadbalanceAssignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.assign.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddLoadbalanceAssignResponse());
    }

    /**
     * Description: 证书查询
     * Summary: 证书查询
     */
    public QueryCertificateResponse queryCertificate(QueryCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 证书查询
     * Summary: 证书查询
     */
    public QueryCertificateResponse queryCertificateEx(QueryCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertificateResponse());
    }

    /**
     * Description: 创建证书
     * Summary: 创建证书
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 创建证书
     * Summary: 创建证书
     */
    public CreateCertificateResponse createCertificateEx(CreateCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.certificate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCertificateResponse());
    }

    /**
     * Description: 删除证书
     * Summary: 删除证书
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 删除证书
     * Summary: 删除证书
     */
    public DeleteCertificateResponse deleteCertificateEx(DeleteCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.certificate.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCertificateResponse());
    }

    /**
     * Description: 查询已创建的VPC
     * Summary: 查询已创建的VPC
     */
    public DescribeUnifiedresourceVpcResponse describeUnifiedresourceVpc(DescribeUnifiedresourceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUnifiedresourceVpcEx(request, headers, runtime);
    }

    /**
     * Description: 查询已创建的VPC
     * Summary: 查询已创建的VPC
     */
    public DescribeUnifiedresourceVpcResponse describeUnifiedresourceVpcEx(DescribeUnifiedresourceVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.unifiedresource.vpc.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeUnifiedresourceVpcResponse());
    }

    /**
     * Description: 查询实例规格族列表
     * Summary: 查询实例规格族列表
     */
    public ListUnifiedresourceInstancefamiliesResponse listUnifiedresourceInstancefamilies(ListUnifiedresourceInstancefamiliesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUnifiedresourceInstancefamiliesEx(request, headers, runtime);
    }

    /**
     * Description: 查询实例规格族列表
     * Summary: 查询实例规格族列表
     */
    public ListUnifiedresourceInstancefamiliesResponse listUnifiedresourceInstancefamiliesEx(ListUnifiedresourceInstancefamiliesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.unifiedresource.instancefamilies.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUnifiedresourceInstancefamiliesResponse());
    }

    /**
     * Description: 查询所有实例规格详细信息
     * Summary: 查询实例规格资源
     */
    public ListUnifiedresourceInstancetypeResponse listUnifiedresourceInstancetype(ListUnifiedresourceInstancetypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUnifiedresourceInstancetypeEx(request, headers, runtime);
    }

    /**
     * Description: 查询所有实例规格详细信息
     * Summary: 查询实例规格资源
     */
    public ListUnifiedresourceInstancetypeResponse listUnifiedresourceInstancetypeEx(ListUnifiedresourceInstancetypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.unifiedresource.instancetype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUnifiedresourceInstancetypeResponse());
    }

    /**
     * Description: query cas computer detail info by id
     * Summary: 获取单个computer的详细信息
     */
    public QueryComputerResponse queryComputer(QueryComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComputerEx(request, headers, runtime);
    }

    /**
     * Description: query cas computer detail info by id
     * Summary: 获取单个computer的详细信息
     */
    public QueryComputerResponse queryComputerEx(QueryComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComputerResponse());
    }

    /**
     * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
     * Summary: 查询可用实例类型
     */
    public ListResourceComputertypeResponse listResourceComputertype(ListResourceComputertypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceComputertypeEx(request, headers, runtime);
    }

    /**
     * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
     * Summary: 查询可用实例类型
     */
    public ListResourceComputertypeResponse listResourceComputertypeEx(ListResourceComputertypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computertype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListResourceComputertypeResponse());
    }

    /**
     * Description: 查询ecs disk 列表
     * Summary: 查询ecs disk info
     */
    public ListResourceDiskResponse listResourceDisk(ListResourceDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceDiskEx(request, headers, runtime);
    }

    /**
     * Description: 查询ecs disk 列表
     * Summary: 查询ecs disk info
     */
    public ListResourceDiskResponse listResourceDiskEx(ListResourceDiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.disk.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListResourceDiskResponse());
    }

    /**
     * Description: 查询云服务器规格族列表
     * Summary: 查询云服务器规格族列表
     */
    public ListResourceComputertypefamilyResponse listResourceComputertypefamily(ListResourceComputertypefamilyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceComputertypefamilyEx(request, headers, runtime);
    }

    /**
     * Description: 查询云服务器规格族列表
     * Summary: 查询云服务器规格族列表
     */
    public ListResourceComputertypefamilyResponse listResourceComputertypefamilyEx(ListResourceComputertypefamilyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.computertypefamily.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListResourceComputertypefamilyResponse());
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息
     */
    public ListUnifiedresourceVswitchResponse listUnifiedresourceVswitch(ListUnifiedresourceVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUnifiedresourceVswitchEx(request, headers, runtime);
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息
     */
    public ListUnifiedresourceVswitchResponse listUnifiedresourceVswitchEx(ListUnifiedresourceVswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.unifiedresource.vswitch.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUnifiedresourceVswitchResponse());
    }

    /**
     * Description: 查询当前region的vpc列表
     * Summary: 查询region vpc列表
     */
    public ListUnifiedresourceVpcResponse listUnifiedresourceVpc(ListUnifiedresourceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUnifiedresourceVpcEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前region的vpc列表
     * Summary: 查询region vpc列表
     */
    public ListUnifiedresourceVpcResponse listUnifiedresourceVpcEx(ListUnifiedresourceVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.unifiedresource.vpc.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUnifiedresourceVpcResponse());
    }

    /**
     * Description: 导入vpc到workspace
     * Summary: 导入vpc
     */
    public ImportResourceVpcResponse importResourceVpc(ImportResourceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importResourceVpcEx(request, headers, runtime);
    }

    /**
     * Description: 导入vpc到workspace
     * Summary: 导入vpc
     */
    public ImportResourceVpcResponse importResourceVpcEx(ImportResourceVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.vpc.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportResourceVpcResponse());
    }

    /**
     * Description: 删除安全组规则
     * Summary: 删除安全组规则
     */
    public DeleteResourceRuleResponse deleteResourceRule(DeleteResourceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceRuleEx(request, headers, runtime);
    }

    /**
     * Description: 删除安全组规则
     * Summary: 删除安全组规则
     */
    public DeleteResourceRuleResponse deleteResourceRuleEx(DeleteResourceRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resource.rule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteResourceRuleResponse());
    }

    /**
     * Description: 查询路由表条目列表
     * Summary: 查询路由表条目列表
     */
    public ListRouteEntryResponse listRouteEntry(ListRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRouteEntryEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由表条目列表
     * Summary: 查询路由表条目列表
     */
    public ListRouteEntryResponse listRouteEntryEx(ListRouteEntryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.route.entry.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRouteEntryResponse());
    }

    /**
     * Description: 查询可用disk资源详细信息
     * Summary: 查询可用disk资源详细信息
     */
    public ListAvailableDiskResponse listAvailableDisk(ListAvailableDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableDiskEx(request, headers, runtime);
    }

    /**
     * Description: 查询可用disk资源详细信息
     * Summary: 查询可用disk资源详细信息
     */
    public ListAvailableDiskResponse listAvailableDiskEx(ListAvailableDiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.available.disk.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAvailableDiskResponse());
    }

    /**
     * Description: 查询可用实例类型信息
     * Summary: 查询可用实例类型信息
     */
    public ListAvailableInstancetypeResponse listAvailableInstancetype(ListAvailableInstancetypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableInstancetypeEx(request, headers, runtime);
    }

    /**
     * Description: 查询可用实例类型信息
     * Summary: 查询可用实例类型信息
     */
    public ListAvailableInstancetypeResponse listAvailableInstancetypeEx(ListAvailableInstancetypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.available.instancetype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAvailableInstancetypeResponse());
    }

    /**
     * Description: 查询node meta数据
     * Summary: 查询node meta数据
     */
    public QueryResourcemetaNodeResponse queryResourcemetaNode(QueryResourcemetaNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourcemetaNodeEx(request, headers, runtime);
    }

    /**
     * Description: 查询node meta数据
     * Summary: 查询node meta数据
     */
    public QueryResourcemetaNodeResponse queryResourcemetaNodeEx(QueryResourcemetaNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resourcemeta.node.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourcemetaNodeResponse());
    }

    /**
     * Description: 查询应用服务meta数据
     * Summary: 查询应用服务meta数据
     */
    public QueryResourcemetaAppserviceResponse queryResourcemetaAppservice(QueryResourcemetaAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourcemetaAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用服务meta数据
     * Summary: 查询应用服务meta数据
     */
    public QueryResourcemetaAppserviceResponse queryResourcemetaAppserviceEx(QueryResourcemetaAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.resourcemeta.appservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourcemetaAppserviceResponse());
    }

    /**
     * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
     * Summary: 同步机器状态
     */
    public SyncComputerResponse syncComputer(SyncComputerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncComputerEx(request, headers, runtime);
    }

    /**
     * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
     * Summary: 同步机器状态
     */
    public SyncComputerResponse syncComputerEx(SyncComputerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncComputerResponse());
    }

    /**
     * Description: 同步LB状态
     * Summary: 同步LB状态
     */
    public SyncLoadbalanceResponse syncLoadbalance(SyncLoadbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncLoadbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 同步LB状态
     * Summary: 同步LB状态
     */
    public SyncLoadbalanceResponse syncLoadbalanceEx(SyncLoadbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.loadbalance.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncLoadbalanceResponse());
    }

    /**
     * Description: 更新机器基本信息
     * Summary: 更新机器基本信息
     */
    public UpdateComputerInfoResponse updateComputerInfo(UpdateComputerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComputerInfoEx(request, headers, runtime);
    }

    /**
     * Description: 更新机器基本信息
     * Summary: 更新机器基本信息
     */
    public UpdateComputerInfoResponse updateComputerInfoEx(UpdateComputerInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateComputerInfoResponse());
    }

    /**
     * Description: 将机器分配给应用
     * Summary: 将机器分配给应用
     */
    public SetComputerAssignResponse setComputerAssign(SetComputerAssignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setComputerAssignEx(request, headers, runtime);
    }

    /**
     * Description: 将机器分配给应用
     * Summary: 将机器分配给应用
     */
    public SetComputerAssignResponse setComputerAssignEx(SetComputerAssignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.computer.assign.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetComputerAssignResponse());
    }

    /**
     * Description: 执行任务
     * Summary: 执行任务
     */
    public ExecRequestTaskResponse execRequestTask(ExecRequestTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRequestTaskEx(request, headers, runtime);
    }

    /**
     * Description: 执行任务
     * Summary: 执行任务
     */
    public ExecRequestTaskResponse execRequestTaskEx(ExecRequestTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.request.task.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRequestTaskResponse());
    }

    /**
     * Description: 重新初始化机器
     * Summary: 重新初始化机器
     */
    public ReinitDiskResponse reinitDisk(ReinitDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitDiskEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化机器
     * Summary: 重新初始化机器
     */
    public ReinitDiskResponse reinitDiskEx(ReinitDiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.disk.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitDiskResponse());
    }

    /**
     * Description: 修改磁盘策略
     * Summary: 修改磁盘策略
     */
    public UpdateDiskStrategyResponse updateDiskStrategy(UpdateDiskStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDiskStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 修改磁盘策略
     * Summary: 修改磁盘策略
     */
    public UpdateDiskStrategyResponse updateDiskStrategyEx(UpdateDiskStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cas.disk.strategy.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDiskStrategyResponse());
    }
}
