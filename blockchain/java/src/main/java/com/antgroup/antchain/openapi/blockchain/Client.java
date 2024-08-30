// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.blockchain.models.*;

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
                    new TeaPair("sdk_version", "1.28.23"),
                    new TeaPair("_prod_code", "BLOCKCHAIN"),
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
     * Description: 将用户自有账户导入到链上
     * Summary: 自有账户映射到链上
     */
    public StartAccountMappingResponse startAccountMapping(StartAccountMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAccountMappingEx(request, headers, runtime);
    }

    /**
     * Description: 将用户自有账户导入到链上
     * Summary: 自有账户映射到链上
     */
    public StartAccountMappingResponse startAccountMappingEx(StartAccountMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.mapping.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAccountMappingResponse());
    }

    /**
     * Description: 自有账户到链上账户的批量映射接口
     * Summary: 自有账户到链上账户的批量映射
     */
    public BatchcreateAccountMappingResponse batchcreateAccountMapping(BatchcreateAccountMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateAccountMappingEx(request, headers, runtime);
    }

    /**
     * Description: 自有账户到链上账户的批量映射接口
     * Summary: 自有账户到链上账户的批量映射
     */
    public BatchcreateAccountMappingResponse batchcreateAccountMappingEx(BatchcreateAccountMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.mapping.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateAccountMappingResponse());
    }

    /**
     * Description: 为用户生成签名的接口
     * Summary: 为用户生成签名
     */
    public StartAccountSignatureResponse startAccountSignature(StartAccountSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAccountSignatureEx(request, headers, runtime);
    }

    /**
     * Description: 为用户生成签名的接口
     * Summary: 为用户生成签名
     */
    public StartAccountSignatureResponse startAccountSignatureEx(StartAccountSignatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.signature.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAccountSignatureResponse());
    }

    /**
     * Description: 查询批量映射结果的接口
     * Summary: 查询批量映射的结果
     */
    public QueryAccountMappingresultResponse queryAccountMappingresult(QueryAccountMappingresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAccountMappingresultEx(request, headers, runtime);
    }

    /**
     * Description: 查询批量映射结果的接口
     * Summary: 查询批量映射的结果
     */
    public QueryAccountMappingresultResponse queryAccountMappingresultEx(QueryAccountMappingresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.mappingresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAccountMappingresultResponse());
    }

    /**
     * Description: 查询商户下账户在链上账号映射情况
     * Summary: 单个查询用户映射情况信息
     */
    public QueryAccountMappingResponse queryAccountMapping(QueryAccountMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAccountMappingEx(request, headers, runtime);
    }

    /**
     * Description: 查询商户下账户在链上账号映射情况
     * Summary: 单个查询用户映射情况信息
     */
    public QueryAccountMappingResponse queryAccountMappingEx(QueryAccountMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.mapping.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAccountMappingResponse());
    }

    /**
     * Description: 批量查询商户下已映射的账户信息
     * Summary: 批量查询商户下已映射的账户信息
     */
    public BatchqueryAccountMappingResponse batchqueryAccountMapping(BatchqueryAccountMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryAccountMappingEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询商户下已映射的账户信息
     * Summary: 批量查询商户下已映射的账户信息
     */
    public BatchqueryAccountMappingResponse batchqueryAccountMappingEx(BatchqueryAccountMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.mapping.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryAccountMappingResponse());
    }

    /**
     * Description: 用户信息存储
     * Summary: 用户信息存储
     */
    public CreateAccountMappingInfoResponse createAccountMappingInfo(CreateAccountMappingInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAccountMappingInfoEx(request, headers, runtime);
    }

    /**
     * Description: 用户信息存储
     * Summary: 用户信息存储
     */
    public CreateAccountMappingInfoResponse createAccountMappingInfoEx(CreateAccountMappingInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.mapping.info.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAccountMappingInfoResponse());
    }

    /**
     * Description: 批量创建用户信息
     * Summary: 批量创建用户信息
     */
    public BatchcreateAccountMappingInfoResponse batchcreateAccountMappingInfo(BatchcreateAccountMappingInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateAccountMappingInfoEx(request, headers, runtime);
    }

    /**
     * Description: 批量创建用户信息
     * Summary: 批量创建用户信息
     */
    public BatchcreateAccountMappingInfoResponse batchcreateAccountMappingInfoEx(BatchcreateAccountMappingInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.account.mapping.info.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateAccountMappingInfoResponse());
    }

    /**
     * Description: 获取用户的密钥对。
    公钥为明文公钥
    私钥为密文，需要用户在本地再做一次解密才能得到真正的私钥
     * Summary: 获取用户biz key
     */
    public GetAkdfUserbizkeyResponse getAkdfUserbizkey(GetAkdfUserbizkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAkdfUserbizkeyEx(request, headers, runtime);
    }

    /**
     * Description: 获取用户的密钥对。
    公钥为明文公钥
    私钥为密文，需要用户在本地再做一次解密才能得到真正的私钥
     * Summary: 获取用户biz key
     */
    public GetAkdfUserbizkeyResponse getAkdfUserbizkeyEx(GetAkdfUserbizkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.akdf.userbizkey.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAkdfUserbizkeyResponse());
    }

    /**
     * Description: 列出用户在某条链上所有的密钥
     * Summary: 列出密钥
     */
    public ListAkdfUserbizkeyResponse listAkdfUserbizkey(ListAkdfUserbizkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAkdfUserbizkeyEx(request, headers, runtime);
    }

    /**
     * Description: 列出用户在某条链上所有的密钥
     * Summary: 列出密钥
     */
    public ListAkdfUserbizkeyResponse listAkdfUserbizkeyEx(ListAkdfUserbizkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.akdf.userbizkey.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAkdfUserbizkeyResponse());
    }

    /**
     * Description: 根据用户选择的规则和订单类型，生成instanceId给commondriver
     * Summary: 下单
     */
    public CheckBlockchainOrderResponse checkBlockchainOrder(CheckBlockchainOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkBlockchainOrderEx(request, headers, runtime);
    }

    /**
     * Description: 根据用户选择的规则和订单类型，生成instanceId给commondriver
     * Summary: 下单
     */
    public CheckBlockchainOrderResponse checkBlockchainOrderEx(CheckBlockchainOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckBlockchainOrderResponse());
    }

    /**
     * Description: 下单前校验
     * Summary: 下单前校验
     */
    public VerifyBlockchainOrderResponse verifyBlockchainOrder(VerifyBlockchainOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyBlockchainOrderEx(request, headers, runtime);
    }

    /**
     * Description: 下单前校验
     * Summary: 下单前校验
     */
    public VerifyBlockchainOrderResponse verifyBlockchainOrderEx(VerifyBlockchainOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyBlockchainOrderResponse());
    }

    /**
     * Description: 退款
     * Summary: 退款
     */
    public InvalidateBlockchainOrderResponse invalidateBlockchainOrder(InvalidateBlockchainOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invalidateBlockchainOrderEx(request, headers, runtime);
    }

    /**
     * Description: 退款
     * Summary: 退款
     */
    public InvalidateBlockchainOrderResponse invalidateBlockchainOrderEx(InvalidateBlockchainOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.invalidate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InvalidateBlockchainOrderResponse());
    }

    /**
     * Description: 删除物理资源
     * Summary: 删除物理资源
     */
    public ReleaseBlockchainOrderPhysicalResponse releaseBlockchainOrderPhysical(ReleaseBlockchainOrderPhysicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseBlockchainOrderPhysicalEx(request, headers, runtime);
    }

    /**
     * Description: 删除物理资源
     * Summary: 删除物理资源
     */
    public ReleaseBlockchainOrderPhysicalResponse releaseBlockchainOrderPhysicalEx(ReleaseBlockchainOrderPhysicalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.physical.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseBlockchainOrderPhysicalResponse());
    }

    /**
     * Description: 逻辑资源删除
     * Summary: 逻辑资源删除
     */
    public ReleaseBlockchainOrderLogicalResponse releaseBlockchainOrderLogical(ReleaseBlockchainOrderLogicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseBlockchainOrderLogicalEx(request, headers, runtime);
    }

    /**
     * Description: 逻辑资源删除
     * Summary: 逻辑资源删除
     */
    public ReleaseBlockchainOrderLogicalResponse releaseBlockchainOrderLogicalEx(ReleaseBlockchainOrderLogicalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.logical.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseBlockchainOrderLogicalResponse());
    }

    /**
     * Description: 资源检查
     * Summary: 资源检查
     */
    public CheckBlockchainResourceResponse checkBlockchainResource(CheckBlockchainResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkBlockchainResourceEx(request, headers, runtime);
    }

    /**
     * Description: 资源检查
     * Summary: 资源检查
     */
    public CheckBlockchainResourceResponse checkBlockchainResourceEx(CheckBlockchainResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.resource.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckBlockchainResourceResponse());
    }

    /**
     * Description: 补齐商品信息
     * Summary: 补齐商品信息
     */
    public ConfirmBlockchainOrderResponse confirmBlockchainOrder(ConfirmBlockchainOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmBlockchainOrderEx(request, headers, runtime);
    }

    /**
     * Description: 补齐商品信息
     * Summary: 补齐商品信息
     */
    public ConfirmBlockchainOrderResponse confirmBlockchainOrderEx(ConfirmBlockchainOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmBlockchainOrderResponse());
    }

    /**
     * Description: 检查
     * Summary: 检查
     */
    public ConnectBlockchainOrderResponse connectBlockchainOrder(ConnectBlockchainOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.connectBlockchainOrderEx(request, headers, runtime);
    }

    /**
     * Description: 检查
     * Summary: 检查
     */
    public ConnectBlockchainOrderResponse connectBlockchainOrderEx(ConnectBlockchainOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.connect", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConnectBlockchainOrderResponse());
    }

    /**
     * Description: 阿里云区块链订单创建接口
     * Summary: 阿里云区块链订单创建接口
     */
    public ExecBlockchainOrderResponse execBlockchainOrder(ExecBlockchainOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execBlockchainOrderEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链订单创建接口
     * Summary: 阿里云区块链订单创建接口
     */
    public ExecBlockchainOrderResponse execBlockchainOrderEx(ExecBlockchainOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.order.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecBlockchainOrderResponse());
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     */
    public CreateUnionUnionResponse createUnionUnion(CreateUnionUnionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     */
    public CreateUnionUnionResponse createUnionUnionEx(CreateUnionUnionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUnionUnionResponse());
    }

    /**
     * Description: 删除联盟
     * Summary: 删除联盟
     */
    public DeleteUnionUnionResponse deleteUnionUnion(DeleteUnionUnionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 删除联盟
     * Summary: 删除联盟
     */
    public DeleteUnionUnionResponse deleteUnionUnionEx(DeleteUnionUnionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUnionUnionResponse());
    }

    /**
     * Description: 联盟更新
     * Summary: 联盟更新
     */
    public UpdateUnionUnionResponse updateUnionUnion(UpdateUnionUnionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 联盟更新
     * Summary: 联盟更新
     */
    public UpdateUnionUnionResponse updateUnionUnionEx(UpdateUnionUnionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUnionUnionResponse());
    }

    /**
     * Description: 联盟查询
     * Summary: 联盟查询
     */
    public QueryUnionUnionResponse queryUnionUnion(QueryUnionUnionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnionUnionEx(request, headers, runtime);
    }

    /**
     * Description: 联盟查询
     * Summary: 联盟查询
     */
    public QueryUnionUnionResponse queryUnionUnionEx(QueryUnionUnionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.union.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnionUnionResponse());
    }

    /**
     * Description: 联盟邀请用户
     * Summary: 联盟邀请用户
     */
    public ApplyUnionMemberResponse applyUnionMember(ApplyUnionMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUnionMemberEx(request, headers, runtime);
    }

    /**
     * Description: 联盟邀请用户
     * Summary: 联盟邀请用户
     */
    public ApplyUnionMemberResponse applyUnionMemberEx(ApplyUnionMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.member.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUnionMemberResponse());
    }

    /**
     * Description: 阿里云联盟成员加入
     * Summary: 阿里云联盟成员加入
     */
    public ConfirmUnionMemberResponse confirmUnionMember(ConfirmUnionMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmUnionMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云联盟成员加入
     * Summary: 阿里云联盟成员加入
     */
    public ConfirmUnionMemberResponse confirmUnionMemberEx(ConfirmUnionMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.member.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmUnionMemberResponse());
    }

    /**
     * Description: 获取联盟内的蚂蚁区块链列表
     * Summary: 获取联盟内的蚂蚁区块链列表
     */
    public QueryUnionChainResponse queryUnionChain(QueryUnionChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnionChainEx(request, headers, runtime);
    }

    /**
     * Description: 获取联盟内的蚂蚁区块链列表
     * Summary: 获取联盟内的蚂蚁区块链列表
     */
    public QueryUnionChainResponse queryUnionChainEx(QueryUnionChainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.chain.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnionChainResponse());
    }

    /**
     * Description: 获取联盟成员列表
     * Summary: 获取联盟成员列表
     */
    public QueryUnionMemberResponse queryUnionMember(QueryUnionMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnionMemberEx(request, headers, runtime);
    }

    /**
     * Description: 获取联盟成员列表
     * Summary: 获取联盟成员列表
     */
    public QueryUnionMemberResponse queryUnionMemberEx(QueryUnionMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.member.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnionMemberResponse());
    }

    /**
     * Description: 更新联盟成员属性
     * Summary: 更新联盟成员属性
     */
    public UpdateUnionMemberResponse updateUnionMember(UpdateUnionMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUnionMemberEx(request, headers, runtime);
    }

    /**
     * Description: 更新联盟成员属性
     * Summary: 更新联盟成员属性
     */
    public UpdateUnionMemberResponse updateUnionMemberEx(UpdateUnionMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.member.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUnionMemberResponse());
    }

    /**
     * Description: 更新区块链的名称
     * Summary: 更新区块链的名称
     */
    public UpdateChainNameAntResponse updateChainNameAnt(UpdateChainNameAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainNameAntEx(request, headers, runtime);
    }

    /**
     * Description: 更新区块链的名称
     * Summary: 更新区块链的名称
     */
    public UpdateChainNameAntResponse updateChainNameAntEx(UpdateChainNameAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.name.ant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainNameAntResponse());
    }

    /**
     * Description: 手工创建区块链证书
     * Summary: 手工创建区块链证书
     */
    public CreateChainCertAntResponse createChainCertAnt(CreateChainCertAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainCertAntEx(request, headers, runtime);
    }

    /**
     * Description: 手工创建区块链证书
     * Summary: 手工创建区块链证书
     */
    public CreateChainCertAntResponse createChainCertAntEx(CreateChainCertAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.cert.ant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainCertAntResponse());
    }

    /**
     * Description: 自动申请区块链证书
     * Summary: 自动申请区块链证书
     */
    public ApplyChainCertAntResponse applyChainCertAnt(ApplyChainCertAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainCertAntEx(request, headers, runtime);
    }

    /**
     * Description: 自动申请区块链证书
     * Summary: 自动申请区块链证书
     */
    public ApplyChainCertAntResponse applyChainCertAntEx(ApplyChainCertAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.cert.ant.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainCertAntResponse());
    }

    /**
     * Description: 人工申请区块链证书
     * Summary: 人工申请区块链证书
     */
    public CreateChainPublicCertResponse createChainPublicCert(CreateChainPublicCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainPublicCertEx(request, headers, runtime);
    }

    /**
     * Description: 人工申请区块链证书
     * Summary: 人工申请区块链证书
     */
    public CreateChainPublicCertResponse createChainPublicCertEx(CreateChainPublicCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.cert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainPublicCertResponse());
    }

    /**
     * Description: 自动创建区块链证书
     * Summary: 自动创建区块链证书
     */
    public ApplyChainPublicCertResponse applyChainPublicCert(ApplyChainPublicCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainPublicCertEx(request, headers, runtime);
    }

    /**
     * Description: 自动创建区块链证书
     * Summary: 自动创建区块链证书
     */
    public ApplyChainPublicCertResponse applyChainPublicCertEx(ApplyChainPublicCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.cert.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainPublicCertResponse());
    }

    /**
     * Description: 免费体验链重置证书
     * Summary: 免费体验链重置证书
     */
    public ReinitChainPublicCertResponse reinitChainPublicCert(ReinitChainPublicCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitChainPublicCertEx(request, headers, runtime);
    }

    /**
     * Description: 免费体验链重置证书
     * Summary: 免费体验链重置证书
     */
    public ReinitChainPublicCertResponse reinitChainPublicCertEx(ReinitChainPublicCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.cert.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitChainPublicCertResponse());
    }

    /**
     * Description: 免费体验链创建账户
     * Summary: 免费体验链创建账户
     */
    public CreateChainPublicAccountResponse createChainPublicAccount(CreateChainPublicAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainPublicAccountEx(request, headers, runtime);
    }

    /**
     * Description: 免费体验链创建账户
     * Summary: 免费体验链创建账户
     */
    public CreateChainPublicAccountResponse createChainPublicAccountEx(CreateChainPublicAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainPublicAccountResponse());
    }

    /**
     * Description: 自动创建链上账户
     * Summary: 自动创建链上账户
     */
    public ApplyChainPublicAccountResponse applyChainPublicAccount(ApplyChainPublicAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainPublicAccountEx(request, headers, runtime);
    }

    /**
     * Description: 自动创建链上账户
     * Summary: 自动创建链上账户
     */
    public ApplyChainPublicAccountResponse applyChainPublicAccountEx(ApplyChainPublicAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.account.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainPublicAccountResponse());
    }

    /**
     * Description: 免费体验链查询
     * Summary: 免费体验链查询
     */
    public QueryChainPublicResponse queryChainPublic(QueryChainPublicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainPublicEx(request, headers, runtime);
    }

    /**
     * Description: 免费体验链查询
     * Summary: 免费体验链查询
     */
    public QueryChainPublicResponse queryChainPublicEx(QueryChainPublicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainPublicResponse());
    }

    /**
     * Description: 免费体验链证书下载
     * Summary: 免费体验链证书下载
     */
    public DownloadChainPublicCertResponse downloadChainPublicCert(DownloadChainPublicCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadChainPublicCertEx(request, headers, runtime);
    }

    /**
     * Description: 免费体验链证书下载
     * Summary: 免费体验链证书下载
     */
    public DownloadChainPublicCertResponse downloadChainPublicCertEx(DownloadChainPublicCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.cert.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadChainPublicCertResponse());
    }

    /**
     * Description: 手工创建账户
     * Summary: 手工创建账户
     */
    public CreateChainAccountAntResponse createChainAccountAnt(CreateChainAccountAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 手工创建账户
     * Summary: 手工创建账户
     */
    public CreateChainAccountAntResponse createChainAccountAntEx(CreateChainAccountAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainAccountAntResponse());
    }

    /**
     * Description: 自动创建账户
     * Summary: 自动创建账户
     */
    public ApplyChainAccountAntResponse applyChainAccountAnt(ApplyChainAccountAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 自动创建账户
     * Summary: 自动创建账户
     */
    public ApplyChainAccountAntResponse applyChainAccountAntEx(ApplyChainAccountAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainAccountAntResponse());
    }

    /**
     * Description: 查询链上账户列表
     * Summary: 查询链上账户列表
     */
    public QueryChainAccountAntResponse queryChainAccountAnt(QueryChainAccountAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上账户列表
     * Summary: 查询链上账户列表
     */
    public QueryChainAccountAntResponse queryChainAccountAntEx(QueryChainAccountAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainAccountAntResponse());
    }

    /**
     * Description: 区块链证书下载
     * Summary: 区块链证书下载
     */
    public DownloadChainCertAntResponse downloadChainCertAnt(DownloadChainCertAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadChainCertAntEx(request, headers, runtime);
    }

    /**
     * Description: 区块链证书下载
     * Summary: 区块链证书下载
     */
    public DownloadChainCertAntResponse downloadChainCertAntEx(DownloadChainCertAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.cert.ant.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadChainCertAntResponse());
    }

    /**
     * Description: 阿里云链节点查询
     * Summary: 阿里云链节点查询
     */
    public QueryChainNodeAntResponse queryChainNodeAnt(QueryChainNodeAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainNodeAntEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云链节点查询
     * Summary: 阿里云链节点查询
     */
    public QueryChainNodeAntResponse queryChainNodeAntEx(QueryChainNodeAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.node.ant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainNodeAntResponse());
    }

    /**
     * Description: 区块链链上账户冻结
     * Summary: 区块链链上账户冻结
     */
    public FreezeChainAccountAntResponse freezeChainAccountAnt(FreezeChainAccountAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 区块链链上账户冻结
     * Summary: 区块链链上账户冻结
     */
    public FreezeChainAccountAntResponse freezeChainAccountAntEx(FreezeChainAccountAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeChainAccountAntResponse());
    }

    /**
     * Description: 蚂蚁区块链账户解冻
     * Summary: 蚂蚁区块链账户解冻
     */
    public UnfreezeChainAccountAntResponse unfreezeChainAccountAnt(UnfreezeChainAccountAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeChainAccountAntEx(request, headers, runtime);
    }

    /**
     * Description: 蚂蚁区块链账户解冻
     * Summary: 蚂蚁区块链账户解冻
     */
    public UnfreezeChainAccountAntResponse unfreezeChainAccountAntEx(UnfreezeChainAccountAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.ant.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeChainAccountAntResponse());
    }

    /**
     * Description: 区块链证书重置
     * Summary: 区块链证书重置
     */
    public ReinitChainCertAntResponse reinitChainCertAnt(ReinitChainCertAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitChainCertAntEx(request, headers, runtime);
    }

    /**
     * Description: 区块链证书重置
     * Summary: 区块链证书重置
     */
    public ReinitChainCertAntResponse reinitChainCertAntEx(ReinitChainCertAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.cert.ant.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitChainCertAntResponse());
    }

    /**
     * Description: 区块链证书查询
     * Summary: 区块链证书查询
     */
    public QueryChainCertAntResponse queryChainCertAnt(QueryChainCertAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainCertAntEx(request, headers, runtime);
    }

    /**
     * Description: 区块链证书查询
     * Summary: 区块链证书查询
     */
    public QueryChainCertAntResponse queryChainCertAntEx(QueryChainCertAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.cert.ant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainCertAntResponse());
    }

    /**
     * Description: 阿里云浏览器信息查询
     * Summary: 阿里云浏览器信息查询
     */
    public QueryChainBrowserInfoResponse queryChainBrowserInfo(QueryChainBrowserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainBrowserInfoEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云浏览器信息查询
     * Summary: 阿里云浏览器信息查询
     */
    public QueryChainBrowserInfoResponse queryChainBrowserInfoEx(QueryChainBrowserInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainBrowserInfoResponse());
    }

    /**
     * Description: 阿里云最新区块链信息查询
     * Summary: 阿里云最新区块链信息查询
     */
    public QueryChainBrowserBlocksResponse queryChainBrowserBlocks(QueryChainBrowserBlocksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainBrowserBlocksEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云最新区块链信息查询
     * Summary: 阿里云最新区块链信息查询
     */
    public QueryChainBrowserBlocksResponse queryChainBrowserBlocksEx(QueryChainBrowserBlocksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.blocks.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainBrowserBlocksResponse());
    }

    /**
     * Description: 阿里云最新交易查询
     * Summary: 阿里云最新交易查询
     */
    public QueryChainBrowserTransactionsResponse queryChainBrowserTransactions(QueryChainBrowserTransactionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainBrowserTransactionsEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云最新交易查询
     * Summary: 阿里云最新交易查询
     */
    public QueryChainBrowserTransactionsResponse queryChainBrowserTransactionsEx(QueryChainBrowserTransactionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.transactions.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainBrowserTransactionsResponse());
    }

    /**
     * Description: 阿里云最新区块交易信息查询
     * Summary: 阿里云最新区块交易信息查询
     */
    public BatchqueryChainBrowserTransactionResponse batchqueryChainBrowserTransaction(BatchqueryChainBrowserTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryChainBrowserTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云最新区块交易信息查询
     * Summary: 阿里云最新区块交易信息查询
     */
    public BatchqueryChainBrowserTransactionResponse batchqueryChainBrowserTransactionEx(BatchqueryChainBrowserTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.transaction.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryChainBrowserTransactionResponse());
    }

    /**
     * Description: 阿里云区块链交易收据查询
     * Summary: 阿里云区块链交易收据查询
     */
    public QueryChainBrowserReceiptResponse queryChainBrowserReceipt(QueryChainBrowserReceiptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainBrowserReceiptEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链交易收据查询
     * Summary: 阿里云区块链交易收据查询
     */
    public QueryChainBrowserReceiptResponse queryChainBrowserReceiptEx(QueryChainBrowserReceiptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.receipt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainBrowserReceiptResponse());
    }

    /**
     * Description: 阿里云区块链交易查询
     * Summary: 阿里云区块链交易查询
     */
    public QueryChainBrowserTransactionResponse queryChainBrowserTransaction(QueryChainBrowserTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainBrowserTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链交易查询
     * Summary: 阿里云区块链交易查询
     */
    public QueryChainBrowserTransactionResponse queryChainBrowserTransactionEx(QueryChainBrowserTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainBrowserTransactionResponse());
    }

    /**
     * Description: 阿里云区块链的区块信息
     * Summary: 阿里云区块链的区块信息
     */
    public QueryChainBrowserBlockResponse queryChainBrowserBlock(QueryChainBrowserBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainBrowserBlockEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链的区块信息
     * Summary: 阿里云区块链的区块信息
     */
    public QueryChainBrowserBlockResponse queryChainBrowserBlockEx(QueryChainBrowserBlockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.block.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainBrowserBlockResponse());
    }

    /**
     * Description: 阿里云售卖区信息查询
     * Summary: 阿里云售卖区信息查询
     */
    public QueryChainResouceRegionResponse queryChainResouceRegion(QueryChainResouceRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainResouceRegionEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云售卖区信息查询
     * Summary: 阿里云售卖区信息查询
     */
    public QueryChainResouceRegionResponse queryChainResouceRegionEx(QueryChainResouceRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.resouce.region.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainResouceRegionResponse());
    }

    /**
     * Description: 阿里云资源类型查询
     * Summary: 阿里云资源类型查询
     */
    public QueryChainResourceTypeResponse queryChainResourceType(QueryChainResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainResourceTypeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云资源类型查询
     * Summary: 阿里云资源类型查询
     */
    public QueryChainResourceTypeResponse queryChainResourceTypeEx(QueryChainResourceTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.resource.type.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainResourceTypeResponse());
    }

    /**
     * Description: 阿里云区块链售卖资源查询
     * Summary: 阿里云区块链售卖资源查询
     */
    public QueryChainResouceSaleResponse queryChainResouceSale(QueryChainResouceSaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainResouceSaleEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链售卖资源查询
     * Summary: 阿里云区块链售卖资源查询
     */
    public QueryChainResouceSaleResponse queryChainResouceSaleEx(QueryChainResouceSaleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.resouce.sale.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainResouceSaleResponse());
    }

    /**
     * Description: 阿里云区块链配置信息查询
     * Summary: 阿里云区块链配置信息查询
     */
    public QueryChainResourceConfigResponse queryChainResourceConfig(QueryChainResourceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainResourceConfigEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链配置信息查询
     * Summary: 阿里云区块链配置信息查询
     */
    public QueryChainResourceConfigResponse queryChainResourceConfigEx(QueryChainResourceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.resource.config.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainResourceConfigResponse());
    }

    /**
     * Description: 阿里云区块链交易统计信息
     * Summary: 阿里云区块链交易统计信息
     */
    public QueryChainBrowserStatisticsResponse queryChainBrowserStatistics(QueryChainBrowserStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainBrowserStatisticsEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链交易统计信息
     * Summary: 阿里云区块链交易统计信息
     */
    public QueryChainBrowserStatisticsResponse queryChainBrowserStatisticsEx(QueryChainBrowserStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.browser.statistics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainBrowserStatisticsResponse());
    }

    /**
     * Description: 阿里云区块链交易执行交易
     * Summary: 阿里云区块链交易执行交易
     */
    public ExecChainPublicContractResponse execChainPublicContract(ExecChainPublicContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execChainPublicContractEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链交易执行交易
     * Summary: 阿里云区块链交易执行交易
     */
    public ExecChainPublicContractResponse execChainPublicContractEx(ExecChainPublicContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.contract.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecChainPublicContractResponse());
    }

    /**
     * Description: 阿里云免费体验链的cloudIde查询
     * Summary: 阿里云免费体验链的cloudIde查询
     */
    public QueryChainPublicIdeResponse queryChainPublicIde(QueryChainPublicIdeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainPublicIdeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云免费体验链的cloudIde查询
     * Summary: 阿里云免费体验链的cloudIde查询
     */
    public QueryChainPublicIdeResponse queryChainPublicIdeEx(QueryChainPublicIdeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.ide.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainPublicIdeResponse());
    }

    /**
     * Description: 阿里云免费体验链合约文件和内容查询
     * Summary: 阿里云免费体验链合约文件和内容查询
     */
    public QueryChainPublicContentResponse queryChainPublicContent(QueryChainPublicContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainPublicContentEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云免费体验链合约文件和内容查询
     * Summary: 阿里云免费体验链合约文件和内容查询
     */
    public QueryChainPublicContentResponse queryChainPublicContentEx(QueryChainPublicContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.content.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainPublicContentResponse());
    }

    /**
     * Description: 阿里云合约工程创建
     * Summary: 阿里云合约工程创建
     */
    public CreateChainContractProjectResponse createChainContractProject(CreateChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainContractProjectEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云合约工程创建
     * Summary: 阿里云合约工程创建
     */
    public CreateChainContractProjectResponse createChainContractProjectEx(CreateChainContractProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainContractProjectResponse());
    }

    /**
     * Description: 阿里云合约工程删除
     * Summary: 阿里云合约工程删除
     */
    public DeleteChainContractProjectResponse deleteChainContractProject(DeleteChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChainContractProjectEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云合约工程删除
     * Summary: 阿里云合约工程删除
     */
    public DeleteChainContractProjectResponse deleteChainContractProjectEx(DeleteChainContractProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.project.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteChainContractProjectResponse());
    }

    /**
     * Description: 复制阿里云合约工程
     * Summary: 复制阿里云合约工程
     */
    public CloneChainContractProjectResponse cloneChainContractProject(CloneChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneChainContractProjectEx(request, headers, runtime);
    }

    /**
     * Description: 复制阿里云合约工程
     * Summary: 复制阿里云合约工程
     */
    public CloneChainContractProjectResponse cloneChainContractProjectEx(CloneChainContractProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.project.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneChainContractProjectResponse());
    }

    /**
     * Description: 阿里云合约工程信息查询
     * Summary: 阿里云合约工程信息查询
     */
    public QueryChainContractProjectResponse queryChainContractProject(QueryChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainContractProjectEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云合约工程信息查询
     * Summary: 阿里云合约工程信息查询
     */
    public QueryChainContractProjectResponse queryChainContractProjectEx(QueryChainContractProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainContractProjectResponse());
    }

    /**
     * Description: 复制阿里云合约工程
     * Summary: 复制阿里云合约工程
     */
    public RetryChainContractProjectResponse retryChainContractProject(RetryChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryChainContractProjectEx(request, headers, runtime);
    }

    /**
     * Description: 复制阿里云合约工程
     * Summary: 复制阿里云合约工程
     */
    public RetryChainContractProjectResponse retryChainContractProjectEx(RetryChainContractProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.project.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryChainContractProjectResponse());
    }

    /**
     * Description: 更新阿里云区块链的合约工程
     * Summary: 更新阿里云区块链的合约工程
     */
    public UpdateChainContractProjectResponse updateChainContractProject(UpdateChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainContractProjectEx(request, headers, runtime);
    }

    /**
     * Description: 更新阿里云区块链的合约工程
     * Summary: 更新阿里云区块链的合约工程
     */
    public UpdateChainContractProjectResponse updateChainContractProjectEx(UpdateChainContractProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.project.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainContractProjectResponse());
    }

    /**
     * Description: 创建合约文件内容
     * Summary: 创建合约文件内容
     */
    public CreateChainContractContentResponse createChainContractContent(CreateChainContractContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainContractContentEx(request, headers, runtime);
    }

    /**
     * Description: 创建合约文件内容
     * Summary: 创建合约文件内容
     */
    public CreateChainContractContentResponse createChainContractContentEx(CreateChainContractContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.content.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainContractContentResponse());
    }

    /**
     * Description: 更新阿里云合约文件内容
     * Summary: 更新阿里云合约文件内容
     */
    public UpdateChainContractContentResponse updateChainContractContent(UpdateChainContractContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainContractContentEx(request, headers, runtime);
    }

    /**
     * Description: 更新阿里云合约文件内容
     * Summary: 更新阿里云合约文件内容
     */
    public UpdateChainContractContentResponse updateChainContractContentEx(UpdateChainContractContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.content.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainContractContentResponse());
    }

    /**
     * Description: 阿里云合约文件信息查询
     * Summary: 阿里云合约文件信息查询
     */
    public QueryChainContractContentResponse queryChainContractContent(QueryChainContractContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainContractContentEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云合约文件信息查询
     * Summary: 阿里云合约文件信息查询
     */
    public QueryChainContractContentResponse queryChainContractContentEx(QueryChainContractContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.content.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainContractContentResponse());
    }

    /**
     * Description: 阿里云区块链合约执行接口
     * Summary: 阿里云区块链合约执行
     */
    public ExecChainContractResponse execChainContract(ExecChainContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execChainContractEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链合约执行接口
     * Summary: 阿里云区块链合约执行
     */
    public ExecChainContractResponse execChainContractEx(ExecChainContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecChainContractResponse());
    }

    /**
     * Description: 阿里云区块链CloudIde配置查询
     * Summary: 阿里云区块链CloudIde配置查询
     */
    public QueryChainIdeResponse queryChainIde(QueryChainIdeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainIdeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链CloudIde配置查询
     * Summary: 阿里云区块链CloudIde配置查询
     */
    public QueryChainIdeResponse queryChainIdeEx(QueryChainIdeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.ide.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainIdeResponse());
    }

    /**
     * Description: 阿里云区块链合约文件删除
     * Summary: 阿里云区块链合约文件删除
     */
    public DeleteChainContractContentResponse deleteChainContractContent(DeleteChainContractContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChainContractContentEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链合约文件删除
     * Summary: 阿里云区块链合约文件删除
     */
    public DeleteChainContractContentResponse deleteChainContractContentEx(DeleteChainContractContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.contract.content.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteChainContractContentResponse());
    }

    /**
     * Description: 阿里云区块链小程序用户权限添加
     * Summary: 阿里云区块链小程序用户权限添加
     */
    public BatchcreateChainMiniappUserResponse batchcreateChainMiniappUser(BatchcreateChainMiniappUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateChainMiniappUserEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链小程序用户权限添加
     * Summary: 阿里云区块链小程序用户权限添加
     */
    public BatchcreateChainMiniappUserResponse batchcreateChainMiniappUserEx(BatchcreateChainMiniappUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.user.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateChainMiniappUserResponse());
    }

    /**
     * Description: 阿里云区块链小程序用户权限删除
     * Summary: 阿里云区块链小程序用户权限删除
     */
    public DeleteChainMiniappUserResponse deleteChainMiniappUser(DeleteChainMiniappUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChainMiniappUserEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链小程序用户权限删除
     * Summary: 阿里云区块链小程序用户权限删除
     */
    public DeleteChainMiniappUserResponse deleteChainMiniappUserEx(DeleteChainMiniappUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.user.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteChainMiniappUserResponse());
    }

    /**
     * Description: 阿里云区块链所有用户权限查询
     * Summary: 阿里云区块链所有用户权限查询
     */
    public BatchqueryChainMiniappUserResponse batchqueryChainMiniappUser(BatchqueryChainMiniappUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryChainMiniappUserEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链所有用户权限查询
     * Summary: 阿里云区块链所有用户权限查询
     */
    public BatchqueryChainMiniappUserResponse batchqueryChainMiniappUserEx(BatchqueryChainMiniappUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.user.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryChainMiniappUserResponse());
    }

    /**
     * Description: 阿里云区块链小程序权限控制查询
     * Summary: 阿里云区块链小程序权限控制查询
     */
    public QueryChainMiniappAuthorizationResponse queryChainMiniappAuthorization(QueryChainMiniappAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainMiniappAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链小程序权限控制查询
     * Summary: 阿里云区块链小程序权限控制查询
     */
    public QueryChainMiniappAuthorizationResponse queryChainMiniappAuthorizationEx(QueryChainMiniappAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.authorization.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainMiniappAuthorizationResponse());
    }

    /**
     * Description: 阿里云区块链小程序权限控制变更
     * Summary: 阿里云区块链小程序权限控制变更
     */
    public UpdateChainMiniappAuthorizationResponse updateChainMiniappAuthorization(UpdateChainMiniappAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainMiniappAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链小程序权限控制变更
     * Summary: 阿里云区块链小程序权限控制变更
     */
    public UpdateChainMiniappAuthorizationResponse updateChainMiniappAuthorizationEx(UpdateChainMiniappAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.authorization.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainMiniappAuthorizationResponse());
    }

    /**
     * Description: 阿里云区块链小程序交易查询
     * Summary: 阿里云区块链小程序交易查询
     */
    public QueryChainMiniappTransactionResponse queryChainMiniappTransaction(QueryChainMiniappTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainMiniappTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链小程序交易查询
     * Summary: 阿里云区块链小程序交易查询
     */
    public QueryChainMiniappTransactionResponse queryChainMiniappTransactionEx(QueryChainMiniappTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainMiniappTransactionResponse());
    }

    /**
     * Description: 阿里云区块链小程序交易查询的记录
     * Summary: 阿里云区块链小程序交易查询的记录
     */
    public QueryChainMiniappLogResponse queryChainMiniappLog(QueryChainMiniappLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainMiniappLogEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云区块链小程序交易查询的记录
     * Summary: 阿里云区块链小程序交易查询的记录
     */
    public QueryChainMiniappLogResponse queryChainMiniappLogEx(QueryChainMiniappLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.log.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainMiniappLogResponse());
    }

    /**
     * Description: 阿里云生成小程序二维码
     * Summary: 阿里云生成小程序二维码
     */
    public CreateChainMiniappCodeResponse createChainMiniappCode(CreateChainMiniappCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainMiniappCodeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云生成小程序二维码
     * Summary: 阿里云生成小程序二维码
     */
    public CreateChainMiniappCodeResponse createChainMiniappCodeEx(CreateChainMiniappCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.miniapp.code.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainMiniappCodeResponse());
    }

    /**
     * Description: 阿里云售卖页联盟信息查询
     * Summary: 阿里云售卖页联盟信息查询
     */
    public QueryUnionBuyResponse queryUnionBuy(QueryUnionBuyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnionBuyEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云售卖页联盟信息查询
     * Summary: 阿里云售卖页联盟信息查询
     */
    public QueryUnionBuyResponse queryUnionBuyEx(QueryUnionBuyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.union.buy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnionBuyResponse());
    }

    /**
     * Description: 阿里云国内站免费体验链Rest查询
     * Summary: 阿里云国内站免费体验链Rest查询
     */
    public QueryChainPublicRestResponse queryChainPublicRest(QueryChainPublicRestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainPublicRestEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站免费体验链Rest查询
     * Summary: 阿里云国内站免费体验链Rest查询
     */
    public QueryChainPublicRestResponse queryChainPublicRestEx(QueryChainPublicRestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.rest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainPublicRestResponse());
    }

    /**
     * Description: 阿里云国内站免费体验链申请Rest
     * Summary: 阿里云国内站免费体验链申请Rest
     */
    public ApplyChainPublicRestResponse applyChainPublicRest(ApplyChainPublicRestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainPublicRestEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站免费体验链申请Rest
     * Summary: 阿里云国内站免费体验链申请Rest
     */
    public ApplyChainPublicRestResponse applyChainPublicRestEx(ApplyChainPublicRestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.rest.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainPublicRestResponse());
    }

    /**
     * Description: 阿里云国内站重置Rest
     * Summary: 阿里云国内站重置Rest
     */
    public ReinitChainPublicRestResponse reinitChainPublicRest(ReinitChainPublicRestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitChainPublicRestEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站重置Rest
     * Summary: 阿里云国内站重置Rest
     */
    public ReinitChainPublicRestResponse reinitChainPublicRestEx(ReinitChainPublicRestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.rest.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitChainPublicRestResponse());
    }

    /**
     * Description: 阿里云国内站区块链rest查询
     * Summary: 阿里云国内站区块链rest查询
     */
    public QueryChainRestAntResponse queryChainRestAnt(QueryChainRestAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainRestAntEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站区块链rest查询
     * Summary: 阿里云国内站区块链rest查询
     */
    public QueryChainRestAntResponse queryChainRestAntEx(QueryChainRestAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.rest.ant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainRestAntResponse());
    }

    /**
     * Description: 阿里云国内站区块链rest申请
     * Summary: 阿里云国内站区块链rest申请
     */
    public ApplyChainRestAntResponse applyChainRestAnt(ApplyChainRestAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainRestAntEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站区块链rest申请
     * Summary: 阿里云国内站区块链rest申请
     */
    public ApplyChainRestAntResponse applyChainRestAntEx(ApplyChainRestAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.rest.ant.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainRestAntResponse());
    }

    /**
     * Description: 阿里云国内站区块链重置Rest
     * Summary: 阿里云国内站区块链重置Rest
     */
    public ReinitChainRestAntResponse reinitChainRestAnt(ReinitChainRestAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitChainRestAntEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站区块链重置Rest
     * Summary: 阿里云国内站区块链重置Rest
     */
    public ReinitChainRestAntResponse reinitChainRestAntEx(ReinitChainRestAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.rest.ant.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitChainRestAntResponse());
    }

    /**
     * Description: 阿里云国内站公共链重置rest发送验证码
     * Summary: 阿里云国内站公共链重置rest发送验证码
     */
    public SendChainPublicRestResponse sendChainPublicRest(SendChainPublicRestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendChainPublicRestEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站公共链重置rest发送验证码
     * Summary: 阿里云国内站公共链重置rest发送验证码
     */
    public SendChainPublicRestResponse sendChainPublicRestEx(SendChainPublicRestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.public.rest.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendChainPublicRestResponse());
    }

    /**
     * Description: 阿里云国内站区块链重置rest发送验证码
     * Summary: 阿里云国内站区块链重置rest发送验证码
     */
    public SendChainRestAntResponse sendChainRestAnt(SendChainRestAntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendChainRestAntEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云国内站区块链重置rest发送验证码
     * Summary: 阿里云国内站区块链重置rest发送验证码
     */
    public SendChainRestAntResponse sendChainRestAntEx(SendChainRestAntRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.rest.ant.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendChainRestAntResponse());
    }

    /**
     * Description: 阿里云子链列表查询
     * Summary: 阿里云子链列表查询
     */
    public QueryChainSubnetResponse queryChainSubnet(QueryChainSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainSubnetEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链列表查询
     * Summary: 阿里云子链列表查询
     */
    public QueryChainSubnetResponse queryChainSubnetEx(QueryChainSubnetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainSubnetResponse());
    }

    /**
     * Description: 阿里云子链创建的前置检查
     * Summary: 阿里云子链创建的前置检查
     */
    public CheckChainSubnetCreateResponse checkChainSubnetCreate(CheckChainSubnetCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkChainSubnetCreateEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链创建的前置检查
     * Summary: 阿里云子链创建的前置检查
     */
    public CheckChainSubnetCreateResponse checkChainSubnetCreateEx(CheckChainSubnetCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.create.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckChainSubnetCreateResponse());
    }

    /**
     * Description: 阿里云子链创建
     * Summary: 阿里云子链创建
     */
    public CreateChainSubnetResponse createChainSubnet(CreateChainSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainSubnetEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链创建
     * Summary: 阿里云子链创建
     */
    public CreateChainSubnetResponse createChainSubnetEx(CreateChainSubnetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainSubnetResponse());
    }

    /**
     * Description: 阿里云子链的启动
     * Summary: 阿里云子链的启动
     */
    public ExecChainSubnetResponse execChainSubnet(ExecChainSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execChainSubnetEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链的启动
     * Summary: 阿里云子链的启动
     */
    public ExecChainSubnetResponse execChainSubnetEx(ExecChainSubnetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecChainSubnetResponse());
    }

    /**
     * Description: 阿里云子链名称修改
     * Summary: 阿里云子链名称修改
     */
    public UpdateChainSubnetNameResponse updateChainSubnetName(UpdateChainSubnetNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainSubnetNameEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链名称修改
     * Summary: 阿里云子链名称修改
     */
    public UpdateChainSubnetNameResponse updateChainSubnetNameEx(UpdateChainSubnetNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.name.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainSubnetNameResponse());
    }

    /**
     * Description: 阿里云子链节点信息查询
     * Summary: 阿里云子链节点信息查询
     */
    public QueryChainSubnetNodeResponse queryChainSubnetNode(QueryChainSubnetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainSubnetNodeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链节点信息查询
     * Summary: 阿里云子链节点信息查询
     */
    public QueryChainSubnetNodeResponse queryChainSubnetNodeEx(QueryChainSubnetNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.node.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainSubnetNodeResponse());
    }

    /**
     * Description: 阿里云子链的节点删除
     * Summary: 阿里云子链的节点删除
     */
    public DeleteChainSubnetNodeResponse deleteChainSubnetNode(DeleteChainSubnetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChainSubnetNodeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链的节点删除
     * Summary: 阿里云子链的节点删除
     */
    public DeleteChainSubnetNodeResponse deleteChainSubnetNodeEx(DeleteChainSubnetNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.node.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteChainSubnetNodeResponse());
    }

    /**
     * Description: 阿里云子链节点添加的前置检查
     * Summary: 阿里云子链节点添加的前置检查
     */
    public CheckChainSubnetNodeResponse checkChainSubnetNode(CheckChainSubnetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkChainSubnetNodeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链节点添加的前置检查
     * Summary: 阿里云子链节点添加的前置检查
     */
    public CheckChainSubnetNodeResponse checkChainSubnetNodeEx(CheckChainSubnetNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.node.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckChainSubnetNodeResponse());
    }

    /**
     * Description: 阿里云子链节点添加
     * Summary: 阿里云子链节点添加
     */
    public AddChainSubnetNodeResponse addChainSubnetNode(AddChainSubnetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addChainSubnetNodeEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链节点添加
     * Summary: 阿里云子链节点添加
     */
    public AddChainSubnetNodeResponse addChainSubnetNodeEx(AddChainSubnetNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.node.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddChainSubnetNodeResponse());
    }

    /**
     * Description: 阿里云子链机构列表查询
     * Summary: 阿里云子链机构列表查询
     */
    public QueryChainSubnetMemberResponse queryChainSubnetMember(QueryChainSubnetMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链机构列表查询
     * Summary: 阿里云子链机构列表查询
     */
    public QueryChainSubnetMemberResponse queryChainSubnetMemberEx(QueryChainSubnetMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链成员删除
     * Summary: 阿里云子链成员删除
     */
    public DeleteChainSubnetMemberResponse deleteChainSubnetMember(DeleteChainSubnetMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链成员删除
     * Summary: 阿里云子链成员删除
     */
    public DeleteChainSubnetMemberResponse deleteChainSubnetMemberEx(DeleteChainSubnetMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链成员添加前校验
     * Summary: 阿里云子链成员添加前校验
     */
    public CheckChainSubnetMemberResponse checkChainSubnetMember(CheckChainSubnetMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链成员添加前校验
     * Summary: 阿里云子链成员添加前校验
     */
    public CheckChainSubnetMemberResponse checkChainSubnetMemberEx(CheckChainSubnetMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链成员添加
     * Summary: 阿里云子链成员添加
     */
    public AddChainSubnetMemberResponse addChainSubnetMember(AddChainSubnetMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addChainSubnetMemberEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链成员添加
     * Summary: 阿里云子链成员添加
     */
    public AddChainSubnetMemberResponse addChainSubnetMemberEx(AddChainSubnetMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.member.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddChainSubnetMemberResponse());
    }

    /**
     * Description: 阿里云子链REST开通
     * Summary: 阿里云子链REST开通
     */
    public ApplyChainSubnetRestResponse applyChainSubnetRest(ApplyChainSubnetRestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainSubnetRestEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云子链REST开通
     * Summary: 阿里云子链REST开通
     */
    public ApplyChainSubnetRestResponse applyChainSubnetRestEx(ApplyChainSubnetRestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.subnet.rest.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainSubnetRestResponse());
    }

    /**
     * Description: 阿里云数据导出任务查询
     * Summary: 阿里云数据导出任务查询
     */
    public QueryChainDataexportTaskResponse queryChainDataexportTask(QueryChainDataexportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainDataexportTaskEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云数据导出任务查询
     * Summary: 阿里云数据导出任务查询
     */
    public QueryChainDataexportTaskResponse queryChainDataexportTaskEx(QueryChainDataexportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.dataexport.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainDataexportTaskResponse());
    }

    /**
     * Description: 阿里云数据导出服务，列出所有导出任务功能接口
     * Summary: 列出所有导出任务接口
     */
    public QueryChainDataExportResponse queryChainDataExport(QueryChainDataExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainDataExportEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云数据导出服务，列出所有导出任务功能接口
     * Summary: 列出所有导出任务接口
     */
    public QueryChainDataExportResponse queryChainDataExportEx(QueryChainDataExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.data.export.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainDataExportResponse());
    }

    /**
     * Description: 阿里云数据导出需求创建数据导出任务
     * Summary: 创建数据导出任务
     */
    public CreateChainDataexportTaskResponse createChainDataexportTask(CreateChainDataexportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainDataexportTaskEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云数据导出需求创建数据导出任务
     * Summary: 创建数据导出任务
     */
    public CreateChainDataexportTaskResponse createChainDataexportTaskEx(CreateChainDataexportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.dataexport.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainDataexportTaskResponse());
    }

    /**
     * Description: 获取预览数据（第一步：生成任务ID）
     * Summary: 获取预览数据（第一步：生成任务ID）
     */
    public CreateChainTaskIdResponse createChainTaskId(CreateChainTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainTaskIdEx(request, headers, runtime);
    }

    /**
     * Description: 获取预览数据（第一步：生成任务ID）
     * Summary: 获取预览数据（第一步：生成任务ID）
     */
    public CreateChainTaskIdResponse createChainTaskIdEx(CreateChainTaskIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.task.id.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainTaskIdResponse());
    }

    /**
     * Description: 获取预览数据（第二步：根据任务ID获取预览数据结果）
     * Summary: 根据任务ID获取预览数据结果
     */
    public QueryChainDataPreviewResponse queryChainDataPreview(QueryChainDataPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainDataPreviewEx(request, headers, runtime);
    }

    /**
     * Description: 获取预览数据（第二步：根据任务ID获取预览数据结果）
     * Summary: 根据任务ID获取预览数据结果
     */
    public QueryChainDataPreviewResponse queryChainDataPreviewEx(QueryChainDataPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.data.preview.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainDataPreviewResponse());
    }

    /**
     * Description: 根据预览数据获取默认映射关系
     * Summary: 根据预览数据获取默认映射关系
     */
    public QueryChainMappingRelationshipResponse queryChainMappingRelationship(QueryChainMappingRelationshipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainMappingRelationshipEx(request, headers, runtime);
    }

    /**
     * Description: 根据预览数据获取默认映射关系
     * Summary: 根据预览数据获取默认映射关系
     */
    public QueryChainMappingRelationshipResponse queryChainMappingRelationshipEx(QueryChainMappingRelationshipRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.mapping.relationship.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainMappingRelationshipResponse());
    }

    /**
     * Description: 创建导出MySQL任务失败，获取 Create Table 语句
     * Summary: 获取 Create Table 语句
     */
    public CreateChainTableSqlResponse createChainTableSql(CreateChainTableSqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainTableSqlEx(request, headers, runtime);
    }

    /**
     * Description: 创建导出MySQL任务失败，获取 Create Table 语句
     * Summary: 获取 Create Table 语句
     */
    public CreateChainTableSqlResponse createChainTableSqlEx(CreateChainTableSqlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.table.sql.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainTableSqlResponse());
    }

    /**
     * Description: 修改导出任务状态（启动、暂停、删除）
     * Summary: 修改导出任务状态（启动、暂停、删除）
     */
    public UpdateChainDataexportStatusResponse updateChainDataexportStatus(UpdateChainDataexportStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainDataexportStatusEx(request, headers, runtime);
    }

    /**
     * Description: 修改导出任务状态（启动、暂停、删除）
     * Summary: 修改导出任务状态（启动、暂停、删除）
     */
    public UpdateChainDataexportStatusResponse updateChainDataexportStatusEx(UpdateChainDataexportStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.dataexport.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainDataexportStatusResponse());
    }

    /**
     * Description: 修改导出任务（名称、描述、告警地址）
     * Summary: 修改导出任务（名称、描述、告警地址）
     */
    public UpdateChainDataexportTaskResponse updateChainDataexportTask(UpdateChainDataexportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainDataexportTaskEx(request, headers, runtime);
    }

    /**
     * Description: 修改导出任务（名称、描述、告警地址）
     * Summary: 修改导出任务（名称、描述、告警地址）
     */
    public UpdateChainDataexportTaskResponse updateChainDataexportTaskEx(UpdateChainDataexportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.dataexport.task.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainDataexportTaskResponse());
    }

    /**
     * Description: 分页失败的展示日志（过滤器：待处理、成功、已忽略）
     * Summary: 分页失败的展示日志
     */
    public QueryChainFailureLogResponse queryChainFailureLog(QueryChainFailureLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainFailureLogEx(request, headers, runtime);
    }

    /**
     * Description: 分页失败的展示日志（过滤器：待处理、成功、已忽略）
     * Summary: 分页失败的展示日志
     */
    public QueryChainFailureLogResponse queryChainFailureLogEx(QueryChainFailureLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.failure.log.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainFailureLogResponse());
    }

    /**
     * Description: 批量处理失败日志（重试/忽略）
     * Summary: 批量处理失败日志（重试/忽略）
     */
    public UpdateChainFailureLogResponse updateChainFailureLog(UpdateChainFailureLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChainFailureLogEx(request, headers, runtime);
    }

    /**
     * Description: 批量处理失败日志（重试/忽略）
     * Summary: 批量处理失败日志（重试/忽略）
     */
    public UpdateChainFailureLogResponse updateChainFailureLogEx(UpdateChainFailureLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.failure.log.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateChainFailureLogResponse());
    }

    /**
     * Description: 列出当前用户的托管MQ实例
     * Summary: 列出当前用户的托管MQ实例
     */
    public QueryChainManagedMqResponse queryChainManagedMq(QueryChainManagedMqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainManagedMqEx(request, headers, runtime);
    }

    /**
     * Description: 列出当前用户的托管MQ实例
     * Summary: 列出当前用户的托管MQ实例
     */
    public QueryChainManagedMqResponse queryChainManagedMqEx(QueryChainManagedMqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.managed.mq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainManagedMqResponse());
    }

    /**
     * Description: 初始化托管 MQ 实例
     * Summary: 初始化托管 MQ 实例
     */
    public InitChainManagedMqResponse initChainManagedMq(InitChainManagedMqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initChainManagedMqEx(request, headers, runtime);
    }

    /**
     * Description: 初始化托管 MQ 实例
     * Summary: 初始化托管 MQ 实例
     */
    public InitChainManagedMqResponse initChainManagedMqEx(InitChainManagedMqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.managed.mq.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitChainManagedMqResponse());
    }

    /**
     * Description: 查询蚂蚁链用途列表接口
     * Summary: 查询蚂蚁链用途列表
     */
    public QueryChainUseDeclarationResponse queryChainUseDeclaration(QueryChainUseDeclarationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainUseDeclarationEx(request, headers, runtime);
    }

    /**
     * Description: 查询蚂蚁链用途列表接口
     * Summary: 查询蚂蚁链用途列表
     */
    public QueryChainUseDeclarationResponse queryChainUseDeclarationEx(QueryChainUseDeclarationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.use.declaration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainUseDeclarationResponse());
    }

    /**
     * Description: 选择蚂蚁链用途列表中的某项，进行提交申报接口
     * Summary: 选择蚂蚁链用途列表中的某项，进行提交申报
     */
    public ApplyChainUseDeclarationResponse applyChainUseDeclaration(ApplyChainUseDeclarationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyChainUseDeclarationEx(request, headers, runtime);
    }

    /**
     * Description: 选择蚂蚁链用途列表中的某项，进行提交申报接口
     * Summary: 选择蚂蚁链用途列表中的某项，进行提交申报
     */
    public ApplyChainUseDeclarationResponse applyChainUseDeclarationEx(ApplyChainUseDeclarationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.use.declaration.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyChainUseDeclarationResponse());
    }

    /**
     * Description: 展示用户添加申报的记录接口
     * Summary: 展示用户添加申报的记录
     */
    public QueryChainUseListResponse queryChainUseList(QueryChainUseListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainUseListEx(request, headers, runtime);
    }

    /**
     * Description: 展示用户添加申报的记录接口
     * Summary: 展示用户添加申报的记录
     */
    public QueryChainUseListResponse queryChainUseListEx(QueryChainUseListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.use.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainUseListResponse());
    }

    /**
     * Description: BaaS用途申报敏感词检查接口
     * Summary: BaaS用途申报敏感词检查
     */
    public CheckChainSensitiveWordsResponse checkChainSensitiveWords(CheckChainSensitiveWordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkChainSensitiveWordsEx(request, headers, runtime);
    }

    /**
     * Description: BaaS用途申报敏感词检查接口
     * Summary: BaaS用途申报敏感词检查
     */
    public CheckChainSensitiveWordsResponse checkChainSensitiveWordsEx(CheckChainSensitiveWordsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.sensitive.words.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckChainSensitiveWordsResponse());
    }

    /**
     * Description: 阿里云MyChain创建托管账户
     * Summary: 阿里云MyChain创建托管账户
     */
    public CreateChainAccountAntkmsResponse createChainAccountAntkms(CreateChainAccountAntkmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChainAccountAntkmsEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云MyChain创建托管账户
     * Summary: 阿里云MyChain创建托管账户
     */
    public CreateChainAccountAntkmsResponse createChainAccountAntkmsEx(CreateChainAccountAntkmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.account.antkms.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateChainAccountAntkmsResponse());
    }

    /**
     * Description: 阿里云渠道链相关商业化服务开通，后台经由ocp转发，实现计量计费
     * Summary: 阿里云渠道链相关商业化服务开通
     */
    public OpenChainServiceResponse openChainService(OpenChainServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openChainServiceEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云渠道链相关商业化服务开通，后台经由ocp转发，实现计量计费
     * Summary: 阿里云渠道链相关商业化服务开通
     */
    public OpenChainServiceResponse openChainServiceEx(OpenChainServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.service.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenChainServiceResponse());
    }

    /**
     * Description: 阿里云渠道链相关商业化服务开通结果查询
     * Summary: 阿里云渠道链相关商业化服务开通结果查询
     */
    public CheckChainServiceResponse checkChainService(CheckChainServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkChainServiceEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云渠道链相关商业化服务开通结果查询
     * Summary: 阿里云渠道链相关商业化服务开通结果查询
     */
    public CheckChainServiceResponse checkChainServiceEx(CheckChainServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.service.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckChainServiceResponse());
    }

    /**
     * Description: 阿里云渠道链相关商业化服务开通，后台经由ocp转发，实现服务关闭
     * Summary: 阿里云渠道链相关商业化服务关闭
     */
    public CloseChainServiceResponse closeChainService(CloseChainServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeChainServiceEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云渠道链相关商业化服务开通，后台经由ocp转发，实现服务关闭
     * Summary: 阿里云渠道链相关商业化服务关闭
     */
    public CloseChainServiceResponse closeChainServiceEx(CloseChainServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.chain.service.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseChainServiceResponse());
    }

    /**
     * Description: 企业通过调用该接口准备接入反洗钱信息共享平台
     * Summary: 反洗钱信息共享平台入驻接口
     */
    public StartAmlCorporationJoinprepareResponse startAmlCorporationJoinprepare(StartAmlCorporationJoinprepareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAmlCorporationJoinprepareEx(request, headers, runtime);
    }

    /**
     * Description: 企业通过调用该接口准备接入反洗钱信息共享平台
     * Summary: 反洗钱信息共享平台入驻接口
     */
    public StartAmlCorporationJoinprepareResponse startAmlCorporationJoinprepareEx(StartAmlCorporationJoinprepareRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.aml.corporation.joinprepare.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAmlCorporationJoinprepareResponse());
    }

    /**
     * Description: 反洗钱信息共享平台确认加盟接口，用户在准备阶段确认了平台安全性之后可以确认入驻
     * Summary: 反洗钱信息共享平台确认加盟接口
     */
    public StartAmlCorporationJoincommitResponse startAmlCorporationJoincommit(StartAmlCorporationJoincommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAmlCorporationJoincommitEx(request, headers, runtime);
    }

    /**
     * Description: 反洗钱信息共享平台确认加盟接口，用户在准备阶段确认了平台安全性之后可以确认入驻
     * Summary: 反洗钱信息共享平台确认加盟接口
     */
    public StartAmlCorporationJoincommitResponse startAmlCorporationJoincommitEx(StartAmlCorporationJoincommitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.aml.corporation.joincommit.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAmlCorporationJoincommitResponse());
    }

    /**
     * Description: 反洗钱系统二要素实名认证
     * Summary: 反洗钱系统二要素实名认证
     */
    public StartAmlPersonTwofactorResponse startAmlPersonTwofactor(StartAmlPersonTwofactorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAmlPersonTwofactorEx(request, headers, runtime);
    }

    /**
     * Description: 反洗钱系统二要素实名认证
     * Summary: 反洗钱系统二要素实名认证
     */
    public StartAmlPersonTwofactorResponse startAmlPersonTwofactorEx(StartAmlPersonTwofactorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.aml.person.twofactor.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAmlPersonTwofactorResponse());
    }

    /**
     * Description: 简单存证
     * Summary: 简单存证
     */
    public SaveBusinessDepositResponse saveBusinessDeposit(SaveBusinessDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBusinessDepositEx(request, headers, runtime);
    }

    /**
     * Description: 简单存证
     * Summary: 简单存证
     */
    public SaveBusinessDepositResponse saveBusinessDepositEx(SaveBusinessDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBusinessDepositResponse());
    }

    /**
     * Description: 存储带有描述性的数据
     * Summary: 存储带有描述性的数据
     */
    public SaveBusinessDepositMetadataResponse saveBusinessDepositMetadata(SaveBusinessDepositMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBusinessDepositMetadataEx(request, headers, runtime);
    }

    /**
     * Description: 存储带有描述性的数据
     * Summary: 存储带有描述性的数据
     */
    public SaveBusinessDepositMetadataResponse saveBusinessDepositMetadataEx(SaveBusinessDepositMetadataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.metadata.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBusinessDepositMetadataResponse());
    }

    /**
     * Description: 将存证的数据在链上加密
     * Summary: 将存证的数据在链上加密
     */
    public SaveBusinessDepositEncryptResponse saveBusinessDepositEncrypt(SaveBusinessDepositEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBusinessDepositEncryptEx(request, headers, runtime);
    }

    /**
     * Description: 将存证的数据在链上加密
     * Summary: 将存证的数据在链上加密
     */
    public SaveBusinessDepositEncryptResponse saveBusinessDepositEncryptEx(SaveBusinessDepositEncryptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.encrypt.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBusinessDepositEncryptResponse());
    }

    /**
     * Description: 存证带有描述性的数据并加密
     * Summary: 存证带有描述性的数据并加密
     */
    public SaveBusinessDepositEncryptmetadataResponse saveBusinessDepositEncryptmetadata(SaveBusinessDepositEncryptmetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBusinessDepositEncryptmetadataEx(request, headers, runtime);
    }

    /**
     * Description: 存证带有描述性的数据并加密
     * Summary: 存证带有描述性的数据并加密
     */
    public SaveBusinessDepositEncryptmetadataResponse saveBusinessDepositEncryptmetadataEx(SaveBusinessDepositEncryptmetadataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.encryptmetadata.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBusinessDepositEncryptmetadataResponse());
    }

    /**
     * Description: 通过授权宝创建did
     * Summary: 创建did
     */
    public CreateBusinessDidResponse createBusinessDid(CreateBusinessDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessDidEx(request, headers, runtime);
    }

    /**
     * Description: 通过授权宝创建did
     * Summary: 创建did
     */
    public CreateBusinessDidResponse createBusinessDidEx(CreateBusinessDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessDidResponse());
    }

    /**
     * Description: 根据did创建链上账户
     * Summary: 根据did创建链上账户
     */
    public CreateBusinessBizaccountResponse createBusinessBizaccount(CreateBusinessBizaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessBizaccountEx(request, headers, runtime);
    }

    /**
     * Description: 根据did创建链上账户
     * Summary: 根据did创建链上账户
     */
    public CreateBusinessBizaccountResponse createBusinessBizaccountEx(CreateBusinessBizaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.bizaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessBizaccountResponse());
    }

    /**
     * Description: 查询存证数据
     * Summary: 查询存证数据
     */
    public QueryBusinessDepositResponse queryBusinessDeposit(QueryBusinessDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessDepositEx(request, headers, runtime);
    }

    /**
     * Description: 查询存证数据
     * Summary: 查询存证数据
     */
    public QueryBusinessDepositResponse queryBusinessDepositEx(QueryBusinessDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessDepositResponse());
    }

    /**
     * Description: 授权存证数据
     * Summary: 授权存证数据
     */
    public AuthBusinessDepositdataResponse authBusinessDepositdata(AuthBusinessDepositdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authBusinessDepositdataEx(request, headers, runtime);
    }

    /**
     * Description: 授权存证数据
     * Summary: 授权存证数据
     */
    public AuthBusinessDepositdataResponse authBusinessDepositdataEx(AuthBusinessDepositdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.depositdata.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthBusinessDepositdataResponse());
    }

    /**
     * Description: 创建部署合约
     * Summary: 创建部署合约
     */
    public CreateBusinessContractDeployResponse createBusinessContractDeploy(CreateBusinessContractDeployRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessContractDeployEx(request, headers, runtime);
    }

    /**
     * Description: 创建部署合约
     * Summary: 创建部署合约
     */
    public CreateBusinessContractDeployResponse createBusinessContractDeployEx(CreateBusinessContractDeployRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contract.deploy.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessContractDeployResponse());
    }

    /**
     * Description: 普通合约接口调用
     * Summary: 普通合约接口调用
     */
    public CreateBusinessContractnormalcallResponse createBusinessContractnormalcall(CreateBusinessContractnormalcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessContractnormalcallEx(request, headers, runtime);
    }

    /**
     * Description: 普通合约接口调用
     * Summary: 普通合约接口调用
     */
    public CreateBusinessContractnormalcallResponse createBusinessContractnormalcallEx(CreateBusinessContractnormalcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contractnormalcall.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessContractnormalcallResponse());
    }

    /**
     * Description: 调用加密合约接口
     * Summary: 调用加密合约接口
     */
    public CreateBusinessContractencryptcallResponse createBusinessContractencryptcall(CreateBusinessContractencryptcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessContractencryptcallEx(request, headers, runtime);
    }

    /**
     * Description: 调用加密合约接口
     * Summary: 调用加密合约接口
     */
    public CreateBusinessContractencryptcallResponse createBusinessContractencryptcallEx(CreateBusinessContractencryptcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contractencryptcall.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessContractencryptcallResponse());
    }

    /**
     * Description: 查询交易receipt
     * Summary: 查询交易receipt
     */
    public QueryBusinessContractreceiptResponse queryBusinessContractreceipt(QueryBusinessContractreceiptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessContractreceiptEx(request, headers, runtime);
    }

    /**
     * Description: 查询交易receipt
     * Summary: 查询交易receipt
     */
    public QueryBusinessContractreceiptResponse queryBusinessContractreceiptEx(QueryBusinessContractreceiptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contractreceipt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessContractreceiptResponse());
    }

    /**
     * Description: 查询加密的receipt
     * Summary: 查询加密的receipt
     */
    public QueryBusinessContractencryptreceiptResponse queryBusinessContractencryptreceipt(QueryBusinessContractencryptreceiptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessContractencryptreceiptEx(request, headers, runtime);
    }

    /**
     * Description: 查询加密的receipt
     * Summary: 查询加密的receipt
     */
    public QueryBusinessContractencryptreceiptResponse queryBusinessContractencryptreceiptEx(QueryBusinessContractencryptreceiptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contractencryptreceipt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessContractencryptreceiptResponse());
    }

    /**
     * Description: 查询合约加密内容的方法
     * Summary: 查询合约加密内容的方法
     */
    public QueryBusinessContractencryptmethodResponse queryBusinessContractencryptmethod(QueryBusinessContractencryptmethodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessContractencryptmethodEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约加密内容的方法
     * Summary: 查询合约加密内容的方法
     */
    public QueryBusinessContractencryptmethodResponse queryBusinessContractencryptmethodEx(QueryBusinessContractencryptmethodRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contractencryptmethod.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessContractencryptmethodResponse());
    }

    /**
     * Description: 部署业务共识合约
     * Summary: 部署业务共识合约
     */
    public DeployBusinessAgreementResponse deployBusinessAgreement(DeployBusinessAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployBusinessAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 部署业务共识合约
     * Summary: 部署业务共识合约
     */
    public DeployBusinessAgreementResponse deployBusinessAgreementEx(DeployBusinessAgreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.agreement.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployBusinessAgreementResponse());
    }

    /**
     * Description: 创建业务共识模板
     * Summary: 创建业务共识模板
     */
    public CreateBusinessAgreementRegistertemplateResponse createBusinessAgreementRegistertemplate(CreateBusinessAgreementRegistertemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessAgreementRegistertemplateEx(request, headers, runtime);
    }

    /**
     * Description: 创建业务共识模板
     * Summary: 创建业务共识模板
     */
    public CreateBusinessAgreementRegistertemplateResponse createBusinessAgreementRegistertemplateEx(CreateBusinessAgreementRegistertemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.agreement.registertemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessAgreementRegistertemplateResponse());
    }

    /**
     * Description: 注册业务共识实例
     * Summary: 注册业务共识实例
     */
    public CreateBusinessAgreementRegisterResponse createBusinessAgreementRegister(CreateBusinessAgreementRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessAgreementRegisterEx(request, headers, runtime);
    }

    /**
     * Description: 注册业务共识实例
     * Summary: 注册业务共识实例
     */
    public CreateBusinessAgreementRegisterResponse createBusinessAgreementRegisterEx(CreateBusinessAgreementRegisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.agreement.register.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessAgreementRegisterResponse());
    }

    /**
     * Description: 对业务共识key进行签名认可
     * Summary: 对业务共识key进行签名认可
     */
    public CreateBusinessAgreementSignResponse createBusinessAgreementSign(CreateBusinessAgreementSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessAgreementSignEx(request, headers, runtime);
    }

    /**
     * Description: 对业务共识key进行签名认可
     * Summary: 对业务共识key进行签名认可
     */
    public CreateBusinessAgreementSignResponse createBusinessAgreementSignEx(CreateBusinessAgreementSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.agreement.sign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessAgreementSignResponse());
    }

    /**
     * Description: 查询业务共识当前状态
     * Summary: 查询业务共识当前状态
     */
    public QueryBusinessAgreementResponse queryBusinessAgreement(QueryBusinessAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 查询业务共识当前状态
     * Summary: 查询业务共识当前状态
     */
    public QueryBusinessAgreementResponse queryBusinessAgreementEx(QueryBusinessAgreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.agreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessAgreementResponse());
    }

    /**
     * Description: 对合约隐私key授权
     * Summary: 对合约隐私key授权
     */
    public CreateBusinessContractGrantdidResponse createBusinessContractGrantdid(CreateBusinessContractGrantdidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessContractGrantdidEx(request, headers, runtime);
    }

    /**
     * Description: 对合约隐私key授权
     * Summary: 对合约隐私key授权
     */
    public CreateBusinessContractGrantdidResponse createBusinessContractGrantdidEx(CreateBusinessContractGrantdidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contract.grantdid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessContractGrantdidResponse());
    }

    /**
     * Description: 查询被加密的存证数据
     * Summary: 查询被加密的存证数据
     */
    public QueryBusinessDepositEncryptedmetadataResponse queryBusinessDepositEncryptedmetadata(QueryBusinessDepositEncryptedmetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessDepositEncryptedmetadataEx(request, headers, runtime);
    }

    /**
     * Description: 查询被加密的存证数据
     * Summary: 查询被加密的存证数据
     */
    public QueryBusinessDepositEncryptedmetadataResponse queryBusinessDepositEncryptedmetadataEx(QueryBusinessDepositEncryptedmetadataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.encryptedmetadata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessDepositEncryptedmetadataResponse());
    }

    /**
     * Description: 授权存证数据给对应的组织机构，该组织下所有的人员都可以查询该存证数据的原内容
     * Summary: 授权存证数据给对应的组织机构
     */
    public AuthBusinessDepositdataCorpResponse authBusinessDepositdataCorp(AuthBusinessDepositdataCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authBusinessDepositdataCorpEx(request, headers, runtime);
    }

    /**
     * Description: 授权存证数据给对应的组织机构，该组织下所有的人员都可以查询该存证数据的原内容
     * Summary: 授权存证数据给对应的组织机构
     */
    public AuthBusinessDepositdataCorpResponse authBusinessDepositdataCorpEx(AuthBusinessDepositdataCorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.depositdata.corp.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthBusinessDepositdataCorpResponse());
    }

    /**
     * Description: 取消存证数据授权给账户
     * Summary: 取消存证数据授权给账户
     */
    public CancelBusinessDepositGrantdidResponse cancelBusinessDepositGrantdid(CancelBusinessDepositGrantdidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBusinessDepositGrantdidEx(request, headers, runtime);
    }

    /**
     * Description: 取消存证数据授权给账户
     * Summary: 取消存证数据授权给账户
     */
    public CancelBusinessDepositGrantdidResponse cancelBusinessDepositGrantdidEx(CancelBusinessDepositGrantdidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.grantdid.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBusinessDepositGrantdidResponse());
    }

    /**
     * Description: 取消存证授权给组织机构
     * Summary: 取消存证授权给组织机构
     */
    public CancelBusinessDepositGrantcorpResponse cancelBusinessDepositGrantcorp(CancelBusinessDepositGrantcorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBusinessDepositGrantcorpEx(request, headers, runtime);
    }

    /**
     * Description: 取消存证授权给组织机构
     * Summary: 取消存证授权给组织机构
     */
    public CancelBusinessDepositGrantcorpResponse cancelBusinessDepositGrantcorpEx(CancelBusinessDepositGrantcorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.deposit.grantcorp.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBusinessDepositGrantcorpResponse());
    }

    /**
     * Description: 授权合约内加密字段给机构，机构下的所有人都有权限访问该数据
     * Summary: 授权合约内加密字段给机构
     */
    public CreateBusinessContractGrantcorpResponse createBusinessContractGrantcorp(CreateBusinessContractGrantcorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessContractGrantcorpEx(request, headers, runtime);
    }

    /**
     * Description: 授权合约内加密字段给机构，机构下的所有人都有权限访问该数据
     * Summary: 授权合约内加密字段给机构
     */
    public CreateBusinessContractGrantcorpResponse createBusinessContractGrantcorpEx(CreateBusinessContractGrantcorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contract.grantcorp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessContractGrantcorpResponse());
    }

    /**
     * Description: 取消授权did查询加密数据
     * Summary: 取消授权did查询加密数据
     */
    public CancelBusinessContractGrantdidResponse cancelBusinessContractGrantdid(CancelBusinessContractGrantdidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBusinessContractGrantdidEx(request, headers, runtime);
    }

    /**
     * Description: 取消授权did查询加密数据
     * Summary: 取消授权did查询加密数据
     */
    public CancelBusinessContractGrantdidResponse cancelBusinessContractGrantdidEx(CancelBusinessContractGrantdidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contract.grantdid.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBusinessContractGrantdidResponse());
    }

    /**
     * Description: 取消授权给组织机构
     * Summary: 取消授权给组织机构
     */
    public CancelBusinessContractGrantcorpResponse cancelBusinessContractGrantcorp(CancelBusinessContractGrantcorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBusinessContractGrantcorpEx(request, headers, runtime);
    }

    /**
     * Description: 取消授权给组织机构
     * Summary: 取消授权给组织机构
     */
    public CancelBusinessContractGrantcorpResponse cancelBusinessContractGrantcorpEx(CancelBusinessContractGrantcorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.business.contract.grantcorp.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBusinessContractGrantcorpResponse());
    }

    /**
     * Description: 业务中台测试接口
     * Summary: 业务中台测试接口
     */
    public ImportPlatformTestregionTestfuncResponse importPlatformTestregionTestfunc(ImportPlatformTestregionTestfuncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importPlatformTestregionTestfuncEx(request, headers, runtime);
    }

    /**
     * Description: 业务中台测试接口
     * Summary: 业务中台测试接口
     */
    public ImportPlatformTestregionTestfuncResponse importPlatformTestregionTestfuncEx(ImportPlatformTestregionTestfuncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.platform.testregion.testfunc.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportPlatformTestregionTestfuncResponse());
    }

    /**
     * Description: 存证创建账户
     * Summary: 存证创建账户
     */
    public CreatePlatformDepositAccountResponse createPlatformDepositAccount(CreatePlatformDepositAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlatformDepositAccountEx(request, headers, runtime);
    }

    /**
     * Description: 存证创建账户
     * Summary: 存证创建账户
     */
    public CreatePlatformDepositAccountResponse createPlatformDepositAccountEx(CreatePlatformDepositAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.platform.deposit.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePlatformDepositAccountResponse());
    }

    /**
     * Description: 存证创建did
     * Summary: 存证创建did
     */
    public CreatePlatformDepositDidResponse createPlatformDepositDid(CreatePlatformDepositDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlatformDepositDidEx(request, headers, runtime);
    }

    /**
     * Description: 存证创建did
     * Summary: 存证创建did
     */
    public CreatePlatformDepositDidResponse createPlatformDepositDidEx(CreatePlatformDepositDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.platform.deposit.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePlatformDepositDidResponse());
    }

    /**
     * Description: 普通数据存证
     * Summary: 普通数据存证
     */
    public SavePlatformDepositDepositResponse savePlatformDepositDeposit(SavePlatformDepositDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.savePlatformDepositDepositEx(request, headers, runtime);
    }

    /**
     * Description: 普通数据存证
     * Summary: 普通数据存证
     */
    public SavePlatformDepositDepositResponse savePlatformDepositDepositEx(SavePlatformDepositDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.platform.deposit.deposit.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SavePlatformDepositDepositResponse());
    }

    /**
     * Description: 为企业创建did
     * Summary: 为企业创建did
     */
    public CreatePlatformDepositCorpdidResponse createPlatformDepositCorpdid(CreatePlatformDepositCorpdidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlatformDepositCorpdidEx(request, headers, runtime);
    }

    /**
     * Description: 为企业创建did
     * Summary: 为企业创建did
     */
    public CreatePlatformDepositCorpdidResponse createPlatformDepositCorpdidEx(CreatePlatformDepositCorpdidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.platform.deposit.corpdid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePlatformDepositCorpdidResponse());
    }

    /**
     * Description: 用于对用户的账户映射，输入用户名、账户、手机号等信息，返回用户的链上身份信息
     * Summary: 用户账号映射
     */
    public CreateDigitalassetartAccountResponse createDigitalassetartAccount(CreateDigitalassetartAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalassetartAccountEx(request, headers, runtime);
    }

    /**
     * Description: 用于对用户的账户映射，输入用户名、账户、手机号等信息，返回用户的链上身份信息
     * Summary: 用户账号映射
     */
    public CreateDigitalassetartAccountResponse createDigitalassetartAccountEx(CreateDigitalassetartAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDigitalassetartAccountResponse());
    }

    /**
     * Description: 批量账户映射
     * Summary: 批量账户映射
     */
    public BatchcreateDigitalassetartAccountResponse batchcreateDigitalassetartAccount(BatchcreateDigitalassetartAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateDigitalassetartAccountEx(request, headers, runtime);
    }

    /**
     * Description: 批量账户映射
     * Summary: 批量账户映射
     */
    public BatchcreateDigitalassetartAccountResponse batchcreateDigitalassetartAccountEx(BatchcreateDigitalassetartAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.account.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateDigitalassetartAccountResponse());
    }

    /**
     * Description: 创建艺术品
     * Summary: 创建艺术品
     */
    public CreateDigitalassetartArtCreateResponse createDigitalassetartArtCreate(CreateDigitalassetartArtCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalassetartArtCreateEx(request, headers, runtime);
    }

    /**
     * Description: 创建艺术品
     * Summary: 创建艺术品
     */
    public CreateDigitalassetartArtCreateResponse createDigitalassetartArtCreateEx(CreateDigitalassetartArtCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.create.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDigitalassetartArtCreateResponse());
    }

    /**
     * Description: 将艺术品从创建状态改为发行状态，只有在发行状态的艺术品才能进行各种交易
     * Summary: 发行艺术品
     */
    public SetDigitalassetartArtIssueResponse setDigitalassetartArtIssue(SetDigitalassetartArtIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDigitalassetartArtIssueEx(request, headers, runtime);
    }

    /**
     * Description: 将艺术品从创建状态改为发行状态，只有在发行状态的艺术品才能进行各种交易
     * Summary: 发行艺术品
     */
    public SetDigitalassetartArtIssueResponse setDigitalassetartArtIssueEx(SetDigitalassetartArtIssueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.issue.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDigitalassetartArtIssueResponse());
    }

    /**
     * Description: 将该艺术品发布到交易所
     * Summary: 将该艺术品发布到交易所
     */
    public SetDigitalassetartArtIssuetoexchangeResponse setDigitalassetartArtIssuetoexchange(SetDigitalassetartArtIssuetoexchangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDigitalassetartArtIssuetoexchangeEx(request, headers, runtime);
    }

    /**
     * Description: 将该艺术品发布到交易所
     * Summary: 将该艺术品发布到交易所
     */
    public SetDigitalassetartArtIssuetoexchangeResponse setDigitalassetartArtIssuetoexchangeEx(SetDigitalassetartArtIssuetoexchangeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.issuetoexchange.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDigitalassetartArtIssuetoexchangeResponse());
    }

    /**
     * Description: 艺术品本链交易
     * Summary: 艺术品本链交易
     */
    public SetDigitalassetartArtTradeResponse setDigitalassetartArtTrade(SetDigitalassetartArtTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDigitalassetartArtTradeEx(request, headers, runtime);
    }

    /**
     * Description: 艺术品本链交易
     * Summary: 艺术品本链交易
     */
    public SetDigitalassetartArtTradeResponse setDigitalassetartArtTradeEx(SetDigitalassetartArtTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.trade.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDigitalassetartArtTradeResponse());
    }

    /**
     * Description: 在交易所交易艺术品
     * Summary: 在交易所交易艺术品
     */
    public SetDigitalassetartArtTradeonexchangeResponse setDigitalassetartArtTradeonexchange(SetDigitalassetartArtTradeonexchangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDigitalassetartArtTradeonexchangeEx(request, headers, runtime);
    }

    /**
     * Description: 在交易所交易艺术品
     * Summary: 在交易所交易艺术品
     */
    public SetDigitalassetartArtTradeonexchangeResponse setDigitalassetartArtTradeonexchangeEx(SetDigitalassetartArtTradeonexchangeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.tradeonexchange.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDigitalassetartArtTradeonexchangeResponse());
    }

    /**
     * Description: 冻结艺术品
     * Summary: 冻结艺术品
     */
    public FreezeDigitalassetartArtAccountResponse freezeDigitalassetartArtAccount(FreezeDigitalassetartArtAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeDigitalassetartArtAccountEx(request, headers, runtime);
    }

    /**
     * Description: 冻结艺术品
     * Summary: 冻结艺术品
     */
    public FreezeDigitalassetartArtAccountResponse freezeDigitalassetartArtAccountEx(FreezeDigitalassetartArtAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.account.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeDigitalassetartArtAccountResponse());
    }

    /**
     * Description: 艺术品解冻
     * Summary: 艺术品解冻
     */
    public UnfreezeDigitalassetartArtAccountResponse unfreezeDigitalassetartArtAccount(UnfreezeDigitalassetartArtAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeDigitalassetartArtAccountEx(request, headers, runtime);
    }

    /**
     * Description: 艺术品解冻
     * Summary: 艺术品解冻
     */
    public UnfreezeDigitalassetartArtAccountResponse unfreezeDigitalassetartArtAccountEx(UnfreezeDigitalassetartArtAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.account.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeDigitalassetartArtAccountResponse());
    }

    /**
     * Description: 取消在交易所发布艺术品
     * Summary: 取消在交易所发布艺术品
     */
    public SetDigitalassetartArtUnissuetoexchangeResponse setDigitalassetartArtUnissuetoexchange(SetDigitalassetartArtUnissuetoexchangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDigitalassetartArtUnissuetoexchangeEx(request, headers, runtime);
    }

    /**
     * Description: 取消在交易所发布艺术品
     * Summary: 取消在交易所发布艺术品
     */
    public SetDigitalassetartArtUnissuetoexchangeResponse setDigitalassetartArtUnissuetoexchangeEx(SetDigitalassetartArtUnissuetoexchangeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.unissuetoexchange.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDigitalassetartArtUnissuetoexchangeResponse());
    }

    /**
     * Description: 查询艺术品信息
     * Summary: 查询艺术品信息
     */
    public QueryDigitalassetartArtResponse queryDigitalassetartArt(QueryDigitalassetartArtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalassetartArtEx(request, headers, runtime);
    }

    /**
     * Description: 查询艺术品信息
     * Summary: 查询艺术品信息
     */
    public QueryDigitalassetartArtResponse queryDigitalassetartArtEx(QueryDigitalassetartArtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalassetart.art.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalassetartArtResponse());
    }

    /**
     * Description: 数字资产管理平台业务方账户映射接口
     * Summary: 数字资产管理平台业务方账户映射
     */
    public CreateDigitalassetExchangeAccountmapResponse createDigitalassetExchangeAccountmap(CreateDigitalassetExchangeAccountmapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalassetExchangeAccountmapEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台业务方账户映射接口
     * Summary: 数字资产管理平台业务方账户映射
     */
    public CreateDigitalassetExchangeAccountmapResponse createDigitalassetExchangeAccountmapEx(CreateDigitalassetExchangeAccountmapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.accountmap.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDigitalassetExchangeAccountmapResponse());
    }

    /**
     * Description: 数字资产管理平台用户账户批量映射接口
     * Summary: 数字资产管理平台用户账户批量映射
     */
    public BatchcreateDigitalassetExchangeAccountmapResponse batchcreateDigitalassetExchangeAccountmap(BatchcreateDigitalassetExchangeAccountmapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateDigitalassetExchangeAccountmapEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台用户账户批量映射接口
     * Summary: 数字资产管理平台用户账户批量映射
     */
    public BatchcreateDigitalassetExchangeAccountmapResponse batchcreateDigitalassetExchangeAccountmapEx(BatchcreateDigitalassetExchangeAccountmapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.accountmap.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateDigitalassetExchangeAccountmapResponse());
    }

    /**
     * Description: 数字资产管理平台版通解限接口
     * Summary: 数字资产管理平台版通解限
     */
    public StartDigitalassetExchangeUnfreezeResponse startDigitalassetExchangeUnfreeze(StartDigitalassetExchangeUnfreezeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDigitalassetExchangeUnfreezeEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台版通解限接口
     * Summary: 数字资产管理平台版通解限
     */
    public StartDigitalassetExchangeUnfreezeResponse startDigitalassetExchangeUnfreezeEx(StartDigitalassetExchangeUnfreezeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.unfreeze.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDigitalassetExchangeUnfreezeResponse());
    }

    /**
     * Description: 数字资产管理平台资源管理 处理用户、版通的锁定与解锁
    1. ep_code有值，user_account为空时，对指定版通进行锁定解锁操作
    2. ep_code为空，user_account有值时，对指定账户进行锁定解锁操作
    3. ep_code，user_account均有值时，对指定账户的版通进行锁定解锁操作
    4. ep_code，user_account均为空时，对全交易所进行锁定解锁操作，需谨慎
     * Summary: 数字资产管理平台资源管理
     */
    public StartDigitalassetExchangeLockpositionResponse startDigitalassetExchangeLockposition(StartDigitalassetExchangeLockpositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDigitalassetExchangeLockpositionEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台资源管理 处理用户、版通的锁定与解锁
    1. ep_code有值，user_account为空时，对指定版通进行锁定解锁操作
    2. ep_code为空，user_account有值时，对指定账户进行锁定解锁操作
    3. ep_code，user_account均有值时，对指定账户的版通进行锁定解锁操作
    4. ep_code，user_account均为空时，对全交易所进行锁定解锁操作，需谨慎
     * Summary: 数字资产管理平台资源管理
     */
    public StartDigitalassetExchangeLockpositionResponse startDigitalassetExchangeLockpositionEx(StartDigitalassetExchangeLockpositionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.lockposition.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDigitalassetExchangeLockpositionResponse());
    }

    /**
     * Description: 数字资产管理平台版通发行接口
     * Summary: 数字资产管理平台版通发行
     */
    public CreateDigitalassetExchangeEpissueResponse createDigitalassetExchangeEpissue(CreateDigitalassetExchangeEpissueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalassetExchangeEpissueEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台版通发行接口
     * Summary: 数字资产管理平台版通发行
     */
    public CreateDigitalassetExchangeEpissueResponse createDigitalassetExchangeEpissueEx(CreateDigitalassetExchangeEpissueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.epissue.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDigitalassetExchangeEpissueResponse());
    }

    /**
     * Description: 数字资产管理平台版通存量发行接口
     * Summary: 数字资产管理平台版通存量发行
     */
    public CreateDigitalassetExchangeEpstockissueResponse createDigitalassetExchangeEpstockissue(CreateDigitalassetExchangeEpstockissueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalassetExchangeEpstockissueEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台版通存量发行接口
     * Summary: 数字资产管理平台版通存量发行
     */
    public CreateDigitalassetExchangeEpstockissueResponse createDigitalassetExchangeEpstockissueEx(CreateDigitalassetExchangeEpstockissueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.epstockissue.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDigitalassetExchangeEpstockissueResponse());
    }

    /**
     * Description: 数字资产管理平台版通批发接口
     * Summary: 数字资产管理平台版通批发
     */
    public StartDigitalassetExchangeEpwholesaleResponse startDigitalassetExchangeEpwholesale(StartDigitalassetExchangeEpwholesaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDigitalassetExchangeEpwholesaleEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台版通批发接口
     * Summary: 数字资产管理平台版通批发
     */
    public StartDigitalassetExchangeEpwholesaleResponse startDigitalassetExchangeEpwholesaleEx(StartDigitalassetExchangeEpwholesaleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.epwholesale.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDigitalassetExchangeEpwholesaleResponse());
    }

    /**
     * Description: 数字资产管理平台版通信息查询接口
     * Summary: 数字资产管理平台版通信息查询
     */
    public QueryDigitalassetExchangeEpinfoResponse queryDigitalassetExchangeEpinfo(QueryDigitalassetExchangeEpinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalassetExchangeEpinfoEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台版通信息查询接口
     * Summary: 数字资产管理平台版通信息查询
     */
    public QueryDigitalassetExchangeEpinfoResponse queryDigitalassetExchangeEpinfoEx(QueryDigitalassetExchangeEpinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.epinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalassetExchangeEpinfoResponse());
    }

    /**
     * Description: 数字资产管理平台交易查询接口
    1. ep_code有值，user_account为空时，查询版通的交易信息
    2. ep_code为空，user_account有值时，查询账户的交易信息
    3. ep_code，user_account均有值时，查询账户下指定版通的交易信息
     * Summary: 数字资产管理平台交易查询
     */
    public QueryDigitalassetExchangeEptradeResponse queryDigitalassetExchangeEptrade(QueryDigitalassetExchangeEptradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalassetExchangeEptradeEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台交易查询接口
    1. ep_code有值，user_account为空时，查询版通的交易信息
    2. ep_code为空，user_account有值时，查询账户的交易信息
    3. ep_code，user_account均有值时，查询账户下指定版通的交易信息
     * Summary: 数字资产管理平台交易查询
     */
    public QueryDigitalassetExchangeEptradeResponse queryDigitalassetExchangeEptradeEx(QueryDigitalassetExchangeEptradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.eptrade.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalassetExchangeEptradeResponse());
    }

    /**
     * Description: 数字资产管理平台账户信息查询接口
     * Summary: 数字资产管理平台账户信息查询
     */
    public QueryDigitalassetExchangeEpaccountResponse queryDigitalassetExchangeEpaccount(QueryDigitalassetExchangeEpaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalassetExchangeEpaccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台账户信息查询接口
     * Summary: 数字资产管理平台账户信息查询
     */
    public QueryDigitalassetExchangeEpaccountResponse queryDigitalassetExchangeEpaccountEx(QueryDigitalassetExchangeEpaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.epaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalassetExchangeEpaccountResponse());
    }

    /**
     * Description: 数字资产管理平台交易接口
     * Summary: 数字资产管理平台交易
     */
    public StartDigitalassetExchangeEptradeResponse startDigitalassetExchangeEptrade(StartDigitalassetExchangeEptradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDigitalassetExchangeEptradeEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台交易接口
     * Summary: 数字资产管理平台交易
     */
    public StartDigitalassetExchangeEptradeResponse startDigitalassetExchangeEptradeEx(StartDigitalassetExchangeEptradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.eptrade.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDigitalassetExchangeEptradeResponse());
    }

    /**
     * Description: 数字资产管理平台版通回购接口
     * Summary: 数字资产管理平台版通回购
     */
    public StartDigitalassetExchangeEpbuybackResponse startDigitalassetExchangeEpbuyback(StartDigitalassetExchangeEpbuybackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDigitalassetExchangeEpbuybackEx(request, headers, runtime);
    }

    /**
     * Description: 数字资产管理平台版通回购接口
     * Summary: 数字资产管理平台版通回购
     */
    public StartDigitalassetExchangeEpbuybackResponse startDigitalassetExchangeEpbuybackEx(StartDigitalassetExchangeEpbuybackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.digitalasset.exchange.epbuyback.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDigitalassetExchangeEpbuybackResponse());
    }

    /**
     * Description: 创建用户接口
     * Summary: 创建用户接口
     */
    public CreateDistributionUserResponse createDistributionUser(CreateDistributionUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributionUserEx(request, headers, runtime);
    }

    /**
     * Description: 创建用户接口
     * Summary: 创建用户接口
     */
    public CreateDistributionUserResponse createDistributionUserEx(CreateDistributionUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributionUserResponse());
    }

    /**
     * Description: 用户下级分销关系查询
     * Summary: 用户下级分销关系查询
     */
    public QueryDistributionUserTeamResponse queryDistributionUserTeam(QueryDistributionUserTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionUserTeamEx(request, headers, runtime);
    }

    /**
     * Description: 用户下级分销关系查询
     * Summary: 用户下级分销关系查询
     */
    public QueryDistributionUserTeamResponse queryDistributionUserTeamEx(QueryDistributionUserTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.user.team.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionUserTeamResponse());
    }

    /**
     * Description: 创建商户接口
     * Summary: 创建商户
     */
    public CreateDistributionShopResponse createDistributionShop(CreateDistributionShopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributionShopEx(request, headers, runtime);
    }

    /**
     * Description: 创建商户接口
     * Summary: 创建商户
     */
    public CreateDistributionShopResponse createDistributionShopEx(CreateDistributionShopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.shop.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributionShopResponse());
    }

    /**
     * Description: 用户之间分销关系建立
     * Summary: 用户之间分销关系建立
     */
    public CreateDistributionUserRelationResponse createDistributionUserRelation(CreateDistributionUserRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributionUserRelationEx(request, headers, runtime);
    }

    /**
     * Description: 用户之间分销关系建立
     * Summary: 用户之间分销关系建立
     */
    public CreateDistributionUserRelationResponse createDistributionUserRelationEx(CreateDistributionUserRelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.user.relation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributionUserRelationResponse());
    }

    /**
     * Description: 营销分销合约初始化
     * Summary: 营销分销合约初始化
     */
    public InitDistributionContractResponse initDistributionContract(InitDistributionContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDistributionContractEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销合约初始化
     * Summary: 营销分销合约初始化
     */
    public InitDistributionContractResponse initDistributionContractEx(InitDistributionContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.contract.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDistributionContractResponse());
    }

    /**
     * Description: 营销分销平台商品创建
     * Summary: 营销分销平台商品创建
     */
    public CreateDistributionProductItemResponse createDistributionProductItem(CreateDistributionProductItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributionProductItemEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台商品创建
     * Summary: 营销分销平台商品创建
     */
    public CreateDistributionProductItemResponse createDistributionProductItemEx(CreateDistributionProductItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.product.item.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributionProductItemResponse());
    }

    /**
     * Description: 营销分销平台商品查询
     * Summary: 营销分销平台商品查询
     */
    public QueryDistributionProductItemResponse queryDistributionProductItem(QueryDistributionProductItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionProductItemEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台商品查询
     * Summary: 营销分销平台商品查询
     */
    public QueryDistributionProductItemResponse queryDistributionProductItemEx(QueryDistributionProductItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.product.item.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionProductItemResponse());
    }

    /**
     * Description: 营销分销平台推广人钱包更新
     * Summary: 营销分销平台推广人钱包更新
     */
    public UpdateDistributionFundPromoterResponse updateDistributionFundPromoter(UpdateDistributionFundPromoterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDistributionFundPromoterEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台推广人钱包更新
     * Summary: 营销分销平台推广人钱包更新
     */
    public UpdateDistributionFundPromoterResponse updateDistributionFundPromoterEx(UpdateDistributionFundPromoterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.fund.promoter.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDistributionFundPromoterResponse());
    }

    /**
     * Description: 营销分销平台商户账户更新
     * Summary: 营销分销平台商户账户更新
     */
    public UpdateDistributionFundShopResponse updateDistributionFundShop(UpdateDistributionFundShopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDistributionFundShopEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台商户账户更新
     * Summary: 营销分销平台商户账户更新
     */
    public UpdateDistributionFundShopResponse updateDistributionFundShopEx(UpdateDistributionFundShopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.fund.shop.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDistributionFundShopResponse());
    }

    /**
     * Description: 营销分销平台推广人账户查询
     * Summary: 营销分销平台推广人账户查询
     */
    public QueryDistributionFundPromoterResponse queryDistributionFundPromoter(QueryDistributionFundPromoterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionFundPromoterEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台推广人账户查询
     * Summary: 营销分销平台推广人账户查询
     */
    public QueryDistributionFundPromoterResponse queryDistributionFundPromoterEx(QueryDistributionFundPromoterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.fund.promoter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionFundPromoterResponse());
    }

    /**
     * Description: 营销分销平台商户账户查询
     * Summary: 营销分销平台商户账户查询
     */
    public QueryDistributionFundShopResponse queryDistributionFundShop(QueryDistributionFundShopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionFundShopEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台商户账户查询
     * Summary: 营销分销平台商户账户查询
     */
    public QueryDistributionFundShopResponse queryDistributionFundShopEx(QueryDistributionFundShopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.fund.shop.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionFundShopResponse());
    }

    /**
     * Description: 营销分销平台推广人账户流水查询
     * Summary: 营销分销平台推广人账户流水查询
     */
    public QueryDistributionFundPromoterflowResponse queryDistributionFundPromoterflow(QueryDistributionFundPromoterflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionFundPromoterflowEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台推广人账户流水查询
     * Summary: 营销分销平台推广人账户流水查询
     */
    public QueryDistributionFundPromoterflowResponse queryDistributionFundPromoterflowEx(QueryDistributionFundPromoterflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.fund.promoterflow.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionFundPromoterflowResponse());
    }

    /**
     * Description: 营销分销平台推广订单创建
     * Summary: 营销分销平台推广订单创建
     */
    public CreateDistributionOrderPromoterResponse createDistributionOrderPromoter(CreateDistributionOrderPromoterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributionOrderPromoterEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台推广订单创建
     * Summary: 营销分销平台推广订单创建
     */
    public CreateDistributionOrderPromoterResponse createDistributionOrderPromoterEx(CreateDistributionOrderPromoterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.order.promoter.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributionOrderPromoterResponse());
    }

    /**
     * Description: 营销分销平台购买订单创建
     * Summary: 营销分销平台购买订单创建
     */
    public CreateDistributionOrderTradeResponse createDistributionOrderTrade(CreateDistributionOrderTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributionOrderTradeEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台购买订单创建
     * Summary: 营销分销平台购买订单创建
     */
    public CreateDistributionOrderTradeResponse createDistributionOrderTradeEx(CreateDistributionOrderTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.order.trade.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributionOrderTradeResponse());
    }

    /**
     * Description: 营销分销平台推广订单查询
     * Summary: 营销分销平台推广订单查询
     */
    public QueryDistributionOrderPromoterResponse queryDistributionOrderPromoter(QueryDistributionOrderPromoterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionOrderPromoterEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台推广订单查询
     * Summary: 营销分销平台推广订单查询
     */
    public QueryDistributionOrderPromoterResponse queryDistributionOrderPromoterEx(QueryDistributionOrderPromoterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.order.promoter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionOrderPromoterResponse());
    }

    /**
     * Description: 营销分销平台订单返佣信息查询
     * Summary: 营销分销平台订单返佣信息查询
     */
    public QueryDistributionOrderRakebackResponse queryDistributionOrderRakeback(QueryDistributionOrderRakebackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionOrderRakebackEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台订单返佣信息查询
     * Summary: 营销分销平台订单返佣信息查询
     */
    public QueryDistributionOrderRakebackResponse queryDistributionOrderRakebackEx(QueryDistributionOrderRakebackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.order.rakeback.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionOrderRakebackResponse());
    }

    /**
     * Description: 营销分销平台购买订单查询
     * Summary: 营销分销平台购买订单查询
     */
    public QueryDistributionOrderTradeResponse queryDistributionOrderTrade(QueryDistributionOrderTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributionOrderTradeEx(request, headers, runtime);
    }

    /**
     * Description: 营销分销平台购买订单查询
     * Summary: 营销分销平台购买订单查询
     */
    public QueryDistributionOrderTradeResponse queryDistributionOrderTradeEx(QueryDistributionOrderTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.distribution.order.trade.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributionOrderTradeResponse());
    }

    /**
     * Description: DIS 分布式数字身份申请
     * Summary: DIS 分布式数字身份申请
     */
    public CreateLogisticFinanceDisResponse createLogisticFinanceDis(CreateLogisticFinanceDisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceDisEx(request, headers, runtime);
    }

    /**
     * Description: DIS 分布式数字身份申请
     * Summary: DIS 分布式数字身份申请
     */
    public CreateLogisticFinanceDisResponse createLogisticFinanceDisEx(CreateLogisticFinanceDisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.dis.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceDisResponse());
    }

    /**
     * Description: 查询 DIS 分布式数字身份列表
     * Summary: 查询 DIS 分布式数字身份列表
     */
    public ListLogisticFinanceDisResponse listLogisticFinanceDis(ListLogisticFinanceDisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogisticFinanceDisEx(request, headers, runtime);
    }

    /**
     * Description: 查询 DIS 分布式数字身份列表
     * Summary: 查询 DIS 分布式数字身份列表
     */
    public ListLogisticFinanceDisResponse listLogisticFinanceDisEx(ListLogisticFinanceDisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.dis.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLogisticFinanceDisResponse());
    }

    /**
     * Description: 为成员颁发可验证声明用于允许指定成员有访问数据的权限
     * Summary: 颁发可验证声明
     */
    public CreateLogisticFinanceDisvcResponse createLogisticFinanceDisvc(CreateLogisticFinanceDisvcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceDisvcEx(request, headers, runtime);
    }

    /**
     * Description: 为成员颁发可验证声明用于允许指定成员有访问数据的权限
     * Summary: 颁发可验证声明
     */
    public CreateLogisticFinanceDisvcResponse createLogisticFinanceDisvcEx(CreateLogisticFinanceDisvcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.disvc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceDisvcResponse());
    }

    /**
     * Description: 查询颁发的可验证声明完整声明内容
     * Summary: 查询颁发的可验证声明
     */
    public QueryLogisticFinanceDisvcResponse queryLogisticFinanceDisvc(QueryLogisticFinanceDisvcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLogisticFinanceDisvcEx(request, headers, runtime);
    }

    /**
     * Description: 查询颁发的可验证声明完整声明内容
     * Summary: 查询颁发的可验证声明
     */
    public QueryLogisticFinanceDisvcResponse queryLogisticFinanceDisvcEx(QueryLogisticFinanceDisvcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.disvc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLogisticFinanceDisvcResponse());
    }

    /**
     * Description: 物流金融平台用户账户映射
     * Summary: 物流金融平台用户账户映射
     */
    public CreateLogisticFinanceAccountResponse createLogisticFinanceAccount(CreateLogisticFinanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceAccountEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台用户账户映射
     * Summary: 物流金融平台用户账户映射
     */
    public CreateLogisticFinanceAccountResponse createLogisticFinanceAccountEx(CreateLogisticFinanceAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceAccountResponse());
    }

    /**
     * Description: 物流金融平台账户批量映射
     * Summary: 物流金融平台账户批量映射
     */
    public BatchcreateLogisticFinanceAccountResponse batchcreateLogisticFinanceAccount(BatchcreateLogisticFinanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateLogisticFinanceAccountEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台账户批量映射
     * Summary: 物流金融平台账户批量映射
     */
    public BatchcreateLogisticFinanceAccountResponse batchcreateLogisticFinanceAccountEx(BatchcreateLogisticFinanceAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.account.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateLogisticFinanceAccountResponse());
    }

    /**
     * Description: 物流金融平台物流运单创建
     * Summary: 物流金融平台物流运单创建
     */
    public CreateLogisticFinanceOrderResponse createLogisticFinanceOrder(CreateLogisticFinanceOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceOrderEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台物流运单创建
     * Summary: 物流金融平台物流运单创建
     */
    public CreateLogisticFinanceOrderResponse createLogisticFinanceOrderEx(CreateLogisticFinanceOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceOrderResponse());
    }

    /**
     * Description: 物流金融平台运单完成
     * Summary: 物流金融平台运单完成
     */
    public FinishLogisticFinanceOrderResponse finishLogisticFinanceOrder(FinishLogisticFinanceOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishLogisticFinanceOrderEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台运单完成
     * Summary: 物流金融平台运单完成
     */
    public FinishLogisticFinanceOrderResponse finishLogisticFinanceOrderEx(FinishLogisticFinanceOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.order.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishLogisticFinanceOrderResponse());
    }

    /**
     * Description: 物流金融平台支付订单创建
     * Summary: 物流金融平台支付订单创建
     */
    public CreateLogisticFinancePayorderResponse createLogisticFinancePayorder(CreateLogisticFinancePayorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinancePayorderEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台支付订单创建
     * Summary: 物流金融平台支付订单创建
     */
    public CreateLogisticFinancePayorderResponse createLogisticFinancePayorderEx(CreateLogisticFinancePayorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.payorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinancePayorderResponse());
    }

    /**
     * Description: 物流金融平台订单状态查询
     * Summary: 物流金融平台订单状态查询
     */
    public QueryLogisticFinanceOrderResponse queryLogisticFinanceOrder(QueryLogisticFinanceOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLogisticFinanceOrderEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台订单状态查询
     * Summary: 物流金融平台订单状态查询
     */
    public QueryLogisticFinanceOrderResponse queryLogisticFinanceOrderEx(QueryLogisticFinanceOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLogisticFinanceOrderResponse());
    }

    /**
     * Description: 物流金融平台发票订单创建
     * Summary: 物流金融平台发票订单创建
     */
    public CreateLogisticFinanceBillorderResponse createLogisticFinanceBillorder(CreateLogisticFinanceBillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceBillorderEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台发票订单创建
     * Summary: 物流金融平台发票订单创建
     */
    public CreateLogisticFinanceBillorderResponse createLogisticFinanceBillorderEx(CreateLogisticFinanceBillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.billorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceBillorderResponse());
    }

    /**
     * Description: 物流金融平台运单轨迹信息导入
     * Summary: 物流金融平台运单轨迹信息导入
     */
    public ImportLogisticFinanceLocationResponse importLogisticFinanceLocation(ImportLogisticFinanceLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importLogisticFinanceLocationEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台运单轨迹信息导入
     * Summary: 物流金融平台运单轨迹信息导入
     */
    public ImportLogisticFinanceLocationResponse importLogisticFinanceLocationEx(ImportLogisticFinanceLocationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.location.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportLogisticFinanceLocationResponse());
    }

    /**
     * Description: 物流金融平台创建货主DIS
     * Summary: 物流金融平台创建货主DIS
     */
    public CreateLogisticFinanceConsignorResponse createLogisticFinanceConsignor(CreateLogisticFinanceConsignorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceConsignorEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台创建货主DIS
     * Summary: 物流金融平台创建货主DIS
     */
    public CreateLogisticFinanceConsignorResponse createLogisticFinanceConsignorEx(CreateLogisticFinanceConsignorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.consignor.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceConsignorResponse());
    }

    /**
     * Description: 物流金融平台创建无车承运平台DIS
     * Summary: 物流金融平台创建无车承运平台DIS
     */
    public CreateLogisticFinancePlatformResponse createLogisticFinancePlatform(CreateLogisticFinancePlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinancePlatformEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台创建无车承运平台DIS
     * Summary: 物流金融平台创建无车承运平台DIS
     */
    public CreateLogisticFinancePlatformResponse createLogisticFinancePlatformEx(CreateLogisticFinancePlatformRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.platform.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinancePlatformResponse());
    }

    /**
     * Description: 物流金融平台代理创建无车承运平台DIS
     * Summary: 物流金融平台代理创建无车承运平台DIS
     */
    public CreateLogistFinanceAgentplatformResponse createLogistFinanceAgentplatform(CreateLogistFinanceAgentplatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogistFinanceAgentplatformEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台代理创建无车承运平台DIS
     * Summary: 物流金融平台代理创建无车承运平台DIS
     */
    public CreateLogistFinanceAgentplatformResponse createLogistFinanceAgentplatformEx(CreateLogistFinanceAgentplatformRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logist.finance.agentplatform.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogistFinanceAgentplatformResponse());
    }

    /**
     * Description: 物流金融平台创建司机DIS
     * Summary: 物流金融平台创建司机DIS
     */
    public CreateLogisticFinanceDriverResponse createLogisticFinanceDriver(CreateLogisticFinanceDriverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceDriverEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台创建司机DIS
     * Summary: 物流金融平台创建司机DIS
     */
    public CreateLogisticFinanceDriverResponse createLogisticFinanceDriverEx(CreateLogisticFinanceDriverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.driver.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceDriverResponse());
    }

    /**
     * Description: 物流金融平台创建货源订单
     * Summary: 物流金融平台创建货源订单
     */
    public CreateLogisticFinanceCargoorderResponse createLogisticFinanceCargoorder(CreateLogisticFinanceCargoorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceCargoorderEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台创建货源订单
     * Summary: 物流金融平台创建货源订单
     */
    public CreateLogisticFinanceCargoorderResponse createLogisticFinanceCargoorderEx(CreateLogisticFinanceCargoorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.cargoorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceCargoorderResponse());
    }

    /**
     * Description: 物流金融平台货源支付订单创建
     * Summary: 物流金融平台货源支付订单创建
     */
    public CreateLogisticFinanceCargopayorderResponse createLogisticFinanceCargopayorder(CreateLogisticFinanceCargopayorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogisticFinanceCargopayorderEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融平台货源支付订单创建
     * Summary: 物流金融平台货源支付订单创建
     */
    public CreateLogisticFinanceCargopayorderResponse createLogisticFinanceCargopayorderEx(CreateLogisticFinanceCargopayorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.logistic.finance.cargopayorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLogisticFinanceCargopayorderResponse());
    }

    /**
     * Description: 创建蚂蚁区块链实例
     * Summary: 创建蚂蚁区块链实例
     */
    public CreateOcpProductResponse createOcpProduct(CreateOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 创建蚂蚁区块链实例
     * Summary: 创建蚂蚁区块链实例
     */
    public CreateOcpProductResponse createOcpProductEx(CreateOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOcpProductResponse());
    }

    /**
     * Description: 变配，对已有的实例进行规格变更操作。
     * Summary: 对已有的实例进行规格变更操作
     */
    public UpdateOcpProductResponse updateOcpProduct(UpdateOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 变配，对已有的实例进行规格变更操作。
     * Summary: 对已有的实例进行规格变更操作
     */
    public UpdateOcpProductResponse updateOcpProductEx(UpdateOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateOcpProductResponse());
    }

    /**
     * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
     * Summary: 释放资源
     */
    public CloseOcpProductResponse closeOcpProduct(CloseOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
     * Summary: 释放资源
     */
    public CloseOcpProductResponse closeOcpProductEx(CloseOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseOcpProductResponse());
    }

    /**
     * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
     * Summary: 恢复资源
     */
    public EnableOcpProductResponse enableOcpProduct(EnableOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
     * Summary: 恢复资源
     */
    public EnableOcpProductResponse enableOcpProductEx(EnableOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableOcpProductResponse());
    }

    /**
     * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
     * Summary: 停止服务
     */
    public StopOcpProductResponse stopOcpProduct(StopOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
     * Summary: 停止服务
     */
    public StopOcpProductResponse stopOcpProductEx(StopOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopOcpProductResponse());
    }

    /**
     * Description: 售卖页面加载产品个性化内容，比如：类目、库存等，用于辅助用户选择。用户下单后参数会下发给产品方
     * Summary: 加载售卖页自定义参数
     */
    public InitOcpProductResponse initOcpProduct(InitOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 售卖页面加载产品个性化内容，比如：类目、库存等，用于辅助用户选择。用户下单后参数会下发给产品方
     * Summary: 加载售卖页自定义参数
     */
    public InitOcpProductResponse initOcpProductEx(InitOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitOcpProductResponse());
    }

    /**
     * Description: 查询商业化产品的状态
     * Summary: 查询商业化产品的状态
     */
    public QueryOcpProductResponse queryOcpProduct(QueryOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 查询商业化产品的状态
     * Summary: 查询商业化产品的状态
     */
    public QueryOcpProductResponse queryOcpProductEx(QueryOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOcpProductResponse());
    }

    /**
     * Description: 开通商业化服务
     * Summary: 开通商业化服务
     */
    public OpenOcpProductResponse openOcpProduct(OpenOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 开通商业化服务
     * Summary: 开通商业化服务
     */
    public OpenOcpProductResponse openOcpProductEx(OpenOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenOcpProductResponse());
    }

    /**
     * Description: 创建商业化产品实例
     * Summary: 创建商业化产品实例
     */
    public CreateOcpProductsResponse createOcpProducts(CreateOcpProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOcpProductsEx(request, headers, runtime);
    }

    /**
     * Description: 创建商业化产品实例
     * Summary: 创建商业化产品实例
     */
    public CreateOcpProductsResponse createOcpProductsEx(CreateOcpProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.products.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOcpProductsResponse());
    }

    /**
     * Description: 回调接口，产品侧主动通知ocp，产品状态变更。
     * Summary: 主动通知ocp，产品状态变更
     */
    public CallbackOcpProductResponse callbackOcpProduct(CallbackOcpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackOcpProductEx(request, headers, runtime);
    }

    /**
     * Description: 回调接口，产品侧主动通知ocp，产品状态变更。
     * Summary: 主动通知ocp，产品状态变更
     */
    public CallbackOcpProductResponse callbackOcpProductEx(CallbackOcpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.product.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackOcpProductResponse());
    }

    /**
     * Description: 检查任务状态
     * Summary: 检查任务状态
     */
    public CheckOcpTaskResponse checkOcpTask(CheckOcpTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkOcpTaskEx(request, headers, runtime);
    }

    /**
     * Description: 检查任务状态
     * Summary: 检查任务状态
     */
    public CheckOcpTaskResponse checkOcpTaskEx(CheckOcpTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.task.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckOcpTaskResponse());
    }

    /**
     * Description: 商业化产品相关任务下发
     * Summary: 任务下发
     */
    public ExecOcpTaskResponse execOcpTask(ExecOcpTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execOcpTaskEx(request, headers, runtime);
    }

    /**
     * Description: 商业化产品相关任务下发
     * Summary: 任务下发
     */
    public ExecOcpTaskResponse execOcpTaskEx(ExecOcpTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ocp.task.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecOcpTaskResponse());
    }

    /**
     * Description: 区块链实例创建（内部）
     * Summary: 区块链创建（内部）
     */
    public CreateBlockchainInstanceInnerResponse createBlockchainInstanceInner(CreateBlockchainInstanceInnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainInstanceInnerEx(request, headers, runtime);
    }

    /**
     * Description: 区块链实例创建（内部）
     * Summary: 区块链创建（内部）
     */
    public CreateBlockchainInstanceInnerResponse createBlockchainInstanceInnerEx(CreateBlockchainInstanceInnerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.instance.inner.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainInstanceInnerResponse());
    }

    /**
     * Description: 蚂蚁区块链通过实例查询链id
     * Summary: 蚂蚁区块链通过实例查询链id
     */
    public QueryBlockchainInstanceBizidResponse queryBlockchainInstanceBizid(QueryBlockchainInstanceBizidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainInstanceBizidEx(request, headers, runtime);
    }

    /**
     * Description: 蚂蚁区块链通过实例查询链id
     * Summary: 蚂蚁区块链通过实例查询链id
     */
    public QueryBlockchainInstanceBizidResponse queryBlockchainInstanceBizidEx(QueryBlockchainInstanceBizidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.instance.bizid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainInstanceBizidResponse());
    }

    /**
     * Description: 创建联盟接口
     * Summary: 创建联盟接口
     */
    public CreateApiConsortiumResponse createApiConsortium(CreateApiConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiConsortiumEx(request, headers, runtime);
    }

    /**
     * Description: 创建联盟接口
     * Summary: 创建联盟接口
     */
    public CreateApiConsortiumResponse createApiConsortiumEx(CreateApiConsortiumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.api.consortium.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiConsortiumResponse());
    }

    /**
     * Description: 查询链的小程序浏览器授权状态
     * Summary: 查询链的小程序浏览器授权状态
     */
    public QueryApiMiniappbrowserAuthtypeResponse queryApiMiniappbrowserAuthtype(QueryApiMiniappbrowserAuthtypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiMiniappbrowserAuthtypeEx(request, headers, runtime);
    }

    /**
     * Description: 查询链的小程序浏览器授权状态
     * Summary: 查询链的小程序浏览器授权状态
     */
    public QueryApiMiniappbrowserAuthtypeResponse queryApiMiniappbrowserAuthtypeEx(QueryApiMiniappbrowserAuthtypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.api.miniappbrowser.authtype.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiMiniappbrowserAuthtypeResponse());
    }

    /**
     * Description: 查询某链当前块高
     * Summary: 查询某链当前块高
     */
    public QueryStatisticsPortHeightResponse queryStatisticsPortHeight(QueryStatisticsPortHeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStatisticsPortHeightEx(request, headers, runtime);
    }

    /**
     * Description: 查询某链当前块高
     * Summary: 查询某链当前块高
     */
    public QueryStatisticsPortHeightResponse queryStatisticsPortHeightEx(QueryStatisticsPortHeightRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.statistics.port.height.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStatisticsPortHeightResponse());
    }

    /**
     * Description: 查询授权的链id列表
     * Summary: 查询授权的链id列表
     */
    public QueryStatisticPortBizidResponse queryStatisticPortBizid(QueryStatisticPortBizidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStatisticPortBizidEx(request, headers, runtime);
    }

    /**
     * Description: 查询授权的链id列表
     * Summary: 查询授权的链id列表
     */
    public QueryStatisticPortBizidResponse queryStatisticPortBizidEx(QueryStatisticPortBizidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.statistic.port.bizid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStatisticPortBizidResponse());
    }

    /**
     * Description: 添加存量采集任务
     * Summary: 添加存量采集任务
     */
    public AddStatisticsPortTaskResponse addStatisticsPortTask(AddStatisticsPortTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addStatisticsPortTaskEx(request, headers, runtime);
    }

    /**
     * Description: 添加存量采集任务
     * Summary: 添加存量采集任务
     */
    public AddStatisticsPortTaskResponse addStatisticsPortTaskEx(AddStatisticsPortTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.statistics.port.task.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddStatisticsPortTaskResponse());
    }

    /**
     * Description: 查询交易列表
     * Summary: 查询交易列表
     */
    public QueryApiDwhTransactionResponse queryApiDwhTransaction(QueryApiDwhTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiDwhTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 查询交易列表
     * Summary: 查询交易列表
     */
    public QueryApiDwhTransactionResponse queryApiDwhTransactionEx(QueryApiDwhTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.api.dwh.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiDwhTransactionResponse());
    }

    /**
     * Description: 根据自定义条件查询用户列表
     * Summary: 查询账户列表
     */
    public QueryApiDwhAccountResponse queryApiDwhAccount(QueryApiDwhAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiDwhAccountEx(request, headers, runtime);
    }

    /**
     * Description: 根据自定义条件查询用户列表
     * Summary: 查询账户列表
     */
    public QueryApiDwhAccountResponse queryApiDwhAccountEx(QueryApiDwhAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.api.dwh.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiDwhAccountResponse());
    }

    /**
     * Description: 查询合约接口
     * Summary: 查询合约
     */
    public QueryApiDwhContractResponse queryApiDwhContract(QueryApiDwhContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiDwhContractEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约接口
     * Summary: 查询合约
     */
    public QueryApiDwhContractResponse queryApiDwhContractEx(QueryApiDwhContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.api.dwh.contract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiDwhContractResponse());
    }

    /**
     * Description: 单独查询交易
     * Summary: 查询链上交易
     */
    public QueryApiDwhbTransactionResponse queryApiDwhbTransaction(QueryApiDwhbTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiDwhbTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 单独查询交易
     * Summary: 查询链上交易
     */
    public QueryApiDwhbTransactionResponse queryApiDwhbTransactionEx(QueryApiDwhbTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.api.dwhb.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiDwhbTransactionResponse());
    }

    /**
     * Description: 删除合约
     * Summary: 删除合约
     */
    public DeleteCaasContractServiceResponse deleteCaasContractService(DeleteCaasContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCaasContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 删除合约
     * Summary: 删除合约
     */
    public DeleteCaasContractServiceResponse deleteCaasContractServiceEx(DeleteCaasContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.service.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCaasContractServiceResponse());
    }

    /**
     * Description: 新建合约服务
     * Summary: 新建合约服务
     */
    public CreateCaasContractServiceResponse createCaasContractService(CreateCaasContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCaasContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 新建合约服务
     * Summary: 新建合约服务
     */
    public CreateCaasContractServiceResponse createCaasContractServiceEx(CreateCaasContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.service.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCaasContractServiceResponse());
    }

    /**
     * Description: 合约列表查询
     * Summary: 合约列表查询
     */
    public PagequeryCaasContractServiceResponse pagequeryCaasContractService(PagequeryCaasContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryCaasContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 合约列表查询
     * Summary: 合约列表查询
     */
    public PagequeryCaasContractServiceResponse pagequeryCaasContractServiceEx(PagequeryCaasContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.service.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryCaasContractServiceResponse());
    }

    /**
     * Description: 查询创建实例进度
     * Summary: 查询创建实例进度
     */
    public QueryCaasContractServiceResponse queryCaasContractService(QueryCaasContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCaasContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 查询创建实例进度
     * Summary: 查询创建实例进度
     */
    public QueryCaasContractServiceResponse queryCaasContractServiceEx(QueryCaasContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.service.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCaasContractServiceResponse());
    }

    /**
     * Description: 自动化部署合约服务
     * Summary: 自动化部署合约服务
     */
    public DeployCaasContractServiceResponse deployCaasContractService(DeployCaasContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployCaasContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 自动化部署合约服务
     * Summary: 自动化部署合约服务
     */
    public DeployCaasContractServiceResponse deployCaasContractServiceEx(DeployCaasContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.service.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployCaasContractServiceResponse());
    }

    /**
     * Description: 查询合约类型列表
     * Summary: 查询合约类型列表
     */
    public ListCaasContractServiceResponse listCaasContractService(ListCaasContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCaasContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约类型列表
     * Summary: 查询合约类型列表
     */
    public ListCaasContractServiceResponse listCaasContractServiceEx(ListCaasContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.service.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCaasContractServiceResponse());
    }

    /**
     * Description: 合约详情
     * Summary: 合约详情
     */
    public DetailCaasContractServiceResponse detailCaasContractService(DetailCaasContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailCaasContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 合约详情
     * Summary: 合约详情
     */
    public DetailCaasContractServiceResponse detailCaasContractServiceEx(DetailCaasContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.service.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailCaasContractServiceResponse());
    }

    /**
     * Description: 新建应用
     * Summary: 新建应用
     */
    public CreateCaasApplicationManageResponse createCaasApplicationManage(CreateCaasApplicationManageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCaasApplicationManageEx(request, headers, runtime);
    }

    /**
     * Description: 新建应用
     * Summary: 新建应用
     */
    public CreateCaasApplicationManageResponse createCaasApplicationManageEx(CreateCaasApplicationManageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.application.manage.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCaasApplicationManageResponse());
    }

    /**
     * Description: 应用列表查询
     * Summary: 应用列表查询
     */
    public PagequeryCaasApplicationManageResponse pagequeryCaasApplicationManage(PagequeryCaasApplicationManageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryCaasApplicationManageEx(request, headers, runtime);
    }

    /**
     * Description: 应用列表查询
     * Summary: 应用列表查询
     */
    public PagequeryCaasApplicationManageResponse pagequeryCaasApplicationManageEx(PagequeryCaasApplicationManageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.application.manage.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryCaasApplicationManageResponse());
    }

    /**
     * Description: 查询合约绑定关系
     * Summary: 查询合约绑定关系
     */
    public QueryCaasApplicationManageResponse queryCaasApplicationManage(QueryCaasApplicationManageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCaasApplicationManageEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约绑定关系
     * Summary: 查询合约绑定关系
     */
    public QueryCaasApplicationManageResponse queryCaasApplicationManageEx(QueryCaasApplicationManageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.application.manage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCaasApplicationManageResponse());
    }

    /**
     * Description: 解除授权
     * Summary: 解除授权
     */
    public UnbindCaasApplicationManageResponse unbindCaasApplicationManage(UnbindCaasApplicationManageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindCaasApplicationManageEx(request, headers, runtime);
    }

    /**
     * Description: 解除授权
     * Summary: 解除授权
     */
    public UnbindCaasApplicationManageResponse unbindCaasApplicationManageEx(UnbindCaasApplicationManageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.application.manage.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindCaasApplicationManageResponse());
    }

    /**
     * Description: 绑定合约
     * Summary: 绑定合约
     */
    public BindCaasApplicationManageResponse bindCaasApplicationManage(BindCaasApplicationManageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindCaasApplicationManageEx(request, headers, runtime);
    }

    /**
     * Description: 绑定合约
     * Summary: 绑定合约
     */
    public BindCaasApplicationManageResponse bindCaasApplicationManageEx(BindCaasApplicationManageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.application.manage.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindCaasApplicationManageResponse());
    }

    /**
     * Description: 查看sk
     * Summary: 查看sk
     */
    public GetCaasApplicationManageResponse getCaasApplicationManage(GetCaasApplicationManageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCaasApplicationManageEx(request, headers, runtime);
    }

    /**
     * Description: 查看sk
     * Summary: 查看sk
     */
    public GetCaasApplicationManageResponse getCaasApplicationManageEx(GetCaasApplicationManageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.application.manage.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCaasApplicationManageResponse());
    }

    /**
     * Description: 智能合约市场列表查询
     * Summary: 智能合约市场列表查询
     */
    public PagequeryCaasContractMarketResponse pagequeryCaasContractMarket(PagequeryCaasContractMarketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryCaasContractMarketEx(request, headers, runtime);
    }

    /**
     * Description: 智能合约市场列表查询
     * Summary: 智能合约市场列表查询
     */
    public PagequeryCaasContractMarketResponse pagequeryCaasContractMarketEx(PagequeryCaasContractMarketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.caas.contract.market.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryCaasContractMarketResponse());
    }

    /**
     * Description: 合约部署记录
     * Summary: 合约部署记录
     */
    public CreateContractRecordResponse createContractRecord(CreateContractRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractRecordEx(request, headers, runtime);
    }

    /**
     * Description: 合约部署记录
     * Summary: 合约部署记录
     */
    public CreateContractRecordResponse createContractRecordEx(CreateContractRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.record.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractRecordResponse());
    }

    /**
     * Description: 部署记录详情
     * Summary: 部署记录详情
     */
    public GetContractRecordResponse getContractRecord(GetContractRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractRecordEx(request, headers, runtime);
    }

    /**
     * Description: 部署记录详情
     * Summary: 部署记录详情
     */
    public GetContractRecordResponse getContractRecordEx(GetContractRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.record.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractRecordResponse());
    }

    /**
     * Description: 合约升级更新
     * Summary: 合约升级更新
     */
    public UpdateContractRecordResponse updateContractRecord(UpdateContractRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractRecordEx(request, headers, runtime);
    }

    /**
     * Description: 合约升级更新
     * Summary: 合约升级更新
     */
    public UpdateContractRecordResponse updateContractRecordEx(UpdateContractRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.record.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractRecordResponse());
    }

    /**
     * Description: 发布合约服务
     * Summary: 发布合约服务
     */
    public OnlineContractRecordResponse onlineContractRecord(OnlineContractRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineContractRecordEx(request, headers, runtime);
    }

    /**
     * Description: 发布合约服务
     * Summary: 发布合约服务
     */
    public OnlineContractRecordResponse onlineContractRecordEx(OnlineContractRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.record.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineContractRecordResponse());
    }

    /**
     * Description: 合约服务下线
     * Summary: 合约服务下线
     */
    public OfflineContractRecordResponse offlineContractRecord(OfflineContractRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineContractRecordEx(request, headers, runtime);
    }

    /**
     * Description: 合约服务下线
     * Summary: 合约服务下线
     */
    public OfflineContractRecordResponse offlineContractRecordEx(OfflineContractRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.record.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineContractRecordResponse());
    }

    /**
     * Description: 查询合约部署记录
     * Summary: 查询合约部署记录
     */
    public QueryContractRecordResponse queryContractRecord(QueryContractRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractRecordEx(request, headers, runtime);
    }

    /**
     * Description: 查询合约部署记录
     * Summary: 查询合约部署记录
     */
    public QueryContractRecordResponse queryContractRecordEx(QueryContractRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.record.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractRecordResponse());
    }

    /**
     * Description: 合约代理调用
     * Summary: 合约代理调用
     */
    public ExecContractDelegateResponse execContractDelegate(ExecContractDelegateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractDelegateEx(request, headers, runtime);
    }

    /**
     * Description: 合约代理调用
     * Summary: 合约代理调用
     */
    public ExecContractDelegateResponse execContractDelegateEx(ExecContractDelegateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.delegate.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractDelegateResponse());
    }

    /**
     * Description: 调用合约服务
     * Summary: 调用合约服务
     */
    public ExecContractServiceResponse execContractService(ExecContractServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractServiceEx(request, headers, runtime);
    }

    /**
     * Description: 调用合约服务
     * Summary: 调用合约服务
     */
    public ExecContractServiceResponse execContractServiceEx(ExecContractServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.service.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractServiceResponse());
    }

    /**
     * Description: 获取当前租户具有访问权限的合约链配置列表，方便在client（IDE插件、SDK等）访问合约链
     * Summary: 获取合约链配置
     */
    public GetContractConfigChainResponse getContractConfigChain(GetContractConfigChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractConfigChainEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前租户具有访问权限的合约链配置列表，方便在client（IDE插件、SDK等）访问合约链
     * Summary: 获取合约链配置
     */
    public GetContractConfigChainResponse getContractConfigChainEx(GetContractConfigChainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.config.chain.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractConfigChainResponse());
    }

    /**
     * Description: 申请获取一个可以上传文件到oss的url，此url可用时间默认为30秒
     * Summary: 获取oss的可用url上传文件
     */
    public GetContractAbiUrlResponse getContractAbiUrl(GetContractAbiUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractAbiUrlEx(request, headers, runtime);
    }

    /**
     * Description: 申请获取一个可以上传文件到oss的url，此url可用时间默认为30秒
     * Summary: 获取oss的可用url上传文件
     */
    public GetContractAbiUrlResponse getContractAbiUrlEx(GetContractAbiUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.abi.url.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractAbiUrlResponse());
    }

    /**
     * Description: 申请获取一个可以上传bytecode文件到oss的url，此url可用时间默认为30秒
     * Summary: 获取oss的可用url上传文件
     */
    public GetContractBytecodeUrlResponse getContractBytecodeUrl(GetContractBytecodeUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractBytecodeUrlEx(request, headers, runtime);
    }

    /**
     * Description: 申请获取一个可以上传bytecode文件到oss的url，此url可用时间默认为30秒
     * Summary: 获取oss的可用url上传文件
     */
    public GetContractBytecodeUrlResponse getContractBytecodeUrlEx(GetContractBytecodeUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.contract.bytecode.url.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractBytecodeUrlResponse());
    }

    /**
     * Description: 上传批量查询数据文件
     * Summary: 上传批量查询数据文件
     */
    public UploadDataFileBatchqueryResponse uploadDataFileBatchquery(UploadDataFileBatchqueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDataFileBatchqueryEx(request, headers, runtime);
    }

    /**
     * Description: 上传批量查询数据文件
     * Summary: 上传批量查询数据文件
     */
    public UploadDataFileBatchqueryResponse uploadDataFileBatchqueryEx(UploadDataFileBatchqueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "baas.data.file.batchquery.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadDataFileBatchqueryResponse uploadDataFileBatchqueryResponse = UploadDataFileBatchqueryResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadDataFileBatchqueryResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.data.file.batchquery.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadDataFileBatchqueryResponse());
    }

    /**
     * Description: 获取查询数据集任务结果
     * Summary: 获取查询数据集任务结果
     */
    public QueryDataResultBatchqueryResponse queryDataResultBatchquery(QueryDataResultBatchqueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataResultBatchqueryEx(request, headers, runtime);
    }

    /**
     * Description: 获取查询数据集任务结果
     * Summary: 获取查询数据集任务结果
     */
    public QueryDataResultBatchqueryResponse queryDataResultBatchqueryEx(QueryDataResultBatchqueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.data.result.batchquery.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataResultBatchqueryResponse());
    }

    /**
     * Description: 数据授权服务创建参与方
     * Summary: 数据授权服务创建参与方
     */
    public CreateDataauthorizationParticipantResponse createDataauthorizationParticipant(CreateDataauthorizationParticipantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationParticipantEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务创建参与方
     * Summary: 数据授权服务创建参与方
     */
    public CreateDataauthorizationParticipantResponse createDataauthorizationParticipantEx(CreateDataauthorizationParticipantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.participant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationParticipantResponse());
    }

    /**
     * Description: 数据授权服务删除参与方
     * Summary: 数据授权服务删除参与方
     */
    public DeleteDataauthorizationParticipantResponse deleteDataauthorizationParticipant(DeleteDataauthorizationParticipantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataauthorizationParticipantEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务删除参与方
     * Summary: 数据授权服务删除参与方
     */
    public DeleteDataauthorizationParticipantResponse deleteDataauthorizationParticipantEx(DeleteDataauthorizationParticipantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.participant.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDataauthorizationParticipantResponse());
    }

    /**
     * Description: 数据授权服务修改用户信息
     * Summary: 数据授权服务修改用户信息
     */
    public UpdateDataauthorizationParticipantResponse updateDataauthorizationParticipant(UpdateDataauthorizationParticipantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataauthorizationParticipantEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务修改用户信息
     * Summary: 数据授权服务修改用户信息
     */
    public UpdateDataauthorizationParticipantResponse updateDataauthorizationParticipantEx(UpdateDataauthorizationParticipantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.participant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDataauthorizationParticipantResponse());
    }

    /**
     * Description: 数据授权服务查询参与方信息
     * Summary: 数据授权服务查询参与方信息
     */
    public QueryDataauthorizationParticipantResponse queryDataauthorizationParticipant(QueryDataauthorizationParticipantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataauthorizationParticipantEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务查询参与方信息
     * Summary: 数据授权服务查询参与方信息
     */
    public QueryDataauthorizationParticipantResponse queryDataauthorizationParticipantEx(QueryDataauthorizationParticipantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.participant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataauthorizationParticipantResponse());
    }

    /**
     * Description: 数据授权服务根据角色获取用户列表
     * Summary: 数据授权服务根据角色获取用户列表
     */
    public ListDataauthorizationParticipantResponse listDataauthorizationParticipant(ListDataauthorizationParticipantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationParticipantEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务根据角色获取用户列表
     * Summary: 数据授权服务根据角色获取用户列表
     */
    public ListDataauthorizationParticipantResponse listDataauthorizationParticipantEx(ListDataauthorizationParticipantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.participant.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationParticipantResponse());
    }

    /**
     * Description: 数据授权服务创建数据目录
     * Summary: 数据授权服务创建数据目录
     */
    public CreateDataauthorizationDataEntityResponse createDataauthorizationDataEntity(CreateDataauthorizationDataEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationDataEntityEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务创建数据目录
     * Summary: 数据授权服务创建数据目录
     */
    public CreateDataauthorizationDataEntityResponse createDataauthorizationDataEntityEx(CreateDataauthorizationDataEntityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.entity.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationDataEntityResponse());
    }

    /**
     * Description: 数据授权服务查询数据目录
     * Summary: 数据授权服务查询数据目录
     */
    public QueryDataauthorizationDataEntityResponse queryDataauthorizationDataEntity(QueryDataauthorizationDataEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataauthorizationDataEntityEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务查询数据目录
     * Summary: 数据授权服务查询数据目录
     */
    public QueryDataauthorizationDataEntityResponse queryDataauthorizationDataEntityEx(QueryDataauthorizationDataEntityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.entity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataauthorizationDataEntityResponse());
    }

    /**
     * Description: 数据授权服务公钥矩阵更新
     * Summary: 数据授权服务公钥矩阵更新
     */
    public UpdateDataauthorizationPublicKeyResponse updateDataauthorizationPublicKey(UpdateDataauthorizationPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataauthorizationPublicKeyEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务公钥矩阵更新
     * Summary: 数据授权服务公钥矩阵更新
     */
    public UpdateDataauthorizationPublicKeyResponse updateDataauthorizationPublicKeyEx(UpdateDataauthorizationPublicKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.public.key.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDataauthorizationPublicKeyResponse());
    }

    /**
     * Description: 数据授权服务公钥矩阵查询
     * Summary: 数据授权服务公钥矩阵查询
     */
    public ListDataauthorizationPublicKeyResponse listDataauthorizationPublicKey(ListDataauthorizationPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationPublicKeyEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务公钥矩阵查询
     * Summary: 数据授权服务公钥矩阵查询
     */
    public ListDataauthorizationPublicKeyResponse listDataauthorizationPublicKeyEx(ListDataauthorizationPublicKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.public.key.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationPublicKeyResponse());
    }

    /**
     * Description: 数据授权服务开通服务
     * Summary: 数据授权服务开通服务
     */
    public OpenDataauthorizationAuthorizationServiceResponse openDataauthorizationAuthorizationService(OpenDataauthorizationAuthorizationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openDataauthorizationAuthorizationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务开通服务
     * Summary: 数据授权服务开通服务
     */
    public OpenDataauthorizationAuthorizationServiceResponse openDataauthorizationAuthorizationServiceEx(OpenDataauthorizationAuthorizationServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.service.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenDataauthorizationAuthorizationServiceResponse());
    }

    /**
     * Description: 数据授权服务关闭租户服务
     * Summary: 数据授权服务关闭租户服务
     */
    public CloseDataauthorizationAuthorizationServiceResponse closeDataauthorizationAuthorizationService(CloseDataauthorizationAuthorizationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeDataauthorizationAuthorizationServiceEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务关闭租户服务
     * Summary: 数据授权服务关闭租户服务
     */
    public CloseDataauthorizationAuthorizationServiceResponse closeDataauthorizationAuthorizationServiceEx(CloseDataauthorizationAuthorizationServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.service.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseDataauthorizationAuthorizationServiceResponse());
    }

    /**
     * Description: 数据授权服务申请权限
     * Summary: 数据授权服务申请权限
     */
    public ApplyDataauthorizationAuthorizationResponse applyDataauthorizationAuthorization(ApplyDataauthorizationAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDataauthorizationAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务申请权限
     * Summary: 数据授权服务申请权限
     */
    public ApplyDataauthorizationAuthorizationResponse applyDataauthorizationAuthorizationEx(ApplyDataauthorizationAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDataauthorizationAuthorizationResponse());
    }

    /**
     * Description: 数据授权服务流程步骤处理
     * Summary: 数据授权服务流程步骤处理
     */
    public ExecDataauthorizationProcessResponse execDataauthorizationProcess(ExecDataauthorizationProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataauthorizationProcessEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务流程步骤处理
     * Summary: 数据授权服务流程步骤处理
     */
    public ExecDataauthorizationProcessResponse execDataauthorizationProcessEx(ExecDataauthorizationProcessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.process.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDataauthorizationProcessResponse());
    }

    /**
     * Description: 数据授权服务取消授权
     * Summary: 数据授权服务取消授权
     */
    public CancelDataauthorizationAuthorizationResponse cancelDataauthorizationAuthorization(CancelDataauthorizationAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDataauthorizationAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务取消授权
     * Summary: 数据授权服务取消授权
     */
    public CancelDataauthorizationAuthorizationResponse cancelDataauthorizationAuthorizationEx(CancelDataauthorizationAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDataauthorizationAuthorizationResponse());
    }

    /**
     * Description: 数据授权服务权限校验
     * Summary: 数据授权服务权限校验
     */
    public CheckDataauthorizationAuthorizationResponse checkDataauthorizationAuthorization(CheckDataauthorizationAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkDataauthorizationAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务权限校验
     * Summary: 数据授权服务权限校验
     */
    public CheckDataauthorizationAuthorizationResponse checkDataauthorizationAuthorizationEx(CheckDataauthorizationAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckDataauthorizationAuthorizationResponse());
    }

    /**
     * Description: 数据授权服务流程信息查询
     * Summary: 数据授权服务流程信息查询
     */
    public QueryDataauthorizationProcessResponse queryDataauthorizationProcess(QueryDataauthorizationProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataauthorizationProcessEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务流程信息查询
     * Summary: 数据授权服务流程信息查询
     */
    public QueryDataauthorizationProcessResponse queryDataauthorizationProcessEx(QueryDataauthorizationProcessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.process.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataauthorizationProcessResponse());
    }

    /**
     * Description: 数据授权服务存证数据上链
     * Summary: 数据授权服务存证数据上链
     */
    public SendDataauthorizationDepositDataResponse sendDataauthorizationDepositData(SendDataauthorizationDepositDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDataauthorizationDepositDataEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务存证数据上链
     * Summary: 数据授权服务存证数据上链
     */
    public SendDataauthorizationDepositDataResponse sendDataauthorizationDepositDataEx(SendDataauthorizationDepositDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.deposit.data.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendDataauthorizationDepositDataResponse());
    }

    /**
     * Description: 数据授权服务查询存证数据
     * Summary: 数据授权服务查询存证数据
     */
    public QueryDataauthorizationDepositDataResponse queryDataauthorizationDepositData(QueryDataauthorizationDepositDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataauthorizationDepositDataEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务查询存证数据
     * Summary: 数据授权服务查询存证数据
     */
    public QueryDataauthorizationDepositDataResponse queryDataauthorizationDepositDataEx(QueryDataauthorizationDepositDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.deposit.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataauthorizationDepositDataResponse());
    }

    /**
     * Description: 数据授权服务恢复权限
     * Summary: 数据授权服务恢复权限
     */
    public ResumeDataauthorizationAuthorizationResponse resumeDataauthorizationAuthorization(ResumeDataauthorizationAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeDataauthorizationAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务恢复权限
     * Summary: 数据授权服务恢复权限
     */
    public ResumeDataauthorizationAuthorizationResponse resumeDataauthorizationAuthorizationEx(ResumeDataauthorizationAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeDataauthorizationAuthorizationResponse());
    }

    /**
     * Description: 数据授权服务更新数据信息
     * Summary: 数据授权服务更新数据信息
     */
    public UpdateDataauthorizationDataEntityResponse updateDataauthorizationDataEntity(UpdateDataauthorizationDataEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataauthorizationDataEntityEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务更新数据信息
     * Summary: 数据授权服务更新数据信息
     */
    public UpdateDataauthorizationDataEntityResponse updateDataauthorizationDataEntityEx(UpdateDataauthorizationDataEntityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.entity.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDataauthorizationDataEntityResponse());
    }

    /**
     * Description: 数据授权服务删除数据对象
     * Summary: 数据授权服务删除数据对象
     */
    public DeleteDataauthorizationDataEntityResponse deleteDataauthorizationDataEntity(DeleteDataauthorizationDataEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataauthorizationDataEntityEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务删除数据对象
     * Summary: 数据授权服务删除数据对象
     */
    public DeleteDataauthorizationDataEntityResponse deleteDataauthorizationDataEntityEx(DeleteDataauthorizationDataEntityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.entity.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDataauthorizationDataEntityResponse());
    }

    /**
     * Description: 数据授权服务创建自定义ID用户
     * Summary: 数据授权服务创建自定义ID用户
     */
    public CreateDataauthorizationCustomParticipantResponse createDataauthorizationCustomParticipant(CreateDataauthorizationCustomParticipantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationCustomParticipantEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务创建自定义ID用户
     * Summary: 数据授权服务创建自定义ID用户
     */
    public CreateDataauthorizationCustomParticipantResponse createDataauthorizationCustomParticipantEx(CreateDataauthorizationCustomParticipantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.custom.participant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationCustomParticipantResponse());
    }

    /**
     * Description: 数据授权服务创建自定义ID数据对象
     * Summary: 数据授权服务创建自定义ID数据对象
     */
    public CreateDataauthorizationCustomDataResponse createDataauthorizationCustomData(CreateDataauthorizationCustomDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationCustomDataEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务创建自定义ID数据对象
     * Summary: 数据授权服务创建自定义ID数据对象
     */
    public CreateDataauthorizationCustomDataResponse createDataauthorizationCustomDataEx(CreateDataauthorizationCustomDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.custom.data.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationCustomDataResponse());
    }

    /**
     * Description: 数据授权服务申请权限
     * Summary: 数据授权服务申请权限
     */
    public ApplyDataauthorizationAuthorizationWithsignatureResponse applyDataauthorizationAuthorizationWithsignature(ApplyDataauthorizationAuthorizationWithsignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDataauthorizationAuthorizationWithsignatureEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务申请权限
     * Summary: 数据授权服务申请权限
     */
    public ApplyDataauthorizationAuthorizationWithsignatureResponse applyDataauthorizationAuthorizationWithsignatureEx(ApplyDataauthorizationAuthorizationWithsignatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.withsignature.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDataauthorizationAuthorizationWithsignatureResponse());
    }

    /**
     * Description: 数据授权服务流程步骤处理
     * Summary: 数据授权服务流程步骤处理
     */
    public ExecDataauthorizationProcessWithsignatureResponse execDataauthorizationProcessWithsignature(ExecDataauthorizationProcessWithsignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataauthorizationProcessWithsignatureEx(request, headers, runtime);
    }

    /**
     * Description: 数据授权服务流程步骤处理
     * Summary: 数据授权服务流程步骤处理
     */
    public ExecDataauthorizationProcessWithsignatureResponse execDataauthorizationProcessWithsignatureEx(ExecDataauthorizationProcessWithsignatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.process.withsignature.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDataauthorizationProcessWithsignatureResponse());
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型
     */
    public CreateDataauthorizationDataModelResponse createDataauthorizationDataModel(CreateDataauthorizationDataModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationDataModelEx(request, headers, runtime);
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型
     */
    public CreateDataauthorizationDataModelResponse createDataauthorizationDataModelEx(CreateDataauthorizationDataModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.model.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationDataModelResponse());
    }

    /**
     * Description: 数据模型修改
     * Summary: 数据模型修改
     */
    public UpdateDataauthorizationDataModelResponse updateDataauthorizationDataModel(UpdateDataauthorizationDataModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataauthorizationDataModelEx(request, headers, runtime);
    }

    /**
     * Description: 数据模型修改
     * Summary: 数据模型修改
     */
    public UpdateDataauthorizationDataModelResponse updateDataauthorizationDataModelEx(UpdateDataauthorizationDataModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.model.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDataauthorizationDataModelResponse());
    }

    /**
     * Description: 删除数据模型
     * Summary: 删除数据模型
     */
    public DeleteDataauthorizationDataModelResponse deleteDataauthorizationDataModel(DeleteDataauthorizationDataModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataauthorizationDataModelEx(request, headers, runtime);
    }

    /**
     * Description: 删除数据模型
     * Summary: 删除数据模型
     */
    public DeleteDataauthorizationDataModelResponse deleteDataauthorizationDataModelEx(DeleteDataauthorizationDataModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.model.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDataauthorizationDataModelResponse());
    }

    /**
     * Description: 分页查询参与方列表
     * Summary: 分页查询参与方列表
     */
    public ListDataauthorizationParticipantPageResponse listDataauthorizationParticipantPage(ListDataauthorizationParticipantPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationParticipantPageEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询参与方列表
     * Summary: 分页查询参与方列表
     */
    public ListDataauthorizationParticipantPageResponse listDataauthorizationParticipantPageEx(ListDataauthorizationParticipantPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.participant.page.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationParticipantPageResponse());
    }

    /**
     * Description: 查询数据模型
     * Summary: 查询数据模型
     */
    public QueryDataauthorizationDataModelResponse queryDataauthorizationDataModel(QueryDataauthorizationDataModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataauthorizationDataModelEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据模型
     * Summary: 查询数据模型
     */
    public QueryDataauthorizationDataModelResponse queryDataauthorizationDataModelEx(QueryDataauthorizationDataModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.model.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataauthorizationDataModelResponse());
    }

    /**
     * Description: 数据模型分页查询
     * Summary: 数据模型分页查询
     */
    public ListDataauthorizationDatamodelPageResponse listDataauthorizationDatamodelPage(ListDataauthorizationDatamodelPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationDatamodelPageEx(request, headers, runtime);
    }

    /**
     * Description: 数据模型分页查询
     * Summary: 数据模型分页查询
     */
    public ListDataauthorizationDatamodelPageResponse listDataauthorizationDatamodelPageEx(ListDataauthorizationDatamodelPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.datamodel.page.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationDatamodelPageResponse());
    }

    /**
     * Description: 查询可注册的数据模型列表
     * Summary: 查询可注册的数据模型列表
     */
    public ListDataauthorizationAvailableDatamodelResponse listDataauthorizationAvailableDatamodel(ListDataauthorizationAvailableDatamodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationAvailableDatamodelEx(request, headers, runtime);
    }

    /**
     * Description: 查询可注册的数据模型列表
     * Summary: 查询可注册的数据模型列表
     */
    public ListDataauthorizationAvailableDatamodelResponse listDataauthorizationAvailableDatamodelEx(ListDataauthorizationAvailableDatamodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.available.datamodel.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationAvailableDatamodelResponse());
    }

    /**
     * Description: 根据模型名称、授权状态分页查询。
     * Summary: 数据注册情况查询
     */
    public ListDataauthorizationDataentityPageResponse listDataauthorizationDataentityPage(ListDataauthorizationDataentityPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationDataentityPageEx(request, headers, runtime);
    }

    /**
     * Description: 根据模型名称、授权状态分页查询。
     * Summary: 数据注册情况查询
     */
    public ListDataauthorizationDataentityPageResponse listDataauthorizationDataentityPageEx(ListDataauthorizationDataentityPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.dataentity.page.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationDataentityPageResponse());
    }

    /**
     * Description: 直接授权接口
     * Summary: 直接授权接口
     */
    public CreateDataauthorizationDirectAuthorizationResponse createDataauthorizationDirectAuthorization(CreateDataauthorizationDirectAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationDirectAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 直接授权接口
     * Summary: 直接授权接口
     */
    public CreateDataauthorizationDirectAuthorizationResponse createDataauthorizationDirectAuthorizationEx(CreateDataauthorizationDirectAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.direct.authorization.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationDirectAuthorizationResponse());
    }

    /**
     * Description: 授权列表分页查询
     * Summary: 授权列表分页查询
     */
    public ListDataauthorizationAuthorizationPageResponse listDataauthorizationAuthorizationPage(ListDataauthorizationAuthorizationPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationAuthorizationPageEx(request, headers, runtime);
    }

    /**
     * Description: 授权列表分页查询
     * Summary: 授权列表分页查询
     */
    public ListDataauthorizationAuthorizationPageResponse listDataauthorizationAuthorizationPageEx(ListDataauthorizationAuthorizationPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authorization.page.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationAuthorizationPageResponse());
    }

    /**
     * Description: 查询已授权的参与方列表
     * Summary: 查询已授权的参与方列表
     */
    public ListDataauthorizationAuthparticipantPageResponse listDataauthorizationAuthparticipantPage(ListDataauthorizationAuthparticipantPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationAuthparticipantPageEx(request, headers, runtime);
    }

    /**
     * Description: 查询已授权的参与方列表
     * Summary: 查询已授权的参与方列表
     */
    public ListDataauthorizationAuthparticipantPageResponse listDataauthorizationAuthparticipantPageEx(ListDataauthorizationAuthparticipantPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authparticipant.page.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationAuthparticipantPageResponse());
    }

    /**
     * Description: 创建数据资产
     * Summary: 创建数据资产
     */
    public CreateDataauthorizationDataAssertResponse createDataauthorizationDataAssert(CreateDataauthorizationDataAssertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationDataAssertEx(request, headers, runtime);
    }

    /**
     * Description: 创建数据资产
     * Summary: 创建数据资产
     */
    public CreateDataauthorizationDataAssertResponse createDataauthorizationDataAssertEx(CreateDataauthorizationDataAssertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.assert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationDataAssertResponse());
    }

    /**
     * Description: 数据资产更新
     * Summary: 数据资产更新
     */
    public UpdateDataauthorizationDataAssertResponse updateDataauthorizationDataAssert(UpdateDataauthorizationDataAssertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataauthorizationDataAssertEx(request, headers, runtime);
    }

    /**
     * Description: 数据资产更新
     * Summary: 数据资产更新
     */
    public UpdateDataauthorizationDataAssertResponse updateDataauthorizationDataAssertEx(UpdateDataauthorizationDataAssertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.assert.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDataauthorizationDataAssertResponse());
    }

    /**
     * Description: 数据资产删除
     * Summary: 数据资产删除
     */
    public DeleteDataauthorizationDataAssertResponse deleteDataauthorizationDataAssert(DeleteDataauthorizationDataAssertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataauthorizationDataAssertEx(request, headers, runtime);
    }

    /**
     * Description: 数据资产删除
     * Summary: 数据资产删除
     */
    public DeleteDataauthorizationDataAssertResponse deleteDataauthorizationDataAssertEx(DeleteDataauthorizationDataAssertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.data.assert.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDataauthorizationDataAssertResponse());
    }

    /**
     * Description: 授权服务代理授权接口
     * Summary: 代理授权
     */
    public CreateDataauthorizationAgentAuthorizationResponse createDataauthorizationAgentAuthorization(CreateDataauthorizationAgentAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataauthorizationAgentAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 授权服务代理授权接口
     * Summary: 代理授权
     */
    public CreateDataauthorizationAgentAuthorizationResponse createDataauthorizationAgentAuthorizationEx(CreateDataauthorizationAgentAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.agent.authorization.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataauthorizationAgentAuthorizationResponse());
    }

    /**
     * Description:  授权列表相信信息查询
     * Summary:  授权列表相信信息查询
     */
    public ListDataauthorizationAuthorityCertResponse listDataauthorizationAuthorityCert(ListDataauthorizationAuthorityCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataauthorizationAuthorityCertEx(request, headers, runtime);
    }

    /**
     * Description:  授权列表相信信息查询
     * Summary:  授权列表相信信息查询
     */
    public ListDataauthorizationAuthorityCertResponse listDataauthorizationAuthorityCertEx(ListDataauthorizationAuthorityCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.authority.cert.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataauthorizationAuthorityCertResponse());
    }

    /**
     * Description: 同步存证上链接口
     * Summary: 同步存证上链
     */
    public SaveDataauthorizationDepositDataResponse saveDataauthorizationDepositData(SaveDataauthorizationDepositDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveDataauthorizationDepositDataEx(request, headers, runtime);
    }

    /**
     * Description: 同步存证上链接口
     * Summary: 同步存证上链
     */
    public SaveDataauthorizationDepositDataResponse saveDataauthorizationDepositDataEx(SaveDataauthorizationDepositDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.deposit.data.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveDataauthorizationDepositDataResponse());
    }

    /**
     * Description: 启动全量同步
     * Summary: 启动全量同步
     */
    public StartDataauthorizationSyncDataResponse startDataauthorizationSyncData(StartDataauthorizationSyncDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDataauthorizationSyncDataEx(request, headers, runtime);
    }

    /**
     * Description: 启动全量同步
     * Summary: 启动全量同步
     */
    public StartDataauthorizationSyncDataResponse startDataauthorizationSyncDataEx(StartDataauthorizationSyncDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.dataauthorization.sync.data.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDataauthorizationSyncDataResponse());
    }

    /**
     * Description: 通过额交易hash查询，返回hash对应区块链上信息。
     * Summary: 溯源区块查证接口
     */
    public QueryTraceabilityTxCheckResponse queryTraceabilityTxCheck(QueryTraceabilityTxCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceabilityTxCheckEx(request, headers, runtime);
    }

    /**
     * Description: 通过额交易hash查询，返回hash对应区块链上信息。
     * Summary: 溯源区块查证接口
     */
    public QueryTraceabilityTxCheckResponse queryTraceabilityTxCheckEx(QueryTraceabilityTxCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.traceability.tx.check.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceabilityTxCheckResponse());
    }

    /**
     * Description: 通过链id，获取链的相关信息
     * Summary: 获取链信息接口
     */
    public QueryTraceabilityBlockchainInfosResponse queryTraceabilityBlockchainInfos(QueryTraceabilityBlockchainInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceabilityBlockchainInfosEx(request, headers, runtime);
    }

    /**
     * Description: 通过链id，获取链的相关信息
     * Summary: 获取链信息接口
     */
    public QueryTraceabilityBlockchainInfosResponse queryTraceabilityBlockchainInfosEx(QueryTraceabilityBlockchainInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.traceability.blockchain.infos.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTraceabilityBlockchainInfosResponse());
    }

    /**
     * Description: BaaS区块链浏览器添加租户与链的访问权限
     * Summary: BaaS区块链浏览器添加权限
     */
    public SaveBlockchainBrowserPrivilegeResponse saveBlockchainBrowserPrivilege(SaveBlockchainBrowserPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBlockchainBrowserPrivilegeEx(request, headers, runtime);
    }

    /**
     * Description: BaaS区块链浏览器添加租户与链的访问权限
     * Summary: BaaS区块链浏览器添加权限
     */
    public SaveBlockchainBrowserPrivilegeResponse saveBlockchainBrowserPrivilegeEx(SaveBlockchainBrowserPrivilegeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.browser.privilege.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBlockchainBrowserPrivilegeResponse());
    }

    /**
     * Description: 查询租户查看某链的权限
     * Summary: 查询租户查看某链的权限
     */
    public QueryBlockchainBrowserPrivilegeResponse queryBlockchainBrowserPrivilege(QueryBlockchainBrowserPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBrowserPrivilegeEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户查看某链的权限
     * Summary: 查询租户查看某链的权限
     */
    public QueryBlockchainBrowserPrivilegeResponse queryBlockchainBrowserPrivilegeEx(QueryBlockchainBrowserPrivilegeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.browser.privilege.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBrowserPrivilegeResponse());
    }

    /**
     * Description: BaaS区块链浏览器删除租户与链的访问权限
     * Summary: BaaS区块链浏览器添加权限
     */
    public DeleteBlockchainBrowserPrivilegeResponse deleteBlockchainBrowserPrivilege(DeleteBlockchainBrowserPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBrowserPrivilegeEx(request, headers, runtime);
    }

    /**
     * Description: BaaS区块链浏览器删除租户与链的访问权限
     * Summary: BaaS区块链浏览器添加权限
     */
    public DeleteBlockchainBrowserPrivilegeResponse deleteBlockchainBrowserPrivilegeEx(DeleteBlockchainBrowserPrivilegeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.browser.privilege.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBrowserPrivilegeResponse());
    }

    /**
     * Description: 生成蚂蚁区块链的交易二维码
     * Summary: 数科生成蚂蚁区块链的交易二维码
     */
    public GetBlockchainMiniprogramResponse getBlockchainMiniprogram(GetBlockchainMiniprogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBlockchainMiniprogramEx(request, headers, runtime);
    }

    /**
     * Description: 生成蚂蚁区块链的交易二维码
     * Summary: 数科生成蚂蚁区块链的交易二维码
     */
    public GetBlockchainMiniprogramResponse getBlockchainMiniprogramEx(GetBlockchainMiniprogramRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.miniprogram.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBlockchainMiniprogramResponse());
    }

    /**
     * Description: 蚂蚁区块链的链上交易数据查看权限批量添加
     * Summary: 蚂蚁区块链的链上交易数据查看权限批量添加
     */
    public AddBlockchainMiniprogramResponse addBlockchainMiniprogram(AddBlockchainMiniprogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBlockchainMiniprogramEx(request, headers, runtime);
    }

    /**
     * Description: 蚂蚁区块链的链上交易数据查看权限批量添加
     * Summary: 蚂蚁区块链的链上交易数据查看权限批量添加
     */
    public AddBlockchainMiniprogramResponse addBlockchainMiniprogramEx(AddBlockchainMiniprogramRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.miniprogram.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBlockchainMiniprogramResponse());
    }

    /**
     * Description: 获取金融科技BaaS浏览器交易统计信息
     * Summary: 获取金融科技BaaS浏览器交易统计信息
     */
    public QueryBrowserTransactionStatisticResponse queryBrowserTransactionStatistic(QueryBrowserTransactionStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBrowserTransactionStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融科技BaaS浏览器交易统计信息
     * Summary: 获取金融科技BaaS浏览器交易统计信息
     */
    public QueryBrowserTransactionStatisticResponse queryBrowserTransactionStatisticEx(QueryBrowserTransactionStatisticRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.browser.transaction.statistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBrowserTransactionStatisticResponse());
    }

    /**
     * Description: 获取金融科技BaaS最新区块信息列表
     * Summary: 获取金融科技BaaS最新区块信息列表
     */
    public QueryBrowserBlockLatestResponse queryBrowserBlockLatest(QueryBrowserBlockLatestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBrowserBlockLatestEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融科技BaaS最新区块信息列表
     * Summary: 获取金融科技BaaS最新区块信息列表
     */
    public QueryBrowserBlockLatestResponse queryBrowserBlockLatestEx(QueryBrowserBlockLatestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.browser.block.latest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBrowserBlockLatestResponse());
    }

    /**
     * Description: 获取金融科技BaaS最新交易列表
     * Summary: 获取金融科技BaaS最新交易列表
     */
    public QueryBrowserTransactionLatestResponse queryBrowserTransactionLatest(QueryBrowserTransactionLatestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBrowserTransactionLatestEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融科技BaaS最新交易列表
     * Summary: 获取金融科技BaaS最新交易列表
     */
    public QueryBrowserTransactionLatestResponse queryBrowserTransactionLatestEx(QueryBrowserTransactionLatestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.browser.transaction.latest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBrowserTransactionLatestResponse());
    }

    /**
     * Description: 获取金融科技BaaS区块信息
     * Summary: 获取金融科技BaaS区块信息
     */
    public QueryBrowserBlockResponse queryBrowserBlock(QueryBrowserBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBrowserBlockEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融科技BaaS区块信息
     * Summary: 获取金融科技BaaS区块信息
     */
    public QueryBrowserBlockResponse queryBrowserBlockEx(QueryBrowserBlockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.browser.block.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBrowserBlockResponse());
    }

    /**
     * Description: 获取金融科技BaaS交易信息内容
     * Summary: 获取金融科技BaaS交易信息内容
     */
    public QueryBrowserTransactionResponse queryBrowserTransaction(QueryBrowserTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBrowserTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融科技BaaS交易信息内容
     * Summary: 获取金融科技BaaS交易信息内容
     */
    public QueryBrowserTransactionResponse queryBrowserTransactionEx(QueryBrowserTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.browser.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBrowserTransactionResponse());
    }

    /**
     * Description: 获取金融科技BaaS交易回执信息
     * Summary: 获取金融科技BaaS交易回执信息
     */
    public QueryBrowserTransactionReceiptResponse queryBrowserTransactionReceipt(QueryBrowserTransactionReceiptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBrowserTransactionReceiptEx(request, headers, runtime);
    }

    /**
     * Description: 获取金融科技BaaS交易回执信息
     * Summary: 获取金融科技BaaS交易回执信息
     */
    public QueryBrowserTransactionReceiptResponse queryBrowserTransactionReceiptEx(QueryBrowserTransactionReceiptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.browser.transaction.receipt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBrowserTransactionReceiptResponse());
    }

    /**
     * Description: 蚂蚁链节点所有者查询
     * Summary: 蚂蚁链节点所有者查询
     */
    public QueryBrowserNodeOwnerResponse queryBrowserNodeOwner(QueryBrowserNodeOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBrowserNodeOwnerEx(request, headers, runtime);
    }

    /**
     * Description: 蚂蚁链节点所有者查询
     * Summary: 蚂蚁链节点所有者查询
     */
    public QueryBrowserNodeOwnerResponse queryBrowserNodeOwnerEx(QueryBrowserNodeOwnerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.browser.node.owner.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBrowserNodeOwnerResponse());
    }

    /**
     * Description: 小程序权限删除
     * Summary: 小程序权限删除
     */
    public DeleteBlockchainMiniprogramResponse deleteBlockchainMiniprogram(DeleteBlockchainMiniprogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainMiniprogramEx(request, headers, runtime);
    }

    /**
     * Description: 小程序权限删除
     * Summary: 小程序权限删除
     */
    public DeleteBlockchainMiniprogramResponse deleteBlockchainMiniprogramEx(DeleteBlockchainMiniprogramRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.miniprogram.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainMiniprogramResponse());
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限
     */
    public QueryBlockchainMiniprogramResponse queryBlockchainMiniprogram(QueryBlockchainMiniprogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainMiniprogramEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限
     */
    public QueryBlockchainMiniprogramResponse queryBlockchainMiniprogramEx(QueryBlockchainMiniprogramRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.blockchain.miniprogram.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainMiniprogramResponse());
    }

    /**
     * Description: 物流金融信用流转能力注册开通结果查询
     * Summary: 物流金融信用流转能力注册开通结果查询
     */
    public QueryCreditTransferApplyResponse queryCreditTransferApply(QueryCreditTransferApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditTransferApplyEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融信用流转能力注册开通结果查询
     * Summary: 物流金融信用流转能力注册开通结果查询
     */
    public QueryCreditTransferApplyResponse queryCreditTransferApplyEx(QueryCreditTransferApplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.credit.transfer.apply.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditTransferApplyResponse());
    }

    /**
     * Description: 物流金融信用流转额度查询，仅显示是否有额度，不会返回具体额度
     * Summary: 物流金融信用流转额度查询
     */
    public QueryCreditTransferBalanceResponse queryCreditTransferBalance(QueryCreditTransferBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditTransferBalanceEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融信用流转额度查询，仅显示是否有额度，不会返回具体额度
     * Summary: 物流金融信用流转额度查询
     */
    public QueryCreditTransferBalanceResponse queryCreditTransferBalanceEx(QueryCreditTransferBalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.credit.transfer.balance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditTransferBalanceResponse());
    }

    /**
     * Description: 物流金融信用流转通过id查询发行结果
     * Summary: 物流金融信用流转通过id查询发行结果
     */
    public QueryCreditTransferIssuebyidResponse queryCreditTransferIssuebyid(QueryCreditTransferIssuebyidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditTransferIssuebyidEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融信用流转通过id查询发行结果
     * Summary: 物流金融信用流转通过id查询发行结果
     */
    public QueryCreditTransferIssuebyidResponse queryCreditTransferIssuebyidEx(QueryCreditTransferIssuebyidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.credit.transfer.issuebyid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditTransferIssuebyidResponse());
    }

    /**
     * Description: 物流金融根据时间查询信用凭证信息
     * Summary: 物流金融根据时间查询信用流转信息
     */
    public QueryCreditTransferIssuebytimeResponse queryCreditTransferIssuebytime(QueryCreditTransferIssuebytimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditTransferIssuebytimeEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融根据时间查询信用凭证信息
     * Summary: 物流金融根据时间查询信用流转信息
     */
    public QueryCreditTransferIssuebytimeResponse queryCreditTransferIssuebytimeEx(QueryCreditTransferIssuebytimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.credit.transfer.issuebytime.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditTransferIssuebytimeResponse());
    }

    /**
     * Description: 物流金融信用流转流水查询
     * Summary: 物流金融信用流转流水查询
     */
    public QueryCreditTransferStatementResponse queryCreditTransferStatement(QueryCreditTransferStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditTransferStatementEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融信用流转流水查询
     * Summary: 物流金融信用流转流水查询
     */
    public QueryCreditTransferStatementResponse queryCreditTransferStatementEx(QueryCreditTransferStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.credit.transfer.statement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditTransferStatementResponse());
    }

    /**
     * Description: 物流金融信用流转主站系统回调
     * Summary: 物流金融信用流转主站系统回调
     */
    public CallbackCreditTransferResponse callbackCreditTransfer(CallbackCreditTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackCreditTransferEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融信用流转主站系统回调
     * Summary: 物流金融信用流转主站系统回调
     */
    public CallbackCreditTransferResponse callbackCreditTransferEx(CallbackCreditTransferRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.credit.transfer.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackCreditTransferResponse());
    }

    /**
     * Description: 外部业务方可以给DIS的C端小程序用户颁发声明（VC）用户特定场景
     * Summary: 推送业务方给用户颁发的声明内容
     */
    public PushAuthUserVcResponse pushAuthUserVc(PushAuthUserVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAuthUserVcEx(request, headers, runtime);
    }

    /**
     * Description: 外部业务方可以给DIS的C端小程序用户颁发声明（VC）用户特定场景
     * Summary: 推送业务方给用户颁发的声明内容
     */
    public PushAuthUserVcResponse pushAuthUserVcEx(PushAuthUserVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.user.vc.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushAuthUserVcResponse());
    }

    /**
     * Description: 业务方推送需要用户使用数字身份did授权确认的声明，推送后可根据自定义的业务id（biz_id）来查询状态（另提供接口），进而获取用户授权后的声明。
     * Summary: 推送需要用户端授权的业务声明
     */
    public PushAuthClaimVcResponse pushAuthClaimVc(PushAuthClaimVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAuthClaimVcEx(request, headers, runtime);
    }

    /**
     * Description: 业务方推送需要用户使用数字身份did授权确认的声明，推送后可根据自定义的业务id（biz_id）来查询状态（另提供接口），进而获取用户授权后的声明。
     * Summary: 推送需要用户端授权的业务声明
     */
    public PushAuthClaimVcResponse pushAuthClaimVcEx(PushAuthClaimVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.claim.vc.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushAuthClaimVcResponse());
    }

    /**
     * Description: 业务方通过提供二维码的方式引导用户支付宝扫描创建did，然后业务方通过此接口可查询用户新建的did
     * Summary: 通过biz_id获取用户的did
     */
    public PullAuthUserDidResponse pullAuthUserDid(PullAuthUserDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullAuthUserDidEx(request, headers, runtime);
    }

    /**
     * Description: 业务方通过提供二维码的方式引导用户支付宝扫描创建did，然后业务方通过此接口可查询用户新建的did
     * Summary: 通过biz_id获取用户的did
     */
    public PullAuthUserDidResponse pullAuthUserDidEx(PullAuthUserDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.user.did.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullAuthUserDidResponse());
    }

    /**
     * Description: 业务方通过此接口可以查询，申请用户授权的声明状态，如果用户已授权即可获取到授权后的声明（vc）内容。
     * Summary: 获取申请用户声明的授权结果
     */
    public PullAuthClaimVcResponse pullAuthClaimVc(PullAuthClaimVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullAuthClaimVcEx(request, headers, runtime);
    }

    /**
     * Description: 业务方通过此接口可以查询，申请用户授权的声明状态，如果用户已授权即可获取到授权后的声明（vc）内容。
     * Summary: 获取申请用户声明的授权结果
     */
    public PullAuthClaimVcResponse pullAuthClaimVcEx(PullAuthClaimVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.claim.vc.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullAuthClaimVcResponse());
    }

    /**
     * Description: 业务系统通过授权宝服务帮忙给用户创建did，此接口访问需预先在授权宝配置白名单开通。
     * Summary: 给用户创建did，需要指定userId
     */
    public CreateAuthUserDidResponse createAuthUserDid(CreateAuthUserDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthUserDidEx(request, headers, runtime);
    }

    /**
     * Description: 业务系统通过授权宝服务帮忙给用户创建did，此接口访问需预先在授权宝配置白名单开通。
     * Summary: 给用户创建did，需要指定userId
     */
    public CreateAuthUserDidResponse createAuthUserDidEx(CreateAuthUserDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.user.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthUserDidResponse());
    }

    /**
     * Description: 给企业DID创建DID，通常场景为对授权宝服务的开通，调用方对企业有认证能力。
     * Summary: 创建企业DID，开通授权宝服务
     */
    public CreateAuthCorporateDidResponse createAuthCorporateDid(CreateAuthCorporateDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthCorporateDidEx(request, headers, runtime);
    }

    /**
     * Description: 给企业DID创建DID，通常场景为对授权宝服务的开通，调用方对企业有认证能力。
     * Summary: 创建企业DID，开通授权宝服务
     */
    public CreateAuthCorporateDidResponse createAuthCorporateDidEx(CreateAuthCorporateDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.corporate.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthCorporateDidResponse());
    }

    /**
     * Description: 业务方的C端用户授权颁发“可验证声明”（简称VC）之后，就会异步推送结果给相关业务服务端，如果相关业务服务端没有接收到，或者本地缓存过期，则可以通过此接口到授权宝再次查询目标可验证声明结果情况。
     * Summary: 查询目标可验证声明结果
     */
    public PullAuthWebpageVcResponse pullAuthWebpageVc(PullAuthWebpageVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullAuthWebpageVcEx(request, headers, runtime);
    }

    /**
     * Description: 业务方的C端用户授权颁发“可验证声明”（简称VC）之后，就会异步推送结果给相关业务服务端，如果相关业务服务端没有接收到，或者本地缓存过期，则可以通过此接口到授权宝再次查询目标可验证声明结果情况。
     * Summary: 查询目标可验证声明结果
     */
    public PullAuthWebpageVcResponse pullAuthWebpageVcEx(PullAuthWebpageVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.webpage.vc.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullAuthWebpageVcResponse());
    }

    /**
     * Description: 此接口提供了授权宝这边可用的H5页面的Url，此Url会携带一些参数：授权宝鉴权token(JWT机制生成，内部使用)、bizId(接口入参带入)
     * Summary: 获取授权宝侧的H5授权Url
     */
    public PullAuthWebpageUrlResponse pullAuthWebpageUrl(PullAuthWebpageUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullAuthWebpageUrlEx(request, headers, runtime);
    }

    /**
     * Description: 此接口提供了授权宝这边可用的H5页面的Url，此Url会携带一些参数：授权宝鉴权token(JWT机制生成，内部使用)、bizId(接口入参带入)
     * Summary: 获取授权宝侧的H5授权Url
     */
    public PullAuthWebpageUrlResponse pullAuthWebpageUrlEx(PullAuthWebpageUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.webpage.url.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullAuthWebpageUrlResponse());
    }

    /**
     * Description: 在一些业务场景，指定可验证声明之后，根据bizType的类型，直接发生代理颁发可验证声明的操作。
     * Summary: 给定声明内容并颁发声明
     */
    public StartAuthVcAuthResponse startAuthVcAuth(StartAuthVcAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVcAuthEx(request, headers, runtime);
    }

    /**
     * Description: 在一些业务场景，指定可验证声明之后，根据bizType的类型，直接发生代理颁发可验证声明的操作。
     * Summary: 给定声明内容并颁发声明
     */
    public StartAuthVcAuthResponse startAuthVcAuthEx(StartAuthVcAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.auth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVcAuthResponse());
    }

    /**
     * Description: 可验证声明（VC）的拥有者（vcContent中的subject）可以将声明分享权限给其它的DID。
     * Summary: 将目标的声明内容，分享权限给目标的DID
     */
    public StartAuthVcShareResponse startAuthVcShare(StartAuthVcShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVcShareEx(request, headers, runtime);
    }

    /**
     * Description: 可验证声明（VC）的拥有者（vcContent中的subject）可以将声明分享权限给其它的DID。
     * Summary: 将目标的声明内容，分享权限给目标的DID
     */
    public StartAuthVcShareResponse startAuthVcShareEx(StartAuthVcShareRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.share.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVcShareResponse());
    }

    /**
     * Description: 通过指定可验证声明id，获取目标可验证声明内容，需要可验证声明的拥有者分享声明才可查询，如果没有权限则获取失败。
     * Summary: 获取目标可验证声明内容
     */
    public QueryAuthVcContentResponse queryAuthVcContent(QueryAuthVcContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthVcContentEx(request, headers, runtime);
    }

    /**
     * Description: 通过指定可验证声明id，获取目标可验证声明内容，需要可验证声明的拥有者分享声明才可查询，如果没有权限则获取失败。
     * Summary: 获取目标可验证声明内容
     */
    public QueryAuthVcContentResponse queryAuthVcContentEx(QueryAuthVcContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.content.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthVcContentResponse());
    }

    /**
     * Description: 业务系统通过授权宝服务帮忙给C类用户创建did，此接口访问需预先在授权宝配置白名单开通。
     * Summary: 给C类用户建did，需要指定user信息
     */
    public CreateAuthUserinfoDidResponse createAuthUserinfoDid(CreateAuthUserinfoDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthUserinfoDidEx(request, headers, runtime);
    }

    /**
     * Description: 业务系统通过授权宝服务帮忙给C类用户创建did，此接口访问需预先在授权宝配置白名单开通。
     * Summary: 给C类用户建did，需要指定user信息
     */
    public CreateAuthUserinfoDidResponse createAuthUserinfoDidEx(CreateAuthUserinfoDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.userinfo.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthUserinfoDidResponse());
    }

    /**
     * Description: 声明的持有者可以吊销一个已颁发的可验证声明(VC)
     * Summary: 吊销已颁发声明
     */
    public StartAuthVcRevokeResponse startAuthVcRevoke(StartAuthVcRevokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVcRevokeEx(request, headers, runtime);
    }

    /**
     * Description: 声明的持有者可以吊销一个已颁发的可验证声明(VC)
     * Summary: 吊销已颁发声明
     */
    public StartAuthVcRevokeResponse startAuthVcRevokeEx(StartAuthVcRevokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.revoke.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVcRevokeResponse());
    }

    /**
     * Description: 将可验证声明内的数据资产内容赠送给目标的did
     * Summary: 将vc赠送给一个目标did
     */
    public StartAuthVcGiveResponse startAuthVcGive(StartAuthVcGiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVcGiveEx(request, headers, runtime);
    }

    /**
     * Description: 将可验证声明内的数据资产内容赠送给目标的did
     * Summary: 将vc赠送给一个目标did
     */
    public StartAuthVcGiveResponse startAuthVcGiveEx(StartAuthVcGiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.give.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVcGiveResponse());
    }

    /**
     * Description: 提供批量分享可验证声明到目标did
     * Summary: 批量分享VC内容
     */
    public StartAuthVcSharebatchResponse startAuthVcSharebatch(StartAuthVcSharebatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVcSharebatchEx(request, headers, runtime);
    }

    /**
     * Description: 提供批量分享可验证声明到目标did
     * Summary: 批量分享VC内容
     */
    public StartAuthVcSharebatchResponse startAuthVcSharebatchEx(StartAuthVcSharebatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.sharebatch.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVcSharebatchResponse());
    }

    /**
     * Description: 如果机构没有接入网关能力需要合作方代理在授权宝管理签名能力，可使用此接口。
    初始申请创建此corp did的调用方，有权限申请签名。
     * Summary: 代理签名
     */
    public StartAuthCorporateSignResponse startAuthCorporateSign(StartAuthCorporateSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthCorporateSignEx(request, headers, runtime);
    }

    /**
     * Description: 如果机构没有接入网关能力需要合作方代理在授权宝管理签名能力，可使用此接口。
    初始申请创建此corp did的调用方，有权限申请签名。
     * Summary: 代理签名
     */
    public StartAuthCorporateSignResponse startAuthCorporateSignEx(StartAuthCorporateSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.corporate.sign.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthCorporateSignResponse());
    }

    /**
     * Description: 在一些业务场景，指定可验证声明之后，提交颁发可验证声明的操作。当前接口支持批量颁发声明，通常支持对多机构的数据授权。
     * Summary: 批量给定声明内容颁发声明，并上链存证
     */
    public StartAuthVcBatchauthResponse startAuthVcBatchauth(StartAuthVcBatchauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVcBatchauthEx(request, headers, runtime);
    }

    /**
     * Description: 在一些业务场景，指定可验证声明之后，提交颁发可验证声明的操作。当前接口支持批量颁发声明，通常支持对多机构的数据授权。
     * Summary: 批量给定声明内容颁发声明，并上链存证
     */
    public StartAuthVcBatchauthResponse startAuthVcBatchauthEx(StartAuthVcBatchauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.batchauth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVcBatchauthResponse());
    }

    /**
     * Description: 将已颁发的可验证声明进行吊销，然后重新颁发一个新的可验证声明用于代替原有的业务语义的可验证声明。
     * Summary: 将已颁发的可验证声明进行重置替换
     */
    public StartAuthVcReplaceResponse startAuthVcReplace(StartAuthVcReplaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVcReplaceEx(request, headers, runtime);
    }

    /**
     * Description: 将已颁发的可验证声明进行吊销，然后重新颁发一个新的可验证声明用于代替原有的业务语义的可验证声明。
     * Summary: 将已颁发的可验证声明进行重置替换
     */
    public StartAuthVcReplaceResponse startAuthVcReplaceEx(StartAuthVcReplaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.replace.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVcReplaceResponse());
    }

    /**
     * Description: 推送保单信息
     * Summary: 推送保单信息
     */
    public PushAuthInsurancePolicyResponse pushAuthInsurancePolicy(PushAuthInsurancePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAuthInsurancePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 推送保单信息
     * Summary: 推送保单信息
     */
    public PushAuthInsurancePolicyResponse pushAuthInsurancePolicyEx(PushAuthInsurancePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.insurance.policy.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushAuthInsurancePolicyResponse());
    }

    /**
     * Description: 获取前端sdk使用的token
     * Summary: 获取前端sdk使用的token
     */
    public GetAuthFrontendAccesstokenResponse getAuthFrontendAccesstoken(GetAuthFrontendAccesstokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthFrontendAccesstokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取前端sdk使用的token
     * Summary: 获取前端sdk使用的token
     */
    public GetAuthFrontendAccesstokenResponse getAuthFrontendAccesstokenEx(GetAuthFrontendAccesstokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.frontend.accesstoken.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAuthFrontendAccesstokenResponse());
    }

    /**
     * Description: 获取声明授权链接
     * Summary: 获取声明授权链接
     */
    public CreateAuthClaimUrlResponse createAuthClaimUrl(CreateAuthClaimUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthClaimUrlEx(request, headers, runtime);
    }

    /**
     * Description: 获取声明授权链接
     * Summary: 获取声明授权链接
     */
    public CreateAuthClaimUrlResponse createAuthClaimUrlEx(CreateAuthClaimUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.claim.url.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthClaimUrlResponse());
    }

    /**
     * Description: 行驶证核身授权
     * Summary: 授权宝个人信息授权，行驶证核身授权
     */
    public StartAuthVerifyCarinfoResponse startAuthVerifyCarinfo(StartAuthVerifyCarinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVerifyCarinfoEx(request, headers, runtime);
    }

    /**
     * Description: 行驶证核身授权
     * Summary: 授权宝个人信息授权，行驶证核身授权
     */
    public StartAuthVerifyCarinfoResponse startAuthVerifyCarinfoEx(StartAuthVerifyCarinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.verify.carinfo.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVerifyCarinfoResponse());
    }

    /**
     * Description: 驾驶证相关信息核验并核身，并且结合授权宝完成授权。
     * Summary: 授权宝个人信息授权，驾驶证核身授权
     */
    public StartAuthVerifyDriverinfoResponse startAuthVerifyDriverinfo(StartAuthVerifyDriverinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVerifyDriverinfoEx(request, headers, runtime);
    }

    /**
     * Description: 驾驶证相关信息核验并核身，并且结合授权宝完成授权。
     * Summary: 授权宝个人信息授权，驾驶证核身授权
     */
    public StartAuthVerifyDriverinfoResponse startAuthVerifyDriverinfoEx(StartAuthVerifyDriverinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.verify.driverinfo.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVerifyDriverinfoResponse());
    }

    /**
     * Description: 检查车牌是否进行年检，当前状态，以及年检有效期止。
     * Summary: 车检查询核验，目标车牌年检状态
     */
    public StartAuthVerifyCarinspectResponse startAuthVerifyCarinspect(StartAuthVerifyCarinspectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthVerifyCarinspectEx(request, headers, runtime);
    }

    /**
     * Description: 检查车牌是否进行年检，当前状态，以及年检有效期止。
     * Summary: 车检查询核验，目标车牌年检状态
     */
    public StartAuthVerifyCarinspectResponse startAuthVerifyCarinspectEx(StartAuthVerifyCarinspectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.verify.carinspect.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthVerifyCarinspectResponse());
    }

    /**
     * Description: 获取授权声明模版
     * Summary: 获取授权声明模版
     */
    public GetAuthClaimTemplateResponse getAuthClaimTemplate(GetAuthClaimTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthClaimTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 获取授权声明模版
     * Summary: 获取授权声明模版
     */
    public GetAuthClaimTemplateResponse getAuthClaimTemplateEx(GetAuthClaimTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.claim.template.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAuthClaimTemplateResponse());
    }

    /**
     * Description: 通过claim创建vc
     * Summary: 通过claim创建vc
     */
    public CreateAuthClaimVcResponse createAuthClaimVc(CreateAuthClaimVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthClaimVcEx(request, headers, runtime);
    }

    /**
     * Description: 通过claim创建vc
     * Summary: 通过claim创建vc
     */
    public CreateAuthClaimVcResponse createAuthClaimVcEx(CreateAuthClaimVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.claim.vc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthClaimVcResponse());
    }

    /**
     * Description: 查询vc详情
     * Summary: 查询vc详情
     */
    public QueryAuthClaimVcResponse queryAuthClaimVc(QueryAuthClaimVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthClaimVcEx(request, headers, runtime);
    }

    /**
     * Description: 查询vc详情
     * Summary: 查询vc详情
     */
    public QueryAuthClaimVcResponse queryAuthClaimVcEx(QueryAuthClaimVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.claim.vc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthClaimVcResponse());
    }

    /**
     * Description: 车辆投保日期查询(存量)
     * Summary: 车辆投保日期查询(存量)
     */
    public QueryAuthVehicleinsuranceResponse queryAuthVehicleinsurance(QueryAuthVehicleinsuranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthVehicleinsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 车辆投保日期查询(存量)
     * Summary: 车辆投保日期查询(存量)
     */
    public QueryAuthVehicleinsuranceResponse queryAuthVehicleinsuranceEx(QueryAuthVehicleinsuranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vehicleinsurance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthVehicleinsuranceResponse());
    }

    /**
     * Description: 车辆投保日期查询(增量)
     * Summary: 车辆投保日期查询(增量)
     */
    public QueryAuthVehicleinsuranceVcResponse queryAuthVehicleinsuranceVc(QueryAuthVehicleinsuranceVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthVehicleinsuranceVcEx(request, headers, runtime);
    }

    /**
     * Description: 车辆投保日期查询(增量)
     * Summary: 车辆投保日期查询(增量)
     */
    public QueryAuthVehicleinsuranceVcResponse queryAuthVehicleinsuranceVcEx(QueryAuthVehicleinsuranceVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vehicleinsurance.vc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthVehicleinsuranceVcResponse());
    }

    /**
     * Description: 查询在特定业务bizType下的凭证颁发的统计数据，以及按照day维度的分布情况。
     * Summary: 查询目标场景的凭证颁发的统计数据
     */
    public QueryAuthVcStatisticsResponse queryAuthVcStatistics(QueryAuthVcStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthVcStatisticsEx(request, headers, runtime);
    }

    /**
     * Description: 查询在特定业务bizType下的凭证颁发的统计数据，以及按照day维度的分布情况。
     * Summary: 查询目标场景的凭证颁发的统计数据
     */
    public QueryAuthVcStatisticsResponse queryAuthVcStatisticsEx(QueryAuthVcStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.statistics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthVcStatisticsResponse());
    }

    /**
     * Description: 查询目标业务凭证的实时颁发的情况，返回一个列表。
     * Summary: 查询目标业务凭证颁发的实时列表情况
     */
    public QueryAuthVcRealtimeResponse queryAuthVcRealtime(QueryAuthVcRealtimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthVcRealtimeEx(request, headers, runtime);
    }

    /**
     * Description: 查询目标业务凭证的实时颁发的情况，返回一个列表。
     * Summary: 查询目标业务凭证颁发的实时列表情况
     */
    public QueryAuthVcRealtimeResponse queryAuthVcRealtimeEx(QueryAuthVcRealtimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.realtime.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthVcRealtimeResponse());
    }

    /**
     * Description: 在机构颁发凭证的情况下，机构的可信度和状态会影响颁发的凭证的有效性和影响，因此提供接口查询机构状态。
     * Summary: 特定场景下使用，查询机构状态
     */
    public QueryAuthOrgStatusResponse queryAuthOrgStatus(QueryAuthOrgStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthOrgStatusEx(request, headers, runtime);
    }

    /**
     * Description: 在机构颁发凭证的情况下，机构的可信度和状态会影响颁发的凭证的有效性和影响，因此提供接口查询机构状态。
     * Summary: 特定场景下使用，查询机构状态
     */
    public QueryAuthOrgStatusResponse queryAuthOrgStatusEx(QueryAuthOrgStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.org.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthOrgStatusResponse());
    }

    /**
     * Description: 预充值交易通过身份的凭证封装的方式在区块链上资产化。
     * Summary: 交易资产的归属
     */
    public StartAuthAssetIssueResponse startAuthAssetIssue(StartAuthAssetIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthAssetIssueEx(request, headers, runtime);
    }

    /**
     * Description: 预充值交易通过身份的凭证封装的方式在区块链上资产化。
     * Summary: 交易资产的归属
     */
    public StartAuthAssetIssueResponse startAuthAssetIssueEx(StartAuthAssetIssueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.asset.issue.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthAssetIssueResponse());
    }

    /**
     * Description: 查询卡证模板的列表
     * Summary: 查询模板列表
     */
    public AllAuthCertTemplateResponse allAuthCertTemplate(AllAuthCertTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allAuthCertTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 查询卡证模板的列表
     * Summary: 查询模板列表
     */
    public AllAuthCertTemplateResponse allAuthCertTemplateEx(AllAuthCertTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllAuthCertTemplateResponse());
    }

    /**
     * Description: 为客权业务定制化的编辑或新增证书实例，可以绕过审批流程
     * Summary: 编辑或新增证书实例
     */
    public SaveAuthCertInstanceforcustomResponse saveAuthCertInstanceforcustom(SaveAuthCertInstanceforcustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAuthCertInstanceforcustomEx(request, headers, runtime);
    }

    /**
     * Description: 为客权业务定制化的编辑或新增证书实例，可以绕过审批流程
     * Summary: 编辑或新增证书实例
     */
    public SaveAuthCertInstanceforcustomResponse saveAuthCertInstanceforcustomEx(SaveAuthCertInstanceforcustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.instanceforcustom.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveAuthCertInstanceforcustomResponse());
    }

    /**
     * Description: 通过上传的领取人明细文件，为证书实例批量颁发证书
     * Summary: 批量颁发证书
     */
    public BatchcreateAuthCertResponse batchcreateAuthCert(BatchcreateAuthCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateAuthCertEx(request, headers, runtime);
    }

    /**
     * Description: 通过上传的领取人明细文件，为证书实例批量颁发证书
     * Summary: 批量颁发证书
     */
    public BatchcreateAuthCertResponse batchcreateAuthCertEx(BatchcreateAuthCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateAuthCertResponse());
    }

    /**
     * Description: 单个颁发证书
     * Summary: 颁发证书
     */
    public CreateAuthCertResponse createAuthCert(CreateAuthCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthCertEx(request, headers, runtime);
    }

    /**
     * Description: 单个颁发证书
     * Summary: 颁发证书
     */
    public CreateAuthCertResponse createAuthCertEx(CreateAuthCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthCertResponse());
    }

    /**
     * Description: 吊销已经颁发的证书
     * Summary: 吊销证书
     */
    public InvalidateAuthCertResponse invalidateAuthCert(InvalidateAuthCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invalidateAuthCertEx(request, headers, runtime);
    }

    /**
     * Description: 吊销已经颁发的证书
     * Summary: 吊销证书
     */
    public InvalidateAuthCertResponse invalidateAuthCertEx(InvalidateAuthCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.invalidate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InvalidateAuthCertResponse());
    }

    /**
     * Description: 查询批量颁发证书的进度详情
     * Summary: 查询批量颁发证书的进度
     */
    public QueryAuthCertProgressResponse queryAuthCertProgress(QueryAuthCertProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthCertProgressEx(request, headers, runtime);
    }

    /**
     * Description: 查询批量颁发证书的进度详情
     * Summary: 查询批量颁发证书的进度
     */
    public QueryAuthCertProgressResponse queryAuthCertProgressEx(QueryAuthCertProgressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.progress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthCertProgressResponse());
    }

    /**
     * Description: 上传需要批量颁发的证书领取人明细csv文件到oss服务器，并返回文件的路径
     * Summary: 上传领取人明细csv文件
     */
    public UploadAuthCertInstanceResponse uploadAuthCertInstance(UploadAuthCertInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAuthCertInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 上传需要批量颁发的证书领取人明细csv文件到oss服务器，并返回文件的路径
     * Summary: 上传领取人明细csv文件
     */
    public UploadAuthCertInstanceResponse uploadAuthCertInstanceEx(UploadAuthCertInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "baas.auth.cert.instance.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadAuthCertInstanceResponse uploadAuthCertInstanceResponse = UploadAuthCertInstanceResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadAuthCertInstanceResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.instance.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAuthCertInstanceResponse());
    }

    /**
     * Description:  编辑或新增证书实例
     * Summary:  编辑或新增证书实例
     */
    public SaveAuthCertInstanceResponse saveAuthCertInstance(SaveAuthCertInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAuthCertInstanceEx(request, headers, runtime);
    }

    /**
     * Description:  编辑或新增证书实例
     * Summary:  编辑或新增证书实例
     */
    public SaveAuthCertInstanceResponse saveAuthCertInstanceEx(SaveAuthCertInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.instance.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveAuthCertInstanceResponse());
    }

    /**
     * Description: 状态为编辑中的证书实例，调用此接口提交审核
     * Summary: 证书实例提交审核
     */
    public ApplyAuthCertInstanceResponse applyAuthCertInstance(ApplyAuthCertInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAuthCertInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 状态为编辑中的证书实例，调用此接口提交审核
     * Summary: 证书实例提交审核
     */
    public ApplyAuthCertInstanceResponse applyAuthCertInstanceEx(ApplyAuthCertInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.instance.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAuthCertInstanceResponse());
    }

    /**
     * Description: 向证书平台申请一个oss临时url，用来上传证书领取人csv文件，有效期30分钟
     * Summary: 获取证书领取人csv上传url
     */
    public GetAuthCertInstancedataurlResponse getAuthCertInstancedataurl(GetAuthCertInstancedataurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthCertInstancedataurlEx(request, headers, runtime);
    }

    /**
     * Description: 向证书平台申请一个oss临时url，用来上传证书领取人csv文件，有效期30分钟
     * Summary: 获取证书领取人csv上传url
     */
    public GetAuthCertInstancedataurlResponse getAuthCertInstancedataurlEx(GetAuthCertInstancedataurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.instancedataurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAuthCertInstancedataurlResponse());
    }

    /**
     * Description: 证书平台创建自定义存证
     * Summary: 证书平台创建存证
     */
    public CreateAuthCertClaimResponse createAuthCertClaim(CreateAuthCertClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthCertClaimEx(request, headers, runtime);
    }

    /**
     * Description: 证书平台创建自定义存证
     * Summary: 证书平台创建存证
     */
    public CreateAuthCertClaimResponse createAuthCertClaimEx(CreateAuthCertClaimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.claim.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthCertClaimResponse());
    }

    /**
     * Description: 证书平台查询用户自定义存证
     * Summary: 证书平台查询用户自定义存证
     */
    public QueryAuthCertClaimResponse queryAuthCertClaim(QueryAuthCertClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthCertClaimEx(request, headers, runtime);
    }

    /**
     * Description: 证书平台查询用户自定义存证
     * Summary: 证书平台查询用户自定义存证
     */
    public QueryAuthCertClaimResponse queryAuthCertClaimEx(QueryAuthCertClaimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.claim.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthCertClaimResponse());
    }

    /**
     * Description: 生成查验证书存证的url
     * Summary: 生成查验证书存证的url
     */
    public CreateAuthCertClaimurlResponse createAuthCertClaimurl(CreateAuthCertClaimurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthCertClaimurlEx(request, headers, runtime);
    }

    /**
     * Description: 生成查验证书存证的url
     * Summary: 生成查验证书存证的url
     */
    public CreateAuthCertClaimurlResponse createAuthCertClaimurlEx(CreateAuthCertClaimurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.claimurl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthCertClaimurlResponse());
    }

    /**
     * Description: 获取用户已授权的最近存证信息，在理财风测卡场景获取最近的题目答案
     * Summary: 获取用户已授权的最近存证信息
     */
    public GetAuthClaimRecentResponse getAuthClaimRecent(GetAuthClaimRecentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthClaimRecentEx(request, headers, runtime);
    }

    /**
     * Description: 获取用户已授权的最近存证信息，在理财风测卡场景获取最近的题目答案
     * Summary: 获取用户已授权的最近存证信息
     */
    public GetAuthClaimRecentResponse getAuthClaimRecentEx(GetAuthClaimRecentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.claim.recent.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAuthClaimRecentResponse());
    }

    /**
     * Description: 新的：baas.auth.contract.claim.exec
     * Summary: 合约调用_废弃
     */
    public ExecAuthContractResponse execAuthContract(ExecAuthContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAuthContractEx(request, headers, runtime);
    }

    /**
     * Description: 新的：baas.auth.contract.claim.exec
     * Summary: 合约调用_废弃
     */
    public ExecAuthContractResponse execAuthContractEx(ExecAuthContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.contract.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAuthContractResponse());
    }

    /**
     * Description: 查看用户对于某一场景的授权状态
     * Summary: 查看用户授权状态
     */
    public QueryAuthSceneAuthstatusResponse queryAuthSceneAuthstatus(QueryAuthSceneAuthstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthSceneAuthstatusEx(request, headers, runtime);
    }

    /**
     * Description: 查看用户对于某一场景的授权状态
     * Summary: 查看用户授权状态
     */
    public QueryAuthSceneAuthstatusResponse queryAuthSceneAuthstatusEx(QueryAuthSceneAuthstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.scene.authstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthSceneAuthstatusResponse());
    }

    /**
     * Description: 使用调用方did注册的vc channel链上账户调用指定合约
     * Summary: 合约调用
     */
    public ExecAuthContractClaimResponse execAuthContractClaim(ExecAuthContractClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAuthContractClaimEx(request, headers, runtime);
    }

    /**
     * Description: 使用调用方did注册的vc channel链上账户调用指定合约
     * Summary: 合约调用
     */
    public ExecAuthContractClaimResponse execAuthContractClaimEx(ExecAuthContractClaimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.contract.claim.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAuthContractClaimResponse());
    }

    /**
     * Description: B类用户获取证书查验页面二维码的url
     * Summary: 获取证书查验页面二维码的url
     */
    public CreateAuthCertDetailpageurlResponse createAuthCertDetailpageurl(CreateAuthCertDetailpageurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthCertDetailpageurlEx(request, headers, runtime);
    }

    /**
     * Description: B类用户获取证书查验页面二维码的url
     * Summary: 获取证书查验页面二维码的url
     */
    public CreateAuthCertDetailpageurlResponse createAuthCertDetailpageurlEx(CreateAuthCertDetailpageurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.detailpageurl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAuthCertDetailpageurlResponse());
    }

    /**
     * Description: 用户合约签约接口
     * Summary: 用户合约签约
     */
    public SignAuthAgreementUserResponse signAuthAgreementUser(SignAuthAgreementUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signAuthAgreementUserEx(request, headers, runtime);
    }

    /**
     * Description: 用户合约签约接口
     * Summary: 用户合约签约
     */
    public SignAuthAgreementUserResponse signAuthAgreementUserEx(SignAuthAgreementUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.agreement.user.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignAuthAgreementUserResponse());
    }

    /**
     * Description: 给指定用户发放POAP徽章
     * Summary: 给指定用户发放POAP徽章
     */
    public BindAuthPoapResponse bindAuthPoap(BindAuthPoapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAuthPoapEx(request, headers, runtime);
    }

    /**
     * Description: 给指定用户发放POAP徽章
     * Summary: 给指定用户发放POAP徽章
     */
    public BindAuthPoapResponse bindAuthPoapEx(BindAuthPoapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.poap.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAuthPoapResponse());
    }

    /**
     * Description: 根据ID查询POAP徽章详情
     * Summary: 查询POAP徽章详情
     */
    public QueryAuthPoapResponse queryAuthPoap(QueryAuthPoapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthPoapEx(request, headers, runtime);
    }

    /**
     * Description: 根据ID查询POAP徽章详情
     * Summary: 查询POAP徽章详情
     */
    public QueryAuthPoapResponse queryAuthPoapEx(QueryAuthPoapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.poap.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthPoapResponse());
    }

    /**
     * Description: 授权宝数据授权流程，需要请求方先进行请求记录。
     * Summary: 开启数据授权流程，首先记录授权请求
     */
    public StartAuthDataResponse startAuthData(StartAuthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAuthDataEx(request, headers, runtime);
    }

    /**
     * Description: 授权宝数据授权流程，需要请求方先进行请求记录。
     * Summary: 开启数据授权流程，首先记录授权请求
     */
    public StartAuthDataResponse startAuthDataEx(StartAuthDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.data.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAuthDataResponse());
    }

    /**
     * Description: 授权宝数据授权流程，调用方经过授权之后请求数据
     * Summary: 请求授权的数据，加密传输
     */
    public GetAuthDataResponse getAuthData(GetAuthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAuthDataEx(request, headers, runtime);
    }

    /**
     * Description: 授权宝数据授权流程，调用方经过授权之后请求数据
     * Summary: 请求授权的数据，加密传输
     */
    public GetAuthDataResponse getAuthDataEx(GetAuthDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.data.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAuthDataResponse());
    }

    /**
     * Description: 查询核身结果
     * Summary: 查询核身结果
     */
    public QueryAuthIdentityauthResponse queryAuthIdentityauth(QueryAuthIdentityauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthIdentityauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询核身结果
     * Summary: 查询核身结果
     */
    public QueryAuthIdentityauthResponse queryAuthIdentityauthEx(QueryAuthIdentityauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.identityauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthIdentityauthResponse());
    }

    /**
     * Description: 查询证书的详情h5链接
     * Summary: 查询证书的详情h5链接
     */
    public QueryAuthCertDetailurlResponse queryAuthCertDetailurl(QueryAuthCertDetailurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthCertDetailurlEx(request, headers, runtime);
    }

    /**
     * Description: 查询证书的详情h5链接
     * Summary: 查询证书的详情h5链接
     */
    public QueryAuthCertDetailurlResponse queryAuthCertDetailurlEx(QueryAuthCertDetailurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.cert.detailurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthCertDetailurlResponse());
    }

    /**
     * Description: 主站应用同步授权宝权益任务的完成情况
     * Summary: 主站应用同步授权宝权益任务的完成情况
     */
    public NotifyAuthTaskStatusResponse notifyAuthTaskStatus(NotifyAuthTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyAuthTaskStatusEx(request, headers, runtime);
    }

    /**
     * Description: 主站应用同步授权宝权益任务的完成情况
     * Summary: 主站应用同步授权宝权益任务的完成情况
     */
    public NotifyAuthTaskStatusResponse notifyAuthTaskStatusEx(NotifyAuthTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.status.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyAuthTaskStatusResponse());
    }

    /**
     * Description: 任务暂停
     * Summary: 任务暂停
     */
    public PauseAuthTaskResponse pauseAuthTask(PauseAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 任务暂停
     * Summary: 任务暂停
     */
    public PauseAuthTaskResponse pauseAuthTaskEx(PauseAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseAuthTaskResponse());
    }

    /**
     * Description: 任务完成
     * Summary: 任务完成
     */
    public FinishAuthTaskResponse finishAuthTask(FinishAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 任务完成
     * Summary: 任务完成
     */
    public FinishAuthTaskResponse finishAuthTaskEx(FinishAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishAuthTaskResponse());
    }

    /**
     * Description: 任务重启
     * Summary: 任务重启
     */
    public ReopenAuthTaskResponse reopenAuthTask(ReopenAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reopenAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 任务重启
     * Summary: 任务重启
     */
    public ReopenAuthTaskResponse reopenAuthTaskEx(ReopenAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.reopen", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReopenAuthTaskResponse());
    }

    /**
     * Description: 样本量修改
     * Summary: 样本量修改
     */
    public OperateAuthTaskResponse operateAuthTask(OperateAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 样本量修改
     * Summary: 样本量修改
     */
    public OperateAuthTaskResponse operateAuthTaskEx(OperateAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateAuthTaskResponse());
    }

    /**
     * Description: 查询人群标签取值范围
     * Summary: 查询人群标签取值范围
     */
    public QueryAuthTaskResponse queryAuthTask(QueryAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询人群标签取值范围
     * Summary: 查询人群标签取值范围
     */
    public QueryAuthTaskResponse queryAuthTaskEx(QueryAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthTaskResponse());
    }

    /**
     * Description: 人群量级查询
     * Summary: 人群量级查询
     */
    public CountAuthTaskResponse countAuthTask(CountAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 人群量级查询
     * Summary: 人群量级查询
     */
    public CountAuthTaskResponse countAuthTaskEx(CountAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountAuthTaskResponse());
    }

    /**
     * Description: 人群匹配查询
     * Summary: 人群匹配查询
     */
    public MatchAuthTaskResponse matchAuthTask(MatchAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 人群匹配查询
     * Summary: 人群匹配查询
     */
    public MatchAuthTaskResponse matchAuthTaskEx(MatchAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchAuthTaskResponse());
    }

    /**
     * Description: 问卷任务提交
     * Summary: 问卷任务提交
     */
    public SubmitAuthTaskResponse submitAuthTask(SubmitAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 问卷任务提交
     * Summary: 问卷任务提交
     */
    public SubmitAuthTaskResponse submitAuthTaskEx(SubmitAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuthTaskResponse());
    }

    /**
     * Description: 问卷任务详情
     * Summary: 问卷任务详情
     */
    public DetailAuthTaskResponse detailAuthTask(DetailAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 问卷任务详情
     * Summary: 问卷任务详情
     */
    public DetailAuthTaskResponse detailAuthTaskEx(DetailAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailAuthTaskResponse());
    }

    /**
     * Description: 任务修改
     * Summary: 任务修改
     */
    public UpdateAuthTaskResponse updateAuthTask(UpdateAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 任务修改
     * Summary: 任务修改
     */
    public UpdateAuthTaskResponse updateAuthTaskEx(UpdateAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAuthTaskResponse());
    }

    /**
     * Description: 人群量级查询
     * Summary: 人群量级查询
     */
    public CountAuthTaskCrowdResponse countAuthTaskCrowd(CountAuthTaskCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countAuthTaskCrowdEx(request, headers, runtime);
    }

    /**
     * Description: 人群量级查询
     * Summary: 人群量级查询
     */
    public CountAuthTaskCrowdResponse countAuthTaskCrowdEx(CountAuthTaskCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.crowd.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountAuthTaskCrowdResponse());
    }

    /**
     * Description: 人群匹配查询
     * Summary: 人群匹配查询
     */
    public MatchAuthTaskCrowdResponse matchAuthTaskCrowd(MatchAuthTaskCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchAuthTaskCrowdEx(request, headers, runtime);
    }

    /**
     * Description: 人群匹配查询
     * Summary: 人群匹配查询
     */
    public MatchAuthTaskCrowdResponse matchAuthTaskCrowdEx(MatchAuthTaskCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.crowd.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchAuthTaskCrowdResponse());
    }

    /**
     * Description: 人群标签取值范围查询
     * Summary: 人群标签取值范围查询
     */
    public QueryAuthTaskLabelResponse queryAuthTaskLabel(QueryAuthTaskLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthTaskLabelEx(request, headers, runtime);
    }

    /**
     * Description: 人群标签取值范围查询
     * Summary: 人群标签取值范围查询
     */
    public QueryAuthTaskLabelResponse queryAuthTaskLabelEx(QueryAuthTaskLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.label.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthTaskLabelResponse());
    }

    /**
     * Description: 任务列表查询
     * Summary: 任务列表查询
     */
    public ListAuthTaskResponse listAuthTask(ListAuthTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthTaskEx(request, headers, runtime);
    }

    /**
     * Description: 任务列表查询
     * Summary: 任务列表查询
     */
    public ListAuthTaskResponse listAuthTaskEx(ListAuthTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.task.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAuthTaskResponse());
    }

    /**
     * Description: 权益退订openAPI接口
     * Summary: 权益退订
     */
    public UnbindAuthEquityResponse unbindAuthEquity(UnbindAuthEquityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindAuthEquityEx(request, headers, runtime);
    }

    /**
     * Description: 权益退订openAPI接口
     * Summary: 权益退订
     */
    public UnbindAuthEquityResponse unbindAuthEquityEx(UnbindAuthEquityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.equity.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindAuthEquityResponse());
    }

    /**
     * Description: 权益退款
     * Summary: 权益退款接口
     */
    public RepayAuthEquityResponse repayAuthEquity(RepayAuthEquityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayAuthEquityEx(request, headers, runtime);
    }

    /**
     * Description: 权益退款
     * Summary: 权益退款接口
     */
    public RepayAuthEquityResponse repayAuthEquityEx(RepayAuthEquityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.equity.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayAuthEquityResponse());
    }

    /**
     * Description: 授权token校验
     * Summary: 授权token校验
     */
    public VerifyAuthTokenValidityResponse verifyAuthTokenValidity(VerifyAuthTokenValidityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAuthTokenValidityEx(request, headers, runtime);
    }

    /**
     * Description: 授权token校验
     * Summary: 授权token校验
     */
    public VerifyAuthTokenValidityResponse verifyAuthTokenValidityEx(VerifyAuthTokenValidityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.token.validity.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyAuthTokenValidityResponse());
    }

    /**
     * Description: 核验当前用户是否权益新用户
     * Summary: 权益核验是否新用户
     */
    public VerifyAuthBusinessUserResponse verifyAuthBusinessUser(VerifyAuthBusinessUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAuthBusinessUserEx(request, headers, runtime);
    }

    /**
     * Description: 核验当前用户是否权益新用户
     * Summary: 权益核验是否新用户
     */
    public VerifyAuthBusinessUserResponse verifyAuthBusinessUserEx(VerifyAuthBusinessUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.business.user.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyAuthBusinessUserResponse());
    }

    /**
     * Description: 代运营场景下第三方应用调用该接口推送相关信息，例如车辆信息
     * Summary: 代运营-推送用户授权的相关信息
     */
    public SubmitAuthBusinessDataResponse submitAuthBusinessData(SubmitAuthBusinessDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuthBusinessDataEx(request, headers, runtime);
    }

    /**
     * Description: 代运营场景下第三方应用调用该接口推送相关信息，例如车辆信息
     * Summary: 代运营-推送用户授权的相关信息
     */
    public SubmitAuthBusinessDataResponse submitAuthBusinessDataEx(SubmitAuthBusinessDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.business.data.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuthBusinessDataResponse());
    }

    /**
     * Description: 支持调用该接口上传行驶证照片，返回上传链接
     * Summary: 行驶证上传接口
     */
    public UploadAuthBusinessCardResponse uploadAuthBusinessCard(UploadAuthBusinessCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAuthBusinessCardEx(request, headers, runtime);
    }

    /**
     * Description: 支持调用该接口上传行驶证照片，返回上传链接
     * Summary: 行驶证上传接口
     */
    public UploadAuthBusinessCardResponse uploadAuthBusinessCardEx(UploadAuthBusinessCardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.business.card.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAuthBusinessCardResponse());
    }

    /**
     * Description: 通过指定可验证声明id，获取目标可验证声明链上交易信息，需要可验证声明的拥有者分享声明才可查询，如果没有权限则获取失败。
     * Summary: 获取目标可验证声明链上交易信息
     */
    public QueryAuthVcTransactionResponse queryAuthVcTransaction(QueryAuthVcTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthVcTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 通过指定可验证声明id，获取目标可验证声明链上交易信息，需要可验证声明的拥有者分享声明才可查询，如果没有权限则获取失败。
     * Summary: 获取目标可验证声明链上交易信息
     */
    public QueryAuthVcTransactionResponse queryAuthVcTransactionEx(QueryAuthVcTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.vc.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthVcTransactionResponse());
    }

    /**
     * Description: 代运营场景用户确认授权接口
     * Summary: 代运营用户确认授权接口
     */
    public AuthAuthBusinessUserResponse authAuthBusinessUser(AuthAuthBusinessUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAuthBusinessUserEx(request, headers, runtime);
    }

    /**
     * Description: 代运营场景用户确认授权接口
     * Summary: 代运营用户确认授权接口
     */
    public AuthAuthBusinessUserResponse authAuthBusinessUserEx(AuthAuthBusinessUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.auth.business.user.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAuthBusinessUserResponse());
    }

    /**
     * Description: 通过代理模式为企业创建did
     * Summary: 通过代理模式为企业创建did
     */
    public StartDidCorporateAgentcreateResponse startDidCorporateAgentcreate(StartDidCorporateAgentcreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateAgentcreateEx(request, headers, runtime);
    }

    /**
     * Description: 通过代理模式为企业创建did
     * Summary: 通过代理模式为企业创建did
     */
    public StartDidCorporateAgentcreateResponse startDidCorporateAgentcreateEx(StartDidCorporateAgentcreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.agentcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateAgentcreateResponse());
    }

    /**
     * Description: 通过代理模式为个人创建did
     * Summary: 通过代理模式为个人创建did
     */
    public StartDidPersonAgentcreateResponse startDidPersonAgentcreate(StartDidPersonAgentcreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidPersonAgentcreateEx(request, headers, runtime);
    }

    /**
     * Description: 通过代理模式为个人创建did
     * Summary: 通过代理模式为个人创建did
     */
    public StartDidPersonAgentcreateResponse startDidPersonAgentcreateEx(StartDidPersonAgentcreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.agentcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidPersonAgentcreateResponse());
    }

    /**
     * Description: 直接创建自己的企业did
     * Summary: 直接创建自己的企业did
     */
    public StartDidCorporateSelfcreateResponse startDidCorporateSelfcreate(StartDidCorporateSelfcreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateSelfcreateEx(request, headers, runtime);
    }

    /**
     * Description: 直接创建自己的企业did
     * Summary: 直接创建自己的企业did
     */
    public StartDidCorporateSelfcreateResponse startDidCorporateSelfcreateEx(StartDidCorporateSelfcreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.selfcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateSelfcreateResponse());
    }

    /**
     * Description: 直接创建自己的个人did
     * Summary: 直接创建自己的个人did
     */
    public StartDidPersonSelfcreateResponse startDidPersonSelfcreate(StartDidPersonSelfcreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidPersonSelfcreateEx(request, headers, runtime);
    }

    /**
     * Description: 直接创建自己的个人did
     * Summary: 直接创建自己的个人did
     */
    public StartDidPersonSelfcreateResponse startDidPersonSelfcreateEx(StartDidPersonSelfcreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.selfcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidPersonSelfcreateResponse());
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书
     */
    public StartDidVerifiableclaimIssureResponse startDidVerifiableclaimIssure(StartDidVerifiableclaimIssureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVerifiableclaimIssureEx(request, headers, runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书
     */
    public StartDidVerifiableclaimIssureResponse startDidVerifiableclaimIssureEx(StartDidVerifiableclaimIssureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.verifiableclaim.issure.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVerifiableclaimIssureResponse());
    }

    /**
     * Description: 验证可验证声明
     * Summary: 验证可验证声明
     */
    public StartDidVerifiableclaimVerifierResponse startDidVerifiableclaimVerifier(StartDidVerifiableclaimVerifierRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVerifiableclaimVerifierEx(request, headers, runtime);
    }

    /**
     * Description: 验证可验证声明
     * Summary: 验证可验证声明
     */
    public StartDidVerifiableclaimVerifierResponse startDidVerifiableclaimVerifierEx(StartDidVerifiableclaimVerifierRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.verifiableclaim.verifier.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVerifiableclaimVerifierResponse());
    }

    /**
     * Description: 查询did对应的doc
     * Summary: 查询did对应的doc
     */
    public QueryDidDocResponse queryDidDoc(QueryDidDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidDocEx(request, headers, runtime);
    }

    /**
     * Description: 查询did对应的doc
     * Summary: 查询did对应的doc
     */
    public QueryDidDocResponse queryDidDocEx(QueryDidDocRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.doc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidDocResponse());
    }

    /**
     * Description: 更新可验证声明状态
     * Summary: 更新可验证声明状态
     */
    public UpdateDidVerifiableclaimStatusResponse updateDidVerifiableclaimStatus(UpdateDidVerifiableclaimStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidVerifiableclaimStatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新可验证声明状态
     * Summary: 更新可验证声明状态
     */
    public UpdateDidVerifiableclaimStatusResponse updateDidVerifiableclaimStatusEx(UpdateDidVerifiableclaimStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.verifiableclaim.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidVerifiableclaimStatusResponse());
    }

    /**
     * Description: 用户更新扩展字段中的扩展字段
     * Summary: 更新doc service中的扩展字段
     */
    public UpdateDidCorporateExtensionserviceResponse updateDidCorporateExtensionservice(UpdateDidCorporateExtensionserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidCorporateExtensionserviceEx(request, headers, runtime);
    }

    /**
     * Description: 用户更新扩展字段中的扩展字段
     * Summary: 更新doc service中的扩展字段
     */
    public UpdateDidCorporateExtensionserviceResponse updateDidCorporateExtensionserviceEx(UpdateDidCorporateExtensionserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.extensionservice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidCorporateExtensionserviceResponse());
    }

    /**
     * Description: 设置不通租户在DID中的不同扩展字段
     * Summary: 设置不通租户在DID中的不同扩展字段
     */
    public StartDidCorporateCustomerservicetypeResponse startDidCorporateCustomerservicetype(StartDidCorporateCustomerservicetypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateCustomerservicetypeEx(request, headers, runtime);
    }

    /**
     * Description: 设置不通租户在DID中的不同扩展字段
     * Summary: 设置不通租户在DID中的不同扩展字段
     */
    public StartDidCorporateCustomerservicetypeResponse startDidCorporateCustomerservicetypeEx(StartDidCorporateCustomerservicetypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.customerservicetype.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateCustomerservicetypeResponse());
    }

    /**
     * Description: 三要素实名认证
     * Summary: 三要素实名认证
     */
    public StartDidCertificationThreemetaResponse startDidCertificationThreemeta(StartDidCertificationThreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCertificationThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 三要素实名认证
     * Summary: 三要素实名认证
     */
    public StartDidCertificationThreemetaResponse startDidCertificationThreemetaEx(StartDidCertificationThreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.certification.threemeta.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCertificationThreemetaResponse());
    }

    /**
     * Description: 二要素实名认证
     * Summary: 二要素实名认证
     */
    public StartDidCertificationTwometaResponse startDidCertificationTwometa(StartDidCertificationTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCertificationTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 二要素实名认证
     * Summary: 二要素实名认证
     */
    public StartDidCertificationTwometaResponse startDidCertificationTwometaEx(StartDidCertificationTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.certification.twometa.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCertificationTwometaResponse());
    }

    /**
     * Description: 通过vcid查询vc内容
     * Summary: 通过vcid查询vc内容
     */
    public QueryDidVcResponse queryDidVc(QueryDidVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidVcEx(request, headers, runtime);
    }

    /**
     * Description: 通过vcid查询vc内容
     * Summary: 通过vcid查询vc内容
     */
    public QueryDidVcResponse queryDidVcEx(QueryDidVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidVcResponse());
    }

    /**
     * Description: 开始实人认证
     * Summary: 开始实人认证
     */
    public StartDidIdentificationFaceauthResponse startDidIdentificationFaceauth(StartDidIdentificationFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 开始实人认证
     * Summary: 开始实人认证
     */
    public StartDidIdentificationFaceauthResponse startDidIdentificationFaceauthEx(StartDidIdentificationFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.identification.faceauth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidIdentificationFaceauthResponse());
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     */
    public QueryDidIdentificationFaceauthResponse queryDidIdentificationFaceauth(QueryDidIdentificationFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     */
    public QueryDidIdentificationFaceauthResponse queryDidIdentificationFaceauthEx(QueryDidIdentificationFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidIdentificationFaceauthResponse());
    }

    /**
     * Description: 用户通过该接口订阅自己关心的did事件
     * Summary: 订阅did事件服务
     */
    public StartDidNotificationConsumerResponse startDidNotificationConsumer(StartDidNotificationConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidNotificationConsumerEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过该接口订阅自己关心的did事件
     * Summary: 订阅did事件服务
     */
    public StartDidNotificationConsumerResponse startDidNotificationConsumerEx(StartDidNotificationConsumerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.notification.consumer.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidNotificationConsumerResponse());
    }

    /**
     * Description: 消费端在重启，或者需要重新拉之前的信息，需要调用这个接口重新注册
     * Summary: 消费端重新启动
     */
    public RebootDidNotificationConsumerResponse rebootDidNotificationConsumer(RebootDidNotificationConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebootDidNotificationConsumerEx(request, headers, runtime);
    }

    /**
     * Description: 消费端在重启，或者需要重新拉之前的信息，需要调用这个接口重新注册
     * Summary: 消费端重新启动
     */
    public RebootDidNotificationConsumerResponse rebootDidNotificationConsumerEx(RebootDidNotificationConsumerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.notification.consumer.reboot", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RebootDidNotificationConsumerResponse());
    }

    /**
     * Description: 向Dis申请DID号
     * Summary: 非托管模式下创建DID时，申请ID
     */
    public InitDidCorporateDirectResponse initDidCorporateDirect(InitDidCorporateDirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDidCorporateDirectEx(request, headers, runtime);
    }

    /**
     * Description: 向Dis申请DID号
     * Summary: 非托管模式下创建DID时，申请ID
     */
    public InitDidCorporateDirectResponse initDidCorporateDirectEx(InitDidCorporateDirectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.direct.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDidCorporateDirectResponse());
    }

    /**
     * Description: 推送或者更新did doc
     * Summary: 推送或者更新did doc
     */
    public PushDidCorporateDirectResponse pushDidCorporateDirect(PushDidCorporateDirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDidCorporateDirectEx(request, headers, runtime);
    }

    /**
     * Description: 推送或者更新did doc
     * Summary: 推送或者更新did doc
     */
    public PushDidCorporateDirectResponse pushDidCorporateDirectEx(PushDidCorporateDirectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.direct.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushDidCorporateDirectResponse());
    }

    /**
     * Description: 企业申请did
     * Summary: 申请did
     */
    public InitDidCorporateIdentityResponse initDidCorporateIdentity(InitDidCorporateIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDidCorporateIdentityEx(request, headers, runtime);
    }

    /**
     * Description: 企业申请did
     * Summary: 申请did
     */
    public InitDidCorporateIdentityResponse initDidCorporateIdentityEx(InitDidCorporateIdentityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.identity.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDidCorporateIdentityResponse());
    }

    /**
     * Description: 对authchallenge进行响应
     * Summary: 对authchallenge进行响应
     */
    public StartDidAgentChallengeresponseResponse startDidAgentChallengeresponse(StartDidAgentChallengeresponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidAgentChallengeresponseEx(request, headers, runtime);
    }

    /**
     * Description: 对authchallenge进行响应
     * Summary: 对authchallenge进行响应
     */
    public StartDidAgentChallengeresponseResponse startDidAgentChallengeresponseEx(StartDidAgentChallengeresponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.agent.challengeresponse.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidAgentChallengeresponseResponse());
    }

    /**
     * Description: 验证Auth Response有效性接口
     * Summary: 验证Auth Response有效性
     */
    public StartDidAgentVerifyauthresponseResponse startDidAgentVerifyauthresponse(StartDidAgentVerifyauthresponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidAgentVerifyauthresponseEx(request, headers, runtime);
    }

    /**
     * Description: 验证Auth Response有效性接口
     * Summary: 验证Auth Response有效性
     */
    public StartDidAgentVerifyauthresponseResponse startDidAgentVerifyauthresponseEx(StartDidAgentVerifyauthresponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.agent.verifyauthresponse.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidAgentVerifyauthresponseResponse());
    }

    /**
     * Description: 脱敏身份验证
     * Summary: 脱敏身份验证
     */
    public StartDidCertificationMaskResponse startDidCertificationMask(StartDidCertificationMaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCertificationMaskEx(request, headers, runtime);
    }

    /**
     * Description: 脱敏身份验证
     * Summary: 脱敏身份验证
     */
    public StartDidCertificationMaskResponse startDidCertificationMaskEx(StartDidCertificationMaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.certification.mask.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCertificationMaskResponse());
    }

    /**
     * Description: 管理员为租户开通did服务
     * Summary: 管理员为租户开通did服务
     */
    public OpenDidAdminServiceResponse openDidAdminService(OpenDidAdminServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openDidAdminServiceEx(request, headers, runtime);
    }

    /**
     * Description: 管理员为租户开通did服务
     * Summary: 管理员为租户开通did服务
     */
    public OpenDidAdminServiceResponse openDidAdminServiceEx(OpenDidAdminServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.admin.service.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenDidAdminServiceResponse());
    }

    /**
     * Description: 针对指定租户关闭dis服务
     * Summary: 针对指定租户关闭dis服务
     */
    public StopDidAdminServiceResponse stopDidAdminService(StopDidAdminServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopDidAdminServiceEx(request, headers, runtime);
    }

    /**
     * Description: 针对指定租户关闭dis服务
     * Summary: 针对指定租户关闭dis服务
     */
    public StopDidAdminServiceResponse stopDidAdminServiceEx(StopDidAdminServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.admin.service.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopDidAdminServiceResponse());
    }

    /**
     * Description: 为被托管人进行代理签名
     * Summary: 为被托管人进行代理签名
     */
    public StartDidSignatureAgentResponse startDidSignatureAgent(StartDidSignatureAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidSignatureAgentEx(request, headers, runtime);
    }

    /**
     * Description: 为被托管人进行代理签名
     * Summary: 为被托管人进行代理签名
     */
    public StartDidSignatureAgentResponse startDidSignatureAgentEx(StartDidSignatureAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.signature.agent.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidSignatureAgentResponse());
    }

    /**
     * Description: 对字符串进行验签
     * Summary: 对字符串进行验签
     */
    public CheckDidSignResponse checkDidSign(CheckDidSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkDidSignEx(request, headers, runtime);
    }

    /**
     * Description: 对字符串进行验签
     * Summary: 对字符串进行验签
     */
    public CheckDidSignResponse checkDidSignEx(CheckDidSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.sign.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckDidSignResponse());
    }

    /**
     * Description: 根据用户指定路径，展示部分可见的声明，并可以被验证
     * Summary: 根据用户指定路径，展示部分可见声明
     */
    public StartDidZkpverifiableclaimVisibilityResponse startDidZkpverifiableclaimVisibility(StartDidZkpverifiableclaimVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidZkpverifiableclaimVisibilityEx(request, headers, runtime);
    }

    /**
     * Description: 根据用户指定路径，展示部分可见的声明，并可以被验证
     * Summary: 根据用户指定路径，展示部分可见声明
     */
    public StartDidZkpverifiableclaimVisibilityResponse startDidZkpverifiableclaimVisibilityEx(StartDidZkpverifiableclaimVisibilityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.zkpverifiableclaim.visibility.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidZkpverifiableclaimVisibilityResponse());
    }

    /**
     * Description: 为指定did添加外键关联，该接口必须被did自己调用或者did的认证密钥管理人调用。
     * Summary: 为指定did添加外键关联
     */
    public StartDidAgentSidekeyResponse startDidAgentSidekey(StartDidAgentSidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidAgentSidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 为指定did添加外键关联，该接口必须被did自己调用或者did的认证密钥管理人调用。
     * Summary: 为指定did添加外键关联
     */
    public StartDidAgentSidekeyResponse startDidAgentSidekeyEx(StartDidAgentSidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.agent.sidekey.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidAgentSidekeyResponse());
    }

    /**
     * Description: 为指定did更新外键关联，该接口必须被did自己调用或者did的认证密钥管理人调用。
     * Summary: 更新指定did的外键
     */
    public UpdateDidAgentSidekeyResponse updateDidAgentSidekey(UpdateDidAgentSidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidAgentSidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 为指定did更新外键关联，该接口必须被did自己调用或者did的认证密钥管理人调用。
     * Summary: 更新指定did的外键
     */
    public UpdateDidAgentSidekeyResponse updateDidAgentSidekeyEx(UpdateDidAgentSidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.agent.sidekey.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidAgentSidekeyResponse());
    }

    /**
     * Description: 代理创建did并创建外键
     * Summary: 代理创建did并创建外键
     */
    public StartDidCorporateAgentcreatewithsidekeyResponse startDidCorporateAgentcreatewithsidekey(StartDidCorporateAgentcreatewithsidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateAgentcreatewithsidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 代理创建did并创建外键
     * Summary: 代理创建did并创建外键
     */
    public StartDidCorporateAgentcreatewithsidekeyResponse startDidCorporateAgentcreatewithsidekeyEx(StartDidCorporateAgentcreatewithsidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.agentcreatewithsidekey.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateAgentcreatewithsidekeyResponse());
    }

    /**
     * Description: 更新doc 中的扩展字段并更新外键
     * Summary: 更新doc 中的扩展字段并更新外键
     */
    public UpdateDidCorporateExtensionservicewithsidekeyResponse updateDidCorporateExtensionservicewithsidekey(UpdateDidCorporateExtensionservicewithsidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidCorporateExtensionservicewithsidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 更新doc 中的扩展字段并更新外键
     * Summary: 更新doc 中的扩展字段并更新外键
     */
    public UpdateDidCorporateExtensionservicewithsidekeyResponse updateDidCorporateExtensionservicewithsidekeyEx(UpdateDidCorporateExtensionservicewithsidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.extensionservicewithsidekey.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidCorporateExtensionservicewithsidekeyResponse());
    }

    /**
     * Description: 通过sidekey方式查询对应doc
     * Summary: 通过sidekey方式查询对应doc
     */
    public QueryDidDocSidekeyResponse queryDidDocSidekey(QueryDidDocSidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidDocSidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 通过sidekey方式查询对应doc
     * Summary: 通过sidekey方式查询对应doc
     */
    public QueryDidDocSidekeyResponse queryDidDocSidekeyEx(QueryDidDocSidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.doc.sidekey.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidDocSidekeyResponse());
    }

    /**
     * Description: 代理创建个人did并创建外键
     * Summary: 代理创建个人did并创建外键
     */
    public StartDidPersonAgentcreatewithsidekeyResponse startDidPersonAgentcreatewithsidekey(StartDidPersonAgentcreatewithsidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidPersonAgentcreatewithsidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 代理创建个人did并创建外键
     * Summary: 代理创建个人did并创建外键
     */
    public StartDidPersonAgentcreatewithsidekeyResponse startDidPersonAgentcreatewithsidekeyEx(StartDidPersonAgentcreatewithsidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.agentcreatewithsidekey.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidPersonAgentcreatewithsidekeyResponse());
    }

    /**
     * Description: 代理创建IOT did
     * Summary: 代理创建IOT did
     */
    public StartDidIotAgentcreateResponse startDidIotAgentcreate(StartDidIotAgentcreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidIotAgentcreateEx(request, headers, runtime);
    }

    /**
     * Description: 代理创建IOT did
     * Summary: 代理创建IOT did
     */
    public StartDidIotAgentcreateResponse startDidIotAgentcreateEx(StartDidIotAgentcreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.iot.agentcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidIotAgentcreateResponse());
    }

    /**
     * Description: 代理创建IOT did并创建外键
     * Summary: 代理创建IOT did并创建外键
     */
    public StartDidIotAgentcreatewithsidekeyResponse startDidIotAgentcreatewithsidekey(StartDidIotAgentcreatewithsidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidIotAgentcreatewithsidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 代理创建IOT did并创建外键
     * Summary: 代理创建IOT did并创建外键
     */
    public StartDidIotAgentcreatewithsidekeyResponse startDidIotAgentcreatewithsidekeyEx(StartDidIotAgentcreatewithsidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.iot.agentcreatewithsidekey.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidIotAgentcreatewithsidekeyResponse());
    }

    /**
     * Description: 更新IOT类did的扩展字段并更新外键
     * Summary: 更新IOT类did的扩展字段并更新外键
     */
    public UpdateDidIotExtensionservicewithsidekeyResponse updateDidIotExtensionservicewithsidekey(UpdateDidIotExtensionservicewithsidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidIotExtensionservicewithsidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 更新IOT类did的扩展字段并更新外键
     * Summary: 更新IOT类did的扩展字段并更新外键
     */
    public UpdateDidIotExtensionservicewithsidekeyResponse updateDidIotExtensionservicewithsidekeyEx(UpdateDidIotExtensionservicewithsidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.iot.extensionservicewithsidekey.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidIotExtensionservicewithsidekeyResponse());
    }

    /**
     * Description: 更新个人did中的扩展字段并更新外键
     * Summary: 更新个人did中的扩展字段并更新外键
     */
    public UpdateDidPersonExtensionservicewithsidekeyResponse updateDidPersonExtensionservicewithsidekey(UpdateDidPersonExtensionservicewithsidekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidPersonExtensionservicewithsidekeyEx(request, headers, runtime);
    }

    /**
     * Description: 更新个人did中的扩展字段并更新外键
     * Summary: 更新个人did中的扩展字段并更新外键
     */
    public UpdateDidPersonExtensionservicewithsidekeyResponse updateDidPersonExtensionservicewithsidekeyEx(UpdateDidPersonExtensionservicewithsidekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.extensionservicewithsidekey.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidPersonExtensionservicewithsidekeyResponse());
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did
     */
    public CreateDidPersonWiththreemetaResponse createDidPersonWiththreemeta(CreateDidPersonWiththreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonWiththreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did
     */
    public CreateDidPersonWiththreemetaResponse createDidPersonWiththreemetaEx(CreateDidPersonWiththreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withthreemeta.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonWiththreemetaResponse());
    }

    /**
     * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
     * Summary: 通过企业三要素验证后创建企业did
     */
    public CreateDidCorporateWiththreemetaResponse createDidCorporateWiththreemeta(CreateDidCorporateWiththreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidCorporateWiththreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
     * Summary: 通过企业三要素验证后创建企业did
     */
    public CreateDidCorporateWiththreemetaResponse createDidCorporateWiththreemetaEx(CreateDidCorporateWiththreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.withthreemeta.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidCorporateWiththreemetaResponse());
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
    支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储
     */
    public StartDidVcrepositoryIssueResponse startDidVcrepositoryIssue(StartDidVcrepositoryIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryIssueEx(request, headers, runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
    支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储
     */
    public StartDidVcrepositoryIssueResponse startDidVcrepositoryIssueEx(StartDidVcrepositoryIssueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.issue.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryIssueResponse());
    }

    /**
     * Description: 通过提供verifiable_claim_id来读取目标VC内容，如果调用方不知道目标VC的verifiable_claim_id，则通过配置目标VC的subject_did、issuer_did 和 过滤字段来查询并读取。
    如果调用者不在目标VC的授权名单中，则无法读取目标VC内容。
     * Summary: 读取目标证书数据
     */
    public StartDidVcrepositoryReadResponse startDidVcrepositoryRead(StartDidVcrepositoryReadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryReadEx(request, headers, runtime);
    }

    /**
     * Description: 通过提供verifiable_claim_id来读取目标VC内容，如果调用方不知道目标VC的verifiable_claim_id，则通过配置目标VC的subject_did、issuer_did 和 过滤字段来查询并读取。
    如果调用者不在目标VC的授权名单中，则无法读取目标VC内容。
     * Summary: 读取目标证书数据
     */
    public StartDidVcrepositoryReadResponse startDidVcrepositoryReadEx(StartDidVcrepositoryReadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.read.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryReadResponse());
    }

    /**
     * Description: 调用者需是目标VC的拥有者，也就是目标VC内容中的subject。
    授权新的did读取目标VC的权限。
     * Summary: 对已有vc新增授权did
     */
    public StartDidVcrepositoryAuthResponse startDidVcrepositoryAuth(StartDidVcrepositoryAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryAuthEx(request, headers, runtime);
    }

    /**
     * Description: 调用者需是目标VC的拥有者，也就是目标VC内容中的subject。
    授权新的did读取目标VC的权限。
     * Summary: 对已有vc新增授权did
     */
    public StartDidVcrepositoryAuthResponse startDidVcrepositoryAuthEx(StartDidVcrepositoryAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.auth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryAuthResponse());
    }

    /**
     * Description: 通过配置目标VC的subject_did 和 过滤字段来查询并读取。
    如果调用者不在目标VC的授权名单中，则无法读取目标VC内容。
     * Summary: 查询过滤并读取目标证书数据
     */
    public StartDidVcrepositoryFilterandreadResponse startDidVcrepositoryFilterandread(StartDidVcrepositoryFilterandreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryFilterandreadEx(request, headers, runtime);
    }

    /**
     * Description: 通过配置目标VC的subject_did 和 过滤字段来查询并读取。
    如果调用者不在目标VC的授权名单中，则无法读取目标VC内容。
     * Summary: 查询过滤并读取目标证书数据
     */
    public StartDidVcrepositoryFilterandreadResponse startDidVcrepositoryFilterandreadEx(StartDidVcrepositoryFilterandreadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.filterandread.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryFilterandreadResponse());
    }

    /**
     * Description: 通过提供verifiable_claim_id来读取目标VC内容，如果调用者不在目标VC的授权名单中，则无法读取目标VC内容。
    注意通常verifiable_claim_id是“vc:mychain:”为前缀。
     * Summary: 通过vcid读取目标证书数据
     */
    public StartDidVcrepositoryReadwithvcidResponse startDidVcrepositoryReadwithvcid(StartDidVcrepositoryReadwithvcidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryReadwithvcidEx(request, headers, runtime);
    }

    /**
     * Description: 通过提供verifiable_claim_id来读取目标VC内容，如果调用者不在目标VC的授权名单中，则无法读取目标VC内容。
    注意通常verifiable_claim_id是“vc:mychain:”为前缀。
     * Summary: 通过vcid读取目标证书数据
     */
    public StartDidVcrepositoryReadwithvcidResponse startDidVcrepositoryReadwithvcidEx(StartDidVcrepositoryReadwithvcidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.readwithvcid.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryReadwithvcidResponse());
    }

    /**
     * Description: 如果业务方在颁发证书VC时，使用了自定义的verifiable_claim_id，则使用此id来读取目标证书内容。
    注意：通常自定义的verifiable_claim_id，不是“vc:mychain:”前缀开始。
     * Summary: 通过自定义id读取目标证书内容
     */
    public StartDidVcrepositoryReadwithdefineidResponse startDidVcrepositoryReadwithdefineid(StartDidVcrepositoryReadwithdefineidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryReadwithdefineidEx(request, headers, runtime);
    }

    /**
     * Description: 如果业务方在颁发证书VC时，使用了自定义的verifiable_claim_id，则使用此id来读取目标证书内容。
    注意：通常自定义的verifiable_claim_id，不是“vc:mychain:”前缀开始。
     * Summary: 通过自定义id读取目标证书内容
     */
    public StartDidVcrepositoryReadwithdefineidResponse startDidVcrepositoryReadwithdefineidEx(StartDidVcrepositoryReadwithdefineidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.readwithdefineid.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryReadwithdefineidResponse());
    }

    /**
     * Description: 通过提供verifiable_claim_id来找到目标VC内容并追加授权did列表，只有调用者是目标VC的subject才能操作。 注意通常verifiable_claim_id是“vc:mychain:”为前缀。
     * Summary: 通过vcid对目标证书追加授权
     */
    public StartDidVcrepositoryAuthwithvcidResponse startDidVcrepositoryAuthwithvcid(StartDidVcrepositoryAuthwithvcidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryAuthwithvcidEx(request, headers, runtime);
    }

    /**
     * Description: 通过提供verifiable_claim_id来找到目标VC内容并追加授权did列表，只有调用者是目标VC的subject才能操作。 注意通常verifiable_claim_id是“vc:mychain:”为前缀。
     * Summary: 通过vcid对目标证书追加授权
     */
    public StartDidVcrepositoryAuthwithvcidResponse startDidVcrepositoryAuthwithvcidEx(StartDidVcrepositoryAuthwithvcidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.authwithvcid.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryAuthwithvcidResponse());
    }

    /**
     * Description: 通过提供业务方自定义id来找到目标VC内容并追加授权did列表，只有调用者是目标VC的subject才能操作。 注意通常自定义id不是“vc:mychain:”前缀。
     * Summary: 通过自定义id对目标证书追加授权
     */
    public StartDidVcrepositoryAuthwithdefineidResponse startDidVcrepositoryAuthwithdefineid(StartDidVcrepositoryAuthwithdefineidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryAuthwithdefineidEx(request, headers, runtime);
    }

    /**
     * Description: 通过提供业务方自定义id来找到目标VC内容并追加授权did列表，只有调用者是目标VC的subject才能操作。 注意通常自定义id不是“vc:mychain:”前缀。
     * Summary: 通过自定义id对目标证书追加授权
     */
    public StartDidVcrepositoryAuthwithdefineidResponse startDidVcrepositoryAuthwithdefineidEx(StartDidVcrepositoryAuthwithdefineidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.authwithdefineid.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryAuthwithdefineidResponse());
    }

    /**
     * Description: 注册自定义的服务类型，目前只有租户did可以调用
     * Summary: 注册自定义服务类型
     */
    public StartDidAgentServicetypeResponse startDidAgentServicetype(StartDidAgentServicetypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidAgentServicetypeEx(request, headers, runtime);
    }

    /**
     * Description: 注册自定义的服务类型，目前只有租户did可以调用
     * Summary: 注册自定义服务类型
     */
    public StartDidAgentServicetypeResponse startDidAgentServicetypeEx(StartDidAgentServicetypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.agent.servicetype.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidAgentServicetypeResponse());
    }

    /**
     * Description: 查询指定服务类型的定义，不支持全量查询
     * Summary: 查询指定服务类型的定义
     */
    public QueryDidAgentServicetypeResponse queryDidAgentServicetype(QueryDidAgentServicetypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidAgentServicetypeEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定服务类型的定义，不支持全量查询
     * Summary: 查询指定服务类型的定义
     */
    public QueryDidAgentServicetypeResponse queryDidAgentServicetypeEx(QueryDidAgentServicetypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.agent.servicetype.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidAgentServicetypeResponse());
    }

    /**
     * Description: 代理模式下更新企业did doc中service中的字段
     * Summary: 代理更新企业did中的services
     */
    public UpdateDidServicesResponse updateDidServices(UpdateDidServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidServicesEx(request, headers, runtime);
    }

    /**
     * Description: 代理模式下更新企业did doc中service中的字段
     * Summary: 代理更新企业did中的services
     */
    public UpdateDidServicesResponse updateDidServicesEx(UpdateDidServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.services.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidServicesResponse());
    }

    /**
     * Description: 服务发现
     * Summary: 服务发现
     */
    public QueryDidAgentServicediscoveryResponse queryDidAgentServicediscovery(QueryDidAgentServicediscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidAgentServicediscoveryEx(request, headers, runtime);
    }

    /**
     * Description: 服务发现
     * Summary: 服务发现
     */
    public QueryDidAgentServicediscoveryResponse queryDidAgentServicediscoveryEx(QueryDidAgentServicediscoveryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.agent.servicediscovery.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidAgentServicediscoveryResponse());
    }

    /**
     * Description: 为指定did颁发证书,并将保存到对应仓库
     * Summary: 为指定did颁发证书,并将保存到对应仓库
     */
    public StartDidVerifiableclaimIssuerandsaveResponse startDidVerifiableclaimIssuerandsave(StartDidVerifiableclaimIssuerandsaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVerifiableclaimIssuerandsaveEx(request, headers, runtime);
    }

    /**
     * Description: 为指定did颁发证书,并将保存到对应仓库
     * Summary: 为指定did颁发证书,并将保存到对应仓库
     */
    public StartDidVerifiableclaimIssuerandsaveResponse startDidVerifiableclaimIssuerandsaveEx(StartDidVerifiableclaimIssuerandsaveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.verifiableclaim.issuerandsave.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVerifiableclaimIssuerandsaveResponse());
    }

    /**
     * Description: 通过agent代理通过VC Repo进行VC传输
     * Summary: 通过agent代理进行VC传输
     */
    public StartDidVcrepositoryVctransmitResponse startDidVcrepositoryVctransmit(StartDidVcrepositoryVctransmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryVctransmitEx(request, headers, runtime);
    }

    /**
     * Description: 通过agent代理通过VC Repo进行VC传输
     * Summary: 通过agent代理进行VC传输
     */
    public StartDidVcrepositoryVctransmitResponse startDidVcrepositoryVctransmitEx(StartDidVcrepositoryVctransmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.vctransmit.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryVctransmitResponse());
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did
     */
    public CreateDidPersonWithtwometaResponse createDidPersonWithtwometa(CreateDidPersonWithtwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonWithtwometaEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did
     */
    public CreateDidPersonWithtwometaResponse createDidPersonWithtwometaEx(CreateDidPersonWithtwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withtwometa.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonWithtwometaResponse());
    }

    /**
     * Description: 通过企业二要素验证后创建企业did
     * Summary: 通过企业二要素验证后创建企业did
     */
    public CreateDidCorporateWithtwometaResponse createDidCorporateWithtwometa(CreateDidCorporateWithtwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidCorporateWithtwometaEx(request, headers, runtime);
    }

    /**
     * Description: 通过企业二要素验证后创建企业did
     * Summary: 通过企业二要素验证后创建企业did
     */
    public CreateDidCorporateWithtwometaResponse createDidCorporateWithtwometaEx(CreateDidCorporateWithtwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.withtwometa.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidCorporateWithtwometaResponse());
    }

    /**
     * Description: 通过企业四要素验证后创建企业did
     * Summary: 通过企业四要素验证后创建企业did
     */
    public CreateDidCorporateWithfourmetaResponse createDidCorporateWithfourmeta(CreateDidCorporateWithfourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidCorporateWithfourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 通过企业四要素验证后创建企业did
     * Summary: 通过企业四要素验证后创建企业did
     */
    public CreateDidCorporateWithfourmetaResponse createDidCorporateWithfourmetaEx(CreateDidCorporateWithfourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.withfourmeta.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidCorporateWithfourmetaResponse());
    }

    /**
     * Description: 通过个人四要素验证后创建个人did
     * Summary: 通过个人四要素验证后创建个人did
     */
    public CreateDidPersonWithfourmetaResponse createDidPersonWithfourmeta(CreateDidPersonWithfourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonWithfourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人四要素验证后创建个人did
     * Summary: 通过个人四要素验证后创建个人did
     */
    public CreateDidPersonWithfourmetaResponse createDidPersonWithfourmetaEx(CreateDidPersonWithfourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withfourmeta.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonWithfourmetaResponse());
    }

    /**
     * Description: 对did进行企业二要素实名认证
     * Summary: 对did进行企业二要素实名认证
     */
    public StartDidCorporateTwometaResponse startDidCorporateTwometa(StartDidCorporateTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 对did进行企业二要素实名认证
     * Summary: 对did进行企业二要素实名认证
     */
    public StartDidCorporateTwometaResponse startDidCorporateTwometaEx(StartDidCorporateTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.twometa.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateTwometaResponse());
    }

    /**
     * Description: 对did进行企业三要素实名认证
     * Summary: 对did进行企业三要素实名认证
     */
    public StartDidCorporateThreemetaResponse startDidCorporateThreemeta(StartDidCorporateThreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 对did进行企业三要素实名认证
     * Summary: 对did进行企业三要素实名认证
     */
    public StartDidCorporateThreemetaResponse startDidCorporateThreemetaEx(StartDidCorporateThreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.threemeta.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateThreemetaResponse());
    }

    /**
     * Description: 对did进行企业四要素实名认证
     * Summary: 对did进行企业四要素实名认证
     */
    public StartDidCorporateFourmetaResponse startDidCorporateFourmeta(StartDidCorporateFourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 对did进行企业四要素实名认证
     * Summary: 对did进行企业四要素实名认证
     */
    public StartDidCorporateFourmetaResponse startDidCorporateFourmetaEx(StartDidCorporateFourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.fourmeta.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateFourmetaResponse());
    }

    /**
     * Description: 四要素实名认证
     * Summary: 四要素实名认证
     */
    public StartDidCertificationFourmetaResponse startDidCertificationFourmeta(StartDidCertificationFourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCertificationFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 四要素实名认证
     * Summary: 四要素实名认证
     */
    public StartDidCertificationFourmetaResponse startDidCertificationFourmetaEx(StartDidCertificationFourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.certification.fourmeta.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCertificationFourmetaResponse());
    }

    /**
     * Description: 模糊查询VC列表
     * Summary: 模糊查询vc
     */
    public QueryDidVcrepositoryFuzzyquerywithdefinedidResponse queryDidVcrepositoryFuzzyquerywithdefinedid(QueryDidVcrepositoryFuzzyquerywithdefinedidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidVcrepositoryFuzzyquerywithdefinedidEx(request, headers, runtime);
    }

    /**
     * Description: 模糊查询VC列表
     * Summary: 模糊查询vc
     */
    public QueryDidVcrepositoryFuzzyquerywithdefinedidResponse queryDidVcrepositoryFuzzyquerywithdefinedidEx(QueryDidVcrepositoryFuzzyquerywithdefinedidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.fuzzyquerywithdefinedid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidVcrepositoryFuzzyquerywithdefinedidResponse());
    }

    /**
     * Description: 通过代理模式为普通账号创建did
     * Summary: 通过代理模式为普通账号创建did
     */
    public StartDidCommonAgentcreateResponse startDidCommonAgentcreate(StartDidCommonAgentcreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCommonAgentcreateEx(request, headers, runtime);
    }

    /**
     * Description: 通过代理模式为普通账号创建did
     * Summary: 通过代理模式为普通账号创建did
     */
    public StartDidCommonAgentcreateResponse startDidCommonAgentcreateEx(StartDidCommonAgentcreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.common.agentcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCommonAgentcreateResponse());
    }

    /**
     * Description: 企业法人刷脸认证
     * Summary: 企业法人刷脸认证
     */
    public StartDidCorporateFaceauthResponse startDidCorporateFaceauth(StartDidCorporateFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCorporateFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 企业法人刷脸认证
     * Summary: 企业法人刷脸认证
     */
    public StartDidCorporateFaceauthResponse startDidCorporateFaceauthEx(StartDidCorporateFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.faceauth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCorporateFaceauthResponse());
    }

    /**
     * Description: 查询企业法人实人结果
     * Summary: 查询企业法人实人结果
     */
    public QueryDidCorporateFaceauthResponse queryDidCorporateFaceauth(QueryDidCorporateFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidCorporateFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业法人实人结果
     * Summary: 查询企业法人实人结果
     */
    public QueryDidCorporateFaceauthResponse queryDidCorporateFaceauthEx(QueryDidCorporateFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidCorporateFaceauthResponse());
    }

    /**
     * Description: 用户删除不需要的VC
     * Summary: 用户删除不需要的vc
     */
    public DeleteDidVcrepositoryVcResponse deleteDidVcrepositoryVc(DeleteDidVcrepositoryVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDidVcrepositoryVcEx(request, headers, runtime);
    }

    /**
     * Description: 用户删除不需要的VC
     * Summary: 用户删除不需要的vc
     */
    public DeleteDidVcrepositoryVcResponse deleteDidVcrepositoryVcEx(DeleteDidVcrepositoryVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.vc.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDidVcrepositoryVcResponse());
    }

    /**
     * Description:  构造包含零知识 字段的VC
     * Summary: 构造零知识证明的VC
     */
    public StartDidZkpverifiableclaimProofResponse startDidZkpverifiableclaimProof(StartDidZkpverifiableclaimProofRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidZkpverifiableclaimProofEx(request, headers, runtime);
    }

    /**
     * Description:  构造包含零知识 字段的VC
     * Summary: 构造零知识证明的VC
     */
    public StartDidZkpverifiableclaimProofResponse startDidZkpverifiableclaimProofEx(StartDidZkpverifiableclaimProofRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.zkpverifiableclaim.proof.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidZkpverifiableclaimProofResponse());
    }

    /**
     * Description: 验证包含ZKP Proof的VC
     * Summary: 验证包含ZKP Proof的VC
     */
    public VerifyDidZkpverifiableclaimProofResponse verifyDidZkpverifiableclaimProof(VerifyDidZkpverifiableclaimProofRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDidZkpverifiableclaimProofEx(request, headers, runtime);
    }

    /**
     * Description: 验证包含ZKP Proof的VC
     * Summary: 验证包含ZKP Proof的VC
     */
    public VerifyDidZkpverifiableclaimProofResponse verifyDidZkpverifiableclaimProofEx(VerifyDidZkpverifiableclaimProofRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.zkpverifiableclaim.proof.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyDidZkpverifiableclaimProofResponse());
    }

    /**
     * Description: 支持移动端APP的安卓和IOS集成SDK进行刷脸认证，在查询query认证结果通过的情况下创建DID身份。
     * Summary: APP移动端刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfResponse createDidPersonFacevrf(CreateDidPersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 支持移动端APP的安卓和IOS集成SDK进行刷脸认证，在查询query认证结果通过的情况下创建DID身份。
     * Summary: APP移动端刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfResponse createDidPersonFacevrfEx(CreateDidPersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.facevrf.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonFacevrfResponse());
    }

    /**
     * Description: 查询之前发起的实人认证的结果，如果认证通过就创建DID身份并返回。
     * Summary: 查询可信实人认证的结果并创建DID
     */
    public QueryDidPersonFacevrfResponse queryDidPersonFacevrf(QueryDidPersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidPersonFacevrfEx(request, headers, runtime);
    }

    /**
     * Description: 查询之前发起的实人认证的结果，如果认证通过就创建DID身份并返回。
     * Summary: 查询可信实人认证的结果并创建DID
     */
    public QueryDidPersonFacevrfResponse queryDidPersonFacevrfEx(QueryDidPersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.facevrf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidPersonFacevrfResponse());
    }

    /**
     * Description: h5或者小程序刷脸认证成功后创建DID
     * Summary: h5或者小程序刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfminiappResponse createDidPersonFacevrfminiapp(CreateDidPersonFacevrfminiappRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonFacevrfminiappEx(request, headers, runtime);
    }

    /**
     * Description: h5或者小程序刷脸认证成功后创建DID
     * Summary: h5或者小程序刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfminiappResponse createDidPersonFacevrfminiappEx(CreateDidPersonFacevrfminiappRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.facevrfminiapp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonFacevrfminiappResponse());
    }

    /**
     * Description: 查询之前发起的实人认证的结果，如果认证通过就创建DID身份并返回。
     * Summary: 查询小程序刷脸的结果并创建DID
     */
    public QueryDidPersonFacevrfminiappResponse queryDidPersonFacevrfminiapp(QueryDidPersonFacevrfminiappRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidPersonFacevrfminiappEx(request, headers, runtime);
    }

    /**
     * Description: 查询之前发起的实人认证的结果，如果认证通过就创建DID身份并返回。
     * Summary: 查询小程序刷脸的结果并创建DID
     */
    public QueryDidPersonFacevrfminiappResponse queryDidPersonFacevrfminiappEx(QueryDidPersonFacevrfminiappRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.facevrfminiapp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidPersonFacevrfminiappResponse());
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。 支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储（新商品）
     */
    public StartDidVcrepositoryIssuenewocpResponse startDidVcrepositoryIssuenewocp(StartDidVcrepositoryIssuenewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVcrepositoryIssuenewocpEx(request, headers, runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。 支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储（新商品）
     */
    public StartDidVcrepositoryIssuenewocpResponse startDidVcrepositoryIssuenewocpEx(StartDidVcrepositoryIssuenewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.issuenewocp.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVcrepositoryIssuenewocpResponse());
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书（新商品）
     */
    public StartDidVerifiableclaimIssurenewocpResponse startDidVerifiableclaimIssurenewocp(StartDidVerifiableclaimIssurenewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidVerifiableclaimIssurenewocpEx(request, headers, runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书（新商品）
     */
    public StartDidVerifiableclaimIssurenewocpResponse startDidVerifiableclaimIssurenewocpEx(StartDidVerifiableclaimIssurenewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.verifiableclaim.issurenewocp.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidVerifiableclaimIssurenewocpResponse());
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did（新）
     */
    public CreateDidPersonWithtwometanewocpResponse createDidPersonWithtwometanewocp(CreateDidPersonWithtwometanewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonWithtwometanewocpEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did（新）
     */
    public CreateDidPersonWithtwometanewocpResponse createDidPersonWithtwometanewocpEx(CreateDidPersonWithtwometanewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withtwometanewocp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonWithtwometanewocpResponse());
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did（新）
     */
    public CreateDidPersonWiththreemetanewocpResponse createDidPersonWiththreemetanewocp(CreateDidPersonWiththreemetanewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonWiththreemetanewocpEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did（新）
     */
    public CreateDidPersonWiththreemetanewocpResponse createDidPersonWiththreemetanewocpEx(CreateDidPersonWiththreemetanewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withthreemetanewocp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonWiththreemetanewocpResponse());
    }

    /**
     * Description: 开始实人认证
     * Summary: 开始实人认证（新商品）
     */
    public StartDidIdentificationFaceauthnewocpResponse startDidIdentificationFaceauthnewocp(StartDidIdentificationFaceauthnewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidIdentificationFaceauthnewocpEx(request, headers, runtime);
    }

    /**
     * Description: 开始实人认证
     * Summary: 开始实人认证（新商品）
     */
    public StartDidIdentificationFaceauthnewocpResponse startDidIdentificationFaceauthnewocpEx(StartDidIdentificationFaceauthnewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.identification.faceauthnewocp.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidIdentificationFaceauthnewocpResponse());
    }

    /**
     * Description: 支持移动端APP的安卓和IOS集成SDK进行刷脸认证，在查询query认证结果通过的情况下创建DID身份。
     * Summary: APP移动端刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfnewocpResponse createDidPersonFacevrfnewocp(CreateDidPersonFacevrfnewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonFacevrfnewocpEx(request, headers, runtime);
    }

    /**
     * Description: 支持移动端APP的安卓和IOS集成SDK进行刷脸认证，在查询query认证结果通过的情况下创建DID身份。
     * Summary: APP移动端刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfnewocpResponse createDidPersonFacevrfnewocpEx(CreateDidPersonFacevrfnewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.facevrfnewocp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonFacevrfnewocpResponse());
    }

    /**
     * Description: h5或者小程序刷脸认证成功后创建DID（新个人刷脸商品）
     * Summary: h5或者小程序刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfminiappnewocpResponse createDidPersonFacevrfminiappnewocp(CreateDidPersonFacevrfminiappnewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidPersonFacevrfminiappnewocpEx(request, headers, runtime);
    }

    /**
     * Description: h5或者小程序刷脸认证成功后创建DID（新个人刷脸商品）
     * Summary: h5或者小程序刷脸认证成功后创建DID
     */
    public CreateDidPersonFacevrfminiappnewocpResponse createDidPersonFacevrfminiappnewocpEx(CreateDidPersonFacevrfminiappnewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.facevrfminiappnewocp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidPersonFacevrfminiappnewocpResponse());
    }

    /**
     * Description: 三要素实名认证（新商品）
     * Summary: 三要素实名认证
     */
    public StartDidCertificationThreemetanewocpResponse startDidCertificationThreemetanewocp(StartDidCertificationThreemetanewocpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidCertificationThreemetanewocpEx(request, headers, runtime);
    }

    /**
     * Description: 三要素实名认证（新商品）
     * Summary: 三要素实名认证
     */
    public StartDidCertificationThreemetanewocpResponse startDidCertificationThreemetanewocpEx(StartDidCertificationThreemetanewocpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.certification.threemetanewocp.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidCertificationThreemetanewocpResponse());
    }

    /**
     * Description: 迁移did至aldaba链
     * Summary: 迁移did至aldaba链
     */
    public ImportDidAldabaResponse importDidAldaba(ImportDidAldabaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDidAldabaEx(request, headers, runtime);
    }

    /**
     * Description: 迁移did至aldaba链
     * Summary: 迁移did至aldaba链
     */
    public ImportDidAldabaResponse importDidAldabaEx(ImportDidAldabaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.aldaba.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDidAldabaResponse());
    }

    /**
     * Description: 端上密钥生成did，但不doc上链
     * Summary: 端上密钥生成did
     */
    public CreateDidDtxPersonResponse createDidDtxPerson(CreateDidDtxPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidDtxPersonEx(request, headers, runtime);
    }

    /**
     * Description: 端上密钥生成did，但不doc上链
     * Summary: 端上密钥生成did
     */
    public CreateDidDtxPersonResponse createDidDtxPersonEx(CreateDidDtxPersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.dtx.person.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidDtxPersonResponse());
    }

    /**
     * Description: 添加端上密钥，并上链
     * Summary: 添加端上密钥
     */
    public AddDidDtxPkResponse addDidDtxPk(AddDidDtxPkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDidDtxPkEx(request, headers, runtime);
    }

    /**
     * Description: 添加端上密钥，并上链
     * Summary: 添加端上密钥
     */
    public AddDidDtxPkResponse addDidDtxPkEx(AddDidDtxPkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.dtx.pk.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDidDtxPkResponse());
    }

    /**
     * Description: 端上密钥颁发vc
     * Summary: 端上密钥颁发vc
     */
    public CreateDidDtxVcResponse createDidDtxVc(CreateDidDtxVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidDtxVcEx(request, headers, runtime);
    }

    /**
     * Description: 端上密钥颁发vc
     * Summary: 端上密钥颁发vc
     */
    public CreateDidDtxVcResponse createDidDtxVcEx(CreateDidDtxVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.dtx.vc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidDtxVcResponse());
    }

    /**
     * Description: 数据隐私服务合作方入驻接口
     * Summary: 数据隐私服务合作方入驻接口
     */
    public StartMydidcommunAgencySettleinResponse startMydidcommunAgencySettlein(StartMydidcommunAgencySettleinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencySettleinEx(request, headers, runtime);
    }

    /**
     * Description: 数据隐私服务合作方入驻接口
     * Summary: 数据隐私服务合作方入驻接口
     */
    public StartMydidcommunAgencySettleinResponse startMydidcommunAgencySettleinEx(StartMydidcommunAgencySettleinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.settlein.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencySettleinResponse());
    }

    /**
     * Description: 数据隐私服务合作机构选择tapp接口
     * Summary: 数据隐私服务合作机构选择tapp接口
     */
    public StartMydidcommunAgencyChoicetappResponse startMydidcommunAgencyChoicetapp(StartMydidcommunAgencyChoicetappRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyChoicetappEx(request, headers, runtime);
    }

    /**
     * Description: 数据隐私服务合作机构选择tapp接口
     * Summary: 数据隐私服务合作机构选择tapp接口
     */
    public StartMydidcommunAgencyChoicetappResponse startMydidcommunAgencyChoicetappEx(StartMydidcommunAgencyChoicetappRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.choicetapp.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyChoicetappResponse());
    }

    /**
     * Description: 数据隐私服务合作机构下个人用户入驻接口
     * Summary: 数据隐私服务合作机构下个人用户入驻接口
     */
    public StartMydidcommunAgencyuserPersonjoinResponse startMydidcommunAgencyuserPersonjoin(StartMydidcommunAgencyuserPersonjoinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyuserPersonjoinEx(request, headers, runtime);
    }

    /**
     * Description: 数据隐私服务合作机构下个人用户入驻接口
     * Summary: 数据隐私服务合作机构下个人用户入驻接口
     */
    public StartMydidcommunAgencyuserPersonjoinResponse startMydidcommunAgencyuserPersonjoinEx(StartMydidcommunAgencyuserPersonjoinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agencyuser.personjoin.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyuserPersonjoinResponse());
    }

    /**
     * Description: 数据隐私服务合作机构下企业用户入驻接口
     * Summary: 数据隐私服务合作机构下企业用户入驻接口
     */
    public StartMydidcommunAgencyuserCorporatejoinResponse startMydidcommunAgencyuserCorporatejoin(StartMydidcommunAgencyuserCorporatejoinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyuserCorporatejoinEx(request, headers, runtime);
    }

    /**
     * Description: 数据隐私服务合作机构下企业用户入驻接口
     * Summary: 数据隐私服务合作机构下企业用户入驻接口
     */
    public StartMydidcommunAgencyuserCorporatejoinResponse startMydidcommunAgencyuserCorporatejoinEx(StartMydidcommunAgencyuserCorporatejoinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agencyuser.corporatejoin.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyuserCorporatejoinResponse());
    }

    /**
     * Description: 更新doc service接口
     * Summary: 更新doc service接口
     */
    public UpdateMydidcommunAgencyDocResponse updateMydidcommunAgencyDoc(UpdateMydidcommunAgencyDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMydidcommunAgencyDocEx(request, headers, runtime);
    }

    /**
     * Description: 更新doc service接口
     * Summary: 更新doc service接口
     */
    public UpdateMydidcommunAgencyDocResponse updateMydidcommunAgencyDocEx(UpdateMydidcommunAgencyDocRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.doc.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMydidcommunAgencyDocResponse());
    }

    /**
     * Description: 主动发起数据传输流程请求
     * Summary: 主动发起数据安全传输流程
     */
    public StartMydidcommunAgencyDatatransmitstartResponse startMydidcommunAgencyDatatransmitstart(StartMydidcommunAgencyDatatransmitstartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyDatatransmitstartEx(request, headers, runtime);
    }

    /**
     * Description: 主动发起数据传输流程请求
     * Summary: 主动发起数据安全传输流程
     */
    public StartMydidcommunAgencyDatatransmitstartResponse startMydidcommunAgencyDatatransmitstartEx(StartMydidcommunAgencyDatatransmitstartRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.datatransmitstart.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyDatatransmitstartResponse());
    }

    /**
     * Description: 继续触发主动发起数据安全传输流程
     * Summary: 继续触发主动发起数据安全传输流程
     */
    public StartMydidcommunAgencyDatatransmitcontinueResponse startMydidcommunAgencyDatatransmitcontinue(StartMydidcommunAgencyDatatransmitcontinueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyDatatransmitcontinueEx(request, headers, runtime);
    }

    /**
     * Description: 继续触发主动发起数据安全传输流程
     * Summary: 继续触发主动发起数据安全传输流程
     */
    public StartMydidcommunAgencyDatatransmitcontinueResponse startMydidcommunAgencyDatatransmitcontinueEx(StartMydidcommunAgencyDatatransmitcontinueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.datatransmitcontinue.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyDatatransmitcontinueResponse());
    }

    /**
     * Description: 主动发起申请数据资产的流程
     * Summary: 主动发起申请数据资产的流程
     */
    public StartMydidcommunAgencyDataapplicationResponse startMydidcommunAgencyDataapplication(StartMydidcommunAgencyDataapplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyDataapplicationEx(request, headers, runtime);
    }

    /**
     * Description: 主动发起申请数据资产的流程
     * Summary: 主动发起申请数据资产的流程
     */
    public StartMydidcommunAgencyDataapplicationResponse startMydidcommunAgencyDataapplicationEx(StartMydidcommunAgencyDataapplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.dataapplication.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyDataapplicationResponse());
    }

    /**
     * Description: 据隐私服务合作机构选择多个tapp接口
     * Summary: 据隐私服务合作机构选择多个tapp接口
     */
    public StartMydidcommunAgencyChoicetapplistResponse startMydidcommunAgencyChoicetapplist(StartMydidcommunAgencyChoicetapplistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyChoicetapplistEx(request, headers, runtime);
    }

    /**
     * Description: 据隐私服务合作机构选择多个tapp接口
     * Summary: 据隐私服务合作机构选择多个tapp接口
     */
    public StartMydidcommunAgencyChoicetapplistResponse startMydidcommunAgencyChoicetapplistEx(StartMydidcommunAgencyChoicetapplistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.choicetapplist.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyChoicetapplistResponse());
    }

    /**
     * Description: 定义数据资产审批流程
     * Summary: 定义数据资产审批流程
     */
    public StartMydidcommunAgencyDataassertregisterResponse startMydidcommunAgencyDataassertregister(StartMydidcommunAgencyDataassertregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyDataassertregisterEx(request, headers, runtime);
    }

    /**
     * Description: 定义数据资产审批流程
     * Summary: 定义数据资产审批流程
     */
    public StartMydidcommunAgencyDataassertregisterResponse startMydidcommunAgencyDataassertregisterEx(StartMydidcommunAgencyDataassertregisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.dataassertregister.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyDataassertregisterResponse());
    }

    /**
     * Description: 发起数据授权
     * Summary: 发起数据授权
     */
    public StartMydidcommunAgencyAuthResponse startMydidcommunAgencyAuth(StartMydidcommunAgencyAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyAuthEx(request, headers, runtime);
    }

    /**
     * Description: 发起数据授权
     * Summary: 发起数据授权
     */
    public StartMydidcommunAgencyAuthResponse startMydidcommunAgencyAuthEx(StartMydidcommunAgencyAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.auth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyAuthResponse());
    }

    /**
     * Description: 处理授权流程
     * Summary: 处理授权流程
     */
    public StartMydidcommunAgencyProcessauthResponse startMydidcommunAgencyProcessauth(StartMydidcommunAgencyProcessauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunAgencyProcessauthEx(request, headers, runtime);
    }

    /**
     * Description: 处理授权流程
     * Summary: 处理授权流程
     */
    public StartMydidcommunAgencyProcessauthResponse startMydidcommunAgencyProcessauthEx(StartMydidcommunAgencyProcessauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.processauth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunAgencyProcessauthResponse());
    }

    /**
     * Description: 查询授权当前状态
     * Summary: 查询授权当前状态
     */
    public QueryMydidcommunAgencyProcessauthResponse queryMydidcommunAgencyProcessauth(QueryMydidcommunAgencyProcessauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMydidcommunAgencyProcessauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询授权当前状态
     * Summary: 查询授权当前状态
     */
    public QueryMydidcommunAgencyProcessauthResponse queryMydidcommunAgencyProcessauthEx(QueryMydidcommunAgencyProcessauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.processauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMydidcommunAgencyProcessauthResponse());
    }

    /**
     * Description: 通过serviceType查找其对应信息
     * Summary: 通过serviceType查找其对应信息
     */
    public QueryMydidcommunAgencyServicetypeinfoResponse queryMydidcommunAgencyServicetypeinfo(QueryMydidcommunAgencyServicetypeinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMydidcommunAgencyServicetypeinfoEx(request, headers, runtime);
    }

    /**
     * Description: 通过serviceType查找其对应信息
     * Summary: 通过serviceType查找其对应信息
     */
    public QueryMydidcommunAgencyServicetypeinfoResponse queryMydidcommunAgencyServicetypeinfoEx(QueryMydidcommunAgencyServicetypeinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.servicetypeinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMydidcommunAgencyServicetypeinfoResponse());
    }

    /**
     * Description: 查询任务执行结果文件
     * Summary: 查询任务执行结果文件
     */
    public QueryMydidcommunAgencyTaskresultfileResponse queryMydidcommunAgencyTaskresultfile(QueryMydidcommunAgencyTaskresultfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMydidcommunAgencyTaskresultfileEx(request, headers, runtime);
    }

    /**
     * Description: 查询任务执行结果文件
     * Summary: 查询任务执行结果文件
     */
    public QueryMydidcommunAgencyTaskresultfileResponse queryMydidcommunAgencyTaskresultfileEx(QueryMydidcommunAgencyTaskresultfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.agency.taskresultfile.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMydidcommunAgencyTaskresultfileResponse());
    }

    /**
     * Description: 任务执行 - 为目标用户申请某一服务类型的调用权限
     * Summary: 服务类型权限申请
     */
    public ApplyMydidcommunTaskServicetypeResponse applyMydidcommunTaskServicetype(ApplyMydidcommunTaskServicetypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyMydidcommunTaskServicetypeEx(request, headers, runtime);
    }

    /**
     * Description: 任务执行 - 为目标用户申请某一服务类型的调用权限
     * Summary: 服务类型权限申请
     */
    public ApplyMydidcommunTaskServicetypeResponse applyMydidcommunTaskServicetypeEx(ApplyMydidcommunTaskServicetypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.task.servicetype.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyMydidcommunTaskServicetypeResponse());
    }

    /**
     * Description: 通过任务Id获取任务执行结果
     * Summary: 获取任务执行结果
     */
    public GetMydidcommunTaskTaskresultResponse getMydidcommunTaskTaskresult(GetMydidcommunTaskTaskresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMydidcommunTaskTaskresultEx(request, headers, runtime);
    }

    /**
     * Description: 通过任务Id获取任务执行结果
     * Summary: 获取任务执行结果
     */
    public GetMydidcommunTaskTaskresultResponse getMydidcommunTaskTaskresultEx(GetMydidcommunTaskTaskresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.task.taskresult.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMydidcommunTaskTaskresultResponse());
    }

    /**
     * Description: 注册数据资产
     * Summary: 添加数据资产
     */
    public AddMydidcommunAssetDataResponse addMydidcommunAssetData(AddMydidcommunAssetDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMydidcommunAssetDataEx(request, headers, runtime);
    }

    /**
     * Description: 注册数据资产
     * Summary: 添加数据资产
     */
    public AddMydidcommunAssetDataResponse addMydidcommunAssetDataEx(AddMydidcommunAssetDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.asset.data.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddMydidcommunAssetDataResponse());
    }

    /**
     * Description: 开始获取数据任务流程
     * Summary: 执行获取数据接口
     */
    public StartMydidcommunTaskGetdataResponse startMydidcommunTaskGetdata(StartMydidcommunTaskGetdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunTaskGetdataEx(request, headers, runtime);
    }

    /**
     * Description: 开始获取数据任务流程
     * Summary: 执行获取数据接口
     */
    public StartMydidcommunTaskGetdataResponse startMydidcommunTaskGetdataEx(StartMydidcommunTaskGetdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.task.getdata.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunTaskGetdataResponse());
    }

    /**
     * Description: 针对线下入驻，或者无法提供四要素的机构入驻
     * Summary: 机构入驻数据隐私服务
     */
    public StartMydidcommunInstitutionSettleinResponse startMydidcommunInstitutionSettlein(StartMydidcommunInstitutionSettleinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidcommunInstitutionSettleinEx(request, headers, runtime);
    }

    /**
     * Description: 针对线下入驻，或者无法提供四要素的机构入驻
     * Summary: 机构入驻数据隐私服务
     */
    public StartMydidcommunInstitutionSettleinResponse startMydidcommunInstitutionSettleinEx(StartMydidcommunInstitutionSettleinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.institution.settlein.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidcommunInstitutionSettleinResponse());
    }

    /**
     * Description: 计算集群 - 部署同步 - 获取一个需要同步的部署任务
     * Summary: 计算集群-部署同步-获取一个需要同步任务
     */
    public GetMydidcommunWorkergroupSyncResponse getMydidcommunWorkergroupSync(GetMydidcommunWorkergroupSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMydidcommunWorkergroupSyncEx(request, headers, runtime);
    }

    /**
     * Description: 计算集群 - 部署同步 - 获取一个需要同步的部署任务
     * Summary: 计算集群-部署同步-获取一个需要同步任务
     */
    public GetMydidcommunWorkergroupSyncResponse getMydidcommunWorkergroupSyncEx(GetMydidcommunWorkergroupSyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.sync.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMydidcommunWorkergroupSyncResponse());
    }

    /**
     * Description: 通过部署ID获取部署详情
     * Summary: 计算集群-部署-获取部署详情
     */
    public GetMydidcommunWorkergroupPodResponse getMydidcommunWorkergroupPod(GetMydidcommunWorkergroupPodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMydidcommunWorkergroupPodEx(request, headers, runtime);
    }

    /**
     * Description: 通过部署ID获取部署详情
     * Summary: 计算集群-部署-获取部署详情
     */
    public GetMydidcommunWorkergroupPodResponse getMydidcommunWorkergroupPodEx(GetMydidcommunWorkergroupPodRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.pod.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMydidcommunWorkergroupPodResponse());
    }

    /**
     * Description: 计算集群-部署同步-设置同步任务完成
     * Summary: 计算集群-部署同步-设置同步任务完成
     */
    public FinishMydidcommunWorkergroupSyncResponse finishMydidcommunWorkergroupSync(FinishMydidcommunWorkergroupSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishMydidcommunWorkergroupSyncEx(request, headers, runtime);
    }

    /**
     * Description: 计算集群-部署同步-设置同步任务完成
     * Summary: 计算集群-部署同步-设置同步任务完成
     */
    public FinishMydidcommunWorkergroupSyncResponse finishMydidcommunWorkergroupSyncEx(FinishMydidcommunWorkergroupSyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.sync.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishMydidcommunWorkergroupSyncResponse());
    }

    /**
     * Description: 计算集群-部署同步-获取TAPP部署详情
     * Summary: 计算集群-TAPP-获取TAPP部署
     */
    public GetMydidcommunWorkergroupTappResponse getMydidcommunWorkergroupTapp(GetMydidcommunWorkergroupTappRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMydidcommunWorkergroupTappEx(request, headers, runtime);
    }

    /**
     * Description: 计算集群-部署同步-获取TAPP部署详情
     * Summary: 计算集群-TAPP-获取TAPP部署
     */
    public GetMydidcommunWorkergroupTappResponse getMydidcommunWorkergroupTappEx(GetMydidcommunWorkergroupTappRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.tapp.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMydidcommunWorkergroupTappResponse());
    }

    /**
     * Description: 更新TAPP部署的信息，包括公钥哈希等
     * Summary: 计算集群-TAPP-更新TAPP信息
     */
    public UpdateMydidcommunWorkergroupTappResponse updateMydidcommunWorkergroupTapp(UpdateMydidcommunWorkergroupTappRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMydidcommunWorkergroupTappEx(request, headers, runtime);
    }

    /**
     * Description: 更新TAPP部署的信息，包括公钥哈希等
     * Summary: 计算集群-TAPP-更新TAPP信息
     */
    public UpdateMydidcommunWorkergroupTappResponse updateMydidcommunWorkergroupTappEx(UpdateMydidcommunWorkergroupTappRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.tapp.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMydidcommunWorkergroupTappResponse());
    }

    /**
     * Description: 获取工作流的所有在线版本的配置
     * Summary: 计算集群-工作流-获取工作流配置
     */
    public QueryMydidcommunWorkergroupWorkflowResponse queryMydidcommunWorkergroupWorkflow(QueryMydidcommunWorkergroupWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMydidcommunWorkergroupWorkflowEx(request, headers, runtime);
    }

    /**
     * Description: 获取工作流的所有在线版本的配置
     * Summary: 计算集群-工作流-获取工作流配置
     */
    public QueryMydidcommunWorkergroupWorkflowResponse queryMydidcommunWorkergroupWorkflowEx(QueryMydidcommunWorkergroupWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.workflow.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMydidcommunWorkergroupWorkflowResponse());
    }

    /**
     * Description: 同步集群状态
     * Summary: 计算集群-集群-同步集群状态
     */
    public SyncMydidcommunWorkergroupGroupResponse syncMydidcommunWorkergroupGroup(SyncMydidcommunWorkergroupGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncMydidcommunWorkergroupGroupEx(request, headers, runtime);
    }

    /**
     * Description: 同步集群状态
     * Summary: 计算集群-集群-同步集群状态
     */
    public SyncMydidcommunWorkergroupGroupResponse syncMydidcommunWorkergroupGroupEx(SyncMydidcommunWorkergroupGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.group.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncMydidcommunWorkergroupGroupResponse());
    }

    /**
     * Description: 计算集群-部署版本-获取版本列表
     * Summary: 计算集群-部署版本-获取版本列表
     */
    public ListMydidcommunWorkergroupPodversionResponse listMydidcommunWorkergroupPodversion(ListMydidcommunWorkergroupPodversionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMydidcommunWorkergroupPodversionEx(request, headers, runtime);
    }

    /**
     * Description: 计算集群-部署版本-获取版本列表
     * Summary: 计算集群-部署版本-获取版本列表
     */
    public ListMydidcommunWorkergroupPodversionResponse listMydidcommunWorkergroupPodversionEx(ListMydidcommunWorkergroupPodversionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydidcommun.workergroup.podversion.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMydidcommunWorkergroupPodversionResponse());
    }

    /**
     * Description: did创建
     * Summary: did创建
     */
    public SaveMydidIdaasDidserviceResponse saveMydidIdaasDidservice(SaveMydidIdaasDidserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveMydidIdaasDidserviceEx(request, headers, runtime);
    }

    /**
     * Description: did创建
     * Summary: did创建
     */
    public SaveMydidIdaasDidserviceResponse saveMydidIdaasDidserviceEx(SaveMydidIdaasDidserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydid.idaas.didservice.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveMydidIdaasDidserviceResponse());
    }

    /**
     * Description: 消息端主动拉取did event
     * Summary: 消息端主动拉取did event
     */
    public QueryDidNotificationDideventResponse queryDidNotificationDidevent(QueryDidNotificationDideventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidNotificationDideventEx(request, headers, runtime);
    }

    /**
     * Description: 消息端主动拉取did event
     * Summary: 消息端主动拉取did event
     */
    public QueryDidNotificationDideventResponse queryDidNotificationDideventEx(QueryDidNotificationDideventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.notification.didevent.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidNotificationDideventResponse());
    }

    /**
     * Description: 主动拉取vc事件
     * Summary: 主动拉取vc事件
     */
    public QueryDidNotificationVceventResponse queryDidNotificationVcevent(QueryDidNotificationVceventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidNotificationVceventEx(request, headers, runtime);
    }

    /**
     * Description: 主动拉取vc事件
     * Summary: 主动拉取vc事件
     */
    public QueryDidNotificationVceventResponse queryDidNotificationVceventEx(QueryDidNotificationVceventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.notification.vcevent.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidNotificationVceventResponse());
    }

    /**
     * Description: 获取did全量数据
     * Summary: 获取did全量数据
     */
    public QueryDidNotificationFulldidResponse queryDidNotificationFulldid(QueryDidNotificationFulldidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidNotificationFulldidEx(request, headers, runtime);
    }

    /**
     * Description: 获取did全量数据
     * Summary: 获取did全量数据
     */
    public QueryDidNotificationFulldidResponse queryDidNotificationFulldidEx(QueryDidNotificationFulldidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.notification.fulldid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidNotificationFulldidResponse());
    }

    /**
     * Description: 非托管模式下创建企业did账户
     * Summary: 非托管模式下创建企业did账户
     */
    public CreateDidIdentityCorporateResponse createDidIdentityCorporate(CreateDidIdentityCorporateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidIdentityCorporateEx(request, headers, runtime);
    }

    /**
     * Description: 非托管模式下创建企业did账户
     * Summary: 非托管模式下创建企业did账户
     */
    public CreateDidIdentityCorporateResponse createDidIdentityCorporateEx(CreateDidIdentityCorporateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.identity.corporate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidIdentityCorporateResponse());
    }

    /**
     * Description: 计算上链交易hash
     * Summary: add did doc上链交易hash
     */
    public InitDidAdddidHashResponse initDidAdddidHash(InitDidAdddidHashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDidAdddidHashEx(request, headers, runtime);
    }

    /**
     * Description: 计算上链交易hash
     * Summary: add did doc上链交易hash
     */
    public InitDidAdddidHashResponse initDidAdddidHashEx(InitDidAdddidHashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.adddid.hash.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDidAdddidHashResponse());
    }

    /**
     * Description: 将diddoc写入DIS链
     * Summary: 将diddoc写入DIS链
     */
    public StartDidAdddidExecuteResponse startDidAdddidExecute(StartDidAdddidExecuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidAdddidExecuteEx(request, headers, runtime);
    }

    /**
     * Description: 将diddoc写入DIS链
     * Summary: 将diddoc写入DIS链
     */
    public StartDidAdddidExecuteResponse startDidAdddidExecuteEx(StartDidAdddidExecuteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.adddid.execute.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidAdddidExecuteResponse());
    }

    /**
     * Description: 可验证声明上链之前计算其hash
     * Summary: 可验证声明上链之前计算其hash
     */
    public InitDidAddvcHashResponse initDidAddvcHash(InitDidAddvcHashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDidAddvcHashEx(request, headers, runtime);
    }

    /**
     * Description: 可验证声明上链之前计算其hash
     * Summary: 可验证声明上链之前计算其hash
     */
    public InitDidAddvcHashResponse initDidAddvcHashEx(InitDidAddvcHashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.addvc.hash.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDidAddvcHashResponse());
    }

    /**
     * Description: 实际执行可验证声明上链
     * Summary: 实际执行可验证声明上链
     */
    public StartDidAddvcExecuteResponse startDidAddvcExecute(StartDidAddvcExecuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidAddvcExecuteEx(request, headers, runtime);
    }

    /**
     * Description: 实际执行可验证声明上链
     * Summary: 实际执行可验证声明上链
     */
    public StartDidAddvcExecuteResponse startDidAddvcExecuteEx(StartDidAddvcExecuteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.addvc.execute.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidAddvcExecuteResponse());
    }

    /**
     * Description: 计算更新VC状态交易hash
     * Summary: 计算更新VC状态交易hash
     */
    public InitDidUpdatevcstatusHashResponse initDidUpdatevcstatusHash(InitDidUpdatevcstatusHashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDidUpdatevcstatusHashEx(request, headers, runtime);
    }

    /**
     * Description: 计算更新VC状态交易hash
     * Summary: 计算更新VC状态交易hash
     */
    public InitDidUpdatevcstatusHashResponse initDidUpdatevcstatusHashEx(InitDidUpdatevcstatusHashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatevcstatus.hash.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDidUpdatevcstatusHashResponse());
    }

    /**
     * Description: 更新VC状态
     * Summary: 更新VC状态
     */
    public StartDidUpdatevcstatusExecuteResponse startDidUpdatevcstatusExecute(StartDidUpdatevcstatusExecuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidUpdatevcstatusExecuteEx(request, headers, runtime);
    }

    /**
     * Description: 更新VC状态
     * Summary: 更新VC状态
     */
    public StartDidUpdatevcstatusExecuteResponse startDidUpdatevcstatusExecuteEx(StartDidUpdatevcstatusExecuteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatevcstatus.execute.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidUpdatevcstatusExecuteResponse());
    }

    /**
     * Description: 计算更新did交易hash
     * Summary: 计算更新did交易hash
     */
    public InitDidUpdatedidHashResponse initDidUpdatedidHash(InitDidUpdatedidHashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDidUpdatedidHashEx(request, headers, runtime);
    }

    /**
     * Description: 计算更新did交易hash
     * Summary: 计算更新did交易hash
     */
    public InitDidUpdatedidHashResponse initDidUpdatedidHashEx(InitDidUpdatedidHashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.hash.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDidUpdatedidHashResponse());
    }

    /**
     * Description: 更新did
     * Summary: 更新did
     */
    public StartDidUpdatedidExecuteResponse startDidUpdatedidExecute(StartDidUpdatedidExecuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidUpdatedidExecuteEx(request, headers, runtime);
    }

    /**
     * Description: 更新did
     * Summary: 更新did
     */
    public StartDidUpdatedidExecuteResponse startDidUpdatedidExecuteEx(StartDidUpdatedidExecuteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.execute.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidUpdatedidExecuteResponse());
    }

    /**
     * Description: 非托管查询did doc
     * Summary: 非托管查询did doc
     */
    public QueryDidDiddocDirectResponse queryDidDiddocDirect(QueryDidDiddocDirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidDiddocDirectEx(request, headers, runtime);
    }

    /**
     * Description: 非托管查询did doc
     * Summary: 非托管查询did doc
     */
    public QueryDidDiddocDirectResponse queryDidDiddocDirectEx(QueryDidDiddocDirectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.diddoc.direct.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidDiddocDirectResponse());
    }

    /**
     * Description: 非托管查询可验证声明
     * Summary: 非托管查询可验证声明
     */
    public QueryDidVcDirectResponse queryDidVcDirect(QueryDidVcDirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDidVcDirectEx(request, headers, runtime);
    }

    /**
     * Description: 非托管查询可验证声明
     * Summary: 非托管查询可验证声明
     */
    public QueryDidVcDirectResponse queryDidVcDirectEx(QueryDidVcDirectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vc.direct.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDidVcDirectResponse());
    }

    /**
     * Description: 非托管模式下创建个人did账户
     * Summary: 非托管模式下创建个人did账户
     */
    public CreateDidIdentityPersonResponse createDidIdentityPerson(CreateDidIdentityPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidIdentityPersonEx(request, headers, runtime);
    }

    /**
     * Description: 非托管模式下创建个人did账户
     * Summary: 非托管模式下创建个人did账户
     */
    public CreateDidIdentityPersonResponse createDidIdentityPersonEx(CreateDidIdentityPersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.identity.person.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidIdentityPersonResponse());
    }

    /**
     * Description: 非托管模式更新did doc中的auth key
     * Summary: 非托管模式更新doc中的auth key
     */
    public UpdateDidUpdatedidAuthkeyResponse updateDidUpdatedidAuthkey(UpdateDidUpdatedidAuthkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidUpdatedidAuthkeyEx(request, headers, runtime);
    }

    /**
     * Description: 非托管模式更新did doc中的auth key
     * Summary: 非托管模式更新doc中的auth key
     */
    public UpdateDidUpdatedidAuthkeyResponse updateDidUpdatedidAuthkeyEx(UpdateDidUpdatedidAuthkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.authkey.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidUpdatedidAuthkeyResponse());
    }

    /**
     * Description: 更新did对应did doc中的service信息
     * Summary: 更新did service信息
     */
    public UpdateDidUpdatedidServiceResponse updateDidUpdatedidService(UpdateDidUpdatedidServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidUpdatedidServiceEx(request, headers, runtime);
    }

    /**
     * Description: 更新did对应did doc中的service信息
     * Summary: 更新did service信息
     */
    public UpdateDidUpdatedidServiceResponse updateDidUpdatedidServiceEx(UpdateDidUpdatedidServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.service.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidUpdatedidServiceResponse());
    }

    /**
     * Description: 添加did doc中的service
     * Summary: 添加did doc中的service
     */
    public AddDidUpdatedidServiceResponse addDidUpdatedidService(AddDidUpdatedidServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDidUpdatedidServiceEx(request, headers, runtime);
    }

    /**
     * Description: 添加did doc中的service
     * Summary: 添加did doc中的service
     */
    public AddDidUpdatedidServiceResponse addDidUpdatedidServiceEx(AddDidUpdatedidServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.service.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDidUpdatedidServiceResponse());
    }

    /**
     * Description: 删除did doc中的service信息
     * Summary: 删除did doc中的service信息
     */
    public DeleteDidUpdatedidServiceResponse deleteDidUpdatedidService(DeleteDidUpdatedidServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDidUpdatedidServiceEx(request, headers, runtime);
    }

    /**
     * Description: 删除did doc中的service信息
     * Summary: 删除did doc中的service信息
     */
    public DeleteDidUpdatedidServiceResponse deleteDidUpdatedidServiceEx(DeleteDidUpdatedidServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.service.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDidUpdatedidServiceResponse());
    }

    /**
     * Description: 更新可验证声明状态
     * Summary: 更新可验证声明
     */
    public UpdateDidUpdatevcStatusResponse updateDidUpdatevcStatus(UpdateDidUpdatevcStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidUpdatevcStatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新可验证声明状态
     * Summary: 更新可验证声明
     */
    public UpdateDidUpdatevcStatusResponse updateDidUpdatevcStatusEx(UpdateDidUpdatevcStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatevc.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidUpdatevcStatusResponse());
    }

    /**
     * Description: 开通resolver服务接口
     * Summary: 开通resolver服务接口
     */
    public OpenDidResolverServiceResponse openDidResolverService(OpenDidResolverServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openDidResolverServiceEx(request, headers, runtime);
    }

    /**
     * Description: 开通resolver服务接口
     * Summary: 开通resolver服务接口
     */
    public OpenDidResolverServiceResponse openDidResolverServiceEx(OpenDidResolverServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.resolver.service.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenDidResolverServiceResponse());
    }

    /**
     * Description: 停止resolver服务接口
     * Summary: 停止resolver服务接口
     */
    public StopDidResolverServiceResponse stopDidResolverService(StopDidResolverServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopDidResolverServiceEx(request, headers, runtime);
    }

    /**
     * Description: 停止resolver服务接口
     * Summary: 停止resolver服务接口
     */
    public StopDidResolverServiceResponse stopDidResolverServiceEx(StopDidResolverServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.resolver.service.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopDidResolverServiceResponse());
    }

    /**
     * Description: 使用根DID派生子DID并上链
     * Summary: 派生子DID上链
     */
    public StartDidDerivedidExecuteResponse startDidDerivedidExecute(StartDidDerivedidExecuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDidDerivedidExecuteEx(request, headers, runtime);
    }

    /**
     * Description: 使用根DID派生子DID并上链
     * Summary: 派生子DID上链
     */
    public StartDidDerivedidExecuteResponse startDidDerivedidExecuteEx(StartDidDerivedidExecuteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.derivedid.execute.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDidDerivedidExecuteResponse());
    }

    /**
     * Description: 基于DIS的访问控制授权
     * Summary: 访问控制授权
     */
    public ExecDidAccesscontrolAuthorizeResponse execDidAccesscontrolAuthorize(ExecDidAccesscontrolAuthorizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDidAccesscontrolAuthorizeEx(request, headers, runtime);
    }

    /**
     * Description: 基于DIS的访问控制授权
     * Summary: 访问控制授权
     */
    public ExecDidAccesscontrolAuthorizeResponse execDidAccesscontrolAuthorizeEx(ExecDidAccesscontrolAuthorizeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.accesscontrol.authorize.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDidAccesscontrolAuthorizeResponse());
    }

    /**
     * Description: 对请求的权限进行鉴权，判断是否有该权限
     * Summary: 访问控制鉴权
     */
    public ExecDidAccesscontrolCheckResponse execDidAccesscontrolCheck(ExecDidAccesscontrolCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDidAccesscontrolCheckEx(request, headers, runtime);
    }

    /**
     * Description: 对请求的权限进行鉴权，判断是否有该权限
     * Summary: 访问控制鉴权
     */
    public ExecDidAccesscontrolCheckResponse execDidAccesscontrolCheckEx(ExecDidAccesscontrolCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.accesscontrol.check.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDidAccesscontrolCheckResponse());
    }

    /**
     * Description: 访问控制中更新权限
     * Summary: 对已授权的did更新权限
     */
    public ExecDidAccesscontrolUpdateResponse execDidAccesscontrolUpdate(ExecDidAccesscontrolUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDidAccesscontrolUpdateEx(request, headers, runtime);
    }

    /**
     * Description: 访问控制中更新权限
     * Summary: 对已授权的did更新权限
     */
    public ExecDidAccesscontrolUpdateResponse execDidAccesscontrolUpdateEx(ExecDidAccesscontrolUpdateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.accesscontrol.update.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDidAccesscontrolUpdateResponse());
    }

    /**
     * Description: 非托管模式下为iot创建did
     * Summary: 非托管模式下为iot创建did
     */
    public CreateDidIdentityIotResponse createDidIdentityIot(CreateDidIdentityIotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidIdentityIotEx(request, headers, runtime);
    }

    /**
     * Description: 非托管模式下为iot创建did
     * Summary: 非托管模式下为iot创建did
     */
    public CreateDidIdentityIotResponse createDidIdentityIotEx(CreateDidIdentityIotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.identity.iot.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidIdentityIotResponse());
    }

    /**
     * Description: 非托管模式下的服务类型创建
     * Summary: 非托管模式下的服务类型创建
     */
    public ExecDidServicetypeCreateResponse execDidServicetypeCreate(ExecDidServicetypeCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDidServicetypeCreateEx(request, headers, runtime);
    }

    /**
     * Description: 非托管模式下的服务类型创建
     * Summary: 非托管模式下的服务类型创建
     */
    public ExecDidServicetypeCreateResponse execDidServicetypeCreateEx(ExecDidServicetypeCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.servicetype.create.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDidServicetypeCreateResponse());
    }

    /**
     * Description: 非托管模式下创建普通did账户
     * Summary: 非托管模式下创建普通did账户
     */
    public CreateDidIdentityCommonResponse createDidIdentityCommon(CreateDidIdentityCommonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidIdentityCommonEx(request, headers, runtime);
    }

    /**
     * Description: 非托管模式下创建普通did账户
     * Summary: 非托管模式下创建普通did账户
     */
    public CreateDidIdentityCommonResponse createDidIdentityCommonEx(CreateDidIdentityCommonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.identity.common.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidIdentityCommonResponse());
    }

    /**
     * Description: VC传输确认请求
     * Summary: VC传输确认请求
     */
    public ConfirmVcVcrepoVctransmitResponse confirmVcVcrepoVctransmit(ConfirmVcVcrepoVctransmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmVcVcrepoVctransmitEx(request, headers, runtime);
    }

    /**
     * Description: VC传输确认请求
     * Summary: VC传输确认请求
     */
    public ConfirmVcVcrepoVctransmitResponse confirmVcVcrepoVctransmitEx(ConfirmVcVcrepoVctransmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepo.vctransmit.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmVcVcrepoVctransmitResponse());
    }

    /**
     * Description: 在非托管模式，要先createDid，然后addDoc，两步都完成才实现DID创建。
    如果第一步成功，第二步失败，无法完全回滚，但是第一步createDid已经绑定了一个pubKey，如果调用方重试，并且用了新的pubKey（可能之前绑定的pubKey因为没有走完流程，没有保存，或者没有中间态，继续重试第二步），就无法重试成功。因此需要给这种极端情况一个更新pubKey的机会，但是需要通过recoveryKey鉴权请求变更。
     * Summary: 非托管更新还未上链did的pub key
     */
    public UpdateDidUpdatedidPubkeyResponse updateDidUpdatedidPubkey(UpdateDidUpdatedidPubkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDidUpdatedidPubkeyEx(request, headers, runtime);
    }

    /**
     * Description: 在非托管模式，要先createDid，然后addDoc，两步都完成才实现DID创建。
    如果第一步成功，第二步失败，无法完全回滚，但是第一步createDid已经绑定了一个pubKey，如果调用方重试，并且用了新的pubKey（可能之前绑定的pubKey因为没有走完流程，没有保存，或者没有中间态，继续重试第二步），就无法重试成功。因此需要给这种极端情况一个更新pubKey的机会，但是需要通过recoveryKey鉴权请求变更。
     * Summary: 非托管更新还未上链did的pub key
     */
    public UpdateDidUpdatedidPubkeyResponse updateDidUpdatedidPubkeyEx(UpdateDidUpdatedidPubkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.pubkey.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDidUpdatedidPubkeyResponse());
    }

    /**
     * Description: 一次增加多个service
     * Summary: 一次增加多个service
     */
    public AddDidUpdatedidServicelistResponse addDidUpdatedidServicelist(AddDidUpdatedidServicelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDidUpdatedidServicelistEx(request, headers, runtime);
    }

    /**
     * Description: 一次增加多个service
     * Summary: 一次增加多个service
     */
    public AddDidUpdatedidServicelistResponse addDidUpdatedidServicelistEx(AddDidUpdatedidServicelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.updatedid.servicelist.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDidUpdatedidServicelistResponse());
    }

    /**
     * Description: 存储VC到存储中
     * Summary: 写入VC存储
     */
    public StartVcVcrepositoryWriteResponse startVcVcrepositoryWrite(StartVcVcrepositoryWriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcVcrepositoryWriteEx(request, headers, runtime);
    }

    /**
     * Description: 存储VC到存储中
     * Summary: 写入VC存储
     */
    public StartVcVcrepositoryWriteResponse startVcVcrepositoryWriteEx(StartVcVcrepositoryWriteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepository.write.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcVcrepositoryWriteResponse());
    }

    /**
     * Description: 从VC存储中，读取目标的VC内容，前提是调用者的did已经被授予权限。
    如果VC中claim内容已被加密，返回值的verifiable_claim_content的claim字段是密文，需要使用当前调用者的did对应私钥解密auth_access_key获取AES密钥，然后通过AES密钥解密VC内容。
     * Summary: 从VC存储读取已被授权VC内容
     */
    public StartVcVcrepositoryReadResponse startVcVcrepositoryRead(StartVcVcrepositoryReadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcVcrepositoryReadEx(request, headers, runtime);
    }

    /**
     * Description: 从VC存储中，读取目标的VC内容，前提是调用者的did已经被授予权限。
    如果VC中claim内容已被加密，返回值的verifiable_claim_content的claim字段是密文，需要使用当前调用者的did对应私钥解密auth_access_key获取AES密钥，然后通过AES密钥解密VC内容。
     * Summary: 从VC存储读取已被授权VC内容
     */
    public StartVcVcrepositoryReadResponse startVcVcrepositoryReadEx(StartVcVcrepositoryReadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepository.read.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcVcrepositoryReadResponse());
    }

    /**
     * Description: 对已存在的证书VC进行新增授权管理，批量添加did到授权列表中，授权这些did具有读取VC的权限。
    注意：VC的整体auth_did_list的长度将受限制，目前约定不超过30。
     * Summary: 添加已有证书VC的授权列表
     */
    public StartVcVcrepositoryAuthResponse startVcVcrepositoryAuth(StartVcVcrepositoryAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcVcrepositoryAuthEx(request, headers, runtime);
    }

    /**
     * Description: 对已存在的证书VC进行新增授权管理，批量添加did到授权列表中，授权这些did具有读取VC的权限。
    注意：VC的整体auth_did_list的长度将受限制，目前约定不超过30。
     * Summary: 添加已有证书VC的授权列表
     */
    public StartVcVcrepositoryAuthResponse startVcVcrepositoryAuthEx(StartVcVcrepositoryAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepository.auth.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcVcrepositoryAuthResponse());
    }

    /**
     * Description: vc repo上的用户注册
     * Summary: vc repo 上的用户注册
     */
    public StartVcVcrepoUserResponse startVcVcrepoUser(StartVcVcrepoUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcVcrepoUserEx(request, headers, runtime);
    }

    /**
     * Description: vc repo上的用户注册
     * Summary: vc repo 上的用户注册
     */
    public StartVcVcrepoUserResponse startVcVcrepoUserEx(StartVcVcrepoUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepo.user.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcVcrepoUserResponse());
    }

    /**
     * Description: VC Repo用户信息更新，可以更新公钥，可以更新vc channel
     * Summary: VC Repo用户信息更新
     */
    public UpdateVcVcrepoUserResponse updateVcVcrepoUser(UpdateVcVcrepoUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVcVcrepoUserEx(request, headers, runtime);
    }

    /**
     * Description: VC Repo用户信息更新，可以更新公钥，可以更新vc channel
     * Summary: VC Repo用户信息更新
     */
    public UpdateVcVcrepoUserResponse updateVcVcrepoUserEx(UpdateVcVcrepoUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepo.user.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateVcVcrepoUserResponse());
    }

    /**
     * Description: 指定VC可信传输到指定Verifier
     * Summary: 指定VC可信传输到指定Verifier
     */
    public StartVcVcrepoVctransmitResponse startVcVcrepoVctransmit(StartVcVcrepoVctransmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcVcrepoVctransmitEx(request, headers, runtime);
    }

    /**
     * Description: 指定VC可信传输到指定Verifier
     * Summary: 指定VC可信传输到指定Verifier
     */
    public StartVcVcrepoVctransmitResponse startVcVcrepoVctransmitEx(StartVcVcrepoVctransmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepo.vctransmit.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcVcrepoVctransmitResponse());
    }

    /**
     * Description: 通过controller进行用户注册
     * Summary: 通过controller的用户注册
     */
    public StartVcVcrepoControlleradduserResponse startVcVcrepoControlleradduser(StartVcVcrepoControlleradduserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcVcrepoControlleradduserEx(request, headers, runtime);
    }

    /**
     * Description: 通过controller进行用户注册
     * Summary: 通过controller的用户注册
     */
    public StartVcVcrepoControlleradduserResponse startVcVcrepoControlleradduserEx(StartVcVcrepoControlleradduserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepo.controlleradduser.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcVcrepoControlleradduserResponse());
    }

    /**
     * Description: VC存储
     * Summary: VC存储
     */
    public StartVcVcrepoVccontentsaveResponse startVcVcrepoVccontentsave(StartVcVcrepoVccontentsaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcVcrepoVccontentsaveEx(request, headers, runtime);
    }

    /**
     * Description: VC存储
     * Summary: VC存储
     */
    public StartVcVcrepoVccontentsaveResponse startVcVcrepoVccontentsaveEx(StartVcVcrepoVccontentsaveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepo.vccontentsave.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcVcrepoVccontentsaveResponse());
    }

    /**
     * Description: 根据vcid获取vccontent
     * Summary: 根据vcid获取vccontent
     */
    public StartVcRepoReadwithvcidResponse startVcRepoReadwithvcid(StartVcRepoReadwithvcidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVcRepoReadwithvcidEx(request, headers, runtime);
    }

    /**
     * Description: 根据vcid获取vccontent
     * Summary: 根据vcid获取vccontent
     */
    public StartVcRepoReadwithvcidResponse startVcRepoReadwithvcidEx(StartVcRepoReadwithvcidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.repo.readwithvcid.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVcRepoReadwithvcidResponse());
    }

    /**
     * Description: vc仓库非托管模式下的VC传输初始化接口
     * Summary: vc仓库非托管模式下的VC传输初始化接口
     */
    public InitVcVcrepoVctransmitResponse initVcVcrepoVctransmit(InitVcVcrepoVctransmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initVcVcrepoVctransmitEx(request, headers, runtime);
    }

    /**
     * Description: vc仓库非托管模式下的VC传输初始化接口
     * Summary: vc仓库非托管模式下的VC传输初始化接口
     */
    public InitVcVcrepoVctransmitResponse initVcVcrepoVctransmitEx(InitVcVcrepoVctransmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.vc.vcrepo.vctransmit.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitVcVcrepoVctransmitResponse());
    }

    /**
     * Description: 人脸实人认证初始化接口
     * Summary: 人脸实人认证初始化接口
     */
    public InitIdentificationFaceauthResponse initIdentificationFaceauth(InitIdentificationFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 人脸实人认证初始化接口
     * Summary: 人脸实人认证初始化接口
     */
    public InitIdentificationFaceauthResponse initIdentificationFaceauthEx(InitIdentificationFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIdentificationFaceauthResponse());
    }

    /**
     * Description: 获取人脸实人认证结果
     * Summary: 获取人脸实人认证结果
     */
    public QueryIdentificationFaceauthResponse queryIdentificationFaceauth(QueryIdentificationFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 获取人脸实人认证结果
     * Summary: 获取人脸实人认证结果
     */
    public QueryIdentificationFaceauthResponse queryIdentificationFaceauthEx(QueryIdentificationFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationFaceauthResponse());
    }

    /**
     * Description: 初始化存证事务: 进⾏行行资格核验，包括调⽤用⽅方账号权限，是否实⼈人等。成功后获得存证事务 ID(Token)
     * Summary: 存证交易初始化
     */
    public InitNotaryTransactionResponse initNotaryTransaction(InitNotaryTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initNotaryTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 初始化存证事务: 进⾏行行资格核验，包括调⽤用⽅方账号权限，是否实⼈人等。成功后获得存证事务 ID(Token)
     * Summary: 存证交易初始化
     */
    public InitNotaryTransactionResponse initNotaryTransactionEx(InitNotaryTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.transaction.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitNotaryTransactionResponse());
    }

    /**
     * Description: ⽤用户通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     */
    public GetNotaryTransactionResponse getNotaryTransaction(GetNotaryTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNotaryTransactionEx(request, headers, runtime);
    }

    /**
     * Description: ⽤用户通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     */
    public GetNotaryTransactionResponse getNotaryTransactionEx(GetNotaryTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.transaction.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNotaryTransactionResponse());
    }

    /**
     * Description: 发起⼀个文本存证，将文本内容存证上链。
     * Summary: 发送文本存证
     */
    public SendNotaryTransactionTextResponse sendNotaryTransactionText(SendNotaryTransactionTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendNotaryTransactionTextEx(request, headers, runtime);
    }

    /**
     * Description: 发起⼀个文本存证，将文本内容存证上链。
     * Summary: 发送文本存证
     */
    public SendNotaryTransactionTextResponse sendNotaryTransactionTextEx(SendNotaryTransactionTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.transaction.text.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendNotaryTransactionTextResponse());
    }

    /**
     * Description: ⽤户通过交易易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证
     */
    public GetNotaryTransactionTextResponse getNotaryTransactionText(GetNotaryTransactionTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNotaryTransactionTextEx(request, headers, runtime);
    }

    /**
     * Description: ⽤户通过交易易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证
     */
    public GetNotaryTransactionTextResponse getNotaryTransactionTextEx(GetNotaryTransactionTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.transaction.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNotaryTransactionTextResponse());
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID
     */
    public CreateNotaryTokenResponse createNotaryToken(CreateNotaryTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotaryTokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID
     */
    public CreateNotaryTokenResponse createNotaryTokenEx(CreateNotaryTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotaryTokenResponse());
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     */
    public GetNotaryTransResponse getNotaryTrans(GetNotaryTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNotaryTransEx(request, headers, runtime);
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     */
    public GetNotaryTransResponse getNotaryTransEx(GetNotaryTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.trans.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNotaryTransResponse());
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链
     */
    public CreateNotaryTextResponse createNotaryText(CreateNotaryTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotaryTextEx(request, headers, runtime);
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链
     */
    public CreateNotaryTextResponse createNotaryTextEx(CreateNotaryTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotaryTextResponse());
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     */
    public GetNotaryTextResponse getNotaryText(GetNotaryTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNotaryTextEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     */
    public GetNotaryTextResponse getNotaryTextEx(GetNotaryTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNotaryTextResponse());
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链
     */
    public CreateNotaryFileResponse createNotaryFile(CreateNotaryFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotaryFileEx(request, headers, runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链
     */
    public CreateNotaryFileResponse createNotaryFileEx(CreateNotaryFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotaryFileResponse());
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     */
    public GetNotaryFileResponse getNotaryFile(GetNotaryFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNotaryFileEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     */
    public GetNotaryFileResponse getNotaryFileEx(GetNotaryFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNotaryFileResponse());
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     */
    public CreateNotarySourceResponse createNotarySource(CreateNotarySourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotarySourceEx(request, headers, runtime);
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     */
    public CreateNotarySourceResponse createNotarySourceEx(CreateNotarySourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.source.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotarySourceResponse());
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     */
    public GetNotarySourceResponse getNotarySource(GetNotarySourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNotarySourceEx(request, headers, runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     */
    public GetNotarySourceResponse getNotarySourceEx(GetNotarySourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.source.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNotarySourceResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryNotaryTestResponse queryNotaryTest(QueryNotaryTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryTestEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryNotaryTestResponse queryNotaryTestEx(QueryNotaryTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryTestResponse());
    }

    /**
     * Description: 接口定义 https://yuque.antfin-inc.com/antchain/lqq4qz/pnvo46#52f667ab
     * Summary: 企业法人认证初始化接口
     */
    public InitNotaryOpenapiMerchantResponse initNotaryOpenapiMerchant(InitNotaryOpenapiMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initNotaryOpenapiMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 接口定义 https://yuque.antfin-inc.com/antchain/lqq4qz/pnvo46#52f667ab
     * Summary: 企业法人认证初始化接口
     */
    public InitNotaryOpenapiMerchantResponse initNotaryOpenapiMerchantEx(InitNotaryOpenapiMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.openapi.merchant.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitNotaryOpenapiMerchantResponse());
    }

    /**
     * Description: 企业法人认证查询认证状态
     * Summary: 企业法人认证查询认证状态
     */
    public QueryNotaryOpenapiMerchantResponse queryNotaryOpenapiMerchant(QueryNotaryOpenapiMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryOpenapiMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 企业法人认证查询认证状态
     * Summary: 企业法人认证查询认证状态
     */
    public QueryNotaryOpenapiMerchantResponse queryNotaryOpenapiMerchantEx(QueryNotaryOpenapiMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.openapi.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryOpenapiMerchantResponse());
    }

    /**
     * Description: 为租赁服务平台部署合约
     * Summary: 为租赁服务平台部署合约
     */
    public DeployNotaryLeaseContractResponse deployNotaryLeaseContract(DeployNotaryLeaseContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployNotaryLeaseContractEx(request, headers, runtime);
    }

    /**
     * Description: 为租赁服务平台部署合约
     * Summary: 为租赁服务平台部署合约
     */
    public DeployNotaryLeaseContractResponse deployNotaryLeaseContractEx(DeployNotaryLeaseContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.lease.contract.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployNotaryLeaseContractResponse());
    }

    /**
     * Description: 建站服务信息注册
     * Summary: 服务注册
     */
    public CreateOpenchainWebsitServiceResponse createOpenchainWebsitService(CreateOpenchainWebsitServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOpenchainWebsitServiceEx(request, headers, runtime);
    }

    /**
     * Description: 建站服务信息注册
     * Summary: 服务注册
     */
    public CreateOpenchainWebsitServiceResponse createOpenchainWebsitServiceEx(CreateOpenchainWebsitServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.openchain.websit.service.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOpenchainWebsitServiceResponse());
    }

    /**
     * Description: 可信建站法人四要素认证
     * Summary: 可信建站法人四要素认证
     */
    public CheckOpenchainCorporateFaceResponse checkOpenchainCorporateFace(CheckOpenchainCorporateFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkOpenchainCorporateFaceEx(request, headers, runtime);
    }

    /**
     * Description: 可信建站法人四要素认证
     * Summary: 可信建站法人四要素认证
     */
    public CheckOpenchainCorporateFaceResponse checkOpenchainCorporateFaceEx(CheckOpenchainCorporateFaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.openchain.corporate.face.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckOpenchainCorporateFaceResponse());
    }

    /**
     * Description: 法人认证4要素结果查询
     * Summary: 法人认证4要素结果查询
     */
    public QueryOpenchainCorporateFaceResponse queryOpenchainCorporateFace(QueryOpenchainCorporateFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpenchainCorporateFaceEx(request, headers, runtime);
    }

    /**
     * Description: 法人认证4要素结果查询
     * Summary: 法人认证4要素结果查询
     */
    public QueryOpenchainCorporateFaceResponse queryOpenchainCorporateFaceEx(QueryOpenchainCorporateFaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.openchain.corporate.face.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpenchainCorporateFaceResponse());
    }

    /**
     * Description: 授权用户数据查询
     * Summary: 授权用户数据查询
     */
    public QueryOpenchainUserDataResponse queryOpenchainUserData(QueryOpenchainUserDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOpenchainUserDataEx(request, headers, runtime);
    }

    /**
     * Description: 授权用户数据查询
     * Summary: 授权用户数据查询
     */
    public QueryOpenchainUserDataResponse queryOpenchainUserDataEx(QueryOpenchainUserDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.openchain.user.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOpenchainUserDataResponse());
    }

    /**
     * Description: 三要素验证身份冒用风险
     * Summary: 三要素验证身份冒用风险
     */
    public QueryIdentificationRiskThreemetaResponse queryIdentificationRiskThreemeta(QueryIdentificationRiskThreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationRiskThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 三要素验证身份冒用风险
     * Summary: 三要素验证身份冒用风险
     */
    public QueryIdentificationRiskThreemetaResponse queryIdentificationRiskThreemetaEx(QueryIdentificationRiskThreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.risk.threemeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationRiskThreemetaResponse());
    }

    /**
     * Description: 文本内容安全扫描
     * Summary: 文本内容安全扫描
     */
    public CheckContentRiskTextResponse checkContentRiskText(CheckContentRiskTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkContentRiskTextEx(request, headers, runtime);
    }

    /**
     * Description: 文本内容安全扫描
     * Summary: 文本内容安全扫描
     */
    public CheckContentRiskTextResponse checkContentRiskTextEx(CheckContentRiskTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.content.risk.text.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckContentRiskTextResponse());
    }

    /**
     * Description: 二要素验证身份冒用风险
     * Summary: 二要素验证身份冒用风险
     */
    public QueryIdentificationRiskTwometaResponse queryIdentificationRiskTwometa(QueryIdentificationRiskTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationRiskTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 二要素验证身份冒用风险
     * Summary: 二要素验证身份冒用风险
     */
    public QueryIdentificationRiskTwometaResponse queryIdentificationRiskTwometaEx(QueryIdentificationRiskTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.risk.twometa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationRiskTwometaResponse());
    }

    /**
     * Description: 四要素验证身份冒用风险
     * Summary: 四要素验证身份冒用风险
     */
    public QueryIdentificationRiskFourmetaResponse queryIdentificationRiskFourmeta(QueryIdentificationRiskFourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationRiskFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 四要素验证身份冒用风险
     * Summary: 四要素验证身份冒用风险
     */
    public QueryIdentificationRiskFourmetaResponse queryIdentificationRiskFourmetaEx(QueryIdentificationRiskFourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.risk.fourmeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationRiskFourmetaResponse());
    }

    /**
     * Description: 原生存证接口
     * Summary: 原生存证接口
     */
    public CreateNotaryRawTextResponse createNotaryRawText(CreateNotaryRawTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotaryRawTextEx(request, headers, runtime);
    }

    /**
     * Description: 原生存证接口
     * Summary: 原生存证接口
     */
    public CreateNotaryRawTextResponse createNotaryRawTextEx(CreateNotaryRawTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.raw.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotaryRawTextResponse());
    }

    /**
     * Description: 获取原生存证内容接口
     * Summary: 获取原生存证内容接口
     */
    public GetNotaryRawTextResponse getNotaryRawText(GetNotaryRawTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNotaryRawTextEx(request, headers, runtime);
    }

    /**
     * Description: 获取原生存证内容接口
     * Summary: 获取原生存证内容接口
     */
    public GetNotaryRawTextResponse getNotaryRawTextEx(GetNotaryRawTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.notary.raw.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetNotaryRawTextResponse());
    }

    /**
     * Description: 脱敏身份验证
     * Summary: 脱敏身份验证
     */
    public QueryIdentificationRiskMaskResponse queryIdentificationRiskMask(QueryIdentificationRiskMaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationRiskMaskEx(request, headers, runtime);
    }

    /**
     * Description: 脱敏身份验证
     * Summary: 脱敏身份验证
     */
    public QueryIdentificationRiskMaskResponse queryIdentificationRiskMaskEx(QueryIdentificationRiskMaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.risk.mask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationRiskMaskResponse());
    }

    /**
     * Description: 基于法人实人认证的企业四要素认证
     * Summary: 基于法人实人认证的企业四要素认证
     */
    public InitIdentificationEnterpriseFaceauthResponse initIdentificationEnterpriseFaceauth(InitIdentificationEnterpriseFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIdentificationEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 基于法人实人认证的企业四要素认证
     * Summary: 基于法人实人认证的企业四要素认证
     */
    public InitIdentificationEnterpriseFaceauthResponse initIdentificationEnterpriseFaceauthEx(InitIdentificationEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.enterprise.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIdentificationEnterpriseFaceauthResponse());
    }

    /**
     * Description: 查询企业四要素（实人）认证结果
     * Summary: 查询企业四要素（实人）认证结果
     */
    public QueryIdentificationEnterpriseFaceauthResponse queryIdentificationEnterpriseFaceauth(QueryIdentificationEnterpriseFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业四要素（实人）认证结果
     * Summary: 查询企业四要素（实人）认证结果
     */
    public QueryIdentificationEnterpriseFaceauthResponse queryIdentificationEnterpriseFaceauthEx(QueryIdentificationEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.enterprise.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationEnterpriseFaceauthResponse());
    }

    /**
     * Description: 企业四要素认证
     * Summary: 企业四要素认证
     */
    public QueryIdentificationEnterpriseFourmetaResponse queryIdentificationEnterpriseFourmeta(QueryIdentificationEnterpriseFourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationEnterpriseFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 企业四要素认证
     * Summary: 企业四要素认证
     */
    public QueryIdentificationEnterpriseFourmetaResponse queryIdentificationEnterpriseFourmetaEx(QueryIdentificationEnterpriseFourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.enterprise.fourmeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationEnterpriseFourmetaResponse());
    }

    /**
     * Description: 企业三要素认证（企业名，企业证件号，法人姓名）
     * Summary: 企业三要素认证
     */
    public QueryIdentificationEnterpriseThreemetaResponse queryIdentificationEnterpriseThreemeta(QueryIdentificationEnterpriseThreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationEnterpriseThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 企业三要素认证（企业名，企业证件号，法人姓名）
     * Summary: 企业三要素认证
     */
    public QueryIdentificationEnterpriseThreemetaResponse queryIdentificationEnterpriseThreemetaEx(QueryIdentificationEnterpriseThreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.enterprise.threemeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationEnterpriseThreemetaResponse());
    }

    /**
     * Description: 企业二要素认证（企业名称，企业证件号码）
     * Summary:  企业二要素认证
     */
    public QueryIdentificationEnterpriseTwometaResponse queryIdentificationEnterpriseTwometa(QueryIdentificationEnterpriseTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationEnterpriseTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 企业二要素认证（企业名称，企业证件号码）
     * Summary:  企业二要素认证
     */
    public QueryIdentificationEnterpriseTwometaResponse queryIdentificationEnterpriseTwometaEx(QueryIdentificationEnterpriseTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.identification.enterprise.twometa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationEnterpriseTwometaResponse());
    }

    /**
     * Description: 完成1.三要素认证；2创建did；3.颁发声明（声明该DID已经完成三要素认证）
     * Summary: 三要素认证与did创建接口
     */
    public StartMydidDidThreeelementResponse startMydidDidThreeelement(StartMydidDidThreeelementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMydidDidThreeelementEx(request, headers, runtime);
    }

    /**
     * Description: 完成1.三要素认证；2创建did；3.颁发声明（声明该DID已经完成三要素认证）
     * Summary: 三要素认证与did创建接口
     */
    public StartMydidDidThreeelementResponse startMydidDidThreeelementEx(StartMydidDidThreeelementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.mydid.did.threeelement.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartMydidDidThreeelementResponse());
    }

    /**
     * Description: 查询用户可用的公钥列表
     * Summary: 查询用户可用的公钥列表
     */
    public ListWaasDidValidpublickeysResponse listWaasDidValidpublickeys(ListWaasDidValidpublickeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWaasDidValidpublickeysEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户可用的公钥列表
     * Summary: 查询用户可用的公钥列表
     */
    public ListWaasDidValidpublickeysResponse listWaasDidValidpublickeysEx(ListWaasDidValidpublickeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.waas.did.validpublickeys.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListWaasDidValidpublickeysResponse());
    }

    /**
     * Description: 查询指定公钥信息
     * Summary: 查询指定公钥信息
     */
    public QueryWaasDidPublickeyResponse queryWaasDidPublickey(QueryWaasDidPublickeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWaasDidPublickeyEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定公钥信息
     * Summary: 查询指定公钥信息
     */
    public QueryWaasDidPublickeyResponse queryWaasDidPublickeyEx(QueryWaasDidPublickeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.waas.did.publickey.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWaasDidPublickeyResponse());
    }

    /**
     * Description: 业务注册waas服务
     * Summary: 业务注册waas服务
     */
    public RegisterWaasBusinessResponse registerWaasBusiness(RegisterWaasBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerWaasBusinessEx(request, headers, runtime);
    }

    /**
     * Description: 业务注册waas服务
     * Summary: 业务注册waas服务
     */
    public RegisterWaasBusinessResponse registerWaasBusinessEx(RegisterWaasBusinessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.waas.business.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterWaasBusinessResponse());
    }

    /**
     * Description: 为业务合作方提供查询转账时上链信息，里面包含dcep合约传参
     * Summary: 查询转账上链信息
     */
    public QueryWaasBusinessTransferbodyResponse queryWaasBusinessTransferbody(QueryWaasBusinessTransferbodyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWaasBusinessTransferbodyEx(request, headers, runtime);
    }

    /**
     * Description: 为业务合作方提供查询转账时上链信息，里面包含dcep合约传参
     * Summary: 查询转账上链信息
     */
    public QueryWaasBusinessTransferbodyResponse queryWaasBusinessTransferbodyEx(QueryWaasBusinessTransferbodyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.waas.business.transferbody.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWaasBusinessTransferbodyResponse());
    }

    /**
     * Description: 业务合作方通知订单上链情况
     * Summary: 业务合作方通知订单上链情况
     */
    public NotifyWaasBusinessOrderResponse notifyWaasBusinessOrder(NotifyWaasBusinessOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyWaasBusinessOrderEx(request, headers, runtime);
    }

    /**
     * Description: 业务合作方通知订单上链情况
     * Summary: 业务合作方通知订单上链情况
     */
    public NotifyWaasBusinessOrderResponse notifyWaasBusinessOrderEx(NotifyWaasBusinessOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.waas.business.order.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyWaasBusinessOrderResponse());
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
