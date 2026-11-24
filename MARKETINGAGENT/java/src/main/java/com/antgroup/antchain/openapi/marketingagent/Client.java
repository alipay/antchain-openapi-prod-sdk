// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.marketingagent.models.*;

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
                    new TeaPair("sdk_version", "1.0.9"),
                    new TeaPair("_prod_code", "MARKETINGAGENT"),
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
     * <p>Description: 创意素材中心chat生图接口
     * Summary: 创意素材中心chat生图接口</p>
     */
    public ExecChatCreativeResponse execChatCreative(ExecChatCreativeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execChatCreativeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创意素材中心chat生图接口
     * Summary: 创意素材中心chat生图接口</p>
     */
    public ExecChatCreativeResponse execChatCreativeEx(ExecChatCreativeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.chat.creative.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecChatCreativeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创意素材chat接口
     * Summary: 创意素材chat接口</p>
     */
    public ExecCreativeChatResponse execCreativeChat(ExecCreativeChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCreativeChatEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创意素材chat接口
     * Summary: 创意素材chat接口</p>
     */
    public ExecCreativeChatResponse execCreativeChatEx(ExecCreativeChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.chat.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCreativeChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: chat结果查询接口
     * Summary: chat结果查询接口</p>
     */
    public QueryCreativeResultResponse queryCreativeResult(QueryCreativeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: chat结果查询接口
     * Summary: chat结果查询接口</p>
     */
    public QueryCreativeResultResponse queryCreativeResultEx(QueryCreativeResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: credit查询
     * Summary: credit查询</p>
     */
    public QueryTaskCreditResponse queryTaskCredit(QueryTaskCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTaskCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: credit查询
     * Summary: credit查询</p>
     */
    public QueryTaskCreditResponse queryTaskCreditEx(QueryTaskCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.task.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTaskCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 素材查询接口
     * Summary: 素材查询接口</p>
     */
    public QueryCreativeMaterialResponse queryCreativeMaterial(QueryCreativeMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeMaterialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 素材查询接口
     * Summary: 素材查询接口</p>
     */
    public QueryCreativeMaterialResponse queryCreativeMaterialEx(QueryCreativeMaterialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.material.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeMaterialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AI视频生成接口
     * Summary: AI视频生成接口</p>
     */
    public ExecCreativeVideoResponse execCreativeVideo(ExecCreativeVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCreativeVideoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI视频生成接口
     * Summary: AI视频生成接口</p>
     */
    public ExecCreativeVideoResponse execCreativeVideoEx(ExecCreativeVideoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.video.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCreativeVideoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 视频任务查询接口
     * Summary: 视频任务查询接口</p>
     */
    public QueryCreativeVideoResponse queryCreativeVideo(QueryCreativeVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeVideoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 视频任务查询接口
     * Summary: 视频任务查询接口</p>
     */
    public QueryCreativeVideoResponse queryCreativeVideoEx(QueryCreativeVideoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.video.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeVideoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
     * Summary: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。</p>
     */
    public ExecCreativeImageeditResponse execCreativeImageedit(ExecCreativeImageeditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCreativeImageeditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
     * Summary: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。</p>
     */
    public ExecCreativeImageeditResponse execCreativeImageeditEx(ExecCreativeImageeditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.imageedit.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCreativeImageeditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
     * Summary: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。</p>
     */
    public QueryCreativeImageeditResponse queryCreativeImageedit(QueryCreativeImageeditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeImageeditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
     * Summary: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。</p>
     */
    public QueryCreativeImageeditResponse queryCreativeImageeditEx(QueryCreativeImageeditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.imageedit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeImageeditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
     * Summary: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。</p>
     */
    public ExecFileUploadResponse execFileUpload(ExecFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execFileUploadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
     * Summary: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。</p>
     */
    public ExecFileUploadResponse execFileUploadEx(ExecFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.file.upload.exec"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ExecFileUploadResponse execFileUploadResponse = ExecFileUploadResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return execFileUploadResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.file.upload.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecFileUploadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。
     * Summary: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。</p>
     */
    public ExecCreativeScriptResponse execCreativeScript(ExecCreativeScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCreativeScriptEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。
     * Summary: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。</p>
     */
    public ExecCreativeScriptResponse execCreativeScriptEx(ExecCreativeScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.script.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCreativeScriptResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。
     * Summary: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。</p>
     */
    public QueryCreativeScriptResponse queryCreativeScript(QueryCreativeScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeScriptEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。
     * Summary: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。</p>
     */
    public QueryCreativeScriptResponse queryCreativeScriptEx(QueryCreativeScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.script.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeScriptResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。
     * Summary: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。</p>
     */
    public ExecCreativeScriptexpandResponse execCreativeScriptexpand(ExecCreativeScriptexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCreativeScriptexpandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。
     * Summary: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。</p>
     */
    public ExecCreativeScriptexpandResponse execCreativeScriptexpandEx(ExecCreativeScriptexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.scriptexpand.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCreativeScriptexpandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。
     * Summary: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。</p>
     */
    public QueryCreativeScriptexpandResponse queryCreativeScriptexpand(QueryCreativeScriptexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeScriptexpandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。
     * Summary: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。</p>
     */
    public QueryCreativeScriptexpandResponse queryCreativeScriptexpandEx(QueryCreativeScriptexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.scriptexpand.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeScriptexpandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。
     * Summary: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。</p>
     */
    public QueryCreativeTemplateResponse queryCreativeTemplate(QueryCreativeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。
     * Summary: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。</p>
     */
    public QueryCreativeTemplateResponse queryCreativeTemplateEx(QueryCreativeTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 传入视频和修改图片以及要求返回拆解任务id
     * Summary: 传入视频和修改图片以及要求返回拆解任务id</p>
     */
    public ExecCreativeStoryboardResponse execCreativeStoryboard(ExecCreativeStoryboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCreativeStoryboardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 传入视频和修改图片以及要求返回拆解任务id
     * Summary: 传入视频和修改图片以及要求返回拆解任务id</p>
     */
    public ExecCreativeStoryboardResponse execCreativeStoryboardEx(ExecCreativeStoryboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.creative.storyboard.exec"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ExecCreativeStoryboardResponse execCreativeStoryboardResponse = ExecCreativeStoryboardResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return execCreativeStoryboardResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.storyboard.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCreativeStoryboardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询拆解任务结果
     * Summary: 查询拆解任务结果</p>
     */
    public QueryCreativeStoryboardResponse queryCreativeStoryboard(QueryCreativeStoryboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeStoryboardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询拆解任务结果
     * Summary: 查询拆解任务结果</p>
     */
    public QueryCreativeStoryboardResponse queryCreativeStoryboardEx(QueryCreativeStoryboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.creative.storyboard.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                QueryCreativeStoryboardResponse queryCreativeStoryboardResponse = QueryCreativeStoryboardResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryCreativeStoryboardResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.storyboard.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeStoryboardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据拆解结果和新分镜生成视频
     * Summary: 根据拆解结果和新分镜生成视频</p>
     */
    public ExecCreativeRemakeResponse execCreativeRemake(ExecCreativeRemakeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCreativeRemakeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据拆解结果和新分镜生成视频
     * Summary: 根据拆解结果和新分镜生成视频</p>
     */
    public ExecCreativeRemakeResponse execCreativeRemakeEx(ExecCreativeRemakeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.creative.remake.exec"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ExecCreativeRemakeResponse execCreativeRemakeResponse = ExecCreativeRemakeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return execCreativeRemakeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.remake.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCreativeRemakeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询复刻视频生成结果
     * Summary: 查询复刻视频生成结果</p>
     */
    public QueryCreativeRemakeResponse queryCreativeRemake(QueryCreativeRemakeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreativeRemakeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询复刻视频生成结果
     * Summary: 查询复刻视频生成结果</p>
     */
    public QueryCreativeRemakeResponse queryCreativeRemakeEx(QueryCreativeRemakeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.creative.remake.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                QueryCreativeRemakeResponse queryCreativeRemakeResponse = QueryCreativeRemakeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryCreativeRemakeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.remake.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreativeRemakeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 素材上传接口
     * Summary: 素材上传接口</p>
     */
    public PushCreativeMaterialResponse pushCreativeMaterial(PushCreativeMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushCreativeMaterialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 素材上传接口
     * Summary: 素材上传接口</p>
     */
    public PushCreativeMaterialResponse pushCreativeMaterialEx(PushCreativeMaterialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.creative.material.push"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                PushCreativeMaterialResponse pushCreativeMaterialResponse = PushCreativeMaterialResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return pushCreativeMaterialResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.creative.material.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushCreativeMaterialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 视频解析
     * Summary: 视频解析</p>
     */
    public ExecTemplateAnalysisResponse execTemplateAnalysis(ExecTemplateAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execTemplateAnalysisEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 视频解析
     * Summary: 视频解析</p>
     */
    public ExecTemplateAnalysisResponse execTemplateAnalysisEx(ExecTemplateAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.template.analysis.exec"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ExecTemplateAnalysisResponse execTemplateAnalysisResponse = ExecTemplateAnalysisResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return execTemplateAnalysisResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.template.analysis.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecTemplateAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 视频拆解查询
     * Summary: 视频拆解查询</p>
     */
    public QueryTemplateAnalysisResponse queryTemplateAnalysis(QueryTemplateAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTemplateAnalysisEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 视频拆解查询
     * Summary: 视频拆解查询</p>
     */
    public QueryTemplateAnalysisResponse queryTemplateAnalysisEx(QueryTemplateAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antcloud.marketingagent.template.analysis.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                QueryTemplateAnalysisResponse queryTemplateAnalysisResponse = QueryTemplateAnalysisResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryTemplateAnalysisResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.template.analysis.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTemplateAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 摩斯营销智能体A2A开放接口：message:send
     * Summary: message:send</p>
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendMessageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 摩斯营销智能体A2A开放接口：message:send
     * Summary: message:send</p>
     */
    public SendMessageResponse sendMessageEx(SendMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.message.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 摩斯营销智能体A2A开放接口：task:get
     * Summary: 摩斯营销智能体A2A开放接口：task:get</p>
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 摩斯营销智能体A2A开放接口：task:get
     * Summary: 摩斯营销智能体A2A开放接口：task:get</p>
     */
    public GetTaskResponse getTaskEx(GetTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.task.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 京东微信核销数据回调
     * Summary: 京东微信核销数据回调</p>
     */
    public GetComsumeJdResponse getComsumeJd(GetComsumeJdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComsumeJdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 京东微信核销数据回调
     * Summary: 京东微信核销数据回调</p>
     */
    public GetComsumeJdResponse getComsumeJdEx(GetComsumeJdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketingagent.comsume.jd.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetComsumeJdResponse());
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
