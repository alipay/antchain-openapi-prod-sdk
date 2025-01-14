// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models.*;

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
                    new TeaPair("sdk_version", "1.2.4"),
                    new TeaPair("_prod_code", "ak_245215eadadd4dc9bba177d6ba6d593d"),
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
     * Description: 数字人音色列表
     * Summary: 数字人音色列表
     */
    public ListUniversalsaasDigitalhumanVideoVoiceResponse listUniversalsaasDigitalhumanVideoVoice(ListUniversalsaasDigitalhumanVideoVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanVideoVoiceEx(request, headers, runtime);
    }

    /**
     * Description: 数字人音色列表
     * Summary: 数字人音色列表
     */
    public ListUniversalsaasDigitalhumanVideoVoiceResponse listUniversalsaasDigitalhumanVideoVoiceEx(ListUniversalsaasDigitalhumanVideoVoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.video.voice.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanVideoVoiceResponse());
    }

    /**
     * Description: 数字人短视频形象列表
     * Summary: 数字人短视频形象列表
     */
    public ListUniversalsaasDigitalhumanVideoProfileResponse listUniversalsaasDigitalhumanVideoProfile(ListUniversalsaasDigitalhumanVideoProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUniversalsaasDigitalhumanVideoProfileEx(request, headers, runtime);
    }

    /**
     * Description: 数字人短视频形象列表
     * Summary: 数字人短视频形象列表
     */
    public ListUniversalsaasDigitalhumanVideoProfileResponse listUniversalsaasDigitalhumanVideoProfileEx(ListUniversalsaasDigitalhumanVideoProfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.video.profile.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListUniversalsaasDigitalhumanVideoProfileResponse());
    }

    /**
     * Description: 视频合成任务生成
     * Summary: 视频合成任务生成
     */
    public CreateUniversalsaasDigitalhumanVideoTaskResponse createUniversalsaasDigitalhumanVideoTask(CreateUniversalsaasDigitalhumanVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime);
    }

    /**
     * Description: 视频合成任务生成
     * Summary: 视频合成任务生成
     */
    public CreateUniversalsaasDigitalhumanVideoTaskResponse createUniversalsaasDigitalhumanVideoTaskEx(CreateUniversalsaasDigitalhumanVideoTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.video.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanVideoTaskResponse());
    }

    /**
     * Description: 视频合成任务查询
     * Summary: 视频合成任务查询
     */
    public QueryUniversalsaasDigitalhumanVideoTaskResponse queryUniversalsaasDigitalhumanVideoTask(QueryUniversalsaasDigitalhumanVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime);
    }

    /**
     * Description: 视频合成任务查询
     * Summary: 视频合成任务查询
     */
    public QueryUniversalsaasDigitalhumanVideoTaskResponse queryUniversalsaasDigitalhumanVideoTaskEx(QueryUniversalsaasDigitalhumanVideoTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.video.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanVideoTaskResponse());
    }

    /**
     * Description: 数字人短文本试听接口
     * Summary: 数字人短文本试听接口
     */
    public CreateUniversalsaasDigitalhumanVoiceResponse createUniversalsaasDigitalhumanVoice(CreateUniversalsaasDigitalhumanVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
    }

    /**
     * Description: 数字人短文本试听接口
     * Summary: 数字人短文本试听接口
     */
    public CreateUniversalsaasDigitalhumanVoiceResponse createUniversalsaasDigitalhumanVoiceEx(CreateUniversalsaasDigitalhumanVoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.voice.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanVoiceResponse());
    }

    /**
     * Description: 极速训练数字人分身，返回modelId
     * Summary: 训练数字人分身
     */
    public CloneUniversalsaasDigitalhumanAvatarResponse cloneUniversalsaasDigitalhumanAvatar(CloneUniversalsaasDigitalhumanAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneUniversalsaasDigitalhumanAvatarEx(request, headers, runtime);
    }

    /**
     * Description: 极速训练数字人分身，返回modelId
     * Summary: 训练数字人分身
     */
    public CloneUniversalsaasDigitalhumanAvatarResponse cloneUniversalsaasDigitalhumanAvatarEx(CloneUniversalsaasDigitalhumanAvatarRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.avatar.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneUniversalsaasDigitalhumanAvatarResponse());
    }

    /**
     * Description: 音色克隆
     * Summary: 音色克隆
     */
    public CloneUniversalsaasDigitalhumanAvatarVoiceResponse cloneUniversalsaasDigitalhumanAvatarVoice(CloneUniversalsaasDigitalhumanAvatarVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneUniversalsaasDigitalhumanAvatarVoiceEx(request, headers, runtime);
    }

    /**
     * Description: 音色克隆
     * Summary: 音色克隆
     */
    public CloneUniversalsaasDigitalhumanAvatarVoiceResponse cloneUniversalsaasDigitalhumanAvatarVoiceEx(CloneUniversalsaasDigitalhumanAvatarVoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.avatar.voice.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneUniversalsaasDigitalhumanAvatarVoiceResponse());
    }

    /**
     * Description: 训练数字人分身任务查询
     * Summary: 训练数字人分身任务查询
     */
    public QueryUniversalsaasDigitalhumanCloneTaskResponse queryUniversalsaasDigitalhumanCloneTask(QueryUniversalsaasDigitalhumanCloneTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUniversalsaasDigitalhumanCloneTaskEx(request, headers, runtime);
    }

    /**
     * Description: 训练数字人分身任务查询
     * Summary: 训练数字人分身任务查询
     */
    public QueryUniversalsaasDigitalhumanCloneTaskResponse queryUniversalsaasDigitalhumanCloneTaskEx(QueryUniversalsaasDigitalhumanCloneTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.clone.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanCloneTaskResponse());
    }

    /**
     * Description: 数字人音频生成接口
     * Summary: 数字人音频生成接口
     */
    public CreateUniversalsaasDigitalhumanVoiceTaskResponse createUniversalsaasDigitalhumanVoiceTask(CreateUniversalsaasDigitalhumanVoiceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUniversalsaasDigitalhumanVoiceTaskEx(request, headers, runtime);
    }

    /**
     * Description: 数字人音频生成接口
     * Summary: 数字人音频生成接口
     */
    public CreateUniversalsaasDigitalhumanVoiceTaskResponse createUniversalsaasDigitalhumanVoiceTaskEx(CreateUniversalsaasDigitalhumanVoiceTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.voice.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanVoiceTaskResponse());
    }

    /**
     * Description: 音频生成任务查询接口
     * Summary: 音频生成任务查询接口
     */
    public QueryUniversalsaasDigitalhumanVoiceTaskResponse queryUniversalsaasDigitalhumanVoiceTask(QueryUniversalsaasDigitalhumanVoiceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUniversalsaasDigitalhumanVoiceTaskEx(request, headers, runtime);
    }

    /**
     * Description: 音频生成任务查询接口
     * Summary: 音频生成任务查询接口
     */
    public QueryUniversalsaasDigitalhumanVoiceTaskResponse queryUniversalsaasDigitalhumanVoiceTaskEx(QueryUniversalsaasDigitalhumanVoiceTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.voice.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanVoiceTaskResponse());
    }

    /**
     * Description: 获取数字人动作序列接口
     * Summary: 获取数字人动作序列接口
     */
    public QueryUniversalsaasDigitalhumanAvatarActionResponse queryUniversalsaasDigitalhumanAvatarAction(QueryUniversalsaasDigitalhumanAvatarActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUniversalsaasDigitalhumanAvatarActionEx(request, headers, runtime);
    }

    /**
     * Description: 获取数字人动作序列接口
     * Summary: 获取数字人动作序列接口
     */
    public QueryUniversalsaasDigitalhumanAvatarActionResponse queryUniversalsaasDigitalhumanAvatarActionEx(QueryUniversalsaasDigitalhumanAvatarActionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.avatar.action.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanAvatarActionResponse());
    }

    /**
     * Description: 数字人订单上报接口
     * Summary: 数字人订单上报接口
     */
    public SubmitUniversalsaasDigitalhumanOrderResponse submitUniversalsaasDigitalhumanOrder(SubmitUniversalsaasDigitalhumanOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitUniversalsaasDigitalhumanOrderEx(request, headers, runtime);
    }

    /**
     * Description: 数字人订单上报接口
     * Summary: 数字人订单上报接口
     */
    public SubmitUniversalsaasDigitalhumanOrderResponse submitUniversalsaasDigitalhumanOrderEx(SubmitUniversalsaasDigitalhumanOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.order.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitUniversalsaasDigitalhumanOrderResponse());
    }

    /**
     * Description: 音色检测任务创建
     * Summary: 音色检测任务创建
     */
    public CountUniversalsaasDigitalhumanVoiceNoiseResponse countUniversalsaasDigitalhumanVoiceNoise(CountUniversalsaasDigitalhumanVoiceNoiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countUniversalsaasDigitalhumanVoiceNoiseEx(request, headers, runtime);
    }

    /**
     * Description: 音色检测任务创建
     * Summary: 音色检测任务创建
     */
    public CountUniversalsaasDigitalhumanVoiceNoiseResponse countUniversalsaasDigitalhumanVoiceNoiseEx(CountUniversalsaasDigitalhumanVoiceNoiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.voice.noise.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountUniversalsaasDigitalhumanVoiceNoiseResponse());
    }

    /**
     * Description: 音色检测任务查询接口
     * Summary: 音色检测任务查询接口
     */
    public QueryUniversalsaasDigitalhumanVoiceNoiseResponse queryUniversalsaasDigitalhumanVoiceNoise(QueryUniversalsaasDigitalhumanVoiceNoiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUniversalsaasDigitalhumanVoiceNoiseEx(request, headers, runtime);
    }

    /**
     * Description: 音色检测任务查询接口
     * Summary: 音色检测任务查询接口
     */
    public QueryUniversalsaasDigitalhumanVoiceNoiseResponse queryUniversalsaasDigitalhumanVoiceNoiseEx(QueryUniversalsaasDigitalhumanVoiceNoiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "universalsaas.digitalhuman.voice.noise.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanVoiceNoiseResponse());
    }
}
