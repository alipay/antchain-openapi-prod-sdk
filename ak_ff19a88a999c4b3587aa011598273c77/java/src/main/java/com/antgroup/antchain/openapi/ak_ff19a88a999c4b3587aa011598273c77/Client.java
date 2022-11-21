// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models.*;
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
                    new TeaPair("sdk_version", "1.0.1"),
                    new TeaPair("_prod_code", "ak_ff19a88a999c4b3587aa011598273c77"),
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
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusDemoGatewayCheckResponse statusDemoGatewayCheck(StatusDemoGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusDemoGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusDemoGatewayCheckResponse statusDemoGatewayCheckEx(StatusDemoGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusDemoGatewayCheckResponse());
    }

    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     */
    public EchoDemoGatewayCheckResponse echoDemoGatewayCheck(EchoDemoGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.echoDemoGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     */
    public EchoDemoGatewayCheckResponse echoDemoGatewayCheckEx(EchoDemoGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.gateway.check.echo"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                EchoDemoGatewayCheckResponse echoDemoGatewayCheckResponse = EchoDemoGatewayCheckResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return echoDemoGatewayCheckResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EchoDemoGatewayCheckResponse());
    }

    /**
     * Description: ceshi
     * Summary: ss
     */
    public QueryDemoGatewayCheckResponse queryDemoGatewayCheck(QueryDemoGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: ceshi
     * Summary: ss
     */
    public QueryDemoGatewayCheckResponse queryDemoGatewayCheckEx(QueryDemoGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoGatewayCheckResponse());
    }

    /**
     * Description: s
     * Summary: ss
     */
    public BindDemoDemoCheckEeeResponse bindDemoDemoCheckEee(BindDemoDemoCheckEeeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoDemoCheckEeeEx(request, headers, runtime);
    }

    /**
     * Description: s
     * Summary: ss
     */
    public BindDemoDemoCheckEeeResponse bindDemoDemoCheckEeeEx(BindDemoDemoCheckEeeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoDemoCheckEeeResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public BindDemoGatewayAbcTestResponse bindDemoGatewayAbcTest(BindDemoGatewayAbcTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoGatewayAbcTestEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public BindDemoGatewayAbcTestResponse bindDemoGatewayAbcTestEx(BindDemoGatewayAbcTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoGatewayAbcTestResponse());
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryDemoGatewayCheckEchotimeoutResponse queryDemoGatewayCheckEchotimeout(QueryDemoGatewayCheckEchotimeoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoGatewayCheckEchotimeoutEx(request, headers, runtime);
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryDemoGatewayCheckEchotimeoutResponse queryDemoGatewayCheckEchotimeoutEx(QueryDemoGatewayCheckEchotimeoutRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoGatewayCheckEchotimeoutResponse());
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryDemoGatewayCheckEchotenResponse queryDemoGatewayCheckEchoten(QueryDemoGatewayCheckEchotenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoGatewayCheckEchotenEx(request, headers, runtime);
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryDemoGatewayCheckEchotenResponse queryDemoGatewayCheckEchotenEx(QueryDemoGatewayCheckEchotenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoGatewayCheckEchotenResponse());
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitDemoBbpInsuranceUserResponse initDemoBbpInsuranceUser(InitDemoBbpInsuranceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDemoBbpInsuranceUserEx(request, headers, runtime);
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitDemoBbpInsuranceUserResponse initDemoBbpInsuranceUserEx(InitDemoBbpInsuranceUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDemoBbpInsuranceUserResponse());
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试
     */
    public UpdateDemoCjtestCjResponse updateDemoCjtestCj(UpdateDemoCjtestCjRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDemoCjtestCjEx(request, headers, runtime);
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试
     */
    public UpdateDemoCjtestCjResponse updateDemoCjtestCjEx(UpdateDemoCjtestCjRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDemoCjtestCjResponse());
    }

    /**
     * Description: 测试api描述
     * Summary: api简介
     */
    public ResetDemoComCnCcResponse resetDemoComCnCc(ResetDemoComCnCcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetDemoComCnCcEx(request, headers, runtime);
    }

    /**
     * Description: 测试api描述
     * Summary: api简介
     */
    public ResetDemoComCnCcResponse resetDemoComCnCcEx(ResetDemoComCnCcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.com.cn.cc.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetDemoComCnCcResponse());
    }

    /**
     * Description: 文件测试
     * Summary: 文件测试
     */
    public UploadDemoCjtestSourceFileResponse uploadDemoCjtestSourceFile(UploadDemoCjtestSourceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDemoCjtestSourceFileEx(request, headers, runtime);
    }

    /**
     * Description: 文件测试
     * Summary: 文件测试
     */
    public UploadDemoCjtestSourceFileResponse uploadDemoCjtestSourceFileEx(UploadDemoCjtestSourceFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.cjtest.source.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadDemoCjtestSourceFileResponse uploadDemoCjtestSourceFileResponse = UploadDemoCjtestSourceFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadDemoCjtestSourceFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.source.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadDemoCjtestSourceFileResponse());
    }

    /**
     * Description: 测试返回值限制
     * Summary: dev测试返回值限制
     */
    public QueryDemoCjtestCjResResponse queryDemoCjtestCjRes(QueryDemoCjtestCjResRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoCjtestCjResEx(request, headers, runtime);
    }

    /**
     * Description: 测试返回值限制
     * Summary: dev测试返回值限制
     */
    public QueryDemoCjtestCjResResponse queryDemoCjtestCjResEx(QueryDemoCjtestCjResRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoCjtestCjResResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public ResetDemoCjtestApiAuthorizeResponse resetDemoCjtestApiAuthorize(ResetDemoCjtestApiAuthorizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetDemoCjtestApiAuthorizeEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public ResetDemoCjtestApiAuthorizeResponse resetDemoCjtestApiAuthorizeEx(ResetDemoCjtestApiAuthorizeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.api.authorize.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetDemoCjtestApiAuthorizeResponse());
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）
     */
    public InitDemoGatewayRoadResponse initDemoGatewayRoad(InitDemoGatewayRoadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initDemoGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）
     */
    public InitDemoGatewayRoadResponse initDemoGatewayRoadEx(InitDemoGatewayRoadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitDemoGatewayRoadResponse());
    }

    /**
     * Description: 1
     * Summary: api简介
     */
    public ImportDemoComCnTestResponse importDemoComCnTest(ImportDemoComCnTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDemoComCnTestEx(request, headers, runtime);
    }

    /**
     * Description: 1
     * Summary: api简介
     */
    public ImportDemoComCnTestResponse importDemoComCnTestEx(ImportDemoComCnTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.com.cn.test.import"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ImportDemoComCnTestResponse importDemoComCnTestResponse = ImportDemoComCnTestResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return importDemoComCnTestResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.com.cn.test.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDemoComCnTestResponse());
    }

    /**
     * Description: testc
     * Summary: 测试用api
     */
    public PublishDemoSaasTestTestcResponse publishDemoSaasTestTestc(PublishDemoSaasTestTestcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishDemoSaasTestTestcEx(request, headers, runtime);
    }

    /**
     * Description: testc
     * Summary: 测试用api
     */
    public PublishDemoSaasTestTestcResponse publishDemoSaasTestTestcEx(PublishDemoSaasTestTestcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishDemoSaasTestTestcResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public ResetDemoSaasTestTestdResponse resetDemoSaasTestTestd(ResetDemoSaasTestTestdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetDemoSaasTestTestdEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public ResetDemoSaasTestTestdResponse resetDemoSaasTestTestdEx(ResetDemoSaasTestTestdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testd.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetDemoSaasTestTestdResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public OperateDemoSaasTestTesteResponse operateDemoSaasTestTeste(OperateDemoSaasTestTesteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDemoSaasTestTesteEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public OperateDemoSaasTestTesteResponse operateDemoSaasTestTesteEx(OperateDemoSaasTestTesteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.teste.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDemoSaasTestTesteResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public BatchcreateDemoSaasTestTestfResponse batchcreateDemoSaasTestTestf(BatchcreateDemoSaasTestTestfRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateDemoSaasTestTestfEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public BatchcreateDemoSaasTestTestfResponse batchcreateDemoSaasTestTestfEx(BatchcreateDemoSaasTestTestfRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testf.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateDemoSaasTestTestfResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTesthResponse createDemoSaasTestTesth(CreateDemoSaasTestTesthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoSaasTestTesthEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTesthResponse createDemoSaasTestTesthEx(CreateDemoSaasTestTesthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoSaasTestTesthResponse());
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTestiResponse createDemoSaasTestTesti(CreateDemoSaasTestTestiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoSaasTestTestiEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试
     */
    public CreateDemoSaasTestTestiResponse createDemoSaasTestTestiEx(CreateDemoSaasTestTestiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoSaasTestTestiResponse());
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
