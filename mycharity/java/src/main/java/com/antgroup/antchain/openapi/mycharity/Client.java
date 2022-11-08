// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.mycharity.models.*;
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
                    new TeaPair("sdk_version", "1.0.19"),
                    new TeaPair("_prod_code", "MYCHARITY"),
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
     * Description: 待签约账号创建
     * Summary: 待签约账号创建
     */
    public CreateAlipaysignResponse createAlipaysign(CreateAlipaysignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlipaysignEx(request, headers, runtime);
    }

    /**
     * Description: 待签约账号创建
     * Summary: 待签约账号创建
     */
    public CreateAlipaysignResponse createAlipaysignEx(CreateAlipaysignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.alipaysign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAlipaysignResponse());
    }

    /**
     * Description: 机构下代扣账号签约状态查询
     * Summary: 机构下代扣账号签约状态查询
     */
    public QueryAlipaysignStateResponse queryAlipaysignState(QueryAlipaysignStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlipaysignStateEx(request, headers, runtime);
    }

    /**
     * Description: 机构下代扣账号签约状态查询
     * Summary: 机构下代扣账号签约状态查询
     */
    public QueryAlipaysignStateResponse queryAlipaysignStateEx(QueryAlipaysignStateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.alipaysign.state.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlipaysignStateResponse());
    }

    /**
     * Description: 账号签约二维码获取
     * Summary: 账号签约二维码获取
     */
    public QueryAlipaysignQrcodeResponse queryAlipaysignQrcode(QueryAlipaysignQrcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlipaysignQrcodeEx(request, headers, runtime);
    }

    /**
     * Description: 账号签约二维码获取
     * Summary: 账号签约二维码获取
     */
    public QueryAlipaysignQrcodeResponse queryAlipaysignQrcodeEx(QueryAlipaysignQrcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.alipaysign.qrcode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlipaysignQrcodeResponse());
    }

    /**
     * Description: 创建人员并配置权限。如人员已经存在，则不创建。
     * Summary: 创建人员及配置权限
     */
    public CreatePersonPermissionResponse createPersonPermission(CreatePersonPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonPermissionEx(request, headers, runtime);
    }

    /**
     * Description: 创建人员并配置权限。如人员已经存在，则不创建。
     * Summary: 创建人员及配置权限
     */
    public CreatePersonPermissionResponse createPersonPermissionEx(CreatePersonPermissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.person.permission.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePersonPermissionResponse());
    }

    /**
     * Description: 允许已授权的用户通过此接口删除人员权限。
     * Summary: 配置权限删除
     */
    public DeletePersonResponse deletePerson(DeletePersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePersonEx(request, headers, runtime);
    }

    /**
     * Description: 允许已授权的用户通过此接口删除人员权限。
     * Summary: 配置权限删除
     */
    public DeletePersonResponse deletePersonEx(DeletePersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.person.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeletePersonResponse());
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     */
    public InitBatchResponse initBatch(InitBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initBatchEx(request, headers, runtime);
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     */
    public InitBatchResponse initBatchEx(InitBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.batch.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitBatchResponse());
    }

    /**
     * Description: 修改批次状态
     * Summary: 修改批次状态
     */
    public UpdateBatchResponse updateBatch(UpdateBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBatchEx(request, headers, runtime);
    }

    /**
     * Description: 修改批次状态
     * Summary: 修改批次状态
     */
    public UpdateBatchResponse updateBatchEx(UpdateBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.batch.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBatchResponse());
    }

    /**
     * Description: 删除批次
     * Summary: 删除批次
     */
    public DeleteBatchResponse deleteBatch(DeleteBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBatchEx(request, headers, runtime);
    }

    /**
     * Description: 删除批次
     * Summary: 删除批次
     */
    public DeleteBatchResponse deleteBatchEx(DeleteBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.batch.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBatchResponse());
    }

    /**
     * Description: 创建项目分期
     * Summary: 创建分期
     */
    public CreateStagesResponse createStages(CreateStagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStagesEx(request, headers, runtime);
    }

    /**
     * Description: 创建项目分期
     * Summary: 创建分期
     */
    public CreateStagesResponse createStagesEx(CreateStagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.stages.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStagesResponse());
    }

    /**
     * Description: 查询批次
     * Summary: 查询批次
     */
    public QueryBatchResponse queryBatch(QueryBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBatchEx(request, headers, runtime);
    }

    /**
     * Description: 查询批次
     * Summary: 查询批次
     */
    public QueryBatchResponse queryBatchEx(QueryBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.batch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBatchResponse());
    }

    /**
     * Description: 更新项目分期
     * Summary: 更新分期
     */
    public UpdateStagesResponse updateStages(UpdateStagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStagesEx(request, headers, runtime);
    }

    /**
     * Description: 更新项目分期
     * Summary: 更新分期
     */
    public UpdateStagesResponse updateStagesEx(UpdateStagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.stages.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateStagesResponse());
    }

    /**
     * Description: 创建机构
     * Summary: 创建机构
     */
    public CreateOrgResponse createOrg(CreateOrgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrgEx(request, headers, runtime);
    }

    /**
     * Description: 创建机构
     * Summary: 创建机构
     */
    public CreateOrgResponse createOrgEx(CreateOrgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.org.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOrgResponse());
    }

    /**
     * Description: 查询分期
     * Summary: 查询分期
     */
    public QueryStagesResponse queryStages(QueryStagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStagesEx(request, headers, runtime);
    }

    /**
     * Description: 查询分期
     * Summary: 查询分期
     */
    public QueryStagesResponse queryStagesEx(QueryStagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.stages.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStagesResponse());
    }

    /**
     * Description: 更新机构
     * Summary: 更新机构
     */
    public UpdateOrgResponse updateOrg(UpdateOrgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOrgEx(request, headers, runtime);
    }

    /**
     * Description: 更新机构
     * Summary: 更新机构
     */
    public UpdateOrgResponse updateOrgEx(UpdateOrgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.org.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateOrgResponse());
    }

    /**
     * Description: 创建实施内容
     * Summary: 创建实施内容
     */
    public CreateCombinationResponse createCombination(CreateCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCombinationEx(request, headers, runtime);
    }

    /**
     * Description: 创建实施内容
     * Summary: 创建实施内容
     */
    public CreateCombinationResponse createCombinationEx(CreateCombinationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.combination.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCombinationResponse());
    }

    /**
     * Description: 机构详情
     * Summary: 机构详情
     */
    public DetailOrgResponse detailOrg(DetailOrgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailOrgEx(request, headers, runtime);
    }

    /**
     * Description: 机构详情
     * Summary: 机构详情
     */
    public DetailOrgResponse detailOrgEx(DetailOrgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.org.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailOrgResponse());
    }

    /**
     * Description: 修改实施内容
     * Summary: 修改实施内容
     */
    public UpdateCombinationResponse updateCombination(UpdateCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCombinationEx(request, headers, runtime);
    }

    /**
     * Description: 修改实施内容
     * Summary: 修改实施内容
     */
    public UpdateCombinationResponse updateCombinationEx(UpdateCombinationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.combination.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCombinationResponse());
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectEx(request, headers, runtime);
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目
     */
    public CreateProjectResponse createProjectEx(CreateProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProjectResponse());
    }

    /**
     * Description: 更新项目
     * Summary: 更新项目
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectEx(request, headers, runtime);
    }

    /**
     * Description: 更新项目
     * Summary: 更新项目
     */
    public UpdateProjectResponse updateProjectEx(UpdateProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.project.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateProjectResponse());
    }

    /**
     * Description: 项目详情
     * Summary: 项目详情
     */
    public DetailProjectResponse detailProject(DetailProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailProjectEx(request, headers, runtime);
    }

    /**
     * Description: 项目详情
     * Summary: 项目详情
     */
    public DetailProjectResponse detailProjectEx(DetailProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.project.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailProjectResponse());
    }

    /**
     * Description: 查询实施内容
     * Summary: 查询实施内容
     */
    public QueryCombinationResponse queryCombination(QueryCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCombinationEx(request, headers, runtime);
    }

    /**
     * Description: 查询实施内容
     * Summary: 查询实施内容
     */
    public QueryCombinationResponse queryCombinationEx(QueryCombinationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.combination.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCombinationResponse());
    }

    /**
     * Description: 批量创建执行记录
     * Summary: 批量创建执行记录
     */
    public BatchcreateRecordResponse batchcreateRecord(BatchcreateRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateRecordEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建执行记录
     * Summary: 批量创建执行记录
     */
    public BatchcreateRecordResponse batchcreateRecordEx(BatchcreateRecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.record.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateRecordResponse());
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     */
    public CreateBatchResponse createBatch(CreateBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBatchEx(request, headers, runtime);
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     */
    public CreateBatchResponse createBatchEx(CreateBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.batch.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBatchResponse());
    }

    /**
     * Description: 修改执行记录状态
     * Summary: 修改执行记录状态
     */
    public UpdateRecordResponse updateRecord(UpdateRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRecordEx(request, headers, runtime);
    }

    /**
     * Description: 修改执行记录状态
     * Summary: 修改执行记录状态
     */
    public UpdateRecordResponse updateRecordEx(UpdateRecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.record.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRecordResponse());
    }

    /**
     * Description: 批量创建、修改、删除实施内容
     * Summary: 批量创建、修改、删除实施内容
     */
    public BatchcreateCombinationResponse batchcreateCombination(BatchcreateCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateCombinationEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建、修改、删除实施内容
     * Summary: 批量创建、修改、删除实施内容
     */
    public BatchcreateCombinationResponse batchcreateCombinationEx(BatchcreateCombinationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.combination.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateCombinationResponse());
    }

    /**
     * Description: 代扣签约账号批量创建接口
     * Summary: 代扣签约账号批量创建接口
     */
    public BatchcreateAlipaysignResponse batchcreateAlipaysign(BatchcreateAlipaysignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateAlipaysignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约账号批量创建接口
     * Summary: 代扣签约账号批量创建接口
     */
    public BatchcreateAlipaysignResponse batchcreateAlipaysignEx(BatchcreateAlipaysignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.alipaysign.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateAlipaysignResponse());
    }

    /**
     * Description: 品牌活动捐赠记录上链接口
     * Summary: 品牌活动捐赠记录上链接口
     */
    public CreateActivitychainrecordResponse createActivitychainrecord(CreateActivitychainrecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createActivitychainrecordEx(request, headers, runtime);
    }

    /**
     * Description: 品牌活动捐赠记录上链接口
     * Summary: 品牌活动捐赠记录上链接口
     */
    public CreateActivitychainrecordResponse createActivitychainrecordEx(CreateActivitychainrecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mycharity.activitychainrecord.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateActivitychainrecordResponse());
    }
}
