// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.realperson.models.*;
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
                    new TeaPair("sdk_version", "1.15.0"),
                    new TeaPair("_prod_code", "REALPERSON"),
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
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询
     */
    public QueryFacevrfServerResponse queryFacevrfServer(QueryFacevrfServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFacevrfServerEx(request, headers, runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询
     */
    public QueryFacevrfServerResponse queryFacevrfServerEx(QueryFacevrfServerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFacevrfServerResponse());
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建
     */
    public CreateFacevrfServerResponse createFacevrfServer(CreateFacevrfServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFacevrfServerEx(request, headers, runtime);
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建
     */
    public CreateFacevrfServerResponse createFacevrfServerEx(CreateFacevrfServerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFacevrfServerResponse());
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对
     */
    public ExecFacevrfServerResponse execFacevrfServer(ExecFacevrfServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execFacevrfServerEx(request, headers, runtime);
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对
     */
    public ExecFacevrfServerResponse execFacevrfServerEx(ExecFacevrfServerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecFacevrfServerResponse());
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID
     */
    public GetFacevrfEvidenceResponse getFacevrfEvidence(GetFacevrfEvidenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFacevrfEvidenceEx(request, headers, runtime);
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID
     */
    public GetFacevrfEvidenceResponse getFacevrfEvidenceEx(GetFacevrfEvidenceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFacevrfEvidenceResponse());
    }

    /**
     * Description: 个人二要素认证
     * Summary: 个人二要素认证
     */
    public CheckIndividualidTwometaResponse checkIndividualidTwometa(CheckIndividualidTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndividualidTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 个人二要素认证
     * Summary: 个人二要素认证
     */
    public CheckIndividualidTwometaResponse checkIndividualidTwometaEx(CheckIndividualidTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.individualid.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndividualidTwometaResponse());
    }

    /**
     * Description: 个人三要素认证
     * Summary: 个人三要素认证
     */
    public CheckIndividualidThreemetaResponse checkIndividualidThreemeta(CheckIndividualidThreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndividualidThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 个人三要素认证
     * Summary: 个人三要素认证
     */
    public CheckIndividualidThreemetaResponse checkIndividualidThreemetaEx(CheckIndividualidThreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.individualid.threemeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndividualidThreemetaResponse());
    }

    /**
     * Description: 个人四要素认证
     * Summary: 个人四要素认证
     */
    public CheckIndividualidFourmetaResponse checkIndividualidFourmeta(CheckIndividualidFourmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndividualidFourmetaEx(request, headers, runtime);
    }

    /**
     * Description: 个人四要素认证
     * Summary: 个人四要素认证
     */
    public CheckIndividualidFourmetaResponse checkIndividualidFourmetaEx(CheckIndividualidFourmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.individualid.fourmeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndividualidFourmetaResponse());
    }

    /**
     * Description: 个人三要素认证（场景路由）
     * Summary: 个人三要素认证（场景路由）
     */
    public CheckRouteThreemetaResponse checkRouteThreemeta(CheckRouteThreemetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRouteThreemetaEx(request, headers, runtime);
    }

    /**
     * Description: 个人三要素认证（场景路由）
     * Summary: 个人三要素认证（场景路由）
     */
    public CheckRouteThreemetaResponse checkRouteThreemetaEx(CheckRouteThreemetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.route.threemeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckRouteThreemetaResponse());
    }

    /**
     * Description: 纯服务端声纹注册
     * Summary: 纯服务端声纹注册
     */
    public CreateVoiceprintServermodeResponse createVoiceprintServermode(CreateVoiceprintServermodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVoiceprintServermodeEx(request, headers, runtime);
    }

    /**
     * Description: 纯服务端声纹注册
     * Summary: 纯服务端声纹注册
     */
    public CreateVoiceprintServermodeResponse createVoiceprintServermodeEx(CreateVoiceprintServermodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "di.realperson.voiceprint.servermode.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateVoiceprintServermodeResponse createVoiceprintServermodeResponse = CreateVoiceprintServermodeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createVoiceprintServermodeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.voiceprint.servermode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateVoiceprintServermodeResponse());
    }

    /**
     * Description: 纯服务端声纹比对
     * Summary: 纯服务端声纹比对
     */
    public VerifyVoiceprintServermodeResponse verifyVoiceprintServermode(VerifyVoiceprintServermodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyVoiceprintServermodeEx(request, headers, runtime);
    }

    /**
     * Description: 纯服务端声纹比对
     * Summary: 纯服务端声纹比对
     */
    public VerifyVoiceprintServermodeResponse verifyVoiceprintServermodeEx(VerifyVoiceprintServermodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.voiceprint.servermode.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyVoiceprintServermodeResponse());
    }

    /**
     * Description: 个人二要素认证（场景路由）
     * Summary: 个人二要素认证（场景路由）
     */
    public CheckRouteTwometaResponse checkRouteTwometa(CheckRouteTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRouteTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 个人二要素认证（场景路由）
     * Summary: 个人二要素认证（场景路由）
     */
    public CheckRouteTwometaResponse checkRouteTwometaEx(CheckRouteTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.route.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckRouteTwometaResponse());
    }

    /**
     * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
     * Summary: 移动风险设备查询
     */
    public QueryMobileRiskResponse queryMobileRisk(QueryMobileRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMobileRiskEx(request, headers, runtime);
    }

    /**
     * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
     * Summary: 移动风险设备查询
     */
    public QueryMobileRiskResponse queryMobileRiskEx(QueryMobileRiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.mobile.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMobileRiskResponse());
    }

    /**
     * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
     * Summary: 查询认证人、认证时间等相关信息
     */
    public DetailFacevrfServerResponse detailFacevrfServer(DetailFacevrfServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailFacevrfServerEx(request, headers, runtime);
    }

    /**
     * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
     * Summary: 查询认证人、认证时间等相关信息
     */
    public DetailFacevrfServerResponse detailFacevrfServerEx(DetailFacevrfServerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailFacevrfServerResponse());
    }

    /**
     * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
     * Summary: 个人反欺诈风险校验
     */
    public CheckAnticheatPersonalResponse checkAnticheatPersonal(CheckAnticheatPersonalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAnticheatPersonalEx(request, headers, runtime);
    }

    /**
     * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
     * Summary: 个人反欺诈风险校验
     */
    public CheckAnticheatPersonalResponse checkAnticheatPersonalEx(CheckAnticheatPersonalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.anticheat.personal.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAnticheatPersonalResponse());
    }

    /**
     * Description: 二要素支持hash主体信息
     * Summary: 个人二要素核验支持hash的主体信息
     */
    public CheckTwometaHashResponse checkTwometaHash(CheckTwometaHashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkTwometaHashEx(request, headers, runtime);
    }

    /**
     * Description: 二要素支持hash主体信息
     * Summary: 个人二要素核验支持hash的主体信息
     */
    public CheckTwometaHashResponse checkTwometaHashEx(CheckTwometaHashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.twometa.hash.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckTwometaHashResponse());
    }

    /**
     * Description: 对接运营商等数据源查询手机号码的在网时长
     * Summary: 三要素在网时长查询接口
     */
    public QueryThreemetaOnlinetimeResponse queryThreemetaOnlinetime(QueryThreemetaOnlinetimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThreemetaOnlinetimeEx(request, headers, runtime);
    }

    /**
     * Description: 对接运营商等数据源查询手机号码的在网时长
     * Summary: 三要素在网时长查询接口
     */
    public QueryThreemetaOnlinetimeResponse queryThreemetaOnlinetimeEx(QueryThreemetaOnlinetimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.threemeta.onlinetime.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThreemetaOnlinetimeResponse());
    }

    /**
     * Description: 客户端初始化认证(OEM专用)
     * Summary: 客户端初始化认证(OEM专用)
     */
    public InitFacevrfZimResponse initFacevrfZim(InitFacevrfZimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFacevrfZimEx(request, headers, runtime);
    }

    /**
     * Description: 客户端初始化认证(OEM专用)
     * Summary: 客户端初始化认证(OEM专用)
     */
    public InitFacevrfZimResponse initFacevrfZimEx(InitFacevrfZimRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.zim.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFacevrfZimResponse());
    }

    /**
     * Description: 客户端人脸验证(OEM专用)
     * Summary: 客户端人脸验证(OEM专用)
     */
    public VerifyFacevrfZimResponse verifyFacevrfZim(VerifyFacevrfZimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFacevrfZimEx(request, headers, runtime);
    }

    /**
     * Description: 客户端人脸验证(OEM专用)
     * Summary: 客户端人脸验证(OEM专用)
     */
    public VerifyFacevrfZimResponse verifyFacevrfZimEx(VerifyFacevrfZimRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.zim.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFacevrfZimResponse());
    }

    /**
     * Description: 卡证OCR
     * Summary: 卡证OCR
     */
    public RecognizeDocIndividualcardResponse recognizeDocIndividualcard(RecognizeDocIndividualcardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeDocIndividualcardEx(request, headers, runtime);
    }

    /**
     * Description: 卡证OCR
     * Summary: 卡证OCR
     */
    public RecognizeDocIndividualcardResponse recognizeDocIndividualcardEx(RecognizeDocIndividualcardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.doc.individualcard.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeDocIndividualcardResponse());
    }

    /**
     * Description: 个人银行卡三要素
     * Summary: 个人银行卡三要素
     */
    public CheckThreemetaBankcardResponse checkThreemetaBankcard(CheckThreemetaBankcardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkThreemetaBankcardEx(request, headers, runtime);
    }

    /**
     * Description: 个人银行卡三要素
     * Summary: 个人银行卡三要素
     */
    public CheckThreemetaBankcardResponse checkThreemetaBankcardEx(CheckThreemetaBankcardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.threemeta.bankcard.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckThreemetaBankcardResponse());
    }

    /**
     * Description: deepsec终端安全风险标签查询
     * Summary: deepsec终端安全风险标签查询
     */
    public QueryDeepsecRiskResponse queryDeepsecRisk(QueryDeepsecRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeepsecRiskEx(request, headers, runtime);
    }

    /**
     * Description: deepsec终端安全风险标签查询
     * Summary: deepsec终端安全风险标签查询
     */
    public QueryDeepsecRiskResponse queryDeepsecRiskEx(QueryDeepsecRiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.deepsec.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeepsecRiskResponse());
    }

    /**
     * Description: deepsec终端安全api，用于apdid查询
     * Summary: tsbmrq设备id查询入口
     */
    public QueryDeepsecTsbmrqResponse queryDeepsecTsbmrq(QueryDeepsecTsbmrqRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeepsecTsbmrqEx(request, headers, runtime);
    }

    /**
     * Description: deepsec终端安全api，用于apdid查询
     * Summary: tsbmrq设备id查询入口
     */
    public QueryDeepsecTsbmrqResponse queryDeepsecTsbmrqEx(QueryDeepsecTsbmrqRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.deepsec.tsbmrq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeepsecTsbmrqResponse());
    }

    /**
     * Description: 个人运营商二次放号
     * Summary: 个人运营商二次放号
     */
    public QueryThreemetaPhonereuseResponse queryThreemetaPhonereuse(QueryThreemetaPhonereuseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThreemetaPhonereuseEx(request, headers, runtime);
    }

    /**
     * Description: 个人运营商二次放号
     * Summary: 个人运营商二次放号
     */
    public QueryThreemetaPhonereuseResponse queryThreemetaPhonereuseEx(QueryThreemetaPhonereuseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.threemeta.phonereuse.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThreemetaPhonereuseResponse());
    }

    /**
     * Description: 查询设备信息
     * Summary: 设备信息查询for蚁盾
     */
    public QueryTscenterDeviceResponse queryTscenterDevice(QueryTscenterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTscenterDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询设备信息
     * Summary: 设备信息查询for蚁盾
     */
    public QueryTscenterDeviceResponse queryTscenterDeviceEx(QueryTscenterDeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.tscenter.device.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTscenterDeviceResponse());
    }

    /**
     * Description: 学历验证
     * Summary: 学历验证
     */
    public QueryEducationInfoResponse queryEducationInfo(QueryEducationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEducationInfoEx(request, headers, runtime);
    }

    /**
     * Description: 学历验证
     * Summary: 学历验证
     */
    public QueryEducationInfoResponse queryEducationInfoEx(QueryEducationInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.education.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEducationInfoResponse());
    }

    /**
     * Description: demo用记录查询
     * Summary: demo用记录查询
     */
    public QueryDemoInfoResponse queryDemoInfo(QueryDemoInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoInfoEx(request, headers, runtime);
    }

    /**
     * Description: demo用记录查询
     * Summary: demo用记录查询
     */
    public QueryDemoInfoResponse queryDemoInfoEx(QueryDemoInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.demo.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoInfoResponse());
    }

    /**
     * Description: 个人银行卡二要素
     * Summary: 个人银行卡二要素
     */
    public CheckBankcardTwometaResponse checkBankcardTwometa(CheckBankcardTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkBankcardTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 个人银行卡二要素
     * Summary: 个人银行卡二要素
     */
    public CheckBankcardTwometaResponse checkBankcardTwometaEx(CheckBankcardTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.bankcard.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckBankcardTwometaResponse());
    }

    /**
     * Description: 个人运营商二要素
     * Summary: 个人运营商二要素
     */
    public CheckCarrierTwometaResponse checkCarrierTwometa(CheckCarrierTwometaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCarrierTwometaEx(request, headers, runtime);
    }

    /**
     * Description: 个人运营商二要素
     * Summary: 个人运营商二要素
     */
    public CheckCarrierTwometaResponse checkCarrierTwometaEx(CheckCarrierTwometaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.carrier.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCarrierTwometaResponse());
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     */
    public CreateNfcServerResponse createNfcServer(CreateNfcServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNfcServerEx(request, headers, runtime);
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     */
    public CreateNfcServerResponse createNfcServerEx(CreateNfcServerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.nfc.server.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNfcServerResponse());
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     */
    public QueryNfcServerResponse queryNfcServer(QueryNfcServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNfcServerEx(request, headers, runtime);
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     */
    public QueryNfcServerResponse queryNfcServerEx(QueryNfcServerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.nfc.server.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNfcServerResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
