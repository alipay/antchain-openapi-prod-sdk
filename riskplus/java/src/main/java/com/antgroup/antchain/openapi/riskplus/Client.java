// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.riskplus.models.*;

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
                    new TeaPair("sdk_version", "1.29.3"),
                    new TeaPair("_prod_code", "RISKPLUS"),
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
     * <p>Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
     * Summary: 权益流量业务支付签约相关通知</p>
     */
    public ReceiveBenefithubRiskPayResponse receiveBenefithubRiskPay(ReceiveBenefithubRiskPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveBenefithubRiskPayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
     * Summary: 权益流量业务支付签约相关通知</p>
     */
    public ReceiveBenefithubRiskPayResponse receiveBenefithubRiskPayEx(ReceiveBenefithubRiskPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.benefithub.risk.pay.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveBenefithubRiskPayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 渠道、平台方，联合登陆推送登陆通知信息
     * Summary: 渠道/平台方推送的用户登陆信息</p>
     */
    public NotifyBenefithubRiskLoginResponse notifyBenefithubRiskLogin(NotifyBenefithubRiskLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyBenefithubRiskLoginEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 渠道、平台方，联合登陆推送登陆通知信息
     * Summary: 渠道/平台方推送的用户登陆信息</p>
     */
    public NotifyBenefithubRiskLoginResponse notifyBenefithubRiskLoginEx(NotifyBenefithubRiskLoginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.benefithub.risk.login.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyBenefithubRiskLoginResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 奇富组件支付结果通知, 提供给驭鉴使用，用于接收从奇富支付成功的通知，发起订单创建
     * Summary: 奇富组件支付结果通知</p>
     */
    public NotifyBenefithubRiskPayunilateralResponse notifyBenefithubRiskPayunilateral(NotifyBenefithubRiskPayunilateralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyBenefithubRiskPayunilateralEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 奇富组件支付结果通知, 提供给驭鉴使用，用于接收从奇富支付成功的通知，发起订单创建
     * Summary: 奇富组件支付结果通知</p>
     */
    public NotifyBenefithubRiskPayunilateralResponse notifyBenefithubRiskPayunilateralEx(NotifyBenefithubRiskPayunilateralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.benefithub.risk.payunilateral.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyBenefithubRiskPayunilateralResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 渠道主动查询报告详情接口
     * Summary: 渠道查询报告详情</p>
     */
    public QueryBenefithubReportInformationResponse queryBenefithubReportInformation(QueryBenefithubReportInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBenefithubReportInformationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 渠道主动查询报告详情接口
     * Summary: 渠道查询报告详情</p>
     */
    public QueryBenefithubReportInformationResponse queryBenefithubReportInformationEx(QueryBenefithubReportInformationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.benefithub.report.information.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBenefithubReportInformationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 渠道查询报告有效期
     * Summary: 渠道查询报告有效期</p>
     */
    public QueryBenefithubReportEffectiveResponse queryBenefithubReportEffective(QueryBenefithubReportEffectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBenefithubReportEffectiveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 渠道查询报告有效期
     * Summary: 渠道查询报告有效期</p>
     */
    public QueryBenefithubReportEffectiveResponse queryBenefithubReportEffectiveEx(QueryBenefithubReportEffectiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.benefithub.report.effective.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBenefithubReportEffectiveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询</p>
     */
    public BatchqueryCreditshieldProductInfoResponse batchqueryCreditshieldProductInfo(BatchqueryCreditshieldProductInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryCreditshieldProductInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询</p>
     */
    public BatchqueryCreditshieldProductInfoResponse batchqueryCreditshieldProductInfoEx(BatchqueryCreditshieldProductInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.creditshield.product.info.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryCreditshieldProductInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信护盾amc机构回调通用接口
     * Summary: 信护盾amc机构回调通用接口</p>
     */
    public QueryCreditshieldProductCallbackResponse queryCreditshieldProductCallback(QueryCreditshieldProductCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditshieldProductCallbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信护盾amc机构回调通用接口
     * Summary: 信护盾amc机构回调通用接口</p>
     */
    public QueryCreditshieldProductCallbackResponse queryCreditshieldProductCallbackEx(QueryCreditshieldProductCallbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.creditshield.product.callback.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditshieldProductCallbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ivr函数计算调用
     * Summary: ivr函数计算调用</p>
     */
    public QueryCreditshieldProductIvrfcResponse queryCreditshieldProductIvrfc(QueryCreditshieldProductIvrfcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditshieldProductIvrfcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ivr函数计算调用
     * Summary: ivr函数计算调用</p>
     */
    public QueryCreditshieldProductIvrfcResponse queryCreditshieldProductIvrfcEx(QueryCreditshieldProductIvrfcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.creditshield.product.ivrfc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditshieldProductIvrfcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风控云风险咨询接口
     * Summary: 风控云风险咨询接口</p>
     */
    public QuerySecurityPolicyResponse querySecurityPolicy(QuerySecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风控云风险咨询接口
     * Summary: 风控云风险咨询接口</p>
     */
    public QuerySecurityPolicyResponse querySecurityPolicyEx(QuerySecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据</p>
     */
    public SendSecurityDataResponse sendSecurityData(SendSecurityDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendSecurityDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据</p>
     */
    public SendSecurityDataResponse sendSecurityDataEx(SendSecurityDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendSecurityDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出</p>
     */
    public ConfirmSecurityPolicyResponse confirmSecurityPolicy(ConfirmSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出</p>
     */
    public ConfirmSecurityPolicyResponse confirmSecurityPolicyEx(ConfirmSecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmSecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出</p>
     */
    public CheckSecurityRdsResponse checkSecurityRds(CheckSecurityRdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSecurityRdsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出</p>
     */
    public CheckSecurityRdsResponse checkSecurityRdsEx(CheckSecurityRdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.rds.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSecurityRdsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出</p>
     */
    public QuerySecurityDataResponse querySecurityData(QuerySecurityDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecurityDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出</p>
     */
    public QuerySecurityDataResponse querySecurityDataEx(QuerySecurityDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecurityDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验</p>
     */
    public CheckSecurityDataResponse checkSecurityData(CheckSecurityDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSecurityDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验</p>
     */
    public CheckSecurityDataResponse checkSecurityDataEx(CheckSecurityDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSecurityDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行</p>
     */
    public ExecSecurityRiskdataserviceResponse execSecurityRiskdataservice(ExecSecurityRiskdataserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execSecurityRiskdataserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行</p>
     */
    public ExecSecurityRiskdataserviceResponse execSecurityRiskdataserviceEx(ExecSecurityRiskdataserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.riskdataservice.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecSecurityRiskdataserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风控云SaaS租户调用接口
     * Summary: 风控云SaaS租户调用接口</p>
     */
    public QuerySaasSecurityPolicyResponse querySaasSecurityPolicy(QuerySaasSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风控云SaaS租户调用接口
     * Summary: 风控云SaaS租户调用接口</p>
     */
    public QuerySaasSecurityPolicyResponse querySaasSecurityPolicyEx(QuerySaasSecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.saas.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasSecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量决策
     * Summary: 批量决策查询</p>
     */
    public QueryBatchSecurityPolicyResponse queryBatchSecurityPolicy(QueryBatchSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBatchSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量决策
     * Summary: 批量决策查询</p>
     */
    public QueryBatchSecurityPolicyResponse queryBatchSecurityPolicyEx(QueryBatchSecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.batch.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBatchSecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询</p>
     */
    public QueryCreditshieldProductBatchResponse queryCreditshieldProductBatch(QueryCreditshieldProductBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditshieldProductBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询</p>
     */
    public QueryCreditshieldProductBatchResponse queryCreditshieldProductBatchEx(QueryCreditshieldProductBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.creditshield.product.batch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditshieldProductBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口</p>
     */
    public QueryDubheTestResponse queryDubheTest(QueryDubheTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口</p>
     */
    public QueryDubheTestResponse queryDubheTestEx(QueryDubheTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询</p>
     */
    public QueryDubheRouterFundrouterResponse queryDubheRouterFundrouter(QueryDubheRouterFundrouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheRouterFundrouterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询</p>
     */
    public QueryDubheRouterFundrouterResponse queryDubheRouterFundrouterEx(QueryDubheRouterFundrouterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheRouterFundrouterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口</p>
     */
    public ApplyDubheCreditResponse applyDubheCredit(ApplyDubheCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubheCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口</p>
     */
    public ApplyDubheCreditResponse applyDubheCreditEx(ApplyDubheCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.credit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubheCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口</p>
     */
    public QueryDubheCreditStatusResponse queryDubheCreditStatus(QueryDubheCreditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheCreditStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口</p>
     */
    public QueryDubheCreditStatusResponse queryDubheCreditStatusEx(QueryDubheCreditStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.credit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheCreditStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算</p>
     */
    public CountDubheRepayReftrialResponse countDubheRepayReftrial(CountDubheRepayReftrialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubheRepayReftrialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算</p>
     */
    public CountDubheRepayReftrialResponse countDubheRepayReftrialEx(CountDubheRepayReftrialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubheRepayReftrialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询</p>
     */
    public QueryDubheRepayListResponse queryDubheRepayList(QueryDubheRepayListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheRepayListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询</p>
     */
    public QueryDubheRepayListResponse queryDubheRepayListEx(QueryDubheRepayListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheRepayListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口</p>
     */
    public ApplyDubheUsecreditResponse applyDubheUsecredit(ApplyDubheUsecreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubheUsecreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口</p>
     */
    public ApplyDubheUsecreditResponse applyDubheUsecreditEx(ApplyDubheUsecreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.usecredit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubheUsecreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询</p>
     */
    public QueryDubheUsecreditStatusResponse queryDubheUsecreditStatus(QueryDubheUsecreditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheUsecreditStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询</p>
     */
    public QueryDubheUsecreditStatusResponse queryDubheUsecreditStatusEx(QueryDubheUsecreditStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.usecredit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheUsecreditStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算</p>
     */
    public CountDubheRepayTrialResponse countDubheRepayTrial(CountDubheRepayTrialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubheRepayTrialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算</p>
     */
    public CountDubheRepayTrialResponse countDubheRepayTrialEx(CountDubheRepayTrialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.trial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubheRepayTrialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口</p>
     */
    public RepayDubheRepayCheckstandResponse repayDubheRepayCheckstand(RepayDubheRepayCheckstandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubheRepayCheckstandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口</p>
     */
    public RepayDubheRepayCheckstandResponse repayDubheRepayCheckstandEx(RepayDubheRepayCheckstandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubheRepayCheckstandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询</p>
     */
    public QueryDubheRepayInfoResponse queryDubheRepayInfo(QueryDubheRepayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheRepayInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询</p>
     */
    public QueryDubheRepayInfoResponse queryDubheRepayInfoEx(QueryDubheRepayInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheRepayInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口</p>
     */
    public UpdateDubheCustomerInfoResponse updateDubheCustomerInfo(UpdateDubheCustomerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubheCustomerInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口</p>
     */
    public UpdateDubheCustomerInfoResponse updateDubheCustomerInfoEx(UpdateDubheCustomerInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.customer.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubheCustomerInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝)</p>
     */
    public ApplyDubheCustomerAgreementsignResponse applyDubheCustomerAgreementsign(ApplyDubheCustomerAgreementsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubheCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝)</p>
     */
    public ApplyDubheCustomerAgreementsignResponse applyDubheCustomerAgreementsignEx(ApplyDubheCustomerAgreementsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubheCustomerAgreementsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)</p>
     */
    public QueryDubheCustomerAgreementsignResponse queryDubheCustomerAgreementsign(QueryDubheCustomerAgreementsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)</p>
     */
    public QueryDubheCustomerAgreementsignResponse queryDubheCustomerAgreementsignEx(QueryDubheCustomerAgreementsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheCustomerAgreementsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口</p>
     */
    public RepayDubheRepayWithholdResponse repayDubheRepayWithhold(RepayDubheRepayWithholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubheRepayWithholdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口</p>
     */
    public RepayDubheRepayWithholdResponse repayDubheRepayWithholdEx(RepayDubheRepayWithholdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubheRepayWithholdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取</p>
     */
    public QueryDubheSearchContractResponse queryDubheSearchContract(QueryDubheSearchContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheSearchContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取</p>
     */
    public QueryDubheSearchContractResponse queryDubheSearchContractEx(QueryDubheSearchContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.search.contract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheSearchContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询</p>
     */
    public QueryDubheReceiptOverdueResponse queryDubheReceiptOverdue(QueryDubheReceiptOverdueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheReceiptOverdueEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询</p>
     */
    public QueryDubheReceiptOverdueResponse queryDubheReceiptOverdueEx(QueryDubheReceiptOverdueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheReceiptOverdueResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口</p>
     */
    public SendDubbridgeSmsResponse sendDubbridgeSms(SendDubbridgeSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDubbridgeSmsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口</p>
     */
    public SendDubbridgeSmsResponse sendDubbridgeSmsEx(SendDubbridgeSmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.sms.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendDubbridgeSmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口</p>
     */
    public SendDubbridgeSmsBatchResponse sendDubbridgeSmsBatch(SendDubbridgeSmsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDubbridgeSmsBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口</p>
     */
    public SendDubbridgeSmsBatchResponse sendDubbridgeSmsBatchEx(SendDubbridgeSmsBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.sms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendDubbridgeSmsBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询</p>
     */
    public QueryDubbridgeRouterFundrouterResponse queryDubbridgeRouterFundrouter(QueryDubbridgeRouterFundrouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRouterFundrouterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询</p>
     */
    public QueryDubbridgeRouterFundrouterResponse queryDubbridgeRouterFundrouterEx(QueryDubbridgeRouterFundrouterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRouterFundrouterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口</p>
     */
    public ApplyDubbridgeCreditResponse applyDubbridgeCredit(ApplyDubbridgeCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubbridgeCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口</p>
     */
    public ApplyDubbridgeCreditResponse applyDubbridgeCreditEx(ApplyDubbridgeCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.credit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubbridgeCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传</p>
     */
    public UploadDubbridgeFileResponse uploadDubbridgeFile(UploadDubbridgeFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDubbridgeFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传</p>
     */
    public UploadDubbridgeFileResponse uploadDubbridgeFileEx(UploadDubbridgeFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.dubbridge.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadDubbridgeFileResponse uploadDubbridgeFileResponse = UploadDubbridgeFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadDubbridgeFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadDubbridgeFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡)</p>
     */
    public BindDubbridgeCustomerBankcardResponse bindDubbridgeCustomerBankcard(BindDubbridgeCustomerBankcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDubbridgeCustomerBankcardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡)</p>
     */
    public BindDubbridgeCustomerBankcardResponse bindDubbridgeCustomerBankcardEx(BindDubbridgeCustomerBankcardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDubbridgeCustomerBankcardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡)</p>
     */
    public VerifyDubbridgeCustomerBankcardResponse verifyDubbridgeCustomerBankcard(VerifyDubbridgeCustomerBankcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDubbridgeCustomerBankcardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡)</p>
     */
    public VerifyDubbridgeCustomerBankcardResponse verifyDubbridgeCustomerBankcardEx(VerifyDubbridgeCustomerBankcardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyDubbridgeCustomerBankcardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口</p>
     */
    public NotifyDubbridgeDefininnerchannelResponse notifyDubbridgeDefininnerchannel(NotifyDubbridgeDefininnerchannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyDubbridgeDefininnerchannelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口</p>
     */
    public NotifyDubbridgeDefininnerchannelResponse notifyDubbridgeDefininnerchannelEx(NotifyDubbridgeDefininnerchannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.defininnerchannel.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyDubbridgeDefininnerchannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口</p>
     */
    public QueryDubbridgeCreditStatusResponse queryDubbridgeCreditStatus(QueryDubbridgeCreditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCreditStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口</p>
     */
    public QueryDubbridgeCreditStatusResponse queryDubbridgeCreditStatusEx(QueryDubbridgeCreditStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.credit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCreditStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统企业小微分查询
     * Summary: 天枢系统企业小微分查询</p>
     */
    public QueryDubbridgeRiskinfoEnterprisescoreResponse queryDubbridgeRiskinfoEnterprisescore(QueryDubbridgeRiskinfoEnterprisescoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRiskinfoEnterprisescoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统企业小微分查询
     * Summary: 天枢系统企业小微分查询</p>
     */
    public QueryDubbridgeRiskinfoEnterprisescoreResponse queryDubbridgeRiskinfoEnterprisescoreEx(QueryDubbridgeRiskinfoEnterprisescoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.riskinfo.enterprisescore.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRiskinfoEnterprisescoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统风控信息通用查询
     * Summary: 天枢系统风控信息通用查询</p>
     */
    public QueryDubbridgeRiskinfoCommonResponse queryDubbridgeRiskinfoCommon(QueryDubbridgeRiskinfoCommonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRiskinfoCommonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统风控信息通用查询
     * Summary: 天枢系统风控信息通用查询</p>
     */
    public QueryDubbridgeRiskinfoCommonResponse queryDubbridgeRiskinfoCommonEx(QueryDubbridgeRiskinfoCommonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.riskinfo.common.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRiskinfoCommonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 额度、利率、状态调整
     * Summary: 调额申请</p>
     */
    public UpdateDubbridgeInstitutionCreditResponse updateDubbridgeInstitutionCredit(UpdateDubbridgeInstitutionCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeInstitutionCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 额度、利率、状态调整
     * Summary: 调额申请</p>
     */
    public UpdateDubbridgeInstitutionCreditResponse updateDubbridgeInstitutionCreditEx(UpdateDubbridgeInstitutionCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.institution.credit.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeInstitutionCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢企业经营数据查询
     * Summary: 天枢企业经营数据查询</p>
     */
    public QueryDubbridgeRiskinfoBusinessinfoResponse queryDubbridgeRiskinfoBusinessinfo(QueryDubbridgeRiskinfoBusinessinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRiskinfoBusinessinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢企业经营数据查询
     * Summary: 天枢企业经营数据查询</p>
     */
    public QueryDubbridgeRiskinfoBusinessinfoResponse queryDubbridgeRiskinfoBusinessinfoEx(QueryDubbridgeRiskinfoBusinessinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.riskinfo.businessinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRiskinfoBusinessinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约申请(支付宝）
     * Summary: 天枢系统协议签约申请(支付宝)</p>
     */
    public ApplyDubbridgeCustomerAgreementsignResponse applyDubbridgeCustomerAgreementsign(ApplyDubbridgeCustomerAgreementsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubbridgeCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约申请(支付宝）
     * Summary: 天枢系统协议签约申请(支付宝)</p>
     */
    public ApplyDubbridgeCustomerAgreementsignResponse applyDubbridgeCustomerAgreementsignEx(ApplyDubbridgeCustomerAgreementsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubbridgeCustomerAgreementsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统是否授信查询
     * Summary: 天枢系统是否授信查询</p>
     */
    public QueryDubbridgeAccountStatusResponse queryDubbridgeAccountStatus(QueryDubbridgeAccountStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAccountStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统是否授信查询
     * Summary: 天枢系统是否授信查询</p>
     */
    public QueryDubbridgeAccountStatusResponse queryDubbridgeAccountStatusEx(QueryDubbridgeAccountStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.account.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAccountStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统校验是否联登
     * Summary: 天枢系统校验是否联登</p>
     */
    public QueryDubbridgeAccountCustomResponse queryDubbridgeAccountCustom(QueryDubbridgeAccountCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAccountCustomEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统校验是否联登
     * Summary: 天枢系统校验是否联登</p>
     */
    public QueryDubbridgeAccountCustomResponse queryDubbridgeAccountCustomEx(QueryDubbridgeAccountCustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.account.custom.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAccountCustomResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统更新渠道
     * Summary: 天枢系统更新渠道</p>
     */
    public UpdateDubbridgeAccountCustomResponse updateDubbridgeAccountCustom(UpdateDubbridgeAccountCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeAccountCustomEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统更新渠道
     * Summary: 天枢系统更新渠道</p>
     */
    public UpdateDubbridgeAccountCustomResponse updateDubbridgeAccountCustomEx(UpdateDubbridgeAccountCustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.account.custom.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeAccountCustomResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)</p>
     */
    public QueryDubbridgeCustomerAgreementsignResponse queryDubbridgeCustomerAgreementsign(QueryDubbridgeCustomerAgreementsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)</p>
     */
    public QueryDubbridgeCustomerAgreementsignResponse queryDubbridgeCustomerAgreementsignEx(QueryDubbridgeCustomerAgreementsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCustomerAgreementsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口</p>
     */
    public UpdateDubbridgeCustomerInfoResponse updateDubbridgeCustomerInfo(UpdateDubbridgeCustomerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeCustomerInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口</p>
     */
    public UpdateDubbridgeCustomerInfoResponse updateDubbridgeCustomerInfoEx(UpdateDubbridgeCustomerInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeCustomerInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询</p>
     */
    public QueryDubbridgeReceiptOverdueResponse queryDubbridgeReceiptOverdue(QueryDubbridgeReceiptOverdueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeReceiptOverdueEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询</p>
     */
    public QueryDubbridgeReceiptOverdueResponse queryDubbridgeReceiptOverdueEx(QueryDubbridgeReceiptOverdueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeReceiptOverdueResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口</p>
     */
    public RepayDubbridgeRepayCheckstandResponse repayDubbridgeRepayCheckstand(RepayDubbridgeRepayCheckstandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubbridgeRepayCheckstandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口</p>
     */
    public RepayDubbridgeRepayCheckstandResponse repayDubbridgeRepayCheckstandEx(RepayDubbridgeRepayCheckstandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubbridgeRepayCheckstandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询</p>
     */
    public QueryDubbridgeRepayInfoResponse queryDubbridgeRepayInfo(QueryDubbridgeRepayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRepayInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询</p>
     */
    public QueryDubbridgeRepayInfoResponse queryDubbridgeRepayInfoEx(QueryDubbridgeRepayInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRepayInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询</p>
     */
    public QueryDubbridgeRepayListResponse queryDubbridgeRepayList(QueryDubbridgeRepayListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRepayListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询</p>
     */
    public QueryDubbridgeRepayListResponse queryDubbridgeRepayListEx(QueryDubbridgeRepayListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRepayListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算</p>
     */
    public CountDubbridgeRepayReftrialResponse countDubbridgeRepayReftrial(CountDubbridgeRepayReftrialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubbridgeRepayReftrialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算</p>
     */
    public CountDubbridgeRepayReftrialResponse countDubbridgeRepayReftrialEx(CountDubbridgeRepayReftrialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubbridgeRepayReftrialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算</p>
     */
    public CountDubbridgeRepayTrialResponse countDubbridgeRepayTrial(CountDubbridgeRepayTrialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubbridgeRepayTrialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算</p>
     */
    public CountDubbridgeRepayTrialResponse countDubbridgeRepayTrialEx(CountDubbridgeRepayTrialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.trial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubbridgeRepayTrialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口</p>
     */
    public RepayDubbridgeRepayWithholdResponse repayDubbridgeRepayWithhold(RepayDubbridgeRepayWithholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubbridgeRepayWithholdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口</p>
     */
    public RepayDubbridgeRepayWithholdResponse repayDubbridgeRepayWithholdEx(RepayDubbridgeRepayWithholdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubbridgeRepayWithholdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取</p>
     */
    public QueryDubbridgeSearchContractResponse queryDubbridgeSearchContract(QueryDubbridgeSearchContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeSearchContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取</p>
     */
    public QueryDubbridgeSearchContractResponse queryDubbridgeSearchContractEx(QueryDubbridgeSearchContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.search.contract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeSearchContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口</p>
     */
    public ApplyDubbridgeUsecreditResponse applyDubbridgeUsecredit(ApplyDubbridgeUsecreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubbridgeUsecreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口</p>
     */
    public ApplyDubbridgeUsecreditResponse applyDubbridgeUsecreditEx(ApplyDubbridgeUsecreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.usecredit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubbridgeUsecreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询</p>
     */
    public QueryDubbridgeUsecreditStatusResponse queryDubbridgeUsecreditStatus(QueryDubbridgeUsecreditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeUsecreditStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询</p>
     */
    public QueryDubbridgeUsecreditStatusResponse queryDubbridgeUsecreditStatusEx(QueryDubbridgeUsecreditStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.usecredit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeUsecreditStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统是否结清
     * Summary: 天枢系统借款是否结清</p>
     */
    public QueryDubbridgeReceiptStatusResponse queryDubbridgeReceiptStatus(QueryDubbridgeReceiptStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeReceiptStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统是否结清
     * Summary: 天枢系统借款是否结清</p>
     */
    public QueryDubbridgeReceiptStatusResponse queryDubbridgeReceiptStatusEx(QueryDubbridgeReceiptStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.receipt.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeReceiptStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约查询(通用)
     * Summary: 天枢系统协议签约查询(通用)</p>
     */
    public QueryDubbridgeCustomerCommonagreementsignResponse queryDubbridgeCustomerCommonagreementsign(QueryDubbridgeCustomerCommonagreementsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCustomerCommonagreementsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统协议签约查询(通用)
     * Summary: 天枢系统协议签约查询(通用)</p>
     */
    public QueryDubbridgeCustomerCommonagreementsignResponse queryDubbridgeCustomerCommonagreementsignEx(QueryDubbridgeCustomerCommonagreementsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.commonagreementsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCustomerCommonagreementsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户影像信息更新
     * Summary: 客户影像信息更新</p>
     */
    public UpdateDubbridgeFileResponse updateDubbridgeFile(UpdateDubbridgeFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户影像信息更新
     * Summary: 客户影像信息更新</p>
     */
    public UpdateDubbridgeFileResponse updateDubbridgeFileEx(UpdateDubbridgeFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.file.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢回调通用接口
     * Summary: 天枢回调通用接口</p>
     */
    public NotifyDubbridgeCallbackResponse notifyDubbridgeCallback(NotifyDubbridgeCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyDubbridgeCallbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢回调通用接口
     * Summary: 天枢回调通用接口</p>
     */
    public NotifyDubbridgeCallbackResponse notifyDubbridgeCallbackEx(NotifyDubbridgeCallbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.callback.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyDubbridgeCallbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 2.12	天枢系统还款信息查询V2.0
     * Summary: 2.12 天枢系统还款信息查询V2.0</p>
     */
    public QueryDubbridgeRepayResultResponse queryDubbridgeRepayResult(QueryDubbridgeRepayResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRepayResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 2.12	天枢系统还款信息查询V2.0
     * Summary: 2.12 天枢系统还款信息查询V2.0</p>
     */
    public QueryDubbridgeRepayResultResponse queryDubbridgeRepayResultEx(QueryDubbridgeRepayResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRepayResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢准入接口
     * Summary: 天枢准入接口</p>
     */
    public QueryDubbridgeCreditPermitResponse queryDubbridgeCreditPermit(QueryDubbridgeCreditPermitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCreditPermitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢准入接口
     * Summary: 天枢准入接口</p>
     */
    public QueryDubbridgeCreditPermitResponse queryDubbridgeCreditPermitEx(QueryDubbridgeCreditPermitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.credit.permit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCreditPermitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户状态判断
     * Summary: 用户状态判断</p>
     */
    public QueryDubbridgeUserUpgradestatusResponse queryDubbridgeUserUpgradestatus(QueryDubbridgeUserUpgradestatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeUserUpgradestatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户状态判断
     * Summary: 用户状态判断</p>
     */
    public QueryDubbridgeUserUpgradestatusResponse queryDubbridgeUserUpgradestatusEx(QueryDubbridgeUserUpgradestatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.user.upgradestatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeUserUpgradestatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 借据状态判断
     * Summary: 借据状态判断</p>
     */
    public QueryDubbridgeLoanUpgradestatusResponse queryDubbridgeLoanUpgradestatus(QueryDubbridgeLoanUpgradestatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeLoanUpgradestatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 借据状态判断
     * Summary: 借据状态判断</p>
     */
    public QueryDubbridgeLoanUpgradestatusResponse queryDubbridgeLoanUpgradestatusEx(QueryDubbridgeLoanUpgradestatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.loan.upgradestatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeLoanUpgradestatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付签约查询(用户绑定银行卡列表)
     * Summary: 支付签约查询(用户绑定银行卡列表)</p>
     */
    public QueryDubbridgeCustomerBankcardlistResponse queryDubbridgeCustomerBankcardlist(QueryDubbridgeCustomerBankcardlistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCustomerBankcardlistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付签约查询(用户绑定银行卡列表)
     * Summary: 支付签约查询(用户绑定银行卡列表)</p>
     */
    public QueryDubbridgeCustomerBankcardlistResponse queryDubbridgeCustomerBankcardlistEx(QueryDubbridgeCustomerBankcardlistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.bankcardlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCustomerBankcardlistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用户前筛查询
     * Summary: 天枢系统用户前筛查询</p>
     */
    public QueryDubbridgeRouterUserselectResponse queryDubbridgeRouterUserselect(QueryDubbridgeRouterUserselectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRouterUserselectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统用户前筛查询
     * Summary: 天枢系统用户前筛查询</p>
     */
    public QueryDubbridgeRouterUserselectResponse queryDubbridgeRouterUserselectEx(QueryDubbridgeRouterUserselectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.router.userselect.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRouterUserselectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统开具结清证明
     * Summary: 天枢系统开具结清证明</p>
     */
    public QueryDubbridgeSettlementCertificateResponse queryDubbridgeSettlementCertificate(QueryDubbridgeSettlementCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeSettlementCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统开具结清证明
     * Summary: 天枢系统开具结清证明</p>
     */
    public QueryDubbridgeSettlementCertificateResponse queryDubbridgeSettlementCertificateEx(QueryDubbridgeSettlementCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.settlement.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeSettlementCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统预览协议查询接口
     * Summary: 天枢系统预览协议查询接口</p>
     */
    public QueryDubbridgeAgreementPreviewResponse queryDubbridgeAgreementPreview(QueryDubbridgeAgreementPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAgreementPreviewEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统预览协议查询接口
     * Summary: 天枢系统预览协议查询接口</p>
     */
    public QueryDubbridgeAgreementPreviewResponse queryDubbridgeAgreementPreviewEx(QueryDubbridgeAgreementPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.agreement.preview.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAgreementPreviewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户借款是否结清
     * Summary: 用户借款是否结清</p>
     */
    public QueryDubbridgeAccountUsecreditResponse queryDubbridgeAccountUsecredit(QueryDubbridgeAccountUsecreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAccountUsecreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户借款是否结清
     * Summary: 用户借款是否结清</p>
     */
    public QueryDubbridgeAccountUsecreditResponse queryDubbridgeAccountUsecreditEx(QueryDubbridgeAccountUsecreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.account.usecredit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAccountUsecreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢用户聚合状态查询接口
     * Summary: 天枢用户聚合状态查询接口</p>
     */
    public QueryDubbridgeUserAggregationinfoResponse queryDubbridgeUserAggregationinfo(QueryDubbridgeUserAggregationinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeUserAggregationinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢用户聚合状态查询接口
     * Summary: 天枢用户聚合状态查询接口</p>
     */
    public QueryDubbridgeUserAggregationinfoResponse queryDubbridgeUserAggregationinfoEx(QueryDubbridgeUserAggregationinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.user.aggregationinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeUserAggregationinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统优惠券列表查询接口
     * Summary: 天枢系统优惠券列表查询接口</p>
     */
    public QueryDubbridgeMarketingCouponlistResponse queryDubbridgeMarketingCouponlist(QueryDubbridgeMarketingCouponlistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeMarketingCouponlistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统优惠券列表查询接口
     * Summary: 天枢系统优惠券列表查询接口</p>
     */
    public QueryDubbridgeMarketingCouponlistResponse queryDubbridgeMarketingCouponlistEx(QueryDubbridgeMarketingCouponlistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.marketing.couponlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeMarketingCouponlistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款方式查询
     * Summary: 天枢系统还款方式查询</p>
     */
    public QueryDubbridgeRepaytypeInfoResponse queryDubbridgeRepaytypeInfo(QueryDubbridgeRepaytypeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRepaytypeInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统还款方式查询
     * Summary: 天枢系统还款方式查询</p>
     */
    public QueryDubbridgeRepaytypeInfoResponse queryDubbridgeRepaytypeInfoEx(QueryDubbridgeRepaytypeInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repaytype.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRepaytypeInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口-分期付
     * Summary: 天枢系统授信额度查询接口-分期付</p>
     */
    public QueryDubbridgeInstallmentCreditamtResponse queryDubbridgeInstallmentCreditamt(QueryDubbridgeInstallmentCreditamtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeInstallmentCreditamtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统授信额度查询接口-分期付
     * Summary: 天枢系统授信额度查询接口-分期付</p>
     */
    public QueryDubbridgeInstallmentCreditamtResponse queryDubbridgeInstallmentCreditamtEx(QueryDubbridgeInstallmentCreditamtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.installment.creditamt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeInstallmentCreditamtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统取消分期付订单-分期付
     * Summary: 天枢系统取消分期付订单-分期付</p>
     */
    public CancelDubbridgeInstallmentOrderResponse cancelDubbridgeInstallmentOrder(CancelDubbridgeInstallmentOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDubbridgeInstallmentOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统取消分期付订单-分期付
     * Summary: 天枢系统取消分期付订单-分期付</p>
     */
    public CancelDubbridgeInstallmentOrderResponse cancelDubbridgeInstallmentOrderEx(CancelDubbridgeInstallmentOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.installment.order.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDubbridgeInstallmentOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统支用后补充材料推送-分期付
     * Summary: 天枢系统支用后补充材料推送-分期付</p>
     */
    public PushDubbridgeInstallmentSupplementResponse pushDubbridgeInstallmentSupplement(PushDubbridgeInstallmentSupplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDubbridgeInstallmentSupplementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统支用后补充材料推送-分期付
     * Summary: 天枢系统支用后补充材料推送-分期付</p>
     */
    public PushDubbridgeInstallmentSupplementResponse pushDubbridgeInstallmentSupplementEx(PushDubbridgeInstallmentSupplementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.installment.supplement.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushDubbridgeInstallmentSupplementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统分期试算
     * Summary: 天枢系统分期试算</p>
     */
    public QueryDubbridgeInstallmentTrialResponse queryDubbridgeInstallmentTrial(QueryDubbridgeInstallmentTrialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeInstallmentTrialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统分期试算
     * Summary: 天枢系统分期试算</p>
     */
    public QueryDubbridgeInstallmentTrialResponse queryDubbridgeInstallmentTrialEx(QueryDubbridgeInstallmentTrialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.installment.trial.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeInstallmentTrialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻图片上传-分期付
     * Summary: 天枢系统二级商户入驻图片上传-分期付</p>
     */
    public UploadDubbridgeAlipayImageResponse uploadDubbridgeAlipayImage(UploadDubbridgeAlipayImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDubbridgeAlipayImageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻图片上传-分期付
     * Summary: 天枢系统二级商户入驻图片上传-分期付</p>
     */
    public UploadDubbridgeAlipayImageResponse uploadDubbridgeAlipayImageEx(UploadDubbridgeAlipayImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.image.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadDubbridgeAlipayImageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻-分期付
     * Summary: 天枢系统二级商户入驻-分期付</p>
     */
    public CreateDubbridgeAlipayMerchantResponse createDubbridgeAlipayMerchant(CreateDubbridgeAlipayMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDubbridgeAlipayMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻-分期付
     * Summary: 天枢系统二级商户入驻-分期付</p>
     */
    public CreateDubbridgeAlipayMerchantResponse createDubbridgeAlipayMerchantEx(CreateDubbridgeAlipayMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.merchant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDubbridgeAlipayMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻结果查询-分期付
     * Summary: 天枢系统二级商户入驻结果查询-分期付</p>
     */
    public QueryDubbridgeAlipayMerchantResponse queryDubbridgeAlipayMerchant(QueryDubbridgeAlipayMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAlipayMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户入驻结果查询-分期付
     * Summary: 天枢系统二级商户入驻结果查询-分期付</p>
     */
    public QueryDubbridgeAlipayMerchantResponse queryDubbridgeAlipayMerchantEx(QueryDubbridgeAlipayMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAlipayMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户支付宝订单码创建-分期付
     * Summary: 天枢系统二级商户支付宝订单码创建-分期付</p>
     */
    public CreateDubbridgeAlipayTradeResponse createDubbridgeAlipayTrade(CreateDubbridgeAlipayTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDubbridgeAlipayTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统二级商户支付宝订单码创建-分期付
     * Summary: 天枢系统二级商户支付宝订单码创建-分期付</p>
     */
    public CreateDubbridgeAlipayTradeResponse createDubbridgeAlipayTradeEx(CreateDubbridgeAlipayTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.trade.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDubbridgeAlipayTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级商户交易取消
     * Summary: 天枢系统-二级商户交易取消-分期付</p>
     */
    public CancelDubbridgeAlipayTradeResponse cancelDubbridgeAlipayTrade(CancelDubbridgeAlipayTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDubbridgeAlipayTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级商户交易取消
     * Summary: 天枢系统-二级商户交易取消-分期付</p>
     */
    public CancelDubbridgeAlipayTradeResponse cancelDubbridgeAlipayTradeEx(CancelDubbridgeAlipayTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.trade.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDubbridgeAlipayTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级商户交易查询
     * Summary: 天枢系统-二级商户交易查询-分期付</p>
     */
    public QueryDubbridgeAlipayTradeResponse queryDubbridgeAlipayTrade(QueryDubbridgeAlipayTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAlipayTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级商户交易查询
     * Summary: 天枢系统-二级商户交易查询-分期付</p>
     */
    public QueryDubbridgeAlipayTradeResponse queryDubbridgeAlipayTradeEx(QueryDubbridgeAlipayTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.trade.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAlipayTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统-二级商户交易退款-分期付
     * Summary: 天枢系统-二级商户交易退款-分期付</p>
     */
    public RefundDubbridgeAlipayTradeResponse refundDubbridgeAlipayTrade(RefundDubbridgeAlipayTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refundDubbridgeAlipayTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统-二级商户交易退款-分期付
     * Summary: 天枢系统-二级商户交易退款-分期付</p>
     */
    public RefundDubbridgeAlipayTradeResponse refundDubbridgeAlipayTradeEx(RefundDubbridgeAlipayTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.trade.refund", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefundDubbridgeAlipayTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统-二级商户交易关闭-分期付
     * Summary: 天枢系统-二级商户交易关闭-分期付</p>
     */
    public CloseDubbridgeAlipayTradeResponse closeDubbridgeAlipayTrade(CloseDubbridgeAlipayTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeDubbridgeAlipayTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统-二级商户交易关闭-分期付
     * Summary: 天枢系统-二级商户交易关闭-分期付</p>
     */
    public CloseDubbridgeAlipayTradeResponse closeDubbridgeAlipayTradeEx(CloseDubbridgeAlipayTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.trade.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseDubbridgeAlipayTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统-二级商户交易退款查询-分期付
     * Summary: 天枢系统-二级商户交易退款查询-分期付</p>
     */
    public QueryDubbridgeAlipayRefundResponse queryDubbridgeAlipayRefund(QueryDubbridgeAlipayRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAlipayRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天枢系统-二级商户交易退款查询-分期付
     * Summary: 天枢系统-二级商户交易退款查询-分期付</p>
     */
    public QueryDubbridgeAlipayRefundResponse queryDubbridgeAlipayRefundEx(QueryDubbridgeAlipayRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.alipay.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAlipayRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口</p>
     */
    public VerifyFinserviceZhimaIdentifyResponse verifyFinserviceZhimaIdentify(VerifyFinserviceZhimaIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFinserviceZhimaIdentifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口</p>
     */
    public VerifyFinserviceZhimaIdentifyResponse verifyFinserviceZhimaIdentifyEx(VerifyFinserviceZhimaIdentifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFinserviceZhimaIdentifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description:<br>Summary: 芝麻四要素认证结果查询</p>
     */
    public QueryFinserviceZhimaIdentifyResponse queryFinserviceZhimaIdentify(QueryFinserviceZhimaIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFinserviceZhimaIdentifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description:<br>Summary: 芝麻四要素认证结果查询</p>
     */
    public QueryFinserviceZhimaIdentifyResponse queryFinserviceZhimaIdentifyEx(QueryFinserviceZhimaIdentifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFinserviceZhimaIdentifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口</p>
     */
    public QueryMdipDataserviceResponse queryMdipDataservice(QueryMdipDataserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMdipDataserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口</p>
     */
    public QueryMdipDataserviceResponse queryMdipDataserviceEx(QueryMdipDataserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.dataservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMdipDataserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 接受op的文件id,支持外网多源文件上传
     * Summary: 接受op的文件id,支持外网多源文件上传</p>
     */
    public ReceiveMdipParamsFileResponse receiveMdipParamsFile(ReceiveMdipParamsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveMdipParamsFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 接受op的文件id,支持外网多源文件上传
     * Summary: 接受op的文件id,支持外网多源文件上传</p>
     */
    public ReceiveMdipParamsFileResponse receiveMdipParamsFileEx(ReceiveMdipParamsFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.mdip.params.file.receive"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ReceiveMdipParamsFileResponse receiveMdipParamsFileResponse = ReceiveMdipParamsFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return receiveMdipParamsFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.params.file.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveMdipParamsFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 接受op的文件id,支持风险大脑文件上传
     * Summary: 接受op的文件id,支持风险大脑文件上传</p>
     */
    public ReceiveMdipParamsRbbfileResponse receiveMdipParamsRbbfile(ReceiveMdipParamsRbbfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveMdipParamsRbbfileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 接受op的文件id,支持风险大脑文件上传
     * Summary: 接受op的文件id,支持风险大脑文件上传</p>
     */
    public ReceiveMdipParamsRbbfileResponse receiveMdipParamsRbbfileEx(ReceiveMdipParamsRbbfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.mdip.params.rbbfile.receive"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ReceiveMdipParamsRbbfileResponse receiveMdipParamsRbbfileResponse = ReceiveMdipParamsRbbfileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return receiveMdipParamsRbbfileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.params.rbbfile.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveMdipParamsRbbfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 多源平台审批回调接口
     * Summary: 多源平台审批回调接口</p>
     */
    public CallbackMdipAuditResponse callbackMdipAudit(CallbackMdipAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackMdipAuditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 多源平台审批回调接口
     * Summary: 多源平台审批回调接口</p>
     */
    public CallbackMdipAuditResponse callbackMdipAuditEx(CallbackMdipAuditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.audit.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackMdipAuditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
     * Summary: 多源融合平台的POC数据服务查询接口</p>
     */
    public QueryMdipDataservicePocResponse queryMdipDataservicePoc(QueryMdipDataservicePocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMdipDataservicePocEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
     * Summary: 多源融合平台的POC数据服务查询接口</p>
     */
    public QueryMdipDataservicePocResponse queryMdipDataservicePocEx(QueryMdipDataservicePocRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.dataservice.poc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMdipDataservicePocResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询默认租户的供应商列表
     * Summary: 查询默认租户的供应商列表</p>
     */
    public ListMdipDefaultSupplierResponse listMdipDefaultSupplier(ListMdipDefaultSupplierRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMdipDefaultSupplierEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询默认租户的供应商列表
     * Summary: 查询默认租户的供应商列表</p>
     */
    public ListMdipDefaultSupplierResponse listMdipDefaultSupplierEx(ListMdipDefaultSupplierRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.default.supplier.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMdipDefaultSupplierResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据回调
     * Summary: 云凤蝶回调参数</p>
     */
    public CallbackMdipYunfengdieParamsResponse callbackMdipYunfengdieParams(CallbackMdipYunfengdieParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackMdipYunfengdieParamsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据回调
     * Summary: 云凤蝶回调参数</p>
     */
    public CallbackMdipYunfengdieParamsResponse callbackMdipYunfengdieParamsEx(CallbackMdipYunfengdieParamsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.yunfengdie.params.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackMdipYunfengdieParamsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量实时触达接口
     * Summary: 发起触达任务</p>
     */
    public ApplyQmpRtBatchmarketingResponse applyQmpRtBatchmarketing(ApplyQmpRtBatchmarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyQmpRtBatchmarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量实时触达接口
     * Summary: 发起触达任务</p>
     */
    public ApplyQmpRtBatchmarketingResponse applyQmpRtBatchmarketingEx(ApplyQmpRtBatchmarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.rt.batchmarketing.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyQmpRtBatchmarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口</p>
     */
    public SendQmpTextsmsBatchResponse sendQmpTextsmsBatch(SendQmpTextsmsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendQmpTextsmsBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口</p>
     */
    public SendQmpTextsmsBatchResponse sendQmpTextsmsBatchEx(SendQmpTextsmsBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.textsms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendQmpTextsmsBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起AI外呼
     * Summary: 发起AI外呼</p>
     */
    public ApplyQmpRobotcallResponse applyQmpRobotcall(ApplyQmpRobotcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyQmpRobotcallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起AI外呼
     * Summary: 发起AI外呼</p>
     */
    public ApplyQmpRobotcallResponse applyQmpRobotcallEx(ApplyQmpRobotcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.robotcall.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyQmpRobotcallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口</p>
     */
    public SendQmpCardsmsBatchResponse sendQmpCardsmsBatch(SendQmpCardsmsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendQmpCardsmsBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口</p>
     */
    public SendQmpCardsmsBatchResponse sendQmpCardsmsBatchEx(SendQmpCardsmsBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.cardsms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendQmpCardsmsBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上行短信回调
     * Summary: 上行短信回调</p>
     */
    public CallbackQmpSmsUpResponse callbackQmpSmsUp(CallbackQmpSmsUpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackQmpSmsUpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上行短信回调
     * Summary: 上行短信回调</p>
     */
    public CallbackQmpSmsUpResponse callbackQmpSmsUpEx(CallbackQmpSmsUpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.sms.up.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackQmpSmsUpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 短信状态回调接口
     * Summary: 短信状态回调接口</p>
     */
    public CallbackQmpSmsReportResponse callbackQmpSmsReport(CallbackQmpSmsReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackQmpSmsReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 短信状态回调接口
     * Summary: 短信状态回调接口</p>
     */
    public CallbackQmpSmsReportResponse callbackQmpSmsReportEx(CallbackQmpSmsReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.sms.report.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackQmpSmsReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）</p>
     */
    public SendQmpDigitalsmsBatchResponse sendQmpDigitalsmsBatch(SendQmpDigitalsmsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendQmpDigitalsmsBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）</p>
     */
    public SendQmpDigitalsmsBatchResponse sendQmpDigitalsmsBatchEx(SendQmpDigitalsmsBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.digitalsms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendQmpDigitalsmsBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新接入ai外呼服务商的回调接口
     * Summary:  ai外呼回调接口</p>
     */
    public CallbackQmpRobotcallResponse callbackQmpRobotcall(CallbackQmpRobotcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackQmpRobotcallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新接入ai外呼服务商的回调接口
     * Summary:  ai外呼回调接口</p>
     */
    public CallbackQmpRobotcallResponse callbackQmpRobotcallEx(CallbackQmpRobotcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.robotcall.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackQmpRobotcallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询ai外呼任务详情
     * Summary:  查询ai外呼任务详情</p>
     */
    public QueryQmpRobotcallDetailResponse queryQmpRobotcallDetail(QueryQmpRobotcallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpRobotcallDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询ai外呼任务详情
     * Summary:  查询ai外呼任务详情</p>
     */
    public QueryQmpRobotcallDetailResponse queryQmpRobotcallDetailEx(QueryQmpRobotcallDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.robotcall.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpRobotcallDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量风控回执统计查询
     * Summary: 流量风控回执统计查询</p>
     */
    public QueryQmpDataaccessStatisticResponse queryQmpDataaccessStatistic(QueryQmpDataaccessStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpDataaccessStatisticEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量风控回执统计查询
     * Summary: 流量风控回执统计查询</p>
     */
    public QueryQmpDataaccessStatisticResponse queryQmpDataaccessStatisticEx(QueryQmpDataaccessStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.dataaccess.statistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpDataaccessStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外呼任务统计查询接口
     * Summary:  外呼任务统计查询接口</p>
     */
    public QueryQmpRobotcallStatisticinfoResponse queryQmpRobotcallStatisticinfo(QueryQmpRobotcallStatisticinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpRobotcallStatisticinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外呼任务统计查询接口
     * Summary:  外呼任务统计查询接口</p>
     */
    public QueryQmpRobotcallStatisticinfoResponse queryQmpRobotcallStatisticinfoEx(QueryQmpRobotcallStatisticinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.robotcall.statisticinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpRobotcallStatisticinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询</p>
     */
    public BatchqueryQmpTaskDetailResponse batchqueryQmpTaskDetail(BatchqueryQmpTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryQmpTaskDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询</p>
     */
    public BatchqueryQmpTaskDetailResponse batchqueryQmpTaskDetailEx(BatchqueryQmpTaskDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.task.detail.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryQmpTaskDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询</p>
     */
    public QueryQmpCardsmsSupportResponse queryQmpCardsmsSupport(QueryQmpCardsmsSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpCardsmsSupportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询</p>
     */
    public QueryQmpCardsmsSupportResponse queryQmpCardsmsSupportEx(QueryQmpCardsmsSupportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.cardsms.support.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpCardsmsSupportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量风控查询外呼策略详情
     * Summary: 流量风控查询外呼策略详情</p>
     */
    public BatchqueryQmpActionplanDetailResponse batchqueryQmpActionplanDetail(BatchqueryQmpActionplanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryQmpActionplanDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量风控查询外呼策略详情
     * Summary: 流量风控查询外呼策略详情</p>
     */
    public BatchqueryQmpActionplanDetailResponse batchqueryQmpActionplanDetailEx(BatchqueryQmpActionplanDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.actionplan.detail.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryQmpActionplanDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用流量风控(原营销盾)空号检测
     * Summary: 调用流量风控(原营销盾)空号检测</p>
     */
    public ApplyQmpPhonenumberstatusforsmsResponse applyQmpPhonenumberstatusforsms(ApplyQmpPhonenumberstatusforsmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyQmpPhonenumberstatusforsmsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用流量风控(原营销盾)空号检测
     * Summary: 调用流量风控(原营销盾)空号检测</p>
     */
    public ApplyQmpPhonenumberstatusforsmsResponse applyQmpPhonenumberstatusforsmsEx(ApplyQmpPhonenumberstatusforsmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.phonenumberstatusforsms.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyQmpPhonenumberstatusforsmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询租户外呼策略
     * Summary: 流量风控租户场景批量信息查询</p>
     */
    public BatchqueryQmpTenantActionplaninfoResponse batchqueryQmpTenantActionplaninfo(BatchqueryQmpTenantActionplaninfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryQmpTenantActionplaninfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询租户外呼策略
     * Summary: 流量风控租户场景批量信息查询</p>
     */
    public BatchqueryQmpTenantActionplaninfoResponse batchqueryQmpTenantActionplaninfoEx(BatchqueryQmpTenantActionplaninfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.tenant.actionplaninfo.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryQmpTenantActionplaninfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量风控租户场景信息查询
     * Summary: 流量风控租户场景信息查询</p>
     */
    public QueryQmpTenantActionplaninfoResponse queryQmpTenantActionplaninfo(QueryQmpTenantActionplaninfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpTenantActionplaninfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流量风控租户场景信息查询
     * Summary: 流量风控租户场景信息查询</p>
     */
    public QueryQmpTenantActionplaninfoResponse queryQmpTenantActionplaninfoEx(QueryQmpTenantActionplaninfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.tenant.actionplaninfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpTenantActionplaninfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询</p>
     */
    public QueryQmpCpaassmsTemplateResponse queryQmpCpaassmsTemplate(QueryQmpCpaassmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpCpaassmsTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询</p>
     */
    public QueryQmpCpaassmsTemplateResponse queryQmpCpaassmsTemplateEx(QueryQmpCpaassmsTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.cpaassms.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpCpaassmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据sceneStrategyId分页查询文本短信模板
     * Summary: 文本短信模板查询</p>
     */
    public QueryQmpTextsmsTemplateResponse queryQmpTextsmsTemplate(QueryQmpTextsmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpTextsmsTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据sceneStrategyId分页查询文本短信模板
     * Summary: 文本短信模板查询</p>
     */
    public QueryQmpTextsmsTemplateResponse queryQmpTextsmsTemplateEx(QueryQmpTextsmsTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.textsms.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpTextsmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送</p>
     */
    public PushQmpBackflowEventResponse pushQmpBackflowEvent(PushQmpBackflowEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushQmpBackflowEventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送</p>
     */
    public PushQmpBackflowEventResponse pushQmpBackflowEventEx(PushQmpBackflowEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.backflow.event.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushQmpBackflowEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送</p>
     */
    public PushQmpBackflowJsondataResponse pushQmpBackflowJsondata(PushQmpBackflowJsondataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushQmpBackflowJsondataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送</p>
     */
    public PushQmpBackflowJsondataResponse pushQmpBackflowJsondataEx(PushQmpBackflowJsondataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.backflow.jsondata.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushQmpBackflowJsondataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智选平台混合策略批量分层服务
     * Summary: 智选平台-混合策略批量分层服务</p>
     */
    public BatchqueryQmpRtMixedmarketingResponse batchqueryQmpRtMixedmarketing(BatchqueryQmpRtMixedmarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryQmpRtMixedmarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智选平台混合策略批量分层服务
     * Summary: 智选平台-混合策略批量分层服务</p>
     */
    public BatchqueryQmpRtMixedmarketingResponse batchqueryQmpRtMixedmarketingEx(BatchqueryQmpRtMixedmarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.rt.mixedmarketing.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryQmpRtMixedmarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 11
     * Summary: qmp离线托管文件导入</p>
     */
    public UploadQmpOfflinehostplanResponse uploadQmpOfflinehostplan(UploadQmpOfflinehostplanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadQmpOfflinehostplanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 11
     * Summary: qmp离线托管文件导入</p>
     */
    public UploadQmpOfflinehostplanResponse uploadQmpOfflinehostplanEx(UploadQmpOfflinehostplanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.qmp.offlinehostplan.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadQmpOfflinehostplanResponse uploadQmpOfflinehostplanResponse = UploadQmpOfflinehostplanResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadQmpOfflinehostplanResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.offlinehostplan.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadQmpOfflinehostplanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 安全托管分层结果查询接口
     * Summary: 安全托管分层结果查询接口</p>
     */
    public QueryQmpOfflinehostplanDecisionresultResponse queryQmpOfflinehostplanDecisionresult(QueryQmpOfflinehostplanDecisionresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpOfflinehostplanDecisionresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 安全托管分层结果查询接口
     * Summary: 安全托管分层结果查询接口</p>
     */
    public QueryQmpOfflinehostplanDecisionresultResponse queryQmpOfflinehostplanDecisionresultEx(QueryQmpOfflinehostplanDecisionresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.offlinehostplan.decisionresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpOfflinehostplanDecisionresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: qmp分层结果查询v2
     * Summary: qmp分层结果查询v2</p>
     */
    public QueryQmpOfflinehostplanDecisionresultsResponse queryQmpOfflinehostplanDecisionresults(QueryQmpOfflinehostplanDecisionresultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQmpOfflinehostplanDecisionresultsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: qmp分层结果查询v2
     * Summary: qmp分层结果查询v2</p>
     */
    public QueryQmpOfflinehostplanDecisionresultsResponse queryQmpOfflinehostplanDecisionresultsEx(QueryQmpOfflinehostplanDecisionresultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.qmp.offlinehostplan.decisionresults.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQmpOfflinehostplanDecisionresultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接授权信息表的同步
     * Summary: 企管盾票税交接授权信息表的同步</p>
     */
    public SyncRdaasTaxAuthinfoResponse syncRdaasTaxAuthinfo(SyncRdaasTaxAuthinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRdaasTaxAuthinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接授权信息表的同步
     * Summary: 企管盾票税交接授权信息表的同步</p>
     */
    public SyncRdaasTaxAuthinfoResponse syncRdaasTaxAuthinfoEx(SyncRdaasTaxAuthinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rdaas.tax.authinfo.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRdaasTaxAuthinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接授权记录表的同步
     * Summary: 企管盾票税交接授权记录表的同步</p>
     */
    public SyncRdaasTaxAuthorderResponse syncRdaasTaxAuthorder(SyncRdaasTaxAuthorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRdaasTaxAuthorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接授权记录表的同步
     * Summary: 企管盾票税交接授权记录表的同步</p>
     */
    public SyncRdaasTaxAuthorderResponse syncRdaasTaxAuthorderEx(SyncRdaasTaxAuthorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rdaas.tax.authorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRdaasTaxAuthorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接回调通知
     * Summary: 企管盾票税交接回调通知</p>
     */
    public NotifyRdaasTaxCallbackResponse notifyRdaasTaxCallback(NotifyRdaasTaxCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyRdaasTaxCallbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接回调通知
     * Summary: 企管盾票税交接回调通知</p>
     */
    public NotifyRdaasTaxCallbackResponse notifyRdaasTaxCallbackEx(NotifyRdaasTaxCallbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rdaas.tax.callback.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyRdaasTaxCallbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接RPA决策服务查询
     * Summary: 企管盾票税交接RPA决策服务查询</p>
     */
    public QueryRdaasTaxRpadecisionserviceResponse queryRdaasTaxRpadecisionservice(QueryRdaasTaxRpadecisionserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRdaasTaxRpadecisionserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接RPA决策服务查询
     * Summary: 企管盾票税交接RPA决策服务查询</p>
     */
    public QueryRdaasTaxRpadecisionserviceResponse queryRdaasTaxRpadecisionserviceEx(QueryRdaasTaxRpadecisionserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rdaas.tax.rpadecisionservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRdaasTaxRpadecisionserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接RPA决策服务指标查询
     * Summary: 企管盾票税交接RPA决策服务指标查询</p>
     */
    public QueryRdaasTaxRpadecisionindicatorResponse queryRdaasTaxRpadecisionindicator(QueryRdaasTaxRpadecisionindicatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRdaasTaxRpadecisionindicatorEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接RPA决策服务指标查询
     * Summary: 企管盾票税交接RPA决策服务指标查询</p>
     */
    public QueryRdaasTaxRpadecisionindicatorResponse queryRdaasTaxRpadecisionindicatorEx(QueryRdaasTaxRpadecisionindicatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rdaas.tax.rpadecisionindicator.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRdaasTaxRpadecisionindicatorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接要素授权决策查询
     * Summary: 企管盾票税交接要素授权决策查询</p>
     */
    public QueryRdaasTaxSimpleauthdecisionResponse queryRdaasTaxSimpleauthdecision(QueryRdaasTaxSimpleauthdecisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRdaasTaxSimpleauthdecisionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾票税交接要素授权决策查询
     * Summary: 企管盾票税交接要素授权决策查询</p>
     */
    public QueryRdaasTaxSimpleauthdecisionResponse queryRdaasTaxSimpleauthdecisionEx(QueryRdaasTaxSimpleauthdecisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rdaas.tax.simpleauthdecision.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRdaasTaxSimpleauthdecisionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: rfc外部文件上传
     * Summary: rfc外部文件上传</p>
     */
    public ReceiveRfcParamsFileResponse receiveRfcParamsFile(ReceiveRfcParamsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveRfcParamsFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: rfc外部文件上传
     * Summary: rfc外部文件上传</p>
     */
    public ReceiveRfcParamsFileResponse receiveRfcParamsFileEx(ReceiveRfcParamsFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.rfc.params.file.receive"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ReceiveRfcParamsFileResponse receiveRfcParamsFileResponse = ReceiveRfcParamsFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return receiveRfcParamsFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rfc.params.file.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveRfcParamsFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: rfc外呼名单文件上传接口
     * Summary: rfc外呼名单上传接口</p>
     */
    public UploadRfcAiboundFileResponse uploadRfcAiboundFile(UploadRfcAiboundFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadRfcAiboundFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: rfc外呼名单文件上传接口
     * Summary: rfc外呼名单上传接口</p>
     */
    public UploadRfcAiboundFileResponse uploadRfcAiboundFileEx(UploadRfcAiboundFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.rfc.aibound.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadRfcAiboundFileResponse uploadRfcAiboundFileResponse = UploadRfcAiboundFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadRfcAiboundFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rfc.aibound.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadRfcAiboundFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给外部的数据服务接口内容获取
     * Summary: 提供给外部的数据服务接口内容获取</p>
     */
    public QueryRfcOdpsLindormResponse queryRfcOdpsLindorm(QueryRfcOdpsLindormRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRfcOdpsLindormEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给外部的数据服务接口内容获取
     * Summary: 提供给外部的数据服务接口内容获取</p>
     */
    public QueryRfcOdpsLindormResponse queryRfcOdpsLindormEx(QueryRfcOdpsLindormRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rfc.odps.lindorm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRfcOdpsLindormResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】</p>
     */
    public QueryRbbGenericInvokeResponse queryRbbGenericInvoke(QueryRbbGenericInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbGenericInvokeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】</p>
     */
    public QueryRbbGenericInvokeResponse queryRbbGenericInvokeEx(QueryRbbGenericInvokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbGenericInvokeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版token生成
     * Summary: 【已废弃】</p>
     */
    public CreateRbbTokenResponse createRbbToken(CreateRbbTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbTokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版token生成
     * Summary: 【已废弃】</p>
     */
    public CreateRbbTokenResponse createRbbTokenEx(CreateRbbTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】</p>
     */
    public CreateRbbApiGwtokenResponse createRbbApiGwtoken(CreateRbbApiGwtokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbApiGwtokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】</p>
     */
    public CreateRbbApiGwtokenResponse createRbbApiGwtokenEx(CreateRbbApiGwtokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbApiGwtokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI</p>
     */
    public QueryRbbGeneralResponse queryRbbGeneral(QueryRbbGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbGeneralEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI</p>
     */
    public QueryRbbGeneralResponse queryRbbGeneralEx(QueryRbbGeneralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbGeneralResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取登录Token
     * Summary: 获取登录Token</p>
     */
    public GetRbbLoginTokenResponse getRbbLoginToken(GetRbbLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRbbLoginTokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取登录Token
     * Summary: 获取登录Token</p>
     */
    public GetRbbLoginTokenResponse getRbbLoginTokenEx(GetRbbLoginTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRbbLoginTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户</p>
     */
    public CreateRbbTenantResponse createRbbTenant(CreateRbbTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbTenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户</p>
     */
    public CreateRbbTenantResponse createRbbTenantEx(CreateRbbTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbTenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户</p>
     */
    public CreateRbbUserResponse createRbbUser(CreateRbbUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户</p>
     */
    public CreateRbbUserResponse createRbbUserEx(CreateRbbUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业准入接口
     * Summary: 企业准入</p>
     */
    public ExecRbbCompanyGuardResponse execRbbCompanyGuard(ExecRbbCompanyGuardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRbbCompanyGuardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业准入接口
     * Summary: 企业准入</p>
     */
    public ExecRbbCompanyGuardResponse execRbbCompanyGuardEx(ExecRbbCompanyGuardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.guard.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRbbCompanyGuardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交授信申请
     * Summary: 企业授信申请</p>
     */
    public ApplyRbbCompanyCreditResponse applyRbbCompanyCredit(ApplyRbbCompanyCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRbbCompanyCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交授信申请
     * Summary: 企业授信申请</p>
     */
    public ApplyRbbCompanyCreditResponse applyRbbCompanyCreditEx(ApplyRbbCompanyCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.credit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRbbCompanyCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业授信结果
     * Summary: 企业授信结果查询</p>
     */
    public QueryRbbCompanyCreditResponse queryRbbCompanyCredit(QueryRbbCompanyCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbCompanyCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业授信结果
     * Summary: 企业授信结果查询</p>
     */
    public QueryRbbCompanyCreditResponse queryRbbCompanyCreditEx(QueryRbbCompanyCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbCompanyCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
     * Summary: 风险大脑-上交所数据离线同步数据准备状态</p>
     */
    public QueryRbbRegdatasyncPreparedResponse queryRbbRegdatasyncPrepared(QueryRbbRegdatasyncPreparedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbRegdatasyncPreparedEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
     * Summary: 风险大脑-上交所数据离线同步数据准备状态</p>
     */
    public QueryRbbRegdatasyncPreparedResponse queryRbbRegdatasyncPreparedEx(QueryRbbRegdatasyncPreparedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.regdatasync.prepared.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbRegdatasyncPreparedResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑-上交所数据离线同步数据开始通知标识
     * Summary: 风险大脑-上交所数据离线同步数据开始通知</p>
     */
    public StartRbbRegdatasyncScheduleResponse startRbbRegdatasyncSchedule(StartRbbRegdatasyncScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRbbRegdatasyncScheduleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑-上交所数据离线同步数据开始通知标识
     * Summary: 风险大脑-上交所数据离线同步数据开始通知</p>
     */
    public StartRbbRegdatasyncScheduleResponse startRbbRegdatasyncScheduleEx(StartRbbRegdatasyncScheduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRbbRegdatasyncScheduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
     * Summary: 风险大脑-上交所数据离线同步数据完成记录</p>
     */
    public FinishRbbRegdatasyncScheduleResponse finishRbbRegdatasyncSchedule(FinishRbbRegdatasyncScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishRbbRegdatasyncScheduleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
     * Summary: 风险大脑-上交所数据离线同步数据完成记录</p>
     */
    public FinishRbbRegdatasyncScheduleResponse finishRbbRegdatasyncScheduleEx(FinishRbbRegdatasyncScheduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishRbbRegdatasyncScheduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交准入规则的执行请求
     * Summary: 企业准入申请</p>
     */
    public ApplyRbbCompanyGuardResponse applyRbbCompanyGuard(ApplyRbbCompanyGuardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRbbCompanyGuardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交准入规则的执行请求
     * Summary: 企业准入申请</p>
     */
    public ApplyRbbCompanyGuardResponse applyRbbCompanyGuardEx(ApplyRbbCompanyGuardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.guard.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRbbCompanyGuardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业准入结果查询
     * Summary: 企业准入结果查询</p>
     */
    public QueryRbbCompanyGuardResponse queryRbbCompanyGuard(QueryRbbCompanyGuardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbCompanyGuardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业准入结果查询
     * Summary: 企业准入结果查询</p>
     */
    public QueryRbbCompanyGuardResponse queryRbbCompanyGuardEx(QueryRbbCompanyGuardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.guard.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbCompanyGuardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风控给上交所鹰眼使用的zsearch查询
     * Summary: 企业风控给鹰眼使用的zsearch查询</p>
     */
    public QueryRbbObtsZsearchResponse queryRbbObtsZsearch(QueryRbbObtsZsearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbObtsZsearchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风控给上交所鹰眼使用的zsearch查询
     * Summary: 企业风控给鹰眼使用的zsearch查询</p>
     */
    public QueryRbbObtsZsearchResponse queryRbbObtsZsearchEx(QueryRbbObtsZsearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.obts.zsearch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbObtsZsearchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风控客户推送的企业信息
     * Summary: 企业风控客户推送的企业信息</p>
     */
    public PushRbbCustomerCompanyinfoResponse pushRbbCustomerCompanyinfo(PushRbbCustomerCompanyinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRbbCustomerCompanyinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风控客户推送的企业信息
     * Summary: 企业风控客户推送的企业信息</p>
     */
    public PushRbbCustomerCompanyinfoResponse pushRbbCustomerCompanyinfoEx(PushRbbCustomerCompanyinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.customer.companyinfo.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRbbCustomerCompanyinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾给高德的文件上传，用于小微店铺分
     * Summary: 企管盾给高德的文件上传，用于小微店铺分</p>
     */
    public UploadRbbFileAmapResponse uploadRbbFileAmap(UploadRbbFileAmapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadRbbFileAmapEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾给高德的文件上传，用于小微店铺分
     * Summary: 企管盾给高德的文件上传，用于小微店铺分</p>
     */
    public UploadRbbFileAmapResponse uploadRbbFileAmapEx(UploadRbbFileAmapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.rbb.file.amap.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadRbbFileAmapResponse uploadRbbFileAmapResponse = UploadRbbFileAmapResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadRbbFileAmapResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.file.amap.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadRbbFileAmapResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信贷操作接口
     * Summary: 信贷操作接口</p>
     */
    public OperateRbbCreditResponse operateRbbCredit(OperateRbbCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateRbbCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信贷操作接口
     * Summary: 信贷操作接口</p>
     */
    public OperateRbbCreditResponse operateRbbCreditEx(OperateRbbCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.credit.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateRbbCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取客户信息
     * Summary: 获取客户信息</p>
     */
    public PushRbbCustomerInformationResponse pushRbbCustomerInformation(PushRbbCustomerInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRbbCustomerInformationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取客户信息
     * Summary: 获取客户信息</p>
     */
    public PushRbbCustomerInformationResponse pushRbbCustomerInformationEx(PushRbbCustomerInformationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.customer.information.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRbbCustomerInformationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取税票授权数据
     * Summary: 获取税票授权数据</p>
     */
    public GetRbbTaxinvoiceDataResponse getRbbTaxinvoiceData(GetRbbTaxinvoiceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRbbTaxinvoiceDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取税票授权数据
     * Summary: 获取税票授权数据</p>
     */
    public GetRbbTaxinvoiceDataResponse getRbbTaxinvoiceDataEx(GetRbbTaxinvoiceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.taxinvoice.data.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRbbTaxinvoiceDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户实时状态通知
     * Summary: 客户实时状态通知</p>
     */
    public PushRbbCustomerStatusResponse pushRbbCustomerStatus(PushRbbCustomerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRbbCustomerStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户实时状态通知
     * Summary: 客户实时状态通知</p>
     */
    public PushRbbCustomerStatusResponse pushRbbCustomerStatusEx(PushRbbCustomerStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.customer.status.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRbbCustomerStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 票税计费处理推送，由票税侧请求
     * Summary: 票税计费处理推送</p>
     */
    public PushRbbInvoiceChargeResponse pushRbbInvoiceCharge(PushRbbInvoiceChargeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRbbInvoiceChargeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 票税计费处理推送，由票税侧请求
     * Summary: 票税计费处理推送</p>
     */
    public PushRbbInvoiceChargeResponse pushRbbInvoiceChargeEx(PushRbbInvoiceChargeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.invoice.charge.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRbbInvoiceChargeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过接口进行报告上传
     * Summary: 征信报告上传接口</p>
     */
    public ReceiveRbbParamsFileResponse receiveRbbParamsFile(ReceiveRbbParamsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveRbbParamsFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过接口进行报告上传
     * Summary: 征信报告上传接口</p>
     */
    public ReceiveRbbParamsFileResponse receiveRbbParamsFileEx(ReceiveRbbParamsFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.rbb.params.file.receive"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ReceiveRbbParamsFileResponse receiveRbbParamsFileResponse = ReceiveRbbParamsFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return receiveRbbParamsFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.params.file.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveRbbParamsFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 境外企业画像数据接收
     * Summary: 境外企业画像数据接收</p>
     */
    public ReceiveRbbOverseacompanyProfileResponse receiveRbbOverseacompanyProfile(ReceiveRbbOverseacompanyProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveRbbOverseacompanyProfileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 境外企业画像数据接收
     * Summary: 境外企业画像数据接收</p>
     */
    public ReceiveRbbOverseacompanyProfileResponse receiveRbbOverseacompanyProfileEx(ReceiveRbbOverseacompanyProfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.rbb.overseacompany.profile.receive"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ReceiveRbbOverseacompanyProfileResponse receiveRbbOverseacompanyProfileResponse = ReceiveRbbOverseacompanyProfileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return receiveRbbOverseacompanyProfileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.overseacompany.profile.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveRbbOverseacompanyProfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 报告结果推送，算法调用
     * Summary: 报告结果推送</p>
     */
    public PushRpaasReportAnswerResponse pushRpaasReportAnswer(PushRpaasReportAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRpaasReportAnswerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 报告结果推送，算法调用
     * Summary: 报告结果推送</p>
     */
    public PushRpaasReportAnswerResponse pushRpaasReportAnswerEx(PushRpaasReportAnswerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpaas.report.answer.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRpaasReportAnswerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾云开放平台服务调用
     * Summary: 企管盾云开放平台服务调用</p>
     */
    public QueryRpaasOpenServiceResponse queryRpaasOpenService(QueryRpaasOpenServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpaasOpenServiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企管盾云开放平台服务调用
     * Summary: 企管盾云开放平台服务调用</p>
     */
    public QueryRpaasOpenServiceResponse queryRpaasOpenServiceEx(QueryRpaasOpenServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpaas.open.service.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpaasOpenServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取签约接口
     * Summary: 获取签约接口</p>
     */
    public QueryRpgwSignUrlResponse queryRpgwSignUrl(QueryRpgwSignUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpgwSignUrlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取签约接口
     * Summary: 获取签约接口</p>
     */
    public QueryRpgwSignUrlResponse queryRpgwSignUrlEx(QueryRpgwSignUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.sign.url.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpgwSignUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建报税用户接口
     * Summary: 创建报税用户接口</p>
     */
    public RegisterRpgwUserEinvoiceResponse registerRpgwUserEinvoice(RegisterRpgwUserEinvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerRpgwUserEinvoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建报税用户接口
     * Summary: 创建报税用户接口</p>
     */
    public RegisterRpgwUserEinvoiceResponse registerRpgwUserEinvoiceEx(RegisterRpgwUserEinvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.einvoice.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterRpgwUserEinvoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签约接口
     * Summary: 获取签约接口</p>
     */
    public QueryRpgwUserSignurlResponse queryRpgwUserSignurl(QueryRpgwUserSignurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpgwUserSignurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签约接口
     * Summary: 获取签约接口</p>
     */
    public QueryRpgwUserSignurlResponse queryRpgwUserSignurlEx(QueryRpgwUserSignurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.signurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpgwUserSignurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提现
     * Summary: 提现</p>
     */
    public WithdrawRpgwUserCommissionResponse withdrawRpgwUserCommission(WithdrawRpgwUserCommissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.withdrawRpgwUserCommissionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提现
     * Summary: 提现</p>
     */
    public WithdrawRpgwUserCommissionResponse withdrawRpgwUserCommissionEx(WithdrawRpgwUserCommissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.commission.withdraw", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new WithdrawRpgwUserCommissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信息同步
     * Summary: 下单等信息同步</p>
     */
    public SyncRpgwUserOrderinfoResponse syncRpgwUserOrderinfo(SyncRpgwUserOrderinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRpgwUserOrderinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信息同步
     * Summary: 下单等信息同步</p>
     */
    public SyncRpgwUserOrderinfoResponse syncRpgwUserOrderinfoEx(SyncRpgwUserOrderinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.orderinfo.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRpgwUserOrderinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 签约结果通知
     * Summary: 签约结果通知</p>
     */
    public NotifyRpgwUserSignresultResponse notifyRpgwUserSignresult(NotifyRpgwUserSignresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyRpgwUserSignresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 签约结果通知
     * Summary: 签约结果通知</p>
     */
    public NotifyRpgwUserSignresultResponse notifyRpgwUserSignresultEx(NotifyRpgwUserSignresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.signresult.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyRpgwUserSignresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表</p>
     */
    public QueryRtopCompanyOpinionResponse queryRtopCompanyOpinion(QueryRtopCompanyOpinionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyOpinionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表</p>
     */
    public QueryRtopCompanyOpinionResponse queryRtopCompanyOpinionEx(QueryRtopCompanyOpinionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyOpinionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息</p>
     */
    public ListRtopCompanyOpinionsResponse listRtopCompanyOpinions(ListRtopCompanyOpinionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCompanyOpinionsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息</p>
     */
    public ListRtopCompanyOpinionsResponse listRtopCompanyOpinionsEx(ListRtopCompanyOpinionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCompanyOpinionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情</p>
     */
    public GetRtopCompanyMonitorResponse getRtopCompanyMonitor(GetRtopCompanyMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRtopCompanyMonitorEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情</p>
     */
    public GetRtopCompanyMonitorResponse getRtopCompanyMonitorEx(GetRtopCompanyMonitorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRtopCompanyMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息</p>
     */
    public QueryRtopCrowdriskStatisticResponse queryRtopCrowdriskStatistic(QueryRtopCrowdriskStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskStatisticEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息</p>
     */
    public QueryRtopCrowdriskStatisticResponse queryRtopCrowdriskStatisticEx(QueryRtopCrowdriskStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表</p>
     */
    public ListRtopCrowdriskResponse listRtopCrowdrisk(ListRtopCrowdriskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCrowdriskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表</p>
     */
    public ListRtopCrowdriskResponse listRtopCrowdriskEx(ListRtopCrowdriskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCrowdriskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息</p>
     */
    public QueryRtopCrowdriskDetailResponse queryRtopCrowdriskDetail(QueryRtopCrowdriskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息</p>
     */
    public QueryRtopCrowdriskDetailResponse queryRtopCrowdriskDetailEx(QueryRtopCrowdriskDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息</p>
     */
    public QueryRtopRiskstormResponse queryRtopRiskstorm(QueryRtopRiskstormRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRiskstormEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息</p>
     */
    public QueryRtopRiskstormResponse queryRtopRiskstormEx(QueryRtopRiskstormRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRiskstormResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额</p>
     */
    public QueryRtopCrowdriskSumResponse queryRtopCrowdriskSum(QueryRtopCrowdriskSumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskSumEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额</p>
     */
    public QueryRtopCrowdriskSumResponse queryRtopCrowdriskSumEx(QueryRtopCrowdriskSumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskSumResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取</p>
     */
    public GetRtopCompanyDetailResponse getRtopCompanyDetail(GetRtopCompanyDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRtopCompanyDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取</p>
     */
    public GetRtopCompanyDetailResponse getRtopCompanyDetailEx(GetRtopCompanyDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRtopCompanyDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风险查询接口
     * Summary: 企业风险查询接口</p>
     */
    public QueryRtopCompanyRiskinfoResponse queryRtopCompanyRiskinfo(QueryRtopCompanyRiskinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风险查询接口
     * Summary: 企业风险查询接口</p>
     */
    public QueryRtopCompanyRiskinfoResponse queryRtopCompanyRiskinfoEx(QueryRtopCompanyRiskinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口</p>
     */
    public ExecRtopGenericInvokeResponse execRtopGenericInvoke(ExecRtopGenericInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRtopGenericInvokeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口</p>
     */
    public ExecRtopGenericInvokeResponse execRtopGenericInvokeEx(ExecRtopGenericInvokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRtopGenericInvokeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公有云生成token
     * Summary: 公有云生成token</p>
     */
    public CreateRtopTokenResponse createRtopToken(CreateRtopTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRtopTokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公有云生成token
     * Summary: 公有云生成token</p>
     */
    public CreateRtopTokenResponse createRtopTokenEx(CreateRtopTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRtopTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签全量信息获取
     * Summary: 标签全量信息获取</p>
     */
    public QueryRtopRisklabelResponse queryRtopRisklabel(QueryRtopRisklabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签全量信息获取
     * Summary: 标签全量信息获取</p>
     */
    public QueryRtopRisklabelResponse queryRtopRisklabelEx(QueryRtopRisklabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业全量信息获取
     * Summary: 企业全量信息获取</p>
     */
    public QueryRtopCompanyResponse queryRtopCompany(QueryRtopCompanyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业全量信息获取
     * Summary: 企业全量信息获取</p>
     */
    public QueryRtopCompanyResponse queryRtopCompanyEx(QueryRtopCompanyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取</p>
     */
    public QueryRtopRisklabelFilterResponse queryRtopRisklabelFilter(QueryRtopRisklabelFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelFilterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取</p>
     */
    public QueryRtopRisklabelFilterResponse queryRtopRisklabelFilterEx(QueryRtopRisklabelFilterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelFilterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步</p>
     */
    public PullRegtechNewsResponse pullRegtechNews(PullRegtechNewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullRegtechNewsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步</p>
     */
    public PullRegtechNewsResponse pullRegtechNewsEx(PullRegtechNewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullRegtechNewsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查看企业反馈
     * Summary: 查看企业反馈</p>
     */
    public QueryRtopCompanyFeedbackResponse queryRtopCompanyFeedback(QueryRtopCompanyFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyFeedbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查看企业反馈
     * Summary: 查看企业反馈</p>
     */
    public QueryRtopCompanyFeedbackResponse queryRtopCompanyFeedbackEx(QueryRtopCompanyFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyFeedbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询</p>
     */
    public QueryRtopCompanyAlarmResponse queryRtopCompanyAlarm(QueryRtopCompanyAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyAlarmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询</p>
     */
    public QueryRtopCompanyAlarmResponse queryRtopCompanyAlarmEx(QueryRtopCompanyAlarmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyAlarmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表</p>
     */
    public QueryRtopCompanyRiskyResponse queryRtopCompanyRisky(QueryRtopCompanyRiskyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表</p>
     */
    public QueryRtopCompanyRiskyResponse queryRtopCompanyRiskyEx(QueryRtopCompanyRiskyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业列表
     * Summary: 查询企业列表</p>
     */
    public QueryRtopCompanyListResponse queryRtopCompanyList(QueryRtopCompanyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业列表
     * Summary: 查询企业列表</p>
     */
    public QueryRtopCompanyListResponse queryRtopCompanyListEx(QueryRtopCompanyListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取</p>
     */
    public QueryRtopRisklabelConfigResponse queryRtopRisklabelConfig(QueryRtopRisklabelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelConfigEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取</p>
     */
    public QueryRtopRisklabelConfigResponse queryRtopRisklabelConfigEx(QueryRtopRisklabelConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询</p>
     */
    public QueryRtopCompanyRiskResponse queryRtopCompanyRisk(QueryRtopCompanyRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询</p>
     */
    public QueryRtopCompanyRiskResponse queryRtopCompanyRiskEx(QueryRtopCompanyRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查看重点关联企业
     * Summary: 重点关联企业</p>
     */
    public ListRtopCompanyRelatedResponse listRtopCompanyRelated(ListRtopCompanyRelatedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCompanyRelatedEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查看重点关联企业
     * Summary: 重点关联企业</p>
     */
    public ListRtopCompanyRelatedResponse listRtopCompanyRelatedEx(ListRtopCompanyRelatedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCompanyRelatedResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险标签图片查询
     * Summary: 风险标签图片查询</p>
     */
    public QueryRtopTagImageResponse queryRtopTagImage(QueryRtopTagImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopTagImageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险标签图片查询
     * Summary: 风险标签图片查询</p>
     */
    public QueryRtopTagImageResponse queryRtopTagImageEx(QueryRtopTagImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopTagImageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表</p>
     */
    public ListRtopStarCompanyResponse listRtopStarCompany(ListRtopStarCompanyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopStarCompanyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表</p>
     */
    public ListRtopStarCompanyResponse listRtopStarCompanyEx(ListRtopStarCompanyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopStarCompanyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)</p>
     */
    public QueryRpSecurityPolicyResponse queryRpSecurityPolicy(QueryRpSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)</p>
     */
    public QueryRpSecurityPolicyResponse queryRpSecurityPolicyEx(QueryRpSecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpSecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风控快照查询
     * Summary: 风控事件快照查询</p>
     */
    public QuerySnapshotEventResponse querySnapshotEvent(QuerySnapshotEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySnapshotEventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风控快照查询
     * Summary: 风控事件快照查询</p>
     */
    public QuerySnapshotEventResponse querySnapshotEventEx(QuerySnapshotEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.snapshot.event.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySnapshotEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量实时触达接口
     * Summary: 发起触达任务</p>
     */
    public ApplyTdiquickmsgRtBatchmarketingResponse applyTdiquickmsgRtBatchmarketing(ApplyTdiquickmsgRtBatchmarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTdiquickmsgRtBatchmarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量实时触达接口
     * Summary: 发起触达任务</p>
     */
    public ApplyTdiquickmsgRtBatchmarketingResponse applyTdiquickmsgRtBatchmarketingEx(ApplyTdiquickmsgRtBatchmarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.rt.batchmarketing.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTdiquickmsgRtBatchmarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起AI外呼
     * Summary: 发起AI外呼</p>
     */
    public ApplyTdiquickmsgRobotcallResponse applyTdiquickmsgRobotcall(ApplyTdiquickmsgRobotcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTdiquickmsgRobotcallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起AI外呼
     * Summary: 发起AI外呼</p>
     */
    public ApplyTdiquickmsgRobotcallResponse applyTdiquickmsgRobotcallEx(ApplyTdiquickmsgRobotcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.robotcall.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTdiquickmsgRobotcallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 短信状态回调接口
     * Summary: 短信状态回调接口</p>
     */
    public CallbackTdiquickmsgSmsResponse callbackTdiquickmsgSms(CallbackTdiquickmsgSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackTdiquickmsgSmsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 短信状态回调接口
     * Summary: 短信状态回调接口</p>
     */
    public CallbackTdiquickmsgSmsResponse callbackTdiquickmsgSmsEx(CallbackTdiquickmsgSmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.sms.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackTdiquickmsgSmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口</p>
     */
    public CallbackTdiquickmsgRobotcallResponse callbackTdiquickmsgRobotcall(CallbackTdiquickmsgRobotcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackTdiquickmsgRobotcallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口</p>
     */
    public CallbackTdiquickmsgRobotcallResponse callbackTdiquickmsgRobotcallEx(CallbackTdiquickmsgRobotcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.robotcall.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackTdiquickmsgRobotcallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上行短信回调
     * Summary: 上行短信回调</p>
     */
    public CallbackTdiquickmsgSmsUpResponse callbackTdiquickmsgSmsUp(CallbackTdiquickmsgSmsUpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackTdiquickmsgSmsUpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上行短信回调
     * Summary: 上行短信回调</p>
     */
    public CallbackTdiquickmsgSmsUpResponse callbackTdiquickmsgSmsUpEx(CallbackTdiquickmsgSmsUpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.sms.up.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackTdiquickmsgSmsUpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口</p>
     */
    public QueryTdiquickmsgRobotcallStatisticinfoResponse queryTdiquickmsgRobotcallStatisticinfo(QueryTdiquickmsgRobotcallStatisticinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTdiquickmsgRobotcallStatisticinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口</p>
     */
    public QueryTdiquickmsgRobotcallStatisticinfoResponse queryTdiquickmsgRobotcallStatisticinfoEx(QueryTdiquickmsgRobotcallStatisticinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.robotcall.statisticinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTdiquickmsgRobotcallStatisticinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送</p>
     */
    public PushTdiquickmsgBackflowEventResponse pushTdiquickmsgBackflowEvent(PushTdiquickmsgBackflowEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushTdiquickmsgBackflowEventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送</p>
     */
    public PushTdiquickmsgBackflowEventResponse pushTdiquickmsgBackflowEventEx(PushTdiquickmsgBackflowEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.backflow.event.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushTdiquickmsgBackflowEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送</p>
     */
    public PushTdiquickmsgBackflowJsondataResponse pushTdiquickmsgBackflowJsondata(PushTdiquickmsgBackflowJsondataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushTdiquickmsgBackflowJsondataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送</p>
     */
    public PushTdiquickmsgBackflowJsondataResponse pushTdiquickmsgBackflowJsondataEx(PushTdiquickmsgBackflowJsondataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdiquickmsg.backflow.jsondata.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushTdiquickmsgBackflowJsondataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: saas风险咨询，决策流模式
     * Summary: saas风险咨询</p>
     */
    public QueryTdisaasSecurityPolicyResponse queryTdisaasSecurityPolicy(QueryTdisaasSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTdisaasSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: saas风险咨询，决策流模式
     * Summary: saas风险咨询</p>
     */
    public QueryTdisaasSecurityPolicyResponse queryTdisaasSecurityPolicyEx(QueryTdisaasSecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdisaas.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTdisaasSecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: saas风险咨询（air引擎）
     * Summary: saas风险咨询（air引擎）</p>
     */
    public QueryAirsaasSecurityPolicyResponse queryAirsaasSecurityPolicy(QueryAirsaasSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAirsaasSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: saas风险咨询（air引擎）
     * Summary: saas风险咨询（air引擎）</p>
     */
    public QueryAirsaasSecurityPolicyResponse queryAirsaasSecurityPolicyEx(QueryAirsaasSecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.airsaas.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAirsaasSecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: saas风险咨询，决策流模式
     * Summary: saas风险咨询-air引擎</p>
     */
    public QueryTdisaasairSecurityPolicyResponse queryTdisaasairSecurityPolicy(QueryTdisaasairSecurityPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTdisaasairSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: saas风险咨询，决策流模式
     * Summary: saas风险咨询-air引擎</p>
     */
    public QueryTdisaasairSecurityPolicyResponse queryTdisaasairSecurityPolicyEx(QueryTdisaasairSecurityPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.tdisaasair.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTdisaasairSecurityPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传</p>
     */
    public UploadUmktParamsFileResponse uploadUmktParamsFile(UploadUmktParamsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadUmktParamsFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传</p>
     */
    public UploadUmktParamsFileResponse uploadUmktParamsFileEx(UploadUmktParamsFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.umkt.params.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadUmktParamsFileResponse uploadUmktParamsFileResponse = UploadUmktParamsFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadUmktParamsFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.params.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadUmktParamsFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾实时营销服务，支持批量
     * Summary: 营销盾实时营销服务</p>
     */
    public BatchqueryUmktRtMarketingResponse batchqueryUmktRtMarketing(BatchqueryUmktRtMarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktRtMarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾实时营销服务，支持批量
     * Summary: 营销盾实时营销服务</p>
     */
    public BatchqueryUmktRtMarketingResponse batchqueryUmktRtMarketingEx(BatchqueryUmktRtMarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.marketing.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktRtMarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 梦网富信投放事件通知
     * Summary: 梦网富信投放事件通知</p>
     */
    public SyncUmktRtEventresultResponse syncUmktRtEventresult(SyncUmktRtEventresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncUmktRtEventresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 梦网富信投放事件通知
     * Summary: 梦网富信投放事件通知</p>
     */
    public SyncUmktRtEventresultResponse syncUmktRtEventresultEx(SyncUmktRtEventresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.eventresult.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncUmktRtEventresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾场景租户信息上传or更新
     * Summary: 营销盾场景租户信息上传or更新</p>
     */
    public ImportUmktSceneUploadResponse importUmktSceneUpload(ImportUmktSceneUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importUmktSceneUploadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾场景租户信息上传or更新
     * Summary: 营销盾场景租户信息上传or更新</p>
     */
    public ImportUmktSceneUploadResponse importUmktSceneUploadEx(ImportUmktSceneUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.scene.upload.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportUmktSceneUploadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 富信贴尾实时圈客
     * Summary: 富信贴尾实时圈客</p>
     */
    public BatchqueryUmktRtTailmarketingResponse batchqueryUmktRtTailmarketing(BatchqueryUmktRtTailmarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktRtTailmarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 富信贴尾实时圈客
     * Summary: 富信贴尾实时圈客</p>
     */
    public BatchqueryUmktRtTailmarketingResponse batchqueryUmktRtTailmarketingEx(BatchqueryUmktRtTailmarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.tailmarketing.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktRtTailmarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时圈客场景策略测试
     * Summary: 实时圈客场景策略测试功能</p>
     */
    public QueryUmktScenestrategyTestResponse queryUmktScenestrategyTest(QueryUmktScenestrategyTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktScenestrategyTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时圈客场景策略测试
     * Summary: 实时圈客场景策略测试功能</p>
     */
    public QueryUmktScenestrategyTestResponse queryUmktScenestrategyTestEx(QueryUmktScenestrategyTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.scenestrategy.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktScenestrategyTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起AI外呼
     * Summary: 发起AI外呼</p>
     */
    public ApplyUmktRobotcallResponse applyUmktRobotcall(ApplyUmktRobotcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUmktRobotcallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起AI外呼
     * Summary: 发起AI外呼</p>
     */
    public ApplyUmktRobotcallResponse applyUmktRobotcallEx(ApplyUmktRobotcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.robotcall.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUmktRobotcallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾查询回执统计数据接口
     * Summary: 营销盾回执统计查询</p>
     */
    public QueryUmktDataaccessStatisticResponse queryUmktDataaccessStatistic(QueryUmktDataaccessStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktDataaccessStatisticEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾查询回执统计数据接口
     * Summary: 营销盾回执统计查询</p>
     */
    public QueryUmktDataaccessStatisticResponse queryUmktDataaccessStatisticEx(QueryUmktDataaccessStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.dataaccess.statistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktDataaccessStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线批量任务取消接口
     * Summary: 营销盾取消离线批量任务</p>
     */
    public CancelUmktDataaccessOfflinetaskResponse cancelUmktDataaccessOfflinetask(CancelUmktDataaccessOfflinetaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelUmktDataaccessOfflinetaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线批量任务取消接口
     * Summary: 营销盾取消离线批量任务</p>
     */
    public CancelUmktDataaccessOfflinetaskResponse cancelUmktDataaccessOfflinetaskEx(CancelUmktDataaccessOfflinetaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.dataaccess.offlinetask.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelUmktDataaccessOfflinetaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
     * Summary: 营销盾实时单一凭证营销接口</p>
     */
    public QueryUmktRtMarketingResponse queryUmktRtMarketing(QueryUmktRtMarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktRtMarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
     * Summary: 营销盾实时单一凭证营销接口</p>
     */
    public QueryUmktRtMarketingResponse queryUmktRtMarketingEx(QueryUmktRtMarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.marketing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktRtMarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾业务回流事件推送
     * Summary: 营销盾回流事件推送</p>
     */
    public PushUmktBackflowEventResponse pushUmktBackflowEvent(PushUmktBackflowEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUmktBackflowEventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾业务回流事件推送
     * Summary: 营销盾回流事件推送</p>
     */
    public PushUmktBackflowEventResponse pushUmktBackflowEventEx(PushUmktBackflowEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.backflow.event.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushUmktBackflowEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口</p>
     */
    public SendUmktCardsmsBatchResponse sendUmktCardsmsBatch(SendUmktCardsmsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendUmktCardsmsBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口</p>
     */
    public SendUmktCardsmsBatchResponse sendUmktCardsmsBatchEx(SendUmktCardsmsBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.cardsms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendUmktCardsmsBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询</p>
     */
    public QueryUmktCardsmsSupportResponse queryUmktCardsmsSupport(QueryUmktCardsmsSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktCardsmsSupportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询</p>
     */
    public QueryUmktCardsmsSupportResponse queryUmktCardsmsSupportEx(QueryUmktCardsmsSupportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.cardsms.support.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktCardsmsSupportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口</p>
     */
    public SendUmktTextsmsBatchResponse sendUmktTextsmsBatch(SendUmktTextsmsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendUmktTextsmsBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口</p>
     */
    public SendUmktTextsmsBatchResponse sendUmktTextsmsBatchEx(SendUmktTextsmsBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.textsms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendUmktTextsmsBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）</p>
     */
    public SendUmktDigitalsmsBatchResponse sendUmktDigitalsmsBatch(SendUmktDigitalsmsBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendUmktDigitalsmsBatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）</p>
     */
    public SendUmktDigitalsmsBatchResponse sendUmktDigitalsmsBatchEx(SendUmktDigitalsmsBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.digitalsms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendUmktDigitalsmsBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询</p>
     */
    public QueryUmktCpaassmsTemplateResponse queryUmktCpaassmsTemplate(QueryUmktCpaassmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktCpaassmsTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询</p>
     */
    public QueryUmktCpaassmsTemplateResponse queryUmktCpaassmsTemplateEx(QueryUmktCpaassmsTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.cpaassms.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktCpaassmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时混合批量营销圈客
     * Summary: 实时混合批量营销圈客</p>
     */
    public BatchqueryUmktRtMixedmarketingResponse batchqueryUmktRtMixedmarketing(BatchqueryUmktRtMixedmarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktRtMixedmarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 实时混合批量营销圈客
     * Summary: 实时混合批量营销圈客</p>
     */
    public BatchqueryUmktRtMixedmarketingResponse batchqueryUmktRtMixedmarketingEx(BatchqueryUmktRtMixedmarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.mixedmarketing.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktRtMixedmarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用营销盾空号检测
     * Summary: 调用营销盾空号检测</p>
     */
    public ApplyUmktPhonenumberstatusforsmsResponse applyUmktPhonenumberstatusforsms(ApplyUmktPhonenumberstatusforsmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUmktPhonenumberstatusforsmsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用营销盾空号检测
     * Summary: 调用营销盾空号检测</p>
     */
    public ApplyUmktPhonenumberstatusforsmsResponse applyUmktPhonenumberstatusforsmsEx(ApplyUmktPhonenumberstatusforsmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.phonenumberstatusforsms.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUmktPhonenumberstatusforsmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销实时topN圈客
     * Summary: 营销实时topN圈客</p>
     */
    public BatchqueryUmktRtTopnResponse batchqueryUmktRtTopn(BatchqueryUmktRtTopnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktRtTopnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销实时topN圈客
     * Summary: 营销实时topN圈客</p>
     */
    public BatchqueryUmktRtTopnResponse batchqueryUmktRtTopnEx(BatchqueryUmktRtTopnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.topn.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktRtTopnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口</p>
     */
    public QueryUmktRobotcallStatisticinfoResponse queryUmktRobotcallStatisticinfo(QueryUmktRobotcallStatisticinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktRobotcallStatisticinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口</p>
     */
    public QueryUmktRobotcallStatisticinfoResponse queryUmktRobotcallStatisticinfoEx(QueryUmktRobotcallStatisticinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.robotcall.statisticinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktRobotcallStatisticinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾租户场景信息查询
     * Summary: 营销盾租户场景信息查询</p>
     */
    public QueryUmktTenantActionplaninfoResponse queryUmktTenantActionplaninfo(QueryUmktTenantActionplaninfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktTenantActionplaninfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾租户场景信息查询
     * Summary: 营销盾租户场景信息查询</p>
     */
    public QueryUmktTenantActionplaninfoResponse queryUmktTenantActionplaninfoEx(QueryUmktTenantActionplaninfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.tenant.actionplaninfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktTenantActionplaninfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询ai外呼任务详情
     * Summary: 查询ai外呼任务详情</p>
     */
    public QueryUmktRobotcallDetailResponse queryUmktRobotcallDetail(QueryUmktRobotcallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktRobotcallDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询ai外呼任务详情
     * Summary: 查询ai外呼任务详情</p>
     */
    public QueryUmktRobotcallDetailResponse queryUmktRobotcallDetailEx(QueryUmktRobotcallDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.robotcall.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktRobotcallDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起触达营销任务 ---目前仅支持文本短信
     * Summary: 发起触达营销任务</p>
     */
    public ApplyUmktRealtimemarketingResponse applyUmktRealtimemarketing(ApplyUmktRealtimemarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUmktRealtimemarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起触达营销任务 ---目前仅支持文本短信
     * Summary: 发起触达营销任务</p>
     */
    public ApplyUmktRealtimemarketingResponse applyUmktRealtimemarketingEx(ApplyUmktRealtimemarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.realtimemarketing.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUmktRealtimemarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量实时策略触达
     * Summary: 批量实时策略触达</p>
     */
    public ApplyUmktRtBatchmarketingResponse applyUmktRtBatchmarketing(ApplyUmktRtBatchmarketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUmktRtBatchmarketingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量实时策略触达
     * Summary: 批量实时策略触达</p>
     */
    public ApplyUmktRtBatchmarketingResponse applyUmktRtBatchmarketingEx(ApplyUmktRtBatchmarketingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.batchmarketing.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUmktRtBatchmarketingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口</p>
     */
    public CallbackUmktRobotcallResponse callbackUmktRobotcall(CallbackUmktRobotcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackUmktRobotcallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口</p>
     */
    public CallbackUmktRobotcallResponse callbackUmktRobotcallEx(CallbackUmktRobotcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.robotcall.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackUmktRobotcallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾上行短信回调接口
     * Summary: 营销盾上行短信回调</p>
     */
    public CallbackUmktSmsUpResponse callbackUmktSmsUp(CallbackUmktSmsUpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackUmktSmsUpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾上行短信回调接口
     * Summary: 营销盾上行短信回调</p>
     */
    public CallbackUmktSmsUpResponse callbackUmktSmsUpEx(CallbackUmktSmsUpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.sms.up.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackUmktSmsUpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾短信状态回调接口
     * Summary: 营销盾短信状态回调</p>
     */
    public CallbackUmktSmsReportResponse callbackUmktSmsReport(CallbackUmktSmsReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackUmktSmsReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾短信状态回调接口
     * Summary: 营销盾短信状态回调</p>
     */
    public CallbackUmktSmsReportResponse callbackUmktSmsReportEx(CallbackUmktSmsReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.sms.report.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackUmktSmsReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询租户外呼策略
     * Summary: 营销盾租户场景批量信息查询 </p>
     */
    public BatchqueryUmktTenantActionplaninfoResponse batchqueryUmktTenantActionplaninfo(BatchqueryUmktTenantActionplaninfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktTenantActionplaninfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询租户外呼策略
     * Summary: 营销盾租户场景批量信息查询 </p>
     */
    public BatchqueryUmktTenantActionplaninfoResponse batchqueryUmktTenantActionplaninfoEx(BatchqueryUmktTenantActionplaninfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.tenant.actionplaninfo.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktTenantActionplaninfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
     * (已下线)
     * Summary: 营销盾外呼详情查询接口</p>
     */
    public BatchqueryUmktRobotcallDetailResponse batchqueryUmktRobotcallDetail(BatchqueryUmktRobotcallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktRobotcallDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
     * (已下线)
     * Summary: 营销盾外呼详情查询接口</p>
     */
    public BatchqueryUmktRobotcallDetailResponse batchqueryUmktRobotcallDetailEx(BatchqueryUmktRobotcallDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.robotcall.detail.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktRobotcallDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾查询外呼策略详情
     * Summary: 营销盾查询外呼策略详情</p>
     */
    public BatchqueryUmktActionplanDetailResponse batchqueryUmktActionplanDetail(BatchqueryUmktActionplanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktActionplanDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾查询外呼策略详情
     * Summary: 营销盾查询外呼策略详情</p>
     */
    public BatchqueryUmktActionplanDetailResponse batchqueryUmktActionplanDetailEx(BatchqueryUmktActionplanDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.actionplan.detail.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktActionplanDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾通用回流推送服务
     * Summary: 营销盾通用回流推送服务</p>
     */
    public PushRiskplusUmktCommonbackflowResponse pushRiskplusUmktCommonbackflow(PushRiskplusUmktCommonbackflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRiskplusUmktCommonbackflowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾通用回流推送服务
     * Summary: 营销盾通用回流推送服务</p>
     */
    public PushRiskplusUmktCommonbackflowResponse pushRiskplusUmktCommonbackflowEx(PushRiskplusUmktCommonbackflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.riskplus.umkt.commonbackflow.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRiskplusUmktCommonbackflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾通用数据推送服务
     * Summary: 营销盾通用数据推送服务</p>
     */
    public PushUmktCommonDataResponse pushUmktCommonData(PushUmktCommonDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUmktCommonDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾通用数据推送服务
     * Summary: 营销盾通用数据推送服务</p>
     */
    public PushUmktCommonDataResponse pushUmktCommonDataEx(PushUmktCommonDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.common.data.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushUmktCommonDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾客群推送服务
     * Summary: 营销盾客群推送服务</p>
     */
    public PushUmktCustomerGroupResponse pushUmktCustomerGroup(PushUmktCustomerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUmktCustomerGroupEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾客群推送服务
     * Summary: 营销盾客群推送服务</p>
     */
    public PushUmktCustomerGroupResponse pushUmktCustomerGroupEx(PushUmktCustomerGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.customer.group.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushUmktCustomerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询</p>
     */
    public BatchqueryUmktTaskDetailResponse batchqueryUmktTaskDetail(BatchqueryUmktTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktTaskDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询</p>
     */
    public BatchqueryUmktTaskDetailResponse batchqueryUmktTaskDetailEx(BatchqueryUmktTaskDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.task.detail.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktTaskDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾数据回流推送，用于客户定制json数据
     * Summary: 营销盾数据回流json格式推送</p>
     */
    public PushUmktBackflowJsondataResponse pushUmktBackflowJsondata(PushUmktBackflowJsondataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUmktBackflowJsondataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾数据回流推送，用于客户定制json数据
     * Summary: 营销盾数据回流json格式推送</p>
     */
    public PushUmktBackflowJsondataResponse pushUmktBackflowJsondataEx(PushUmktBackflowJsondataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.backflow.jsondata.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushUmktBackflowJsondataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾卡短解析服务能力提供接口
     * Summary: 营销盾卡短解析服务接口</p>
     */
    public QueryUmktCardsmsAnalysisResponse queryUmktCardsmsAnalysis(QueryUmktCardsmsAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktCardsmsAnalysisEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾卡短解析服务能力提供接口
     * Summary: 营销盾卡短解析服务接口</p>
     */
    public QueryUmktCardsmsAnalysisResponse queryUmktCardsmsAnalysisEx(QueryUmktCardsmsAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.cardsms.analysis.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktCardsmsAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线圈客文件导入
     * Summary: 营销盾离线圈客文件导入</p>
     */
    public UploadUmktOfflinedecisionResponse uploadUmktOfflinedecision(UploadUmktOfflinedecisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadUmktOfflinedecisionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线圈客文件导入
     * Summary: 营销盾离线圈客文件导入</p>
     */
    public UploadUmktOfflinedecisionResponse uploadUmktOfflinedecisionEx(UploadUmktOfflinedecisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.umkt.offlinedecision.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadUmktOfflinedecisionResponse uploadUmktOfflinedecisionResponse = UploadUmktOfflinedecisionResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadUmktOfflinedecisionResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.offlinedecision.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadUmktOfflinedecisionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾查询可拉取圈客结果的计划集合
     * Summary: 营销盾查询可拉取圈客结果的计划集合</p>
     */
    public QueryUmktOfflinedecisionResultResponse queryUmktOfflinedecisionResult(QueryUmktOfflinedecisionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktOfflinedecisionResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾查询可拉取圈客结果的计划集合
     * Summary: 营销盾查询可拉取圈客结果的计划集合</p>
     */
    public QueryUmktOfflinedecisionResultResponse queryUmktOfflinedecisionResultEx(QueryUmktOfflinedecisionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.offlinedecision.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktOfflinedecisionResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线圈客结果文件拉取
     * Summary: 营销盾离线圈客结果文件拉取</p>
     */
    public DownloadUmktOfflinedecisionResultResponse downloadUmktOfflinedecisionResult(DownloadUmktOfflinedecisionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadUmktOfflinedecisionResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线圈客结果文件拉取
     * Summary: 营销盾离线圈客结果文件拉取</p>
     */
    public DownloadUmktOfflinedecisionResultResponse downloadUmktOfflinedecisionResultEx(DownloadUmktOfflinedecisionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.offlinedecision.result.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadUmktOfflinedecisionResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 包含离线圈客关联计划和任务状态详情
     * Summary: 营销盾离线圈客计划执行详情 </p>
     */
    public QueryUmktOfflinedecisionPlandetailsResponse queryUmktOfflinedecisionPlandetails(QueryUmktOfflinedecisionPlandetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktOfflinedecisionPlandetailsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 包含离线圈客关联计划和任务状态详情
     * Summary: 营销盾离线圈客计划执行详情 </p>
     */
    public QueryUmktOfflinedecisionPlandetailsResponse queryUmktOfflinedecisionPlandetailsEx(QueryUmktOfflinedecisionPlandetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.offlinedecision.plandetails.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktOfflinedecisionPlandetailsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线圈投一体文件上传
     * Summary: 营销盾离线圈投一体文件上传</p>
     */
    public UploadUmktOfflineImportrecordResponse uploadUmktOfflineImportrecord(UploadUmktOfflineImportrecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadUmktOfflineImportrecordEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 营销盾离线圈投一体文件上传
     * Summary: 营销盾离线圈投一体文件上传</p>
     */
    public UploadUmktOfflineImportrecordResponse uploadUmktOfflineImportrecordEx(UploadUmktOfflineImportrecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.umkt.offline.importrecord.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadUmktOfflineImportrecordResponse uploadUmktOfflineImportrecordResponse = UploadUmktOfflineImportrecordResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadUmktOfflineImportrecordResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.offline.importrecord.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadUmktOfflineImportrecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 圈投一体圈客结果文件url获取
     * Summary: 圈投一体圈客结果文件url获取</p>
     */
    public DownloadUmktOfflineCampaignResponse downloadUmktOfflineCampaign(DownloadUmktOfflineCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadUmktOfflineCampaignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 圈投一体圈客结果文件url获取
     * Summary: 圈投一体圈客结果文件url获取</p>
     */
    public DownloadUmktOfflineCampaignResponse downloadUmktOfflineCampaignEx(DownloadUmktOfflineCampaignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.offline.campaign.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadUmktOfflineCampaignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
