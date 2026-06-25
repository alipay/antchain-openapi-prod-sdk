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
                    new TeaPair("sdk_version", "1.7.0"),
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
     * <b>description</b> :
     * <p>Description: 多环节业务存证
     * Summary: 多环节业务存证</p>
     */
    public CreateMultistepDepositResponse createMultistepDeposit(CreateMultistepDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMultistepDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 多环节业务存证
     * Summary: 多环节业务存证</p>
     */
    public CreateMultistepDepositResponse createMultistepDepositEx(CreateMultistepDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.multistep.deposit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMultistepDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证证明申请
     * Summary: 存证证明申请</p>
     */
    public ApplyCertificationResponse applyCertification(ApplyCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyCertificationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证证明申请
     * Summary: 存证证明申请</p>
     */
    public ApplyCertificationResponse applyCertificationEx(ApplyCertificationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.certification.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyCertificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 证明处理任务状态查询
     * Summary: 证明处理任务状态查询</p>
     */
    public QueryCertificationStatusResponse queryCertificationStatus(QueryCertificationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertificationStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 证明处理任务状态查询
     * Summary: 证明处理任务状态查询</p>
     */
    public QueryCertificationStatusResponse queryCertificationStatusEx(QueryCertificationStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.certification.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertificationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询出证证明文件信息
     * Summary: 查询出证证明文件信息</p>
     */
    public QueryCertificationInfoResponse queryCertificationInfo(QueryCertificationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertificationInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询出证证明文件信息
     * Summary: 查询出证证明文件信息</p>
     */
    public QueryCertificationInfoResponse queryCertificationInfoEx(QueryCertificationInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.certification.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertificationInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证处出证申请
     * Summary: 公证处出证申请</p>
     */
    public ApplyCertificationNotaryResponse applyCertificationNotary(ApplyCertificationNotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyCertificationNotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 公证处出证申请
     * Summary: 公证处出证申请</p>
     */
    public ApplyCertificationNotaryResponse applyCertificationNotaryEx(ApplyCertificationNotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.certification.notary.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyCertificationNotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建存证
     * Summary: 创建存证</p>
     */
    public CreateDepositResponse createDeposit(CreateDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建存证
     * Summary: 创建存证</p>
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
     * <b>description</b> :
     * <p>Description: 存证查询
     * Summary: 存证查询</p>
     */
    public QueryDepositResponse queryDeposit(QueryDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证查询
     * Summary: 存证查询</p>
     */
    public QueryDepositResponse queryDepositEx(QueryDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 证书存证合约-证书存证查询
     * Summary: 证书存证合约-证书存证查询</p>
     */
    public QueryDepositCertificateResponse queryDepositCertificate(QueryDepositCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 证书存证合约-证书存证查询
     * Summary: 证书存证合约-证书存证查询</p>
     */
    public QueryDepositCertificateResponse queryDepositCertificateEx(QueryDepositCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 证书存证合约-创建证书存证
     * Summary: 证书存证合约-创建证书存证</p>
     */
    public CreateDepositCertificateResponse createDepositCertificate(CreateDepositCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 证书存证合约-创建证书存证
     * Summary: 证书存证合约-创建证书存证</p>
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
     * <b>description</b> :
     * <p>Description: 捐赠合约-捐赠证明查询
     * Summary: 捐赠合约-捐赠证明查询</p>
     */
    public QueryDepositCharityResponse queryDepositCharity(QueryDepositCharityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositCharityEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 捐赠合约-捐赠证明查询
     * Summary: 捐赠合约-捐赠证明查询</p>
     */
    public QueryDepositCharityResponse queryDepositCharityEx(QueryDepositCharityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.charity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositCharityResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 捐赠合约-创建捐赠证明
     * Summary: 捐赠合约-创建捐赠证明</p>
     */
    public CreateDepositCharityResponse createDepositCharity(CreateDepositCharityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositCharityEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 捐赠合约-创建捐赠证明
     * Summary: 捐赠合约-创建捐赠证明</p>
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
     * <b>description</b> :
     * <p>Description: 抽奖活动审计合约-中奖记录查询
     * Summary: 抽奖活动审计合约-中奖记录查询</p>
     */
    public QueryDepositSweepstakesResponse queryDepositSweepstakes(QueryDepositSweepstakesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDepositSweepstakesEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 抽奖活动审计合约-中奖记录查询
     * Summary: 抽奖活动审计合约-中奖记录查询</p>
     */
    public QueryDepositSweepstakesResponse queryDepositSweepstakesEx(QueryDepositSweepstakesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.deposit.sweepstakes.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDepositSweepstakesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 抽奖活动审计合约-创建活动记录
     * Summary: 抽奖活动审计合约-创建活动记录</p>
     */
    public CreateDepositSweepstakesResponse createDepositSweepstakes(CreateDepositSweepstakesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDepositSweepstakesEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 抽奖活动审计合约-创建活动记录
     * Summary: 抽奖活动审计合约-创建活动记录</p>
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
     * <b>description</b> :
     * <p>Description: 通用合约调用-结构化存储场景
     * Summary: 通用合约调用-结构化存储场景</p>
     */
    public SetGeneralDepositResponse setGeneralDeposit(SetGeneralDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setGeneralDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-结构化存储场景
     * Summary: 通用合约调用-结构化存储场景</p>
     */
    public SetGeneralDepositResponse setGeneralDepositEx(SetGeneralDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.deposit.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetGeneralDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-结构化查询场景
     * Summary: 通用合约调用-结构化查询场景</p>
     */
    public GetGeneralDepositResponse getGeneralDeposit(GetGeneralDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-结构化查询场景
     * Summary: 通用合约调用-结构化查询场景</p>
     */
    public GetGeneralDepositResponse getGeneralDepositEx(GetGeneralDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.deposit.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-权益-转赠
     * Summary: 通用合约调用-权益-转赠</p>
     */
    public PayGeneralRightsResponse payGeneralRights(PayGeneralRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralRightsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-权益-转赠
     * Summary: 通用合约调用-权益-转赠</p>
     */
    public PayGeneralRightsResponse payGeneralRightsEx(PayGeneralRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rights.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralRightsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资源文件托管
     * Summary: 资源文件托管</p>
     */
    public UploadExtendRightsResponse uploadExtendRights(UploadExtendRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadExtendRightsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资源文件托管
     * Summary: 资源文件托管</p>
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
     * <b>description</b> :
     * <p>Description: 创建链上账户
     * Summary: 创建链上账户</p>
     */
    public CreateExtendRightsResponse createExtendRights(CreateExtendRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExtendRightsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建链上账户
     * Summary: 创建链上账户</p>
     */
    public CreateExtendRightsResponse createExtendRightsEx(CreateExtendRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.extend.rights.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateExtendRightsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-权益-铸造
     * Summary: 通用合约调用-权益-铸造</p>
     */
    public RegisterGeneralRightsResponse registerGeneralRights(RegisterGeneralRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralRightsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-权益-铸造
     * Summary: 通用合约调用-权益-铸造</p>
     */
    public RegisterGeneralRightsResponse registerGeneralRightsEx(RegisterGeneralRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rights.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralRightsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-权益-URL查询
     * Summary: 通用合约调用-权益- URL查询</p>
     */
    public GetGeneralRightsResponse getGeneralRights(GetGeneralRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralRightsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通用合约调用-权益-URL查询
     * Summary: 通用合约调用-权益- URL查询</p>
     */
    public GetGeneralRightsResponse getGeneralRightsEx(GetGeneralRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rights.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralRightsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.分账方最大数量限制50
     * 2.id存在则更新分账方
     * 3.存在分账记录的分账方不能被更新
     * Summary: 分账合约-配置分账方</p>
     */
    public RegisterGeneralDivideResponse registerGeneralDivide(RegisterGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.分账方最大数量限制50
     * 2.id存在则更新分账方
     * 3.存在分账记录的分账方不能被更新
     * Summary: 分账合约-配置分账方</p>
     */
    public RegisterGeneralDivideResponse registerGeneralDivideEx(RegisterGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-查询分账方
     * Summary: 分账合约-查询分账方</p>
     */
    public QueryGeneralDivideResponse queryGeneralDivide(QueryGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-查询分账方
     * Summary: 分账合约-查询分账方</p>
     */
    public QueryGeneralDivideResponse queryGeneralDivideEx(QueryGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.分账规则id不能重复配置
     * 2.至少配置一个分账方
     * 3.分账方id需要已存在
     * 4.分账份额保留2位小数,多余部分舍弃
     * 5.分账份额需小于100且大于0
     * 6.总份额不能大于100
     * Summary: 分账合约-配置分账规则</p>
     */
    public SetGeneralDivideResponse setGeneralDivide(SetGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.分账规则id不能重复配置
     * 2.至少配置一个分账方
     * 3.分账方id需要已存在
     * 4.分账份额保留2位小数,多余部分舍弃
     * 5.分账份额需小于100且大于0
     * 6.总份额不能大于100
     * Summary: 分账合约-配置分账规则</p>
     */
    public SetGeneralDivideResponse setGeneralDivideEx(SetGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-查询分账规则
     * Summary: 分账合约-查询分账规则</p>
     */
    public GetGeneralDivideResponse getGeneralDivide(GetGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-查询分账规则
     * Summary: 分账合约-查询分账规则</p>
     */
    public GetGeneralDivideResponse getGeneralDivideEx(GetGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.分账方id需存在
     * 2.已分账的分账方不能删除
     * 3.已配置分账规则的分账方不能删除
     * Summary: 分账合约-删除分账方</p>
     */
    public DeleteGeneralDivideResponse deleteGeneralDivide(DeleteGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.分账方id需存在
     * 2.已分账的分账方不能删除
     * 3.已配置分账规则的分账方不能删除
     * Summary: 分账合约-删除分账方</p>
     */
    public DeleteGeneralDivideResponse deleteGeneralDivideEx(DeleteGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.订单id不能重复
     * 2.金额不能小于0，金额保留3位小数多余部分舍弃
     * 3.分账方id需要已存在
     * 4.分账规则id需已存在
     * Summary: 分账合约-发起分账</p>
     */
    public PayGeneralDivideResponse payGeneralDivide(PayGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 1.订单id不能重复
     * 2.金额不能小于0，金额保留3位小数多余部分舍弃
     * 3.分账方id需要已存在
     * 4.分账规则id需已存在
     * Summary: 分账合约-发起分账</p>
     */
    public PayGeneralDivideResponse payGeneralDivideEx(PayGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-获取分账方余额
     * Summary: 分账合约-获取分账方余额</p>
     */
    public PullGeneralDivideResponse pullGeneralDivide(PullGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-获取分账方余额
     * Summary: 分账合约-获取分账方余额</p>
     */
    public PullGeneralDivideResponse pullGeneralDivideEx(PullGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-获取订单分账信息
     * Summary: 分账合约-获取订单分账信息</p>
     */
    public BatchqueryGeneralDivideResponse batchqueryGeneralDivide(BatchqueryGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账合约-获取订单分账信息
     * Summary: 分账合约-获取订单分账信息</p>
     */
    public BatchqueryGeneralDivideResponse batchqueryGeneralDivideEx(BatchqueryGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 旅游文创合约-文创URL查询
     * Summary: 旅游文创合约-文创URL查询</p>
     */
    public GetGeneralTourismResponse getGeneralTourism(GetGeneralTourismRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralTourismEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 旅游文创合约-文创URL查询
     * Summary: 旅游文创合约-文创URL查询</p>
     */
    public GetGeneralTourismResponse getGeneralTourismEx(GetGeneralTourismRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tourism.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralTourismResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 旅游文创合约-铸造文创
     * Summary: 旅游文创合约-铸造文创</p>
     */
    public RegisterGeneralTourismResponse registerGeneralTourism(RegisterGeneralTourismRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralTourismEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 旅游文创合约-铸造文创
     * Summary: 旅游文创合约-铸造文创</p>
     */
    public RegisterGeneralTourismResponse registerGeneralTourismEx(RegisterGeneralTourismRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tourism.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralTourismResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 旅游文创合约-文创转增
     * Summary: 旅游文创合约-文创转增</p>
     */
    public PayGeneralTourismResponse payGeneralTourism(PayGeneralTourismRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralTourismEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 旅游文创合约-文创转增
     * Summary: 旅游文创合约-文创转增</p>
     */
    public PayGeneralTourismResponse payGeneralTourismEx(PayGeneralTourismRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tourism.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralTourismResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 线下门票合约-门票URL查询
     * Summary: 线下门票合约-门票URL查询</p>
     */
    public GetGeneralTicketsResponse getGeneralTickets(GetGeneralTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralTicketsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 线下门票合约-门票URL查询
     * Summary: 线下门票合约-门票URL查询</p>
     */
    public GetGeneralTicketsResponse getGeneralTicketsEx(GetGeneralTicketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tickets.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralTicketsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 线下门票合约-铸造线下买票
     * Summary: 线下门票合约-铸造线下买票</p>
     */
    public RegisterGeneralTicketsResponse registerGeneralTickets(RegisterGeneralTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerGeneralTicketsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 线下门票合约-铸造线下买票
     * Summary: 线下门票合约-铸造线下买票</p>
     */
    public RegisterGeneralTicketsResponse registerGeneralTicketsEx(RegisterGeneralTicketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tickets.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterGeneralTicketsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 线下门票合约-门票转增
     * Summary: 线下门票合约-门票转增</p>
     */
    public PayGeneralTicketsResponse payGeneralTickets(PayGeneralTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payGeneralTicketsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 线下门票合约-门票转增
     * Summary: 线下门票合约-门票转增</p>
     */
    public PayGeneralTicketsResponse payGeneralTicketsEx(PayGeneralTicketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.tickets.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayGeneralTicketsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 进行分账规则的确认
     * Summary: 分账规则确认接口</p>
     */
    public UpdateGeneralDivideResponse updateGeneralDivide(UpdateGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 进行分账规则的确认
     * Summary: 分账规则确认接口</p>
     */
    public UpdateGeneralDivideResponse updateGeneralDivideEx(UpdateGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定分账方的分账明细数据
     * Summary: 分账明细查询</p>
     */
    public ListGeneralDivideResponse listGeneralDivide(ListGeneralDivideRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGeneralDivideEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定分账方的分账明细数据
     * Summary: 分账明细查询</p>
     */
    public ListGeneralDivideResponse listGeneralDivideEx(ListGeneralDivideRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.divide.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListGeneralDivideResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询某个账户下拥有的资产数量
     * Summary: 权证资产合约资产查询</p>
     */
    public GetGeneralRightsbalanceResponse getGeneralRightsbalance(GetGeneralRightsbalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGeneralRightsbalanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询某个账户下拥有的资产数量
     * Summary: 权证资产合约资产查询</p>
     */
    public GetGeneralRightsbalanceResponse getGeneralRightsbalanceEx(GetGeneralRightsbalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.general.rightsbalance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetGeneralRightsbalanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取蚂蚁区块链交易二维码
     * Summary: 获取蚂蚁区块链交易二维码</p>
     */
    public DescribeExtendTxqrcodeResponse describeExtendTxqrcode(DescribeExtendTxqrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExtendTxqrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取蚂蚁区块链交易二维码
     * Summary: 获取蚂蚁区块链交易二维码</p>
     */
    public DescribeExtendTxqrcodeResponse describeExtendTxqrcodeEx(DescribeExtendTxqrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.caasplatform.extend.txqrcode.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeExtendTxqrcodeResponse());
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
