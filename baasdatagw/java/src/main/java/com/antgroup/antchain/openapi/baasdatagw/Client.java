// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.baasdatagw.models.*;

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
                    new TeaPair("sdk_version", "1.4.10"),
                    new TeaPair("_prod_code", "BAASDATAGW"),
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
     * Description: 检索索引的链上数据
     * Summary: 检索索引的链上数据
     */
    public QueryDatasearchSearchResponse queryDatasearchSearch(QueryDatasearchSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatasearchSearchEx(request, headers, runtime);
    }

    /**
     * Description: 检索索引的链上数据
     * Summary: 检索索引的链上数据
     */
    public QueryDatasearchSearchResponse queryDatasearchSearchEx(QueryDatasearchSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.search.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatasearchSearchResponse());
    }

    /**
     * Description: 针对某个数据类型的数据开启索引；该方法可重入
     * Summary: 开启数据索引
     */
    public StartDatasearchIndexResponse startDatasearchIndex(StartDatasearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 针对某个数据类型的数据开启索引；该方法可重入
     * Summary: 开启数据索引
     */
    public StartDatasearchIndexResponse startDatasearchIndexEx(StartDatasearchIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDatasearchIndexResponse());
    }

    /**
     * Description: 针对某个分组的数据停止索引；该方法可重入
     * Summary: 停止数据索引
     */
    public StopDatasearchIndexResponse stopDatasearchIndex(StopDatasearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 针对某个分组的数据停止索引；该方法可重入
     * Summary: 停止数据索引
     */
    public StopDatasearchIndexResponse stopDatasearchIndexEx(StopDatasearchIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopDatasearchIndexResponse());
    }

    /**
     * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
     * Summary: 删除数据索引
     */
    public RemoveDatasearchIndexResponse removeDatasearchIndex(RemoveDatasearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
     * Summary: 删除数据索引
     */
    public RemoveDatasearchIndexResponse removeDatasearchIndexEx(RemoveDatasearchIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveDatasearchIndexResponse());
    }

    /**
     * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
     * Summary: 查询数据索引进度
     */
    public GetDatasearchIndexResponse getDatasearchIndex(GetDatasearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
     * Summary: 查询数据索引进度
     */
    public GetDatasearchIndexResponse getDatasearchIndexEx(GetDatasearchIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDatasearchIndexResponse());
    }

    /**
     * Description: 列出租户在链上的所有合约Meta
     * Summary: 列出租户在链上的所有合约Meta
     */
    public ListContractmetaResponse listContractmeta(ListContractmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 列出租户在链上的所有合约Meta
     * Summary: 列出租户在链上的所有合约Meta
     */
    public ListContractmetaResponse listContractmetaEx(ListContractmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractmetaResponse());
    }

    /**
     * Description: 新增合约Meta
     * Summary: 新增合约Meta
     */
    public AddContractmetaResponse addContractmeta(AddContractmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 新增合约Meta
     * Summary: 新增合约Meta
     */
    public AddContractmetaResponse addContractmetaEx(AddContractmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractmetaResponse());
    }

    /**
     * Description: 删除合约meta
     * Summary: 删除合约meta
     */
    public DeleteContractmetaResponse deleteContractmeta(DeleteContractmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 删除合约meta
     * Summary: 删除合约meta
     */
    public DeleteContractmetaResponse deleteContractmetaEx(DeleteContractmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContractmetaResponse());
    }

    /**
     * Description: 查询meta具体信息
     * Summary: 获取meta信息
     */
    public GetContractmetaResponse getContractmeta(GetContractmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 查询meta具体信息
     * Summary: 获取meta信息
     */
    public GetContractmetaResponse getContractmetaEx(GetContractmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractmetaResponse());
    }

    /**
     * Description: 获取导出任务预览数据的异步任务ID
     * Summary: 获取导出任务预览数据的异步任务ID
     */
    public CreateDataexportPreviewdataResponse createDataexportPreviewdata(CreateDataexportPreviewdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataexportPreviewdataEx(request, headers, runtime);
    }

    /**
     * Description: 获取导出任务预览数据的异步任务ID
     * Summary: 获取导出任务预览数据的异步任务ID
     */
    public CreateDataexportPreviewdataResponse createDataexportPreviewdataEx(CreateDataexportPreviewdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataexportPreviewdataResponse());
    }

    /**
     * Description: 查询数据预览任务结果
     * Summary: 查询数据预览任务结果
     */
    public QueryDataexportPreviewdataResponse queryDataexportPreviewdata(QueryDataexportPreviewdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataexportPreviewdataEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据预览任务结果
     * Summary: 查询数据预览任务结果
     */
    public QueryDataexportPreviewdataResponse queryDataexportPreviewdataEx(QueryDataexportPreviewdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataexportPreviewdataResponse());
    }

    /**
     * Description: 查询默认字段映射
     * Summary: 查询默认字段映射
     */
    public GetDataexportPreviewsmappingResponse getDataexportPreviewsmapping(GetDataexportPreviewsmappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataexportPreviewsmappingEx(request, headers, runtime);
    }

    /**
     * Description: 查询默认字段映射
     * Summary: 查询默认字段映射
     */
    public GetDataexportPreviewsmappingResponse getDataexportPreviewsmappingEx(GetDataexportPreviewsmappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewsmapping.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDataexportPreviewsmappingResponse());
    }

    /**
     * Description: 创建导出任务
     * Summary: 创建导出任务
     */
    public CreateDataexportTriggerResponse createDataexportTrigger(CreateDataexportTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataexportTriggerEx(request, headers, runtime);
    }

    /**
     * Description: 创建导出任务
     * Summary: 创建导出任务
     */
    public CreateDataexportTriggerResponse createDataexportTriggerEx(CreateDataexportTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.trigger.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataexportTriggerResponse());
    }

    /**
     * Description: 查询建表语句
     * Summary: 查询建表语句
     */
    public QueryDataexportPreviewsqlResponse queryDataexportPreviewsql(QueryDataexportPreviewsqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataexportPreviewsqlEx(request, headers, runtime);
    }

    /**
     * Description: 查询建表语句
     * Summary: 查询建表语句
     */
    public QueryDataexportPreviewsqlResponse queryDataexportPreviewsqlEx(QueryDataexportPreviewsqlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewsql.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataexportPreviewsqlResponse());
    }

    /**
     * Description: 列出导出任务
     * Summary: 列出导出任务
     */
    public ListDataexportTriggerResponse listDataexportTrigger(ListDataexportTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataexportTriggerEx(request, headers, runtime);
    }

    /**
     * Description: 列出导出任务
     * Summary: 列出导出任务
     */
    public ListDataexportTriggerResponse listDataexportTriggerEx(ListDataexportTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.trigger.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataexportTriggerResponse());
    }

    /**
     * Description: 修改导出任务状态
     * Summary: 修改导出任务状态
     */
    public OperateDataexportTriggerstatusResponse operateDataexportTriggerstatus(OperateDataexportTriggerstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDataexportTriggerstatusEx(request, headers, runtime);
    }

    /**
     * Description: 修改导出任务状态
     * Summary: 修改导出任务状态
     */
    public OperateDataexportTriggerstatusResponse operateDataexportTriggerstatusEx(OperateDataexportTriggerstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerstatus.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDataexportTriggerstatusResponse());
    }

    /**
     * Description: 修改导出任务配置
     * Summary: 修改导出任务配置
     */
    public OperateDataexportTriggerconfigResponse operateDataexportTriggerconfig(OperateDataexportTriggerconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDataexportTriggerconfigEx(request, headers, runtime);
    }

    /**
     * Description: 修改导出任务配置
     * Summary: 修改导出任务配置
     */
    public OperateDataexportTriggerconfigResponse operateDataexportTriggerconfigEx(OperateDataexportTriggerconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerconfig.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDataexportTriggerconfigResponse());
    }

    /**
     * Description: 列出导出任务失败日志
     * Summary: 列出导出任务失败日志
     */
    public ListDataexportTriggerlogResponse listDataexportTriggerlog(ListDataexportTriggerlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataexportTriggerlogEx(request, headers, runtime);
    }

    /**
     * Description: 列出导出任务失败日志
     * Summary: 列出导出任务失败日志
     */
    public ListDataexportTriggerlogResponse listDataexportTriggerlogEx(ListDataexportTriggerlogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataexportTriggerlogResponse());
    }

    /**
     * Description: 操作导出任务失败日志
     * Summary: 操作导出任务失败日志
     */
    public OperateDataexportTriggerlogResponse operateDataexportTriggerlog(OperateDataexportTriggerlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDataexportTriggerlogEx(request, headers, runtime);
    }

    /**
     * Description: 操作导出任务失败日志
     * Summary: 操作导出任务失败日志
     */
    public OperateDataexportTriggerlogResponse operateDataexportTriggerlogEx(OperateDataexportTriggerlogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDataexportTriggerlogResponse());
    }

    /**
     * Description: 查询地址标签
     * Summary: 查询地址标签
     */
    public QueryChaininsightLabelsResponse queryChaininsightLabels(QueryChaininsightLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightLabelsEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址标签
     * Summary: 查询地址标签
     */
    public QueryChaininsightLabelsResponse queryChaininsightLabelsEx(QueryChaininsightLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.labels.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightLabelsResponse());
    }

    /**
     * Description: 更新地址标签
     * Summary: 更新地址标签
     */
    public UpdateChaininsightLabelsResponse updateChaininsightLabels(UpdateChaininsightLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChaininsightLabelsEx(request, headers, runtime);
    }

    /**
     * Description: 更新地址标签
     * Summary: 更新地址标签
     */
    public UpdateChaininsightLabelsResponse updateChaininsightLabelsEx(UpdateChaininsightLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.labels.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChaininsightLabelsResponse());
    }

    /**
     * Description: 链上搜索
     * Summary: 链上搜索
     */
    public QueryChaininsightSearchResponse queryChaininsightSearch(QueryChaininsightSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightSearchEx(request, headers, runtime);
    }

    /**
     * Description: 链上搜索
     * Summary: 链上搜索
     */
    public QueryChaininsightSearchResponse queryChaininsightSearchEx(QueryChaininsightSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.search.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightSearchResponse());
    }

    /**
     * Description: 查询链上地址详情
     * Summary: 查询链上地址详情
     */
    public QueryChaininsightAddressResponse queryChaininsightAddress(QueryChaininsightAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddressEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上地址详情
     * Summary: 查询链上地址详情
     */
    public QueryChaininsightAddressResponse queryChaininsightAddressEx(QueryChaininsightAddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.address.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddressResponse());
    }

    /**
     * Description: 查询链上交易详情
     * Summary: 查询链上交易详情
     */
    public QueryChaininsightTransactionResponse queryChaininsightTransaction(QueryChaininsightTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上交易详情
     * Summary: 查询链上交易详情
     */
    public QueryChaininsightTransactionResponse queryChaininsightTransactionEx(QueryChaininsightTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightTransactionResponse());
    }

    /**
     * Description: 查询链上区块详情
     * Summary: 查询链上区块详情
     */
    public QueryChaininsightBlockResponse queryChaininsightBlock(QueryChaininsightBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightBlockEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上区块详情
     * Summary: 查询链上区块详情
     */
    public QueryChaininsightBlockResponse queryChaininsightBlockEx(QueryChaininsightBlockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.block.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightBlockResponse());
    }

    /**
     * Description: 查询地址近期交易
     * Summary: 查询地址近期交易
     */
    public QueryChaininsightAddresslatesttxsResponse queryChaininsightAddresslatesttxs(QueryChaininsightAddresslatesttxsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddresslatesttxsEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址近期交易
     * Summary: 查询地址近期交易
     */
    public QueryChaininsightAddresslatesttxsResponse queryChaininsightAddresslatesttxsEx(QueryChaininsightAddresslatesttxsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresslatesttxs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddresslatesttxsResponse());
    }

    /**
     * Description: 列出合约全部接口
     * Summary: 列出合约全部接口
     */
    public ListChaininsightContractinterfaceResponse listChaininsightContractinterface(ListChaininsightContractinterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChaininsightContractinterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 列出合约全部接口
     * Summary: 列出合约全部接口
     */
    public ListChaininsightContractinterfaceResponse listChaininsightContractinterfaceEx(ListChaininsightContractinterfaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListChaininsightContractinterfaceResponse());
    }

    /**
     * Description: 查询合约接口信息
     * Summary: 查询合约接口信息
     */
    public DetailChaininsightContractinterfaceResponse detailChaininsightContractinterface(DetailChaininsightContractinterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailChaininsightContractinterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约接口信息
     * Summary: 查询合约接口信息
     */
    public DetailChaininsightContractinterfaceResponse detailChaininsightContractinterfaceEx(DetailChaininsightContractinterfaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailChaininsightContractinterfaceResponse());
    }

    /**
     * Description: 更新合约接口信息
     * Summary: 更新合约接口信息
     */
    public UpdateChaininsightContractinterfaceResponse updateChaininsightContractinterface(UpdateChaininsightContractinterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChaininsightContractinterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 更新合约接口信息
     * Summary: 更新合约接口信息
     */
    public UpdateChaininsightContractinterfaceResponse updateChaininsightContractinterfaceEx(UpdateChaininsightContractinterfaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChaininsightContractinterfaceResponse());
    }

    /**
     * Description: 上传合约ABI文件
     * Summary: 上传合约ABI文件
     */
    public UploadChaininsightAbiResponse uploadChaininsightAbi(UploadChaininsightAbiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadChaininsightAbiEx(request, headers, runtime);
    }

    /**
     * Description: 上传合约ABI文件
     * Summary: 上传合约ABI文件
     */
    public UploadChaininsightAbiResponse uploadChaininsightAbiEx(UploadChaininsightAbiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.abi.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadChaininsightAbiResponse());
    }

    /**
     * Description: 查询地址的接收交易数量趋势
     * Summary: 查询地址的接收交易数量趋势
     */
    public QueryChaininsightAddresshistogramrxResponse queryChaininsightAddresshistogramrx(QueryChaininsightAddresshistogramrxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddresshistogramrxEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址的接收交易数量趋势
     * Summary: 查询地址的接收交易数量趋势
     */
    public QueryChaininsightAddresshistogramrxResponse queryChaininsightAddresshistogramrxEx(QueryChaininsightAddresshistogramrxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramrx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddresshistogramrxResponse());
    }

    /**
     * Description: 查询地址的发送交易数量趋势
     * Summary: 查询地址的发送交易数量趋势
     */
    public QueryChaininsightAddresshistogramtxResponse queryChaininsightAddresshistogramtx(QueryChaininsightAddresshistogramtxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddresshistogramtxEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址的发送交易数量趋势
     * Summary: 查询地址的发送交易数量趋势
     */
    public QueryChaininsightAddresshistogramtxResponse queryChaininsightAddresshistogramtxEx(QueryChaininsightAddresshistogramtxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramtx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddresshistogramtxResponse());
    }

    /**
     * Description: 查询链交易数量趋势
     * Summary: 查询链交易数量趋势
     */
    public QueryChaininsightChaintxhistogramResponse queryChaininsightChaintxhistogram(QueryChaininsightChaintxhistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightChaintxhistogramEx(request, headers, runtime);
    }

    /**
     * Description: 查询链交易数量趋势
     * Summary: 查询链交易数量趋势
     */
    public QueryChaininsightChaintxhistogramResponse queryChaininsightChaintxhistogramEx(QueryChaininsightChaintxhistogramRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.chaintxhistogram.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightChaintxhistogramResponse());
    }

    /**
     * Description: 批量查询链上交易详情
     * Summary: 批量查询链上交易详情
     */
    public BatchqueryChaininsightTransactionResponse batchqueryChaininsightTransaction(BatchqueryChaininsightTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryChaininsightTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询链上交易详情
     * Summary: 批量查询链上交易详情
     */
    public BatchqueryChaininsightTransactionResponse batchqueryChaininsightTransactionEx(BatchqueryChaininsightTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryChaininsightTransactionResponse());
    }

    /**
     * Description: 查询统计任务
     * Summary: 查询统计任务
     */
    public ListChaininsightStatisticResponse listChaininsightStatistic(ListChaininsightStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChaininsightStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 查询统计任务
     * Summary: 查询统计任务
     */
    public ListChaininsightStatisticResponse listChaininsightStatisticEx(ListChaininsightStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListChaininsightStatisticResponse());
    }

    /**
     * Description: 新建统计任务
     * Summary: 新建统计任务
     */
    public AddChaininsightStatisticResponse addChaininsightStatistic(AddChaininsightStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addChaininsightStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 新建统计任务
     * Summary: 新建统计任务
     */
    public AddChaininsightStatisticResponse addChaininsightStatisticEx(AddChaininsightStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddChaininsightStatisticResponse());
    }

    /**
     * Description: 操作统计任务
     * Summary: 操作统计任务
     */
    public OperateChaininsightStatisticResponse operateChaininsightStatistic(OperateChaininsightStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateChaininsightStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 操作统计任务
     * Summary: 操作统计任务
     */
    public OperateChaininsightStatisticResponse operateChaininsightStatisticEx(OperateChaininsightStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateChaininsightStatisticResponse());
    }

    /**
     * Description: 查询统计任务的统计结果直方图
     * Summary: 查询统计任务的统计结果直方图
     */
    public QueryChaininsightStatistichistogramResponse queryChaininsightStatistichistogram(QueryChaininsightStatistichistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightStatistichistogramEx(request, headers, runtime);
    }

    /**
     * Description: 查询统计任务的统计结果直方图
     * Summary: 查询统计任务的统计结果直方图
     */
    public QueryChaininsightStatistichistogramResponse queryChaininsightStatistichistogramEx(QueryChaininsightStatistichistogramRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistichistogram.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightStatistichistogramResponse());
    }

    /**
     * Description: 查询统计任务的统计结果表格
     * Summary: 查询统计任务的统计结果表格
     */
    public QueryChaininsightStatistictableResponse queryChaininsightStatistictable(QueryChaininsightStatistictableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightStatistictableEx(request, headers, runtime);
    }

    /**
     * Description: 查询统计任务的统计结果表格
     * Summary: 查询统计任务的统计结果表格
     */
    public QueryChaininsightStatistictableResponse queryChaininsightStatistictableEx(QueryChaininsightStatistictableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistictable.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightStatistictableResponse());
    }

    /**
     * Description: 生成支付宝小程序二维码
     * Summary: 生成支付宝小程序二维码
     */
    public CreateChaininsightQrcodeResponse createChaininsightQrcode(CreateChaininsightQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChaininsightQrcodeEx(request, headers, runtime);
    }

    /**
     * Description: 生成支付宝小程序二维码
     * Summary: 生成支付宝小程序二维码
     */
    public CreateChaininsightQrcodeResponse createChaininsightQrcodeEx(CreateChaininsightQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.qrcode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChaininsightQrcodeResponse());
    }

    /**
     * Description: 开通数据搜索服务
     * Summary: 开通数据搜索服务
     */
    public OpenChaininsightDatasearchResponse openChaininsightDatasearch(OpenChaininsightDatasearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openChaininsightDatasearchEx(request, headers, runtime);
    }

    /**
     * Description: 开通数据搜索服务
     * Summary: 开通数据搜索服务
     */
    public OpenChaininsightDatasearchResponse openChaininsightDatasearchEx(OpenChaininsightDatasearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.datasearch.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenChaininsightDatasearchResponse());
    }

    /**
     * Description: 私有化场景下查询所有链的数据搜索服务状态
     * Summary: 私有化场景下查询所有链的数据搜索服务状态
     */
    public QueryChaininsightPrivatedatasearchstatusResponse queryChaininsightPrivatedatasearchstatus(QueryChaininsightPrivatedatasearchstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightPrivatedatasearchstatusEx(request, headers, runtime);
    }

    /**
     * Description: 私有化场景下查询所有链的数据搜索服务状态
     * Summary: 私有化场景下查询所有链的数据搜索服务状态
     */
    public QueryChaininsightPrivatedatasearchstatusResponse queryChaininsightPrivatedatasearchstatusEx(QueryChaininsightPrivatedatasearchstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.privatedatasearchstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightPrivatedatasearchstatusResponse());
    }

    /**
     * Description: 添加看板
     * Summary: 添加看板
     */
    public AddChaininsightWidgetsResponse addChaininsightWidgets(AddChaininsightWidgetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addChaininsightWidgetsEx(request, headers, runtime);
    }

    /**
     * Description: 添加看板
     * Summary: 添加看板
     */
    public AddChaininsightWidgetsResponse addChaininsightWidgetsEx(AddChaininsightWidgetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddChaininsightWidgetsResponse());
    }

    /**
     * Description: 获取看板列表
     * Summary: 获取看板列表
     */
    public ListChaininsightWidgetsResponse listChaininsightWidgets(ListChaininsightWidgetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChaininsightWidgetsEx(request, headers, runtime);
    }

    /**
     * Description: 获取看板列表
     * Summary: 获取看板列表
     */
    public ListChaininsightWidgetsResponse listChaininsightWidgetsEx(ListChaininsightWidgetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListChaininsightWidgetsResponse());
    }

    /**
     * Description: 分页查询链上活跃接收地址
     * Summary: 分页查询链上活跃接收地址
     */
    public QueryChaininsightTablesactivereceiverResponse queryChaininsightTablesactivereceiver(QueryChaininsightTablesactivereceiverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightTablesactivereceiverEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上活跃接收地址
     * Summary: 分页查询链上活跃接收地址
     */
    public QueryChaininsightTablesactivereceiverResponse queryChaininsightTablesactivereceiverEx(QueryChaininsightTablesactivereceiverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.tablesactivereceiver.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightTablesactivereceiverResponse());
    }

    /**
     * Description: 分页查询链上活跃发送地址
     * Summary: 分页查询链上活跃发送地址
     */
    public QueryChaininsightTablesactivesenderResponse queryChaininsightTablesactivesender(QueryChaininsightTablesactivesenderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightTablesactivesenderEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上活跃发送地址
     * Summary: 分页查询链上活跃发送地址
     */
    public QueryChaininsightTablesactivesenderResponse queryChaininsightTablesactivesenderEx(QueryChaininsightTablesactivesenderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.tablesactivesender.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightTablesactivesenderResponse());
    }

    /**
     * Description: 分页查询链上近期合约
     * Summary: 分页查询链上近期合约
     */
    public PagequeryChaininsightLatestcontractsResponse pagequeryChaininsightLatestcontracts(PagequeryChaininsightLatestcontractsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightLatestcontractsEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上近期合约
     * Summary: 分页查询链上近期合约
     */
    public PagequeryChaininsightLatestcontractsResponse pagequeryChaininsightLatestcontractsEx(PagequeryChaininsightLatestcontractsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.latestcontracts.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightLatestcontractsResponse());
    }

    /**
     * Description: 分页查询链上近期交易
     * Summary: 分页查询链上近期交易
     */
    public PagequeryChaininsightLatesttxsResponse pagequeryChaininsightLatesttxs(PagequeryChaininsightLatesttxsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightLatesttxsEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上近期交易
     * Summary: 分页查询链上近期交易
     */
    public PagequeryChaininsightLatesttxsResponse pagequeryChaininsightLatesttxsEx(PagequeryChaininsightLatesttxsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.latesttxs.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightLatesttxsResponse());
    }

    /**
     * Description: 私有化场景下查询区块链整体状态
     * Summary: 私有化场景下查询区块链整体状态
     */
    public QueryChaininsightPrivatechainsstatusResponse queryChaininsightPrivatechainsstatus(QueryChaininsightPrivatechainsstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightPrivatechainsstatusEx(request, headers, runtime);
    }

    /**
     * Description: 私有化场景下查询区块链整体状态
     * Summary: 私有化场景下查询区块链整体状态
     */
    public QueryChaininsightPrivatechainsstatusResponse queryChaininsightPrivatechainsstatusEx(QueryChaininsightPrivatechainsstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.privatechainsstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightPrivatechainsstatusResponse());
    }

    /**
     * Description: 私有化场景下查询链交易数量趋势
     * Summary: 私有化场景下查询链交易数量趋势
     */
    public QueryChaininsightPrivatechaintxhistogramResponse queryChaininsightPrivatechaintxhistogram(QueryChaininsightPrivatechaintxhistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightPrivatechaintxhistogramEx(request, headers, runtime);
    }

    /**
     * Description: 私有化场景下查询链交易数量趋势
     * Summary: 私有化场景下查询链交易数量趋势
     */
    public QueryChaininsightPrivatechaintxhistogramResponse queryChaininsightPrivatechaintxhistogramEx(QueryChaininsightPrivatechaintxhistogramRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.privatechaintxhistogram.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightPrivatechaintxhistogramResponse());
    }

    /**
     * Description: 删除数据洞察看板
     * Summary: 删除数据洞察看板
     */
    public DeleteChaininsightWidgetsResponse deleteChaininsightWidgets(DeleteChaininsightWidgetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChaininsightWidgetsEx(request, headers, runtime);
    }

    /**
     * Description: 删除数据洞察看板
     * Summary: 删除数据洞察看板
     */
    public DeleteChaininsightWidgetsResponse deleteChaininsightWidgetsEx(DeleteChaininsightWidgetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteChaininsightWidgetsResponse());
    }

    /**
     * Description: 移动看板
     * Summary: 移动看板
     */
    public OperateChaininsightWidgetsmoveResponse operateChaininsightWidgetsmove(OperateChaininsightWidgetsmoveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateChaininsightWidgetsmoveEx(request, headers, runtime);
    }

    /**
     * Description: 移动看板
     * Summary: 移动看板
     */
    public OperateChaininsightWidgetsmoveResponse operateChaininsightWidgetsmoveEx(OperateChaininsightWidgetsmoveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgetsmove.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateChaininsightWidgetsmoveResponse());
    }

    /**
     * Description: 修改看板
     * Summary: 修改看板
     */
    public UpdateChaininsightWidgetsResponse updateChaininsightWidgets(UpdateChaininsightWidgetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChaininsightWidgetsEx(request, headers, runtime);
    }

    /**
     * Description: 修改看板
     * Summary: 修改看板
     */
    public UpdateChaininsightWidgetsResponse updateChaininsightWidgetsEx(UpdateChaininsightWidgetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChaininsightWidgetsResponse());
    }

    /**
     * Description: 下载合约
     * Summary: 下载合约
     */
    public DownloadChaininsightContractResponse downloadChaininsightContract(DownloadChaininsightContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadChaininsightContractEx(request, headers, runtime);
    }

    /**
     * Description: 下载合约
     * Summary: 下载合约
     */
    public DownloadChaininsightContractResponse downloadChaininsightContractEx(DownloadChaininsightContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contract.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadChaininsightContractResponse());
    }

    /**
     * Description: 查询修改合约的交易
     * Summary: 查询修改合约的交易
     */
    public PagequeryChaininsightContractmodifytxResponse pagequeryChaininsightContractmodifytx(PagequeryChaininsightContractmodifytxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightContractmodifytxEx(request, headers, runtime);
    }

    /**
     * Description: 查询修改合约的交易
     * Summary: 查询修改合约的交易
     */
    public PagequeryChaininsightContractmodifytxResponse pagequeryChaininsightContractmodifytxEx(PagequeryChaininsightContractmodifytxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractmodifytx.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightContractmodifytxResponse());
    }

    /**
     * Description: 分页查询账户的修改交易
     * Summary: 分页查询账户的修改交易
     */
    public PagequeryChaininsightAccountmodifytxResponse pagequeryChaininsightAccountmodifytx(PagequeryChaininsightAccountmodifytxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightAccountmodifytxEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询账户的修改交易
     * Summary: 分页查询账户的修改交易
     */
    public PagequeryChaininsightAccountmodifytxResponse pagequeryChaininsightAccountmodifytxEx(PagequeryChaininsightAccountmodifytxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.accountmodifytx.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightAccountmodifytxResponse());
    }

    /**
     * Description: 返回对应 ERC 类型资产统计所必须的接口
     * Summary: 查询资产统计所必须的接口
     */
    public ListChaininsightAssetinterfacesrequiredResponse listChaininsightAssetinterfacesrequired(ListChaininsightAssetinterfacesrequiredRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChaininsightAssetinterfacesrequiredEx(request, headers, runtime);
    }

    /**
     * Description: 返回对应 ERC 类型资产统计所必须的接口
     * Summary: 查询资产统计所必须的接口
     */
    public ListChaininsightAssetinterfacesrequiredResponse listChaininsightAssetinterfacesrequiredEx(ListChaininsightAssetinterfacesrequiredRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.assetinterfacesrequired.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListChaininsightAssetinterfacesrequiredResponse());
    }

    /**
     * Description: 查询链上资产的详情
     * Summary: 查询资产详情
     */
    public QueryChaininsightStatisticassetdetailResponse queryChaininsightStatisticassetdetail(QueryChaininsightStatisticassetdetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightStatisticassetdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上资产的详情
     * Summary: 查询资产详情
     */
    public QueryChaininsightStatisticassetdetailResponse queryChaininsightStatisticassetdetailEx(QueryChaininsightStatisticassetdetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightStatisticassetdetailResponse());
    }

    /**
     * Description: 查询链上资产合约中资产的元信息
     * Summary: 查询链上资产元信息
     */
    public QueryChaininsightStatisticassetmetaResponse queryChaininsightStatisticassetmeta(QueryChaininsightStatisticassetmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightStatisticassetmetaEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上资产合约中资产的元信息
     * Summary: 查询链上资产元信息
     */
    public QueryChaininsightStatisticassetmetaResponse queryChaininsightStatisticassetmetaEx(QueryChaininsightStatisticassetmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetmeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightStatisticassetmetaResponse());
    }

    /**
     * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
     * Summary: 查询链上资产的持有者信息
     */
    public PagequeryChaininsightStatisticassetownerResponse pagequeryChaininsightStatisticassetowner(PagequeryChaininsightStatisticassetownerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightStatisticassetownerEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
     * Summary: 查询链上资产的持有者信息
     */
    public PagequeryChaininsightStatisticassetownerResponse pagequeryChaininsightStatisticassetownerEx(PagequeryChaininsightStatisticassetownerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetowner.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightStatisticassetownerResponse());
    }

    /**
     * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
     * Summary: 查询链上账户的资产列表
     */
    public PagequeryChaininsightStatisticassetinventoryaccountResponse pagequeryChaininsightStatisticassetinventoryaccount(PagequeryChaininsightStatisticassetinventoryaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightStatisticassetinventoryaccountEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
     * Summary: 查询链上账户的资产列表
     */
    public PagequeryChaininsightStatisticassetinventoryaccountResponse pagequeryChaininsightStatisticassetinventoryaccountEx(PagequeryChaininsightStatisticassetinventoryaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetinventoryaccount.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightStatisticassetinventoryaccountResponse());
    }

    /**
     * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
     * Summary: 查询链上资产的流转信息
     */
    public PagequeryChaininsightStatisticassethistoryassetResponse pagequeryChaininsightStatisticassethistoryasset(PagequeryChaininsightStatisticassethistoryassetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightStatisticassethistoryassetEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
     * Summary: 查询链上资产的流转信息
     */
    public PagequeryChaininsightStatisticassethistoryassetResponse pagequeryChaininsightStatisticassethistoryassetEx(PagequeryChaininsightStatisticassethistoryassetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassethistoryasset.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightStatisticassethistoryassetResponse());
    }

    /**
     * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
     * Summary: 查询链上资产合约的资产流转信息
     */
    public PagequeryChaininsightStatisticassethistorycontractResponse pagequeryChaininsightStatisticassethistorycontract(PagequeryChaininsightStatisticassethistorycontractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryChaininsightStatisticassethistorycontractEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
     * Summary: 查询链上资产合约的资产流转信息
     */
    public PagequeryChaininsightStatisticassethistorycontractResponse pagequeryChaininsightStatisticassethistorycontractEx(PagequeryChaininsightStatisticassethistorycontractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassethistorycontract.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryChaininsightStatisticassethistorycontractResponse());
    }

    /**
     * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 列出链上地址的时间轴配置
     */
    public QueryChaininsightContracttimelineconfigResponse queryChaininsightContracttimelineconfig(QueryChaininsightContracttimelineconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightContracttimelineconfigEx(request, headers, runtime);
    }

    /**
     * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 列出链上地址的时间轴配置
     */
    public QueryChaininsightContracttimelineconfigResponse queryChaininsightContracttimelineconfigEx(QueryChaininsightContracttimelineconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightContracttimelineconfigResponse());
    }

    /**
     * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 更新链上地址的时间轴配置
     */
    public UpdateChaininsightContracttimelineconfigResponse updateChaininsightContracttimelineconfig(UpdateChaininsightContracttimelineconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChaininsightContracttimelineconfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 更新链上地址的时间轴配置
     */
    public UpdateChaininsightContracttimelineconfigResponse updateChaininsightContracttimelineconfigEx(UpdateChaininsightContracttimelineconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChaininsightContracttimelineconfigResponse());
    }

    /**
     * Description: 重写接口参数配置
     * Summary: 重写接口参数配置
     */
    public SaveChaininsightContractinterfaceResponse saveChaininsightContractinterface(SaveChaininsightContractinterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveChaininsightContractinterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 重写接口参数配置
     * Summary: 重写接口参数配置
     */
    public SaveChaininsightContractinterfaceResponse saveChaininsightContractinterfaceEx(SaveChaininsightContractinterfaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveChaininsightContractinterfaceResponse());
    }

    /**
     * Description: 注册链信息
     * Summary: 注册链信息
     */
    public RegisterChainsResponse registerChains(RegisterChainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerChainsEx(request, headers, runtime);
    }

    /**
     * Description: 注册链信息
     * Summary: 注册链信息
     */
    public RegisterChainsResponse registerChainsEx(RegisterChainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chains.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterChainsResponse());
    }

    /**
     * Description: 操作数据网关开通状态
     * Summary: 操作数据网关开通状态
     */
    public OperateChainsResponse operateChains(OperateChainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateChainsEx(request, headers, runtime);
    }

    /**
     * Description: 操作数据网关开通状态
     * Summary: 操作数据网关开通状态
     */
    public OperateChainsResponse operateChainsEx(OperateChainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chains.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateChainsResponse());
    }

    /**
     * Description: 查询某条链的服务开通状态
     * Summary: 查询某条链的服务开通状态
     */
    public GetChainsStatusResponse getChainsStatus(GetChainsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChainsStatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询某条链的服务开通状态
     * Summary: 查询某条链的服务开通状态
     */
    public GetChainsStatusResponse getChainsStatusEx(GetChainsStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chains.status.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetChainsStatusResponse());
    }
}
