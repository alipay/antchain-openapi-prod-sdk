// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ee637c8293f64104af9686dc12e0cd18;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_ee637c8293f64104af9686dc12e0cd18.models.*;
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
                    new TeaPair("sdk_version", "1.0.179"),
                    new TeaPair("_prod_code", "ak_ee637c8293f64104af9686dc12e0cd18"),
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
     * Description: sss
     * Summary: ss
     */
    public BindDemoSssSsSsResponse bindDemoSssSsSs(BindDemoSssSsSsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoSssSsSsEx(request, headers, runtime);
    }

    /**
     * Description: sss
     * Summary: ss
     */
    public BindDemoSssSsSsResponse bindDemoSssSsSsEx(BindDemoSssSsSsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.sss.ss.ss.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoSssSsSsResponse());
    }

    /**
     * Description: testaaa
     * Summary: test
     */
    public BindDemoTestTestTestResponse bindDemoTestTestTest(BindDemoTestTestTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoTestTestTestEx(request, headers, runtime);
    }

    /**
     * Description: testaaa
     * Summary: test
     */
    public BindDemoTestTestTestResponse bindDemoTestTestTestEx(BindDemoTestTestTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.test.test.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoTestTestTestResponse());
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api
     */
    public QueryDemoTestTestobjectBbbResponse queryDemoTestTestobjectBbb(QueryDemoTestTestobjectBbbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoTestTestobjectBbbEx(request, headers, runtime);
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api
     */
    public QueryDemoTestTestobjectBbbResponse queryDemoTestTestobjectBbbEx(QueryDemoTestTestobjectBbbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoTestTestobjectBbbResponse());
    }

    /**
     * Description: sdf
     * Summary: sdf
     */
    public BindDemoSdfSssSssResponse bindDemoSdfSssSss(BindDemoSdfSssSssRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoSdfSssSssEx(request, headers, runtime);
    }

    /**
     * Description: sdf
     * Summary: sdf
     */
    public BindDemoSdfSssSssResponse bindDemoSdfSssSssEx(BindDemoSdfSssSssRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoSdfSssSssResponse());
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费
     */
    public RegisterDemoTestBizeventMessageResponse registerDemoTestBizeventMessage(RegisterDemoTestBizeventMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerDemoTestBizeventMessageEx(request, headers, runtime);
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费
     */
    public RegisterDemoTestBizeventMessageResponse registerDemoTestBizeventMessageEx(RegisterDemoTestBizeventMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterDemoTestBizeventMessageResponse());
    }

    /**
     * Description: cj test
     * Summary: cj test
     */
    public QueryDemoCjtestCjResResponse queryDemoCjtestCjRes(QueryDemoCjtestCjResRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoCjtestCjResEx(request, headers, runtime);
    }

    /**
     * Description: cj test
     * Summary: cj test
     */
    public QueryDemoCjtestCjResResponse queryDemoCjtestCjResEx(QueryDemoCjtestCjResRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoCjtestCjResResponse());
    }

    /**
     * Description: testc
     * Summary: 测试用api
     */
    public PublishDemoSaasTestTestcResponse publishDemoSaasTestTestc(PublishDemoSaasTestTestcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishDemoSaasTestTestcEx(request, headers, runtime);
    }

    /**
     * Description: testc
     * Summary: 测试用api
     */
    public PublishDemoSaasTestTestcResponse publishDemoSaasTestTestcEx(PublishDemoSaasTestTestcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishDemoSaasTestTestcResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTesthResponse createDemoSaasTestTesth(CreateDemoSaasTestTesthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoSaasTestTesthEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTesthResponse createDemoSaasTestTesthEx(CreateDemoSaasTestTesthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoSaasTestTesthResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTestiResponse createDemoSaasTestTesti(CreateDemoSaasTestTestiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoSaasTestTestiEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTestiResponse createDemoSaasTestTestiEx(CreateDemoSaasTestTestiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoSaasTestTestiResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public ReplaceDemoSaasTestTestjResponse replaceDemoSaasTestTestj(ReplaceDemoSaasTestTestjRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceDemoSaasTestTestjEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public ReplaceDemoSaasTestTestjResponse replaceDemoSaasTestTestjEx(ReplaceDemoSaasTestTestjRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testj.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceDemoSaasTestTestjResponse());
    }

    /**
     * Description: 2
     * Summary: 2
     */
    public QueryDemoTestyyQResponse queryDemoTestyyQ(QueryDemoTestyyQRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoTestyyQEx(request, headers, runtime);
    }

    /**
     * Description: 2
     * Summary: 2
     */
    public QueryDemoTestyyQResponse queryDemoTestyyQEx(QueryDemoTestyyQRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.testyy.q.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoTestyyQResponse());
    }

    /**
     * Description: 1
     * Summary: 1
     */
    public QueryDemoTestzzQResponse queryDemoTestzzQ(QueryDemoTestzzQRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoTestzzQEx(request, headers, runtime);
    }

    /**
     * Description: 1
     * Summary: 1
     */
    public QueryDemoTestzzQResponse queryDemoTestzzQEx(QueryDemoTestzzQRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.testzz.q.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoTestzzQResponse());
    }

    /**
     * Description: 1
     * Summary: 1
     */
    public QueryDemoTestzzzQResponse queryDemoTestzzzQ(QueryDemoTestzzzQRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoTestzzzQEx(request, headers, runtime);
    }

    /**
     * Description: 1
     * Summary: 1
     */
    public QueryDemoTestzzzQResponse queryDemoTestzzzQEx(QueryDemoTestzzzQRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.testzzz.q.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoTestzzzQResponse());
    }

    /**
     * Description: 测试佐罗接口
     * Summary: 测试佐罗接口
     */
    public QueryDemoZolozFacecompareResponse queryDemoZolozFacecompare(QueryDemoZolozFacecompareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoZolozFacecompareEx(request, headers, runtime);
    }

    /**
     * Description: 测试佐罗接口
     * Summary: 测试佐罗接口
     */
    public QueryDemoZolozFacecompareResponse queryDemoZolozFacecompareEx(QueryDemoZolozFacecompareRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.zoloz.facecompare.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoZolozFacecompareResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryDemoXyzDemoXxxResponse queryDemoXyzDemoXxx(QueryDemoXyzDemoXxxRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoXyzDemoXxxEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryDemoXyzDemoXxxResponse queryDemoXyzDemoXxxEx(QueryDemoXyzDemoXxxRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.xyz.demo.xxx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoXyzDemoXxxResponse());
    }
}
