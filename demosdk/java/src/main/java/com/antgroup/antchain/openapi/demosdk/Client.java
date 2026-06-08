// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.demosdk.models.*;

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
                    new TeaPair("sdk_version", "1.3.45"),
                    new TeaPair("_prod_code", "DEMOSDK"),
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
     * <p>Description: 用于结构体上线测试
     * Summary: 用于结构体上线测试</p>
     */
    public TestStructOnlineResponse testStructOnline(TestStructOnlineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testStructOnlineEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于结构体上线测试
     * Summary: 用于结构体上线测试</p>
     */
    public TestStructOnlineResponse testStructOnlineEx(TestStructOnlineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.struct.online.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestStructOnlineResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 结构体测试·edit for test18
     * Summary: 结构体测试·edit for test18</p>
     */
    public TestaStructCreateResponse testaStructCreate(TestaStructCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testaStructCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 结构体测试·edit for test18
     * Summary: 结构体测试·edit for test18</p>
     */
    public TestaStructCreateResponse testaStructCreateEx(TestaStructCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.struct.create.testa", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestaStructCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 这是测试的
     * Summary: 这是测试的</p>
     */
    public QueryAaaSdkResponse queryAaaSdk(QueryAaaSdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaSdkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 这是测试的
     * Summary: 这是测试的</p>
     */
    public QueryAaaSdkResponse queryAaaSdkEx(QueryAaaSdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.aaa.sdk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaSdkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: l
     * Summary: l</p>
     */
    public QueryMultiCciuResponse queryMultiCciu(QueryMultiCciuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMultiCciuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: l
     * Summary: l</p>
     */
    public QueryMultiCciuResponse queryMultiCciuEx(QueryMultiCciuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.multi.cciu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMultiCciuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: a
     * Summary: a</p>
     */
    public QueryIamTestResponse queryIamTest(QueryIamTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIamTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: a
     * Summary: a</p>
     */
    public QueryIamTestResponse queryIamTestEx(QueryIamTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.iam.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIamTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iam同步测试
     * Summary: iam同步测试</p>
     */
    public TestIamSynchronousResponse testIamSynchronous(TestIamSynchronousRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testIamSynchronousEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iam同步测试
     * Summary: iam同步测试</p>
     */
    public TestIamSynchronousResponse testIamSynchronousEx(TestIamSynchronousRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.iam.synchronous.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestIamSynchronousResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iam同步测试
     * Summary: iam同步测试</p>
     */
    public IamIamIamResponse iamIamIam(IamIamIamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.iamIamIamEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iam同步测试
     * Summary: iam同步测试</p>
     */
    public IamIamIamResponse iamIamIamEx(IamIamIamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.iam.iam.iam", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IamIamIamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iam推送测试
     * Summary: iam推送测试</p>
     */
    public TestIamPushResponse testIamPush(TestIamPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testIamPushEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iam推送测试
     * Summary: iam推送测试</p>
     */
    public TestIamPushResponse testIamPushEx(TestIamPushRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.iam.push.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestIamPushResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryIamPushResponse queryIamPush(QueryIamPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIamPushEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryIamPushResponse queryIamPushEx(QueryIamPushRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.iam.push.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIamPushResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public IamApipushForResponse iamApipushFor(IamApipushForRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.iamApipushForEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public IamApipushForResponse iamApipushForEx(IamApipushForRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.apipush.for.iam", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IamApipushForResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: queryApiConfig接口优化
     * Summary: queryApiConfig接口优化</p>
     */
    public ConfigQueryApiResponse configQueryApi(ConfigQueryApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.configQueryApiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: queryApiConfig接口优化
     * Summary: queryApiConfig接口优化</p>
     */
    public ConfigQueryApiResponse configQueryApiEx(ConfigQueryApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.query.api.config", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfigQueryApiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindAaaBbbCccResponse bindAaaBbbCcc(BindAaaBbbCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindAaaBbbCccResponse bindAaaBbbCccEx(BindAaaBbbCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCccResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public QueryAaaCcdResponse queryAaaCcd(QueryAaaCcdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaCcdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public QueryAaaCcdResponse queryAaaCcdEx(QueryAaaCcdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.aaa.ccd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaCcdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindXxxResponse bindXxx(BindXxxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindXxxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindXxxResponse bindXxxEx(BindXxxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindXxxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试api流程
     * Summary: 测试api流程</p>
     */
    public QueryTxtResponse queryTxt(QueryTxtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTxtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试api流程
     * Summary: 测试api流程</p>
     */
    public QueryTxtResponse queryTxtEx(QueryTxtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.txt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTxtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: desc
     * Summary: desc</p>
     */
    public ListTxtResponse listTxt(ListTxtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTxtEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: desc
     * Summary: desc</p>
     */
    public ListTxtResponse listTxtEx(ListTxtRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.txt.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListTxtResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于个人工作台二期测试使用测试test
     * Summary: 用于个人工作台二期测试使用测试test</p>
     */
    public QueryWorkbenchTestResponse queryWorkbenchTest(QueryWorkbenchTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWorkbenchTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于个人工作台二期测试使用测试test
     * Summary: 用于个人工作台二期测试使用测试test</p>
     */
    public QueryWorkbenchTestResponse queryWorkbenchTestEx(QueryWorkbenchTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.workbench.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWorkbenchTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口</p>
     */
    public ImportAbcdOneResponse importAbcdOne(ImportAbcdOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importAbcdOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口</p>
     */
    public ImportAbcdOneResponse importAbcdOneEx(ImportAbcdOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.abcd.one.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportAbcdOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用</p>
     */
    public PublishWorkbenchOneResponse publishWorkbenchOne(PublishWorkbenchOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishWorkbenchOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用</p>
     */
    public PublishWorkbenchOneResponse publishWorkbenchOneEx(PublishWorkbenchOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.workbench.one.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishWorkbenchOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试
     * Summary: 个人工作台测试</p>
     */
    public PublishWorkbenchTwoResponse publishWorkbenchTwo(PublishWorkbenchTwoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishWorkbenchTwoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试
     * Summary: 个人工作台测试</p>
     */
    public PublishWorkbenchTwoResponse publishWorkbenchTwoEx(PublishWorkbenchTwoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.workbench.two.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishWorkbenchTwoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试1
     * Summary: 个人工作台二期预发测试1</p>
     */
    public PublishTwiceOneResponse publishTwiceOne(PublishTwiceOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishTwiceOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试1
     * Summary: 个人工作台二期预发测试1</p>
     */
    public PublishTwiceOneResponse publishTwiceOneEx(PublishTwiceOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.twice.one.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishTwiceOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportTwiceThreeResponse importTwiceThree(ImportTwiceThreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importTwiceThreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportTwiceThreeResponse importTwiceThreeEx(ImportTwiceThreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.twice.three.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportTwiceThreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用</p>
     */
    public PublishWorkbenchThreeResponse publishWorkbenchThree(PublishWorkbenchThreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishWorkbenchThreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用</p>
     */
    public PublishWorkbenchThreeResponse publishWorkbenchThreeEx(PublishWorkbenchThreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.workbench.three.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishWorkbenchThreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用</p>
     */
    public PublishWorkbenchFourResponse publishWorkbenchFour(PublishWorkbenchFourRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishWorkbenchFourEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用</p>
     */
    public PublishWorkbenchFourResponse publishWorkbenchFourEx(PublishWorkbenchFourRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.workbench.four.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishWorkbenchFourResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AAAA
     * Summary: AAAA</p>
     */
    public QueryAaaQqqResponse queryAaaQqq(QueryAaaQqqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaQqqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AAAA
     * Summary: AAAA</p>
     */
    public QueryAaaQqqResponse queryAaaQqqEx(QueryAaaQqqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.aaa.qqq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaQqqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: a
     * Summary: a</p>
     */
    public CABResponse cAB(CABRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cABEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: a
     * Summary: a</p>
     */
    public CABResponse cABEx(CABRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.a.b.c", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CABResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: 测试</p>
     */
    public AAAResponse aAA(AAARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aAAEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: 测试</p>
     */
    public AAAResponse aAAEx(AAARequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.a.a.a", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AAAResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试使用
     * Summary: 自动化测试使用</p>
     */
    public ApiAutotestCreateResponse apiAutotestCreate(ApiAutotestCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiAutotestCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试使用
     * Summary: 自动化测试使用</p>
     */
    public ApiAutotestCreateResponse apiAutotestCreateEx(ApiAutotestCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.autotest.create.api", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiAutotestCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 这是编辑后的描述
     * Summary: 这是编辑后的描述</p>
     */
    public ZhongyipretestbZhongyipretestbZhongyipretestbResponse zhongyipretestbZhongyipretestbZhongyipretestb(ZhongyipretestbZhongyipretestbZhongyipretestbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.zhongyipretestbZhongyipretestbZhongyipretestbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 这是编辑后的描述
     * Summary: 这是编辑后的描述</p>
     */
    public ZhongyipretestbZhongyipretestbZhongyipretestbResponse zhongyipretestbZhongyipretestbZhongyipretestbEx(ZhongyipretestbZhongyipretestbZhongyipretestbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.zhongyipretestb.zhongyipretestb.zhongyipretestb", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ZhongyipretestbZhongyipretestbZhongyipretestbResponse());
    }
}
