// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.mpaasfaceverify.models.*;
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
                    new TeaPair("sdk_version", "1.2.10"),
                    new TeaPair("_prod_code", "MPAASFACEVERIFY"),
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
     * Description: 人脸认证问题自动化排查接口
     * Summary: 人脸认证问题自动化排查接口
     */
    public QueryCertifyAnalysisResponse queryCertifyAnalysis(QueryCertifyAnalysisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertifyAnalysisEx(request, headers, runtime);
    }

    /**
     * Description: 人脸认证问题自动化排查接口
     * Summary: 人脸认证问题自动化排查接口
     */
    public QueryCertifyAnalysisResponse queryCertifyAnalysisEx(QueryCertifyAnalysisRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.certify.analysis.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertifyAnalysisResponse());
    }

    /**
     * Description: 人脸认证问题根据身份信息获取认证信息
     * Summary: 人脸认证问题根据身份信息获取认证信息
     */
    public QueryCertifyAnalysisrecordResponse queryCertifyAnalysisrecord(QueryCertifyAnalysisrecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertifyAnalysisrecordEx(request, headers, runtime);
    }

    /**
     * Description: 人脸认证问题根据身份信息获取认证信息
     * Summary: 人脸认证问题根据身份信息获取认证信息
     */
    public QueryCertifyAnalysisrecordResponse queryCertifyAnalysisrecordEx(QueryCertifyAnalysisrecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.certify.analysisrecord.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertifyAnalysisrecordResponse());
    }

    /**
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化
     */
    public InitFaceauthResponse initFaceauth(InitFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化
     */
    public InitFaceauthResponse initFaceauthEx(InitFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceauthResponse());
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询
     */
    public QueryFaceauthResponse queryFaceauth(QueryFaceauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceauthEx(request, headers, runtime);
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询
     */
    public QueryFaceauthResponse queryFaceauthEx(QueryFaceauthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthResponse());
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化
     */
    public InitFaceplusResponse initFaceplus(InitFaceplusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFaceplusEx(request, headers, runtime);
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化
     */
    public InitFaceplusResponse initFaceplusEx(InitFaceplusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.faceplus.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFaceplusResponse());
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询
     */
    public QueryFaceplusResponse queryFaceplus(QueryFaceplusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceplusEx(request, headers, runtime);
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询
     */
    public QueryFaceplusResponse queryFaceplusEx(QueryFaceplusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.faceplus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceplusResponse());
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
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.faceauth.file.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceauthFileResponse());
    }

    /**
     * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
     * Summary: 实人认证核验源服务
     */
    public CertifyServermodeResponse certifyServermode(CertifyServermodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyServermodeEx(request, headers, runtime);
    }

    /**
     * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
     * Summary: 实人认证核验源服务
     */
    public CertifyServermodeResponse certifyServermodeEx(CertifyServermodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.servermode.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyServermodeResponse());
    }

    /**
     * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 实人认证单据初始化服务
     */
    public InitCertifyrecordRealpersonResponse initCertifyrecordRealperson(InitCertifyrecordRealpersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCertifyrecordRealpersonEx(request, headers, runtime);
    }

    /**
     * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 实人认证单据初始化服务
     */
    public InitCertifyrecordRealpersonResponse initCertifyrecordRealpersonEx(InitCertifyrecordRealpersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.realperson.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCertifyrecordRealpersonResponse());
    }

    /**
     * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 认证单据初始化服务(无身份)
     */
    public InitCertifyrecordResponse initCertifyrecord(InitCertifyrecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCertifyrecordEx(request, headers, runtime);
    }

    /**
     * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 认证单据初始化服务(无身份)
     */
    public InitCertifyrecordResponse initCertifyrecordEx(InitCertifyrecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCertifyrecordResponse());
    }

    /**
     * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
     * Summary: 实人认证查询(certifyId)
     */
    public QueryCertifyrecordResponse queryCertifyrecord(QueryCertifyrecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertifyrecordEx(request, headers, runtime);
    }

    /**
     * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
     * Summary: 实人认证查询(certifyId)
     */
    public QueryCertifyrecordResponse queryCertifyrecordEx(QueryCertifyrecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertifyrecordResponse());
    }

    /**
     * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
     * Summary: OCR数据上传接口
     */
    public UploadOcrServermodeResponse uploadOcrServermode(UploadOcrServermodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadOcrServermodeEx(request, headers, runtime);
    }

    /**
     * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
     * Summary: OCR数据上传接口
     */
    public UploadOcrServermodeResponse uploadOcrServermodeEx(UploadOcrServermodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.ocr.servermode.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadOcrServermodeResponse());
    }

    /**
     * Description: 调用“计费信息查询”接口可以通过certifyId查询当次认证的计费信息，并且支持批量certifyId查询
     * Summary: 计费信息查询
     */
    public QueryCertifyrecordChargeResponse queryCertifyrecordCharge(QueryCertifyrecordChargeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertifyrecordChargeEx(request, headers, runtime);
    }

    /**
     * Description: 调用“计费信息查询”接口可以通过certifyId查询当次认证的计费信息，并且支持批量certifyId查询
     * Summary: 计费信息查询
     */
    public QueryCertifyrecordChargeResponse queryCertifyrecordChargeEx(QueryCertifyrecordChargeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.charge.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertifyrecordChargeResponse());
    }

    /**
     * Description: 调用”一键登录初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 一键登录初始化
     */
    public InitOneloginResponse initOnelogin(InitOneloginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initOneloginEx(request, headers, runtime);
    }

    /**
     * Description: 调用”一键登录初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 一键登录初始化
     */
    public InitOneloginResponse initOneloginEx(InitOneloginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.onelogin.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitOneloginResponse());
    }

    /**
     * Description: 调用“融合认证查询”接口可以通过certifyId查询一键登录/本机校验的结果
     * Summary: 融合认证查询
     */
    public QueryOneverifyResponse queryOneverify(QueryOneverifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOneverifyEx(request, headers, runtime);
    }

    /**
     * Description: 调用“融合认证查询”接口可以通过certifyId查询一键登录/本机校验的结果
     * Summary: 融合认证查询
     */
    public QueryOneverifyResponse queryOneverifyEx(QueryOneverifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.oneverify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOneverifyResponse());
    }

    /**
     * Description: 调用”本机校验初始化“接口，生成业务认证单据，返回单据号
     * Summary: 本机校验初始化
     */
    public InitOnepassResponse initOnepass(InitOnepassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initOnepassEx(request, headers, runtime);
    }

    /**
     * Description: 调用”本机校验初始化“接口，生成业务认证单据，返回单据号
     * Summary: 本机校验初始化
     */
    public InitOnepassResponse initOnepassEx(InitOnepassRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.onepass.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitOnepassResponse());
    }

    /**
     * Description: 身份信息二要素认证,通过传入的姓名,身份证号码返回认证是否一致
     * Summary: 身份信息二要素认证
     */
    public CertifyIdentitymetaServermodeResponse certifyIdentitymetaServermode(CertifyIdentitymetaServermodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyIdentitymetaServermodeEx(request, headers, runtime);
    }

    /**
     * Description: 身份信息二要素认证,通过传入的姓名,身份证号码返回认证是否一致
     * Summary: 身份信息二要素认证
     */
    public CertifyIdentitymetaServermodeResponse certifyIdentitymetaServermodeEx(CertifyIdentitymetaServermodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antfin.mpaasfaceverify.identitymeta.servermode.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyIdentitymetaServermodeResponse());
    }
}
