// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.dubhe.models.*;

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
                    new TeaPair("sdk_version", "1.0.3"),
                    new TeaPair("_prod_code", "DUBHE"),
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
     * <p>Description: 资金路由接口，获取资金方编号
     * Summary: 资金路由接口，获取资金方编号</p>
     */
    public QueryRiskplusDubbridgeRouterFundrouterResponse queryRiskplusDubbridgeRouterFundrouter(QueryRiskplusDubbridgeRouterFundrouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeRouterFundrouterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资金路由接口，获取资金方编号
     * Summary: 资金路由接口，获取资金方编号</p>
     */
    public QueryRiskplusDubbridgeRouterFundrouterResponse queryRiskplusDubbridgeRouterFundrouterEx(QueryRiskplusDubbridgeRouterFundrouterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeRouterFundrouterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口</p>
     */
    public ApplyRiskplusDubbridgeCreditResponse applyRiskplusDubbridgeCredit(ApplyRiskplusDubbridgeCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgeCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口</p>
     */
    public ApplyRiskplusDubbridgeCreditResponse applyRiskplusDubbridgeCreditEx(ApplyRiskplusDubbridgeCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.credit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgeCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口</p>
     */
    public ApplyRiskplusDubbridgeUsecreditResponse applyRiskplusDubbridgeUsecredit(ApplyRiskplusDubbridgeUsecreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgeUsecreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口</p>
     */
    public ApplyRiskplusDubbridgeUsecreditResponse applyRiskplusDubbridgeUsecreditEx(ApplyRiskplusDubbridgeUsecreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.usecredit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgeUsecreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询，返回用信详情及还款计划</p>
     */
    public QueryRiskplusDubbridgeUsecreditStatusResponse queryRiskplusDubbridgeUsecreditStatus(QueryRiskplusDubbridgeUsecreditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeUsecreditStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询，返回用信详情及还款计划</p>
     */
    public QueryRiskplusDubbridgeUsecreditStatusResponse queryRiskplusDubbridgeUsecreditStatusEx(QueryRiskplusDubbridgeUsecreditStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.usecredit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeUsecreditStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统预览协议查询接口
     * Summary: 天枢系统预览协议查询接口</p>
     */
    public QueryRiskplusDubbridgeAgreementPreviewResponse queryRiskplusDubbridgeAgreementPreview(QueryRiskplusDubbridgeAgreementPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeAgreementPreviewEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统预览协议查询接口
     * Summary: 天枢系统预览协议查询接口</p>
     */
    public QueryRiskplusDubbridgeAgreementPreviewResponse queryRiskplusDubbridgeAgreementPreviewEx(QueryRiskplusDubbridgeAgreementPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.agreement.preview.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeAgreementPreviewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口-分期付
     * Summary: 天枢系统授信额度查询接口-分期付</p>
     */
    public QueryRiskplusDubbridgeInstallmentCreditamtResponse queryRiskplusDubbridgeInstallmentCreditamt(QueryRiskplusDubbridgeInstallmentCreditamtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeInstallmentCreditamtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口-分期付
     * Summary: 天枢系统授信额度查询接口-分期付</p>
     */
    public QueryRiskplusDubbridgeInstallmentCreditamtResponse queryRiskplusDubbridgeInstallmentCreditamtEx(QueryRiskplusDubbridgeInstallmentCreditamtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.installment.creditamt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeInstallmentCreditamtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统取消分期付订单-分期付
     * Summary: 天枢系统取消分期付订单-分期付</p>
     */
    public CancelRiskplusDubbridgeInstallmentOrderResponse cancelRiskplusDubbridgeInstallmentOrder(CancelRiskplusDubbridgeInstallmentOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelRiskplusDubbridgeInstallmentOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统取消分期付订单-分期付
     * Summary: 天枢系统取消分期付订单-分期付</p>
     */
    public CancelRiskplusDubbridgeInstallmentOrderResponse cancelRiskplusDubbridgeInstallmentOrderEx(CancelRiskplusDubbridgeInstallmentOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.installment.order.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelRiskplusDubbridgeInstallmentOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统支用后补充材料推送-分期付
     * Summary: 天枢系统支用后补充材料推送-分期付</p>
     */
    public PushRiskplusDubbridgeInstallmentSupplementResponse pushRiskplusDubbridgeInstallmentSupplement(PushRiskplusDubbridgeInstallmentSupplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRiskplusDubbridgeInstallmentSupplementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统支用后补充材料推送-分期付
     * Summary: 天枢系统支用后补充材料推送-分期付</p>
     */
    public PushRiskplusDubbridgeInstallmentSupplementResponse pushRiskplusDubbridgeInstallmentSupplementEx(PushRiskplusDubbridgeInstallmentSupplementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.installment.supplement.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRiskplusDubbridgeInstallmentSupplementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻图片上传-分期付
     * Summary: 天枢系统二级商户入驻图片上传-分期付</p>
     */
    public UploadRiskplusDubbridgeAlipayImageResponse uploadRiskplusDubbridgeAlipayImage(UploadRiskplusDubbridgeAlipayImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadRiskplusDubbridgeAlipayImageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻图片上传-分期付
     * Summary: 天枢系统二级商户入驻图片上传-分期付</p>
     */
    public UploadRiskplusDubbridgeAlipayImageResponse uploadRiskplusDubbridgeAlipayImageEx(UploadRiskplusDubbridgeAlipayImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.image.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadRiskplusDubbridgeAlipayImageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢电商场景下授信申请接口
     * Summary: 天枢电商场景下授信申请接口</p>
     */
    public ApplyRiskplusDubbridgeEccreditResponse applyRiskplusDubbridgeEccredit(ApplyRiskplusDubbridgeEccreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgeEccreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢电商场景下授信申请接口
     * Summary: 天枢电商场景下授信申请接口</p>
     */
    public ApplyRiskplusDubbridgeEccreditResponse applyRiskplusDubbridgeEccreditEx(ApplyRiskplusDubbridgeEccreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.eccredit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgeEccreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢电商场景支用申请
     * Summary: 天枢电商场景支用申请</p>
     */
    public ApplyRiskplusDubbridgeEcloanResponse applyRiskplusDubbridgeEcloan(ApplyRiskplusDubbridgeEcloanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgeEcloanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢电商场景支用申请
     * Summary: 天枢电商场景支用申请</p>
     */
    public ApplyRiskplusDubbridgeEcloanResponse applyRiskplusDubbridgeEcloanEx(ApplyRiskplusDubbridgeEcloanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.ecloan.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgeEcloanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用前查询授信额度
     * Summary: 支用前查询授信额度</p>
     */
    public QueryRiskplusDubbridgeEccreditQuotaResponse queryRiskplusDubbridgeEccreditQuota(QueryRiskplusDubbridgeEccreditQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeEccreditQuotaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用前查询授信额度
     * Summary: 支用前查询授信额度</p>
     */
    public QueryRiskplusDubbridgeEccreditQuotaResponse queryRiskplusDubbridgeEccreditQuotaEx(QueryRiskplusDubbridgeEccreditQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.eccredit.quota.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeEccreditQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用结果查询接口
     * Summary: 支用结果查询接口</p>
     */
    public QueryRiskplusDubbridgeEcloanResponse queryRiskplusDubbridgeEcloan(QueryRiskplusDubbridgeEcloanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeEcloanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用结果查询接口
     * Summary: 支用结果查询接口</p>
     */
    public QueryRiskplusDubbridgeEcloanResponse queryRiskplusDubbridgeEcloanEx(QueryRiskplusDubbridgeEcloanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.ecloan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeEcloanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用后，还款前试算
     * Summary: 支用后，还款前试算</p>
     */
    public CountRiskplusDubbridgeEcrepayTrialResponse countRiskplusDubbridgeEcrepayTrial(CountRiskplusDubbridgeEcrepayTrialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countRiskplusDubbridgeEcrepayTrialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用后，还款前试算
     * Summary: 支用后，还款前试算</p>
     */
    public CountRiskplusDubbridgeEcrepayTrialResponse countRiskplusDubbridgeEcrepayTrialEx(CountRiskplusDubbridgeEcrepayTrialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.ecrepay.trial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountRiskplusDubbridgeEcrepayTrialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用后 查询还款明细
     * Summary: 支用后 查询还款明细</p>
     */
    public QueryRiskplusDubbridgeEcrepayResponse queryRiskplusDubbridgeEcrepay(QueryRiskplusDubbridgeEcrepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeEcrepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用后 查询还款明细
     * Summary: 支用后 查询还款明细</p>
     */
    public QueryRiskplusDubbridgeEcrepayResponse queryRiskplusDubbridgeEcrepayEx(QueryRiskplusDubbridgeEcrepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.ecrepay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeEcrepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用后 查询借据
     * Summary: 支用后 查询借据</p>
     */
    public DetailRiskplusDubbridgeEcloanResponse detailRiskplusDubbridgeEcloan(DetailRiskplusDubbridgeEcloanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailRiskplusDubbridgeEcloanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支用后 查询借据
     * Summary: 支用后 查询借据</p>
     */
    public DetailRiskplusDubbridgeEcloanResponse detailRiskplusDubbridgeEcloanEx(DetailRiskplusDubbridgeEcloanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.ecloan.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailRiskplusDubbridgeEcloanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 授信结果查询
     * Summary: 授信结果查询</p>
     */
    public QueryRiskplusDubbridgeEccreditResponse queryRiskplusDubbridgeEccredit(QueryRiskplusDubbridgeEccreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeEccreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 授信结果查询
     * Summary: 授信结果查询</p>
     */
    public QueryRiskplusDubbridgeEccreditResponse queryRiskplusDubbridgeEccreditEx(QueryRiskplusDubbridgeEccreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.eccredit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeEccreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 补充授信申请风险数据
     * Summary: 补充授信申请风险数据</p>
     */
    public FillRiskplusDubbridgeEccreditResponse fillRiskplusDubbridgeEccredit(FillRiskplusDubbridgeEccreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fillRiskplusDubbridgeEccreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 补充授信申请风险数据
     * Summary: 补充授信申请风险数据</p>
     */
    public FillRiskplusDubbridgeEccreditResponse fillRiskplusDubbridgeEccreditEx(FillRiskplusDubbridgeEccreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.eccredit.fill", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FillRiskplusDubbridgeEccreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取链接接口
     * Summary: 获取链接接口</p>
     */
    public QueryRiskplusDubbridgeEccreditSkipurlResponse queryRiskplusDubbridgeEccreditSkipurl(QueryRiskplusDubbridgeEccreditSkipurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeEccreditSkipurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取链接接口
     * Summary: 获取链接接口</p>
     */
    public QueryRiskplusDubbridgeEccreditSkipurlResponse queryRiskplusDubbridgeEccreditSkipurlEx(QueryRiskplusDubbridgeEccreditSkipurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.eccredit.skipurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeEccreditSkipurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢-乐书-贷后异常监控
     * Summary: 天枢-乐书-贷后异常监控</p>
     */
    public SyncRiskplusDubbridgeEcmonitorResponse syncRiskplusDubbridgeEcmonitor(SyncRiskplusDubbridgeEcmonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRiskplusDubbridgeEcmonitorEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢-乐书-贷后异常监控
     * Summary: 天枢-乐书-贷后异常监控</p>
     */
    public SyncRiskplusDubbridgeEcmonitorResponse syncRiskplusDubbridgeEcmonitorEx(SyncRiskplusDubbridgeEcmonitorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.ecmonitor.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRiskplusDubbridgeEcmonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户解约额度信息查询
     * Summary: 用户解约额度信息查询</p>
     */
    public QueryRiskplusDubbridgePetitemResponse queryRiskplusDubbridgePetitem(QueryRiskplusDubbridgePetitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgePetitemEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户解约额度信息查询
     * Summary: 用户解约额度信息查询</p>
     */
    public QueryRiskplusDubbridgePetitemResponse queryRiskplusDubbridgePetitemEx(QueryRiskplusDubbridgePetitemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petitem.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgePetitemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户解约
     * Summary: 用户解约</p>
     */
    public ExecRiskplusDubbridgePetitemResponse execRiskplusDubbridgePetitem(ExecRiskplusDubbridgePetitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRiskplusDubbridgePetitemEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户解约
     * Summary: 用户解约</p>
     */
    public ExecRiskplusDubbridgePetitemResponse execRiskplusDubbridgePetitemEx(ExecRiskplusDubbridgePetitemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petitem.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRiskplusDubbridgePetitemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户资金分账
     * Summary: 用户资金分账</p>
     */
    public PushRiskplusDubbridgePetitemResponse pushRiskplusDubbridgePetitem(PushRiskplusDubbridgePetitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRiskplusDubbridgePetitemEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户资金分账
     * Summary: 用户资金分账</p>
     */
    public PushRiskplusDubbridgePetitemResponse pushRiskplusDubbridgePetitemEx(PushRiskplusDubbridgePetitemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petitem.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRiskplusDubbridgePetitemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户逾期退款
     * Summary: 用户逾期退款</p>
     */
    public RefuseRiskplusDubbridgePetitemResponse refuseRiskplusDubbridgePetitem(RefuseRiskplusDubbridgePetitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseRiskplusDubbridgePetitemEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户逾期退款
     * Summary: 用户逾期退款</p>
     */
    public RefuseRiskplusDubbridgePetitemResponse refuseRiskplusDubbridgePetitemEx(RefuseRiskplusDubbridgePetitemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petitem.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseRiskplusDubbridgePetitemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署结果同步推送
     * Summary: 电子合同签署结果同步推送</p>
     */
    public PushRiskplusDubbridgeContractsignResponse pushRiskplusDubbridgeContractsign(PushRiskplusDubbridgeContractsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRiskplusDubbridgeContractsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署结果同步推送
     * Summary: 电子合同签署结果同步推送</p>
     */
    public PushRiskplusDubbridgeContractsignResponse pushRiskplusDubbridgeContractsignEx(PushRiskplusDubbridgeContractsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.contractsign.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRiskplusDubbridgeContractsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 聚合收银台申请
     * Summary: 聚合收银台申请</p>
     */
    public ApplyRiskplusDubbridgePetcashierResponse applyRiskplusDubbridgePetcashier(ApplyRiskplusDubbridgePetcashierRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgePetcashierEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 聚合收银台申请
     * Summary: 聚合收银台申请</p>
     */
    public ApplyRiskplusDubbridgePetcashierResponse applyRiskplusDubbridgePetcashierEx(ApplyRiskplusDubbridgePetcashierRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petcashier.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgePetcashierResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 交易订单查询
     * Summary: 交易订单查询</p>
     */
    public QueryRiskplusDubbridgePetorderResponse queryRiskplusDubbridgePetorder(QueryRiskplusDubbridgePetorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgePetorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 交易订单查询
     * Summary: 交易订单查询</p>
     */
    public QueryRiskplusDubbridgePetorderResponse queryRiskplusDubbridgePetorderEx(QueryRiskplusDubbridgePetorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgePetorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户信息补充并同步至下游资金方
     * Summary: 用户信息补充并同步至下游资金方</p>
     */
    public SyncRiskplusDubbridgeCustomResponse syncRiskplusDubbridgeCustom(SyncRiskplusDubbridgeCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRiskplusDubbridgeCustomEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户信息补充并同步至下游资金方
     * Summary: 用户信息补充并同步至下游资金方</p>
     */
    public SyncRiskplusDubbridgeCustomResponse syncRiskplusDubbridgeCustomEx(SyncRiskplusDubbridgeCustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.custom.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRiskplusDubbridgeCustomResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻风控结果查询
     * Summary: 商户入驻风控结果查询</p>
     */
    public QueryRiskplusDubbridgeMerchantriskResponse queryRiskplusDubbridgeMerchantrisk(QueryRiskplusDubbridgeMerchantriskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeMerchantriskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻风控结果查询
     * Summary: 商户入驻风控结果查询</p>
     */
    public QueryRiskplusDubbridgeMerchantriskResponse queryRiskplusDubbridgeMerchantriskEx(QueryRiskplusDubbridgeMerchantriskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.merchantrisk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeMerchantriskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 聚合收银台申请
     * Summary: 聚合收银台申请</p>
     */
    public ApplyRiskplusDubbridgePetcashierGeneralResponse applyRiskplusDubbridgePetcashierGeneral(ApplyRiskplusDubbridgePetcashierGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgePetcashierGeneralEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 聚合收银台申请
     * Summary: 聚合收银台申请</p>
     */
    public ApplyRiskplusDubbridgePetcashierGeneralResponse applyRiskplusDubbridgePetcashierGeneralEx(ApplyRiskplusDubbridgePetcashierGeneralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petcashier.general.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgePetcashierGeneralResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 余额查询
     * Summary: 余额查询</p>
     */
    public QueryRiskplusDubbridgePetFundResponse queryRiskplusDubbridgePetFund(QueryRiskplusDubbridgePetFundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgePetFundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 余额查询
     * Summary: 余额查询</p>
     */
    public QueryRiskplusDubbridgePetFundResponse queryRiskplusDubbridgePetFundEx(QueryRiskplusDubbridgePetFundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.pet.fund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgePetFundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商城创建储值卡消费订单（纯储值卡余额支付）
     * Summary: 商城创建储值卡消费订单（纯储值卡余额支付）</p>
     */
    public CreateRiskplusDubbridgePetmallorderResponse createRiskplusDubbridgePetmallorder(CreateRiskplusDubbridgePetmallorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRiskplusDubbridgePetmallorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商城创建储值卡消费订单（纯储值卡余额支付）
     * Summary: 商城创建储值卡消费订单（纯储值卡余额支付）</p>
     */
    public CreateRiskplusDubbridgePetmallorderResponse createRiskplusDubbridgePetmallorderEx(CreateRiskplusDubbridgePetmallorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petmallorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRiskplusDubbridgePetmallorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商城订单状态更新
     * Summary: 商城订单状态更新</p>
     */
    public UpdateRiskplusDubbridgePetmallorderResponse updateRiskplusDubbridgePetmallorder(UpdateRiskplusDubbridgePetmallorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRiskplusDubbridgePetmallorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商城订单状态更新
     * Summary: 商城订单状态更新</p>
     */
    public UpdateRiskplusDubbridgePetmallorderResponse updateRiskplusDubbridgePetmallorderEx(UpdateRiskplusDubbridgePetmallorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petmallorder.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateRiskplusDubbridgePetmallorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款申请
     * Summary: 退款申请</p>
     */
    public ApplyRiskplusDubbridgePetrefundResponse applyRiskplusDubbridgePetrefund(ApplyRiskplusDubbridgePetrefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgePetrefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款申请
     * Summary: 退款申请</p>
     */
    public ApplyRiskplusDubbridgePetrefundResponse applyRiskplusDubbridgePetrefundEx(ApplyRiskplusDubbridgePetrefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petrefund.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgePetrefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款结果查询
     * Summary: 退款结果查询</p>
     */
    public QueryRiskplusDubbridgePetrefundResponse queryRiskplusDubbridgePetrefund(QueryRiskplusDubbridgePetrefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgePetrefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款结果查询
     * Summary: 退款结果查询</p>
     */
    public QueryRiskplusDubbridgePetrefundResponse queryRiskplusDubbridgePetrefundEx(QueryRiskplusDubbridgePetrefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petrefund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgePetrefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账提交，接口支持幂等
     * Summary: 分账提交，接口支持幂等</p>
     */
    public ApplyRiskplusDubbridgePetmallorderTransferResponse applyRiskplusDubbridgePetmallorderTransfer(ApplyRiskplusDubbridgePetmallorderTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRiskplusDubbridgePetmallorderTransferEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账提交，接口支持幂等
     * Summary: 分账提交，接口支持幂等</p>
     */
    public ApplyRiskplusDubbridgePetmallorderTransferResponse applyRiskplusDubbridgePetmallorderTransferEx(ApplyRiskplusDubbridgePetmallorderTransferRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.petmallorder.transfer.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRiskplusDubbridgePetmallorderTransferResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 跳端地址获取
     * Summary: 跳端地址获取</p>
     */
    public GetRiskplusDubbridgeJumpurlResponse getRiskplusDubbridgeJumpurl(GetRiskplusDubbridgeJumpurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRiskplusDubbridgeJumpurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 跳端地址获取
     * Summary: 跳端地址获取</p>
     */
    public GetRiskplusDubbridgeJumpurlResponse getRiskplusDubbridgeJumpurlEx(GetRiskplusDubbridgeJumpurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.jumpurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRiskplusDubbridgeJumpurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 跳端结果查询
     * Summary: 跳端结果查询</p>
     */
    public QueryRiskplusDubbridgeJumpresultResponse queryRiskplusDubbridgeJumpresult(QueryRiskplusDubbridgeJumpresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeJumpresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 跳端结果查询
     * Summary: 跳端结果查询</p>
     */
    public QueryRiskplusDubbridgeJumpresultResponse queryRiskplusDubbridgeJumpresultEx(QueryRiskplusDubbridgeJumpresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.jumpresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeJumpresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 账户流水查询接口(线下还款)
     * Summary: 账户流水查询接口(线下还款)</p>
     */
    public QueryRiskplusDubbridgeRepayofflineaccountResponse queryRiskplusDubbridgeRepayofflineaccount(QueryRiskplusDubbridgeRepayofflineaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskplusDubbridgeRepayofflineaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 账户流水查询接口(线下还款)
     * Summary: 账户流水查询接口(线下还款)</p>
     */
    public QueryRiskplusDubbridgeRepayofflineaccountResponse queryRiskplusDubbridgeRepayofflineaccountEx(QueryRiskplusDubbridgeRepayofflineaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repayofflineaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskplusDubbridgeRepayofflineaccountResponse());
    }
}
