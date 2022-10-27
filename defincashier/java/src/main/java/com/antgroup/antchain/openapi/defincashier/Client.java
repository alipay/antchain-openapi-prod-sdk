// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.defincashier.models.*;
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
                    new TeaPair("sdk_version", "1.0.5"),
                    new TeaPair("_prod_code", "DEFINCASHIER"),
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
     * Description: 适用于创建交易后，查询交易详情。
     * Summary: B2B资金服务查询交易
     */
    public QuerySaasPaymentResponse querySaasPayment(QuerySaasPaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasPaymentEx(request, headers, runtime);
    }

    /**
     * Description: 适用于创建交易后，查询交易详情。
     * Summary: B2B资金服务查询交易
     */
    public QuerySaasPaymentResponse querySaasPaymentEx(QuerySaasPaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.payment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasPaymentResponse());
    }

    /**
     * Description: B2B支付场景，创建交易前检查
     * Summary: B2B资金服务交易前检查
     */
    public CheckSaasPaymentResponse checkSaasPayment(CheckSaasPaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSaasPaymentEx(request, headers, runtime);
    }

    /**
     * Description: B2B支付场景，创建交易前检查
     * Summary: B2B资金服务交易前检查
     */
    public CheckSaasPaymentResponse checkSaasPaymentEx(CheckSaasPaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.payment.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSaasPaymentResponse());
    }

    /**
     * Description: B2B支付场景，创建交易服务
     * Summary: B2B资金服务创建交易
     */
    public CreateSaasPaymentResponse createSaasPayment(CreateSaasPaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSaasPaymentEx(request, headers, runtime);
    }

    /**
     * Description: B2B支付场景，创建交易服务
     * Summary: B2B资金服务创建交易
     */
    public CreateSaasPaymentResponse createSaasPaymentEx(CreateSaasPaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.payment.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSaasPaymentResponse());
    }

    /**
     * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
     * Summary: B2B资金服务交易撤销
     */
    public CancelSaasPaymentResponse cancelSaasPayment(CancelSaasPaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSaasPaymentEx(request, headers, runtime);
    }

    /**
     * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
     * Summary: B2B资金服务交易撤销
     */
    public CancelSaasPaymentResponse cancelSaasPaymentEx(CancelSaasPaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.payment.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSaasPaymentResponse());
    }

    /**
     * Description: 用于外部业务平台会员查询已绑定账号
     * Summary: B2B资金服务账号查询
     */
    public QuerySaasAccountResponse querySaasAccount(QuerySaasAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasAccountEx(request, headers, runtime);
    }

    /**
     * Description: 用于外部业务平台会员查询已绑定账号
     * Summary: B2B资金服务账号查询
     */
    public QuerySaasAccountResponse querySaasAccountEx(QuerySaasAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasAccountResponse());
    }

    /**
     * Description: 可以根据流水号查询请款，退款等资金操作明细
     * Summary: B2B资金服务交易资金操作明细查询
     */
    public QuerySaasFunditemResponse querySaasFunditem(QuerySaasFunditemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasFunditemEx(request, headers, runtime);
    }

    /**
     * Description: 可以根据流水号查询请款，退款等资金操作明细
     * Summary: B2B资金服务交易资金操作明细查询
     */
    public QuerySaasFunditemResponse querySaasFunditemEx(QuerySaasFunditemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.funditem.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasFunditemResponse());
    }

    /**
     * Description: 查询会员的产品签约协议
     * Summary: B2B资金服务签约查询
     */
    public QuerySaasAgreementResponse querySaasAgreement(QuerySaasAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 查询会员的产品签约协议
     * Summary: B2B资金服务签约查询
     */
    public QuerySaasAgreementResponse querySaasAgreementEx(QuerySaasAgreementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.agreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasAgreementResponse());
    }

    /**
     * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
     * Summary: B2B资金服务交易请款
     */
    public CaptureSaasPaymentResponse captureSaasPayment(CaptureSaasPaymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.captureSaasPaymentEx(request, headers, runtime);
    }

    /**
     * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
     * Summary: B2B资金服务交易请款
     */
    public CaptureSaasPaymentResponse captureSaasPaymentEx(CaptureSaasPaymentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.payment.capture", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CaptureSaasPaymentResponse());
    }

    /**
     * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
     * Summary: B2B资金服务机构信息查询
     */
    public QuerySaasInstResponse querySaasInst(QuerySaasInstRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasInstEx(request, headers, runtime);
    }

    /**
     * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
     * Summary: B2B资金服务机构信息查询
     */
    public QuerySaasInstResponse querySaasInstEx(QuerySaasInstRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.defincashier.saas.inst.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasInstResponse());
    }
}
