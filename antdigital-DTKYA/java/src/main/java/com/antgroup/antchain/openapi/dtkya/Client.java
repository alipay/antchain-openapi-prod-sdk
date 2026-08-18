// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.dtkya.models.*;

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
                    new TeaPair("sdk_version", "1.0.14"),
                    new TeaPair("_prod_code", "DTKYA"),
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
     * <p>Description: kya vc提交
     * Summary: kya vc提交</p>
     */
    public SubmitAntchainDasKyaVcResponse submitAntchainDasKyaVc(SubmitAntchainDasKyaVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainDasKyaVcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: kya vc提交
     * Summary: kya vc提交</p>
     */
    public SubmitAntchainDasKyaVcResponse submitAntchainDasKyaVcEx(SubmitAntchainDasKyaVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vc.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainDasKyaVcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: did通用解析
     * Summary: did通用解析</p>
     */
    public ResolveAntchainDasKyaDidResponse resolveAntchainDasKyaDid(ResolveAntchainDasKyaDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resolveAntchainDasKyaDidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: did通用解析
     * Summary: did通用解析</p>
     */
    public ResolveAntchainDasKyaDidResponse resolveAntchainDasKyaDidEx(ResolveAntchainDasKyaDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.did.resolve", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResolveAntchainDasKyaDidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: kya中vc digest查询
     * Summary: kya中vc digest查询</p>
     */
    public QueryAntchainDasKyaVcdigestResponse queryAntchainDasKyaVcdigest(QueryAntchainDasKyaVcdigestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainDasKyaVcdigestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: kya中vc digest查询
     * Summary: kya中vc digest查询</p>
     */
    public QueryAntchainDasKyaVcdigestResponse queryAntchainDasKyaVcdigestEx(QueryAntchainDasKyaVcdigestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vcdigest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainDasKyaVcdigestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: kya vc摘要信息上传
     * Summary: kya vc摘要信息上传</p>
     */
    public SubmitAntchainDasKyaVcdigestResponse submitAntchainDasKyaVcdigest(SubmitAntchainDasKyaVcdigestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAntchainDasKyaVcdigestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: kya vc摘要信息上传
     * Summary: kya vc摘要信息上传</p>
     */
    public SubmitAntchainDasKyaVcdigestResponse submitAntchainDasKyaVcdigestEx(SubmitAntchainDasKyaVcdigestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vcdigest.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAntchainDasKyaVcdigestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: kya 外部vc同步
     * Summary: kya 外部vc同步</p>
     */
    public SyncAntchainDasKyaVcResponse syncAntchainDasKyaVc(SyncAntchainDasKyaVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAntchainDasKyaVcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: kya 外部vc同步
     * Summary: kya 外部vc同步</p>
     */
    public SyncAntchainDasKyaVcResponse syncAntchainDasKyaVcEx(SyncAntchainDasKyaVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vc.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAntchainDasKyaVcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: kya vc详情查询
     * Summary: kya vc详情查询</p>
     */
    public QueryAntchainDasKyaVcdetailResponse queryAntchainDasKyaVcdetail(QueryAntchainDasKyaVcdetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntchainDasKyaVcdetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: kya vc详情查询
     * Summary: kya vc详情查询</p>
     */
    public QueryAntchainDasKyaVcdetailResponse queryAntchainDasKyaVcdetailEx(QueryAntchainDasKyaVcdetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vcdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntchainDasKyaVcdetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据subjectId获取vc 摘要信息
     * Summary: 根据subjectId获取vc 摘要信息</p>
     */
    public ListbysubjectAntchainDasKyaVcdigestResponse listbysubjectAntchainDasKyaVcdigest(ListbysubjectAntchainDasKyaVcdigestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listbysubjectAntchainDasKyaVcdigestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据subjectId获取vc 摘要信息
     * Summary: 根据subjectId获取vc 摘要信息</p>
     */
    public ListbysubjectAntchainDasKyaVcdigestResponse listbysubjectAntchainDasKyaVcdigestEx(ListbysubjectAntchainDasKyaVcdigestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vcdigest.listbysubject", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListbysubjectAntchainDasKyaVcdigestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: vc吊销
     * Summary: vc吊销</p>
     */
    public RevokeAntchainDasKyaVcResponse revokeAntchainDasKyaVc(RevokeAntchainDasKyaVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeAntchainDasKyaVcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: vc吊销
     * Summary: vc吊销</p>
     */
    public RevokeAntchainDasKyaVcResponse revokeAntchainDasKyaVcEx(RevokeAntchainDasKyaVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vc.revoke", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RevokeAntchainDasKyaVcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: vc暂停
     * Summary: vc暂停</p>
     */
    public SuspendAntchainDasKyaVcResponse suspendAntchainDasKyaVc(SuspendAntchainDasKyaVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.suspendAntchainDasKyaVcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: vc暂停
     * Summary: vc暂停</p>
     */
    public SuspendAntchainDasKyaVcResponse suspendAntchainDasKyaVcEx(SuspendAntchainDasKyaVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vc.suspend", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SuspendAntchainDasKyaVcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: vc恢复
     * Summary: vc恢复</p>
     */
    public ResumeAntchainDasKyaVcResponse resumeAntchainDasKyaVc(ResumeAntchainDasKyaVcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeAntchainDasKyaVcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: vc恢复
     * Summary: vc恢复</p>
     */
    public ResumeAntchainDasKyaVcResponse resumeAntchainDasKyaVcEx(ResumeAntchainDasKyaVcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vc.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeAntchainDasKyaVcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: vp核验
     * Summary: vp核验</p>
     */
    public VerifyAntchainDasKyaVpResponse verifyAntchainDasKyaVp(VerifyAntchainDasKyaVpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAntchainDasKyaVpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: vp核验
     * Summary: vp核验</p>
     */
    public VerifyAntchainDasKyaVpResponse verifyAntchainDasKyaVpEx(VerifyAntchainDasKyaVpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.vp.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyAntchainDasKyaVpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 自定义did注册
     * Summary: 自定义did注册</p>
     */
    public CustomregisterAntchainDasKyaDidResponse customregisterAntchainDasKyaDid(CustomregisterAntchainDasKyaDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.customregisterAntchainDasKyaDidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 自定义did注册
     * Summary: 自定义did注册</p>
     */
    public CustomregisterAntchainDasKyaDidResponse customregisterAntchainDasKyaDidEx(CustomregisterAntchainDasKyaDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.did.customregister", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CustomregisterAntchainDasKyaDidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 停用did
     * Summary: 停用did</p>
     */
    public DeactivateAntchainDasKyaDidResponse deactivateAntchainDasKyaDid(DeactivateAntchainDasKyaDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deactivateAntchainDasKyaDidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 停用did
     * Summary: 停用did</p>
     */
    public DeactivateAntchainDasKyaDidResponse deactivateAntchainDasKyaDidEx(DeactivateAntchainDasKyaDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.did.deactivate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeactivateAntchainDasKyaDidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: did doc更新
     * Summary: did doc更新</p>
     */
    public UpdateAntchainDasKyaDidResponse updateAntchainDasKyaDid(UpdateAntchainDasKyaDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntchainDasKyaDidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: did doc更新
     * Summary: did doc更新</p>
     */
    public UpdateAntchainDasKyaDidResponse updateAntchainDasKyaDidEx(UpdateAntchainDasKyaDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.did.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntchainDasKyaDidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 托管模式，租户DID注册
     * Summary: 托管模式，租户DID注册</p>
     */
    public SelfregisterAntchainDasKyaManageddidResponse selfregisterAntchainDasKyaManageddid(SelfregisterAntchainDasKyaManageddidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selfregisterAntchainDasKyaManageddidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 托管模式，租户DID注册
     * Summary: 托管模式，租户DID注册</p>
     */
    public SelfregisterAntchainDasKyaManageddidResponse selfregisterAntchainDasKyaManageddidEx(SelfregisterAntchainDasKyaManageddidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.manageddid.selfregister", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SelfregisterAntchainDasKyaManageddidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 托管模式，普通注册
     * Summary: 托管模式，普通注册</p>
     */
    public RegisterAntchainDasKyaManageddidResponse registerAntchainDasKyaManageddid(RegisterAntchainDasKyaManageddidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerAntchainDasKyaManageddidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 托管模式，普通注册
     * Summary: 托管模式，普通注册</p>
     */
    public RegisterAntchainDasKyaManageddidResponse registerAntchainDasKyaManageddidEx(RegisterAntchainDasKyaManageddidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.manageddid.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterAntchainDasKyaManageddidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 托管did签名
     * Summary: 托管did签名</p>
     */
    public SignAntchainDasKyaManageddidResponse signAntchainDasKyaManageddid(SignAntchainDasKyaManageddidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signAntchainDasKyaManageddidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 托管did签名
     * Summary: 托管did签名</p>
     */
    public SignAntchainDasKyaManageddidResponse signAntchainDasKyaManageddidEx(SignAntchainDasKyaManageddidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.manageddid.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignAntchainDasKyaManageddidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建评测服务
     * Summary: 创建评测服务</p>
     */
    public RegisterAntchainDasKyaEvaluationserviceResponse registerAntchainDasKyaEvaluationservice(RegisterAntchainDasKyaEvaluationserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerAntchainDasKyaEvaluationserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建评测服务
     * Summary: 创建评测服务</p>
     */
    public RegisterAntchainDasKyaEvaluationserviceResponse registerAntchainDasKyaEvaluationserviceEx(RegisterAntchainDasKyaEvaluationserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.evaluationservice.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterAntchainDasKyaEvaluationserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新评测服务
     * Summary: 更新评测服务</p>
     */
    public ResetAntchainDasKyaEvaluationserviceResponse resetAntchainDasKyaEvaluationservice(ResetAntchainDasKyaEvaluationserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetAntchainDasKyaEvaluationserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新评测服务
     * Summary: 更新评测服务</p>
     */
    public ResetAntchainDasKyaEvaluationserviceResponse resetAntchainDasKyaEvaluationserviceEx(ResetAntchainDasKyaEvaluationserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.evaluationservice.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetAntchainDasKyaEvaluationserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 评测开始通知
     * Summary: 评测开始通知</p>
     */
    public InitAntchainDasKyaEvaluationResponse initAntchainDasKyaEvaluation(InitAntchainDasKyaEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initAntchainDasKyaEvaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 评测开始通知
     * Summary: 评测开始通知</p>
     */
    public InitAntchainDasKyaEvaluationResponse initAntchainDasKyaEvaluationEx(InitAntchainDasKyaEvaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.evaluation.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitAntchainDasKyaEvaluationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 评测结果通知推送
     * Summary: 评测结果通知推送</p>
     */
    public PushAntchainDasKyaEvaluationResponse pushAntchainDasKyaEvaluation(PushAntchainDasKyaEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAntchainDasKyaEvaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 评测结果通知推送
     * Summary: 评测结果通知推送</p>
     */
    public PushAntchainDasKyaEvaluationResponse pushAntchainDasKyaEvaluationEx(PushAntchainDasKyaEvaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.evaluation.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushAntchainDasKyaEvaluationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建评测接口
     * Summary: 创建评测接口</p>
     */
    public RegisterAntchainDasKyaAgentevaluationResponse registerAntchainDasKyaAgentevaluation(RegisterAntchainDasKyaAgentevaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerAntchainDasKyaAgentevaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建评测接口
     * Summary: 创建评测接口</p>
     */
    public RegisterAntchainDasKyaAgentevaluationResponse registerAntchainDasKyaAgentevaluationEx(RegisterAntchainDasKyaAgentevaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.kya.agentevaluation.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterAntchainDasKyaAgentevaluationResponse());
    }
}
