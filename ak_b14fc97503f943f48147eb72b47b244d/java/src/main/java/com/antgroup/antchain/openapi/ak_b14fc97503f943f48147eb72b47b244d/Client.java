// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models.*;
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
                    new TeaPair("sdk_version", "1.0.0"),
                    new TeaPair("_prod_code", "ak_b14fc97503f943f48147eb72b47b244d"),
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
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口
     */
    public AuthAntchainBbpCustomerResponse authAntchainBbpCustomer(AuthAntchainBbpCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authAntchainBbpCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口
     */
    public AuthAntchainBbpCustomerResponse authAntchainBbpCustomerEx(AuthAntchainBbpCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthAntchainBbpCustomerResponse());
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口
     */
    public CreateAntchainBbpCustomerResponse createAntchainBbpCustomer(CreateAntchainBbpCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainBbpCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口
     */
    public CreateAntchainBbpCustomerResponse createAntchainBbpCustomerEx(CreateAntchainBbpCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainBbpCustomerResponse());
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询
     */
    public QueryAntchainBbpCustomerResponse queryAntchainBbpCustomer(QueryAntchainBbpCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainBbpCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询
     */
    public QueryAntchainBbpCustomerResponse queryAntchainBbpCustomerEx(QueryAntchainBbpCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainBbpCustomerResponse());
    }

    /**
     * Description: 身份关联链上账户
     * Summary: 身份关联链上账户
     */
    public MatchAntchainBbpDidAccountResponse matchAntchainBbpDidAccount(MatchAntchainBbpDidAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchAntchainBbpDidAccountEx(request, headers, runtime);
    }

    /**
     * Description: 身份关联链上账户
     * Summary: 身份关联链上账户
     */
    public MatchAntchainBbpDidAccountResponse matchAntchainBbpDidAccountEx(MatchAntchainBbpDidAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.did.account.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchAntchainBbpDidAccountResponse());
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链
     */
    public OperateAntchainBbpInsuranceResponse operateAntchainBbpInsurance(OperateAntchainBbpInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateAntchainBbpInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链
     */
    public OperateAntchainBbpInsuranceResponse operateAntchainBbpInsuranceEx(OperateAntchainBbpInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateAntchainBbpInsuranceResponse());
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链
     */
    public SyncAntchainBbpInsuranceResponse syncAntchainBbpInsurance(SyncAntchainBbpInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainBbpInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链
     */
    public SyncAntchainBbpInsuranceResponse syncAntchainBbpInsuranceEx(SyncAntchainBbpInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainBbpInsuranceResponse());
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件
     */
    public UploadAntchainBbpInsuranceResponse uploadAntchainBbpInsurance(UploadAntchainBbpInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntchainBbpInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件
     */
    public UploadAntchainBbpInsuranceResponse uploadAntchainBbpInsuranceEx(UploadAntchainBbpInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntchainBbpInsuranceResponse());
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点
     */
    public InitAntchainBbpInsuranceUserResponse initAntchainBbpInsuranceUser(InitAntchainBbpInsuranceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initAntchainBbpInsuranceUserEx(request, headers, runtime);
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点
     */
    public InitAntchainBbpInsuranceUserResponse initAntchainBbpInsuranceUserEx(InitAntchainBbpInsuranceUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitAntchainBbpInsuranceUserResponse());
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
}
