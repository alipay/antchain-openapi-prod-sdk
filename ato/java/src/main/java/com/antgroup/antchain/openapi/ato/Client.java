// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ato.models.*;
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
                    new TeaPair("sdk_version", "1.7.13"),
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
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步
     */
    public SyncFundSplittingResponse syncFundSplitting(SyncFundSplittingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundSplittingEx(request, headers, runtime);
    }

    /**
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步
     */
    public SyncFundSplittingResponse syncFundSplittingEx(SyncFundSplittingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundSplittingResponse());
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步
     */
    public SyncFundOrderfinancialResponse syncFundOrderfinancial(SyncFundOrderfinancialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundOrderfinancialEx(request, headers, runtime);
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步
     */
    public SyncFundOrderfinancialResponse syncFundOrderfinancialEx(SyncFundOrderfinancialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundOrderfinancialResponse());
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
     */
    public SyncFundWithholdingcontractResponse syncFundWithholdingcontract(SyncFundWithholdingcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundWithholdingcontractEx(request, headers, runtime);
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
     */
    public SyncFundWithholdingcontractResponse syncFundWithholdingcontractEx(SyncFundWithholdingcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundWithholdingcontractResponse());
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息
     */
    public SyncFundOrderfulfillmentResponse syncFundOrderfulfillment(SyncFundOrderfulfillmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息
     */
    public SyncFundOrderfulfillmentResponse syncFundOrderfulfillmentEx(SyncFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundOrderfulfillmentResponse());
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息
     */
    public GetFundOrderfulfillmentResponse getFundOrderfulfillment(GetFundOrderfulfillmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息
     */
    public GetFundOrderfulfillmentResponse getFundOrderfulfillmentEx(GetFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundOrderfulfillmentResponse());
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口
     */
    public UploadFundFlowResponse uploadFundFlow(UploadFundFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口
     */
    public UploadFundFlowResponse uploadFundFlowEx(UploadFundFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口
     */
    public GetFundFlowResponse getFundFlowEx(GetFundFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundFlowResponse());
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知
     */
    public RefuseFundFlowResponse refuseFundFlow(RefuseFundFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知
     */
    public RefuseFundFlowResponse refuseFundFlowEx(RefuseFundFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseFundFlowResponse());
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口
     */
    public AuthFundFlowResponse authFundFlow(AuthFundFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authFundFlowEx(request, headers, runtime);
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口
     */
    public AuthFundFlowResponse authFundFlowEx(AuthFundFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthFundFlowResponse());
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消
     */
    public CancelFundPlanResponse cancelFundPlan(CancelFundPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelFundPlanEx(request, headers, runtime);
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消
     */
    public CancelFundPlanResponse cancelFundPlanEx(CancelFundPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelFundPlanResponse());
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调
     */
    public CallbackFundNotifyResponse callbackFundNotify(CallbackFundNotifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackFundNotifyEx(request, headers, runtime);
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调
     */
    public CallbackFundNotifyResponse callbackFundNotifyEx(CallbackFundNotifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackFundNotifyResponse());
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步
     */
    public SyncFundMerchantpromiseResponse syncFundMerchantpromise(SyncFundMerchantpromiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundMerchantpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步
     */
    public SyncFundMerchantpromiseResponse syncFundMerchantpromiseEx(SyncFundMerchantpromiseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundMerchantpromiseResponse());
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步
     */
    public SyncFundFinanceloanresultsResponse syncFundFinanceloanresults(SyncFundFinanceloanresultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundFinanceloanresultsEx(request, headers, runtime);
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步
     */
    public SyncFundFinanceloanresultsResponse syncFundFinanceloanresultsEx(SyncFundFinanceloanresultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundFinanceloanresultsResponse());
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺
     */
    public GetFundUserpromiseResponse getFundUserpromise(GetFundUserpromiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundUserpromiseEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺
     */
    public GetFundUserpromiseResponse getFundUserpromiseEx(GetFundUserpromiseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundUserpromiseResponse());
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）
     */
    public GetFundUserperformanceResponse getFundUserperformance(GetFundUserperformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundUserperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）
     */
    public GetFundUserperformanceResponse getFundUserperformanceEx(GetFundUserperformanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundUserperformanceResponse());
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetFundMerchantperformanceResponse getFundMerchantperformance(GetFundMerchantperformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetFundMerchantperformanceResponse getFundMerchantperformanceEx(GetFundMerchantperformanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundMerchantperformanceResponse());
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情
     */
    public GetFundOrderfullinfoResponse getFundOrderfullinfo(GetFundOrderfullinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundOrderfullinfoEx(request, headers, runtime);
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情
     */
    public GetFundOrderfullinfoResponse getFundOrderfullinfoEx(GetFundOrderfullinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundOrderfullinfoResponse());
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateRealpersonFacevrfResponse createRealpersonFacevrf(CreateRealpersonFacevrfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     */
    public CreateRealpersonFacevrfResponse createRealpersonFacevrfEx(CreateRealpersonFacevrfRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRealpersonFacevrfResponse());
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryRealpersonFacevrfResponse queryRealpersonFacevrf(QueryRealpersonFacevrfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果
     */
    public QueryRealpersonFacevrfResponse queryRealpersonFacevrfEx(QueryRealpersonFacevrfRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRealpersonFacevrfResponse());
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllSignTemplateResponse allSignTemplate(AllSignTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allSignTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     */
    public AllSignTemplateResponse allSignTemplateEx(AllSignTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllSignTemplateResponse());
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）
     */
    public SubmitSignFlowResponse submitSignFlow(SubmitSignFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）
     */
    public SubmitSignFlowResponse submitSignFlowEx(SubmitSignFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitSignFlowResponse());
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetSignFlowResponse getSignFlow(GetSignFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情
     */
    public GetSignFlowResponse getSignFlowEx(GetSignFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSignFlowResponse());
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作
     */
    public AuthSignFlowResponse authSignFlow(AuthSignFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作
     */
    public AuthSignFlowResponse authSignFlowEx(AuthSignFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthSignFlowResponse());
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）
     */
    public SubmitFrontSignResponse submitFrontSign(SubmitFrontSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitFrontSignEx(request, headers, runtime);
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）
     */
    public SubmitFrontSignResponse submitFrontSignEx(SubmitFrontSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitFrontSignResponse());
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口
     */
    public UploadSignFlowResponse uploadSignFlow(UploadSignFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSignFlowEx(request, headers, runtime);
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口
     */
    public UploadSignFlowResponse uploadSignFlowEx(UploadSignFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncTradeResponse syncTrade(SyncTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeEx(request, headers, runtime);
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口
     */
    public SyncTradeResponse syncTradeEx(SyncTradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeResponse());
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetTradeResponse getTrade(GetTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeEx(request, headers, runtime);
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情
     */
    public GetTradeResponse getTradeEx(GetTradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeResponse());
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建
     */
    public SyncFrontTradeResponse syncFrontTrade(SyncFrontTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFrontTradeEx(request, headers, runtime);
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建
     */
    public SyncFrontTradeResponse syncFrontTradeEx(SyncFrontTradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFrontTradeResponse());
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口
     */
    public SyncTradeFinanceloanapplyResponse syncTradeFinanceloanapply(SyncTradeFinanceloanapplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeFinanceloanapplyEx(request, headers, runtime);
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口
     */
    public SyncTradeFinanceloanapplyResponse syncTradeFinanceloanapplyEx(SyncTradeFinanceloanapplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeFinanceloanapplyResponse());
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询
     */
    public GetTradeMerchantfulfillmentResponse getTradeMerchantfulfillment(GetTradeMerchantfulfillmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeMerchantfulfillmentEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询
     */
    public GetTradeMerchantfulfillmentResponse getTradeMerchantfulfillmentEx(GetTradeMerchantfulfillmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeMerchantfulfillmentResponse());
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）
     */
    public GetTradeUserperformanceResponse getTradeUserperformance(GetTradeUserperformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeUserperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）
     */
    public GetTradeUserperformanceResponse getTradeUserperformanceEx(GetTradeUserperformanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeUserperformanceResponse());
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetTradeMerchantperformanceResponse getTradeMerchantperformance(GetTradeMerchantperformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）
     */
    public GetTradeMerchantperformanceResponse getTradeMerchantperformanceEx(GetTradeMerchantperformanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeMerchantperformanceResponse());
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约
     */
    public CreateWithholdSignResponse createWithholdSign(CreateWithholdSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约
     */
    public CreateWithholdSignResponse createWithholdSignEx(CreateWithholdSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdSignResponse());
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryWithholdSignResponse queryWithholdSign(QueryWithholdSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询
     */
    public QueryWithholdSignResponse queryWithholdSignEx(QueryWithholdSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdSignResponse());
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑
     */
    public UnbindWithholdSignResponse unbindWithholdSign(UnbindWithholdSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindWithholdSignEx(request, headers, runtime);
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑
     */
    public UnbindWithholdSignResponse unbindWithholdSignEx(UnbindWithholdSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindWithholdSignResponse());
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划
     */
    public CancelWithholdPlanResponse cancelWithholdPlan(CancelWithholdPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划
     */
    public CancelWithholdPlanResponse cancelWithholdPlanEx(CancelWithholdPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelWithholdPlanResponse());
    }

    /**
     * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
     * Summary: 代扣计划清偿/清欠
     */
    public RepayWithholdPlanResponse repayWithholdPlan(RepayWithholdPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
     * Summary: 代扣计划清偿/清欠
     */
    public RepayWithholdPlanResponse repayWithholdPlanEx(RepayWithholdPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayWithholdPlanResponse());
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试
     */
    public RetryWithholdPlanResponse retryWithholdPlan(RetryWithholdPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryWithholdPlanEx(request, headers, runtime);
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试
     */
    public RetryWithholdPlanResponse retryWithholdPlanEx(RetryWithholdPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryWithholdPlanResponse());
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认
     */
    public ConfirmWithholdSignasyncunsignResponse confirmWithholdSignasyncunsign(ConfirmWithholdSignasyncunsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmWithholdSignasyncunsignEx(request, headers, runtime);
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认
     */
    public ConfirmWithholdSignasyncunsignResponse confirmWithholdSignasyncunsignEx(ConfirmWithholdSignasyncunsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmWithholdSignasyncunsignResponse());
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建
     */
    public CreateWithholdActivepayResponse createWithholdActivepay(CreateWithholdActivepayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建
     */
    public CreateWithholdActivepayResponse createWithholdActivepayEx(CreateWithholdActivepayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdActivepayResponse());
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询
     */
    public QueryWithholdActivepayResponse queryWithholdActivepay(QueryWithholdActivepayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询
     */
    public QueryWithholdActivepayResponse queryWithholdActivepayEx(QueryWithholdActivepayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdActivepayResponse());
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消
     */
    public CancelWithholdActivepayResponse cancelWithholdActivepay(CancelWithholdActivepayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消
     */
    public CancelWithholdActivepayResponse cancelWithholdActivepayEx(CancelWithholdActivepayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelWithholdActivepayResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
