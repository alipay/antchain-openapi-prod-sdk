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
                    new TeaPair("sdk_version", "1.1.31"),
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
            request.fileObject = null;
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
     * Description: test
     * Summary: 自动化测试工程使用，勿删勿改
     */
    public QueryInstanceidRuleResponse queryInstanceidRule(QueryInstanceidRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInstanceidRuleEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: 自动化测试工程使用，勿删勿改
     */
    public QueryInstanceidRuleResponse queryInstanceidRuleEx(QueryInstanceidRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInstanceidRuleResponse());
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
     * Description: 流失查询测试
     * Summary: 流失查询测试
     */
    public QueryStreamTestResponse queryStreamTest(QueryStreamTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamTestEx(request, headers, runtime);
    }

    /**
     * Description: 流失查询测试
     * Summary: 流失查询测试
     */
    public QueryStreamTestResponse queryStreamTestEx(QueryStreamTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamTestResponse());
    }

    /**
     * Description: 网关性能优化测试
     * Summary: 性能优化测试
     */
    public QueryTestCatcheLimitResponse queryTestCatcheLimit(QueryTestCatcheLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestCatcheLimitEx(request, headers, runtime);
    }

    /**
     * Description: 网关性能优化测试
     * Summary: 性能优化测试
     */
    public QueryTestCatcheLimitResponse queryTestCatcheLimitEx(QueryTestCatcheLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.catche.limit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestCatcheLimitResponse());
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用
     */
    public QueryTestForLimitResponse queryTestForLimit(QueryTestForLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestForLimitEx(request, headers, runtime);
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用
     */
    public QueryTestForLimitResponse queryTestForLimitEx(QueryTestForLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.for.limit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestForLimitResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryTestTestTestResponse queryTestTestTest(QueryTestTestTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTestTestEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public QueryTestTestTestResponse queryTestTestTestEx(QueryTestTestTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.test.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTestTestResponse());
    }

    /**
     * Description: a
     * Summary: abcde
     */
    public QueryABCResponse queryABC(QueryABCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryABCEx(request, headers, runtime);
    }

    /**
     * Description: a
     * Summary: abcde
     */
    public QueryABCResponse queryABCEx(QueryABCRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.a.b.c.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryABCResponse());
    }

    /**
     * Description: 近端接口测试
     * Summary: 近端接口测试
     */
    public QueryTestEmbedUserResponse queryTestEmbedUser(QueryTestEmbedUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestEmbedUserEx(request, headers, runtime);
    }

    /**
     * Description: 近端接口测试
     * Summary: 近端接口测试
     */
    public QueryTestEmbedUserResponse queryTestEmbedUserEx(QueryTestEmbedUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.embed.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestEmbedUserResponse());
    }

    /**
     * Description: sss
     * Summary: sss
     */
    public QueryAasSaSaResponse queryAasSaSa(QueryAasSaSaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAasSaSaEx(request, headers, runtime);
    }

    /**
     * Description: sss
     * Summary: sss
     */
    public QueryAasSaSaResponse queryAasSaSaEx(QueryAasSaSaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aas.sa.sa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAasSaSaResponse());
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】
     */
    public QueryApiWhiteListResponse queryApiWhiteList(QueryApiWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiWhiteListEx(request, headers, runtime);
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】
     */
    public QueryApiWhiteListResponse queryApiWhiteListEx(QueryApiWhiteListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.api.white.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiWhiteListResponse());
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】
     */
    public QueryApiBlackListResponse queryApiBlackList(QueryApiBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiBlackListEx(request, headers, runtime);
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】
     */
    public QueryApiBlackListResponse queryApiBlackListEx(QueryApiBlackListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.api.black.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiBlackListResponse());
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问白名单测试
     */
    public QueryIpWhiteListResponse queryIpWhiteList(QueryIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpWhiteListEx(request, headers, runtime);
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问白名单测试
     */
    public QueryIpWhiteListResponse queryIpWhiteListEx(QueryIpWhiteListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ip.white.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpWhiteListResponse());
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问黑名单测试
     */
    public QueryIpBlackListResponse queryIpBlackList(QueryIpBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpBlackListEx(request, headers, runtime);
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问黑名单测试
     */
    public QueryIpBlackListResponse queryIpBlackListEx(QueryIpBlackListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ip.black.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpBlackListResponse());
    }

    /**
     * Description: 重试策略
     * Summary: 【自动化】重试策略
     */
    public QueryIpRetryResponse queryIpRetry(QueryIpRetryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpRetryEx(request, headers, runtime);
    }

    /**
     * Description: 重试策略
     * Summary: 【自动化】重试策略
     */
    public QueryIpRetryResponse queryIpRetryEx(QueryIpRetryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ip.retry.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpRetryResponse());
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试
     */
    public QueryTestTimeTestaResponse queryTestTimeTesta(QueryTestTimeTestaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTimeTestaEx(request, headers, runtime);
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试
     */
    public QueryTestTimeTestaResponse queryTestTimeTestaEx(QueryTestTimeTestaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.time.testa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTimeTestaResponse());
    }

    /**
     * Description: 流式处理
     * Summary: 流式处理
     */
    public QueryStreamTestmethodResponse queryStreamTestmethod(QueryStreamTestmethodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamTestmethodEx(request, headers, runtime);
    }

    /**
     * Description: 流式处理
     * Summary: 流式处理
     */
    public QueryStreamTestmethodResponse queryStreamTestmethodEx(QueryStreamTestmethodRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.testmethod.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamTestmethodResponse());
    }

    /**
     * Description: 模拟下游超时情况
     * Summary: 流式超时测试接口
     */
    public QueryStreamTimeoutResponse queryStreamTimeout(QueryStreamTimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamTimeoutEx(request, headers, runtime);
    }

    /**
     * Description: 模拟下游超时情况
     * Summary: 流式超时测试接口
     */
    public QueryStreamTimeoutResponse queryStreamTimeoutEx(QueryStreamTimeoutRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.timeout.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamTimeoutResponse());
    }

    /**
     * Description: 模拟下游返回非json的情况
     * Summary: 流式下游返回非json
     */
    public QueryStreamNonjsonResponse queryStreamNonjson(QueryStreamNonjsonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamNonjsonEx(request, headers, runtime);
    }

    /**
     * Description: 模拟下游返回非json的情况
     * Summary: 流式下游返回非json
     */
    public QueryStreamNonjsonResponse queryStreamNonjsonEx(QueryStreamNonjsonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.nonjson.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamNonjsonResponse());
    }

    /**
     * Description: 流式出参包含特殊字符
     * Summary: 流式出参包含特殊字符
     */
    public QueryStreamSpecialCharactersResponse queryStreamSpecialCharacters(QueryStreamSpecialCharactersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamSpecialCharactersEx(request, headers, runtime);
    }

    /**
     * Description: 流式出参包含特殊字符
     * Summary: 流式出参包含特殊字符
     */
    public QueryStreamSpecialCharactersResponse queryStreamSpecialCharactersEx(QueryStreamSpecialCharactersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.special.characters.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamSpecialCharactersResponse());
    }

    /**
     * Description: 非流式返回
     * Summary: 非流式返回
     */
    public QueryStreamNonstreamResponse queryStreamNonstream(QueryStreamNonstreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStreamNonstreamEx(request, headers, runtime);
    }

    /**
     * Description: 非流式返回
     * Summary: 非流式返回
     */
    public QueryStreamNonstreamResponse queryStreamNonstreamEx(QueryStreamNonstreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.stream.nonstream.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStreamNonstreamResponse());
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
     * Description: 压测接口4，用于压测
     * Summary: 压测接口4
     */
    public QueryLoadtestTimeFourResponse queryLoadtestTimeFour(QueryLoadtestTimeFourRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeFourEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口4，用于压测
     * Summary: 压测接口4
     */
    public QueryLoadtestTimeFourResponse queryLoadtestTimeFourEx(QueryLoadtestTimeFourRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.four.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeFourResponse());
    }

    /**
     * Description: 压测接口5，用于压测
     * Summary: 压测接口5
     */
    public QueryLoadtestTimeFiveResponse queryLoadtestTimeFive(QueryLoadtestTimeFiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoadtestTimeFiveEx(request, headers, runtime);
    }

    /**
     * Description: 压测接口5，用于压测
     * Summary: 压测接口5
     */
    public QueryLoadtestTimeFiveResponse queryLoadtestTimeFiveEx(QueryLoadtestTimeFiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.loadtest.time.five.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoadtestTimeFiveResponse());
    }

    /**
     * Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测
     */
    public CheckAicoguardcoreAicoguardrailsQuestionResponse checkAicoguardcoreAicoguardrailsQuestion(CheckAicoguardcoreAicoguardrailsQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAicoguardcoreAicoguardrailsQuestionEx(request, headers, runtime);
    }

    /**
     * Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测
     */
    public CheckAicoguardcoreAicoguardrailsQuestionResponse checkAicoguardcoreAicoguardrailsQuestionEx(CheckAicoguardcoreAicoguardrailsQuestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aicoguardcore.aicoguardrails.question.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAicoguardcoreAicoguardrailsQuestionResponse());
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试
     */
    public QueryTestTimeMenhuResponse queryTestTimeMenhu(QueryTestTimeMenhuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTimeMenhuEx(request, headers, runtime);
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试
     */
    public QueryTestTimeMenhuResponse queryTestTimeMenhuEx(QueryTestTimeMenhuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.time.menhu.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTimeMenhuResponse());
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
