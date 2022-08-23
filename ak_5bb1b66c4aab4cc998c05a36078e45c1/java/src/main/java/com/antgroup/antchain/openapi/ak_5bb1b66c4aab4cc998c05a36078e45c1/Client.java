// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models.*;
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
            new TeaPair("keepAliveDurationMillis", _keepAliveDurationMillis),
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
                    new TeaPair("sdk_version", "1.0.8"),
                    new TeaPair("_prod_code", "ak_5bb1b66c4aab4cc998c05a36078e45c1"),
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
     * Description: 核身初始化接口
     * Summary: 核身初始化接口
     */
    public InitAntchainBbpVerifyResponse initAntchainBbpVerify(InitAntchainBbpVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initAntchainBbpVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口
     */
    public InitAntchainBbpVerifyResponse initAntchainBbpVerifyEx(InitAntchainBbpVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitAntchainBbpVerifyResponse());
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口
     */
    public StartAntchainBbpVerifyResponse startAntchainBbpVerify(StartAntchainBbpVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAntchainBbpVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口
     */
    public StartAntchainBbpVerifyResponse startAntchainBbpVerifyEx(StartAntchainBbpVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartAntchainBbpVerifyResponse());
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询
     */
    public CheckAntchainBbpVerifyResponse checkAntchainBbpVerify(CheckAntchainBbpVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAntchainBbpVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询
     */
    public CheckAntchainBbpVerifyResponse checkAntchainBbpVerifyEx(CheckAntchainBbpVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAntchainBbpVerifyResponse());
    }

    /**
     * Description: SaaS服务调用
     * Summary: SaaS服务调用
     */
    public RunAntchainSaasMarketServiceResponse runAntchainSaasMarketService(RunAntchainSaasMarketServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runAntchainSaasMarketServiceEx(request, headers, runtime);
    }

    /**
     * Description: SaaS服务调用
     * Summary: SaaS服务调用
     */
    public RunAntchainSaasMarketServiceResponse runAntchainSaasMarketServiceEx(RunAntchainSaasMarketServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunAntchainSaasMarketServiceResponse());
    }

    /**
     * Description: 查询解决方案，包括能力列表
     * Summary: 查询解决方案，包括能力列表
     */
    public QueryAntchainSaasMarketSolutionResponse queryAntchainSaasMarketSolution(QueryAntchainSaasMarketSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainSaasMarketSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 查询解决方案，包括能力列表
     * Summary: 查询解决方案，包括能力列表
     */
    public QueryAntchainSaasMarketSolutionResponse queryAntchainSaasMarketSolutionEx(QueryAntchainSaasMarketSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.market.solution.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainSaasMarketSolutionResponse());
    }

    /**
     * Description: 对企业身份进行认证
     * Summary: 企业四要素认证
     */
    public VerifyAntchainBbpMetaResponse verifyAntchainBbpMeta(VerifyAntchainBbpMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAntchainBbpMetaEx(request, headers, runtime);
    }

    /**
     * Description: 对企业身份进行认证
     * Summary: 企业四要素认证
     */
    public VerifyAntchainBbpMetaResponse verifyAntchainBbpMetaEx(VerifyAntchainBbpMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.meta.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyAntchainBbpMetaResponse());
    }

    /**
     * Description: 自动化测试创建，用于测试新建&修改功能
     * Summary: 自动化测试创建，用于测试新建&修改功能
     */
    public BindDemoAaaBbbCccResponse bindDemoAaaBbbCcc(BindDemoAaaBbbCccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建，用于测试新建&修改功能
     * Summary: 自动化测试创建，用于测试新建&修改功能
     */
    public BindDemoAaaBbbCccResponse bindDemoAaaBbbCccEx(BindDemoAaaBbbCccRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoAaaBbbCccResponse());
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse checkSaasSecurityInfosecHoloxcontentcheckservice(CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSaasSecurityInfosecHoloxcontentcheckserviceEx(request, headers, runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse checkSaasSecurityInfosecHoloxcontentcheckserviceEx(CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckservice.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse());
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse querySaasSecuritySecuritycoreSecurityuniformservice(QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasSecuritySecuritycoreSecurityuniformserviceEx(request, headers, runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse querySaasSecuritySecuritycoreSecurityuniformserviceEx(QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse());
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public CheckSaasSecurityRdsRdsserviceResponse checkSaasSecurityRdsRdsservice(CheckSaasSecurityRdsRdsserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSaasSecurityRdsRdsserviceEx(request, headers, runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public CheckSaasSecurityRdsRdsserviceResponse checkSaasSecurityRdsRdsserviceEx(CheckSaasSecurityRdsRdsserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSaasSecurityRdsRdsserviceResponse());
    }

    /**
     * Description: 123
     * Summary: 大安全接口
     */
    public QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse querySaasSecurityInfosecHoloxcontentcheckqueryservice(QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasSecurityInfosecHoloxcontentcheckqueryserviceEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 大安全接口
     */
    public QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse querySaasSecurityInfosecHoloxcontentcheckqueryserviceEx(QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckqueryservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse());
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public VerifySaasSecurityRdslibAntcaptchaserviceResponse verifySaasSecurityRdslibAntcaptchaservice(VerifySaasSecurityRdslibAntcaptchaserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifySaasSecurityRdslibAntcaptchaserviceEx(request, headers, runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public VerifySaasSecurityRdslibAntcaptchaserviceResponse verifySaasSecurityRdslibAntcaptchaserviceEx(VerifySaasSecurityRdslibAntcaptchaserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifySaasSecurityRdslibAntcaptchaserviceResponse());
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public QuerySaasSecurityTscenterUmidqueryserviceResponse querySaasSecurityTscenterUmidqueryservice(QuerySaasSecurityTscenterUmidqueryserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasSecurityTscenterUmidqueryserviceEx(request, headers, runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口
     */
    public QuerySaasSecurityTscenterUmidqueryserviceResponse querySaasSecurityTscenterUmidqueryserviceEx(QuerySaasSecurityTscenterUmidqueryserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasSecurityTscenterUmidqueryserviceResponse());
    }

    /**
     * Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口
     */
    public QuerySaasSecurityInfosecOpencheckservicequeryResponse querySaasSecurityInfosecOpencheckservicequery(QuerySaasSecurityInfosecOpencheckservicequeryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasSecurityInfosecOpencheckservicequeryEx(request, headers, runtime);
    }

    /**
     * Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口
     */
    public QuerySaasSecurityInfosecOpencheckservicequeryResponse querySaasSecurityInfosecOpencheckservicequeryEx(QuerySaasSecurityInfosecOpencheckservicequeryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasSecurityInfosecOpencheckservicequeryResponse());
    }
}
