// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models.*;

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
                    new TeaPair("sdk_version", "1.0.0"),
                    new TeaPair("_prod_code", "ak_9705ae7650f74f47b1e8158151cc122f"),
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
     * Description: 发起数登申请
     * Summary: 发起数登申请
     */
    public CreateBlockchainBccrDciRegistrationResponse createBlockchainBccrDciRegistration(CreateBlockchainBccrDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBccrDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 发起数登申请
     * Summary: 发起数登申请
     */
    public CreateBlockchainBccrDciRegistrationResponse createBlockchainBccrDciRegistrationEx(CreateBlockchainBccrDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBccrDciRegistrationResponse());
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryBlockchainBccrDciRegistrationsubmitResponse queryBlockchainBccrDciRegistrationsubmit(QueryBlockchainBccrDciRegistrationsubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBccrDciRegistrationsubmitEx(request, headers, runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryBlockchainBccrDciRegistrationsubmitResponse queryBlockchainBccrDciRegistrationsubmitEx(QueryBlockchainBccrDciRegistrationsubmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBccrDciRegistrationsubmitResponse());
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果
     */
    public QueryBlockchainBccrDciRegistrationResponse queryBlockchainBccrDciRegistration(QueryBlockchainBccrDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBccrDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果
     */
    public QueryBlockchainBccrDciRegistrationResponse queryBlockchainBccrDciRegistrationEx(QueryBlockchainBccrDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBccrDciRegistrationResponse());
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接
     */
    public GetBlockchainBccrDciRegistrationcertResponse getBlockchainBccrDciRegistrationcert(GetBlockchainBccrDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接
     */
    public GetBlockchainBccrDciRegistrationcertResponse getBlockchainBccrDciRegistrationcertEx(GetBlockchainBccrDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBlockchainBccrDciRegistrationcertResponse());
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书
     */
    public CreateBlockchainBccrDciRegistrationcertResponse createBlockchainBccrDciRegistrationcert(CreateBlockchainBccrDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书
     */
    public CreateBlockchainBccrDciRegistrationcertResponse createBlockchainBccrDciRegistrationcertEx(CreateBlockchainBccrDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBccrDciRegistrationcertResponse());
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryBlockchainBccrDciRegistrationcertResponse queryBlockchainBccrDciRegistrationcert(QueryBlockchainBccrDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryBlockchainBccrDciRegistrationcertResponse queryBlockchainBccrDciRegistrationcertEx(QueryBlockchainBccrDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBccrDciRegistrationcertResponse());
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付
     */
    public GetBlockchainBccrDciPayurlResponse getBlockchainBccrDciPayurl(GetBlockchainBccrDciPayurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBlockchainBccrDciPayurlEx(request, headers, runtime);
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付
     */
    public GetBlockchainBccrDciPayurlResponse getBlockchainBccrDciPayurlEx(GetBlockchainBccrDciPayurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBlockchainBccrDciPayurlResponse());
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果
     */
    public QueryBlockchainBccrDciPayResponse queryBlockchainBccrDciPay(QueryBlockchainBccrDciPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBccrDciPayEx(request, headers, runtime);
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果
     */
    public QueryBlockchainBccrDciPayResponse queryBlockchainBccrDciPayEx(QueryBlockchainBccrDciPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBccrDciPayResponse());
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调
     */
    public CallbackBlockchainBccrDciPayresultResponse callbackBlockchainBccrDciPayresult(CallbackBlockchainBccrDciPayresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackBlockchainBccrDciPayresultEx(request, headers, runtime);
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调
     */
    public CallbackBlockchainBccrDciPayresultResponse callbackBlockchainBccrDciPayresultEx(CallbackBlockchainBccrDciPayresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackBlockchainBccrDciPayresultResponse());
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调
     */
    public RefuseBlockchainBccrDciRegistrationResponse refuseBlockchainBccrDciRegistration(RefuseBlockchainBccrDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseBlockchainBccrDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调
     */
    public RefuseBlockchainBccrDciRegistrationResponse refuseBlockchainBccrDciRegistrationEx(RefuseBlockchainBccrDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseBlockchainBccrDciRegistrationResponse());
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请
     */
    public RetryBlockchainBccrDciRegistrationResponse retryBlockchainBccrDciRegistration(RetryBlockchainBccrDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryBlockchainBccrDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请
     */
    public RetryBlockchainBccrDciRegistrationResponse retryBlockchainBccrDciRegistrationEx(RetryBlockchainBccrDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryBlockchainBccrDciRegistrationResponse());
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请
     */
    public CloseBlockchainBccrDciRegistrationResponse closeBlockchainBccrDciRegistration(CloseBlockchainBccrDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeBlockchainBccrDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请
     */
    public CloseBlockchainBccrDciRegistrationResponse closeBlockchainBccrDciRegistrationEx(CloseBlockchainBccrDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseBlockchainBccrDciRegistrationResponse());
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     */
    public CreateBlockchainBccrOrderResponse createBlockchainBccrOrder(CreateBlockchainBccrOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBccrOrderEx(request, headers, runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单
     */
    public CreateBlockchainBccrOrderResponse createBlockchainBccrOrderEx(CreateBlockchainBccrOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBccrOrderResponse());
    }

    /**
     * Description: 查询订单支付链接
     * Summary: 查询订单支付链接
     */
    public QueryBlockchainBccrOrderPayurlResponse queryBlockchainBccrOrderPayurl(QueryBlockchainBccrOrderPayurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBccrOrderPayurlEx(request, headers, runtime);
    }

    /**
     * Description: 查询订单支付链接
     * Summary: 查询订单支付链接
     */
    public QueryBlockchainBccrOrderPayurlResponse queryBlockchainBccrOrderPayurlEx(QueryBlockchainBccrOrderPayurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBccrOrderPayurlResponse());
    }

    /**
     * Description: 版保完成数登证书回调
     * Summary: 版保完成数登证书回调
     */
    public FinishBlockchainBccrDciRegistrationcertResponse finishBlockchainBccrDciRegistrationcert(FinishBlockchainBccrDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * Description: 版保完成数登证书回调
     * Summary: 版保完成数登证书回调
     */
    public FinishBlockchainBccrDciRegistrationcertResponse finishBlockchainBccrDciRegistrationcertEx(FinishBlockchainBccrDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishBlockchainBccrDciRegistrationcertResponse());
    }
}
