// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproducta;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.jzqproducta.models.*;

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
                    new TeaPair("sdk_version", "1.0.1"),
                    new TeaPair("_prod_code", "JZQPRODUCTA"),
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
     * <p>Description: 1
     * Summary: 1</p>
     */
    public TestDemoResponse testDemo(TestDemoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testDemoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 1
     * Summary: 1</p>
     */
    public TestDemoResponse testDemoEx(TestDemoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.demo.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestDemoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public ApiWithdrawResponse apiWithdraw(ApiWithdrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiWithdrawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public ApiWithdrawResponse apiWithdrawEx(ApiWithdrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.withdraw.api", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiWithdrawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTestResponse queryPreformanceTest(QueryPreformanceTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTestResponse queryPreformanceTestEx(QueryPreformanceTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOnjgraResponse queryPreformanceOnjgra(QueryPreformanceOnjgraRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOnjgraEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOnjgraResponse queryPreformanceOnjgraEx(QueryPreformanceOnjgraRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.onjgra.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOnjgraResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCgscczResponse queryPreformanceCgsccz(QueryPreformanceCgscczRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCgscczEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCgscczResponse queryPreformanceCgscczEx(QueryPreformanceCgscczRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cgsccz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCgscczResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRyhdhnResponse queryPreformanceRyhdhn(QueryPreformanceRyhdhnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRyhdhnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRyhdhnResponse queryPreformanceRyhdhnEx(QueryPreformanceRyhdhnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ryhdhn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRyhdhnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQcbszeResponse queryPreformanceQcbsze(QueryPreformanceQcbszeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQcbszeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQcbszeResponse queryPreformanceQcbszeEx(QueryPreformanceQcbszeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qcbsze.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQcbszeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceScilwtResponse queryPreformanceScilwt(QueryPreformanceScilwtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceScilwtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceScilwtResponse queryPreformanceScilwtEx(QueryPreformanceScilwtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.scilwt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceScilwtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZdsrecResponse queryPreformanceZdsrec(QueryPreformanceZdsrecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZdsrecEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZdsrecResponse queryPreformanceZdsrecEx(QueryPreformanceZdsrecRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zdsrec.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZdsrecResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIezhucResponse queryPreformanceIezhuc(QueryPreformanceIezhucRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIezhucEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIezhucResponse queryPreformanceIezhucEx(QueryPreformanceIezhucRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.iezhuc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIezhucResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXjdezpResponse queryPreformanceXjdezp(QueryPreformanceXjdezpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXjdezpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXjdezpResponse queryPreformanceXjdezpEx(QueryPreformanceXjdezpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xjdezp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXjdezpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDjuoinResponse queryPreformanceDjuoin(QueryPreformanceDjuoinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDjuoinEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDjuoinResponse queryPreformanceDjuoinEx(QueryPreformanceDjuoinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.djuoin.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDjuoinResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBagemgResponse queryPreformanceBagemg(QueryPreformanceBagemgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBagemgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBagemgResponse queryPreformanceBagemgEx(QueryPreformanceBagemgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bagemg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBagemgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDpvzbtResponse queryPreformanceDpvzbt(QueryPreformanceDpvzbtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDpvzbtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDpvzbtResponse queryPreformanceDpvzbtEx(QueryPreformanceDpvzbtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dpvzbt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDpvzbtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGziwauResponse queryPreformanceGziwau(QueryPreformanceGziwauRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGziwauEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGziwauResponse queryPreformanceGziwauEx(QueryPreformanceGziwauRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gziwau.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGziwauResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVhpywuResponse queryPreformanceVhpywu(QueryPreformanceVhpywuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVhpywuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVhpywuResponse queryPreformanceVhpywuEx(QueryPreformanceVhpywuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vhpywu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVhpywuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJsulhtResponse queryPreformanceJsulht(QueryPreformanceJsulhtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJsulhtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJsulhtResponse queryPreformanceJsulhtEx(QueryPreformanceJsulhtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jsulht.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJsulhtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIvcyplResponse queryPreformanceIvcypl(QueryPreformanceIvcyplRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIvcyplEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIvcyplResponse queryPreformanceIvcyplEx(QueryPreformanceIvcyplRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ivcypl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIvcyplResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGmylkmResponse queryPreformanceGmylkm(QueryPreformanceGmylkmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGmylkmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGmylkmResponse queryPreformanceGmylkmEx(QueryPreformanceGmylkmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gmylkm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGmylkmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYcdqltResponse queryPreformanceYcdqlt(QueryPreformanceYcdqltRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYcdqltEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYcdqltResponse queryPreformanceYcdqltEx(QueryPreformanceYcdqltRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ycdqlt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYcdqltResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTmspncResponse queryPreformanceTmspnc(QueryPreformanceTmspncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTmspncEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTmspncResponse queryPreformanceTmspncEx(QueryPreformanceTmspncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.tmspnc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTmspncResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSghpbdResponse queryPreformanceSghpbd(QueryPreformanceSghpbdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSghpbdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSghpbdResponse queryPreformanceSghpbdEx(QueryPreformanceSghpbdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.sghpbd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSghpbdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRhuirbResponse queryPreformanceRhuirb(QueryPreformanceRhuirbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRhuirbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRhuirbResponse queryPreformanceRhuirbEx(QueryPreformanceRhuirbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.rhuirb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRhuirbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZcvaeaResponse queryPreformanceZcvaea(QueryPreformanceZcvaeaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZcvaeaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZcvaeaResponse queryPreformanceZcvaeaEx(QueryPreformanceZcvaeaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zcvaea.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZcvaeaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGhohidResponse queryPreformanceGhohid(QueryPreformanceGhohidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGhohidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGhohidResponse queryPreformanceGhohidEx(QueryPreformanceGhohidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ghohid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGhohidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMcxrxmResponse queryPreformanceMcxrxm(QueryPreformanceMcxrxmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMcxrxmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMcxrxmResponse queryPreformanceMcxrxmEx(QueryPreformanceMcxrxmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mcxrxm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMcxrxmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYdbeozResponse queryPreformanceYdbeoz(QueryPreformanceYdbeozRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYdbeozEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYdbeozResponse queryPreformanceYdbeozEx(QueryPreformanceYdbeozRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ydbeoz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYdbeozResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGqiyjtResponse queryPreformanceGqiyjt(QueryPreformanceGqiyjtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGqiyjtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGqiyjtResponse queryPreformanceGqiyjtEx(QueryPreformanceGqiyjtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gqiyjt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGqiyjtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFlmtjeResponse queryPreformanceFlmtje(QueryPreformanceFlmtjeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFlmtjeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFlmtjeResponse queryPreformanceFlmtjeEx(QueryPreformanceFlmtjeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.flmtje.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFlmtjeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIhmckrResponse queryPreformanceIhmckr(QueryPreformanceIhmckrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIhmckrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIhmckrResponse queryPreformanceIhmckrEx(QueryPreformanceIhmckrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ihmckr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIhmckrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVuhkynResponse queryPreformanceVuhkyn(QueryPreformanceVuhkynRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVuhkynEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVuhkynResponse queryPreformanceVuhkynEx(QueryPreformanceVuhkynRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vuhkyn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVuhkynResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCdyiujResponse queryPreformanceCdyiuj(QueryPreformanceCdyiujRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCdyiujEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCdyiujResponse queryPreformanceCdyiujEx(QueryPreformanceCdyiujRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cdyiuj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCdyiujResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQcenzcResponse queryPreformanceQcenzc(QueryPreformanceQcenzcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQcenzcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQcenzcResponse queryPreformanceQcenzcEx(QueryPreformanceQcenzcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qcenzc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQcenzcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKrohvyResponse queryPreformanceKrohvy(QueryPreformanceKrohvyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKrohvyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKrohvyResponse queryPreformanceKrohvyEx(QueryPreformanceKrohvyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.krohvy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKrohvyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNpyznvResponse queryPreformanceNpyznv(QueryPreformanceNpyznvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceNpyznvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNpyznvResponse queryPreformanceNpyznvEx(QueryPreformanceNpyznvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.npyznv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceNpyznvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLqbvkmResponse queryPreformanceLqbvkm(QueryPreformanceLqbvkmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLqbvkmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLqbvkmResponse queryPreformanceLqbvkmEx(QueryPreformanceLqbvkmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lqbvkm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLqbvkmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFjxvfjResponse queryPreformanceFjxvfj(QueryPreformanceFjxvfjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFjxvfjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFjxvfjResponse queryPreformanceFjxvfjEx(QueryPreformanceFjxvfjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fjxvfj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFjxvfjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEqoghcResponse queryPreformanceEqoghc(QueryPreformanceEqoghcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEqoghcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEqoghcResponse queryPreformanceEqoghcEx(QueryPreformanceEqoghcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.eqoghc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEqoghcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQuklgcResponse queryPreformanceQuklgc(QueryPreformanceQuklgcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQuklgcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQuklgcResponse queryPreformanceQuklgcEx(QueryPreformanceQuklgcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.quklgc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQuklgcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOtekpgResponse queryPreformanceOtekpg(QueryPreformanceOtekpgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOtekpgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOtekpgResponse queryPreformanceOtekpgEx(QueryPreformanceOtekpgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.otekpg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOtekpgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFnipumResponse queryPreformanceFnipum(QueryPreformanceFnipumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFnipumEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFnipumResponse queryPreformanceFnipumEx(QueryPreformanceFnipumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fnipum.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFnipumResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEhhgnqResponse queryPreformanceEhhgnq(QueryPreformanceEhhgnqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEhhgnqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEhhgnqResponse queryPreformanceEhhgnqEx(QueryPreformanceEhhgnqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ehhgnq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEhhgnqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNtrmkkResponse queryPreformanceNtrmkk(QueryPreformanceNtrmkkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceNtrmkkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNtrmkkResponse queryPreformanceNtrmkkEx(QueryPreformanceNtrmkkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ntrmkk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceNtrmkkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCdjnvmResponse queryPreformanceCdjnvm(QueryPreformanceCdjnvmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCdjnvmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCdjnvmResponse queryPreformanceCdjnvmEx(QueryPreformanceCdjnvmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cdjnvm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCdjnvmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZnmzzvResponse queryPreformanceZnmzzv(QueryPreformanceZnmzzvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZnmzzvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZnmzzvResponse queryPreformanceZnmzzvEx(QueryPreformanceZnmzzvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.znmzzv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZnmzzvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJhxufrResponse queryPreformanceJhxufr(QueryPreformanceJhxufrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJhxufrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJhxufrResponse queryPreformanceJhxufrEx(QueryPreformanceJhxufrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jhxufr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJhxufrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBvhiaaResponse queryPreformanceBvhiaa(QueryPreformanceBvhiaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBvhiaaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBvhiaaResponse queryPreformanceBvhiaaEx(QueryPreformanceBvhiaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bvhiaa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBvhiaaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXkpsmyResponse queryPreformanceXkpsmy(QueryPreformanceXkpsmyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXkpsmyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXkpsmyResponse queryPreformanceXkpsmyEx(QueryPreformanceXkpsmyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xkpsmy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXkpsmyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUvqflcResponse queryPreformanceUvqflc(QueryPreformanceUvqflcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUvqflcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUvqflcResponse queryPreformanceUvqflcEx(QueryPreformanceUvqflcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.uvqflc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUvqflcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVyjnjhResponse queryPreformanceVyjnjh(QueryPreformanceVyjnjhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVyjnjhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVyjnjhResponse queryPreformanceVyjnjhEx(QueryPreformanceVyjnjhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vyjnjh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVyjnjhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQdwewwResponse queryPreformanceQdweww(QueryPreformanceQdwewwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQdwewwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQdwewwResponse queryPreformanceQdwewwEx(QueryPreformanceQdwewwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qdweww.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQdwewwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYxsifpResponse queryPreformanceYxsifp(QueryPreformanceYxsifpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYxsifpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYxsifpResponse queryPreformanceYxsifpEx(QueryPreformanceYxsifpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yxsifp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYxsifpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEfvjvzResponse queryPreformanceEfvjvz(QueryPreformanceEfvjvzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEfvjvzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEfvjvzResponse queryPreformanceEfvjvzEx(QueryPreformanceEfvjvzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.efvjvz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEfvjvzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJppmohResponse queryPreformanceJppmoh(QueryPreformanceJppmohRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJppmohEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJppmohResponse queryPreformanceJppmohEx(QueryPreformanceJppmohRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jppmoh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJppmohResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVcwcvoResponse queryPreformanceVcwcvo(QueryPreformanceVcwcvoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVcwcvoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVcwcvoResponse queryPreformanceVcwcvoEx(QueryPreformanceVcwcvoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vcwcvo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVcwcvoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBdbqlwResponse queryPreformanceBdbqlw(QueryPreformanceBdbqlwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBdbqlwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBdbqlwResponse queryPreformanceBdbqlwEx(QueryPreformanceBdbqlwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bdbqlw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBdbqlwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAqmmruResponse queryPreformanceAqmmru(QueryPreformanceAqmmruRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAqmmruEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAqmmruResponse queryPreformanceAqmmruEx(QueryPreformanceAqmmruRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.aqmmru.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAqmmruResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRvieyvResponse queryPreformanceRvieyv(QueryPreformanceRvieyvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRvieyvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRvieyvResponse queryPreformanceRvieyvEx(QueryPreformanceRvieyvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.rvieyv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRvieyvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDmopqgResponse queryPreformanceDmopqg(QueryPreformanceDmopqgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDmopqgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDmopqgResponse queryPreformanceDmopqgEx(QueryPreformanceDmopqgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dmopqg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDmopqgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJiccssResponse queryPreformanceJiccss(QueryPreformanceJiccssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJiccssEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJiccssResponse queryPreformanceJiccssEx(QueryPreformanceJiccssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jiccss.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJiccssResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHlqjtdResponse queryPreformanceHlqjtd(QueryPreformanceHlqjtdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHlqjtdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHlqjtdResponse queryPreformanceHlqjtdEx(QueryPreformanceHlqjtdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hlqjtd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHlqjtdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLaldyfResponse queryPreformanceLaldyf(QueryPreformanceLaldyfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLaldyfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLaldyfResponse queryPreformanceLaldyfEx(QueryPreformanceLaldyfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.laldyf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLaldyfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYbynjwResponse queryPreformanceYbynjw(QueryPreformanceYbynjwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYbynjwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYbynjwResponse queryPreformanceYbynjwEx(QueryPreformanceYbynjwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ybynjw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYbynjwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFsinwzResponse queryPreformanceFsinwz(QueryPreformanceFsinwzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFsinwzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFsinwzResponse queryPreformanceFsinwzEx(QueryPreformanceFsinwzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fsinwz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFsinwzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePgfxxnResponse queryPreformancePgfxxn(QueryPreformancePgfxxnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePgfxxnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePgfxxnResponse queryPreformancePgfxxnEx(QueryPreformancePgfxxnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pgfxxn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePgfxxnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQuinflResponse queryPreformanceQuinfl(QueryPreformanceQuinflRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQuinflEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQuinflResponse queryPreformanceQuinflEx(QueryPreformanceQuinflRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.quinfl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQuinflResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYxgwyyResponse queryPreformanceYxgwyy(QueryPreformanceYxgwyyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYxgwyyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYxgwyyResponse queryPreformanceYxgwyyEx(QueryPreformanceYxgwyyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yxgwyy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYxgwyyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNendtwResponse queryPreformanceNendtw(QueryPreformanceNendtwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceNendtwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNendtwResponse queryPreformanceNendtwEx(QueryPreformanceNendtwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.nendtw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceNendtwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFtjeczResponse queryPreformanceFtjecz(QueryPreformanceFtjeczRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFtjeczEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFtjeczResponse queryPreformanceFtjeczEx(QueryPreformanceFtjeczRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ftjecz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFtjeczResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEputrhResponse queryPreformanceEputrh(QueryPreformanceEputrhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEputrhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEputrhResponse queryPreformanceEputrhEx(QueryPreformanceEputrhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.eputrh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEputrhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVspsumResponse queryPreformanceVspsum(QueryPreformanceVspsumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVspsumEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVspsumResponse queryPreformanceVspsumEx(QueryPreformanceVspsumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vspsum.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVspsumResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZlwaueResponse queryPreformanceZlwaue(QueryPreformanceZlwaueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZlwaueEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZlwaueResponse queryPreformanceZlwaueEx(QueryPreformanceZlwaueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zlwaue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZlwaueResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMqaojrResponse queryPreformanceMqaojr(QueryPreformanceMqaojrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMqaojrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMqaojrResponse queryPreformanceMqaojrEx(QueryPreformanceMqaojrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mqaojr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMqaojrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBfcfqdResponse queryPreformanceBfcfqd(QueryPreformanceBfcfqdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBfcfqdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBfcfqdResponse queryPreformanceBfcfqdEx(QueryPreformanceBfcfqdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bfcfqd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBfcfqdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYcfsafResponse queryPreformanceYcfsaf(QueryPreformanceYcfsafRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYcfsafEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYcfsafResponse queryPreformanceYcfsafEx(QueryPreformanceYcfsafRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ycfsaf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYcfsafResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZwpmyiResponse queryPreformanceZwpmyi(QueryPreformanceZwpmyiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZwpmyiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZwpmyiResponse queryPreformanceZwpmyiEx(QueryPreformanceZwpmyiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zwpmyi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZwpmyiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMvgnlaResponse queryPreformanceMvgnla(QueryPreformanceMvgnlaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMvgnlaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMvgnlaResponse queryPreformanceMvgnlaEx(QueryPreformanceMvgnlaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mvgnla.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMvgnlaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVlmrpmResponse queryPreformanceVlmrpm(QueryPreformanceVlmrpmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVlmrpmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVlmrpmResponse queryPreformanceVlmrpmEx(QueryPreformanceVlmrpmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vlmrpm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVlmrpmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKfygrpResponse queryPreformanceKfygrp(QueryPreformanceKfygrpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKfygrpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKfygrpResponse queryPreformanceKfygrpEx(QueryPreformanceKfygrpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kfygrp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKfygrpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKqdmywResponse queryPreformanceKqdmyw(QueryPreformanceKqdmywRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKqdmywEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKqdmywResponse queryPreformanceKqdmywEx(QueryPreformanceKqdmywRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kqdmyw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKqdmywResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIdrolcResponse queryPreformanceIdrolc(QueryPreformanceIdrolcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIdrolcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIdrolcResponse queryPreformanceIdrolcEx(QueryPreformanceIdrolcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.idrolc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIdrolcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGoxdkkResponse queryPreformanceGoxdkk(QueryPreformanceGoxdkkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGoxdkkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGoxdkkResponse queryPreformanceGoxdkkEx(QueryPreformanceGoxdkkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.goxdkk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGoxdkkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJnrlwyResponse queryPreformanceJnrlwy(QueryPreformanceJnrlwyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJnrlwyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJnrlwyResponse queryPreformanceJnrlwyEx(QueryPreformanceJnrlwyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jnrlwy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJnrlwyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYoiwnfResponse queryPreformanceYoiwnf(QueryPreformanceYoiwnfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYoiwnfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYoiwnfResponse queryPreformanceYoiwnfEx(QueryPreformanceYoiwnfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yoiwnf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYoiwnfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePxtfgcResponse queryPreformancePxtfgc(QueryPreformancePxtfgcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePxtfgcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePxtfgcResponse queryPreformancePxtfgcEx(QueryPreformancePxtfgcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pxtfgc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePxtfgcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGbigiaResponse queryPreformanceGbigia(QueryPreformanceGbigiaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGbigiaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGbigiaResponse queryPreformanceGbigiaEx(QueryPreformanceGbigiaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gbigia.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGbigiaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGohgooResponse queryPreformanceGohgoo(QueryPreformanceGohgooRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGohgooEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGohgooResponse queryPreformanceGohgooEx(QueryPreformanceGohgooRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gohgoo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGohgooResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQzijugResponse queryPreformanceQzijug(QueryPreformanceQzijugRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQzijugEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQzijugResponse queryPreformanceQzijugEx(QueryPreformanceQzijugRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qzijug.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQzijugResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDtiqsmResponse queryPreformanceDtiqsm(QueryPreformanceDtiqsmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDtiqsmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDtiqsmResponse queryPreformanceDtiqsmEx(QueryPreformanceDtiqsmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dtiqsm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDtiqsmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIapwkxResponse queryPreformanceIapwkx(QueryPreformanceIapwkxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIapwkxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIapwkxResponse queryPreformanceIapwkxEx(QueryPreformanceIapwkxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.iapwkx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIapwkxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAarwuqResponse queryPreformanceAarwuq(QueryPreformanceAarwuqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAarwuqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAarwuqResponse queryPreformanceAarwuqEx(QueryPreformanceAarwuqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.aarwuq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAarwuqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEgsbveResponse queryPreformanceEgsbve(QueryPreformanceEgsbveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEgsbveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEgsbveResponse queryPreformanceEgsbveEx(QueryPreformanceEgsbveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.egsbve.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEgsbveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUdgzvlResponse queryPreformanceUdgzvl(QueryPreformanceUdgzvlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUdgzvlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUdgzvlResponse queryPreformanceUdgzvlEx(QueryPreformanceUdgzvlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.udgzvl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUdgzvlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOxzmsdResponse queryPreformanceOxzmsd(QueryPreformanceOxzmsdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOxzmsdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOxzmsdResponse queryPreformanceOxzmsdEx(QueryPreformanceOxzmsdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.oxzmsd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOxzmsdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWrbogxResponse queryPreformanceWrbogx(QueryPreformanceWrbogxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWrbogxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWrbogxResponse queryPreformanceWrbogxEx(QueryPreformanceWrbogxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wrbogx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWrbogxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSovdsqResponse queryPreformanceSovdsq(QueryPreformanceSovdsqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSovdsqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSovdsqResponse queryPreformanceSovdsqEx(QueryPreformanceSovdsqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.sovdsq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSovdsqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKmenziResponse queryPreformanceKmenzi(QueryPreformanceKmenziRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKmenziEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKmenziResponse queryPreformanceKmenziEx(QueryPreformanceKmenziRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kmenzi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKmenziResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNdyzvbResponse queryPreformanceNdyzvb(QueryPreformanceNdyzvbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceNdyzvbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNdyzvbResponse queryPreformanceNdyzvbEx(QueryPreformanceNdyzvbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ndyzvb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceNdyzvbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePleorxResponse queryPreformancePleorx(QueryPreformancePleorxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePleorxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePleorxResponse queryPreformancePleorxEx(QueryPreformancePleorxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pleorx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePleorxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceErldmsResponse queryPreformanceErldms(QueryPreformanceErldmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceErldmsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceErldmsResponse queryPreformanceErldmsEx(QueryPreformanceErldmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.erldms.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceErldmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePstmvtResponse queryPreformancePstmvt(QueryPreformancePstmvtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePstmvtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePstmvtResponse queryPreformancePstmvtEx(QueryPreformancePstmvtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pstmvt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePstmvtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRgcensResponse queryPreformanceRgcens(QueryPreformanceRgcensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRgcensEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRgcensResponse queryPreformanceRgcensEx(QueryPreformanceRgcensRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.rgcens.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRgcensResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDfawnnResponse queryPreformanceDfawnn(QueryPreformanceDfawnnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDfawnnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDfawnnResponse queryPreformanceDfawnnEx(QueryPreformanceDfawnnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dfawnn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDfawnnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYzzbsmResponse queryPreformanceYzzbsm(QueryPreformanceYzzbsmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYzzbsmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYzzbsmResponse queryPreformanceYzzbsmEx(QueryPreformanceYzzbsmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yzzbsm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYzzbsmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSybmpkResponse queryPreformanceSybmpk(QueryPreformanceSybmpkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSybmpkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSybmpkResponse queryPreformanceSybmpkEx(QueryPreformanceSybmpkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.sybmpk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSybmpkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZtxnbkResponse queryPreformanceZtxnbk(QueryPreformanceZtxnbkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZtxnbkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZtxnbkResponse queryPreformanceZtxnbkEx(QueryPreformanceZtxnbkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ztxnbk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZtxnbkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTtttjpResponse queryPreformanceTtttjp(QueryPreformanceTtttjpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTtttjpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTtttjpResponse queryPreformanceTtttjpEx(QueryPreformanceTtttjpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ttttjp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTtttjpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKpnmpvResponse queryPreformanceKpnmpv(QueryPreformanceKpnmpvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKpnmpvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKpnmpvResponse queryPreformanceKpnmpvEx(QueryPreformanceKpnmpvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kpnmpv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKpnmpvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYquegwResponse queryPreformanceYquegw(QueryPreformanceYquegwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYquegwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYquegwResponse queryPreformanceYquegwEx(QueryPreformanceYquegwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yquegw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYquegwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYjmbylResponse queryPreformanceYjmbyl(QueryPreformanceYjmbylRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYjmbylEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYjmbylResponse queryPreformanceYjmbylEx(QueryPreformanceYjmbylRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yjmbyl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYjmbylResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGjnnnvResponse queryPreformanceGjnnnv(QueryPreformanceGjnnnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGjnnnvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGjnnnvResponse queryPreformanceGjnnnvEx(QueryPreformanceGjnnnvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gjnnnv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGjnnnvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCgcmkvResponse queryPreformanceCgcmkv(QueryPreformanceCgcmkvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCgcmkvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCgcmkvResponse queryPreformanceCgcmkvEx(QueryPreformanceCgcmkvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cgcmkv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCgcmkvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVtqjtiResponse queryPreformanceVtqjti(QueryPreformanceVtqjtiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVtqjtiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVtqjtiResponse queryPreformanceVtqjtiEx(QueryPreformanceVtqjtiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vtqjti.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVtqjtiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZazxkcResponse queryPreformanceZazxkc(QueryPreformanceZazxkcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZazxkcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZazxkcResponse queryPreformanceZazxkcEx(QueryPreformanceZazxkcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zazxkc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZazxkcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNxifyyResponse queryPreformanceNxifyy(QueryPreformanceNxifyyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceNxifyyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNxifyyResponse queryPreformanceNxifyyEx(QueryPreformanceNxifyyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.nxifyy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceNxifyyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZnlzkiResponse queryPreformanceZnlzki(QueryPreformanceZnlzkiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZnlzkiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZnlzkiResponse queryPreformanceZnlzkiEx(QueryPreformanceZnlzkiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.znlzki.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZnlzkiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVcvcvyResponse queryPreformanceVcvcvy(QueryPreformanceVcvcvyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVcvcvyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVcvcvyResponse queryPreformanceVcvcvyEx(QueryPreformanceVcvcvyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vcvcvy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVcvcvyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXuchrmResponse queryPreformanceXuchrm(QueryPreformanceXuchrmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXuchrmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXuchrmResponse queryPreformanceXuchrmEx(QueryPreformanceXuchrmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xuchrm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXuchrmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZtkrkpResponse queryPreformanceZtkrkp(QueryPreformanceZtkrkpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZtkrkpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZtkrkpResponse queryPreformanceZtkrkpEx(QueryPreformanceZtkrkpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ztkrkp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZtkrkpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJetnghResponse queryPreformanceJetngh(QueryPreformanceJetnghRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJetnghEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJetnghResponse queryPreformanceJetnghEx(QueryPreformanceJetnghRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jetngh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJetnghResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBgtghlResponse queryPreformanceBgtghl(QueryPreformanceBgtghlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBgtghlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBgtghlResponse queryPreformanceBgtghlEx(QueryPreformanceBgtghlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bgtghl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBgtghlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVwquksResponse queryPreformanceVwquks(QueryPreformanceVwquksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVwquksEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVwquksResponse queryPreformanceVwquksEx(QueryPreformanceVwquksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vwquks.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVwquksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceElcoqaResponse queryPreformanceElcoqa(QueryPreformanceElcoqaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceElcoqaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceElcoqaResponse queryPreformanceElcoqaEx(QueryPreformanceElcoqaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.elcoqa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceElcoqaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSwzidtResponse queryPreformanceSwzidt(QueryPreformanceSwzidtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSwzidtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSwzidtResponse queryPreformanceSwzidtEx(QueryPreformanceSwzidtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.swzidt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSwzidtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLepjayResponse queryPreformanceLepjay(QueryPreformanceLepjayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLepjayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLepjayResponse queryPreformanceLepjayEx(QueryPreformanceLepjayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lepjay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLepjayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWssfmiResponse queryPreformanceWssfmi(QueryPreformanceWssfmiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWssfmiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWssfmiResponse queryPreformanceWssfmiEx(QueryPreformanceWssfmiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wssfmi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWssfmiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHiiibpResponse queryPreformanceHiiibp(QueryPreformanceHiiibpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHiiibpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHiiibpResponse queryPreformanceHiiibpEx(QueryPreformanceHiiibpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hiiibp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHiiibpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIlsifvResponse queryPreformanceIlsifv(QueryPreformanceIlsifvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIlsifvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIlsifvResponse queryPreformanceIlsifvEx(QueryPreformanceIlsifvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ilsifv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIlsifvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQrrdcgResponse queryPreformanceQrrdcg(QueryPreformanceQrrdcgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQrrdcgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQrrdcgResponse queryPreformanceQrrdcgEx(QueryPreformanceQrrdcgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qrrdcg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQrrdcgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOeffbqResponse queryPreformanceOeffbq(QueryPreformanceOeffbqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOeffbqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOeffbqResponse queryPreformanceOeffbqEx(QueryPreformanceOeffbqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.oeffbq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOeffbqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBfnylcResponse queryPreformanceBfnylc(QueryPreformanceBfnylcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBfnylcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBfnylcResponse queryPreformanceBfnylcEx(QueryPreformanceBfnylcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bfnylc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBfnylcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKhmkcuResponse queryPreformanceKhmkcu(QueryPreformanceKhmkcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKhmkcuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKhmkcuResponse queryPreformanceKhmkcuEx(QueryPreformanceKhmkcuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.khmkcu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKhmkcuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXahvpkResponse queryPreformanceXahvpk(QueryPreformanceXahvpkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXahvpkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXahvpkResponse queryPreformanceXahvpkEx(QueryPreformanceXahvpkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xahvpk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXahvpkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePajjznResponse queryPreformancePajjzn(QueryPreformancePajjznRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePajjznEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePajjznResponse queryPreformancePajjznEx(QueryPreformancePajjznRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pajjzn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePajjznResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLrwablResponse queryPreformanceLrwabl(QueryPreformanceLrwablRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLrwablEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLrwablResponse queryPreformanceLrwablEx(QueryPreformanceLrwablRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lrwabl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLrwablResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQccygnResponse queryPreformanceQccygn(QueryPreformanceQccygnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQccygnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQccygnResponse queryPreformanceQccygnEx(QueryPreformanceQccygnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qccygn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQccygnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHtqkxtResponse queryPreformanceHtqkxt(QueryPreformanceHtqkxtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHtqkxtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHtqkxtResponse queryPreformanceHtqkxtEx(QueryPreformanceHtqkxtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.htqkxt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHtqkxtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMitdkqResponse queryPreformanceMitdkq(QueryPreformanceMitdkqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMitdkqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMitdkqResponse queryPreformanceMitdkqEx(QueryPreformanceMitdkqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mitdkq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMitdkqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePrbsekResponse queryPreformancePrbsek(QueryPreformancePrbsekRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePrbsekEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePrbsekResponse queryPreformancePrbsekEx(QueryPreformancePrbsekRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.prbsek.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePrbsekResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVrqoxoResponse queryPreformanceVrqoxo(QueryPreformanceVrqoxoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVrqoxoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVrqoxoResponse queryPreformanceVrqoxoEx(QueryPreformanceVrqoxoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vrqoxo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVrqoxoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUcltcuResponse queryPreformanceUcltcu(QueryPreformanceUcltcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUcltcuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUcltcuResponse queryPreformanceUcltcuEx(QueryPreformanceUcltcuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ucltcu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUcltcuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMzmhjmResponse queryPreformanceMzmhjm(QueryPreformanceMzmhjmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMzmhjmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMzmhjmResponse queryPreformanceMzmhjmEx(QueryPreformanceMzmhjmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mzmhjm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMzmhjmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUgztluResponse queryPreformanceUgztlu(QueryPreformanceUgztluRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUgztluEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUgztluResponse queryPreformanceUgztluEx(QueryPreformanceUgztluRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ugztlu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUgztluResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYkrosjResponse queryPreformanceYkrosj(QueryPreformanceYkrosjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYkrosjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYkrosjResponse queryPreformanceYkrosjEx(QueryPreformanceYkrosjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ykrosj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYkrosjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGflgulResponse queryPreformanceGflgul(QueryPreformanceGflgulRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGflgulEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGflgulResponse queryPreformanceGflgulEx(QueryPreformanceGflgulRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gflgul.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGflgulResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXwkppoResponse queryPreformanceXwkppo(QueryPreformanceXwkppoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXwkppoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXwkppoResponse queryPreformanceXwkppoEx(QueryPreformanceXwkppoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xwkppo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXwkppoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVmvwlqResponse queryPreformanceVmvwlq(QueryPreformanceVmvwlqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVmvwlqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVmvwlqResponse queryPreformanceVmvwlqEx(QueryPreformanceVmvwlqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vmvwlq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVmvwlqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLeciagResponse queryPreformanceLeciag(QueryPreformanceLeciagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLeciagEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLeciagResponse queryPreformanceLeciagEx(QueryPreformanceLeciagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.leciag.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLeciagResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYhfxnrResponse queryPreformanceYhfxnr(QueryPreformanceYhfxnrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYhfxnrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYhfxnrResponse queryPreformanceYhfxnrEx(QueryPreformanceYhfxnrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yhfxnr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYhfxnrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTmuqnsResponse queryPreformanceTmuqns(QueryPreformanceTmuqnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTmuqnsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTmuqnsResponse queryPreformanceTmuqnsEx(QueryPreformanceTmuqnsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.tmuqns.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTmuqnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAzmyssResponse queryPreformanceAzmyss(QueryPreformanceAzmyssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAzmyssEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAzmyssResponse queryPreformanceAzmyssEx(QueryPreformanceAzmyssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.azmyss.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAzmyssResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXnkkmhResponse queryPreformanceXnkkmh(QueryPreformanceXnkkmhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXnkkmhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXnkkmhResponse queryPreformanceXnkkmhEx(QueryPreformanceXnkkmhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xnkkmh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXnkkmhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBngodmResponse queryPreformanceBngodm(QueryPreformanceBngodmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBngodmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBngodmResponse queryPreformanceBngodmEx(QueryPreformanceBngodmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bngodm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBngodmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTtvegrResponse queryPreformanceTtvegr(QueryPreformanceTtvegrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTtvegrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTtvegrResponse queryPreformanceTtvegrEx(QueryPreformanceTtvegrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ttvegr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTtvegrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHaarbkResponse queryPreformanceHaarbk(QueryPreformanceHaarbkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHaarbkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHaarbkResponse queryPreformanceHaarbkEx(QueryPreformanceHaarbkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.haarbk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHaarbkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOnualkResponse queryPreformanceOnualk(QueryPreformanceOnualkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOnualkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOnualkResponse queryPreformanceOnualkEx(QueryPreformanceOnualkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.onualk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOnualkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZrjcrwResponse queryPreformanceZrjcrw(QueryPreformanceZrjcrwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZrjcrwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZrjcrwResponse queryPreformanceZrjcrwEx(QueryPreformanceZrjcrwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zrjcrw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZrjcrwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBztkaaResponse queryPreformanceBztkaa(QueryPreformanceBztkaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBztkaaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBztkaaResponse queryPreformanceBztkaaEx(QueryPreformanceBztkaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bztkaa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBztkaaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMtpvfgResponse queryPreformanceMtpvfg(QueryPreformanceMtpvfgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMtpvfgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMtpvfgResponse queryPreformanceMtpvfgEx(QueryPreformanceMtpvfgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mtpvfg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMtpvfgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTysxvoResponse queryPreformanceTysxvo(QueryPreformanceTysxvoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTysxvoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTysxvoResponse queryPreformanceTysxvoEx(QueryPreformanceTysxvoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.tysxvo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTysxvoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKmexgpResponse queryPreformanceKmexgp(QueryPreformanceKmexgpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKmexgpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKmexgpResponse queryPreformanceKmexgpEx(QueryPreformanceKmexgpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kmexgp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKmexgpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePwqvffResponse queryPreformancePwqvff(QueryPreformancePwqvffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePwqvffEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePwqvffResponse queryPreformancePwqvffEx(QueryPreformancePwqvffRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pwqvff.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePwqvffResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTuyazjResponse queryPreformanceTuyazj(QueryPreformanceTuyazjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTuyazjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTuyazjResponse queryPreformanceTuyazjEx(QueryPreformanceTuyazjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.tuyazj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTuyazjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSeidvgResponse queryPreformanceSeidvg(QueryPreformanceSeidvgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSeidvgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSeidvgResponse queryPreformanceSeidvgEx(QueryPreformanceSeidvgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.seidvg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSeidvgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMbtpawResponse queryPreformanceMbtpaw(QueryPreformanceMbtpawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMbtpawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMbtpawResponse queryPreformanceMbtpawEx(QueryPreformanceMbtpawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mbtpaw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMbtpawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFxblowResponse queryPreformanceFxblow(QueryPreformanceFxblowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFxblowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFxblowResponse queryPreformanceFxblowEx(QueryPreformanceFxblowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fxblow.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFxblowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAequnwResponse queryPreformanceAequnw(QueryPreformanceAequnwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAequnwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAequnwResponse queryPreformanceAequnwEx(QueryPreformanceAequnwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.aequnw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAequnwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKksgngResponse queryPreformanceKksgng(QueryPreformanceKksgngRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKksgngEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKksgngResponse queryPreformanceKksgngEx(QueryPreformanceKksgngRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kksgng.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKksgngResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEplydbResponse queryPreformanceEplydb(QueryPreformanceEplydbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEplydbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEplydbResponse queryPreformanceEplydbEx(QueryPreformanceEplydbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.eplydb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEplydbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLkdxvsResponse queryPreformanceLkdxvs(QueryPreformanceLkdxvsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLkdxvsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLkdxvsResponse queryPreformanceLkdxvsEx(QueryPreformanceLkdxvsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lkdxvs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLkdxvsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePkwuzmResponse queryPreformancePkwuzm(QueryPreformancePkwuzmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePkwuzmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePkwuzmResponse queryPreformancePkwuzmEx(QueryPreformancePkwuzmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pkwuzm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePkwuzmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTgagmiResponse queryPreformanceTgagmi(QueryPreformanceTgagmiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTgagmiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTgagmiResponse queryPreformanceTgagmiEx(QueryPreformanceTgagmiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.tgagmi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTgagmiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDadqnvResponse queryPreformanceDadqnv(QueryPreformanceDadqnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDadqnvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDadqnvResponse queryPreformanceDadqnvEx(QueryPreformanceDadqnvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dadqnv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDadqnvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCfxhofResponse queryPreformanceCfxhof(QueryPreformanceCfxhofRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCfxhofEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCfxhofResponse queryPreformanceCfxhofEx(QueryPreformanceCfxhofRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cfxhof.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCfxhofResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFlukhlResponse queryPreformanceFlukhl(QueryPreformanceFlukhlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFlukhlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFlukhlResponse queryPreformanceFlukhlEx(QueryPreformanceFlukhlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.flukhl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFlukhlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDuwewnResponse queryPreformanceDuwewn(QueryPreformanceDuwewnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDuwewnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDuwewnResponse queryPreformanceDuwewnEx(QueryPreformanceDuwewnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.duwewn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDuwewnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJcgpsjResponse queryPreformanceJcgpsj(QueryPreformanceJcgpsjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJcgpsjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJcgpsjResponse queryPreformanceJcgpsjEx(QueryPreformanceJcgpsjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jcgpsj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJcgpsjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIeexfuResponse queryPreformanceIeexfu(QueryPreformanceIeexfuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIeexfuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIeexfuResponse queryPreformanceIeexfuEx(QueryPreformanceIeexfuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ieexfu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIeexfuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGalthwResponse queryPreformanceGalthw(QueryPreformanceGalthwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGalthwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGalthwResponse queryPreformanceGalthwEx(QueryPreformanceGalthwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.galthw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGalthwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFnmdohResponse queryPreformanceFnmdoh(QueryPreformanceFnmdohRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFnmdohEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFnmdohResponse queryPreformanceFnmdohEx(QueryPreformanceFnmdohRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fnmdoh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFnmdohResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXngfdiResponse queryPreformanceXngfdi(QueryPreformanceXngfdiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXngfdiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXngfdiResponse queryPreformanceXngfdiEx(QueryPreformanceXngfdiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xngfdi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXngfdiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHynnnnResponse queryPreformanceHynnnn(QueryPreformanceHynnnnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHynnnnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHynnnnResponse queryPreformanceHynnnnEx(QueryPreformanceHynnnnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hynnnn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHynnnnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDyjtoyResponse queryPreformanceDyjtoy(QueryPreformanceDyjtoyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDyjtoyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDyjtoyResponse queryPreformanceDyjtoyEx(QueryPreformanceDyjtoyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dyjtoy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDyjtoyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWenfdhResponse queryPreformanceWenfdh(QueryPreformanceWenfdhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWenfdhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWenfdhResponse queryPreformanceWenfdhEx(QueryPreformanceWenfdhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wenfdh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWenfdhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJrctdxResponse queryPreformanceJrctdx(QueryPreformanceJrctdxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJrctdxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJrctdxResponse queryPreformanceJrctdxEx(QueryPreformanceJrctdxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jrctdx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJrctdxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDfdlkvResponse queryPreformanceDfdlkv(QueryPreformanceDfdlkvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDfdlkvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDfdlkvResponse queryPreformanceDfdlkvEx(QueryPreformanceDfdlkvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dfdlkv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDfdlkvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKnwgewResponse queryPreformanceKnwgew(QueryPreformanceKnwgewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKnwgewEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKnwgewResponse queryPreformanceKnwgewEx(QueryPreformanceKnwgewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.knwgew.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKnwgewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceApifsyResponse queryPreformanceApifsy(QueryPreformanceApifsyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceApifsyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceApifsyResponse queryPreformanceApifsyEx(QueryPreformanceApifsyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.apifsy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceApifsyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMjgxpvResponse queryPreformanceMjgxpv(QueryPreformanceMjgxpvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMjgxpvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMjgxpvResponse queryPreformanceMjgxpvEx(QueryPreformanceMjgxpvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mjgxpv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMjgxpvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAskegsResponse queryPreformanceAskegs(QueryPreformanceAskegsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAskegsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAskegsResponse queryPreformanceAskegsEx(QueryPreformanceAskegsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.askegs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAskegsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJajelfResponse queryPreformanceJajelf(QueryPreformanceJajelfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJajelfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJajelfResponse queryPreformanceJajelfEx(QueryPreformanceJajelfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jajelf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJajelfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKstsxlResponse queryPreformanceKstsxl(QueryPreformanceKstsxlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKstsxlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKstsxlResponse queryPreformanceKstsxlEx(QueryPreformanceKstsxlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kstsxl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKstsxlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYihqycResponse queryPreformanceYihqyc(QueryPreformanceYihqycRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYihqycEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYihqycResponse queryPreformanceYihqycEx(QueryPreformanceYihqycRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yihqyc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYihqycResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePaqvegResponse queryPreformancePaqveg(QueryPreformancePaqvegRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePaqvegEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePaqvegResponse queryPreformancePaqvegEx(QueryPreformancePaqvegRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.paqveg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePaqvegResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVgtiiuResponse queryPreformanceVgtiiu(QueryPreformanceVgtiiuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVgtiiuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVgtiiuResponse queryPreformanceVgtiiuEx(QueryPreformanceVgtiiuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vgtiiu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVgtiiuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSdlanzResponse queryPreformanceSdlanz(QueryPreformanceSdlanzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSdlanzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSdlanzResponse queryPreformanceSdlanzEx(QueryPreformanceSdlanzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.sdlanz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSdlanzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKkxxkfResponse queryPreformanceKkxxkf(QueryPreformanceKkxxkfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKkxxkfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKkxxkfResponse queryPreformanceKkxxkfEx(QueryPreformanceKkxxkfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kkxxkf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKkxxkfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEglmkoResponse queryPreformanceEglmko(QueryPreformanceEglmkoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEglmkoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEglmkoResponse queryPreformanceEglmkoEx(QueryPreformanceEglmkoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.eglmko.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEglmkoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOquwumResponse queryPreformanceOquwum(QueryPreformanceOquwumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOquwumEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOquwumResponse queryPreformanceOquwumEx(QueryPreformanceOquwumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.oquwum.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOquwumResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGsnlkhResponse queryPreformanceGsnlkh(QueryPreformanceGsnlkhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGsnlkhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGsnlkhResponse queryPreformanceGsnlkhEx(QueryPreformanceGsnlkhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gsnlkh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGsnlkhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOjswwdResponse queryPreformanceOjswwd(QueryPreformanceOjswwdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOjswwdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOjswwdResponse queryPreformanceOjswwdEx(QueryPreformanceOjswwdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ojswwd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOjswwdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLmpubpResponse queryPreformanceLmpubp(QueryPreformanceLmpubpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLmpubpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLmpubpResponse queryPreformanceLmpubpEx(QueryPreformanceLmpubpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lmpubp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLmpubpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMvjqpqResponse queryPreformanceMvjqpq(QueryPreformanceMvjqpqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMvjqpqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMvjqpqResponse queryPreformanceMvjqpqEx(QueryPreformanceMvjqpqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mvjqpq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMvjqpqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUpavrgResponse queryPreformanceUpavrg(QueryPreformanceUpavrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUpavrgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUpavrgResponse queryPreformanceUpavrgEx(QueryPreformanceUpavrgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.upavrg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUpavrgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHovxvtResponse queryPreformanceHovxvt(QueryPreformanceHovxvtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHovxvtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHovxvtResponse queryPreformanceHovxvtEx(QueryPreformanceHovxvtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hovxvt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHovxvtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLpgyzxResponse queryPreformanceLpgyzx(QueryPreformanceLpgyzxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLpgyzxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLpgyzxResponse queryPreformanceLpgyzxEx(QueryPreformanceLpgyzxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lpgyzx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLpgyzxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePhleouResponse queryPreformancePhleou(QueryPreformancePhleouRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePhleouEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePhleouResponse queryPreformancePhleouEx(QueryPreformancePhleouRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.phleou.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePhleouResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEzhhniResponse queryPreformanceEzhhni(QueryPreformanceEzhhniRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEzhhniEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEzhhniResponse queryPreformanceEzhhniEx(QueryPreformanceEzhhniRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ezhhni.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEzhhniResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVmkggaResponse queryPreformanceVmkgga(QueryPreformanceVmkggaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVmkggaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVmkggaResponse queryPreformanceVmkggaEx(QueryPreformanceVmkggaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vmkgga.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVmkggaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSbsurxResponse queryPreformanceSbsurx(QueryPreformanceSbsurxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSbsurxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSbsurxResponse queryPreformanceSbsurxEx(QueryPreformanceSbsurxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.sbsurx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSbsurxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGxqzrqResponse queryPreformanceGxqzrq(QueryPreformanceGxqzrqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGxqzrqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGxqzrqResponse queryPreformanceGxqzrqEx(QueryPreformanceGxqzrqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gxqzrq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGxqzrqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHvgdsqResponse queryPreformanceHvgdsq(QueryPreformanceHvgdsqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHvgdsqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHvgdsqResponse queryPreformanceHvgdsqEx(QueryPreformanceHvgdsqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hvgdsq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHvgdsqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKatrmiResponse queryPreformanceKatrmi(QueryPreformanceKatrmiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKatrmiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKatrmiResponse queryPreformanceKatrmiEx(QueryPreformanceKatrmiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.katrmi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKatrmiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRdkcqdResponse queryPreformanceRdkcqd(QueryPreformanceRdkcqdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRdkcqdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRdkcqdResponse queryPreformanceRdkcqdEx(QueryPreformanceRdkcqdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.rdkcqd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRdkcqdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYdpsaoResponse queryPreformanceYdpsao(QueryPreformanceYdpsaoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYdpsaoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYdpsaoResponse queryPreformanceYdpsaoEx(QueryPreformanceYdpsaoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ydpsao.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYdpsaoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFbqfgdResponse queryPreformanceFbqfgd(QueryPreformanceFbqfgdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFbqfgdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFbqfgdResponse queryPreformanceFbqfgdEx(QueryPreformanceFbqfgdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fbqfgd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFbqfgdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVyqznvResponse queryPreformanceVyqznv(QueryPreformanceVyqznvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVyqznvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVyqznvResponse queryPreformanceVyqznvEx(QueryPreformanceVyqznvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vyqznv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVyqznvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIwhkbpResponse queryPreformanceIwhkbp(QueryPreformanceIwhkbpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIwhkbpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIwhkbpResponse queryPreformanceIwhkbpEx(QueryPreformanceIwhkbpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.iwhkbp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIwhkbpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGcavtcResponse queryPreformanceGcavtc(QueryPreformanceGcavtcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGcavtcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGcavtcResponse queryPreformanceGcavtcEx(QueryPreformanceGcavtcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gcavtc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGcavtcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEigmbuResponse queryPreformanceEigmbu(QueryPreformanceEigmbuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEigmbuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEigmbuResponse queryPreformanceEigmbuEx(QueryPreformanceEigmbuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.eigmbu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEigmbuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNsxzrqResponse queryPreformanceNsxzrq(QueryPreformanceNsxzrqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceNsxzrqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNsxzrqResponse queryPreformanceNsxzrqEx(QueryPreformanceNsxzrqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.nsxzrq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceNsxzrqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHzlepwResponse queryPreformanceHzlepw(QueryPreformanceHzlepwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHzlepwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHzlepwResponse queryPreformanceHzlepwEx(QueryPreformanceHzlepwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hzlepw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHzlepwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUpoctvResponse queryPreformanceUpoctv(QueryPreformanceUpoctvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUpoctvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUpoctvResponse queryPreformanceUpoctvEx(QueryPreformanceUpoctvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.upoctv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUpoctvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePdyotjResponse queryPreformancePdyotj(QueryPreformancePdyotjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePdyotjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePdyotjResponse queryPreformancePdyotjEx(QueryPreformancePdyotjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pdyotj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePdyotjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQfhcuyResponse queryPreformanceQfhcuy(QueryPreformanceQfhcuyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQfhcuyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQfhcuyResponse queryPreformanceQfhcuyEx(QueryPreformanceQfhcuyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qfhcuy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQfhcuyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJuynknResponse queryPreformanceJuynkn(QueryPreformanceJuynknRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJuynknEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJuynknResponse queryPreformanceJuynknEx(QueryPreformanceJuynknRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.juynkn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJuynknResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTxdmeoResponse queryPreformanceTxdmeo(QueryPreformanceTxdmeoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTxdmeoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTxdmeoResponse queryPreformanceTxdmeoEx(QueryPreformanceTxdmeoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.txdmeo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTxdmeoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKcjxngResponse queryPreformanceKcjxng(QueryPreformanceKcjxngRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceKcjxngEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceKcjxngResponse queryPreformanceKcjxngEx(QueryPreformanceKcjxngRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.kcjxng.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceKcjxngResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXyfytzResponse queryPreformanceXyfytz(QueryPreformanceXyfytzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXyfytzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXyfytzResponse queryPreformanceXyfytzEx(QueryPreformanceXyfytzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xyfytz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXyfytzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHxmzyiResponse queryPreformanceHxmzyi(QueryPreformanceHxmzyiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHxmzyiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHxmzyiResponse queryPreformanceHxmzyiEx(QueryPreformanceHxmzyiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hxmzyi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHxmzyiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSxdzlbResponse queryPreformanceSxdzlb(QueryPreformanceSxdzlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSxdzlbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSxdzlbResponse queryPreformanceSxdzlbEx(QueryPreformanceSxdzlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.sxdzlb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSxdzlbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZmuzkgResponse queryPreformanceZmuzkg(QueryPreformanceZmuzkgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZmuzkgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZmuzkgResponse queryPreformanceZmuzkgEx(QueryPreformanceZmuzkgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zmuzkg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZmuzkgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAiojyzResponse queryPreformanceAiojyz(QueryPreformanceAiojyzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAiojyzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAiojyzResponse queryPreformanceAiojyzEx(QueryPreformanceAiojyzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.aiojyz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAiojyzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQxhgmlResponse queryPreformanceQxhgml(QueryPreformanceQxhgmlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceQxhgmlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceQxhgmlResponse queryPreformanceQxhgmlEx(QueryPreformanceQxhgmlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.qxhgml.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceQxhgmlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUbklssResponse queryPreformanceUbklss(QueryPreformanceUbklssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUbklssEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUbklssResponse queryPreformanceUbklssEx(QueryPreformanceUbklssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ubklss.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUbklssResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGcavnvResponse queryPreformanceGcavnv(QueryPreformanceGcavnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGcavnvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGcavnvResponse queryPreformanceGcavnvEx(QueryPreformanceGcavnvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gcavnv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGcavnvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUcybsnResponse queryPreformanceUcybsn(QueryPreformanceUcybsnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUcybsnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUcybsnResponse queryPreformanceUcybsnEx(QueryPreformanceUcybsnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ucybsn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUcybsnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAzwtosResponse queryPreformanceAzwtos(QueryPreformanceAzwtosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAzwtosEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAzwtosResponse queryPreformanceAzwtosEx(QueryPreformanceAzwtosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.azwtos.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAzwtosResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWrbbytResponse queryPreformanceWrbbyt(QueryPreformanceWrbbytRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWrbbytEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWrbbytResponse queryPreformanceWrbbytEx(QueryPreformanceWrbbytRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wrbbyt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWrbbytResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIvbcwvResponse queryPreformanceIvbcwv(QueryPreformanceIvbcwvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIvbcwvEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIvbcwvResponse queryPreformanceIvbcwvEx(QueryPreformanceIvbcwvRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ivbcwv.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIvbcwvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTvcsigResponse queryPreformanceTvcsig(QueryPreformanceTvcsigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceTvcsigEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceTvcsigResponse queryPreformanceTvcsigEx(QueryPreformanceTvcsigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.tvcsig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceTvcsigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVvsvkxResponse queryPreformanceVvsvkx(QueryPreformanceVvsvkxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVvsvkxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVvsvkxResponse queryPreformanceVvsvkxEx(QueryPreformanceVvsvkxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vvsvkx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVvsvkxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRxetnjResponse queryPreformanceRxetnj(QueryPreformanceRxetnjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRxetnjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRxetnjResponse queryPreformanceRxetnjEx(QueryPreformanceRxetnjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.rxetnj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRxetnjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDulefcResponse queryPreformanceDulefc(QueryPreformanceDulefcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDulefcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDulefcResponse queryPreformanceDulefcEx(QueryPreformanceDulefcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dulefc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDulefcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJsazbwResponse queryPreformanceJsazbw(QueryPreformanceJsazbwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJsazbwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJsazbwResponse queryPreformanceJsazbwEx(QueryPreformanceJsazbwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jsazbw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJsazbwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXhzfcaResponse queryPreformanceXhzfca(QueryPreformanceXhzfcaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXhzfcaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXhzfcaResponse queryPreformanceXhzfcaEx(QueryPreformanceXhzfcaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xhzfca.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXhzfcaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDgzghrResponse queryPreformanceDgzghr(QueryPreformanceDgzghrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDgzghrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDgzghrResponse queryPreformanceDgzghrEx(QueryPreformanceDgzghrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dgzghr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDgzghrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDmjttzResponse queryPreformanceDmjttz(QueryPreformanceDmjttzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDmjttzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDmjttzResponse queryPreformanceDmjttzEx(QueryPreformanceDmjttzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dmjttz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDmjttzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCahjgjResponse queryPreformanceCahjgj(QueryPreformanceCahjgjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCahjgjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCahjgjResponse queryPreformanceCahjgjEx(QueryPreformanceCahjgjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cahjgj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCahjgjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRjbfvtResponse queryPreformanceRjbfvt(QueryPreformanceRjbfvtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRjbfvtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRjbfvtResponse queryPreformanceRjbfvtEx(QueryPreformanceRjbfvtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.rjbfvt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRjbfvtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAywijlResponse queryPreformanceAywijl(QueryPreformanceAywijlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAywijlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAywijlResponse queryPreformanceAywijlEx(QueryPreformanceAywijlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.aywijl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAywijlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBcjihiResponse queryPreformanceBcjihi(QueryPreformanceBcjihiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceBcjihiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceBcjihiResponse queryPreformanceBcjihiEx(QueryPreformanceBcjihiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.bcjihi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceBcjihiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVewdbwResponse queryPreformanceVewdbw(QueryPreformanceVewdbwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVewdbwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVewdbwResponse queryPreformanceVewdbwEx(QueryPreformanceVewdbwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vewdbw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVewdbwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWgbntjResponse queryPreformanceWgbntj(QueryPreformanceWgbntjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWgbntjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWgbntjResponse queryPreformanceWgbntjEx(QueryPreformanceWgbntjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wgbntj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWgbntjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDwzzxqResponse queryPreformanceDwzzxq(QueryPreformanceDwzzxqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceDwzzxqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceDwzzxqResponse queryPreformanceDwzzxqEx(QueryPreformanceDwzzxqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.dwzzxq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceDwzzxqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMhldihResponse queryPreformanceMhldih(QueryPreformanceMhldihRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMhldihEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMhldihResponse queryPreformanceMhldihEx(QueryPreformanceMhldihRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mhldih.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMhldihResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUtiveiResponse queryPreformanceUtivei(QueryPreformanceUtiveiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUtiveiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUtiveiResponse queryPreformanceUtiveiEx(QueryPreformanceUtiveiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.utivei.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUtiveiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePrgtxgResponse queryPreformancePrgtxg(QueryPreformancePrgtxgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePrgtxgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePrgtxgResponse queryPreformancePrgtxgEx(QueryPreformancePrgtxgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.prgtxg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePrgtxgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXezxoyResponse queryPreformanceXezxoy(QueryPreformanceXezxoyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXezxoyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXezxoyResponse queryPreformanceXezxoyEx(QueryPreformanceXezxoyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xezxoy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXezxoyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceChnteuResponse queryPreformanceChnteu(QueryPreformanceChnteuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceChnteuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceChnteuResponse queryPreformanceChnteuEx(QueryPreformanceChnteuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.chnteu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceChnteuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGzbbbcResponse queryPreformanceGzbbbc(QueryPreformanceGzbbbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGzbbbcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGzbbbcResponse queryPreformanceGzbbbcEx(QueryPreformanceGzbbbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gzbbbc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGzbbbcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEdwgsrResponse queryPreformanceEdwgsr(QueryPreformanceEdwgsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEdwgsrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEdwgsrResponse queryPreformanceEdwgsrEx(QueryPreformanceEdwgsrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.edwgsr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEdwgsrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEdmasfResponse queryPreformanceEdmasf(QueryPreformanceEdmasfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEdmasfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEdmasfResponse queryPreformanceEdmasfEx(QueryPreformanceEdmasfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.edmasf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEdmasfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZzwagiResponse queryPreformanceZzwagi(QueryPreformanceZzwagiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceZzwagiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceZzwagiResponse queryPreformanceZzwagiEx(QueryPreformanceZzwagiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.zzwagi.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceZzwagiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHlgygqResponse queryPreformanceHlgygq(QueryPreformanceHlgygqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHlgygqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHlgygqResponse queryPreformanceHlgygqEx(QueryPreformanceHlgygqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hlgygq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHlgygqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXajpkiResponse queryPreformanceXajpki(QueryPreformanceXajpkiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceXajpkiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceXajpkiResponse queryPreformanceXajpkiEx(QueryPreformanceXajpkiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.xajpki.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceXajpkiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOwjbhoResponse queryPreformanceOwjbho(QueryPreformanceOwjbhoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceOwjbhoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceOwjbhoResponse queryPreformanceOwjbhoEx(QueryPreformanceOwjbhoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.owjbho.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceOwjbhoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEcvcwyResponse queryPreformanceEcvcwy(QueryPreformanceEcvcwyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEcvcwyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEcvcwyResponse queryPreformanceEcvcwyEx(QueryPreformanceEcvcwyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ecvcwy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEcvcwyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWxvpvmResponse queryPreformanceWxvpvm(QueryPreformanceWxvpvmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWxvpvmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWxvpvmResponse queryPreformanceWxvpvmEx(QueryPreformanceWxvpvmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wxvpvm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWxvpvmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceItjtfbResponse queryPreformanceItjtfb(QueryPreformanceItjtfbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceItjtfbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceItjtfbResponse queryPreformanceItjtfbEx(QueryPreformanceItjtfbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.itjtfb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceItjtfbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCvlthhResponse queryPreformanceCvlthh(QueryPreformanceCvlthhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCvlthhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCvlthhResponse queryPreformanceCvlthhEx(QueryPreformanceCvlthhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cvlthh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCvlthhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMnedehResponse queryPreformanceMnedeh(QueryPreformanceMnedehRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMnedehEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMnedehResponse queryPreformanceMnedehEx(QueryPreformanceMnedehRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mnedeh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMnedehResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIisiwtResponse queryPreformanceIisiwt(QueryPreformanceIisiwtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceIisiwtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceIisiwtResponse queryPreformanceIisiwtEx(QueryPreformanceIisiwtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.iisiwt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceIisiwtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNbdxumResponse queryPreformanceNbdxum(QueryPreformanceNbdxumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceNbdxumEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceNbdxumResponse queryPreformanceNbdxumEx(QueryPreformanceNbdxumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.nbdxum.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceNbdxumResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSzsmhtResponse queryPreformanceSzsmht(QueryPreformanceSzsmhtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSzsmhtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSzsmhtResponse queryPreformanceSzsmhtEx(QueryPreformanceSzsmhtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.szsmht.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSzsmhtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVfrukaResponse queryPreformanceVfruka(QueryPreformanceVfrukaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceVfrukaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceVfrukaResponse queryPreformanceVfrukaEx(QueryPreformanceVfrukaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.vfruka.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceVfrukaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGcvnehResponse queryPreformanceGcvneh(QueryPreformanceGcvnehRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceGcvnehEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceGcvnehResponse queryPreformanceGcvnehEx(QueryPreformanceGcvnehRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.gcvneh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceGcvnehResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWmxlgeResponse queryPreformanceWmxlge(QueryPreformanceWmxlgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWmxlgeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWmxlgeResponse queryPreformanceWmxlgeEx(QueryPreformanceWmxlgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wmxlge.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWmxlgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLcsnasResponse queryPreformanceLcsnas(QueryPreformanceLcsnasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLcsnasEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLcsnasResponse queryPreformanceLcsnasEx(QueryPreformanceLcsnasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lcsnas.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLcsnasResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEmfcanResponse queryPreformanceEmfcan(QueryPreformanceEmfcanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEmfcanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEmfcanResponse queryPreformanceEmfcanEx(QueryPreformanceEmfcanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.emfcan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEmfcanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHmgrsyResponse queryPreformanceHmgrsy(QueryPreformanceHmgrsyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHmgrsyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHmgrsyResponse queryPreformanceHmgrsyEx(QueryPreformanceHmgrsyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hmgrsy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHmgrsyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFgadhfResponse queryPreformanceFgadhf(QueryPreformanceFgadhfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFgadhfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFgadhfResponse queryPreformanceFgadhfEx(QueryPreformanceFgadhfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fgadhf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFgadhfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRmevfqResponse queryPreformanceRmevfq(QueryPreformanceRmevfqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceRmevfqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceRmevfqResponse queryPreformanceRmevfqEx(QueryPreformanceRmevfqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.rmevfq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceRmevfqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceElpwxxResponse queryPreformanceElpwxx(QueryPreformanceElpwxxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceElpwxxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceElpwxxResponse queryPreformanceElpwxxEx(QueryPreformanceElpwxxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.elpwxx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceElpwxxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAislleResponse queryPreformanceAislle(QueryPreformanceAislleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAislleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAislleResponse queryPreformanceAislleEx(QueryPreformanceAislleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.aislle.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAislleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFbupcoResponse queryPreformanceFbupco(QueryPreformanceFbupcoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceFbupcoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceFbupcoResponse queryPreformanceFbupcoEx(QueryPreformanceFbupcoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.fbupco.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceFbupcoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSolifaResponse queryPreformanceSolifa(QueryPreformanceSolifaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceSolifaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceSolifaResponse queryPreformanceSolifaEx(QueryPreformanceSolifaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.solifa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceSolifaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEcowvhResponse queryPreformanceEcowvh(QueryPreformanceEcowvhRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceEcowvhEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceEcowvhResponse queryPreformanceEcowvhEx(QueryPreformanceEcowvhRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ecowvh.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceEcowvhResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMudnyeResponse queryPreformanceMudnye(QueryPreformanceMudnyeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceMudnyeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceMudnyeResponse queryPreformanceMudnyeEx(QueryPreformanceMudnyeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.mudnye.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceMudnyeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLswaxkResponse queryPreformanceLswaxk(QueryPreformanceLswaxkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLswaxkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLswaxkResponse queryPreformanceLswaxkEx(QueryPreformanceLswaxkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.lswaxk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLswaxkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAruxngResponse queryPreformanceAruxng(QueryPreformanceAruxngRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceAruxngEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceAruxngResponse queryPreformanceAruxngEx(QueryPreformanceAruxngRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.aruxng.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceAruxngResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHbnwdpResponse queryPreformanceHbnwdp(QueryPreformanceHbnwdpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHbnwdpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHbnwdpResponse queryPreformanceHbnwdpEx(QueryPreformanceHbnwdpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hbnwdp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHbnwdpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUfdptnResponse queryPreformanceUfdptn(QueryPreformanceUfdptnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceUfdptnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceUfdptnResponse queryPreformanceUfdptnEx(QueryPreformanceUfdptnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ufdptn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceUfdptnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceReyqjrResponse queryPreformanceReyqjr(QueryPreformanceReyqjrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceReyqjrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceReyqjrResponse queryPreformanceReyqjrEx(QueryPreformanceReyqjrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.reyqjr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceReyqjrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWtxvtjResponse queryPreformanceWtxvtj(QueryPreformanceWtxvtjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceWtxvtjEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceWtxvtjResponse queryPreformanceWtxvtjEx(QueryPreformanceWtxvtjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.wtxvtj.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceWtxvtjResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLjbjmkResponse queryPreformanceLjbjmk(QueryPreformanceLjbjmkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceLjbjmkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceLjbjmkResponse queryPreformanceLjbjmkEx(QueryPreformanceLjbjmkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ljbjmk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceLjbjmkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCryfwzResponse queryPreformanceCryfwz(QueryPreformanceCryfwzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceCryfwzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceCryfwzResponse queryPreformanceCryfwzEx(QueryPreformanceCryfwzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.cryfwz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceCryfwzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePxnzuwResponse queryPreformancePxnzuw(QueryPreformancePxnzuwRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePxnzuwEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePxnzuwResponse queryPreformancePxnzuwEx(QueryPreformancePxnzuwRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.pxnzuw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePxnzuwResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePpefnnResponse queryPreformancePpefnn(QueryPreformancePpefnnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformancePpefnnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformancePpefnnResponse queryPreformancePpefnnEx(QueryPreformancePpefnnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.ppefnn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformancePpefnnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHhekdxResponse queryPreformanceHhekdx(QueryPreformanceHhekdxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceHhekdxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceHhekdxResponse queryPreformanceHhekdxEx(QueryPreformanceHhekdxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.hhekdx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceHhekdxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYirplbResponse queryPreformanceYirplb(QueryPreformanceYirplbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceYirplbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceYirplbResponse queryPreformanceYirplbEx(QueryPreformanceYirplbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.yirplb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceYirplbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJgxxvbResponse queryPreformanceJgxxvb(QueryPreformanceJgxxvbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreformanceJgxxvbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门户性能测试
     * Summary: 门户性能测试</p>
     */
    public QueryPreformanceJgxxvbResponse queryPreformanceJgxxvbEx(QueryPreformanceJgxxvbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.preformance.jgxxvb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreformanceJgxxvbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建http协议api
     * Summary: 创建http协议api</p>
     */
    public ApiCreateHttpResponse apiCreateHttp(ApiCreateHttpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiCreateHttpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建http协议api
     * Summary: 创建http协议api</p>
     */
    public ApiCreateHttpResponse apiCreateHttpEx(ApiCreateHttpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.jzqproducta.create.http.api", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiCreateHttpResponse());
    }
}
