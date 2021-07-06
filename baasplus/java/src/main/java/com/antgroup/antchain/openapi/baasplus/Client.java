// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.baasplus.models.*;
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
                    new TeaPair("sdk_version", "1.1.2")
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
     * Description: 链上交易移动端权限修改
     * Summary: 链上交易移动端权限修改
     */
    public UpdateBmpbrowserPrivilegeResponse updateBmpbrowserPrivilege(UpdateBmpbrowserPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBmpbrowserPrivilegeEx(request, headers, runtime);
    }

    /**
     * Description: 链上交易移动端权限修改
     * Summary: 链上交易移动端权限修改
     */
    public UpdateBmpbrowserPrivilegeResponse updateBmpbrowserPrivilegeEx(UpdateBmpbrowserPrivilegeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBmpbrowserPrivilegeResponse());
    }

    /**
     * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
     * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
     */
    public QueryIndividualidInternalmaskResponse queryIndividualidInternalmask(QueryIndividualidInternalmaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndividualidInternalmaskEx(request, headers, runtime);
    }

    /**
     * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
     * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
     */
    public QueryIndividualidInternalmaskResponse queryIndividualidInternalmaskEx(QueryIndividualidInternalmaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.internalmask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndividualidInternalmaskResponse());
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素（数据来自数据枢纽）
     */
    public QueryEnterpriseidInternalfourmetaResponse queryEnterpriseidInternalfourmeta(QueryEnterpriseidInternalfourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseidInternalfourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素（数据来自数据枢纽）
     */
    public QueryEnterpriseidInternalfourmetaResponse queryEnterpriseidInternalfourmetaEx(QueryEnterpriseidInternalfourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseidInternalfourmetaResponse());
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素（数据来自数据枢纽）
     */
    public QueryEnterpriseidInternalthreemetaResponse queryEnterpriseidInternalthreemeta(QueryEnterpriseidInternalthreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseidInternalthreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素（数据来自数据枢纽）
     */
    public QueryEnterpriseidInternalthreemetaResponse queryEnterpriseidInternalthreemetaEx(QueryEnterpriseidInternalthreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseidInternalthreemetaResponse());
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素（数据来自数据枢纽）
     */
    public QueryEnterpriseidInternaltwometaResponse queryEnterpriseidInternaltwometa(QueryEnterpriseidInternaltwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseidInternaltwometaEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素（数据来自数据枢纽）
     */
    public QueryEnterpriseidInternaltwometaResponse queryEnterpriseidInternaltwometaEx(QueryEnterpriseidInternaltwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseidInternaltwometaResponse());
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     */
    public InitEnterpriseidFaceauthResponse initEnterpriseidFaceauth(InitEnterpriseidFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEnterpriseidFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     */
    public InitEnterpriseidFaceauthResponse initEnterpriseidFaceauthEx(InitEnterpriseidFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEnterpriseidFaceauthResponse());
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     */
    public QueryEnterpriseidFaceauthResponse queryEnterpriseidFaceauth(QueryEnterpriseidFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseidFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     */
    public QueryEnterpriseidFaceauthResponse queryEnterpriseidFaceauthEx(QueryEnterpriseidFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseidFaceauthResponse());
    }

    /**
     * Description: 个人实名认证四要素
     * Summary: 个人实名认证四要素（数据来自蚁盾）
     */
    public QueryIndividualidInternalfourmetaResponse queryIndividualidInternalfourmeta(QueryIndividualidInternalfourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndividualidInternalfourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 个人实名认证四要素
     * Summary: 个人实名认证四要素（数据来自蚁盾）
     */
    public QueryIndividualidInternalfourmetaResponse queryIndividualidInternalfourmetaEx(QueryIndividualidInternalfourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndividualidInternalfourmetaResponse());
    }

    /**
     * Description: 个人实名认证三要素
     * Summary: 个人实名认证三要素（数据来自蚁盾）
     */
    public QueryIndividualidInternalthreemetaResponse queryIndividualidInternalthreemeta(QueryIndividualidInternalthreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndividualidInternalthreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 个人实名认证三要素
     * Summary: 个人实名认证三要素（数据来自蚁盾）
     */
    public QueryIndividualidInternalthreemetaResponse queryIndividualidInternalthreemetaEx(QueryIndividualidInternalthreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndividualidInternalthreemetaResponse());
    }

    /**
     * Description: 个人实名认证二要素
     * Summary: 个人实名认证二要素
     */
    public QueryIndividualidInternaltwometaResponse queryIndividualidInternaltwometa(QueryIndividualidInternaltwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndividualidInternaltwometaEx(request, headers, runtime);
    }

    /**
     * Description: 个人实名认证二要素
     * Summary: 个人实名认证二要素
     */
    public QueryIndividualidInternaltwometaResponse queryIndividualidInternaltwometaEx(QueryIndividualidInternaltwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndividualidInternaltwometaResponse());
    }

    /**
     * Description: 发起内容评估（BAI），仅内部调用
     * Summary: 发起内容评估
     */
    public CreateBaicorpInternalevaluationasyncResponse createBaicorpInternalevaluationasync(CreateBaicorpInternalevaluationasyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaicorpInternalevaluationasyncEx(request, headers, runtime);
    }

    /**
     * Description: 发起内容评估（BAI），仅内部调用
     * Summary: 发起内容评估
     */
    public CreateBaicorpInternalevaluationasyncResponse createBaicorpInternalevaluationasyncEx(CreateBaicorpInternalevaluationasyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.baicorp.internalevaluationasync.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaicorpInternalevaluationasyncResponse());
    }

    /**
     * Description: 提交内容监测任务
     * Summary: 提交内容监测任务接口
     */
    public CreateBaicorpInternalmonitorasyncResponse createBaicorpInternalmonitorasync(CreateBaicorpInternalmonitorasyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBaicorpInternalmonitorasyncEx(request, headers, runtime);
    }

    /**
     * Description: 提交内容监测任务
     * Summary: 提交内容监测任务接口
     */
    public CreateBaicorpInternalmonitorasyncResponse createBaicorpInternalmonitorasyncEx(CreateBaicorpInternalmonitorasyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.baicorp.internalmonitorasync.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBaicorpInternalmonitorasyncResponse());
    }

    /**
     * Description: 查询内容评估结果
     * Summary: 查询内容评估结果
     */
    public QueryBaicorpInternalevaluationasyncResponse queryBaicorpInternalevaluationasync(QueryBaicorpInternalevaluationasyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaicorpInternalevaluationasyncEx(request, headers, runtime);
    }

    /**
     * Description: 查询内容评估结果
     * Summary: 查询内容评估结果
     */
    public QueryBaicorpInternalevaluationasyncResponse queryBaicorpInternalevaluationasyncEx(QueryBaicorpInternalevaluationasyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.baicorp.internalevaluationasync.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaicorpInternalevaluationasyncResponse());
    }

    /**
     * Description: 查询内容监测任务结果
     * Summary: 查询内容监测任务结果
     */
    public QueryBaicorpInternalmonitorasyncResponse queryBaicorpInternalmonitorasync(QueryBaicorpInternalmonitorasyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaicorpInternalmonitorasyncEx(request, headers, runtime);
    }

    /**
     * Description: 查询内容监测任务结果
     * Summary: 查询内容监测任务结果
     */
    public QueryBaicorpInternalmonitorasyncResponse queryBaicorpInternalmonitorasyncEx(QueryBaicorpInternalmonitorasyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.baicorp.internalmonitorasync.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaicorpInternalmonitorasyncResponse());
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     */
    public CertifyEnterpriseidFaceauthResponse certifyEnterpriseidFaceauth(CertifyEnterpriseidFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyEnterpriseidFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     */
    public CertifyEnterpriseidFaceauthResponse certifyEnterpriseidFaceauthEx(CertifyEnterpriseidFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.faceauth.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyEnterpriseidFaceauthResponse());
    }

    /**
     * Description: 个人实人刷脸认证——认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     */
    public InitIndividualidFaceauthResponse initIndividualidFaceauth(InitIndividualidFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIndividualidFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 个人实人刷脸认证——认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     */
    public InitIndividualidFaceauthResponse initIndividualidFaceauthEx(InitIndividualidFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIndividualidFaceauthResponse());
    }

    /**
     * Description: 个人实人刷脸认证——认证开始
     * Summary: 个人实人刷脸认证-认证开始
     */
    public CertifyIndividualidFaceauthResponse certifyIndividualidFaceauth(CertifyIndividualidFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyIndividualidFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 个人实人刷脸认证——认证开始
     * Summary: 个人实人刷脸认证-认证开始
     */
    public CertifyIndividualidFaceauthResponse certifyIndividualidFaceauthEx(CertifyIndividualidFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.faceauth.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyIndividualidFaceauthResponse());
    }

    /**
     * Description: 个人实人刷脸认证——查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     */
    public QueryIndividualidFaceauthResponse queryIndividualidFaceauth(QueryIndividualidFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndividualidFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 个人实人刷脸认证——查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     */
    public QueryIndividualidFaceauthResponse queryIndividualidFaceauthEx(QueryIndividualidFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndividualidFaceauthResponse());
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高
     */
    public GetDataserviceBlockchainheightResponse getDataserviceBlockchainheight(GetDataserviceBlockchainheightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataserviceBlockchainheightEx(request, headers, runtime);
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高
     */
    public GetDataserviceBlockchainheightResponse getDataserviceBlockchainheightEx(GetDataserviceBlockchainheightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDataserviceBlockchainheightResponse());
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数
     */
    public GetDataserviceTransactioncountResponse getDataserviceTransactioncount(GetDataserviceTransactioncountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataserviceTransactioncountEx(request, headers, runtime);
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数
     */
    public GetDataserviceTransactioncountResponse getDataserviceTransactioncountEx(GetDataserviceTransactioncountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDataserviceTransactioncountResponse());
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情
     */
    public GetDataserviceTransactioninfoResponse getDataserviceTransactioninfo(GetDataserviceTransactioninfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataserviceTransactioninfoEx(request, headers, runtime);
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情
     */
    public GetDataserviceTransactioninfoResponse getDataserviceTransactioninfoEx(GetDataserviceTransactioninfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDataserviceTransactioninfoResponse());
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息
     */
    public ListDataserviceLastblocksResponse listDataserviceLastblocks(ListDataserviceLastblocksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataserviceLastblocksEx(request, headers, runtime);
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息
     */
    public ListDataserviceLastblocksResponse listDataserviceLastblocksEx(ListDataserviceLastblocksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDataserviceLastblocksResponse());
    }

    /**
     * Description: 可信时间服务——获取时间凭证
     * Summary: 可信时间凭证服务-获取时间凭证
     */
    public GetTasAttestationResponse getTasAttestation(GetTasAttestationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTasAttestationEx(request, headers, runtime);
    }

    /**
     * Description: 可信时间服务——获取时间凭证
     * Summary: 可信时间凭证服务-获取时间凭证
     */
    public GetTasAttestationResponse getTasAttestationEx(GetTasAttestationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.tas.attestation.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTasAttestationResponse());
    }

    /**
     * Description: 可信时间 ——校验时间凭证接口
     * Summary: 可信时间凭证服务-校验时间凭证接口
     */
    public VerifyTasCtsrResponse verifyTasCtsr(VerifyTasCtsrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyTasCtsrEx(request, headers, runtime);
    }

    /**
     * Description: 可信时间 ——校验时间凭证接口
     * Summary: 可信时间凭证服务-校验时间凭证接口
     */
    public VerifyTasCtsrResponse verifyTasCtsrEx(VerifyTasCtsrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.tas.ctsr.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyTasCtsrResponse());
    }

    /**
     * Description: 通过sn下载时间凭证证书（pdf格式）
     * Summary: 可信时间凭证服务-下载时间凭证证书
     */
    public GetTasCertificateResponse getTasCertificate(GetTasCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTasCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 通过sn下载时间凭证证书（pdf格式）
     * Summary: 可信时间凭证服务-下载时间凭证证书
     */
    public GetTasCertificateResponse getTasCertificateEx(GetTasCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.tas.certificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTasCertificateResponse());
    }

    /**
     * Description: 可信时间——获取带事务的时间凭证
     * Summary: 可信时间——获取带事务的时间凭证
     */
    public GetTasTransactionattestationResponse getTasTransactionattestation(GetTasTransactionattestationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTasTransactionattestationEx(request, headers, runtime);
    }

    /**
     * Description: 可信时间——获取带事务的时间凭证
     * Summary: 可信时间——获取带事务的时间凭证
     */
    public GetTasTransactionattestationResponse getTasTransactionattestationEx(GetTasTransactionattestationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.tas.transactionattestation.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTasTransactionattestationResponse());
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     */
    public QueryEverifyFourmetaResponse queryEverifyFourmeta(QueryEverifyFourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEverifyFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     */
    public QueryEverifyFourmetaResponse queryEverifyFourmetaEx(QueryEverifyFourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.everify.fourmeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEverifyFourmetaResponse());
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     */
    public QueryEverifyThreemetaResponse queryEverifyThreemeta(QueryEverifyThreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEverifyThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     */
    public QueryEverifyThreemetaResponse queryEverifyThreemetaEx(QueryEverifyThreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.everify.threemeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEverifyThreemetaResponse());
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     */
    public QueryEverifyTwometaResponse queryEverifyTwometa(QueryEverifyTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEverifyTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     */
    public QueryEverifyTwometaResponse queryEverifyTwometaEx(QueryEverifyTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.everify.twometa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEverifyTwometaResponse());
    }

    /**
     * Description: 内容搜索查询接口
     * Summary: 内容搜索查询接口
     */
    public QueryBaicorpInternalsearchlibraryResponse queryBaicorpInternalsearchlibrary(QueryBaicorpInternalsearchlibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaicorpInternalsearchlibraryEx(request, headers, runtime);
    }

    /**
     * Description: 内容搜索查询接口
     * Summary: 内容搜索查询接口
     */
    public QueryBaicorpInternalsearchlibraryResponse queryBaicorpInternalsearchlibraryEx(QueryBaicorpInternalsearchlibraryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaicorpInternalsearchlibraryResponse());
    }

    /**
     * Description: 更新检索
     * Summary: 更新检索
     */
    public UpdateBaicorpInternalsearchlibraryResponse updateBaicorpInternalsearchlibrary(UpdateBaicorpInternalsearchlibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBaicorpInternalsearchlibraryEx(request, headers, runtime);
    }

    /**
     * Description: 更新检索
     * Summary: 更新检索
     */
    public UpdateBaicorpInternalsearchlibraryResponse updateBaicorpInternalsearchlibraryEx(UpdateBaicorpInternalsearchlibraryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBaicorpInternalsearchlibraryResponse());
    }

    /**
     * Description: 对公打款-总行查询
     * Summary: 对公打款-总行查询
     */
    public QueryEpayauthRootbankResponse queryEpayauthRootbank(QueryEpayauthRootbankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEpayauthRootbankEx(request, headers, runtime);
    }

    /**
     * Description: 对公打款-总行查询
     * Summary: 对公打款-总行查询
     */
    public QueryEpayauthRootbankResponse queryEpayauthRootbankEx(QueryEpayauthRootbankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.epayauth.rootbank.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEpayauthRootbankResponse());
    }

    /**
     * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
     * Summary: 业务申请保护
     */
    public QueryYdapplyprotEcapplyResponse queryYdapplyprotEcapply(QueryYdapplyprotEcapplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYdapplyprotEcapplyEx(request, headers, runtime);
    }

    /**
     * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
     * Summary: 业务申请保护
     */
    public QueryYdapplyprotEcapplyResponse queryYdapplyprotEcapplyEx(QueryYdapplyprotEcapplyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ydapplyprot.ecapply.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYdapplyprotEcapplyResponse());
    }

    /**
     * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
     * Summary: 先享后付保护
     */
    public QueryYdpacprotEcpacResponse queryYdpacprotEcpac(QueryYdpacprotEcpacRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYdpacprotEcpacEx(request, headers, runtime);
    }

    /**
     * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
     * Summary: 先享后付保护
     */
    public QueryYdpacprotEcpacResponse queryYdpacprotEcpacEx(QueryYdpacprotEcpacRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ydpacprot.ecpac.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYdpacprotEcpacResponse());
    }

    /**
     * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     */
    public QueryYdauthprotTwometaResponse queryYdauthprotTwometa(QueryYdauthprotTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYdauthprotTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     */
    public QueryYdauthprotTwometaResponse queryYdauthprotTwometaEx(QueryYdauthprotTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ydauthprot.twometa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYdauthprotTwometaResponse());
    }

    /**
     * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     */
    public QueryYdauthprotThreemetaResponse queryYdauthprotThreemeta(QueryYdauthprotThreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYdauthprotThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     */
    public QueryYdauthprotThreemetaResponse queryYdauthprotThreemetaEx(QueryYdauthprotThreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ydauthprot.threemeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYdauthprotThreemetaResponse());
    }

    /**
     * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     */
    public QueryYdauthprotFourmetaResponse queryYdauthprotFourmeta(QueryYdauthprotFourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYdauthprotFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     */
    public QueryYdauthprotFourmetaResponse queryYdauthprotFourmetaEx(QueryYdauthprotFourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ydauthprot.fourmeta.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYdauthprotFourmetaResponse());
    }

    /**
     * Description: 营销保护
     * Summary: 营销保护
     */
    public QueryYdmktprotEcmarketcampaignResponse queryYdmktprotEcmarketcampaign(QueryYdmktprotEcmarketcampaignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYdmktprotEcmarketcampaignEx(request, headers, runtime);
    }

    /**
     * Description: 营销保护
     * Summary: 营销保护
     */
    public QueryYdmktprotEcmarketcampaignResponse queryYdmktprotEcmarketcampaignEx(QueryYdmktprotEcmarketcampaignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ydmktprot.ecmarketcampaign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYdmktprotEcmarketcampaignResponse());
    }

    /**
     * Description: 注册保护
     * Summary: 注册保护
     */
    public QueryYdregprotEcregisterResponse queryYdregprotEcregister(QueryYdregprotEcregisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYdregprotEcregisterEx(request, headers, runtime);
    }

    /**
     * Description: 注册保护
     * Summary: 注册保护
     */
    public QueryYdregprotEcregisterResponse queryYdregprotEcregisterEx(QueryYdregprotEcregisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ydregprot.ecregister.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYdregprotEcregisterResponse());
    }

    /**
     * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 支行查询
     */
    public QueryEpayauthBranchbankResponse queryEpayauthBranchbank(QueryEpayauthBranchbankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEpayauthBranchbankEx(request, headers, runtime);
    }

    /**
     * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 支行查询
     */
    public QueryEpayauthBranchbankResponse queryEpayauthBranchbankEx(QueryEpayauthBranchbankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.epayauth.branchbank.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEpayauthBranchbankResponse());
    }

    /**
     * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 行政地区编码查询
     */
    public QueryEpayauthDistrictResponse queryEpayauthDistrict(QueryEpayauthDistrictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEpayauthDistrictEx(request, headers, runtime);
    }

    /**
     * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 行政地区编码查询
     */
    public QueryEpayauthDistrictResponse queryEpayauthDistrictEx(QueryEpayauthDistrictRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.epayauth.district.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEpayauthDistrictResponse());
    }

    /**
     * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
     * Summary: 发起打款验证申请
     */
    public InitEpayauthVerifyResponse initEpayauthVerify(InitEpayauthVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEpayauthVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
     * Summary: 发起打款验证申请
     */
    public InitEpayauthVerifyResponse initEpayauthVerifyEx(InitEpayauthVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.epayauth.verify.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEpayauthVerifyResponse());
    }

    /**
     * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
     * Summary: 打款验证金额校验
     */
    public QueryEpayauthVerifyResponse queryEpayauthVerify(QueryEpayauthVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEpayauthVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
     * Summary: 打款验证金额校验
     */
    public QueryEpayauthVerifyResponse queryEpayauthVerifyEx(QueryEpayauthVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.epayauth.verify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEpayauthVerifyResponse());
    }

    /**
     * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
     * Summary: 链上交易二维码生成
     */
    public QueryBmpbrowserTransactionqrcodeResponse queryBmpbrowserTransactionqrcode(QueryBmpbrowserTransactionqrcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBmpbrowserTransactionqrcodeEx(request, headers, runtime);
    }

    /**
     * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
     * Summary: 链上交易二维码生成
     */
    public QueryBmpbrowserTransactionqrcodeResponse queryBmpbrowserTransactionqrcodeEx(QueryBmpbrowserTransactionqrcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.bmpbrowser.transactionqrcode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBmpbrowserTransactionqrcodeResponse());
    }

    /**
     * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
     * Summary: 批量开通 链上交易移动端查看权限
     */
    public AddBmpbrowserPrivilegeResponse addBmpbrowserPrivilege(AddBmpbrowserPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBmpbrowserPrivilegeEx(request, headers, runtime);
    }

    /**
     * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
     * Summary: 批量开通 链上交易移动端查看权限
     */
    public AddBmpbrowserPrivilegeResponse addBmpbrowserPrivilegeEx(AddBmpbrowserPrivilegeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBmpbrowserPrivilegeResponse());
    }

    /**
     * Description: 身份证信息识别
     * Summary: 身份证信息识别
     */
    public QueryIdcocrIdcardResponse queryIdcocrIdcard(QueryIdcocrIdcardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdcocrIdcardEx(request, headers, runtime);
    }

    /**
     * Description: 身份证信息识别
     * Summary: 身份证信息识别
     */
    public QueryIdcocrIdcardResponse queryIdcocrIdcardEx(QueryIdcocrIdcardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.idcocr.idcard.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdcocrIdcardResponse());
    }

    /**
     * Description: 申请证书
     * Summary: 申请证书
     */
    public InitCaCertificateResponse initCaCertificate(InitCaCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCaCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 申请证书
     * Summary: 申请证书
     */
    public InitCaCertificateResponse initCaCertificateEx(InitCaCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.ca.certificate.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCaCertificateResponse());
    }

    /**
     * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
     * Summary: 内容风险识别接口服务
     */
    public InitContentriskInternalResponse initContentriskInternal(InitContentriskInternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initContentriskInternalEx(request, headers, runtime);
    }

    /**
     * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
     * Summary: 内容风险识别接口服务
     */
    public InitContentriskInternalResponse initContentriskInternalEx(InitContentriskInternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.contentrisk.internal.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitContentriskInternalResponse());
    }

    /**
     * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
     * Summary: 内容风险识别结果查询接口服务
     */
    public QueryContentriskInternalResponse queryContentriskInternal(QueryContentriskInternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContentriskInternalEx(request, headers, runtime);
    }

    /**
     * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
     * Summary: 内容风险识别结果查询接口服务
     */
    public QueryContentriskInternalResponse queryContentriskInternalEx(QueryContentriskInternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.contentrisk.internal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContentriskInternalResponse());
    }

    /**
     * Description: 个人实人认证服务端比对-认证开始
     * Summary: 个人实人认证服务端比对-认证开始
     */
    public InitIndividualidImageauthResponse initIndividualidImageauth(InitIndividualidImageauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIndividualidImageauthEx(request, headers, runtime);
    }

    /**
     * Description: 个人实人认证服务端比对-认证开始
     * Summary: 个人实人认证服务端比对-认证开始
     */
    public InitIndividualidImageauthResponse initIndividualidImageauthEx(InitIndividualidImageauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.imageauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIndividualidImageauthResponse());
    }

    /**
     * Description: 访问账户生成
     * Summary: 访问账户生成
     */
    public AddIotcseAccountResponse addIotcseAccount(AddIotcseAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addIotcseAccountEx(request, headers, runtime);
    }

    /**
     * Description: 访问账户生成
     * Summary: 访问账户生成
     */
    public AddIotcseAccountResponse addIotcseAccountEx(AddIotcseAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.account.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddIotcseAccountResponse());
    }

    /**
     * Description: 存证上链
     * Summary: 存证上链
     */
    public SaveIotcseEvidenceResponse saveIotcseEvidence(SaveIotcseEvidenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveIotcseEvidenceEx(request, headers, runtime);
    }

    /**
     * Description: 存证上链
     * Summary: 存证上链
     */
    public SaveIotcseEvidenceResponse saveIotcseEvidenceEx(SaveIotcseEvidenceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.evidence.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveIotcseEvidenceResponse());
    }

    /**
     * Description: 存证上链查询
     * Summary: 存证上链查询
     */
    public QueryIotcseEvidenceResponse queryIotcseEvidence(QueryIotcseEvidenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseEvidenceEx(request, headers, runtime);
    }

    /**
     * Description: 存证上链查询
     * Summary: 存证上链查询
     */
    public QueryIotcseEvidenceResponse queryIotcseEvidenceEx(QueryIotcseEvidenceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.evidence.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseEvidenceResponse());
    }

    /**
     * Description: 代理创建企业did
     * Summary: 代理创建企业did
     */
    public CreateDidCorporatedidagentResponse createDidCorporatedidagent(CreateDidCorporatedidagentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidCorporatedidagentEx(request, headers, runtime);
    }

    /**
     * Description: 代理创建企业did
     * Summary: 代理创建企业did
     */
    public CreateDidCorporatedidagentResponse createDidCorporatedidagentEx(CreateDidCorporatedidagentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.did.corporatedidagent.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidCorporatedidagentResponse());
    }

    /**
     * Description: 个人实人刷脸认证-认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     */
    public InitIndividualidFaceauthinternalResponse initIndividualidFaceauthinternal(InitIndividualidFaceauthinternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIndividualidFaceauthinternalEx(request, headers, runtime);
    }

    /**
     * Description: 个人实人刷脸认证-认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     */
    public InitIndividualidFaceauthinternalResponse initIndividualidFaceauthinternalEx(InitIndividualidFaceauthinternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIndividualidFaceauthinternalResponse());
    }

    /**
     * Description: 个人实人刷脸认证-认证开始
     * Summary: 个人实人刷脸认证-认证开始
     */
    public CertifyIndividualidFaceauthinternalResponse certifyIndividualidFaceauthinternal(CertifyIndividualidFaceauthinternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyIndividualidFaceauthinternalEx(request, headers, runtime);
    }

    /**
     * Description: 个人实人刷脸认证-认证开始
     * Summary: 个人实人刷脸认证-认证开始
     */
    public CertifyIndividualidFaceauthinternalResponse certifyIndividualidFaceauthinternalEx(CertifyIndividualidFaceauthinternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyIndividualidFaceauthinternalResponse());
    }

    /**
     * Description: 个人实人刷脸认证-查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     */
    public QueryIndividualidFaceauthinternalResponse queryIndividualidFaceauthinternal(QueryIndividualidFaceauthinternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndividualidFaceauthinternalEx(request, headers, runtime);
    }

    /**
     * Description: 个人实人刷脸认证-查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     */
    public QueryIndividualidFaceauthinternalResponse queryIndividualidFaceauthinternalEx(QueryIndividualidFaceauthinternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.individualid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndividualidFaceauthinternalResponse());
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     */
    public InitEnterpriseidFaceauthinternalResponse initEnterpriseidFaceauthinternal(InitEnterpriseidFaceauthinternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEnterpriseidFaceauthinternalEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     */
    public InitEnterpriseidFaceauthinternalResponse initEnterpriseidFaceauthinternalEx(InitEnterpriseidFaceauthinternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEnterpriseidFaceauthinternalResponse());
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     */
    public CertifyEnterpriseidFaceauthinternalResponse certifyEnterpriseidFaceauthinternal(CertifyEnterpriseidFaceauthinternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyEnterpriseidFaceauthinternalEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     */
    public CertifyEnterpriseidFaceauthinternalResponse certifyEnterpriseidFaceauthinternalEx(CertifyEnterpriseidFaceauthinternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyEnterpriseidFaceauthinternalResponse());
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     */
    public QueryEverifyTwometainternalResponse queryEverifyTwometainternal(QueryEverifyTwometainternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEverifyTwometainternalEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     */
    public QueryEverifyTwometainternalResponse queryEverifyTwometainternalEx(QueryEverifyTwometainternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.everify.twometainternal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEverifyTwometainternalResponse());
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     */
    public QueryEverifyThreemetainternalResponse queryEverifyThreemetainternal(QueryEverifyThreemetainternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEverifyThreemetainternalEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     */
    public QueryEverifyThreemetainternalResponse queryEverifyThreemetainternalEx(QueryEverifyThreemetainternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.everify.threemetainternal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEverifyThreemetainternalResponse());
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     */
    public QueryEverifyFourmetainternalResponse queryEverifyFourmetainternal(QueryEverifyFourmetainternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEverifyFourmetainternalEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     */
    public QueryEverifyFourmetainternalResponse queryEverifyFourmetainternalEx(QueryEverifyFourmetainternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.everify.fourmetainternal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEverifyFourmetainternalResponse());
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     */
    public QueryEnterpriseidFaceauthinternalResponse queryEnterpriseidFaceauthinternal(QueryEnterpriseidFaceauthinternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseidFaceauthinternalEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     */
    public QueryEnterpriseidFaceauthinternalResponse queryEnterpriseidFaceauthinternalEx(QueryEnterpriseidFaceauthinternalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseidFaceauthinternalResponse());
    }

    /**
     * Description: 物联网区块链身份注册
     * Summary: 物联网区块链身份注册
     */
    public AddIotcseThingsdidResponse addIotcseThingsdid(AddIotcseThingsdidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addIotcseThingsdidEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份注册
     * Summary: 物联网区块链身份注册
     */
    public AddIotcseThingsdidResponse addIotcseThingsdidEx(AddIotcseThingsdidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.thingsdid.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddIotcseThingsdidResponse());
    }

    /**
     * Description: 物联网区块链身份更新
     * Summary: 物联网区块链身份更新
     */
    public UpdateIotcseThingsdidResponse updateIotcseThingsdid(UpdateIotcseThingsdidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIotcseThingsdidEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份更新
     * Summary: 物联网区块链身份更新
     */
    public UpdateIotcseThingsdidResponse updateIotcseThingsdidEx(UpdateIotcseThingsdidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.thingsdid.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIotcseThingsdidResponse());
    }

    /**
     * Description: 物联网区块链身份查询
     * Summary: 物联网区块链身份查询
     */
    public QueryIotcseThingsdidResponse queryIotcseThingsdid(QueryIotcseThingsdidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseThingsdidEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份查询
     * Summary: 物联网区块链身份查询
     */
    public QueryIotcseThingsdidResponse queryIotcseThingsdidEx(QueryIotcseThingsdidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.thingsdid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseThingsdidResponse());
    }

    /**
     * Description: 异步轮询请求
    智能合约执行完后异步轮询
     * Summary: 异步轮询请求
     */
    public QueryIotcseAsyncprocessResponse queryIotcseAsyncprocess(QueryIotcseAsyncprocessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseAsyncprocessEx(request, headers, runtime);
    }

    /**
     * Description: 异步轮询请求
    智能合约执行完后异步轮询
     * Summary: 异步轮询请求
     */
    public QueryIotcseAsyncprocessResponse queryIotcseAsyncprocessEx(QueryIotcseAsyncprocessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.asyncprocess.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseAsyncprocessResponse());
    }

    /**
     * Description: 物联网区块链身份分组
     * Summary: 物联网区块链身份分组
     */
    public ExecIotcseGroupResponse execIotcseGroup(ExecIotcseGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execIotcseGroupEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份分组
     * Summary: 物联网区块链身份分组
     */
    public ExecIotcseGroupResponse execIotcseGroupEx(ExecIotcseGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.group.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecIotcseGroupResponse());
    }

    /**
     * Description: 物联网区块链分组设备查询
     * Summary: 物联网区块链分组设备查询
     */
    public QueryIotcseGroupdeviceResponse queryIotcseGroupdevice(QueryIotcseGroupdeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseGroupdeviceEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链分组设备查询
     * Summary: 物联网区块链分组设备查询
     */
    public QueryIotcseGroupdeviceResponse queryIotcseGroupdeviceEx(QueryIotcseGroupdeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.groupdevice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseGroupdeviceResponse());
    }

    /**
     * Description: 物联网区块链身份设备分组查询
     * Summary: 物联网区块链身份设备分组查询
     */
    public QueryIotcseDevicegroupResponse queryIotcseDevicegroup(QueryIotcseDevicegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseDevicegroupEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份设备分组查询
     * Summary: 物联网区块链身份设备分组查询
     */
    public QueryIotcseDevicegroupResponse queryIotcseDevicegroupEx(QueryIotcseDevicegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.devicegroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseDevicegroupResponse());
    }

    /**
     * Description: 物联网区块链身份租户设备查询
     * Summary: 物联网区块链身份租户设备查询
     */
    public QueryIotcseTenantdeviceResponse queryIotcseTenantdevice(QueryIotcseTenantdeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseTenantdeviceEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份租户设备查询
     * Summary: 物联网区块链身份租户设备查询
     */
    public QueryIotcseTenantdeviceResponse queryIotcseTenantdeviceEx(QueryIotcseTenantdeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.tenantdevice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseTenantdeviceResponse());
    }

    /**
     * Description: 物联网区块链身份设备状态更新
     * Summary: 物联网区块链身份设备状态更新
     */
    public UpdateIotcseDevicestatusResponse updateIotcseDevicestatus(UpdateIotcseDevicestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIotcseDevicestatusEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份设备状态更新
     * Summary: 物联网区块链身份设备状态更新
     */
    public UpdateIotcseDevicestatusResponse updateIotcseDevicestatusEx(UpdateIotcseDevicestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.devicestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIotcseDevicestatusResponse());
    }

    /**
     * Description: 物联网区块链身份设备物模型查询
     * Summary: 物联网区块链身份设备物模型查询
     */
    public QueryIotcseDevicemodelResponse queryIotcseDevicemodel(QueryIotcseDevicemodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseDevicemodelEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份设备物模型查询
     * Summary: 物联网区块链身份设备物模型查询
     */
    public QueryIotcseDevicemodelResponse queryIotcseDevicemodelEx(QueryIotcseDevicemodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.devicemodel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseDevicemodelResponse());
    }

    /**
     * Description: 物联网区块链身份设备空间关联
     * Summary: 物联网区块链身份设备空间关联
     */
    public UpdateIotcseDevicespaceResponse updateIotcseDevicespace(UpdateIotcseDevicespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIotcseDevicespaceEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份设备空间关联
     * Summary: 物联网区块链身份设备空间关联
     */
    public UpdateIotcseDevicespaceResponse updateIotcseDevicespaceEx(UpdateIotcseDevicespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.devicespace.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIotcseDevicespaceResponse());
    }

    /**
     * Description: 物联网区块链身份批量存证数据读取
     * Summary: 物联网区块链身份批量存证数据读取
     */
    public QueryIotcseEvidencebatchResponse queryIotcseEvidencebatch(QueryIotcseEvidencebatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotcseEvidencebatchEx(request, headers, runtime);
    }

    /**
     * Description: 物联网区块链身份批量存证数据读取
     * Summary: 物联网区块链身份批量存证数据读取
     */
    public QueryIotcseEvidencebatchResponse queryIotcseEvidencebatchEx(QueryIotcseEvidencebatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.iotcse.evidencebatch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotcseEvidencebatchResponse());
    }

    /**
     * Description: AI认知服务营业执照ocr服务
     * Summary: AI认知服务营业执照ocr服务
     */
    public QueryBlocrBusinesslicenseResponse queryBlocrBusinesslicense(QueryBlocrBusinesslicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlocrBusinesslicenseEx(request, headers, runtime);
    }

    /**
     * Description: AI认知服务营业执照ocr服务
     * Summary: AI认知服务营业执照ocr服务
     */
    public QueryBlocrBusinesslicenseResponse queryBlocrBusinesslicenseEx(QueryBlocrBusinesslicenseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.blocr.businesslicense.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlocrBusinesslicenseResponse());
    }

    /**
     * Description: AI认知服务增值税发票ocr识别
     * Summary: AI认知服务增值税发票ocr识别
     */
    public QueryInvoicesocrVatinvoiceResponse queryInvoicesocrVatinvoice(QueryInvoicesocrVatinvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInvoicesocrVatinvoiceEx(request, headers, runtime);
    }

    /**
     * Description: AI认知服务增值税发票ocr识别
     * Summary: AI认知服务增值税发票ocr识别
     */
    public QueryInvoicesocrVatinvoiceResponse queryInvoicesocrVatinvoiceEx(QueryInvoicesocrVatinvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.invoicesocr.vatinvoice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInvoicesocrVatinvoiceResponse());
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限
     */
    public QueryBmpbrowserPrivilegeResponse queryBmpbrowserPrivilege(QueryBmpbrowserPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBmpbrowserPrivilegeEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限
     */
    public QueryBmpbrowserPrivilegeResponse queryBmpbrowserPrivilegeEx(QueryBmpbrowserPrivilegeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBmpbrowserPrivilegeResponse());
    }

    /**
     * Description: 批量取消 链上交易移动端查看权限
     * Summary: 批量取消 链上交易移动端查看权限
     */
    public CancelBmpbrowserPrivilegeResponse cancelBmpbrowserPrivilege(CancelBmpbrowserPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBmpbrowserPrivilegeEx(request, headers, runtime);
    }

    /**
     * Description: 批量取消 链上交易移动端查看权限
     * Summary: 批量取消 链上交易移动端查看权限
     */
    public CancelBmpbrowserPrivilegeResponse cancelBmpbrowserPrivilegeEx(CancelBmpbrowserPrivilegeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBmpbrowserPrivilegeResponse());
    }
}
