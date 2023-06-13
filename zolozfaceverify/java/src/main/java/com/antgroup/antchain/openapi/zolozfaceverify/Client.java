// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.zolozfaceverify.models.*;
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
                    new TeaPair("sdk_version", "1.6.0"),
                    new TeaPair("_prod_code", "ZOLOZFACEVERIFY"),
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
     * Description: 金融云计算能力输出给主站使用
     * Summary: 金融云计算能力输出给主站使用
     */
    public ExecFaceauthAlgorithmResponse execFaceauthAlgorithm(ExecFaceauthAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execFaceauthAlgorithmEx(request, headers, runtime);
    }

    /**
     * Description: 金融云计算能力输出给主站使用
     * Summary: 金融云计算能力输出给主站使用
     */
    public ExecFaceauthAlgorithmResponse execFaceauthAlgorithmEx(ExecFaceauthAlgorithmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.algorithm.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecFaceauthAlgorithmResponse());
    }

    /**
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化
     */
    public FaceFaceauthInitializeResponse faceFaceauthInitialize(FaceFaceauthInitializeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.faceFaceauthInitializeEx(request, headers, runtime);
    }

    /**
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化
     */
    public FaceFaceauthInitializeResponse faceFaceauthInitializeEx(FaceFaceauthInitializeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.initialize.face", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FaceFaceauthInitializeResponse());
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询
     */
    public FaceFaceauthQueryResponse faceFaceauthQuery(FaceFaceauthQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.faceFaceauthQueryEx(request, headers, runtime);
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询
     */
    public FaceFaceauthQueryResponse faceFaceauthQueryEx(FaceFaceauthQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.query.face", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FaceFaceauthQueryResponse());
    }

    /**
     * Description: 人脸纯服务端模式比对
     * Summary: 人脸纯服务端模式比对
     */
    public IdentityFaceauthServermodeResponse identityFaceauthServermode(IdentityFaceauthServermodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.identityFaceauthServermodeEx(request, headers, runtime);
    }

    /**
     * Description: 人脸纯服务端模式比对
     * Summary: 人脸纯服务端模式比对
     */
    public IdentityFaceauthServermodeResponse identityFaceauthServermodeEx(IdentityFaceauthServermodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.servermode.identity", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IdentityFaceauthServermodeResponse());
    }

    /**
     * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: H5实人认证初始化
     */
    public InitializeFaceauthWebResponse initializeFaceauthWeb(InitializeFaceauthWebRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initializeFaceauthWebEx(request, headers, runtime);
    }

    /**
     * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: H5实人认证初始化
     */
    public InitializeFaceauthWebResponse initializeFaceauthWebEx(InitializeFaceauthWebRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.web.initialize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitializeFaceauthWebResponse());
    }

    /**
     * Description: H5实人认证查询
     * Summary: H5实人认证查询
     */
    public QueryFaceauthWebResponse queryFaceauthWeb(QueryFaceauthWebRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceauthWebEx(request, headers, runtime);
    }

    /**
     * Description: H5实人认证查询
     * Summary: H5实人认证查询
     */
    public QueryFaceauthWebResponse queryFaceauthWebEx(QueryFaceauthWebRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.web.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthWebResponse());
    }

    /**
     * Description: 提供给业务方刷脸认证计量查询接口
     * Summary: 提供给业务方刷脸认证计量查询接口
     */
    public QueryFaceauthMeteringResponse queryFaceauthMetering(QueryFaceauthMeteringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceauthMeteringEx(request, headers, runtime);
    }

    /**
     * Description: 提供给业务方刷脸认证计量查询接口
     * Summary: 提供给业务方刷脸认证计量查询接口
     */
    public QueryFaceauthMeteringResponse queryFaceauthMeteringEx(QueryFaceauthMeteringRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.metering.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthMeteringResponse());
    }

    /**
     * Description: 极简模式初始化接口，返回zimId和协议
     * Summary: 极简模式初始化接口
     */
    public InitFaceauthFaceLiteResponse initFaceauthFaceLite(InitFaceauthFaceLiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceauthFaceLiteEx(request, headers, runtime);
    }

    /**
     * Description: 极简模式初始化接口，返回zimId和协议
     * Summary: 极简模式初始化接口
     */
    public InitFaceauthFaceLiteResponse initFaceauthFaceLiteEx(InitFaceauthFaceLiteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.face.lite.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceauthFaceLiteResponse());
    }

    /**
     * Description: 数据查询，排查case
     * Summary: 数据查询，排查case
     */
    public QueryFaceauthDataResponse queryFaceauthData(QueryFaceauthDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceauthDataEx(request, headers, runtime);
    }

    /**
     * Description: 数据查询，排查case
     * Summary: 数据查询，排查case
     */
    public QueryFaceauthDataResponse queryFaceauthDataEx(QueryFaceauthDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthDataResponse());
    }

    /**
     * Description: 提供人脸特征提取、人脸区域识别等能力接口
     * Summary: 提供人脸特征提取、人脸区域识别等能力接口
     */
    public ExecAuthenticationCustomerFaceabilityResponse execAuthenticationCustomerFaceability(ExecAuthenticationCustomerFaceabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAuthenticationCustomerFaceabilityEx(request, headers, runtime);
    }

    /**
     * Description: 提供人脸特征提取、人脸区域识别等能力接口
     * Summary: 提供人脸特征提取、人脸区域识别等能力接口
     */
    public ExecAuthenticationCustomerFaceabilityResponse execAuthenticationCustomerFaceabilityEx(ExecAuthenticationCustomerFaceabilityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.authentication.customer.faceability.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAuthenticationCustomerFaceabilityResponse());
    }

    /**
     * Description: 客户端接口初始化认证
     * Summary: 客户端初始化
     */
    public InitFaceauthZimResponse initFaceauthZim(InitFaceauthZimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceauthZimEx(request, headers, runtime);
    }

    /**
     * Description: 客户端接口初始化认证
     * Summary: 客户端初始化
     */
    public InitFaceauthZimResponse initFaceauthZimEx(InitFaceauthZimRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.zim.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceauthZimResponse());
    }

    /**
     * Description: 提供客户端活体检测与人脸比对服务
     * Summary: 客户端人脸验证
     */
    public VerifyFaceauthZimResponse verifyFaceauthZim(VerifyFaceauthZimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFaceauthZimEx(request, headers, runtime);
    }

    /**
     * Description: 提供客户端活体检测与人脸比对服务
     * Summary: 客户端人脸验证
     */
    public VerifyFaceauthZimResponse verifyFaceauthZimEx(VerifyFaceauthZimRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.zim.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFaceauthZimResponse());
    }

    /**
     * Description: OCR识别接口，开放给阿里云场景
     * Summary: OCR识别接口
     */
    public RecognizeFaceauthOcrResponse recognizeFaceauthOcr(RecognizeFaceauthOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeFaceauthOcrEx(request, headers, runtime);
    }

    /**
     * Description: OCR识别接口，开放给阿里云场景
     * Summary: OCR识别接口
     */
    public RecognizeFaceauthOcrResponse recognizeFaceauthOcrEx(RecognizeFaceauthOcrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.ocr.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeFaceauthOcrResponse());
    }

    /**
     * Description: Web实人认证初始化	
     * Summary: Web实人认证初始化 
     */
    public InitFaceauthWebsdkResponse initFaceauthWebsdk(InitFaceauthWebsdkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceauthWebsdkEx(request, headers, runtime);
    }

    /**
     * Description: Web实人认证初始化	
     * Summary: Web实人认证初始化 
     */
    public InitFaceauthWebsdkResponse initFaceauthWebsdkEx(InitFaceauthWebsdkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.websdk.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceauthWebsdkResponse());
    }

    /**
     * Description: Web实人认证查询
     * Summary: Web实人认证查询
     */
    public QueryFaceauthWebsdkResponse queryFaceauthWebsdk(QueryFaceauthWebsdkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceauthWebsdkEx(request, headers, runtime);
    }

    /**
     * Description: Web实人认证查询
     * Summary: Web实人认证查询
     */
    public QueryFaceauthWebsdkResponse queryFaceauthWebsdkEx(QueryFaceauthWebsdkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.websdk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthWebsdkResponse());
    }

    /**
     * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
     * Summary: 获取认证资料
     */
    public QueryFaceauthFileResponse queryFaceauthFile(QueryFaceauthFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceauthFileEx(request, headers, runtime);
    }

    /**
     * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
     * Summary: 获取认证资料
     */
    public QueryFaceauthFileResponse queryFaceauthFileEx(QueryFaceauthFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.file.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthFileResponse());
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化
     */
    public InitFaceauthFaceplusResponse initFaceauthFaceplus(InitFaceauthFaceplusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceauthFaceplusEx(request, headers, runtime);
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化
     */
    public InitFaceauthFaceplusResponse initFaceauthFaceplusEx(InitFaceauthFaceplusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.faceplus.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceauthFaceplusResponse());
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询
     */
    public QueryFaceauthFaceplusResponse queryFaceauthFaceplus(QueryFaceauthFaceplusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceauthFaceplusEx(request, headers, runtime);
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询
     */
    public QueryFaceauthFaceplusResponse queryFaceauthFaceplusEx(QueryFaceauthFaceplusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.faceplus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthFaceplusResponse());
    }

    /**
     * Description: 意愿核身认证服务端初始化
     * Summary: 意愿核身认证服务端初始化
     */
    public InitFaceauthFaceWishResponse initFaceauthFaceWish(InitFaceauthFaceWishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceauthFaceWishEx(request, headers, runtime);
    }

    /**
     * Description: 意愿核身认证服务端初始化
     * Summary: 意愿核身认证服务端初始化
     */
    public InitFaceauthFaceWishResponse initFaceauthFaceWishEx(InitFaceauthFaceWishRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.face.wish.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceauthFaceWishResponse());
    }

    /**
     * Description: 人脸视频认证
     * Summary: 人脸视频认证
     */
    public VerifyFaceauthVideoResponse verifyFaceauthVideo(VerifyFaceauthVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFaceauthVideoEx(request, headers, runtime);
    }

    /**
     * Description: 人脸视频认证
     * Summary: 人脸视频认证
     */
    public VerifyFaceauthVideoResponse verifyFaceauthVideoEx(VerifyFaceauthVideoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.video.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFaceauthVideoResponse());
    }

    /**
     * Description: 实证NFC服务端初始化
     * Summary: 实证NFC服务端初始化
     */
    public InitFaceauthNfcResponse initFaceauthNfc(InitFaceauthNfcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceauthNfcEx(request, headers, runtime);
    }

    /**
     * Description: 实证NFC服务端初始化
     * Summary: 实证NFC服务端初始化
     */
    public InitFaceauthNfcResponse initFaceauthNfcEx(InitFaceauthNfcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "faceverifyzoloz.faceauth.nfc.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceauthNfcResponse());
    }
}
