// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.caasplatform.models.*;

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
                    new TeaPair("sdk_version", "1.5.1"),
                    new TeaPair("_prod_code", "CAASPLATFORM"),
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
     * Description: 创建存证
     * Summary: 创建存证
     */
    public CreateDepositResponse createDeposit(CreateDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositEx(request, headers, runtime);
    }

    /**
     * Description: 创建存证
     * Summary: 创建存证
     */
    public CreateDepositResponse createDepositEx(CreateDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.caasplatform.deposit.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateDepositResponse createDepositResponse = CreateDepositResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createDepositResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDepositResponse());
    }

    /**
     * Description: 存证查询
     * Summary: 存证查询
     */
    public QueryDepositResponse queryDeposit(QueryDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositEx(request, headers, runtime);
    }

    /**
     * Description: 存证查询
     * Summary: 存证查询
     */
    public QueryDepositResponse queryDepositEx(QueryDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositResponse());
    }

    /**
     * Description: 证书存证合约-证书存证查询
     * Summary: 证书存证合约-证书存证查询
     */
    public QueryDepositCertificateResponse queryDepositCertificate(QueryDepositCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 证书存证合约-证书存证查询
     * Summary: 证书存证合约-证书存证查询
     */
    public QueryDepositCertificateResponse queryDepositCertificateEx(QueryDepositCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositCertificateResponse());
    }

    /**
     * Description: 证书存证合约-创建证书存证
     * Summary: 证书存证合约-创建证书存证
     */
    public CreateDepositCertificateResponse createDepositCertificate(CreateDepositCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 证书存证合约-创建证书存证
     * Summary: 证书存证合约-创建证书存证
     */
    public CreateDepositCertificateResponse createDepositCertificateEx(CreateDepositCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.caasplatform.deposit.certificate.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateDepositCertificateResponse createDepositCertificateResponse = CreateDepositCertificateResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createDepositCertificateResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.certificate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDepositCertificateResponse());
    }

    /**
     * Description: 捐赠合约-捐赠证明查询
     * Summary: 捐赠合约-捐赠证明查询
     */
    public QueryDepositCharityResponse queryDepositCharity(QueryDepositCharityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositCharityEx(request, headers, runtime);
    }

    /**
     * Description: 捐赠合约-捐赠证明查询
     * Summary: 捐赠合约-捐赠证明查询
     */
    public QueryDepositCharityResponse queryDepositCharityEx(QueryDepositCharityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.charity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositCharityResponse());
    }

    /**
     * Description: 捐赠合约-创建捐赠证明
     * Summary: 捐赠合约-创建捐赠证明
     */
    public CreateDepositCharityResponse createDepositCharity(CreateDepositCharityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositCharityEx(request, headers, runtime);
    }

    /**
     * Description: 捐赠合约-创建捐赠证明
     * Summary: 捐赠合约-创建捐赠证明
     */
    public CreateDepositCharityResponse createDepositCharityEx(CreateDepositCharityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.caasplatform.deposit.charity.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateDepositCharityResponse createDepositCharityResponse = CreateDepositCharityResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createDepositCharityResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.charity.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDepositCharityResponse());
    }

    /**
     * Description: 抽奖活动审计合约-中奖记录查询
     * Summary: 抽奖活动审计合约-中奖记录查询
     */
    public QueryDepositSweepstakesResponse queryDepositSweepstakes(QueryDepositSweepstakesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositSweepstakesEx(request, headers, runtime);
    }

    /**
     * Description: 抽奖活动审计合约-中奖记录查询
     * Summary: 抽奖活动审计合约-中奖记录查询
     */
    public QueryDepositSweepstakesResponse queryDepositSweepstakesEx(QueryDepositSweepstakesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.sweepstakes.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositSweepstakesResponse());
    }

    /**
     * Description: 抽奖活动审计合约-创建活动记录
     * Summary: 抽奖活动审计合约-创建活动记录
     */
    public CreateDepositSweepstakesResponse createDepositSweepstakes(CreateDepositSweepstakesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositSweepstakesEx(request, headers, runtime);
    }

    /**
     * Description: 抽奖活动审计合约-创建活动记录
     * Summary: 抽奖活动审计合约-创建活动记录
     */
    public CreateDepositSweepstakesResponse createDepositSweepstakesEx(CreateDepositSweepstakesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.caasplatform.deposit.sweepstakes.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateDepositSweepstakesResponse createDepositSweepstakesResponse = CreateDepositSweepstakesResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createDepositSweepstakesResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.sweepstakes.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDepositSweepstakesResponse());
    }

    /**
     * Description: 通用合约调用-结构化存储场景
     * Summary: 通用合约调用-结构化存储场景
     */
    public SetGeneralDepositResponse setGeneralDeposit(SetGeneralDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setGeneralDepositEx(request, headers, runtime);
    }

    /**
     * Description: 通用合约调用-结构化存储场景
     * Summary: 通用合约调用-结构化存储场景
     */
    public SetGeneralDepositResponse setGeneralDepositEx(SetGeneralDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.deposit.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetGeneralDepositResponse());
    }

    /**
     * Description: 通用合约调用-结构化查询场景
     * Summary: 通用合约调用-结构化查询场景
     */
    public GetGeneralDepositResponse getGeneralDeposit(GetGeneralDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralDepositEx(request, headers, runtime);
    }

    /**
     * Description: 通用合约调用-结构化查询场景
     * Summary: 通用合约调用-结构化查询场景
     */
    public GetGeneralDepositResponse getGeneralDepositEx(GetGeneralDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.deposit.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralDepositResponse());
    }

    /**
     * Description: 通用合约调用-权益-转赠
     * Summary: 通用合约调用-权益-转赠
     */
    public PayGeneralRightsResponse payGeneralRights(PayGeneralRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralRightsEx(request, headers, runtime);
    }

    /**
     * Description: 通用合约调用-权益-转赠
     * Summary: 通用合约调用-权益-转赠
     */
    public PayGeneralRightsResponse payGeneralRightsEx(PayGeneralRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rights.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralRightsResponse());
    }

    /**
     * Description: 资源文件托管
     * Summary: 资源文件托管
     */
    public UploadExtendRightsResponse uploadExtendRights(UploadExtendRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadExtendRightsEx(request, headers, runtime);
    }

    /**
     * Description: 资源文件托管
     * Summary: 资源文件托管
     */
    public UploadExtendRightsResponse uploadExtendRightsEx(UploadExtendRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.caasplatform.extend.rights.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadExtendRightsResponse uploadExtendRightsResponse = UploadExtendRightsResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadExtendRightsResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.extend.rights.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadExtendRightsResponse());
    }

    /**
     * Description: 创建链上账户
     * Summary: 创建链上账户
     */
    public CreateExtendRightsResponse createExtendRights(CreateExtendRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExtendRightsEx(request, headers, runtime);
    }

    /**
     * Description: 创建链上账户
     * Summary: 创建链上账户
     */
    public CreateExtendRightsResponse createExtendRightsEx(CreateExtendRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.extend.rights.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateExtendRightsResponse());
    }

    /**
     * Description: 通用合约调用-权益-铸造
     * Summary: 通用合约调用-权益-铸造
     */
    public RegisterGeneralRightsResponse registerGeneralRights(RegisterGeneralRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralRightsEx(request, headers, runtime);
    }

    /**
     * Description: 通用合约调用-权益-铸造
     * Summary: 通用合约调用-权益-铸造
     */
    public RegisterGeneralRightsResponse registerGeneralRightsEx(RegisterGeneralRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rights.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralRightsResponse());
    }

    /**
     * Description: 通用合约调用-权益-URL查询
     * Summary: 通用合约调用-权益- URL查询
     */
    public GetGeneralRightsResponse getGeneralRights(GetGeneralRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralRightsEx(request, headers, runtime);
    }

    /**
     * Description: 通用合约调用-权益-URL查询
     * Summary: 通用合约调用-权益- URL查询
     */
    public GetGeneralRightsResponse getGeneralRightsEx(GetGeneralRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rights.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralRightsResponse());
    }

    /**
     * Description: 1.分账方最大数量限制50
    2.id存在则更新分账方
    3.存在分账记录的分账方不能被更新
     * Summary: 分账合约-配置分账方
     */
    public RegisterGeneralDivideResponse registerGeneralDivide(RegisterGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 1.分账方最大数量限制50
    2.id存在则更新分账方
    3.存在分账记录的分账方不能被更新
     * Summary: 分账合约-配置分账方
     */
    public RegisterGeneralDivideResponse registerGeneralDivideEx(RegisterGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralDivideResponse());
    }

    /**
     * Description: 分账合约-查询分账方
     * Summary: 分账合约-查询分账方
     */
    public QueryGeneralDivideResponse queryGeneralDivide(QueryGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 分账合约-查询分账方
     * Summary: 分账合约-查询分账方
     */
    public QueryGeneralDivideResponse queryGeneralDivideEx(QueryGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGeneralDivideResponse());
    }

    /**
     * Description: 1.分账规则id不能重复配置
    2.至少配置一个分账方
    3.分账方id需要已存在
    4.分账份额保留2位小数,多余部分舍弃
    5.分账份额需小于100 且大于0
    6.总份额不能大于100
     * Summary: 分账合约-配置分账规则
     */
    public SetGeneralDivideResponse setGeneralDivide(SetGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 1.分账规则id不能重复配置
    2.至少配置一个分账方
    3.分账方id需要已存在
    4.分账份额保留2位小数,多余部分舍弃
    5.分账份额需小于100 且大于0
    6.总份额不能大于100
     * Summary: 分账合约-配置分账规则
     */
    public SetGeneralDivideResponse setGeneralDivideEx(SetGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetGeneralDivideResponse());
    }

    /**
     * Description: 分账合约-查询分账规则
     * Summary: 分账合约-查询分账规则
     */
    public GetGeneralDivideResponse getGeneralDivide(GetGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 分账合约-查询分账规则
     * Summary: 分账合约-查询分账规则
     */
    public GetGeneralDivideResponse getGeneralDivideEx(GetGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralDivideResponse());
    }

    /**
     * Description: 1.分账方id需存在
    2.已分账的分账方不能删除
    3.已配置分账规则的分账方不能删除
     * Summary: 分账合约-删除分账方
     */
    public DeleteGeneralDivideResponse deleteGeneralDivide(DeleteGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 1.分账方id需存在
    2.已分账的分账方不能删除
    3.已配置分账规则的分账方不能删除
     * Summary: 分账合约-删除分账方
     */
    public DeleteGeneralDivideResponse deleteGeneralDivideEx(DeleteGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteGeneralDivideResponse());
    }

    /**
     * Description: 1.订单id不能重复
    2.金额不能小于0，金额保留3位小数多余部分舍弃
    3.分账方id需要已存在
    4.分账规则id需已存在
     * Summary: 分账合约-发起分账
     */
    public PayGeneralDivideResponse payGeneralDivide(PayGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 1.订单id不能重复
    2.金额不能小于0，金额保留3位小数多余部分舍弃
    3.分账方id需要已存在
    4.分账规则id需已存在
     * Summary: 分账合约-发起分账
     */
    public PayGeneralDivideResponse payGeneralDivideEx(PayGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralDivideResponse());
    }

    /**
     * Description: 分账合约-获取分账方余额
     * Summary: 分账合约-获取分账方余额
     */
    public PullGeneralDivideResponse pullGeneralDivide(PullGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 分账合约-获取分账方余额
     * Summary: 分账合约-获取分账方余额
     */
    public PullGeneralDivideResponse pullGeneralDivideEx(PullGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullGeneralDivideResponse());
    }

    /**
     * Description: 分账合约-获取订单分账信息
     * Summary: 分账合约-获取订单分账信息
     */
    public BatchqueryGeneralDivideResponse batchqueryGeneralDivide(BatchqueryGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 分账合约-获取订单分账信息
     * Summary: 分账合约-获取订单分账信息
     */
    public BatchqueryGeneralDivideResponse batchqueryGeneralDivideEx(BatchqueryGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryGeneralDivideResponse());
    }

    /**
     * Description: 旅游文创合约-文创URL查询
     * Summary: 旅游文创合约-文创URL查询
     */
    public GetGeneralTourismResponse getGeneralTourism(GetGeneralTourismRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralTourismEx(request, headers, runtime);
    }

    /**
     * Description: 旅游文创合约-文创URL查询
     * Summary: 旅游文创合约-文创URL查询
     */
    public GetGeneralTourismResponse getGeneralTourismEx(GetGeneralTourismRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tourism.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralTourismResponse());
    }

    /**
     * Description: 旅游文创合约-铸造文创
     * Summary: 旅游文创合约-铸造文创
     */
    public RegisterGeneralTourismResponse registerGeneralTourism(RegisterGeneralTourismRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralTourismEx(request, headers, runtime);
    }

    /**
     * Description: 旅游文创合约-铸造文创
     * Summary: 旅游文创合约-铸造文创
     */
    public RegisterGeneralTourismResponse registerGeneralTourismEx(RegisterGeneralTourismRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tourism.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralTourismResponse());
    }

    /**
     * Description: 旅游文创合约-文创转增
     * Summary: 旅游文创合约-文创转增
     */
    public PayGeneralTourismResponse payGeneralTourism(PayGeneralTourismRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralTourismEx(request, headers, runtime);
    }

    /**
     * Description: 旅游文创合约-文创转增
     * Summary: 旅游文创合约-文创转增
     */
    public PayGeneralTourismResponse payGeneralTourismEx(PayGeneralTourismRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tourism.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralTourismResponse());
    }

    /**
     * Description: 线下门票合约-门票URL查询
     * Summary: 线下门票合约-门票URL查询
     */
    public GetGeneralTicketsResponse getGeneralTickets(GetGeneralTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralTicketsEx(request, headers, runtime);
    }

    /**
     * Description: 线下门票合约-门票URL查询
     * Summary: 线下门票合约-门票URL查询
     */
    public GetGeneralTicketsResponse getGeneralTicketsEx(GetGeneralTicketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tickets.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralTicketsResponse());
    }

    /**
     * Description: 线下门票合约-铸造线下买票
     * Summary: 线下门票合约-铸造线下买票
     */
    public RegisterGeneralTicketsResponse registerGeneralTickets(RegisterGeneralTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralTicketsEx(request, headers, runtime);
    }

    /**
     * Description: 线下门票合约-铸造线下买票
     * Summary: 线下门票合约-铸造线下买票
     */
    public RegisterGeneralTicketsResponse registerGeneralTicketsEx(RegisterGeneralTicketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tickets.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralTicketsResponse());
    }

    /**
     * Description: 线下门票合约-门票转增
     * Summary: 线下门票合约-门票转增
     */
    public PayGeneralTicketsResponse payGeneralTickets(PayGeneralTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralTicketsEx(request, headers, runtime);
    }

    /**
     * Description: 线下门票合约-门票转增
     * Summary: 线下门票合约-门票转增
     */
    public PayGeneralTicketsResponse payGeneralTicketsEx(PayGeneralTicketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tickets.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralTicketsResponse());
    }

    /**
     * Description: 进行分账规则的确认
     * Summary: 分账规则确认接口
     */
    public UpdateGeneralDivideResponse updateGeneralDivide(UpdateGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 进行分账规则的确认
     * Summary: 分账规则确认接口
     */
    public UpdateGeneralDivideResponse updateGeneralDivideEx(UpdateGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGeneralDivideResponse());
    }

    /**
     * Description: 查询指定分账方的分账明细数据
     * Summary: 分账明细查询
     */
    public ListGeneralDivideResponse listGeneralDivide(ListGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGeneralDivideEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定分账方的分账明细数据
     * Summary: 分账明细查询
     */
    public ListGeneralDivideResponse listGeneralDivideEx(ListGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListGeneralDivideResponse());
    }

    /**
     * Description: 查询某个账户下拥有的资产数量
     * Summary: 权证资产合约资产查询
     */
    public GetGeneralRightsbalanceResponse getGeneralRightsbalance(GetGeneralRightsbalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralRightsbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询某个账户下拥有的资产数量
     * Summary: 权证资产合约资产查询
     */
    public GetGeneralRightsbalanceResponse getGeneralRightsbalanceEx(GetGeneralRightsbalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rightsbalance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralRightsbalanceResponse());
    }

    /**
     * Description: 获取蚂蚁区块链交易二维码
     * Summary: 获取蚂蚁区块链交易二维码
     */
    public DescribeExtendTxqrcodeResponse describeExtendTxqrcode(DescribeExtendTxqrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExtendTxqrcodeEx(request, headers, runtime);
    }

    /**
     * Description: 获取蚂蚁区块链交易二维码
     * Summary: 获取蚂蚁区块链交易二维码
     */
    public DescribeExtendTxqrcodeResponse describeExtendTxqrcodeEx(DescribeExtendTxqrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.extend.txqrcode.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeExtendTxqrcodeResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
