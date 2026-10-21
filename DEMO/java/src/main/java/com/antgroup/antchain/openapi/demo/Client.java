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
                    new TeaPair("sdk_version", "2.0.2"),
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
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public StabilizeTestTestResponse stabilizeTestTest(StabilizeTestTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stabilizeTestTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public StabilizeTestTestResponse stabilizeTestTestEx(StabilizeTestTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.test.stabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StabilizeTestTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: a_a_a
     * Summary: a_a_a</p>
     */
    public AsdasAsdaAsdaResponse asdasAsdaAsda(AsdasAsdaAsdaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.asdasAsdaAsdaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: a_a_a
     * Summary: a_a_a</p>
     */
    public AsdasAsdaAsdaResponse asdasAsdaAsdaEx(AsdasAsdaAsdaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.asda.asda.asdas", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AsdasAsdaAsdaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: testcase
     * Summary: testcase</p>
     */
    public ACreateStructResponse aCreateStruct(ACreateStructRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aCreateStructEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: testcase
     * Summary: testcase</p>
     */
    public ACreateStructResponse aCreateStructEx(ACreateStructRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.create.struct.a", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ACreateStructResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态</p>
     */
    public StatusGatewayCheckResponse statusGatewayCheck(StatusGatewayCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusGatewayCheckEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态</p>
     */
    public StatusGatewayCheckResponse statusGatewayCheckEx(StatusGatewayCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusGatewayCheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1</p>
     */
    public EchoGatewayCheckResponse echoGatewayCheck(EchoGatewayCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.echoGatewayCheckEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1</p>
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
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EchoGatewayCheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aaa
     * Summary: aaa</p>
     */
    public QueryGatewayMyResponse queryGatewayMy(QueryGatewayMyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayMyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aaa
     * Summary: aaa</p>
     */
    public QueryGatewayMyResponse queryGatewayMyEx(QueryGatewayMyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.my.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayMyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 超时测试
     * Summary: 自动化运行态测试使用【勿动！】</p>
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeout(QueryGatewayCheckEchotimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotimeoutEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 超时测试
     * Summary: 自动化运行态测试使用【勿动！】</p>
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeoutEx(QueryGatewayCheckEchotimeoutRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 10  测测aa
     * Summary: 10s</p>
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchoten(QueryGatewayCheckEchotenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 10  测测aa
     * Summary: 10s</p>
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchotenEx(QueryGatewayCheckEchotenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 简介简介简介s
     * Summary: 简介简介简介s</p>
     */
    public QueryAdAsdAsdResponse queryAdAsdAsd(QueryAdAsdAsdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAdAsdAsdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 简介简介简介s
     * Summary: 简介简介简介s</p>
     */
    public QueryAdAsdAsdResponse queryAdAsdAsdEx(QueryAdAsdAsdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAdAsdAsdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）</p>
     */
    public InitGatewayRoadResponse initGatewayRoad(InitGatewayRoadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initGatewayRoadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）</p>
     */
    public InitGatewayRoadResponse initGatewayRoadEx(InitGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitGatewayRoadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）</p>
     */
    public QueryGatewayEmbedResponse queryGatewayEmbed(QueryGatewayEmbedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayEmbedEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）</p>
     */
    public QueryGatewayEmbedResponse queryGatewayEmbedEx(QueryGatewayEmbedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.embed.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayEmbedResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）</p>
     */
    public UpdateGatewayRoadResponse updateGatewayRoad(UpdateGatewayRoadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayRoadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）</p>
     */
    public UpdateGatewayRoadResponse updateGatewayRoadEx(UpdateGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGatewayRoadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）</p>
     */
    public QueryGatewayRoadResponse queryGatewayRoad(QueryGatewayRoadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayRoadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）</p>
     */
    public QueryGatewayRoadResponse queryGatewayRoadEx(QueryGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayRoadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）</p>
     */
    public ExecGatewayRoadResponse execGatewayRoad(ExecGatewayRoadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execGatewayRoadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）</p>
     */
    public ExecGatewayRoadResponse execGatewayRoadEx(ExecGatewayRoadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.road.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecGatewayRoadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口3
     * Summary: 压测接口3</p>
     */
    public QueryLoadtestTimeThreeResponse queryLoadtestTimeThree(QueryLoadtestTimeThreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeThreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口3
     * Summary: 压测接口3</p>
     */
    public QueryLoadtestTimeThreeResponse queryLoadtestTimeThreeEx(QueryLoadtestTimeThreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.three.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeThreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: 自动化测试工程使用，勿删勿改</p>
     */
    public QueryInstanceidRuleResponse queryInstanceidRule(QueryInstanceidRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInstanceidRuleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: 自动化测试工程使用，勿删勿改</p>
     */
    public QueryInstanceidRuleResponse queryInstanceidRuleEx(QueryInstanceidRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInstanceidRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设置下游耗时
     * Summary: 自动化运行态使用【勿动！】</p>
     */
    public QueryGatewayCheckEchotimeoutokResponse queryGatewayCheckEchotimeoutok(QueryGatewayCheckEchotimeoutokRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotimeoutokEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设置下游耗时
     * Summary: 自动化运行态使用【勿动！】</p>
     */
    public QueryGatewayCheckEchotimeoutokResponse queryGatewayCheckEchotimeoutokEx(QueryGatewayCheckEchotimeoutokRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echotimeoutok.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutokResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 双百&amp;门户&amp;网关，停服决策测试使用
     * Summary: 商业化规则测试</p>
     */
    public MatchBusinessAndInstanceResponse matchBusinessAndInstance(MatchBusinessAndInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchBusinessAndInstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 双百&amp;门户&amp;网关，停服决策测试使用
     * Summary: 商业化规则测试</p>
     */
    public MatchBusinessAndInstanceResponse matchBusinessAndInstanceEx(MatchBusinessAndInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.and.instance.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchBusinessAndInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流失查询测试
     * Summary: 流失查询测试</p>
     */
    public QueryStreamTestResponse queryStreamTest(QueryStreamTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流失查询测试
     * Summary: 流失查询测试</p>
     */
    public QueryStreamTestResponse queryStreamTestEx(QueryStreamTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 网关性能优化测试
     * Summary: 性能优化测试</p>
     */
    public QueryTestCatcheLimitResponse queryTestCatcheLimit(QueryTestCatcheLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestCatcheLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 网关性能优化测试
     * Summary: 性能优化测试</p>
     */
    public QueryTestCatcheLimitResponse queryTestCatcheLimitEx(QueryTestCatcheLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.catche.limit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestCatcheLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryTestForLimitResponse queryTestForLimit(QueryTestForLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestForLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryTestForLimitResponse queryTestForLimitEx(QueryTestForLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.for.limit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestForLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryTestTestTestResponse queryTestTestTest(QueryTestTestTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTestTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryTestTestTestResponse queryTestTestTestEx(QueryTestTestTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.test.test.test.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                QueryTestTestTestResponse queryTestTestTestResponse = QueryTestTestTestResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryTestTestTestResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.test.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTestTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: a123
     * Summary: a123</p>
     */
    public QueryABCResponse queryABC(QueryABCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryABCEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: a123
     * Summary: a123</p>
     */
    public QueryABCResponse queryABCEx(QueryABCRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.a.b.c.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryABCResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 近端接口测试
     * Summary: 近端接口测试</p>
     */
    public QueryTestEmbedUserResponse queryTestEmbedUser(QueryTestEmbedUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestEmbedUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 近端接口测试
     * Summary: 近端接口测试</p>
     */
    public QueryTestEmbedUserResponse queryTestEmbedUserEx(QueryTestEmbedUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.embed.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestEmbedUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: sss
     * Summary: sss</p>
     */
    public QueryAasSaSaResponse queryAasSaSa(QueryAasSaSaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAasSaSaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: sss
     * Summary: sss</p>
     */
    public QueryAasSaSaResponse queryAasSaSaEx(QueryAasSaSaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aas.sa.sa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAasSaSaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】</p>
     */
    public QueryApiWhiteListResponse queryApiWhiteList(QueryApiWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiWhiteListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】</p>
     */
    public QueryApiWhiteListResponse queryApiWhiteListEx(QueryApiWhiteListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.api.white.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】</p>
     */
    public QueryApiBlackListResponse queryApiBlackList(QueryApiBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiBlackListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】</p>
     */
    public QueryApiBlackListResponse queryApiBlackListEx(QueryApiBlackListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.api.black.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiBlackListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ip访问白名单测试
     * Summary: 【自动化】ip访问白名单测试</p>
     */
    public QueryIpWhiteListResponse queryIpWhiteList(QueryIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpWhiteListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ip访问白名单测试
     * Summary: 【自动化】ip访问白名单测试</p>
     */
    public QueryIpWhiteListResponse queryIpWhiteListEx(QueryIpWhiteListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ip.white.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ip访问白名单测试
     * Summary: ip访问白名单测试</p>
     */
    public QueryIpBlackListResponse queryIpBlackList(QueryIpBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpBlackListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ip访问白名单测试
     * Summary: ip访问白名单测试</p>
     */
    public QueryIpBlackListResponse queryIpBlackListEx(QueryIpBlackListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ip.black.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpBlackListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试策略
     * Summary: 重试策略</p>
     */
    public QueryIpRetryResponse queryIpRetry(QueryIpRetryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpRetryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试策略
     * Summary: 重试策略</p>
     */
    public QueryIpRetryResponse queryIpRetryEx(QueryIpRetryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ip.retry.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpRetryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试</p>
     */
    public QueryTestTimeTestaResponse queryTestTimeTesta(QueryTestTimeTestaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTimeTestaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试</p>
     */
    public QueryTestTimeTestaResponse queryTestTimeTestaEx(QueryTestTimeTestaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.time.testa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTimeTestaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: oas 测试使用
     * Summary: oas 测试使用</p>
     */
    public QueryOasRestResponse queryOasRest(QueryOasRestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOasRestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: oas 测试使用
     * Summary: oas 测试使用</p>
     */
    public QueryOasRestResponse queryOasRestEx(QueryOasRestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.oas.rest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOasRestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypeResponse queryTestContentType(QueryTestContentTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestContentTypeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypeResponse queryTestContentTypeEx(QueryTestContentTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.content.type.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestContentTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试contentType
     * Summary: 自动化测试contentType</p>
     */
    public QueryTestContentTypeoneResponse queryTestContentTypeone(QueryTestContentTypeoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestContentTypeoneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试contentType
     * Summary: 自动化测试contentType</p>
     */
    public QueryTestContentTypeoneResponse queryTestContentTypeoneEx(QueryTestContentTypeoneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.content.typeone.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestContentTypeoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypetwoResponse queryTestContentTypetwo(QueryTestContentTypetwoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestContentTypetwoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypetwoResponse queryTestContentTypetwoEx(QueryTestContentTypetwoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.content.typetwo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestContentTypetwoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypethreeResponse queryTestContentTypethree(QueryTestContentTypethreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestContentTypethreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypethreeResponse queryTestContentTypethreeEx(QueryTestContentTypethreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.content.typethree.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestContentTypethreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypefourResponse queryTestContentTypefour(QueryTestContentTypefourRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestContentTypefourEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypefourResponse queryTestContentTypefourEx(QueryTestContentTypefourRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.content.typefour.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestContentTypefourResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypefiveResponse queryTestContentTypefive(QueryTestContentTypefiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestContentTypefiveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试</p>
     */
    public QueryTestContentTypefiveResponse queryTestContentTypefiveEx(QueryTestContentTypefiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.content.typefive.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestContentTypefiveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 金融场景风险分析
     * Summary: 金融场景风险分析</p>
     */
    public QueryAgentFinancialRiskResponse queryAgentFinancialRisk(QueryAgentFinancialRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAgentFinancialRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 金融场景风险分析
     * Summary: 金融场景风险分析</p>
     */
    public QueryAgentFinancialRiskResponse queryAgentFinancialRiskEx(QueryAgentFinancialRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.agent.financial.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAgentFinancialRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化文件上传
     * Summary: 自动化文件上传【勿动！】</p>
     */
    public UploadAutoTestFileResponse uploadAutoTestFile(UploadAutoTestFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAutoTestFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化文件上传
     * Summary: 自动化文件上传【勿动！】</p>
     */
    public UploadAutoTestFileResponse uploadAutoTestFileEx(UploadAutoTestFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.auto.test.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                UploadAutoTestFileResponse uploadAutoTestFileResponse = UploadAutoTestFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadAutoTestFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.auto.test.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadAutoTestFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: stream200 test
     * Summary: stream200 test</p>
     */
    public QueryStreamTestmethodtwoResponse queryStreamTestmethodtwo(QueryStreamTestmethodtwoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamTestmethodtwoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: stream200 test
     * Summary: stream200 test</p>
     */
    public QueryStreamTestmethodtwoResponse queryStreamTestmethodtwoEx(QueryStreamTestmethodtwoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.testmethodtwo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamTestmethodtwoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryTestHfResponse queryTestHf(QueryTestHfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestHfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryTestHfResponse queryTestHfEx(QueryTestHfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.hf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestHfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aa
     * Summary: aa</p>
     */
    public TestGroupResponse testGroup(TestGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testGroupEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aa
     * Summary: aa</p>
     */
    public TestGroupResponse testGroupEx(TestGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.group.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试用
     * Summary: 测试用</p>
     */
    public QueryAaaMultiCccResponse queryAaaMultiCcc(QueryAaaMultiCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaMultiCccEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试用
     * Summary: 测试用</p>
     */
    public QueryAaaMultiCccResponse queryAaaMultiCccEx(QueryAaaMultiCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.multi.ccc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaMultiCccResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryTestJltestResponse queryTestJltest(QueryTestJltestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestJltestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryTestJltestResponse queryTestJltestEx(QueryTestJltestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.jltest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestJltestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderxResponse createBusinessOrderx(CreateBusinessOrderxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderxResponse createBusinessOrderxEx(CreateBusinessOrderxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderx.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzResponse createBusinessOrderz(CreateBusinessOrderzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzResponse createBusinessOrderzEx(CreateBusinessOrderzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderyResponse createBusinessOrdery(CreateBusinessOrderyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderyResponse createBusinessOrderyEx(CreateBusinessOrderyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.ordery.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单N
     * Summary: 创建订单N</p>
     */
    public CreateBusinessOrdernResponse createBusinessOrdern(CreateBusinessOrdernRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrdernEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单N
     * Summary: 创建订单N</p>
     */
    public CreateBusinessOrdernResponse createBusinessOrdernEx(CreateBusinessOrdernRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.ordern.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrdernResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderaaResponse createBusinessOrderaa(CreateBusinessOrderaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderaaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderaaResponse createBusinessOrderaaEx(CreateBusinessOrderaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderaa.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderaaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderqResponse createBusinessOrderq(CreateBusinessOrderqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderqResponse createBusinessOrderqEx(CreateBusinessOrderqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderq.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderbResponse createBusinessOrderb(CreateBusinessOrderbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderbResponse createBusinessOrderbEx(CreateBusinessOrderbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderb.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public TestTestApiResponse testTestApi(TestTestApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testTestApiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public TestTestApiResponse testTestApiEx(TestTestApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.api.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestTestApiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrdercResponse createBusinessOrderc(CreateBusinessOrdercRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrdercEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrdercResponse createBusinessOrdercEx(CreateBusinessOrdercRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrdercResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderdResponse createBusinessOrderd(CreateBusinessOrderdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderdResponse createBusinessOrderdEx(CreateBusinessOrderdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderd.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryTestTestjlResponse queryTestTestjl(QueryTestTestjlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTestjlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: test
     * Summary: test</p>
     */
    public QueryTestTestjlResponse queryTestTestjlEx(QueryTestTestjlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.testjl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTestjlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderppResponse createBusinessOrderpp(CreateBusinessOrderppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderppEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderppResponse createBusinessOrderppEx(CreateBusinessOrderppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderpp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderppResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderxxxResponse createBusinessOrderxxx(CreateBusinessOrderxxxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderxxxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderxxxResponse createBusinessOrderxxxEx(CreateBusinessOrderxxxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderxxx.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderxxxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderResponse createBusinessOrder(CreateBusinessOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderResponse createBusinessOrderEx(CreateBusinessOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzzzResponse createBusinessOrderzzz(CreateBusinessOrderzzzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderzzzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzzzResponse createBusinessOrderzzzEx(CreateBusinessOrderzzzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderzzz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderzzzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixaCliCreateResponse apixaCliCreate(ApixaCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apixaCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixaCliCreateResponse apixaCliCreateEx(ApixaCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cli.create.apixa", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApixaCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixbCliCreateResponse apixbCliCreate(ApixbCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apixbCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApixbCliCreateResponse apixbCliCreateEx(ApixbCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cli.create.apixb", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApixbCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApizCliCreateResponse apizCliCreate(ApizCliCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apizCliCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: cli创建测试接口A
     * Summary: cli创建测试接口A</p>
     */
    public ApizCliCreateResponse apizCliCreateEx(ApizCliCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cli.create.apiz", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApizCliCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzzResponse createBusinessOrderzz(CreateBusinessOrderzzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessOrderzzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateBusinessOrderzzResponse createBusinessOrderzzEx(CreateBusinessOrderzzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderzz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessOrderzzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流式处理
     * Summary: 流式处理</p>
     */
    public QueryStreamTestmethodResponse queryStreamTestmethod(QueryStreamTestmethodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamTestmethodEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流式处理
     * Summary: 流式处理</p>
     */
    public QueryStreamTestmethodResponse queryStreamTestmethodEx(QueryStreamTestmethodRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.testmethod.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamTestmethodResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 模拟下游超时情况
     * Summary: 流式超时测试接口</p>
     */
    public QueryStreamTimeoutResponse queryStreamTimeout(QueryStreamTimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamTimeoutEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 模拟下游超时情况
     * Summary: 流式超时测试接口</p>
     */
    public QueryStreamTimeoutResponse queryStreamTimeoutEx(QueryStreamTimeoutRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.timeout.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamTimeoutResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 模拟下游返回非json的情况
     * Summary: 流式下游返回非json</p>
     */
    public QueryStreamNonjsonResponse queryStreamNonjson(QueryStreamNonjsonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamNonjsonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 模拟下游返回非json的情况
     * Summary: 流式下游返回非json</p>
     */
    public QueryStreamNonjsonResponse queryStreamNonjsonEx(QueryStreamNonjsonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.nonjson.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamNonjsonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流式出参包含特殊字符
     * Summary: 流式出参包含特殊字符</p>
     */
    public QueryStreamSpecialCharactersResponse queryStreamSpecialCharacters(QueryStreamSpecialCharactersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamSpecialCharactersEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流式出参包含特殊字符
     * Summary: 流式出参包含特殊字符</p>
     */
    public QueryStreamSpecialCharactersResponse queryStreamSpecialCharactersEx(QueryStreamSpecialCharactersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.special.characters.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamSpecialCharactersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 非流式返回
     * Summary: 非流式返回</p>
     */
    public QueryStreamNonstreamResponse queryStreamNonstream(QueryStreamNonstreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamNonstreamEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 非流式返回
     * Summary: 非流式返回</p>
     */
    public QueryStreamNonstreamResponse queryStreamNonstreamEx(QueryStreamNonstreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.nonstream.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamNonstreamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口1
     * Summary: 压测接口1</p>
     */
    public QueryLoadtestTimeOneResponse queryLoadtestTimeOne(QueryLoadtestTimeOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口1
     * Summary: 压测接口1</p>
     */
    public QueryLoadtestTimeOneResponse queryLoadtestTimeOneEx(QueryLoadtestTimeOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.one.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口2
     * Summary: 压测接口2</p>
     */
    public QueryLoadtestTimeTwoResponse queryLoadtestTimeTwo(QueryLoadtestTimeTwoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeTwoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口2
     * Summary: 压测接口2</p>
     */
    public QueryLoadtestTimeTwoResponse queryLoadtestTimeTwoEx(QueryLoadtestTimeTwoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.two.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeTwoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口4，用于压测
     * Summary: 压测接口4</p>
     */
    public QueryLoadtestTimeFourResponse queryLoadtestTimeFour(QueryLoadtestTimeFourRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeFourEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口4，用于压测
     * Summary: 压测接口4</p>
     */
    public QueryLoadtestTimeFourResponse queryLoadtestTimeFourEx(QueryLoadtestTimeFourRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.four.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeFourResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口5，用于压测
     * Summary: 压测接口5，用于压测</p>
     */
    public QueryLoadtestTimeFiveResponse queryLoadtestTimeFive(QueryLoadtestTimeFiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeFiveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口5，用于压测
     * Summary: 压测接口5，用于压测</p>
     */
    public QueryLoadtestTimeFiveResponse queryLoadtestTimeFiveEx(QueryLoadtestTimeFiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.five.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeFiveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: s
     * Summary: s</p>
     */
    public QueryTtUseResponse queryTtUse(QueryTtUseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTtUseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: s
     * Summary: s</p>
     */
    public QueryTtUseResponse queryTtUseEx(QueryTtUseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.tt.use.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTtUseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: x
     * Summary: x</p>
     */
    public QueryUtListResponse queryUtList(QueryUtListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUtListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: x
     * Summary: x</p>
     */
    public QueryUtListResponse queryUtListEx(QueryUtListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ut.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUtListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: sss1
     * Summary: sss1</p>
     */
    public ErfvQwsxWedcResponse erfvQwsxWedc(ErfvQwsxWedcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.erfvQwsxWedcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: sss1
     * Summary: sss1</p>
     */
    public ErfvQwsxWedcResponse erfvQwsxWedcEx(ErfvQwsxWedcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.qwsx.wedc.erfv", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ErfvQwsxWedcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: q_q
     * Summary: q_q</p>
     */
    public SdsAaaAasResponse sdsAaaAas(SdsAaaAasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sdsAaaAasEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: q_q
     * Summary: q_q</p>
     */
    public SdsAaaAasResponse sdsAaaAasEx(SdsAaaAasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.aas.sds", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SdsAaaAasResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测</p>
     */
    public CheckAicoguardcoreAicoguardrailsQuestionResponse checkAicoguardcoreAicoguardrailsQuestion(CheckAicoguardcoreAicoguardrailsQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAicoguardcoreAicoguardrailsQuestionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测</p>
     */
    public CheckAicoguardcoreAicoguardrailsQuestionResponse checkAicoguardcoreAicoguardrailsQuestionEx(CheckAicoguardcoreAicoguardrailsQuestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aicoguardcore.aicoguardrails.question.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAicoguardcoreAicoguardrailsQuestionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试</p>
     */
    public QueryTestTimeMenhuResponse queryTestTimeMenhu(QueryTestTimeMenhuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTimeMenhuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试</p>
     */
    public QueryTestTimeMenhuResponse queryTestTimeMenhuEx(QueryTestTimeMenhuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.time.menhu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTimeMenhuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindAaaBbbCccResponse bindAaaBbbCcc(BindAaaBbbCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除</p>
     */
    public BindAaaBbbCccResponse bindAaaBbbCccEx(BindAaaBbbCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCccResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建111
     * Summary: 自动化测试创建111</p>
     */
    public QueryAaaBbbCccResponse queryAaaBbbCcc(QueryAaaBbbCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建111
     * Summary: 自动化测试创建111</p>
     */
    public QueryAaaBbbCccResponse queryAaaBbbCccEx(QueryAaaBbbCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaBbbCccResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动</p>
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbc(QueryAbcAbcAbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbcAbcAbcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动</p>
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbcEx(QueryAbcAbcAbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbcAbcAbcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 123</p>
     */
    public BindAaaBbbCcdResponse bindAaaBbbCcd(BindAaaBbbCcdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCcdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 123</p>
     */
    public BindAaaBbbCcdResponse bindAaaBbbCcdEx(BindAaaBbbCcdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccd.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCcdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: 测试</p>
     */
    public QueryReWResponse queryReW(QueryReWRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryReWEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: 测试</p>
     */
    public QueryReWResponse queryReWEx(QueryReWRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.re.w.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryReWResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 232
     * Summary: 232</p>
     */
    public QueryCimTestResponse queryCimTest(QueryCimTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCimTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 232
     * Summary: 232</p>
     */
    public QueryCimTestResponse queryCimTestEx(QueryCimTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.cim.test.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                QueryCimTestResponse queryCimTestResponse = QueryCimTestResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryCimTestResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.cim.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCimTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 123</p>
     */
    public PushTxtSfResponse pushTxtSf(PushTxtSfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushTxtSfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 123</p>
     */
    public PushTxtSfResponse pushTxtSfEx(PushTxtSfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.txt.sf.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushTxtSfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 123</p>
     */
    public QueryUserTestResponse queryUserTest(QueryUserTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 123
     * Summary: 123</p>
     */
    public QueryUserTestResponse queryUserTestEx(QueryUserTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.user.test.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                QueryUserTestResponse queryUserTestResponse = QueryUserTestResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryUserTestResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.user.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: test</p>
     */
    public QueryAutoTestResponse queryAutoTest(QueryAutoTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAutoTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试
     * Summary: test</p>
     */
    public QueryAutoTestResponse queryAutoTestEx(QueryAutoTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.auto.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAutoTestResponse());
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
