// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models.*;

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
                    new TeaPair("sdk_version", "1.1.9"),
                    new TeaPair("_prod_code", "ak_ed7107878c564eda98e507d7451aae75"),
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
     * <p>Description: 数字人角色列表查询接口
     * Summary: 数字人角色列表查询接口</p>
     */
    public ListUniversalsaasDigitalhumanHumanResponse listUniversalsaasDigitalhumanHuman(ListUniversalsaasDigitalhumanHumanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人角色列表查询接口
     * Summary: 数字人角色列表查询接口</p>
     */
    public ListUniversalsaasDigitalhumanHumanResponse listUniversalsaasDigitalhumanHumanEx(ListUniversalsaasDigitalhumanHumanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.human.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanHumanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库列表查询接口
     * Summary: 知识库列表查询接口</p>
     */
    public ListUniversalsaasDigitalhumanLibraryResponse listUniversalsaasDigitalhumanLibrary(ListUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库列表查询接口
     * Summary: 知识库列表查询接口</p>
     */
    public ListUniversalsaasDigitalhumanLibraryResponse listUniversalsaasDigitalhumanLibraryEx(ListUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建知识库接口
     * Summary: 创建知识库接口</p>
     */
    public AddUniversalsaasDigitalhumanLibraryResponse addUniversalsaasDigitalhumanLibrary(AddUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建知识库接口
     * Summary: 创建知识库接口</p>
     */
    public AddUniversalsaasDigitalhumanLibraryResponse addUniversalsaasDigitalhumanLibraryEx(AddUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑知识库接口
     * Summary: 编辑知识库接口</p>
     */
    public UpdateUniversalsaasDigitalhumanLibraryResponse updateUniversalsaasDigitalhumanLibrary(UpdateUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑知识库接口
     * Summary: 编辑知识库接口</p>
     */
    public UpdateUniversalsaasDigitalhumanLibraryResponse updateUniversalsaasDigitalhumanLibraryEx(UpdateUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除知识库接口
     * Summary: 删除知识库接口</p>
     */
    public DeleteUniversalsaasDigitalhumanLibraryResponse deleteUniversalsaasDigitalhumanLibrary(DeleteUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除知识库接口
     * Summary: 删除知识库接口</p>
     */
    public DeleteUniversalsaasDigitalhumanLibraryResponse deleteUniversalsaasDigitalhumanLibraryEx(DeleteUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增知识点接口
     * Summary: 新增知识点接口</p>
     */
    public AddUniversalsaasDigitalhumanKnowledgeResponse addUniversalsaasDigitalhumanKnowledge(AddUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增知识点接口
     * Summary: 新增知识点接口</p>
     */
    public AddUniversalsaasDigitalhumanKnowledgeResponse addUniversalsaasDigitalhumanKnowledgeEx(AddUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑知识点接口
     * Summary: 编辑知识点接口</p>
     */
    public UpdateUniversalsaasDigitalhumanKnowledgeResponse updateUniversalsaasDigitalhumanKnowledge(UpdateUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑知识点接口
     * Summary: 编辑知识点接口</p>
     */
    public UpdateUniversalsaasDigitalhumanKnowledgeResponse updateUniversalsaasDigitalhumanKnowledgeEx(UpdateUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发布知识点接口
     * Summary: 发布知识点接口</p>
     */
    public OnlineUniversalsaasDigitalhumanKnowledgeResponse onlineUniversalsaasDigitalhumanKnowledge(OnlineUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发布知识点接口
     * Summary: 发布知识点接口</p>
     */
    public OnlineUniversalsaasDigitalhumanKnowledgeResponse onlineUniversalsaasDigitalhumanKnowledgeEx(OnlineUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 下线知识点接口
     * Summary: 下线知识点接口</p>
     */
    public OfflineUniversalsaasDigitalhumanKnowledgeResponse offlineUniversalsaasDigitalhumanKnowledge(OfflineUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 下线知识点接口
     * Summary: 下线知识点接口</p>
     */
    public OfflineUniversalsaasDigitalhumanKnowledgeResponse offlineUniversalsaasDigitalhumanKnowledgeEx(OfflineUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询大模型对话列表接口
     * Summary: 查询大模型对话列表接口</p>
     */
    public ListUniversalsaasDigitalhumanLlmChatResponse listUniversalsaasDigitalhumanLlmChat(ListUniversalsaasDigitalhumanLlmChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询大模型对话列表接口
     * Summary: 查询大模型对话列表接口</p>
     */
    public ListUniversalsaasDigitalhumanLlmChatResponse listUniversalsaasDigitalhumanLlmChatEx(ListUniversalsaasDigitalhumanLlmChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.chat.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanLlmChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增交互配置接口
     * Summary: 新增交互配置接口</p>
     */
    public AddUniversalsaasDigitalhumanChatSettingResponse addUniversalsaasDigitalhumanChatSetting(AddUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增交互配置接口
     * Summary: 新增交互配置接口</p>
     */
    public AddUniversalsaasDigitalhumanChatSettingResponse addUniversalsaasDigitalhumanChatSettingEx(AddUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑交互配置接口
     * Summary: 编辑交互配置接口</p>
     */
    public SetUniversalsaasDigitalhumanChatSettingResponse setUniversalsaasDigitalhumanChatSetting(SetUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑交互配置接口
     * Summary: 编辑交互配置接口</p>
     */
    public SetUniversalsaasDigitalhumanChatSettingResponse setUniversalsaasDigitalhumanChatSettingEx(SetUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除交互配置接口
     * Summary: 删除交互配置接口</p>
     */
    public DeleteUniversalsaasDigitalhumanChatSettingResponse deleteUniversalsaasDigitalhumanChatSetting(DeleteUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除交互配置接口
     * Summary: 删除交互配置接口</p>
     */
    public DeleteUniversalsaasDigitalhumanChatSettingResponse deleteUniversalsaasDigitalhumanChatSettingEx(DeleteUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发布交互配置接口
     * Summary: 发布交互配置接口</p>
     */
    public OnlineUniversalsaasDigitalhumanChatSettingResponse onlineUniversalsaasDigitalhumanChatSetting(OnlineUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发布交互配置接口
     * Summary: 发布交互配置接口</p>
     */
    public OnlineUniversalsaasDigitalhumanChatSettingResponse onlineUniversalsaasDigitalhumanChatSettingEx(OnlineUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 下线交互配置接口
     * Summary: 下线交互配置接口</p>
     */
    public OfflineUniversalsaasDigitalhumanChatSettingResponse offlineUniversalsaasDigitalhumanChatSetting(OfflineUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 下线交互配置接口
     * Summary: 下线交互配置接口</p>
     */
    public OfflineUniversalsaasDigitalhumanChatSettingResponse offlineUniversalsaasDigitalhumanChatSettingEx(OfflineUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人形象列表接口
     * Summary: 数字人形象列表接口</p>
     */
    public ListUniversalsaasDigitalhumanModelResponse listUniversalsaasDigitalhumanModel(ListUniversalsaasDigitalhumanModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人形象列表接口
     * Summary: 数字人形象列表接口</p>
     */
    public ListUniversalsaasDigitalhumanModelResponse listUniversalsaasDigitalhumanModelEx(ListUniversalsaasDigitalhumanModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.model.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人平台音色列表
     * Summary: 数字人平台音色列表</p>
     */
    public ListUniversalsaasDigitalhumanVoiceResponse listUniversalsaasDigitalhumanVoice(ListUniversalsaasDigitalhumanVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人平台音色列表
     * Summary: 数字人平台音色列表</p>
     */
    public ListUniversalsaasDigitalhumanVoiceResponse listUniversalsaasDigitalhumanVoiceEx(ListUniversalsaasDigitalhumanVoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.voice.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanVoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人平台音色试听接口
     * Summary: 数字人平台音色试听接口</p>
     */
    public PreviewUniversalsaasDigitalhumanVoiceResponse previewUniversalsaasDigitalhumanVoice(PreviewUniversalsaasDigitalhumanVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人平台音色试听接口
     * Summary: 数字人平台音色试听接口</p>
     */
    public PreviewUniversalsaasDigitalhumanVoiceResponse previewUniversalsaasDigitalhumanVoiceEx(PreviewUniversalsaasDigitalhumanVoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.voice.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewUniversalsaasDigitalhumanVoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人平台角色创建与更新接口
     * Summary: 数字人平台角色创建与更新接口</p>
     */
    public UpdateUniversalsaasDigitalhumanHumanResponse updateUniversalsaasDigitalhumanHuman(UpdateUniversalsaasDigitalhumanHumanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字人平台角色创建与更新接口
     * Summary: 数字人平台角色创建与更新接口</p>
     */
    public UpdateUniversalsaasDigitalhumanHumanResponse updateUniversalsaasDigitalhumanHumanEx(UpdateUniversalsaasDigitalhumanHumanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.human.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanHumanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除数字人角色接口
     * Summary: 删除数字人角色接口</p>
     */
    public DeleteUniversalsaasDigitalhumanHumanResponse deleteUniversalsaasDigitalhumanHuman(DeleteUniversalsaasDigitalhumanHumanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除数字人角色接口
     * Summary: 删除数字人角色接口</p>
     */
    public DeleteUniversalsaasDigitalhumanHumanResponse deleteUniversalsaasDigitalhumanHumanEx(DeleteUniversalsaasDigitalhumanHumanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.human.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanHumanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除知识点接口
     * Summary: 删除知识点接口</p>
     */
    public DeleteUniversalsaasDigitalhumanKnowledgeResponse deleteUniversalsaasDigitalhumanKnowledge(DeleteUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除知识点接口
     * Summary: 删除知识点接口</p>
     */
    public DeleteUniversalsaasDigitalhumanKnowledgeResponse deleteUniversalsaasDigitalhumanKnowledgeEx(DeleteUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建批量导入任务
     * Summary: 创建批量导入任务</p>
     */
    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse createUniversalsaasDigitalhumanKnowledgeImporttask(CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建批量导入任务
     * Summary: 创建批量导入任务</p>
     */
    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse createUniversalsaasDigitalhumanKnowledgeImporttaskEx(CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "universalsaas.digitalhuman.knowledge.importtask.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse createUniversalsaasDigitalhumanKnowledgeImporttaskResponse = CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createUniversalsaasDigitalhumanKnowledgeImporttaskResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.importtask.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询批量导入任务
     * Summary: 查询批量导入任务</p>
     */
    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse queryUniversalsaasDigitalhumanKnowledgeImporttask(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询批量导入任务
     * Summary: 查询批量导入任务</p>
     */
    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse queryUniversalsaasDigitalhumanKnowledgeImporttaskEx(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.importtask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识点批量导出
     * Summary: 知识点批量导出</p>
     */
    public ExportUniversalsaasDigitalhumanKnowledgeResponse exportUniversalsaasDigitalhumanKnowledge(ExportUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识点批量导出
     * Summary: 知识点批量导出</p>
     */
    public ExportUniversalsaasDigitalhumanKnowledgeResponse exportUniversalsaasDigitalhumanKnowledgeEx(ExportUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取实时流列表接口
     * Summary: 获取实时流列表接口</p>
     */
    public ListUniversalsaasDigitalhumanStreamResponse listUniversalsaasDigitalhumanStream(ListUniversalsaasDigitalhumanStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanStreamEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取实时流列表接口
     * Summary: 获取实时流列表接口</p>
     */
    public ListUniversalsaasDigitalhumanStreamResponse listUniversalsaasDigitalhumanStreamEx(ListUniversalsaasDigitalhumanStreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.stream.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanStreamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 关闭实时流接口
     * Summary: 关闭实时流接口</p>
     */
    public StopUniversalsaasDigitalhumanStreamResponse stopUniversalsaasDigitalhumanStream(StopUniversalsaasDigitalhumanStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopUniversalsaasDigitalhumanStreamEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 关闭实时流接口
     * Summary: 关闭实时流接口</p>
     */
    public StopUniversalsaasDigitalhumanStreamResponse stopUniversalsaasDigitalhumanStreamEx(StopUniversalsaasDigitalhumanStreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.stream.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopUniversalsaasDigitalhumanStreamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 大模型对话配置明细
     * Summary: 大模型对话配置明细</p>
     */
    public DetailUniversalsaasDigitalhumanLlmChatResponse detailUniversalsaasDigitalhumanLlmChat(DetailUniversalsaasDigitalhumanLlmChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 大模型对话配置明细
     * Summary: 大模型对话配置明细</p>
     */
    public DetailUniversalsaasDigitalhumanLlmChatResponse detailUniversalsaasDigitalhumanLlmChatEx(DetailUniversalsaasDigitalhumanLlmChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.chat.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailUniversalsaasDigitalhumanLlmChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增大模型对话配置
     * Summary: 新增大模型对话配置</p>
     */
    public AddUniversalsaasDigitalhumanLlmChatResponse addUniversalsaasDigitalhumanLlmChat(AddUniversalsaasDigitalhumanLlmChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增大模型对话配置
     * Summary: 新增大模型对话配置</p>
     */
    public AddUniversalsaasDigitalhumanLlmChatResponse addUniversalsaasDigitalhumanLlmChatEx(AddUniversalsaasDigitalhumanLlmChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.chat.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanLlmChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新大模型对话配置
     * Summary: 更新大模型对话配置</p>
     */
    public UpdateUniversalsaasDigitalhumanLlmChatResponse updateUniversalsaasDigitalhumanLlmChat(UpdateUniversalsaasDigitalhumanLlmChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新大模型对话配置
     * Summary: 更新大模型对话配置</p>
     */
    public UpdateUniversalsaasDigitalhumanLlmChatResponse updateUniversalsaasDigitalhumanLlmChatEx(UpdateUniversalsaasDigitalhumanLlmChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.chat.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanLlmChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除大模型对话配置
     * Summary: 删除大模型对话配置</p>
     */
    public DeleteUniversalsaasDigitalhumanLlmChatResponse deleteUniversalsaasDigitalhumanLlmChat(DeleteUniversalsaasDigitalhumanLlmChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除大模型对话配置
     * Summary: 删除大模型对话配置</p>
     */
    public DeleteUniversalsaasDigitalhumanLlmChatResponse deleteUniversalsaasDigitalhumanLlmChatEx(DeleteUniversalsaasDigitalhumanLlmChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.chat.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanLlmChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增模型配置
     * Summary: 新增模型配置</p>
     */
    public AddUniversalsaasDigitalhumanLlmModelResponse addUniversalsaasDigitalhumanLlmModel(AddUniversalsaasDigitalhumanLlmModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增模型配置
     * Summary: 新增模型配置</p>
     */
    public AddUniversalsaasDigitalhumanLlmModelResponse addUniversalsaasDigitalhumanLlmModelEx(AddUniversalsaasDigitalhumanLlmModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.model.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanLlmModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除模型配置
     * Summary: 删除模型配置</p>
     */
    public DeleteUniversalsaasDigitalhumanLlmModelResponse deleteUniversalsaasDigitalhumanLlmModel(DeleteUniversalsaasDigitalhumanLlmModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除模型配置
     * Summary: 删除模型配置</p>
     */
    public DeleteUniversalsaasDigitalhumanLlmModelResponse deleteUniversalsaasDigitalhumanLlmModelEx(DeleteUniversalsaasDigitalhumanLlmModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.model.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanLlmModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新模型配置
     * Summary: 更新模型配置</p>
     */
    public UpdateUniversalsaasDigitalhumanLlmModelResponse updateUniversalsaasDigitalhumanLlmModel(UpdateUniversalsaasDigitalhumanLlmModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新模型配置
     * Summary: 更新模型配置</p>
     */
    public UpdateUniversalsaasDigitalhumanLlmModelResponse updateUniversalsaasDigitalhumanLlmModelEx(UpdateUniversalsaasDigitalhumanLlmModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.model.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanLlmModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模型配置列表
     * Summary: 获取模型配置列表</p>
     */
    public ListUniversalsaasDigitalhumanLlmModelResponse listUniversalsaasDigitalhumanLlmModel(ListUniversalsaasDigitalhumanLlmModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模型配置列表
     * Summary: 获取模型配置列表</p>
     */
    public ListUniversalsaasDigitalhumanLlmModelResponse listUniversalsaasDigitalhumanLlmModelEx(ListUniversalsaasDigitalhumanLlmModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.model.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanLlmModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询模型配置明细
     * Summary: 查询模型配置明细</p>
     */
    public DetailUniversalsaasDigitalhumanLlmModelResponse detailUniversalsaasDigitalhumanLlmModel(DetailUniversalsaasDigitalhumanLlmModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询模型配置明细
     * Summary: 查询模型配置明细</p>
     */
    public DetailUniversalsaasDigitalhumanLlmModelResponse detailUniversalsaasDigitalhumanLlmModelEx(DetailUniversalsaasDigitalhumanLlmModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.model.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailUniversalsaasDigitalhumanLlmModelResponse());
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
