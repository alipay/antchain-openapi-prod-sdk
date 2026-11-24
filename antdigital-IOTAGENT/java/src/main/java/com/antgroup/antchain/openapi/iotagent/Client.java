// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.iotagent.models.*;

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
                    new TeaPair("sdk_version", "1.5.0"),
                    new TeaPair("_prod_code", "IOTAGENT"),
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
     * <p>Description: 查询租户下的userid
     * Summary: 查询租户下的userid</p>
     */
    public QueryBlockchainBotIotagentUseridsResponse queryBlockchainBotIotagentUserids(QueryBlockchainBotIotagentUseridsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentUseridsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户下的userid
     * Summary: 查询租户下的userid</p>
     */
    public QueryBlockchainBotIotagentUseridsResponse queryBlockchainBotIotagentUseridsEx(QueryBlockchainBotIotagentUseridsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.userids.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentUseridsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试用
     * Summary: 测试用</p>
     */
    public TestBlockchainBotIotagentPluginResponse testBlockchainBotIotagentPlugin(TestBlockchainBotIotagentPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testBlockchainBotIotagentPluginEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试用
     * Summary: 测试用</p>
     */
    public TestBlockchainBotIotagentPluginResponse testBlockchainBotIotagentPluginEx(TestBlockchainBotIotagentPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "blockchain.bot.iotagent.plugin.test"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                TestBlockchainBotIotagentPluginResponse testBlockchainBotIotagentPluginResponse = TestBlockchainBotIotagentPluginResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return testBlockchainBotIotagentPluginResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.plugin.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestBlockchainBotIotagentPluginResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取智能体信息
     * Summary: 获取智能体信息</p>
     */
    public QueryBlockchainBotIoaAgentResponse queryBlockchainBotIoaAgent(QueryBlockchainBotIoaAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIoaAgentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取智能体信息
     * Summary: 获取智能体信息</p>
     */
    public QueryBlockchainBotIoaAgentResponse queryBlockchainBotIoaAgentEx(QueryBlockchainBotIoaAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.ioa.agent.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIoaAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新智能体信息
     * Summary: 更新智能体信息</p>
     */
    public SaveBlockchainBotIoaAgentResponse saveBlockchainBotIoaAgent(SaveBlockchainBotIoaAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBlockchainBotIoaAgentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新智能体信息
     * Summary: 更新智能体信息</p>
     */
    public SaveBlockchainBotIoaAgentResponse saveBlockchainBotIoaAgentEx(SaveBlockchainBotIoaAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.ioa.agent.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBlockchainBotIoaAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户可选的模板列表详情
     * Summary: 查询用户可选的模板列表详情</p>
     */
    public QueryBlockchainBotIoaTemplatesResponse queryBlockchainBotIoaTemplates(QueryBlockchainBotIoaTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIoaTemplatesEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户可选的模板列表详情
     * Summary: 查询用户可选的模板列表详情</p>
     */
    public QueryBlockchainBotIoaTemplatesResponse queryBlockchainBotIoaTemplatesEx(QueryBlockchainBotIoaTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.ioa.templates.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIoaTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询聊天记录
     * Summary: 查询聊天记录</p>
     */
    public QueryBlockchainBotAgentchatHistoryResponse queryBlockchainBotAgentchatHistory(QueryBlockchainBotAgentchatHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotAgentchatHistoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询聊天记录
     * Summary: 查询聊天记录</p>
     */
    public QueryBlockchainBotAgentchatHistoryResponse queryBlockchainBotAgentchatHistoryEx(QueryBlockchainBotAgentchatHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.agentchat.history.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotAgentchatHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询 Session 列表
     * Summary: 查询 Session 列表</p>
     */
    public QueryBlockchainBotAgentSessionsResponse queryBlockchainBotAgentSessions(QueryBlockchainBotAgentSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotAgentSessionsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询 Session 列表
     * Summary: 查询 Session 列表</p>
     */
    public QueryBlockchainBotAgentSessionsResponse queryBlockchainBotAgentSessionsEx(QueryBlockchainBotAgentSessionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.agent.sessions.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotAgentSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询ai设备可用状态
     * Summary: 查询ai设备可用状态</p>
     */
    public QueryBlockchainBotIotagentAideviceResponse queryBlockchainBotIotagentAidevice(QueryBlockchainBotIotagentAideviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentAideviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询ai设备可用状态
     * Summary: 查询ai设备可用状态</p>
     */
    public QueryBlockchainBotIotagentAideviceResponse queryBlockchainBotIotagentAideviceEx(QueryBlockchainBotIotagentAideviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.aidevice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentAideviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型上报数据时间范围
     * Summary: 查询物模型上报数据时间范围</p>
     */
    public QueryBlockchainBotIotagentThingmodelrangeResponse queryBlockchainBotIotagentThingmodelrange(QueryBlockchainBotIotagentThingmodelrangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentThingmodelrangeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型上报数据时间范围
     * Summary: 查询物模型上报数据时间范围</p>
     */
    public QueryBlockchainBotIotagentThingmodelrangeResponse queryBlockchainBotIotagentThingmodelrangeEx(QueryBlockchainBotIotagentThingmodelrangeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.thingmodelrange.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentThingmodelrangeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型上报数据
     * Summary: 查询物模型上报数据</p>
     */
    public QueryBlockchainBotIotagentThingmodeldataResponse queryBlockchainBotIotagentThingmodeldata(QueryBlockchainBotIotagentThingmodeldataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentThingmodeldataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型上报数据
     * Summary: 查询物模型上报数据</p>
     */
    public QueryBlockchainBotIotagentThingmodeldataResponse queryBlockchainBotIotagentThingmodeldataEx(QueryBlockchainBotIotagentThingmodeldataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.thingmodeldata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentThingmodeldataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT智能体插件签约URL获取接口
     * Summary: IoT智能体插件签约URL获取接口</p>
     */
    public GetsignurlBlockchainBotIotagentPlugincontractResponse getsignurlBlockchainBotIotagentPlugincontract(GetsignurlBlockchainBotIotagentPlugincontractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getsignurlBlockchainBotIotagentPlugincontractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT智能体插件签约URL获取接口
     * Summary: IoT智能体插件签约URL获取接口</p>
     */
    public GetsignurlBlockchainBotIotagentPlugincontractResponse getsignurlBlockchainBotIotagentPlugincontractEx(GetsignurlBlockchainBotIotagentPlugincontractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.plugincontract.getsignurl", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetsignurlBlockchainBotIotagentPlugincontractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT智能体插件签约查询接口
     * Summary: IoT智能体插件签约查询接口</p>
     */
    public QueryBlockchainBotIotagentPlugincontractResponse queryBlockchainBotIotagentPlugincontract(QueryBlockchainBotIotagentPlugincontractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentPlugincontractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT智能体插件签约查询接口
     * Summary: IoT智能体插件签约查询接口</p>
     */
    public QueryBlockchainBotIotagentPlugincontractResponse queryBlockchainBotIotagentPlugincontractEx(QueryBlockchainBotIotagentPlugincontractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.plugincontract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentPlugincontractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据tenant获取tenant下的userId
     * Summary: 根据tenant获取tenant下的userId</p>
     */
    public QueryBlockchainBotIotagentUseridResponse queryBlockchainBotIotagentUserid(QueryBlockchainBotIotagentUseridRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentUseridEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据tenant获取tenant下的userId
     * Summary: 根据tenant获取tenant下的userId</p>
     */
    public QueryBlockchainBotIotagentUseridResponse queryBlockchainBotIotagentUseridEx(QueryBlockchainBotIotagentUseridRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.userid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentUseridResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据tenant获取featureId
     * Summary: 根据tenant获取featureId</p>
     */
    public QueryBlockchainBotIotagentFeatureResponse queryBlockchainBotIotagentFeature(QueryBlockchainBotIotagentFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentFeatureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据tenant获取featureId
     * Summary: 根据tenant获取featureId</p>
     */
    public QueryBlockchainBotIotagentFeatureResponse queryBlockchainBotIotagentFeatureEx(QueryBlockchainBotIotagentFeatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.feature.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentFeatureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体创建
     * Summary: 智能体创建</p>
     */
    public CreateBlockchainBotIotagentAgentResponse createBlockchainBotIotagentAgent(CreateBlockchainBotIotagentAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotIotagentAgentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体创建
     * Summary: 智能体创建</p>
     */
    public CreateBlockchainBotIotagentAgentResponse createBlockchainBotIotagentAgentEx(CreateBlockchainBotIotagentAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.agent.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotIotagentAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体更新
     * Summary: 智能体更新</p>
     */
    public UpdateBlockchainBotIotagentAgentResponse updateBlockchainBotIotagentAgent(UpdateBlockchainBotIotagentAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockchainBotIotagentAgentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体更新
     * Summary: 智能体更新</p>
     */
    public UpdateBlockchainBotIotagentAgentResponse updateBlockchainBotIotagentAgentEx(UpdateBlockchainBotIotagentAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.agent.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockchainBotIotagentAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体删除
     * Summary: 智能体删除</p>
     */
    public DeleteBlockchainBotIotagentAgentResponse deleteBlockchainBotIotagentAgent(DeleteBlockchainBotIotagentAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBotIotagentAgentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体删除
     * Summary: 智能体删除</p>
     */
    public DeleteBlockchainBotIotagentAgentResponse deleteBlockchainBotIotagentAgentEx(DeleteBlockchainBotIotagentAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.agent.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBotIotagentAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体列表
     * Summary: 智能体列表</p>
     */
    public ListBlockchainBotIotagentAgentResponse listBlockchainBotIotagentAgent(ListBlockchainBotIotagentAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotagentAgentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体列表
     * Summary: 智能体列表</p>
     */
    public ListBlockchainBotIotagentAgentResponse listBlockchainBotIotagentAgentEx(ListBlockchainBotIotagentAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.agent.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotagentAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体团队创建
     * Summary: 智能体团队创建</p>
     */
    public CreateBlockchainBotIotagentAgentteamResponse createBlockchainBotIotagentAgentteam(CreateBlockchainBotIotagentAgentteamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotIotagentAgentteamEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体团队创建
     * Summary: 智能体团队创建</p>
     */
    public CreateBlockchainBotIotagentAgentteamResponse createBlockchainBotIotagentAgentteamEx(CreateBlockchainBotIotagentAgentteamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.agentteam.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotIotagentAgentteamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体团队编辑
     * Summary: 智能体团队编辑</p>
     */
    public UpdateBlockchainBotIotagentAgentteamResponse updateBlockchainBotIotagentAgentteam(UpdateBlockchainBotIotagentAgentteamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockchainBotIotagentAgentteamEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体团队编辑
     * Summary: 智能体团队编辑</p>
     */
    public UpdateBlockchainBotIotagentAgentteamResponse updateBlockchainBotIotagentAgentteamEx(UpdateBlockchainBotIotagentAgentteamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.agentteam.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockchainBotIotagentAgentteamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体详情
     * Summary: 智能体详情</p>
     */
    public DetailBlockchainBotIotagentAgentResponse detailBlockchainBotIotagentAgent(DetailBlockchainBotIotagentAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailBlockchainBotIotagentAgentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体详情
     * Summary: 智能体详情</p>
     */
    public DetailBlockchainBotIotagentAgentResponse detailBlockchainBotIotagentAgentEx(DetailBlockchainBotIotagentAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.agent.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailBlockchainBotIotagentAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: session创建
     * Summary: session创建</p>
     */
    public CreateBlockchainBotIotagentSessionResponse createBlockchainBotIotagentSession(CreateBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: session创建
     * Summary: session创建</p>
     */
    public CreateBlockchainBotIotagentSessionResponse createBlockchainBotIotagentSessionEx(CreateBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: seesion名字修改
     * Summary: seesion名字修改</p>
     */
    public RenameBlockchainBotIotagentSessionResponse renameBlockchainBotIotagentSession(RenameBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: seesion名字修改
     * Summary: seesion名字修改</p>
     */
    public RenameBlockchainBotIotagentSessionResponse renameBlockchainBotIotagentSessionEx(RenameBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.rename", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RenameBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: session删除
     * Summary: session删除</p>
     */
    public DeleteBlockchainBotIotagentSessionResponse deleteBlockchainBotIotagentSession(DeleteBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: session删除
     * Summary: session删除</p>
     */
    public DeleteBlockchainBotIotagentSessionResponse deleteBlockchainBotIotagentSessionEx(DeleteBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: session对话历史
     * Summary: session对话历史</p>
     */
    public HistoryBlockchainBotIotagentSessionResponse historyBlockchainBotIotagentSession(HistoryBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.historyBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: session对话历史
     * Summary: session对话历史</p>
     */
    public HistoryBlockchainBotIotagentSessionResponse historyBlockchainBotIotagentSessionEx(HistoryBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.history", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new HistoryBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: session 列表
     * Summary: session 列表</p>
     */
    public ListBlockchainBotIotagentSessionResponse listBlockchainBotIotagentSession(ListBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: session 列表
     * Summary: session 列表</p>
     */
    public ListBlockchainBotIotagentSessionResponse listBlockchainBotIotagentSessionEx(ListBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
     * Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令</p>
     */
    public ChatBlockchainBotIotagentSessionResponse chatBlockchainBotIotagentSession(ChatBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.chatBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
     * Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令</p>
     */
    public ChatBlockchainBotIotagentSessionResponse chatBlockchainBotIotagentSessionEx(ChatBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.chat", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ChatBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 会话打断
     * Summary: 会话打断</p>
     */
    public InterruptBlockchainBotIotagentSessionResponse interruptBlockchainBotIotagentSession(InterruptBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 会话打断
     * Summary: 会话打断</p>
     */
    public InterruptBlockchainBotIotagentSessionResponse interruptBlockchainBotIotagentSessionEx(InterruptBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.interrupt", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InterruptBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体消息/指令推送
     * Summary: 智能体消息/指令推送</p>
     */
    public PushBlockchainBotIotagentMessageResponse pushBlockchainBotIotagentMessage(PushBlockchainBotIotagentMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushBlockchainBotIotagentMessageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能体消息/指令推送
     * Summary: 智能体消息/指令推送</p>
     */
    public PushBlockchainBotIotagentMessageResponse pushBlockchainBotIotagentMessageEx(PushBlockchainBotIotagentMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.message.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushBlockchainBotIotagentMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询智能体消息/指令推送状态
     * Summary: 查询智能体消息/指令推送状态</p>
     */
    public QuerypushstatusBlockchainBotIotagentMessageResponse querypushstatusBlockchainBotIotagentMessage(QuerypushstatusBlockchainBotIotagentMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querypushstatusBlockchainBotIotagentMessageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询智能体消息/指令推送状态
     * Summary: 查询智能体消息/指令推送状态</p>
     */
    public QuerypushstatusBlockchainBotIotagentMessageResponse querypushstatusBlockchainBotIotagentMessageEx(QuerypushstatusBlockchainBotIotagentMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.message.querypushstatus", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerypushstatusBlockchainBotIotagentMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: session下的文件列表
     * Summary: session下的文件列表</p>
     */
    public ListfilesBlockchainBotIotagentSessionResponse listfilesBlockchainBotIotagentSession(ListfilesBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listfilesBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: session下的文件列表
     * Summary: session下的文件列表</p>
     */
    public ListfilesBlockchainBotIotagentSessionResponse listfilesBlockchainBotIotagentSessionEx(ListfilesBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.listfiles", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListfilesBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件下载
     * Summary: 文件下载</p>
     */
    public FliedownloadBlockchainBotIotagentSessionResponse fliedownloadBlockchainBotIotagentSession(FliedownloadBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fliedownloadBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件下载
     * Summary: 文件下载</p>
     */
    public FliedownloadBlockchainBotIotagentSessionResponse fliedownloadBlockchainBotIotagentSessionEx(FliedownloadBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.fliedownload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FliedownloadBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件预览
     * Summary: 文件预览</p>
     */
    public FilepreviewBlockchainBotIotagentSessionResponse filepreviewBlockchainBotIotagentSession(FilepreviewBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.filepreviewBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件预览
     * Summary: 文件预览</p>
     */
    public FilepreviewBlockchainBotIotagentSessionResponse filepreviewBlockchainBotIotagentSessionEx(FilepreviewBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.filepreview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FilepreviewBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 插件接口
     * Summary: 插件接口</p>
     */
    public PushBlockchainBotIotagentAudioscribeResponse pushBlockchainBotIotagentAudioscribe(PushBlockchainBotIotagentAudioscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushBlockchainBotIotagentAudioscribeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 插件接口
     * Summary: 插件接口</p>
     */
    public PushBlockchainBotIotagentAudioscribeResponse pushBlockchainBotIotagentAudioscribeEx(PushBlockchainBotIotagentAudioscribeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "blockchain.bot.iotagent.audioscribe.push"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                PushBlockchainBotIotagentAudioscribeResponse pushBlockchainBotIotagentAudioscribeResponse = PushBlockchainBotIotagentAudioscribeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return pushBlockchainBotIotagentAudioscribeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.audioscribe.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushBlockchainBotIotagentAudioscribeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 插件通用HTTP接口
     * Summary: 插件通用HTTP接口</p>
     */
    public ExecBlockchainBotIotagentPluginResponse execBlockchainBotIotagentPlugin(ExecBlockchainBotIotagentPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execBlockchainBotIotagentPluginEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 插件通用HTTP接口
     * Summary: 插件通用HTTP接口</p>
     */
    public ExecBlockchainBotIotagentPluginResponse execBlockchainBotIotagentPluginEx(ExecBlockchainBotIotagentPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.plugin.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecBlockchainBotIotagentPluginResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传
     * Summary: 文件上传</p>
     */
    public PushBlockchainBotIotagentWorkspaceResponse pushBlockchainBotIotagentWorkspace(PushBlockchainBotIotagentWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushBlockchainBotIotagentWorkspaceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传
     * Summary: 文件上传</p>
     */
    public PushBlockchainBotIotagentWorkspaceResponse pushBlockchainBotIotagentWorkspaceEx(PushBlockchainBotIotagentWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.workspace.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushBlockchainBotIotagentWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传确认
     * Summary: 文件上传确认</p>
     */
    public ConfirmBlockchainBotIotagentWorkspaceResponse confirmBlockchainBotIotagentWorkspace(ConfirmBlockchainBotIotagentWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmBlockchainBotIotagentWorkspaceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传确认
     * Summary: 文件上传确认</p>
     */
    public ConfirmBlockchainBotIotagentWorkspaceResponse confirmBlockchainBotIotagentWorkspaceEx(ConfirmBlockchainBotIotagentWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.workspace.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmBlockchainBotIotagentWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询设备的云音乐登录状态及用户/VIP 信息。
     * Summary: 查询设备的云音乐登录状态及用户/VIP 信息。</p>
     */
    public StatusBlockchainBotIotagentMusicResponse statusBlockchainBotIotagentMusic(StatusBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询设备的云音乐登录状态及用户/VIP 信息。
     * Summary: 查询设备的云音乐登录状态及用户/VIP 信息。</p>
     */
    public StatusBlockchainBotIotagentMusicResponse statusBlockchainBotIotagentMusicEx(StatusBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
     * Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）</p>
     */
    public LoginurlBlockchainBotIotagentMusicResponse loginurlBlockchainBotIotagentMusic(LoginurlBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loginurlBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
     * Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）</p>
     */
    public LoginurlBlockchainBotIotagentMusicResponse loginurlBlockchainBotIotagentMusicEx(LoginurlBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.loginurl", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoginurlBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询云音乐播放历史
     * Summary: 查询云音乐播放历史</p>
     */
    public PlayhistoryBlockchainBotIotagentMusicResponse playhistoryBlockchainBotIotagentMusic(PlayhistoryBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.playhistoryBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询云音乐播放历史
     * Summary: 查询云音乐播放历史</p>
     */
    public PlayhistoryBlockchainBotIotagentMusicResponse playhistoryBlockchainBotIotagentMusicEx(PlayhistoryBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.playhistory", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PlayhistoryBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询红心歌曲
     * Summary: 分页查询红心歌曲</p>
     */
    public FavoritesBlockchainBotIotagentMusicResponse favoritesBlockchainBotIotagentMusic(FavoritesBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.favoritesBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询红心歌曲
     * Summary: 分页查询红心歌曲</p>
     */
    public FavoritesBlockchainBotIotagentMusicResponse favoritesBlockchainBotIotagentMusicEx(FavoritesBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.favorites", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FavoritesBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定歌曲的歌词。
     * Summary: 查询指定歌曲的歌词。</p>
     */
    public LyricsBlockchainBotIotagentMusicResponse lyricsBlockchainBotIotagentMusic(LyricsBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.lyricsBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定歌曲的歌词。
     * Summary: 查询指定歌曲的歌词。</p>
     */
    public LyricsBlockchainBotIotagentMusicResponse lyricsBlockchainBotIotagentMusicEx(LyricsBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.lyrics", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LyricsBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 对一首歌进行红心/取消红心操作。
     * Summary: 对一首歌进行红心/取消红心操作。</p>
     */
    public LikeBlockchainBotIotagentMusicResponse likeBlockchainBotIotagentMusic(LikeBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.likeBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 对一首歌进行红心/取消红心操作。
     * Summary: 对一首歌进行红心/取消红心操作。</p>
     */
    public LikeBlockchainBotIotagentMusicResponse likeBlockchainBotIotagentMusicEx(LikeBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.like", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LikeBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 退出云音乐登录，清理 token
     * Summary: 退出云音乐登录，清理 token</p>
     */
    public LogoutBlockchainBotIotagentMusicResponse logoutBlockchainBotIotagentMusic(LogoutBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logoutBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 退出云音乐登录，清理 token
     * Summary: 退出云音乐登录，清理 token</p>
     */
    public LogoutBlockchainBotIotagentMusicResponse logoutBlockchainBotIotagentMusicEx(LogoutBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.logout", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LogoutBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 云音乐回调接口
     * Summary: 云音乐回调接口</p>
     */
    public CallbackBlockchainBotIotagentMusicResponse callbackBlockchainBotIotagentMusic(CallbackBlockchainBotIotagentMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackBlockchainBotIotagentMusicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 云音乐回调接口
     * Summary: 云音乐回调接口</p>
     */
    public CallbackBlockchainBotIotagentMusicResponse callbackBlockchainBotIotagentMusicEx(CallbackBlockchainBotIotagentMusicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.music.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackBlockchainBotIotagentMusicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
     * Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）</p>
     */
    public UsageBlockchainBotIotagentSessionResponse usageBlockchainBotIotagentSession(UsageBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.usageBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
     * Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）</p>
     */
    public UsageBlockchainBotIotagentSessionResponse usageBlockchainBotIotagentSessionEx(UsageBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.usage", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UsageBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 会话上下文处理操作
     * Summary: 会话上下文处理操作</p>
     */
    public ActionBlockchainBotIotagentSessioncontextResponse actionBlockchainBotIotagentSessioncontext(ActionBlockchainBotIotagentSessioncontextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.actionBlockchainBotIotagentSessioncontextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 会话上下文处理操作
     * Summary: 会话上下文处理操作</p>
     */
    public ActionBlockchainBotIotagentSessioncontextResponse actionBlockchainBotIotagentSessioncontextEx(ActionBlockchainBotIotagentSessioncontextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.sessioncontext.action", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ActionBlockchainBotIotagentSessioncontextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询上下文压缩操作结果
     * Summary: 查询上下文压缩操作结果</p>
     */
    public QueryBlockchainBotIotagentSessioncontextactionResponse queryBlockchainBotIotagentSessioncontextaction(QueryBlockchainBotIotagentSessioncontextactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotagentSessioncontextactionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询上下文压缩操作结果
     * Summary: 查询上下文压缩操作结果</p>
     */
    public QueryBlockchainBotIotagentSessioncontextactionResponse queryBlockchainBotIotagentSessioncontextactionEx(QueryBlockchainBotIotagentSessioncontextactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.sessioncontextaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotagentSessioncontextactionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
     * Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）</p>
     */
    public QueryBlockchainBotAgentDailysummaryResponse queryBlockchainBotAgentDailysummary(QueryBlockchainBotAgentDailysummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotAgentDailysummaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
     * Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）</p>
     */
    public QueryBlockchainBotAgentDailysummaryResponse queryBlockchainBotAgentDailysummaryEx(QueryBlockchainBotAgentDailysummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.agent.dailysummary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotAgentDailysummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
     * Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）</p>
     */
    public GenerateBlockchainBotAgentDailysummaryResponse generateBlockchainBotAgentDailysummary(GenerateBlockchainBotAgentDailysummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateBlockchainBotAgentDailysummaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
     * Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）</p>
     */
    public GenerateBlockchainBotAgentDailysummaryResponse generateBlockchainBotAgentDailysummaryEx(GenerateBlockchainBotAgentDailysummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.agent.dailysummary.generate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GenerateBlockchainBotAgentDailysummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
     * Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数</p>
     */
    public TrajectoryBlockchainBotIotagentSessionResponse trajectoryBlockchainBotIotagentSession(TrajectoryBlockchainBotIotagentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trajectoryBlockchainBotIotagentSessionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
     * Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数</p>
     */
    public TrajectoryBlockchainBotIotagentSessionResponse trajectoryBlockchainBotIotagentSessionEx(TrajectoryBlockchainBotIotagentSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.trajectory", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TrajectoryBlockchainBotIotagentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单轮/操作的执行步骤详情，展开执行树
     * Summary: 查询单轮/操作的执行步骤详情，展开执行树</p>
     */
    public StepsBlockchainBotIotagentSessionTrajectoryResponse stepsBlockchainBotIotagentSessionTrajectory(StepsBlockchainBotIotagentSessionTrajectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stepsBlockchainBotIotagentSessionTrajectoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单轮/操作的执行步骤详情，展开执行树
     * Summary: 查询单轮/操作的执行步骤详情，展开执行树</p>
     */
    public StepsBlockchainBotIotagentSessionTrajectoryResponse stepsBlockchainBotIotagentSessionTrajectoryEx(StepsBlockchainBotIotagentSessionTrajectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.session.trajectory.steps", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StepsBlockchainBotIotagentSessionTrajectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
     * Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）</p>
     */
    public UploadurlBlockchainBotIotagentFilesResponse uploadurlBlockchainBotIotagentFiles(UploadurlBlockchainBotIotagentFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadurlBlockchainBotIotagentFilesEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
     * Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）</p>
     */
    public UploadurlBlockchainBotIotagentFilesResponse uploadurlBlockchainBotIotagentFilesEx(UploadurlBlockchainBotIotagentFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.files.uploadurl", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadurlBlockchainBotIotagentFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
     * Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等</p>
     */
    public ConfirmBlockchainBotIotagentFilesResponse confirmBlockchainBotIotagentFiles(ConfirmBlockchainBotIotagentFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmBlockchainBotIotagentFilesEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
     * Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等</p>
     */
    public ConfirmBlockchainBotIotagentFilesResponse confirmBlockchainBotIotagentFilesEx(ConfirmBlockchainBotIotagentFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.files.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmBlockchainBotIotagentFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
     * Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用</p>
     */
    public FileurlBlockchainBotIotagentFilesResponse fileurlBlockchainBotIotagentFiles(FileurlBlockchainBotIotagentFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileurlBlockchainBotIotagentFilesEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
     * Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用</p>
     */
    public FileurlBlockchainBotIotagentFilesResponse fileurlBlockchainBotIotagentFilesEx(FileurlBlockchainBotIotagentFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotagent.files.fileurl", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FileurlBlockchainBotIotagentFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a>
     * Summary: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a></p>
     */
    public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse querycontractBlockchainBotAiotdatalinkAntfinanceassistant(QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querycontractBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a>
     * Summary: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a></p>
     */
    public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse querycontractBlockchainBotAiotdatalinkAntfinanceassistantEx(QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.querycontract", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a>
     * Summary: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a></p>
     */
    public SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse signcontractBlockchainBotAiotdatalinkAntfinanceassistant(SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signcontractBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a>
     * Summary: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a></p>
     */
    public SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse signcontractBlockchainBotAiotdatalinkAntfinanceassistantEx(SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.signcontract", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
     * Summary: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></p>
     */
    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse chatBlockchainBotAiotdatalinkAntfinanceassistant(ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.chatBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
     * Summary: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></p>
     */
    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse chatBlockchainBotAiotdatalinkAntfinanceassistantEx(ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.chat", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
     * Summary: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></p>
     */
    public StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse streamchatBlockchainBotAiotdatalinkAntfinanceassistant(StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.streamchatBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
     * Summary: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></p>
     */
    public StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse streamchatBlockchainBotAiotdatalinkAntfinanceassistantEx(StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.streamchat", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: P01 创建产品，一次性返回明文产品密钥
     * Summary: P01 创建产品，一次性返回明文产品密钥</p>
     */
    public CreateBlockchainBotIotsuccessProductResponse createBlockchainBotIotsuccessProduct(CreateBlockchainBotIotsuccessProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotIotsuccessProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: P01 创建产品，一次性返回明文产品密钥
     * Summary: P01 创建产品，一次性返回明文产品密钥</p>
     */
    public CreateBlockchainBotIotsuccessProductResponse createBlockchainBotIotsuccessProductEx(CreateBlockchainBotIotsuccessProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotIotsuccessProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: P02 产品详情，不含产品密钥
     * Summary: P02 产品详情，不含产品密钥</p>
     */
    public DetailBlockchainBotIotsuccessProductResponse detailBlockchainBotIotsuccessProduct(DetailBlockchainBotIotsuccessProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailBlockchainBotIotsuccessProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: P02 产品详情，不含产品密钥
     * Summary: P02 产品详情，不含产品密钥</p>
     */
    public DetailBlockchainBotIotsuccessProductResponse detailBlockchainBotIotsuccessProductEx(DetailBlockchainBotIotsuccessProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailBlockchainBotIotsuccessProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: P03 更新产品，至少一个可更新字段
     * Summary: P03 更新产品，至少一个可更新字段</p>
     */
    public UpdateBlockchainBotIotsuccessProductResponse updateBlockchainBotIotsuccessProduct(UpdateBlockchainBotIotsuccessProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockchainBotIotsuccessProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: P03 更新产品，至少一个可更新字段
     * Summary: P03 更新产品，至少一个可更新字段</p>
     */
    public UpdateBlockchainBotIotsuccessProductResponse updateBlockchainBotIotsuccessProductEx(UpdateBlockchainBotIotsuccessProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockchainBotIotsuccessProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: P04 当前租户产品列表
     * Summary: P04 当前租户产品列表</p>
     */
    public ListBlockchainBotIotsuccessProductResponse listBlockchainBotIotsuccessProduct(ListBlockchainBotIotsuccessProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: P04 当前租户产品列表
     * Summary: P04 当前租户产品列表</p>
     */
    public ListBlockchainBotIotsuccessProductResponse listBlockchainBotIotsuccessProductEx(ListBlockchainBotIotsuccessProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: P05 可选品类与服务形态、入网及激活组合
     * Summary: P05 可选品类与服务形态、入网及激活组合</p>
     */
    public ListBlockchainBotIotsuccessProductCategoryResponse listBlockchainBotIotsuccessProductCategory(ListBlockchainBotIotsuccessProductCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: P05 可选品类与服务形态、入网及激活组合
     * Summary: P05 可选品类与服务形态、入网及激活组合</p>
     */
    public ListBlockchainBotIotsuccessProductCategoryResponse listBlockchainBotIotsuccessProductCategoryEx(ListBlockchainBotIotsuccessProductCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.category.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T01 只读全局模板基线
     * Summary: T01 只读全局模板基线</p>
     */
    public ListBlockchainBotIotsuccessProductTemplateGlobalResponse listBlockchainBotIotsuccessProductTemplateGlobal(ListBlockchainBotIotsuccessProductTemplateGlobalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductTemplateGlobalEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T01 只读全局模板基线
     * Summary: T01 只读全局模板基线</p>
     */
    public ListBlockchainBotIotsuccessProductTemplateGlobalResponse listBlockchainBotIotsuccessProductTemplateGlobalEx(ListBlockchainBotIotsuccessProductTemplateGlobalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.template.global.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductTemplateGlobalResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T02 从零或全局模板创建产品模板
     * Summary: T02 从零或全局模板创建产品模板</p>
     */
    public CreateBlockchainBotIotsuccessProductTemplateResponse createBlockchainBotIotsuccessProductTemplate(CreateBlockchainBotIotsuccessProductTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotIotsuccessProductTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T02 从零或全局模板创建产品模板
     * Summary: T02 从零或全局模板创建产品模板</p>
     */
    public CreateBlockchainBotIotsuccessProductTemplateResponse createBlockchainBotIotsuccessProductTemplateEx(CreateBlockchainBotIotsuccessProductTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotIotsuccessProductTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T03 产品模板列表与默认标记
     * Summary: T03 产品模板列表与默认标记</p>
     */
    public ListBlockchainBotIotsuccessProductTemplateResponse listBlockchainBotIotsuccessProductTemplate(ListBlockchainBotIotsuccessProductTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T03 产品模板列表与默认标记
     * Summary: T03 产品模板列表与默认标记</p>
     */
    public ListBlockchainBotIotsuccessProductTemplateResponse listBlockchainBotIotsuccessProductTemplateEx(ListBlockchainBotIotsuccessProductTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.template.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T04 模板全部配置
     * Summary: T04 模板全部配置</p>
     */
    public DetailBlockchainBotIotsuccessProductTemplateResponse detailBlockchainBotIotsuccessProductTemplate(DetailBlockchainBotIotsuccessProductTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailBlockchainBotIotsuccessProductTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T04 模板全部配置
     * Summary: T04 模板全部配置</p>
     */
    public DetailBlockchainBotIotsuccessProductTemplateResponse detailBlockchainBotIotsuccessProductTemplateEx(DetailBlockchainBotIotsuccessProductTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.template.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailBlockchainBotIotsuccessProductTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T05 更新模板语言、音色、角色、模型及语音参数
     * Summary: T05 更新模板语言、音色、角色、模型及语音参数</p>
     */
    public UpdateBlockchainBotIotsuccessProductTemplateResponse updateBlockchainBotIotsuccessProductTemplate(UpdateBlockchainBotIotsuccessProductTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockchainBotIotsuccessProductTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T05 更新模板语言、音色、角色、模型及语音参数
     * Summary: T05 更新模板语言、音色、角色、模型及语音参数</p>
     */
    public UpdateBlockchainBotIotsuccessProductTemplateResponse updateBlockchainBotIotsuccessProductTemplateEx(UpdateBlockchainBotIotsuccessProductTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.template.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockchainBotIotsuccessProductTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T06 默认模板需先切换，最后一个模板不可删
     * Summary: T06 默认模板需先切换，最后一个模板不可删</p>
     */
    public DeleteBlockchainBotIotsuccessProductTemplateResponse deleteBlockchainBotIotsuccessProductTemplate(DeleteBlockchainBotIotsuccessProductTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBotIotsuccessProductTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T06 默认模板需先切换，最后一个模板不可删
     * Summary: T06 默认模板需先切换，最后一个模板不可删</p>
     */
    public DeleteBlockchainBotIotsuccessProductTemplateResponse deleteBlockchainBotIotsuccessProductTemplateEx(DeleteBlockchainBotIotsuccessProductTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.template.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBotIotsuccessProductTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T07 设置唯一默认，只影响新激活设备
     * Summary: T07 设置唯一默认，只影响新激活设备</p>
     */
    public DefaultBlockchainBotIotsuccessProductTemplateResponse defaultBlockchainBotIotsuccessProductTemplate(DefaultBlockchainBotIotsuccessProductTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.defaultBlockchainBotIotsuccessProductTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T07 设置唯一默认，只影响新激活设备
     * Summary: T07 设置唯一默认，只影响新激活设备</p>
     */
    public DefaultBlockchainBotIotsuccessProductTemplateResponse defaultBlockchainBotIotsuccessProductTemplateEx(DefaultBlockchainBotIotsuccessProductTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.template.default", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DefaultBlockchainBotIotsuccessProductTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T08 按语言筛选可选音色
     * Summary: T08 按语言筛选可选音色</p>
     */
    public ListBlockchainBotIotsuccessProductVoiceResponse listBlockchainBotIotsuccessProductVoice(ListBlockchainBotIotsuccessProductVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductVoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T08 按语言筛选可选音色
     * Summary: T08 按语言筛选可选音色</p>
     */
    public ListBlockchainBotIotsuccessProductVoiceResponse listBlockchainBotIotsuccessProductVoiceEx(ListBlockchainBotIotsuccessProductVoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.voice.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductVoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: T09 按产品授权和地区筛选模型
     * Summary: T09 按产品授权和地区筛选模型</p>
     */
    public ListBlockchainBotIotsuccessProductModelResponse listBlockchainBotIotsuccessProductModel(ListBlockchainBotIotsuccessProductModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: T09 按产品授权和地区筛选模型
     * Summary: T09 按产品授权和地区筛选模型</p>
     */
    public ListBlockchainBotIotsuccessProductModelResponse listBlockchainBotIotsuccessProductModelEx(ListBlockchainBotIotsuccessProductModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.model.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G01 官方、本租户及显式授权插件目录
     * Summary: G01 官方、本租户及显式授权插件目录</p>
     */
    public ListBlockchainBotIotsuccessProductPluginStoreResponse listBlockchainBotIotsuccessProductPluginStore(ListBlockchainBotIotsuccessProductPluginStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductPluginStoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G01 官方、本租户及显式授权插件目录
     * Summary: G01 官方、本租户及显式授权插件目录</p>
     */
    public ListBlockchainBotIotsuccessProductPluginStoreResponse listBlockchainBotIotsuccessProductPluginStoreEx(ListBlockchainBotIotsuccessProductPluginStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.store.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductPluginStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G02 产品已绑定插件与生效状态
     * Summary: G02 产品已绑定插件与生效状态</p>
     */
    public ListBlockchainBotIotsuccessProductPluginBindingResponse listBlockchainBotIotsuccessProductPluginBinding(ListBlockchainBotIotsuccessProductPluginBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductPluginBindingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G02 产品已绑定插件与生效状态
     * Summary: G02 产品已绑定插件与生效状态</p>
     */
    public ListBlockchainBotIotsuccessProductPluginBindingResponse listBlockchainBotIotsuccessProductPluginBindingEx(ListBlockchainBotIotsuccessProductPluginBindingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.binding.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductPluginBindingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
     * Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds</p>
     */
    public BindBlockchainBotIotsuccessProductPluginResponse bindBlockchainBotIotsuccessProductPlugin(BindBlockchainBotIotsuccessProductPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindBlockchainBotIotsuccessProductPluginEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
     * Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds</p>
     */
    public BindBlockchainBotIotsuccessProductPluginResponse bindBlockchainBotIotsuccessProductPluginEx(BindBlockchainBotIotsuccessProductPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindBlockchainBotIotsuccessProductPluginResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G04 高风险解绑，必须显式confirm=true
     * Summary: G04 高风险解绑，必须显式confirm=true</p>
     */
    public UnbindBlockchainBotIotsuccessProductPluginResponse unbindBlockchainBotIotsuccessProductPlugin(UnbindBlockchainBotIotsuccessProductPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindBlockchainBotIotsuccessProductPluginEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G04 高风险解绑，必须显式confirm=true
     * Summary: G04 高风险解绑，必须显式confirm=true</p>
     */
    public UnbindBlockchainBotIotsuccessProductPluginResponse unbindBlockchainBotIotsuccessProductPluginEx(UnbindBlockchainBotIotsuccessProductPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.plugin.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindBlockchainBotIotsuccessProductPluginResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G05 上传并解析Skill包，返回现有插件创建结果
     * Summary: G05 上传并解析Skill包，返回现有插件创建结果</p>
     */
    public UploadBlockchainBotIotsuccessProductSkillResponse uploadBlockchainBotIotsuccessProductSkill(UploadBlockchainBotIotsuccessProductSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadBlockchainBotIotsuccessProductSkillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G05 上传并解析Skill包，返回现有插件创建结果
     * Summary: G05 上传并解析Skill包，返回现有插件创建结果</p>
     */
    public UploadBlockchainBotIotsuccessProductSkillResponse uploadBlockchainBotIotsuccessProductSkillEx(UploadBlockchainBotIotsuccessProductSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.skill.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadBlockchainBotIotsuccessProductSkillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G06 按pluginId查询已有Skill资产状态
     * Summary: G06 按pluginId查询已有Skill资产状态</p>
     */
    public StatusBlockchainBotIotsuccessProductSkillResponse statusBlockchainBotIotsuccessProductSkill(StatusBlockchainBotIotsuccessProductSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusBlockchainBotIotsuccessProductSkillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G06 按pluginId查询已有Skill资产状态
     * Summary: G06 按pluginId查询已有Skill资产状态</p>
     */
    public StatusBlockchainBotIotsuccessProductSkillResponse statusBlockchainBotIotsuccessProductSkillEx(StatusBlockchainBotIotsuccessProductSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.skill.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusBlockchainBotIotsuccessProductSkillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G07 创建MCP站点，保存前校验
     * Summary: G07 创建MCP站点，保存前校验</p>
     */
    public CreateBlockchainBotIotsuccessProductMcpResponse createBlockchainBotIotsuccessProductMcp(CreateBlockchainBotIotsuccessProductMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotIotsuccessProductMcpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G07 创建MCP站点，保存前校验
     * Summary: G07 创建MCP站点，保存前校验</p>
     */
    public CreateBlockchainBotIotsuccessProductMcpResponse createBlockchainBotIotsuccessProductMcpEx(CreateBlockchainBotIotsuccessProductMcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotIotsuccessProductMcpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G08 更新本租户MCP，headers整体替换，省略保持
     * Summary: G08 更新本租户MCP，headers整体替换，省略保持</p>
     */
    public UpdateBlockchainBotIotsuccessProductMcpResponse updateBlockchainBotIotsuccessProductMcp(UpdateBlockchainBotIotsuccessProductMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockchainBotIotsuccessProductMcpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G08 更新本租户MCP，headers整体替换，省略保持
     * Summary: G08 更新本租户MCP，headers整体替换，省略保持</p>
     */
    public UpdateBlockchainBotIotsuccessProductMcpResponse updateBlockchainBotIotsuccessProductMcpEx(UpdateBlockchainBotIotsuccessProductMcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockchainBotIotsuccessProductMcpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G09 被产品或智能体引用不可删除
     * Summary: G09 被产品或智能体引用不可删除</p>
     */
    public DeleteBlockchainBotIotsuccessProductMcpResponse deleteBlockchainBotIotsuccessProductMcp(DeleteBlockchainBotIotsuccessProductMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBotIotsuccessProductMcpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G09 被产品或智能体引用不可删除
     * Summary: G09 被产品或智能体引用不可删除</p>
     */
    public DeleteBlockchainBotIotsuccessProductMcpResponse deleteBlockchainBotIotsuccessProductMcpEx(DeleteBlockchainBotIotsuccessProductMcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBotIotsuccessProductMcpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: G10 校验wss可达与鉴权，不持久化输入
     * Summary: G10 校验wss可达与鉴权，不持久化输入</p>
     */
    public ValidateBlockchainBotIotsuccessProductMcpResponse validateBlockchainBotIotsuccessProductMcp(ValidateBlockchainBotIotsuccessProductMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateBlockchainBotIotsuccessProductMcpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: G10 校验wss可达与鉴权，不持久化输入
     * Summary: G10 校验wss可达与鉴权，不持久化输入</p>
     */
    public ValidateBlockchainBotIotsuccessProductMcpResponse validateBlockchainBotIotsuccessProductMcpEx(ValidateBlockchainBotIotsuccessProductMcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.mcp.validate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ValidateBlockchainBotIotsuccessProductMcpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: D01 调用已有设备导入，返回成功/已有/无效名单
     * Summary: D01 调用已有设备导入，返回成功/已有/无效名单</p>
     */
    public ImportBlockchainBotIotsuccessProductDeviceResponse importBlockchainBotIotsuccessProductDevice(ImportBlockchainBotIotsuccessProductDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importBlockchainBotIotsuccessProductDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: D01 调用已有设备导入，返回成功/已有/无效名单
     * Summary: D01 调用已有设备导入，返回成功/已有/无效名单</p>
     */
    public ImportBlockchainBotIotsuccessProductDeviceResponse importBlockchainBotIotsuccessProductDeviceEx(ImportBlockchainBotIotsuccessProductDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.device.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportBlockchainBotIotsuccessProductDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态</p>
     */
    public StatusBlockchainBotIotsuccessProductDeviceImportResponse statusBlockchainBotIotsuccessProductDeviceImport(StatusBlockchainBotIotsuccessProductDeviceImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusBlockchainBotIotsuccessProductDeviceImportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态</p>
     */
    public StatusBlockchainBotIotsuccessProductDeviceImportResponse statusBlockchainBotIotsuccessProductDeviceImportEx(StatusBlockchainBotIotsuccessProductDeviceImportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.device.import.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusBlockchainBotIotsuccessProductDeviceImportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K01 创建知识库
     * Summary: K01 创建知识库</p>
     */
    public CreateBlockchainBotIotsuccessProductKnowledgebaseResponse createBlockchainBotIotsuccessProductKnowledgebase(CreateBlockchainBotIotsuccessProductKnowledgebaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotIotsuccessProductKnowledgebaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K01 创建知识库
     * Summary: K01 创建知识库</p>
     */
    public CreateBlockchainBotIotsuccessProductKnowledgebaseResponse createBlockchainBotIotsuccessProductKnowledgebaseEx(CreateBlockchainBotIotsuccessProductKnowledgebaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotIotsuccessProductKnowledgebaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K02 按名称类型分页
     * Summary: K02 按名称类型分页</p>
     */
    public ListBlockchainBotIotsuccessProductKnowledgebaseResponse listBlockchainBotIotsuccessProductKnowledgebase(ListBlockchainBotIotsuccessProductKnowledgebaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductKnowledgebaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K02 按名称类型分页
     * Summary: K02 按名称类型分页</p>
     */
    public ListBlockchainBotIotsuccessProductKnowledgebaseResponse listBlockchainBotIotsuccessProductKnowledgebaseEx(ListBlockchainBotIotsuccessProductKnowledgebaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductKnowledgebaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K03 基本信息、内容统计、关联产品
     * Summary: K03 基本信息、内容统计、关联产品</p>
     */
    public DetailBlockchainBotIotsuccessProductKnowledgebaseResponse detailBlockchainBotIotsuccessProductKnowledgebase(DetailBlockchainBotIotsuccessProductKnowledgebaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailBlockchainBotIotsuccessProductKnowledgebaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K03 基本信息、内容统计、关联产品
     * Summary: K03 基本信息、内容统计、关联产品</p>
     */
    public DetailBlockchainBotIotsuccessProductKnowledgebaseResponse detailBlockchainBotIotsuccessProductKnowledgebaseEx(DetailBlockchainBotIotsuccessProductKnowledgebaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailBlockchainBotIotsuccessProductKnowledgebaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K04 更新名称描述
     * Summary: K04 更新名称描述</p>
     */
    public UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse updateBlockchainBotIotsuccessProductKnowledgebase(UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockchainBotIotsuccessProductKnowledgebaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K04 更新名称描述
     * Summary: K04 更新名称描述</p>
     */
    public UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse updateBlockchainBotIotsuccessProductKnowledgebaseEx(UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K05 被产品绑定不可删
     * Summary: K05 被产品绑定不可删</p>
     */
    public DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse deleteBlockchainBotIotsuccessProductKnowledgebase(DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBotIotsuccessProductKnowledgebaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K05 被产品绑定不可删
     * Summary: K05 被产品绑定不可删</p>
     */
    public DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse deleteBlockchainBotIotsuccessProductKnowledgebaseEx(DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K06 创建已有知识文档并交给现有解析链
     * Summary: K06 创建已有知识文档并交给现有解析链</p>
     */
    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse uploadBlockchainBotIotsuccessProductKnowledgebaseContent(UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadBlockchainBotIotsuccessProductKnowledgebaseContentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K06 创建已有知识文档并交给现有解析链
     * Summary: K06 创建已有知识文档并交给现有解析链</p>
     */
    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse uploadBlockchainBotIotsuccessProductKnowledgebaseContentEx(UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.content.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K07 按kbId/docId查询已有文档解析状态
     * Summary: K07 按kbId/docId查询已有文档解析状态</p>
     */
    public StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse statusBlockchainBotIotsuccessProductKnowledgebaseContent(StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusBlockchainBotIotsuccessProductKnowledgebaseContentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K07 按kbId/docId查询已有文档解析状态
     * Summary: K07 按kbId/docId查询已有文档解析状态</p>
     */
    public StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse statusBlockchainBotIotsuccessProductKnowledgebaseContentEx(StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.content.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K08 调用已有文档删除与索引清理
     * Summary: K08 调用已有文档删除与索引清理</p>
     */
    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse deleteBlockchainBotIotsuccessProductKnowledgebaseContent(DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBotIotsuccessProductKnowledgebaseContentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K08 调用已有文档删除与索引清理
     * Summary: K08 调用已有文档删除与索引清理</p>
     */
    public DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse deleteBlockchainBotIotsuccessProductKnowledgebaseContentEx(DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.content.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K09 关键词、意图、实体组合触发
     * Summary: K09 关键词、意图、实体组合触发</p>
     */
    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse setBlockchainBotIotsuccessProductKnowledgebaseTrigger(SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setBlockchainBotIotsuccessProductKnowledgebaseTriggerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K09 关键词、意图、实体组合触发
     * Summary: K09 关键词、意图、实体组合触发</p>
     */
    public SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse setBlockchainBotIotsuccessProductKnowledgebaseTriggerEx(SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.trigger.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: K10 已生效版本召回测试
     * Summary: K10 已生效版本召回测试</p>
     */
    public TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse testBlockchainBotIotsuccessProductKnowledgebaseRecall(TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testBlockchainBotIotsuccessProductKnowledgebaseRecallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: K10 已生效版本召回测试
     * Summary: K10 已生效版本召回测试</p>
     */
    public TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse testBlockchainBotIotsuccessProductKnowledgebaseRecallEx(TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.knowledgebase.recall.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Q01 License码、激活状态、设备、消耗与剩余
     * Summary: Q01 License码、激活状态、设备、消耗与剩余</p>
     */
    public ListBlockchainBotIotsuccessProductLicenseResponse listBlockchainBotIotsuccessProductLicense(ListBlockchainBotIotsuccessProductLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductLicenseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Q01 License码、激活状态、设备、消耗与剩余
     * Summary: Q01 License码、激活状态、设备、消耗与剩余</p>
     */
    public ListBlockchainBotIotsuccessProductLicenseResponse listBlockchainBotIotsuccessProductLicenseEx(ListBlockchainBotIotsuccessProductLicenseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.license.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductLicenseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Q02 额度总览，带单位和数据时间
     * Summary: Q02 额度总览，带单位和数据时间</p>
     */
    public OverviewBlockchainBotIotsuccessProductQuotaResponse overviewBlockchainBotIotsuccessProductQuota(OverviewBlockchainBotIotsuccessProductQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.overviewBlockchainBotIotsuccessProductQuotaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Q02 额度总览，带单位和数据时间
     * Summary: Q02 额度总览，带单位和数据时间</p>
     */
    public OverviewBlockchainBotIotsuccessProductQuotaResponse overviewBlockchainBotIotsuccessProductQuotaEx(OverviewBlockchainBotIotsuccessProductQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.quota.overview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OverviewBlockchainBotIotsuccessProductQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
     * Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天</p>
     */
    public ListBlockchainBotIotsuccessProductQuotaConsumptionResponse listBlockchainBotIotsuccessProductQuotaConsumption(ListBlockchainBotIotsuccessProductQuotaConsumptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlockchainBotIotsuccessProductQuotaConsumptionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
     * Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天</p>
     */
    public ListBlockchainBotIotsuccessProductQuotaConsumptionResponse listBlockchainBotIotsuccessProductQuotaConsumptionEx(ListBlockchainBotIotsuccessProductQuotaConsumptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotsuccess.product.quota.consumption.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListBlockchainBotIotsuccessProductQuotaConsumptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态</p>
     */
    public StatusBlockchainBotIoaProductDeviceImportResponse statusBlockchainBotIoaProductDeviceImport(StatusBlockchainBotIoaProductDeviceImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusBlockchainBotIoaProductDeviceImportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: D02 按产品和MAC查询当前注册状态
     * Summary: D02 按产品和MAC查询当前注册状态</p>
     */
    public StatusBlockchainBotIoaProductDeviceImportResponse statusBlockchainBotIoaProductDeviceImportEx(StatusBlockchainBotIoaProductDeviceImportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.ioa.product.device.import.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusBlockchainBotIoaProductDeviceImportResponse());
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
