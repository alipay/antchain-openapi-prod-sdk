// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.ato.models.*;

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
                    new TeaPair("sdk_version", "1.9.20"),
                    new TeaPair("_prod_code", "ATO"),
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
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步
     */
    public SyncFundSplittingResponse syncFundSplitting(SyncFundSplittingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundSplittingEx(request, headers, runtime);
    }

    /**
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步
     */
    public SyncFundSplittingResponse syncFundSplittingEx(SyncFundSplittingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundSplittingResponse());
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步
     */
    public SyncFundOrderfinancialResponse syncFundOrderfinancial(SyncFundOrderfinancialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundOrderfinancialEx(request, headers, runtime);
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步
     */
    public SyncFundOrderfinancialResponse syncFundOrderfinancialEx(SyncFundOrderfinancialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundOrderfinancialResponse());
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
     */
    public SyncFundWithholdingcontractResponse syncFundWithholdingcontract(SyncFundWithholdingcontractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundWithholdingcontractEx(request, headers, runtime);
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
     */
    public SyncFundWithholdingcontractResponse syncFundWithholdingcontractEx(SyncFundWithholdingcontractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundWithholdingcontractResponse());
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息
     */
    public SyncFundOrderfulfillmentResponse syncFundOrderfulfillment(SyncFundOrderfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息
     */
    public SyncFundOrderfulfillmentResponse syncFundOrderfulfillmentEx(SyncFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundOrderfulfillmentResponse());
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息
     */
    public GetFundOrderfulfillmentResponse getFundOrderfulfillment(GetFundOrderfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息
     */
    public GetFundOrderfulfillmentResponse getFundOrderfulfillmentEx(GetFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundOrderfulfillmentResponse());
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口
     */
    public UploadFundFlowResponse uploadFundFlow(UploadFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口
     */
    public UploadFundFlowResponse uploadFundFlowEx(UploadFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.fund.flow.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadFundFlowResponse uploadFundFlowResponse = UploadFundFlowResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadFundFlowResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadFundFlowResponse());
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口
     */
    public GetFundFlowResponse getFundFlow(GetFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口
     */
    public GetFundFlowResponse getFundFlowEx(GetFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundFlowResponse());
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知
     */
    public RefuseFundFlowResponse refuseFundFlow(RefuseFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知
     */
    public RefuseFundFlowResponse refuseFundFlowEx(RefuseFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseFundFlowResponse());
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口
     */
    public AuthFundFlowResponse authFundFlow(AuthFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口
     */
    public AuthFundFlowResponse authFundFlowEx(AuthFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthFundFlowResponse());
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消
     */
    public CancelFundPlanResponse cancelFundPlan(CancelFundPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelFundPlanEx(request, headers, runtime);
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消
     */
    public CancelFundPlanResponse cancelFundPlanEx(CancelFundPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelFundPlanResponse());
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调
     */
    public CallbackFundNotifyResponse callbackFundNotify(CallbackFundNotifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackFundNotifyEx(request, headers, runtime);
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调
     */
    public CallbackFundNotifyResponse callbackFundNotifyEx(CallbackFundNotifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackFundNotifyResponse());
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步
     */
    public SyncFundMerchantpromiseResponse syncFundMerchantpromise(SyncFundMerchantpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundMerchantpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步
     */
    public SyncFundMerchantpromiseResponse syncFundMerchantpromiseEx(SyncFundMerchantpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundMerchantpromiseResponse());
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步
     */
    public SyncFundFinanceloanresultsResponse syncFundFinanceloanresults(SyncFundFinanceloanresultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundFinanceloanresultsEx(request, headers, runtime);
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步
     */
    public SyncFundFinanceloanresultsResponse syncFundFinanceloanresultsEx(SyncFundFinanceloanresultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundFinanceloanresultsResponse());
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺
     */
    public GetFundUserpromiseResponse getFundUserpromise(GetFundUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundUserpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺
     */
    public GetFundUserpromiseResponse getFundUserpromiseEx(GetFundUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundUserpromiseResponse());
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）
     */
    public GetFundUserperformanceResponse getFundUserperformance(GetFundUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundUserperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）
     */
    public GetFundUserperformanceResponse getFundUserperformanceEx(GetFundUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundUserperformanceResponse());
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetFundMerchantperformanceResponse getFundMerchantperformance(GetFundMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetFundMerchantperformanceResponse getFundMerchantperformanceEx(GetFundMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundMerchantperformanceResponse());
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情
     */
    public GetFundOrderfullinfoResponse getFundOrderfullinfo(GetFundOrderfullinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundOrderfullinfoEx(request, headers, runtime);
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情
     */
    public GetFundOrderfullinfoResponse getFundOrderfullinfoEx(GetFundOrderfullinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundOrderfullinfoResponse());
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口
     */
    public NotifyFundFlowResponse notifyFundFlow(NotifyFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口
     */
    public NotifyFundFlowResponse notifyFundFlowEx(NotifyFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyFundFlowResponse());
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传
     */
    public UploadFundCreditResponse uploadFundCredit(UploadFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadFundCreditEx(request, headers, runtime);
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传
     */
    public UploadFundCreditResponse uploadFundCreditEx(UploadFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadFundCreditResponse());
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询
     */
    public QueryFundCreditResponse queryFundCredit(QueryFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundCreditEx(request, headers, runtime);
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询
     */
    public QueryFundCreditResponse queryFundCreditEx(QueryFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundCreditResponse());
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步
     */
    public SyncFundFinanceprecheckresultResponse syncFundFinanceprecheckresult(SyncFundFinanceprecheckresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundFinanceprecheckresultEx(request, headers, runtime);
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步
     */
    public SyncFundFinanceprecheckresultResponse syncFundFinanceprecheckresultEx(SyncFundFinanceprecheckresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundFinanceprecheckresultResponse());
    }

    /**
     * Description: 内部调用,商品信息获取
     * Summary: 商品信息获取
     */
    public GetInnerProductResponse getInnerProduct(GetInnerProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerProductEx(request, headers, runtime);
    }

    /**
     * Description: 内部调用,商品信息获取
     * Summary: 商品信息获取
     */
    public GetInnerProductResponse getInnerProductEx(GetInnerProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.product.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerProductResponse());
    }

    /**
     * Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取
     */
    public GetInnerTenantResponse getInnerTenant(GetInnerTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerTenantEx(request, headers, runtime);
    }

    /**
     * Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取
     */
    public GetInnerTenantResponse getInnerTenantEx(GetInnerTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerTenantResponse());
    }

    /**
     * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息
     */
    public SyncInnerMeterforwholeorderResponse syncInnerMeterforwholeorder(SyncInnerMeterforwholeorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerMeterforwholeorderEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息
     */
    public SyncInnerMeterforwholeorderResponse syncInnerMeterforwholeorderEx(SyncInnerMeterforwholeorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.meterforwholeorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerMeterforwholeorderResponse());
    }

    /**
     * Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口
     */
    public SyncInnerMeterforagsignResponse syncInnerMeterforagsign(SyncInnerMeterforagsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerMeterforagsignEx(request, headers, runtime);
    }

    /**
     * Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口
     */
    public SyncInnerMeterforagsignResponse syncInnerMeterforagsignEx(SyncInnerMeterforagsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.meterforagsign.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerMeterforagsignResponse());
    }

    /**
     * Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表
     */
    public AllInnerTemplateResponse allInnerTemplate(AllInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表
     */
    public AllInnerTemplateResponse allInnerTemplateEx(AllInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表
     */
    public ListInnerTemplateResponse listInnerTemplate(ListInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表
     */
    public ListInnerTemplateResponse listInnerTemplateEx(ListInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情
     */
    public DetailInnerTemplateResponse detailInnerTemplate(DetailInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情
     */
    public DetailInnerTemplateResponse detailInnerTemplateEx(DetailInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，创建魔法库模板
     * Summary: 创建模板
     */
    public CreateInnerTemplateResponse createInnerTemplate(CreateInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，创建魔法库模板
     * Summary: 创建模板
     */
    public CreateInnerTemplateResponse createInnerTemplateEx(CreateInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板
     */
    public SaveInnerTemplateResponse saveInnerTemplate(SaveInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板
     */
    public SaveInnerTemplateResponse saveInnerTemplateEx(SaveInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区
     */
    public SaveInnerSignfieldsResponse saveInnerSignfields(SaveInnerSignfieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveInnerSignfieldsEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区
     */
    public SaveInnerSignfieldsResponse saveInnerSignfieldsEx(SaveInnerSignfieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.signfields.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveInnerSignfieldsResponse());
    }

    /**
     * Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板
     */
    public PublishInnerTemplateResponse publishInnerTemplate(PublishInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板
     */
    public PublishInnerTemplateResponse publishInnerTemplateEx(PublishInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板
     */
    public PreviewInnerTemplateResponse previewInnerTemplate(PreviewInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板
     */
    public PreviewInnerTemplateResponse previewInnerTemplateEx(PreviewInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板
     */
    public DeleteInnerTemplateResponse deleteInnerTemplate(DeleteInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板
     */
    public DeleteInnerTemplateResponse deleteInnerTemplateEx(DeleteInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteInnerTemplateResponse());
    }

    /**
     * Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板
     */
    public CloneInnerTemplateResponse cloneInnerTemplate(CloneInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板
     */
    public CloneInnerTemplateResponse cloneInnerTemplateEx(CloneInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneInnerTemplateResponse());
    }

    /**
     * Description: ato文件上传
     * Summary: ato文件上传
     */
    public UploadInnerFileResponse uploadInnerFile(UploadInnerFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadInnerFileEx(request, headers, runtime);
    }

    /**
     * Description: ato文件上传
     * Summary: ato文件上传
     */
    public UploadInnerFileResponse uploadInnerFileEx(UploadInnerFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadInnerFileResponse());
    }

    /**
     * Description: ato文件下载
     * Summary: ato文件下载
     */
    public DownloadInnerFileResponse downloadInnerFile(DownloadInnerFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadInnerFileEx(request, headers, runtime);
    }

    /**
     * Description: ato文件下载
     * Summary: ato文件下载
     */
    public DownloadInnerFileResponse downloadInnerFileEx(DownloadInnerFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.file.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadInnerFileResponse());
    }

    /**
     * Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL
     */
    public GetInnerTemplateofficeurlResponse getInnerTemplateofficeurl(GetInnerTemplateofficeurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerTemplateofficeurlEx(request, headers, runtime);
    }

    /**
     * Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL
     */
    public GetInnerTemplateofficeurlResponse getInnerTemplateofficeurlEx(GetInnerTemplateofficeurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateofficeurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerTemplateofficeurlResponse());
    }

    /**
     * Description: 魔法库控制台刷新token
     * Summary: 刷新token
     */
    public RefreshInnerTemplatetokenResponse refreshInnerTemplatetoken(RefreshInnerTemplatetokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshInnerTemplatetokenEx(request, headers, runtime);
    }

    /**
     * Description: 魔法库控制台刷新token
     * Summary: 刷新token
     */
    public RefreshInnerTemplatetokenResponse refreshInnerTemplatetokenEx(RefreshInnerTemplatetokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatetoken.refresh", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefreshInnerTemplatetokenResponse());
    }

    /**
     * Description: 创建文本域（组件）
     * Summary: 创建文本域
     */
    public CreateInnerTemplatetextareaResponse createInnerTemplatetextarea(CreateInnerTemplatetextareaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerTemplatetextareaEx(request, headers, runtime);
    }

    /**
     * Description: 创建文本域（组件）
     * Summary: 创建文本域
     */
    public CreateInnerTemplatetextareaResponse createInnerTemplatetextareaEx(CreateInnerTemplatetextareaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatetextarea.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerTemplatetextareaResponse());
    }

    /**
     * Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表
     */
    public QueryInnerTemplateimageResponse queryInnerTemplateimage(QueryInnerTemplateimageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateimageEx(request, headers, runtime);
    }

    /**
     * Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表
     */
    public QueryInnerTemplateimageResponse queryInnerTemplateimageEx(QueryInnerTemplateimageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateimageResponse());
    }

    /**
     * Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息
     */
    public CreateInnerFunddividerelationResponse createInnerFunddividerelation(CreateInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息
     */
    public CreateInnerFunddividerelationResponse createInnerFunddividerelationEx(CreateInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerFunddividerelationResponse());
    }

    /**
     * Description: 提交分账关系信息
     * Summary: 提交分账关系信息
     */
    public SubmitInnerFunddividerelationResponse submitInnerFunddividerelation(SubmitInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * Description: 提交分账关系信息
     * Summary: 提交分账关系信息
     */
    public SubmitInnerFunddividerelationResponse submitInnerFunddividerelationEx(SubmitInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerFunddividerelationResponse());
    }

    /**
     * Description: 查询分账关系信息
     * Summary: 查询分账关系信息
     */
    public QueryInnerFunddividerelationResponse queryInnerFunddividerelation(QueryInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * Description: 查询分账关系信息
     * Summary: 查询分账关系信息
     */
    public QueryInnerFunddividerelationResponse queryInnerFunddividerelationEx(QueryInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFunddividerelationResponse());
    }

    /**
     * Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表
     */
    public PagequeryInnerFunddividerelationResponse pagequeryInnerFunddividerelation(PagequeryInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表
     */
    public PagequeryInnerFunddividerelationResponse pagequeryInnerFunddividerelationEx(PagequeryInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerFunddividerelationResponse());
    }

    /**
     * Description: 保存租户签约信息
     * Summary: 保存租户签约信息
     */
    public CreateInnerMerchantagreementResponse createInnerMerchantagreement(CreateInnerMerchantagreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerMerchantagreementEx(request, headers, runtime);
    }

    /**
     * Description: 保存租户签约信息
     * Summary: 保存租户签约信息
     */
    public CreateInnerMerchantagreementResponse createInnerMerchantagreementEx(CreateInnerMerchantagreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagreement.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerMerchantagreementResponse());
    }

    /**
     * Description: 查询租户签约信息
     * Summary: 查询租户签约信息
     */
    public QueryInnerMerchantagreementResponse queryInnerMerchantagreement(QueryInnerMerchantagreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerMerchantagreementEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户签约信息
     * Summary: 查询租户签约信息
     */
    public QueryInnerMerchantagreementResponse queryInnerMerchantagreementEx(QueryInnerMerchantagreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerMerchantagreementResponse());
    }

    /**
     * Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表
     */
    public PagequeryInnerMerchantagreementResponse pagequeryInnerMerchantagreement(PagequeryInnerMerchantagreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerMerchantagreementEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表
     */
    public PagequeryInnerMerchantagreementResponse pagequeryInnerMerchantagreementEx(PagequeryInnerMerchantagreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagreement.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerMerchantagreementResponse());
    }

    /**
     * Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息
     */
    public CreateInnerMerchantpayexpandResponse createInnerMerchantpayexpand(CreateInnerMerchantpayexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerMerchantpayexpandEx(request, headers, runtime);
    }

    /**
     * Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息
     */
    public CreateInnerMerchantpayexpandResponse createInnerMerchantpayexpandEx(CreateInnerMerchantpayexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerMerchantpayexpandResponse());
    }

    /**
     * Description: 提交进件信息
     * Summary: 提交进件信息
     */
    public SubmitInnerMerchantpayexpandResponse submitInnerMerchantpayexpand(SubmitInnerMerchantpayexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerMerchantpayexpandEx(request, headers, runtime);
    }

    /**
     * Description: 提交进件信息
     * Summary: 提交进件信息
     */
    public SubmitInnerMerchantpayexpandResponse submitInnerMerchantpayexpandEx(SubmitInnerMerchantpayexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerMerchantpayexpandResponse());
    }

    /**
     * Description: 查询进件信息
     * Summary: 查询进件信息
     */
    public QueryInnerMerchantpayexpandResponse queryInnerMerchantpayexpand(QueryInnerMerchantpayexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerMerchantpayexpandEx(request, headers, runtime);
    }

    /**
     * Description: 查询进件信息
     * Summary: 查询进件信息
     */
    public QueryInnerMerchantpayexpandResponse queryInnerMerchantpayexpandEx(QueryInnerMerchantpayexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerMerchantpayexpandResponse());
    }

    /**
     * Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用
     */
    public PagequeryInnerMerchantagentResponse pagequeryInnerMerchantagent(PagequeryInnerMerchantagentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerMerchantagentEx(request, headers, runtime);
    }

    /**
     * Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用
     */
    public PagequeryInnerMerchantagentResponse pagequeryInnerMerchantagentEx(PagequeryInnerMerchantagentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagent.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerMerchantagentResponse());
    }

    /**
     * Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件
     */
    public CloneInnerTemplatefileaddressResponse cloneInnerTemplatefileaddress(CloneInnerTemplatefileaddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneInnerTemplatefileaddressEx(request, headers, runtime);
    }

    /**
     * Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件
     */
    public CloneInnerTemplatefileaddressResponse cloneInnerTemplatefileaddressEx(CloneInnerTemplatefileaddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatefileaddress.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneInnerTemplatefileaddressResponse());
    }

    /**
     * Description: 查询签署区
     * Summary: 查询签署区
     */
    public QueryInnerSignfieldsResponse queryInnerSignfields(QueryInnerSignfieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerSignfieldsEx(request, headers, runtime);
    }

    /**
     * Description: 查询签署区
     * Summary: 查询签署区
     */
    public QueryInnerSignfieldsResponse queryInnerSignfieldsEx(QueryInnerSignfieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.signfields.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerSignfieldsResponse());
    }

    /**
     * Description: 同步已发布的模板
     * Summary: 同步已发布的模板
     */
    public SyncInnerTemplateResponse syncInnerTemplate(SyncInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 同步已发布的模板
     * Summary: 同步已发布的模板
     */
    public SyncInnerTemplateResponse syncInnerTemplateEx(SyncInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTemplateResponse());
    }

    /**
     * Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息
     */
    public UpdateInnerTemplateResponse updateInnerTemplate(UpdateInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息
     */
    public UpdateInnerTemplateResponse updateInnerTemplateEx(UpdateInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInnerTemplateResponse());
    }

    /**
     * Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息
     */
    public QueryInnerTemplateResponse queryInnerTemplate(QueryInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息
     */
    public QueryInnerTemplateResponse queryInnerTemplateEx(QueryInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateResponse());
    }

    /**
     * Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息
     */
    public QueryInnerTemplateelementlinkResponse queryInnerTemplateelementlink(QueryInnerTemplateelementlinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateelementlinkEx(request, headers, runtime);
    }

    /**
     * Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息
     */
    public QueryInnerTemplateelementlinkResponse queryInnerTemplateelementlinkEx(QueryInnerTemplateelementlinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateelementlinkResponse());
    }

    /**
     * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情
     */
    public QueryInnerTemplateversionResponse queryInnerTemplateversion(QueryInnerTemplateversionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateversionEx(request, headers, runtime);
    }

    /**
     * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情
     */
    public QueryInnerTemplateversionResponse queryInnerTemplateversionEx(QueryInnerTemplateversionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateversion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateversionResponse());
    }

    /**
     * Description: 订单消息查询
     * Summary: 订单消息查询
     */
    public PagequeryInnerOrdermsgResponse pagequeryInnerOrdermsg(PagequeryInnerOrdermsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerOrdermsgEx(request, headers, runtime);
    }

    /**
     * Description: 订单消息查询
     * Summary: 订单消息查询
     */
    public PagequeryInnerOrdermsgResponse pagequeryInnerOrdermsgEx(PagequeryInnerOrdermsgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.ordermsg.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerOrdermsgResponse());
    }

    /**
     * Description: 订单消息重试
     * Summary: 订单消息重试
     */
    public RetryInnerOrdermsgResponse retryInnerOrdermsg(RetryInnerOrdermsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryInnerOrdermsgEx(request, headers, runtime);
    }

    /**
     * Description: 订单消息重试
     * Summary: 订单消息重试
     */
    public RetryInnerOrdermsgResponse retryInnerOrdermsgEx(RetryInnerOrdermsgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.ordermsg.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryInnerOrdermsgResponse());
    }

    /**
     * Description: 法务协议授权-  签署合同代扣前置授权查询接口
     * Summary: 签署合同代扣前置授权查询接口
     */
    public QueryInnerAuthorizationResponse queryInnerAuthorization(QueryInnerAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 法务协议授权-  签署合同代扣前置授权查询接口
     * Summary: 签署合同代扣前置授权查询接口
     */
    public QueryInnerAuthorizationResponse queryInnerAuthorizationEx(QueryInnerAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.authorization.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerAuthorizationResponse());
    }

    /**
     * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
     * Summary: 签署合同代扣前置同意授权接口
     */
    public SignInnerAuthorizationResponse signInnerAuthorization(SignInnerAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signInnerAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
     * Summary: 签署合同代扣前置同意授权接口
     */
    public SignInnerAuthorizationResponse signInnerAuthorizationEx(SignInnerAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.authorization.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignInnerAuthorizationResponse());
    }

    /**
     * Description: 小程序法务授权 - 商户补充协议状态查询接口
     * Summary: 商户补充协议状态查询接口
     */
    public QueryInnerSupplementalResponse queryInnerSupplemental(QueryInnerSupplementalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerSupplementalEx(request, headers, runtime);
    }

    /**
     * Description: 小程序法务授权 - 商户补充协议状态查询接口
     * Summary: 商户补充协议状态查询接口
     */
    public QueryInnerSupplementalResponse queryInnerSupplementalEx(QueryInnerSupplementalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.supplemental.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerSupplementalResponse());
    }

    /**
     * Description: 法务协议授权 - 商户补充协议状态同意接口
     * Summary: 商户补充协议状态同意接口
     */
    public SignInnerSupplementalResponse signInnerSupplemental(SignInnerSupplementalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signInnerSupplementalEx(request, headers, runtime);
    }

    /**
     * Description: 法务协议授权 - 商户补充协议状态同意接口
     * Summary: 商户补充协议状态同意接口
     */
    public SignInnerSupplementalResponse signInnerSupplementalEx(SignInnerSupplementalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.supplemental.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignInnerSupplementalResponse());
    }

    /**
     * Description: 查询代扣计划
     * Summary: 代扣计划查询
     */
    public QueryInnerWithholdplanResponse queryInnerWithholdplan(QueryInnerWithholdplanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerWithholdplanEx(request, headers, runtime);
    }

    /**
     * Description: 查询代扣计划
     * Summary: 代扣计划查询
     */
    public QueryInnerWithholdplanResponse queryInnerWithholdplanEx(QueryInnerWithholdplanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.withholdplan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerWithholdplanResponse());
    }

    /**
     * Description: 创建代扣协议
     * Summary: 创建代扣协议
     */
    public CreateInnerWithholdsignResponse createInnerWithholdsign(CreateInnerWithholdsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerWithholdsignEx(request, headers, runtime);
    }

    /**
     * Description: 创建代扣协议
     * Summary: 创建代扣协议
     */
    public CreateInnerWithholdsignResponse createInnerWithholdsignEx(CreateInnerWithholdsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.withholdsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerWithholdsignResponse());
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryInnerWithholdsignResponse queryInnerWithholdsign(QueryInnerWithholdsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerWithholdsignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryInnerWithholdsignResponse queryInnerWithholdsignEx(QueryInnerWithholdsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.withholdsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerWithholdsignResponse());
    }

    /**
     * Description: 获取商户进件静态枚举数据
     * Summary: 获取商户进件静态枚举数据
     */
    public GetInnerMerchantstaticdataResponse getInnerMerchantstaticdata(GetInnerMerchantstaticdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerMerchantstaticdataEx(request, headers, runtime);
    }

    /**
     * Description: 获取商户进件静态枚举数据
     * Summary: 获取商户进件静态枚举数据
     */
    public GetInnerMerchantstaticdataResponse getInnerMerchantstaticdataEx(GetInnerMerchantstaticdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantstaticdata.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerMerchantstaticdataResponse());
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻
     */
    public RegisterMerchantexpandMerchantResponse registerMerchantexpandMerchant(RegisterMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻
     */
    public RegisterMerchantexpandMerchantResponse registerMerchantexpandMerchantEx(RegisterMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterMerchantexpandMerchantResponse());
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接
     */
    public UploadMerchantexpandFileResponse uploadMerchantexpandFile(UploadMerchantexpandFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadMerchantexpandFileEx(request, headers, runtime);
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接
     */
    public UploadMerchantexpandFileResponse uploadMerchantexpandFileEx(UploadMerchantexpandFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadMerchantexpandFileResponse());
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询
     */
    public QueryMerchantexpandMerchantResponse queryMerchantexpandMerchant(QueryMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询
     */
    public QueryMerchantexpandMerchantResponse queryMerchantexpandMerchantEx(QueryMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantexpandMerchantResponse());
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改
     */
    public UpdateMerchantexpandMerchantResponse updateMerchantexpandMerchant(UpdateMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改
     */
    public UpdateMerchantexpandMerchantResponse updateMerchantexpandMerchantEx(UpdateMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMerchantexpandMerchantResponse());
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateRealpersonFacevrfResponse createRealpersonFacevrf(CreateRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateRealpersonFacevrfResponse createRealpersonFacevrfEx(CreateRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRealpersonFacevrfResponse());
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryRealpersonFacevrfResponse queryRealpersonFacevrf(QueryRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryRealpersonFacevrfResponse queryRealpersonFacevrfEx(QueryRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRealpersonFacevrfResponse());
    }

    /**
     * Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分
     */
    public QueryRiskResponse queryRisk(QueryRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskEx(request, headers, runtime);
    }

    /**
     * Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分
     */
    public QueryRiskResponse queryRiskEx(QueryRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskResponse());
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllSignTemplateResponse allSignTemplate(AllSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allSignTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllSignTemplateResponse allSignTemplateEx(AllSignTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllSignTemplateResponse());
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）
     */
    public SubmitSignFlowResponse submitSignFlow(SubmitSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）
     */
    public SubmitSignFlowResponse submitSignFlowEx(SubmitSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitSignFlowResponse());
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetSignFlowResponse getSignFlow(GetSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetSignFlowResponse getSignFlowEx(GetSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSignFlowResponse());
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作
     */
    public AuthSignFlowResponse authSignFlow(AuthSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作
     */
    public AuthSignFlowResponse authSignFlowEx(AuthSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthSignFlowResponse());
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）
     */
    public SubmitFrontSignResponse submitFrontSign(SubmitFrontSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitFrontSignEx(request, headers, runtime);
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）
     */
    public SubmitFrontSignResponse submitFrontSignEx(SubmitFrontSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitFrontSignResponse());
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口
     */
    public UploadSignFlowResponse uploadSignFlow(UploadSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口
     */
    public UploadSignFlowResponse uploadSignFlowEx(UploadSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.sign.flow.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadSignFlowResponse uploadSignFlowResponse = UploadSignFlowResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadSignFlowResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSignFlowResponse());
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传
     */
    public UploadSignTemplateResponse uploadSignTemplate(UploadSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSignTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传
     */
    public UploadSignTemplateResponse uploadSignTemplateEx(UploadSignTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.sign.template.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadSignTemplateResponse uploadSignTemplateResponse = UploadSignTemplateResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadSignTemplateResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSignTemplateResponse());
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传
     */
    public UploadSignCreditResponse uploadSignCredit(UploadSignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSignCreditEx(request, headers, runtime);
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传
     */
    public UploadSignCreditResponse uploadSignCreditEx(UploadSignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSignCreditResponse());
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询
     */
    public QuerySignCreditResponse querySignCredit(QuerySignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySignCreditEx(request, headers, runtime);
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询
     */
    public QuerySignCreditResponse querySignCreditEx(QuerySignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySignCreditResponse());
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程
     */
    public CancelSignFlowResponse cancelSignFlow(CancelSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程
     */
    public CancelSignFlowResponse cancelSignFlowEx(CancelSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSignFlowResponse());
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncTradeResponse syncTrade(SyncTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeEx(request, headers, runtime);
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncTradeResponse syncTradeEx(SyncTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeResponse());
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetTradeResponse getTrade(GetTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeEx(request, headers, runtime);
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetTradeResponse getTradeEx(GetTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeResponse());
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建
     */
    public SyncFrontTradeResponse syncFrontTrade(SyncFrontTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFrontTradeEx(request, headers, runtime);
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建
     */
    public SyncFrontTradeResponse syncFrontTradeEx(SyncFrontTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFrontTradeResponse());
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口
     */
    public SyncTradeFinanceloanapplyResponse syncTradeFinanceloanapply(SyncTradeFinanceloanapplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeFinanceloanapplyEx(request, headers, runtime);
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口
     */
    public SyncTradeFinanceloanapplyResponse syncTradeFinanceloanapplyEx(SyncTradeFinanceloanapplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeFinanceloanapplyResponse());
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询
     */
    public GetTradeMerchantfulfillmentResponse getTradeMerchantfulfillment(GetTradeMerchantfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeMerchantfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询
     */
    public GetTradeMerchantfulfillmentResponse getTradeMerchantfulfillmentEx(GetTradeMerchantfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeMerchantfulfillmentResponse());
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）
     */
    public GetTradeUserperformanceResponse getTradeUserperformance(GetTradeUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeUserperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）
     */
    public GetTradeUserperformanceResponse getTradeUserperformanceEx(GetTradeUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeUserperformanceResponse());
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetTradeMerchantperformanceResponse getTradeMerchantperformance(GetTradeMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetTradeMerchantperformanceResponse getTradeMerchantperformanceEx(GetTradeMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeMerchantperformanceResponse());
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改
     */
    public UpdateTradeUserpromiseResponse updateTradeUserpromise(UpdateTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改
     */
    public UpdateTradeUserpromiseResponse updateTradeUserpromiseEx(UpdateTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTradeUserpromiseResponse());
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件
     */
    public SyncFrontIndirectorderResponse syncFrontIndirectorder(SyncFrontIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFrontIndirectorderEx(request, headers, runtime);
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件
     */
    public SyncFrontIndirectorderResponse syncFrontIndirectorderEx(SyncFrontIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFrontIndirectorderResponse());
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件
     */
    public SyncTradeIndirectorderResponse syncTradeIndirectorder(SyncTradeIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeIndirectorderEx(request, headers, runtime);
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件
     */
    public SyncTradeIndirectorderResponse syncTradeIndirectorderEx(SyncTradeIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeIndirectorderResponse());
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新
     */
    public ReplaceTradeUserpromiseResponse replaceTradeUserpromise(ReplaceTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新
     */
    public ReplaceTradeUserpromiseResponse replaceTradeUserpromiseEx(ReplaceTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceTradeUserpromiseResponse());
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口
     */
    public ApplyTradeFinanceprecheckResponse applyTradeFinanceprecheck(ApplyTradeFinanceprecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTradeFinanceprecheckEx(request, headers, runtime);
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口
     */
    public ApplyTradeFinanceprecheckResponse applyTradeFinanceprecheckEx(ApplyTradeFinanceprecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTradeFinanceprecheckResponse());
    }

    /**
     * Description: 代扣签约创建
     * Summary: 代扣签约
     */
    public CreateWithholdSignResponse createWithholdSign(CreateWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约创建
     * Summary: 代扣签约
     */
    public CreateWithholdSignResponse createWithholdSignEx(CreateWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdSignResponse());
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryWithholdSignResponse queryWithholdSign(QueryWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryWithholdSignResponse queryWithholdSignEx(QueryWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdSignResponse());
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑
     */
    public UnbindWithholdSignResponse unbindWithholdSign(UnbindWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑
     */
    public UnbindWithholdSignResponse unbindWithholdSignEx(UnbindWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindWithholdSignResponse());
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划
     */
    public CancelWithholdPlanResponse cancelWithholdPlan(CancelWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划
     */
    public CancelWithholdPlanResponse cancelWithholdPlanEx(CancelWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelWithholdPlanResponse());
    }

    /**
     * Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消
     */
    public RepayWithholdPlanResponse repayWithholdPlan(RepayWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消
     */
    public RepayWithholdPlanResponse repayWithholdPlanEx(RepayWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayWithholdPlanResponse());
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试
     */
    public RetryWithholdPlanResponse retryWithholdPlan(RetryWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试
     */
    public RetryWithholdPlanResponse retryWithholdPlanEx(RetryWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryWithholdPlanResponse());
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认
     */
    public ConfirmWithholdSignasyncunsignResponse confirmWithholdSignasyncunsign(ConfirmWithholdSignasyncunsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmWithholdSignasyncunsignEx(request, headers, runtime);
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认
     */
    public ConfirmWithholdSignasyncunsignResponse confirmWithholdSignasyncunsignEx(ConfirmWithholdSignasyncunsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmWithholdSignasyncunsignResponse());
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建
     */
    public CreateWithholdActivepayResponse createWithholdActivepay(CreateWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建
     */
    public CreateWithholdActivepayResponse createWithholdActivepayEx(CreateWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdActivepayResponse());
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询
     */
    public QueryWithholdActivepayResponse queryWithholdActivepay(QueryWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询
     */
    public QueryWithholdActivepayResponse queryWithholdActivepayEx(QueryWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdActivepayResponse());
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消
     */
    public CancelWithholdActivepayResponse cancelWithholdActivepay(CancelWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消
     */
    public CancelWithholdActivepayResponse cancelWithholdActivepayEx(CancelWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelWithholdActivepayResponse());
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请
     */
    public CreateWithholdRefundResponse createWithholdRefund(CreateWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdRefundEx(request, headers, runtime);
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请
     */
    public CreateWithholdRefundResponse createWithholdRefundEx(CreateWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdRefundResponse());
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询
     */
    public QueryWithholdRefundResponse queryWithholdRefund(QueryWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdRefundEx(request, headers, runtime);
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询
     */
    public QueryWithholdRefundResponse queryWithholdRefundEx(QueryWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdRefundResponse());
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
