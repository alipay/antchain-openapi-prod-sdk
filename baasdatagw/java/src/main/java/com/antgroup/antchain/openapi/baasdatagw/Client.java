// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.baasdatagw.models.*;
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
                    new TeaPair("sdk_version", "1.3.1"),
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
     * Description: 检索索引的链上数据
     * Summary: 检索索引的链上数据
     */
    public QueryDatasearchSearchResponse queryDatasearchSearch(QueryDatasearchSearchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatasearchSearchEx(request, headers, runtime);
    }

    /**
     * Description: 检索索引的链上数据
     * Summary: 检索索引的链上数据
     */
    public QueryDatasearchSearchResponse queryDatasearchSearchEx(QueryDatasearchSearchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.search.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatasearchSearchResponse());
    }

    /**
     * Description: 针对某个数据类型的数据开启索引；该方法可重入
     * Summary: 开启数据索引
     */
    public StartDatasearchIndexResponse startDatasearchIndex(StartDatasearchIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 针对某个数据类型的数据开启索引；该方法可重入
     * Summary: 开启数据索引
     */
    public StartDatasearchIndexResponse startDatasearchIndexEx(StartDatasearchIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDatasearchIndexResponse());
    }

    /**
     * Description: 针对某个分组的数据停止索引；该方法可重入
     * Summary: 停止数据索引
     */
    public StopDatasearchIndexResponse stopDatasearchIndex(StopDatasearchIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 针对某个分组的数据停止索引；该方法可重入
     * Summary: 停止数据索引
     */
    public StopDatasearchIndexResponse stopDatasearchIndexEx(StopDatasearchIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopDatasearchIndexResponse());
    }

    /**
     * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
     * Summary: 删除数据索引
     */
    public RemoveDatasearchIndexResponse removeDatasearchIndex(RemoveDatasearchIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
     * Summary: 删除数据索引
     */
    public RemoveDatasearchIndexResponse removeDatasearchIndexEx(RemoveDatasearchIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveDatasearchIndexResponse());
    }

    /**
     * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
     * Summary: 查询数据索引进度
     */
    public GetDatasearchIndexResponse getDatasearchIndex(GetDatasearchIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasearchIndexEx(request, headers, runtime);
    }

    /**
     * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
     * Summary: 查询数据索引进度
     */
    public GetDatasearchIndexResponse getDatasearchIndexEx(GetDatasearchIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDatasearchIndexResponse());
    }

    /**
     * Description: 列出租户在链上的所有合约Meta
     * Summary: 列出租户在链上的所有合约Meta
     */
    public ListContractmetaResponse listContractmeta(ListContractmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 列出租户在链上的所有合约Meta
     * Summary: 列出租户在链上的所有合约Meta
     */
    public ListContractmetaResponse listContractmetaEx(ListContractmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractmetaResponse());
    }

    /**
     * Description: 新增合约Meta
     * Summary: 新增合约Meta
     */
    public AddContractmetaResponse addContractmeta(AddContractmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 新增合约Meta
     * Summary: 新增合约Meta
     */
    public AddContractmetaResponse addContractmetaEx(AddContractmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractmetaResponse());
    }

    /**
     * Description: 删除合约meta
     * Summary: 删除合约meta
     */
    public DeleteContractmetaResponse deleteContractmeta(DeleteContractmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 删除合约meta
     * Summary: 删除合约meta
     */
    public DeleteContractmetaResponse deleteContractmetaEx(DeleteContractmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContractmetaResponse());
    }

    /**
     * Description: 查询meta具体信息
     * Summary: 获取meta信息
     */
    public GetContractmetaResponse getContractmeta(GetContractmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractmetaEx(request, headers, runtime);
    }

    /**
     * Description: 查询meta具体信息
     * Summary: 获取meta信息
     */
    public GetContractmetaResponse getContractmetaEx(GetContractmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.contractmeta.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractmetaResponse());
    }

    /**
     * Description: 获取导出任务预览数据的异步任务ID
     * Summary: 获取导出任务预览数据的异步任务ID
     */
    public CreateDataexportPreviewdataResponse createDataexportPreviewdata(CreateDataexportPreviewdataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataexportPreviewdataEx(request, headers, runtime);
    }

    /**
     * Description: 获取导出任务预览数据的异步任务ID
     * Summary: 获取导出任务预览数据的异步任务ID
     */
    public CreateDataexportPreviewdataResponse createDataexportPreviewdataEx(CreateDataexportPreviewdataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataexportPreviewdataResponse());
    }

    /**
     * Description: 查询数据预览任务结果
     * Summary: 查询数据预览任务结果
     */
    public QueryDataexportPreviewdataResponse queryDataexportPreviewdata(QueryDataexportPreviewdataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataexportPreviewdataEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据预览任务结果
     * Summary: 查询数据预览任务结果
     */
    public QueryDataexportPreviewdataResponse queryDataexportPreviewdataEx(QueryDataexportPreviewdataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataexportPreviewdataResponse());
    }

    /**
     * Description: 查询默认字段映射
     * Summary: 查询默认字段映射
     */
    public GetDataexportPreviewsmappingResponse getDataexportPreviewsmapping(GetDataexportPreviewsmappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataexportPreviewsmappingEx(request, headers, runtime);
    }

    /**
     * Description: 查询默认字段映射
     * Summary: 查询默认字段映射
     */
    public GetDataexportPreviewsmappingResponse getDataexportPreviewsmappingEx(GetDataexportPreviewsmappingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewsmapping.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDataexportPreviewsmappingResponse());
    }

    /**
     * Description: 创建导出任务
     * Summary: 创建导出任务
     */
    public CreateDataexportTriggerResponse createDataexportTrigger(CreateDataexportTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataexportTriggerEx(request, headers, runtime);
    }

    /**
     * Description: 创建导出任务
     * Summary: 创建导出任务
     */
    public CreateDataexportTriggerResponse createDataexportTriggerEx(CreateDataexportTriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.trigger.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataexportTriggerResponse());
    }

    /**
     * Description: 查询建表语句
     * Summary: 查询建表语句
     */
    public QueryDataexportPreviewsqlResponse queryDataexportPreviewsql(QueryDataexportPreviewsqlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataexportPreviewsqlEx(request, headers, runtime);
    }

    /**
     * Description: 查询建表语句
     * Summary: 查询建表语句
     */
    public QueryDataexportPreviewsqlResponse queryDataexportPreviewsqlEx(QueryDataexportPreviewsqlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewsql.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataexportPreviewsqlResponse());
    }

    /**
     * Description: 列出导出任务
     * Summary: 列出导出任务
     */
    public ListDataexportTriggerResponse listDataexportTrigger(ListDataexportTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataexportTriggerEx(request, headers, runtime);
    }

    /**
     * Description: 列出导出任务
     * Summary: 列出导出任务
     */
    public ListDataexportTriggerResponse listDataexportTriggerEx(ListDataexportTriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.trigger.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataexportTriggerResponse());
    }

    /**
     * Description: 修改导出任务状态
     * Summary: 修改导出任务状态
     */
    public OperateDataexportTriggerstatusResponse operateDataexportTriggerstatus(OperateDataexportTriggerstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDataexportTriggerstatusEx(request, headers, runtime);
    }

    /**
     * Description: 修改导出任务状态
     * Summary: 修改导出任务状态
     */
    public OperateDataexportTriggerstatusResponse operateDataexportTriggerstatusEx(OperateDataexportTriggerstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerstatus.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDataexportTriggerstatusResponse());
    }

    /**
     * Description: 修改导出任务配置
     * Summary: 修改导出任务配置
     */
    public OperateDataexportTriggerconfigResponse operateDataexportTriggerconfig(OperateDataexportTriggerconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDataexportTriggerconfigEx(request, headers, runtime);
    }

    /**
     * Description: 修改导出任务配置
     * Summary: 修改导出任务配置
     */
    public OperateDataexportTriggerconfigResponse operateDataexportTriggerconfigEx(OperateDataexportTriggerconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerconfig.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDataexportTriggerconfigResponse());
    }

    /**
     * Description: 列出导出任务失败日志
     * Summary: 列出导出任务失败日志
     */
    public ListDataexportTriggerlogResponse listDataexportTriggerlog(ListDataexportTriggerlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataexportTriggerlogEx(request, headers, runtime);
    }

    /**
     * Description: 列出导出任务失败日志
     * Summary: 列出导出任务失败日志
     */
    public ListDataexportTriggerlogResponse listDataexportTriggerlogEx(ListDataexportTriggerlogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataexportTriggerlogResponse());
    }

    /**
     * Description: 操作导出任务失败日志
     * Summary: 操作导出任务失败日志
     */
    public OperateDataexportTriggerlogResponse operateDataexportTriggerlog(OperateDataexportTriggerlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDataexportTriggerlogEx(request, headers, runtime);
    }

    /**
     * Description: 操作导出任务失败日志
     * Summary: 操作导出任务失败日志
     */
    public OperateDataexportTriggerlogResponse operateDataexportTriggerlogEx(OperateDataexportTriggerlogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDataexportTriggerlogResponse());
    }

    /**
     * Description: 查询地址标签
     * Summary: 查询地址标签
     */
    public QueryChaininsightLabelsResponse queryChaininsightLabels(QueryChaininsightLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightLabelsEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址标签
     * Summary: 查询地址标签
     */
    public QueryChaininsightLabelsResponse queryChaininsightLabelsEx(QueryChaininsightLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.labels.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightLabelsResponse());
    }

    /**
     * Description: 更新地址标签
     * Summary: 更新地址标签
     */
    public UpdateChaininsightLabelsResponse updateChaininsightLabels(UpdateChaininsightLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChaininsightLabelsEx(request, headers, runtime);
    }

    /**
     * Description: 更新地址标签
     * Summary: 更新地址标签
     */
    public UpdateChaininsightLabelsResponse updateChaininsightLabelsEx(UpdateChaininsightLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.labels.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChaininsightLabelsResponse());
    }

    /**
     * Description: 链上搜索
     * Summary: 链上搜索
     */
    public QueryChaininsightSearchResponse queryChaininsightSearch(QueryChaininsightSearchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightSearchEx(request, headers, runtime);
    }

    /**
     * Description: 链上搜索
     * Summary: 链上搜索
     */
    public QueryChaininsightSearchResponse queryChaininsightSearchEx(QueryChaininsightSearchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.search.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightSearchResponse());
    }

    /**
     * Description: 查询链上地址详情
     * Summary: 查询链上地址详情
     */
    public QueryChaininsightAddressResponse queryChaininsightAddress(QueryChaininsightAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddressEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上地址详情
     * Summary: 查询链上地址详情
     */
    public QueryChaininsightAddressResponse queryChaininsightAddressEx(QueryChaininsightAddressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.address.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddressResponse());
    }

    /**
     * Description: 查询链上交易详情
     * Summary: 查询链上交易详情
     */
    public QueryChaininsightTransactionResponse queryChaininsightTransaction(QueryChaininsightTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上交易详情
     * Summary: 查询链上交易详情
     */
    public QueryChaininsightTransactionResponse queryChaininsightTransactionEx(QueryChaininsightTransactionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightTransactionResponse());
    }

    /**
     * Description: 查询链上区块详情
     * Summary: 查询链上区块详情
     */
    public QueryChaininsightBlockResponse queryChaininsightBlock(QueryChaininsightBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightBlockEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上区块详情
     * Summary: 查询链上区块详情
     */
    public QueryChaininsightBlockResponse queryChaininsightBlockEx(QueryChaininsightBlockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.block.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightBlockResponse());
    }

    /**
     * Description: 查询地址近期交易
     * Summary: 查询地址近期交易
     */
    public QueryChaininsightAddresslatesttxsResponse queryChaininsightAddresslatesttxs(QueryChaininsightAddresslatesttxsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddresslatesttxsEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址近期交易
     * Summary: 查询地址近期交易
     */
    public QueryChaininsightAddresslatesttxsResponse queryChaininsightAddresslatesttxsEx(QueryChaininsightAddresslatesttxsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresslatesttxs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddresslatesttxsResponse());
    }

    /**
     * Description: 列出合约全部接口
     * Summary: 列出合约全部接口
     */
    public ListChaininsightContractinterfaceResponse listChaininsightContractinterface(ListChaininsightContractinterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChaininsightContractinterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 列出合约全部接口
     * Summary: 列出合约全部接口
     */
    public ListChaininsightContractinterfaceResponse listChaininsightContractinterfaceEx(ListChaininsightContractinterfaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListChaininsightContractinterfaceResponse());
    }

    /**
     * Description: 查询合约接口信息
     * Summary: 查询合约接口信息
     */
    public DetailChaininsightContractinterfaceResponse detailChaininsightContractinterface(DetailChaininsightContractinterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailChaininsightContractinterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约接口信息
     * Summary: 查询合约接口信息
     */
    public DetailChaininsightContractinterfaceResponse detailChaininsightContractinterfaceEx(DetailChaininsightContractinterfaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailChaininsightContractinterfaceResponse());
    }

    /**
     * Description: 更新合约接口信息
     * Summary: 更新合约接口信息
     */
    public UpdateChaininsightContractinterfaceResponse updateChaininsightContractinterface(UpdateChaininsightContractinterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChaininsightContractinterfaceEx(request, headers, runtime);
    }

    /**
     * Description: 更新合约接口信息
     * Summary: 更新合约接口信息
     */
    public UpdateChaininsightContractinterfaceResponse updateChaininsightContractinterfaceEx(UpdateChaininsightContractinterfaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChaininsightContractinterfaceResponse());
    }

    /**
     * Description: 上传合约ABI文件
     * Summary: 上传合约ABI文件
     */
    public UploadChaininsightAbiResponse uploadChaininsightAbi(UploadChaininsightAbiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadChaininsightAbiEx(request, headers, runtime);
    }

    /**
     * Description: 上传合约ABI文件
     * Summary: 上传合约ABI文件
     */
    public UploadChaininsightAbiResponse uploadChaininsightAbiEx(UploadChaininsightAbiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.abi.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadChaininsightAbiResponse());
    }

    /**
     * Description: 查询地址的接收交易数量趋势
     * Summary: 查询地址的接收交易数量趋势
     */
    public QueryChaininsightAddresshistogramrxResponse queryChaininsightAddresshistogramrx(QueryChaininsightAddresshistogramrxRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddresshistogramrxEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址的接收交易数量趋势
     * Summary: 查询地址的接收交易数量趋势
     */
    public QueryChaininsightAddresshistogramrxResponse queryChaininsightAddresshistogramrxEx(QueryChaininsightAddresshistogramrxRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramrx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddresshistogramrxResponse());
    }

    /**
     * Description: 查询地址的发送交易数量趋势
     * Summary: 查询地址的发送交易数量趋势
     */
    public QueryChaininsightAddresshistogramtxResponse queryChaininsightAddresshistogramtx(QueryChaininsightAddresshistogramtxRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightAddresshistogramtxEx(request, headers, runtime);
    }

    /**
     * Description: 查询地址的发送交易数量趋势
     * Summary: 查询地址的发送交易数量趋势
     */
    public QueryChaininsightAddresshistogramtxResponse queryChaininsightAddresshistogramtxEx(QueryChaininsightAddresshistogramtxRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramtx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightAddresshistogramtxResponse());
    }

    /**
     * Description: 查询链交易数量趋势
     * Summary: 查询链交易数量趋势
     */
    public QueryChaininsightChaintxhistogramResponse queryChaininsightChaintxhistogram(QueryChaininsightChaintxhistogramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightChaintxhistogramEx(request, headers, runtime);
    }

    /**
     * Description: 查询链交易数量趋势
     * Summary: 查询链交易数量趋势
     */
    public QueryChaininsightChaintxhistogramResponse queryChaininsightChaintxhistogramEx(QueryChaininsightChaintxhistogramRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.chaintxhistogram.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightChaintxhistogramResponse());
    }

    /**
     * Description: 批量查询链上交易详情
     * Summary: 批量查询链上交易详情
     */
    public BatchqueryChaininsightTransactionResponse batchqueryChaininsightTransaction(BatchqueryChaininsightTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryChaininsightTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询链上交易详情
     * Summary: 批量查询链上交易详情
     */
    public BatchqueryChaininsightTransactionResponse batchqueryChaininsightTransactionEx(BatchqueryChaininsightTransactionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryChaininsightTransactionResponse());
    }

    /**
     * Description: 查询统计任务
     * Summary: 查询统计任务
     */
    public ListChaininsightStatisticResponse listChaininsightStatistic(ListChaininsightStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChaininsightStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 查询统计任务
     * Summary: 查询统计任务
     */
    public ListChaininsightStatisticResponse listChaininsightStatisticEx(ListChaininsightStatisticRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListChaininsightStatisticResponse());
    }

    /**
     * Description: 新建统计任务
     * Summary: 新建统计任务
     */
    public AddChaininsightStatisticResponse addChaininsightStatistic(AddChaininsightStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addChaininsightStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 新建统计任务
     * Summary: 新建统计任务
     */
    public AddChaininsightStatisticResponse addChaininsightStatisticEx(AddChaininsightStatisticRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddChaininsightStatisticResponse());
    }

    /**
     * Description: 操作统计任务
     * Summary: 操作统计任务
     */
    public OperateChaininsightStatisticResponse operateChaininsightStatistic(OperateChaininsightStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateChaininsightStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 操作统计任务
     * Summary: 操作统计任务
     */
    public OperateChaininsightStatisticResponse operateChaininsightStatisticEx(OperateChaininsightStatisticRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateChaininsightStatisticResponse());
    }

    /**
     * Description: 查询统计任务的统计结果直方图
     * Summary: 查询统计任务的统计结果直方图
     */
    public QueryChaininsightStatistichistogramResponse queryChaininsightStatistichistogram(QueryChaininsightStatistichistogramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightStatistichistogramEx(request, headers, runtime);
    }

    /**
     * Description: 查询统计任务的统计结果直方图
     * Summary: 查询统计任务的统计结果直方图
     */
    public QueryChaininsightStatistichistogramResponse queryChaininsightStatistichistogramEx(QueryChaininsightStatistichistogramRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistichistogram.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightStatistichistogramResponse());
    }

    /**
     * Description: 查询统计任务的统计结果表格
     * Summary: 查询统计任务的统计结果表格
     */
    public QueryChaininsightStatistictableResponse queryChaininsightStatistictable(QueryChaininsightStatistictableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChaininsightStatistictableEx(request, headers, runtime);
    }

    /**
     * Description: 查询统计任务的统计结果表格
     * Summary: 查询统计任务的统计结果表格
     */
    public QueryChaininsightStatistictableResponse queryChaininsightStatistictableEx(QueryChaininsightStatistictableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistictable.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChaininsightStatistictableResponse());
    }

    /**
     * Description: 生成支付宝小程序二维码
     * Summary: 生成支付宝小程序二维码
     */
    public CreateChaininsightQrcodeResponse createChaininsightQrcode(CreateChaininsightQrcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChaininsightQrcodeEx(request, headers, runtime);
    }

    /**
     * Description: 生成支付宝小程序二维码
     * Summary: 生成支付宝小程序二维码
     */
    public CreateChaininsightQrcodeResponse createChaininsightQrcodeEx(CreateChaininsightQrcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chaininsight.qrcode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChaininsightQrcodeResponse());
    }

    /**
     * Description: 注册链信息
     * Summary: 注册链信息
     */
    public RegisterChainsResponse registerChains(RegisterChainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerChainsEx(request, headers, runtime);
    }

    /**
     * Description: 注册链信息
     * Summary: 注册链信息
     */
    public RegisterChainsResponse registerChainsEx(RegisterChainsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chains.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterChainsResponse());
    }

    /**
     * Description: 操作数据网关开通状态
     * Summary: 操作数据网关开通状态
     */
    public OperateChainsResponse operateChains(OperateChainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateChainsEx(request, headers, runtime);
    }

    /**
     * Description: 操作数据网关开通状态
     * Summary: 操作数据网关开通状态
     */
    public OperateChainsResponse operateChainsEx(OperateChainsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chains.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateChainsResponse());
    }

    /**
     * Description: 查询某条链的服务开通状态
     * Summary: 查询某条链的服务开通状态
     */
    public GetChainsStatusResponse getChainsStatus(GetChainsStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChainsStatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询某条链的服务开通状态
     * Summary: 查询某条链的服务开通状态
     */
    public GetChainsStatusResponse getChainsStatusEx(GetChainsStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.baasdatagw.chains.status.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetChainsStatusResponse());
    }
}
