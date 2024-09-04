// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models.*;

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
                    new TeaPair("sdk_version", "1.3.7"),
                    new TeaPair("_prod_code", "ak_195dff03d395462ea294bafdba69df3f"),
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
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncAntchainAtoTradeResponse syncAntchainAtoTrade(SyncAntchainAtoTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeEx(request, headers, runtime);
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncAntchainAtoTradeResponse syncAntchainAtoTradeEx(SyncAntchainAtoTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeResponse());
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetAntchainAtoTradeResponse getAntchainAtoTrade(GetAntchainAtoTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeEx(request, headers, runtime);
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetAntchainAtoTradeResponse getAntchainAtoTradeEx(GetAntchainAtoTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeResponse());
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateAntchainAtoRealpersonFacevrfResponse createAntchainAtoRealpersonFacevrf(CreateAntchainAtoRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateAntchainAtoRealpersonFacevrfResponse createAntchainAtoRealpersonFacevrfEx(CreateAntchainAtoRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoRealpersonFacevrfResponse());
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryAntchainAtoRealpersonFacevrfResponse queryAntchainAtoRealpersonFacevrf(QueryAntchainAtoRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryAntchainAtoRealpersonFacevrfResponse queryAntchainAtoRealpersonFacevrfEx(QueryAntchainAtoRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoRealpersonFacevrfResponse());
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllAntchainAtoSignTemplateResponse allAntchainAtoSignTemplate(AllAntchainAtoSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAntchainAtoSignTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllAntchainAtoSignTemplateResponse allAntchainAtoSignTemplateEx(AllAntchainAtoSignTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAntchainAtoSignTemplateResponse());
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）
     */
    public SubmitAntchainAtoSignFlowResponse submitAntchainAtoSignFlow(SubmitAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）
     */
    public SubmitAntchainAtoSignFlowResponse submitAntchainAtoSignFlowEx(SubmitAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainAtoSignFlowResponse());
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetAntchainAtoSignFlowResponse getAntchainAtoSignFlow(GetAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetAntchainAtoSignFlowResponse getAntchainAtoSignFlowEx(GetAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoSignFlowResponse());
    }

    /**
     * Description: 代扣签约创建
     * Summary: 代扣签约
     */
    public CreateAntchainAtoWithholdSignResponse createAntchainAtoWithholdSign(CreateAntchainAtoWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约创建
     * Summary: 代扣签约
     */
    public CreateAntchainAtoWithholdSignResponse createAntchainAtoWithholdSignEx(CreateAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoWithholdSignResponse());
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryAntchainAtoWithholdSignResponse queryAntchainAtoWithholdSign(QueryAntchainAtoWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryAntchainAtoWithholdSignResponse queryAntchainAtoWithholdSignEx(QueryAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdSignResponse());
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作
     */
    public AuthAntchainAtoSignFlowResponse authAntchainAtoSignFlow(AuthAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作
     */
    public AuthAntchainAtoSignFlowResponse authAntchainAtoSignFlowEx(AuthAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAntchainAtoSignFlowResponse());
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑
     */
    public UnbindAntchainAtoWithholdSignResponse unbindAntchainAtoWithholdSign(UnbindAntchainAtoWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑
     */
    public UnbindAntchainAtoWithholdSignResponse unbindAntchainAtoWithholdSignEx(UnbindAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindAntchainAtoWithholdSignResponse());
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划
     */
    public CancelAntchainAtoWithholdPlanResponse cancelAntchainAtoWithholdPlan(CancelAntchainAtoWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划
     */
    public CancelAntchainAtoWithholdPlanResponse cancelAntchainAtoWithholdPlanEx(CancelAntchainAtoWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoWithholdPlanResponse());
    }

    /**
     * Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消
     */
    public RepayAntchainAtoWithholdPlanResponse repayAntchainAtoWithholdPlan(RepayAntchainAtoWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayAntchainAtoWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消
     */
    public RepayAntchainAtoWithholdPlanResponse repayAntchainAtoWithholdPlanEx(RepayAntchainAtoWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayAntchainAtoWithholdPlanResponse());
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）
     */
    public SubmitAntchainAtoFrontSignResponse submitAntchainAtoFrontSign(SubmitAntchainAtoFrontSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainAtoFrontSignEx(request, headers, runtime);
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）
     */
    public SubmitAntchainAtoFrontSignResponse submitAntchainAtoFrontSignEx(SubmitAntchainAtoFrontSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainAtoFrontSignResponse());
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建
     */
    public SyncAntchainAtoFrontTradeResponse syncAntchainAtoFrontTrade(SyncAntchainAtoFrontTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFrontTradeEx(request, headers, runtime);
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建
     */
    public SyncAntchainAtoFrontTradeResponse syncAntchainAtoFrontTradeEx(SyncAntchainAtoFrontTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFrontTradeResponse());
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试
     */
    public RetryAntchainAtoWithholdPlanResponse retryAntchainAtoWithholdPlan(RetryAntchainAtoWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryAntchainAtoWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试
     */
    public RetryAntchainAtoWithholdPlanResponse retryAntchainAtoWithholdPlanEx(RetryAntchainAtoWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryAntchainAtoWithholdPlanResponse());
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认
     */
    public ConfirmAntchainAtoWithholdSignasyncunsignResponse confirmAntchainAtoWithholdSignasyncunsign(ConfirmAntchainAtoWithholdSignasyncunsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmAntchainAtoWithholdSignasyncunsignEx(request, headers, runtime);
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认
     */
    public ConfirmAntchainAtoWithholdSignasyncunsignResponse confirmAntchainAtoWithholdSignasyncunsignEx(ConfirmAntchainAtoWithholdSignasyncunsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmAntchainAtoWithholdSignasyncunsignResponse());
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口
     */
    public UploadAntchainAtoFundFlowResponse uploadAntchainAtoFundFlow(UploadAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口
     */
    public UploadAntchainAtoFundFlowResponse uploadAntchainAtoFundFlowEx(UploadAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.fund.flow.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadAntchainAtoFundFlowResponse uploadAntchainAtoFundFlowResponse = UploadAntchainAtoFundFlowResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadAntchainAtoFundFlowResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoFundFlowResponse());
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口
     */
    public GetAntchainAtoFundFlowResponse getAntchainAtoFundFlow(GetAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口
     */
    public GetAntchainAtoFundFlowResponse getAntchainAtoFundFlowEx(GetAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundFlowResponse());
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知
     */
    public RefuseAntchainAtoFundFlowResponse refuseAntchainAtoFundFlow(RefuseAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知
     */
    public RefuseAntchainAtoFundFlowResponse refuseAntchainAtoFundFlowEx(RefuseAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseAntchainAtoFundFlowResponse());
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口
     */
    public AuthAntchainAtoFundFlowResponse authAntchainAtoFundFlow(AuthAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口
     */
    public AuthAntchainAtoFundFlowResponse authAntchainAtoFundFlowEx(AuthAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAntchainAtoFundFlowResponse());
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建
     */
    public CreateAntchainAtoWithholdActivepayResponse createAntchainAtoWithholdActivepay(CreateAntchainAtoWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建
     */
    public CreateAntchainAtoWithholdActivepayResponse createAntchainAtoWithholdActivepayEx(CreateAntchainAtoWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoWithholdActivepayResponse());
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询
     */
    public QueryAntchainAtoWithholdActivepayResponse queryAntchainAtoWithholdActivepay(QueryAntchainAtoWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询
     */
    public QueryAntchainAtoWithholdActivepayResponse queryAntchainAtoWithholdActivepayEx(QueryAntchainAtoWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdActivepayResponse());
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消
     */
    public CancelAntchainAtoWithholdActivepayResponse cancelAntchainAtoWithholdActivepay(CancelAntchainAtoWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消
     */
    public CancelAntchainAtoWithholdActivepayResponse cancelAntchainAtoWithholdActivepayEx(CancelAntchainAtoWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoWithholdActivepayResponse());
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消
     */
    public CancelAntchainAtoFundPlanResponse cancelAntchainAtoFundPlan(CancelAntchainAtoFundPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoFundPlanEx(request, headers, runtime);
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消
     */
    public CancelAntchainAtoFundPlanResponse cancelAntchainAtoFundPlanEx(CancelAntchainAtoFundPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoFundPlanResponse());
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调
     */
    public CallbackAntchainAtoFundNotifyResponse callbackAntchainAtoFundNotify(CallbackAntchainAtoFundNotifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackAntchainAtoFundNotifyEx(request, headers, runtime);
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调
     */
    public CallbackAntchainAtoFundNotifyResponse callbackAntchainAtoFundNotifyEx(CallbackAntchainAtoFundNotifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackAntchainAtoFundNotifyResponse());
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口
     */
    public SyncAntchainAtoTradeFinanceloanapplyResponse syncAntchainAtoTradeFinanceloanapply(SyncAntchainAtoTradeFinanceloanapplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeFinanceloanapplyEx(request, headers, runtime);
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口
     */
    public SyncAntchainAtoTradeFinanceloanapplyResponse syncAntchainAtoTradeFinanceloanapplyEx(SyncAntchainAtoTradeFinanceloanapplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeFinanceloanapplyResponse());
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询
     */
    public GetAntchainAtoTradeMerchantfulfillmentResponse getAntchainAtoTradeMerchantfulfillment(GetAntchainAtoTradeMerchantfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeMerchantfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询
     */
    public GetAntchainAtoTradeMerchantfulfillmentResponse getAntchainAtoTradeMerchantfulfillmentEx(GetAntchainAtoTradeMerchantfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeMerchantfulfillmentResponse());
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步
     */
    public SyncAntchainAtoFundMerchantpromiseResponse syncAntchainAtoFundMerchantpromise(SyncAntchainAtoFundMerchantpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundMerchantpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步
     */
    public SyncAntchainAtoFundMerchantpromiseResponse syncAntchainAtoFundMerchantpromiseEx(SyncAntchainAtoFundMerchantpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundMerchantpromiseResponse());
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步
     */
    public SyncAntchainAtoFundFinanceloanresultsResponse syncAntchainAtoFundFinanceloanresults(SyncAntchainAtoFundFinanceloanresultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundFinanceloanresultsEx(request, headers, runtime);
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步
     */
    public SyncAntchainAtoFundFinanceloanresultsResponse syncAntchainAtoFundFinanceloanresultsEx(SyncAntchainAtoFundFinanceloanresultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundFinanceloanresultsResponse());
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺
     */
    public GetAntchainAtoFundUserpromiseResponse getAntchainAtoFundUserpromise(GetAntchainAtoFundUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundUserpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺
     */
    public GetAntchainAtoFundUserpromiseResponse getAntchainAtoFundUserpromiseEx(GetAntchainAtoFundUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundUserpromiseResponse());
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）
     */
    public GetAntchainAtoTradeUserperformanceResponse getAntchainAtoTradeUserperformance(GetAntchainAtoTradeUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeUserperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）
     */
    public GetAntchainAtoTradeUserperformanceResponse getAntchainAtoTradeUserperformanceEx(GetAntchainAtoTradeUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeUserperformanceResponse());
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetAntchainAtoTradeMerchantperformanceResponse getAntchainAtoTradeMerchantperformance(GetAntchainAtoTradeMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetAntchainAtoTradeMerchantperformanceResponse getAntchainAtoTradeMerchantperformanceEx(GetAntchainAtoTradeMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeMerchantperformanceResponse());
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）
     */
    public GetAntchainAtoFundUserperformanceResponse getAntchainAtoFundUserperformance(GetAntchainAtoFundUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundUserperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）
     */
    public GetAntchainAtoFundUserperformanceResponse getAntchainAtoFundUserperformanceEx(GetAntchainAtoFundUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundUserperformanceResponse());
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetAntchainAtoFundMerchantperformanceResponse getAntchainAtoFundMerchantperformance(GetAntchainAtoFundMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetAntchainAtoFundMerchantperformanceResponse getAntchainAtoFundMerchantperformanceEx(GetAntchainAtoFundMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundMerchantperformanceResponse());
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情
     */
    public GetAntchainAtoFundOrderfullinfoResponse getAntchainAtoFundOrderfullinfo(GetAntchainAtoFundOrderfullinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundOrderfullinfoEx(request, headers, runtime);
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情
     */
    public GetAntchainAtoFundOrderfullinfoResponse getAntchainAtoFundOrderfullinfoEx(GetAntchainAtoFundOrderfullinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundOrderfullinfoResponse());
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口
     */
    public UploadAntchainAtoSignFlowResponse uploadAntchainAtoSignFlow(UploadAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口
     */
    public UploadAntchainAtoSignFlowResponse uploadAntchainAtoSignFlowEx(UploadAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.sign.flow.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadAntchainAtoSignFlowResponse uploadAntchainAtoSignFlowResponse = UploadAntchainAtoSignFlowResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadAntchainAtoSignFlowResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoSignFlowResponse());
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请
     */
    public CreateAntchainAtoWithholdRefundResponse createAntchainAtoWithholdRefund(CreateAntchainAtoWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoWithholdRefundEx(request, headers, runtime);
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请
     */
    public CreateAntchainAtoWithholdRefundResponse createAntchainAtoWithholdRefundEx(CreateAntchainAtoWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoWithholdRefundResponse());
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询
     */
    public QueryAntchainAtoWithholdRefundResponse queryAntchainAtoWithholdRefund(QueryAntchainAtoWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdRefundEx(request, headers, runtime);
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询
     */
    public QueryAntchainAtoWithholdRefundResponse queryAntchainAtoWithholdRefundEx(QueryAntchainAtoWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdRefundResponse());
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改
     */
    public UpdateAntchainAtoTradeUserpromiseResponse updateAntchainAtoTradeUserpromise(UpdateAntchainAtoTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainAtoTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改
     */
    public UpdateAntchainAtoTradeUserpromiseResponse updateAntchainAtoTradeUserpromiseEx(UpdateAntchainAtoTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainAtoTradeUserpromiseResponse());
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口
     */
    public NotifyAntchainAtoFundFlowResponse notifyAntchainAtoFundFlow(NotifyAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口
     */
    public NotifyAntchainAtoFundFlowResponse notifyAntchainAtoFundFlowEx(NotifyAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyAntchainAtoFundFlowResponse());
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件
     */
    public SyncAntchainAtoFrontIndirectorderResponse syncAntchainAtoFrontIndirectorder(SyncAntchainAtoFrontIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFrontIndirectorderEx(request, headers, runtime);
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件
     */
    public SyncAntchainAtoFrontIndirectorderResponse syncAntchainAtoFrontIndirectorderEx(SyncAntchainAtoFrontIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFrontIndirectorderResponse());
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件
     */
    public SyncAntchainAtoTradeIndirectorderResponse syncAntchainAtoTradeIndirectorder(SyncAntchainAtoTradeIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeIndirectorderEx(request, headers, runtime);
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件
     */
    public SyncAntchainAtoTradeIndirectorderResponse syncAntchainAtoTradeIndirectorderEx(SyncAntchainAtoTradeIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeIndirectorderResponse());
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻
     */
    public RegisterAntchainAtoMerchantexpandMerchantResponse registerAntchainAtoMerchantexpandMerchant(RegisterAntchainAtoMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻
     */
    public RegisterAntchainAtoMerchantexpandMerchantResponse registerAntchainAtoMerchantexpandMerchantEx(RegisterAntchainAtoMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterAntchainAtoMerchantexpandMerchantResponse());
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接
     */
    public UploadAntchainAtoMerchantexpandFileResponse uploadAntchainAtoMerchantexpandFile(UploadAntchainAtoMerchantexpandFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoMerchantexpandFileEx(request, headers, runtime);
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接
     */
    public UploadAntchainAtoMerchantexpandFileResponse uploadAntchainAtoMerchantexpandFileEx(UploadAntchainAtoMerchantexpandFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoMerchantexpandFileResponse());
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询
     */
    public QueryAntchainAtoMerchantexpandMerchantResponse queryAntchainAtoMerchantexpandMerchant(QueryAntchainAtoMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询
     */
    public QueryAntchainAtoMerchantexpandMerchantResponse queryAntchainAtoMerchantexpandMerchantEx(QueryAntchainAtoMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoMerchantexpandMerchantResponse());
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传
     */
    public UploadAntchainAtoSignTemplateResponse uploadAntchainAtoSignTemplate(UploadAntchainAtoSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoSignTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传
     */
    public UploadAntchainAtoSignTemplateResponse uploadAntchainAtoSignTemplateEx(UploadAntchainAtoSignTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.sign.template.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadAntchainAtoSignTemplateResponse uploadAntchainAtoSignTemplateResponse = UploadAntchainAtoSignTemplateResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadAntchainAtoSignTemplateResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoSignTemplateResponse());
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传
     */
    public UploadAntchainAtoFundCreditResponse uploadAntchainAtoFundCredit(UploadAntchainAtoFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoFundCreditEx(request, headers, runtime);
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传
     */
    public UploadAntchainAtoFundCreditResponse uploadAntchainAtoFundCreditEx(UploadAntchainAtoFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoFundCreditResponse());
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传
     */
    public UploadAntchainAtoSignCreditResponse uploadAntchainAtoSignCredit(UploadAntchainAtoSignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoSignCreditEx(request, headers, runtime);
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传
     */
    public UploadAntchainAtoSignCreditResponse uploadAntchainAtoSignCreditEx(UploadAntchainAtoSignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoSignCreditResponse());
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询
     */
    public QueryAntchainAtoFundCreditResponse queryAntchainAtoFundCredit(QueryAntchainAtoFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoFundCreditEx(request, headers, runtime);
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询
     */
    public QueryAntchainAtoFundCreditResponse queryAntchainAtoFundCreditEx(QueryAntchainAtoFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoFundCreditResponse());
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询
     */
    public QueryAntchainAtoSignCreditResponse queryAntchainAtoSignCredit(QueryAntchainAtoSignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoSignCreditEx(request, headers, runtime);
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询
     */
    public QueryAntchainAtoSignCreditResponse queryAntchainAtoSignCreditEx(QueryAntchainAtoSignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoSignCreditResponse());
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改
     */
    public UpdateAntchainAtoMerchantexpandMerchantResponse updateAntchainAtoMerchantexpandMerchant(UpdateAntchainAtoMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改
     */
    public UpdateAntchainAtoMerchantexpandMerchantResponse updateAntchainAtoMerchantexpandMerchantEx(UpdateAntchainAtoMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainAtoMerchantexpandMerchantResponse());
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程
     */
    public CancelAntchainAtoSignFlowResponse cancelAntchainAtoSignFlow(CancelAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程
     */
    public CancelAntchainAtoSignFlowResponse cancelAntchainAtoSignFlowEx(CancelAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoSignFlowResponse());
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新
     */
    public ReplaceAntchainAtoTradeUserpromiseResponse replaceAntchainAtoTradeUserpromise(ReplaceAntchainAtoTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceAntchainAtoTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新
     */
    public ReplaceAntchainAtoTradeUserpromiseResponse replaceAntchainAtoTradeUserpromiseEx(ReplaceAntchainAtoTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceAntchainAtoTradeUserpromiseResponse());
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口
     */
    public ApplyAntchainAtoTradeFinanceprecheckResponse applyAntchainAtoTradeFinanceprecheck(ApplyAntchainAtoTradeFinanceprecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAntchainAtoTradeFinanceprecheckEx(request, headers, runtime);
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口
     */
    public ApplyAntchainAtoTradeFinanceprecheckResponse applyAntchainAtoTradeFinanceprecheckEx(ApplyAntchainAtoTradeFinanceprecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAntchainAtoTradeFinanceprecheckResponse());
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步
     */
    public SyncAntchainAtoFundFinanceprecheckresultResponse syncAntchainAtoFundFinanceprecheckresult(SyncAntchainAtoFundFinanceprecheckresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundFinanceprecheckresultEx(request, headers, runtime);
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步
     */
    public SyncAntchainAtoFundFinanceprecheckresultResponse syncAntchainAtoFundFinanceprecheckresultEx(SyncAntchainAtoFundFinanceprecheckresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundFinanceprecheckresultResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
