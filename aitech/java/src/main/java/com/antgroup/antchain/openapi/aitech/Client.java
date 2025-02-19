// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.aitech.models.*;

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
                    new TeaPair("sdk_version", "1.1.10"),
                    new TeaPair("_prod_code", "AITECH"),
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
     * Description: LOGO/二维码审核
     * Summary: LOGO/二维码审核
     */
    public ApplyAuditImageResponse applyAuditImage(ApplyAuditImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAuditImageEx(request, headers, runtime);
    }

    /**
     * Description: LOGO/二维码审核
     * Summary: LOGO/二维码审核
     */
    public ApplyAuditImageResponse applyAuditImageEx(ApplyAuditImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.image.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAuditImageResponse());
    }

    /**
     * Description: 主站审核能力回调
     * Summary: 主站审核能力回调
     */
    public CallbackSofaAuditResponse callbackSofaAudit(CallbackSofaAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackSofaAuditEx(request, headers, runtime);
    }

    /**
     * Description: 主站审核能力回调
     * Summary: 主站审核能力回调
     */
    public CallbackSofaAuditResponse callbackSofaAuditEx(CallbackSofaAuditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.sofa.audit.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackSofaAuditResponse());
    }

    /**
     * Description: 文本审核入审
     * Summary: 文本审核入审
     */
    public SubmitAuditTextResponse submitAuditText(SubmitAuditTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuditTextEx(request, headers, runtime);
    }

    /**
     * Description: 文本审核入审
     * Summary: 文本审核入审
     */
    public SubmitAuditTextResponse submitAuditTextEx(SubmitAuditTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.text.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuditTextResponse());
    }

    /**
     * Description: 文本审核查询
     * Summary: 文本审核查询
     */
    public QueryAuditTextResponse queryAuditText(QueryAuditTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuditTextEx(request, headers, runtime);
    }

    /**
     * Description: 文本审核查询
     * Summary: 文本审核查询
     */
    public QueryAuditTextResponse queryAuditTextEx(QueryAuditTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.text.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuditTextResponse());
    }

    /**
     * Description: 图片审核入审
     * Summary: 图片审核入审
     */
    public SubmitAuditImageResponse submitAuditImage(SubmitAuditImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuditImageEx(request, headers, runtime);
    }

    /**
     * Description: 图片审核入审
     * Summary: 图片审核入审
     */
    public SubmitAuditImageResponse submitAuditImageEx(SubmitAuditImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.image.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuditImageResponse());
    }

    /**
     * Description: 图片审核查询
     * Summary: 图片审核查询
     */
    public QueryAuditImageResponse queryAuditImage(QueryAuditImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuditImageEx(request, headers, runtime);
    }

    /**
     * Description: 图片审核查询
     * Summary: 图片审核查询
     */
    public QueryAuditImageResponse queryAuditImageEx(QueryAuditImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.image.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuditImageResponse());
    }

    /**
     * Description: 音频审核入审
     * Summary: 音频审核入审
     */
    public SubmitAuditAudioResponse submitAuditAudio(SubmitAuditAudioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuditAudioEx(request, headers, runtime);
    }

    /**
     * Description: 音频审核入审
     * Summary: 音频审核入审
     */
    public SubmitAuditAudioResponse submitAuditAudioEx(SubmitAuditAudioRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.audio.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuditAudioResponse());
    }

    /**
     * Description: 音频审核查询
     * Summary: 音频审核查询
     */
    public QueryAuditAudioResponse queryAuditAudio(QueryAuditAudioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuditAudioEx(request, headers, runtime);
    }

    /**
     * Description: 音频审核查询
     * Summary: 音频审核查询
     */
    public QueryAuditAudioResponse queryAuditAudioEx(QueryAuditAudioRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.audio.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuditAudioResponse());
    }

    /**
     * Description: 视频审核入审
     * Summary: 视频审核入审
     */
    public SubmitAuditVideoResponse submitAuditVideo(SubmitAuditVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuditVideoEx(request, headers, runtime);
    }

    /**
     * Description: 视频审核入审
     * Summary: 视频审核入审
     */
    public SubmitAuditVideoResponse submitAuditVideoEx(SubmitAuditVideoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.video.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuditVideoResponse());
    }

    /**
     * Description: 视频审核查询
     * Summary: 视频审核查询
     */
    public QueryAuditVideoResponse queryAuditVideo(QueryAuditVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuditVideoEx(request, headers, runtime);
    }

    /**
     * Description: 视频审核查询
     * Summary: 视频审核查询
     */
    public QueryAuditVideoResponse queryAuditVideoEx(QueryAuditVideoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.video.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuditVideoResponse());
    }

    /**
     * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
     * Summary: 文本同步审核
     */
    public ApplyAuditTextResponse applyAuditText(ApplyAuditTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAuditTextEx(request, headers, runtime);
    }

    /**
     * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
     * Summary: 文本同步审核
     */
    public ApplyAuditTextResponse applyAuditTextEx(ApplyAuditTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.text.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAuditTextResponse());
    }

    /**
     * Description: 同步接口，只调用机审能力
     * Summary: 图片机审基础版
     */
    public ApplyAuditImagebaseResponse applyAuditImagebase(ApplyAuditImagebaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAuditImagebaseEx(request, headers, runtime);
    }

    /**
     * Description: 同步接口，只调用机审能力
     * Summary: 图片机审基础版
     */
    public ApplyAuditImagebaseResponse applyAuditImagebaseEx(ApplyAuditImagebaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.imagebase.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAuditImagebaseResponse());
    }

    /**
     * Description: 同步接口，只调用机审能力
     * Summary: 图片审核增强版
     */
    public ApplyAuditImageadvancedResponse applyAuditImageadvanced(ApplyAuditImageadvancedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAuditImageadvancedEx(request, headers, runtime);
    }

    /**
     * Description: 同步接口，只调用机审能力
     * Summary: 图片审核增强版
     */
    public ApplyAuditImageadvancedResponse applyAuditImageadvancedEx(ApplyAuditImageadvancedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.imageadvanced.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAuditImageadvancedResponse());
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版入审
     */
    public SubmitAuditAudiobaseResponse submitAuditAudiobase(SubmitAuditAudiobaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuditAudiobaseEx(request, headers, runtime);
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版入审
     */
    public SubmitAuditAudiobaseResponse submitAuditAudiobaseEx(SubmitAuditAudiobaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.audiobase.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuditAudiobaseResponse());
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版查询
     */
    public QueryAuditAudiobaseResponse queryAuditAudiobase(QueryAuditAudiobaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuditAudiobaseEx(request, headers, runtime);
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版查询
     */
    public QueryAuditAudiobaseResponse queryAuditAudiobaseEx(QueryAuditAudiobaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.audiobase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuditAudiobaseResponse());
    }

    /**
     * Description: 异步通知，只调用机审能力
     * Summary: 视频审核通用版入审
     */
    public SubmitAuditVideobaseResponse submitAuditVideobase(SubmitAuditVideobaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAuditVideobaseEx(request, headers, runtime);
    }

    /**
     * Description: 异步通知，只调用机审能力
     * Summary: 视频审核通用版入审
     */
    public SubmitAuditVideobaseResponse submitAuditVideobaseEx(SubmitAuditVideobaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.videobase.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAuditVideobaseResponse());
    }

    /**
     * Description: 异步查询
     * Summary: 视频审核通用版查询
     */
    public QueryAuditVideobaseResponse queryAuditVideobase(QueryAuditVideobaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuditVideobaseEx(request, headers, runtime);
    }

    /**
     * Description: 异步查询
     * Summary: 视频审核通用版查询
     */
    public QueryAuditVideobaseResponse queryAuditVideobaseEx(QueryAuditVideobaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.audit.videobase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuditVideobaseResponse());
    }

    /**
     * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
     * Summary: 阿里云内容审核回调
     */
    public CallbackAliyunAuditResponse callbackAliyunAudit(CallbackAliyunAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackAliyunAuditEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
     * Summary: 阿里云内容审核回调
     */
    public CallbackAliyunAuditResponse callbackAliyunAuditEx(CallbackAliyunAuditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.aliyun.audit.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackAliyunAuditResponse());
    }

    /**
     * Description: 红色GPT流式调用网关接口
     * Summary: 红色GPT网关方式调用接口
     */
    public QueryGuardcoreRedgptResponse queryGuardcoreRedgpt(QueryGuardcoreRedgptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardcoreRedgptEx(request, headers, runtime);
    }

    /**
     * Description: 红色GPT流式调用网关接口
     * Summary: 红色GPT网关方式调用接口
     */
    public QueryGuardcoreRedgptResponse queryGuardcoreRedgptEx(QueryGuardcoreRedgptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.guardcore.redgpt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardcoreRedgptResponse());
    }

    /**
     * Description: 阿里云ADB调用接口
     * Summary: 阿里云ADB调用接口
     */
    public QueryAicoguardAdbsinkResponse queryAicoguardAdbsink(QueryAicoguardAdbsinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAicoguardAdbsinkEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云ADB调用接口
     * Summary: 阿里云ADB调用接口
     */
    public QueryAicoguardAdbsinkResponse queryAicoguardAdbsinkEx(QueryAicoguardAdbsinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "aitech.comm.aicoguard.adbsink.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAicoguardAdbsinkResponse());
    }
}
