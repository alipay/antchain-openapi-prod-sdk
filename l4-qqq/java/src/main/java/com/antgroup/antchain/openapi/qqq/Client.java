// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.qqq.models.*;

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
                    new TeaPair("sdk_version", "2.0.16"),
                    new TeaPair("_prod_code", "QQQ"),
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
     * <p>Description: 压测接口5
     * Summary: 压测接口5</p>
     */
    public QueryAntchainAbcTimeFiveResponse queryAntchainAbcTimeFive(QueryAntchainAbcTimeFiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAbcTimeFiveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口5
     * Summary: 压测接口5</p>
     */
    public QueryAntchainAbcTimeFiveResponse queryAntchainAbcTimeFiveEx(QueryAntchainAbcTimeFiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAbcTimeFiveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323</p>
     */
    public QueryAntchainAbcApprovalTestResponse queryAntchainAbcApprovalTest(QueryAntchainAbcApprovalTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAbcApprovalTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323</p>
     */
    public QueryAntchainAbcApprovalTestResponse queryAntchainAbcApprovalTestEx(QueryAntchainAbcApprovalTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAbcApprovalTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用api
     * Summary: 测试使用api</p>
     */
    public ApiAntchainAbcTestCreateResponse apiAntchainAbcTestCreate(ApiAntchainAbcTestCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiAntchainAbcTestCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用api
     * Summary: 测试使用api</p>
     */
    public ApiAntchainAbcTestCreateResponse apiAntchainAbcTestCreateEx(ApiAntchainAbcTestCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiAntchainAbcTestCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</p>
     */
    public QueryAntchainAbcOneLimitResponse queryAntchainAbcOneLimit(QueryAntchainAbcOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainAbcOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</p>
     */
    public QueryAntchainAbcOneLimitResponse queryAntchainAbcOneLimitEx(QueryAntchainAbcOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainAbcOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口</p>
     */
    public UnstabilizeAntchainAbcOneLimitResponse unstabilizeAntchainAbcOneLimit(UnstabilizeAntchainAbcOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unstabilizeAntchainAbcOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口</p>
     */
    public UnstabilizeAntchainAbcOneLimitResponse unstabilizeAntchainAbcOneLimitEx(UnstabilizeAntchainAbcOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnstabilizeAntchainAbcOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public ResetAntchainDemosdkBbbCccResponse resetAntchainDemosdkBbbCcc(ResetAntchainDemosdkBbbCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetAntchainDemosdkBbbCccEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public ResetAntchainDemosdkBbbCccResponse resetAntchainDemosdkBbbCccEx(ResetAntchainDemosdkBbbCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.bbb.ccc.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetAntchainDemosdkBbbCccResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindAntchainDemosdkXxxResponse bindAntchainDemosdkXxx(BindAntchainDemosdkXxxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAntchainDemosdkXxxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindAntchainDemosdkXxxResponse bindAntchainDemosdkXxxEx(BindAntchainDemosdkXxxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAntchainDemosdkXxxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: 测试</p>
     */
    public QueryAntchainDemosdkCcXxResponse queryAntchainDemosdkCcXx(QueryAntchainDemosdkCcXxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainDemosdkCcXxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: 测试</p>
     */
    public QueryAntchainDemosdkCcXxResponse queryAntchainDemosdkCcXxEx(QueryAntchainDemosdkCcXxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.cc.xx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainDemosdkCcXxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期分组路由灰度测试接口
     * Summary: 个人工作台二期分组路由灰度测试接口</p>
     */
    public ResetAntchainDemosdkAbcdLimitResponse resetAntchainDemosdkAbcdLimit(ResetAntchainDemosdkAbcdLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetAntchainDemosdkAbcdLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期分组路由灰度测试接口
     * Summary: 个人工作台二期分组路由灰度测试接口</p>
     */
    public ResetAntchainDemosdkAbcdLimitResponse resetAntchainDemosdkAbcdLimitEx(ResetAntchainDemosdkAbcdLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.abcd.limit.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetAntchainDemosdkAbcdLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用</p>
     */
    public ImportAntchainDemosdkCreateOneResponse importAntchainDemosdkCreateOne(ImportAntchainDemosdkCreateOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importAntchainDemosdkCreateOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用</p>
     */
    public ImportAntchainDemosdkCreateOneResponse importAntchainDemosdkCreateOneEx(ImportAntchainDemosdkCreateOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.create.one.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportAntchainDemosdkCreateOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public WithdrawAntchainDemosdkTwiceOneResponse withdrawAntchainDemosdkTwiceOne(WithdrawAntchainDemosdkTwiceOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.withdrawAntchainDemosdkTwiceOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public WithdrawAntchainDemosdkTwiceOneResponse withdrawAntchainDemosdkTwiceOneEx(WithdrawAntchainDemosdkTwiceOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.twice.one.withdraw", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new WithdrawAntchainDemosdkTwiceOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public OperateAntchainDemosdkTwiceOneResponse operateAntchainDemosdkTwiceOne(OperateAntchainDemosdkTwiceOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateAntchainDemosdkTwiceOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public OperateAntchainDemosdkTwiceOneResponse operateAntchainDemosdkTwiceOneEx(OperateAntchainDemosdkTwiceOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.twice.one.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateAntchainDemosdkTwiceOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public QueryAntchainDemosdkTwiceThreeResponse queryAntchainDemosdkTwiceThree(QueryAntchainDemosdkTwiceThreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainDemosdkTwiceThreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public QueryAntchainDemosdkTwiceThreeResponse queryAntchainDemosdkTwiceThreeEx(QueryAntchainDemosdkTwiceThreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.twice.three.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainDemosdkTwiceThreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public UnstabilizeAntchainDemosdkTwiceThreeResponse unstabilizeAntchainDemosdkTwiceThree(UnstabilizeAntchainDemosdkTwiceThreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unstabilizeAntchainDemosdkTwiceThreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public UnstabilizeAntchainDemosdkTwiceThreeResponse unstabilizeAntchainDemosdkTwiceThreeEx(UnstabilizeAntchainDemosdkTwiceThreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.twice.three.unstabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnstabilizeAntchainDemosdkTwiceThreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public QueryAntchainDemosdkTesxResponse queryAntchainDemosdkTesx(QueryAntchainDemosdkTesxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainDemosdkTesxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public QueryAntchainDemosdkTesxResponse queryAntchainDemosdkTesxEx(QueryAntchainDemosdkTesxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.demosdk.tesx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainDemosdkTesxResponse());
    }
}
