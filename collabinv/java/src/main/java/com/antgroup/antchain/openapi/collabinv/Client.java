// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.collabinv.models.*;

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
                    new TeaPair("sdk_version", "1.0.65"),
                    new TeaPair("_prod_code", "COLLABINV"),
                    new TeaPair("_prod_channel", "default")
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
     * <p>Description: sse查询
     * Summary: sse查询</p>
     */
    public QueryAgentSseResponse queryAgentSse(QueryAgentSseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAgentSseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: sse查询
     * Summary: sse查询</p>
     */
    public QueryAgentSseResponse queryAgentSseEx(QueryAgentSseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.agent.sse.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAgentSseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据用户id查询用户会话列表
     * Summary: 根据用户id查询用户会话列表</p>
     */
    public ListAgentConversationResponse listAgentConversation(ListAgentConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentConversationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据用户id查询用户会话列表
     * Summary: 根据用户id查询用户会话列表</p>
     */
    public ListAgentConversationResponse listAgentConversationEx(ListAgentConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAgentConversationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据用户Id会话ID删除会话
     * Summary: 删除会话</p>
     */
    public DeleteAgentConversationResponse deleteAgentConversation(DeleteAgentConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentConversationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据用户Id会话ID删除会话
     * Summary: 删除会话</p>
     */
    public DeleteAgentConversationResponse deleteAgentConversationEx(DeleteAgentConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAgentConversationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除用户所有会话
     * Summary: 删除用户所有会话</p>
     */
    public BatchdeleteAgentConversationResponse batchdeleteAgentConversation(BatchdeleteAgentConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteAgentConversationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除用户所有会话
     * Summary: 删除用户所有会话</p>
     */
    public BatchdeleteAgentConversationResponse batchdeleteAgentConversationEx(BatchdeleteAgentConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteAgentConversationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取会话消息列表
     * Summary: 获取会话消息列表</p>
     */
    public ListAgentMessageResponse listAgentMessage(ListAgentMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentMessageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取会话消息列表
     * Summary: 获取会话消息列表</p>
     */
    public ListAgentMessageResponse listAgentMessageEx(ListAgentMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.agent.message.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAgentMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑会话信息
     * Summary: 编辑会话信息</p>
     */
    public UpdateAgentConversationResponse updateAgentConversation(UpdateAgentConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentConversationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑会话信息
     * Summary: 编辑会话信息</p>
     */
    public UpdateAgentConversationResponse updateAgentConversationEx(UpdateAgentConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAgentConversationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: agent api 同步
     * Summary: agent api</p>
     */
    public QueryAgentCompletionResponse queryAgentCompletion(QueryAgentCompletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAgentCompletionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: agent api 同步
     * Summary: agent api</p>
     */
    public QueryAgentCompletionResponse queryAgentCompletionEx(QueryAgentCompletionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.agent.completion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAgentCompletionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 车抵贷人群匹配
     * Summary: 车抵贷人群匹配</p>
     */
    public MatchCarloanUsersResponse matchCarloanUsers(MatchCarloanUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchCarloanUsersEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 车抵贷人群匹配
     * Summary: 车抵贷人群匹配</p>
     */
    public MatchCarloanUsersResponse matchCarloanUsersEx(MatchCarloanUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchCarloanUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量碰撞人群数据
     * Summary: 批量碰撞人群数据</p>
     */
    public BatchqueryCarloanUsersResponse batchqueryCarloanUsers(BatchqueryCarloanUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryCarloanUsersEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量碰撞人群数据
     * Summary: 批量碰撞人群数据</p>
     */
    public BatchqueryCarloanUsersResponse batchqueryCarloanUsersEx(BatchqueryCarloanUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryCarloanUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 导入人群文件
     * Summary: 导入人群文件</p>
     */
    public ImportCarloanUsersResponse importCarloanUsers(ImportCarloanUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importCarloanUsersEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 导入人群文件
     * Summary: 导入人群文件</p>
     */
    public ImportCarloanUsersResponse importCarloanUsersEx(ImportCarloanUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.zkcollabinv.carloan.users.import"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ImportCarloanUsersResponse importCarloanUsersResponse = ImportCarloanUsersResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return importCarloanUsersResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportCarloanUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加用户
     * Summary: 添加天猫用户</p>
     */
    public AddCaruserUsersResponse addCaruserUsers(AddCaruserUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCaruserUsersEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加用户
     * Summary: 添加天猫用户</p>
     */
    public AddCaruserUsersResponse addCaruserUsersEx(AddCaruserUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.caruser.users.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCaruserUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询匹配结果
     * Summary: 查询结果</p>
     */
    public QueryCarloanUsersResponse queryCarloanUsers(QueryCarloanUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCarloanUsersEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询匹配结果
     * Summary: 查询结果</p>
     */
    public QueryCarloanUsersResponse queryCarloanUsersEx(QueryCarloanUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCarloanUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口添加用户
     * Summary: 测试接口添加用户</p>
     */
    public AddCaruserTestResponse addCaruserTest(AddCaruserTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCaruserTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口添加用户
     * Summary: 测试接口添加用户</p>
     */
    public AddCaruserTestResponse addCaruserTestEx(AddCaruserTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.caruser.test.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCaruserTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 生产接口增加人群
     * Summary: 生产接口增加人群</p>
     */
    public AddCaruserPrdResponse addCaruserPrd(AddCaruserPrdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCaruserPrdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 生产接口增加人群
     * Summary: 生产接口增加人群</p>
     */
    public AddCaruserPrdResponse addCaruserPrdEx(AddCaruserPrdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.caruser.prd.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCaruserPrdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 碰撞人群数据测试接口碰撞人群数据
     * Summary: 测试接口碰撞人群数据</p>
     */
    public BatchqueryCarloanTestResponse batchqueryCarloanTest(BatchqueryCarloanTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryCarloanTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 碰撞人群数据测试接口碰撞人群数据
     * Summary: 测试接口碰撞人群数据</p>
     */
    public BatchqueryCarloanTestResponse batchqueryCarloanTestEx(BatchqueryCarloanTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.test.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryCarloanTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 生产接口碰撞人群数据
     * Summary: 生产接口碰撞人群数据</p>
     */
    public BatchqueryCarloanPrdResponse batchqueryCarloanPrd(BatchqueryCarloanPrdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryCarloanPrdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 生产接口碰撞人群数据
     * Summary: 生产接口碰撞人群数据</p>
     */
    public BatchqueryCarloanPrdResponse batchqueryCarloanPrdEx(BatchqueryCarloanPrdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.prd.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryCarloanPrdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 云中停查询接口
     * Summary: 云中停查询接口</p>
     */
    public QueryCarloanYztResponse queryCarloanYzt(QueryCarloanYztRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCarloanYztEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 云中停查询接口
     * Summary: 云中停查询接口</p>
     */
    public QueryCarloanYztResponse queryCarloanYztEx(QueryCarloanYztRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.yzt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCarloanYztResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 云中停线索导入接口
     * Summary: 云中停线索导入</p>
     */
    public ImportCarloanYztResponse importCarloanYzt(ImportCarloanYztRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importCarloanYztEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 云中停线索导入接口
     * Summary: 云中停线索导入</p>
     */
    public ImportCarloanYztResponse importCarloanYztEx(ImportCarloanYztRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.carloan.yzt.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportCarloanYztResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: idMapping碰撞
     * Summary: idMapping碰撞</p>
     */
    public ImportIdmapSamplefileResponse importIdmapSamplefile(ImportIdmapSamplefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIdmapSamplefileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: idMapping碰撞
     * Summary: idMapping碰撞</p>
     */
    public ImportIdmapSamplefileResponse importIdmapSamplefileEx(ImportIdmapSamplefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.idmap.samplefile.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIdmapSamplefileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: psi求交结果导入
     * Summary: psi求交结果导入</p>
     */
    public ImportIdmapPsiresultfileResponse importIdmapPsiresultfile(ImportIdmapPsiresultfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIdmapPsiresultfileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: psi求交结果导入
     * Summary: psi求交结果导入</p>
     */
    public ImportIdmapPsiresultfileResponse importIdmapPsiresultfileEx(ImportIdmapPsiresultfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.idmap.psiresultfile.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIdmapPsiresultfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 投行研究，品牌调用
     * Summary: 投行研究，品牌调用</p>
     */
    public QueryIndexresearchBrandResponse queryIndexresearchBrand(QueryIndexresearchBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndexresearchBrandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 投行研究，品牌调用
     * Summary: 投行研究，品牌调用</p>
     */
    public QueryIndexresearchBrandResponse queryIndexresearchBrandEx(QueryIndexresearchBrandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.brand.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndexresearchBrandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 投行研究，查询品牌指标结果
     * Summary: 查询品牌指标</p>
     */
    public QueryIndexresearchBrandindexResponse queryIndexresearchBrandindex(QueryIndexresearchBrandindexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndexresearchBrandindexEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 投行研究，查询品牌指标结果
     * Summary: 查询品牌指标</p>
     */
    public QueryIndexresearchBrandindexResponse queryIndexresearchBrandindexEx(QueryIndexresearchBrandindexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.brandindex.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndexresearchBrandindexResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费行业报告查询
     * Summary: 消费行业报告查询</p>
     */
    public QueryIndexresearchConsumeindustryResponse queryIndexresearchConsumeindustry(QueryIndexresearchConsumeindustryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndexresearchConsumeindustryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费行业报告查询
     * Summary: 消费行业报告查询</p>
     */
    public QueryIndexresearchConsumeindustryResponse queryIndexresearchConsumeindustryEx(QueryIndexresearchConsumeindustryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.consumeindustry.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndexresearchConsumeindustryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费行业报告行业查询
     * Summary: 消费行业报告行业查询</p>
     */
    public QueryIndexresearchIndustryResponse queryIndexresearchIndustry(QueryIndexresearchIndustryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndexresearchIndustryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费行业报告行业查询
     * Summary: 消费行业报告行业查询</p>
     */
    public QueryIndexresearchIndustryResponse queryIndexresearchIndustryEx(QueryIndexresearchIndustryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.industry.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIndexresearchIndustryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于交易数据的定位信息协查
     * Summary: 定位协查</p>
     */
    public QueryLocationInternalResponse queryLocationInternal(QueryLocationInternalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLocationInternalEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于交易数据的定位信息协查
     * Summary: 定位协查</p>
     */
    public QueryLocationInternalResponse queryLocationInternalEx(QueryLocationInternalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.location.internal.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLocationInternalResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于交易数据的定位信息协查对外接口
     * Summary: 定位协查对外接口</p>
     */
    public QueryLocationTradeResponse queryLocationTrade(QueryLocationTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLocationTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于交易数据的定位信息协查对外接口
     * Summary: 定位协查对外接口</p>
     */
    public QueryLocationTradeResponse queryLocationTradeEx(QueryLocationTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.location.trade.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLocationTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 样本文件摘要
     * Summary: 样本文件摘要</p>
     */
    public PushModelSamplefileResponse pushModelSamplefile(PushModelSamplefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushModelSamplefileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 样本文件摘要
     * Summary: 样本文件摘要</p>
     */
    public PushModelSamplefileResponse pushModelSamplefileEx(PushModelSamplefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.samplefile.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushModelSamplefileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 样本任务执行
     * Summary: 样本任务执行</p>
     */
    public ExecModelSampletaskResponse execModelSampletask(ExecModelSampletaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execModelSampletaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 样本任务执行
     * Summary: 样本任务执行</p>
     */
    public ExecModelSampletaskResponse execModelSampletaskEx(ExecModelSampletaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.sampletask.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecModelSampletaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 任务状态查询
     * Summary: 任务状态查询</p>
     */
    public QueryModelSampletaskResponse queryModelSampletask(QueryModelSampletaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelSampletaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 任务状态查询
     * Summary: 任务状态查询</p>
     */
    public QueryModelSampletaskResponse queryModelSampletaskEx(QueryModelSampletaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.sampletask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelSampletaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 特征集查询
     * Summary: 特征集查询</p>
     */
    public QueryModelFeaturesetResponse queryModelFeatureset(QueryModelFeaturesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelFeaturesetEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 特征集查询
     * Summary: 特征集查询</p>
     */
    public QueryModelFeaturesetResponse queryModelFeaturesetEx(QueryModelFeaturesetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.featureset.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelFeaturesetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型保存
     * Summary: 模型保存</p>
     */
    public SubmitModelInstanceResponse submitModelInstance(SubmitModelInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitModelInstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型保存
     * Summary: 模型保存</p>
     */
    public SubmitModelInstanceResponse submitModelInstanceEx(SubmitModelInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.instance.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitModelInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型调用统计查询
     * Summary: 模型调用统计查询</p>
     */
    public QueryModelStatsResponse queryModelStats(QueryModelStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelStatsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 模型调用统计查询
     * Summary: 模型调用统计查询</p>
     */
    public QueryModelStatsResponse queryModelStatsEx(QueryModelStatsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.stats.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelStatsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询
     * Summary: 通用查询</p>
     */
    public QueryModelCommonscoreResponse queryModelCommonscore(QueryModelCommonscoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelCommonscoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询
     * Summary: 通用查询</p>
     */
    public QueryModelCommonscoreResponse queryModelCommonscoreEx(QueryModelCommonscoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.commonscore.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelCommonscoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询批次，仅针对外部使用PIR场景
     * Summary: 通用查询批次</p>
     */
    public BatchqueryModelCommonscoreResponse batchqueryModelCommonscore(BatchqueryModelCommonscoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryModelCommonscoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用查询批次，仅针对外部使用PIR场景
     * Summary: 通用查询批次</p>
     */
    public BatchqueryModelCommonscoreResponse batchqueryModelCommonscoreEx(BatchqueryModelCommonscoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.commonscore.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryModelCommonscoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 多模型预测值
     * Summary: 多模型预测值</p>
     */
    public QueryModelMultiscoreResponse queryModelMultiscore(QueryModelMultiscoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelMultiscoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 多模型预测值
     * Summary: 多模型预测值</p>
     */
    public QueryModelMultiscoreResponse queryModelMultiscoreEx(QueryModelMultiscoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.multiscore.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelMultiscoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融合模型的调用
     * Summary: 融合模型调用</p>
     */
    public QueryModelFusionmodelResponse queryModelFusionmodel(QueryModelFusionmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelFusionmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融合模型的调用
     * Summary: 融合模型调用</p>
     */
    public QueryModelFusionmodelResponse queryModelFusionmodelEx(QueryModelFusionmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.fusionmodel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelFusionmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用工分
     * Summary: 用工分调用</p>
     */
    public QueryModelWorkscoreResponse queryModelWorkscore(QueryModelWorkscoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelWorkscoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用工分
     * Summary: 用工分调用</p>
     */
    public QueryModelWorkscoreResponse queryModelWorkscoreEx(QueryModelWorkscoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.zkcollabinv.model.workscore.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelWorkscoreResponse());
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
