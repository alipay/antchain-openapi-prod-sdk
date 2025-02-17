// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.das.models.*;

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
                    new TeaPair("sdk_version", "1.1.67"),
                    new TeaPair("_prod_code", "DAS"),
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
     * Description: 上传批量查询数据文件
     * Summary: 上传批量查询数据文件
     */
    public UploadApplicationBatchqueryfileResponse uploadApplicationBatchqueryfile(UploadApplicationBatchqueryfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadApplicationBatchqueryfileEx(request, headers, runtime);
    }

    /**
     * Description: 上传批量查询数据文件
     * Summary: 上传批量查询数据文件
     */
    public UploadApplicationBatchqueryfileResponse uploadApplicationBatchqueryfileEx(UploadApplicationBatchqueryfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.das.application.batchqueryfile.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadApplicationBatchqueryfileResponse uploadApplicationBatchqueryfileResponse = UploadApplicationBatchqueryfileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadApplicationBatchqueryfileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.batchqueryfile.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadApplicationBatchqueryfileResponse());
    }

    /**
     * Description: 获取查询数据集任务结果
     * Summary: 获取查询数据集任务结果
     */
    public QueryApplicationBatchqueryresultResponse queryApplicationBatchqueryresult(QueryApplicationBatchqueryresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationBatchqueryresultEx(request, headers, runtime);
    }

    /**
     * Description: 获取查询数据集任务结果
     * Summary: 获取查询数据集任务结果
     */
    public QueryApplicationBatchqueryresultResponse queryApplicationBatchqueryresultEx(QueryApplicationBatchqueryresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.batchqueryresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationBatchqueryresultResponse());
    }

    /**
     * Description: 实时获取数据源数据
     * Summary: 实时查询数据
     */
    public QueryApplicationDataResponse queryApplicationData(QueryApplicationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationDataEx(request, headers, runtime);
    }

    /**
     * Description: 实时获取数据源数据
     * Summary: 实时查询数据
     */
    public QueryApplicationDataResponse queryApplicationDataEx(QueryApplicationDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationDataResponse());
    }

    /**
     * Description: 知识产权实时接口
     * Summary: 知识产权实时接口
     */
    public QueryApplicationIpeResponse queryApplicationIpe(QueryApplicationIpeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationIpeEx(request, headers, runtime);
    }

    /**
     * Description: 知识产权实时接口
     * Summary: 知识产权实时接口
     */
    public QueryApplicationIpeResponse queryApplicationIpeEx(QueryApplicationIpeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.ipe.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationIpeResponse());
    }

    /**
     * Description: 查询国内商标数据
     * Summary: 查询国内商标数据
     */
    public QueryDomesticTrademarkResponse queryDomesticTrademark(QueryDomesticTrademarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDomesticTrademarkEx(request, headers, runtime);
    }

    /**
     * Description: 查询国内商标数据
     * Summary: 查询国内商标数据
     */
    public QueryDomesticTrademarkResponse queryDomesticTrademarkEx(QueryDomesticTrademarkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.domestic.trademark.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDomesticTrademarkResponse());
    }

    /**
     * Description: 获取国内商标LOGO文件
     * Summary: 获取国内商标LOGO文件
     */
    public GetDomesticTrademarklogoResponse getDomesticTrademarklogo(GetDomesticTrademarklogoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomesticTrademarklogoEx(request, headers, runtime);
    }

    /**
     * Description: 获取国内商标LOGO文件
     * Summary: 获取国内商标LOGO文件
     */
    public GetDomesticTrademarklogoResponse getDomesticTrademarklogoEx(GetDomesticTrademarklogoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.domestic.trademarklogo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDomesticTrademarklogoResponse());
    }

    /**
     * Description: 查询加密的企业工商信息
     * Summary: 查询加密的企业工商信息
     */
    public QueryEncryptEnterpriseinfoResponse queryEncryptEnterpriseinfo(QueryEncryptEnterpriseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEncryptEnterpriseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询加密的企业工商信息
     * Summary: 查询加密的企业工商信息
     */
    public QueryEncryptEnterpriseinfoResponse queryEncryptEnterpriseinfoEx(QueryEncryptEnterpriseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.encrypt.enterpriseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEncryptEnterpriseinfoResponse());
    }

    /**
     * Description: 上传授权协议文件
     * Summary: 上传授权协议文件
     */
    public UploadApplicationAuthfileResponse uploadApplicationAuthfile(UploadApplicationAuthfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadApplicationAuthfileEx(request, headers, runtime);
    }

    /**
     * Description: 上传授权协议文件
     * Summary: 上传授权协议文件
     */
    public UploadApplicationAuthfileResponse uploadApplicationAuthfileEx(UploadApplicationAuthfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.das.application.authfile.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadApplicationAuthfileResponse uploadApplicationAuthfileResponse = UploadApplicationAuthfileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadApplicationAuthfileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.authfile.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadApplicationAuthfileResponse());
    }

    /**
     * Description: 校验用户是否车
     * Summary: 校验用户是否车
     */
    public CheckApplicationHascarResponse checkApplicationHascar(CheckApplicationHascarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkApplicationHascarEx(request, headers, runtime);
    }

    /**
     * Description: 校验用户是否车
     * Summary: 校验用户是否车
     */
    public CheckApplicationHascarResponse checkApplicationHascarEx(CheckApplicationHascarRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.hascar.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckApplicationHascarResponse());
    }

    /**
     * Description: 查询车辆基础信息
     * Summary: 查询车辆基础信息
     */
    public QueryApplicationBasecarinfoResponse queryApplicationBasecarinfo(QueryApplicationBasecarinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationBasecarinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询车辆基础信息
     * Summary: 查询车辆基础信息
     */
    public QueryApplicationBasecarinfoResponse queryApplicationBasecarinfoEx(QueryApplicationBasecarinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.basecarinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationBasecarinfoResponse());
    }

    /**
     * Description: 查询车辆详细信息
     * Summary: 查询车辆详细信息
     */
    public QueryApplicationDetailcarinfoResponse queryApplicationDetailcarinfo(QueryApplicationDetailcarinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationDetailcarinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询车辆详细信息
     * Summary: 查询车辆详细信息
     */
    public QueryApplicationDetailcarinfoResponse queryApplicationDetailcarinfoEx(QueryApplicationDetailcarinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.detailcarinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationDetailcarinfoResponse());
    }

    /**
     * Description: 授权简历查询服务
     * Summary: 授权简历查询服务
     */
    public SignApplicationResumeResponse signApplicationResume(SignApplicationResumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signApplicationResumeEx(request, headers, runtime);
    }

    /**
     * Description: 授权简历查询服务
     * Summary: 授权简历查询服务
     */
    public SignApplicationResumeResponse signApplicationResumeEx(SignApplicationResumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.resume.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignApplicationResumeResponse());
    }

    /**
     * Description: 查询简历信息
     * Summary: 查询简历信息
     */
    public QueryApplicationResumeResponse queryApplicationResume(QueryApplicationResumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationResumeEx(request, headers, runtime);
    }

    /**
     * Description: 查询简历信息
     * Summary: 查询简历信息
     */
    public QueryApplicationResumeResponse queryApplicationResumeEx(QueryApplicationResumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.resume.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationResumeResponse());
    }

    /**
     * Description: 人车核验并查询车辆详细信息
     * Summary: 人车核验并查询车辆详细信息
     */
    public QueryDetailcarinfoPesonandlicResponse queryDetailcarinfoPesonandlic(QueryDetailcarinfoPesonandlicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDetailcarinfoPesonandlicEx(request, headers, runtime);
    }

    /**
     * Description: 人车核验并查询车辆详细信息
     * Summary: 人车核验并查询车辆详细信息
     */
    public QueryDetailcarinfoPesonandlicResponse queryDetailcarinfoPesonandlicEx(QueryDetailcarinfoPesonandlicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.detailcarinfo.pesonandlic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDetailcarinfoPesonandlicResponse());
    }

    /**
     * Description: 教育标签(姓名身份证)信息查询
     * Summary: 教育标签(姓名身份证)信息查询
     */
    public QueryIdnumberEducationtaginfoResponse queryIdnumberEducationtaginfo(QueryIdnumberEducationtaginfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdnumberEducationtaginfoEx(request, headers, runtime);
    }

    /**
     * Description: 教育标签(姓名身份证)信息查询
     * Summary: 教育标签(姓名身份证)信息查询
     */
    public QueryIdnumberEducationtaginfoResponse queryIdnumberEducationtaginfoEx(QueryIdnumberEducationtaginfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.idnumber.educationtaginfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdnumberEducationtaginfoResponse());
    }

    /**
     * Description: 教育信息查询（姓名手机号/姓名身份证）
     * Summary: 教育信息查询（姓名手机号/姓名身份证）
     */
    public QueryPhonenumberEducationinfoResponse queryPhonenumberEducationinfo(QueryPhonenumberEducationinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPhonenumberEducationinfoEx(request, headers, runtime);
    }

    /**
     * Description: 教育信息查询（姓名手机号/姓名身份证）
     * Summary: 教育信息查询（姓名手机号/姓名身份证）
     */
    public QueryPhonenumberEducationinfoResponse queryPhonenumberEducationinfoEx(QueryPhonenumberEducationinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.phonenumber.educationinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPhonenumberEducationinfoResponse());
    }

    /**
     * Description: 数据应用统一入口
     * Summary: 数据应用统一入口
     */
    public QueryApplicationUnifiedentranceResponse queryApplicationUnifiedentrance(QueryApplicationUnifiedentranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationUnifiedentranceEx(request, headers, runtime);
    }

    /**
     * Description: 数据应用统一入口
     * Summary: 数据应用统一入口
     */
    public QueryApplicationUnifiedentranceResponse queryApplicationUnifiedentranceEx(QueryApplicationUnifiedentranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.unifiedentrance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationUnifiedentranceResponse());
    }

    /**
     * Description: 根据姓名和身份证，返回驾驶证核验信息
     * Summary: 驾驶证核验信息查询
     */
    public QueryApplicationDriverlicensecertResponse queryApplicationDriverlicensecert(QueryApplicationDriverlicensecertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationDriverlicensecertEx(request, headers, runtime);
    }

    /**
     * Description: 根据姓名和身份证，返回驾驶证核验信息
     * Summary: 驾驶证核验信息查询
     */
    public QueryApplicationDriverlicensecertResponse queryApplicationDriverlicensecertEx(QueryApplicationDriverlicensecertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.driverlicensecert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationDriverlicensecertResponse());
    }

    /**
     * Description: 根据车牌号所有人等信息，返回行驶证核验结果
     * Summary: 行驶证核验信息查询
     */
    public QueryApplicationVehiclelicensecertResponse queryApplicationVehiclelicensecert(QueryApplicationVehiclelicensecertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationVehiclelicensecertEx(request, headers, runtime);
    }

    /**
     * Description: 根据车牌号所有人等信息，返回行驶证核验结果
     * Summary: 行驶证核验信息查询
     */
    public QueryApplicationVehiclelicensecertResponse queryApplicationVehiclelicensecertEx(QueryApplicationVehiclelicensecertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.vehiclelicensecert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationVehiclelicensecertResponse());
    }

    /**
     * Description: 根据姓名身份证信息查询学籍信息
     * Summary: 根据姓名身份证信息查询学籍
     */
    public QueryApplicationEducationstatusResponse queryApplicationEducationstatus(QueryApplicationEducationstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationEducationstatusEx(request, headers, runtime);
    }

    /**
     * Description: 根据姓名身份证信息查询学籍信息
     * Summary: 根据姓名身份证信息查询学籍
     */
    public QueryApplicationEducationstatusResponse queryApplicationEducationstatusEx(QueryApplicationEducationstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.educationstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplicationEducationstatusResponse());
    }

    /**
     * Description: 数据服务授权文件上传
     * Summary: 数据服务授权文件上传
     */
    public UploadServiceAuthfileResponse uploadServiceAuthfile(UploadServiceAuthfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadServiceAuthfileEx(request, headers, runtime);
    }

    /**
     * Description: 数据服务授权文件上传
     * Summary: 数据服务授权文件上传
     */
    public UploadServiceAuthfileResponse uploadServiceAuthfileEx(UploadServiceAuthfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.das.service.authfile.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadServiceAuthfileResponse uploadServiceAuthfileResponse = UploadServiceAuthfileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadServiceAuthfileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.service.authfile.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadServiceAuthfileResponse());
    }

    /**
     * Description: 查询国内商标扩展信息
     * Summary: 查询国内商标扩展信息
     */
    public QueryDomestictrademarkExtensioninfoResponse queryDomestictrademarkExtensioninfo(QueryDomestictrademarkExtensioninfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDomestictrademarkExtensioninfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询国内商标扩展信息
     * Summary: 查询国内商标扩展信息
     */
    public QueryDomestictrademarkExtensioninfoResponse queryDomestictrademarkExtensioninfoEx(QueryDomestictrademarkExtensioninfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.domestictrademark.extensioninfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDomestictrademarkExtensioninfoResponse());
    }

    /**
     * Description: 文件类型数据服务统一接口
     * Summary: 文件类型服务统一接口
     */
    public GetApplicationFileentranceResponse getApplicationFileentrance(GetApplicationFileentranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationFileentranceEx(request, headers, runtime);
    }

    /**
     * Description: 文件类型数据服务统一接口
     * Summary: 文件类型服务统一接口
     */
    public GetApplicationFileentranceResponse getApplicationFileentranceEx(GetApplicationFileentranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.fileentrance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationFileentranceResponse());
    }

    /**
     * Description: 万文
     * Summary: 异步入口--获取流水号
     */
    public InitUnifiedentranceAsyncResponse initUnifiedentranceAsync(InitUnifiedentranceAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initUnifiedentranceAsyncEx(request, headers, runtime);
    }

    /**
     * Description: 万文
     * Summary: 异步入口--获取流水号
     */
    public InitUnifiedentranceAsyncResponse initUnifiedentranceAsyncEx(InitUnifiedentranceAsyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.unifiedentrance.async.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitUnifiedentranceAsyncResponse());
    }

    /**
     * Description: 获取异步结果
     * Summary: 获取异步结果
     */
    public QueryUnifiedentranceAsyncResponse queryUnifiedentranceAsync(QueryUnifiedentranceAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUnifiedentranceAsyncEx(request, headers, runtime);
    }

    /**
     * Description: 获取异步结果
     * Summary: 获取异步结果
     */
    public QueryUnifiedentranceAsyncResponse queryUnifiedentranceAsyncEx(QueryUnifiedentranceAsyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.unifiedentrance.async.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUnifiedentranceAsyncResponse());
    }

    /**
     * Description: 数据应用统一入口，主站调用
     * Summary: 数据应用统一入口，主站调用
     */
    public QueryMainsiteUnifiedentranceResponse queryMainsiteUnifiedentrance(QueryMainsiteUnifiedentranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMainsiteUnifiedentranceEx(request, headers, runtime);
    }

    /**
     * Description: 数据应用统一入口，主站调用
     * Summary: 数据应用统一入口，主站调用
     */
    public QueryMainsiteUnifiedentranceResponse queryMainsiteUnifiedentranceEx(QueryMainsiteUnifiedentranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.mainsite.unifiedentrance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMainsiteUnifiedentranceResponse());
    }

    /**
     * Description: 代客签名
     * Summary: 代客签名
     */
    public GetApplicationProxysignResponse getApplicationProxysign(GetApplicationProxysignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationProxysignEx(request, headers, runtime);
    }

    /**
     * Description: 代客签名
     * Summary: 代客签名
     */
    public GetApplicationProxysignResponse getApplicationProxysignEx(GetApplicationProxysignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.application.proxysign.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetApplicationProxysignResponse());
    }

    /**
     * Description: 获取授权H5页面链接
     * Summary: 获取授权H5页面链接
     */
    public GetDasLinkResponse getDasLink(GetDasLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDasLinkEx(request, headers, runtime);
    }

    /**
     * Description: 获取授权H5页面链接
     * Summary: 获取授权H5页面链接
     */
    public GetDasLinkResponse getDasLinkEx(GetDasLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.link.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDasLinkResponse());
    }

    /**
     * Description: 获取授权企业VC
     * Summary: 获取授权企业VC
     */
    public GetDasEnterprisevcResponse getDasEnterprisevc(GetDasEnterprisevcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDasEnterprisevcEx(request, headers, runtime);
    }

    /**
     * Description: 获取授权企业VC
     * Summary: 获取授权企业VC
     */
    public GetDasEnterprisevcResponse getDasEnterprisevcEx(GetDasEnterprisevcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.enterprisevc.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDasEnterprisevcResponse());
    }

    /**
     * Description: 获取个人VC
     * Summary: 获取个人VC
     */
    public GetDasIndividualvcResponse getDasIndividualvc(GetDasIndividualvcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDasIndividualvcEx(request, headers, runtime);
    }

    /**
     * Description: 获取个人VC
     * Summary: 获取个人VC
     */
    public GetDasIndividualvcResponse getDasIndividualvcEx(GetDasIndividualvcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.individualvc.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDasIndividualvcResponse());
    }

    /**
     * Description: 发送短信验证码
     * Summary: 发送短信验证码
     */
    public SendDasSmsResponse sendDasSms(SendDasSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDasSmsEx(request, headers, runtime);
    }

    /**
     * Description: 发送短信验证码
     * Summary: 发送短信验证码
     */
    public SendDasSmsResponse sendDasSmsEx(SendDasSmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.sms.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendDasSmsResponse());
    }

    /**
     * Description: 通过短信验证码授权
     * Summary: 通过短信验证码授权
     */
    public AuthDasSmsResponse authDasSms(AuthDasSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authDasSmsEx(request, headers, runtime);
    }

    /**
     * Description: 通过短信验证码授权
     * Summary: 通过短信验证码授权
     */
    public AuthDasSmsResponse authDasSmsEx(AuthDasSmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.sms.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthDasSmsResponse());
    }

    /**
     * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
     * Summary: 企业信息核验
     */
    public VerifyDasEnterpriseResponse verifyDasEnterprise(VerifyDasEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDasEnterpriseEx(request, headers, runtime);
    }

    /**
     * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
     * Summary: 企业信息核验
     */
    public VerifyDasEnterpriseResponse verifyDasEnterpriseEx(VerifyDasEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.enterprise.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyDasEnterpriseResponse());
    }

    /**
     * Description: 个人信息核验
     * Summary: 个人信息核验
     */
    public VerifyDasIndividualResponse verifyDasIndividual(VerifyDasIndividualRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDasIndividualEx(request, headers, runtime);
    }

    /**
     * Description: 个人信息核验
     * Summary: 个人信息核验
     */
    public VerifyDasIndividualResponse verifyDasIndividualEx(VerifyDasIndividualRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.individual.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyDasIndividualResponse());
    }

    /**
     * Description: 创建数据源
     * Summary: 创建数据源
     */
    public CreateDasDatasourceResponse createDasDatasource(CreateDasDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDasDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 创建数据源
     * Summary: 创建数据源
     */
    public CreateDasDatasourceResponse createDasDatasourceEx(CreateDasDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.datasource.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDasDatasourceResponse());
    }

    /**
     * Description: 更新数据源
     * Summary: 更新数据源
     */
    public UpdateDasDatasourceResponse updateDasDatasource(UpdateDasDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDasDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 更新数据源
     * Summary: 更新数据源
     */
    public UpdateDasDatasourceResponse updateDasDatasourceEx(UpdateDasDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.datasource.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDasDatasourceResponse());
    }

    /**
     * Description: 删除数据源
     * Summary: 删除数据源
     */
    public DeleteDasDatasourceResponse deleteDasDatasource(DeleteDasDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDasDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 删除数据源
     * Summary: 删除数据源
     */
    public DeleteDasDatasourceResponse deleteDasDatasourceEx(DeleteDasDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.datasource.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDasDatasourceResponse());
    }

    /**
     * Description: 查询数据源信息
     * Summary: 查询数据源信息
     */
    public QueryDasDatasourceResponse queryDasDatasource(QueryDasDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDasDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据源信息
     * Summary: 查询数据源信息
     */
    public QueryDasDatasourceResponse queryDasDatasourceEx(QueryDasDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.datasource.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDasDatasourceResponse());
    }

    /**
     * Description: 校验授权结果
     * Summary: 校验授权结果
     */
    public VerifyDasAuthresultResponse verifyDasAuthresult(VerifyDasAuthresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDasAuthresultEx(request, headers, runtime);
    }

    /**
     * Description: 校验授权结果
     * Summary: 校验授权结果
     */
    public VerifyDasAuthresultResponse verifyDasAuthresultEx(VerifyDasAuthresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.authresult.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyDasAuthresultResponse());
    }

    /**
     * Description: 根据授权三方信息做授权
     * Summary: 根据授权三方信息做授权
     */
    public AuthDasAuthresultResponse authDasAuthresult(AuthDasAuthresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authDasAuthresultEx(request, headers, runtime);
    }

    /**
     * Description: 根据授权三方信息做授权
     * Summary: 根据授权三方信息做授权
     */
    public AuthDasAuthresultResponse authDasAuthresultEx(AuthDasAuthresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.das.das.authresult.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthDasAuthresultResponse());
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
