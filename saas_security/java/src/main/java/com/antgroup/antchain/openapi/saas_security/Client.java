// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.saas_security.models.*;

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
                    new TeaPair("sdk_version", "1.0.28"),
                    new TeaPair("_prod_code", "SAAS_SECURITY"),
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
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public CheckInfosecHoloxcontentcheckserviceResponse checkInfosecHoloxcontentcheckservice(CheckInfosecHoloxcontentcheckserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInfosecHoloxcontentcheckserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public CheckInfosecHoloxcontentcheckserviceResponse checkInfosecHoloxcontentcheckserviceEx(CheckInfosecHoloxcontentcheckserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckservice.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckInfosecHoloxcontentcheckserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public QuerySecuritycoreSecurityuniformserviceResponse querySecuritycoreSecurityuniformservice(QuerySecuritycoreSecurityuniformserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecuritycoreSecurityuniformserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public QuerySecuritycoreSecurityuniformserviceResponse querySecuritycoreSecurityuniformserviceEx(QuerySecuritycoreSecurityuniformserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecuritycoreSecurityuniformserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public CheckRdsRdsserviceResponse checkRdsRdsservice(CheckRdsRdsserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRdsRdsserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public CheckRdsRdsserviceResponse checkRdsRdsserviceEx(CheckRdsRdsserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckRdsRdsserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 大安全内容风控接口</p>
     */
    public QueryInfosecHoloxcontentcheckqueryserviceResponse queryInfosecHoloxcontentcheckqueryservice(QueryInfosecHoloxcontentcheckqueryserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInfosecHoloxcontentcheckqueryserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 大安全内容风控接口</p>
     */
    public QueryInfosecHoloxcontentcheckqueryserviceResponse queryInfosecHoloxcontentcheckqueryserviceEx(QueryInfosecHoloxcontentcheckqueryserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckqueryservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInfosecHoloxcontentcheckqueryserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public VerifyRdslibAntcaptchaserviceResponse verifyRdslibAntcaptchaservice(VerifyRdslibAntcaptchaserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyRdslibAntcaptchaserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public VerifyRdslibAntcaptchaserviceResponse verifyRdslibAntcaptchaserviceEx(VerifyRdslibAntcaptchaserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyRdslibAntcaptchaserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public QueryTscenterUmidqueryserviceResponse queryTscenterUmidqueryservice(QueryTscenterUmidqueryserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTscenterUmidqueryserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全接口
     * Summary: 大安全接口</p>
     */
    public QueryTscenterUmidqueryserviceResponse queryTscenterUmidqueryserviceEx(QueryTscenterUmidqueryserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTscenterUmidqueryserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全检验内容安全接口
     * Summary: 大安全检验内容安全接口</p>
     */
    public CheckInfosecOpencheckservicecheckResponse checkInfosecOpencheckservicecheck(CheckInfosecOpencheckservicecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInfosecOpencheckservicecheckEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全检验内容安全接口
     * Summary: 大安全检验内容安全接口</p>
     */
    public CheckInfosecOpencheckservicecheckResponse checkInfosecOpencheckservicecheckEx(CheckInfosecOpencheckservicecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.infosec.opencheckservicecheck.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckInfosecOpencheckservicecheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口</p>
     */
    public QueryInfosecOpencheckservicequeryResponse queryInfosecOpencheckservicequery(QueryInfosecOpencheckservicequeryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInfosecOpencheckservicequeryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口</p>
     */
    public QueryInfosecOpencheckservicequeryResponse queryInfosecOpencheckservicequeryEx(QueryInfosecOpencheckservicequeryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInfosecOpencheckservicequeryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public QueryDemoResponse queryDemo(QueryDemoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public QueryDemoResponse queryDemoEx(QueryDemoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.demo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天鉴ask接口
     * Summary: 天鉴ask接口</p>
     */
    public QueryGuardAskResponse queryGuardAsk(QueryGuardAskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardAskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天鉴ask接口
     * Summary: 天鉴ask接口</p>
     */
    public QueryGuardAskResponse queryGuardAskEx(QueryGuardAskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.guard.ask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardAskResponse());
    }
}
