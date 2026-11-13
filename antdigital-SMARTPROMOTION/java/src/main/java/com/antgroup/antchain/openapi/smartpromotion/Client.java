// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.smartpromotion.models.*;

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
                    new TeaPair("sdk_version", "1.0.1"),
                    new TeaPair("_prod_code", "SMARTPROMOTION"),
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
     * <p>Description: 智能营销，查询用户未访问过的appid
     * Summary: 智能营销，查询用户未访问过的appid</p>
     */
    public QueryAntchainAtoPromotionUserunvisitedappidResponse queryAntchainAtoPromotionUserunvisitedappid(QueryAntchainAtoPromotionUserunvisitedappidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoPromotionUserunvisitedappidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能营销，查询用户未访问过的appid
     * Summary: 智能营销，查询用户未访问过的appid</p>
     */
    public QueryAntchainAtoPromotionUserunvisitedappidResponse queryAntchainAtoPromotionUserunvisitedappidEx(QueryAntchainAtoPromotionUserunvisitedappidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.promotion.userunvisitedappid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoPromotionUserunvisitedappidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: spp（SmartPromotion 智能营销系统）demo测试接口
     * Summary: spp（SmartPromotion 智能营销系统）demo测试接口</p>
     */
    public QueryAntchainAtoInnerSppdemoResponse queryAntchainAtoInnerSppdemo(QueryAntchainAtoInnerSppdemoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdemoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: spp（SmartPromotion 智能营销系统）demo测试接口
     * Summary: spp（SmartPromotion 智能营销系统）demo测试接口</p>
     */
    public QueryAntchainAtoInnerSppdemoResponse queryAntchainAtoInnerSppdemoEx(QueryAntchainAtoInnerSppdemoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdemo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdemoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量看板查询
     * Summary: 流量看板查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardtrafficResponse queryAntchainAtoInnerSppdashboardtraffic(QueryAntchainAtoInnerSppdashboardtrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboardtrafficEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量看板查询
     * Summary: 流量看板查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardtrafficResponse queryAntchainAtoInnerSppdashboardtrafficEx(QueryAntchainAtoInnerSppdashboardtrafficRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboardtraffic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboardtrafficResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 前筛查询
     * Summary: 前筛查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardscreeningResponse queryAntchainAtoInnerSppdashboardscreening(QueryAntchainAtoInnerSppdashboardscreeningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboardscreeningEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 前筛查询
     * Summary: 前筛查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardscreeningResponse queryAntchainAtoInnerSppdashboardscreeningEx(QueryAntchainAtoInnerSppdashboardscreeningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboardscreening.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboardscreeningResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 采买查询
     * Summary: 采买查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardpurchaseResponse queryAntchainAtoInnerSppdashboardpurchase(QueryAntchainAtoInnerSppdashboardpurchaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboardpurchaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 采买查询
     * Summary: 采买查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardpurchaseResponse queryAntchainAtoInnerSppdashboardpurchaseEx(QueryAntchainAtoInnerSppdashboardpurchaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboardpurchase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboardpurchaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分发查询
     * Summary: 分发查询</p>
     */
    public QueryAntchainAtoInnerSppdashboarddistributionResponse queryAntchainAtoInnerSppdashboarddistribution(QueryAntchainAtoInnerSppdashboarddistributionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboarddistributionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分发查询
     * Summary: 分发查询</p>
     */
    public QueryAntchainAtoInnerSppdashboarddistributionResponse queryAntchainAtoInnerSppdashboarddistributionEx(QueryAntchainAtoInnerSppdashboarddistributionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboarddistribution.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboarddistributionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 预警查询
     * Summary: 预警查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardsentinelResponse queryAntchainAtoInnerSppdashboardsentinel(QueryAntchainAtoInnerSppdashboardsentinelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboardsentinelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 预警查询
     * Summary: 预警查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardsentinelResponse queryAntchainAtoInnerSppdashboardsentinelEx(QueryAntchainAtoInnerSppdashboardsentinelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboardsentinel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboardsentinelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 前筛/采买/分发/预警 4 部分的数据总结
     * Summary: 前筛/采买/分发/预警 4 部分的数据总结</p>
     */
    public QueryAntchainAtoInnerSppdashboardsummaryResponse queryAntchainAtoInnerSppdashboardsummary(QueryAntchainAtoInnerSppdashboardsummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboardsummaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 前筛/采买/分发/预警 4 部分的数据总结
     * Summary: 前筛/采买/分发/预警 4 部分的数据总结</p>
     */
    public QueryAntchainAtoInnerSppdashboardsummaryResponse queryAntchainAtoInnerSppdashboardsummaryEx(QueryAntchainAtoInnerSppdashboardsummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboardsummary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboardsummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 思考过程查询
     * Summary: 思考过程查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardreasoningResponse queryAntchainAtoInnerSppdashboardreasoning(QueryAntchainAtoInnerSppdashboardreasoningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboardreasoningEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 思考过程查询
     * Summary: 思考过程查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardreasoningResponse queryAntchainAtoInnerSppdashboardreasoningEx(QueryAntchainAtoInnerSppdashboardreasoningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboardreasoning.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboardreasoningResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 前筛查询
     * Summary: 前筛查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardprefilterResponse queryAntchainAtoInnerSppdashboardprefilter(QueryAntchainAtoInnerSppdashboardprefilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdashboardprefilterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 前筛查询
     * Summary: 前筛查询</p>
     */
    public QueryAntchainAtoInnerSppdashboardprefilterResponse queryAntchainAtoInnerSppdashboardprefilterEx(QueryAntchainAtoInnerSppdashboardprefilterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdashboardprefilter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdashboardprefilterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划metadata查询
     * Summary: 商家获流计划metadata查询</p>
     */
    public QueryAntchainAtoInnerSppdemandplanmetadataResponse queryAntchainAtoInnerSppdemandplanmetadata(QueryAntchainAtoInnerSppdemandplanmetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdemandplanmetadataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划metadata查询
     * Summary: 商家获流计划metadata查询</p>
     */
    public QueryAntchainAtoInnerSppdemandplanmetadataResponse queryAntchainAtoInnerSppdemandplanmetadataEx(QueryAntchainAtoInnerSppdemandplanmetadataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdemandplanmetadata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdemandplanmetadataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划列表查询
     * Summary: 商家获流计划列表查询</p>
     */
    public QueryAntchainAtoInnerSppdemandplanlistResponse queryAntchainAtoInnerSppdemandplanlist(QueryAntchainAtoInnerSppdemandplanlistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdemandplanlistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划列表查询
     * Summary: 商家获流计划列表查询</p>
     */
    public QueryAntchainAtoInnerSppdemandplanlistResponse queryAntchainAtoInnerSppdemandplanlistEx(QueryAntchainAtoInnerSppdemandplanlistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdemandplanlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdemandplanlistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划详情查询
     * Summary: 商家获流计划详情查询</p>
     */
    public QueryAntchainAtoInnerSppdemandplanResponse queryAntchainAtoInnerSppdemandplan(QueryAntchainAtoInnerSppdemandplanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerSppdemandplanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划详情查询
     * Summary: 商家获流计划详情查询</p>
     */
    public QueryAntchainAtoInnerSppdemandplanResponse queryAntchainAtoInnerSppdemandplanEx(QueryAntchainAtoInnerSppdemandplanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdemandplan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerSppdemandplanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划删除或下线
     * Summary: 商家获流计划删除或下线</p>
     */
    public PublishAntchainAtoInnerSppdemandplanResponse publishAntchainAtoInnerSppdemandplan(PublishAntchainAtoInnerSppdemandplanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishAntchainAtoInnerSppdemandplanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划删除或下线
     * Summary: 商家获流计划删除或下线</p>
     */
    public PublishAntchainAtoInnerSppdemandplanResponse publishAntchainAtoInnerSppdemandplanEx(PublishAntchainAtoInnerSppdemandplanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdemandplan.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishAntchainAtoInnerSppdemandplanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划保存
     * Summary: 商家获流计划保存</p>
     */
    public SaveAntchainAtoInnerSppdemandplanResponse saveAntchainAtoInnerSppdemandplan(SaveAntchainAtoInnerSppdemandplanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAntchainAtoInnerSppdemandplanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家获流计划保存
     * Summary: 商家获流计划保存</p>
     */
    public SaveAntchainAtoInnerSppdemandplanResponse saveAntchainAtoInnerSppdemandplanEx(SaveAntchainAtoInnerSppdemandplanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.sppdemandplan.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveAntchainAtoInnerSppdemandplanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时决策接口，可传入lead_id和lead_type获得决策返回值
     * Summary: 实时决策接口，可传入lead_id和lead_type获得决策返回值</p>
     */
    public QueryAntchainAtoInnerLeadprefilterResponse queryAntchainAtoInnerLeadprefilter(QueryAntchainAtoInnerLeadprefilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerLeadprefilterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时决策接口，可传入lead_id和lead_type获得决策返回值
     * Summary: 实时决策接口，可传入lead_id和lead_type获得决策返回值</p>
     */
    public QueryAntchainAtoInnerLeadprefilterResponse queryAntchainAtoInnerLeadprefilterEx(QueryAntchainAtoInnerLeadprefilterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.leadprefilter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerLeadprefilterResponse());
    }
}
