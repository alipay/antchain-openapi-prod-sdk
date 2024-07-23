// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.yuqing.models.*;

public class Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

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
        if (com.aliyun.teautil.Common.isUnset(config)) {
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

    /**
     * Encapsulate the request and invoke the network
     * @param action api name
     * @param protocol http or https
     * @param method e.g. GET
     * @param pathname pathname of every api
     * @param request which contains request params
     * @param runtime which controls some details of call api, such as retry times
     * @return the response
     */
    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDuration", _keepAliveDurationMillis),
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
                    new TeaPair("sdk_version", "1.2.29"),
                    new TeaPair("_prod_code", "YUQING"),
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
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

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

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
    }

    /**
     * Description: 查询舆情列表
     * Summary: 查询舆情列表
     */
    public QueryMessagesResponse queryMessages(QueryMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMessagesEx(request, headers, runtime);
    }

    /**
     * Description: 查询舆情列表
     * Summary: 查询舆情列表
     */
    public QueryMessagesResponse queryMessagesEx(QueryMessagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.messages.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMessagesResponse());
    }

    /**
     * Description: 舆情分析任务提交
     * Summary: 舆情分析任务提交
     */
    public SaveAnalysisSubmitResponse saveAnalysisSubmit(SaveAnalysisSubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAnalysisSubmitEx(request, headers, runtime);
    }

    /**
     * Description: 舆情分析任务提交
     * Summary: 舆情分析任务提交
     */
    public SaveAnalysisSubmitResponse saveAnalysisSubmitEx(SaveAnalysisSubmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.analysis.submit.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveAnalysisSubmitResponse());
    }

    /**
     * Description: 舆情分析任务查询
     * Summary: 舆情分析任务查询
     */
    public QueryAnalysisQueryResponse queryAnalysisQuery(QueryAnalysisQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAnalysisQueryEx(request, headers, runtime);
    }

    /**
     * Description: 舆情分析任务查询
     * Summary: 舆情分析任务查询
     */
    public QueryAnalysisQueryResponse queryAnalysisQueryEx(QueryAnalysisQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.analysis.query.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAnalysisQueryResponse());
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     */
    public SaveProductOpenResponse saveProductOpen(SaveProductOpenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveProductOpenEx(request, headers, runtime);
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     */
    public SaveProductOpenResponse saveProductOpenEx(SaveProductOpenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.product.open.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveProductOpenResponse());
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     */
    public SaveProductTopResponse saveProductTop(SaveProductTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveProductTopEx(request, headers, runtime);
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     */
    public SaveProductTopResponse saveProductTopEx(SaveProductTopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.product.top.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveProductTopResponse());
    }

    /**
     * Description: 产品操作接口
     * Summary: 产品操作接口
     */
    public SetProductOperateResponse setProductOperate(SetProductOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setProductOperateEx(request, headers, runtime);
    }

    /**
     * Description: 产品操作接口
     * Summary: 产品操作接口
     */
    public SetProductOperateResponse setProductOperateEx(SetProductOperateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.product.operate.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetProductOperateResponse());
    }

    /**
     * Description: 发送提醒
     * Summary: 发送提醒
     */
    public SendProductNoticeResponse sendProductNotice(SendProductNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendProductNoticeEx(request, headers, runtime);
    }

    /**
     * Description: 发送提醒
     * Summary: 发送提醒
     */
    public SendProductNoticeResponse sendProductNoticeEx(SendProductNoticeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.product.notice.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendProductNoticeResponse());
    }

    /**
     * Description: 创建深度分析
     * Summary: 创建深度分析
     */
    public SaveDeepanalysisSubmitResponse saveDeepanalysisSubmit(SaveDeepanalysisSubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveDeepanalysisSubmitEx(request, headers, runtime);
    }

    /**
     * Description: 创建深度分析
     * Summary: 创建深度分析
     */
    public SaveDeepanalysisSubmitResponse saveDeepanalysisSubmitEx(SaveDeepanalysisSubmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.deepanalysis.submit.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveDeepanalysisSubmitResponse());
    }

    /**
     * Description: 查询深度分析
     * Summary: 查询深度分析
     */
    public QueryDeepanalysisQueryResponse queryDeepanalysisQuery(QueryDeepanalysisQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeepanalysisQueryEx(request, headers, runtime);
    }

    /**
     * Description: 查询深度分析
     * Summary: 查询深度分析
     */
    public QueryDeepanalysisQueryResponse queryDeepanalysisQueryEx(QueryDeepanalysisQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.deepanalysis.query.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeepanalysisQueryResponse());
    }

    /**
     * Description: 获取单个與情
     * Summary: 获取单个
     */
    public GetMessageResponse getMessage(GetMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMessageEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个與情
     * Summary: 获取单个
     */
    public GetMessageResponse getMessageEx(GetMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.message.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMessageResponse());
    }

    /**
     * Description: 查询與情项目
     * Summary: 查询與情项目
     */
    public QueryProjectResponse queryProject(QueryProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProjectEx(request, headers, runtime);
    }

    /**
     * Description: 查询與情项目
     * Summary: 查询與情项目
     */
    public QueryProjectResponse queryProjectEx(QueryProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryProjectResponse());
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectEx(request, headers, runtime);
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目
     */
    public CreateProjectResponse createProjectEx(CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProjectResponse());
    }

    /**
     * Description: 删除项目
     * Summary: 删除项目
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectEx(request, headers, runtime);
    }

    /**
     * Description: 删除项目
     * Summary: 删除项目
     */
    public DeleteProjectResponse deleteProjectEx(DeleteProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.project.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteProjectResponse());
    }

    /**
     * Description: 查询预警消息列表
     * Summary: 查询预警消息列表
     */
    public QueryAlarmResponse queryAlarm(QueryAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmEx(request, headers, runtime);
    }

    /**
     * Description: 查询预警消息列表
     * Summary: 查询预警消息列表
     */
    public QueryAlarmResponse queryAlarmEx(QueryAlarmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.alarm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlarmResponse());
    }

    /**
     * Description: 根据接口获取热搜数据
     * Summary: 與情热搜接口
     */
    public QueryHotspotMessageResponse queryHotspotMessage(QueryHotspotMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryHotspotMessageEx(request, headers, runtime);
    }

    /**
     * Description: 根据接口获取热搜数据
     * Summary: 與情热搜接口
     */
    public QueryHotspotMessageResponse queryHotspotMessageEx(QueryHotspotMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.hotspot.message.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryHotspotMessageResponse());
    }

    /**
     * Description: 與情历史数据异步查询接口
     * Summary: 與情历史数据异步查询接口
     */
    public SubmitMessagesHistoryResponse submitMessagesHistory(SubmitMessagesHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitMessagesHistoryEx(request, headers, runtime);
    }

    /**
     * Description: 與情历史数据异步查询接口
     * Summary: 與情历史数据异步查询接口
     */
    public SubmitMessagesHistoryResponse submitMessagesHistoryEx(SubmitMessagesHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.messages.history.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitMessagesHistoryResponse());
    }

    /**
     * Description: 获取历史與情消息
     * Summary: 获取历史與情消息
     */
    public GetMessagesHistoryResponse getMessagesHistory(GetMessagesHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMessagesHistoryEx(request, headers, runtime);
    }

    /**
     * Description: 获取历史與情消息
     * Summary: 获取历史與情消息
     */
    public GetMessagesHistoryResponse getMessagesHistoryEx(GetMessagesHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.messages.history.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMessagesHistoryResponse());
    }

    /**
     * Description: 提交实时热搜任务
     * Summary: 提交实时热搜任务
     */
    public SubmitHotspotTaskResponse submitHotspotTask(SubmitHotspotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitHotspotTaskEx(request, headers, runtime);
    }

    /**
     * Description: 提交实时热搜任务
     * Summary: 提交实时热搜任务
     */
    public SubmitHotspotTaskResponse submitHotspotTaskEx(SubmitHotspotTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.hotspot.task.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitHotspotTaskResponse());
    }

    /**
     * Description: 获取实时热搜任务结果
     * Summary: 获取实时热搜任务结果
     */
    public GetHotspotTaskResponse getHotspotTask(GetHotspotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotTaskEx(request, headers, runtime);
    }

    /**
     * Description: 获取实时热搜任务结果
     * Summary: 获取实时热搜任务结果
     */
    public GetHotspotTaskResponse getHotspotTaskEx(GetHotspotTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.hotspot.task.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetHotspotTaskResponse());
    }

    /**
     * Description: 获取stsToken，作用于通用SAAS业务
     * Summary: 获取stsToken
     */
    public GetStsTokenResponse getStsToken(GetStsTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStsTokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取stsToken，作用于通用SAAS业务
     * Summary: 获取stsToken
     */
    public GetStsTokenResponse getStsTokenEx(GetStsTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.sts.token.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetStsTokenResponse());
    }

    /**
     * Description: 通用操作接口
     * Summary: 通用操作接口
     */
    public OperateCommonInterfaceResponse operateCommonInterface(OperateCommonInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateCommonInterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 通用操作接口
     * Summary: 通用操作接口
     */
    public OperateCommonInterfaceResponse operateCommonInterfaceEx(OperateCommonInterfaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.yuqing.common.interface.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateCommonInterfaceResponse());
    }
}
