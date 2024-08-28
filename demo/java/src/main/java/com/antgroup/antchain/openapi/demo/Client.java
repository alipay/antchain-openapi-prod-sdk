// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.demo.models.*;

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
     * Init client with Config
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
     * Encapsulate the request and invoke the network
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
                    new TeaPair("sdk_version", "1.1.1"),
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
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusGatewayCheckResponse statusGatewayCheck(StatusGatewayCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusGatewayCheckResponse statusGatewayCheckEx(StatusGatewayCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusGatewayCheckResponse());
    }

    /**
     * Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1
     */
    public EchoGatewayCheckResponse echoGatewayCheck(EchoGatewayCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.echoGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1
     */
    public EchoGatewayCheckResponse echoGatewayCheckEx(EchoGatewayCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * Description: aaa
     * Summary: 测试demo
     */
    public QueryGatewayMyResponse queryGatewayMy(QueryGatewayMyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayMyEx(request, headers, runtime);
    }

    /**
     * Description: aaa
     * Summary: 测试demo
     */
    public QueryGatewayMyResponse queryGatewayMyEx(QueryGatewayMyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.my.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayMyResponse());
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeout(QueryGatewayCheckEchotimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotimeoutEx(request, headers, runtime);
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeoutEx(QueryGatewayCheckEchotimeoutRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutResponse());
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchoten(QueryGatewayCheckEchotenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotenEx(request, headers, runtime);
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchotenEx(QueryGatewayCheckEchotenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotenResponse());
    }

    /**
     * Description: 简介简介简介s
     * Summary: 简介简介
     */
    public QueryAdAsdAsdResponse queryAdAsdAsd(QueryAdAsdAsdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAdAsdAsdEx(request, headers, runtime);
    }

    /**
     * Description: 简介简介简介s
     * Summary: 简介简介
     */
    public QueryAdAsdAsdResponse queryAdAsdAsdEx(QueryAdAsdAsdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAdAsdAsdResponse());
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试
     */
    public UpdateCjtestCjResponse updateCjtestCj(UpdateCjtestCjRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCjtestCjEx(request, headers, runtime);
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试
     */
    public UpdateCjtestCjResponse updateCjtestCjEx(UpdateCjtestCjRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCjtestCjResponse());
    }

    /**
     * Description: 文件测试1
     * Summary: 文件测试
     */
    public UploadCjtestSourceFileResponse uploadCjtestSourceFile(UploadCjtestSourceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCjtestSourceFileEx(request, headers, runtime);
    }

    /**
     * Description: 文件测试1
     * Summary: 文件测试
     */
    public UploadCjtestSourceFileResponse uploadCjtestSourceFileEx(UploadCjtestSourceFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）
     */
    public InitGatewayRoadResponse initGatewayRoadEx(InitGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitGatewayRoadResponse());
    }

    /**
     * Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）
     */
    public QueryGatewayEmbedResponse queryGatewayEmbed(QueryGatewayEmbedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayEmbedEx(request, headers, runtime);
    }

    /**
     * Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）
     */
    public QueryGatewayEmbedResponse queryGatewayEmbedEx(QueryGatewayEmbedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.embed.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayEmbedResponse());
    }

    /**
     * Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）
     */
    public UpdateGatewayRoadResponse updateGatewayRoad(UpdateGatewayRoadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）
     */
    public UpdateGatewayRoadResponse updateGatewayRoadEx(UpdateGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGatewayRoadResponse());
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public InitCjtestAcopmResResponse initCjtestAcopmRes(InitCjtestAcopmResRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCjtestAcopmResEx(request, headers, runtime);
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public InitCjtestAcopmResResponse initCjtestAcopmResEx(InitCjtestAcopmResRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.acopm.res.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCjtestAcopmResResponse());
    }

    /**
     * Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）
     */
    public QueryGatewayRoadResponse queryGatewayRoad(QueryGatewayRoadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）
     */
    public QueryGatewayRoadResponse queryGatewayRoadEx(QueryGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayRoadResponse());
    }

    /**
     * Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）
     */
    public ExecGatewayRoadResponse execGatewayRoad(ExecGatewayRoadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execGatewayRoadEx(request, headers, runtime);
    }

    /**
     * Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）
     */
    public ExecGatewayRoadResponse execGatewayRoadEx(ExecGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecGatewayRoadResponse());
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3
     */
    public QueryLoadtestTimeThreeResponse queryLoadtestTimeThree(QueryLoadtestTimeThreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeThreeEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3
     */
    public QueryLoadtestTimeThreeResponse queryLoadtestTimeThreeEx(QueryLoadtestTimeThreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.three.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeThreeResponse());
    }

    /**
     * Description: 测试自动生成回归测试代码
     * Summary: 测试自动生成回归测试代码
     */
    public CreateAutoTestCodeResponse createAutoTestCode(CreateAutoTestCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutoTestCodeEx(request, headers, runtime);
    }

    /**
     * Description: 测试自动生成回归测试代码
     * Summary: 测试自动生成回归测试代码
     */
    public CreateAutoTestCodeResponse createAutoTestCodeEx(CreateAutoTestCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.auto.test.code.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAutoTestCodeResponse());
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public QueryDemoAbcAbcResponse queryDemoAbcAbc(QueryDemoAbcAbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoAbcAbcEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public QueryDemoAbcAbcResponse queryDemoAbcAbcEx(QueryDemoAbcAbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.abc.abc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoAbcAbcResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryXxxxTestxAaaResponse queryXxxxTestxAaa(QueryXxxxTestxAaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryXxxxTestxAaaEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryXxxxTestxAaaResponse queryXxxxTestxAaaEx(QueryXxxxTestxAaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.xxxx.testx.aaa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryXxxxTestxAaaResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryTestTestaTestaResponse queryTestTestaTesta(QueryTestTestaTestaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTestaTestaEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryTestTestaTestaResponse queryTestTestaTestaEx(QueryTestTestaTestaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.testa.testa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTestaTestaResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryInstanceidRuleResponse queryInstanceidRule(QueryInstanceidRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInstanceidRuleEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryInstanceidRuleResponse queryInstanceidRuleEx(QueryInstanceidRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInstanceidRuleResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryBusinessTestResponse queryBusinessTest(QueryBusinessTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessTestEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryBusinessTestResponse queryBusinessTestEx(QueryBusinessTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessTestResponse());
    }

    /**
     * Description: 设置下游耗时
     * Summary: 超时（加密）
     */
    public QueryGatewayCheckEchotimeoutokResponse queryGatewayCheckEchotimeoutok(QueryGatewayCheckEchotimeoutokRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotimeoutokEx(request, headers, runtime);
    }

    /**
     * Description: 设置下游耗时
     * Summary: 超时（加密）
     */
    public QueryGatewayCheckEchotimeoutokResponse queryGatewayCheckEchotimeoutokEx(QueryGatewayCheckEchotimeoutokRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echotimeoutok.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutokResponse());
    }

    /**
     * Description: 测试使用
     * Summary: testuse1
     */
    public QueryBusinessCodeTestResponse queryBusinessCodeTest(QueryBusinessCodeTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessCodeTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试使用
     * Summary: testuse1
     */
    public QueryBusinessCodeTestResponse queryBusinessCodeTestEx(QueryBusinessCodeTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.code.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessCodeTestResponse());
    }

    /**
     * Description: 双百&门户&网关，停服决策测试使用
     * Summary: 商业化规则测试
     */
    public MatchBusinessAndInstanceResponse matchBusinessAndInstance(MatchBusinessAndInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchBusinessAndInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 双百&门户&网关，停服决策测试使用
     * Summary: 商业化规则测试
     */
    public MatchBusinessAndInstanceResponse matchBusinessAndInstanceEx(MatchBusinessAndInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.and.instance.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchBusinessAndInstanceResponse());
    }

    /**
     * Description: 研发自测使用API
     * Summary: 研发自测使用API
     */
    public QueryDevelopTestUseResponse queryDevelopTestUse(QueryDevelopTestUseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDevelopTestUseEx(request, headers, runtime);
    }

    /**
     * Description: 研发自测使用API
     * Summary: 研发自测使用API
     */
    public QueryDevelopTestUseResponse queryDevelopTestUseEx(QueryDevelopTestUseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.develop.test.use.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDevelopTestUseResponse());
    }

    /**
     * Description: 资损防控研发自测使用API
     * Summary: 研发自测使用API
     */
    public VerifyDevelopTestTestResponse verifyDevelopTestTest(VerifyDevelopTestTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDevelopTestTestEx(request, headers, runtime);
    }

    /**
     * Description: 资损防控研发自测使用API
     * Summary: 研发自测使用API
     */
    public VerifyDevelopTestTestResponse verifyDevelopTestTestEx(VerifyDevelopTestTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.develop.test.test.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyDevelopTestTestResponse());
    }

    /**
     * Description: 用于测试预发环境RDS切OB之后的同步功能
     * Summary: 预发RDS切OB测试
     */
    public ImportPreObWriteResponse importPreObWrite(ImportPreObWriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importPreObWriteEx(request, headers, runtime);
    }

    /**
     * Description: 用于测试预发环境RDS切OB之后的同步功能
     * Summary: 预发RDS切OB测试
     */
    public ImportPreObWriteResponse importPreObWriteEx(ImportPreObWriteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.pre.ob.write.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportPreObWriteResponse());
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitBbpInsuranceUserResponse initBbpInsuranceUser(InitBbpInsuranceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initBbpInsuranceUserEx(request, headers, runtime);
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitBbpInsuranceUserResponse initBbpInsuranceUserEx(InitBbpInsuranceUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitBbpInsuranceUserResponse());
    }

    /**
     * Description: 用于上海非金生产环境的同步测试
     * Summary: 上海非金生产环境测试
     */
    public OperateShanghaiPreTestResponse operateShanghaiPreTest(OperateShanghaiPreTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateShanghaiPreTestEx(request, headers, runtime);
    }

    /**
     * Description: 用于上海非金生产环境的同步测试
     * Summary: 上海非金生产环境测试
     */
    public OperateShanghaiPreTestResponse operateShanghaiPreTestEx(OperateShanghaiPreTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.shanghai.pre.test.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateShanghaiPreTestResponse());
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public QueryCjtestCjResResponse queryCjtestCjRes(QueryCjtestCjResRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCjtestCjResEx(request, headers, runtime);
    }

    /**
     * Description: cj test
     * Summary: cj test1
     */
    public QueryCjtestCjResResponse queryCjtestCjResEx(QueryCjtestCjResRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCjtestCjResResponse());
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1
     */
    public QueryLoadtestTimeOneResponse queryLoadtestTimeOne(QueryLoadtestTimeOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeOneEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1
     */
    public QueryLoadtestTimeOneResponse queryLoadtestTimeOneEx(QueryLoadtestTimeOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.one.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeOneResponse());
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2
     */
    public QueryLoadtestTimeTwoResponse queryLoadtestTimeTwo(QueryLoadtestTimeTwoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeTwoEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2
     */
    public QueryLoadtestTimeTwoResponse queryLoadtestTimeTwoEx(QueryLoadtestTimeTwoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.two.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeTwoResponse());
    }

    /**
     * Description: 测试使用1
     * Summary: 测试创建
     */
    public QueryTestGatewayTestResponse queryTestGatewayTest(QueryTestGatewayTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestGatewayTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试使用1
     * Summary: 测试创建
     */
    public QueryTestGatewayTestResponse queryTestGatewayTestEx(QueryTestGatewayTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestGatewayTestResponse());
    }

    /**
     * Description: 测试
     * Summary: 测试ato异常
     */
    public QueryAcopmAtoWithholdResponse queryAcopmAtoWithhold(QueryAcopmAtoWithholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAcopmAtoWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 测试
     * Summary: 测试ato异常
     */
    public QueryAcopmAtoWithholdResponse queryAcopmAtoWithholdEx(QueryAcopmAtoWithholdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.acopm.ato.withhold.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAcopmAtoWithholdResponse());
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryApdevcenterTestobjectTestsubResponse queryApdevcenterTestobjectTestsub(QueryApdevcenterTestobjectTestsubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApdevcenterTestobjectTestsubEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryApdevcenterTestobjectTestsubResponse queryApdevcenterTestobjectTestsubEx(QueryApdevcenterTestobjectTestsubRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.apdevcenter.testobject.testsub.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApdevcenterTestobjectTestsubResponse());
    }

    /**
     * Description: testtest
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryApdevcenterTestobjectTestsubaResponse queryApdevcenterTestobjectTestsuba(QueryApdevcenterTestobjectTestsubaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApdevcenterTestobjectTestsubaEx(request, headers, runtime);
    }

    /**
     * Description: testtest
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryApdevcenterTestobjectTestsubaResponse queryApdevcenterTestobjectTestsubaEx(QueryApdevcenterTestobjectTestsubaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.apdevcenter.testobject.testsuba.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApdevcenterTestobjectTestsubaResponse());
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryTestFilesystemFileinfoResponse queryTestFilesystemFileinfo(QueryTestFilesystemFileinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestFilesystemFileinfoEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryTestFilesystemFileinfoResponse queryTestFilesystemFileinfoEx(QueryTestFilesystemFileinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.filesystem.fileinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestFilesystemFileinfoResponse());
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryTestproductTestobjectTestsubaaaResponse queryTestproductTestobjectTestsubaaa(QueryTestproductTestobjectTestsubaaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestproductTestobjectTestsubaaaEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用)
     */
    public QueryTestproductTestobjectTestsubaaaResponse queryTestproductTestobjectTestsubaaaEx(QueryTestproductTestobjectTestsubaaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.testproduct.testobject.testsubaaa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestproductTestobjectTestsubaaaResponse());
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费
     */
    public RegisterTestBizeventMessageResponse registerTestBizeventMessage(RegisterTestBizeventMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerTestBizeventMessageEx(request, headers, runtime);
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费
     */
    public RegisterTestBizeventMessageResponse registerTestBizeventMessageEx(RegisterTestBizeventMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterTestBizeventMessageResponse());
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1
     */
    public BindAaaBbbCccResponse bindAaaBbbCcc(BindAaaBbbCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1
     */
    public BindAaaBbbCccResponse bindAaaBbbCccEx(BindAaaBbbCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCccResponse());
    }

    /**
     * Description: 自动化测试创建111
     * Summary: 自动化测试创建（勿动）
     */
    public QueryAaaBbbCccResponse queryAaaBbbCcc(QueryAaaBbbCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建111
     * Summary: 自动化测试创建（勿动）
     */
    public QueryAaaBbbCccResponse queryAaaBbbCccEx(QueryAaaBbbCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaBbbCccResponse());
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbc(QueryAbcAbcAbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbcAbcAbcEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbcEx(QueryAbcAbcAbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbcAbcAbcResponse());
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public BindAaaBbbCcdResponse bindAaaBbbCcd(BindAaaBbbCcdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCcdEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 测试用api
     */
    public BindAaaBbbCcdResponse bindAaaBbbCcdEx(BindAaaBbbCcdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccd.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCcdResponse());
    }

    /**
     * Description: 用于测试自动化脚本自动生成的功能
     * Summary: 自动生成自动化脚本测试
     */
    public CreateAutoGenerateCodeResponse createAutoGenerateCode(CreateAutoGenerateCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutoGenerateCodeEx(request, headers, runtime);
    }

    /**
     * Description: 用于测试自动化脚本自动生成的功能
     * Summary: 自动生成自动化脚本测试
     */
    public CreateAutoGenerateCodeResponse createAutoGenerateCodeEx(CreateAutoGenerateCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.auto.generate.code.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAutoGenerateCodeResponse());
    }

    /**
     * Description: 用于测试预发环境ob数据同步
     * Summary: 用于测试ob数据同步
     */
    public QueryPreTestUseResponse queryPreTestUse(QueryPreTestUseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPreTestUseEx(request, headers, runtime);
    }

    /**
     * Description: 用于测试预发环境ob数据同步
     * Summary: 用于测试ob数据同步
     */
    public QueryPreTestUseResponse queryPreTestUseEx(QueryPreTestUseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.pre.test.use.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPreTestUseResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
