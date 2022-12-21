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
                    new TeaPair("sdk_version", "1.17.33")
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

    /**
     * Description: 新增版权定向监测任务
     * Summary: 新增版权定向监测
     */
    public CreateDirectmonitorTaskResponse createDirectmonitorTask(CreateDirectmonitorTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDirectmonitorTaskEx(request, headers, runtime);
    }

    /**
     * Description: 新增版权定向监测任务
     * Summary: 新增版权定向监测
     */
    public CreateDirectmonitorTaskResponse createDirectmonitorTaskEx(CreateDirectmonitorTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.directmonitor.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDirectmonitorTaskResponse());
    }

    /**
     * Description: 查询版权定向监测结果
     * Summary: 查询版权定向监测结果
     */
    public QueryDirectmonitorResultResponse queryDirectmonitorResult(QueryDirectmonitorResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDirectmonitorResultEx(request, headers, runtime);
    }

    /**
     * Description: 查询版权定向监测结果
     * Summary: 查询版权定向监测结果
     */
    public QueryDirectmonitorResultResponse queryDirectmonitorResultEx(QueryDirectmonitorResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.directmonitor.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDirectmonitorResultResponse());
    }

    /**
     * Description: DCI预登记
     * Summary: dci预登记
     */
    public CreateDciPreregistrationResponse createDciPreregistration(CreateDciPreregistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDciPreregistrationEx(request, headers, runtime);
    }

    /**
     * Description: DCI预登记
     * Summary: dci预登记
     */
    public CreateDciPreregistrationResponse createDciPreregistrationEx(CreateDciPreregistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregistration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDciPreregistrationResponse());
    }

    /**
     * Description: 查询dci预登记信息
     * Summary: 查询dci预登记信息
     */
    public QueryDciPreregistrationResponse queryDciPreregistration(QueryDciPreregistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPreregistrationEx(request, headers, runtime);
    }

    /**
     * Description: 查询dci预登记信息
     * Summary: 查询dci预登记信息
     */
    public QueryDciPreregistrationResponse queryDciPreregistrationEx(QueryDciPreregistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregistration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPreregistrationResponse());
    }

    /**
     * Description: 注册dci账号
     * Summary: 注册dci账号
     */
    public AddDciUserResponse addDciUser(AddDciUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDciUserEx(request, headers, runtime);
    }

    /**
     * Description: 注册dci账号
     * Summary: 注册dci账号
     */
    public AddDciUserResponse addDciUserEx(AddDciUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.user.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDciUserResponse());
    }

    /**
     * Description: dci预登记再确认
     * Summary: dci预登记再确认
     */
    public RetryDciPreregistrationResponse retryDciPreregistration(RetryDciPreregistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryDciPreregistrationEx(request, headers, runtime);
    }

    /**
     * Description: dci预登记再确认
     * Summary: dci预登记再确认
     */
    public RetryDciPreregistrationResponse retryDciPreregistrationEx(RetryDciPreregistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregistration.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryDciPreregistrationResponse());
    }

    /**
     * Description: 查询dci账号信息
     * Summary: 查询dci账号信息
     */
    public QueryDciUserResponse queryDciUser(QueryDciUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciUserEx(request, headers, runtime);
    }

    /**
     * Description: 查询dci账号信息
     * Summary: 查询dci账号信息
     */
    public QueryDciUserResponse queryDciUserEx(QueryDciUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciUserResponse());
    }

    /**
     * Description: Dci预登记公示地址查询
     * Summary: Dci预登记公示地址查询
     */
    public QueryDciPreregpublicationResponse queryDciPreregpublication(QueryDciPreregpublicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPreregpublicationEx(request, headers, runtime);
    }

    /**
     * Description: Dci预登记公示地址查询
     * Summary: Dci预登记公示地址查询
     */
    public QueryDciPreregpublicationResponse queryDciPreregpublicationEx(QueryDciPreregpublicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preregpublication.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPreregpublicationResponse());
    }

    /**
     * Description: 更新dci账号信息
     * Summary: 更新dci账号信息
     */
    public UpdateDciUserResponse updateDciUser(UpdateDciUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDciUserEx(request, headers, runtime);
    }

    /**
     * Description: 更新dci账号信息
     * Summary: 更新dci账号信息
     */
    public UpdateDciUserResponse updateDciUserEx(UpdateDciUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.user.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDciUserResponse());
    }

    /**
     * Description: 发起数登申请
     * Summary: 发起数登申请
     */
    public CreateDciRegistrationResponse createDciRegistration(CreateDciRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 发起数登申请
     * Summary: 发起数登申请
     */
    public CreateDciRegistrationResponse createDciRegistrationEx(CreateDciRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDciRegistrationResponse());
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryDciRegistrationsubmitResponse queryDciRegistrationsubmit(QueryDciRegistrationsubmitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciRegistrationsubmitEx(request, headers, runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryDciRegistrationsubmitResponse queryDciRegistrationsubmitEx(QueryDciRegistrationsubmitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciRegistrationsubmitResponse());
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果
     */
    public QueryDciRegistrationResponse queryDciRegistration(QueryDciRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果
     */
    public QueryDciRegistrationResponse queryDciRegistrationEx(QueryDciRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciRegistrationResponse());
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接
     */
    public GetDciRegistrationcertResponse getDciRegistrationcert(GetDciRegistrationcertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接
     */
    public GetDciRegistrationcertResponse getDciRegistrationcertEx(GetDciRegistrationcertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDciRegistrationcertResponse());
    }

    /**
     * Description: 查询内容安全审核详情
     * Summary: 查询内容安全审核详情
     */
    public QueryDciContentsecurityResponse queryDciContentsecurity(QueryDciContentsecurityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciContentsecurityEx(request, headers, runtime);
    }

    /**
     * Description: 查询内容安全审核详情
     * Summary: 查询内容安全审核详情
     */
    public QueryDciContentsecurityResponse queryDciContentsecurityEx(QueryDciContentsecurityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.contentsecurity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciContentsecurityResponse());
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书
     */
    public CreateDciRegistrationcertResponse createDciRegistrationcert(CreateDciRegistrationcertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书
     */
    public CreateDciRegistrationcertResponse createDciRegistrationcertEx(CreateDciRegistrationcertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDciRegistrationcertResponse());
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryDciRegistrationcertResponse queryDciRegistrationcert(QueryDciRegistrationcertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciRegistrationcertEx(request, headers, runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口
     */
    public QueryDciRegistrationcertResponse queryDciRegistrationcertEx(QueryDciRegistrationcertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciRegistrationcertResponse());
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付
     */
    public GetDciPayurlResponse getDciPayurl(GetDciPayurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDciPayurlEx(request, headers, runtime);
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付
     */
    public GetDciPayurlResponse getDciPayurlEx(GetDciPayurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDciPayurlResponse());
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果
     */
    public QueryDciPayResponse queryDciPay(QueryDciPayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPayEx(request, headers, runtime);
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果
     */
    public QueryDciPayResponse queryDciPayEx(QueryDciPayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPayResponse());
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调
     */
    public CallbackDciPayresultResponse callbackDciPayresult(CallbackDciPayresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackDciPayresultEx(request, headers, runtime);
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调
     */
    public CallbackDciPayresultResponse callbackDciPayresultEx(CallbackDciPayresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackDciPayresultResponse());
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调
     */
    public RefuseDciRegistrationResponse refuseDciRegistration(RefuseDciRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调
     */
    public RefuseDciRegistrationResponse refuseDciRegistrationEx(RefuseDciRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseDciRegistrationResponse());
    }

    /**
     * Description: 版权平台获取申办事由配置
     * Summary: 获取申办事由配置
     */
    public QueryNotaryBidreasonResponse queryNotaryBidreason(QueryNotaryBidreasonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryBidreasonEx(request, headers, runtime);
    }

    /**
     * Description: 版权平台获取申办事由配置
     * Summary: 获取申办事由配置
     */
    public QueryNotaryBidreasonResponse queryNotaryBidreasonEx(QueryNotaryBidreasonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.bidreason.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryBidreasonResponse());
    }

    /**
     * Description: 获取签署文件
     * Summary: 获取签署文件
     */
    public QueryNotaryDocumenttosignResponse queryNotaryDocumenttosign(QueryNotaryDocumenttosignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryDocumenttosignEx(request, headers, runtime);
    }

    /**
     * Description: 获取签署文件
     * Summary: 获取签署文件
     */
    public QueryNotaryDocumenttosignResponse queryNotaryDocumenttosignEx(QueryNotaryDocumenttosignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.documenttosign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryDocumenttosignResponse());
    }

    /**
     * Description: 提交申办订单
     * Summary: 提交申办订单
     */
    public ApplyNotaryOrderResponse applyNotaryOrder(ApplyNotaryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyNotaryOrderEx(request, headers, runtime);
    }

    /**
     * Description: 提交申办订单
     * Summary: 提交申办订单
     */
    public ApplyNotaryOrderResponse applyNotaryOrderEx(ApplyNotaryOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.order.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyNotaryOrderResponse());
    }

    /**
     * Description: 公证出证重新获取支付链接
     * Summary: 重新获取支付链接
     */
    public QueryNotaryPayurlResponse queryNotaryPayurl(QueryNotaryPayurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryPayurlEx(request, headers, runtime);
    }

    /**
     * Description: 公证出证重新获取支付链接
     * Summary: 重新获取支付链接
     */
    public QueryNotaryPayurlResponse queryNotaryPayurlEx(QueryNotaryPayurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.payurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryPayurlResponse());
    }

    /**
     * Description: 公证出证获取收费标准和明细
     * Summary: 获取收费标准和明细
     */
    public QueryNotaryFeedetailResponse queryNotaryFeedetail(QueryNotaryFeedetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryFeedetailEx(request, headers, runtime);
    }

    /**
     * Description: 公证出证获取收费标准和明细
     * Summary: 获取收费标准和明细
     */
    public QueryNotaryFeedetailResponse queryNotaryFeedetailEx(QueryNotaryFeedetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.feedetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryFeedetailResponse());
    }

    /**
     * Description: 公证出证查询申办订单接口
     * Summary: 查询申办订单接口
     */
    public QueryNotaryOrderResponse queryNotaryOrder(QueryNotaryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNotaryOrderEx(request, headers, runtime);
    }

    /**
     * Description: 公证出证查询申办订单接口
     * Summary: 查询申办订单接口
     */
    public QueryNotaryOrderResponse queryNotaryOrderEx(QueryNotaryOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNotaryOrderResponse());
    }

    /**
     * Description: 公证出证申请出证材料补齐
     * Summary: 申请出证材料补齐
     */
    public UploadNotaryAttachmentResponse uploadNotaryAttachment(UploadNotaryAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadNotaryAttachmentEx(request, headers, runtime);
    }

    /**
     * Description: 公证出证申请出证材料补齐
     * Summary: 申请出证材料补齐
     */
    public UploadNotaryAttachmentResponse uploadNotaryAttachmentEx(UploadNotaryAttachmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.attachment.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadNotaryAttachmentResponse());
    }

    /**
     * Description: 公证出证更新申办状态
     * Summary: 更新申办状态
     */
    public OperateNotaryOrderResponse operateNotaryOrder(OperateNotaryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateNotaryOrderEx(request, headers, runtime);
    }

    /**
     * Description: 公证出证更新申办状态
     * Summary: 更新申办状态
     */
    public OperateNotaryOrderResponse operateNotaryOrderEx(OperateNotaryOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.notary.order.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateNotaryOrderResponse());
    }

    /**
     * Description: 查询DCI作品预览结果
     * Summary: 查询DCI作品预览结果
     */
    public QueryDciPreviewResponse queryDciPreview(QueryDciPreviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDciPreviewEx(request, headers, runtime);
    }

    /**
     * Description: 查询DCI作品预览结果
     * Summary: 查询DCI作品预览结果
     */
    public QueryDciPreviewResponse queryDciPreviewEx(QueryDciPreviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.preview.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDciPreviewResponse());
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请
     */
    public RetryDciRegistrationResponse retryDciRegistration(RetryDciRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请
     */
    public RetryDciRegistrationResponse retryDciRegistrationEx(RetryDciRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryDciRegistrationResponse());
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请
     */
    public CloseDciRegistrationResponse closeDciRegistration(CloseDciRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeDciRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请
     */
    public CloseDciRegistrationResponse closeDciRegistrationEx(CloseDciRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseDciRegistrationResponse());
    }

    /**
     * Description: 添加发布视频内容
     * Summary: 发布视频内容
     */
    public AddContentResponse addContent(AddContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContentEx(request, headers, runtime);
    }

    /**
     * Description: 添加发布视频内容
     * Summary: 发布视频内容
     */
    public AddContentResponse addContentEx(AddContentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.content.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContentResponse());
    }

    /**
     * Description: 查询视频内容状态
     * Summary: 查询视频内容状态
     */
    public QueryContentStatusResponse queryContentStatus(QueryContentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContentStatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询视频内容状态
     * Summary: 查询视频内容状态
     */
    public QueryContentStatusResponse queryContentStatusEx(QueryContentStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.content.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContentStatusResponse());
    }

    /**
     * Description: 查询视频内容统计数据
     * Summary: 查询视频内容统计
     */
    public QueryContentStatisticsResponse queryContentStatistics(QueryContentStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContentStatisticsEx(request, headers, runtime);
    }

    /**
     * Description: 查询视频内容统计数据
     * Summary: 查询视频内容统计
     */
    public QueryContentStatisticsResponse queryContentStatisticsEx(QueryContentStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.content.statistics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContentStatisticsResponse());
    }

    /**
     * Description: 商品发布
     * Summary: 商品发布
     */
    public PublishGoodResponse publishGood(PublishGoodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishGoodEx(request, headers, runtime);
    }

    /**
     * Description: 商品发布
     * Summary: 商品发布
     */
    public PublishGoodResponse publishGoodEx(PublishGoodRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.good.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishGoodResponse());
    }

    /**
     * Description: 商品发布查询
     * Summary: 商品发布查询
     */
    public QueryGoodsPublishResponse queryGoodsPublish(QueryGoodsPublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGoodsPublishEx(request, headers, runtime);
    }

    /**
     * Description: 商品发布查询
     * Summary: 商品发布查询
     */
    public QueryGoodsPublishResponse queryGoodsPublishEx(QueryGoodsPublishRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.goods.publish.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGoodsPublishResponse());
    }

    /**
     * Description: 商品更新
     * Summary: 商品更新
     */
    public UpdateGoodsResponse updateGoods(UpdateGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 商品更新
     * Summary: 商品更新
     */
    public UpdateGoodsResponse updateGoodsEx(UpdateGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.goods.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGoodsResponse());
    }

    /**
     * Description: 商品查询
     * Summary: 商品查询
     */
    public QueryGoodsResponse queryGoods(QueryGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 商品查询
     * Summary: 商品查询
     */
    public QueryGoodsResponse queryGoodsEx(QueryGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bccr.goods.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGoodsResponse());
    }
}
