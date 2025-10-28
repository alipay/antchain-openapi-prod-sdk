// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.insurance_saas.models.*;

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
                    new TeaPair("sdk_version", "1.10.2"),
                    new TeaPair("_prod_code", "INSURANCE_SAAS"),
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
     * <p>Description: 保险询报价结果查询
     * Summary: 保险询报价结果查询</p>
     */
    public QueryInquiryResponse queryInquiry(QueryInquiryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInquiryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险询报价结果查询
     * Summary: 保险询报价结果查询</p>
     */
    public QueryInquiryResponse queryInquiryEx(QueryInquiryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.inquiry.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInquiryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险产品询价
     * Summary: 保险产品询价</p>
     */
    public SubmitInquiryResponse submitInquiry(SubmitInquiryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInquiryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险产品询价
     * Summary: 保险产品询价</p>
     */
    public SubmitInquiryResponse submitInquiryEx(SubmitInquiryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.inquiry.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInquiryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 历史灾害查询
     * Summary: 历史灾害数据查询</p>
     */
    public QueryDataDisasterResponse queryDataDisaster(QueryDataDisasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataDisasterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 历史灾害查询
     * Summary: 历史灾害数据查询</p>
     */
    public QueryDataDisasterResponse queryDataDisasterEx(QueryDataDisasterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.data.disaster.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataDisasterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时天气预警
     * Summary: 实时天气预警</p>
     */
    public QueryDataWeatherResponse queryDataWeather(QueryDataWeatherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataWeatherEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时天气预警
     * Summary: 实时天气预警</p>
     */
    public QueryDataWeatherResponse queryDataWeatherEx(QueryDataWeatherRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.data.weather.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataWeatherResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 报价接口同步接口
     * Summary: 报价接口同步接口</p>
     */
    public SyncQuoteResponse syncQuote(SyncQuoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncQuoteEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 报价接口同步接口
     * Summary: 报价接口同步接口</p>
     */
    public SyncQuoteResponse syncQuoteEx(SyncQuoteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.quote.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncQuoteResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 承保自核申请接口
     * Summary: 承保自核申请接口</p>
     */
    public ApplyUnderwritingResponse applyUnderwriting(ApplyUnderwritingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUnderwritingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 承保自核申请接口
     * Summary: 承保自核申请接口</p>
     */
    public ApplyUnderwritingResponse applyUnderwritingEx(ApplyUnderwritingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.underwriting.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUnderwritingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 承保自核结果查询接口
     * Summary: 承保自核结果查询接口</p>
     */
    public QueryUnderwritingResponse queryUnderwriting(QueryUnderwritingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnderwritingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 承保自核结果查询接口
     * Summary: 承保自核结果查询接口</p>
     */
    public QueryUnderwritingResponse queryUnderwritingEx(QueryUnderwritingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.underwriting.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnderwritingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
     * Summary: 保险科技保单附件查询接口</p>
     */
    public QueryPolicyFileResponse queryPolicyFile(QueryPolicyFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPolicyFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
     * Summary: 保险科技保单附件查询接口</p>
     */
    public QueryPolicyFileResponse queryPolicyFileEx(QueryPolicyFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.policy.file.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPolicyFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险SaaS投保申请接口
     * Summary: 投保申请接口</p>
     */
    public ApplyInsureResponse applyInsure(ApplyInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险SaaS投保申请接口
     * Summary: 投保申请接口</p>
     */
    public ApplyInsureResponse applyInsureEx(ApplyInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.insure.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保单结果同步，注意：基于投保信息的保单结果同步。
     * Summary: 保单结果同步（依赖投保申请）</p>
     */
    public NotifyPolicyResultResponse notifyPolicyResult(NotifyPolicyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyPolicyResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保单结果同步，注意：基于投保信息的保单结果同步。
     * Summary: 保单结果同步（依赖投保申请）</p>
     */
    public NotifyPolicyResultResponse notifyPolicyResultEx(NotifyPolicyResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.policy.result.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyPolicyResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 报案接口
     * Summary: 保险科技 报案接口</p>
     */
    public ApplyClaimResponse applyClaim(ApplyClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyClaimEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 报案接口
     * Summary: 保险科技 报案接口</p>
     */
    public ApplyClaimResponse applyClaimEx(ApplyClaimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.claim.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyClaimResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 报案撤销（场景端）
     * Summary: 报案撤销（场景端）</p>
     */
    public CancelClaimResponse cancelClaim(CancelClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelClaimEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 报案撤销（场景端）
     * Summary: 报案撤销（场景端）</p>
     */
    public CancelClaimResponse cancelClaimEx(CancelClaimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.claim.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelClaimResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 报案材料更新（场景端）
     * Summary: 报案材料更新（场景端）</p>
     */
    public UpdateClaimMaterialResponse updateClaimMaterial(UpdateClaimMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateClaimMaterialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 报案材料更新（场景端）
     * Summary: 报案材料更新（场景端）</p>
     */
    public UpdateClaimMaterialResponse updateClaimMaterialEx(UpdateClaimMaterialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.claim.material.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateClaimMaterialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 理赔结果确认（场景端）
     * Summary: 理赔结果确认（场景端）</p>
     */
    public ConfirmClaimSettleResponse confirmClaimSettle(ConfirmClaimSettleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmClaimSettleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 理赔结果确认（场景端）
     * Summary: 理赔结果确认（场景端）</p>
     */
    public ConfirmClaimSettleResponse confirmClaimSettleEx(ConfirmClaimSettleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.claim.settle.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmClaimSettleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 理赔结案通知（保司端）
     * Summary: 理赔结案通知（保司端）</p>
     */
    public FinishClaimSettleResponse finishClaimSettle(FinishClaimSettleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishClaimSettleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 理赔结案通知（保司端）
     * Summary: 理赔结案通知（保司端）</p>
     */
    public FinishClaimSettleResponse finishClaimSettleEx(FinishClaimSettleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.claim.settle.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishClaimSettleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险批改自核接口
     * Summary: 保险批改自核接口</p>
     */
    public ApplyEndorsementStrategyResponse applyEndorsementStrategy(ApplyEndorsementStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyEndorsementStrategyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险批改自核接口
     * Summary: 保险批改自核接口</p>
     */
    public ApplyEndorsementStrategyResponse applyEndorsementStrategyEx(ApplyEndorsementStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.endorsement.strategy.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyEndorsementStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保单信息离线同步
     * Summary: 保单信息离线同步</p>
     */
    public SyncPolicyResultResponse syncPolicyResult(SyncPolicyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncPolicyResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保单信息离线同步
     * Summary: 保单信息离线同步</p>
     */
    public SyncPolicyResultResponse syncPolicyResultEx(SyncPolicyResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.policy.result.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncPolicyResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于通知单号查询保险投保结果
     * Summary: 保险投保结果查询</p>
     */
    public QueryInsureResultResponse queryInsureResult(QueryInsureResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInsureResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于通知单号查询保险投保结果
     * Summary: 保险投保结果查询</p>
     */
    public QueryInsureResultResponse queryInsureResultEx(QueryInsureResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.insure.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInsureResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 投保测试接口
     * Summary: 投保测试接口</p>
     */
    public ApplyInsureTestResponse applyInsureTest(ApplyInsureTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsureTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 投保测试接口
     * Summary: 投保测试接口</p>
     */
    public ApplyInsureTestResponse applyInsureTestEx(ApplyInsureTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.insure.test.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsureTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口用于调查报案数据的提交
     * Summary: 调查报案提交接口</p>
     */
    public SubmitInvestigateCaseResponse submitInvestigateCase(SubmitInvestigateCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInvestigateCaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口用于调查报案数据的提交
     * Summary: 调查报案提交接口</p>
     */
    public SubmitInvestigateCaseResponse submitInvestigateCaseEx(SubmitInvestigateCaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.investigate.case.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInvestigateCaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 回销结果查询接口
     * Summary: 回销结果查询接口</p>
     */
    public QueryReverseCommissionResponse queryReverseCommission(QueryReverseCommissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryReverseCommissionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 回销结果查询接口
     * Summary: 回销结果查询接口</p>
     */
    public QueryReverseCommissionResponse queryReverseCommissionEx(QueryReverseCommissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.reverse.commission.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryReverseCommissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 嵌入式保险服务卡片url链接获取
     * Summary: 嵌入式保险服务卡片url链接获取</p>
     */
    public GetEmbedcardUrlResponse getEmbedcardUrl(GetEmbedcardUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmbedcardUrlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 嵌入式保险服务卡片url链接获取
     * Summary: 嵌入式保险服务卡片url链接获取</p>
     */
    public GetEmbedcardUrlResponse getEmbedcardUrlEx(GetEmbedcardUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.embedcard.url.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetEmbedcardUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 嵌入式保险服务打款成功出单接口
     * Summary: 嵌入式保险服务打款成功出单接口</p>
     */
    public IssueEmbedcardPaysucResponse issueEmbedcardPaysuc(IssueEmbedcardPaysucRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.issueEmbedcardPaysucEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 嵌入式保险服务打款成功出单接口
     * Summary: 嵌入式保险服务打款成功出单接口</p>
     */
    public IssueEmbedcardPaysucResponse issueEmbedcardPaysucEx(IssueEmbedcardPaysucRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.embedcard.paysuc.issue", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IssueEmbedcardPaysucResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 嵌入式主机厂车险url链接获取
     * Summary: 嵌入式主机厂车险url链接获取</p>
     */
    public GetEmbedoemautoinsuranceUrlResponse getEmbedoemautoinsuranceUrl(GetEmbedoemautoinsuranceUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmbedoemautoinsuranceUrlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 嵌入式主机厂车险url链接获取
     * Summary: 嵌入式主机厂车险url链接获取</p>
     */
    public GetEmbedoemautoinsuranceUrlResponse getEmbedoemautoinsuranceUrlEx(GetEmbedoemautoinsuranceUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.embedoemautoinsurance.url.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetEmbedoemautoinsuranceUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方获取权益链接 
     * Summary: 场景方获取权益链接</p>
     */
    public GetRightplatformUrlResponse getRightplatformUrl(GetRightplatformUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRightplatformUrlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方获取权益链接 
     * Summary: 场景方获取权益链接</p>
     */
    public GetRightplatformUrlResponse getRightplatformUrlEx(GetRightplatformUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.rightplatform.url.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRightplatformUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新申请额度状态&amp;投保人信息
     * Summary: 更新申请额度状态&amp;投保人信息</p>
     */
    public UpdateRightplatformApplyinfoResponse updateRightplatformApplyinfo(UpdateRightplatformApplyinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRightplatformApplyinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新申请额度状态&amp;投保人信息
     * Summary: 更新申请额度状态&amp;投保人信息</p>
     */
    public UpdateRightplatformApplyinfoResponse updateRightplatformApplyinfoEx(UpdateRightplatformApplyinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.rightplatform.applyinfo.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRightplatformApplyinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方标的信息通知
     * Summary: 场景方标的信息通知</p>
     */
    public NotifyInterestScenesubjectResponse notifyInterestScenesubject(NotifyInterestScenesubjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyInterestScenesubjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方标的信息通知
     * Summary: 场景方标的信息通知</p>
     */
    public NotifyInterestScenesubjectResponse notifyInterestScenesubjectEx(NotifyInterestScenesubjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.interest.scenesubject.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyInterestScenesubjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 权益服务商标的信息查询
     * Summary: 权益服务商标的信息查询</p>
     */
    public QueryInterestSuppliersubjectResponse queryInterestSuppliersubject(QueryInterestSuppliersubjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInterestSuppliersubjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 权益服务商标的信息查询
     * Summary: 权益服务商标的信息查询</p>
     */
    public QueryInterestSuppliersubjectResponse queryInterestSuppliersubjectEx(QueryInterestSuppliersubjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.interest.suppliersubject.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInterestSuppliersubjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 权益服务商投保后通知保单信息
     * Summary: 权益服务商投保后通知保单信息</p>
     */
    public NotifyInterestSupplierpolicyResponse notifyInterestSupplierpolicy(NotifyInterestSupplierpolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyInterestSupplierpolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 权益服务商投保后通知保单信息
     * Summary: 权益服务商投保后通知保单信息</p>
     */
    public NotifyInterestSupplierpolicyResponse notifyInterestSupplierpolicyEx(NotifyInterestSupplierpolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.interest.supplierpolicy.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyInterestSupplierpolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方获取权益链接
     * Summary: 场景方获取权益链接</p>
     */
    public GetInterestUrlResponse getInterestUrl(GetInterestUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInterestUrlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方获取权益链接
     * Summary: 场景方获取权益链接</p>
     */
    public GetInterestUrlResponse getInterestUrlEx(GetInterestUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.interest.url.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInterestUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方订单信息查询
     * Summary: 场景方订单信息查询</p>
     */
    public QueryInterestSceneorderResponse queryInterestSceneorder(QueryInterestSceneorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInterestSceneorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 场景方订单信息查询
     * Summary: 场景方订单信息查询</p>
     */
    public QueryInterestSceneorderResponse queryInterestSceneorderEx(QueryInterestSceneorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.interest.sceneorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInterestSceneorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 权益服务商订单状态通知
     * Summary: 权益服务商订单状态通知</p>
     */
    public NotifyInterestSupplierorderResponse notifyInterestSupplierorder(NotifyInterestSupplierorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyInterestSupplierorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 权益服务商订单状态通知
     * Summary: 权益服务商订单状态通知</p>
     */
    public NotifyInterestSupplierorderResponse notifyInterestSupplierorderEx(NotifyInterestSupplierorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.insurance.interest.supplierorder.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyInterestSupplierorderResponse());
    }
}
