// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ms.models.*;
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
                    new TeaPair("sdk_version", "3.4.0")
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
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     */
    public PersistpushMsDdcsResponse persistpushMsDdcs(PersistpushMsDdcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.persistpushMsDdcsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     */
    public PersistpushMsDdcsResponse persistpushMsDdcsEx(PersistpushMsDdcsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.persistpush", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PersistpushMsDdcsResponse());
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端
     */
    public QueryclientsMsDdcsResponse queryclientsMsDdcs(QueryclientsMsDdcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryclientsMsDdcsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端
     */
    public QueryclientsMsDdcsResponse queryclientsMsDdcsEx(QueryclientsMsDdcsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.queryclients", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryclientsMsDdcsResponse());
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源
     */
    public AddMsDdcsResourceResponse addMsDdcsResource(AddMsDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMsDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源
     */
    public AddMsDdcsResourceResponse addMsDdcsResourceEx(AddMsDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.resource.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddMsDdcsResourceResponse());
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源
     */
    public UpdateMsDdcsResourceResponse updateMsDdcsResource(UpdateMsDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMsDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源
     */
    public UpdateMsDdcsResourceResponse updateMsDdcsResourceEx(UpdateMsDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.resource.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMsDdcsResourceResponse());
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源
     */
    public DeleteMsDdcsResourceResponse deleteMsDdcsResource(DeleteMsDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMsDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源
     */
    public DeleteMsDdcsResourceResponse deleteMsDdcsResourceEx(DeleteMsDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.resource.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMsDdcsResourceResponse());
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性
     */
    public AddMsDdcsAttributeResponse addMsDdcsAttribute(AddMsDdcsAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMsDdcsAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性
     */
    public AddMsDdcsAttributeResponse addMsDdcsAttributeEx(AddMsDdcsAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.attribute.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddMsDdcsAttributeResponse());
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性
     */
    public UpdateMsDdcsAttributeResponse updateMsDdcsAttribute(UpdateMsDdcsAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMsDdcsAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性
     */
    public UpdateMsDdcsAttributeResponse updateMsDdcsAttributeEx(UpdateMsDdcsAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.attribute.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMsDdcsAttributeResponse());
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性
     */
    public DeleteMsDdcsAttributeResponse deleteMsDdcsAttribute(DeleteMsDdcsAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMsDdcsAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性
     */
    public DeleteMsDdcsAttributeResponse deleteMsDdcsAttributeEx(DeleteMsDdcsAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.attribute.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMsDdcsAttributeResponse());
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源
     */
    public SearchMsDdcsResourceResponse searchMsDdcsResource(SearchMsDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMsDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源
     */
    public SearchMsDdcsResourceResponse searchMsDdcsResourceEx(SearchMsDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.ddcs.resource.search", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SearchMsDdcsResourceResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     */
    public AddMsDssTaskResponse addMsDssTask(AddMsDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMsDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     */
    public AddMsDssTaskResponse addMsDssTaskEx(AddMsDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.dss.task.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddMsDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     */
    public UpdateMsDssTaskResponse updateMsDssTask(UpdateMsDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMsDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     */
    public UpdateMsDssTaskResponse updateMsDssTaskEx(UpdateMsDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.dss.task.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMsDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     */
    public DeleteMsDssTaskResponse deleteMsDssTask(DeleteMsDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMsDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     */
    public DeleteMsDssTaskResponse deleteMsDssTaskEx(DeleteMsDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.dss.task.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMsDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     */
    public SearchMsDssTaskResponse searchMsDssTask(SearchMsDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMsDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     */
    public SearchMsDssTaskResponse searchMsDssTaskEx(SearchMsDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.dss.task.search", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SearchMsDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略
     */
    public QueryMsDssTaskStrategyResponse queryMsDssTaskStrategy(QueryMsDssTaskStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMsDssTaskStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略
     */
    public QueryMsDssTaskStrategyResponse queryMsDssTaskStrategyEx(QueryMsDssTaskStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "ms.dss.task.strategy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMsDssTaskStrategyResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-机房信息(独占版)
     * Summary: 获取部署调度任务的所有机房
     */
    public ListDssIdcResponse listDssIdc(ListDssIdcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDssIdcEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-机房信息(独占版)
     * Summary: 获取部署调度任务的所有机房
     */
    public ListDssIdcResponse listDssIdcEx(ListDssIdcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.idc.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDssIdcResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-增加任务(独占版)
     * Summary: 独占版添加调度任务
     */
    public AddDssScheduleResponse addDssSchedule(AddDssScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDssScheduleEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-增加任务(独占版)
     * Summary: 独占版添加调度任务
     */
    public AddDssScheduleResponse addDssScheduleEx(AddDssScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.schedule.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDssScheduleResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-更新任务(独占版)
     * Summary: 更新调度任务
     */
    public UpdateDssScheduleResponse updateDssSchedule(UpdateDssScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDssScheduleEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-更新任务(独占版)
     * Summary: 更新调度任务
     */
    public UpdateDssScheduleResponse updateDssScheduleEx(UpdateDssScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.schedule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDssScheduleResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-查询调度任务(独占版)
     * Summary: 分页查询调度任务
     */
    public QueryDssScheduleResponse queryDssSchedule(QueryDssScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDssScheduleEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查询调度任务(独占版)
     * Summary: 分页查询调度任务
     */
    public QueryDssScheduleResponse queryDssScheduleEx(QueryDssScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.schedule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDssScheduleResponse());
    }

    /**
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     */
    public PersistpushDdcsDataResponse persistpushDdcsData(PersistpushDdcsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.persistpushDdcsDataEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     */
    public PersistpushDdcsDataResponse persistpushDdcsDataEx(PersistpushDdcsDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.data.persistpush", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PersistpushDdcsDataResponse());
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端
     */
    public QueryDdcsClientsResponse queryDdcsClients(QueryDdcsClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDdcsClientsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端
     */
    public QueryDdcsClientsResponse queryDdcsClientsEx(QueryDdcsClientsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.clients.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDdcsClientsResponse());
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源
     */
    public AddDdcsResourceResponse addDdcsResource(AddDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源
     */
    public AddDdcsResourceResponse addDdcsResourceEx(AddDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.resource.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDdcsResourceResponse());
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源
     */
    public UpdateDdcsResourceResponse updateDdcsResource(UpdateDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源
     */
    public UpdateDdcsResourceResponse updateDdcsResourceEx(UpdateDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.resource.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDdcsResourceResponse());
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源
     */
    public DeleteDdcsResourceResponse deleteDdcsResource(DeleteDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源
     */
    public DeleteDdcsResourceResponse deleteDdcsResourceEx(DeleteDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.resource.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDdcsResourceResponse());
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性
     */
    public AddDdcsAttributeResponse addDdcsAttribute(AddDdcsAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDdcsAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性
     */
    public AddDdcsAttributeResponse addDdcsAttributeEx(AddDdcsAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.attribute.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDdcsAttributeResponse());
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性
     */
    public UpdateDdcsAttributeResponse updateDdcsAttribute(UpdateDdcsAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDdcsAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性
     */
    public UpdateDdcsAttributeResponse updateDdcsAttributeEx(UpdateDdcsAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.attribute.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDdcsAttributeResponse());
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性
     */
    public DeleteDdcsAttributeResponse deleteDdcsAttribute(DeleteDdcsAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDdcsAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性
     */
    public DeleteDdcsAttributeResponse deleteDdcsAttributeEx(DeleteDdcsAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.attribute.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDdcsAttributeResponse());
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源
     */
    public SearchDdcsResourceResponse searchDdcsResource(SearchDdcsResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchDdcsResourceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源
     */
    public SearchDdcsResourceResponse searchDdcsResourceEx(SearchDdcsResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.ddcs.resource.search", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SearchDdcsResourceResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     */
    public AddDssTaskResponse addDssTask(AddDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     */
    public AddDssTaskResponse addDssTaskEx(AddDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.task.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     */
    public UpdateDssTaskResponse updateDssTask(UpdateDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     */
    public UpdateDssTaskResponse updateDssTaskEx(UpdateDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.task.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     */
    public DeleteDssTaskResponse deleteDssTask(DeleteDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     */
    public DeleteDssTaskResponse deleteDssTaskEx(DeleteDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.task.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     */
    public SearchDssTaskResponse searchDssTask(SearchDssTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchDssTaskEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     */
    public SearchDssTaskResponse searchDssTaskEx(SearchDssTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.task.search", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SearchDssTaskResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略
     */
    public QueryDssStrategyResponse queryDssStrategy(QueryDssStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDssStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略
     */
    public QueryDssStrategyResponse queryDssStrategyEx(QueryDssStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.strategy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDssStrategyResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务(独占版)
     * Summary: 删除调度任务
     */
    public DeleteDssScheduleResponse deleteDssSchedule(DeleteDssScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDssScheduleEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务(独占版)
     * Summary: 删除调度任务
     */
    public DeleteDssScheduleResponse deleteDssScheduleEx(DeleteDssScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.schedule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDssScheduleResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-执行单元切换
     * Summary: 定时任务执行单元切换
     */
    public ExecuteDssSwitchoverResponse executeDssSwitchover(ExecuteDssSwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeDssSwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-执行单元切换
     * Summary: 定时任务执行单元切换
     */
    public ExecuteDssSwitchoverResponse executeDssSwitchoverEx(ExecuteDssSwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.switchover.execute", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecuteDssSwitchoverResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-取消单元切换
     * Summary: 定时任务取消单元切换
     */
    public CancelDssSwitchoverResponse cancelDssSwitchover(CancelDssSwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDssSwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-取消单元切换
     * Summary: 定时任务取消单元切换
     */
    public CancelDssSwitchoverResponse cancelDssSwitchoverEx(CancelDssSwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.switchover.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDssSwitchoverResponse());
    }

    /**
     * Description: 微服务-分布式调度任务-查询单元切换状态
     * Summary: 查询定时任务单元切换状态
     */
    public QueryDssSwitchoverResponse queryDssSwitchover(QueryDssSwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDssSwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查询单元切换状态
     * Summary: 查询定时任务单元切换状态
     */
    public QueryDssSwitchoverResponse queryDssSwitchoverEx(QueryDssSwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.dss.switchover.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDssSwitchoverResponse());
    }

    /**
     * Description: 微服务-服务注册中心-注销服务
     * Summary: 注销服务
     */
    public LogoutRegistryServiceResponse logoutRegistryService(LogoutRegistryServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logoutRegistryServiceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-服务注册中心-注销服务
     * Summary: 注销服务
     */
    public LogoutRegistryServiceResponse logoutRegistryServiceEx(LogoutRegistryServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.ms.registry.service.logout", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LogoutRegistryServiceResponse());
    }

    /**
     * Description: 微服务-服务注册中心-服务挂流
     * Summary: 服务挂流
     */
    public OnlineRegistryServiceResponse onlineRegistryService(OnlineRegistryServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineRegistryServiceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-服务注册中心-服务挂流
     * Summary: 服务挂流
     */
    public OnlineRegistryServiceResponse onlineRegistryServiceEx(OnlineRegistryServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.registry.service.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineRegistryServiceResponse());
    }

    /**
     * Description: 查询实例标识
     * Summary: 查询实例标识
     */
    public ListSofaOspInstanceResponse listSofaOspInstance(ListSofaOspInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofaOspInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询实例标识
     * Summary: 查询实例标识
     */
    public ListSofaOspInstanceResponse listSofaOspInstanceEx(ListSofaOspInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.instance.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofaOspInstanceResponse());
    }

    /**
     * Description: 新增某个实例下的单元
     * Summary: 新增单元
     */
    public AddSofaOspCellResponse addSofaOspCell(AddSofaOspCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSofaOspCellEx(request, headers, runtime);
    }

    /**
     * Description: 新增某个实例下的单元
     * Summary: 新增单元
     */
    public AddSofaOspCellResponse addSofaOspCellEx(AddSofaOspCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.cell.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSofaOspCellResponse());
    }

    /**
     * Description: 删除某个实例下的单元
     * Summary: 删除单元
     */
    public DeleteSofaOspCellResponse deleteSofaOspCell(DeleteSofaOspCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofaOspCellEx(request, headers, runtime);
    }

    /**
     * Description: 删除某个实例下的单元
     * Summary: 删除单元
     */
    public DeleteSofaOspCellResponse deleteSofaOspCellEx(DeleteSofaOspCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.cell.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofaOspCellResponse());
    }

    /**
     * Description: 查询某个实例下的单元列表
     * Summary: 查询单元列表
     */
    public QuerySofaOspCellResponse querySofaOspCell(QuerySofaOspCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofaOspCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询某个实例下的单元列表
     * Summary: 查询单元列表
     */
    public QuerySofaOspCellResponse querySofaOspCellEx(QuerySofaOspCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.osp.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofaOspCellResponse());
    }

    /**
     * Description: Query service records.
     * Summary: query service record
     */
    public QueryServiceResponse queryService(QueryServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceEx(request, headers, runtime);
    }

    /**
     * Description: Query service records.
     * Summary: query service record
     */
    public QueryServiceResponse queryServiceEx(QueryServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.service.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceResponse());
    }

    /**
     * Description: Query service publishers.
     * Summary: query service publishers
     */
    public QueryServicePublisherResponse queryServicePublisher(QueryServicePublisherRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServicePublisherEx(request, headers, runtime);
    }

    /**
     * Description: Query service publishers.
     * Summary: query service publishers
     */
    public QueryServicePublisherResponse queryServicePublisherEx(QueryServicePublisherRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.service.publisher.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServicePublisherResponse());
    }

    /**
     * Description: Query service subscribers.
     * Summary: query service subscribers
     */
    public QueryServiceSubscriberResponse queryServiceSubscriber(QueryServiceSubscriberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceSubscriberEx(request, headers, runtime);
    }

    /**
     * Description: Query service subscribers.
     * Summary: query service subscribers
     */
    public QueryServiceSubscriberResponse queryServiceSubscriberEx(QueryServiceSubscriberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.service.subscriber.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryServiceSubscriberResponse());
    }

    /**
     * Description: Client operation, like logout all services published from the client.
     * Summary: Client operation
     */
    public AddServiceClientResponse addServiceClient(AddServiceClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addServiceClientEx(request, headers, runtime);
    }

    /**
     * Description: Client operation, like logout all services published from the client.
     * Summary: Client operation
     */
    public AddServiceClientResponse addServiceClientEx(AddServiceClientRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.service.client.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddServiceClientResponse());
    }

    /**
     * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
     * Summary: 模糊查询资源
     */
    public QueryDdcsResourcesResponse queryDdcsResources(QueryDdcsResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDdcsResourcesEx(request, headers, runtime);
    }

    /**
     * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
     * Summary: 模糊查询资源
     */
    public QueryDdcsResourcesResponse queryDdcsResourcesEx(QueryDdcsResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.resources.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDdcsResourcesResponse());
    }

    /**
     * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
     * Summary: 推送属性值
     */
    public AddDdcsDataResponse addDdcsData(AddDdcsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDdcsDataEx(request, headers, runtime);
    }

    /**
     * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
     * Summary: 推送属性值
     */
    public AddDdcsDataResponse addDdcsDataEx(AddDdcsDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.data.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDdcsDataResponse());
    }

    /**
     * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
     * Summary: 新增资源元数据
     */
    public AddDdcsResourcesResponse addDdcsResources(AddDdcsResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDdcsResourcesEx(request, headers, runtime);
    }

    /**
     * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
     * Summary: 新增资源元数据
     */
    public AddDdcsResourcesResponse addDdcsResourcesEx(AddDdcsResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.resources.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDdcsResourcesResponse());
    }

    /**
     * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
     * Summary: 更新资源元信息
     */
    public UpdateDdcsResourcesResponse updateDdcsResources(UpdateDdcsResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDdcsResourcesEx(request, headers, runtime);
    }

    /**
     * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
     * Summary: 更新资源元信息
     */
    public UpdateDdcsResourcesResponse updateDdcsResourcesEx(UpdateDdcsResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.resources.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDdcsResourcesResponse());
    }

    /**
     * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
     * Summary: 根据资源ID删除资源
     */
    public DeleteDdcsResourcesResponse deleteDdcsResources(DeleteDdcsResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDdcsResourcesEx(request, headers, runtime);
    }

    /**
     * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
     * Summary: 根据资源ID删除资源
     */
    public DeleteDdcsResourcesResponse deleteDdcsResourcesEx(DeleteDdcsResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.resources.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDdcsResourcesResponse());
    }

    /**
     * Description: 根据资源 ID 获取对应的资源元信息。
     * Summary: 根据资源自增长 ID 获取资源元信息
     */
    public GetDdcsResourcesResponse getDdcsResources(GetDdcsResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDdcsResourcesEx(request, headers, runtime);
    }

    /**
     * Description: 根据资源 ID 获取对应的资源元信息。
     * Summary: 根据资源自增长 ID 获取资源元信息
     */
    public GetDdcsResourcesResponse getDdcsResourcesEx(GetDdcsResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.resources.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDdcsResourcesResponse());
    }

    /**
     * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
     * Summary: 新增属性元信息
     */
    public AddDdcsAttributesResponse addDdcsAttributes(AddDdcsAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDdcsAttributesEx(request, headers, runtime);
    }

    /**
     * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
     * Summary: 新增属性元信息
     */
    public AddDdcsAttributesResponse addDdcsAttributesEx(AddDdcsAttributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.attributes.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDdcsAttributesResponse());
    }

    /**
     * Description: 根据属性 ID 更新属性元信息。
     * Summary: 更新属性元信息
     */
    public UpdateDdcsAttributesResponse updateDdcsAttributes(UpdateDdcsAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDdcsAttributesEx(request, headers, runtime);
    }

    /**
     * Description: 根据属性 ID 更新属性元信息。
     * Summary: 更新属性元信息
     */
    public UpdateDdcsAttributesResponse updateDdcsAttributesEx(UpdateDdcsAttributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.attributes.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDdcsAttributesResponse());
    }

    /**
     * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
     * Summary: 删除属性
     */
    public DeleteDdcsAttributesResponse deleteDdcsAttributes(DeleteDdcsAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDdcsAttributesEx(request, headers, runtime);
    }

    /**
     * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
     * Summary: 删除属性
     */
    public DeleteDdcsAttributesResponse deleteDdcsAttributesEx(DeleteDdcsAttributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.attributes.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDdcsAttributesResponse());
    }

    /**
     * Description: 根据属性 ID 获取对应的属性信息。
     * Summary: 获取属性
     */
    public GetDdcsAttributesResponse getDdcsAttributes(GetDdcsAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDdcsAttributesEx(request, headers, runtime);
    }

    /**
     * Description: 根据属性 ID 获取对应的属性信息。
     * Summary: 获取属性
     */
    public GetDdcsAttributesResponse getDdcsAttributesEx(GetDdcsAttributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.attributes.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDdcsAttributesResponse());
    }

    /**
     * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
     * Summary: 根据资源和属性名称获取属性信息
     */
    public QueryDdcsAttributesResponse queryDdcsAttributes(QueryDdcsAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDdcsAttributesEx(request, headers, runtime);
    }

    /**
     * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
     * Summary: 根据资源和属性名称获取属性信息
     */
    public QueryDdcsAttributesResponse queryDdcsAttributesEx(QueryDdcsAttributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.attributes.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDdcsAttributesResponse());
    }

    /**
     * Description: query job by specific id
     * Summary: query job
     */
    public GetDdsJobResponse getDdsJob(GetDdsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDdsJobEx(request, headers, runtime);
    }

    /**
     * Description: query job by specific id
     * Summary: query job
     */
    public GetDdsJobResponse getDdsJobEx(GetDdsJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.dds.job.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDdsJobResponse());
    }

    /**
     * Description: add job
     * Summary: add job
     */
    public AddDdsJobResponse addDdsJob(AddDdsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDdsJobEx(request, headers, runtime);
    }

    /**
     * Description: add job
     * Summary: add job
     */
    public AddDdsJobResponse addDdsJobEx(AddDdsJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.dds.job.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDdsJobResponse());
    }

    /**
     * Description: modify job by specific id
     * Summary: modify job
     */
    public UpdateDdsJobResponse updateDdsJob(UpdateDdsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDdsJobEx(request, headers, runtime);
    }

    /**
     * Description: modify job by specific id
     * Summary: modify job
     */
    public UpdateDdsJobResponse updateDdsJobEx(UpdateDdsJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.dds.job.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDdsJobResponse());
    }

    /**
     * Description: delete job by specific id
     * Summary: delete job
     */
    public DeleteDdsJobResponse deleteDdsJob(DeleteDdsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDdsJobEx(request, headers, runtime);
    }

    /**
     * Description: delete job by specific id
     * Summary: delete job
     */
    public DeleteDdsJobResponse deleteDdsJobEx(DeleteDdsJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.dds.job.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDdsJobResponse());
    }

    /**
     * Description: update status by specific id
     * Summary: update status
     */
    public UpdateDdsJobStatusResponse updateDdsJobStatus(UpdateDdsJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDdsJobStatusEx(request, headers, runtime);
    }

    /**
     * Description: update status by specific id
     * Summary: update status
     */
    public UpdateDdsJobStatusResponse updateDdsJobStatusEx(UpdateDdsJobStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.dds.job.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDdsJobStatusResponse());
    }

    /**
     * Description: 按 IP 灰度推送属性值。
     * Summary: 按IP灰度推送属性值
     */
    public AddDdcsGraydataResponse addDdcsGraydata(AddDdcsGraydataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDdcsGraydataEx(request, headers, runtime);
    }

    /**
     * Description: 按 IP 灰度推送属性值。
     * Summary: 按IP灰度推送属性值
     */
    public AddDdcsGraydataResponse addDdcsGraydataEx(AddDdcsGraydataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.graydata.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDdcsGraydataResponse());
    }

    /**
     * Description: 查询属性最后一次的推送值。
     * Summary: 查询属性最后一次推送值
     */
    public QueryDdcsDataResponse queryDdcsData(QueryDdcsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDdcsDataEx(request, headers, runtime);
    }

    /**
     * Description: 查询属性最后一次的推送值。
     * Summary: 查询属性最后一次推送值
     */
    public QueryDdcsDataResponse queryDdcsDataEx(QueryDdcsDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDdcsDataResponse());
    }

    /**
     * Description: query jobs
     * Summary: query jobs
     */
    public QueryDdsJobsResponse queryDdsJobs(QueryDdsJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDdsJobsEx(request, headers, runtime);
    }

    /**
     * Description: query jobs
     * Summary: query jobs
     */
    public QueryDdsJobsResponse queryDdsJobsEx(QueryDdsJobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.dds.jobs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDdsJobsResponse());
    }

    /**
     * Description: 查询属性下指定客户端的内存值。
     * Summary: 查询属性下指定客户端的内存值
     */
    public QueryDdcsClientvalueResponse queryDdcsClientvalue(QueryDdcsClientvalueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDdcsClientvalueEx(request, headers, runtime);
    }

    /**
     * Description: 查询属性下指定客户端的内存值。
     * Summary: 查询属性下指定客户端的内存值
     */
    public QueryDdcsClientvalueResponse queryDdcsClientvalueEx(QueryDdcsClientvalueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.clientvalue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDdcsClientvalueResponse());
    }

    /**
     * Description: 查询属性推送历史
     * Summary: 查询属性推送历史
     */
    public QueryDdcsPushhistoryResponse queryDdcsPushhistory(QueryDdcsPushhistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDdcsPushhistoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询属性推送历史
     * Summary: 查询属性推送历史
     */
    public QueryDdcsPushhistoryResponse queryDdcsPushhistoryEx(QueryDdcsPushhistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.pushhistory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDdcsPushhistoryResponse());
    }

    /**
     * Description: LDC模式部署获取所有zone
     * Summary: LDC模式部署获取所有zone
     */
    public QueryDssZoneResponse queryDssZone(QueryDssZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDssZoneEx(request, headers, runtime);
    }

    /**
     * Description: LDC模式部署获取所有zone
     * Summary: LDC模式部署获取所有zone
     */
    public QueryDssZoneResponse queryDssZoneEx(QueryDssZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.dss.zone.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDssZoneResponse());
    }

    /**
     * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
    由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
     * Summary: 回滚最近一次动态配置推送
     */
    public RollbackDdcsDataResponse rollbackDdcsData(RollbackDdcsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackDdcsDataEx(request, headers, runtime);
    }

    /**
     * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
    由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
     * Summary: 回滚最近一次动态配置推送
     */
    public RollbackDdcsDataResponse rollbackDdcsDataEx(RollbackDdcsDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.ddcs.data.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackDdcsDataResponse());
    }

    /**
     * Description: 根据服务接口查询服务鉴权规则
     * Summary: 根据服务接口查询服务鉴权规则
     */
    public ListSgAuthrulegroupsResponse listSgAuthrulegroups(ListSgAuthrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuthrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 根据服务接口查询服务鉴权规则
     * Summary: 根据服务接口查询服务鉴权规则
     */
    public ListSgAuthrulegroupsResponse listSgAuthrulegroupsEx(ListSgAuthrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroups.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuthrulegroupsResponse());
    }

    /**
     * Description: 查询表单元数据，支持哪些鉴权规则
     * Summary: 查询表单元数据
     */
    public QuerySgFormconfigResponse querySgFormconfig(QuerySgFormconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgFormconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询表单元数据，支持哪些鉴权规则
     * Summary: 查询表单元数据
     */
    public QuerySgFormconfigResponse querySgFormconfigEx(QuerySgFormconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.formconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgFormconfigResponse());
    }

    /**
     * Description: 清空黑白名单下所有鉴权规则
     * Summary: 清空黑白名单
     */
    public ReinitSgAuthrulesResponse reinitSgAuthrules(ReinitSgAuthrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitSgAuthrulesEx(request, headers, runtime);
    }

    /**
     * Description: 清空黑白名单下所有鉴权规则
     * Summary: 清空黑白名单
     */
    public ReinitSgAuthrulesResponse reinitSgAuthrulesEx(ReinitSgAuthrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrules.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitSgAuthrulesResponse());
    }

    /**
     * Description: 创建服务鉴权规则
     * Summary: 创建服务鉴权规则
     */
    public SaveSgAuthrulegroupsResponse saveSgAuthrulegroups(SaveSgAuthrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveSgAuthrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 创建服务鉴权规则
     * Summary: 创建服务鉴权规则
     */
    public SaveSgAuthrulegroupsResponse saveSgAuthrulegroupsEx(SaveSgAuthrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroups.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveSgAuthrulegroupsResponse());
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息
     */
    public SyncSgServicepublishersResponse syncSgServicepublishers(SyncSgServicepublishersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncSgServicepublishersEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息
     */
    public SyncSgServicepublishersResponse syncSgServicepublishersEx(SyncSgServicepublishersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicepublishers.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncSgServicepublishersResponse());
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息
     */
    public SyncSgServicesubscribersResponse syncSgServicesubscribers(SyncSgServicesubscribersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncSgServicesubscribersEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息
     */
    public SyncSgServicesubscribersResponse syncSgServicesubscribersEx(SyncSgServicesubscribersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicesubscribers.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncSgServicesubscribersResponse());
    }

    /**
     * Description: 微服务-同步客户端下线事件
     * Summary: 同步客户端下线事件
     */
    public SyncSgServiceclientsResponse syncSgServiceclients(SyncSgServiceclientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncSgServiceclientsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-同步客户端下线事件
     * Summary: 同步客户端下线事件
     */
    public SyncSgServiceclientsResponse syncSgServiceclientsEx(SyncSgServiceclientsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceclients.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncSgServiceclientsResponse());
    }

    /**
     * Description: 微服务-同步心跳数据
     * Summary: 同步心跳数据
     */
    public SyncSgServiceheartbeatsResponse syncSgServiceheartbeats(SyncSgServiceheartbeatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncSgServiceheartbeatsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-同步心跳数据
     * Summary: 同步心跳数据
     */
    public SyncSgServiceheartbeatsResponse syncSgServiceheartbeatsEx(SyncSgServiceheartbeatsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceheartbeats.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncSgServiceheartbeatsResponse());
    }

    /**
     * Description: 分页查询发布者信息
     * Summary: 分页查询发布者
     */
    public QuerySgServicepublishersResponse querySgServicepublishers(QuerySgServicepublishersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicepublishersEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询发布者信息
     * Summary: 分页查询发布者
     */
    public QuerySgServicepublishersResponse querySgServicepublishersEx(QuerySgServicepublishersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicepublishers.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicepublishersResponse());
    }

    /**
     * Description: 分页查询消费者
     * Summary: 分页查询消费者
     */
    public QuerySgServicesubscribersResponse querySgServicesubscribers(QuerySgServicesubscribersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicesubscribersEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询消费者
     * Summary: 分页查询消费者
     */
    public QuerySgServicesubscribersResponse querySgServicesubscribersEx(QuerySgServicesubscribersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicesubscribers.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicesubscribersResponse());
    }

    /**
     * Description: 根据dataId查询服务限流规则
     * Summary: 根据dataId查询服务限流规则
     */
    public QuerySgServiceratelimitrulesResponse querySgServiceratelimitrules(QuerySgServiceratelimitrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServiceratelimitrulesEx(request, headers, runtime);
    }

    /**
     * Description: 根据dataId查询服务限流规则
     * Summary: 根据dataId查询服务限流规则
     */
    public QuerySgServiceratelimitrulesResponse querySgServiceratelimitrulesEx(QuerySgServiceratelimitrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceratelimitrules.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServiceratelimitrulesResponse());
    }

    /**
     * Description: 新增限流规则
     * Summary: 新增限流规则
     */
    public AddSgServiceratelimitrulesResponse addSgServiceratelimitrules(AddSgServiceratelimitrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgServiceratelimitrulesEx(request, headers, runtime);
    }

    /**
     * Description: 新增限流规则
     * Summary: 新增限流规则
     */
    public AddSgServiceratelimitrulesResponse addSgServiceratelimitrulesEx(AddSgServiceratelimitrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceratelimitrules.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgServiceratelimitrulesResponse());
    }

    /**
     * Description: 更新服务限流规则
     * Summary: 更新服务限流规则
     */
    public UpdateSgServiceratelimitrulesResponse updateSgServiceratelimitrules(UpdateSgServiceratelimitrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgServiceratelimitrulesEx(request, headers, runtime);
    }

    /**
     * Description: 更新服务限流规则
     * Summary: 更新服务限流规则
     */
    public UpdateSgServiceratelimitrulesResponse updateSgServiceratelimitrulesEx(UpdateSgServiceratelimitrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceratelimitrules.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgServiceratelimitrulesResponse());
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteSgServiceratelimitrulesResponse deleteSgServiceratelimitrules(DeleteSgServiceratelimitrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgServiceratelimitrulesEx(request, headers, runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteSgServiceratelimitrulesResponse deleteSgServiceratelimitrulesEx(DeleteSgServiceratelimitrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceratelimitrules.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgServiceratelimitrulesResponse());
    }

    /**
     * Description: 禁用/启用限流规则
     * Summary: 禁用/启用限流规则
     */
    public UpdateSgServiceratelimitrulestatusResponse updateSgServiceratelimitrulestatus(UpdateSgServiceratelimitrulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgServiceratelimitrulestatusEx(request, headers, runtime);
    }

    /**
     * Description: 禁用/启用限流规则
     * Summary: 禁用/启用限流规则
     */
    public UpdateSgServiceratelimitrulestatusResponse updateSgServiceratelimitrulestatusEx(UpdateSgServiceratelimitrulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceratelimitrulestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgServiceratelimitrulestatusResponse());
    }

    /**
     * Description: 添加服务路由规则
     * Summary: 添加服务路由规则
     */
    public AddSgRouterrulegroupsResponse addSgRouterrulegroups(AddSgRouterrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgRouterrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 添加服务路由规则
     * Summary: 添加服务路由规则
     */
    public AddSgRouterrulegroupsResponse addSgRouterrulegroupsEx(AddSgRouterrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulegroups.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgRouterrulegroupsResponse());
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则
     */
    public GetSgRouterrulesResponse getSgRouterrules(GetSgRouterrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSgRouterrulesEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则
     */
    public GetSgRouterrulesResponse getSgRouterrulesEx(GetSgRouterrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrules.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSgRouterrulesResponse());
    }

    /**
     * Description: 更新服务路由规则
     * Summary: 更新服务路由规则
     */
    public UpdateSgRouterrulegroupsResponse updateSgRouterrulegroups(UpdateSgRouterrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgRouterrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 更新服务路由规则
     * Summary: 更新服务路由规则
     */
    public UpdateSgRouterrulegroupsResponse updateSgRouterrulegroupsEx(UpdateSgRouterrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulegroups.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgRouterrulegroupsResponse());
    }

    /**
     * Description: 微服务-启用路由器规则组
     * Summary: 启用路由器规则组
     */
    public EnableSgRouterrulesResponse enableSgRouterrules(EnableSgRouterrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgRouterrulesEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-启用路由器规则组
     * Summary: 启用路由器规则组
     */
    public EnableSgRouterrulesResponse enableSgRouterrulesEx(EnableSgRouterrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrules.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgRouterrulesResponse());
    }

    /**
     * Description: 获取路由规则组版本列表
     * Summary: 获取路由规则组版本列表
     */
    public ListSgRouterruleversionsResponse listSgRouterruleversions(ListSgRouterruleversionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgRouterruleversionsEx(request, headers, runtime);
    }

    /**
     * Description: 获取路由规则组版本列表
     * Summary: 获取路由规则组版本列表
     */
    public ListSgRouterruleversionsResponse listSgRouterruleversionsEx(ListSgRouterruleversionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerruleversions.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgRouterruleversionsResponse());
    }

    /**
     * Description: 获取路由规则状态
     * Summary: 获取路由规则状态
     */
    public QuerySgRouterrulestatusResponse querySgRouterrulestatus(QuerySgRouterrulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgRouterrulestatusEx(request, headers, runtime);
    }

    /**
     * Description: 获取路由规则状态
     * Summary: 获取路由规则状态
     */
    public QuerySgRouterrulestatusResponse querySgRouterrulestatusEx(QuerySgRouterrulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulestatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgRouterrulestatusResponse());
    }

    /**
     * Description: 删除鉴权规则
     * Summary: 删除鉴权规则
     */
    public DeleteSgAuthrulesResponse deleteSgAuthrules(DeleteSgAuthrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgAuthrulesEx(request, headers, runtime);
    }

    /**
     * Description: 删除鉴权规则
     * Summary: 删除鉴权规则
     */
    public DeleteSgAuthrulesResponse deleteSgAuthrulesEx(DeleteSgAuthrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrules.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgAuthrulesResponse());
    }

    /**
     * Description: 微服务-通过DataId获取AppNames
     * Summary: 通过DataId获取AppNames
     */
    public ListSgRouterruleappnamesResponse listSgRouterruleappnames(ListSgRouterruleappnamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgRouterruleappnamesEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-通过DataId获取AppNames
     * Summary: 通过DataId获取AppNames
     */
    public ListSgRouterruleappnamesResponse listSgRouterruleappnamesEx(ListSgRouterruleappnamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerruleappnames.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgRouterruleappnamesResponse());
    }

    /**
     * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
     * Summary: 启用服务鉴权黑、白名单
     */
    public EnableSgAuthrulegroupsResponse enableSgAuthrulegroups(EnableSgAuthrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgAuthrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
     * Summary: 启用服务鉴权黑、白名单
     */
    public EnableSgAuthrulegroupsResponse enableSgAuthrulegroupsEx(EnableSgAuthrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroups.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgAuthrulegroupsResponse());
    }

    /**
     * Description: 微服务-获取快照最后一个
     * Summary: 获取快照最后一个
     */
    public GetSgRouterrulesnapshotsResponse getSgRouterrulesnapshots(GetSgRouterrulesnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSgRouterrulesnapshotsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-获取快照最后一个
     * Summary: 获取快照最后一个
     */
    public GetSgRouterrulesnapshotsResponse getSgRouterrulesnapshotsEx(GetSgRouterrulesnapshotsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulesnapshots.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSgRouterrulesnapshotsResponse());
    }

    /**
     * Description: 微服务-回滚快照最后一个
     * Summary: 回滚快照最后一个
     */
    public RollbackSgRouterrulesnapshotsResponse rollbackSgRouterrulesnapshots(RollbackSgRouterrulesnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackSgRouterrulesnapshotsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-回滚快照最后一个
     * Summary: 回滚快照最后一个
     */
    public RollbackSgRouterrulesnapshotsResponse rollbackSgRouterrulesnapshotsEx(RollbackSgRouterrulesnapshotsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulesnapshots.rollback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RollbackSgRouterrulesnapshotsResponse());
    }

    /**
     * Description: 微服务-获取调度日志
     * Summary: 获取调度日志
     */
    public QuerySgRouterruledispatchlogsResponse querySgRouterruledispatchlogs(QuerySgRouterruledispatchlogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgRouterruledispatchlogsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-获取调度日志
     * Summary: 获取调度日志
     */
    public QuerySgRouterruledispatchlogsResponse querySgRouterruledispatchlogsEx(QuerySgRouterruledispatchlogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerruledispatchlogs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgRouterruledispatchlogsResponse());
    }

    /**
     * Description: 添加一条白、黑名单规则
     * Summary: 添加一条鉴权规则
     */
    public AddSgAuthrulesResponse addSgAuthrules(AddSgAuthrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgAuthrulesEx(request, headers, runtime);
    }

    /**
     * Description: 添加一条白、黑名单规则
     * Summary: 添加一条鉴权规则
     */
    public AddSgAuthrulesResponse addSgAuthrulesEx(AddSgAuthrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrules.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgAuthrulesResponse());
    }

    /**
     * Description: 更新一条服务鉴权规则
     * Summary: 更新一条服务鉴权规则
     */
    public UpdateSgAuthrulesResponse updateSgAuthrules(UpdateSgAuthrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgAuthrulesEx(request, headers, runtime);
    }

    /**
     * Description: 更新一条服务鉴权规则
     * Summary: 更新一条服务鉴权规则
     */
    public UpdateSgAuthrulesResponse updateSgAuthrulesEx(UpdateSgAuthrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrules.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgAuthrulesResponse());
    }

    /**
     * Description: 禁止一份服务鉴权黑、白名单
     * Summary: 禁止一份服务鉴权黑、白名单
     */
    public DisableSgAuthrulegroupsResponse disableSgAuthrulegroups(DisableSgAuthrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSgAuthrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 禁止一份服务鉴权黑、白名单
     * Summary: 禁止一份服务鉴权黑、白名单
     */
    public DisableSgAuthrulegroupsResponse disableSgAuthrulegroupsEx(DisableSgAuthrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroups.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSgAuthrulegroupsResponse());
    }

    /**
     * Description: 获取应用关联数据
     * Summary: 获取应用关联数据
     */
    public QuerySgApprelationsResponse querySgApprelations(QuerySgApprelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgApprelationsEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用关联数据
     * Summary: 获取应用关联数据
     */
    public QuerySgApprelationsResponse querySgApprelationsEx(QuerySgApprelationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.apprelations.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgApprelationsResponse());
    }

    /**
     * Description: 启用服务鉴权规则
     * Summary: 启用服务鉴权规则
     */
    public EnableSgAuthrulesResponse enableSgAuthrules(EnableSgAuthrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgAuthrulesEx(request, headers, runtime);
    }

    /**
     * Description: 启用服务鉴权规则
     * Summary: 启用服务鉴权规则
     */
    public EnableSgAuthrulesResponse enableSgAuthrulesEx(EnableSgAuthrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrules.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgAuthrulesResponse());
    }

    /**
     * Description: 禁用黑、白名单中的一条规则
     * Summary: 禁用黑、白名单中的一条规则
     */
    public DisableSgAuthrulesResponse disableSgAuthrules(DisableSgAuthrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSgAuthrulesEx(request, headers, runtime);
    }

    /**
     * Description: 禁用黑、白名单中的一条规则
     * Summary: 禁用黑、白名单中的一条规则
     */
    public DisableSgAuthrulesResponse disableSgAuthrulesEx(DisableSgAuthrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrules.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSgAuthrulesResponse());
    }

    /**
     * Description: 获取服务发布者关系
     * Summary: 获取服务发布者关系
     */
    public QuerySgServicepubrelationsResponse querySgServicepubrelations(QuerySgServicepubrelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicepubrelationsEx(request, headers, runtime);
    }

    /**
     * Description: 获取服务发布者关系
     * Summary: 获取服务发布者关系
     */
    public QuerySgServicepubrelationsResponse querySgServicepubrelationsEx(QuerySgServicepubrelationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicepubrelations.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicepubrelationsResponse());
    }

    /**
     * Description: 服务鉴权规则下发失败，重新下发规则
     * Summary: 服务鉴权规则下发失败，重新下发规则
     */
    public RetrySgAuthrulegroupsResponse retrySgAuthrulegroups(RetrySgAuthrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrySgAuthrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 服务鉴权规则下发失败，重新下发规则
     * Summary: 服务鉴权规则下发失败，重新下发规则
     */
    public RetrySgAuthrulegroupsResponse retrySgAuthrulegroupsEx(RetrySgAuthrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroups.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetrySgAuthrulegroupsResponse());
    }

    /**
     * Description: 获取服务消费者数据
     * Summary: 获取服务消费者数据
     */
    public QuerySgServicesubrelationsResponse querySgServicesubrelations(QuerySgServicesubrelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicesubrelationsEx(request, headers, runtime);
    }

    /**
     * Description: 获取服务消费者数据
     * Summary: 获取服务消费者数据
     */
    public QuerySgServicesubrelationsResponse querySgServicesubrelationsEx(QuerySgServicesubrelationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicesubrelations.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicesubrelationsResponse());
    }

    /**
     * Description: 微服务-显示关系切换
     * Summary: 显示关系切换
     */
    public GetSgRelationswitchResponse getSgRelationswitch(GetSgRelationswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSgRelationswitchEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-显示关系切换
     * Summary: 显示关系切换
     */
    public GetSgRelationswitchResponse getSgRelationswitchEx(GetSgRelationswitchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.relationswitch.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSgRelationswitchResponse());
    }

    /**
     * Description: 微服务-获取InstanceId
     * Summary: 获取InstanceId
     */
    public GetMiddlewareInstanceResponse getMiddlewareInstance(GetMiddlewareInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMiddlewareInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-获取InstanceId
     * Summary: 获取InstanceId
     */
    public GetMiddlewareInstanceResponse getMiddlewareInstanceEx(GetMiddlewareInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.middleware.instance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMiddlewareInstanceResponse());
    }

    /**
     * Description: 微服务-获取获取环境配置
     * Summary: 获取获取环境配置
     */
    public GetSgEnvconfigResponse getSgEnvconfig(GetSgEnvconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSgEnvconfigEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-获取获取环境配置
     * Summary: 获取获取环境配置
     */
    public GetSgEnvconfigResponse getSgEnvconfigEx(GetSgEnvconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.envconfig.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSgEnvconfigResponse());
    }

    /**
     * Description: 获取发布服务的应用列表
     * Summary: 获取发布服务的应用列表
     */
    public ListSgServiceappsResponse listSgServiceapps(ListSgServiceappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgServiceappsEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布服务的应用列表
     * Summary: 获取发布服务的应用列表
     */
    public ListSgServiceappsResponse listSgServiceappsEx(ListSgServiceappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgServiceappsResponse());
    }

    /**
     * Description: 获取服务候选词
     * Summary: 获取服务候选词
     */
    public QuerySgServicekeywordResponse querySgServicekeyword(QuerySgServicekeywordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicekeywordEx(request, headers, runtime);
    }

    /**
     * Description: 获取服务候选词
     * Summary: 获取服务候选词
     */
    public QuerySgServicekeywordResponse querySgServicekeywordEx(QuerySgServicekeywordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicekeyword.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicekeywordResponse());
    }

    /**
     * Description: 微服务-根据关键词搜索
     * Summary: 根据关键词搜索
     */
    public QuerySgServicesResponse querySgServices(QuerySgServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicesEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-根据关键词搜索
     * Summary: 根据关键词搜索
     */
    public QuerySgServicesResponse querySgServicesEx(QuerySgServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.services.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicesResponse());
    }

    /**
     * Description: 根据ip搜索服务提供方
     * Summary: 根据ip搜索服务提供方
     */
    public QuerySgServicepubkeysResponse querySgServicepubkeys(QuerySgServicepubkeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicepubkeysEx(request, headers, runtime);
    }

    /**
     * Description: 根据ip搜索服务提供方
     * Summary: 根据ip搜索服务提供方
     */
    public QuerySgServicepubkeysResponse querySgServicepubkeysEx(QuerySgServicepubkeysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicepubkeys.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicepubkeysResponse());
    }

    /**
     * Description: 根据ip搜索消费者
     * Summary: 根据ip搜索消费者
     */
    public QuerySgServicesubkeysResponse querySgServicesubkeys(QuerySgServicesubkeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicesubkeysEx(request, headers, runtime);
    }

    /**
     * Description: 根据ip搜索消费者
     * Summary: 根据ip搜索消费者
     */
    public QuerySgServicesubkeysResponse querySgServicesubkeysEx(QuerySgServicesubkeysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicesubkeys.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicesubkeysResponse());
    }

    /**
     * Description: 获取发布者服务详情
     * Summary: 获取发布者服务详情
     */
    public QuerySgServicepubsResponse querySgServicepubs(QuerySgServicepubsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicepubsEx(request, headers, runtime);
    }

    /**
     * Description: 获取发布者服务详情
     * Summary: 获取发布者服务详情
     */
    public QuerySgServicepubsResponse querySgServicepubsEx(QuerySgServicepubsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicepubs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicepubsResponse());
    }

    /**
     * Description: 获取订阅者服务详情
     * Summary: 获取订阅者服务详情
     */
    public QuerySgServicesubsResponse querySgServicesubs(QuerySgServicesubsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicesubsEx(request, headers, runtime);
    }

    /**
     * Description: 获取订阅者服务详情
     * Summary: 获取订阅者服务详情
     */
    public QuerySgServicesubsResponse querySgServicesubsEx(QuerySgServicesubsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicesubs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicesubsResponse());
    }

    /**
     * Description: 微服务-通过DataId和IP获取pub服务详情
     * Summary: 通过DataId和IP获取pub服务详情
     */
    public ListSgServicepubsResponse listSgServicepubs(ListSgServicepubsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgServicepubsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-通过DataId和IP获取pub服务详情
     * Summary: 通过DataId和IP获取pub服务详情
     */
    public ListSgServicepubsResponse listSgServicepubsEx(ListSgServicepubsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicepubs.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgServicepubsResponse());
    }

    /**
     * Description: 微服务-通过DataId和IP获取sub服务详情
     * Summary: 通过DataId和IP获取sub服务详情
     */
    public ListSgServicesubsResponse listSgServicesubs(ListSgServicesubsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgServicesubsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-通过DataId和IP获取sub服务详情
     * Summary: 通过DataId和IP获取sub服务详情
     */
    public ListSgServicesubsResponse listSgServicesubsEx(ListSgServicesubsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicesubs.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgServicesubsResponse());
    }

    /**
     * Description: 微服务-获取服务汇总信息
     * Summary: 获取服务汇总信息
     */
    public QuerySgServicesummarysResponse querySgServicesummarys(QuerySgServicesummarysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgServicesummarysEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-获取服务汇总信息
     * Summary: 获取服务汇总信息
     */
    public QuerySgServicesummarysResponse querySgServicesummarysEx(QuerySgServicesummarysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicesummarys.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgServicesummarysResponse());
    }

    /**
     * Description: 禁用一个服务下某个服务提供者
     * Summary: 禁用一个服务下某个服务提供者
     */
    public DisableSgServiceparamsResponse disableSgServiceparams(DisableSgServiceparamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSgServiceparamsEx(request, headers, runtime);
    }

    /**
     * Description: 禁用一个服务下某个服务提供者
     * Summary: 禁用一个服务下某个服务提供者
     */
    public DisableSgServiceparamsResponse disableSgServiceparamsEx(DisableSgServiceparamsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceparams.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSgServiceparamsResponse());
    }

    /**
     * Description: 启动一个服务下某个服务提供者
     * Summary: 启动一个服务下某个服务提供者
     */
    public EnableSgServiceparamsResponse enableSgServiceparams(EnableSgServiceparamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgServiceparamsEx(request, headers, runtime);
    }

    /**
     * Description: 启动一个服务下某个服务提供者
     * Summary: 启动一个服务下某个服务提供者
     */
    public EnableSgServiceparamsResponse enableSgServiceparamsEx(EnableSgServiceparamsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceparams.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgServiceparamsResponse());
    }

    /**
     * Description: 设置服务提供者权重
     * Summary: 设置服务提供者权重
     */
    public SetSgServiceparamweightResponse setSgServiceparamweight(SetSgServiceparamweightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setSgServiceparamweightEx(request, headers, runtime);
    }

    /**
     * Description: 设置服务提供者权重
     * Summary: 设置服务提供者权重
     */
    public SetSgServiceparamweightResponse setSgServiceparamweightEx(SetSgServiceparamweightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceparamweight.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetSgServiceparamweightResponse());
    }

    /**
     * Description: 恢复服务提供者默认设置
     * Summary: 恢复服务提供者默认设置
     */
    public ReinitSgServiceparamsResponse reinitSgServiceparams(ReinitSgServiceparamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitSgServiceparamsEx(request, headers, runtime);
    }

    /**
     * Description: 恢复服务提供者默认设置
     * Summary: 恢复服务提供者默认设置
     */
    public ReinitSgServiceparamsResponse reinitSgServiceparamsEx(ReinitSgServiceparamsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceparams.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitSgServiceparamsResponse());
    }

    /**
     * Description: 微服务-查询全部服务参数信息
     * Summary: 查询全部服务参数信息
     */
    public BatchquerySgServiceparamResponse batchquerySgServiceparam(BatchquerySgServiceparamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchquerySgServiceparamEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-查询全部服务参数信息
     * Summary: 查询全部服务参数信息
     */
    public BatchquerySgServiceparamResponse batchquerySgServiceparamEx(BatchquerySgServiceparamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceparam.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchquerySgServiceparamResponse());
    }

    /**
     * Description: 查询注入了指定类型的sidecar 的Pod 实例
     * Summary: sidecar实例查询
     */
    public QueryMeshSidecarResponse queryMeshSidecar(QueryMeshSidecarRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshSidecarEx(request, headers, runtime);
    }

    /**
     * Description: 查询注入了指定类型的sidecar 的Pod 实例
     * Summary: sidecar实例查询
     */
    public QueryMeshSidecarResponse queryMeshSidecarEx(QueryMeshSidecarRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.mesh.sidecar.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshSidecarResponse());
    }

    /**
     * Description: 微服务-配置获取
     * Summary: 配置获取
     */
    public GetGuardianGuardianconfigResponse getGuardianGuardianconfig(GetGuardianGuardianconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGuardianGuardianconfigEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-配置获取
     * Summary: 配置获取
     */
    public GetGuardianGuardianconfigResponse getGuardianGuardianconfigEx(GetGuardianGuardianconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianconfig.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGuardianGuardianconfigResponse());
    }

    /**
     * Description: 微服务-获取app列表
     * Summary: 获取app列表
     */
    public AllGuardianGuardianappsResponse allGuardianGuardianapps(AllGuardianGuardianappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allGuardianGuardianappsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-获取app列表
     * Summary: 获取app列表
     */
    public AllGuardianGuardianappsResponse allGuardianGuardianappsEx(AllGuardianGuardianappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianapps.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllGuardianGuardianappsResponse());
    }

    /**
     * Description: 微服务-查询appName列表
     * Summary: 查询appName列表
     */
    public AllGuardianGuardianappnamesResponse allGuardianGuardianappnames(AllGuardianGuardianappnamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allGuardianGuardianappnamesEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-查询appName列表
     * Summary: 查询appName列表
     */
    public AllGuardianGuardianappnamesResponse allGuardianGuardianappnamesEx(AllGuardianGuardianappnamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianappnames.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllGuardianGuardianappnamesResponse());
    }

    /**
     * Description: 微服务-分页查询app
     * Summary: 分页查询app
     */
    public QueryGuardianGuardianappsResponse queryGuardianGuardianapps(QueryGuardianGuardianappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardianGuardianappsEx(request, headers, runtime);
    }

    /**
     * Description: 微服务-分页查询app
     * Summary: 分页查询app
     */
    public QueryGuardianGuardianappsResponse queryGuardianGuardianappsEx(QueryGuardianGuardianappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianapps.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardianGuardianappsResponse());
    }

    /**
     * Description: ms -根据appName获取app
     * Summary: 根据appName获取app
     */
    public GetGuardianGuardianappsResponse getGuardianGuardianapps(GetGuardianGuardianappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGuardianGuardianappsEx(request, headers, runtime);
    }

    /**
     * Description: ms -根据appName获取app
     * Summary: 根据appName获取app
     */
    public GetGuardianGuardianappsResponse getGuardianGuardianappsEx(GetGuardianGuardianappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianapps.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGuardianGuardianappsResponse());
    }

    /**
     * Description: ms-添加 监控App
     * Summary: 添加 监控App
     */
    public AddGuardianGuardianappsResponse addGuardianGuardianapps(AddGuardianGuardianappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGuardianGuardianappsEx(request, headers, runtime);
    }

    /**
     * Description: ms-添加 监控App
     * Summary: 添加 监控App
     */
    public AddGuardianGuardianappsResponse addGuardianGuardianappsEx(AddGuardianGuardianappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianapps.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddGuardianGuardianappsResponse());
    }

    /**
     * Description: ws-更新监控app
     * Summary: 更新监控app
     */
    public UpdateGuardianGuardianappsResponse updateGuardianGuardianapps(UpdateGuardianGuardianappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGuardianGuardianappsEx(request, headers, runtime);
    }

    /**
     * Description: ws-更新监控app
     * Summary: 更新监控app
     */
    public UpdateGuardianGuardianappsResponse updateGuardianGuardianappsEx(UpdateGuardianGuardianappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianapps.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGuardianGuardianappsResponse());
    }

    /**
     * Description: ms- 删除监控 app
     * Summary: 删除监控 app
     */
    public DeleteGuardianGuardianappsResponse deleteGuardianGuardianapps(DeleteGuardianGuardianappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGuardianGuardianappsEx(request, headers, runtime);
    }

    /**
     * Description: ms- 删除监控 app
     * Summary: 删除监控 app
     */
    public DeleteGuardianGuardianappsResponse deleteGuardianGuardianappsEx(DeleteGuardianGuardianappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianapps.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteGuardianGuardianappsResponse());
    }

    /**
     * Description: ms - 规则配置分页
     * Summary: 规则配置分页
     */
    public QueryGuardianGuardianrulesResponse queryGuardianGuardianrules(QueryGuardianGuardianrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardianGuardianrulesEx(request, headers, runtime);
    }

    /**
     * Description: ms - 规则配置分页
     * Summary: 规则配置分页
     */
    public QueryGuardianGuardianrulesResponse queryGuardianGuardianrulesEx(QueryGuardianGuardianrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrules.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardianGuardianrulesResponse());
    }

    /**
     * Description: ms-根据id获取规则
     * Summary: 根据id获取规则
     */
    public GetGuardianGuardianrulesResponse getGuardianGuardianrules(GetGuardianGuardianrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGuardianGuardianrulesEx(request, headers, runtime);
    }

    /**
     * Description: ms-根据id获取规则
     * Summary: 根据id获取规则
     */
    public GetGuardianGuardianrulesResponse getGuardianGuardianrulesEx(GetGuardianGuardianrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrules.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGuardianGuardianrulesResponse());
    }

    /**
     * Description: ms-添加规则
     * Summary: 添加规则
     */
    public AddGuardianGuardianrulesResponse addGuardianGuardianrules(AddGuardianGuardianrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGuardianGuardianrulesEx(request, headers, runtime);
    }

    /**
     * Description: ms-添加规则
     * Summary: 添加规则
     */
    public AddGuardianGuardianrulesResponse addGuardianGuardianrulesEx(AddGuardianGuardianrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrules.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddGuardianGuardianrulesResponse());
    }

    /**
     * Description: ms-更新规则
     * Summary: 更新规则
     */
    public UpdateGuardianGuardianrulesResponse updateGuardianGuardianrules(UpdateGuardianGuardianrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGuardianGuardianrulesEx(request, headers, runtime);
    }

    /**
     * Description: ms-更新规则
     * Summary: 更新规则
     */
    public UpdateGuardianGuardianrulesResponse updateGuardianGuardianrulesEx(UpdateGuardianGuardianrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrules.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGuardianGuardianrulesResponse());
    }

    /**
     * Description: ms-更新规则状态
     * Summary: 更新规则状态
     */
    public UpdateGuardianGuardianrulestatusResponse updateGuardianGuardianrulestatus(UpdateGuardianGuardianrulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGuardianGuardianrulestatusEx(request, headers, runtime);
    }

    /**
     * Description: ms-更新规则状态
     * Summary: 更新规则状态
     */
    public UpdateGuardianGuardianrulestatusResponse updateGuardianGuardianrulestatusEx(UpdateGuardianGuardianrulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrulestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGuardianGuardianrulestatusResponse());
    }

    /**
     * Description: ms-删除规则
     * Summary: 删除规则
     */
    public DeleteGuardianGuardianrulesResponse deleteGuardianGuardianrules(DeleteGuardianGuardianrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGuardianGuardianrulesEx(request, headers, runtime);
    }

    /**
     * Description: ms-删除规则
     * Summary: 删除规则
     */
    public DeleteGuardianGuardianrulesResponse deleteGuardianGuardianrulesEx(DeleteGuardianGuardianrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrules.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteGuardianGuardianrulesResponse());
    }

    /**
     * Description: ms-分页查询推送历史
     * Summary: 分页查询推送历史
     */
    public QueryGuardianGuardianrulepushhistorysResponse queryGuardianGuardianrulepushhistorys(QueryGuardianGuardianrulepushhistorysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardianGuardianrulepushhistorysEx(request, headers, runtime);
    }

    /**
     * Description: ms-分页查询推送历史
     * Summary: 分页查询推送历史
     */
    public QueryGuardianGuardianrulepushhistorysResponse queryGuardianGuardianrulepushhistorysEx(QueryGuardianGuardianrulepushhistorysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrulepushhistorys.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardianGuardianrulepushhistorysResponse());
    }

    /**
     * Description: ms-查询推送历史
     * Summary: 查询推送历史
     */
    public ListGuardianGuardianrulepushhistorysResponse listGuardianGuardianrulepushhistorys(ListGuardianGuardianrulepushhistorysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGuardianGuardianrulepushhistorysEx(request, headers, runtime);
    }

    /**
     * Description: ms-查询推送历史
     * Summary: 查询推送历史
     */
    public ListGuardianGuardianrulepushhistorysResponse listGuardianGuardianrulepushhistorysEx(ListGuardianGuardianrulepushhistorysRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrulepushhistorys.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListGuardianGuardianrulepushhistorysResponse());
    }

    /**
     * Description: ms-灰度推送
     * Summary: 灰度推送
     */
    public AddGuardianGuardiangrayrulesResponse addGuardianGuardiangrayrules(AddGuardianGuardiangrayrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGuardianGuardiangrayrulesEx(request, headers, runtime);
    }

    /**
     * Description: ms-灰度推送
     * Summary: 灰度推送
     */
    public AddGuardianGuardiangrayrulesResponse addGuardianGuardiangrayrulesEx(AddGuardianGuardiangrayrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardiangrayrules.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddGuardianGuardiangrayrulesResponse());
    }

    /**
     * Description: ms-更改规则灰度状态
     * Summary: 更改规则灰度状态
     */
    public UpdateGuardianGuardiangrayrulestatusResponse updateGuardianGuardiangrayrulestatus(UpdateGuardianGuardiangrayrulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGuardianGuardiangrayrulestatusEx(request, headers, runtime);
    }

    /**
     * Description: ms-更改规则灰度状态
     * Summary: 更改规则灰度状态
     */
    public UpdateGuardianGuardiangrayrulestatusResponse updateGuardianGuardiangrayrulestatusEx(UpdateGuardianGuardiangrayrulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardiangrayrulestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGuardianGuardiangrayrulestatusResponse());
    }

    /**
     * Description: ms-查询实例App name
     * Summary: 查询实例App name
     */
    public AllDrmDrmappsResponse allDrmDrmapps(AllDrmDrmappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDrmDrmappsEx(request, headers, runtime);
    }

    /**
     * Description: ms-查询实例App name
     * Summary: 查询实例App name
     */
    public AllDrmDrmappsResponse allDrmDrmappsEx(AllDrmDrmappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmapps.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDrmDrmappsResponse());
    }

    /**
     * Description: ms-分页查询Drm资源
     * Summary: 分页查询Drm资源
     */
    public QueryDrmDrmresourcesResponse queryDrmDrmresources(QueryDrmDrmresourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDrmDrmresourcesEx(request, headers, runtime);
    }

    /**
     * Description: ms-分页查询Drm资源
     * Summary: 分页查询Drm资源
     */
    public QueryDrmDrmresourcesResponse queryDrmDrmresourcesEx(QueryDrmDrmresourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresources.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDrmDrmresourcesResponse());
    }

    /**
     * Description: ms-添加drm资源
     * Summary: 添加drm资源
     */
    public AddDrmDrmresourcesResponse addDrmDrmresources(AddDrmDrmresourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDrmDrmresourcesEx(request, headers, runtime);
    }

    /**
     * Description: ms-添加drm资源
     * Summary: 添加drm资源
     */
    public AddDrmDrmresourcesResponse addDrmDrmresourcesEx(AddDrmDrmresourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresources.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDrmDrmresourcesResponse());
    }

    /**
     * Description: ms-更新drm资源
     * Summary: 更新drm资源
     */
    public UpdateDrmDrmresourcesResponse updateDrmDrmresources(UpdateDrmDrmresourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDrmDrmresourcesEx(request, headers, runtime);
    }

    /**
     * Description: ms-更新drm资源
     * Summary: 更新drm资源
     */
    public UpdateDrmDrmresourcesResponse updateDrmDrmresourcesEx(UpdateDrmDrmresourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresources.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDrmDrmresourcesResponse());
    }

    /**
     * Description: ms-添加drm属性
     * Summary: 添加drm属性
     */
    public AddDrmDrmattributesResponse addDrmDrmattributes(AddDrmDrmattributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDrmDrmattributesEx(request, headers, runtime);
    }

    /**
     * Description: ms-添加drm属性
     * Summary: 添加drm属性
     */
    public AddDrmDrmattributesResponse addDrmDrmattributesEx(AddDrmDrmattributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmattributes.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDrmDrmattributesResponse());
    }

    /**
     * Description: ms-更新drm资源属性
     * Summary: 更新drm资源属性
     */
    public UpdateDrmDrmattributesResponse updateDrmDrmattributes(UpdateDrmDrmattributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDrmDrmattributesEx(request, headers, runtime);
    }

    /**
     * Description: ms-更新drm资源属性
     * Summary: 更新drm资源属性
     */
    public UpdateDrmDrmattributesResponse updateDrmDrmattributesEx(UpdateDrmDrmattributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmattributes.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDrmDrmattributesResponse());
    }

    /**
     * Description: ms-Delete resource
     * Summary: Delete resource
     */
    public DeleteDrmDrmresourcesResponse deleteDrmDrmresources(DeleteDrmDrmresourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDrmDrmresourcesEx(request, headers, runtime);
    }

    /**
     * Description: ms-Delete resource
     * Summary: Delete resource
     */
    public DeleteDrmDrmresourcesResponse deleteDrmDrmresourcesEx(DeleteDrmDrmresourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresources.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDrmDrmresourcesResponse());
    }

    /**
     * Description: ms-删除drm资源属性
     * Summary: 删除drm资源属性
     */
    public DeleteDrmDrmattributesResponse deleteDrmDrmattributes(DeleteDrmDrmattributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDrmDrmattributesEx(request, headers, runtime);
    }

    /**
     * Description: ms-删除drm资源属性
     * Summary: 删除drm资源属性
     */
    public DeleteDrmDrmattributesResponse deleteDrmDrmattributesEx(DeleteDrmDrmattributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmattributes.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDrmDrmattributesResponse());
    }

    /**
     * Description: ms-获取drm资源属性
     * Summary: 获取drm资源属性
     */
    public GetDrmDrmattributesResponse getDrmDrmattributes(GetDrmDrmattributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDrmDrmattributesEx(request, headers, runtime);
    }

    /**
     * Description: ms-获取drm资源属性
     * Summary: 获取drm资源属性
     */
    public GetDrmDrmattributesResponse getDrmDrmattributesEx(GetDrmDrmattributesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmattributes.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDrmDrmattributesResponse());
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息
     */
    public QueryDrmDrmclientsResponse queryDrmDrmclients(QueryDrmDrmclientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDrmDrmclientsEx(request, headers, runtime);
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息
     */
    public QueryDrmDrmclientsResponse queryDrmDrmclientsEx(QueryDrmDrmclientsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmclients.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDrmDrmclientsResponse());
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息
     */
    public QueryDrmDrmhostsResponse queryDrmDrmhosts(QueryDrmDrmhostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDrmDrmhostsEx(request, headers, runtime);
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息
     */
    public QueryDrmDrmhostsResponse queryDrmDrmhostsEx(QueryDrmDrmhostsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmhosts.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDrmDrmhostsResponse());
    }

    /**
     * Description: ms-分页搜索推送日志
     * Summary: 分页搜索推送日志
     */
    public ListDrmDrmpushlogsResponse listDrmDrmpushlogs(ListDrmDrmpushlogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDrmDrmpushlogsEx(request, headers, runtime);
    }

    /**
     * Description: ms-分页搜索推送日志
     * Summary: 分页搜索推送日志
     */
    public ListDrmDrmpushlogsResponse listDrmDrmpushlogsEx(ListDrmDrmpushlogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmpushlogs.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDrmDrmpushlogsResponse());
    }

    /**
     * Description: ms-按条件分页查询推送日志
     * Summary: 按条件分页查询推送日志
     */
    public QueryDrmDrmpushlogsResponse queryDrmDrmpushlogs(QueryDrmDrmpushlogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDrmDrmpushlogsEx(request, headers, runtime);
    }

    /**
     * Description: ms-按条件分页查询推送日志
     * Summary: 按条件分页查询推送日志
     */
    public QueryDrmDrmpushlogsResponse queryDrmDrmpushlogsEx(QueryDrmDrmpushlogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmpushlogs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDrmDrmpushlogsResponse());
    }

    /**
     * Description: ms-推送drm配置
     * Summary: 推送drm配置
     */
    public AddDrmDrmdataResponse addDrmDrmdata(AddDrmDrmdataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDrmDrmdataEx(request, headers, runtime);
    }

    /**
     * Description: ms-推送drm配置
     * Summary: 推送drm配置
     */
    public AddDrmDrmdataResponse addDrmDrmdataEx(AddDrmDrmdataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmdata.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDrmDrmdataResponse());
    }

    /**
     * Description: ms-灰度推送数据
     * Summary: 灰度推送数据
     */
    public AddDrmDrmgraydataResponse addDrmDrmgraydata(AddDrmDrmgraydataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDrmDrmgraydataEx(request, headers, runtime);
    }

    /**
     * Description: ms-灰度推送数据
     * Summary: 灰度推送数据
     */
    public AddDrmDrmgraydataResponse addDrmDrmgraydataEx(AddDrmDrmgraydataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmgraydata.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDrmDrmgraydataResponse());
    }

    /**
     * Description: ms-获取实例的单元格
     * Summary: 获取实例的单元格
     */
    public AllDrmDrmcellsResponse allDrmDrmcells(AllDrmDrmcellsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDrmDrmcellsEx(request, headers, runtime);
    }

    /**
     * Description: ms-获取实例的单元格
     * Summary: 获取实例的单元格
     */
    public AllDrmDrmcellsResponse allDrmDrmcellsEx(AllDrmDrmcellsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmcells.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDrmDrmcellsResponse());
    }

    /**
     * Description: ms-获取Drm数据单元信息
     * Summary: 获取Drm数据单元信息
     */
    public ListDrmDrmdatacellsResponse listDrmDrmdatacells(ListDrmDrmdatacellsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDrmDrmdatacellsEx(request, headers, runtime);
    }

    /**
     * Description: ms-获取Drm数据单元信息
     * Summary: 获取Drm数据单元信息
     */
    public ListDrmDrmdatacellsResponse listDrmDrmdatacellsEx(ListDrmDrmdatacellsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmdatacells.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDrmDrmdatacellsResponse());
    }

    /**
     * Description: ms-添加Tpl类型drm资源
     * Summary: 添加Tpl类型drm资源
     */
    public AddDrmDrmresourcetplsResponse addDrmDrmresourcetpls(AddDrmDrmresourcetplsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDrmDrmresourcetplsEx(request, headers, runtime);
    }

    /**
     * Description: ms-添加Tpl类型drm资源
     * Summary: 添加Tpl类型drm资源
     */
    public AddDrmDrmresourcetplsResponse addDrmDrmresourcetplsEx(AddDrmDrmresourcetplsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresourcetpls.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDrmDrmresourcetplsResponse());
    }

    /**
     * Description: ms-更新Tpl类型drm资源
     * Summary: 更新Tpl类型drm资源
     */
    public UpdateDrmDrmresourcetplsResponse updateDrmDrmresourcetpls(UpdateDrmDrmresourcetplsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDrmDrmresourcetplsEx(request, headers, runtime);
    }

    /**
     * Description: ms-更新Tpl类型drm资源
     * Summary: 更新Tpl类型drm资源
     */
    public UpdateDrmDrmresourcetplsResponse updateDrmDrmresourcetplsEx(UpdateDrmDrmresourcetplsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresourcetpls.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDrmDrmresourcetplsResponse());
    }

    /**
     * Description: ms-删除Tpl类型drm资源
     * Summary: 删除Tpl类型drm资源
     */
    public DeleteDrmDrmresourcetplsResponse deleteDrmDrmresourcetpls(DeleteDrmDrmresourcetplsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDrmDrmresourcetplsEx(request, headers, runtime);
    }

    /**
     * Description: ms-删除Tpl类型drm资源
     * Summary: 删除Tpl类型drm资源
     */
    public DeleteDrmDrmresourcetplsResponse deleteDrmDrmresourcetplsEx(DeleteDrmDrmresourcetplsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresourcetpls.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDrmDrmresourcetplsResponse());
    }

    /**
     * Description: ms -分页查询Tpl类型drm资源
     * Summary: 分页查询Tpl类型drm资源
     */
    public QueryDrmDrmresourcetplsResponse queryDrmDrmresourcetpls(QueryDrmDrmresourcetplsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDrmDrmresourcetplsEx(request, headers, runtime);
    }

    /**
     * Description: ms -分页查询Tpl类型drm资源
     * Summary: 分页查询Tpl类型drm资源
     */
    public QueryDrmDrmresourcetplsResponse queryDrmDrmresourcetplsEx(QueryDrmDrmresourcetplsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresourcetpls.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDrmDrmresourcetplsResponse());
    }

    /**
     * Description: ms -创建资源Tpl实例
     * Summary: 创建资源Tpl实例
     */
    public AddDrmDrmresourcetplinstancesResponse addDrmDrmresourcetplinstances(AddDrmDrmresourcetplinstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDrmDrmresourcetplinstancesEx(request, headers, runtime);
    }

    /**
     * Description: ms -创建资源Tpl实例
     * Summary: 创建资源Tpl实例
     */
    public AddDrmDrmresourcetplinstancesResponse addDrmDrmresourcetplinstancesEx(AddDrmDrmresourcetplinstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresourcetplinstances.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDrmDrmresourcetplinstancesResponse());
    }

    /**
     * Description: 一键创建注册中心同步任务
     * Summary: 一键创建注册中心同步任务
     */
    public AddRcSyncbucketResponse addRcSyncbucket(AddRcSyncbucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRcSyncbucketEx(request, headers, runtime);
    }

    /**
     * Description: 一键创建注册中心同步任务
     * Summary: 一键创建注册中心同步任务
     */
    public AddRcSyncbucketResponse addRcSyncbucketEx(AddRcSyncbucketRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.syncbucket.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddRcSyncbucketResponse());
    }

    /**
     * Description: 查询注册中心同步集群信息
     * Summary: 查询注册中心同步集群信息
     */
    public QueryRcSyncclusterResponse queryRcSynccluster(QueryRcSyncclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRcSyncclusterEx(request, headers, runtime);
    }

    /**
     * Description: 查询注册中心同步集群信息
     * Summary: 查询注册中心同步集群信息
     */
    public QueryRcSyncclusterResponse queryRcSyncclusterEx(QueryRcSyncclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.synccluster.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRcSyncclusterResponse());
    }

    /**
     * Description: 查询集群同步任务信息
     * Summary: 查询集群同步任务信息
     */
    public QueryRcSynctaskResponse queryRcSynctask(QueryRcSynctaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRcSynctaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询集群同步任务信息
     * Summary: 查询集群同步任务信息
     */
    public QueryRcSynctaskResponse queryRcSynctaskEx(QueryRcSynctaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.synctask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRcSynctaskResponse());
    }

    /**
     * Description: 查询某个服务具体同步的数据
     * Summary: 查询某个服务具体同步的数据
     */
    public QueryRcSyncdataResponse queryRcSyncdata(QueryRcSyncdataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRcSyncdataEx(request, headers, runtime);
    }

    /**
     * Description: 查询某个服务具体同步的数据
     * Summary: 查询某个服务具体同步的数据
     */
    public QueryRcSyncdataResponse queryRcSyncdataEx(QueryRcSyncdataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.syncdata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRcSyncdataResponse());
    }

    /**
     * Description: 开启任务
     * Summary: 开启任务
     */
    public StartRcSynctaskResponse startRcSynctask(StartRcSynctaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRcSynctaskEx(request, headers, runtime);
    }

    /**
     * Description: 开启任务
     * Summary: 开启任务
     */
    public StartRcSynctaskResponse startRcSynctaskEx(StartRcSynctaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.synctask.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRcSynctaskResponse());
    }

    /**
     * Description: 停止任务
     * Summary: 停止任务
     */
    public StopRcSynctaskResponse stopRcSynctask(StopRcSynctaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopRcSynctaskEx(request, headers, runtime);
    }

    /**
     * Description: 停止任务
     * Summary: 停止任务
     */
    public StopRcSynctaskResponse stopRcSynctaskEx(StopRcSynctaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.synctask.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopRcSynctaskResponse());
    }

    /**
     * Description: 当前workspace下所有资源元信息
     * Summary: 导出资源
     */
    public ExportDrmDrmresourcesResponse exportDrmDrmresources(ExportDrmDrmresourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportDrmDrmresourcesEx(request, headers, runtime);
    }

    /**
     * Description: 当前workspace下所有资源元信息
     * Summary: 导出资源
     */
    public ExportDrmDrmresourcesResponse exportDrmDrmresourcesEx(ExportDrmDrmresourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresources.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportDrmDrmresourcesResponse());
    }

    /**
     * Description: 导入drm资源元信息
     * Summary: 导入drm资源元信息
     */
    public ImportDrmDrmresourcesResponse importDrmDrmresources(ImportDrmDrmresourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDrmDrmresourcesEx(request, headers, runtime);
    }

    /**
     * Description: 导入drm资源元信息
     * Summary: 导入drm资源元信息
     */
    public ImportDrmDrmresourcesResponse importDrmDrmresourcesEx(ImportDrmDrmresourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmresources.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDrmDrmresourcesResponse());
    }

    /**
     * Description: 导入guardian规则
     * Summary: 导入guardian规则
     */
    public ImportGuardianGuardianrulesResponse importGuardianGuardianrules(ImportGuardianGuardianrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importGuardianGuardianrulesEx(request, headers, runtime);
    }

    /**
     * Description: 导入guardian规则
     * Summary: 导入guardian规则
     */
    public ImportGuardianGuardianrulesResponse importGuardianGuardianrulesEx(ImportGuardianGuardianrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrules.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportGuardianGuardianrulesResponse());
    }

    /**
     * Description: 导出guardian路由规则
     * Summary: 导出guardian路由规则
     */
    public ExportGuardianGuardianrulesResponse exportGuardianGuardianrules(ExportGuardianGuardianrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportGuardianGuardianrulesEx(request, headers, runtime);
    }

    /**
     * Description: 导出guardian路由规则
     * Summary: 导出guardian路由规则
     */
    public ExportGuardianGuardianrulesResponse exportGuardianGuardianrulesEx(ExportGuardianGuardianrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.guardian.guardianrules.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportGuardianGuardianrulesResponse());
    }

    /**
     * Description: 获取上传地址
     * Summary: 获取上传地址
     */
    public GetDrmUploadurlResponse getDrmUploadurl(GetDrmUploadurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDrmUploadurlEx(request, headers, runtime);
    }

    /**
     * Description: 获取上传地址
     * Summary: 获取上传地址
     */
    public GetDrmUploadurlResponse getDrmUploadurlEx(GetDrmUploadurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.uploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDrmUploadurlResponse());
    }

    /**
     * Description: 南天门计费回调
     * Summary: 南天门计费回调
     */
    public CallbackSpiOmsResponse callbackSpiOms(CallbackSpiOmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSpiOmsEx(request, headers, runtime);
    }

    /**
     * Description: 南天门计费回调
     * Summary: 南天门计费回调
     */
    public CallbackSpiOmsResponse callbackSpiOmsEx(CallbackSpiOmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.spi.oms.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSpiOmsResponse());
    }

    /**
     * Description: ms-查询实例下所有cells
     * Summary: 查询实例下所有cells
     */
    public AllDrmDrmldccellsResponse allDrmDrmldccells(AllDrmDrmldccellsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allDrmDrmldccellsEx(request, headers, runtime);
    }

    /**
     * Description: ms-查询实例下所有cells
     * Summary: 查询实例下所有cells
     */
    public AllDrmDrmldccellsResponse allDrmDrmldccellsEx(AllDrmDrmldccellsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.drm.drmldccells.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllDrmDrmldccellsResponse());
    }

    /**
     * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
     * Summary: 服务下线接口
     */
    public OfflineSgServicepublishersResponse offlineSgServicepublishers(OfflineSgServicepublishersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineSgServicepublishersEx(request, headers, runtime);
    }

    /**
     * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
     * Summary: 服务下线接口
     */
    public OfflineSgServicepublishersResponse offlineSgServicepublishersEx(OfflineSgServicepublishersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.servicepublishers.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineSgServicepublishersResponse());
    }

    /**
     * Description: 删除任务
     * Summary: 删除任务
     */
    public DeleteRcSynctaskResponse deleteRcSynctask(DeleteRcSynctaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRcSynctaskEx(request, headers, runtime);
    }

    /**
     * Description: 删除任务
     * Summary: 删除任务
     */
    public DeleteRcSynctaskResponse deleteRcSynctaskEx(DeleteRcSynctaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.synctask.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteRcSynctaskResponse());
    }

    /**
     * Description: 查询降级规则组列表
     * Summary: 查询降级规则组列表
     */
    public QuerySgDowngradegroupsResponse querySgDowngradegroups(QuerySgDowngradegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgDowngradegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 查询降级规则组列表
     * Summary: 查询降级规则组列表
     */
    public QuerySgDowngradegroupsResponse querySgDowngradegroupsEx(QuerySgDowngradegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgradegroups.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgDowngradegroupsResponse());
    }

    /**
     * Description: 删除降级规则
     * Summary: 删除降级规则
     */
    public DeleteSgDowngradesResponse deleteSgDowngrades(DeleteSgDowngradesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgDowngradesEx(request, headers, runtime);
    }

    /**
     * Description: 删除降级规则
     * Summary: 删除降级规则
     */
    public DeleteSgDowngradesResponse deleteSgDowngradesEx(DeleteSgDowngradesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgrades.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgDowngradesResponse());
    }

    /**
     * Description: 新增降级规则
     * Summary: 新增降级规则
     */
    public AddSgDowngradesResponse addSgDowngrades(AddSgDowngradesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgDowngradesEx(request, headers, runtime);
    }

    /**
     * Description: 新增降级规则
     * Summary: 新增降级规则
     */
    public AddSgDowngradesResponse addSgDowngradesEx(AddSgDowngradesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgrades.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgDowngradesResponse());
    }

    /**
     * Description: 更新降级规则
     * Summary: 更新降级规则
     */
    public UpdateSgDowngradesResponse updateSgDowngrades(UpdateSgDowngradesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgDowngradesEx(request, headers, runtime);
    }

    /**
     * Description: 更新降级规则
     * Summary: 更新降级规则
     */
    public UpdateSgDowngradesResponse updateSgDowngradesEx(UpdateSgDowngradesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgrades.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgDowngradesResponse());
    }

    /**
     * Description: 全局开启降级规则
     * Summary: 全局开启降级规则
     */
    public EnableSgDowngradegroupsResponse enableSgDowngradegroups(EnableSgDowngradegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgDowngradegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 全局开启降级规则
     * Summary: 全局开启降级规则
     */
    public EnableSgDowngradegroupsResponse enableSgDowngradegroupsEx(EnableSgDowngradegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgradegroups.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgDowngradegroupsResponse());
    }

    /**
     * Description: 全局关闭降级规则
     * Summary: 全局关闭降级规则
     */
    public DisableSgDowngradegroupsResponse disableSgDowngradegroups(DisableSgDowngradegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSgDowngradegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 全局关闭降级规则
     * Summary: 全局关闭降级规则
     */
    public DisableSgDowngradegroupsResponse disableSgDowngradegroupsEx(DisableSgDowngradegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgradegroups.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSgDowngradegroupsResponse());
    }

    /**
     * Description: 开启一条降级规则
     * Summary: 开启一条降级规则
     */
    public EnableSgDowngradesResponse enableSgDowngrades(EnableSgDowngradesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgDowngradesEx(request, headers, runtime);
    }

    /**
     * Description: 开启一条降级规则
     * Summary: 开启一条降级规则
     */
    public EnableSgDowngradesResponse enableSgDowngradesEx(EnableSgDowngradesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgrades.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgDowngradesResponse());
    }

    /**
     * Description: 关闭一条降级规则
     * Summary: 关闭一条降级规则
     */
    public DisableSgDowngradesResponse disableSgDowngrades(DisableSgDowngradesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSgDowngradesEx(request, headers, runtime);
    }

    /**
     * Description: 关闭一条降级规则
     * Summary: 关闭一条降级规则
     */
    public DisableSgDowngradesResponse disableSgDowngradesEx(DisableSgDowngradesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.downgrades.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSgDowngradesResponse());
    }

    /**
     * Description: 生效熔断规则
     * Summary: 生效熔断规则
     */
    public EnableSgCircuitbreakerrulesResponse enableSgCircuitbreakerrules(EnableSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 生效熔断规则
     * Summary: 生效熔断规则
     */
    public EnableSgCircuitbreakerrulesResponse enableSgCircuitbreakerrulesEx(EnableSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 根据实例id和服务id获取所有荣富安规则
     * Summary: 熔断规则查询
     */
    public QuerySgCircuitbreakerrulesResponse querySgCircuitbreakerrules(QuerySgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 根据实例id和服务id获取所有荣富安规则
     * Summary: 熔断规则查询
     */
    public QuerySgCircuitbreakerrulesResponse querySgCircuitbreakerrulesEx(QuerySgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 获取租户下服务熔断规则
     * Summary: 服务熔断查询
     */
    public ListSgCircuitbreakerrulesResponse listSgCircuitbreakerrules(ListSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 获取租户下服务熔断规则
     * Summary: 服务熔断查询
     */
    public ListSgCircuitbreakerrulesResponse listSgCircuitbreakerrulesEx(ListSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 更新熔断规则
     * Summary: 更新熔断规则
     */
    public UpdateSgCircuitbreakerrulesResponse updateSgCircuitbreakerrules(UpdateSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 更新熔断规则
     * Summary: 更新熔断规则
     */
    public UpdateSgCircuitbreakerrulesResponse updateSgCircuitbreakerrulesEx(UpdateSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 删除熔断规则
     * Summary: 删除熔断规则
     */
    public DeleteSgCircuitbreakerrulesResponse deleteSgCircuitbreakerrules(DeleteSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 删除熔断规则
     * Summary: 删除熔断规则
     */
    public DeleteSgCircuitbreakerrulesResponse deleteSgCircuitbreakerrulesEx(DeleteSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 添加熔断规则
     * Summary: 添加熔断规则
     */
    public AddSgCircuitbreakerrulesResponse addSgCircuitbreakerrules(AddSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 添加熔断规则
     * Summary: 添加熔断规则
     */
    public AddSgCircuitbreakerrulesResponse addSgCircuitbreakerrulesEx(AddSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 设置熔断规则运行模式
     * Summary: 设置熔断规则运行模式
     */
    public SetSgCircuitbreakerrulesResponse setSgCircuitbreakerrules(SetSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 设置熔断规则运行模式
     * Summary: 设置熔断规则运行模式
     */
    public SetSgCircuitbreakerrulesResponse setSgCircuitbreakerrulesEx(SetSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 重新初始化注册中心同步集群信息
     * Summary: 重新初始化注册中心同步集群信息
     */
    public ReinitRcSyncclusterResponse reinitRcSynccluster(ReinitRcSyncclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitRcSyncclusterEx(request, headers, runtime);
    }

    /**
     * Description: 重新初始化注册中心同步集群信息
     * Summary: 重新初始化注册中心同步集群信息
     */
    public ReinitRcSyncclusterResponse reinitRcSyncclusterEx(ReinitRcSyncclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.rc.synccluster.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitRcSyncclusterResponse());
    }

    /**
     * Description: 在指定应用上添加透明劫持节点。
     * Summary: 添加透明劫持节点
     */
    public AddTransparentproxyNodeResponse addTransparentproxyNode(AddTransparentproxyNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTransparentproxyNodeEx(request, headers, runtime);
    }

    /**
     * Description: 在指定应用上添加透明劫持节点。
     * Summary: 添加透明劫持节点
     */
    public AddTransparentproxyNodeResponse addTransparentproxyNodeEx(AddTransparentproxyNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.node.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTransparentproxyNodeResponse());
    }

    /**
     * Description: 根据应用 ID，删除对应的透明劫持应用。
     * Summary: 删除透明劫持应用
     */
    public DeleteTransparentproxyAppResponse deleteTransparentproxyApp(DeleteTransparentproxyAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTransparentproxyAppEx(request, headers, runtime);
    }

    /**
     * Description: 根据应用 ID，删除对应的透明劫持应用。
     * Summary: 删除透明劫持应用
     */
    public DeleteTransparentproxyAppResponse deleteTransparentproxyAppEx(DeleteTransparentproxyAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.app.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTransparentproxyAppResponse());
    }

    /**
     * Description: 查询指定环境下服务治理中的透明劫持应用列表。
     * Summary: 服务治理透明劫持应用列表
     */
    public QueryTransparentproxyAppResponse queryTransparentproxyApp(QueryTransparentproxyAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTransparentproxyAppEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定环境下服务治理中的透明劫持应用列表。
     * Summary: 服务治理透明劫持应用列表
     */
    public QueryTransparentproxyAppResponse queryTransparentproxyAppEx(QueryTransparentproxyAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.app.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTransparentproxyAppResponse());
    }

    /**
     * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
     * Summary: 透明劫持规则配置
     */
    public UpdateTransparentproxyConfigResponse updateTransparentproxyConfig(UpdateTransparentproxyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTransparentproxyConfigEx(request, headers, runtime);
    }

    /**
     * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
     * Summary: 透明劫持规则配置
     */
    public UpdateTransparentproxyConfigResponse updateTransparentproxyConfigEx(UpdateTransparentproxyConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.config.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTransparentproxyConfigResponse());
    }

    /**
     * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
     * Summary: 查询透明劫持应用治理日志
     */
    public QueryTransparentproxyLogResponse queryTransparentproxyLog(QueryTransparentproxyLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTransparentproxyLogEx(request, headers, runtime);
    }

    /**
     * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
     * Summary: 查询透明劫持应用治理日志
     */
    public QueryTransparentproxyLogResponse queryTransparentproxyLogEx(QueryTransparentproxyLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.log.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTransparentproxyLogResponse());
    }

    /**
     * Description: 添加一个透明劫持应用。
     * Summary: 添加透明劫持应用
     */
    public AddTransparentproxyAppResponse addTransparentproxyApp(AddTransparentproxyAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTransparentproxyAppEx(request, headers, runtime);
    }

    /**
     * Description: 添加一个透明劫持应用。
     * Summary: 添加透明劫持应用
     */
    public AddTransparentproxyAppResponse addTransparentproxyAppEx(AddTransparentproxyAppRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.app.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTransparentproxyAppResponse());
    }

    /**
     * Description: 根据节点 ID，删除对应的透明劫持应用节点。
     * Summary: 删除透明劫持应用节点
     */
    public DeleteTransparentproxyNodeResponse deleteTransparentproxyNode(DeleteTransparentproxyNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTransparentproxyNodeEx(request, headers, runtime);
    }

    /**
     * Description: 根据节点 ID，删除对应的透明劫持应用节点。
     * Summary: 删除透明劫持应用节点
     */
    public DeleteTransparentproxyNodeResponse deleteTransparentproxyNodeEx(DeleteTransparentproxyNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.node.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTransparentproxyNodeResponse());
    }

    /**
     * Description: 查询透明劫持应用的节点列表。
     * Summary: 查询透明劫持应用的节点列表
     */
    public QueryTransparentproxyNodeResponse queryTransparentproxyNode(QueryTransparentproxyNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTransparentproxyNodeEx(request, headers, runtime);
    }

    /**
     * Description: 查询透明劫持应用的节点列表。
     * Summary: 查询透明劫持应用的节点列表
     */
    public QueryTransparentproxyNodeResponse queryTransparentproxyNodeEx(QueryTransparentproxyNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.node.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTransparentproxyNodeResponse());
    }

    /**
     * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
     * Summary: 更新透明劫持应用治理配置
     */
    public UpdateTransparentproxyProtocolconfigResponse updateTransparentproxyProtocolconfig(UpdateTransparentproxyProtocolconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTransparentproxyProtocolconfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
     * Summary: 更新透明劫持应用治理配置
     */
    public UpdateTransparentproxyProtocolconfigResponse updateTransparentproxyProtocolconfigEx(UpdateTransparentproxyProtocolconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.protocolconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTransparentproxyProtocolconfigResponse());
    }

    /**
     * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
     * Summary: 打开节点透明劫持开关（批量）
     */
    public EnableTransparentproxyNodeResponse enableTransparentproxyNode(EnableTransparentproxyNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableTransparentproxyNodeEx(request, headers, runtime);
    }

    /**
     * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
     * Summary: 打开节点透明劫持开关（批量）
     */
    public EnableTransparentproxyNodeResponse enableTransparentproxyNodeEx(EnableTransparentproxyNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.node.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableTransparentproxyNodeResponse());
    }

    /**
     * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
     * Summary: 关闭透明劫持节点开关（批量）
     */
    public DisableTransparentproxyNodeResponse disableTransparentproxyNode(DisableTransparentproxyNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableTransparentproxyNodeEx(request, headers, runtime);
    }

    /**
     * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
     * Summary: 关闭透明劫持节点开关（批量）
     */
    public DisableTransparentproxyNodeResponse disableTransparentproxyNodeEx(DisableTransparentproxyNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.node.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableTransparentproxyNodeResponse());
    }

    /**
     * Description: 查询所有的服务熔断的appName及对应的规则数
     * Summary: 服务熔断查询
     */
    public AllSgCircuitbreakerrulesResponse allSgCircuitbreakerrules(AllSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 查询所有的服务熔断的appName及对应的规则数
     * Summary: 服务熔断查询
     */
    public AllSgCircuitbreakerrulesResponse allSgCircuitbreakerrulesEx(AllSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 通过appName查询熔断规则
     * Summary: 通过appName查询熔断规则
     */
    public GetSgCircuitbreakerrulesResponse getSgCircuitbreakerrules(GetSgCircuitbreakerrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSgCircuitbreakerrulesEx(request, headers, runtime);
    }

    /**
     * Description: 通过appName查询熔断规则
     * Summary: 通过appName查询熔断规则
     */
    public GetSgCircuitbreakerrulesResponse getSgCircuitbreakerrulesEx(GetSgCircuitbreakerrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.circuitbreakerrules.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSgCircuitbreakerrulesResponse());
    }

    /**
     * Description: 透明劫持sidecar脚本链接查询接口
     * Summary: 透明劫持sidecar脚本链接查询接口
     */
    public QueryTransparentproxySidecarlinkResponse queryTransparentproxySidecarlink(QueryTransparentproxySidecarlinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTransparentproxySidecarlinkEx(request, headers, runtime);
    }

    /**
     * Description: 透明劫持sidecar脚本链接查询接口
     * Summary: 透明劫持sidecar脚本链接查询接口
     */
    public QueryTransparentproxySidecarlinkResponse queryTransparentproxySidecarlinkEx(QueryTransparentproxySidecarlinkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.transparentproxy.sidecarlink.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTransparentproxySidecarlinkResponse());
    }

    /**
     * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的服务ID
     */
    public ListSgAuthruledataidsResponse listSgAuthruledataids(ListSgAuthruledataidsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuthruledataidsEx(request, headers, runtime);
    }

    /**
     * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的服务ID
     */
    public ListSgAuthruledataidsResponse listSgAuthruledataidsEx(ListSgAuthruledataidsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authruledataids.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuthruledataidsResponse());
    }

    /**
     * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的应用名
     */
    public ListSgAuthruleappnamesResponse listSgAuthruleappnames(ListSgAuthruleappnamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuthruleappnamesEx(request, headers, runtime);
    }

    /**
     * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的应用名
     */
    public ListSgAuthruleappnamesResponse listSgAuthruleappnamesEx(ListSgAuthruleappnamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authruleappnames.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuthruleappnamesResponse());
    }

    /**
     * Description: 查找出目前存活的应用名称列表
     * Summary: 查找出目前存活的应用名称列表
     */
    public ListSgAuthruleactiveappnamesResponse listSgAuthruleactiveappnames(ListSgAuthruleactiveappnamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuthruleactiveappnamesEx(request, headers, runtime);
    }

    /**
     * Description: 查找出目前存活的应用名称列表
     * Summary: 查找出目前存活的应用名称列表
     */
    public ListSgAuthruleactiveappnamesResponse listSgAuthruleactiveappnamesEx(ListSgAuthruleactiveappnamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authruleactiveappnames.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuthruleactiveappnamesResponse());
    }

    /**
     * Description: 查找该应用下存活的服务列表
     * Summary: 查找该应用下存活的服务列表
     */
    public ListSgAuthruleactivedataidsResponse listSgAuthruleactivedataids(ListSgAuthruleactivedataidsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuthruleactivedataidsEx(request, headers, runtime);
    }

    /**
     * Description: 查找该应用下存活的服务列表
     * Summary: 查找该应用下存活的服务列表
     */
    public ListSgAuthruleactivedataidsResponse listSgAuthruleactivedataidsEx(ListSgAuthruleactivedataidsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authruleactivedataids.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuthruleactivedataidsResponse());
    }

    /**
     * Description: 应用级服务鉴权列表搜索
     * Summary: 应用级服务鉴权列表搜索
     */
    public ListSgAuthrulegroupappsResponse listSgAuthrulegroupapps(ListSgAuthrulegroupappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuthrulegroupappsEx(request, headers, runtime);
    }

    /**
     * Description: 应用级服务鉴权列表搜索
     * Summary: 应用级服务鉴权列表搜索
     */
    public ListSgAuthrulegroupappsResponse listSgAuthrulegroupappsEx(ListSgAuthrulegroupappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroupapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuthrulegroupappsResponse());
    }

    /**
     * Description: 服务级服务鉴权列表搜索
     * Summary: 服务级服务鉴权列表搜索
     */
    public ListSgAuthrulegroupservicesResponse listSgAuthrulegroupservices(ListSgAuthrulegroupservicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuthrulegroupservicesEx(request, headers, runtime);
    }

    /**
     * Description: 服务级服务鉴权列表搜索
     * Summary: 服务级服务鉴权列表搜索
     */
    public ListSgAuthrulegroupservicesResponse listSgAuthrulegroupservicesEx(ListSgAuthrulegroupservicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroupservices.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuthrulegroupservicesResponse());
    }

    /**
     * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
     * Summary: 添加鉴权规则
     */
    public AddSgAuthrulegroupsbatchResponse addSgAuthrulegroupsbatch(AddSgAuthrulegroupsbatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgAuthrulegroupsbatchEx(request, headers, runtime);
    }

    /**
     * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
     * Summary: 添加鉴权规则
     */
    public AddSgAuthrulegroupsbatchResponse addSgAuthrulegroupsbatchEx(AddSgAuthrulegroupsbatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroupsbatch.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgAuthrulegroupsbatchResponse());
    }

    /**
     * Description: 批量开启鉴权规则
     * Summary: 批量开启鉴权规则
     */
    public EnableSgAuthrulegroupsbatchResponse enableSgAuthrulegroupsbatch(EnableSgAuthrulegroupsbatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgAuthrulegroupsbatchEx(request, headers, runtime);
    }

    /**
     * Description: 批量开启鉴权规则
     * Summary: 批量开启鉴权规则
     */
    public EnableSgAuthrulegroupsbatchResponse enableSgAuthrulegroupsbatchEx(EnableSgAuthrulegroupsbatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroupsbatch.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgAuthrulegroupsbatchResponse());
    }

    /**
     * Description: 批量关闭鉴权规则
     * Summary: 批量关闭鉴权规则
     */
    public DisableSgAuthrulegroupsbatchResponse disableSgAuthrulegroupsbatch(DisableSgAuthrulegroupsbatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSgAuthrulegroupsbatchEx(request, headers, runtime);
    }

    /**
     * Description: 批量关闭鉴权规则
     * Summary: 批量关闭鉴权规则
     */
    public DisableSgAuthrulegroupsbatchResponse disableSgAuthrulegroupsbatchEx(DisableSgAuthrulegroupsbatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroupsbatch.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSgAuthrulegroupsbatchResponse());
    }

    /**
     * Description: 导出鉴权规则数据
     * Summary: 导出鉴权规则数据
     */
    public ExportSgAuthrulegroupsResponse exportSgAuthrulegroups(ExportSgAuthrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportSgAuthrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 导出鉴权规则数据
     * Summary: 导出鉴权规则数据
     */
    public ExportSgAuthrulegroupsResponse exportSgAuthrulegroupsEx(ExportSgAuthrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroups.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportSgAuthrulegroupsResponse());
    }

    /**
     * Description: 导入鉴权规则数据
     * Summary: 导入鉴权规则数据
     */
    public ImportSgAuthrulegroupsResponse importSgAuthrulegroups(ImportSgAuthrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importSgAuthrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 导入鉴权规则数据
     * Summary: 导入鉴权规则数据
     */
    public ImportSgAuthrulegroupsResponse importSgAuthrulegroupsEx(ImportSgAuthrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.authrulegroups.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportSgAuthrulegroupsResponse());
    }

    /**
     * Description: 资源以文件形式导入导出
     * Summary: 资源以文件形式导入导出
     */
    public ImportSgResourceResponse importSgResource(ImportSgResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importSgResourceEx(request, headers, runtime);
    }

    /**
     * Description: 资源以文件形式导入导出
     * Summary: 资源以文件形式导入导出
     */
    public ImportSgResourceResponse importSgResourceEx(ImportSgResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.resource.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportSgResourceResponse());
    }

    /**
     * Description: 资源以文件形式导出
     * Summary: 资源以文件形式导出
     */
    public ExportSgResourceResponse exportSgResource(ExportSgResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportSgResourceEx(request, headers, runtime);
    }

    /**
     * Description: 资源以文件形式导出
     * Summary: 资源以文件形式导出
     */
    public ExportSgResourceResponse exportSgResourceEx(ExportSgResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.resource.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportSgResourceResponse());
    }

    /**
     * Description: 获取不展示的UI列表
     * Summary: 前端屏蔽UI
     */
    public ListUndisplayComponentsResponse listUndisplayComponents(ListUndisplayComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUndisplayComponentsEx(request, headers, runtime);
    }

    /**
     * Description: 获取不展示的UI列表
     * Summary: 前端屏蔽UI
     */
    public ListUndisplayComponentsResponse listUndisplayComponentsEx(ListUndisplayComponentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.undisplay.components.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUndisplayComponentsResponse());
    }

    /**
     * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
     * Summary: 列表使用的更新服务鉴权接口
     */
    public UpdateSgListauthrulesResponse updateSgListauthrules(UpdateSgListauthrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgListauthrulesEx(request, headers, runtime);
    }

    /**
     * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
     * Summary: 列表使用的更新服务鉴权接口
     */
    public UpdateSgListauthrulesResponse updateSgListauthrulesEx(UpdateSgListauthrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.listauthrules.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgListauthrulesResponse());
    }

    /**
     * Description: 按照条件分页查询限流规则列表数据
     * Summary: 限流规则列表查询
     */
    public ListSgServiceratelimitrulesResponse listSgServiceratelimitrules(ListSgServiceratelimitrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgServiceratelimitrulesEx(request, headers, runtime);
    }

    /**
     * Description: 按照条件分页查询限流规则列表数据
     * Summary: 限流规则列表查询
     */
    public ListSgServiceratelimitrulesResponse listSgServiceratelimitrulesEx(ListSgServiceratelimitrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.serviceratelimitrules.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgServiceratelimitrulesResponse());
    }

    /**
     * Description: 查询故障注入一级列表
     * Summary: 查询故障注入一级列表
     */
    public ListSgFaultinjectappsResponse listSgFaultinjectapps(ListSgFaultinjectappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgFaultinjectappsEx(request, headers, runtime);
    }

    /**
     * Description: 查询故障注入一级列表
     * Summary: 查询故障注入一级列表
     */
    public ListSgFaultinjectappsResponse listSgFaultinjectappsEx(ListSgFaultinjectappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgFaultinjectappsResponse());
    }

    /**
     * Description: 分页查询故障注入二级列表
     * Summary: 分页查询故障注入二级列表
     */
    public ListSgFaultinjectrulesResponse listSgFaultinjectrules(ListSgFaultinjectrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgFaultinjectrulesEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询故障注入二级列表
     * Summary: 分页查询故障注入二级列表
     */
    public ListSgFaultinjectrulesResponse listSgFaultinjectrulesEx(ListSgFaultinjectrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectrules.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgFaultinjectrulesResponse());
    }

    /**
     * Description: 查询已添加故障注入规则的应用
     * Summary: 查询已添加故障注入规则的应用
     */
    public ListSgFaultinjectallappsResponse listSgFaultinjectallapps(ListSgFaultinjectallappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgFaultinjectallappsEx(request, headers, runtime);
    }

    /**
     * Description: 查询已添加故障注入规则的应用
     * Summary: 查询已添加故障注入规则的应用
     */
    public ListSgFaultinjectallappsResponse listSgFaultinjectallappsEx(ListSgFaultinjectallappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectallapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgFaultinjectallappsResponse());
    }

    /**
     * Description: 查询已添加故障注入规则的服务
     * Summary: 查询已添加故障注入规则的服务
     */
    public ListSgFaultinjectallservicesResponse listSgFaultinjectallservices(ListSgFaultinjectallservicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgFaultinjectallservicesEx(request, headers, runtime);
    }

    /**
     * Description: 查询已添加故障注入规则的服务
     * Summary: 查询已添加故障注入规则的服务
     */
    public ListSgFaultinjectallservicesResponse listSgFaultinjectallservicesEx(ListSgFaultinjectallservicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectallservices.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgFaultinjectallservicesResponse());
    }

    /**
     * Description: 更新故障注入规则
     * Summary: 更新故障注入规则
     */
    public UpdateSgFaultinjectruleResponse updateSgFaultinjectrule(UpdateSgFaultinjectruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgFaultinjectruleEx(request, headers, runtime);
    }

    /**
     * Description: 更新故障注入规则
     * Summary: 更新故障注入规则
     */
    public UpdateSgFaultinjectruleResponse updateSgFaultinjectruleEx(UpdateSgFaultinjectruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectrule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgFaultinjectruleResponse());
    }

    /**
     * Description: 新增故障注入规则
     * Summary: 新增故障注入规则
     */
    public AddSgFaultinjectruleResponse addSgFaultinjectrule(AddSgFaultinjectruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgFaultinjectruleEx(request, headers, runtime);
    }

    /**
     * Description: 新增故障注入规则
     * Summary: 新增故障注入规则
     */
    public AddSgFaultinjectruleResponse addSgFaultinjectruleEx(AddSgFaultinjectruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectrule.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgFaultinjectruleResponse());
    }

    /**
     * Description: 更新故障注入规则状态
     * Summary: 更新故障注入规则状态
     */
    public UpdateSgFaultinjectrulestatusResponse updateSgFaultinjectrulestatus(UpdateSgFaultinjectrulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgFaultinjectrulestatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新故障注入规则状态
     * Summary: 更新故障注入规则状态
     */
    public UpdateSgFaultinjectrulestatusResponse updateSgFaultinjectrulestatusEx(UpdateSgFaultinjectrulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectrulestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgFaultinjectrulestatusResponse());
    }

    /**
     * Description: 删除故障注入规则
     * Summary: 删除故障注入规则
     */
    public DeleteSgFaultinjectruleResponse deleteSgFaultinjectrule(DeleteSgFaultinjectruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgFaultinjectruleEx(request, headers, runtime);
    }

    /**
     * Description: 删除故障注入规则
     * Summary: 删除故障注入规则
     */
    public DeleteSgFaultinjectruleResponse deleteSgFaultinjectruleEx(DeleteSgFaultinjectruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faultinjectrule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgFaultinjectruleResponse());
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表
     */
    public ListSgAppsResponse listSgApps(ListSgAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAppsEx(request, headers, runtime);
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表
     */
    public ListSgAppsResponse listSgAppsEx(ListSgAppsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.apps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAppsResponse());
    }

    /**
     * Description: 查询服务路由一级列表
     * Summary: 查询服务路由一级列表
     */
    public ListSgRouterrulegroupappsResponse listSgRouterrulegroupapps(ListSgRouterrulegroupappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgRouterrulegroupappsEx(request, headers, runtime);
    }

    /**
     * Description: 查询服务路由一级列表
     * Summary: 查询服务路由一级列表
     */
    public ListSgRouterrulegroupappsResponse listSgRouterrulegroupappsEx(ListSgRouterrulegroupappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulegroupapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgRouterrulegroupappsResponse());
    }

    /**
     * Description: 查询服务路由二级例表
     * Summary: 查询服务路由二级例表
     */
    public ListSgRouterrulegroupsResponse listSgRouterrulegroups(ListSgRouterrulegroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgRouterrulegroupsEx(request, headers, runtime);
    }

    /**
     * Description: 查询服务路由二级例表
     * Summary: 查询服务路由二级例表
     */
    public ListSgRouterrulegroupsResponse listSgRouterrulegroupsEx(ListSgRouterrulegroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulegroups.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgRouterrulegroupsResponse());
    }

    /**
     * Description: 查询已存在服务路由规则的应用接口
     * Summary: 查询已存在服务路由规则的应用接口
     */
    public ListSgRouterruleallappsResponse listSgRouterruleallapps(ListSgRouterruleallappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgRouterruleallappsEx(request, headers, runtime);
    }

    /**
     * Description: 查询已存在服务路由规则的应用接口
     * Summary: 查询已存在服务路由规则的应用接口
     */
    public ListSgRouterruleallappsResponse listSgRouterruleallappsEx(ListSgRouterruleallappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerruleallapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgRouterruleallappsResponse());
    }

    /**
     * Description: 查询已存在服务路由规则的服务接口
     * Summary: 查询已存在服务路由规则的服务接口
     */
    public ListSgRouterruleallservicesResponse listSgRouterruleallservices(ListSgRouterruleallservicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgRouterruleallservicesEx(request, headers, runtime);
    }

    /**
     * Description: 查询已存在服务路由规则的服务接口
     * Summary: 查询已存在服务路由规则的服务接口
     */
    public ListSgRouterruleallservicesResponse listSgRouterruleallservicesEx(ListSgRouterruleallservicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerruleallservices.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgRouterruleallservicesResponse());
    }

    /**
     * Description: 更新路由规则组状态
     * Summary: 更新路由规则组状态
     */
    public UpdateSgRouterrulegroupstatusResponse updateSgRouterrulegroupstatus(UpdateSgRouterrulegroupstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgRouterrulegroupstatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新路由规则组状态
     * Summary: 更新路由规则组状态
     */
    public UpdateSgRouterrulegroupstatusResponse updateSgRouterrulegroupstatusEx(UpdateSgRouterrulegroupstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulegroupstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgRouterrulegroupstatusResponse());
    }

    /**
     * Description: 删除路由规则组
     * Summary: 删除路由规则组
     */
    public DeleteSgRouterrulegroupResponse deleteSgRouterrulegroup(DeleteSgRouterrulegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgRouterrulegroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除路由规则组
     * Summary: 删除路由规则组
     */
    public DeleteSgRouterrulegroupResponse deleteSgRouterrulegroupEx(DeleteSgRouterrulegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.routerrulegroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgRouterrulegroupResponse());
    }

    /**
     * Description: 故障隔离App列表及其规则数量
     * Summary: 故障隔离App列表
     */
    public ListSgFaulttoleranceappsResponse listSgFaulttoleranceapps(ListSgFaulttoleranceappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgFaulttoleranceappsEx(request, headers, runtime);
    }

    /**
     * Description: 故障隔离App列表及其规则数量
     * Summary: 故障隔离App列表
     */
    public ListSgFaulttoleranceappsResponse listSgFaulttoleranceappsEx(ListSgFaulttoleranceappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faulttoleranceapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgFaulttoleranceappsResponse());
    }

    /**
     * Description: 故障隔离规则列表
     * Summary: 故障隔离规则列表
     */
    public ListSgFaulttolerancerulesResponse listSgFaulttolerancerules(ListSgFaulttolerancerulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgFaulttolerancerulesEx(request, headers, runtime);
    }

    /**
     * Description: 故障隔离规则列表
     * Summary: 故障隔离规则列表
     */
    public ListSgFaulttolerancerulesResponse listSgFaulttolerancerulesEx(ListSgFaulttolerancerulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faulttolerancerules.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgFaulttolerancerulesResponse());
    }

    /**
     * Description: 故障隔离规则新增
     * Summary: 故障隔离规则新增
     */
    public AddSgFaulttoleranceruleResponse addSgFaulttolerancerule(AddSgFaulttoleranceruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgFaulttoleranceruleEx(request, headers, runtime);
    }

    /**
     * Description: 故障隔离规则新增
     * Summary: 故障隔离规则新增
     */
    public AddSgFaulttoleranceruleResponse addSgFaulttoleranceruleEx(AddSgFaulttoleranceruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faulttolerancerule.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgFaulttoleranceruleResponse());
    }

    /**
     * Description: 故障隔离规则更新
     * Summary: 故障隔离规则更新
     */
    public UpdateSgFaulttoleranceruleResponse updateSgFaulttolerancerule(UpdateSgFaulttoleranceruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgFaulttoleranceruleEx(request, headers, runtime);
    }

    /**
     * Description: 故障隔离规则更新
     * Summary: 故障隔离规则更新
     */
    public UpdateSgFaulttoleranceruleResponse updateSgFaulttoleranceruleEx(UpdateSgFaulttoleranceruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faulttolerancerule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgFaulttoleranceruleResponse());
    }

    /**
     * Description: 故障隔离规则删除
     * Summary: 故障隔离规则删除
     */
    public DeleteSgFaulttoleranceruleResponse deleteSgFaulttolerancerule(DeleteSgFaulttoleranceruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgFaulttoleranceruleEx(request, headers, runtime);
    }

    /**
     * Description: 故障隔离规则删除
     * Summary: 故障隔离规则删除
     */
    public DeleteSgFaulttoleranceruleResponse deleteSgFaulttoleranceruleEx(DeleteSgFaulttoleranceruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faulttolerancerule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgFaulttoleranceruleResponse());
    }

    /**
     * Description: 故障隔离规则启用
     * Summary: 故障隔离规则启用
     */
    public EnableSgFaulttoleranceruleResponse enableSgFaulttolerancerule(EnableSgFaulttoleranceruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSgFaulttoleranceruleEx(request, headers, runtime);
    }

    /**
     * Description: 故障隔离规则启用
     * Summary: 故障隔离规则启用
     */
    public EnableSgFaulttoleranceruleResponse enableSgFaulttoleranceruleEx(EnableSgFaulttoleranceruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.faulttolerancerule.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSgFaulttoleranceruleResponse());
    }

    /**
     * Description: 分页查询审计日志
     * Summary: 分页查询审计日志
     */
    public ListSgAuditlogsResponse listSgAuditlogs(ListSgAuditlogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgAuditlogsEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询审计日志
     * Summary: 分页查询审计日志
     */
    public ListSgAuditlogsResponse listSgAuditlogsEx(ListSgAuditlogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.auditlogs.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgAuditlogsResponse());
    }

    /**
     * Description: 查询集群列表
     * Summary: 查询集群列表
     */
    public ListSgMeshclusterResponse listSgMeshcluster(ListSgMeshclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgMeshclusterEx(request, headers, runtime);
    }

    /**
     * Description: 查询集群列表
     * Summary: 查询集群列表
     */
    public ListSgMeshclusterResponse listSgMeshclusterEx(ListSgMeshclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.meshcluster.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgMeshclusterResponse());
    }

    /**
     * Description: 新增集群
     * Summary: 新增集群
     */
    public AddSgMeshclusterResponse addSgMeshcluster(AddSgMeshclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgMeshclusterEx(request, headers, runtime);
    }

    /**
     * Description: 新增集群
     * Summary: 新增集群
     */
    public AddSgMeshclusterResponse addSgMeshclusterEx(AddSgMeshclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.meshcluster.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgMeshclusterResponse());
    }

    /**
     * Description: 更新集群状态
     * Summary: 更新集群状态
     */
    public UpdateSgMeshclusterstatusResponse updateSgMeshclusterstatus(UpdateSgMeshclusterstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgMeshclusterstatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新集群状态
     * Summary: 更新集群状态
     */
    public UpdateSgMeshclusterstatusResponse updateSgMeshclusterstatusEx(UpdateSgMeshclusterstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.meshclusterstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgMeshclusterstatusResponse());
    }

    /**
     * Description: 删除集群
     * Summary: 删除集群
     */
    public DeleteSgMeshclusterResponse deleteSgMeshcluster(DeleteSgMeshclusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgMeshclusterEx(request, headers, runtime);
    }

    /**
     * Description: 删除集群
     * Summary: 删除集群
     */
    public DeleteSgMeshclusterResponse deleteSgMeshclusterEx(DeleteSgMeshclusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.meshcluster.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgMeshclusterResponse());
    }

    /**
     * Description: 查询sideCar注入配置列表
     * Summary: 查询sideCar注入配置列表
     */
    public ListSgSidecarinjectResponse listSgSidecarinject(ListSgSidecarinjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgSidecarinjectEx(request, headers, runtime);
    }

    /**
     * Description: 查询sideCar注入配置列表
     * Summary: 查询sideCar注入配置列表
     */
    public ListSgSidecarinjectResponse listSgSidecarinjectEx(ListSgSidecarinjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.sidecarinject.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgSidecarinjectResponse());
    }

    /**
     * Description: 新增sideCar注入配置
     * Summary: 新增sideCar注入配置
     */
    public AddSgSidecarinjectResponse addSgSidecarinject(AddSgSidecarinjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgSidecarinjectEx(request, headers, runtime);
    }

    /**
     * Description: 新增sideCar注入配置
     * Summary: 新增sideCar注入配置
     */
    public AddSgSidecarinjectResponse addSgSidecarinjectEx(AddSgSidecarinjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.sidecarinject.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgSidecarinjectResponse());
    }

    /**
     * Description: 更新sidecar注入配置
     * Summary: 更新sidecar注入配置
     */
    public UpdateSgSidecarinjectResponse updateSgSidecarinject(UpdateSgSidecarinjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgSidecarinjectEx(request, headers, runtime);
    }

    /**
     * Description: 更新sidecar注入配置
     * Summary: 更新sidecar注入配置
     */
    public UpdateSgSidecarinjectResponse updateSgSidecarinjectEx(UpdateSgSidecarinjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.sidecarinject.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgSidecarinjectResponse());
    }

    /**
     * Description: 删除sideCar注入配置
     * Summary: 删除sideCar注入配置
     */
    public DeleteSgSidecarinjectResponse deleteSgSidecarinject(DeleteSgSidecarinjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgSidecarinjectEx(request, headers, runtime);
    }

    /**
     * Description: 删除sideCar注入配置
     * Summary: 删除sideCar注入配置
     */
    public DeleteSgSidecarinjectResponse deleteSgSidecarinjectEx(DeleteSgSidecarinjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.sidecarinject.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgSidecarinjectResponse());
    }

    /**
     * Description: 开通/关闭sideCar注入配置
     * Summary: 开通/关闭sideCar注入配置
     */
    public UpdateSgSidecarinjectstatusResponse updateSgSidecarinjectstatus(UpdateSgSidecarinjectstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgSidecarinjectstatusEx(request, headers, runtime);
    }

    /**
     * Description: 开通/关闭sideCar注入配置
     * Summary: 开通/关闭sideCar注入配置
     */
    public UpdateSgSidecarinjectstatusResponse updateSgSidecarinjectstatusEx(UpdateSgSidecarinjectstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.sidecarinjectstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgSidecarinjectstatusResponse());
    }

    /**
     * Description: 流量镜像分页查询一级列表
     * Summary: 流量镜像分页查询一级列表
     */
    public ListSgTrafficmirrorappsResponse listSgTrafficmirrorapps(ListSgTrafficmirrorappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgTrafficmirrorappsEx(request, headers, runtime);
    }

    /**
     * Description: 流量镜像分页查询一级列表
     * Summary: 流量镜像分页查询一级列表
     */
    public ListSgTrafficmirrorappsResponse listSgTrafficmirrorappsEx(ListSgTrafficmirrorappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgTrafficmirrorappsResponse());
    }

    /**
     * Description: 流量镜像分页查询二级列表
     * Summary: 流量镜像分页查询二级列表
     */
    public ListSgTrafficmirrorrulesResponse listSgTrafficmirrorrules(ListSgTrafficmirrorrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgTrafficmirrorrulesEx(request, headers, runtime);
    }

    /**
     * Description: 流量镜像分页查询二级列表
     * Summary: 流量镜像分页查询二级列表
     */
    public ListSgTrafficmirrorrulesResponse listSgTrafficmirrorrulesEx(ListSgTrafficmirrorrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorrules.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgTrafficmirrorrulesResponse());
    }

    /**
     * Description: 查询已添加规则的应用
     * Summary: 查询已添加规则的应用
     */
    public ListSgTrafficmirrorallappsResponse listSgTrafficmirrorallapps(ListSgTrafficmirrorallappsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgTrafficmirrorallappsEx(request, headers, runtime);
    }

    /**
     * Description: 查询已添加规则的应用
     * Summary: 查询已添加规则的应用
     */
    public ListSgTrafficmirrorallappsResponse listSgTrafficmirrorallappsEx(ListSgTrafficmirrorallappsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorallapps.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgTrafficmirrorallappsResponse());
    }

    /**
     * Description: 查询已添加规则的服务
     * Summary: 查询已添加规则的服务
     */
    public ListSgTrafficmirrorservicesResponse listSgTrafficmirrorservices(ListSgTrafficmirrorservicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSgTrafficmirrorservicesEx(request, headers, runtime);
    }

    /**
     * Description: 查询已添加规则的服务
     * Summary: 查询已添加规则的服务
     */
    public ListSgTrafficmirrorservicesResponse listSgTrafficmirrorservicesEx(ListSgTrafficmirrorservicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorservices.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSgTrafficmirrorservicesResponse());
    }

    /**
     * Description: 新增流量镜像规则
     * Summary: 新增流量镜像规则
     */
    public AddSgTrafficmirrorruleResponse addSgTrafficmirrorrule(AddSgTrafficmirrorruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSgTrafficmirrorruleEx(request, headers, runtime);
    }

    /**
     * Description: 新增流量镜像规则
     * Summary: 新增流量镜像规则
     */
    public AddSgTrafficmirrorruleResponse addSgTrafficmirrorruleEx(AddSgTrafficmirrorruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorrule.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSgTrafficmirrorruleResponse());
    }

    /**
     * Description: 更新流量镜像规则状态
     * Summary: 更新流量镜像规则状态
     */
    public UpdateSgTrafficmirrorrulestatusResponse updateSgTrafficmirrorrulestatus(UpdateSgTrafficmirrorrulestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgTrafficmirrorrulestatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新流量镜像规则状态
     * Summary: 更新流量镜像规则状态
     */
    public UpdateSgTrafficmirrorrulestatusResponse updateSgTrafficmirrorrulestatusEx(UpdateSgTrafficmirrorrulestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorrulestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgTrafficmirrorrulestatusResponse());
    }

    /**
     * Description: 删除流量镜像规则
     * Summary: 删除流量镜像规则
     */
    public DeleteSgTrafficmirrorruleResponse deleteSgTrafficmirrorrule(DeleteSgTrafficmirrorruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSgTrafficmirrorruleEx(request, headers, runtime);
    }

    /**
     * Description: 删除流量镜像规则
     * Summary: 删除流量镜像规则
     */
    public DeleteSgTrafficmirrorruleResponse deleteSgTrafficmirrorruleEx(DeleteSgTrafficmirrorruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorrule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSgTrafficmirrorruleResponse());
    }

    /**
     * Description: 更新流量镜像规则
     * Summary: 更新流量镜像规则
     */
    public UpdateSgTrafficmirrorruleResponse updateSgTrafficmirrorrule(UpdateSgTrafficmirrorruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSgTrafficmirrorruleEx(request, headers, runtime);
    }

    /**
     * Description: 更新流量镜像规则
     * Summary: 更新流量镜像规则
     */
    public UpdateSgTrafficmirrorruleResponse updateSgTrafficmirrorruleEx(UpdateSgTrafficmirrorruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.sg.trafficmirrorrule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSgTrafficmirrorruleResponse());
    }

    /**
     * Description: 查询通信安全规则列表接口
     * Summary: 查询列表接口
     */
    public ListSafeCommunicationrulesResponse listSafeCommunicationrules(ListSafeCommunicationrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSafeCommunicationrulesEx(request, headers, runtime);
    }

    /**
     * Description: 查询通信安全规则列表接口
     * Summary: 查询列表接口
     */
    public ListSafeCommunicationrulesResponse listSafeCommunicationrulesEx(ListSafeCommunicationrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.safe.communicationrules.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSafeCommunicationrulesResponse());
    }

    /**
     * Description: 获取rule规则详情
     * Summary: 获取规则详情
     */
    public GetSafeCommunicationruleResponse getSafeCommunicationrule(GetSafeCommunicationruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSafeCommunicationruleEx(request, headers, runtime);
    }

    /**
     * Description: 获取rule规则详情
     * Summary: 获取规则详情
     */
    public GetSafeCommunicationruleResponse getSafeCommunicationruleEx(GetSafeCommunicationruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.safe.communicationrule.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSafeCommunicationruleResponse());
    }

    /**
     * Description: 新增通信规则接口
     * Summary: 新增通信规则接口
     */
    public AddSafeCommunicationruleResponse addSafeCommunicationrule(AddSafeCommunicationruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSafeCommunicationruleEx(request, headers, runtime);
    }

    /**
     * Description: 新增通信规则接口
     * Summary: 新增通信规则接口
     */
    public AddSafeCommunicationruleResponse addSafeCommunicationruleEx(AddSafeCommunicationruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.safe.communicationrule.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSafeCommunicationruleResponse());
    }

    /**
     * Description: 修改通信安全规则
     * Summary: 修改通信安全规则
     */
    public UpdateSafeCommunicationruleResponse updateSafeCommunicationrule(UpdateSafeCommunicationruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSafeCommunicationruleEx(request, headers, runtime);
    }

    /**
     * Description: 修改通信安全规则
     * Summary: 修改通信安全规则
     */
    public UpdateSafeCommunicationruleResponse updateSafeCommunicationruleEx(UpdateSafeCommunicationruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.safe.communicationrule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSafeCommunicationruleResponse());
    }

    /**
     * Description: 删除通信规则接口
     * Summary: 删除通信规则接口
     */
    public DeleteSafeCommunicationruleResponse deleteSafeCommunicationrule(DeleteSafeCommunicationruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSafeCommunicationruleEx(request, headers, runtime);
    }

    /**
     * Description: 删除通信规则接口
     * Summary: 删除通信规则接口
     */
    public DeleteSafeCommunicationruleResponse deleteSafeCommunicationruleEx(DeleteSafeCommunicationruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.safe.communicationrule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSafeCommunicationruleResponse());
    }

    /**
     * Description: 修改通信规则生效状态
     * Summary: 修改通信规则状态
     */
    public EnableSafeCommunicationruleResponse enableSafeCommunicationrule(EnableSafeCommunicationruleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSafeCommunicationruleEx(request, headers, runtime);
    }

    /**
     * Description: 修改通信规则生效状态
     * Summary: 修改通信规则状态
     */
    public EnableSafeCommunicationruleResponse enableSafeCommunicationruleEx(EnableSafeCommunicationruleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.ms.safe.communicationrule.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSafeCommunicationruleResponse());
    }
}
