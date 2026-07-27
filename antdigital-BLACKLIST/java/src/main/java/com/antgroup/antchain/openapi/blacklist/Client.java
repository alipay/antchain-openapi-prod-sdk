// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.blacklist.models.*;

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
                    new TeaPair("sdk_version", "1.1.6"),
                    new TeaPair("_prod_code", "BLACKLIST"),
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
     * <p>Description: 黑名单扫描接口
     * Summary: 黑名单扫描接口</p>
     */
    public SyncZolozidRaasBlacklistScanResponse syncZolozidRaasBlacklistScan(SyncZolozidRaasBlacklistScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncZolozidRaasBlacklistScanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 黑名单扫描接口
     * Summary: 黑名单扫描接口</p>
     */
    public SyncZolozidRaasBlacklistScanResponse syncZolozidRaasBlacklistScanEx(SyncZolozidRaasBlacklistScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozid.raas.blacklist.scan.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncZolozidRaasBlacklistScanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 黑名单扫描接口
     * Summary: 黑名单扫描接口</p>
     */
    public SyncZolozhkRaasBlacklistScanResponse syncZolozhkRaasBlacklistScan(SyncZolozhkRaasBlacklistScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncZolozhkRaasBlacklistScanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 黑名单扫描接口
     * Summary: 黑名单扫描接口</p>
     */
    public SyncZolozhkRaasBlacklistScanResponse syncZolozhkRaasBlacklistScanEx(SyncZolozhkRaasBlacklistScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.blacklist.scan.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncZolozhkRaasBlacklistScanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建申请人，幂等创建 KYC 身份容器
     * Summary: 创建申请人，幂等创建 KYC 身份容器</p>
     */
    public CreateZolozhkRaasApplicantResponse createZolozhkRaasApplicant(CreateZolozhkRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createZolozhkRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建申请人，幂等创建 KYC 身份容器
     * Summary: 创建申请人，幂等创建 KYC 身份容器</p>
     */
    public CreateZolozhkRaasApplicantResponse createZolozhkRaasApplicantEx(CreateZolozhkRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.applicant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateZolozhkRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 挂载已有 RealID 交易的证件和人脸数据到申请人名下
     * Summary: 挂载已有 RealID 交易的证件和人脸数据到申请人名下</p>
     */
    public AttachZolozhkRaasApplicantResponse attachZolozhkRaasApplicant(AttachZolozhkRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachZolozhkRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 挂载已有 RealID 交易的证件和人脸数据到申请人名下
     * Summary: 挂载已有 RealID 交易的证件和人脸数据到申请人名下</p>
     */
    public AttachZolozhkRaasApplicantResponse attachZolozhkRaasApplicantEx(AttachZolozhkRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.applicant.attach", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AttachZolozhkRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询申请人信息及 ACTIVE 状态的 KYC 数据
     * Summary: 查询申请人信息及 ACTIVE 状态的 KYC 数据</p>
     */
    public QueryZolozhkRaasApplicantResponse queryZolozhkRaasApplicant(QueryZolozhkRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryZolozhkRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询申请人信息及 ACTIVE 状态的 KYC 数据
     * Summary: 查询申请人信息及 ACTIVE 状态的 KYC 数据</p>
     */
    public QueryZolozhkRaasApplicantResponse queryZolozhkRaasApplicantEx(QueryZolozhkRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.applicant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryZolozhkRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新申请人邮箱和电话（非空 PATCH 语义）
     * Summary: 更新申请人邮箱和电话（非空 PATCH 语义）</p>
     */
    public UpdateZolozhkRaasApplicantResponse updateZolozhkRaasApplicant(UpdateZolozhkRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateZolozhkRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新申请人邮箱和电话（非空 PATCH 语义）
     * Summary: 更新申请人邮箱和电话（非空 PATCH 语义）</p>
     */
    public UpdateZolozhkRaasApplicantResponse updateZolozhkRaasApplicantEx(UpdateZolozhkRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.applicant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateZolozhkRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）
     * Summary: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）</p>
     */
    public DeleteZolozhkRaasApplicantResponse deleteZolozhkRaasApplicant(DeleteZolozhkRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteZolozhkRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）
     * Summary: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）</p>
     */
    public DeleteZolozhkRaasApplicantResponse deleteZolozhkRaasApplicantEx(DeleteZolozhkRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.applicant.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteZolozhkRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 生成一次性跨商户 KYC 数据分享令牌
     * Summary: 生成一次性跨商户 KYC 数据分享令牌</p>
     */
    public CreateZolozhkRaasSharetokenResponse createZolozhkRaasSharetoken(CreateZolozhkRaasSharetokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createZolozhkRaasSharetokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 生成一次性跨商户 KYC 数据分享令牌
     * Summary: 生成一次性跨商户 KYC 数据分享令牌</p>
     */
    public CreateZolozhkRaasSharetokenResponse createZolozhkRaasSharetokenEx(CreateZolozhkRaasSharetokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.sharetoken.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateZolozhkRaasSharetokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化
     * Summary: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化</p>
     */
    public InitializeZolozhkRaasRealidReusableResponse initializeZolozhkRaasRealidReusable(InitializeZolozhkRaasRealidReusableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initializeZolozhkRaasRealidReusableEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化
     * Summary: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化</p>
     */
    public InitializeZolozhkRaasRealidReusableResponse initializeZolozhkRaasRealidReusableEx(InitializeZolozhkRaasRealidReusableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.realid.reusable.initialize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitializeZolozhkRaasRealidReusableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询复用认证结果
     * Summary: 查询复用认证结果</p>
     */
    public CheckresultZolozhkRaasRealidReusableResponse checkresultZolozhkRaasRealidReusable(CheckresultZolozhkRaasRealidReusableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkresultZolozhkRaasRealidReusableEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询复用认证结果
     * Summary: 查询复用认证结果</p>
     */
    public CheckresultZolozhkRaasRealidReusableResponse checkresultZolozhkRaasRealidReusableEx(CheckresultZolozhkRaasRealidReusableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.realid.reusable.checkresult", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckresultZolozhkRaasRealidReusableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据转移，异步归户 donor KYC 数据到 recipient
     * Summary: 数据转移，异步归户 donor KYC 数据到 recipient</p>
     */
    public TransferZolozhkRaasRealidReusableResponse transferZolozhkRaasRealidReusable(TransferZolozhkRaasRealidReusableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferZolozhkRaasRealidReusableEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据转移，异步归户 donor KYC 数据到 recipient
     * Summary: 数据转移，异步归户 donor KYC 数据到 recipient</p>
     */
    public TransferZolozhkRaasRealidReusableResponse transferZolozhkRaasRealidReusableEx(TransferZolozhkRaasRealidReusableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozhk.raas.realid.reusable.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferZolozhkRaasRealidReusableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 黑名单扫描接口
     * Summary: 黑名单扫描接口</p>
     */
    public SyncZolozsgRaasBlacklistScanResponse syncZolozsgRaasBlacklistScan(SyncZolozsgRaasBlacklistScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncZolozsgRaasBlacklistScanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 黑名单扫描接口
     * Summary: 黑名单扫描接口</p>
     */
    public SyncZolozsgRaasBlacklistScanResponse syncZolozsgRaasBlacklistScanEx(SyncZolozsgRaasBlacklistScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.blacklist.scan.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncZolozsgRaasBlacklistScanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建申请人，幂等创建 KYC Sharing身份容器并生成全局唯一 applicantId
     * Summary: 创建申请人，幂等创建 KYC Sharing身份容器并生成全局唯一 applicantId</p>
     */
    public CreateZolozsgRaasApplicantResponse createZolozsgRaasApplicant(CreateZolozsgRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createZolozsgRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建申请人，幂等创建 KYC Sharing身份容器并生成全局唯一 applicantId
     * Summary: 创建申请人，幂等创建 KYC Sharing身份容器并生成全局唯一 applicantId</p>
     */
    public CreateZolozsgRaasApplicantResponse createZolozsgRaasApplicantEx(CreateZolozsgRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.applicant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateZolozsgRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 挂载已有 RealID 交易的证件和人脸数据到申请人名下
     * Summary: 挂载已有 RealID 交易的证件和人脸数据到申请人名下</p>
     */
    public AttachZolozsgRaasApplicantResponse attachZolozsgRaasApplicant(AttachZolozsgRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachZolozsgRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 挂载已有 RealID 交易的证件和人脸数据到申请人名下
     * Summary: 挂载已有 RealID 交易的证件和人脸数据到申请人名下</p>
     */
    public AttachZolozsgRaasApplicantResponse attachZolozsgRaasApplicantEx(AttachZolozsgRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.applicant.attach", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AttachZolozsgRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询申请人信息及 ACTIVE 状态的 KYC 数据
     * Summary: 查询申请人信息及 ACTIVE 状态的 KYC 数据</p>
     */
    public QueryZolozsgRaasApplicantResponse queryZolozsgRaasApplicant(QueryZolozsgRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryZolozsgRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询申请人信息及 ACTIVE 状态的 KYC 数据
     * Summary: 查询申请人信息及 ACTIVE 状态的 KYC 数据</p>
     */
    public QueryZolozsgRaasApplicantResponse queryZolozsgRaasApplicantEx(QueryZolozsgRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.applicant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryZolozsgRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新申请人邮箱和电话（非空 PATCH 语义）
     * Summary: 更新申请人邮箱和电话（非空 PATCH 语义）</p>
     */
    public UpdateZolozsgRaasApplicantResponse updateZolozsgRaasApplicant(UpdateZolozsgRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateZolozsgRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新申请人邮箱和电话（非空 PATCH 语义）
     * Summary: 更新申请人邮箱和电话（非空 PATCH 语义）</p>
     */
    public UpdateZolozsgRaasApplicantResponse updateZolozsgRaasApplicantEx(UpdateZolozsgRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.applicant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateZolozsgRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）
     * Summary: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）</p>
     */
    public DeleteZolozsgRaasApplicantResponse deleteZolozsgRaasApplicant(DeleteZolozsgRaasApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteZolozsgRaasApplicantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）
     * Summary: 物理删除申请人及全部 KYC 数据（GDPR 撤回场景）</p>
     */
    public DeleteZolozsgRaasApplicantResponse deleteZolozsgRaasApplicantEx(DeleteZolozsgRaasApplicantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.applicant.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteZolozsgRaasApplicantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询复用认证结果，返回认证状态和结果信息
     * Summary: 查询复用认证结果，返回认证状态和结果信息</p>
     */
    public CheckresultZolozsgRaasRealidReusableResponse checkresultZolozsgRaasRealidReusable(CheckresultZolozsgRaasRealidReusableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkresultZolozsgRaasRealidReusableEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询复用认证结果，返回认证状态和结果信息
     * Summary: 查询复用认证结果，返回认证状态和结果信息</p>
     */
    public CheckresultZolozsgRaasRealidReusableResponse checkresultZolozsgRaasRealidReusableEx(CheckresultZolozsgRaasRealidReusableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.realid.reusable.checkresult", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckresultZolozsgRaasRealidReusableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据转移，API方式异步归户 donor KYC 数据到 recipient
     * Summary: 数据转移，API方式异步归户 donor KYC 数据到 recipient</p>
     */
    public TransferZolozsgRaasRealidReusableResponse transferZolozsgRaasRealidReusable(TransferZolozsgRaasRealidReusableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferZolozsgRaasRealidReusableEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据转移，API方式异步归户 donor KYC 数据到 recipient
     * Summary: 数据转移，API方式异步归户 donor KYC 数据到 recipient</p>
     */
    public TransferZolozsgRaasRealidReusableResponse transferZolozsgRaasRealidReusableEx(TransferZolozsgRaasRealidReusableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.realid.reusable.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferZolozsgRaasRealidReusableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化
     * Summary: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化</p>
     */
    public InitializeZolozsgRaasRealidReusableResponse initializeZolozsgRaasRealidReusable(InitializeZolozsgRaasRealidReusableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initializeZolozsgRaasRealidReusableEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化
     * Summary: 复用认证初始化，令牌校验+donor 数据加载+EKYC 初始化</p>
     */
    public InitializeZolozsgRaasRealidReusableResponse initializeZolozsgRaasRealidReusableEx(InitializeZolozsgRaasRealidReusableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.realid.reusable.initialize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitializeZolozsgRaasRealidReusableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 生成一次性跨商户 KYC 数据分享令牌
     * Summary: 生成一次性跨商户 KYC 数据分享令牌</p>
     */
    public CreateZolozsgRaasSharetokenResponse createZolozsgRaasSharetoken(CreateZolozsgRaasSharetokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createZolozsgRaasSharetokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 生成一次性跨商户 KYC 数据分享令牌
     * Summary: 生成一次性跨商户 KYC 数据分享令牌</p>
     */
    public CreateZolozsgRaasSharetokenResponse createZolozsgRaasSharetokenEx(CreateZolozsgRaasSharetokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "zolozsg.raas.sharetoken.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateZolozsgRaasSharetokenResponse());
    }
}
