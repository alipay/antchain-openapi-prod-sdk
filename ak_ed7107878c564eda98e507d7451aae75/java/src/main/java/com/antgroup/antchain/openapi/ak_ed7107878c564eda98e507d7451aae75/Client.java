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
                    new TeaPair("sdk_version", "1.0.3"),
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
     * Description: 数字人角色列表查询接口
     * Summary: 数字人角色列表查询接口
     */
    public ListUniversalsaasDigitalhumanHumanResponse listUniversalsaasDigitalhumanHuman(ListUniversalsaasDigitalhumanHumanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
    }

    /**
     * Description: 数字人角色列表查询接口
     * Summary: 数字人角色列表查询接口
     */
    public ListUniversalsaasDigitalhumanHumanResponse listUniversalsaasDigitalhumanHumanEx(ListUniversalsaasDigitalhumanHumanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.human.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanHumanResponse());
    }

    /**
     * Description: 知识库列表查询接口
     * Summary: 知识库列表查询接口
     */
    public ListUniversalsaasDigitalhumanLibraryResponse listUniversalsaasDigitalhumanLibrary(ListUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * Description: 知识库列表查询接口
     * Summary: 知识库列表查询接口
     */
    public ListUniversalsaasDigitalhumanLibraryResponse listUniversalsaasDigitalhumanLibraryEx(ListUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * Description: 创建知识库接口
     * Summary: 创建知识库接口
     */
    public AddUniversalsaasDigitalhumanLibraryResponse addUniversalsaasDigitalhumanLibrary(AddUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * Description: 创建知识库接口
     * Summary: 创建知识库接口
     */
    public AddUniversalsaasDigitalhumanLibraryResponse addUniversalsaasDigitalhumanLibraryEx(AddUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * Description: 编辑知识库接口
     * Summary: 编辑知识库接口
     */
    public UpdateUniversalsaasDigitalhumanLibraryResponse updateUniversalsaasDigitalhumanLibrary(UpdateUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * Description: 编辑知识库接口
     * Summary: 编辑知识库接口
     */
    public UpdateUniversalsaasDigitalhumanLibraryResponse updateUniversalsaasDigitalhumanLibraryEx(UpdateUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * Description: 删除知识库接口
     * Summary: 删除知识库接口
     */
    public DeleteUniversalsaasDigitalhumanLibraryResponse deleteUniversalsaasDigitalhumanLibrary(DeleteUniversalsaasDigitalhumanLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
    }

    /**
     * Description: 删除知识库接口
     * Summary: 删除知识库接口
     */
    public DeleteUniversalsaasDigitalhumanLibraryResponse deleteUniversalsaasDigitalhumanLibraryEx(DeleteUniversalsaasDigitalhumanLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.library.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanLibraryResponse());
    }

    /**
     * Description: 新增知识点接口
     * Summary: 新增知识点接口
     */
    public AddUniversalsaasDigitalhumanKnowledgeResponse addUniversalsaasDigitalhumanKnowledge(AddUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * Description: 新增知识点接口
     * Summary: 新增知识点接口
     */
    public AddUniversalsaasDigitalhumanKnowledgeResponse addUniversalsaasDigitalhumanKnowledgeEx(AddUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * Description: 编辑知识点接口
     * Summary: 编辑知识点接口
     */
    public UpdateUniversalsaasDigitalhumanKnowledgeResponse updateUniversalsaasDigitalhumanKnowledge(UpdateUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * Description: 编辑知识点接口
     * Summary: 编辑知识点接口
     */
    public UpdateUniversalsaasDigitalhumanKnowledgeResponse updateUniversalsaasDigitalhumanKnowledgeEx(UpdateUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * Description: 发布知识点接口
     * Summary: 发布知识点接口
     */
    public OnlineUniversalsaasDigitalhumanKnowledgeResponse onlineUniversalsaasDigitalhumanKnowledge(OnlineUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * Description: 发布知识点接口
     * Summary: 发布知识点接口
     */
    public OnlineUniversalsaasDigitalhumanKnowledgeResponse onlineUniversalsaasDigitalhumanKnowledgeEx(OnlineUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * Description: 下线知识点接口
     * Summary: 下线知识点接口
     */
    public OfflineUniversalsaasDigitalhumanKnowledgeResponse offlineUniversalsaasDigitalhumanKnowledge(OfflineUniversalsaasDigitalhumanKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
    }

    /**
     * Description: 下线知识点接口
     * Summary: 下线知识点接口
     */
    public OfflineUniversalsaasDigitalhumanKnowledgeResponse offlineUniversalsaasDigitalhumanKnowledgeEx(OfflineUniversalsaasDigitalhumanKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineUniversalsaasDigitalhumanKnowledgeResponse());
    }

    /**
     * Description: 查询大模型对话列表接口
     * Summary: 查询大模型对话列表接口
     */
    public ListUniversalsaasDigitalhumanLlmChatResponse listUniversalsaasDigitalhumanLlmChat(ListUniversalsaasDigitalhumanLlmChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
    }

    /**
     * Description: 查询大模型对话列表接口
     * Summary: 查询大模型对话列表接口
     */
    public ListUniversalsaasDigitalhumanLlmChatResponse listUniversalsaasDigitalhumanLlmChatEx(ListUniversalsaasDigitalhumanLlmChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.llm.chat.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanLlmChatResponse());
    }

    /**
     * Description: 新增交互配置接口
     * Summary: 新增交互配置接口
     */
    public AddUniversalsaasDigitalhumanChatSettingResponse addUniversalsaasDigitalhumanChatSetting(AddUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * Description: 新增交互配置接口
     * Summary: 新增交互配置接口
     */
    public AddUniversalsaasDigitalhumanChatSettingResponse addUniversalsaasDigitalhumanChatSettingEx(AddUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * Description: 编辑交互配置接口
     * Summary: 编辑交互配置接口
     */
    public SetUniversalsaasDigitalhumanChatSettingResponse setUniversalsaasDigitalhumanChatSetting(SetUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * Description: 编辑交互配置接口
     * Summary: 编辑交互配置接口
     */
    public SetUniversalsaasDigitalhumanChatSettingResponse setUniversalsaasDigitalhumanChatSettingEx(SetUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * Description: 删除交互配置接口
     * Summary: 删除交互配置接口
     */
    public DeleteUniversalsaasDigitalhumanChatSettingResponse deleteUniversalsaasDigitalhumanChatSetting(DeleteUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * Description: 删除交互配置接口
     * Summary: 删除交互配置接口
     */
    public DeleteUniversalsaasDigitalhumanChatSettingResponse deleteUniversalsaasDigitalhumanChatSettingEx(DeleteUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * Description: 发布交互配置接口
     * Summary: 发布交互配置接口
     */
    public OnlineUniversalsaasDigitalhumanChatSettingResponse onlineUniversalsaasDigitalhumanChatSetting(OnlineUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * Description: 发布交互配置接口
     * Summary: 发布交互配置接口
     */
    public OnlineUniversalsaasDigitalhumanChatSettingResponse onlineUniversalsaasDigitalhumanChatSettingEx(OnlineUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * Description: 下线交互配置接口
     * Summary: 下线交互配置接口
     */
    public OfflineUniversalsaasDigitalhumanChatSettingResponse offlineUniversalsaasDigitalhumanChatSetting(OfflineUniversalsaasDigitalhumanChatSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
    }

    /**
     * Description: 下线交互配置接口
     * Summary: 下线交互配置接口
     */
    public OfflineUniversalsaasDigitalhumanChatSettingResponse offlineUniversalsaasDigitalhumanChatSettingEx(OfflineUniversalsaasDigitalhumanChatSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineUniversalsaasDigitalhumanChatSettingResponse());
    }

    /**
     * Description: 查询批量导入任务
     * Summary: 查询批量导入任务
     */
    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse queryUniversalsaasDigitalhumanKnowledgeImporttask(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询批量导入任务
     * Summary: 查询批量导入任务
     */
    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse queryUniversalsaasDigitalhumanKnowledgeImporttaskEx(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.importtask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse());
    }
}
