// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.realperson.models.*;

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
                    new TeaPair("sdk_version", "1.21.21"),
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
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 认证查询</p>
     */
    public QueryFacevrfServerResponse queryFacevrfServer(QueryFacevrfServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFacevrfServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 认证查询</p>
     */
    public QueryFacevrfServerResponse queryFacevrfServerEx(QueryFacevrfServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFacevrfServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建</p>
     */
    public CreateFacevrfServerResponse createFacevrfServer(CreateFacevrfServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFacevrfServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建</p>
     */
    public CreateFacevrfServerResponse createFacevrfServerEx(CreateFacevrfServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFacevrfServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对</p>
     */
    public ExecFacevrfServerResponse execFacevrfServer(ExecFacevrfServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execFacevrfServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对</p>
     */
    public ExecFacevrfServerResponse execFacevrfServerEx(ExecFacevrfServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecFacevrfServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID</p>
     */
    public GetFacevrfEvidenceResponse getFacevrfEvidence(GetFacevrfEvidenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFacevrfEvidenceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID</p>
     */
    public GetFacevrfEvidenceResponse getFacevrfEvidenceEx(GetFacevrfEvidenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFacevrfEvidenceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人二要素认证
     * Summary: 个人二要素认证</p>
     */
    public CheckIndividualidTwometaResponse checkIndividualidTwometa(CheckIndividualidTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndividualidTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人二要素认证
     * Summary: 个人二要素认证</p>
     */
    public CheckIndividualidTwometaResponse checkIndividualidTwometaEx(CheckIndividualidTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.individualid.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndividualidTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人三要素认证
     * Summary: 个人三要素认证</p>
     */
    public CheckIndividualidThreemetaResponse checkIndividualidThreemeta(CheckIndividualidThreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndividualidThreemetaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人三要素认证
     * Summary: 个人三要素认证</p>
     */
    public CheckIndividualidThreemetaResponse checkIndividualidThreemetaEx(CheckIndividualidThreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.individualid.threemeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndividualidThreemetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人四要素认证
     * Summary: 个人四要素认证</p>
     */
    public CheckIndividualidFourmetaResponse checkIndividualidFourmeta(CheckIndividualidFourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndividualidFourmetaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人四要素认证
     * Summary: 个人四要素认证</p>
     */
    public CheckIndividualidFourmetaResponse checkIndividualidFourmetaEx(CheckIndividualidFourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.individualid.fourmeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndividualidFourmetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人三要素认证（场景路由）
     * Summary: 个人三要素认证（场景路由）</p>
     */
    public CheckRouteThreemetaResponse checkRouteThreemeta(CheckRouteThreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRouteThreemetaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人三要素认证（场景路由）
     * Summary: 个人三要素认证（场景路由）</p>
     */
    public CheckRouteThreemetaResponse checkRouteThreemetaEx(CheckRouteThreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.route.threemeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckRouteThreemetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端声纹注册
     * Summary: 纯服务端声纹注册</p>
     */
    public CreateVoiceprintServermodeResponse createVoiceprintServermode(CreateVoiceprintServermodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVoiceprintServermodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端声纹注册
     * Summary: 纯服务端声纹注册</p>
     */
    public CreateVoiceprintServermodeResponse createVoiceprintServermodeEx(CreateVoiceprintServermodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.voiceprint.servermode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateVoiceprintServermodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端声纹比对
     * Summary: 纯服务端声纹比对</p>
     */
    public VerifyVoiceprintServermodeResponse verifyVoiceprintServermode(VerifyVoiceprintServermodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyVoiceprintServermodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端声纹比对
     * Summary: 纯服务端声纹比对</p>
     */
    public VerifyVoiceprintServermodeResponse verifyVoiceprintServermodeEx(VerifyVoiceprintServermodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.voiceprint.servermode.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyVoiceprintServermodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人二要素认证（场景路由）
     * Summary: 个人二要素认证（场景路由）</p>
     */
    public CheckRouteTwometaResponse checkRouteTwometa(CheckRouteTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRouteTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人二要素认证（场景路由）
     * Summary: 个人二要素认证（场景路由）</p>
     */
    public CheckRouteTwometaResponse checkRouteTwometaEx(CheckRouteTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.route.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckRouteTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
     * Summary: 移动风险设备查询</p>
     */
    public QueryMobileRiskResponse queryMobileRisk(QueryMobileRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMobileRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
     * Summary: 移动风险设备查询</p>
     */
    public QueryMobileRiskResponse queryMobileRiskEx(QueryMobileRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.mobile.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMobileRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
     * Summary: 查询认证人、认证时间等相关信息</p>
     */
    public DetailFacevrfServerResponse detailFacevrfServer(DetailFacevrfServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailFacevrfServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
     * Summary: 查询认证人、认证时间等相关信息</p>
     */
    public DetailFacevrfServerResponse detailFacevrfServerEx(DetailFacevrfServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailFacevrfServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
     * Summary: 个人反欺诈风险校验</p>
     */
    public CheckAnticheatPersonalResponse checkAnticheatPersonal(CheckAnticheatPersonalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAnticheatPersonalEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
     * Summary: 个人反欺诈风险校验</p>
     */
    public CheckAnticheatPersonalResponse checkAnticheatPersonalEx(CheckAnticheatPersonalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.anticheat.personal.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAnticheatPersonalResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 二要素支持hash主体信息
     * Summary: 个人二要素核验支持hash的主体信息</p>
     */
    public CheckTwometaHashResponse checkTwometaHash(CheckTwometaHashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkTwometaHashEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 二要素支持hash主体信息
     * Summary: 个人二要素核验支持hash的主体信息</p>
     */
    public CheckTwometaHashResponse checkTwometaHashEx(CheckTwometaHashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.twometa.hash.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckTwometaHashResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 对接运营商等数据源查询手机号码的在网时长
     * Summary: 三要素在网时长查询接口</p>
     */
    public QueryThreemetaOnlinetimeResponse queryThreemetaOnlinetime(QueryThreemetaOnlinetimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThreemetaOnlinetimeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 对接运营商等数据源查询手机号码的在网时长
     * Summary: 三要素在网时长查询接口</p>
     */
    public QueryThreemetaOnlinetimeResponse queryThreemetaOnlinetimeEx(QueryThreemetaOnlinetimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.threemeta.onlinetime.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThreemetaOnlinetimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户端初始化认证(OEM专用)
     * Summary: 客户端初始化认证(OEM专用)</p>
     */
    public InitFacevrfZimResponse initFacevrfZim(InitFacevrfZimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFacevrfZimEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户端初始化认证(OEM专用)
     * Summary: 客户端初始化认证(OEM专用)</p>
     */
    public InitFacevrfZimResponse initFacevrfZimEx(InitFacevrfZimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.zim.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFacevrfZimResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户端人脸验证(OEM专用)
     * Summary: 客户端人脸验证(OEM专用)</p>
     */
    public VerifyFacevrfZimResponse verifyFacevrfZim(VerifyFacevrfZimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFacevrfZimEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户端人脸验证(OEM专用)
     * Summary: 客户端人脸验证(OEM专用)</p>
     */
    public VerifyFacevrfZimResponse verifyFacevrfZimEx(VerifyFacevrfZimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.zim.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFacevrfZimResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡证OCR
     * Summary: 卡证OCR</p>
     */
    public RecognizeDocIndividualcardResponse recognizeDocIndividualcard(RecognizeDocIndividualcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeDocIndividualcardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 卡证OCR
     * Summary: 卡证OCR</p>
     */
    public RecognizeDocIndividualcardResponse recognizeDocIndividualcardEx(RecognizeDocIndividualcardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "di.realperson.doc.individualcard.recognize"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                RecognizeDocIndividualcardResponse recognizeDocIndividualcardResponse = RecognizeDocIndividualcardResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return recognizeDocIndividualcardResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.doc.individualcard.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeDocIndividualcardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡三要素
     * Summary: 个人银行卡三要素</p>
     */
    public CheckThreemetaBankcardResponse checkThreemetaBankcard(CheckThreemetaBankcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkThreemetaBankcardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡三要素
     * Summary: 个人银行卡三要素</p>
     */
    public CheckThreemetaBankcardResponse checkThreemetaBankcardEx(CheckThreemetaBankcardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.threemeta.bankcard.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckThreemetaBankcardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: deepsec终端安全风险标签查询
     * Summary: deepsec终端安全风险标签查询</p>
     */
    public QueryDeepsecRiskResponse queryDeepsecRisk(QueryDeepsecRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeepsecRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: deepsec终端安全风险标签查询
     * Summary: deepsec终端安全风险标签查询</p>
     */
    public QueryDeepsecRiskResponse queryDeepsecRiskEx(QueryDeepsecRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.deepsec.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeepsecRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: deepsec终端安全api，用于apdid查询
     * Summary: tsbmrq设备id查询入口</p>
     */
    public QueryDeepsecTsbmrqResponse queryDeepsecTsbmrq(QueryDeepsecTsbmrqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeepsecTsbmrqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: deepsec终端安全api，用于apdid查询
     * Summary: tsbmrq设备id查询入口</p>
     */
    public QueryDeepsecTsbmrqResponse queryDeepsecTsbmrqEx(QueryDeepsecTsbmrqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.deepsec.tsbmrq.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeepsecTsbmrqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人运营商二次放号
     * Summary: 个人运营商二次放号</p>
     */
    public QueryThreemetaPhonereuseResponse queryThreemetaPhonereuse(QueryThreemetaPhonereuseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThreemetaPhonereuseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人运营商二次放号
     * Summary: 个人运营商二次放号</p>
     */
    public QueryThreemetaPhonereuseResponse queryThreemetaPhonereuseEx(QueryThreemetaPhonereuseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.threemeta.phonereuse.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThreemetaPhonereuseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询设备信息
     * Summary: 设备信息查询for蚁盾</p>
     */
    public QueryTscenterDeviceResponse queryTscenterDevice(QueryTscenterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTscenterDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询设备信息
     * Summary: 设备信息查询for蚁盾</p>
     */
    public QueryTscenterDeviceResponse queryTscenterDeviceEx(QueryTscenterDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.tscenter.device.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTscenterDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 学历验证
     * Summary: 学历验证</p>
     */
    public QueryEducationInfoResponse queryEducationInfo(QueryEducationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEducationInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 学历验证
     * Summary: 学历验证</p>
     */
    public QueryEducationInfoResponse queryEducationInfoEx(QueryEducationInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.education.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEducationInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: demo用记录查询
     * Summary: demo用记录查询</p>
     */
    public QueryDemoInfoResponse queryDemoInfo(QueryDemoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: demo用记录查询
     * Summary: demo用记录查询</p>
     */
    public QueryDemoInfoResponse queryDemoInfoEx(QueryDemoInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.demo.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡二要素
     * Summary: 个人银行卡二要素</p>
     */
    public CheckBankcardTwometaResponse checkBankcardTwometa(CheckBankcardTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkBankcardTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡二要素
     * Summary: 个人银行卡二要素</p>
     */
    public CheckBankcardTwometaResponse checkBankcardTwometaEx(CheckBankcardTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.bankcard.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckBankcardTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人运营商二要素
     * Summary: 个人运营商二要素</p>
     */
    public CheckCarrierTwometaResponse checkCarrierTwometa(CheckCarrierTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCarrierTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人运营商二要素
     * Summary: 个人运营商二要素</p>
     */
    public CheckCarrierTwometaResponse checkCarrierTwometaEx(CheckCarrierTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.carrier.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCarrierTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: NFC实证
     * Summary: NFC实证</p>
     */
    public CreateNfcServerResponse createNfcServer(CreateNfcServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNfcServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: NFC实证
     * Summary: NFC实证</p>
     */
    public CreateNfcServerResponse createNfcServerEx(CreateNfcServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.nfc.server.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNfcServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: NFC实证
     * Summary: NFC实证</p>
     */
    public QueryNfcServerResponse queryNfcServer(QueryNfcServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNfcServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: NFC实证
     * Summary: NFC实证</p>
     */
    public QueryNfcServerResponse queryNfcServerEx(QueryNfcServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.nfc.server.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNfcServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 社会安全风险
     * Summary: 社会安全风险</p>
     */
    public QuerySocialriskDetailResponse querySocialriskDetail(QuerySocialriskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySocialriskDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 社会安全风险
     * Summary: 社会安全风险</p>
     */
    public QuerySocialriskDetailResponse querySocialriskDetailEx(QuerySocialriskDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.socialrisk.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySocialriskDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 运营商在网状态查询
     * Summary: 运营商在网状态查询</p>
     */
    public QueryCarrierNetstatusResponse queryCarrierNetstatus(QueryCarrierNetstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCarrierNetstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 运营商在网状态查询
     * Summary: 运营商在网状态查询</p>
     */
    public QueryCarrierNetstatusResponse queryCarrierNetstatusEx(QueryCarrierNetstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.carrier.netstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCarrierNetstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 社会安全风险（简版）
     * Summary: 社会安全风险（简版）</p>
     */
    public QuerySocialriskBriefResponse querySocialriskBrief(QuerySocialriskBriefRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySocialriskBriefEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 社会安全风险（简版）
     * Summary: 社会安全风险（简版）</p>
     */
    public QuerySocialriskBriefResponse querySocialriskBriefEx(QuerySocialriskBriefRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.socialrisk.brief.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySocialriskBriefResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 社会安全风险（tob风控版）
     * Summary: 社会安全风险（tob风控版）</p>
     */
    public QuerySocialriskTobriskResponse querySocialriskTobrisk(QuerySocialriskTobriskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySocialriskTobriskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 社会安全风险（tob风控版）
     * Summary: 社会安全风险（tob风控版）</p>
     */
    public QuerySocialriskTobriskResponse querySocialriskTobriskEx(QuerySocialriskTobriskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.socialrisk.tobrisk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySocialriskTobriskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对V2版本</p>
     */
    public ExecFacevrfServermodeResponse execFacevrfServermode(ExecFacevrfServermodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execFacevrfServermodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对V2版本</p>
     */
    public ExecFacevrfServermodeResponse execFacevrfServermodeEx(ExecFacevrfServermodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "di.realperson.facevrf.servermode.exec"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ExecFacevrfServermodeResponse execFacevrfServermodeResponse = ExecFacevrfServermodeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return execFacevrfServermodeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.servermode.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecFacevrfServermodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 银行活跃度
     * Summary: 银行活跃度</p>
     */
    public QueryBankLivenessResponse queryBankLiveness(QueryBankLivenessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBankLivenessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 银行活跃度
     * Summary: 银行活跃度</p>
     */
    public QueryBankLivenessResponse queryBankLivenessEx(QueryBankLivenessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.bank.liveness.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBankLivenessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于阿里云渠道小程序域名的绑定
     * Summary: 新增场景与域名映射</p>
     */
    public CreateConsoleDomainResponse createConsoleDomain(CreateConsoleDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsoleDomainEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于阿里云渠道小程序域名的绑定
     * Summary: 新增场景与域名映射</p>
     */
    public CreateConsoleDomainResponse createConsoleDomainEx(CreateConsoleDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.console.domain.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsoleDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 阿里云控制台删除场景与域名映射
     * Summary: 删除场景与域名映射</p>
     */
    public DeleteConsoleDomainResponse deleteConsoleDomain(DeleteConsoleDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsoleDomainEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 阿里云控制台删除场景与域名映射
     * Summary: 删除场景与域名映射</p>
     */
    public DeleteConsoleDomainResponse deleteConsoleDomainEx(DeleteConsoleDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.console.domain.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteConsoleDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 失联修复初始化
     * Summary: 失联修复初始化</p>
     */
    public InitCarrierRepairmobileResponse initCarrierRepairmobile(InitCarrierRepairmobileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCarrierRepairmobileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 失联修复初始化
     * Summary: 失联修复初始化</p>
     */
    public InitCarrierRepairmobileResponse initCarrierRepairmobileEx(InitCarrierRepairmobileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.carrier.repairmobile.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCarrierRepairmobileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 失联修复查询修复结果
     * Summary: 失联修复查询修复结果</p>
     */
    public QueryCarrierRepairmobileResponse queryCarrierRepairmobile(QueryCarrierRepairmobileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCarrierRepairmobileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 失联修复查询修复结果
     * Summary: 失联修复查询修复结果</p>
     */
    public QueryCarrierRepairmobileResponse queryCarrierRepairmobileEx(QueryCarrierRepairmobileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.carrier.repairmobile.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCarrierRepairmobileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 失联修复小号绑定
     * Summary: 失联修复小号绑定</p>
     */
    public BindCarrierRepairmobileResponse bindCarrierRepairmobile(BindCarrierRepairmobileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindCarrierRepairmobileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 失联修复小号绑定
     * Summary: 失联修复小号绑定</p>
     */
    public BindCarrierRepairmobileResponse bindCarrierRepairmobileEx(BindCarrierRepairmobileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.carrier.repairmobile.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindCarrierRepairmobileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部机构数据上报
     * Summary: 外部机构数据上报</p>
     */
    public ApplyExtOrgdataResponse applyExtOrgdata(ApplyExtOrgdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyExtOrgdataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部机构数据上报
     * Summary: 外部机构数据上报</p>
     */
    public ApplyExtOrgdataResponse applyExtOrgdataEx(ApplyExtOrgdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.ext.orgdata.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyExtOrgdataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数科刷脸服务端初始化接口
     * Summary: 数科刷脸服务端初始化接口</p>
     */
    public CreateFaceverifyServerResponse createFaceverifyServer(CreateFaceverifyServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFaceverifyServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数科刷脸服务端初始化接口
     * Summary: 数科刷脸服务端初始化接口</p>
     */
    public CreateFaceverifyServerResponse createFaceverifyServerEx(CreateFaceverifyServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "di.realperson.faceverify.server.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateFaceverifyServerResponse createFaceverifyServerResponse = CreateFaceverifyServerResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createFaceverifyServerResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.faceverify.server.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFaceverifyServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 认证查询</p>
     */
    public QueryFaceverifyServerResponse queryFaceverifyServer(QueryFaceverifyServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceverifyServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 认证查询</p>
     */
    public QueryFaceverifyServerResponse queryFaceverifyServerEx(QueryFaceverifyServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.faceverify.server.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceverifyServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡状态增强版
     * Summary: 个人银行卡状态增强版</p>
     */
    public QueryBankLivenessplusResponse queryBankLivenessplus(QueryBankLivenessplusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBankLivenessplusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡状态增强版
     * Summary: 个人银行卡状态增强版</p>
     */
    public QueryBankLivenessplusResponse queryBankLivenessplusEx(QueryBankLivenessplusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.bank.livenessplus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBankLivenessplusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对基础版</p>
     */
    public ExecFaceverifyServermodeResponse execFaceverifyServermode(ExecFaceverifyServermodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execFaceverifyServermodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对基础版</p>
     */
    public ExecFaceverifyServermodeResponse execFaceverifyServermodeEx(ExecFaceverifyServermodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "di.realperson.faceverify.servermode.exec"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ExecFaceverifyServermodeResponse execFaceverifyServermodeResponse = ExecFaceverifyServermodeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return execFaceverifyServermodeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.faceverify.servermode.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecFaceverifyServermodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付宝实人认证初始化接口
     * Summary: 支付宝实人认证初始化接口</p>
     */
    public CreateAlipayverifyServerResponse createAlipayverifyServer(CreateAlipayverifyServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlipayverifyServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付宝实人认证初始化接口
     * Summary: 支付宝实人认证初始化接口</p>
     */
    public CreateAlipayverifyServerResponse createAlipayverifyServerEx(CreateAlipayverifyServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.alipayverify.server.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAlipayverifyServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付宝实人认证查询接口
     * Summary: 支付宝实人认证查询接口</p>
     */
    public QueryAlipayverifyServerResponse queryAlipayverifyServer(QueryAlipayverifyServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlipayverifyServerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付宝实人认证查询接口
     * Summary: 支付宝实人认证查询接口</p>
     */
    public QueryAlipayverifyServerResponse queryAlipayverifyServerEx(QueryAlipayverifyServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.alipayverify.server.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlipayverifyServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 车辆资产验证
     * Summary: 车辆资产验证</p>
     */
    public CheckCarTwometaResponse checkCarTwometa(CheckCarTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCarTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 车辆资产验证
     * Summary: 车辆资产验证</p>
     */
    public CheckCarTwometaResponse checkCarTwometaEx(CheckCarTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.car.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCarTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 学历验证
     * Summary: 学历验证</p>
     */
    public QueryEducationBackgroundResponse queryEducationBackground(QueryEducationBackgroundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEducationBackgroundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 学历验证
     * Summary: 学历验证</p>
     */
    public QueryEducationBackgroundResponse queryEducationBackgroundEx(QueryEducationBackgroundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.education.background.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEducationBackgroundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡状态验证 V4.0
     * Summary: 个人银行卡状态验证 V4.0</p>
     */
    public QueryBankLivenessfourResponse queryBankLivenessfour(QueryBankLivenessfourRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBankLivenessfourEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人银行卡状态验证 V4.0
     * Summary: 个人银行卡状态验证 V4.0</p>
     */
    public QueryBankLivenessfourResponse queryBankLivenessfourEx(QueryBankLivenessfourRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.bank.livenessfour.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBankLivenessfourResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的材料信息
     * Summary: 认证材料查询</p>
     */
    public QueryFaceverifyServermaterialResponse queryFaceverifyServermaterial(QueryFaceverifyServermaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceverifyServermaterialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的材料信息
     * Summary: 认证材料查询</p>
     */
    public QueryFaceverifyServermaterialResponse queryFaceverifyServermaterialEx(QueryFaceverifyServermaterialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.faceverify.servermaterial.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceverifyServermaterialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 图片压缩接口
     * Summary: 图片压缩接口</p>
     */
    public ScaleinImageResponse scaleinImage(ScaleinImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleinImageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 图片压缩接口
     * Summary: 图片压缩接口</p>
     */
    public ScaleinImageResponse scaleinImageEx(ScaleinImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "di.realperson.image.scalein"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ScaleinImageResponse scaleinImageResponse = ScaleinImageResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return scaleinImageResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.image.scalein", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ScaleinImageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 要素卡证OCR
     * Summary: 要素卡证OCR</p>
     */
    public RecognizeOcrIndividualcardResponse recognizeOcrIndividualcard(RecognizeOcrIndividualcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeOcrIndividualcardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 要素卡证OCR
     * Summary: 要素卡证OCR</p>
     */
    public RecognizeOcrIndividualcardResponse recognizeOcrIndividualcardEx(RecognizeOcrIndividualcardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "di.realperson.ocr.individualcard.recognize"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                RecognizeOcrIndividualcardResponse recognizeOcrIndividualcardResponse = RecognizeOcrIndividualcardResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return recognizeOcrIndividualcardResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.ocr.individualcard.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeOcrIndividualcardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
