// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.demo.models.*;
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
                    new TeaPair("sdk_version", "1.0.231"),
                    new TeaPair("_prod_code", "DEMO"),
                    new TeaPair("_prod_channel", "undefined")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "centre-openapi.antchain.antgroup.com")),
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
     * Description: 123
     * Summary: 123
     */
    public BindQweQweResponse bindQweQwe(BindQweQweRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindQweQweEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 123
     */
    public BindQweQweResponse bindQweQweEx(BindQweQweRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.qwe.qwe.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindQweQweResponse());
    }

    /**
     * Description: sdf
     * Summary: sdf
     */
    public BindSdfSssSssResponse bindSdfSssSss(BindSdfSssSssRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindSdfSssSssEx(request, headers, runtime);
    }

    /**
     * Description: sdf
     * Summary: sdf
     */
    public BindSdfSssSssResponse bindSdfSssSssEx(BindSdfSssSssRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindSdfSssSssResponse());
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusGatewayCheckResponse statusGatewayCheck(StatusGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusGatewayCheckResponse statusGatewayCheckEx(StatusGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusGatewayCheckResponse());
    }

    /**
     * Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1
     */
    public EchoGatewayCheckResponse echoGatewayCheck(EchoGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.echoGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1
     */
    public EchoGatewayCheckResponse echoGatewayCheckEx(EchoGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.gateway.check.echo"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                EchoGatewayCheckResponse echoGatewayCheckResponse = EchoGatewayCheckResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return echoGatewayCheckResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EchoGatewayCheckResponse());
    }

    /**
     * Description: ceshi
     * Summary: ss
     */
    public QueryGatewayCheckResponse queryGatewayCheck(QueryGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: ceshi
     * Summary: ss
     */
    public QueryGatewayCheckResponse queryGatewayCheckEx(QueryGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckResponse());
    }

    /**
     * Description: 测试用aaa
     * Summary: 测试001
     */
    public QueryGatewayTestResponse queryGatewayTest(QueryGatewayTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试用aaa
     * Summary: 测试001
     */
    public QueryGatewayTestResponse queryGatewayTestEx(QueryGatewayTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayTestResponse());
    }

    /**
     * Description: aaa
     * Summary: 测试demo
     */
    public QueryGatewayMyResponse queryGatewayMy(QueryGatewayMyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayMyEx(request, headers, runtime);
    }

    /**
     * Description: aaa
     * Summary: 测试demo
     */
    public QueryGatewayMyResponse queryGatewayMyEx(QueryGatewayMyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.my.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayMyResponse());
    }

    /**
     * Description: s
     * Summary: ss
     */
    public BindDemoCheckEeeResponse bindDemoCheckEee(BindDemoCheckEeeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoCheckEeeEx(request, headers, runtime);
    }

    /**
     * Description: s
     * Summary: ss
     */
    public BindDemoCheckEeeResponse bindDemoCheckEeeEx(BindDemoCheckEeeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoCheckEeeResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public BindGatewayAbcTestResponse bindGatewayAbcTest(BindGatewayAbcTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindGatewayAbcTestEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public BindGatewayAbcTestResponse bindGatewayAbcTestEx(BindGatewayAbcTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindGatewayAbcTestResponse());
    }

    /**
     * Description: testaaa
     * Summary: test
     */
    public BindTestTestTestResponse bindTestTestTest(BindTestTestTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindTestTestTestEx(request, headers, runtime);
    }

    /**
     * Description: testaaa
     * Summary: test
     */
    public BindTestTestTestResponse bindTestTestTestEx(BindTestTestTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.test.test.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindTestTestTestResponse());
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeout(QueryGatewayCheckEchotimeoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotimeoutEx(request, headers, runtime);
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeoutEx(QueryGatewayCheckEchotimeoutRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutResponse());
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchoten(QueryGatewayCheckEchotenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotenEx(request, headers, runtime);
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchotenEx(QueryGatewayCheckEchotenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotenResponse());
    }

    /**
     * Description: 简介简介简介s
     * Summary: 简介简介
     */
    public QueryAdAsdAsdResponse queryAdAsdAsd(QueryAdAsdAsdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAdAsdAsdEx(request, headers, runtime);
    }

    /**
     * Description: 简介简介简介s
     * Summary: 简介简介
     */
    public QueryAdAsdAsdResponse queryAdAsdAsdEx(QueryAdAsdAsdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAdAsdAsdResponse());
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试
     */
    public UpdateCjtestCjResponse updateCjtestCj(UpdateCjtestCjRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCjtestCjEx(request, headers, runtime);
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试
     */
    public UpdateCjtestCjResponse updateCjtestCjEx(UpdateCjtestCjRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCjtestCjResponse());
    }

    /**
     * Description: 文件测试1
     * Summary: 文件测试
     */
    public UploadCjtestSourceFileResponse uploadCjtestSourceFile(UploadCjtestSourceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCjtestSourceFileEx(request, headers, runtime);
    }

    /**
     * Description: 文件测试1
     * Summary: 文件测试
     */
    public UploadCjtestSourceFileResponse uploadCjtestSourceFileEx(UploadCjtestSourceFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.cjtest.source.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                UploadCjtestSourceFileResponse uploadCjtestSourceFileResponse = UploadCjtestSourceFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadCjtestSourceFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.source.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadCjtestSourceFileResponse());
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）
     */
    public InitGatewayRoadResponse initGatewayRoad(InitGatewayRoadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）
     */
    public InitGatewayRoadResponse initGatewayRoadEx(InitGatewayRoadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitGatewayRoadResponse());
    }

    /**
     * Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）
     */
    public QueryGatewayEmbedResponse queryGatewayEmbed(QueryGatewayEmbedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayEmbedEx(request, headers, runtime);
    }

    /**
     * Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）
     */
    public QueryGatewayEmbedResponse queryGatewayEmbedEx(QueryGatewayEmbedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.embed.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayEmbedResponse());
    }

    /**
     * Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）
     */
    public UpdateGatewayRoadResponse updateGatewayRoad(UpdateGatewayRoadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）
     */
    public UpdateGatewayRoadResponse updateGatewayRoadEx(UpdateGatewayRoadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGatewayRoadResponse());
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public InitCjtestAcopmResResponse initCjtestAcopmRes(InitCjtestAcopmResRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCjtestAcopmResEx(request, headers, runtime);
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public InitCjtestAcopmResResponse initCjtestAcopmResEx(InitCjtestAcopmResRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.acopm.res.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCjtestAcopmResResponse());
    }

    /**
     * Description: 测试打包
     * Summary: 测试打包
     */
    public ImportTestSdkProductResponse importTestSdkProduct(ImportTestSdkProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importTestSdkProductEx(request, headers, runtime);
    }

    /**
     * Description: 测试打包
     * Summary: 测试打包
     */
    public ImportTestSdkProductResponse importTestSdkProductEx(ImportTestSdkProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.sdk.product.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportTestSdkProductResponse());
    }

    /**
     * Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）
     */
    public QueryGatewayRoadResponse queryGatewayRoad(QueryGatewayRoadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）
     */
    public QueryGatewayRoadResponse queryGatewayRoadEx(QueryGatewayRoadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayRoadResponse());
    }

    /**
     * Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）
     */
    public ExecGatewayRoadResponse execGatewayRoad(ExecGatewayRoadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）
     */
    public ExecGatewayRoadResponse execGatewayRoadEx(ExecGatewayRoadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecGatewayRoadResponse());
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3
     */
    public QueryLoadtestTimeThreeResponse queryLoadtestTimeThree(QueryLoadtestTimeThreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeThreeEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3
     */
    public QueryLoadtestTimeThreeResponse queryLoadtestTimeThreeEx(QueryLoadtestTimeThreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.three.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeThreeResponse());
    }

    /**
     * Description: api下架测试
     * Summary: api下架测试测试状态
     */
    public QueryApiOfflineStatusResponse queryApiOfflineStatus(QueryApiOfflineStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiOfflineStatusEx(request, headers, runtime);
    }

    /**
     * Description: api下架测试
     * Summary: api下架测试测试状态
     */
    public QueryApiOfflineStatusResponse queryApiOfflineStatusEx(QueryApiOfflineStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.api.offline.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiOfflineStatusResponse());
    }

    /**
     * Description: 测试数据，可删除
     * Summary: api状态测试
     */
    public ImportDemoApistatusResponse importDemoApistatus(ImportDemoApistatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDemoApistatusEx(request, headers, runtime);
    }

    /**
     * Description: 测试数据，可删除
     * Summary: api状态测试
     */
    public ImportDemoApistatusResponse importDemoApistatusEx(ImportDemoApistatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.apistatus.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDemoApistatusResponse());
    }

    /**
     * Description: 测试自动生成回归测试代码
     * Summary: 测试自动生成回归测试代码
     */
    public CreateAutoTestCodeResponse createAutoTestCode(CreateAutoTestCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutoTestCodeEx(request, headers, runtime);
    }

    /**
     * Description: 测试自动生成回归测试代码
     * Summary: 测试自动生成回归测试代码
     */
    public CreateAutoTestCodeResponse createAutoTestCodeEx(CreateAutoTestCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.auto.test.code.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAutoTestCodeResponse());
    }

    /**
     * Description: aa
     * Summary: 测试接口
     */
    public QueryDemoLulinSuccessResponse queryDemoLulinSuccess(QueryDemoLulinSuccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoLulinSuccessEx(request, headers, runtime);
    }

    /**
     * Description: aa
     * Summary: 测试接口
     */
    public QueryDemoLulinSuccessResponse queryDemoLulinSuccessEx(QueryDemoLulinSuccessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.lulin.success.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoLulinSuccessResponse());
    }

    /**
     * Description: 11
     * Summary: 测试接口
     */
    public QueryDemoLulinccDataResponse queryDemoLulinccData(QueryDemoLulinccDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoLulinccDataEx(request, headers, runtime);
    }

    /**
     * Description: 11
     * Summary: 测试接口
     */
    public QueryDemoLulinccDataResponse queryDemoLulinccDataEx(QueryDemoLulinccDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.lulincc.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoLulinccDataResponse());
    }

    /**
     * Description: 111
     * Summary: 测试接口
     */
    public QueryDemoDefaultSdkcccResponse queryDemoDefaultSdkccc(QueryDemoDefaultSdkcccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoDefaultSdkcccEx(request, headers, runtime);
    }

    /**
     * Description: 111
     * Summary: 测试接口
     */
    public QueryDemoDefaultSdkcccResponse queryDemoDefaultSdkcccEx(QueryDemoDefaultSdkcccRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.default.sdkccc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoDefaultSdkcccResponse());
    }

    /**
     * Description: 描述
     * Summary: 测试接口
     */
    public QueryDemoDefaultSdkfffResponse queryDemoDefaultSdkfff(QueryDemoDefaultSdkfffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoDefaultSdkfffEx(request, headers, runtime);
    }

    /**
     * Description: 描述
     * Summary: 测试接口
     */
    public QueryDemoDefaultSdkfffResponse queryDemoDefaultSdkfffEx(QueryDemoDefaultSdkfffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.default.sdkfff.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoDefaultSdkfffResponse());
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public QueryDemoAbcAbcResponse queryDemoAbcAbc(QueryDemoAbcAbcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoAbcAbcEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public QueryDemoAbcAbcResponse queryDemoAbcAbcEx(QueryDemoAbcAbcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.abc.abc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoAbcAbcResponse());
    }

    /**
     * Description: 用于测试api评审接入SDL的测试使用
    测试评审。评审字段测试ACCCCC
     * Summary: api评审测试CCCC
     */
    public QueryApprovalTestResponse queryApprovalTest(QueryApprovalTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApprovalTestEx(request, headers, runtime);
    }

    /**
     * Description: 用于测试api评审接入SDL的测试使用
    测试评审。评审字段测试ACCCCC
     * Summary: api评审测试CCCC
     */
    public QueryApprovalTestResponse queryApprovalTestEx(QueryApprovalTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.approval.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApprovalTestResponse());
    }

    /**
     * Description: 在路由三板斧迭代中测试使用
     * Summary: 路由灰度测试使用API
     */
    public QueryRoutingGrayscaleTestResponse queryRoutingGrayscaleTest(QueryRoutingGrayscaleTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRoutingGrayscaleTestEx(request, headers, runtime);
    }

    /**
     * Description: 在路由三板斧迭代中测试使用
     * Summary: 路由灰度测试使用API
     */
    public QueryRoutingGrayscaleTestResponse queryRoutingGrayscaleTestEx(QueryRoutingGrayscaleTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.routing.grayscale.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRoutingGrayscaleTestResponse());
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitBbpInsuranceUserResponse initBbpInsuranceUser(InitBbpInsuranceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initBbpInsuranceUserEx(request, headers, runtime);
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitBbpInsuranceUserResponse initBbpInsuranceUserEx(InitBbpInsuranceUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitBbpInsuranceUserResponse());
    }

    /**
     * Description: 测试
     * Summary: 测试
     */
    public QueryShaofangTestResponse queryShaofangTest(QueryShaofangTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryShaofangTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试
     * Summary: 测试
     */
    public QueryShaofangTestResponse queryShaofangTestEx(QueryShaofangTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.shaofang.test.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                QueryShaofangTestResponse queryShaofangTestResponse = QueryShaofangTestResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryShaofangTestResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.shaofang.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryShaofangTestResponse());
    }

    /**
     * Description: tr测试
     * Summary: tr测试
     */
    public QueryShaofangTestTrResponse queryShaofangTestTr(QueryShaofangTestTrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryShaofangTestTrEx(request, headers, runtime);
    }

    /**
     * Description: tr测试
     * Summary: tr测试
     */
    public QueryShaofangTestTrResponse queryShaofangTestTrEx(QueryShaofangTestTrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.shaofang.test.tr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryShaofangTestTrResponse());
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api
     */
    public QueryTestTestobjectBbbResponse queryTestTestobjectBbb(QueryTestTestobjectBbbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTestobjectBbbEx(request, headers, runtime);
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api
     */
    public QueryTestTestobjectBbbResponse queryTestTestobjectBbbEx(QueryTestTestobjectBbbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTestobjectBbbResponse());
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public QueryCjtestCjResResponse queryCjtestCjRes(QueryCjtestCjResRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCjtestCjResEx(request, headers, runtime);
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public QueryCjtestCjResResponse queryCjtestCjResEx(QueryCjtestCjResRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCjtestCjResResponse());
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1
     */
    public QueryLoadtestTimeOneResponse queryLoadtestTimeOne(QueryLoadtestTimeOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeOneEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1
     */
    public QueryLoadtestTimeOneResponse queryLoadtestTimeOneEx(QueryLoadtestTimeOneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.one.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeOneResponse());
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2
     */
    public QueryLoadtestTimeTwoResponse queryLoadtestTimeTwo(QueryLoadtestTimeTwoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeTwoEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2
     */
    public QueryLoadtestTimeTwoResponse queryLoadtestTimeTwoEx(QueryLoadtestTimeTwoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.two.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeTwoResponse());
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public ResetSaasTestApiResponse resetSaasTestApi(ResetSaasTestApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetSaasTestApiEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public ResetSaasTestApiResponse resetSaasTestApiEx(ResetSaasTestApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.api.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetSaasTestApiResponse());
    }

    /**
     * Description: 测试使用1
     * Summary: 测试创建
     */
    public QueryTestGatewayTestResponse queryTestGatewayTest(QueryTestGatewayTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestGatewayTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试使用1
     * Summary: 测试创建
     */
    public QueryTestGatewayTestResponse queryTestGatewayTestEx(QueryTestGatewayTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestGatewayTestResponse());
    }

    /**
     * Description: 共享能力中心六期回归验证创建使用
     * Summary: 共享能力中心六期回归验证创建
     */
    public QueryGongxiangTestDemoResponse queryGongxiangTestDemo(QueryGongxiangTestDemoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGongxiangTestDemoEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力中心六期回归验证创建使用
     * Summary: 共享能力中心六期回归验证创建
     */
    public QueryGongxiangTestDemoResponse queryGongxiangTestDemoEx(QueryGongxiangTestDemoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gongxiang.test.demo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGongxiangTestDemoResponse());
    }

    /**
     * Description: testa
     * Summary: 测试用api
     */
    public QuerySaasTestTestaResponse querySaasTestTesta(QuerySaasTestTestaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySaasTestTestaEx(request, headers, runtime);
    }

    /**
     * Description: testa
     * Summary: 测试用api
     */
    public QuerySaasTestTestaResponse querySaasTestTestaEx(QuerySaasTestTestaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySaasTestTestaResponse());
    }

    /**
     * Description: testB
     * Summary: 测试用api
     */
    public ImportSaasTestTestbResponse importSaasTestTestb(ImportSaasTestTestbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importSaasTestTestbEx(request, headers, runtime);
    }

    /**
     * Description: testB
     * Summary: 测试用api
     */
    public ImportSaasTestTestbResponse importSaasTestTestbEx(ImportSaasTestTestbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testb.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportSaasTestTestbResponse());
    }

    /**
     * Description: testc
     * Summary: 测试用api
     */
    public PublishSaasTestTestcResponse publishSaasTestTestc(PublishSaasTestTestcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishSaasTestTestcEx(request, headers, runtime);
    }

    /**
     * Description: testc
     * Summary: 测试用api
     */
    public PublishSaasTestTestcResponse publishSaasTestTestcEx(PublishSaasTestTestcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishSaasTestTestcResponse());
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费
     */
    public RegisterTestBizeventMessageResponse registerTestBizeventMessage(RegisterTestBizeventMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerTestBizeventMessageEx(request, headers, runtime);
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费
     */
    public RegisterTestBizeventMessageResponse registerTestBizeventMessageEx(RegisterTestBizeventMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterTestBizeventMessageResponse());
    }

    /**
     * Description: 共享能力六期回归验证
     * Summary: 共享能力六期回归验证
     */
    public BindGongxaingTestResponse bindGongxaingTest(BindGongxaingTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindGongxaingTestEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力六期回归验证
     * Summary: 共享能力六期回归验证
     */
    public BindGongxaingTestResponse bindGongxaingTestEx(BindGongxaingTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gongxaing.test.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindGongxaingTestResponse());
    }

    /**
     * Description: album/api/patrol/data/queryBizInfos
     * Summary: test
     */
    public QueryPatrolStatisticBizinfosResponse queryPatrolStatisticBizinfos(QueryPatrolStatisticBizinfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPatrolStatisticBizinfosEx(request, headers, runtime);
    }

    /**
     * Description: album/api/patrol/data/queryBizInfos
     * Summary: test
     */
    public QueryPatrolStatisticBizinfosResponse queryPatrolStatisticBizinfosEx(QueryPatrolStatisticBizinfosRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.patrol.statistic.bizinfos.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPatrolStatisticBizinfosResponse());
    }

    /**
     * Description: 自动化测试创建test222
     * Summary: 自动化测试创建test1
     */
    public BindAaaBbbCccResponse bindAaaBbbCcc(BindAaaBbbCccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建test222
     * Summary: 自动化测试创建test1
     */
    public BindAaaBbbCccResponse bindAaaBbbCccEx(BindAaaBbbCccRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCccResponse());
    }

    /**
     * Description: 自动化测试创建111
     * Summary: 自动化测试创建（勿动）
     */
    public QueryAaaBbbCccResponse queryAaaBbbCcc(QueryAaaBbbCccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建111
     * Summary: 自动化测试创建（勿动）
     */
    public QueryAaaBbbCccResponse queryAaaBbbCccEx(QueryAaaBbbCccRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaBbbCccResponse());
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbc(QueryAbcAbcAbcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbcAbcAbcEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbcEx(QueryAbcAbcAbcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbcAbcAbcResponse());
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public BindAaaBbbCcdResponse bindAaaBbbCcd(BindAaaBbbCcdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCcdEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public BindAaaBbbCcdResponse bindAaaBbbCcdEx(BindAaaBbbCcdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccd.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCcdResponse());
    }

    /**
     * Description: 测试api描述
     * Summary: api简介
     */
    public ResetComCnCcResponse resetComCnCc(ResetComCnCcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetComCnCcEx(request, headers, runtime);
    }

    /**
     * Description: 测试api描述
     * Summary: api简介
     */
    public ResetComCnCcResponse resetComCnCcEx(ResetComCnCcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.com.cn.cc.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetComCnCcResponse());
    }

    /**
     * Description: 长捷,qiujianglong.qjl
     * Summary: api简介
     */
    public ImportComCnTestResponse importComCnTest(ImportComCnTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importComCnTestEx(request, headers, runtime);
    }

    /**
     * Description: 长捷,qiujianglong.qjl
     * Summary: api简介
     */
    public ImportComCnTestResponse importComCnTestEx(ImportComCnTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.com.cn.test.import"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                ImportComCnTestResponse importComCnTestResponse = ImportComCnTestResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return importComCnTestResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.com.cn.test.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportComCnTestResponse());
    }

    /**
     * Description: 测试能力中心九期API打标&能力绑定API使用
     * Summary: 能力中心九期测试
     */
    public BindCenterAbilityResponse bindCenterAbility(BindCenterAbilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindCenterAbilityEx(request, headers, runtime);
    }

    /**
     * Description: 测试能力中心九期API打标&能力绑定API使用
     * Summary: 能力中心九期测试
     */
    public BindCenterAbilityResponse bindCenterAbilityEx(BindCenterAbilityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.center.ability.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindCenterAbilityResponse());
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
