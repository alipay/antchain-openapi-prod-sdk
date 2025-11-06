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
                    new TeaPair("sdk_version", "1.6.5"),
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
     * <b>description</b> :
     * <p>Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口</p>
     */
    public SyncAntchainAtoTradeResponse syncAntchainAtoTrade(SyncAntchainAtoTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口</p>
     */
    public SyncAntchainAtoTradeResponse syncAntchainAtoTradeEx(SyncAntchainAtoTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取详情
     * Summary: 获取详情</p>
     */
    public GetAntchainAtoTradeResponse getAntchainAtoTrade(GetAntchainAtoTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取详情
     * Summary: 获取详情</p>
     */
    public GetAntchainAtoTradeResponse getAntchainAtoTradeEx(GetAntchainAtoTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信身份认证，创建认证
     * Summary: 创建认证</p>
     */
    public CreateAntchainAtoRealpersonFacevrfResponse createAntchainAtoRealpersonFacevrf(CreateAntchainAtoRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信身份认证，创建认证
     * Summary: 创建认证</p>
     */
    public CreateAntchainAtoRealpersonFacevrfResponse createAntchainAtoRealpersonFacevrfEx(CreateAntchainAtoRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoRealpersonFacevrfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果</p>
     */
    public QueryAntchainAtoRealpersonFacevrfResponse queryAntchainAtoRealpersonFacevrf(QueryAntchainAtoRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果</p>
     */
    public QueryAntchainAtoRealpersonFacevrfResponse queryAntchainAtoRealpersonFacevrfEx(QueryAntchainAtoRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoRealpersonFacevrfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务</p>
     */
    public AllAntchainAtoSignTemplateResponse allAntchainAtoSignTemplate(AllAntchainAtoSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAntchainAtoSignTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务</p>
     */
    public AllAntchainAtoSignTemplateResponse allAntchainAtoSignTemplateEx(AllAntchainAtoSignTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAntchainAtoSignTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）</p>
     */
    public SubmitAntchainAtoSignFlowResponse submitAntchainAtoSignFlow(SubmitAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）</p>
     */
    public SubmitAntchainAtoSignFlowResponse submitAntchainAtoSignFlowEx(SubmitAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainAtoSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署流程详情
     * Summary: 查询签署流程详情</p>
     */
    public GetAntchainAtoSignFlowResponse getAntchainAtoSignFlow(GetAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署流程详情
     * Summary: 查询签署流程详情</p>
     */
    public GetAntchainAtoSignFlowResponse getAntchainAtoSignFlowEx(GetAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约创建
     * Summary: 代扣签约</p>
     */
    public CreateAntchainAtoWithholdSignResponse createAntchainAtoWithholdSign(CreateAntchainAtoWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约创建
     * Summary: 代扣签约</p>
     */
    public CreateAntchainAtoWithholdSignResponse createAntchainAtoWithholdSignEx(CreateAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoWithholdSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约查询
     * Summary: 代扣签约查询</p>
     */
    public QueryAntchainAtoWithholdSignResponse queryAntchainAtoWithholdSign(QueryAntchainAtoWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约查询
     * Summary: 代扣签约查询</p>
     */
    public QueryAntchainAtoWithholdSignResponse queryAntchainAtoWithholdSignEx(QueryAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作</p>
     */
    public AuthAntchainAtoSignFlowResponse authAntchainAtoSignFlow(AuthAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作</p>
     */
    public AuthAntchainAtoSignFlowResponse authAntchainAtoSignFlowEx(AuthAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAntchainAtoSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑</p>
     */
    public UnbindAntchainAtoWithholdSignResponse unbindAntchainAtoWithholdSign(UnbindAntchainAtoWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindAntchainAtoWithholdSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑</p>
     */
    public UnbindAntchainAtoWithholdSignResponse unbindAntchainAtoWithholdSignEx(UnbindAntchainAtoWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindAntchainAtoWithholdSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划</p>
     */
    public CancelAntchainAtoWithholdPlanResponse cancelAntchainAtoWithholdPlan(CancelAntchainAtoWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoWithholdPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划</p>
     */
    public CancelAntchainAtoWithholdPlanResponse cancelAntchainAtoWithholdPlanEx(CancelAntchainAtoWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoWithholdPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 重要说明：
     * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期多期代扣取消</p>
     */
    public RepayAntchainAtoWithholdPlanResponse repayAntchainAtoWithholdPlan(RepayAntchainAtoWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayAntchainAtoWithholdPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 重要说明：
     * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期多期代扣取消</p>
     */
    public RepayAntchainAtoWithholdPlanResponse repayAntchainAtoWithholdPlanEx(RepayAntchainAtoWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayAntchainAtoWithholdPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）</p>
     */
    public SubmitAntchainAtoFrontSignResponse submitAntchainAtoFrontSign(SubmitAntchainAtoFrontSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainAtoFrontSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）</p>
     */
    public SubmitAntchainAtoFrontSignResponse submitAntchainAtoFrontSignEx(SubmitAntchainAtoFrontSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainAtoFrontSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单创建，前置签署
     * Summary: 前置签署订单创建</p>
     */
    public SyncAntchainAtoFrontTradeResponse syncAntchainAtoFrontTrade(SyncAntchainAtoFrontTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFrontTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单创建，前置签署
     * Summary: 前置签署订单创建</p>
     */
    public SyncAntchainAtoFrontTradeResponse syncAntchainAtoFrontTradeEx(SyncAntchainAtoFrontTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFrontTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试</p>
     */
    public RetryAntchainAtoWithholdPlanResponse retryAntchainAtoWithholdPlan(RetryAntchainAtoWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryAntchainAtoWithholdPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试</p>
     */
    public RetryAntchainAtoWithholdPlanResponse retryAntchainAtoWithholdPlanEx(RetryAntchainAtoWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryAntchainAtoWithholdPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认</p>
     */
    public ConfirmAntchainAtoWithholdSignasyncunsignResponse confirmAntchainAtoWithholdSignasyncunsign(ConfirmAntchainAtoWithholdSignasyncunsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmAntchainAtoWithholdSignasyncunsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认</p>
     */
    public ConfirmAntchainAtoWithholdSignasyncunsignResponse confirmAntchainAtoWithholdSignasyncunsignEx(ConfirmAntchainAtoWithholdSignasyncunsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmAntchainAtoWithholdSignasyncunsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口</p>
     */
    public UploadAntchainAtoFundFlowResponse uploadAntchainAtoFundFlow(UploadAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口</p>
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
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口</p>
     */
    public GetAntchainAtoFundFlowResponse getAntchainAtoFundFlow(GetAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口</p>
     */
    public GetAntchainAtoFundFlowResponse getAntchainAtoFundFlowEx(GetAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知</p>
     */
    public RefuseAntchainAtoFundFlowResponse refuseAntchainAtoFundFlow(RefuseAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知</p>
     */
    public RefuseAntchainAtoFundFlowResponse refuseAntchainAtoFundFlowEx(RefuseAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseAntchainAtoFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方合同落签
     * Summary: 资方合同落签</p>
     */
    public AuthAntchainAtoFundFlowResponse authAntchainAtoFundFlow(AuthAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方合同落签
     * Summary: 资方合同落签</p>
     */
    public AuthAntchainAtoFundFlowResponse authAntchainAtoFundFlowEx(AuthAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAntchainAtoFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付创建
     * Summary: 主动支付创建</p>
     */
    public CreateAntchainAtoWithholdActivepayResponse createAntchainAtoWithholdActivepay(CreateAntchainAtoWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付创建
     * Summary: 主动支付创建</p>
     */
    public CreateAntchainAtoWithholdActivepayResponse createAntchainAtoWithholdActivepayEx(CreateAntchainAtoWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoWithholdActivepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付查询
     * Summary: 主动支付查询</p>
     */
    public QueryAntchainAtoWithholdActivepayResponse queryAntchainAtoWithholdActivepay(QueryAntchainAtoWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付查询
     * Summary: 主动支付查询</p>
     */
    public QueryAntchainAtoWithholdActivepayResponse queryAntchainAtoWithholdActivepayEx(QueryAntchainAtoWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdActivepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付取消
     * Summary: 主动支付取消</p>
     */
    public CancelAntchainAtoWithholdActivepayResponse cancelAntchainAtoWithholdActivepay(CancelAntchainAtoWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付取消
     * Summary: 主动支付取消</p>
     */
    public CancelAntchainAtoWithholdActivepayResponse cancelAntchainAtoWithholdActivepayEx(CancelAntchainAtoWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoWithholdActivepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消</p>
     */
    public CancelAntchainAtoFundPlanResponse cancelAntchainAtoFundPlan(CancelAntchainAtoFundPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoFundPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消</p>
     */
    public CancelAntchainAtoFundPlanResponse cancelAntchainAtoFundPlanEx(CancelAntchainAtoFundPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoFundPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通知回调
     * Summary: 通知回调</p>
     */
    public CallbackAntchainAtoFundNotifyResponse callbackAntchainAtoFundNotify(CallbackAntchainAtoFundNotifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackAntchainAtoFundNotifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通知回调
     * Summary: 通知回调</p>
     */
    public CallbackAntchainAtoFundNotifyResponse callbackAntchainAtoFundNotifyEx(CallbackAntchainAtoFundNotifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackAntchainAtoFundNotifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款申请接口
     * Summary: 融资放款申请接口</p>
     */
    public SyncAntchainAtoTradeFinanceloanapplyResponse syncAntchainAtoTradeFinanceloanapply(SyncAntchainAtoTradeFinanceloanapplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeFinanceloanapplyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款申请接口
     * Summary: 融资放款申请接口</p>
     */
    public SyncAntchainAtoTradeFinanceloanapplyResponse syncAntchainAtoTradeFinanceloanapplyEx(SyncAntchainAtoTradeFinanceloanapplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeFinanceloanapplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约查询
     * Summary: 商户履约查询</p>
     */
    public GetAntchainAtoTradeMerchantfulfillmentResponse getAntchainAtoTradeMerchantfulfillment(GetAntchainAtoTradeMerchantfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeMerchantfulfillmentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约查询
     * Summary: 商户履约查询</p>
     */
    public GetAntchainAtoTradeMerchantfulfillmentResponse getAntchainAtoTradeMerchantfulfillmentEx(GetAntchainAtoTradeMerchantfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeMerchantfulfillmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步</p>
     */
    public SyncAntchainAtoFundMerchantpromiseResponse syncAntchainAtoFundMerchantpromise(SyncAntchainAtoFundMerchantpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundMerchantpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步</p>
     */
    public SyncAntchainAtoFundMerchantpromiseResponse syncAntchainAtoFundMerchantpromiseEx(SyncAntchainAtoFundMerchantpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundMerchantpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款结果同步
     * Summary: 融资放款结果同步</p>
     */
    public SyncAntchainAtoFundFinanceloanresultsResponse syncAntchainAtoFundFinanceloanresults(SyncAntchainAtoFundFinanceloanresultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundFinanceloanresultsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款结果同步
     * Summary: 融资放款结果同步</p>
     */
    public SyncAntchainAtoFundFinanceloanresultsResponse syncAntchainAtoFundFinanceloanresultsEx(SyncAntchainAtoFundFinanceloanresultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundFinanceloanresultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户承诺
     * Summary: 查询用户承诺</p>
     */
    public GetAntchainAtoFundUserpromiseResponse getAntchainAtoFundUserpromise(GetAntchainAtoFundUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户承诺
     * Summary: 查询用户承诺</p>
     */
    public GetAntchainAtoFundUserpromiseResponse getAntchainAtoFundUserpromiseEx(GetAntchainAtoFundUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）</p>
     */
    public GetAntchainAtoTradeUserperformanceResponse getAntchainAtoTradeUserperformance(GetAntchainAtoTradeUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeUserperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）</p>
     */
    public GetAntchainAtoTradeUserperformanceResponse getAntchainAtoTradeUserperformanceEx(GetAntchainAtoTradeUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeUserperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetAntchainAtoTradeMerchantperformanceResponse getAntchainAtoTradeMerchantperformance(GetAntchainAtoTradeMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetAntchainAtoTradeMerchantperformanceResponse getAntchainAtoTradeMerchantperformanceEx(GetAntchainAtoTradeMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeMerchantperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetAntchainAtoFundUserperformanceResponse getAntchainAtoFundUserperformance(GetAntchainAtoFundUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundUserperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetAntchainAtoFundUserperformanceResponse getAntchainAtoFundUserperformanceEx(GetAntchainAtoFundUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundUserperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetAntchainAtoFundMerchantperformanceResponse getAntchainAtoFundMerchantperformance(GetAntchainAtoFundMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetAntchainAtoFundMerchantperformanceResponse getAntchainAtoFundMerchantperformanceEx(GetAntchainAtoFundMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundMerchantperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用、订单详情获取
     * Summary: 资方调用、订单详情获取</p>
     */
    public GetAntchainAtoFundOrderfullinfoResponse getAntchainAtoFundOrderfullinfo(GetAntchainAtoFundOrderfullinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundOrderfullinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用、订单详情获取
     * Summary: 资方调用、订单详情获取</p>
     */
    public GetAntchainAtoFundOrderfullinfoResponse getAntchainAtoFundOrderfullinfoEx(GetAntchainAtoFundOrderfullinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundOrderfullinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口</p>
     */
    public UploadAntchainAtoSignFlowResponse uploadAntchainAtoSignFlow(UploadAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口</p>
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
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建退款请求
     * Summary: 创建退款申请</p>
     */
    public CreateAntchainAtoWithholdRefundResponse createAntchainAtoWithholdRefund(CreateAntchainAtoWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoWithholdRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建退款请求
     * Summary: 创建退款申请</p>
     */
    public CreateAntchainAtoWithholdRefundResponse createAntchainAtoWithholdRefundEx(CreateAntchainAtoWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoWithholdRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款申请结果查询
     * Summary: 退款申请结果查询</p>
     */
    public QueryAntchainAtoWithholdRefundResponse queryAntchainAtoWithholdRefund(QueryAntchainAtoWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款申请结果查询
     * Summary: 退款申请结果查询</p>
     */
    public QueryAntchainAtoWithholdRefundResponse queryAntchainAtoWithholdRefundEx(QueryAntchainAtoWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改</p>
     */
    public UpdateAntchainAtoTradeUserpromiseResponse updateAntchainAtoTradeUserpromise(UpdateAntchainAtoTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainAtoTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改</p>
     */
    public UpdateAntchainAtoTradeUserpromiseResponse updateAntchainAtoTradeUserpromiseEx(UpdateAntchainAtoTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainAtoTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表</p>
     */
    public AllAntchainAtoInnerTemplateResponse allAntchainAtoInnerTemplate(AllAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表</p>
     */
    public AllAntchainAtoInnerTemplateResponse allAntchainAtoInnerTemplateEx(AllAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表</p>
     */
    public ListAntchainAtoInnerTemplateResponse listAntchainAtoInnerTemplate(ListAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表</p>
     */
    public ListAntchainAtoInnerTemplateResponse listAntchainAtoInnerTemplateEx(ListAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情</p>
     */
    public DetailAntchainAtoInnerTemplateResponse detailAntchainAtoInnerTemplate(DetailAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情</p>
     */
    public DetailAntchainAtoInnerTemplateResponse detailAntchainAtoInnerTemplateEx(DetailAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，创建魔法库模板
     * Summary: 创建模板</p>
     */
    public CreateAntchainAtoInnerTemplateResponse createAntchainAtoInnerTemplate(CreateAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，创建魔法库模板
     * Summary: 创建模板</p>
     */
    public CreateAntchainAtoInnerTemplateResponse createAntchainAtoInnerTemplateEx(CreateAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板</p>
     */
    public SaveAntchainAtoInnerTemplateResponse saveAntchainAtoInnerTemplate(SaveAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板</p>
     */
    public SaveAntchainAtoInnerTemplateResponse saveAntchainAtoInnerTemplateEx(SaveAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板</p>
     */
    public PublishAntchainAtoInnerTemplateResponse publishAntchainAtoInnerTemplate(PublishAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板</p>
     */
    public PublishAntchainAtoInnerTemplateResponse publishAntchainAtoInnerTemplateEx(PublishAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板</p>
     */
    public PreviewAntchainAtoInnerTemplateResponse previewAntchainAtoInnerTemplate(PreviewAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板</p>
     */
    public PreviewAntchainAtoInnerTemplateResponse previewAntchainAtoInnerTemplateEx(PreviewAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板</p>
     */
    public DeleteAntchainAtoInnerTemplateResponse deleteAntchainAtoInnerTemplate(DeleteAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板</p>
     */
    public DeleteAntchainAtoInnerTemplateResponse deleteAntchainAtoInnerTemplateEx(DeleteAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板</p>
     */
    public CloneAntchainAtoInnerTemplateResponse cloneAntchainAtoInnerTemplate(CloneAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板</p>
     */
    public CloneAntchainAtoInnerTemplateResponse cloneAntchainAtoInnerTemplateEx(CloneAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口</p>
     */
    public NotifyAntchainAtoFundFlowResponse notifyAntchainAtoFundFlow(NotifyAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口</p>
     */
    public NotifyAntchainAtoFundFlowResponse notifyAntchainAtoFundFlowEx(NotifyAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyAntchainAtoFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表</p>
     */
    public QueryAntchainAtoInnerTemplateimageResponse queryAntchainAtoInnerTemplateimage(QueryAntchainAtoInnerTemplateimageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerTemplateimageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表</p>
     */
    public QueryAntchainAtoInnerTemplateimageResponse queryAntchainAtoInnerTemplateimageEx(QueryAntchainAtoInnerTemplateimageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerTemplateimageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件</p>
     */
    public SyncAntchainAtoFrontIndirectorderResponse syncAntchainAtoFrontIndirectorder(SyncAntchainAtoFrontIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFrontIndirectorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件</p>
     */
    public SyncAntchainAtoFrontIndirectorderResponse syncAntchainAtoFrontIndirectorderEx(SyncAntchainAtoFrontIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFrontIndirectorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件</p>
     */
    public SyncAntchainAtoTradeIndirectorderResponse syncAntchainAtoTradeIndirectorder(SyncAntchainAtoTradeIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeIndirectorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件</p>
     */
    public SyncAntchainAtoTradeIndirectorderResponse syncAntchainAtoTradeIndirectorderEx(SyncAntchainAtoTradeIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeIndirectorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻
     * Summary: 商户入驻</p>
     */
    public RegisterAntchainAtoMerchantexpandMerchantResponse registerAntchainAtoMerchantexpandMerchant(RegisterAntchainAtoMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻
     * Summary: 商户入驻</p>
     */
    public RegisterAntchainAtoMerchantexpandMerchantResponse registerAntchainAtoMerchantexpandMerchantEx(RegisterAntchainAtoMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterAntchainAtoMerchantexpandMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接</p>
     */
    public UploadAntchainAtoMerchantexpandFileResponse uploadAntchainAtoMerchantexpandFile(UploadAntchainAtoMerchantexpandFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoMerchantexpandFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接</p>
     */
    public UploadAntchainAtoMerchantexpandFileResponse uploadAntchainAtoMerchantexpandFileEx(UploadAntchainAtoMerchantexpandFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoMerchantexpandFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻查询
     * Summary: 商户入驻查询</p>
     */
    public QueryAntchainAtoMerchantexpandMerchantResponse queryAntchainAtoMerchantexpandMerchant(QueryAntchainAtoMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻查询
     * Summary: 商户入驻查询</p>
     */
    public QueryAntchainAtoMerchantexpandMerchantResponse queryAntchainAtoMerchantexpandMerchantEx(QueryAntchainAtoMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoMerchantexpandMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步已发布的模板
     * Summary: 同步已发布的模板</p>
     */
    public SyncAntchainAtoInnerTemplateResponse syncAntchainAtoInnerTemplate(SyncAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步已发布的模板
     * Summary: 同步已发布的模板</p>
     */
    public SyncAntchainAtoInnerTemplateResponse syncAntchainAtoInnerTemplateEx(SyncAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息</p>
     */
    public UpdateAntchainAtoInnerTemplateResponse updateAntchainAtoInnerTemplate(UpdateAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息</p>
     */
    public UpdateAntchainAtoInnerTemplateResponse updateAntchainAtoInnerTemplateEx(UpdateAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传</p>
     */
    public UploadAntchainAtoSignTemplateResponse uploadAntchainAtoSignTemplate(UploadAntchainAtoSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoSignTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传</p>
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
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoSignTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息</p>
     */
    public QueryAntchainAtoInnerTemplateResponse queryAntchainAtoInnerTemplate(QueryAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息</p>
     */
    public QueryAntchainAtoInnerTemplateResponse queryAntchainAtoInnerTemplateEx(QueryAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息</p>
     */
    public QueryAntchainAtoInnerTemplateelementlinkResponse queryAntchainAtoInnerTemplateelementlink(QueryAntchainAtoInnerTemplateelementlinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoInnerTemplateelementlinkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息</p>
     */
    public QueryAntchainAtoInnerTemplateelementlinkResponse queryAntchainAtoInnerTemplateelementlinkEx(QueryAntchainAtoInnerTemplateelementlinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoInnerTemplateelementlinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传</p>
     */
    public UploadAntchainAtoFundCreditResponse uploadAntchainAtoFundCredit(UploadAntchainAtoFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoFundCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传</p>
     */
    public UploadAntchainAtoFundCreditResponse uploadAntchainAtoFundCreditEx(UploadAntchainAtoFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoFundCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传</p>
     */
    public UploadAntchainAtoSignCreditResponse uploadAntchainAtoSignCredit(UploadAntchainAtoSignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainAtoSignCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传</p>
     */
    public UploadAntchainAtoSignCreditResponse uploadAntchainAtoSignCreditEx(UploadAntchainAtoSignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainAtoSignCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询</p>
     */
    public QueryAntchainAtoFundCreditResponse queryAntchainAtoFundCredit(QueryAntchainAtoFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoFundCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询</p>
     */
    public QueryAntchainAtoFundCreditResponse queryAntchainAtoFundCreditEx(QueryAntchainAtoFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoFundCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询</p>
     */
    public QueryAntchainAtoSignCreditResponse queryAntchainAtoSignCredit(QueryAntchainAtoSignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoSignCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询</p>
     */
    public QueryAntchainAtoSignCreditResponse queryAntchainAtoSignCreditEx(QueryAntchainAtoSignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoSignCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家信息修改
     * Summary: 商家信息修改</p>
     */
    public UpdateAntchainAtoMerchantexpandMerchantResponse updateAntchainAtoMerchantexpandMerchant(UpdateAntchainAtoMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家信息修改
     * Summary: 商家信息修改</p>
     */
    public UpdateAntchainAtoMerchantexpandMerchantResponse updateAntchainAtoMerchantexpandMerchantEx(UpdateAntchainAtoMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainAtoMerchantexpandMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 撤销签署流程
     * Summary: 撤销签署流程</p>
     */
    public CancelAntchainAtoSignFlowResponse cancelAntchainAtoSignFlow(CancelAntchainAtoSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 撤销签署流程
     * Summary: 撤销签署流程</p>
     */
    public CancelAntchainAtoSignFlowResponse cancelAntchainAtoSignFlowEx(CancelAntchainAtoSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新</p>
     */
    public ReplaceAntchainAtoTradeUserpromiseResponse replaceAntchainAtoTradeUserpromise(ReplaceAntchainAtoTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceAntchainAtoTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新</p>
     */
    public ReplaceAntchainAtoTradeUserpromiseResponse replaceAntchainAtoTradeUserpromiseEx(ReplaceAntchainAtoTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceAntchainAtoTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口</p>
     */
    public ApplyAntchainAtoTradeFinanceprecheckResponse applyAntchainAtoTradeFinanceprecheck(ApplyAntchainAtoTradeFinanceprecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAntchainAtoTradeFinanceprecheckEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口</p>
     */
    public ApplyAntchainAtoTradeFinanceprecheckResponse applyAntchainAtoTradeFinanceprecheckEx(ApplyAntchainAtoTradeFinanceprecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAntchainAtoTradeFinanceprecheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资预审结果同步
     * Summary: 融资预审结果同步</p>
     */
    public SyncAntchainAtoFundFinanceprecheckresultResponse syncAntchainAtoFundFinanceprecheckresult(SyncAntchainAtoFundFinanceprecheckresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoFundFinanceprecheckresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资预审结果同步
     * Summary: 融资预审结果同步</p>
     */
    public SyncAntchainAtoFundFinanceprecheckresultResponse syncAntchainAtoFundFinanceprecheckresultEx(SyncAntchainAtoFundFinanceprecheckresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoFundFinanceprecheckresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询代偿户余额
     * Summary: 代偿户查询</p>
     */
    public QueryAntchainAtoFundCompensateaccountResponse queryAntchainAtoFundCompensateaccount(QueryAntchainAtoFundCompensateaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoFundCompensateaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询代偿户余额
     * Summary: 代偿户查询</p>
     */
    public QueryAntchainAtoFundCompensateaccountResponse queryAntchainAtoFundCompensateaccountEx(QueryAntchainAtoFundCompensateaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoFundCompensateaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代偿户账户查询
     * Summary: 代偿户账户查询</p>
     */
    public QueryAntchainAtoWithholdCompensateaccountResponse queryAntchainAtoWithholdCompensateaccount(QueryAntchainAtoWithholdCompensateaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoWithholdCompensateaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代偿户账户查询
     * Summary: 代偿户账户查询</p>
     */
    public QueryAntchainAtoWithholdCompensateaccountResponse queryAntchainAtoWithholdCompensateaccountEx(QueryAntchainAtoWithholdCompensateaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoWithholdCompensateaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取合同存证证明
     * Summary: 获取合同存证证明</p>
     */
    public GetAntchainAtoSignContractcertificateResponse getAntchainAtoSignContractcertificate(GetAntchainAtoSignContractcertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoSignContractcertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取合同存证证明
     * Summary: 获取合同存证证明</p>
     */
    public GetAntchainAtoSignContractcertificateResponse getAntchainAtoSignContractcertificateEx(GetAntchainAtoSignContractcertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoSignContractcertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 非融转融资
     * Summary: 非融转融资</p>
     */
    public TransferAntchainAtoTradeFinanceResponse transferAntchainAtoTradeFinance(TransferAntchainAtoTradeFinanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferAntchainAtoTradeFinanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 非融转融资
     * Summary: 非融转融资</p>
     */
    public TransferAntchainAtoTradeFinanceResponse transferAntchainAtoTradeFinanceEx(TransferAntchainAtoTradeFinanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferAntchainAtoTradeFinanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新订单信息
     * Summary: 更新订单信息</p>
     */
    public UpdateAntchainAtoTradeOrderResponse updateAntchainAtoTradeOrder(UpdateAntchainAtoTradeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainAtoTradeOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新订单信息
     * Summary: 更新订单信息</p>
     */
    public UpdateAntchainAtoTradeOrderResponse updateAntchainAtoTradeOrderEx(UpdateAntchainAtoTradeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainAtoTradeOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资订单追加预审资金方
     * Summary: 融资订单追加预审资金方</p>
     */
    public AddAntchainAtoTradeFinanceprecheckResponse addAntchainAtoTradeFinanceprecheck(AddAntchainAtoTradeFinanceprecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAntchainAtoTradeFinanceprecheckEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资订单追加预审资金方
     * Summary: 融资订单追加预审资金方</p>
     */
    public AddAntchainAtoTradeFinanceprecheckResponse addAntchainAtoTradeFinanceprecheckEx(AddAntchainAtoTradeFinanceprecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAntchainAtoTradeFinanceprecheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资信息查询接口
     * Summary: 订单融资信息查询接口</p>
     */
    public GetAntchainAtoTradeOrderfinanceinfoResponse getAntchainAtoTradeOrderfinanceinfo(GetAntchainAtoTradeOrderfinanceinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeOrderfinanceinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资信息查询接口
     * Summary: 订单融资信息查询接口</p>
     */
    public GetAntchainAtoTradeOrderfinanceinfoResponse getAntchainAtoTradeOrderfinanceinfoEx(GetAntchainAtoTradeOrderfinanceinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeOrderfinanceinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询订单融资信息
     * Summary: 资方查询订单融资信息</p>
     */
    public GetAntchainAtoFundOrderfinanceinfoResponse getAntchainAtoFundOrderfinanceinfo(GetAntchainAtoFundOrderfinanceinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundOrderfinanceinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询订单融资信息
     * Summary: 资方查询订单融资信息</p>
     */
    public GetAntchainAtoFundOrderfinanceinfoResponse getAntchainAtoFundOrderfinanceinfoEx(GetAntchainAtoFundOrderfinanceinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundOrderfinanceinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划延期
     * Summary: 订单代扣计划延期</p>
     */
    public SyncAntchainAtoTradeUserpromisedelayResponse syncAntchainAtoTradeUserpromisedelay(SyncAntchainAtoTradeUserpromisedelayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeUserpromisedelayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划延期
     * Summary: 订单代扣计划延期</p>
     */
    public SyncAntchainAtoTradeUserpromisedelayResponse syncAntchainAtoTradeUserpromisedelayEx(SyncAntchainAtoTradeUserpromisedelayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeUserpromisedelayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划暂停
     * Summary: 订单代扣计划暂停</p>
     */
    public PauseAntchainAtoTradeUserpromiseResponse pauseAntchainAtoTradeUserpromise(PauseAntchainAtoTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseAntchainAtoTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划暂停
     * Summary: 订单代扣计划暂停</p>
     */
    public PauseAntchainAtoTradeUserpromiseResponse pauseAntchainAtoTradeUserpromiseEx(PauseAntchainAtoTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseAntchainAtoTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣计划重启
     * Summary: 代扣计划重启</p>
     */
    public ResumeAntchainAtoTradeUserpromiseResponse resumeAntchainAtoTradeUserpromise(ResumeAntchainAtoTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeAntchainAtoTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣计划重启
     * Summary: 代扣计划重启</p>
     */
    public ResumeAntchainAtoTradeUserpromiseResponse resumeAntchainAtoTradeUserpromiseEx(ResumeAntchainAtoTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeAntchainAtoTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系</p>
     */
    public AddAntchainAtoMerchantexpandDividerelationResponse addAntchainAtoMerchantexpandDividerelation(AddAntchainAtoMerchantexpandDividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAntchainAtoMerchantexpandDividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系</p>
     */
    public AddAntchainAtoMerchantexpandDividerelationResponse addAntchainAtoMerchantexpandDividerelationEx(AddAntchainAtoMerchantexpandDividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAntchainAtoMerchantexpandDividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询</p>
     */
    public QueryAntchainAtoMerchantexpandDividerelationResponse queryAntchainAtoMerchantexpandDividerelation(QueryAntchainAtoMerchantexpandDividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoMerchantexpandDividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询</p>
     */
    public QueryAntchainAtoMerchantexpandDividerelationResponse queryAntchainAtoMerchantexpandDividerelationEx(QueryAntchainAtoMerchantexpandDividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoMerchantexpandDividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同模板制作根据已有模板新增合同模板文件
     * Summary: 根据已有模板新增合同模板文件</p>
     */
    public AddAntchainAtoInnerTemplateResponse addAntchainAtoInnerTemplate(AddAntchainAtoInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAntchainAtoInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同模板制作根据已有模板新增合同模板文件
     * Summary: 根据已有模板新增合同模板文件</p>
     */
    public AddAntchainAtoInnerTemplateResponse addAntchainAtoInnerTemplateEx(AddAntchainAtoInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAntchainAtoInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ● 本接口获取用信授权
     * ●本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
     * Summary: 用信申请接口</p>
     */
    public ApplyAntchainAtoFundCreditutilizationResponse applyAntchainAtoFundCreditutilization(ApplyAntchainAtoFundCreditutilizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAntchainAtoFundCreditutilizationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ● 本接口获取用信授权
     * ●本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
     * Summary: 用信申请接口</p>
     */
    public ApplyAntchainAtoFundCreditutilizationResponse applyAntchainAtoFundCreditutilizationEx(ApplyAntchainAtoFundCreditutilizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAntchainAtoFundCreditutilizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产包详情查询
     * Summary: 资产包详情查询</p>
     */
    public QueryAntchainAtoFundAssetpackageResponse queryAntchainAtoFundAssetpackage(QueryAntchainAtoFundAssetpackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAtoFundAssetpackageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产包详情查询
     * Summary: 资产包详情查询</p>
     */
    public QueryAntchainAtoFundAssetpackageResponse queryAntchainAtoFundAssetpackageEx(QueryAntchainAtoFundAssetpackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.assetpackage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAtoFundAssetpackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * 1.当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
     * Summary: 商户履约其他方式还款（单期取消）</p>
     */
    public RepayAntchainAtoFundPlanResponse repayAntchainAtoFundPlan(RepayAntchainAtoFundPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayAntchainAtoFundPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * 1.当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
     * Summary: 商户履约其他方式还款（单期取消）</p>
     */
    public RepayAntchainAtoFundPlanResponse repayAntchainAtoFundPlanEx(RepayAntchainAtoFundPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.plan.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayAntchainAtoFundPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方代偿签约链接获取
     * Summary: 资方代偿签约链接获取</p>
     */
    public GetAntchainAtoFundCompensatesignurlResponse getAntchainAtoFundCompensatesignurl(GetAntchainAtoFundCompensatesignurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoFundCompensatesignurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方代偿签约链接获取
     * Summary: 资方代偿签约链接获取</p>
     */
    public GetAntchainAtoFundCompensatesignurlResponse getAntchainAtoFundCompensatesignurlEx(GetAntchainAtoFundCompensatesignurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.compensatesignurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoFundCompensatesignurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 转账代偿签约结果确认
     * Summary: 转账代偿签约结果确认</p>
     */
    public ConfirmAntchainAtoFundCompensateResponse confirmAntchainAtoFundCompensate(ConfirmAntchainAtoFundCompensateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmAntchainAtoFundCompensateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 转账代偿签约结果确认
     * Summary: 转账代偿签约结果确认</p>
     */
    public ConfirmAntchainAtoFundCompensateResponse confirmAntchainAtoFundCompensateEx(ConfirmAntchainAtoFundCompensateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.compensate.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmAntchainAtoFundCompensateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试pending状态的代扣计划
     * Summary: 重试pending状态的代扣计划</p>
     */
    public RetryAntchainAtoWithholdPlanpendingResponse retryAntchainAtoWithholdPlanpending(RetryAntchainAtoWithholdPlanpendingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryAntchainAtoWithholdPlanpendingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试pending状态的代扣计划
     * Summary: 重试pending状态的代扣计划</p>
     */
    public RetryAntchainAtoWithholdPlanpendingResponse retryAntchainAtoWithholdPlanpendingEx(RetryAntchainAtoWithholdPlanpendingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.planpending.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryAntchainAtoWithholdPlanpendingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账pending重试
     * Summary: 分账pending重试</p>
     */
    public RetryAntchainAtoWithholdDividependingResponse retryAntchainAtoWithholdDividepending(RetryAntchainAtoWithholdDividependingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryAntchainAtoWithholdDividependingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账pending重试
     * Summary: 分账pending重试</p>
     */
    public RetryAntchainAtoWithholdDividependingResponse retryAntchainAtoWithholdDividependingEx(RetryAntchainAtoWithholdDividependingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.dividepending.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryAntchainAtoWithholdDividependingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单信息同步
     * Summary: 订单信息同步</p>
     */
    public SyncAntchainAtoTradePromoorderinfoResponse syncAntchainAtoTradePromoorderinfo(SyncAntchainAtoTradePromoorderinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradePromoorderinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单信息同步
     * Summary: 订单信息同步</p>
     */
    public SyncAntchainAtoTradePromoorderinfoResponse syncAntchainAtoTradePromoorderinfoEx(SyncAntchainAtoTradePromoorderinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.promoorderinfo.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradePromoorderinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级户进件绑定结算卡信息
     * Summary: 二级户进件绑定结算卡信息</p>
     */
    public BindAntchainAtoMerchantexpandSettlecardResponse bindAntchainAtoMerchantexpandSettlecard(BindAntchainAtoMerchantexpandSettlecardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAntchainAtoMerchantexpandSettlecardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级户进件绑定结算卡信息
     * Summary: 二级户进件绑定结算卡信息</p>
     */
    public BindAntchainAtoMerchantexpandSettlecardResponse bindAntchainAtoMerchantexpandSettlecardEx(BindAntchainAtoMerchantexpandSettlecardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.settlecard.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAntchainAtoMerchantexpandSettlecardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产订单同步
     * Summary: 资产订单同步</p>
     */
    public SyncAntchainAtoTradeReceiptorderfullinfoResponse syncAntchainAtoTradeReceiptorderfullinfo(SyncAntchainAtoTradeReceiptorderfullinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainAtoTradeReceiptorderfullinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产订单同步
     * Summary: 资产订单同步</p>
     */
    public SyncAntchainAtoTradeReceiptorderfullinfoResponse syncAntchainAtoTradeReceiptorderfullinfoEx(SyncAntchainAtoTradeReceiptorderfullinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.receiptorderfullinfo.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainAtoTradeReceiptorderfullinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单信息查询（新）
     * Summary: 订单获取</p>
     */
    public GetAntchainAtoTradeOrderfullinfoResponse getAntchainAtoTradeOrderfullinfo(GetAntchainAtoTradeOrderfullinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntchainAtoTradeOrderfullinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单信息查询（新）
     * Summary: 订单获取</p>
     */
    public GetAntchainAtoTradeOrderfullinfoResponse getAntchainAtoTradeOrderfullinfoEx(GetAntchainAtoTradeOrderfullinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntchainAtoTradeOrderfullinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方提交合同签署
     * Summary: 资方提交合同签署</p>
     */
    public SubmitAntchainAtoFundFlowResponse submitAntchainAtoFundFlow(SubmitAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方提交合同签署
     * Summary: 资方提交合同签署</p>
     */
    public SubmitAntchainAtoFundFlowResponse submitAntchainAtoFundFlowEx(SubmitAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainAtoFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方合同流程撤销
     * Summary: 资方合同流程撤销</p>
     */
    public CancelAntchainAtoFundFlowResponse cancelAntchainAtoFundFlow(CancelAntchainAtoFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntchainAtoFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方合同流程撤销
     * Summary: 资方合同流程撤销</p>
     */
    public CancelAntchainAtoFundFlowResponse cancelAntchainAtoFundFlowEx(CancelAntchainAtoFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntchainAtoFundFlowResponse());
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
