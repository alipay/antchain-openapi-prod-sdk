// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.cliproduct.models.*;

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
                    new TeaPair("sdk_version", "1.0.11"),
                    new TeaPair("_prod_code", "CLIPRODUCT"),
                    new TeaPair("_prod_channel", "default")
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
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzzzResponse createBusinessOrderzzz(CreateBusinessOrderzzzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderzzzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzzzResponse createBusinessOrderzzzEx(CreateBusinessOrderzzzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderzzz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderzzzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderpppResponse createBusinessOrderppp(CreateBusinessOrderpppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderpppEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderpppResponse createBusinessOrderpppEx(CreateBusinessOrderpppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderppp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderpppResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApiaCliCreateResponse apiaCliCreate(ApiaCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiaCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApiaCliCreateResponse apiaCliCreateEx(ApiaCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.apia", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiaCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApibCliCreateResponse apibCliCreate(ApibCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apibCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApibCliCreateResponse apibCliCreateEx(ApibCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.apib", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApibCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApicCliCreateResponse apicCliCreate(ApicCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apicCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApicCliCreateResponse apicCliCreateEx(ApicCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.apic", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApicCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApieCliCreateResponse apieCliCreate(ApieCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apieCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApieCliCreateResponse apieCliCreateEx(ApieCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.apie", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApieCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderaaaResponse createBusinessOrderaaa(CreateBusinessOrderaaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderaaaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderaaaResponse createBusinessOrderaaaEx(CreateBusinessOrderaaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderaaa.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderaaaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderbbbResponse createBusinessOrderbbb(CreateBusinessOrderbbbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderbbbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderbbbResponse createBusinessOrderbbbEx(CreateBusinessOrderbbbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderbbb.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderbbbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrdereeeResponse createBusinessOrdereee(CreateBusinessOrdereeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrdereeeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrdereeeResponse createBusinessOrdereeeEx(CreateBusinessOrdereeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.ordereee.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrdereeeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderdddResponse createBusinessOrderddd(CreateBusinessOrderdddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderdddEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderdddResponse createBusinessOrderdddEx(CreateBusinessOrderdddRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderddd.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderdddResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderabcResponse createBusinessOrderabc(CreateBusinessOrderabcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderabcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderabcResponse createBusinessOrderabcEx(CreateBusinessOrderabcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderabc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderabcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderfffResponse createBusinessOrderfff(CreateBusinessOrderfffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderfffEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderfffResponse createBusinessOrderfffEx(CreateBusinessOrderfffRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderfff.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderfffResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrdergggResponse createBusinessOrderggg(CreateBusinessOrdergggRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrdergggEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrdergggResponse createBusinessOrdergggEx(CreateBusinessOrdergggRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderggg.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrdergggResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderhResponse createBusinessOrderh(CreateBusinessOrderhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderhResponse createBusinessOrderhEx(CreateBusinessOrderhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderh.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderiResponse createBusinessOrderi(CreateBusinessOrderiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderiResponse createBusinessOrderiEx(CreateBusinessOrderiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderi.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderjResponse createBusinessOrderj(CreateBusinessOrderjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderjResponse createBusinessOrderjEx(CreateBusinessOrderjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderj.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderkResponse createBusinessOrderk(CreateBusinessOrderkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderkResponse createBusinessOrderkEx(CreateBusinessOrderkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderk.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderlResponse createBusinessOrderl(CreateBusinessOrderlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderlResponse createBusinessOrderlEx(CreateBusinessOrderlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderoResponse createBusinessOrdero(CreateBusinessOrderoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderoResponse createBusinessOrderoEx(CreateBusinessOrderoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.ordero.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderrResponse createBusinessOrderr(CreateBusinessOrderrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderrResponse createBusinessOrderrEx(CreateBusinessOrderrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.business.orderr.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口D
     * Summary: cli创建测试接口D</p>
     */
    public ApifCliCreateResponse apifCliCreate(ApifCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apifCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口D
     * Summary: cli创建测试接口D</p>
     */
    public ApifCliCreateResponse apifCliCreateEx(ApifCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.apif", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApifCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口G
     * Summary: cli创建测试接口G</p>
     */
    public ApigCliCreateResponse apigCliCreate(ApigCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apigCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口G
     * Summary: cli创建测试接口G</p>
     */
    public ApigCliCreateResponse apigCliCreateEx(ApigCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.apig", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApigCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口G
     * Summary: cli创建测试接口G</p>
     */
    public ApiCliCreateResponse apiCliCreate(ApiCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口G
     * Summary: cli创建测试接口G</p>
     */
    public ApiCliCreateResponse apiCliCreateEx(ApiCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.api", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口h
     * Summary: cli创建测试接口h</p>
     */
    public ApihCliCreateResponse apihCliCreate(ApihCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apihCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口h
     * Summary: cli创建测试接口h</p>
     */
    public ApihCliCreateResponse apihCliCreateEx(ApihCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.cliproduct.cli.create.apih", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApihCliCreateResponse());
    }
}
