// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ldc.models.*;
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
                    new TeaPair("sdk_version", "1.12.83"),
                    new TeaPair("_prod_code", "ldc"),
                    new TeaPair("_prod_channel", "undefined")
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
     * Description: 关联单元化应用服务实例
     * Summary: 关联单元化应用服务实例
     */
    public BindAppserviceResponse bindAppservice(BindAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 关联单元化应用服务实例
     * Summary: 关联单元化应用服务实例
     */
    public BindAppserviceResponse bindAppserviceEx(BindAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appservice.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAppserviceResponse());
    }

    /**
     * Description: 解除关联的单元化应用服务实例
     * Summary: 解除关联的单元化应用服务实例
     */
    public UnbindAppserviceResponse unbindAppservice(UnbindAppserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindAppserviceEx(request, headers, runtime);
    }

    /**
     * Description: 解除关联的单元化应用服务实例
     * Summary: 解除关联的单元化应用服务实例
     */
    public UnbindAppserviceResponse unbindAppserviceEx(UnbindAppserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appservice.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindAppserviceResponse());
    }

    /**
     * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
     * Summary: 创建一个应用运维单
     */
    public CreateAppopsResponse createAppops(CreateAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
     * Summary: 创建一个应用运维单
     */
    public CreateAppopsResponse createAppopsEx(CreateAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAppopsResponse());
    }

    /**
     * Description: 查询一个已经创建成功的部署操作
     * Summary: 查询一个已经创建成功的部署操作。
     */
    public GetAppopsResponse getAppops(GetAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个已经创建成功的部署操作
     * Summary: 查询一个已经创建成功的部署操作。
     */
    public GetAppopsResponse getAppopsEx(GetAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppopsResponse());
    }

    /**
     * Description: 查询一个运维操作中某个应用的详情
     * Summary: 查询一个运维操作中某个应用的详情
     */
    public GetAppopsApplicationResponse getAppopsApplication(GetAppopsApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppopsApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个运维操作中某个应用的详情
     * Summary: 查询一个运维操作中某个应用的详情
     */
    public GetAppopsApplicationResponse getAppopsApplicationEx(GetAppopsApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.application.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAppopsApplicationResponse());
    }

    /**
     * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始执行一个已经创建成功的运维操作。
     */
    public StartAppopsResponse startAppops(StartAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始执行一个已经创建成功的运维操作。
     */
    public StartAppopsResponse startAppopsEx(StartAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAppopsResponse());
    }

    /**
     * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化一个初始化失败的运维单。
     */
    public ReinitAppopsResponse reinitAppops(ReinitAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化一个初始化失败的运维单。
     */
    public ReinitAppopsResponse reinitAppopsEx(ReinitAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitAppopsResponse());
    }

    /**
     * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
     * Summary: 对一个运维单执行取消操作。
     */
    public CancelAppopsResponse cancelAppops(CancelAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
     * Summary: 对一个运维单执行取消操作。
     */
    public CancelAppopsResponse cancelAppopsEx(CancelAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAppopsResponse());
    }

    /**
     * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
     * Summary: 重试运维
     */
    public RetryAppopsResponse retryAppops(RetryAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
     * Summary: 重试运维
     */
    public RetryAppopsResponse retryAppopsEx(RetryAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryAppopsResponse());
    }

    /**
     * Description: 查询发布单
     * Summary: 查询发布单
     */
    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 查询发布单
     * Summary: 查询发布单
     */
    public GetDeploymentResponse getDeploymentEx(GetDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeploymentResponse());
    }

    /**
     * Description: 查询部署单中某个应用的详情
     * Summary: 查询部署单中某个应用的详情
     */
    public GetDeploymentApplicationResponse getDeploymentApplication(GetDeploymentApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeploymentApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单中某个应用的详情
     * Summary: 查询部署单中某个应用的详情
     */
    public GetDeploymentApplicationResponse getDeploymentApplicationEx(GetDeploymentApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.application.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeploymentApplicationResponse());
    }

    /**
     * Description: 查询部署单中某个应用的回滚详情
     * Summary: 查询部署单中某个应用的回滚详情
     */
    public GetDeploymentRollbackResponse getDeploymentRollback(GetDeploymentRollbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeploymentRollbackEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单中某个应用的回滚详情
     * Summary: 查询部署单中某个应用的回滚详情
     */
    public GetDeploymentRollbackResponse getDeploymentRollbackEx(GetDeploymentRollbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.rollback.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeploymentRollbackResponse());
    }

    /**
     * Description: 查询可回滚的版本信息
     * Summary: 查询可回滚的版本信息
     */
    public QueryDeploymentRollbackableResponse queryDeploymentRollbackable(QueryDeploymentRollbackableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeploymentRollbackableEx(request, headers, runtime);
    }

    /**
     * Description: 查询可回滚的版本信息
     * Summary: 查询可回滚的版本信息
     */
    public QueryDeploymentRollbackableResponse queryDeploymentRollbackableEx(QueryDeploymentRollbackableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.rollbackable.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeploymentRollbackableResponse());
    }

    /**
     * Description: 回滚指定的应用
     * Summary: 回滚指定的应用
     */
    public RollbackDeploymentApplicationResponse rollbackDeploymentApplication(RollbackDeploymentApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackDeploymentApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 回滚指定的应用
     * Summary: 回滚指定的应用
     */
    public RollbackDeploymentApplicationResponse rollbackDeploymentApplicationEx(RollbackDeploymentApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.application.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackDeploymentApplicationResponse());
    }

    /**
     * Description: 推送 LDC 流量规则
     * Summary: 推送 LDC 流量规则
     */
    public PushFlowRouteclientResponse pushFlowRouteclient(PushFlowRouteclientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushFlowRouteclientEx(request, headers, runtime);
    }

    /**
     * Description: 推送 LDC 流量规则
     * Summary: 推送 LDC 流量规则
     */
    public PushFlowRouteclientResponse pushFlowRouteclientEx(PushFlowRouteclientRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.routeclient.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushFlowRouteclientResponse());
    }

    /**
     * Description: fedNamespace创建
     * Summary: FedNamespace创建
     */
    public CreateFederationNamespaceResponse createFederationNamespace(CreateFederationNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFederationNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: fedNamespace创建
     * Summary: FedNamespace创建
     */
    public CreateFederationNamespaceResponse createFederationNamespaceEx(CreateFederationNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.namespace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFederationNamespaceResponse());
    }

    /**
     * Description: FedNamespace更新API
     * Summary: FedNamespace更新
     */
    public UpdateFederationNamespaceResponse updateFederationNamespace(UpdateFederationNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFederationNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: FedNamespace更新API
     * Summary: FedNamespace更新
     */
    public UpdateFederationNamespaceResponse updateFederationNamespaceEx(UpdateFederationNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.namespace.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFederationNamespaceResponse());
    }

    /**
     * Description: 获取单个FedNamespace 
     * Summary: FedNamespace get
     */
    public GetFederationNamespaceResponse getFederationNamespace(GetFederationNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFederationNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个FedNamespace 
     * Summary: FedNamespace get
     */
    public GetFederationNamespaceResponse getFederationNamespaceEx(GetFederationNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.namespace.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFederationNamespaceResponse());
    }

    /**
     * Description: FedNamespace 删除
     * Summary: FedNamespace 删除
     */
    public DeleteFederationNamespaceResponse deleteFederationNamespace(DeleteFederationNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFederationNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: FedNamespace 删除
     * Summary: FedNamespace 删除
     */
    public DeleteFederationNamespaceResponse deleteFederationNamespaceEx(DeleteFederationNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.namespace.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFederationNamespaceResponse());
    }

    /**
     * Description: 创建FedConfigMap
     * Summary: 创建FedConfigMap
     */
    public CreateFederationConfigmapResponse createFederationConfigmap(CreateFederationConfigmapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFederationConfigmapEx(request, headers, runtime);
    }

    /**
     * Description: 创建FedConfigMap
     * Summary: 创建FedConfigMap
     */
    public CreateFederationConfigmapResponse createFederationConfigmapEx(CreateFederationConfigmapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.configmap.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFederationConfigmapResponse());
    }

    /**
     * Description: FedConfigMap更新
     * Summary: FedConfigMap更新
     */
    public UpdateFederationConfigmapResponse updateFederationConfigmap(UpdateFederationConfigmapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFederationConfigmapEx(request, headers, runtime);
    }

    /**
     * Description: FedConfigMap更新
     * Summary: FedConfigMap更新
     */
    public UpdateFederationConfigmapResponse updateFederationConfigmapEx(UpdateFederationConfigmapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.configmap.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFederationConfigmapResponse());
    }

    /**
     * Description: FedConfigMap Get
     * Summary: FedConfigMap Get
     */
    public GetFederationConfigmapResponse getFederationConfigmap(GetFederationConfigmapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFederationConfigmapEx(request, headers, runtime);
    }

    /**
     * Description: FedConfigMap Get
     * Summary: FedConfigMap Get
     */
    public GetFederationConfigmapResponse getFederationConfigmapEx(GetFederationConfigmapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.configmap.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFederationConfigmapResponse());
    }

    /**
     * Description: FedConfigMap 删除
     * Summary: FedConfigMap 删除
     */
    public DeleteFederationConfigmapResponse deleteFederationConfigmap(DeleteFederationConfigmapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFederationConfigmapEx(request, headers, runtime);
    }

    /**
     * Description: FedConfigMap 删除
     * Summary: FedConfigMap 删除
     */
    public DeleteFederationConfigmapResponse deleteFederationConfigmapEx(DeleteFederationConfigmapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.configmap.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFederationConfigmapResponse());
    }

    /**
     * Description: FedConfigMap List
     * Summary: FedConfigMap List
     */
    public ListFederationConfigmapResponse listFederationConfigmap(ListFederationConfigmapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFederationConfigmapEx(request, headers, runtime);
    }

    /**
     * Description: FedConfigMap List
     * Summary: FedConfigMap List
     */
    public ListFederationConfigmapResponse listFederationConfigmapEx(ListFederationConfigmapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.configmap.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFederationConfigmapResponse());
    }

    /**
     * Description: List FeNamespace 
     * Summary: List FeNamespace 
     */
    public ListFederationNamespaceResponse listFederationNamespace(ListFederationNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFederationNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: List FeNamespace 
     * Summary: List FeNamespace 
     */
    public ListFederationNamespaceResponse listFederationNamespaceEx(ListFederationNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.namespace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFederationNamespaceResponse());
    }

    /**
     * Description: 查询容器应用服务OpenAPI
     * Summary: 查询容器应用服务
     */
    public QueryContainerserviceResponse queryContainerservice(QueryContainerserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContainerserviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询容器应用服务OpenAPI
     * Summary: 查询容器应用服务
     */
    public QueryContainerserviceResponse queryContainerserviceEx(QueryContainerserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContainerserviceResponse());
    }

    /**
     * Description: get master clusters for each zone
     * Summary: getMasterClusters
     */
    public ListMulticlusterMasterclusterResponse listMulticlusterMastercluster(ListMulticlusterMasterclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMulticlusterMasterclusterEx(request, headers, runtime);
    }

    /**
     * Description: get master clusters for each zone
     * Summary: getMasterClusters
     */
    public ListMulticlusterMasterclusterResponse listMulticlusterMasterclusterEx(ListMulticlusterMasterclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.multicluster.mastercluster.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMulticlusterMasterclusterResponse());
    }

    /**
     * Description: import master clusters
     * Summary: importMasterCluster
     */
    public InitMulticlusterClusterResponse initMulticlusterCluster(InitMulticlusterClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initMulticlusterClusterEx(request, headers, runtime);
    }

    /**
     * Description: import master clusters
     * Summary: importMasterCluster
     */
    public InitMulticlusterClusterResponse initMulticlusterClusterEx(InitMulticlusterClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.multicluster.cluster.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitMulticlusterClusterResponse());
    }

    /**
     * Description: list multi clusters
     * Summary: list MultiCluster
     */
    public ListMulticlusterResponse listMulticluster(ListMulticlusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMulticlusterEx(request, headers, runtime);
    }

    /**
     * Description: list multi clusters
     * Summary: list MultiCluster
     */
    public ListMulticlusterResponse listMulticlusterEx(ListMulticlusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.multicluster.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMulticlusterResponse());
    }

    /**
     * Description: 删除容器应用服务
     * Summary: 删除容器应用服务
     */
    public DeleteContainerserviceResponse deleteContainerservice(DeleteContainerserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContainerserviceEx(request, headers, runtime);
    }

    /**
     * Description: 删除容器应用服务
     * Summary: 删除容器应用服务
     */
    public DeleteContainerserviceResponse deleteContainerserviceEx(DeleteContainerserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContainerserviceResponse());
    }

    /**
     * Description: 创建一个部署单
     * Summary: 创建一个部署单
     */
    public CreateContainerserviceDeploymentResponse createContainerserviceDeployment(CreateContainerserviceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContainerserviceDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个部署单
     * Summary: 创建一个部署单
     */
    public CreateContainerserviceDeploymentResponse createContainerserviceDeploymentEx(CreateContainerserviceDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.deployment.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContainerserviceDeploymentResponse());
    }

    /**
     * Description: 创建FedSecret
     * Summary: 创建FedSecret
     */
    public CreateFederationSecretResponse createFederationSecret(CreateFederationSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFederationSecretEx(request, headers, runtime);
    }

    /**
     * Description: 创建FedSecret
     * Summary: 创建FedSecret
     */
    public CreateFederationSecretResponse createFederationSecretEx(CreateFederationSecretRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.secret.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFederationSecretResponse());
    }

    /**
     * Description: FedSecret Get
     * Summary: FedSecret Get
     */
    public GetFederationSecretResponse getFederationSecret(GetFederationSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFederationSecretEx(request, headers, runtime);
    }

    /**
     * Description: FedSecret Get
     * Summary: FedSecret Get
     */
    public GetFederationSecretResponse getFederationSecretEx(GetFederationSecretRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.secret.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFederationSecretResponse());
    }

    /**
     * Description: FedSecret 删除
     * Summary: FedSecret 删除
     */
    public DeleteFederationSecretResponse deleteFederationSecret(DeleteFederationSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFederationSecretEx(request, headers, runtime);
    }

    /**
     * Description: FedSecret 删除
     * Summary: FedSecret 删除
     */
    public DeleteFederationSecretResponse deleteFederationSecretEx(DeleteFederationSecretRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.secret.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFederationSecretResponse());
    }

    /**
     * Description: FedSecret 更新
     * Summary: FedSecret 更新
     */
    public UpdateFederationSecretResponse updateFederationSecret(UpdateFederationSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFederationSecretEx(request, headers, runtime);
    }

    /**
     * Description: FedSecret 更新
     * Summary: FedSecret 更新
     */
    public UpdateFederationSecretResponse updateFederationSecretEx(UpdateFederationSecretRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.secret.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFederationSecretResponse());
    }

    /**
     * Description: FedSecret List
     * Summary: FedSecret List
     */
    public ListFederationSecretResponse listFederationSecret(ListFederationSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFederationSecretEx(request, headers, runtime);
    }

    /**
     * Description: FedSecret List
     * Summary: FedSecret List
     */
    public ListFederationSecretResponse listFederationSecretEx(ListFederationSecretRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.secret.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFederationSecretResponse());
    }

    /**
     * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
    调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
     * Summary: 获取容器服务最新发布的版本
     */
    public DescribeContainerserviceRevisionResponse describeContainerserviceRevision(DescribeContainerserviceRevisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeContainerserviceRevisionEx(request, headers, runtime);
    }

    /**
     * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
    调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
     * Summary: 获取容器服务最新发布的版本
     */
    public DescribeContainerserviceRevisionResponse describeContainerserviceRevisionEx(DescribeContainerserviceRevisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.revision.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeContainerserviceRevisionResponse());
    }

    /**
     * Description: 获取某一个版本的配置信息
     * Summary: 获取某一个版本的配置信息
     */
    public GetContainerserviceRevisionResponse getContainerserviceRevision(GetContainerserviceRevisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContainerserviceRevisionEx(request, headers, runtime);
    }

    /**
     * Description: 获取某一个版本的配置信息
     * Summary: 获取某一个版本的配置信息
     */
    public GetContainerserviceRevisionResponse getContainerserviceRevisionEx(GetContainerserviceRevisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.revision.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContainerserviceRevisionResponse());
    }

    /**
     * Description: 查询容器服务版本列表
     * Summary: 查询容器服务版本列表
     */
    public QueryContainerserviceRevisionResponse queryContainerserviceRevision(QueryContainerserviceRevisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContainerserviceRevisionEx(request, headers, runtime);
    }

    /**
     * Description: 查询容器服务版本列表
     * Summary: 查询容器服务版本列表
     */
    public QueryContainerserviceRevisionResponse queryContainerserviceRevisionEx(QueryContainerserviceRevisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.revision.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContainerserviceRevisionResponse());
    }

    /**
     * Description: 为某一版本加上备注
     * Summary: 为某一版本加上备注
     */
    public UpdateContainerserviceRevisionResponse updateContainerserviceRevision(UpdateContainerserviceRevisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceRevisionEx(request, headers, runtime);
    }

    /**
     * Description: 为某一版本加上备注
     * Summary: 为某一版本加上备注
     */
    public UpdateContainerserviceRevisionResponse updateContainerserviceRevisionEx(UpdateContainerserviceRevisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.revision.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceRevisionResponse());
    }

    /**
     * Description: 快速更新镜像
     * Summary: 快速更新镜像
     */
    public UpdateContainerserviceImageResponse updateContainerserviceImage(UpdateContainerserviceImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceImageEx(request, headers, runtime);
    }

    /**
     * Description: 快速更新镜像
     * Summary: 快速更新镜像
     */
    public UpdateContainerserviceImageResponse updateContainerserviceImageEx(UpdateContainerserviceImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.image.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceImageResponse());
    }

    /**
     * Description: 快速更新容器服务副本数
     * Summary: 快速更新容器服务副本数
     */
    public UpdateContainerserviceReplicasResponse updateContainerserviceReplicas(UpdateContainerserviceReplicasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceReplicasEx(request, headers, runtime);
    }

    /**
     * Description: 快速更新容器服务副本数
     * Summary: 快速更新容器服务副本数
     */
    public UpdateContainerserviceReplicasResponse updateContainerserviceReplicasEx(UpdateContainerserviceReplicasRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.replicas.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceReplicasResponse());
    }

    /**
     * Description: 创建容器应用服务。
     * Summary: 创建容器应用服务
     */
    public CreateContainerserviceResponse createContainerservice(CreateContainerserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContainerserviceEx(request, headers, runtime);
    }

    /**
     * Description: 创建容器应用服务。
     * Summary: 创建容器应用服务
     */
    public CreateContainerserviceResponse createContainerserviceEx(CreateContainerserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContainerserviceResponse());
    }

    /**
     * Description: 保存容器服务草稿。
     * Summary: 保存容器服务草稿
     */
    public SaveContainerserviceRevisionResponse saveContainerserviceRevision(SaveContainerserviceRevisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveContainerserviceRevisionEx(request, headers, runtime);
    }

    /**
     * Description: 保存容器服务草稿。
     * Summary: 保存容器服务草稿
     */
    public SaveContainerserviceRevisionResponse saveContainerserviceRevisionEx(SaveContainerserviceRevisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.revision.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveContainerserviceRevisionResponse());
    }

    /**
     * Description: container service 更新
     * Summary: container service 更新
     */
    public UpdateContainerserviceResponse updateContainerservice(UpdateContainerserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceEx(request, headers, runtime);
    }

    /**
     * Description: container service 更新
     * Summary: container service 更新
     */
    public UpdateContainerserviceResponse updateContainerserviceEx(UpdateContainerserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceResponse());
    }

    /**
     * Description: 检查对应容器服务是否存在。
     * Summary: 检查对应容器服务是否存在
     */
    public ExistContainerserviceResponse existContainerservice(ExistContainerserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existContainerserviceEx(request, headers, runtime);
    }

    /**
     * Description: 检查对应容器服务是否存在。
     * Summary: 检查对应容器服务是否存在
     */
    public ExistContainerserviceResponse existContainerserviceEx(ExistContainerserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistContainerserviceResponse());
    }

    /**
     * Description: get cluster basic info by name
     * Summary: getClusterBasicInfo
     */
    public GetClusterBasicinfoResponse getClusterBasicinfo(GetClusterBasicinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterBasicinfoEx(request, headers, runtime);
    }

    /**
     * Description: get cluster basic info by name
     * Summary: getClusterBasicInfo
     */
    public GetClusterBasicinfoResponse getClusterBasicinfoEx(GetClusterBasicinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.basicinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetClusterBasicinfoResponse());
    }

    /**
     * Description: get cluster overview info 
     * Summary: getClusterOverview
     */
    public GetClusterOverviewinfoResponse getClusterOverviewinfo(GetClusterOverviewinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterOverviewinfoEx(request, headers, runtime);
    }

    /**
     * Description: get cluster overview info 
     * Summary: getClusterOverview
     */
    public GetClusterOverviewinfoResponse getClusterOverviewinfoEx(GetClusterOverviewinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.overviewinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetClusterOverviewinfoResponse());
    }

    /**
     * Description: 查询部署单元。
     * Summary: 查询部署单元
     */
    public QueryCellResponse queryCell(QueryCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元。
     * Summary: 查询部署单元
     */
    public QueryCellResponse queryCellEx(QueryCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCellResponse());
    }

    /**
     * Description: get pod overview infos of specific cluster
     * Summary: getPodOverviewInfo
     */
    public GetClusterPodoverviewResponse getClusterPodoverview(GetClusterPodoverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterPodoverviewEx(request, headers, runtime);
    }

    /**
     * Description: get pod overview infos of specific cluster
     * Summary: getPodOverviewInfo
     */
    public GetClusterPodoverviewResponse getClusterPodoverviewEx(GetClusterPodoverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.podoverview.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetClusterPodoverviewResponse());
    }

    /**
     * Description: list all nodes info of specific cluster
     * Summary: listNodeInfo
     */
    public ListClusterNodeinfoResponse listClusterNodeinfo(ListClusterNodeinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterNodeinfoEx(request, headers, runtime);
    }

    /**
     * Description: list all nodes info of specific cluster
     * Summary: listNodeInfo
     */
    public ListClusterNodeinfoResponse listClusterNodeinfoEx(ListClusterNodeinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.nodeinfo.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListClusterNodeinfoResponse());
    }

    /**
     * Description: create namespace of a specific cluster
     * Summary: createNamespace
     */
    public CreateClusterNamespaceResponse createClusterNamespace(CreateClusterNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: create namespace of a specific cluster
     * Summary: createNamespace
     */
    public CreateClusterNamespaceResponse createClusterNamespaceEx(CreateClusterNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.namespace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateClusterNamespaceResponse());
    }

    /**
     * Description: list namespace
     * Summary: list namespace
     */
    public ListClusterNamespaceResponse listClusterNamespace(ListClusterNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: list namespace
     * Summary: list namespace
     */
    public ListClusterNamespaceResponse listClusterNamespaceEx(ListClusterNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.namespace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListClusterNamespaceResponse());
    }

    /**
     * Description: query namespace detail info
     * Summary: query namespace 
     */
    public QueryClusterNamespaceResponse queryClusterNamespace(QueryClusterNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: query namespace detail info
     * Summary: query namespace 
     */
    public QueryClusterNamespaceResponse queryClusterNamespaceEx(QueryClusterNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.namespace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterNamespaceResponse());
    }

    /**
     * Description: delete namespace of specific cluster
     * Summary: delete namespace
     */
    public DeleteClusterNamespaceResponse deleteClusterNamespace(DeleteClusterNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: delete namespace of specific cluster
     * Summary: delete namespace
     */
    public DeleteClusterNamespaceResponse deleteClusterNamespaceEx(DeleteClusterNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.namespace.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteClusterNamespaceResponse());
    }

    /**
     * Description: get node detail info by name
     * Summary: get node detail info
     */
    public GetClusterNodeinfoResponse getClusterNodeinfo(GetClusterNodeinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterNodeinfoEx(request, headers, runtime);
    }

    /**
     * Description: get node detail info by name
     * Summary: get node detail info
     */
    public GetClusterNodeinfoResponse getClusterNodeinfoEx(GetClusterNodeinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.nodeinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetClusterNodeinfoResponse());
    }

    /**
     * Description: ImagePullSecret创建
     * Summary: ImagePullSecret创建
     */
    public CreateFederationImagepullsecretResponse createFederationImagepullsecret(CreateFederationImagepullsecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFederationImagepullsecretEx(request, headers, runtime);
    }

    /**
     * Description: ImagePullSecret创建
     * Summary: ImagePullSecret创建
     */
    public CreateFederationImagepullsecretResponse createFederationImagepullsecretEx(CreateFederationImagepullsecretRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.imagepullsecret.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFederationImagepullsecretResponse());
    }

    /**
     * Description: list all pods of specific node
     * Summary: listtPodsOfNode
     */
    public ListClusterNodepodResponse listClusterNodepod(ListClusterNodepodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterNodepodEx(request, headers, runtime);
    }

    /**
     * Description: list all pods of specific node
     * Summary: listtPodsOfNode
     */
    public ListClusterNodepodResponse listClusterNodepodEx(ListClusterNodepodRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.nodepod.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListClusterNodepodResponse());
    }

    /**
     * Description: list all events of specific node
     * Summary: listEventOfNode
     */
    public ListClusterNodeeventResponse listClusterNodeevent(ListClusterNodeeventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterNodeeventEx(request, headers, runtime);
    }

    /**
     * Description: list all events of specific node
     * Summary: listEventOfNode
     */
    public ListClusterNodeeventResponse listClusterNodeeventEx(ListClusterNodeeventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.nodeevent.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListClusterNodeeventResponse());
    }

    /**
     * Description: 分页查询发布单列表
     * Summary: 分页查询发布单列表
     */
    public QueryOpsplanResponse queryOpsplan(QueryOpsplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsplanEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询发布单列表
     * Summary: 分页查询发布单列表
     */
    public QueryOpsplanResponse queryOpsplanEx(QueryOpsplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsplanResponse());
    }

    /**
     * Description: 分页查询发布单状态概要列表
     * Summary: 分页查询发布单状态概要列表
     */
    public QueryOpsplanStatesummaryResponse queryOpsplanStatesummary(QueryOpsplanStatesummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsplanStatesummaryEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询发布单状态概要列表
     * Summary: 分页查询发布单状态概要列表
     */
    public QueryOpsplanStatesummaryResponse queryOpsplanStatesummaryEx(QueryOpsplanStatesummaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.statesummary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsplanStatesummaryResponse());
    }

    /**
     * Description: 发布/运维单详情查询
     * Summary: 发布/运维单详情查询
     */
    public QueryOpsplanDetailResponse queryOpsplanDetail(QueryOpsplanDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsplanDetailEx(request, headers, runtime);
    }

    /**
     * Description: 发布/运维单详情查询
     * Summary: 发布/运维单详情查询
     */
    public QueryOpsplanDetailResponse queryOpsplanDetailEx(QueryOpsplanDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsplanDetailResponse());
    }

    /**
     * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
     * Summary: 查询公共的以及租户内自定义技术栈分类
     */
    public QueryBuildpackTechstackResponse queryBuildpackTechstack(QueryBuildpackTechstackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackTechstackEx(request, headers, runtime);
    }

    /**
     * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
     * Summary: 查询公共的以及租户内自定义技术栈分类
     */
    public QueryBuildpackTechstackResponse queryBuildpackTechstackEx(QueryBuildpackTechstackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.buildpack.techstack.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackTechstackResponse());
    }

    /**
     * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
    e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
     * Summary: 获取云原生技术栈小版本列表信息
     */
    public QueryBuildpackNativetechstackversionResponse queryBuildpackNativetechstackversion(QueryBuildpackNativetechstackversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBuildpackNativetechstackversionEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
    e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
     * Summary: 获取云原生技术栈小版本列表信息
     */
    public QueryBuildpackNativetechstackversionResponse queryBuildpackNativetechstackversionEx(QueryBuildpackNativetechstackversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBuildpackNativetechstackversionResponse());
    }

    /**
     * Description: 更新容器应用服务的云原生技术栈版本。
    e.g: 更新为 ce44610
     * Summary: 更新容器应用服务对应的云原生技术栈版本
     */
    public UpdateContainerserviceNativebpversionResponse updateContainerserviceNativebpversion(UpdateContainerserviceNativebpversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceNativebpversionEx(request, headers, runtime);
    }

    /**
     * Description: 更新容器应用服务的云原生技术栈版本。
    e.g: 更新为 ce44610
     * Summary: 更新容器应用服务对应的云原生技术栈版本
     */
    public UpdateContainerserviceNativebpversionResponse updateContainerserviceNativebpversionEx(UpdateContainerserviceNativebpversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.nativebpversion.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceNativebpversionResponse());
    }

    /**
     * Description: 生成Dockerfile命令列表并获取
     * Summary: 获取容器服务对应的Dockerfile
     */
    public LoadContainerserviceDockerfileResponse loadContainerserviceDockerfile(LoadContainerserviceDockerfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadContainerserviceDockerfileEx(request, headers, runtime);
    }

    /**
     * Description: 生成Dockerfile命令列表并获取
     * Summary: 获取容器服务对应的Dockerfile
     */
    public LoadContainerserviceDockerfileResponse loadContainerserviceDockerfileEx(LoadContainerserviceDockerfileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.dockerfile.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadContainerserviceDockerfileResponse());
    }

    /**
     * Description: 创建云原生技术栈版本
     * Summary: 创建云原生技术栈版本
     */
    public CreateBuildpackNativetechstackversionResponse createBuildpackNativetechstackversion(CreateBuildpackNativetechstackversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBuildpackNativetechstackversionEx(request, headers, runtime);
    }

    /**
     * Description: 创建云原生技术栈版本
     * Summary: 创建云原生技术栈版本
     */
    public CreateBuildpackNativetechstackversionResponse createBuildpackNativetechstackversionEx(CreateBuildpackNativetechstackversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBuildpackNativetechstackversionResponse());
    }

    /**
     * Description: get zonelist of each workspace in a workspace group
     * Summary: getZoneListOfWSG
     */
    public ListMulticlusterZoneResponse listMulticlusterZone(ListMulticlusterZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMulticlusterZoneEx(request, headers, runtime);
    }

    /**
     * Description: get zonelist of each workspace in a workspace group
     * Summary: getZoneListOfWSG
     */
    public ListMulticlusterZoneResponse listMulticlusterZoneEx(ListMulticlusterZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.multicluster.zone.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMulticlusterZoneResponse());
    }

    /**
     * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
     * Summary: 发布/运维单发布任务操作
     */
    public ExecOpsplanAppopstaskResponse execOpsplanAppopstask(ExecOpsplanAppopstaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execOpsplanAppopstaskEx(request, headers, runtime);
    }

    /**
     * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
     * Summary: 发布/运维单发布任务操作
     */
    public ExecOpsplanAppopstaskResponse execOpsplanAppopstaskEx(ExecOpsplanAppopstaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.appopstask.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecOpsplanAppopstaskResponse());
    }

    /**
     * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
     * Summary: 发布单进度查询
     */
    public QueryOpsplanProgressResponse queryOpsplanProgress(QueryOpsplanProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsplanProgressEx(request, headers, runtime);
    }

    /**
     * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
     * Summary: 发布单进度查询
     */
    public QueryOpsplanProgressResponse queryOpsplanProgressEx(QueryOpsplanProgressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.progress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsplanProgressResponse());
    }

    /**
     * Description: 发布(运维)单应进度查询
     * Summary: 发布(运维)单应进度查询
     */
    public QueryOpsplanAppprogressResponse queryOpsplanAppprogress(QueryOpsplanAppprogressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpsplanAppprogressEx(request, headers, runtime);
    }

    /**
     * Description: 发布(运维)单应进度查询
     * Summary: 发布(运维)单应进度查询
     */
    public QueryOpsplanAppprogressResponse queryOpsplanAppprogressEx(QueryOpsplanAppprogressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.appprogress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpsplanAppprogressResponse());
    }

    /**
     * Description: 容器服务pod列表
     * Summary: 容器服务pod列表
     */
    public ListContainerservicePodResponse listContainerservicePod(ListContainerservicePodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContainerservicePodEx(request, headers, runtime);
    }

    /**
     * Description: 容器服务pod列表
     * Summary: 容器服务pod列表
     */
    public ListContainerservicePodResponse listContainerservicePodEx(ListContainerservicePodRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.pod.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContainerservicePodResponse());
    }

    /**
     * Description: To list kubeevents
     * Summary: To list kubeevents
     */
    public ListContainerserviceKubeeventsResponse listContainerserviceKubeevents(ListContainerserviceKubeeventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContainerserviceKubeeventsEx(request, headers, runtime);
    }

    /**
     * Description: To list kubeevents
     * Summary: To list kubeevents
     */
    public ListContainerserviceKubeeventsResponse listContainerserviceKubeeventsEx(ListContainerserviceKubeeventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.kubeevents.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContainerserviceKubeeventsResponse());
    }

    /**
     * Description: 查询Pod事件列表
     * Summary: 查询Pod事件列表
     */
    public ListPodEventsResponse listPodEvents(ListPodEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPodEventsEx(request, headers, runtime);
    }

    /**
     * Description: 查询Pod事件列表
     * Summary: 查询Pod事件列表
     */
    public ListPodEventsResponse listPodEventsEx(ListPodEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.pod.events.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListPodEventsResponse());
    }

    /**
     * Description: 查询Pod事件列表
     * Summary: 查询Pod容器列表
     */
    public ListPodContainersResponse listPodContainers(ListPodContainersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPodContainersEx(request, headers, runtime);
    }

    /**
     * Description: 查询Pod事件列表
     * Summary: 查询Pod容器列表
     */
    public ListPodContainersResponse listPodContainersEx(ListPodContainersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.pod.containers.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListPodContainersResponse());
    }

    /**
     * Description: query replica cell
     * Summary: query replica cell
     */
    public QueryContainerserviceCellResponse queryContainerserviceCell(QueryContainerserviceCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContainerserviceCellEx(request, headers, runtime);
    }

    /**
     * Description: query replica cell
     * Summary: query replica cell
     */
    public QueryContainerserviceCellResponse queryContainerserviceCellEx(QueryContainerserviceCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContainerserviceCellResponse());
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
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cellgroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCellgroupResponse());
    }

    /**
     * Description: 获取cellgroup列表
     * Summary: 获取cellgroup列表
     */
    public ListCellgroupResponse listCellgroup(ListCellgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCellgroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取cellgroup列表
     * Summary: 获取cellgroup列表
     */
    public ListCellgroupResponse listCellgroupEx(ListCellgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cellgroup.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCellgroupResponse());
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
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cellgroup.disasterinfo.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCellgroupDisasterinfoResponse());
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
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cellgroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCellgroupResponse());
    }

    /**
     * Description: 查询部署单元列表
     * Summary: 查询部署单元列表
     */
    public ListCellResponse listCell(ListCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元列表
     * Summary: 查询部署单元列表
     */
    public ListCellResponse listCellEx(ListCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cell.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCellResponse());
    }

    /**
     * Description: 创建部署单元。
     * Summary: 创建部署单元
     */
    public CreateCellResponse createCell(CreateCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCellEx(request, headers, runtime);
    }

    /**
     * Description: 创建部署单元。
     * Summary: 创建部署单元
     */
    public CreateCellResponse createCellEx(CreateCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cell.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCellResponse());
    }

    /**
     * Description: 删除部署单元。
     * Summary: 删除部署单元
     */
    public DeleteCellResponse deleteCell(DeleteCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCellEx(request, headers, runtime);
    }

    /**
     * Description: 删除部署单元。
     * Summary: 删除部署单元
     */
    public DeleteCellResponse deleteCellEx(DeleteCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cell.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCellResponse());
    }

    /**
     * Description: 删除pod
     * Summary: 删除pod
     */
    public DeletePodResponse deletePod(DeletePodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePodEx(request, headers, runtime);
    }

    /**
     * Description: 删除pod
     * Summary: 删除pod
     */
    public DeletePodResponse deletePodEx(DeletePodRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.pod.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeletePodResponse());
    }

    /**
     * Description: 查询环境部署单元拓扑
     * Summary: 查询环境部署单元拓扑
     */
    public GetWorkspacegroupTopologyResponse getWorkspacegroupTopology(GetWorkspacegroupTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspacegroupTopologyEx(request, headers, runtime);
    }

    /**
     * Description: 查询环境部署单元拓扑
     * Summary: 查询环境部署单元拓扑
     */
    public GetWorkspacegroupTopologyResponse getWorkspacegroupTopologyEx(GetWorkspacegroupTopologyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.workspacegroup.topology.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetWorkspacegroupTopologyResponse());
    }

    /**
     * Description: 修改 cell 权重
     * Summary: 修改 cell 权重
     */
    public UpdateFlowCellweightResponse updateFlowCellweight(UpdateFlowCellweightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowCellweightEx(request, headers, runtime);
    }

    /**
     * Description: 修改 cell 权重
     * Summary: 修改 cell 权重
     */
    public UpdateFlowCellweightResponse updateFlowCellweightEx(UpdateFlowCellweightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.cellweight.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFlowCellweightResponse());
    }

    /**
     * Description: uid 分片调整
     * Summary: uid 分片调整
     */
    public UpdateFlowUidrangeResponse updateFlowUidrange(UpdateFlowUidrangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowUidrangeEx(request, headers, runtime);
    }

    /**
     * Description: uid 分片调整
     * Summary: uid 分片调整
     */
    public UpdateFlowUidrangeResponse updateFlowUidrangeEx(UpdateFlowUidrangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.uidrange.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFlowUidrangeResponse());
    }

    /**
     * Description: 弹出 UID 到弹性部署单元
     * Summary: 弹出 UID 到弹性部署单元
     */
    public EnableFlowElasticuidResponse enableFlowElasticuid(EnableFlowElasticuidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableFlowElasticuidEx(request, headers, runtime);
    }

    /**
     * Description: 弹出 UID 到弹性部署单元
     * Summary: 弹出 UID 到弹性部署单元
     */
    public EnableFlowElasticuidResponse enableFlowElasticuidEx(EnableFlowElasticuidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticuid.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableFlowElasticuidResponse());
    }

    /**
     * Description: 弹回 UID 分片
     * Summary: 弹回 UID 分片
     */
    public DisableFlowElasticuidResponse disableFlowElasticuid(DisableFlowElasticuidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableFlowElasticuidEx(request, headers, runtime);
    }

    /**
     * Description: 弹回 UID 分片
     * Summary: 弹回 UID 分片
     */
    public DisableFlowElasticuidResponse disableFlowElasticuidEx(DisableFlowElasticuidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticuid.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableFlowElasticuidResponse());
    }

    /**
     * Description: 导出当前的流量规则
     * Summary: 导出当前的流量规则
     */
    public ExportFlowRuleResponse exportFlowRule(ExportFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportFlowRuleEx(request, headers, runtime);
    }

    /**
     * Description: 导出当前的流量规则
     * Summary: 导出当前的流量规则
     */
    public ExportFlowRuleResponse exportFlowRuleEx(ExportFlowRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.rule.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportFlowRuleResponse());
    }

    /**
     * Description: 推送流量规则
     * Summary: 推送流量规则
     */
    public PushFlowRuleResponse pushFlowRule(PushFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushFlowRuleEx(request, headers, runtime);
    }

    /**
     * Description: 推送流量规则
     * Summary: 推送流量规则
     */
    public PushFlowRuleResponse pushFlowRuleEx(PushFlowRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.rule.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushFlowRuleResponse());
    }

    /**
     * Description: 创建弹性规则
     * Summary: 创建弹性规则
     */
    public AddFlowElasticruleResponse addFlowElasticrule(AddFlowElasticruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFlowElasticruleEx(request, headers, runtime);
    }

    /**
     * Description: 创建弹性规则
     * Summary: 创建弹性规则
     */
    public AddFlowElasticruleResponse addFlowElasticruleEx(AddFlowElasticruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddFlowElasticruleResponse());
    }

    /**
     * Description: 更新弹性规则
     * Summary: 更新弹性规则
     */
    public UpdateFlowElasticruleResponse updateFlowElasticrule(UpdateFlowElasticruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowElasticruleEx(request, headers, runtime);
    }

    /**
     * Description: 更新弹性规则
     * Summary: 更新弹性规则
     */
    public UpdateFlowElasticruleResponse updateFlowElasticruleEx(UpdateFlowElasticruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFlowElasticruleResponse());
    }

    /**
     * Description: 删除弹性规则
     * Summary: 删除弹性规则
     */
    public DeleteFlowElasticruleResponse deleteFlowElasticrule(DeleteFlowElasticruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowElasticruleEx(request, headers, runtime);
    }

    /**
     * Description: 删除弹性规则
     * Summary: 删除弹性规则
     */
    public DeleteFlowElasticruleResponse deleteFlowElasticruleEx(DeleteFlowElasticruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFlowElasticruleResponse());
    }

    /**
     * Description: 添加弹性子规则
     * Summary: 添加弹性子规则
     */
    public AddFlowElasticsubruleResponse addFlowElasticsubrule(AddFlowElasticsubruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFlowElasticsubruleEx(request, headers, runtime);
    }

    /**
     * Description: 添加弹性子规则
     * Summary: 添加弹性子规则
     */
    public AddFlowElasticsubruleResponse addFlowElasticsubruleEx(AddFlowElasticsubruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticsubrule.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddFlowElasticsubruleResponse());
    }

    /**
     * Description: 删除子弹性规则
     * Summary: 删除子弹性规则
     */
    public DeleteFlowElasticsubruleResponse deleteFlowElasticsubrule(DeleteFlowElasticsubruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowElasticsubruleEx(request, headers, runtime);
    }

    /**
     * Description: 删除子弹性规则
     * Summary: 删除子弹性规则
     */
    public DeleteFlowElasticsubruleResponse deleteFlowElasticsubruleEx(DeleteFlowElasticsubruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticsubrule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFlowElasticsubruleResponse());
    }

    /**
     * Description: 批量更新弹性规则状态
     * Summary: 批量更新弹性规则状态
     */
    public UpdateFlowElasticrulestatusResponse updateFlowElasticrulestatus(UpdateFlowElasticrulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowElasticrulestatusEx(request, headers, runtime);
    }

    /**
     * Description: 批量更新弹性规则状态
     * Summary: 批量更新弹性规则状态
     */
    public UpdateFlowElasticrulestatusResponse updateFlowElasticrulestatusEx(UpdateFlowElasticrulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticrulestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFlowElasticrulestatusResponse());
    }

    /**
     * Description: 批量删除弹性规则
     * Summary: 批量删除弹性规则
     */
    public BatchdeleteFlowElasticruleResponse batchdeleteFlowElasticrule(BatchdeleteFlowElasticruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteFlowElasticruleEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除弹性规则
     * Summary: 批量删除弹性规则
     */
    public BatchdeleteFlowElasticruleResponse batchdeleteFlowElasticruleEx(BatchdeleteFlowElasticruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteFlowElasticruleResponse());
    }

    /**
     * Description: 创建弹性场景
     * Summary: 创建弹性场景
     */
    public CreateFlowElasticsceneResponse createFlowElasticscene(CreateFlowElasticsceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowElasticsceneEx(request, headers, runtime);
    }

    /**
     * Description: 创建弹性场景
     * Summary: 创建弹性场景
     */
    public CreateFlowElasticsceneResponse createFlowElasticsceneEx(CreateFlowElasticsceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowElasticsceneResponse());
    }

    /**
     * Description: 修改弹性场景
     * Summary: 修改弹性场景
     */
    public UpdateFlowElasticsceneResponse updateFlowElasticscene(UpdateFlowElasticsceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowElasticsceneEx(request, headers, runtime);
    }

    /**
     * Description: 修改弹性场景
     * Summary: 修改弹性场景
     */
    public UpdateFlowElasticsceneResponse updateFlowElasticsceneEx(UpdateFlowElasticsceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFlowElasticsceneResponse());
    }

    /**
     * Description: 删除弹性场景
     * Summary: 删除弹性场景
     */
    public DeleteFlowElasticsceneResponse deleteFlowElasticscene(DeleteFlowElasticsceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowElasticsceneEx(request, headers, runtime);
    }

    /**
     * Description: 删除弹性场景
     * Summary: 删除弹性场景
     */
    public DeleteFlowElasticsceneResponse deleteFlowElasticsceneEx(DeleteFlowElasticsceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFlowElasticsceneResponse());
    }

    /**
     * Description: 配置弹性值
     * Summary: 配置弹性值
     */
    public SetFlowElasticvalueResponse setFlowElasticvalue(SetFlowElasticvalueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setFlowElasticvalueEx(request, headers, runtime);
    }

    /**
     * Description: 配置弹性值
     * Summary: 配置弹性值
     */
    public SetFlowElasticvalueResponse setFlowElasticvalueEx(SetFlowElasticvalueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticvalue.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetFlowElasticvalueResponse());
    }

    /**
     * Description: 恢复弹性值
     * Summary: 恢复弹性值
     */
    public DisableFlowElasticvalueResponse disableFlowElasticvalue(DisableFlowElasticvalueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableFlowElasticvalueEx(request, headers, runtime);
    }

    /**
     * Description: 恢复弹性值
     * Summary: 恢复弹性值
     */
    public DisableFlowElasticvalueResponse disableFlowElasticvalueEx(DisableFlowElasticvalueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticvalue.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableFlowElasticvalueResponse());
    }

    /**
     * Description: 创建站点
     * Summary: 创建站点
     */
    public CreateFlowSiteResponse createFlowSite(CreateFlowSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowSiteEx(request, headers, runtime);
    }

    /**
     * Description: 创建站点
     * Summary: 创建站点
     */
    public CreateFlowSiteResponse createFlowSiteEx(CreateFlowSiteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.site.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowSiteResponse());
    }

    /**
     * Description: 修改站点信息
     * Summary: 修改站点信息
     */
    public UpdateFlowSiteResponse updateFlowSite(UpdateFlowSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowSiteEx(request, headers, runtime);
    }

    /**
     * Description: 修改站点信息
     * Summary: 修改站点信息
     */
    public UpdateFlowSiteResponse updateFlowSiteEx(UpdateFlowSiteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.site.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFlowSiteResponse());
    }

    /**
     * Description: 删除站点
     * Summary: 删除站点
     */
    public DeleteFlowSiteResponse deleteFlowSite(DeleteFlowSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowSiteEx(request, headers, runtime);
    }

    /**
     * Description: 删除站点
     * Summary: 删除站点
     */
    public DeleteFlowSiteResponse deleteFlowSiteEx(DeleteFlowSiteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.site.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFlowSiteResponse());
    }

    /**
     * Description: 指定应用或指定pods创建重启运维单
     * Summary: 创建重启运维单
     */
    public CreateOpsplanRestartResponse createOpsplanRestart(CreateOpsplanRestartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOpsplanRestartEx(request, headers, runtime);
    }

    /**
     * Description: 指定应用或指定pods创建重启运维单
     * Summary: 创建重启运维单
     */
    public CreateOpsplanRestartResponse createOpsplanRestartEx(CreateOpsplanRestartRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.restart.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOpsplanRestartResponse());
    }

    /**
     * Description: 容器应用服务revision添加备注
     * Summary: 容器应用服务revision添加备注
     */
    public UpdateContainerserviceCommentResponse updateContainerserviceComment(UpdateContainerserviceCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceCommentEx(request, headers, runtime);
    }

    /**
     * Description: 容器应用服务revision添加备注
     * Summary: 容器应用服务revision添加备注
     */
    public UpdateContainerserviceCommentResponse updateContainerserviceCommentEx(UpdateContainerserviceCommentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.comment.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceCommentResponse());
    }

    /**
     * Description: 回滚容器服务到指定版本
     * Summary: 回滚容器服务到指定版本
     */
    public RollbackContainerserviceDeploymentResponse rollbackContainerserviceDeployment(RollbackContainerserviceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackContainerserviceDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 回滚容器服务到指定版本
     * Summary: 回滚容器服务到指定版本
     */
    public RollbackContainerserviceDeploymentResponse rollbackContainerserviceDeploymentEx(RollbackContainerserviceDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.deployment.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackContainerserviceDeploymentResponse());
    }

    /**
     * Description: 查询 uid 信息
     * Summary: 查询 uid 信息
     */
    public QueryFlowUidinfoResponse queryFlowUidinfo(QueryFlowUidinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowUidinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询 uid 信息
     * Summary: 查询 uid 信息
     */
    public QueryFlowUidinfoResponse queryFlowUidinfoEx(QueryFlowUidinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.uidinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowUidinfoResponse());
    }

    /**
     * Description: 查询站点
     * Summary: 查询站点
     */
    public QueryFlowSiteResponse queryFlowSite(QueryFlowSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowSiteEx(request, headers, runtime);
    }

    /**
     * Description: 查询站点
     * Summary: 查询站点
     */
    public QueryFlowSiteResponse queryFlowSiteEx(QueryFlowSiteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.site.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowSiteResponse());
    }

    /**
     * Description: 查询部署单元信息
     * Summary: 查询部署单元信息
     */
    public GetCellResponse getCell(GetCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询部署单元信息
     * Summary: 查询部署单元信息
     */
    public GetCellResponse getCellEx(GetCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cell.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCellResponse());
    }

    /**
     * Description: 查询逻辑单元信息。
     * Summary: 查询逻辑单元信息。
     */
    public GetCellgroupResponse getCellgroup(GetCellgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCellgroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询逻辑单元信息。
     * Summary: 查询逻辑单元信息。
     */
    public GetCellgroupResponse getCellgroupEx(GetCellgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cellgroup.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCellgroupResponse());
    }

    /**
     * Description: 更新部署单元信息。
     * Summary: 更新部署单元信息。
     */
    public UpdateCellResponse updateCell(UpdateCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCellEx(request, headers, runtime);
    }

    /**
     * Description: 更新部署单元信息。
     * Summary: 更新部署单元信息。
     */
    public UpdateCellResponse updateCellEx(UpdateCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cell.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCellResponse());
    }

    /**
     * Description: 查询Pod/容器事件列表
     * Summary: 查询Pod/容器事件列表
     */
    public ListEventsResponse listEvents(ListEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEventsEx(request, headers, runtime);
    }

    /**
     * Description: 查询Pod/容器事件列表
     * Summary: 查询Pod/容器事件列表
     */
    public ListEventsResponse listEventsEx(ListEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.events.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListEventsResponse());
    }

    /**
     * Description: 获取地域信息
     * Summary: 获取地域信息
     */
    public ListRegionResponse listRegion(ListRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionEx(request, headers, runtime);
    }

    /**
     * Description: 获取地域信息
     * Summary: 获取地域信息
     */
    public ListRegionResponse listRegionEx(ListRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.region.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRegionResponse());
    }

    /**
     * Description: 可用区列表
     * Summary: 可用区列表
     */
    public ListZoneResponse listZone(ListZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listZoneEx(request, headers, runtime);
    }

    /**
     * Description: 可用区列表
     * Summary: 可用区列表
     */
    public ListZoneResponse listZoneEx(ListZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.zone.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListZoneResponse());
    }

    /**
     * Description: 查询pod下container 日志
     * Summary: 查询pod日志
     */
    public QueryPodLogResponse queryPodLog(QueryPodLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPodLogEx(request, headers, runtime);
    }

    /**
     * Description: 查询pod下container 日志
     * Summary: 查询pod日志
     */
    public QueryPodLogResponse queryPodLogEx(QueryPodLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.pod.log.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPodLogResponse());
    }

    /**
     * Description: 创建spanner集群
     * Summary: 创建spanner集群
     */
    public CreateSpannerClusterResponse createSpannerCluster(CreateSpannerClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpannerClusterEx(request, headers, runtime);
    }

    /**
     * Description: 创建spanner集群
     * Summary: 创建spanner集群
     */
    public CreateSpannerClusterResponse createSpannerClusterEx(CreateSpannerClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.spanner.cluster.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSpannerClusterResponse());
    }

    /**
     * Description: 获取集群详情
     * Summary: 获取集群详情
     */
    public GetSpannerClusterResponse getSpannerCluster(GetSpannerClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSpannerClusterEx(request, headers, runtime);
    }

    /**
     * Description: 获取集群详情
     * Summary: 获取集群详情
     */
    public GetSpannerClusterResponse getSpannerClusterEx(GetSpannerClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.spanner.cluster.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSpannerClusterResponse());
    }

    /**
     * Description: 扩容spanner集群
     * Summary: 扩容spanner集群
     */
    public ScaleSpannerClusterResponse scaleSpannerCluster(ScaleSpannerClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleSpannerClusterEx(request, headers, runtime);
    }

    /**
     * Description: 扩容spanner集群
     * Summary: 扩容spanner集群
     */
    public ScaleSpannerClusterResponse scaleSpannerClusterEx(ScaleSpannerClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.spanner.cluster.scale", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleSpannerClusterResponse());
    }

    /**
     * Description: 查询集群列表
     * Summary: 查询集群列表
     */
    public QuerySpannerClusterResponse querySpannerCluster(QuerySpannerClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySpannerClusterEx(request, headers, runtime);
    }

    /**
     * Description: 查询集群列表
     * Summary: 查询集群列表
     */
    public QuerySpannerClusterResponse querySpannerClusterEx(QuerySpannerClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.spanner.cluster.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySpannerClusterResponse());
    }

    /**
     * Description: 更新spanner集群状态
     * Summary: 更新spanner集群状态
     */
    public UpdateSpannerClusterstatusResponse updateSpannerClusterstatus(UpdateSpannerClusterstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSpannerClusterstatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新spanner集群状态
     * Summary: 更新spanner集群状态
     */
    public UpdateSpannerClusterstatusResponse updateSpannerClusterstatusEx(UpdateSpannerClusterstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.spanner.clusterstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSpannerClusterstatusResponse());
    }

    /**
     * Description: 更新集群单元状态
     * Summary: 更新集群单元状态
     */
    public UpdateSpannerUnitstatusResponse updateSpannerUnitstatus(UpdateSpannerUnitstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSpannerUnitstatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新集群单元状态
     * Summary: 更新集群单元状态
     */
    public UpdateSpannerUnitstatusResponse updateSpannerUnitstatusEx(UpdateSpannerUnitstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.spanner.unitstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSpannerUnitstatusResponse());
    }

    /**
     * Description: 取消应用服务发布|运维
     * Summary: 取消应用服务发布|运维
     */
    public CancelOpsplanServiceResponse cancelOpsplanService(CancelOpsplanServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelOpsplanServiceEx(request, headers, runtime);
    }

    /**
     * Description: 取消应用服务发布|运维
     * Summary: 取消应用服务发布|运维
     */
    public CancelOpsplanServiceResponse cancelOpsplanServiceEx(CancelOpsplanServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.service.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelOpsplanServiceResponse());
    }

    /**
     * Description: 查询系统配置url
     * Summary: 系统url查询
     */
    public ListSystemUrlResponse listSystemUrl(ListSystemUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSystemUrlEx(request, headers, runtime);
    }

    /**
     * Description: 查询系统配置url
     * Summary: 系统url查询
     */
    public ListSystemUrlResponse listSystemUrlEx(ListSystemUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.system.url.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSystemUrlResponse());
    }

    /**
     * Description: 查询流量推送记录
     * Summary: 查询
     */
    public QueryFlowRecordResponse queryFlowRecord(QueryFlowRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowRecordEx(request, headers, runtime);
    }

    /**
     * Description: 查询流量推送记录
     * Summary: 查询
     */
    public QueryFlowRecordResponse queryFlowRecordEx(QueryFlowRecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.record.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowRecordResponse());
    }

    /**
     * Description: 保存环境关联
     * Summary: 保存环境关联
     */
    public SaveFlowEnvrelResponse saveFlowEnvrel(SaveFlowEnvrelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveFlowEnvrelEx(request, headers, runtime);
    }

    /**
     * Description: 保存环境关联
     * Summary: 保存环境关联
     */
    public SaveFlowEnvrelResponse saveFlowEnvrelEx(SaveFlowEnvrelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.envrel.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveFlowEnvrelResponse());
    }

    /**
     * Description: 删除环境关联
     * Summary: 删除环境关联
     */
    public DeleteFlowEnvrelResponse deleteFlowEnvrel(DeleteFlowEnvrelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowEnvrelEx(request, headers, runtime);
    }

    /**
     * Description: 删除环境关联
     * Summary: 删除环境关联
     */
    public DeleteFlowEnvrelResponse deleteFlowEnvrelEx(DeleteFlowEnvrelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.envrel.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFlowEnvrelResponse());
    }

    /**
     * Description: 查询关联
     * Summary: 查询关联
     */
    public QueryFlowEnvrelResponse queryFlowEnvrel(QueryFlowEnvrelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowEnvrelEx(request, headers, runtime);
    }

    /**
     * Description: 查询关联
     * Summary: 查询关联
     */
    public QueryFlowEnvrelResponse queryFlowEnvrelEx(QueryFlowEnvrelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.envrel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowEnvrelResponse());
    }

    /**
     * Description: 创建异构机房部署单元
     * Summary: 创建异构机房部署单元
     */
    public CreateFlowSitecellResponse createFlowSitecell(CreateFlowSitecellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowSitecellEx(request, headers, runtime);
    }

    /**
     * Description: 创建异构机房部署单元
     * Summary: 创建异构机房部署单元
     */
    public CreateFlowSitecellResponse createFlowSitecellEx(CreateFlowSitecellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.sitecell.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowSitecellResponse());
    }

    /**
     * Description: 删除异构机房部署单元
     * Summary: 删除异构机房部署单元
     */
    public DeleteFlowSitecellResponse deleteFlowSitecell(DeleteFlowSitecellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowSitecellEx(request, headers, runtime);
    }

    /**
     * Description: 删除异构机房部署单元
     * Summary: 删除异构机房部署单元
     */
    public DeleteFlowSitecellResponse deleteFlowSitecellEx(DeleteFlowSitecellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.sitecell.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFlowSitecellResponse());
    }

    /**
     * Description: 查询异构机房部署单元
     * Summary: 查询异构机房部署单元
     */
    public QueryFlowSitecellResponse queryFlowSitecell(QueryFlowSitecellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowSitecellEx(request, headers, runtime);
    }

    /**
     * Description: 查询异构机房部署单元
     * Summary: 查询异构机房部署单元
     */
    public QueryFlowSitecellResponse queryFlowSitecellEx(QueryFlowSitecellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.sitecell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowSitecellResponse());
    }

    /**
     * Description: 获取发布单下应用服务详情
     * Summary: 获取发布单下应用服务详情
     */
    public GetOpsplanServiceResponse getOpsplanService(GetOpsplanServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOpsplanServiceEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布单下应用服务详情
     * Summary: 获取发布单下应用服务详情
     */
    public GetOpsplanServiceResponse getOpsplanServiceEx(GetOpsplanServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.service.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetOpsplanServiceResponse());
    }

    /**
     * Description: 获取当前生效的路由规则
     * Summary: 获取当前生效的路由规则
     */
    public QueryFlowRuleResponse queryFlowRule(QueryFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowRuleEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前生效的路由规则
     * Summary: 获取当前生效的路由规则
     */
    public QueryFlowRuleResponse queryFlowRuleEx(QueryFlowRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.rule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowRuleResponse());
    }

    /**
     * Description: 创建FedDeployment
     * Summary: 创建FedDeployment
     */
    public CreateFederationDeploymentResponse createFederationDeployment(CreateFederationDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFederationDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 创建FedDeployment
     * Summary: 创建FedDeployment
     */
    public CreateFederationDeploymentResponse createFederationDeploymentEx(CreateFederationDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.deployment.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFederationDeploymentResponse());
    }

    /**
     * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
     * Summary: 查询负责均衡实例。
     */
    public QueryLoadbalancerResponse queryLoadbalancer(QueryLoadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
     * Summary: 查询负责均衡实例。
     */
    public QueryLoadbalancerResponse queryLoadbalancerEx(QueryLoadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.loadbalancer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadbalancerResponse());
    }

    /**
     * Description: 查询容器服务 Service 列表。
     * Summary: 查询容器服务 Service 列表。
     */
    public ListContainerserviceServiceResponse listContainerserviceService(ListContainerserviceServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContainerserviceServiceEx(request, headers, runtime);
    }

    /**
     * Description: 查询容器服务 Service 列表。
     * Summary: 查询容器服务 Service 列表。
     */
    public ListContainerserviceServiceResponse listContainerserviceServiceEx(ListContainerserviceServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.service.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContainerserviceServiceResponse());
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
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecar.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSidecarResponse());
    }

    /**
     * Description: list template
     * Summary: list template
     */
    public ListSidecarTemplateResponse listSidecarTemplate(ListSidecarTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSidecarTemplateEx(request, headers, runtime);
    }

    /**
     * Description: list template
     * Summary: list template
     */
    public ListSidecarTemplateResponse listSidecarTemplateEx(ListSidecarTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecar.template.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSidecarTemplateResponse());
    }

    /**
     * Description: 获取sidecar版本详情
     * Summary: 版本详情
     */
    public GetSidecarTemplateResponse getSidecarTemplate(GetSidecarTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSidecarTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 获取sidecar版本详情
     * Summary: 版本详情
     */
    public GetSidecarTemplateResponse getSidecarTemplateEx(GetSidecarTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecar.template.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSidecarTemplateResponse());
    }

    /**
     * Description: 获取FedDeployment详情
     * Summary: 获取FedDeployment详情
     */
    public GetFederationDeploymentResponse getFederationDeployment(GetFederationDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFederationDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 获取FedDeployment详情
     * Summary: 获取FedDeployment详情
     */
    public GetFederationDeploymentResponse getFederationDeploymentEx(GetFederationDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.deployment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFederationDeploymentResponse());
    }

    /**
     * Description: 获取FederatedDeployment列表信息
     * Summary: 获取FedDeploy列表
     */
    public ListFederationDeploymentResponse listFederationDeployment(ListFederationDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFederationDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 获取FederatedDeployment列表信息
     * Summary: 获取FedDeploy列表
     */
    public ListFederationDeploymentResponse listFederationDeploymentEx(ListFederationDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.deployment.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFederationDeploymentResponse());
    }

    /**
     * Description: 删除FedDeployment
     * Summary: 删除FedDeployment
     */
    public DeleteFederationDeploymentResponse deleteFederationDeployment(DeleteFederationDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFederationDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 删除FedDeployment
     * Summary: 删除FedDeployment
     */
    public DeleteFederationDeploymentResponse deleteFederationDeploymentEx(DeleteFederationDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.deployment.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFederationDeploymentResponse());
    }

    /**
     * Description: 设置当前uid规则为默认uid规则
     * Summary: 设置当前uid规则为默认uid规则
     */
    public SetFlowDefaultuidResponse setFlowDefaultuid(SetFlowDefaultuidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setFlowDefaultuidEx(request, headers, runtime);
    }

    /**
     * Description: 设置当前uid规则为默认uid规则
     * Summary: 设置当前uid规则为默认uid规则
     */
    public SetFlowDefaultuidResponse setFlowDefaultuidEx(SetFlowDefaultuidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.defaultuid.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetFlowDefaultuidResponse());
    }

    /**
     * Description: 开始执行应用服务发布|运维
     * Summary: 开始执行应用服务发布|运维
     */
    public StartOpsplanServiceResponse startOpsplanService(StartOpsplanServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOpsplanServiceEx(request, headers, runtime);
    }

    /**
     * Description: 开始执行应用服务发布|运维
     * Summary: 开始执行应用服务发布|运维
     */
    public StartOpsplanServiceResponse startOpsplanServiceEx(StartOpsplanServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.service.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartOpsplanServiceResponse());
    }

    /**
     * Description: 回滚确认应用服务
     * Summary: 回滚确认应用服务
     */
    public ConfirmOpsplanServicerollbackResponse confirmOpsplanServicerollback(ConfirmOpsplanServicerollbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmOpsplanServicerollbackEx(request, headers, runtime);
    }

    /**
     * Description: 回滚确认应用服务
     * Summary: 回滚确认应用服务
     */
    public ConfirmOpsplanServicerollbackResponse confirmOpsplanServicerollbackEx(ConfirmOpsplanServicerollbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.servicerollback.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmOpsplanServicerollbackResponse());
    }

    /**
     * Description: 重试发布服务
     * Summary: 重试发布服务
     */
    public RetryOpsplanServiceResponse retryOpsplanService(RetryOpsplanServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryOpsplanServiceEx(request, headers, runtime);
    }

    /**
     * Description: 重试发布服务
     * Summary: 重试发布服务
     */
    public RetryOpsplanServiceResponse retryOpsplanServiceEx(RetryOpsplanServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.service.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryOpsplanServiceResponse());
    }

    /**
     * Description: 查询弹性场景
     * Summary: 查询弹性场景
     */
    public QueryFlowElasticsceneResponse queryFlowElasticscene(QueryFlowElasticsceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowElasticsceneEx(request, headers, runtime);
    }

    /**
     * Description: 查询弹性场景
     * Summary: 查询弹性场景
     */
    public QueryFlowElasticsceneResponse queryFlowElasticsceneEx(QueryFlowElasticsceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowElasticsceneResponse());
    }

    /**
     * Description: 查询弹性规则
     * Summary: 查询弹性规则
     */
    public QueryFlowElasticruleResponse queryFlowElasticrule(QueryFlowElasticruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowElasticruleEx(request, headers, runtime);
    }

    /**
     * Description: 查询弹性规则
     * Summary: 查询弹性规则
     */
    public QueryFlowElasticruleResponse queryFlowElasticruleEx(QueryFlowElasticruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowElasticruleResponse());
    }

    /**
     * Description: 查询弹性子规则
     * Summary: 查询弹性子规则
     */
    public QueryFlowElasticsubruleResponse queryFlowElasticsubrule(QueryFlowElasticsubruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowElasticsubruleEx(request, headers, runtime);
    }

    /**
     * Description: 查询弹性子规则
     * Summary: 查询弹性子规则
     */
    public QueryFlowElasticsubruleResponse queryFlowElasticsubruleEx(QueryFlowElasticsubruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticsubrule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowElasticsubruleResponse());
    }

    /**
     * Description: 查询当前弹性状态
     * Summary: 查询当前弹性状态
     */
    public QueryFlowElasticvalueResponse queryFlowElasticvalue(QueryFlowElasticvalueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowElasticvalueEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前弹性状态
     * Summary: 查询当前弹性状态
     */
    public QueryFlowElasticvalueResponse queryFlowElasticvalueEx(QueryFlowElasticvalueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.elasticvalue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowElasticvalueResponse());
    }

    /**
     * Description: 开关配置
     * Summary: 开关配置
     */
    public ListSystemSwitchResponse listSystemSwitch(ListSystemSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSystemSwitchEx(request, headers, runtime);
    }

    /**
     * Description: 开关配置
     * Summary: 开关配置
     */
    public ListSystemSwitchResponse listSystemSwitchEx(ListSystemSwitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.system.switch.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSystemSwitchResponse());
    }

    /**
     * Description: 获取云原生技术栈对应的Dockerfile
     * Summary: 获取技术栈对应的Dockerfile
     */
    public LoadBuildpackDockerfileResponse loadBuildpackDockerfile(LoadBuildpackDockerfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadBuildpackDockerfileEx(request, headers, runtime);
    }

    /**
     * Description: 获取云原生技术栈对应的Dockerfile
     * Summary: 获取技术栈对应的Dockerfile
     */
    public LoadBuildpackDockerfileResponse loadBuildpackDockerfileEx(LoadBuildpackDockerfileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.buildpack.dockerfile.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadBuildpackDockerfileResponse());
    }

    /**
     * Description: 指定pod创建缩容运维单
     * Summary: 创建pod缩容运维单
     */
    public CreateOpsplanPodofflineResponse createOpsplanPodoffline(CreateOpsplanPodofflineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOpsplanPodofflineEx(request, headers, runtime);
    }

    /**
     * Description: 指定pod创建缩容运维单
     * Summary: 创建pod缩容运维单
     */
    public CreateOpsplanPodofflineResponse createOpsplanPodofflineEx(CreateOpsplanPodofflineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.podoffline.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOpsplanPodofflineResponse());
    }

    /**
     * Description: 添加OB租户信息以及对应的uid分片段
     * Summary: 添加OB租户信息
     */
    public CreateDbflowObtenantResponse createDbflowObtenant(CreateDbflowObtenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDbflowObtenantEx(request, headers, runtime);
    }

    /**
     * Description: 添加OB租户信息以及对应的uid分片段
     * Summary: 添加OB租户信息
     */
    public CreateDbflowObtenantResponse createDbflowObtenantEx(CreateDbflowObtenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDbflowObtenantResponse());
    }

    /**
     * Description: 分页查询ob租户列表
     * Summary: 分页查询ob租户列表
     */
    public QueryDbflowObtenantResponse queryDbflowObtenant(QueryDbflowObtenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDbflowObtenantEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询ob租户列表
     * Summary: 分页查询ob租户列表
     */
    public QueryDbflowObtenantResponse queryDbflowObtenantEx(QueryDbflowObtenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDbflowObtenantResponse());
    }

    /**
     * Description: 更新OB租户信息，包括uid映射
     * Summary: 更新OB租户信息
     */
    public UpdateDbflowObtenantResponse updateDbflowObtenant(UpdateDbflowObtenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDbflowObtenantEx(request, headers, runtime);
    }

    /**
     * Description: 更新OB租户信息，包括uid映射
     * Summary: 更新OB租户信息
     */
    public UpdateDbflowObtenantResponse updateDbflowObtenantEx(UpdateDbflowObtenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDbflowObtenantResponse());
    }

    /**
     * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
     * Summary: 删除PaaS中记录的OB租户信息
     */
    public DeleteDbflowObtenantResponse deleteDbflowObtenant(DeleteDbflowObtenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDbflowObtenantEx(request, headers, runtime);
    }

    /**
     * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
     * Summary: 删除PaaS中记录的OB租户信息
     */
    public DeleteDbflowObtenantResponse deleteDbflowObtenantEx(DeleteDbflowObtenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDbflowObtenantResponse());
    }

    /**
     * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
     * Summary: 更新原生技术栈版本信息
     */
    public UpdateBuildpackNativetechstackversionResponse updateBuildpackNativetechstackversion(UpdateBuildpackNativetechstackversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBuildpackNativetechstackversionEx(request, headers, runtime);
    }

    /**
     * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
     * Summary: 更新原生技术栈版本信息
     */
    public UpdateBuildpackNativetechstackversionResponse updateBuildpackNativetechstackversionEx(UpdateBuildpackNativetechstackversionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBuildpackNativetechstackversionResponse());
    }

    /**
     * Description: 获取当前环境组的region列表信息
     * Summary: 获取环境组region信息
     */
    public ListWorkspacegroupRegionsResponse listWorkspacegroupRegions(ListWorkspacegroupRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacegroupRegionsEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前环境组的region列表信息
     * Summary: 获取环境组region信息
     */
    public ListWorkspacegroupRegionsResponse listWorkspacegroupRegionsEx(ListWorkspacegroupRegionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.workspacegroup.regions.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWorkspacegroupRegionsResponse());
    }

    /**
     * Description: 获取集群列表信息
     * Summary: 获取集群列表
     */
    public ListClusterInfoResponse listClusterInfo(ListClusterInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterInfoEx(request, headers, runtime);
    }

    /**
     * Description: 获取集群列表信息
     * Summary: 获取集群列表
     */
    public ListClusterInfoResponse listClusterInfoEx(ListClusterInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.info.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListClusterInfoResponse());
    }

    /**
     * Description: 获取集群资源状态信息
     * Summary: 获取集群资源状态信息
     */
    public ListClusterOverviewResponse listClusterOverview(ListClusterOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterOverviewEx(request, headers, runtime);
    }

    /**
     * Description: 获取集群资源状态信息
     * Summary: 获取集群资源状态信息
     */
    public ListClusterOverviewResponse listClusterOverviewEx(ListClusterOverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cluster.overview.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListClusterOverviewResponse());
    }

    /**
     * Description: 查询ALB证书信息。
     * Summary: 查询ALB证书信息。
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCertificatesEx(request, headers, runtime);
    }

    /**
     * Description: 查询ALB证书信息。
     * Summary: 查询ALB证书信息。
     */
    public ListCertificatesResponse listCertificatesEx(ListCertificatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.certificates.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCertificatesResponse());
    }

    /**
     * Description: 获取所有已被使用的lb iaas id。
     * Summary: 获取所有已被使用的lb iaas id。
     */
    public ListLoadbalancerResponse listLoadbalancer(ListLoadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLoadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: 获取所有已被使用的lb iaas id。
     * Summary: 获取所有已被使用的lb iaas id。
     */
    public ListLoadbalancerResponse listLoadbalancerEx(ListLoadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.loadbalancer.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLoadbalancerResponse());
    }

    /**
     * Description: 获取cloudconfig当前配置
     * Summary: 获取cloudconfig当前配置
     */
    public GetCloudconfigResponse getCloudconfig(GetCloudconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCloudconfigEx(request, headers, runtime);
    }

    /**
     * Description: 获取cloudconfig当前配置
     * Summary: 获取cloudconfig当前配置
     */
    public GetCloudconfigResponse getCloudconfigEx(GetCloudconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cloudconfig.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCloudconfigResponse());
    }

    /**
     * Description: 更新cloudconfig
     * Summary: 更新cloudconfig
     */
    public UpdateCloudconfigResponse updateCloudconfig(UpdateCloudconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCloudconfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新cloudconfig
     * Summary: 更新cloudconfig
     */
    public UpdateCloudconfigResponse updateCloudconfigEx(UpdateCloudconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cloudconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCloudconfigResponse());
    }

    /**
     * Description: 版本历史
     * Summary: 版本历史
     */
    public ListCloudconfigHistoryResponse listCloudconfigHistory(ListCloudconfigHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCloudconfigHistoryEx(request, headers, runtime);
    }

    /**
     * Description: 版本历史
     * Summary: 版本历史
     */
    public ListCloudconfigHistoryResponse listCloudconfigHistoryEx(ListCloudconfigHistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.cloudconfig.history.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCloudconfigHistoryResponse());
    }

    /**
     * Description: sidecar运维能力创建（接入|升级）
     * Summary: sidecar运维创建（接入|升级）
     */
    public CreateSidecarOperationResponse createSidecarOperation(CreateSidecarOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSidecarOperationEx(request, headers, runtime);
    }

    /**
     * Description: sidecar运维能力创建（接入|升级）
     * Summary: sidecar运维创建（接入|升级）
     */
    public CreateSidecarOperationResponse createSidecarOperationEx(CreateSidecarOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecar.operation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSidecarOperationResponse());
    }

    /**
     * Description: 指定operationId重试sidecar运维
     * Summary: 重试sidecar运维
     */
    public RetrySidecarOperationResponse retrySidecarOperation(RetrySidecarOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrySidecarOperationEx(request, headers, runtime);
    }

    /**
     * Description: 指定operationId重试sidecar运维
     * Summary: 重试sidecar运维
     */
    public RetrySidecarOperationResponse retrySidecarOperationEx(RetrySidecarOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecar.operation.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetrySidecarOperationResponse());
    }

    /**
     * Description: 取消sidecar运维
     * Summary: 取消sidecar运维
     */
    public CancelSidecarOperationResponse cancelSidecarOperation(CancelSidecarOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSidecarOperationEx(request, headers, runtime);
    }

    /**
     * Description: 取消sidecar运维
     * Summary: 取消sidecar运维
     */
    public CancelSidecarOperationResponse cancelSidecarOperationEx(CancelSidecarOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecar.operation.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSidecarOperationResponse());
    }

    /**
     * Description: create or update a service
     * Summary: patch a service
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceEx(request, headers, runtime);
    }

    /**
     * Description: create or update a service
     * Summary: patch a service
     */
    public UpdateServiceResponse updateServiceEx(UpdateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.service.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateServiceResponse());
    }

    /**
     * Description: 九州通过LHC创建发布单
     * Summary: 九州通过LHC创建发布单
     */
    public CreateGpaasReleaseResponse createGpaasRelease(CreateGpaasReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGpaasReleaseEx(request, headers, runtime);
    }

    /**
     * Description: 九州通过LHC创建发布单
     * Summary: 九州通过LHC创建发布单
     */
    public CreateGpaasReleaseResponse createGpaasReleaseEx(CreateGpaasReleaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.gpaas.release.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateGpaasReleaseResponse());
    }

    /**
     * Description: 查询sidecar运维进度
     * Summary: 查询sidecar运维进度
     */
    public QuerySidecarOperationResponse querySidecarOperation(QuerySidecarOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySidecarOperationEx(request, headers, runtime);
    }

    /**
     * Description: 查询sidecar运维进度
     * Summary: 查询sidecar运维进度
     */
    public QuerySidecarOperationResponse querySidecarOperationEx(QuerySidecarOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecar.operation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySidecarOperationResponse());
    }

    /**
     * Description: 查询Kubernetes原生资源
     * Summary: 查询Kubernetes原生资源
     */
    public ListKubernetesResourcesResponse listKubernetesResources(ListKubernetesResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKubernetesResourcesEx(request, headers, runtime);
    }

    /**
     * Description: 查询Kubernetes原生资源
     * Summary: 查询Kubernetes原生资源
     */
    public ListKubernetesResourcesResponse listKubernetesResourcesEx(ListKubernetesResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.kubernetes.resources.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListKubernetesResourcesResponse());
    }

    /**
     * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关k8s事件查询
     */
    public QueryReleasepipelinestageEventResponse queryReleasepipelinestageEvent(QueryReleasepipelinestageEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryReleasepipelinestageEventEx(request, headers, runtime);
    }

    /**
     * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关k8s事件查询
     */
    public QueryReleasepipelinestageEventResponse queryReleasepipelinestageEventEx(QueryReleasepipelinestageEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.releasepipelinestage.event.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryReleasepipelinestageEventResponse());
    }

    /**
     * Description: 获取projectname
     * Summary: 获取projectname
     */
    public GetSlsProjectnameResponse getSlsProjectname(GetSlsProjectnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSlsProjectnameEx(request, headers, runtime);
    }

    /**
     * Description: 获取projectname
     * Summary: 获取projectname
     */
    public GetSlsProjectnameResponse getSlsProjectnameEx(GetSlsProjectnameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sls.projectname.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSlsProjectnameResponse());
    }

    /**
     * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关k8s事件查询
     */
    public QueryReleasepipelineEventResponse queryReleasepipelineEvent(QueryReleasepipelineEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryReleasepipelineEventEx(request, headers, runtime);
    }

    /**
     * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关k8s事件查询
     */
    public QueryReleasepipelineEventResponse queryReleasepipelineEventEx(QueryReleasepipelineEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.releasepipeline.event.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryReleasepipelineEventResponse());
    }

    /**
     * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关k8s事件查询
     */
    public QueryPodEventResponse queryPodEvent(QueryPodEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPodEventEx(request, headers, runtime);
    }

    /**
     * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关k8s事件查询
     */
    public QueryPodEventResponse queryPodEventEx(QueryPodEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.pod.event.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPodEventResponse());
    }

    /**
     * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关logs查询
     */
    public QueryServiceProcesslogResponse queryServiceProcesslog(QueryServiceProcesslogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceProcesslogEx(request, headers, runtime);
    }

    /**
     * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
     * Summary: ldc发布单相关logs查询
     */
    public QueryServiceProcesslogResponse queryServiceProcesslogEx(QueryServiceProcesslogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.service.processlog.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceProcesslogResponse());
    }

    /**
     * Description: 应用管理-在应用维度查询容器应用服务
     * Summary: 应用管理-在应用维度查询容器应用服务
     */
    public QueryAppServiceResponse queryAppService(QueryAppServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppServiceEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-在应用维度查询容器应用服务
     * Summary: 应用管理-在应用维度查询容器应用服务
     */
    public QueryAppServiceResponse queryAppServiceEx(QueryAppServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.app.service.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppServiceResponse());
    }

    /**
     * Description: 应用管理-应用维度查询容器应用服务发布单
     * Summary: 应用管理-应用维度查询容器应用服务发布单
     */
    public QueryAppPlanResponse queryAppPlan(QueryAppPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAppPlanEx(request, headers, runtime);
    }

    /**
     * Description: 应用管理-应用维度查询容器应用服务发布单
     * Summary: 应用管理-应用维度查询容器应用服务发布单
     */
    public QueryAppPlanResponse queryAppPlanEx(QueryAppPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.app.plan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAppPlanResponse());
    }

    /**
     * Description: 创建统一接入实例，支持单元化和非单元化两种模式
     * Summary: 创建统一接入实例
     */
    public CreateUnifiedaccessinstanceResponse createUnifiedaccessinstance(CreateUnifiedaccessinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUnifiedaccessinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 创建统一接入实例，支持单元化和非单元化两种模式
     * Summary: 创建统一接入实例
     */
    public CreateUnifiedaccessinstanceResponse createUnifiedaccessinstanceEx(CreateUnifiedaccessinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUnifiedaccessinstanceResponse());
    }

    /**
     * Description: 查询统一接入实例列表信息
     * Summary: 查询统一接入实例列表信息
     */
    public QueryUnifiedaccessinstanceResponse queryUnifiedaccessinstance(QueryUnifiedaccessinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedaccessinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询统一接入实例列表信息
     * Summary: 查询统一接入实例列表信息
     */
    public QueryUnifiedaccessinstanceResponse queryUnifiedaccessinstanceEx(QueryUnifiedaccessinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedaccessinstanceResponse());
    }

    /**
     * Description: 获取统一接入单个实例信息
     * Summary: 获取统一接入单个实例信息
     */
    public GetUnifiedaccessinstanceResponse getUnifiedaccessinstance(GetUnifiedaccessinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnifiedaccessinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 获取统一接入单个实例信息
     * Summary: 获取统一接入单个实例信息
     */
    public GetUnifiedaccessinstanceResponse getUnifiedaccessinstanceEx(GetUnifiedaccessinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnifiedaccessinstanceResponse());
    }

    /**
     * Description: 删除统一接入实例
     * Summary: 删除统一接入实例
     */
    public DeleteUnifiedaccessinstanceResponse deleteUnifiedaccessinstance(DeleteUnifiedaccessinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUnifiedaccessinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 删除统一接入实例
     * Summary: 删除统一接入实例
     */
    public DeleteUnifiedaccessinstanceResponse deleteUnifiedaccessinstanceEx(DeleteUnifiedaccessinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUnifiedaccessinstanceResponse());
    }

    /**
     * Description: 更新统一接入实例信息
     * Summary: 更新统一接入实例信息
     */
    public UpdateUnifiedaccessinstanceResponse updateUnifiedaccessinstance(UpdateUnifiedaccessinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUnifiedaccessinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 更新统一接入实例信息
     * Summary: 更新统一接入实例信息
     */
    public UpdateUnifiedaccessinstanceResponse updateUnifiedaccessinstanceEx(UpdateUnifiedaccessinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUnifiedaccessinstanceResponse());
    }

    /**
     * Description: ldc 对接统一发布 openAPI
     * Summary: ldc 对接统一发布 openAPI
     */
    public ExecUnireleasespiResponse execUnireleasespi(ExecUnireleasespiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execUnireleasespiEx(request, headers, runtime);
    }

    /**
     * Description: ldc 对接统一发布 openAPI
     * Summary: ldc 对接统一发布 openAPI
     */
    public ExecUnireleasespiResponse execUnireleasespiEx(ExecUnireleasespiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unireleasespi.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecUnireleasespiResponse());
    }

    /**
     * Description: 用于创建 fed spanner 集群
     * Summary: 创建 fed spanner 集群
     */
    public CreateFedspannerclusterResponse createFedspannercluster(CreateFedspannerclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFedspannerclusterEx(request, headers, runtime);
    }

    /**
     * Description: 用于创建 fed spanner 集群
     * Summary: 创建 fed spanner 集群
     */
    public CreateFedspannerclusterResponse createFedspannerclusterEx(CreateFedspannerclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFedspannerclusterResponse());
    }

    /**
     * Description: 查询联邦fed spanner 集群状态信息
     * Summary: 查询 fed spanner 集群
     */
    public QueryFedspannerclusterResponse queryFedspannercluster(QueryFedspannerclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFedspannerclusterEx(request, headers, runtime);
    }

    /**
     * Description: 查询联邦fed spanner 集群状态信息
     * Summary: 查询 fed spanner 集群
     */
    public QueryFedspannerclusterResponse queryFedspannerclusterEx(QueryFedspannerclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFedspannerclusterResponse());
    }

    /**
     * Description: 通过fed集群 name 获取单个集群详细信息
     * Summary: 获取单个fed spanner 集群信息
     */
    public GetFedspannerclusterResponse getFedspannercluster(GetFedspannerclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFedspannerclusterEx(request, headers, runtime);
    }

    /**
     * Description: 通过fed集群 name 获取单个集群详细信息
     * Summary: 获取单个fed spanner 集群信息
     */
    public GetFedspannerclusterResponse getFedspannerclusterEx(GetFedspannerclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFedspannerclusterResponse());
    }

    /**
     * Description: 展示所有联邦 spanner 集群
     * Summary: 展示所有联邦 spanner 集群
     */
    public ListFedspannerclusterResponse listFedspannercluster(ListFedspannerclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFedspannerclusterEx(request, headers, runtime);
    }

    /**
     * Description: 展示所有联邦 spanner 集群
     * Summary: 展示所有联邦 spanner 集群
     */
    public ListFedspannerclusterResponse listFedspannerclusterEx(ListFedspannerclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFedspannerclusterResponse());
    }

    /**
     * Description: 删除指定fed spanner集群
     * Summary: 删除 联邦spanner集群
     */
    public DeleteFedspannerclusterResponse deleteFedspannercluster(DeleteFedspannerclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFedspannerclusterEx(request, headers, runtime);
    }

    /**
     * Description: 删除指定fed spanner集群
     * Summary: 删除 联邦spanner集群
     */
    public DeleteFedspannerclusterResponse deleteFedspannerclusterEx(DeleteFedspannerclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFedspannerclusterResponse());
    }

    /**
     * Description: 批量删除指定集群
     * Summary: 批量删除 fed spanner 集群
     */
    public BatchdeleteFedspannerclusterResponse batchdeleteFedspannercluster(BatchdeleteFedspannerclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteFedspannerclusterEx(request, headers, runtime);
    }

    /**
     * Description: 批量删除指定集群
     * Summary: 批量删除 fed spanner 集群
     */
    public BatchdeleteFedspannerclusterResponse batchdeleteFedspannerclusterEx(BatchdeleteFedspannerclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteFedspannerclusterResponse());
    }

    /**
     * Description: 更新 fed spanner 集群
     * Summary: 更新 fed spanner 集群
     */
    public UpdateFedspannerclusterResponse updateFedspannercluster(UpdateFedspannerclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFedspannerclusterEx(request, headers, runtime);
    }

    /**
     * Description: 更新 fed spanner 集群
     * Summary: 更新 fed spanner 集群
     */
    public UpdateFedspannerclusterResponse updateFedspannerclusterEx(UpdateFedspannerclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFedspannerclusterResponse());
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     */
    public CreateReleaseplanResponse createReleaseplan(CreateReleaseplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createReleaseplanEx(request, headers, runtime);
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     */
    public CreateReleaseplanResponse createReleaseplanEx(CreateReleaseplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.releaseplan.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateReleaseplanResponse());
    }

    /**
     * Description: 需要指定fed spanner cluster name 和期望的合法状态
     * Summary: 更新 spanner 集群 状态
     */
    public UpdateFedspannerclusterStatusResponse updateFedspannerclusterStatus(UpdateFedspannerclusterStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFedspannerclusterStatusEx(request, headers, runtime);
    }

    /**
     * Description: 需要指定fed spanner cluster name 和期望的合法状态
     * Summary: 更新 spanner 集群 状态
     */
    public UpdateFedspannerclusterStatusResponse updateFedspannerclusterStatusEx(UpdateFedspannerclusterStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFedspannerclusterStatusResponse());
    }

    /**
     * Description: 添加antvip域名
     * Summary: 添加antvip域名
     */
    public AddAntvipDomainResponse addAntvipDomain(AddAntvipDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAntvipDomainEx(request, headers, runtime);
    }

    /**
     * Description: 添加antvip域名
     * Summary: 添加antvip域名
     */
    public AddAntvipDomainResponse addAntvipDomainEx(AddAntvipDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.antvip.domain.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAntvipDomainResponse());
    }

    /**
     * Description: 删除antvip域名
     * Summary: 删除antvip域名
     */
    public DeleteAntvipDomainResponse deleteAntvipDomain(DeleteAntvipDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAntvipDomainEx(request, headers, runtime);
    }

    /**
     * Description: 删除antvip域名
     * Summary: 删除antvip域名
     */
    public DeleteAntvipDomainResponse deleteAntvipDomainEx(DeleteAntvipDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.antvip.domain.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAntvipDomainResponse());
    }

    /**
     * Description: 查询容器服务 Ingress 列表。
     * Summary: 查询容器服务 Ingress 列表。
     */
    public ListContainerserviceIngressResponse listContainerserviceIngress(ListContainerserviceIngressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContainerserviceIngressEx(request, headers, runtime);
    }

    /**
     * Description: 查询容器服务 Ingress 列表。
     * Summary: 查询容器服务 Ingress 列表。
     */
    public ListContainerserviceIngressResponse listContainerserviceIngressEx(ListContainerserviceIngressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.ingress.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContainerserviceIngressResponse());
    }

    /**
     * Description: 创建一个运维单
     * Summary: 创建一个运维单
     */
    public CreateContainerserviceOperationResponse createContainerserviceOperation(CreateContainerserviceOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContainerserviceOperationEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个运维单
     * Summary: 创建一个运维单
     */
    public CreateContainerserviceOperationResponse createContainerserviceOperationEx(CreateContainerserviceOperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.operation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContainerserviceOperationResponse());
    }

    /**
     * Description: 查询多集群k8s事件
     * Summary: 查询多集群k8s event
     */
    public ListMulticlusterEventsResponse listMulticlusterEvents(ListMulticlusterEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMulticlusterEventsEx(request, headers, runtime);
    }

    /**
     * Description: 查询多集群k8s事件
     * Summary: 查询多集群k8s event
     */
    public ListMulticlusterEventsResponse listMulticlusterEventsEx(ListMulticlusterEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.multicluster.events.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMulticlusterEventsResponse());
    }

    /**
     * Description: 部署单提交审批申请
     * Summary: 部署单提交审批申请
     */
    public ApplyContainerserviceDeploymentResponse applyContainerserviceDeployment(ApplyContainerserviceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContainerserviceDeploymentEx(request, headers, runtime);
    }

    /**
     * Description: 部署单提交审批申请
     * Summary: 部署单提交审批申请
     */
    public ApplyContainerserviceDeploymentResponse applyContainerserviceDeploymentEx(ApplyContainerserviceDeploymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.deployment.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContainerserviceDeploymentResponse());
    }

    /**
     * Description: 蓝绿发布调整Ingress流量权重比例
     * Summary: 蓝绿发布调整Ingress流量权重比例
     */
    public UpdateIngressTrafficweightResponse updateIngressTrafficweight(UpdateIngressTrafficweightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIngressTrafficweightEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿发布调整Ingress流量权重比例
     * Summary: 蓝绿发布调整Ingress流量权重比例
     */
    public UpdateIngressTrafficweightResponse updateIngressTrafficweightEx(UpdateIngressTrafficweightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.ingress.trafficweight.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIngressTrafficweightResponse());
    }

    /**
     * Description: 蓝绿发布查询单蓝区信息
     * Summary: 蓝绿发布查询单蓝区信息
     */
    public GetOpsplanBluedetailResponse getOpsplanBluedetail(GetOpsplanBluedetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOpsplanBluedetailEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿发布查询单蓝区信息
     * Summary: 蓝绿发布查询单蓝区信息
     */
    public GetOpsplanBluedetailResponse getOpsplanBluedetailEx(GetOpsplanBluedetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.bluedetail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetOpsplanBluedetailResponse());
    }

    /**
     * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
     * Summary: 蓝绿发布查询Ingress流量权重
     */
    public ListIngressTrafficweightResponse listIngressTrafficweight(ListIngressTrafficweightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIngressTrafficweightEx(request, headers, runtime);
    }

    /**
     * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
     * Summary: 蓝绿发布查询Ingress流量权重
     */
    public ListIngressTrafficweightResponse listIngressTrafficweightEx(ListIngressTrafficweightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.ingress.trafficweight.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIngressTrafficweightResponse());
    }

    /**
     * Description: 基于OAM模型创建包含多应用服务的应用
     * Summary: 创建包含多应用服务的应用
     */
    public CreateOamserviceApplicationconfigurationResponse createOamserviceApplicationconfiguration(CreateOamserviceApplicationconfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOamserviceApplicationconfigurationEx(request, headers, runtime);
    }

    /**
     * Description: 基于OAM模型创建包含多应用服务的应用
     * Summary: 创建包含多应用服务的应用
     */
    public CreateOamserviceApplicationconfigurationResponse createOamserviceApplicationconfigurationEx(CreateOamserviceApplicationconfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.oamservice.applicationconfiguration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOamserviceApplicationconfigurationResponse());
    }

    /**
     * Description: 用于创建联邦负载均衡实例
     * Summary: 创建联邦负载均衡实例
     */
    public CreateFedloadbalancerResponse createFedloadbalancer(CreateFedloadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFedloadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: 用于创建联邦负载均衡实例
     * Summary: 创建联邦负载均衡实例
     */
    public CreateFedloadbalancerResponse createFedloadbalancerEx(CreateFedloadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFedloadbalancerResponse());
    }

    /**
     * Description: 更新联邦负载均衡实例
     * Summary: 更新联邦负载均衡实例
     */
    public UpdateFedloadbalancerResponse updateFedloadbalancer(UpdateFedloadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFedloadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: 更新联邦负载均衡实例
     * Summary: 更新联邦负载均衡实例
     */
    public UpdateFedloadbalancerResponse updateFedloadbalancerEx(UpdateFedloadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFedloadbalancerResponse());
    }

    /**
     * Description: list联邦负载均衡实例
     * Summary: list联邦负载均衡实例
     */
    public ListFedloadbalancerResponse listFedloadbalancer(ListFedloadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFedloadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: list联邦负载均衡实例
     * Summary: list联邦负载均衡实例
     */
    public ListFedloadbalancerResponse listFedloadbalancerEx(ListFedloadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFedloadbalancerResponse());
    }

    /**
     * Description: 删除联邦负载均衡
     * Summary: 删除联邦负载均衡实例
     */
    public DeleteFedloadbalancerResponse deleteFedloadbalancer(DeleteFedloadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFedloadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: 删除联邦负载均衡
     * Summary: 删除联邦负载均衡实例
     */
    public DeleteFedloadbalancerResponse deleteFedloadbalancerEx(DeleteFedloadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteFedloadbalancerResponse());
    }

    /**
     * Description: 查询单个联邦负载均衡实例
     * Summary: 查询单个联邦负载均衡实例
     */
    public GetFedloadbalancerResponse getFedloadbalancer(GetFedloadbalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFedloadbalancerEx(request, headers, runtime);
    }

    /**
     * Description: 查询单个联邦负载均衡实例
     * Summary: 查询单个联邦负载均衡实例
     */
    public GetFedloadbalancerResponse getFedloadbalancerEx(GetFedloadbalancerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFedloadbalancerResponse());
    }

    /**
     * Description: 导入统一解决方案
     * Summary: 导入统一解决方案
     */
    public ImportUnireleaseSolutionResponse importUnireleaseSolution(ImportUnireleaseSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importUnireleaseSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 导入统一解决方案
     * Summary: 导入统一解决方案
     */
    public ImportUnireleaseSolutionResponse importUnireleaseSolutionEx(ImportUnireleaseSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.solution.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportUnireleaseSolutionResponse());
    }

    /**
     * Description: 查询解决方案列表
     * Summary: 查询解决方案列表
     */
    public ListUnireleaseSolutionsResponse listUnireleaseSolutions(ListUnireleaseSolutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUnireleaseSolutionsEx(request, headers, runtime);
    }

    /**
     * Description: 查询解决方案列表
     * Summary: 查询解决方案列表
     */
    public ListUnireleaseSolutionsResponse listUnireleaseSolutionsEx(ListUnireleaseSolutionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.solutions.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUnireleaseSolutionsResponse());
    }

    /**
     * Description: 查询解决方案发布详情
     * Summary: 查询解决方案发布详情
     */
    public GetUnireleaseSolutionResponse getUnireleaseSolution(GetUnireleaseSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnireleaseSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 查询解决方案发布详情
     * Summary: 查询解决方案发布详情
     */
    public GetUnireleaseSolutionResponse getUnireleaseSolutionEx(GetUnireleaseSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.solution.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnireleaseSolutionResponse());
    }

    /**
     * Description: 查询解决方案发布状态
     * Summary: 查询解决方案发布状态
     */
    public GetUnireleasePipelineResponse getUnireleasePipeline(GetUnireleasePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnireleasePipelineEx(request, headers, runtime);
    }

    /**
     * Description: 查询解决方案发布状态
     * Summary: 查询解决方案发布状态
     */
    public GetUnireleasePipelineResponse getUnireleasePipelineEx(GetUnireleasePipelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.pipeline.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnireleasePipelineResponse());
    }

    /**
     * Description: 执行机构发布单
     * Summary: 执行机构发布单
     */
    public ExecUnireleasePipelinesResponse execUnireleasePipelines(ExecUnireleasePipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execUnireleasePipelinesEx(request, headers, runtime);
    }

    /**
     * Description: 执行机构发布单
     * Summary: 执行机构发布单
     */
    public ExecUnireleasePipelinesResponse execUnireleasePipelinesEx(ExecUnireleasePipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.pipelines.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecUnireleasePipelinesResponse());
    }

    /**
     * Description: 根据解决方案反查相关租户信息
     * Summary: 根据解决方案反查相关租户信息
     */
    public GetUnireleaseTenantsResponse getUnireleaseTenants(GetUnireleaseTenantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnireleaseTenantsEx(request, headers, runtime);
    }

    /**
     * Description: 根据解决方案反查相关租户信息
     * Summary: 根据解决方案反查相关租户信息
     */
    public GetUnireleaseTenantsResponse getUnireleaseTenantsEx(GetUnireleaseTenantsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.tenants.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnireleaseTenantsResponse());
    }

    /**
     * Description: 添加中间接变更配置
     * Summary: 添加中间接变更配置
     */
    public AddContainerserviceMiddlewareconfigResponse addContainerserviceMiddlewareconfig(AddContainerserviceMiddlewareconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContainerserviceMiddlewareconfigEx(request, headers, runtime);
    }

    /**
     * Description: 添加中间接变更配置
     * Summary: 添加中间接变更配置
     */
    public AddContainerserviceMiddlewareconfigResponse addContainerserviceMiddlewareconfigEx(AddContainerserviceMiddlewareconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.middlewareconfig.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContainerserviceMiddlewareconfigResponse());
    }

    /**
     * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
     * Summary: 计算分批结果
     */
    public ExportOpsplanStagesResponse exportOpsplanStages(ExportOpsplanStagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportOpsplanStagesEx(request, headers, runtime);
    }

    /**
     * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
     * Summary: 计算分批结果
     */
    public ExportOpsplanStagesResponse exportOpsplanStagesEx(ExportOpsplanStagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.opsplan.stages.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportOpsplanStagesResponse());
    }

    /**
     * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
     * Summary: 应用（服务）基础信息
     */
    public DetailAppMetainfoResponse detailAppMetainfo(DetailAppMetainfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailAppMetainfoEx(request, headers, runtime);
    }

    /**
     * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
     * Summary: 应用（服务）基础信息
     */
    public DetailAppMetainfoResponse detailAppMetainfoEx(DetailAppMetainfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.app.metainfo.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailAppMetainfoResponse());
    }

    /**
     * Description: 为指定sidecar更新版本信息，如镜像，feature等
     * Summary: 更新sidecar版本
     */
    public UpdateSidecaropsResponse updateSidecarops(UpdateSidecaropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecaropsEx(request, headers, runtime);
    }

    /**
     * Description: 为指定sidecar更新版本信息，如镜像，feature等
     * Summary: 更新sidecar版本
     */
    public UpdateSidecaropsResponse updateSidecaropsEx(UpdateSidecaropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecaropsResponse());
    }

    /**
     * Description: 查询应用服务当前的部署单元，及部署副本数
     * Summary: 查询应用服务当前的部署单元，及部署副本数
     */
    public CountContainerserviceCellreplicasResponse countContainerserviceCellreplicas(CountContainerserviceCellreplicasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countContainerserviceCellreplicasEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用服务当前的部署单元，及部署副本数
     * Summary: 查询应用服务当前的部署单元，及部署副本数
     */
    public CountContainerserviceCellreplicasResponse countContainerserviceCellreplicasEx(CountContainerserviceCellreplicasRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.cellreplicas.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountContainerserviceCellreplicasResponse());
    }

    /**
     * Description: 获取指定类型sidecar的template列表，最多20条。
     * Summary: 获取sidecar的template列表
     */
    public ListSidecaropsTemplateResponse listSidecaropsTemplate(ListSidecaropsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSidecaropsTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定类型sidecar的template列表，最多20条。
     * Summary: 获取sidecar的template列表
     */
    public ListSidecaropsTemplateResponse listSidecaropsTemplateEx(ListSidecaropsTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.template.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSidecaropsTemplateResponse());
    }

    /**
     * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
     * Summary: 应用sidecar更新的一致性拉齐
     */
    public UpdateSidecaropsConsistencyResponse updateSidecaropsConsistency(UpdateSidecaropsConsistencyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecaropsConsistencyEx(request, headers, runtime);
    }

    /**
     * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
     * Summary: 应用sidecar更新的一致性拉齐
     */
    public UpdateSidecaropsConsistencyResponse updateSidecaropsConsistencyEx(UpdateSidecaropsConsistencyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.consistency.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecaropsConsistencyResponse());
    }

    /**
     * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
     * Summary: 版本清理
     */
    public FinishSidecaropsResponse finishSidecarops(FinishSidecaropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishSidecaropsEx(request, headers, runtime);
    }

    /**
     * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
     * Summary: 版本清理
     */
    public FinishSidecaropsResponse finishSidecaropsEx(FinishSidecaropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishSidecaropsResponse());
    }

    /**
     * Description: 查询rd的当前状态。
     * Summary: 查询更新状态
     */
    public QuerySidecaropsStateResponse querySidecaropsState(QuerySidecaropsStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySidecaropsStateEx(request, headers, runtime);
    }

    /**
     * Description: 查询rd的当前状态。
     * Summary: 查询更新状态
     */
    public QuerySidecaropsStateResponse querySidecaropsStateEx(QuerySidecaropsStateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.state.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySidecaropsStateResponse());
    }

    /**
     * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
     * Summary: 添加sidecar基础模板
     */
    public AddSidecaropsTemplateResponse addSidecaropsTemplate(AddSidecaropsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSidecaropsTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
     * Summary: 添加sidecar基础模板
     */
    public AddSidecaropsTemplateResponse addSidecaropsTemplateEx(AddSidecaropsTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.template.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSidecaropsTemplateResponse());
    }

    /**
     * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
     * Summary: 查询应用发布sidecar升级的相关记录
     */
    public QuerySidecaropsReleaseinfoResponse querySidecaropsReleaseinfo(QuerySidecaropsReleaseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySidecaropsReleaseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
     * Summary: 查询应用发布sidecar升级的相关记录
     */
    public QuerySidecaropsReleaseinfoResponse querySidecaropsReleaseinfoEx(QuerySidecaropsReleaseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.releaseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySidecaropsReleaseinfoResponse());
    }

    /**
     * Description: 给存量应用服务注入sidecar，应用服务需已经创建
     * Summary: 初始化注入sidecar
     */
    public InitSidecaropsResponse initSidecarops(InitSidecaropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initSidecaropsEx(request, headers, runtime);
    }

    /**
     * Description: 给存量应用服务注入sidecar，应用服务需已经创建
     * Summary: 初始化注入sidecar
     */
    public InitSidecaropsResponse initSidecaropsEx(InitSidecaropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitSidecaropsResponse());
    }

    /**
     * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
     * Summary: 重启sidecar容器
     */
    public RebootSidecaropsResponse rebootSidecarops(RebootSidecaropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebootSidecaropsEx(request, headers, runtime);
    }

    /**
     * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
     * Summary: 重启sidecar容器
     */
    public RebootSidecaropsResponse rebootSidecaropsEx(RebootSidecaropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.reboot", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RebootSidecaropsResponse());
    }

    /**
     * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
     * Summary: 删除指定版本
     */
    public DeleteContainerserviceRevisionResponse deleteContainerserviceRevision(DeleteContainerserviceRevisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContainerserviceRevisionEx(request, headers, runtime);
    }

    /**
     * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
     * Summary: 删除指定版本
     */
    public DeleteContainerserviceRevisionResponse deleteContainerserviceRevisionEx(DeleteContainerserviceRevisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.revision.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContainerserviceRevisionResponse());
    }

    /**
     * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
     * Summary: 手动执行 hook 配置的 api
     */
    public ExecContainerserviceApihookResponse execContainerserviceApihook(ExecContainerserviceApihookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContainerserviceApihookEx(request, headers, runtime);
    }

    /**
     * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
     * Summary: 手动执行 hook 配置的 api
     */
    public ExecContainerserviceApihookResponse execContainerserviceApihookEx(ExecContainerserviceApihookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.apihook.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContainerserviceApihookResponse());
    }

    /**
     * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
     * Summary: 获取已发布应用服务配置
     */
    public QuerySidecaropsAllservicesResponse querySidecaropsAllservices(QuerySidecaropsAllservicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySidecaropsAllservicesEx(request, headers, runtime);
    }

    /**
     * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
     * Summary: 获取已发布应用服务配置
     */
    public QuerySidecaropsAllservicesResponse querySidecaropsAllservicesEx(QuerySidecaropsAllservicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.allservices.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySidecaropsAllservicesResponse());
    }

    /**
     * Description: 可用于更新基线模板的作用范围等
     * Summary: 更新sidecar基线模板
     */
    public UpdateSidecaropsTemplateResponse updateSidecaropsTemplate(UpdateSidecaropsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSidecaropsTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 可用于更新基线模板的作用范围等
     * Summary: 更新sidecar基线模板
     */
    public UpdateSidecaropsTemplateResponse updateSidecaropsTemplateEx(UpdateSidecaropsTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.template.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSidecaropsTemplateResponse());
    }

    /**
     * Description: 创建发布模板
     * Summary: 创建发布模板
     */
    public CreateDeploymentTemplateResponse createDeploymentTemplate(CreateDeploymentTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeploymentTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 创建发布模板
     * Summary: 创建发布模板
     */
    public CreateDeploymentTemplateResponse createDeploymentTemplateEx(CreateDeploymentTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDeploymentTemplateResponse());
    }

    /**
     * Description: 查询发布方案文件列表
     * Summary: 查询发布方案文件列表
     */
    public QueryUnireleaseSolutionfilesResponse queryUnireleaseSolutionfiles(QueryUnireleaseSolutionfilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnireleaseSolutionfilesEx(request, headers, runtime);
    }

    /**
     * Description: 查询发布方案文件列表
     * Summary: 查询发布方案文件列表
     */
    public QueryUnireleaseSolutionfilesResponse queryUnireleaseSolutionfilesEx(QueryUnireleaseSolutionfilesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.solutionfiles.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnireleaseSolutionfilesResponse());
    }

    /**
     * Description: 获取发布方案文件内容
     * Summary: 获取发布方案文件内容
     */
    public GetUnireleaseSolutionfileResponse getUnireleaseSolutionfile(GetUnireleaseSolutionfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUnireleaseSolutionfileEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布方案文件内容
     * Summary: 获取发布方案文件内容
     */
    public GetUnireleaseSolutionfileResponse getUnireleaseSolutionfileEx(GetUnireleaseSolutionfileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unirelease.solutionfile.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUnireleaseSolutionfileResponse());
    }

    /**
     * Description: 更新发布模板
     * Summary: 更新发布模板
     */
    public UpdateDeploymentTemplateResponse updateDeploymentTemplate(UpdateDeploymentTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeploymentTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 更新发布模板
     * Summary: 更新发布模板
     */
    public UpdateDeploymentTemplateResponse updateDeploymentTemplateEx(UpdateDeploymentTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.template.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDeploymentTemplateResponse());
    }

    /**
     * Description: 查询发布模板
     * Summary: 查询发布模板
     */
    public ListDeploymentTemplateResponse listDeploymentTemplate(ListDeploymentTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeploymentTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 查询发布模板
     * Summary: 查询发布模板
     */
    public ListDeploymentTemplateResponse listDeploymentTemplateEx(ListDeploymentTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.template.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDeploymentTemplateResponse());
    }

    /**
     * Description: 删除发布模板
     * Summary: 删除发布模板
     */
    public DeleteDeploymentTemplateResponse deleteDeploymentTemplate(DeleteDeploymentTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeploymentTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 删除发布模板
     * Summary: 删除发布模板
     */
    public DeleteDeploymentTemplateResponse deleteDeploymentTemplateEx(DeleteDeploymentTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.deployment.template.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDeploymentTemplateResponse());
    }

    /**
     * Description: 查询守夜人预案列表
     * Summary: 查询守夜人预案列表
     */
    public ListEmergencyPlansResponse listEmergencyPlans(ListEmergencyPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEmergencyPlansEx(request, headers, runtime);
    }

    /**
     * Description: 查询守夜人预案列表
     * Summary: 查询守夜人预案列表
     */
    public ListEmergencyPlansResponse listEmergencyPlansEx(ListEmergencyPlansRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.emergency.plans.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListEmergencyPlansResponse());
    }

    /**
     * Description: 修改灰度发布规则
     * Summary: 修改灰度发布规则
     */
    public UpdateContainerserviceGrayreleaseconfigResponse updateContainerserviceGrayreleaseconfig(UpdateContainerserviceGrayreleaseconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceGrayreleaseconfigEx(request, headers, runtime);
    }

    /**
     * Description: 修改灰度发布规则
     * Summary: 修改灰度发布规则
     */
    public UpdateContainerserviceGrayreleaseconfigResponse updateContainerserviceGrayreleaseconfigEx(UpdateContainerserviceGrayreleaseconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.grayreleaseconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceGrayreleaseconfigResponse());
    }

    /**
     * Description: 查询（灰度）发布单的灰度发布配置
     * Summary: 查询（灰度）发布单的灰度发布配置
     */
    public QueryContainerserivceGrayreleaseconfigResponse queryContainerserivceGrayreleaseconfig(QueryContainerserivceGrayreleaseconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContainerserivceGrayreleaseconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询（灰度）发布单的灰度发布配置
     * Summary: 查询（灰度）发布单的灰度发布配置
     */
    public QueryContainerserivceGrayreleaseconfigResponse queryContainerserivceGrayreleaseconfigEx(QueryContainerserivceGrayreleaseconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerserivce.grayreleaseconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContainerserivceGrayreleaseconfigResponse());
    }

    /**
     * Description: 应用服务版本diff
     * Summary: 应用服务版本diff
     */
    public DetailContainerserviceRevisiondiffResponse detailContainerserviceRevisiondiff(DetailContainerserviceRevisiondiffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailContainerserviceRevisiondiffEx(request, headers, runtime);
    }

    /**
     * Description: 应用服务版本diff
     * Summary: 应用服务版本diff
     */
    public DetailContainerserviceRevisiondiffResponse detailContainerserviceRevisiondiffEx(DetailContainerserviceRevisiondiffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.revisiondiff.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailContainerserviceRevisiondiffResponse());
    }

    /**
     * Description: 可用于huanyu升级sidecar时，回滚变更单的执行，回滚到执行前的sidecar状态。
     * Summary: 回滚sidecar升级
     */
    public RollbackSidecaropsResponse rollbackSidecarops(RollbackSidecaropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackSidecaropsEx(request, headers, runtime);
    }

    /**
     * Description: 可用于huanyu升级sidecar时，回滚变更单的执行，回滚到执行前的sidecar状态。
     * Summary: 回滚sidecar升级
     */
    public RollbackSidecaropsResponse rollbackSidecaropsEx(RollbackSidecaropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackSidecaropsResponse());
    }

    /**
     * Description: 对一个运维操作中所有暂停的分组进行确认操作，lks1.36.0才支持
     * Summary: 确认运维
     */
    public ConfirmAppopsResponse confirmAppops(ConfirmAppopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmAppopsEx(request, headers, runtime);
    }

    /**
     * Description: 对一个运维操作中所有暂停的分组进行确认操作，lks1.36.0才支持
     * Summary: 确认运维
     */
    public ConfirmAppopsResponse confirmAppopsEx(ConfirmAppopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.appops.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmAppopsResponse());
    }

    /**
     * Description: 批量添加应用服务PVC和init Container
     * Summary: 批量添加应用服务PVC
     */
    public AddContainerserviceLogpvResponse addContainerserviceLogpv(AddContainerserviceLogpvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContainerserviceLogpvEx(request, headers, runtime);
    }

    /**
     * Description: 批量添加应用服务PVC和init Container
     * Summary: 批量添加应用服务PVC
     */
    public AddContainerserviceLogpvResponse addContainerserviceLogpvEx(AddContainerserviceLogpvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.logpv.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContainerserviceLogpvResponse());
    }

    /**
     * Description: 查询 fedservice 列表
     * Summary: 查询 fedservice 列表
     */
    public ListFederationServiceResponse listFederationService(ListFederationServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFederationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 查询 fedservice 列表
     * Summary: 查询 fedservice 列表
     */
    public ListFederationServiceResponse listFederationServiceEx(ListFederationServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.federation.service.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFederationServiceResponse());
    }

    /**
     * Description: 查询操作日志OpenAPI
     * Summary: 查询操作日志
     */
    public QueryOperationlogResponse queryOperationlog(QueryOperationlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOperationlogEx(request, headers, runtime);
    }

    /**
     * Description: 查询操作日志OpenAPI
     * Summary: 查询操作日志
     */
    public QueryOperationlogResponse queryOperationlogEx(QueryOperationlogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.operationlog.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOperationlogResponse());
    }

    /**
     * Description: 查询守夜人预案详情
     * Summary: 查询守夜人预案详情
     */
    public GetEmergencyPlansResponse getEmergencyPlans(GetEmergencyPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmergencyPlansEx(request, headers, runtime);
    }

    /**
     * Description: 查询守夜人预案详情
     * Summary: 查询守夜人预案详情
     */
    public GetEmergencyPlansResponse getEmergencyPlansEx(GetEmergencyPlansRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.emergency.plans.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetEmergencyPlansResponse());
    }

    /**
     * Description: 为统一接入集群添加可用区，必须是当前工作空间组下已规划的可用区。待添加的可用区内应有规划用于部署spanner容器的节点资源。
     * Summary: 为统一接入集群添加可用区
     */
    public AddFedspannerclusterZoneResponse addFedspannerclusterZone(AddFedspannerclusterZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFedspannerclusterZoneEx(request, headers, runtime);
    }

    /**
     * Description: 为统一接入集群添加可用区，必须是当前工作空间组下已规划的可用区。待添加的可用区内应有规划用于部署spanner容器的节点资源。
     * Summary: 为统一接入集群添加可用区
     */
    public AddFedspannerclusterZoneResponse addFedspannerclusterZoneEx(AddFedspannerclusterZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.fedspannercluster.zone.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddFedspannerclusterZoneResponse());
    }

    /**
     * Description: 为统一接入实例添加可用区，统一接入实例在新增的可用区内将增加一个入口（LVS VIP）。
     * Summary: 为统一接入实例添加可用区
     */
    public AddUnifiedaccessinstanceZoneResponse addUnifiedaccessinstanceZone(AddUnifiedaccessinstanceZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUnifiedaccessinstanceZoneEx(request, headers, runtime);
    }

    /**
     * Description: 为统一接入实例添加可用区，统一接入实例在新增的可用区内将增加一个入口（LVS VIP）。
     * Summary: 为统一接入实例添加可用区
     */
    public AddUnifiedaccessinstanceZoneResponse addUnifiedaccessinstanceZoneEx(AddUnifiedaccessinstanceZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.zone.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUnifiedaccessinstanceZoneResponse());
    }

    /**
     * Description: 通过jsonpatch方式更新应用服务配置
     * Summary: 通过jsonpatch更新应用服务配置
     */
    public UpdateContainerserviceJsonpatchResponse updateContainerserviceJsonpatch(UpdateContainerserviceJsonpatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerserviceJsonpatchEx(request, headers, runtime);
    }

    /**
     * Description: 通过jsonpatch方式更新应用服务配置
     * Summary: 通过jsonpatch更新应用服务配置
     */
    public UpdateContainerserviceJsonpatchResponse updateContainerserviceJsonpatchEx(UpdateContainerserviceJsonpatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.jsonpatch.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContainerserviceJsonpatchResponse());
    }

    /**
     * Description: 查看单元化管理中的单元组元数据
     * Summary: 查看单元化管理中的单元组元数据
     */
    public ListFlowCellgroupResponse listFlowCellgroup(ListFlowCellgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowCellgroupEx(request, headers, runtime);
    }

    /**
     * Description: 查看单元化管理中的单元组元数据
     * Summary: 查看单元化管理中的单元组元数据
     */
    public ListFlowCellgroupResponse listFlowCellgroupEx(ListFlowCellgroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.cellgroup.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListFlowCellgroupResponse());
    }

    /**
     * Description: 同步单元化元数据
     * Summary: 同步单元化元数据
     */
    public SyncFlowMetadataResponse syncFlowMetadata(SyncFlowMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFlowMetadataEx(request, headers, runtime);
    }

    /**
     * Description: 同步单元化元数据
     * Summary: 同步单元化元数据
     */
    public SyncFlowMetadataResponse syncFlowMetadataEx(SyncFlowMetadataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.metadata.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFlowMetadataResponse());
    }

    /**
     * Description: 发布单冲突检测
     * Summary: 发布单冲突检测
     */
    public CheckContainerserviceConflictopsResponse checkContainerserviceConflictops(CheckContainerserviceConflictopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkContainerserviceConflictopsEx(request, headers, runtime);
    }

    /**
     * Description: 发布单冲突检测
     * Summary: 发布单冲突检测
     */
    public CheckContainerserviceConflictopsResponse checkContainerserviceConflictopsEx(CheckContainerserviceConflictopsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.containerservice.conflictops.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckContainerserviceConflictopsResponse());
    }

    /**
     * Description: 单元化流量规则的容灾切换
     * Summary: 单元化流量规则的容灾切换
     */
    public ExecFlowDisasterswitchResponse execFlowDisasterswitch(ExecFlowDisasterswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execFlowDisasterswitchEx(request, headers, runtime);
    }

    /**
     * Description: 单元化流量规则的容灾切换
     * Summary: 单元化流量规则的容灾切换
     */
    public ExecFlowDisasterswitchResponse execFlowDisasterswitchEx(ExecFlowDisasterswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.flow.disasterswitch.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecFlowDisasterswitchResponse());
    }

    /**
     * Description: 取消sidecar工单，租户应用+sidecar type维度
     * Summary: 取消sidecar工单
     */
    public CancelSidecaropsResponse cancelSidecarops(CancelSidecaropsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSidecaropsEx(request, headers, runtime);
    }

    /**
     * Description: 取消sidecar工单，租户应用+sidecar type维度
     * Summary: 取消sidecar工单
     */
    public CancelSidecaropsResponse cancelSidecaropsEx(CancelSidecaropsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.ldc.sidecarops.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSidecaropsResponse());
    }
}
