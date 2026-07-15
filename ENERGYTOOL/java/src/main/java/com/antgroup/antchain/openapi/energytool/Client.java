// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.energytool.models.*;

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
                    new TeaPair("sdk_version", "1.1.5"),
                    new TeaPair("_prod_code", "ENERGYTOOL"),
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
     * <p>Description: 虚拟交易团队接入appaccesscenter
     * Summary: 虚拟交易团队接入appaccesscenter</p>
     */
    public QueryTraderesultResponse queryTraderesult(QueryTraderesultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraderesultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 虚拟交易团队接入appaccesscenter
     * Summary: 虚拟交易团队接入appaccesscenter</p>
     */
    public QueryTraderesultResponse queryTraderesultEx(QueryTraderesultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.traderesult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraderesultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力行情主数据接口
     * Summary: 电力行情主数据接口</p>
     */
    public QueryElectricMarketpriceResponse queryElectricMarketprice(QueryElectricMarketpriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryElectricMarketpriceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力行情主数据接口
     * Summary: 电力行情主数据接口</p>
     */
    public QueryElectricMarketpriceResponse queryElectricMarketpriceEx(QueryElectricMarketpriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.electric.marketprice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryElectricMarketpriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力行情主数据查询接口
     * Summary: 电力行情主数据查询接口</p>
     */
    public QueryElectricCommondataResponse queryElectricCommondata(QueryElectricCommondataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryElectricCommondataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力行情主数据查询接口
     * Summary: 电力行情主数据查询接口</p>
     */
    public QueryElectricCommondataResponse queryElectricCommondataEx(QueryElectricCommondataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.electric.commondata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryElectricCommondataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 能源数采对外开放api
     * Summary: 能源数采对外开放api</p>
     */
    public QueryPanoraindexPolicyResponse queryPanoraindexPolicy(QueryPanoraindexPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPanoraindexPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 能源数采对外开放api
     * Summary: 能源数采对外开放api</p>
     */
    public QueryPanoraindexPolicyResponse queryPanoraindexPolicyEx(QueryPanoraindexPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.panoraindex.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPanoraindexPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易实时电价预测服务
     * Summary: 电力交易实时电价预测服务</p>
     */
    public QueryRealtimePriceforecastResponse queryRealtimePriceforecast(QueryRealtimePriceforecastRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRealtimePriceforecastEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易实时电价预测服务
     * Summary: 电力交易实时电价预测服务</p>
     */
    public QueryRealtimePriceforecastResponse queryRealtimePriceforecastEx(QueryRealtimePriceforecastRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.realtime.priceforecast.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRealtimePriceforecastResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易竞价空间分析
     * Summary: 电力交易竞价空间分析</p>
     */
    public QueryBiddingspaceResponse queryBiddingspace(QueryBiddingspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBiddingspaceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易竞价空间分析
     * Summary: 电力交易竞价空间分析</p>
     */
    public QueryBiddingspaceResponse queryBiddingspaceEx(QueryBiddingspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.biddingspace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBiddingspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易相似日竞价空间分析
     * Summary: 电力交易相似日竞价空间分析</p>
     */
    public QuerySimilardayResponse querySimilarday(QuerySimilardayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimilardayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易相似日竞价空间分析
     * Summary: 电力交易相似日竞价空间分析</p>
     */
    public QuerySimilardayResponse querySimilardayEx(QuerySimilardayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.similarday.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimilardayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易日前实时电价对比分析
     * Summary: 电力交易日前实时电价对比分析</p>
     */
    public QueryAheadrealtimePricecompareResponse queryAheadrealtimePricecompare(QueryAheadrealtimePricecompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAheadrealtimePricecompareEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易日前实时电价对比分析
     * Summary: 电力交易日前实时电价对比分析</p>
     */
    public QueryAheadrealtimePricecompareResponse queryAheadrealtimePricecompareEx(QueryAheadrealtimePricecompareRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.aheadrealtime.pricecompare.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAheadrealtimePricecompareResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易日前与实时价差预测
     * Summary: 电力交易日前与实时价差预测</p>
     */
    public QueryAheadrealtimePricediffpredictionResponse queryAheadrealtimePricediffprediction(QueryAheadrealtimePricediffpredictionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAheadrealtimePricediffpredictionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力交易日前与实时价差预测
     * Summary: 电力交易日前与实时价差预测</p>
     */
    public QueryAheadrealtimePricediffpredictionResponse queryAheadrealtimePricediffpredictionEx(QueryAheadrealtimePricediffpredictionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.aheadrealtime.pricediffprediction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAheadrealtimePricediffpredictionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 气象预警信息查询
     * Summary: 气象预警信息查询</p>
     */
    public QueryWeatherWarningResponse queryWeatherWarning(QueryWeatherWarningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWeatherWarningEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 气象预警信息查询
     * Summary: 气象预警信息查询</p>
     */
    public QueryWeatherWarningResponse queryWeatherWarningEx(QueryWeatherWarningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.weather.warning.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWeatherWarningResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识版本查询
     * Summary: 知识版本查询</p>
     */
    public QueryKmVersionResponse queryKmVersion(QueryKmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKmVersionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识版本查询
     * Summary: 知识版本查询</p>
     */
    public QueryKmVersionResponse queryKmVersionEx(QueryKmVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.km.version.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKmVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步版本内容详情
     * Summary: 同步版本内容详情</p>
     */
    public SyncKmVersionResponse syncKmVersion(SyncKmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncKmVersionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步版本内容详情
     * Summary: 同步版本内容详情</p>
     */
    public SyncKmVersionResponse syncKmVersionEx(SyncKmVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.km.version.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncKmVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取文档详情
     * Summary: 获取文档详情</p>
     */
    public SyncKmDocumentResponse syncKmDocument(SyncKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取文档详情
     * Summary: 获取文档详情</p>
     */
    public SyncKmDocumentResponse syncKmDocumentEx(SyncKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.km.document.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱对外开放rag检索
     * Summary: 知识图谱对外开放rag检索</p>
     */
    public QueryKmRagResponse queryKmRag(QueryKmRagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKmRagEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱对外开放rag检索
     * Summary: 知识图谱对外开放rag检索</p>
     */
    public QueryKmRagResponse queryKmRagEx(QueryKmRagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.energytool.km.rag.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKmRagResponse());
    }
}
