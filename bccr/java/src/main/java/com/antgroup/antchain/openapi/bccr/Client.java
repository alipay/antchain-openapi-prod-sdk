// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.bccr.models.*;
import com.antgroup.antchain.openapi.antchain.util.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;

public class Client {

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
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
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

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDurationMillis", _keepAliveDurationMillis),
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
                    new TeaPair("sdk_version", "1.12.0")
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
                TeaResponse response_ = Tea.doAction(request_, runtime_);

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

    /**
     * Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接
     */
    public GetUploadurlResponse getUploadurl(GetUploadurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUploadurlEx(request, headers, runtime);
    }

    /**
     * Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接
     */
    public GetUploadurlResponse getUploadurlEx(GetUploadurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.uploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUploadurlResponse());
    }

    /**
     * Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记
     */
    public AddHashregisterResponse addHashregister(AddHashregisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addHashregisterEx(request, headers, runtime);
    }

    /**
     * Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记
     */
    public AddHashregisterResponse addHashregisterEx(AddHashregisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.hashregister.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddHashregisterResponse());
    }

    /**
     * Description: 版权平台新增版权登记
     * Summary: 新增版权登记
     */
    public AddRegisterResponse addRegister(AddRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRegisterEx(request, headers, runtime);
    }

    /**
     * Description: 版权平台新增版权登记
     * Summary: 新增版权登记
     */
    public AddRegisterResponse addRegisterEx(AddRegisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.register.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddRegisterResponse());
    }

    /**
     * Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态
     */
    public QueryRegisterstatusResponse queryRegisterstatus(QueryRegisterstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRegisterstatusEx(request, headers, runtime);
    }

    /**
     * Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态
     */
    public QueryRegisterstatusResponse queryRegisterstatusEx(QueryRegisterstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.registerstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRegisterstatusResponse());
    }

    /**
     * Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书
     */
    public CreateCertificateResponse createCertificateEx(CreateCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.certificate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCertificateResponse());
    }

    /**
     * Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书
     */
    public GetCertificateResponse getCertificate(GetCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书
     */
    public GetCertificateResponse getCertificateEx(GetCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.certificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCertificateResponse());
    }

    /**
     * Description: 新增版权监测任务
     * Summary: 新增版权监测
     */
    public CreateMonitorTaskResponse createMonitorTask(CreateMonitorTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorTaskEx(request, headers, runtime);
    }

    /**
     * Description: 新增版权监测任务
     * Summary: 新增版权监测
     */
    public CreateMonitorTaskResponse createMonitorTaskEx(CreateMonitorTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMonitorTaskResponse());
    }

    /**
     * Description: 停止版权监测任务
     * Summary: 停止版权监测
     */
    public StopMonitorTaskResponse stopMonitorTask(StopMonitorTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMonitorTaskEx(request, headers, runtime);
    }

    /**
     * Description: 停止版权监测任务
     * Summary: 停止版权监测
     */
    public StopMonitorTaskResponse stopMonitorTaskEx(StopMonitorTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.task.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopMonitorTaskResponse());
    }

    /**
     * Description: 查询版权监测任务
     * Summary: 查询版权监测
     */
    public QueryMonitorTaskResponse queryMonitorTask(QueryMonitorTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMonitorTaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询版权监测任务
     * Summary: 查询版权监测
     */
    public QueryMonitorTaskResponse queryMonitorTaskEx(QueryMonitorTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMonitorTaskResponse());
    }

    /**
     * Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果
     */
    public QueryMonitorResultResponse queryMonitorResult(QueryMonitorResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMonitorResultEx(request, headers, runtime);
    }

    /**
     * Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果
     */
    public QueryMonitorResultResponse queryMonitorResultEx(QueryMonitorResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMonitorResultResponse());
    }

    /**
     * Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表
     */
    public ListMonitorProviderResponse listMonitorProvider(ListMonitorProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorProviderEx(request, headers, runtime);
    }

    /**
     * Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表
     */
    public ListMonitorProviderResponse listMonitorProviderEx(ListMonitorProviderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.monitor.provider.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListMonitorProviderResponse());
    }

    /**
     * Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃)
     */
    public CreateRecodescreenResponse createRecodescreen(CreateRecodescreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecodescreenEx(request, headers, runtime);
    }

    /**
     * Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃)
     */
    public CreateRecodescreenResponse createRecodescreenEx(CreateRecodescreenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recodescreen.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRecodescreenResponse());
    }

    /**
     * Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃)
     */
    public QueryRecodescreenResponse queryRecodescreen(QueryRecodescreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRecodescreenEx(request, headers, runtime);
    }

    /**
     * Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃)
     */
    public QueryRecodescreenResponse queryRecodescreenEx(QueryRecodescreenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recodescreen.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRecodescreenResponse());
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询
     */
    public QueryUserResponse queryUser(QueryUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserEx(request, headers, runtime);
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询
     */
    public QueryUserResponse queryUserEx(QueryUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserResponse());
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表
     */
    public QueryUserListResponse queryUserList(QueryUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserListEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表
     */
    public QueryUserListResponse queryUserListEx(QueryUserListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.user.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserListResponse());
    }

    /**
     * Description: 创建网页取证
     * Summary: 创建网页取证
     */
    public CreateScreenshotResponse createScreenshot(CreateScreenshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScreenshotEx(request, headers, runtime);
    }

    /**
     * Description: 创建网页取证
     * Summary: 创建网页取证
     */
    public CreateScreenshotResponse createScreenshotEx(CreateScreenshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.screenshot.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateScreenshotResponse());
    }

    /**
     * Description: 查询网页取证
     * Summary: 查询网页取证
     */
    public QueryScreenshotResponse queryScreenshot(QueryScreenshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryScreenshotEx(request, headers, runtime);
    }

    /**
     * Description: 查询网页取证
     * Summary: 查询网页取证
     */
    public QueryScreenshotResponse queryScreenshotEx(QueryScreenshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.screenshot.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryScreenshotResponse());
    }

    /**
     * Description: 链上核验
     * Summary: 链上核验
     */
    public VerifyBlockchainResponse verifyBlockchain(VerifyBlockchainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyBlockchainEx(request, headers, runtime);
    }

    /**
     * Description: 链上核验
     * Summary: 链上核验
     */
    public VerifyBlockchainResponse verifyBlockchainEx(VerifyBlockchainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.blockchain.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyBlockchainResponse());
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     */
    public CreateRecordscreenResponse createRecordscreen(CreateRecordscreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecordscreenEx(request, headers, runtime);
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     */
    public CreateRecordscreenResponse createRecordscreenEx(CreateRecordscreenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recordscreen.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRecordscreenResponse());
    }

    /**
     * Description: 查询录屏取证
     * Summary: 查询录屏取证
     */
    public QueryRecordscreenResponse queryRecordscreen(QueryRecordscreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRecordscreenEx(request, headers, runtime);
    }

    /**
     * Description: 查询录屏取证
     * Summary: 查询录屏取证
     */
    public QueryRecordscreenResponse queryRecordscreenEx(QueryRecordscreenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.recordscreen.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRecordscreenResponse());
    }

    /**
     * Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表
     */
    public ListNotaryResponse listNotary(ListNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNotaryEx(request, headers, runtime);
    }

    /**
     * Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表
     */
    public ListNotaryResponse listNotaryEx(ListNotaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListNotaryResponse());
    }
}
