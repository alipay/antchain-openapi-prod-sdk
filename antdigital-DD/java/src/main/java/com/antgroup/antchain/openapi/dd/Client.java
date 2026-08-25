// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.dd.models.*;

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
                    new TeaPair("sdk_version", "1.1.1"),
                    new TeaPair("_prod_code", "DD"),
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
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryDemoTestJltestResponse queryDemoTestJltest(QueryDemoTestJltestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoTestJltestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryDemoTestJltestResponse queryDemoTestJltestEx(QueryDemoTestJltestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.jltest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoTestJltestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderxResponse createDemoBusinessOrderx(CreateDemoBusinessOrderxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderxResponse createDemoBusinessOrderxEx(CreateDemoBusinessOrderxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderx.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderzResponse createDemoBusinessOrderz(CreateDemoBusinessOrderzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderzResponse createDemoBusinessOrderzEx(CreateDemoBusinessOrderzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderyResponse createDemoBusinessOrdery(CreateDemoBusinessOrderyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderyResponse createDemoBusinessOrderyEx(CreateDemoBusinessOrderyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.ordery.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单N
     * Summary: 创建订单N</p>
     */
    public CreateDemoBusinessOrdernResponse createDemoBusinessOrdern(CreateDemoBusinessOrdernRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrdernEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单N
     * Summary: 创建订单N</p>
     */
    public CreateDemoBusinessOrdernResponse createDemoBusinessOrdernEx(CreateDemoBusinessOrdernRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.ordern.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrdernResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderaaResponse createDemoBusinessOrderaa(CreateDemoBusinessOrderaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderaaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderaaResponse createDemoBusinessOrderaaEx(CreateDemoBusinessOrderaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderaa.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderaaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderqResponse createDemoBusinessOrderq(CreateDemoBusinessOrderqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderqResponse createDemoBusinessOrderqEx(CreateDemoBusinessOrderqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderq.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderbResponse createDemoBusinessOrderb(CreateDemoBusinessOrderbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderbResponse createDemoBusinessOrderbEx(CreateDemoBusinessOrderbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderb.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public TestDemoTestApiResponse testDemoTestApi(TestDemoTestApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testDemoTestApiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public TestDemoTestApiResponse testDemoTestApiEx(TestDemoTestApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.api.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestDemoTestApiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrdercResponse createDemoBusinessOrderc(CreateDemoBusinessOrdercRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrdercEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrdercResponse createDemoBusinessOrdercEx(CreateDemoBusinessOrdercRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrdercResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderdResponse createDemoBusinessOrderd(CreateDemoBusinessOrderdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderdResponse createDemoBusinessOrderdEx(CreateDemoBusinessOrderdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderd.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryDemoTestTestjlResponse queryDemoTestTestjl(QueryDemoTestTestjlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoTestTestjlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryDemoTestTestjlResponse queryDemoTestTestjlEx(QueryDemoTestTestjlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.testjl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoTestTestjlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderppResponse createDemoBusinessOrderpp(CreateDemoBusinessOrderppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderppEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderppResponse createDemoBusinessOrderppEx(CreateDemoBusinessOrderppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderpp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderppResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderxxxResponse createDemoBusinessOrderxxx(CreateDemoBusinessOrderxxxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderxxxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderxxxResponse createDemoBusinessOrderxxxEx(CreateDemoBusinessOrderxxxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderxxx.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderxxxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderResponse createDemoBusinessOrder(CreateDemoBusinessOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderResponse createDemoBusinessOrderEx(CreateDemoBusinessOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderzzzResponse createDemoBusinessOrderzzz(CreateDemoBusinessOrderzzzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderzzzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderzzzResponse createDemoBusinessOrderzzzEx(CreateDemoBusinessOrderzzzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderzzz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderzzzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixaDemoCliCreateResponse apixaDemoCliCreate(ApixaDemoCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apixaDemoCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixaDemoCliCreateResponse apixaDemoCliCreateEx(ApixaDemoCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cli.create.apixa", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApixaDemoCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixbDemoCliCreateResponse apixbDemoCliCreate(ApixbDemoCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apixbDemoCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixbDemoCliCreateResponse apixbDemoCliCreateEx(ApixbDemoCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cli.create.apixb", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApixbDemoCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApizDemoCliCreateResponse apizDemoCliCreate(ApizDemoCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apizDemoCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApizDemoCliCreateResponse apizDemoCliCreateEx(ApizDemoCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cli.create.apiz", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApizDemoCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 账号创建
     * Summary: 账号创建</p>
     */
    public CreateAntcloudAcmAntchainTenantResponse createAntcloudAcmAntchainTenant(CreateAntcloudAcmAntchainTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudAcmAntchainTenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 账号创建
     * Summary: 账号创建</p>
     */
    public CreateAntcloudAcmAntchainTenantResponse createAntcloudAcmAntchainTenantEx(CreateAntcloudAcmAntchainTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudAcmAntchainTenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户认证信息更新
     * Summary: 客户认证信息更新</p>
     */
    public UpdateAntcloudAcmCustomerIdentityResponse updateAntcloudAcmCustomerIdentity(UpdateAntcloudAcmCustomerIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntcloudAcmCustomerIdentityEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户认证信息更新
     * Summary: 客户认证信息更新</p>
     */
    public UpdateAntcloudAcmCustomerIdentityResponse updateAntcloudAcmCustomerIdentityEx(UpdateAntcloudAcmCustomerIdentityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntcloudAcmCustomerIdentityResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户所属项目列表
     * Summary: 查询用户所属项目列表</p>
     */
    public QueryAntcloudAcmUserProjectResponse queryAntcloudAcmUserProject(QueryAntcloudAcmUserProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudAcmUserProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户所属项目列表
     * Summary: 查询用户所属项目列表</p>
     */
    public QueryAntcloudAcmUserProjectResponse queryAntcloudAcmUserProjectEx(QueryAntcloudAcmUserProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.user.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudAcmUserProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新蚂蚁链账号的国家代码
     * Summary: 更新蚂蚁链账号的国家代码</p>
     */
    public UpdateAntcloudAcmTenantCountryResponse updateAntcloudAcmTenantCountry(UpdateAntcloudAcmTenantCountryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntcloudAcmTenantCountryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新蚂蚁链账号的国家代码
     * Summary: 更新蚂蚁链账号的国家代码</p>
     */
    public UpdateAntcloudAcmTenantCountryResponse updateAntcloudAcmTenantCountryEx(UpdateAntcloudAcmTenantCountryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.country.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntcloudAcmTenantCountryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户下项目列表
     * Summary: 查询租户下项目列表</p>
     */
    public QueryAntcloudAcmTenantProjectResponse queryAntcloudAcmTenantProject(QueryAntcloudAcmTenantProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudAcmTenantProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户下项目列表
     * Summary: 查询租户下项目列表</p>
     */
    public QueryAntcloudAcmTenantProjectResponse queryAntcloudAcmTenantProjectEx(QueryAntcloudAcmTenantProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudAcmTenantProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建项目
     * Summary: 创建项目</p>
     */
    public CreateAntcloudAcmTenantProjectResponse createAntcloudAcmTenantProject(CreateAntcloudAcmTenantProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudAcmTenantProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建项目
     * Summary: 创建项目</p>
     */
    public CreateAntcloudAcmTenantProjectResponse createAntcloudAcmTenantProjectEx(CreateAntcloudAcmTenantProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudAcmTenantProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑项目
     * Summary: 编辑项目</p>
     */
    public UpdateAntcloudAcmTenantProjectResponse updateAntcloudAcmTenantProject(UpdateAntcloudAcmTenantProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntcloudAcmTenantProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑项目
     * Summary: 编辑项目</p>
     */
    public UpdateAntcloudAcmTenantProjectResponse updateAntcloudAcmTenantProjectEx(UpdateAntcloudAcmTenantProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.project.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntcloudAcmTenantProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新项目状态
     * Summary: 更新项目状态</p>
     */
    public UpdateAntcloudAcmProjectStatusResponse updateAntcloudAcmProjectStatus(UpdateAntcloudAcmProjectStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntcloudAcmProjectStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新项目状态
     * Summary: 更新项目状态</p>
     */
    public UpdateAntcloudAcmProjectStatusResponse updateAntcloudAcmProjectStatusEx(UpdateAntcloudAcmProjectStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.project.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntcloudAcmProjectStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询项目成员列表
     * Summary: 分页查询项目成员列表</p>
     */
    public QueryAntcloudAcmProjectMemberResponse queryAntcloudAcmProjectMember(QueryAntcloudAcmProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudAcmProjectMemberEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询项目成员列表
     * Summary: 分页查询项目成员列表</p>
     */
    public QueryAntcloudAcmProjectMemberResponse queryAntcloudAcmProjectMemberEx(QueryAntcloudAcmProjectMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.project.member.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudAcmProjectMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量添加项目成员
     * Summary: 批量添加项目成员</p>
     */
    public AddAntcloudAcmProjectMemberResponse addAntcloudAcmProjectMember(AddAntcloudAcmProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAntcloudAcmProjectMemberEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量添加项目成员
     * Summary: 批量添加项目成员</p>
     */
    public AddAntcloudAcmProjectMemberResponse addAntcloudAcmProjectMemberEx(AddAntcloudAcmProjectMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.project.member.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAntcloudAcmProjectMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 移除项目成员
     * Summary: 移除项目成员</p>
     */
    public RemoveAntcloudAcmProjectMemberResponse removeAntcloudAcmProjectMember(RemoveAntcloudAcmProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAntcloudAcmProjectMemberEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 移除项目成员
     * Summary: 移除项目成员</p>
     */
    public RemoveAntcloudAcmProjectMemberResponse removeAntcloudAcmProjectMemberEx(RemoveAntcloudAcmProjectMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.project.member.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveAntcloudAcmProjectMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询尚未加入该项目的用户列表
     * Summary: 查询尚未加入该项目的用户列表</p>
     */
    public QueryAntcloudAcmProjectUserResponse queryAntcloudAcmProjectUser(QueryAntcloudAcmProjectUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudAcmProjectUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询尚未加入该项目的用户列表
     * Summary: 查询尚未加入该项目的用户列表</p>
     */
    public QueryAntcloudAcmProjectUserResponse queryAntcloudAcmProjectUserEx(QueryAntcloudAcmProjectUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.project.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudAcmProjectUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据租户查询实例列表
     * Summary: 根据租户查询实例列表</p>
     */
    public ListAntcloudOfferInstanceResponse listAntcloudOfferInstance(ListAntcloudOfferInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntcloudOfferInstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据租户查询实例列表
     * Summary: 根据租户查询实例列表</p>
     */
    public ListAntcloudOfferInstanceResponse listAntcloudOfferInstanceEx(ListAntcloudOfferInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.offer.instance.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntcloudOfferInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 由外部业务系统来调用触发抵扣接口
     * Summary: 由外部业务系统来调用触发抵扣接口</p>
     */
    public ApplyAntcloudBillingRespackageCountResponse applyAntcloudBillingRespackageCount(ApplyAntcloudBillingRespackageCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAntcloudBillingRespackageCountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 由外部业务系统来调用触发抵扣接口
     * Summary: 由外部业务系统来调用触发抵扣接口</p>
     */
    public ApplyAntcloudBillingRespackageCountResponse applyAntcloudBillingRespackageCountEx(ApplyAntcloudBillingRespackageCountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.billing.respackage.count.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAntcloudBillingRespackageCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据租户、抵扣的量价商品查询资源包余量
     * Summary: 根据租户、抵扣的量价商品查询资源包余量</p>
     */
    public QueryAntcloudBillingRespackageBalanceResponse queryAntcloudBillingRespackageBalance(QueryAntcloudBillingRespackageBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudBillingRespackageBalanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据租户、抵扣的量价商品查询资源包余量
     * Summary: 根据租户、抵扣的量价商品查询资源包余量</p>
     */
    public QueryAntcloudBillingRespackageBalanceResponse queryAntcloudBillingRespackageBalanceEx(QueryAntcloudBillingRespackageBalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.billing.respackage.balance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudBillingRespackageBalanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 线上对比线下计量计费资源包配置接口
     * Summary: 线上对比线下计量计费资源包配置接口</p>
     */
    public CheckAntcloudBillingConfigPreResponse checkAntcloudBillingConfigPre(CheckAntcloudBillingConfigPreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAntcloudBillingConfigPreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 线上对比线下计量计费资源包配置接口
     * Summary: 线上对比线下计量计费资源包配置接口</p>
     */
    public CheckAntcloudBillingConfigPreResponse checkAntcloudBillingConfigPreEx(CheckAntcloudBillingConfigPreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.billing.config.pre.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAntcloudBillingConfigPreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部发券
     * Summary: 外部发券</p>
     */
    public SendAntcloudMarketingPartnerCouponResponse sendAntcloudMarketingPartnerCoupon(SendAntcloudMarketingPartnerCouponRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendAntcloudMarketingPartnerCouponEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部发券
     * Summary: 外部发券</p>
     */
    public SendAntcloudMarketingPartnerCouponResponse sendAntcloudMarketingPartnerCouponEx(SendAntcloudMarketingPartnerCouponRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketing.partner.coupon.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendAntcloudMarketingPartnerCouponResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户查询券余量
     * Summary: 外部客户查询券余量</p>
     */
    public QueryAntcloudMarketingPartnerCouponstockResponse queryAntcloudMarketingPartnerCouponstock(QueryAntcloudMarketingPartnerCouponstockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudMarketingPartnerCouponstockEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户查询券余量
     * Summary: 外部客户查询券余量</p>
     */
    public QueryAntcloudMarketingPartnerCouponstockResponse queryAntcloudMarketingPartnerCouponstockEx(QueryAntcloudMarketingPartnerCouponstockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketing.partner.couponstock.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudMarketingPartnerCouponstockResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定租户指定产品列表可用优惠券
     * Summary: 查询指定租户指定产品列表可用优惠券</p>
     */
    public QueryAntcloudMarketingPartnerCouponResponse queryAntcloudMarketingPartnerCoupon(QueryAntcloudMarketingPartnerCouponRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudMarketingPartnerCouponEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定租户指定产品列表可用优惠券
     * Summary: 查询指定租户指定产品列表可用优惠券</p>
     */
    public QueryAntcloudMarketingPartnerCouponResponse queryAntcloudMarketingPartnerCouponEx(QueryAntcloudMarketingPartnerCouponRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketing.partner.coupon.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudMarketingPartnerCouponResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于查询可用的优惠券模板信息
     * Summary: 用于查询可用的优惠券模板信息</p>
     */
    public ListAntcloudMarketingPartnerCoupontemplateResponse listAntcloudMarketingPartnerCoupontemplate(ListAntcloudMarketingPartnerCoupontemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntcloudMarketingPartnerCoupontemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于查询可用的优惠券模板信息
     * Summary: 用于查询可用的优惠券模板信息</p>
     */
    public ListAntcloudMarketingPartnerCoupontemplateResponse listAntcloudMarketingPartnerCoupontemplateEx(ListAntcloudMarketingPartnerCoupontemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketing.partner.coupontemplate.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntcloudMarketingPartnerCoupontemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 套餐询价接口
     * Summary: 套餐询价接口</p>
     */
    public QueryAntcloudTradeComboPriceResponse queryAntcloudTradeComboPrice(QueryAntcloudTradeComboPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudTradeComboPriceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 套餐询价接口
     * Summary: 套餐询价接口</p>
     */
    public QueryAntcloudTradeComboPriceResponse queryAntcloudTradeComboPriceEx(QueryAntcloudTradeComboPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudTradeComboPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口</p>
     */
    public PayAntcloudTradeComboOrderResponse payAntcloudTradeComboOrder(PayAntcloudTradeComboOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payAntcloudTradeComboOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口</p>
     */
    public PayAntcloudTradeComboOrderResponse payAntcloudTradeComboOrderEx(PayAntcloudTradeComboOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayAntcloudTradeComboOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动</p>
     */
    public QueryAntcloudTradePriceResponse queryAntcloudTradePrice(QueryAntcloudTradePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudTradePriceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动</p>
     */
    public QueryAntcloudTradePriceResponse queryAntcloudTradePriceEx(QueryAntcloudTradePriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.price.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudTradePriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</p>
     */
    public QueryAntcloudTradeComboOptionsResponse queryAntcloudTradeComboOptions(QueryAntcloudTradeComboOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudTradeComboOptionsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</p>
     */
    public QueryAntcloudTradeComboOptionsResponse queryAntcloudTradeComboOptionsEx(QueryAntcloudTradeComboOptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.options.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudTradeComboOptionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreatewithoptionsAntcloudTradeComboResponse createwithoptionsAntcloudTradeCombo(CreatewithoptionsAntcloudTradeComboRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createwithoptionsAntcloudTradeComboEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreatewithoptionsAntcloudTradeComboResponse createwithoptionsAntcloudTradeComboEx(CreatewithoptionsAntcloudTradeComboRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.createwithoptions", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatewithoptionsAntcloudTradeComboResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</p>
     */
    public CancelAntcloudTradeComboResponse cancelAntcloudTradeCombo(CancelAntcloudTradeComboRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntcloudTradeComboEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</p>
     */
    public CancelAntcloudTradeComboResponse cancelAntcloudTradeComboEx(CancelAntcloudTradeComboRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntcloudTradeComboResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreateAntcloudTradeComboOptionsResponse createAntcloudTradeComboOptions(CreateAntcloudTradeComboOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudTradeComboOptionsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreateAntcloudTradeComboOptionsResponse createAntcloudTradeComboOptionsEx(CreateAntcloudTradeComboOptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.options.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudTradeComboOptionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 单商品订单履约状态查询
     * Summary: 单商品订单履约状态查询</p>
     */
    public GetAntcloudTradeOrderResponse getAntcloudTradeOrder(GetAntcloudTradeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntcloudTradeOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 单商品订单履约状态查询
     * Summary: 单商品订单履约状态查询</p>
     */
    public GetAntcloudTradeOrderResponse getAntcloudTradeOrderEx(GetAntcloudTradeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.order.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntcloudTradeOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public UseAntchainAbcJustTestResponse useAntchainAbcJustTest(UseAntchainAbcJustTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.useAntchainAbcJustTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public UseAntchainAbcJustTestResponse useAntchainAbcJustTestEx(UseAntchainAbcJustTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.just.test.use", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UseAntchainAbcJustTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品定价查询
     * Summary: 商品定价查询</p>
     */
    public QueryAntcloudPccCommodityPriceResponse queryAntcloudPccCommodityPrice(QueryAntcloudPccCommodityPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudPccCommodityPriceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品定价查询
     * Summary: 商品定价查询</p>
     */
    public QueryAntcloudPccCommodityPriceResponse queryAntcloudPccCommodityPriceEx(QueryAntcloudPccCommodityPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.pcc.commodity.price.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudPccCommodityPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际开票场景下查询客户信息
     * Summary: 国际开票场景下查询客户信息</p>
     */
    public QueryAntcloudInvoiceIntlconfigUserinfoResponse queryAntcloudInvoiceIntlconfigUserinfo(QueryAntcloudInvoiceIntlconfigUserinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudInvoiceIntlconfigUserinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际开票场景下查询客户信息
     * Summary: 国际开票场景下查询客户信息</p>
     */
    public QueryAntcloudInvoiceIntlconfigUserinfoResponse queryAntcloudInvoiceIntlconfigUserinfoEx(QueryAntcloudInvoiceIntlconfigUserinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlconfig.userinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudInvoiceIntlconfigUserinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景果询可开票单据
     * Summary: 国际发票场景果询可开票单据</p>
     */
    public QueryAntcloudInvoiceIntlamountRcptResponse queryAntcloudInvoiceIntlamountRcpt(QueryAntcloudInvoiceIntlamountRcptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudInvoiceIntlamountRcptEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景果询可开票单据
     * Summary: 国际发票场景果询可开票单据</p>
     */
    public QueryAntcloudInvoiceIntlamountRcptResponse queryAntcloudInvoiceIntlamountRcptEx(QueryAntcloudInvoiceIntlamountRcptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlamount.rcpt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudInvoiceIntlamountRcptResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景下查询开票申请列表
     * Summary: 国际发票场景下查询开票申请列表</p>
     */
    public QueryAntcloudInvoiceIntlinvoicesApplyResponse queryAntcloudInvoiceIntlinvoicesApply(QueryAntcloudInvoiceIntlinvoicesApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudInvoiceIntlinvoicesApplyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景下查询开票申请列表
     * Summary: 国际发票场景下查询开票申请列表</p>
     */
    public QueryAntcloudInvoiceIntlinvoicesApplyResponse queryAntcloudInvoiceIntlinvoicesApplyEx(QueryAntcloudInvoiceIntlinvoicesApplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlinvoices.apply.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudInvoiceIntlinvoicesApplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据业务号和发票ID获取国际发票文件下载地址
     * Summary: 根据业务号和发票ID获取国际发票文件下载地址</p>
     */
    public QueryAntcloudInvoiceIntlinvoicesFileurlResponse queryAntcloudInvoiceIntlinvoicesFileurl(QueryAntcloudInvoiceIntlinvoicesFileurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudInvoiceIntlinvoicesFileurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据业务号和发票ID获取国际发票文件下载地址
     * Summary: 根据业务号和发票ID获取国际发票文件下载地址</p>
     */
    public QueryAntcloudInvoiceIntlinvoicesFileurlResponse queryAntcloudInvoiceIntlinvoicesFileurlEx(QueryAntcloudInvoiceIntlinvoicesFileurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlinvoices.fileurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudInvoiceIntlinvoicesFileurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交国际形式发票开票申请
     * Summary: 提交国际形式发票开票申请</p>
     */
    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse pushAntcloudInvoiceIntlinvoicesProformainvoice(PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAntcloudInvoiceIntlinvoicesProformainvoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交国际形式发票开票申请
     * Summary: 提交国际形式发票开票申请</p>
     */
    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse pushAntcloudInvoiceIntlinvoicesProformainvoiceEx(PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlinvoices.proformainvoice.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询国家代码选择信息
     * Summary: 查询国家代码选择信息</p>
     */
    public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse queryAntcloudInvoiceIntlconfigAllcountrycnen(QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudInvoiceIntlconfigAllcountrycnenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询国家代码选择信息
     * Summary: 查询国家代码选择信息</p>
     */
    public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse queryAntcloudInvoiceIntlconfigAllcountrycnenEx(QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlconfig.allcountrycnen.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口a
     * Summary: cli创建测试接口a</p>
     */
    public ApiaAntdigitalTestliuyzpCliCreateResponse apiaAntdigitalTestliuyzpCliCreate(ApiaAntdigitalTestliuyzpCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiaAntdigitalTestliuyzpCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口a
     * Summary: cli创建测试接口a</p>
     */
    public ApiaAntdigitalTestliuyzpCliCreateResponse apiaAntdigitalTestliuyzpCliCreateEx(ApiaAntdigitalTestliuyzpCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.testliuyzp.cli.create.apia", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiaAntdigitalTestliuyzpCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: plugin测试编辑接口
     * Summary: plugin测试编辑接口</p>
     */
    public QueryAntcloudDemositdevsyTesxXxxResponse queryAntcloudDemositdevsyTesxXxx(QueryAntcloudDemositdevsyTesxXxxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudDemositdevsyTesxXxxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: plugin测试编辑接口
     * Summary: plugin测试编辑接口</p>
     */
    public QueryAntcloudDemositdevsyTesxXxxResponse queryAntcloudDemositdevsyTesxXxxEx(QueryAntcloudDemositdevsyTesxXxxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.demositdevsy.tesx.xxx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudDemositdevsyTesxXxxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口a
     * Summary: cli创建测试接口a</p>
     */
    public ApiaAntcloudDemositdevsyCliCreateResponse apiaAntcloudDemositdevsyCliCreate(ApiaAntcloudDemositdevsyCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiaAntcloudDemositdevsyCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口a
     * Summary: cli创建测试接口a</p>
     */
    public ApiaAntcloudDemositdevsyCliCreateResponse apiaAntcloudDemositdevsyCliCreateEx(ApiaAntcloudDemositdevsyCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.demositdevsy.cli.create.apia", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiaAntcloudDemositdevsyCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: gatewat-plugin创建接口a
     * Summary: gatewat-plugin创建接口a</p>
     */
    public ApiaAntcloudWorkbenchphaseiiaCliCreateResponse apiaAntcloudWorkbenchphaseiiaCliCreate(ApiaAntcloudWorkbenchphaseiiaCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiaAntcloudWorkbenchphaseiiaCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: gatewat-plugin创建接口a
     * Summary: gatewat-plugin创建接口a</p>
     */
    public ApiaAntcloudWorkbenchphaseiiaCliCreateResponse apiaAntcloudWorkbenchphaseiiaCliCreateEx(ApiaAntcloudWorkbenchphaseiiaCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.workbenchphaseiia.cli.create.apia"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ApiaAntcloudWorkbenchphaseiiaCliCreateResponse apiaAntcloudWorkbenchphaseiiaCliCreateResponse = ApiaAntcloudWorkbenchphaseiiaCliCreateResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return apiaAntcloudWorkbenchphaseiiaCliCreateResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.workbenchphaseiia.cli.create.apia", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiaAntcloudWorkbenchphaseiiaCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: gateway-plugin创建接口b
     * Summary: gateway-plugin创建接口b</p>
     */
    public ApibAntcloudWorkbenchphaseiiaCliCreateResponse apibAntcloudWorkbenchphaseiiaCliCreate(ApibAntcloudWorkbenchphaseiiaCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apibAntcloudWorkbenchphaseiiaCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: gateway-plugin创建接口b
     * Summary: gateway-plugin创建接口b</p>
     */
    public ApibAntcloudWorkbenchphaseiiaCliCreateResponse apibAntcloudWorkbenchphaseiiaCliCreateEx(ApibAntcloudWorkbenchphaseiiaCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.workbenchphaseiia.cli.create.apib"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ApibAntcloudWorkbenchphaseiiaCliCreateResponse apibAntcloudWorkbenchphaseiiaCliCreateResponse = ApibAntcloudWorkbenchphaseiiaCliCreateResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return apibAntcloudWorkbenchphaseiiaCliCreateResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.workbenchphaseiia.cli.create.apib", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApibAntcloudWorkbenchphaseiiaCliCreateResponse());
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
