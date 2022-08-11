// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models.*;
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
                    new TeaPair("sdk_version", "1.0.2")
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
     * Description: 通过代理模式为企业创建did
     * Summary: 通过代理模式为企业创建did
     */
    public StartBaasDidCorporateAgentcreateResponse startBaasDidCorporateAgentcreate(StartBaasDidCorporateAgentcreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasDidCorporateAgentcreateEx(request, headers, runtime);
    }

    /**
     * Description: 通过代理模式为企业创建did
     * Summary: 通过代理模式为企业创建did
     */
    public StartBaasDidCorporateAgentcreateResponse startBaasDidCorporateAgentcreateEx(StartBaasDidCorporateAgentcreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.agentcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasDidCorporateAgentcreateResponse());
    }

    /**
     * Description: 通过代理模式为个人创建did
     * Summary: 通过代理模式为个人创建did
     */
    public StartBaasDidPersonAgentcreateResponse startBaasDidPersonAgentcreate(StartBaasDidPersonAgentcreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasDidPersonAgentcreateEx(request, headers, runtime);
    }

    /**
     * Description: 通过代理模式为个人创建did
     * Summary: 通过代理模式为个人创建did
     */
    public StartBaasDidPersonAgentcreateResponse startBaasDidPersonAgentcreateEx(StartBaasDidPersonAgentcreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.agentcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasDidPersonAgentcreateResponse());
    }

    /**
     * Description: 直接创建自己的企业did
     * Summary: 直接创建自己的企业did
     */
    public StartBaasDidCorporateSelfcreateResponse startBaasDidCorporateSelfcreate(StartBaasDidCorporateSelfcreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasDidCorporateSelfcreateEx(request, headers, runtime);
    }

    /**
     * Description: 直接创建自己的企业did
     * Summary: 直接创建自己的企业did
     */
    public StartBaasDidCorporateSelfcreateResponse startBaasDidCorporateSelfcreateEx(StartBaasDidCorporateSelfcreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.corporate.selfcreate.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasDidCorporateSelfcreateResponse());
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书
     */
    public StartBaasDidVerifiableclaimIssureResponse startBaasDidVerifiableclaimIssure(StartBaasDidVerifiableclaimIssureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasDidVerifiableclaimIssureEx(request, headers, runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书
     */
    public StartBaasDidVerifiableclaimIssureResponse startBaasDidVerifiableclaimIssureEx(StartBaasDidVerifiableclaimIssureRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.verifiableclaim.issure.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasDidVerifiableclaimIssureResponse());
    }

    /**
     * Description: 验证可验证声明
     * Summary: 验证可验证声明
     */
    public StartBaasDidVerifiableclaimVerifierResponse startBaasDidVerifiableclaimVerifier(StartBaasDidVerifiableclaimVerifierRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasDidVerifiableclaimVerifierEx(request, headers, runtime);
    }

    /**
     * Description: 验证可验证声明
     * Summary: 验证可验证声明
     */
    public StartBaasDidVerifiableclaimVerifierResponse startBaasDidVerifiableclaimVerifierEx(StartBaasDidVerifiableclaimVerifierRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.verifiableclaim.verifier.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasDidVerifiableclaimVerifierResponse());
    }

    /**
     * Description: 通过vcid查询vc内容
     * Summary: 通过vcid查询vc内容
     */
    public QueryBaasDidVcResponse queryBaasDidVc(QueryBaasDidVcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaasDidVcEx(request, headers, runtime);
    }

    /**
     * Description: 通过vcid查询vc内容
     * Summary: 通过vcid查询vc内容
     */
    public QueryBaasDidVcResponse queryBaasDidVcEx(QueryBaasDidVcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaasDidVcResponse());
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did
     */
    public CreateBaasDidPersonWiththreemetaResponse createBaasDidPersonWiththreemeta(CreateBaasDidPersonWiththreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaasDidPersonWiththreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did
     */
    public CreateBaasDidPersonWiththreemetaResponse createBaasDidPersonWiththreemetaEx(CreateBaasDidPersonWiththreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withthreemeta.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaasDidPersonWiththreemetaResponse());
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
    支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储
     */
    public StartBaasDidVcrepositoryIssueResponse startBaasDidVcrepositoryIssue(StartBaasDidVcrepositoryIssueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startBaasDidVcrepositoryIssueEx(request, headers, runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
    支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储
     */
    public StartBaasDidVcrepositoryIssueResponse startBaasDidVcrepositoryIssueEx(StartBaasDidVcrepositoryIssueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.vcrepository.issue.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartBaasDidVcrepositoryIssueResponse());
    }

    /**
     * Description: 代理模式下更新企业did doc中service中的字段
     * Summary: 代理更新企业did中的services
     */
    public UpdateBaasDidServicesResponse updateBaasDidServices(UpdateBaasDidServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBaasDidServicesEx(request, headers, runtime);
    }

    /**
     * Description: 代理模式下更新企业did doc中service中的字段
     * Summary: 代理更新企业did中的services
     */
    public UpdateBaasDidServicesResponse updateBaasDidServicesEx(UpdateBaasDidServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.services.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBaasDidServicesResponse());
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did
     */
    public CreateBaasDidPersonWithtwometaResponse createBaasDidPersonWithtwometa(CreateBaasDidPersonWithtwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaasDidPersonWithtwometaEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did
     */
    public CreateBaasDidPersonWithtwometaResponse createBaasDidPersonWithtwometaEx(CreateBaasDidPersonWithtwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withtwometa.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaasDidPersonWithtwometaResponse());
    }

    /**
     * Description: 通过个人四要素验证后创建个人did
     * Summary: 通过个人四要素验证后创建个人did
     */
    public CreateBaasDidPersonWithfourmetaResponse createBaasDidPersonWithfourmeta(CreateBaasDidPersonWithfourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaasDidPersonWithfourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 通过个人四要素验证后创建个人did
     * Summary: 通过个人四要素验证后创建个人did
     */
    public CreateBaasDidPersonWithfourmetaResponse createBaasDidPersonWithfourmetaEx(CreateBaasDidPersonWithfourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.did.person.withfourmeta.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaasDidPersonWithfourmetaResponse());
    }
}
