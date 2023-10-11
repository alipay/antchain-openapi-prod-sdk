// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models.*;
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
                    new TeaPair("_prod_code", "ak_2abe765c32934341bd9bb6cc1c8ff589"),
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
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncAntchainAtoTradeResponse syncAntchainAtoTrade(SyncAntchainAtoTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeEx(request, headers, runtime);
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncAntchainAtoTradeResponse syncAntchainAtoTradeEx(SyncAntchainAtoTradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeResponse());
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetAntchainAtoTradeResponse getAntchainAtoTrade(GetAntchainAtoTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeEx(request, headers, runtime);
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetAntchainAtoTradeResponse getAntchainAtoTradeEx(GetAntchainAtoTradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeResponse());
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateAntchainAtoRealpersonFacevrfResponse createAntchainAtoRealpersonFacevrf(CreateAntchainAtoRealpersonFacevrfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateAntchainAtoRealpersonFacevrfResponse createAntchainAtoRealpersonFacevrfEx(CreateAntchainAtoRealpersonFacevrfRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoRealpersonFacevrfResponse());
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryAntchainAtoRealpersonFacevrfResponse queryAntchainAtoRealpersonFacevrf(QueryAntchainAtoRealpersonFacevrfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryAntchainAtoRealpersonFacevrfResponse queryAntchainAtoRealpersonFacevrfEx(QueryAntchainAtoRealpersonFacevrfRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoRealpersonFacevrfResponse());
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllAntchainAtoSignTemplateResponse allAntchainAtoSignTemplate(AllAntchainAtoSignTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAntchainAtoSignTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllAntchainAtoSignTemplateResponse allAntchainAtoSignTemplateEx(AllAntchainAtoSignTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAntchainAtoSignTemplateResponse());
    }

    /**
     * Description: 提交电子合同的签署流程
     * Summary: 提交电子合同的签署流程
     */
    public SubmitAntchainAtoSignFlowResponse submitAntchainAtoSignFlow(SubmitAntchainAtoSignFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 提交电子合同的签署流程
     * Summary: 提交电子合同的签署流程
     */
    public SubmitAntchainAtoSignFlowResponse submitAntchainAtoSignFlowEx(SubmitAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainAtoSignFlowResponse());
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetAntchainAtoSignFlowResponse getAntchainAtoSignFlow(GetAntchainAtoSignFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetAntchainAtoSignFlowResponse getAntchainAtoSignFlowEx(GetAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoSignFlowResponse());
    }

    /**
     * Description: 分账流水同步
     * Summary: 分账流水同步
     */
    public SyncAntchainAtoFundSplittingResponse syncAntchainAtoFundSplitting(SyncAntchainAtoFundSplittingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundSplittingEx(request, headers, runtime);
    }

    /**
     * Description: 分账流水同步
     * Summary: 分账流水同步
     */
    public SyncAntchainAtoFundSplittingResponse syncAntchainAtoFundSplittingEx(SyncAntchainAtoFundSplittingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundSplittingResponse());
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 订单融资结果同步
     */
    public SyncAntchainAtoFundOrderfinancialResponse syncAntchainAtoFundOrderfinancial(SyncAntchainAtoFundOrderfinancialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundOrderfinancialEx(request, headers, runtime);
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 订单融资结果同步
     */
    public SyncAntchainAtoFundOrderfinancialResponse syncAntchainAtoFundOrderfinancialEx(SyncAntchainAtoFundOrderfinancialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundOrderfinancialResponse());
    }

    /**
     * Description: 将返回订单实人认证通过后的、商家同步的还款计划
     * Summary: 获取商家同步的还款计划
     */
    public GetAntchainAtoFundRepaymentplanResponse getAntchainAtoFundRepaymentplan(GetAntchainAtoFundRepaymentplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundRepaymentplanEx(request, headers, runtime);
    }

    /**
     * Description: 将返回订单实人认证通过后的、商家同步的还款计划
     * Summary: 获取商家同步的还款计划
     */
    public GetAntchainAtoFundRepaymentplanResponse getAntchainAtoFundRepaymentplanEx(GetAntchainAtoFundRepaymentplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.repaymentplan.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundRepaymentplanResponse());
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 同步租赁订单的代扣协议
     */
    public SyncAntchainAtoFundWithholdingcontractResponse syncAntchainAtoFundWithholdingcontract(SyncAntchainAtoFundWithholdingcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundWithholdingcontractEx(request, headers, runtime);
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 同步租赁订单的代扣协议
     */
    public SyncAntchainAtoFundWithholdingcontractResponse syncAntchainAtoFundWithholdingcontractEx(SyncAntchainAtoFundWithholdingcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundWithholdingcontractResponse());
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 同步订单还款履约信息
     */
    public SyncAntchainAtoFundOrderfulfillmentResponse syncAntchainAtoFundOrderfulfillment(SyncAntchainAtoFundOrderfulfillmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 同步订单还款履约信息
     */
    public SyncAntchainAtoFundOrderfulfillmentResponse syncAntchainAtoFundOrderfulfillmentEx(SyncAntchainAtoFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundOrderfulfillmentResponse());
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 获取订单的履约信息
     */
    public GetAntchainAtoFundOrderfulfillmentResponse getAntchainAtoFundOrderfulfillment(GetAntchainAtoFundOrderfulfillmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 获取订单的履约信息
     */
    public GetAntchainAtoFundOrderfulfillmentResponse getAntchainAtoFundOrderfulfillmentEx(GetAntchainAtoFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundOrderfulfillmentResponse());
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约
     */
    public CreateAntchainAtoWithholdSignResponse createAntchainAtoWithholdSign(CreateAntchainAtoWithholdSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约
     */
    public CreateAntchainAtoWithholdSignResponse createAntchainAtoWithholdSignEx(CreateAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoWithholdSignResponse());
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryAntchainAtoWithholdSignResponse queryAntchainAtoWithholdSign(QueryAntchainAtoWithholdSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryAntchainAtoWithholdSignResponse queryAntchainAtoWithholdSignEx(QueryAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdSignResponse());
    }

    /**
     * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
     * Summary: 同步商家的订单信息
     */
    public SyncAntchainAtoTradeFullResponse syncAntchainAtoTradeFull(SyncAntchainAtoTradeFullRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeFullEx(request, headers, runtime);
    }

    /**
     * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
     * Summary: 同步商家的订单信息
     */
    public SyncAntchainAtoTradeFullResponse syncAntchainAtoTradeFullEx(SyncAntchainAtoTradeFullRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.full.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeFullResponse());
    }
}
