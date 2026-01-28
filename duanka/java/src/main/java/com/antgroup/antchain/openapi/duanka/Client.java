// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.duanka.models.*;

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
     * <b>description</b> :
     * <p>Init client with Config</p>
     * 
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
     * <b>description</b> :
     * <p>Encapsulate the request and invoke the network</p>
     * 
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
                    new TeaPair("sdk_version", "1.1.15"),
                    new TeaPair("_prod_code", "DUANKA"),
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
     * <b>description</b> :
     * <p>Description: 查询断卡结果
     * Summary: 查询断卡结果</p>
     */
    public QueryDuankaEvaluationResponse queryDuankaEvaluation(QueryDuankaEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDuankaEvaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询断卡结果
     * Summary: 查询断卡结果</p>
     */
    public QueryDuankaEvaluationResponse queryDuankaEvaluationEx(QueryDuankaEvaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.duanka.evaluation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDuankaEvaluationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: hr主数据用户信息查询接口
     * Summary: hr主数据用户信息查询接口</p>
     */
    public QueryHrUserResponse queryHrUser(QueryHrUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryHrUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: hr主数据用户信息查询接口
     * Summary: hr主数据用户信息查询接口</p>
     */
    public QueryHrUserResponse queryHrUserEx(QueryHrUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.hr.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryHrUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天擎数据接口查询
     * Summary: 天擎数据接口查询</p>
     */
    public QuerySkyholdResResponse querySkyholdRes(QuerySkyholdResRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySkyholdResEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天擎数据接口查询
     * Summary: 天擎数据接口查询</p>
     */
    public QuerySkyholdResResponse querySkyholdResEx(QuerySkyholdResRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.skyhold.res.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySkyholdResResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询
     * Summary: 通用查询</p>
     */
    public QueryCommonScoreResponse queryCommonScore(QueryCommonScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCommonScoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询
     * Summary: 通用查询</p>
     */
    public QueryCommonScoreResponse queryCommonScoreEx(QueryCommonScoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.common.score.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCommonScoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 云凤蝶工单提交接口
     * Summary: 云凤蝶工单提交接口</p>
     */
    public SubmitYunfengdieAuditResponse submitYunfengdieAudit(SubmitYunfengdieAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitYunfengdieAuditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 云凤蝶工单提交接口
     * Summary: 云凤蝶工单提交接口</p>
     */
    public SubmitYunfengdieAuditResponse submitYunfengdieAuditEx(SubmitYunfengdieAuditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.yunfengdie.audit.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitYunfengdieAuditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件转存接口
     * Summary: 文件转存接口</p>
     */
    public ImportAistudioOssResponse importAistudioOss(ImportAistudioOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importAistudioOssEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件转存接口
     * Summary: 文件转存接口</p>
     */
    public ImportAistudioOssResponse importAistudioOssEx(ImportAistudioOssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.aistudio.oss.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportAistudioOssResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型验收服务
     * Summary: 模型验收服务</p>
     */
    public CheckAistudioModelResponse checkAistudioModel(CheckAistudioModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAistudioModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型验收服务
     * Summary: 模型验收服务</p>
     */
    public CheckAistudioModelResponse checkAistudioModelEx(CheckAistudioModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.aistudio.model.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAistudioModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型验收服务结果查询
     * Summary: 模型验收服务结果查询</p>
     */
    public QueryAistudioModelResponse queryAistudioModel(QueryAistudioModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAistudioModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型验收服务结果查询
     * Summary: 模型验收服务结果查询</p>
     */
    public QueryAistudioModelResponse queryAistudioModelEx(QueryAistudioModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.aistudio.model.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAistudioModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询-回溯
     * Summary: 通用查询-回溯</p>
     */
    public QueryBacktrackScoreResponse queryBacktrackScore(QueryBacktrackScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBacktrackScoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询-回溯
     * Summary: 通用查询-回溯</p>
     */
    public QueryBacktrackScoreResponse queryBacktrackScoreEx(QueryBacktrackScoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.backtrack.score.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBacktrackScoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大模型sql检验
     * Summary: 大模型sql检验</p>
     */
    public CheckEasMdetectionResponse checkEasMdetection(CheckEasMdetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkEasMdetectionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大模型sql检验
     * Summary: 大模型sql检验</p>
     */
    public CheckEasMdetectionResponse checkEasMdetectionEx(CheckEasMdetectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.eas.mdetection.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckEasMdetectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
     * Summary: 主站bpservice通用http接口</p>
     */
    public QueryBpserviceHttpResponse queryBpserviceHttp(QueryBpserviceHttpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBpserviceHttpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主站bpservice通用http接口，支持GET、PUT、DELETE、POST类型请求
     * Summary: 主站bpservice通用http接口</p>
     */
    public QueryBpserviceHttpResponse queryBpserviceHttpEx(QueryBpserviceHttpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.bpservice.http.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBpserviceHttpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 导入dataphin的同步任务
     * Summary: 导入dataphin的同步任务</p>
     */
    public ImportDataphinTaskResponse importDataphinTask(ImportDataphinTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDataphinTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 导入dataphin的同步任务
     * Summary: 导入dataphin的同步任务</p>
     */
    public ImportDataphinTaskResponse importDataphinTaskEx(ImportDataphinTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.dataphin.task.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDataphinTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步oss文件到odps里面
     * Summary: 同步oss文件到odps里面</p>
     */
    public SyncOssOdpsResponse syncOssOdps(SyncOssOdpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncOssOdpsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步oss文件到odps里面
     * Summary: 同步oss文件到odps里面</p>
     */
    public SyncOssOdpsResponse syncOssOdpsEx(SyncOssOdpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.oss.odps.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncOssOdpsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: odps表数据导出到oss中
     * Summary: odps表数据导出到oss中</p>
     */
    public SyncOpdsOssResponse syncOpdsOss(SyncOpdsOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncOpdsOssEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: odps表数据导出到oss中
     * Summary: odps表数据导出到oss中</p>
     */
    public SyncOpdsOssResponse syncOpdsOssEx(SyncOpdsOssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.opds.oss.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncOpdsOssResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 判断dataphin表分区是否存在
     * Summary: 判断dataphin表分区是否存在</p>
     */
    public ExistDataphinTablepartitionResponse existDataphinTablepartition(ExistDataphinTablepartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existDataphinTablepartitionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 判断dataphin表分区是否存在
     * Summary: 判断dataphin表分区是否存在</p>
     */
    public ExistDataphinTablepartitionResponse existDataphinTablepartitionEx(ExistDataphinTablepartitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.dataphin.tablepartition.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistDataphinTablepartitionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发布dataphin任务
     * Summary: 发布dataphin任务</p>
     */
    public PublishDataphinTaskResponse publishDataphinTask(PublishDataphinTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishDataphinTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发布dataphin任务
     * Summary: 发布dataphin任务</p>
     */
    public PublishDataphinTaskResponse publishDataphinTaskEx(PublishDataphinTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.dataphin.task.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishDataphinTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 校验任务发布
     * Summary: 校验任务发布</p>
     */
    public CheckDataphinTaskResponse checkDataphinTask(CheckDataphinTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkDataphinTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 校验任务发布
     * Summary: 校验任务发布</p>
     */
    public CheckDataphinTaskResponse checkDataphinTaskEx(CheckDataphinTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.dataphin.task.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckDataphinTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 运行任务
     * Summary: 运行任务</p>
     */
    public RunDataphinTaskResponse runDataphinTask(RunDataphinTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runDataphinTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 运行任务
     * Summary: 运行任务</p>
     */
    public RunDataphinTaskResponse runDataphinTaskEx(RunDataphinTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.dataphin.task.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunDataphinTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 表信息查询
     * Summary: 表信息查询</p>
     */
    public QueryDataphinTableinfoResponse queryDataphinTableinfo(QueryDataphinTableinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataphinTableinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 表信息查询
     * Summary: 表信息查询</p>
     */
    public QueryDataphinTableinfoResponse queryDataphinTableinfoEx(QueryDataphinTableinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.dataphin.tableinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataphinTableinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件ossToOdps
     * Summary: 文件ossToOdps</p>
     */
    public ImportDataphinFileResponse importDataphinFile(ImportDataphinFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDataphinFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件ossToOdps
     * Summary: 文件ossToOdps</p>
     */
    public ImportDataphinFileResponse importDataphinFileEx(ImportDataphinFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.dataphin.file.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDataphinFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交dataphin任务
     * Summary: 提交dataphin任务</p>
     */
    public SubmitDatapinTaskResponse submitDatapinTask(SubmitDatapinTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDatapinTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交dataphin任务
     * Summary: 提交dataphin任务</p>
     */
    public SubmitDatapinTaskResponse submitDatapinTaskEx(SubmitDatapinTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.datapin.task.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitDatapinTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 行业分查询
     * Summary: 行业分查询</p>
     */
    public QueryIndustryScoreResponse queryIndustryScore(QueryIndustryScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndustryScoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 行业分查询
     * Summary: 行业分查询</p>
     */
    public QueryIndustryScoreResponse queryIndustryScoreEx(QueryIndustryScoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.industry.score.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndustryScoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 品牌研究数据查询
     * Summary: 品牌研究数据查询</p>
     */
    public QueryIrBrandResponse queryIrBrand(QueryIrBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIrBrandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 品牌研究数据查询
     * Summary: 品牌研究数据查询</p>
     */
    public QueryIrBrandResponse queryIrBrandEx(QueryIrBrandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.duanka.ir.brand.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIrBrandResponse());
    }
}
