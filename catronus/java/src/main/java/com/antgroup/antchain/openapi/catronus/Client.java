// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.catronus.models.*;
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
                    new TeaPair("sdk_version", "1.0.80"),
                    new TeaPair("_prod_code", "CATRONUS"),
                    new TeaPair("_prod_channel", "default")
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
     * Description: 创建风险工单/任务
     * Summary: 创建风险工单/任务
     */
    public CreateRiskTaskResponse createRiskTask(CreateRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 创建风险工单/任务
     * Summary: 创建风险工单/任务
     */
    public CreateRiskTaskResponse createRiskTaskEx(CreateRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRiskTaskResponse());
    }

    /**
     * Description: 查询风险任务列表
     * Summary: 查询风险任务列表
     */
    public QueryRiskTasksResponse queryRiskTasks(QueryRiskTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskTasksEx(request, headers, runtime);
    }

    /**
     * Description: 查询风险任务列表
     * Summary: 查询风险任务列表
     */
    public QueryRiskTasksResponse queryRiskTasksEx(QueryRiskTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.tasks.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskTasksResponse());
    }

    /**
     * Description: 获取风险更单详情
     * Summary: 获取风险更单详情
     */
    public GetRiskTaskResponse getRiskTask(GetRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 获取风险更单详情
     * Summary: 获取风险更单详情
     */
    public GetRiskTaskResponse getRiskTaskEx(GetRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRiskTaskResponse());
    }

    /**
     * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
     * Summary: 更新风险工单
     */
    public UpdateRiskTaskResponse updateRiskTask(UpdateRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
     * Summary: 更新风险工单
     */
    public UpdateRiskTaskResponse updateRiskTaskEx(UpdateRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRiskTaskResponse());
    }

    /**
     * Description: 确认风险工单
     * Summary: 确认风险工单
     */
    public ConfirmRiskTaskResponse confirmRiskTask(ConfirmRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 确认风险工单
     * Summary: 确认风险工单
     */
    public ConfirmRiskTaskResponse confirmRiskTaskEx(ConfirmRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmRiskTaskResponse());
    }

    /**
     * Description: 撤销风险工单
     * Summary: 撤销风险工单
     */
    public CancelRiskTaskResponse cancelRiskTask(CancelRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 撤销风险工单
     * Summary: 撤销风险工单
     */
    public CancelRiskTaskResponse cancelRiskTaskEx(CancelRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelRiskTaskResponse());
    }

    /**
     * Description: 驳回风险工单
     * Summary: 驳回风险工单
     */
    public RefuseRiskTaskResponse refuseRiskTask(RefuseRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 驳回风险工单
     * Summary: 驳回风险工单
     */
    public RefuseRiskTaskResponse refuseRiskTaskEx(RefuseRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseRiskTaskResponse());
    }

    /**
     * Description: 确认风险工单修复
     * Summary: 确认风险工单修复
     */
    public VerifyRiskTaskResponse verifyRiskTask(VerifyRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 确认风险工单修复
     * Summary: 确认风险工单修复
     */
    public VerifyRiskTaskResponse verifyRiskTaskEx(VerifyRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyRiskTaskResponse());
    }

    /**
     * Description: 转派工单负责人
     * Summary: 转派工单负责人
     */
    public SendRiskTaskResponse sendRiskTask(SendRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 转派工单负责人
     * Summary: 转派工单负责人
     */
    public SendRiskTaskResponse sendRiskTaskEx(SendRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendRiskTaskResponse());
    }

    /**
     * Description: 确认风险工单修复，待安全Owner确认
     * Summary: 确认风险工单修复
     */
    public CloseRiskTaskResponse closeRiskTask(CloseRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 确认风险工单修复，待安全Owner确认
     * Summary: 确认风险工单修复
     */
    public CloseRiskTaskResponse closeRiskTaskEx(CloseRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseRiskTaskResponse());
    }

    /**
     * Description: 获取个人风险项统计
     * Summary: 获取个人风险项统计
     */
    public GetRiskStatisticsResponse getRiskStatistics(GetRiskStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRiskStatisticsEx(request, headers, runtime);
    }

    /**
     * Description: 获取个人风险项统计
     * Summary: 获取个人风险项统计
     */
    public GetRiskStatisticsResponse getRiskStatisticsEx(GetRiskStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.statistics.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRiskStatisticsResponse());
    }

    /**
     * Description: 查询风险日志审计
     * Summary: 查询风险日志审计
     */
    public QueryRiskAuditsResponse queryRiskAudits(QueryRiskAuditsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskAuditsEx(request, headers, runtime);
    }

    /**
     * Description: 查询风险日志审计
     * Summary: 查询风险日志审计
     */
    public QueryRiskAuditsResponse queryRiskAuditsEx(QueryRiskAuditsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.audits.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskAuditsResponse());
    }

    /**
     * Description: 创建风险解决方案
     * Summary: 创建风险解决方案
     */
    public CreateRiskSolutionResponse createRiskSolution(CreateRiskSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRiskSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 创建风险解决方案
     * Summary: 创建风险解决方案
     */
    public CreateRiskSolutionResponse createRiskSolutionEx(CreateRiskSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.solution.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRiskSolutionResponse());
    }

    /**
     * Description: 查询风险解决方案列表
     * Summary: 查询风险解决方案
     */
    public QueryRiskSolutionsResponse queryRiskSolutions(QueryRiskSolutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskSolutionsEx(request, headers, runtime);
    }

    /**
     * Description: 查询风险解决方案列表
     * Summary: 查询风险解决方案
     */
    public QueryRiskSolutionsResponse queryRiskSolutionsEx(QueryRiskSolutionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.solutions.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskSolutionsResponse());
    }

    /**
     * Description: 获取风险解决方案详情
     * Summary: 获取风险解决方案
     */
    public GetRiskSolutionResponse getRiskSolution(GetRiskSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRiskSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 获取风险解决方案详情
     * Summary: 获取风险解决方案
     */
    public GetRiskSolutionResponse getRiskSolutionEx(GetRiskSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.solution.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRiskSolutionResponse());
    }

    /**
     * Description: 更新风险解决方案
     * Summary: 更新风险解决方案
     */
    public UpdateRiskSolutionResponse updateRiskSolution(UpdateRiskSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRiskSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 更新风险解决方案
     * Summary: 更新风险解决方案
     */
    public UpdateRiskSolutionResponse updateRiskSolutionEx(UpdateRiskSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.solution.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRiskSolutionResponse());
    }

    /**
     * Description: 删除风险解决方案
     * Summary: 删除风险解决方案
     */
    public DeleteRiskSolutionResponse deleteRiskSolution(DeleteRiskSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRiskSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 删除风险解决方案
     * Summary: 删除风险解决方案
     */
    public DeleteRiskSolutionResponse deleteRiskSolutionEx(DeleteRiskSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.solution.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteRiskSolutionResponse());
    }

    /**
     * Description: 纳管目标k8s集群
     * Summary: 导入（纳管）集群
     */
    public ImportClusterResponse importCluster(ImportClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importClusterEx(request, headers, runtime);
    }

    /**
     * Description: 纳管目标k8s集群
     * Summary: 导入（纳管）集群
     */
    public ImportClusterResponse importClusterEx(ImportClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportClusterResponse());
    }

    /**
     * Description: 手动新增集群
     * Summary: 手动新增集群
     */
    public AddClusterResponse addCluster(AddClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addClusterEx(request, headers, runtime);
    }

    /**
     * Description: 手动新增集群
     * Summary: 手动新增集群
     */
    public AddClusterResponse addClusterEx(AddClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddClusterResponse());
    }

    /**
     * Description: 查询集群
     * Summary: 查询集群
     */
    public QueryClusterResponse queryCluster(QueryClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterEx(request, headers, runtime);
    }

    /**
     * Description: 查询集群
     * Summary: 查询集群
     */
    public QueryClusterResponse queryClusterEx(QueryClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterResponse());
    }

    /**
     * Description: 查询集群namespace
     * Summary: 查询集群namespace
     */
    public QueryClusterNamespaceResponse queryClusterNamespace(QueryClusterNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询集群namespace
     * Summary: 查询集群namespace
     */
    public QueryClusterNamespaceResponse queryClusterNamespaceEx(QueryClusterNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.namespace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterNamespaceResponse());
    }

    /**
     * Description: 解绑集群
     * Summary: 解绑集群
     */
    public ReclaimClusterResponse reclaimCluster(ReclaimClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reclaimClusterEx(request, headers, runtime);
    }

    /**
     * Description: 解绑集群
     * Summary: 解绑集群
     */
    public ReclaimClusterResponse reclaimClusterEx(ReclaimClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.reclaim", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReclaimClusterResponse());
    }

    /**
     * Description: 获取集群安全简报列表
     * Summary: 获取集群安全简报列表
     */
    public QueryClusterBriefResponse queryClusterBrief(QueryClusterBriefRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterBriefEx(request, headers, runtime);
    }

    /**
     * Description: 获取集群安全简报列表
     * Summary: 获取集群安全简报列表
     */
    public QueryClusterBriefResponse queryClusterBriefEx(QueryClusterBriefRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.brief.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterBriefResponse());
    }

    /**
     * Description: 获取默认策略
     * Summary: 获取默认策略
     */
    public GetStrategyDefaultResponse getStrategyDefault(GetStrategyDefaultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStrategyDefaultEx(request, headers, runtime);
    }

    /**
     * Description: 获取默认策略
     * Summary: 获取默认策略
     */
    public GetStrategyDefaultResponse getStrategyDefaultEx(GetStrategyDefaultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.strategy.default.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetStrategyDefaultResponse());
    }

    /**
     * Description: 设置安全策略
     * Summary: 设置安全策略
     */
    public AddStrategyResponse addStrategy(AddStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 设置安全策略
     * Summary: 设置安全策略
     */
    public AddStrategyResponse addStrategyEx(AddStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.strategy.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddStrategyResponse());
    }

    /**
     * Description: 绑定集群
     * Summary: 绑定集群
     */
    public BindStrategyResponse bindStrategy(BindStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 绑定集群
     * Summary: 绑定集群
     */
    public BindStrategyResponse bindStrategyEx(BindStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.strategy.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindStrategyResponse());
    }

    /**
     * Description: 风险列表
     * Summary: 风险列表
     */
    public QueryRisksResponse queryRisks(QueryRisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRisksEx(request, headers, runtime);
    }

    /**
     * Description: 风险列表
     * Summary: 风险列表
     */
    public QueryRisksResponse queryRisksEx(QueryRisksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risks.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRisksResponse());
    }

    /**
     * Description: 更新策略
     * Summary: 更新策略
     */
    public UpdateStrategyResponse updateStrategy(UpdateStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 更新策略
     * Summary: 更新策略
     */
    public UpdateStrategyResponse updateStrategyEx(UpdateStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.strategy.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateStrategyResponse());
    }

    /**
     * Description: 拉策略列表
     * Summary: 拉策略列表
     */
    public QueryStrategyResponse queryStrategy(QueryStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStrategyEx(request, headers, runtime);
    }

    /**
     * Description: 拉策略列表
     * Summary: 拉策略列表
     */
    public QueryStrategyResponse queryStrategyEx(QueryStrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.strategy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStrategyResponse());
    }

    /**
     * Description: 风险任务延期
     * Summary: 风险任务延期
     */
    public ScaleRiskTaskResponse scaleRiskTask(ScaleRiskTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleRiskTaskEx(request, headers, runtime);
    }

    /**
     * Description: 风险任务延期
     * Summary: 风险任务延期
     */
    public ScaleRiskTaskResponse scaleRiskTaskEx(ScaleRiskTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.risk.task.scale", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleRiskTaskResponse());
    }

    /**
     * Description: 查询集群镜像列表
     * Summary: 查询集群镜像列表
     */
    public ListClusterImagesResponse listClusterImages(ListClusterImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterImagesEx(request, headers, runtime);
    }

    /**
     * Description: 查询集群镜像列表
     * Summary: 查询集群镜像列表
     */
    public ListClusterImagesResponse listClusterImagesEx(ListClusterImagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.images.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListClusterImagesResponse());
    }

    /**
     * Description: 主动触发快速扫描
     * Summary: 主动触发快速扫描
     */
    public StartClusterQuickscanResponse startClusterQuickscan(StartClusterQuickscanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startClusterQuickscanEx(request, headers, runtime);
    }

    /**
     * Description: 主动触发快速扫描
     * Summary: 主动触发快速扫描
     */
    public StartClusterQuickscanResponse startClusterQuickscanEx(StartClusterQuickscanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.quickscan.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartClusterQuickscanResponse());
    }

    /**
     * Description: 查询扫描结果
     * Summary: 查询扫描结果
     */
    public QueryClusterScanResponse queryClusterScan(QueryClusterScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterScanEx(request, headers, runtime);
    }

    /**
     * Description: 查询扫描结果
     * Summary: 查询扫描结果
     */
    public QueryClusterScanResponse queryClusterScanEx(QueryClusterScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.scan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterScanResponse());
    }

    /**
     * Description: 创建运行时策略
     * Summary: 创建运行时策略
     */
    public CreateRuntimePolicyResponse createRuntimePolicy(CreateRuntimePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRuntimePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 创建运行时策略
     * Summary: 创建运行时策略
     */
    public CreateRuntimePolicyResponse createRuntimePolicyEx(CreateRuntimePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.runtime.policy.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRuntimePolicyResponse());
    }

    /**
     * Description: 查询运行时策略列表
     * Summary: 查询运行时策略列表
     */
    public ListRuntimePoliciesResponse listRuntimePolicies(ListRuntimePoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuntimePoliciesEx(request, headers, runtime);
    }

    /**
     * Description: 查询运行时策略列表
     * Summary: 查询运行时策略列表
     */
    public ListRuntimePoliciesResponse listRuntimePoliciesEx(ListRuntimePoliciesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.runtime.policies.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRuntimePoliciesResponse());
    }

    /**
     * Description: 更新运行时策略
     * Summary: 更新运行时策略
     */
    public UpdateRuntimePolicyResponse updateRuntimePolicy(UpdateRuntimePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRuntimePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 更新运行时策略
     * Summary: 更新运行时策略
     */
    public UpdateRuntimePolicyResponse updateRuntimePolicyEx(UpdateRuntimePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.runtime.policy.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRuntimePolicyResponse());
    }

    /**
     * Description: 删除运行时策略
     * Summary: 删除运行时策略
     */
    public DeleteRuntimePolicyResponse deleteRuntimePolicy(DeleteRuntimePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRuntimePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 删除运行时策略
     * Summary: 删除运行时策略
     */
    public DeleteRuntimePolicyResponse deleteRuntimePolicyEx(DeleteRuntimePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.runtime.policy.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteRuntimePolicyResponse());
    }

    /**
     * Description: 获取运行时策略目标Pods
     * Summary: 获取运行时策略Pods
     */
    public ListRuntimepolicyPodsResponse listRuntimepolicyPods(ListRuntimepolicyPodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuntimepolicyPodsEx(request, headers, runtime);
    }

    /**
     * Description: 获取运行时策略目标Pods
     * Summary: 获取运行时策略Pods
     */
    public ListRuntimepolicyPodsResponse listRuntimepolicyPodsEx(ListRuntimepolicyPodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.runtimepolicy.pods.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRuntimepolicyPodsResponse());
    }

    /**
     * Description: 获取运行时策略Nodes
     * Summary: 获取运行时策略Nodes
     */
    public ListRuntimepolicyNodesResponse listRuntimepolicyNodes(ListRuntimepolicyNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuntimepolicyNodesEx(request, headers, runtime);
    }

    /**
     * Description: 获取运行时策略Nodes
     * Summary: 获取运行时策略Nodes
     */
    public ListRuntimepolicyNodesResponse listRuntimepolicyNodesEx(ListRuntimepolicyNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.runtimepolicy.nodes.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRuntimepolicyNodesResponse());
    }

    /**
     * Description: 获取运行时策略详情
     * Summary: 获取运行时策略详情
     */
    public GetRuntimePolicyResponse getRuntimePolicy(GetRuntimePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRuntimePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 获取运行时策略详情
     * Summary: 获取运行时策略详情
     */
    public GetRuntimePolicyResponse getRuntimePolicyEx(GetRuntimePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.runtime.policy.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRuntimePolicyResponse());
    }

    /**
     * Description: 基线扫描结果查询
     * Summary: 基线扫描结果查询
     */
    public QueryClusterBaselineResponse queryClusterBaseline(QueryClusterBaselineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryClusterBaselineEx(request, headers, runtime);
    }

    /**
     * Description: 基线扫描结果查询
     * Summary: 基线扫描结果查询
     */
    public QueryClusterBaselineResponse queryClusterBaselineEx(QueryClusterBaselineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.baseline.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryClusterBaselineResponse());
    }

    /**
     * Description: 提交镜像扫描触发任务
     * Summary: 提交镜像扫描触发任务
     */
    public SubmitImagesReposcanResponse submitImagesReposcan(SubmitImagesReposcanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitImagesReposcanEx(request, headers, runtime);
    }

    /**
     * Description: 提交镜像扫描触发任务
     * Summary: 提交镜像扫描触发任务
     */
    public SubmitImagesReposcanResponse submitImagesReposcanEx(SubmitImagesReposcanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.images.reposcan.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitImagesReposcanResponse());
    }

    /**
     * Description: 创建镜像仓库
     * Summary: 创建镜像仓库
     */
    public CreateImageRepoResponse createImageRepo(CreateImageRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createImageRepoEx(request, headers, runtime);
    }

    /**
     * Description: 创建镜像仓库
     * Summary: 创建镜像仓库
     */
    public CreateImageRepoResponse createImageRepoEx(CreateImageRepoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.repo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateImageRepoResponse());
    }

    /**
     * Description: 查询镜像仓库列表
     * Summary: 查询镜像仓库列表
     */
    public QueryImageReposResponse queryImageRepos(QueryImageReposRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImageReposEx(request, headers, runtime);
    }

    /**
     * Description: 查询镜像仓库列表
     * Summary: 查询镜像仓库列表
     */
    public QueryImageReposResponse queryImageReposEx(QueryImageReposRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.repos.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryImageReposResponse());
    }

    /**
     * Description: 删除镜像仓库
     * Summary: 删除镜像仓库
     */
    public DeleteImageRepoResponse deleteImageRepo(DeleteImageRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteImageRepoEx(request, headers, runtime);
    }

    /**
     * Description: 删除镜像仓库
     * Summary: 删除镜像仓库
     */
    public DeleteImageRepoResponse deleteImageRepoEx(DeleteImageRepoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.repo.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteImageRepoResponse());
    }

    /**
     * Description: 获取镜像漏洞详情地址
     * Summary: 获取镜像漏洞详情地址
     */
    public GetImageRiskdetailurlResponse getImageRiskdetailurl(GetImageRiskdetailurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageRiskdetailurlEx(request, headers, runtime);
    }

    /**
     * Description: 获取镜像漏洞详情地址
     * Summary: 获取镜像漏洞详情地址
     */
    public GetImageRiskdetailurlResponse getImageRiskdetailurlEx(GetImageRiskdetailurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.riskdetailurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetImageRiskdetailurlResponse());
    }

    /**
     * Description: 创建镜像仓库扫描策略
     * Summary: 创建镜像仓库扫描策略
     */
    public CreateImageReposcanstrategyResponse createImageReposcanstrategy(CreateImageReposcanstrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createImageReposcanstrategyEx(request, headers, runtime);
    }

    /**
     * Description: 创建镜像仓库扫描策略
     * Summary: 创建镜像仓库扫描策略
     */
    public CreateImageReposcanstrategyResponse createImageReposcanstrategyEx(CreateImageReposcanstrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategy.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateImageReposcanstrategyResponse());
    }

    /**
     * Description: 查询仓库项目列表
     * Summary: 查询仓库项目列表
     */
    public QueryImagerepoProjectsResponse queryImagerepoProjects(QueryImagerepoProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImagerepoProjectsEx(request, headers, runtime);
    }

    /**
     * Description: 查询仓库项目列表
     * Summary: 查询仓库项目列表
     */
    public QueryImagerepoProjectsResponse queryImagerepoProjectsEx(QueryImagerepoProjectsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.imagerepo.projects.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryImagerepoProjectsResponse());
    }

    /**
     * Description: 查询仓库列表
     * Summary: 查询仓库列表
     */
    public QueryImagerepoRepositoriesResponse queryImagerepoRepositories(QueryImagerepoRepositoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImagerepoRepositoriesEx(request, headers, runtime);
    }

    /**
     * Description: 查询仓库列表
     * Summary: 查询仓库列表
     */
    public QueryImagerepoRepositoriesResponse queryImagerepoRepositoriesEx(QueryImagerepoRepositoriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.imagerepo.repositories.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryImagerepoRepositoriesResponse());
    }

    /**
     * Description: 更新镜像仓库
     * Summary: 更新镜像仓库
     */
    public UpdateImageRepoResponse updateImageRepo(UpdateImageRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateImageRepoEx(request, headers, runtime);
    }

    /**
     * Description: 更新镜像仓库
     * Summary: 更新镜像仓库
     */
    public UpdateImageRepoResponse updateImageRepoEx(UpdateImageRepoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.repo.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateImageRepoResponse());
    }

    /**
     * Description: 获取镜像仓库详情
     * Summary: 获取镜像仓库详情
     */
    public GetImageRepoResponse getImageRepo(GetImageRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageRepoEx(request, headers, runtime);
    }

    /**
     * Description: 获取镜像仓库详情
     * Summary: 获取镜像仓库详情
     */
    public GetImageRepoResponse getImageRepoEx(GetImageRepoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.repo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetImageRepoResponse());
    }

    /**
     * Description: 校验仓库配置
     * Summary: 校验仓库配置
     */
    public VerifyImageRepoResponse verifyImageRepo(VerifyImageRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyImageRepoEx(request, headers, runtime);
    }

    /**
     * Description: 校验仓库配置
     * Summary: 校验仓库配置
     */
    public VerifyImageRepoResponse verifyImageRepoEx(VerifyImageRepoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.repo.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyImageRepoResponse());
    }

    /**
     * Description: 查询镜像扫描策略
     * Summary: 查询镜像扫描策略
     */
    public QueryImageReposcanstrategiesResponse queryImageReposcanstrategies(QueryImageReposcanstrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImageReposcanstrategiesEx(request, headers, runtime);
    }

    /**
     * Description: 查询镜像扫描策略
     * Summary: 查询镜像扫描策略
     */
    public QueryImageReposcanstrategiesResponse queryImageReposcanstrategiesEx(QueryImageReposcanstrategiesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategies.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryImageReposcanstrategiesResponse());
    }

    /**
     * Description: 删除镜像扫描策略
     * Summary: 删除镜像扫描策略
     */
    public DeleteImageReposcanstrategyResponse deleteImageReposcanstrategy(DeleteImageReposcanstrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteImageReposcanstrategyEx(request, headers, runtime);
    }

    /**
     * Description: 删除镜像扫描策略
     * Summary: 删除镜像扫描策略
     */
    public DeleteImageReposcanstrategyResponse deleteImageReposcanstrategyEx(DeleteImageReposcanstrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategy.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteImageReposcanstrategyResponse());
    }

    /**
     * Description: 更新镜像仓库扫描策略
     * Summary: 更新镜像仓库扫描策略
     */
    public UpdateImageReposcanstrategyResponse updateImageReposcanstrategy(UpdateImageReposcanstrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateImageReposcanstrategyEx(request, headers, runtime);
    }

    /**
     * Description: 更新镜像仓库扫描策略
     * Summary: 更新镜像仓库扫描策略
     */
    public UpdateImageReposcanstrategyResponse updateImageReposcanstrategyEx(UpdateImageReposcanstrategyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategy.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateImageReposcanstrategyResponse());
    }

    /**
     * Description: 忽略某个baseline风险
     * Summary: 忽略某个baseline风险
     */
    public SkipClusterBaselineResponse skipClusterBaseline(SkipClusterBaselineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipClusterBaselineEx(request, headers, runtime);
    }

    /**
     * Description: 忽略某个baseline风险
     * Summary: 忽略某个baseline风险
     */
    public SkipClusterBaselineResponse skipClusterBaselineEx(SkipClusterBaselineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.catronus.cluster.baseline.skip", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SkipClusterBaselineResponse());
    }
}
