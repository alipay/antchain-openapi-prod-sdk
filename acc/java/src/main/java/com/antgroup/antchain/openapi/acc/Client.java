// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.acc.models.*;
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
                    new TeaPair("sdk_version", "1.1.51")
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
     * Description: 账密登录(PWD_LOGIN)
     * Summary: 账密登录
     */
    public VerifyUserPwdResponse verifyUserPwd(VerifyUserPwdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyUserPwdEx(request, headers, runtime);
    }

    /**
     * Description: 账密登录(PWD_LOGIN)
     * Summary: 账密登录
     */
    public VerifyUserPwdResponse verifyUserPwdEx(VerifyUserPwdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.pwd.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyUserPwdResponse());
    }

    /**
     * Description: 短信登录申请
     * Summary: 短信登录申请
     */
    public ApplyUserSmsResponse applyUserSms(ApplyUserSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUserSmsEx(request, headers, runtime);
    }

    /**
     * Description: 短信登录申请
     * Summary: 短信登录申请
     */
    public ApplyUserSmsResponse applyUserSmsEx(ApplyUserSmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.sms.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUserSmsResponse());
    }

    /**
     * Description: 短信登录
     * Summary: 短信登录
     */
    public VerifyUserSmsResponse verifyUserSms(VerifyUserSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyUserSmsEx(request, headers, runtime);
    }

    /**
     * Description: 短信登录
     * Summary: 短信登录
     */
    public VerifyUserSmsResponse verifyUserSmsEx(VerifyUserSmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.sms.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyUserSmsResponse());
    }

    /**
     * Description: 关联登录
     * Summary: 关联登录
     */
    public AuthUserRefResponse authUserRef(AuthUserRefRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authUserRefEx(request, headers, runtime);
    }

    /**
     * Description: 关联登录
     * Summary: 关联登录
     */
    public AuthUserRefResponse authUserRefEx(AuthUserRefRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.ref.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthUserRefResponse());
    }

    /**
     * Description: 退出登录
     * Summary: 退出登录
     */
    public CloseUserLoginResponse closeUserLogin(CloseUserLoginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeUserLoginEx(request, headers, runtime);
    }

    /**
     * Description: 退出登录
     * Summary: 退出登录
     */
    public CloseUserLoginResponse closeUserLoginEx(CloseUserLoginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.login.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseUserLoginResponse());
    }

    /**
     * Description: 用户注册
     * Summary: 用户注册
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserEx(request, headers, runtime);
    }

    /**
     * Description: 用户注册
     * Summary: 用户注册
     */
    public CreateUserResponse createUserEx(CreateUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUserResponse());
    }

    /**
     * Description: 获取用户信息
     * Summary: 获取用户信息
     */
    public GetUserCurrentResponse getUserCurrent(GetUserCurrentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserCurrentEx(request, headers, runtime);
    }

    /**
     * Description: 获取用户信息
     * Summary: 获取用户信息
     */
    public GetUserCurrentResponse getUserCurrentEx(GetUserCurrentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.current.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUserCurrentResponse());
    }

    /**
     * Description: 企业认证
     * Summary: 企业认证
     */
    public VerifyFirmResponse verifyFirm(VerifyFirmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFirmEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证
     * Summary: 企业认证
     */
    public VerifyFirmResponse verifyFirmEx(VerifyFirmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.firm.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFirmResponse());
    }

    /**
     * Description: 个人认证
     * Summary: 个人认证
     */
    public VerifyUserResponse verifyUser(VerifyUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyUserEx(request, headers, runtime);
    }

    /**
     * Description: 个人认证
     * Summary: 个人认证
     */
    public VerifyUserResponse verifyUserEx(VerifyUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyUserResponse());
    }

    /**
     * Description: ocr_文件识别接口
     * Summary: ocr_文件识别接口
     */
    public RecognizeOcrFileResponse recognizeOcrFile(RecognizeOcrFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeOcrFileEx(request, headers, runtime);
    }

    /**
     * Description: ocr_文件识别接口
     * Summary: ocr_文件识别接口
     */
    public RecognizeOcrFileResponse recognizeOcrFileEx(RecognizeOcrFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.ocr.file.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeOcrFileResponse());
    }

    /**
     * Description: 输入企业的四要素进行认证。
     * Summary: 企业四要素认证
     */
    public CertifyCertifyFirmmetaResponse certifyCertifyFirmmeta(CertifyCertifyFirmmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyCertifyFirmmetaEx(request, headers, runtime);
    }

    /**
     * Description: 输入企业的四要素进行认证。
     * Summary: 企业四要素认证
     */
    public CertifyCertifyFirmmetaResponse certifyCertifyFirmmetaEx(CertifyCertifyFirmmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.certify.firmmeta.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyCertifyFirmmetaResponse());
    }

    /**
     * Description: 输入个人的二要素进行认证。
     * Summary: 个人二要素认证
     */
    public CertifyCertifyPersonmetaResponse certifyCertifyPersonmeta(CertifyCertifyPersonmetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyCertifyPersonmetaEx(request, headers, runtime);
    }

    /**
     * Description: 输入个人的二要素进行认证。
     * Summary: 个人二要素认证
     */
    public CertifyCertifyPersonmetaResponse certifyCertifyPersonmetaEx(CertifyCertifyPersonmetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.certify.personmeta.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyCertifyPersonmetaResponse());
    }

    /**
     * Description: 人脸识别认证
     * Summary: 人脸识别认证
     */
    public CertifyCertifyFaceResponse certifyCertifyFace(CertifyCertifyFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyCertifyFaceEx(request, headers, runtime);
    }

    /**
     * Description: 人脸识别认证
     * Summary: 人脸识别认证
     */
    public CertifyCertifyFaceResponse certifyCertifyFaceEx(CertifyCertifyFaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.certify.face.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyCertifyFaceResponse());
    }

    /**
     * Description: 查询人脸识别结果
     * Summary: 人脸识别结果查询
     */
    public QueryQueryFacecertifyResponse queryQueryFacecertify(QueryQueryFacecertifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQueryFacecertifyEx(request, headers, runtime);
    }

    /**
     * Description: 查询人脸识别结果
     * Summary: 人脸识别结果查询
     */
    public QueryQueryFacecertifyResponse queryQueryFacecertifyEx(QueryQueryFacecertifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.query.facecertify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQueryFacecertifyResponse());
    }

    /**
     * Description: 每次切换企业，同步当前企业id
     * Summary: 控制台切换企业同步
     */
    public SwitchSwitchFirmidResponse switchSwitchFirmid(SwitchSwitchFirmidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchSwitchFirmidEx(request, headers, runtime);
    }

    /**
     * Description: 每次切换企业，同步当前企业id
     * Summary: 控制台切换企业同步
     */
    public SwitchSwitchFirmidResponse switchSwitchFirmidEx(SwitchSwitchFirmidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.switch.firmid.switch", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SwitchSwitchFirmidResponse());
    }

    /**
     * Description: 企业身份中心查询企业财报
     * Summary: 查询企业财报
     */
    public QueryQueryFirmfinancialResponse queryQueryFirmfinancial(QueryQueryFirmfinancialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryQueryFirmfinancialEx(request, headers, runtime);
    }

    /**
     * Description: 企业身份中心查询企业财报
     * Summary: 查询企业财报
     */
    public QueryQueryFirmfinancialResponse queryQueryFirmfinancialEx(QueryQueryFirmfinancialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.query.firmfinancial.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryQueryFirmfinancialResponse());
    }

    /**
     * Description: 企业身份中心新增或删除企业财报
     * Summary: 新增/删除企业财报
     */
    public SwitchSwitchFirmfinancialResponse switchSwitchFirmfinancial(SwitchSwitchFirmfinancialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchSwitchFirmfinancialEx(request, headers, runtime);
    }

    /**
     * Description: 企业身份中心新增或删除企业财报
     * Summary: 新增/删除企业财报
     */
    public SwitchSwitchFirmfinancialResponse switchSwitchFirmfinancialEx(SwitchSwitchFirmfinancialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.switch.firmfinancial.switch", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SwitchSwitchFirmfinancialResponse());
    }

    /**
     * Description: 生成企业/个人did
     * Summary: 生成企业/个人did
     */
    public CreateDidResponse createDid(CreateDidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidEx(request, headers, runtime);
    }

    /**
     * Description: 生成企业/个人did
     * Summary: 生成企业/个人did
     */
    public CreateDidResponse createDidEx(CreateDidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidResponse());
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册
     */
    public CreateContractPlatformResponse createContractPlatform(CreateContractPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractPlatformEx(request, headers, runtime);
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册
     */
    public CreateContractPlatformResponse createContractPlatformEx(CreateContractPlatformRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.platform.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractPlatformResponse());
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档
     */
    public AddContractDocumentResponse addContractDocument(AddContractDocumentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractDocumentEx(request, headers, runtime);
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档
     */
    public AddContractDocumentResponse addContractDocumentEx(AddContractDocumentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.document.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractDocumentResponse());
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档
     */
    public AddContractFileResponse addContractFile(AddContractFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractFileEx(request, headers, runtime);
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档
     */
    public AddContractFileResponse addContractFileEx(AddContractFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.file.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractFileResponse());
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key
     */
    public ApplyContractCallbackkeyResponse applyContractCallbackkey(ApplyContractCallbackkeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractCallbackkeyEx(request, headers, runtime);
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key
     */
    public ApplyContractCallbackkeyResponse applyContractCallbackkeyEx(ApplyContractCallbackkeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractCallbackkeyResponse());
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权
     */
    public AuthContractSignResponse authContractSign(AuthContractSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authContractSignEx(request, headers, runtime);
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权
     */
    public AuthContractSignResponse authContractSignEx(AuthContractSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.sign.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthContractSignResponse());
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     */
    public CreateContractTemplateResponse createContractTemplate(CreateContractTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractTemplateEx(request, headers, runtime);
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     */
    public CreateContractTemplateResponse createContractTemplateEx(CreateContractTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractTemplateResponse());
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程
     */
    public CreateContractSignflowResponse createContractSignflow(CreateContractSignflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractSignflowEx(request, headers, runtime);
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程
     */
    public CreateContractSignflowResponse createContractSignflowEx(CreateContractSignflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.signflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractSignflowResponse());
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件
     */
    public GetContractFileuploadurlResponse getContractFileuploadurl(GetContractFileuploadurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractFileuploadurlEx(request, headers, runtime);
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件
     */
    public GetContractFileuploadurlResponse getContractFileuploadurlEx(GetContractFileuploadurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractFileuploadurlResponse());
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区
     */
    public AddContractSignfieldResponse addContractSignfield(AddContractSignfieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractSignfieldEx(request, headers, runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区
     */
    public AddContractSignfieldResponse addContractSignfieldEx(AddContractSignfieldRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.signfield.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractSignfieldResponse());
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区
     */
    public CreateContractHandsignfieldResponse createContractHandsignfield(CreateContractHandsignfieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractHandsignfieldEx(request, headers, runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区
     */
    public CreateContractHandsignfieldResponse createContractHandsignfieldEx(CreateContractHandsignfieldRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractHandsignfieldResponse());
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启
     */
    public StartContractFlowResponse startContractFlow(StartContractFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startContractFlowEx(request, headers, runtime);
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启
     */
    public StartContractFlowResponse startContractFlowEx(StartContractFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.flow.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartContractFlowResponse());
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     */
    public GetContractSignurlResponse getContractSignurl(GetContractSignurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractSignurlEx(request, headers, runtime);
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     */
    public GetContractSignurlResponse getContractSignurlEx(GetContractSignurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.signurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractSignurlResponse());
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载
     */
    public DownloadContractDocumentResponse downloadContractDocument(DownloadContractDocumentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadContractDocumentEx(request, headers, runtime);
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载
     */
    public DownloadContractDocumentResponse downloadContractDocumentEx(DownloadContractDocumentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.document.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadContractDocumentResponse());
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档
     */
    public SaveContractFlowResponse saveContractFlow(SaveContractFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveContractFlowEx(request, headers, runtime);
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档
     */
    public SaveContractFlowResponse saveContractFlowEx(SaveContractFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.flow.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveContractFlowResponse());
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询
     */
    public QueryContractFlowResponse queryContractFlow(QueryContractFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractFlowEx(request, headers, runtime);
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询
     */
    public QueryContractFlowResponse queryContractFlowEx(QueryContractFlowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.flow.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractFlowResponse());
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情
     */
    public GetContractFileResponse getContractFile(GetContractFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractFileEx(request, headers, runtime);
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情
     */
    public GetContractFileResponse getContractFileEx(GetContractFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractFileResponse());
    }

    /**
     * Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息
     */
    public QueryContractNotaryResponse queryContractNotary(QueryContractNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractNotaryEx(request, headers, runtime);
    }

    /**
     * Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息
     */
    public QueryContractNotaryResponse queryContractNotaryEx(QueryContractNotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.notary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractNotaryResponse());
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章
     */
    public CreateContractAccountsealimageResponse createContractAccountsealimage(CreateContractAccountsealimageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAccountsealimageEx(request, headers, runtime);
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章
     */
    public CreateContractAccountsealimageResponse createContractAccountsealimageEx(CreateContractAccountsealimageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAccountsealimageResponse());
    }

    /**
     * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口
     */
    public CreateContractOnestepflowResponse createContractOnestepflow(CreateContractOnestepflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractOnestepflowEx(request, headers, runtime);
    }

    /**
     * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口
     */
    public CreateContractOnestepflowResponse createContractOnestepflowEx(CreateContractOnestepflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.onestepflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractOnestepflowResponse());
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表
     */
    public QueryContractFlowsignerResponse queryContractFlowsigner(QueryContractFlowsignerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractFlowsignerEx(request, headers, runtime);
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表
     */
    public QueryContractFlowsignerResponse queryContractFlowsignerEx(QueryContractFlowsignerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractFlowsignerResponse());
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表
     */
    public QueryContractSignfieldsResponse queryContractSignfields(QueryContractSignfieldsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractSignfieldsEx(request, headers, runtime);
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表
     */
    public QueryContractSignfieldsResponse queryContractSignfieldsEx(QueryContractSignfieldsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.signfields.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractSignfieldsResponse());
    }

    /**
     * Description: 执行签署人删除逻辑
     * Summary: 删除签署人
     */
    public DeleteContractSignerResponse deleteContractSigner(DeleteContractSignerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContractSignerEx(request, headers, runtime);
    }

    /**
     * Description: 执行签署人删除逻辑
     * Summary: 删除签署人
     */
    public DeleteContractSignerResponse deleteContractSignerEx(DeleteContractSignerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.signer.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContractSignerResponse());
    }

    /**
     * Description: ecp同步金融云,内部通道
     * Summary: ecp同步金融云,内部通道
     */
    public SyncEcpCloudResponse syncEcpCloud(SyncEcpCloudRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncEcpCloudEx(request, headers, runtime);
    }

    /**
     * Description: ecp同步金融云,内部通道
     * Summary: ecp同步金融云,内部通道
     */
    public SyncEcpCloudResponse syncEcpCloudEx(SyncEcpCloudRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.ecp.cloud.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncEcpCloudResponse());
    }

    /**
     * Description: 生成url跳转登录
     * Summary: 生成url跳转登录
     */
    public CreateOauthUrlResponse createOauthUrl(CreateOauthUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOauthUrlEx(request, headers, runtime);
    }

    /**
     * Description: 生成url跳转登录
     * Summary: 生成url跳转登录
     */
    public CreateOauthUrlResponse createOauthUrlEx(CreateOauthUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.oauth.url.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOauthUrlResponse());
    }

    /**
     * Description: 获取token
     * Summary: 获取token
     */
    public GetOauthTokenResponse getOauthToken(GetOauthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOauthTokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取token
     * Summary: 获取token
     */
    public GetOauthTokenResponse getOauthTokenEx(GetOauthTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.oauth.token.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetOauthTokenResponse());
    }

    /**
     * Description: token明细获取
     * Summary: token明细获取
     */
    public GetOauthTokendetailResponse getOauthTokendetail(GetOauthTokendetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOauthTokendetailEx(request, headers, runtime);
    }

    /**
     * Description: token明细获取
     * Summary: token明细获取
     */
    public GetOauthTokendetailResponse getOauthTokendetailEx(GetOauthTokendetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.oauth.tokendetail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetOauthTokendetailResponse());
    }

    /**
     * Description: session判活
     * Summary: session判活
     */
    public CheckSessionAliveResponse checkSessionAlive(CheckSessionAliveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSessionAliveEx(request, headers, runtime);
    }

    /**
     * Description: session判活
     * Summary: session判活
     */
    public CheckSessionAliveResponse checkSessionAliveEx(CheckSessionAliveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.session.alive.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSessionAliveResponse());
    }

    /**
     * Description: 外部合作伙伴异步通知接口
     * Summary: 外部合作伙伴异步通知接口
     */
    public NotifyPartnerAsyncResponse notifyPartnerAsync(NotifyPartnerAsyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyPartnerAsyncEx(request, headers, runtime);
    }

    /**
     * Description: 外部合作伙伴异步通知接口
     * Summary: 外部合作伙伴异步通知接口
     */
    public NotifyPartnerAsyncResponse notifyPartnerAsyncEx(NotifyPartnerAsyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.partner.async.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyPartnerAsyncResponse());
    }

    /**
     * Description: 创建一条项目基本信息
     * Summary: 创建一条项目基本信息
     */
    public CreateProjectBaseResponse createProjectBase(CreateProjectBaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectBaseEx(request, headers, runtime);
    }

    /**
     * Description: 创建一条项目基本信息
     * Summary: 创建一条项目基本信息
     */
    public CreateProjectBaseResponse createProjectBaseEx(CreateProjectBaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.project.base.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProjectBaseResponse());
    }

    /**
     * Description: 批量新增农民工基本信息
     * Summary: 批量新增农民工基本信息
     */
    public BatchcreateWorkersBaseResponse batchcreateWorkersBase(BatchcreateWorkersBaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateWorkersBaseEx(request, headers, runtime);
    }

    /**
     * Description: 批量新增农民工基本信息
     * Summary: 批量新增农民工基本信息
     */
    public BatchcreateWorkersBaseResponse batchcreateWorkersBaseEx(BatchcreateWorkersBaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.workers.base.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateWorkersBaseResponse());
    }

    /**
     * Description: 批量新增农民工考勤信息
     * Summary: 批量新增农民工考勤信息
     */
    public BatchcreateWorkersAttendanceResponse batchcreateWorkersAttendance(BatchcreateWorkersAttendanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateWorkersAttendanceEx(request, headers, runtime);
    }

    /**
     * Description: 批量新增农民工考勤信息
     * Summary: 批量新增农民工考勤信息
     */
    public BatchcreateWorkersAttendanceResponse batchcreateWorkersAttendanceEx(BatchcreateWorkersAttendanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.workers.attendance.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateWorkersAttendanceResponse());
    }

    /**
     * Description: 批量新增农民工工资发放信息
     * Summary: 批量新增农民工工资发放信息
     */
    public BatchcreateWorkersWageResponse batchcreateWorkersWage(BatchcreateWorkersWageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateWorkersWageEx(request, headers, runtime);
    }

    /**
     * Description: 批量新增农民工工资发放信息
     * Summary: 批量新增农民工工资发放信息
     */
    public BatchcreateWorkersWageResponse batchcreateWorkersWageEx(BatchcreateWorkersWageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.workers.wage.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateWorkersWageResponse());
    }

    /**
     * Description: 创建一条项目文件信息
     * Summary: 创建一条项目文件信息
     */
    public CreateProjectFileResponse createProjectFile(CreateProjectFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectFileEx(request, headers, runtime);
    }

    /**
     * Description: 创建一条项目文件信息
     * Summary: 创建一条项目文件信息
     */
    public CreateProjectFileResponse createProjectFileEx(CreateProjectFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.project.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProjectFileResponse());
    }

    /**
     * Description: 合同基本信息流入
     * Summary: 合同基本信息流入
     */
    public CreateContractBaseResponse createContractBase(CreateContractBaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractBaseEx(request, headers, runtime);
    }

    /**
     * Description: 合同基本信息流入
     * Summary: 合同基本信息流入
     */
    public CreateContractBaseResponse createContractBaseEx(CreateContractBaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.base.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractBaseResponse());
    }

    /**
     * Description: 合同收付款信息流入
     * Summary: 合同收付款信息流入
     */
    public CreateContractImplResponse createContractImpl(CreateContractImplRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractImplEx(request, headers, runtime);
    }

    /**
     * Description: 合同收付款信息流入
     * Summary: 合同收付款信息流入
     */
    public CreateContractImplResponse createContractImplEx(CreateContractImplRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.contract.impl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractImplResponse());
    }

    /**
     * Description: 个人认证信息同步
     * Summary: 个人认证信息同步
     */
    public CreateUserCertResponse createUserCert(CreateUserCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserCertEx(request, headers, runtime);
    }

    /**
     * Description: 个人认证信息同步
     * Summary: 个人认证信息同步
     */
    public CreateUserCertResponse createUserCertEx(CreateUserCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.cert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUserCertResponse());
    }

    /**
     * Description: 用户信息变更同步
     * Summary: 用户信息变更同步
     */
    public UpdateUserInfoResponse updateUserInfo(UpdateUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserInfoEx(request, headers, runtime);
    }

    /**
     * Description: 用户信息变更同步
     * Summary: 用户信息变更同步
     */
    public UpdateUserInfoResponse updateUserInfoEx(UpdateUserInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUserInfoResponse());
    }

    /**
     * Description: 用户注册信息同步
     * Summary: 用户注册信息同步
     */
    public CreateUserRegisterResponse createUserRegister(CreateUserRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserRegisterEx(request, headers, runtime);
    }

    /**
     * Description: 用户注册信息同步
     * Summary: 用户注册信息同步
     */
    public CreateUserRegisterResponse createUserRegisterEx(CreateUserRegisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.user.register.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUserRegisterResponse());
    }

    /**
     * Description: 企业认证信息同步
     * Summary: 企业认证信息同步
     */
    public CreateFirmCertResponse createFirmCert(CreateFirmCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFirmCertEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证信息同步
     * Summary: 企业认证信息同步
     */
    public CreateFirmCertResponse createFirmCertEx(CreateFirmCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.firm.cert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFirmCertResponse());
    }

    /**
     * Description: 企业信息变更同步
     * Summary: 企业信息变更同步
     */
    public UpdateFirmInfoResponse updateFirmInfo(UpdateFirmInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFirmInfoEx(request, headers, runtime);
    }

    /**
     * Description: 企业信息变更同步
     * Summary: 企业信息变更同步
     */
    public UpdateFirmInfoResponse updateFirmInfoEx(UpdateFirmInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.firm.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFirmInfoResponse());
    }

    /**
     * Description: 查询链上信息
     * Summary: 查询链上信息
     */
    public QueryChainTransactionResponse queryChainTransaction(QueryChainTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChainTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 查询链上信息
     * Summary: 查询链上信息
     */
    public QueryChainTransactionResponse queryChainTransactionEx(QueryChainTransactionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.acc.chain.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChainTransactionResponse());
    }
}
