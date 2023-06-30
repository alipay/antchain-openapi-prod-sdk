// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.mytc.models.*;
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
                    new TeaPair("sdk_version", "1.6.2"),
                    new TeaPair("_prod_code", "MYTC"),
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
     * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
     * Summary: 二维码防伪识别
     */
    public RecognizeAntiQrcodeacResponse recognizeAntiQrcodeac(RecognizeAntiQrcodeacRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeAntiQrcodeacEx(request, headers, runtime);
    }

    /**
     * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
     * Summary: 二维码防伪识别
     */
    public RecognizeAntiQrcodeacResponse recognizeAntiQrcodeacEx(RecognizeAntiQrcodeacRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.mytc.anti.qrcodeac.recognize"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                RecognizeAntiQrcodeacResponse recognizeAntiQrcodeacResponse = RecognizeAntiQrcodeacResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return recognizeAntiQrcodeacResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.anti.qrcodeac.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeAntiQrcodeacResponse());
    }

    /**
     * Description: 二维码防伪图片验证
     * Summary: 二维码防伪图片验证
     */
    public CheckCodeFakeResponse checkCodeFake(CheckCodeFakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCodeFakeEx(request, headers, runtime);
    }

    /**
     * Description: 二维码防伪图片验证
     * Summary: 二维码防伪图片验证
     */
    public CheckCodeFakeResponse checkCodeFakeEx(CheckCodeFakeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.mytc.code.fake.check"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CheckCodeFakeResponse checkCodeFakeResponse = CheckCodeFakeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return checkCodeFakeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.fake.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCodeFakeResponse());
    }

    /**
     * Description: 二维码防伪防屏拍图片验证
     * Summary: 二维码防伪防屏拍图片验证
     */
    public CheckCodeFakescreenResponse checkCodeFakescreen(CheckCodeFakescreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCodeFakescreenEx(request, headers, runtime);
    }

    /**
     * Description: 二维码防伪防屏拍图片验证
     * Summary: 二维码防伪防屏拍图片验证
     */
    public CheckCodeFakescreenResponse checkCodeFakescreenEx(CheckCodeFakescreenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.mytc.code.fakescreen.check"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CheckCodeFakescreenResponse checkCodeFakescreenResponse = CheckCodeFakescreenResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return checkCodeFakescreenResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.fakescreen.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCodeFakescreenResponse());
    }

    /**
     * Description: 防伪文件上传API
     * Summary: 防伪文件上传API
     */
    public UploadAntiFileResponse uploadAntiFile(UploadAntiFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntiFileEx(request, headers, runtime);
    }

    /**
     * Description: 防伪文件上传API
     * Summary: 防伪文件上传API
     */
    public UploadAntiFileResponse uploadAntiFileEx(UploadAntiFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.mytc.anti.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadAntiFileResponse uploadAntiFileResponse = UploadAntiFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadAntiFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.anti.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntiFileResponse());
    }

    /**
     * Description: 开放产品管理中心
     * Summary: 二维码防伪防屏拍图片验证，非文件上传
     */
    public JudgeCodeFakescreenResponse judgeCodeFakescreen(JudgeCodeFakescreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.judgeCodeFakescreenEx(request, headers, runtime);
    }

    /**
     * Description: 开放产品管理中心
     * Summary: 二维码防伪防屏拍图片验证，非文件上传
     */
    public JudgeCodeFakescreenResponse judgeCodeFakescreenEx(JudgeCodeFakescreenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.fakescreen.judge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new JudgeCodeFakescreenResponse());
    }

    /**
     * Description: 防伪码平台防伪底图上传，初始化上传记录
     * Summary: 防伪码平台防伪底图上传初始化
     */
    public InitAntiImagesyncResponse initAntiImagesync(InitAntiImagesyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initAntiImagesyncEx(request, headers, runtime);
    }

    /**
     * Description: 防伪码平台防伪底图上传，初始化上传记录
     * Summary: 防伪码平台防伪底图上传初始化
     */
    public InitAntiImagesyncResponse initAntiImagesyncEx(InitAntiImagesyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.anti.imagesync.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitAntiImagesyncResponse());
    }

    /**
     * Description: 防伪码图片上传
     * Summary: 防伪码平台防伪码图片上传
     */
    public UploadAntiImagesyncResponse uploadAntiImagesync(UploadAntiImagesyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAntiImagesyncEx(request, headers, runtime);
    }

    /**
     * Description: 防伪码图片上传
     * Summary: 防伪码平台防伪码图片上传
     */
    public UploadAntiImagesyncResponse uploadAntiImagesyncEx(UploadAntiImagesyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.mytc.anti.imagesync.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadAntiImagesyncResponse uploadAntiImagesyncResponse = UploadAntiImagesyncResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadAntiImagesyncResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.anti.imagesync.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAntiImagesyncResponse());
    }

    /**
     * Description: 防伪码平台防伪底图上传完成
     * Summary: 防伪码平台防伪底图上传完成
     */
    public FinishAntiImagesyncResponse finishAntiImagesync(FinishAntiImagesyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishAntiImagesyncEx(request, headers, runtime);
    }

    /**
     * Description: 防伪码平台防伪底图上传完成
     * Summary: 防伪码平台防伪底图上传完成
     */
    public FinishAntiImagesyncResponse finishAntiImagesyncEx(FinishAntiImagesyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.anti.imagesync.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishAntiImagesyncResponse());
    }

    /**
     * Description: 自研二维码生成
     * Summary: 二维码防伪图片生成
     */
    public CreateAntiQrcodeimageResponse createAntiQrcodeimage(CreateAntiQrcodeimageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntiQrcodeimageEx(request, headers, runtime);
    }

    /**
     * Description: 自研二维码生成
     * Summary: 二维码防伪图片生成
     */
    public CreateAntiQrcodeimageResponse createAntiQrcodeimageEx(CreateAntiQrcodeimageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.anti.qrcodeimage.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntiQrcodeimageResponse());
    }

    /**
     * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
    主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码注册
     */
    public CreateCodeRegistrationResponse createCodeRegistration(CreateCodeRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCodeRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
    主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码注册
     */
    public CreateCodeRegistrationResponse createCodeRegistrationEx(CreateCodeRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.registration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCodeRegistrationResponse());
    }

    /**
     * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
     * Summary: 溯源码注册记录删除
     */
    public DeleteCodeRegistrationResponse deleteCodeRegistration(DeleteCodeRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCodeRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
     * Summary: 溯源码注册记录删除
     */
    public DeleteCodeRegistrationResponse deleteCodeRegistrationEx(DeleteCodeRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.registration.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCodeRegistrationResponse());
    }

    /**
     * Description: 将关联信息绑定到溯源码上。
    该接口调用存在以下业务维度限制：
    1. code + bizLables + bizType做唯一性判断。
    
    
     * Summary: 溯源码关联信息
     */
    public CreateCodeRelationResponse createCodeRelation(CreateCodeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCodeRelationEx(request, headers, runtime);
    }

    /**
     * Description: 将关联信息绑定到溯源码上。
    该接口调用存在以下业务维度限制：
    1. code + bizLables + bizType做唯一性判断。
    
    
     * Summary: 溯源码关联信息
     */
    public CreateCodeRelationResponse createCodeRelationEx(CreateCodeRelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.relation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCodeRelationResponse());
    }

    /**
     * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
    若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
     * Summary: 溯源码关联信息删除
     */
    public DeleteCodeRelationResponse deleteCodeRelation(DeleteCodeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCodeRelationEx(request, headers, runtime);
    }

    /**
     * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
    若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
     * Summary: 溯源码关联信息删除
     */
    public DeleteCodeRelationResponse deleteCodeRelationEx(DeleteCodeRelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.relation.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteCodeRelationResponse());
    }

    /**
     * Description: 查询当前账户下的溯源码信息。
    会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
    
     * Summary: 溯源码查询
     */
    public QueryCodeCombineResponse queryCodeCombine(QueryCodeCombineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCodeCombineEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前账户下的溯源码信息。
    会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
    
     * Summary: 溯源码查询
     */
    public QueryCodeCombineResponse queryCodeCombineEx(QueryCodeCombineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.combine.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCodeCombineResponse());
    }

    /**
     * Description: 溯源码注册历史查询
     * Summary: 溯源码注册历史查询
     */
    public QueryCodeRegistrationResponse queryCodeRegistration(QueryCodeRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCodeRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 溯源码注册历史查询
     * Summary: 溯源码注册历史查询
     */
    public QueryCodeRegistrationResponse queryCodeRegistrationEx(QueryCodeRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.registration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCodeRegistrationResponse());
    }

    /**
     * Description: 溯源码关联历史信息查询
     * Summary: 溯源码关联历史信息查询
     */
    public QueryCodeRelationResponse queryCodeRelation(QueryCodeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCodeRelationEx(request, headers, runtime);
    }

    /**
     * Description: 溯源码关联历史信息查询
     * Summary: 溯源码关联历史信息查询
     */
    public QueryCodeRelationResponse queryCodeRelationEx(QueryCodeRelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.relation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCodeRelationResponse());
    }

    /**
     * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
    2. 存证内容超过链上限制仅会将存证内容hash值上链。
     * Summary: 原生存证
     */
    public AddCodeDepositResponse addCodeDeposit(AddCodeDepositRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCodeDepositEx(request, headers, runtime);
    }

    /**
     * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
    2. 存证内容超过链上限制仅会将存证内容hash值上链。
     * Summary: 原生存证
     */
    public AddCodeDepositResponse addCodeDepositEx(AddCodeDepositRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.deposit.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCodeDepositResponse());
    }

    /**
     * Description: 链上交易详情查询
     * Summary: 链上交易证书查询
     */
    public QueryCodeCertResponse queryCodeCert(QueryCodeCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCodeCertEx(request, headers, runtime);
    }

    /**
     * Description: 链上交易详情查询
     * Summary: 链上交易证书查询
     */
    public QueryCodeCertResponse queryCodeCertEx(QueryCodeCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCodeCertResponse());
    }

    /**
     * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
    若填写starTime和endTime，统计时间范围不能超过7天。
     * Summary: 溯源统计信息查询
     */
    public QueryCodeStatResponse queryCodeStat(QueryCodeStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCodeStatEx(request, headers, runtime);
    }

    /**
     * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
    若填写starTime和endTime，统计时间范围不能超过7天。
     * Summary: 溯源统计信息查询
     */
    public QueryCodeStatResponse queryCodeStatEx(QueryCodeStatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.stat.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCodeStatResponse());
    }

    /**
     * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码(可重复)注册
     */
    public AddCodeRegistrationResponse addCodeRegistration(AddCodeRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCodeRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码(可重复)注册
     */
    public AddCodeRegistrationResponse addCodeRegistrationEx(AddCodeRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.registration.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCodeRegistrationResponse());
    }

    /**
     * Description: 更新已注册的溯源信息
     * Summary: 溯源注册信息更新
     */
    public UpdateCodeRegistrationResponse updateCodeRegistration(UpdateCodeRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCodeRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 更新已注册的溯源信息
     * Summary: 溯源注册信息更新
     */
    public UpdateCodeRegistrationResponse updateCodeRegistrationEx(UpdateCodeRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.registration.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCodeRegistrationResponse());
    }

    /**
     * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
     * Summary: 溯源码(可重复)关联信息
     */
    public AddCodeRelationResponse addCodeRelation(AddCodeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCodeRelationEx(request, headers, runtime);
    }

    /**
     * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
     * Summary: 溯源码(可重复)关联信息
     */
    public AddCodeRelationResponse addCodeRelationEx(AddCodeRelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.relation.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCodeRelationResponse());
    }

    /**
     * Description: 更新绑定到溯源码上的关联信息。
     * Summary: 溯源码关联信息更新
     */
    public UpdateCodeRelationResponse updateCodeRelation(UpdateCodeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCodeRelationEx(request, headers, runtime);
    }

    /**
     * Description: 更新绑定到溯源码上的关联信息。
     * Summary: 溯源码关联信息更新
     */
    public UpdateCodeRelationResponse updateCodeRelationEx(UpdateCodeRelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.code.relation.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCodeRelationResponse());
    }

    /**
     * Description: 溯源码详情查询
     * Summary: 溯源码详情查询
     */
    public QueryMiniCodeResponse queryMiniCode(QueryMiniCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMiniCodeEx(request, headers, runtime);
    }

    /**
     * Description: 溯源码详情查询
     * Summary: 溯源码详情查询
     */
    public QueryMiniCodeResponse queryMiniCodeEx(QueryMiniCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.mini.code.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMiniCodeResponse());
    }

    /**
     * Description: 溯源证书查询
     * Summary: 溯源证书查询
     */
    public QueryMiniCertResponse queryMiniCert(QueryMiniCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMiniCertEx(request, headers, runtime);
    }

    /**
     * Description: 溯源证书查询
     * Summary: 溯源证书查询
     */
    public QueryMiniCertResponse queryMiniCertEx(QueryMiniCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.mini.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMiniCertResponse());
    }

    /**
     * Description: 动态秘钥NFC二维码校验
     * Summary: 动态秘钥NFC二维码校验
     */
    public VerifyMiniNfcResponse verifyMiniNfc(VerifyMiniNfcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyMiniNfcEx(request, headers, runtime);
    }

    /**
     * Description: 动态秘钥NFC二维码校验
     * Summary: 动态秘钥NFC二维码校验
     */
    public VerifyMiniNfcResponse verifyMiniNfcEx(VerifyMiniNfcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.mytc.mini.nfc.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyMiniNfcResponse());
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
