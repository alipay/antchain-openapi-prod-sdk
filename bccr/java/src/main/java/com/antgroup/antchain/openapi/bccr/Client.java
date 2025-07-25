// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.bccr.models.*;

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
                    new TeaPair("sdk_version", "1.19.74"),
                    new TeaPair("_prod_code", "BCCR"),
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
     * <p>Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接</p>
     */
    public GetUploadurlResponse getUploadurl(GetUploadurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUploadurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接</p>
     */
    public GetUploadurlResponse getUploadurlEx(GetUploadurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.uploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUploadurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记</p>
     */
    public AddHashregisterResponse addHashregister(AddHashregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addHashregisterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记</p>
     */
    public AddHashregisterResponse addHashregisterEx(AddHashregisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.hashregister.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddHashregisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台新增版权登记
     * Summary: 新增版权登记</p>
     */
    public AddRegisterResponse addRegister(AddRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRegisterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台新增版权登记
     * Summary: 新增版权登记</p>
     */
    public AddRegisterResponse addRegisterEx(AddRegisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.register.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddRegisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态</p>
     */
    public QueryRegisterstatusResponse queryRegisterstatus(QueryRegisterstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRegisterstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态</p>
     */
    public QueryRegisterstatusResponse queryRegisterstatusEx(QueryRegisterstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.registerstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRegisterstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书</p>
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书</p>
     */
    public CreateCertificateResponse createCertificateEx(CreateCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.certificate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书</p>
     */
    public GetCertificateResponse getCertificate(GetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书</p>
     */
    public GetCertificateResponse getCertificateEx(GetCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.certificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增版权监测任务
     * Summary: 新增版权监测</p>
     */
    public CreateMonitorTaskResponse createMonitorTask(CreateMonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增版权监测任务
     * Summary: 新增版权监测</p>
     */
    public CreateMonitorTaskResponse createMonitorTaskEx(CreateMonitorTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMonitorTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 停止版权监测任务
     * Summary: 停止版权监测</p>
     */
    public StopMonitorTaskResponse stopMonitorTask(StopMonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMonitorTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 停止版权监测任务
     * Summary: 停止版权监测</p>
     */
    public StopMonitorTaskResponse stopMonitorTaskEx(StopMonitorTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.task.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopMonitorTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版权监测任务
     * Summary: 查询版权监测</p>
     */
    public QueryMonitorTaskResponse queryMonitorTask(QueryMonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMonitorTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版权监测任务
     * Summary: 查询版权监测</p>
     */
    public QueryMonitorTaskResponse queryMonitorTaskEx(QueryMonitorTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMonitorTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果</p>
     */
    public QueryMonitorResultResponse queryMonitorResult(QueryMonitorResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMonitorResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果</p>
     */
    public QueryMonitorResultResponse queryMonitorResultEx(QueryMonitorResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMonitorResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表</p>
     */
    public ListMonitorProviderResponse listMonitorProvider(ListMonitorProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorProviderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表</p>
     */
    public ListMonitorProviderResponse listMonitorProviderEx(ListMonitorProviderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.provider.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMonitorProviderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃)</p>
     */
    public CreateRecodescreenResponse createRecodescreen(CreateRecodescreenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecodescreenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃)</p>
     */
    public CreateRecodescreenResponse createRecodescreenEx(CreateRecodescreenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recodescreen.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRecodescreenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃)</p>
     */
    public QueryRecodescreenResponse queryRecodescreen(QueryRecodescreenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRecodescreenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃)</p>
     */
    public QueryRecodescreenResponse queryRecodescreenEx(QueryRecodescreenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recodescreen.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRecodescreenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户信息查询
     * Summary: 用户信息查询</p>
     */
    public QueryUserResponse queryUser(QueryUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户信息查询
     * Summary: 用户信息查询</p>
     */
    public QueryUserResponse queryUserEx(QueryUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户信息列表
     * Summary: 查询用户信息列表</p>
     */
    public QueryUserListResponse queryUserList(QueryUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户信息列表
     * Summary: 查询用户信息列表</p>
     */
    public QueryUserListResponse queryUserListEx(QueryUserListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.user.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建网页取证
     * Summary: 创建网页取证</p>
     */
    public CreateScreenshotResponse createScreenshot(CreateScreenshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScreenshotEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建网页取证
     * Summary: 创建网页取证</p>
     */
    public CreateScreenshotResponse createScreenshotEx(CreateScreenshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.screenshot.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateScreenshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询网页取证
     * Summary: 查询网页取证</p>
     */
    public QueryScreenshotResponse queryScreenshot(QueryScreenshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryScreenshotEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询网页取证
     * Summary: 查询网页取证</p>
     */
    public QueryScreenshotResponse queryScreenshotEx(QueryScreenshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.screenshot.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryScreenshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 链上核验
     * Summary: 链上核验</p>
     */
    public VerifyBlockchainResponse verifyBlockchain(VerifyBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyBlockchainEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 链上核验
     * Summary: 链上核验</p>
     */
    public VerifyBlockchainResponse verifyBlockchainEx(VerifyBlockchainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.blockchain.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyBlockchainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建录屏取证
     * Summary: 创建录屏取证</p>
     */
    public CreateRecordscreenResponse createRecordscreen(CreateRecordscreenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecordscreenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建录屏取证
     * Summary: 创建录屏取证</p>
     */
    public CreateRecordscreenResponse createRecordscreenEx(CreateRecordscreenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recordscreen.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRecordscreenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询录屏取证
     * Summary: 查询录屏取证</p>
     */
    public QueryRecordscreenResponse queryRecordscreen(QueryRecordscreenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRecordscreenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询录屏取证
     * Summary: 查询录屏取证</p>
     */
    public QueryRecordscreenResponse queryRecordscreenEx(QueryRecordscreenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recordscreen.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRecordscreenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表</p>
     */
    public ListNotaryResponse listNotary(ListNotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表</p>
     */
    public ListNotaryResponse listNotaryEx(ListNotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListNotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增版权定向监测任务
     * Summary: 新增版权定向监测</p>
     */
    public CreateDirectmonitorTaskResponse createDirectmonitorTask(CreateDirectmonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDirectmonitorTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增版权定向监测任务
     * Summary: 新增版权定向监测</p>
     */
    public CreateDirectmonitorTaskResponse createDirectmonitorTaskEx(CreateDirectmonitorTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.directmonitor.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDirectmonitorTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版权定向监测结果
     * Summary: 查询版权定向监测结果</p>
     */
    public QueryDirectmonitorResultResponse queryDirectmonitorResult(QueryDirectmonitorResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDirectmonitorResultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版权定向监测结果
     * Summary: 查询版权定向监测结果</p>
     */
    public QueryDirectmonitorResultResponse queryDirectmonitorResultEx(QueryDirectmonitorResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.directmonitor.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDirectmonitorResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: DCI预登记
     * Summary: dci预登记</p>
     */
    public CreateDciPreregistrationResponse createDciPreregistration(CreateDciPreregistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDciPreregistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: DCI预登记
     * Summary: dci预登记</p>
     */
    public CreateDciPreregistrationResponse createDciPreregistrationEx(CreateDciPreregistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregistration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDciPreregistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询dci预登记信息
     * Summary: 查询dci预登记信息</p>
     */
    public QueryDciPreregistrationResponse queryDciPreregistration(QueryDciPreregistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPreregistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询dci预登记信息
     * Summary: 查询dci预登记信息</p>
     */
    public QueryDciPreregistrationResponse queryDciPreregistrationEx(QueryDciPreregistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregistration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPreregistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 注册dci账号
     * Summary: 注册dci账号</p>
     */
    public AddDciUserResponse addDciUser(AddDciUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDciUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 注册dci账号
     * Summary: 注册dci账号</p>
     */
    public AddDciUserResponse addDciUserEx(AddDciUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.user.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDciUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: dci预登记再确认
     * Summary: dci预登记再确认</p>
     */
    public RetryDciPreregistrationResponse retryDciPreregistration(RetryDciPreregistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryDciPreregistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: dci预登记再确认
     * Summary: dci预登记再确认</p>
     */
    public RetryDciPreregistrationResponse retryDciPreregistrationEx(RetryDciPreregistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregistration.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryDciPreregistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询dci账号信息
     * Summary: 查询dci账号信息</p>
     */
    public QueryDciUserResponse queryDciUser(QueryDciUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询dci账号信息
     * Summary: 查询dci账号信息</p>
     */
    public QueryDciUserResponse queryDciUserEx(QueryDciUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Dci预登记公示地址查询
     * Summary: Dci预登记公示地址查询</p>
     */
    public QueryDciPreregpublicationResponse queryDciPreregpublication(QueryDciPreregpublicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPreregpublicationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Dci预登记公示地址查询
     * Summary: Dci预登记公示地址查询</p>
     */
    public QueryDciPreregpublicationResponse queryDciPreregpublicationEx(QueryDciPreregpublicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregpublication.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPreregpublicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新dci账号信息
     * Summary: 更新dci账号信息</p>
     */
    public UpdateDciUserResponse updateDciUser(UpdateDciUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDciUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新dci账号信息
     * Summary: 更新dci账号信息</p>
     */
    public UpdateDciUserResponse updateDciUserEx(UpdateDciUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.user.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDciUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起数登申请
     * Summary: 发起数登申请</p>
     */
    public CreateDciRegistrationResponse createDciRegistration(CreateDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDciRegistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起数登申请
     * Summary: 发起数登申请</p>
     */
    public CreateDciRegistrationResponse createDciRegistrationEx(CreateDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDciRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 已废弃接口
     * Summary: 已废弃接口</p>
     */
    public QueryDciRegistrationsubmitResponse queryDciRegistrationsubmit(QueryDciRegistrationsubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciRegistrationsubmitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 已废弃接口
     * Summary: 已废弃接口</p>
     */
    public QueryDciRegistrationsubmitResponse queryDciRegistrationsubmitEx(QueryDciRegistrationsubmitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciRegistrationsubmitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数登结果
     * Summary: 查询数登结果</p>
     */
    public QueryDciRegistrationResponse queryDciRegistration(QueryDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciRegistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数登结果
     * Summary: 查询数登结果</p>
     */
    public QueryDciRegistrationResponse queryDciRegistrationEx(QueryDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接</p>
     */
    public GetDciRegistrationcertResponse getDciRegistrationcert(GetDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接</p>
     */
    public GetDciRegistrationcertResponse getDciRegistrationcertEx(GetDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDciRegistrationcertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询内容安全审核详情
     * Summary: 查询内容安全审核详情</p>
     */
    public QueryDciContentsecurityResponse queryDciContentsecurity(QueryDciContentsecurityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciContentsecurityEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询内容安全审核详情
     * Summary: 查询内容安全审核详情</p>
     */
    public QueryDciContentsecurityResponse queryDciContentsecurityEx(QueryDciContentsecurityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.contentsecurity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciContentsecurityResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建数字登记证书
     * Summary: 创建数字登记证书</p>
     */
    public CreateDciRegistrationcertResponse createDciRegistrationcert(CreateDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建数字登记证书
     * Summary: 创建数字登记证书</p>
     */
    public CreateDciRegistrationcertResponse createDciRegistrationcertEx(CreateDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDciRegistrationcertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 已废弃接口
     * Summary: 已废弃接口</p>
     */
    public QueryDciRegistrationcertResponse queryDciRegistrationcert(QueryDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 已废弃接口
     * Summary: 已废弃接口</p>
     */
    public QueryDciRegistrationcertResponse queryDciRegistrationcertEx(QueryDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciRegistrationcertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付</p>
     */
    public GetDciPayurlResponse getDciPayurl(GetDciPayurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDciPayurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付</p>
     */
    public GetDciPayurlResponse getDciPayurlEx(GetDciPayurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDciPayurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数登支付结果
     * Summary: 查询数登支付结果</p>
     */
    public QueryDciPayResponse queryDciPay(QueryDciPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数登支付结果
     * Summary: 查询数登支付结果</p>
     */
    public QueryDciPayResponse queryDciPayEx(QueryDciPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付结果回调
     * Summary: 数登支付-支付结果回调</p>
     */
    public CallbackDciPayresultResponse callbackDciPayresult(CallbackDciPayresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackDciPayresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付结果回调
     * Summary: 数登支付-支付结果回调</p>
     */
    public CallbackDciPayresultResponse callbackDciPayresultEx(CallbackDciPayresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackDciPayresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调</p>
     */
    public RefuseDciRegistrationResponse refuseDciRegistration(RefuseDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseDciRegistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调</p>
     */
    public RefuseDciRegistrationResponse refuseDciRegistrationEx(RefuseDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseDciRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台获取申办事由配置
     * Summary: 获取申办事由配置</p>
     */
    public QueryNotaryBidreasonResponse queryNotaryBidreason(QueryNotaryBidreasonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryBidreasonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 版权平台获取申办事由配置
     * Summary: 获取申办事由配置</p>
     */
    public QueryNotaryBidreasonResponse queryNotaryBidreasonEx(QueryNotaryBidreasonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.bidreason.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryBidreasonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取签署文件
     * Summary: 获取签署文件</p>
     */
    public QueryNotaryDocumenttosignResponse queryNotaryDocumenttosign(QueryNotaryDocumenttosignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryDocumenttosignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取签署文件
     * Summary: 获取签署文件</p>
     */
    public QueryNotaryDocumenttosignResponse queryNotaryDocumenttosignEx(QueryNotaryDocumenttosignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.documenttosign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryDocumenttosignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交申办订单
     * Summary: 提交申办订单</p>
     */
    public ApplyNotaryOrderResponse applyNotaryOrder(ApplyNotaryOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyNotaryOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交申办订单
     * Summary: 提交申办订单</p>
     */
    public ApplyNotaryOrderResponse applyNotaryOrderEx(ApplyNotaryOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.order.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyNotaryOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证重新获取支付链接
     * Summary: 重新获取支付链接</p>
     */
    public QueryNotaryPayurlResponse queryNotaryPayurl(QueryNotaryPayurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryPayurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证重新获取支付链接
     * Summary: 重新获取支付链接</p>
     */
    public QueryNotaryPayurlResponse queryNotaryPayurlEx(QueryNotaryPayurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.payurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryPayurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证获取收费标准和明细
     * Summary: 获取收费标准和明细</p>
     */
    public QueryNotaryFeedetailResponse queryNotaryFeedetail(QueryNotaryFeedetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryFeedetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证获取收费标准和明细
     * Summary: 获取收费标准和明细</p>
     */
    public QueryNotaryFeedetailResponse queryNotaryFeedetailEx(QueryNotaryFeedetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.feedetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryFeedetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证查询申办订单接口
     * Summary: 查询申办订单接口</p>
     */
    public QueryNotaryOrderResponse queryNotaryOrder(QueryNotaryOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证查询申办订单接口
     * Summary: 查询申办订单接口</p>
     */
    public QueryNotaryOrderResponse queryNotaryOrderEx(QueryNotaryOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证申请出证材料补齐
     * Summary: 申请出证材料补齐</p>
     */
    public UploadNotaryAttachmentResponse uploadNotaryAttachment(UploadNotaryAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadNotaryAttachmentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证申请出证材料补齐
     * Summary: 申请出证材料补齐</p>
     */
    public UploadNotaryAttachmentResponse uploadNotaryAttachmentEx(UploadNotaryAttachmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.attachment.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadNotaryAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证更新申办状态
     * Summary: 更新申办状态</p>
     */
    public OperateNotaryOrderResponse operateNotaryOrder(OperateNotaryOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateNotaryOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证出证更新申办状态
     * Summary: 更新申办状态</p>
     */
    public OperateNotaryOrderResponse operateNotaryOrderEx(OperateNotaryOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.order.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateNotaryOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DCI作品预览结果
     * Summary: 查询DCI作品预览结果</p>
     */
    public QueryDciPreviewResponse queryDciPreview(QueryDciPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPreviewEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DCI作品预览结果
     * Summary: 查询DCI作品预览结果</p>
     */
    public QueryDciPreviewResponse queryDciPreviewEx(QueryDciPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preview.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPreviewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 补正数登申请
     * Summary: 补正数登申请</p>
     */
    public RetryDciRegistrationResponse retryDciRegistration(RetryDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryDciRegistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 补正数登申请
     * Summary: 补正数登申请</p>
     */
    public RetryDciRegistrationResponse retryDciRegistrationEx(RetryDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryDciRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数登停止申请
     * Summary: 数登停止申请</p>
     */
    public CloseDciRegistrationResponse closeDciRegistration(CloseDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeDciRegistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数登停止申请
     * Summary: 数登停止申请</p>
     */
    public CloseDciRegistrationResponse closeDciRegistrationEx(CloseDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseDciRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: dci用户无需证件注册
     * Summary: dci用户无需证件注册</p>
     */
    public AddDciUsernocertResponse addDciUsernocert(AddDciUsernocertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDciUsernocertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: dci用户无需证件注册
     * Summary: dci用户无需证件注册</p>
     */
    public AddDciUsernocertResponse addDciUsernocertEx(AddDciUsernocertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.usernocert.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDciUsernocertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询相似作品下载链接
     * Summary: 查询相似作品下载链接</p>
     */
    public QueryDciSimilarfileResponse queryDciSimilarfile(QueryDciSimilarfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciSimilarfileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询相似作品下载链接
     * Summary: 查询相似作品下载链接</p>
     */
    public QueryDciSimilarfileResponse queryDciSimilarfileEx(QueryDciSimilarfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.similarfile.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciSimilarfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请渠道推广
     * Summary: 申请渠道推广</p>
     */
    public ApplyDciPromotionResponse applyDciPromotion(ApplyDciPromotionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDciPromotionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请渠道推广
     * Summary: 申请渠道推广</p>
     */
    public ApplyDciPromotionResponse applyDciPromotionEx(ApplyDciPromotionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.promotion.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDciPromotionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据手机号查询dci用户
     * Summary: 根据手机号查询dci用户</p>
     */
    public QueryDciUserbyphoneResponse queryDciUserbyphone(QueryDciUserbyphoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciUserbyphoneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据手机号查询dci用户
     * Summary: 根据手机号查询dci用户</p>
     */
    public QueryDciUserbyphoneResponse queryDciUserbyphoneEx(QueryDciUserbyphoneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.userbyphone.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciUserbyphoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支持交易的已进行用途登记的商品查询
     * Summary: 支持交易的商品查询</p>
     */
    public QueryTradeSaleResponse queryTradeSale(QueryTradeSaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTradeSaleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支持交易的已进行用途登记的商品查询
     * Summary: 支持交易的商品查询</p>
     */
    public QueryTradeSaleResponse queryTradeSaleEx(QueryTradeSaleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.trade.sale.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTradeSaleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品交易用途登记
     * Summary: 商品交易用途登记</p>
     */
    public RegisterTradeUsageResponse registerTradeUsage(RegisterTradeUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerTradeUsageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品交易用途登记
     * Summary: 商品交易用途登记</p>
     */
    public RegisterTradeUsageResponse registerTradeUsageEx(RegisterTradeUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.trade.usage.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterTradeUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建取证用户
     * Summary: 创建取证用户</p>
     */
    public CreateEvidenceUserResponse createEvidenceUser(CreateEvidenceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvidenceUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建取证用户
     * Summary: 创建取证用户</p>
     */
    public CreateEvidenceUserResponse createEvidenceUserEx(CreateEvidenceUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.evidence.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEvidenceUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建网页截图
     * Summary: 创建网页截图</p>
     */
    public CreateEvidenceScreenshotResponse createEvidenceScreenshot(CreateEvidenceScreenshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvidenceScreenshotEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建网页截图
     * Summary: 创建网页截图</p>
     */
    public CreateEvidenceScreenshotResponse createEvidenceScreenshotEx(CreateEvidenceScreenshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.evidence.screenshot.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEvidenceScreenshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建网页截图存证
     * Summary: 创建网页截图存证</p>
     */
    public CreateEvidenceRegisterResponse createEvidenceRegister(CreateEvidenceRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvidenceRegisterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建网页截图存证
     * Summary: 创建网页截图存证</p>
     */
    public CreateEvidenceRegisterResponse createEvidenceRegisterEx(CreateEvidenceRegisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.evidence.register.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEvidenceRegisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建录屏取证
     * Summary: 创建录屏取证</p>
     */
    public CreateEvidenceRecordscreenResponse createEvidenceRecordscreen(CreateEvidenceRecordscreenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvidenceRecordscreenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建录屏取证
     * Summary: 创建录屏取证</p>
     */
    public CreateEvidenceRecordscreenResponse createEvidenceRecordscreenEx(CreateEvidenceRecordscreenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.evidence.recordscreen.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEvidenceRecordscreenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品交易用途撤销
     * Summary: 商品交易用途撤销</p>
     */
    public CancelTradeUsageResponse cancelTradeUsage(CancelTradeUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTradeUsageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品交易用途撤销
     * Summary: 商品交易用途撤销</p>
     */
    public CancelTradeUsageResponse cancelTradeUsageEx(CancelTradeUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.trade.usage.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelTradeUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建自动化直播录屏取证
     * Summary: 创建自动化直播取证</p>
     */
    public CreateEvidenceLiveResponse createEvidenceLive(CreateEvidenceLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvidenceLiveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建自动化直播录屏取证
     * Summary: 创建自动化直播取证</p>
     */
    public CreateEvidenceLiveResponse createEvidenceLiveEx(CreateEvidenceLiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.evidence.live.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEvidenceLiveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据点播网站url发起点播取证
     * Summary: 发起点播取证</p>
     */
    public CreateEvidenceVodResponse createEvidenceVod(CreateEvidenceVodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvidenceVodEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据点播网站url发起点播取证
     * Summary: 发起点播取证</p>
     */
    public CreateEvidenceVodResponse createEvidenceVodEx(CreateEvidenceVodRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.evidence.vod.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEvidenceVodResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品交易用途登记结果查询，目前仅用于测试
     * Summary: 商品交易用途登记结果查询</p>
     */
    public GetTradeUsageResponse getTradeUsage(GetTradeUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeUsageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品交易用途登记结果查询，目前仅用于测试
     * Summary: 商品交易用途登记结果查询</p>
     */
    public GetTradeUsageResponse getTradeUsageEx(GetTradeUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.trade.usage.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询取证信息
     * Summary: 查询取证信息</p>
     */
    public GetEvidenceInfoResponse getEvidenceInfo(GetEvidenceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEvidenceInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询取证信息
     * Summary: 查询取证信息</p>
     */
    public GetEvidenceInfoResponse getEvidenceInfoEx(GetEvidenceInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.evidence.info.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetEvidenceInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: DCI变更
     * Summary: DCI变更</p>
     */
    public ReplaceDciResponse replaceDci(ReplaceDciRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceDciEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: DCI变更
     * Summary: DCI变更</p>
     */
    public ReplaceDciResponse replaceDciEx(ReplaceDciRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceDciResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交作品申诉
     * Summary: 提交作品申诉</p>
     */
    public SubmitDciFeedbackResponse submitDciFeedback(SubmitDciFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDciFeedbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交作品申诉
     * Summary: 提交作品申诉</p>
     */
    public SubmitDciFeedbackResponse submitDciFeedbackEx(SubmitDciFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.feedback.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitDciFeedbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询申诉结果
     * Summary: 查询申诉结果</p>
     */
    public QueryDciFeedbackResponse queryDciFeedback(QueryDciFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciFeedbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询申诉结果
     * Summary: 查询申诉结果</p>
     */
    public QueryDciFeedbackResponse queryDciFeedbackEx(QueryDciFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.feedback.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciFeedbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 交易商品抽取封面
     * Summary: 交易商品抽取封面</p>
     */
    public ExecTradeCoverResponse execTradeCover(ExecTradeCoverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execTradeCoverEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 交易商品抽取封面
     * Summary: 交易商品抽取封面</p>
     */
    public ExecTradeCoverResponse execTradeCoverEx(ExecTradeCoverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.trade.cover.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecTradeCoverResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateOrderResponse createOrderEx(CreateOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询订单支付链接
     * Summary: 查询订单支付链接</p>
     */
    public QueryOrderPayurlResponse queryOrderPayurl(QueryOrderPayurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOrderPayurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询订单支付链接
     * Summary: 查询订单支付链接</p>
     */
    public QueryOrderPayurlResponse queryOrderPayurlEx(QueryOrderPayurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOrderPayurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 版保完成数登证书回调
     * Summary: 版保完成数登证书回调</p>
     */
    public FinishDciRegistrationcertResponse finishDciRegistrationcert(FinishDciRegistrationcertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 版保完成数登证书回调
     * Summary: 版保完成数登证书回调</p>
     */
    public FinishDciRegistrationcertResponse finishDciRegistrationcertEx(FinishDciRegistrationcertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishDciRegistrationcertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数登取消接口，目前在待支付状态下适用
     * Summary: 数登取消</p>
     */
    public CancelDciRegistrationResponse cancelDciRegistration(CancelDciRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDciRegistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数登取消接口，目前在待支付状态下适用
     * Summary: 数登取消</p>
     */
    public CancelDciRegistrationResponse cancelDciRegistrationEx(CancelDciRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDciRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法信云网页取证
     * Summary: 法信云网页取证</p>
     */
    public CreateScreenshotNewResponse createScreenshotNew(CreateScreenshotNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScreenshotNewEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法信云网页取证
     * Summary: 法信云网页取证</p>
     */
    public CreateScreenshotNewResponse createScreenshotNewEx(CreateScreenshotNewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.screenshot.new.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateScreenshotNewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保创建订单接口
     * Summary: 骑行保创建订单接口</p>
     */
    public CreateCyclinginsuranceServiceorderResponse createCyclinginsuranceServiceorder(CreateCyclinginsuranceServiceorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCyclinginsuranceServiceorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保创建订单接口
     * Summary: 骑行保创建订单接口</p>
     */
    public CreateCyclinginsuranceServiceorderResponse createCyclinginsuranceServiceorderEx(CreateCyclinginsuranceServiceorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.serviceorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCyclinginsuranceServiceorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 服务商作业人员服务库存查询
     * Summary: 服务商作业人员服务库存查询</p>
     */
    public QueryCyclinginsuranceServiceinventoryResponse queryCyclinginsuranceServiceinventory(QueryCyclinginsuranceServiceinventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCyclinginsuranceServiceinventoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 服务商作业人员服务库存查询
     * Summary: 服务商作业人员服务库存查询</p>
     */
    public QueryCyclinginsuranceServiceinventoryResponse queryCyclinginsuranceServiceinventoryEx(QueryCyclinginsuranceServiceinventoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.serviceinventory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCyclinginsuranceServiceinventoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保查询订单详情
     * Summary: 骑行保查询订单详情</p>
     */
    public QueryCyclinginsuranceOrderdetailResponse queryCyclinginsuranceOrderdetail(QueryCyclinginsuranceOrderdetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCyclinginsuranceOrderdetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保查询订单详情
     * Summary: 骑行保查询订单详情</p>
     */
    public QueryCyclinginsuranceOrderdetailResponse queryCyclinginsuranceOrderdetailEx(QueryCyclinginsuranceOrderdetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.orderdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCyclinginsuranceOrderdetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保取消订单接口
     * Summary: 骑行保取消订单接口</p>
     */
    public CancelCyclinginsuranceServiceorderResponse cancelCyclinginsuranceServiceorder(CancelCyclinginsuranceServiceorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelCyclinginsuranceServiceorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保取消订单接口
     * Summary: 骑行保取消订单接口</p>
     */
    public CancelCyclinginsuranceServiceorderResponse cancelCyclinginsuranceServiceorderEx(CancelCyclinginsuranceServiceorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.serviceorder.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelCyclinginsuranceServiceorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保租中换电审核结果回调
     * Summary: 骑行保租中换电审核结果回调</p>
     */
    public NotifyCyclinginsuranceMidchangeserviceorderauditResponse notifyCyclinginsuranceMidchangeserviceorderaudit(NotifyCyclinginsuranceMidchangeserviceorderauditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyCyclinginsuranceMidchangeserviceorderauditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 骑行保租中换电审核结果回调
     * Summary: 骑行保租中换电审核结果回调</p>
     */
    public NotifyCyclinginsuranceMidchangeserviceorderauditResponse notifyCyclinginsuranceMidchangeserviceorderauditEx(NotifyCyclinginsuranceMidchangeserviceorderauditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.midchangeserviceorderaudit.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyCyclinginsuranceMidchangeserviceorderauditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加发布视频内容
     * Summary: 发布视频内容</p>
     */
    public AddContentResponse addContent(AddContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加发布视频内容
     * Summary: 发布视频内容</p>
     */
    public AddContentResponse addContentEx(AddContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.content.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询视频内容状态
     * Summary: 查询视频内容状态</p>
     */
    public QueryContentStatusResponse queryContentStatus(QueryContentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContentStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询视频内容状态
     * Summary: 查询视频内容状态</p>
     */
    public QueryContentStatusResponse queryContentStatusEx(QueryContentStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.content.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContentStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询视频内容统计数据
     * Summary: 查询视频内容统计</p>
     */
    public QueryContentStatisticsResponse queryContentStatistics(QueryContentStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContentStatisticsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询视频内容统计数据
     * Summary: 查询视频内容统计</p>
     */
    public QueryContentStatisticsResponse queryContentStatisticsEx(QueryContentStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.content.statistics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContentStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量查询视频内容统计数据
     * Summary: 批量查询视频统计信息</p>
     */
    public QueryContentBatchstatisticsResponse queryContentBatchstatistics(QueryContentBatchstatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContentBatchstatisticsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量查询视频内容统计数据
     * Summary: 批量查询视频统计信息</p>
     */
    public QueryContentBatchstatisticsResponse queryContentBatchstatisticsEx(QueryContentBatchstatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.content.batchstatistics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContentBatchstatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品发布
     * Summary: 商品发布</p>
     */
    public PublishGoodResponse publishGood(PublishGoodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishGoodEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品发布
     * Summary: 商品发布</p>
     */
    public PublishGoodResponse publishGoodEx(PublishGoodRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.good.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishGoodResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品发布查询
     * Summary: 商品发布查询</p>
     */
    public QueryGoodsPublishResponse queryGoodsPublish(QueryGoodsPublishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGoodsPublishEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品发布查询
     * Summary: 商品发布查询</p>
     */
    public QueryGoodsPublishResponse queryGoodsPublishEx(QueryGoodsPublishRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.goods.publish.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGoodsPublishResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品更新
     * Summary: 商品更新</p>
     */
    public UpdateGoodsResponse updateGoods(UpdateGoodsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGoodsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品更新
     * Summary: 商品更新</p>
     */
    public UpdateGoodsResponse updateGoodsEx(UpdateGoodsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.goods.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGoodsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品查询
     * Summary: 商品查询</p>
     */
    public QueryGoodsResponse queryGoods(QueryGoodsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGoodsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品查询
     * Summary: 商品查询</p>
     */
    public QueryGoodsResponse queryGoodsEx(QueryGoodsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.goods.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGoodsResponse());
    }
}
