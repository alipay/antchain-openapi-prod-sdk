// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.securitytechpoi.models.*;

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
                    new TeaPair("sdk_version", "1.0.5"),
                    new TeaPair("_prod_code", "SECURITYTECHPOI"),
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
     * <p>Description: 订单状态查询接口
     * Summary: 订单状态查询接口</p>
     */
    public QueryAntsecuritytechGatewayPoiOrderResponse queryAntsecuritytechGatewayPoiOrder(QueryAntsecuritytechGatewayPoiOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntsecuritytechGatewayPoiOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单状态查询接口
     * Summary: 订单状态查询接口</p>
     */
    public QueryAntsecuritytechGatewayPoiOrderResponse queryAntsecuritytechGatewayPoiOrderEx(QueryAntsecuritytechGatewayPoiOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntsecuritytechGatewayPoiOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分充值
     * Summary: 积分充值</p>
     */
    public RechargeAntsecuritytechGatewayPoiMallpointResponse rechargeAntsecuritytechGatewayPoiMallpoint(RechargeAntsecuritytechGatewayPoiMallpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rechargeAntsecuritytechGatewayPoiMallpointEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分充值
     * Summary: 积分充值</p>
     */
    public RechargeAntsecuritytechGatewayPoiMallpointResponse rechargeAntsecuritytechGatewayPoiMallpointEx(RechargeAntsecuritytechGatewayPoiMallpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.mallpoint.recharge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RechargeAntsecuritytechGatewayPoiMallpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 逾期通知
     * Summary: 逾期通知</p>
     */
    public OverdueAntsecuritytechGatewayPoiTerminationResponse overdueAntsecuritytechGatewayPoiTermination(OverdueAntsecuritytechGatewayPoiTerminationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.overdueAntsecuritytechGatewayPoiTerminationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 逾期通知
     * Summary: 逾期通知</p>
     */
    public OverdueAntsecuritytechGatewayPoiTerminationResponse overdueAntsecuritytechGatewayPoiTerminationEx(OverdueAntsecuritytechGatewayPoiTerminationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.termination.overdue", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OverdueAntsecuritytechGatewayPoiTerminationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 余额查询
     * Summary: 余额查询</p>
     */
    public QueryAntsecuritytechGatewayPoiMallpointbalanceResponse queryAntsecuritytechGatewayPoiMallpointbalance(QueryAntsecuritytechGatewayPoiMallpointbalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntsecuritytechGatewayPoiMallpointbalanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 余额查询
     * Summary: 余额查询</p>
     */
    public QueryAntsecuritytechGatewayPoiMallpointbalanceResponse queryAntsecuritytechGatewayPoiMallpointbalanceEx(QueryAntsecuritytechGatewayPoiMallpointbalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.mallpointbalance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntsecuritytechGatewayPoiMallpointbalanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约信息查询
     * Summary: 解约信息查询</p>
     */
    public QueryAntsecuritytechGatewayPoiTerminationResponse queryAntsecuritytechGatewayPoiTermination(QueryAntsecuritytechGatewayPoiTerminationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntsecuritytechGatewayPoiTerminationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约信息查询
     * Summary: 解约信息查询</p>
     */
    public QueryAntsecuritytechGatewayPoiTerminationResponse queryAntsecuritytechGatewayPoiTerminationEx(QueryAntsecuritytechGatewayPoiTerminationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.termination.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntsecuritytechGatewayPoiTerminationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约
     * Summary: 解约</p>
     */
    public ApplyAntsecuritytechGatewayPoiTerminationResponse applyAntsecuritytechGatewayPoiTermination(ApplyAntsecuritytechGatewayPoiTerminationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAntsecuritytechGatewayPoiTerminationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约
     * Summary: 解约</p>
     */
    public ApplyAntsecuritytechGatewayPoiTerminationResponse applyAntsecuritytechGatewayPoiTerminationEx(ApplyAntsecuritytechGatewayPoiTerminationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.termination.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAntsecuritytechGatewayPoiTerminationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 账户查询
     * Summary: 账户查询</p>
     */
    public QueryAntsecuritytechGatewayPoiMallpointaccountResponse queryAntsecuritytechGatewayPoiMallpointaccount(QueryAntsecuritytechGatewayPoiMallpointaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntsecuritytechGatewayPoiMallpointaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 账户查询
     * Summary: 账户查询</p>
     */
    public QueryAntsecuritytechGatewayPoiMallpointaccountResponse queryAntsecuritytechGatewayPoiMallpointaccountEx(QueryAntsecuritytechGatewayPoiMallpointaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.mallpointaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntsecuritytechGatewayPoiMallpointaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分冻结
     * Summary: 积分冻结</p>
     */
    public FreezeAntsecuritytechGatewayPoiMallpointResponse freezeAntsecuritytechGatewayPoiMallpoint(FreezeAntsecuritytechGatewayPoiMallpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeAntsecuritytechGatewayPoiMallpointEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分冻结
     * Summary: 积分冻结</p>
     */
    public FreezeAntsecuritytechGatewayPoiMallpointResponse freezeAntsecuritytechGatewayPoiMallpointEx(FreezeAntsecuritytechGatewayPoiMallpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.mallpoint.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeAntsecuritytechGatewayPoiMallpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分解冻
     * Summary: 积分解冻</p>
     */
    public UnfreezeAntsecuritytechGatewayPoiMallpointResponse unfreezeAntsecuritytechGatewayPoiMallpoint(UnfreezeAntsecuritytechGatewayPoiMallpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeAntsecuritytechGatewayPoiMallpointEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分解冻
     * Summary: 积分解冻</p>
     */
    public UnfreezeAntsecuritytechGatewayPoiMallpointResponse unfreezeAntsecuritytechGatewayPoiMallpointEx(UnfreezeAntsecuritytechGatewayPoiMallpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.mallpoint.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeAntsecuritytechGatewayPoiMallpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分扣减
     * Summary: 积分扣减</p>
     */
    public DeductAntsecuritytechGatewayPoiMallpointResponse deductAntsecuritytechGatewayPoiMallpoint(DeductAntsecuritytechGatewayPoiMallpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deductAntsecuritytechGatewayPoiMallpointEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 积分扣减
     * Summary: 积分扣减</p>
     */
    public DeductAntsecuritytechGatewayPoiMallpointResponse deductAntsecuritytechGatewayPoiMallpointEx(DeductAntsecuritytechGatewayPoiMallpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.mallpoint.deduct", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeductAntsecuritytechGatewayPoiMallpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ISV取消订单接口
     * Summary: ISV取消订单接口</p>
     */
    public CancelAntsecuritytechGatewayPoiOrderResponse cancelAntsecuritytechGatewayPoiOrder(CancelAntsecuritytechGatewayPoiOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntsecuritytechGatewayPoiOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ISV取消订单接口
     * Summary: ISV取消订单接口</p>
     */
    public CancelAntsecuritytechGatewayPoiOrderResponse cancelAntsecuritytechGatewayPoiOrderEx(CancelAntsecuritytechGatewayPoiOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.poi.order.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntsecuritytechGatewayPoiOrderResponse());
    }
}
