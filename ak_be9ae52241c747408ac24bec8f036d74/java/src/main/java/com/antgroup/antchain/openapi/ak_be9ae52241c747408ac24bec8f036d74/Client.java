// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models.*;
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
                    new TeaPair("sdk_version", "1.0.0"),
                    new TeaPair("_prod_code", "ak_be9ae52241c747408ac24bec8f036d74"),
                    new TeaPair("_prod_channel", "saas")
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
     * Description: 请求创建数据源
     * Summary: 创建新的数据源
     */
    public CreateAntchainPdcpDatasourceResponse createAntchainPdcpDatasource(CreateAntchainPdcpDatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainPdcpDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 请求创建数据源
     * Summary: 创建新的数据源
     */
    public CreateAntchainPdcpDatasourceResponse createAntchainPdcpDatasourceEx(CreateAntchainPdcpDatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.datasource.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainPdcpDatasourceResponse());
    }

    /**
     * Description: 请求删除指定的数据源。
     * Summary: 删除指定的数据源
     */
    public DeleteAntchainPdcpDatasourceResponse deleteAntchainPdcpDatasource(DeleteAntchainPdcpDatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAntchainPdcpDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 请求删除指定的数据源。
     * Summary: 删除指定的数据源
     */
    public DeleteAntchainPdcpDatasourceResponse deleteAntchainPdcpDatasourceEx(DeleteAntchainPdcpDatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.datasource.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAntchainPdcpDatasourceResponse());
    }

    /**
     * Description: 请求更新指定数据源的信息。
     * Summary: 更新指定数据源的信息
     */
    public UpdateAntchainPdcpDatasourceResponse updateAntchainPdcpDatasource(UpdateAntchainPdcpDatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainPdcpDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 请求更新指定数据源的信息。
     * Summary: 更新指定数据源的信息
     */
    public UpdateAntchainPdcpDatasourceResponse updateAntchainPdcpDatasourceEx(UpdateAntchainPdcpDatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.datasource.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainPdcpDatasourceResponse());
    }

    /**
     * Description: 请求查询指定的数据源信息。
     * Summary: 查询指定的数据源信息
     */
    public QueryAntchainPdcpDatasourceResponse queryAntchainPdcpDatasource(QueryAntchainPdcpDatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainPdcpDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 请求查询指定的数据源信息。
     * Summary: 查询指定的数据源信息
     */
    public QueryAntchainPdcpDatasourceResponse queryAntchainPdcpDatasourceEx(QueryAntchainPdcpDatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.datasource.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainPdcpDatasourceResponse());
    }

    /**
     * Description: 分页搜索数据源
     * Summary: 分页搜索数据源
     */
    public PagequeryAntchainPdcpDatasourceResponse pagequeryAntchainPdcpDatasource(PagequeryAntchainPdcpDatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntchainPdcpDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 分页搜索数据源
     * Summary: 分页搜索数据源
     */
    public PagequeryAntchainPdcpDatasourceResponse pagequeryAntchainPdcpDatasourceEx(PagequeryAntchainPdcpDatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.datasource.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntchainPdcpDatasourceResponse());
    }

    /**
     * Description: 创建新的数据集
     * Summary: 创建新的数据集
     */
    public CreateAntchainPdcpDatasetResponse createAntchainPdcpDataset(CreateAntchainPdcpDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainPdcpDatasetEx(request, headers, runtime);
    }

    /**
     * Description: 创建新的数据集
     * Summary: 创建新的数据集
     */
    public CreateAntchainPdcpDatasetResponse createAntchainPdcpDatasetEx(CreateAntchainPdcpDatasetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.dataset.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainPdcpDatasetResponse());
    }

    /**
     * Description: 删除指定数据集
     * Summary: 删除指定数据集
     */
    public DeleteAntchainPdcpDatasetResponse deleteAntchainPdcpDataset(DeleteAntchainPdcpDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAntchainPdcpDatasetEx(request, headers, runtime);
    }

    /**
     * Description: 删除指定数据集
     * Summary: 删除指定数据集
     */
    public DeleteAntchainPdcpDatasetResponse deleteAntchainPdcpDatasetEx(DeleteAntchainPdcpDatasetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.dataset.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAntchainPdcpDatasetResponse());
    }

    /**
     * Description: 更新指定数据集信息
     * Summary: 更新指定数据集信息
     */
    public UpdateAntchainPdcpDatasetResponse updateAntchainPdcpDataset(UpdateAntchainPdcpDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainPdcpDatasetEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定数据集信息
     * Summary: 更新指定数据集信息
     */
    public UpdateAntchainPdcpDatasetResponse updateAntchainPdcpDatasetEx(UpdateAntchainPdcpDatasetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.dataset.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainPdcpDatasetResponse());
    }

    /**
     * Description: 查询指定数据集信息
     * Summary: 查询指定数据集信息
     */
    public QueryAntchainPdcpDatasetResponse queryAntchainPdcpDataset(QueryAntchainPdcpDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainPdcpDatasetEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定数据集信息
     * Summary: 查询指定数据集信息
     */
    public QueryAntchainPdcpDatasetResponse queryAntchainPdcpDatasetEx(QueryAntchainPdcpDatasetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.dataset.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainPdcpDatasetResponse());
    }

    /**
     * Description: 分页搜索数据集
     * Summary: 分页搜索数据集
     */
    public PagequeryAntchainPdcpDatasetResponse pagequeryAntchainPdcpDataset(PagequeryAntchainPdcpDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntchainPdcpDatasetEx(request, headers, runtime);
    }

    /**
     * Description: 分页搜索数据集
     * Summary: 分页搜索数据集
     */
    public PagequeryAntchainPdcpDatasetResponse pagequeryAntchainPdcpDatasetEx(PagequeryAntchainPdcpDatasetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.dataset.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntchainPdcpDatasetResponse());
    }

    /**
     * Description: 识别数据集的 schema 信息
     * Summary: 识别数据集的 schema 信息
     */
    public RecognizeAntchainPdcpDatasetSchemaResponse recognizeAntchainPdcpDatasetSchema(RecognizeAntchainPdcpDatasetSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeAntchainPdcpDatasetSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 识别数据集的 schema 信息
     * Summary: 识别数据集的 schema 信息
     */
    public RecognizeAntchainPdcpDatasetSchemaResponse recognizeAntchainPdcpDatasetSchemaEx(RecognizeAntchainPdcpDatasetSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.dataset.schema.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeAntchainPdcpDatasetSchemaResponse());
    }

    /**
     * Description: 创建项目，添加线下参与方协作节点
     * Summary: 创建项目
     */
    public CreateAntchainPdcpProjectResponse createAntchainPdcpProject(CreateAntchainPdcpProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainPdcpProjectEx(request, headers, runtime);
    }

    /**
     * Description: 创建项目，添加线下参与方协作节点
     * Summary: 创建项目
     */
    public CreateAntchainPdcpProjectResponse createAntchainPdcpProjectEx(CreateAntchainPdcpProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainPdcpProjectResponse());
    }

    /**
     * Description: 根据项目ID查询项目信息
     * Summary: 根据项目ID查询项目信息
     */
    public GetAntchainPdcpProjectResponse getAntchainPdcpProject(GetAntchainPdcpProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainPdcpProjectEx(request, headers, runtime);
    }

    /**
     * Description: 根据项目ID查询项目信息
     * Summary: 根据项目ID查询项目信息
     */
    public GetAntchainPdcpProjectResponse getAntchainPdcpProjectEx(GetAntchainPdcpProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.project.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainPdcpProjectResponse());
    }

    /**
     * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
     * Summary: 授权某个本地的数据集至项目中
     */
    public AuthAntchainPdcpProjectDatasetResponse authAntchainPdcpProjectDataset(AuthAntchainPdcpProjectDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAntchainPdcpProjectDatasetEx(request, headers, runtime);
    }

    /**
     * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
     * Summary: 授权某个本地的数据集至项目中
     */
    public AuthAntchainPdcpProjectDatasetResponse authAntchainPdcpProjectDatasetEx(AuthAntchainPdcpProjectDatasetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.project.dataset.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAntchainPdcpProjectDatasetResponse());
    }

    /**
     * Description: 授权数据源至项目/api/project/datasource/auth
     * Summary: 授权某个本地数据源至项目中
     */
    public AuthAntchainPdcpProjectDatasourceResponse authAntchainPdcpProjectDatasource(AuthAntchainPdcpProjectDatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAntchainPdcpProjectDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 授权数据源至项目/api/project/datasource/auth
     * Summary: 授权某个本地数据源至项目中
     */
    public AuthAntchainPdcpProjectDatasourceResponse authAntchainPdcpProjectDatasourceEx(AuthAntchainPdcpProjectDatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.project.datasource.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAntchainPdcpProjectDatasourceResponse());
    }

    /**
     * Description: 分页查询项目内已授权的数据集列表
     * Summary: 分页查询项目内已授权的数据集列表
     */
    public PagequeryAntchainPdcpProjectAuthdatasetResponse pagequeryAntchainPdcpProjectAuthdataset(PagequeryAntchainPdcpProjectAuthdatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntchainPdcpProjectAuthdatasetEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询项目内已授权的数据集列表
     * Summary: 分页查询项目内已授权的数据集列表
     */
    public PagequeryAntchainPdcpProjectAuthdatasetResponse pagequeryAntchainPdcpProjectAuthdatasetEx(PagequeryAntchainPdcpProjectAuthdatasetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.project.authdataset.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntchainPdcpProjectAuthdatasetResponse());
    }

    /**
     * Description: 分页查询项目内已授权的数据源列表
     * Summary: 分页查询项目内已授权的数据源列表
     */
    public PagequeryAntchainPdcpProjectAuthdatasourceResponse pagequeryAntchainPdcpProjectAuthdatasource(PagequeryAntchainPdcpProjectAuthdatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntchainPdcpProjectAuthdatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询项目内已授权的数据源列表
     * Summary: 分页查询项目内已授权的数据源列表
     */
    public PagequeryAntchainPdcpProjectAuthdatasourceResponse pagequeryAntchainPdcpProjectAuthdatasourceEx(PagequeryAntchainPdcpProjectAuthdatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.project.authdatasource.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntchainPdcpProjectAuthdatasourceResponse());
    }

    /**
     * Description: 查询任务信息
     * Summary: 查询任务状态
     */
    public QueryAntchainPdcpJobPsiResponse queryAntchainPdcpJobPsi(QueryAntchainPdcpJobPsiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainPdcpJobPsiEx(request, headers, runtime);
    }

    /**
     * Description: 查询任务信息
     * Summary: 查询任务状态
     */
    public QueryAntchainPdcpJobPsiResponse queryAntchainPdcpJobPsiEx(QueryAntchainPdcpJobPsiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.job.psi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainPdcpJobPsiResponse());
    }

    /**
     * Description: 提交psi任务接口
     * Summary: 提交psi任务接口
     */
    public SubmitAntchainPdcpJobPsiResponse submitAntchainPdcpJobPsi(SubmitAntchainPdcpJobPsiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainPdcpJobPsiEx(request, headers, runtime);
    }

    /**
     * Description: 提交psi任务接口
     * Summary: 提交psi任务接口
     */
    public SubmitAntchainPdcpJobPsiResponse submitAntchainPdcpJobPsiEx(SubmitAntchainPdcpJobPsiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.pdcp.job.psi.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainPdcpJobPsiResponse());
    }
}
