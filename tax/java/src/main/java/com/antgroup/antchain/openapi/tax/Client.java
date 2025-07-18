// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.tax.models.*;

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
                    new TeaPair("sdk_version", "1.8.45"),
                    new TeaPair("_prod_code", "TAX"),
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
     * <p>Description: 目前仅用于广州区块链发票开通企业信息推送
     * Summary: 区块链发票开通企业信息推送</p>
     */
    public AuthCorpResponse authCorp(AuthCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authCorpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 目前仅用于广州区块链发票开通企业信息推送
     * Summary: 区块链发票开通企业信息推送</p>
     */
    public AuthCorpResponse authCorpEx(AuthCorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.corp.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthCorpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
     * Summary: 计费推送</p>
     */
    public PushChargeResponse pushCharge(PushChargeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushChargeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
     * Summary: 计费推送</p>
     */
    public PushChargeResponse pushChargeEx(PushChargeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.charge.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushChargeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询计收费授权情况
     * Summary: 查询计收费授权情况</p>
     */
    public QueryChargeAuthResponse queryChargeAuth(QueryChargeAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChargeAuthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询计收费授权情况
     * Summary: 查询计收费授权情况</p>
     */
    public QueryChargeAuthResponse queryChargeAuthEx(QueryChargeAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.charge.auth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryChargeAuthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 目前仅用于广州区块链发票信息推送
     * Summary:  区块链发票信息推送</p>
     */
    public PushIcmInvoiceResponse pushIcmInvoice(PushIcmInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushIcmInvoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 目前仅用于广州区块链发票信息推送
     * Summary:  区块链发票信息推送</p>
     */
    public PushIcmInvoiceResponse pushIcmInvoiceEx(PushIcmInvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.invoice.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushIcmInvoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
     * Summary:  区块链发票信息查询</p>
     */
    public QueryIcmInvoiceResponse queryIcmInvoice(QueryIcmInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIcmInvoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
     * Summary:  区块链发票信息查询</p>
     */
    public QueryIcmInvoiceResponse queryIcmInvoiceEx(QueryIcmInvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.invoice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIcmInvoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标准发票推送
     * Summary: 标准发票推送</p>
     */
    public PushIcmInvoiceinfoResponse pushIcmInvoiceinfo(PushIcmInvoiceinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushIcmInvoiceinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标准发票推送
     * Summary: 标准发票推送</p>
     */
    public PushIcmInvoiceinfoResponse pushIcmInvoiceinfoEx(PushIcmInvoiceinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.invoiceinfo.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushIcmInvoiceinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
     * Summary: 获取数据的上链信息描述</p>
     */
    public DescribeIcmInvoiceResponse describeIcmInvoice(DescribeIcmInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIcmInvoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
     * Summary: 获取数据的上链信息描述</p>
     */
    public DescribeIcmInvoiceResponse describeIcmInvoiceEx(DescribeIcmInvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.invoice.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeIcmInvoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
     * Summary: 区块链银行授权接口</p>
     */
    public AuthIcmInvoiceResponse authIcmInvoice(AuthIcmInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authIcmInvoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
     * Summary: 区块链银行授权接口</p>
     */
    public AuthIcmInvoiceResponse authIcmInvoiceEx(AuthIcmInvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.invoice.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthIcmInvoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人数据使用授权
     * Summary: 个人数据使用授权</p>
     */
    public AuthIcmRealpersonResponse authIcmRealperson(AuthIcmRealpersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authIcmRealpersonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人数据使用授权
     * Summary: 个人数据使用授权</p>
     */
    public AuthIcmRealpersonResponse authIcmRealpersonEx(AuthIcmRealpersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.realperson.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthIcmRealpersonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 采集，不限制同步 异步
     * Summary: 采集</p>
     */
    public ExecIcmSyncgatheringResponse execIcmSyncgathering(ExecIcmSyncgatheringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execIcmSyncgatheringEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 采集，不限制同步 异步
     * Summary: 采集</p>
     */
    public ExecIcmSyncgatheringResponse execIcmSyncgatheringEx(ExecIcmSyncgatheringRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.syncgathering.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecIcmSyncgatheringResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取授权模版和token
     * Summary: 获取授权模版和token</p>
     */
    public QueryApiAuthteplateResponse queryApiAuthteplate(QueryApiAuthteplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiAuthteplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取授权模版和token
     * Summary: 获取授权模版和token</p>
     */
    public QueryApiAuthteplateResponse queryApiAuthteplateEx(QueryApiAuthteplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.authteplate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiAuthteplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交
     * Summary: 提交</p>
     */
    public ExecApiAuthtemplateResponse execApiAuthtemplate(ExecApiAuthtemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execApiAuthtemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交
     * Summary: 提交</p>
     */
    public ExecApiAuthtemplateResponse execApiAuthtemplateEx(ExecApiAuthtemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.authtemplate.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecApiAuthtemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取要素信息
     * Summary: 获取要素信息</p>
     */
    public QueryApiAuthtemplatedefineResponse queryApiAuthtemplatedefine(QueryApiAuthtemplatedefineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiAuthtemplatedefineEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取要素信息
     * Summary: 获取要素信息</p>
     */
    public QueryApiAuthtemplatedefineResponse queryApiAuthtemplatedefineEx(QueryApiAuthtemplatedefineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.authtemplatedefine.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiAuthtemplatedefineResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取授权结果
     * Summary: 获取授权结果</p>
     */
    public QueryApiAuthtemplateresultResponse queryApiAuthtemplateresult(QueryApiAuthtemplateresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiAuthtemplateresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取授权结果
     * Summary: 获取授权结果</p>
     */
    public QueryApiAuthtemplateresultResponse queryApiAuthtemplateresultEx(QueryApiAuthtemplateresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.authtemplateresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiAuthtemplateresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 授权接口
     * Summary: 授权</p>
     */
    public AuthIcmEnterpriseResponse authIcmEnterprise(AuthIcmEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authIcmEnterpriseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 授权接口
     * Summary: 授权</p>
     */
    public AuthIcmEnterpriseResponse authIcmEnterpriseEx(AuthIcmEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.enterprise.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthIcmEnterpriseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 该接口为支持授权链接的生成
     * Summary: 可信授权链接获取接口</p>
     */
    public CreateApiAuthurlResponse createApiAuthurl(CreateApiAuthurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiAuthurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 该接口为支持授权链接的生成
     * Summary: 可信授权链接获取接口</p>
     */
    public CreateApiAuthurlResponse createApiAuthurlEx(CreateApiAuthurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.authurl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateApiAuthurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权-判断该企业是否支持要素授权
     * Summary: 极简授权-判断该企业是否支持要素授权</p>
     */
    public MatchIcmSimpleauthResponse matchIcmSimpleauth(MatchIcmSimpleauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchIcmSimpleauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权-判断该企业是否支持要素授权
     * Summary: 极简授权-判断该企业是否支持要素授权</p>
     */
    public MatchIcmSimpleauthResponse matchIcmSimpleauthEx(MatchIcmSimpleauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.simpleauth.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchIcmSimpleauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权-获取数据，用于获取指标类的数据
     * Summary: 极简授权-获取数据</p>
     */
    public QueryIcmSimpleauthResponse queryIcmSimpleauth(QueryIcmSimpleauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIcmSimpleauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权-获取数据，用于获取指标类的数据
     * Summary: 极简授权-获取数据</p>
     */
    public QueryIcmSimpleauthResponse queryIcmSimpleauthEx(QueryIcmSimpleauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.simpleauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIcmSimpleauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据</p>
     */
    public QueryApiSimpleauthasyncResponse queryApiSimpleauthasync(QueryApiSimpleauthasyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiSimpleauthasyncEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据</p>
     */
    public QueryApiSimpleauthasyncResponse queryApiSimpleauthasyncEx(QueryApiSimpleauthasyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.simpleauthasync.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiSimpleauthasyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 授权接口
     * Summary: 授权接口</p>
     */
    public AuthRiskEvaluationResponse authRiskEvaluation(AuthRiskEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authRiskEvaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 授权接口
     * Summary: 授权接口</p>
     */
    public AuthRiskEvaluationResponse authRiskEvaluationEx(AuthRiskEvaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.risk.evaluation.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthRiskEvaluationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询
     * Summary: 查询</p>
     */
    public QueryRiskEvaluationResponse queryRiskEvaluation(QueryRiskEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskEvaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询
     * Summary: 查询</p>
     */
    public QueryRiskEvaluationResponse queryRiskEvaluationEx(QueryRiskEvaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.risk.evaluation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskEvaluationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权-异步查询数据-轮询拉取结果
     * Summary: 极简授权-异步查询数据-轮询拉取结果</p>
     */
    public PullApiSimpleauthasyncpollingResponse pullApiSimpleauthasyncpolling(PullApiSimpleauthasyncpollingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullApiSimpleauthasyncpollingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权-异步查询数据-轮询拉取结果
     * Summary: 极简授权-异步查询数据-轮询拉取结果</p>
     */
    public PullApiSimpleauthasyncpollingResponse pullApiSimpleauthasyncpollingEx(PullApiSimpleauthasyncpollingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.simpleauthasyncpolling.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullApiSimpleauthasyncpollingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据</p>
     */
    public QueryApiSimpleauthstandardResponse queryApiSimpleauthstandard(QueryApiSimpleauthstandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiSimpleauthstandardEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据</p>
     */
    public QueryApiSimpleauthstandardResponse queryApiSimpleauthstandardEx(QueryApiSimpleauthstandardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.simpleauthstandard.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiSimpleauthstandardResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 给对应的税号进行打标
     * Summary: 要素授权打标接口</p>
     */
    public ExecApiSimpleauthmarkResponse execApiSimpleauthmark(ExecApiSimpleauthmarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execApiSimpleauthmarkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 给对应的税号进行打标
     * Summary: 要素授权打标接口</p>
     */
    public ExecApiSimpleauthmarkResponse execApiSimpleauthmarkEx(ExecApiSimpleauthmarkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.simpleauthmark.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecApiSimpleauthmarkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交打标结果，仅限内部使用
     * Summary: 提交打标结果</p>
     */
    public SubmitApiSimpleauthmarkResponse submitApiSimpleauthmark(SubmitApiSimpleauthmarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitApiSimpleauthmarkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交打标结果，仅限内部使用
     * Summary: 提交打标结果</p>
     */
    public SubmitApiSimpleauthmarkResponse submitApiSimpleauthmarkEx(SubmitApiSimpleauthmarkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.simpleauthmark.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitApiSimpleauthmarkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: blockchain.tax.api.simpleauthmark.exec
     * Summary: 数据打标拉取接口</p>
     */
    public PullApiSimpleauthmarkResponse pullApiSimpleauthmark(PullApiSimpleauthmarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullApiSimpleauthmarkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: blockchain.tax.api.simpleauthmark.exec
     * Summary: 数据打标拉取接口</p>
     */
    public PullApiSimpleauthmarkResponse pullApiSimpleauthmarkEx(PullApiSimpleauthmarkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.simpleauthmark.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullApiSimpleauthmarkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询-同步返回提额数据
     * Summary: 查询-同步提额数据返回</p>
     */
    public SyncRiskEvaluationResponse syncRiskEvaluation(SyncRiskEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRiskEvaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询-同步返回提额数据
     * Summary: 查询-同步提额数据返回</p>
     */
    public SyncRiskEvaluationResponse syncRiskEvaluationEx(SyncRiskEvaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.risk.evaluation.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRiskEvaluationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 纳税人状态查询
     * Summary: 纳税人状态查询</p>
     */
    public QuerySimpleauthIdentitystateResponse querySimpleauthIdentitystate(QuerySimpleauthIdentitystateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimpleauthIdentitystateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 纳税人状态查询
     * Summary: 纳税人状态查询</p>
     */
    public QuerySimpleauthIdentitystateResponse querySimpleauthIdentitystateEx(QuerySimpleauthIdentitystateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.simpleauth.identitystate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimpleauthIdentitystateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 海关-异步查询数据
     * Summary: 海关-异步查询数据</p>
     */
    public QueryApiHaiguanasyncResponse queryApiHaiguanasync(QueryApiHaiguanasyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiHaiguanasyncEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 海关-异步查询数据
     * Summary: 海关-异步查询数据</p>
     */
    public QueryApiHaiguanasyncResponse queryApiHaiguanasyncEx(QueryApiHaiguanasyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.haiguanasync.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiHaiguanasyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 海关-异步查询数据-轮询拉取数据
     * Summary: 海关-异步查询数据-轮询拉取数据</p>
     */
    public PullApiHaiguanasyncpollingResponse pullApiHaiguanasyncpolling(PullApiHaiguanasyncpollingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullApiHaiguanasyncpollingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 海关-异步查询数据-轮询拉取数据
     * Summary: 海关-异步查询数据-轮询拉取数据</p>
     */
    public PullApiHaiguanasyncpollingResponse pullApiHaiguanasyncpollingEx(PullApiHaiguanasyncpollingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.haiguanasyncpolling.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullApiHaiguanasyncpollingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提额资质评估授权并查询,支持省级查询
     * Summary: 提额资质评估授权并查询</p>
     */
    public StartRiskEvaluationResponse startRiskEvaluation(StartRiskEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRiskEvaluationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提额资质评估授权并查询,支持省级查询
     * Summary: 提额资质评估授权并查询</p>
     */
    public StartRiskEvaluationResponse startRiskEvaluationEx(StartRiskEvaluationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.risk.evaluation.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRiskEvaluationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力异步接口
     * Summary: 电力异步接口</p>
     */
    public QueryEnterpriseElectronicasyncResponse queryEnterpriseElectronicasync(QueryEnterpriseElectronicasyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseElectronicasyncEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电力异步接口
     * Summary: 电力异步接口</p>
     */
    public QueryEnterpriseElectronicasyncResponse queryEnterpriseElectronicasyncEx(QueryEnterpriseElectronicasyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.enterprise.electronicasync.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseElectronicasyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定账户的数据
     * Summary: 查询指定账户的数据</p>
     */
    public QueryApiDataprocessResponse queryApiDataprocess(QueryApiDataprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiDataprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定账户的数据
     * Summary: 查询指定账户的数据</p>
     */
    public QueryApiDataprocessResponse queryApiDataprocessEx(QueryApiDataprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.dataprocess.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiDataprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 校验当前目标查询数据初始化接口
     * Summary: 校验当前目标查询数据初始化接口</p>
     */
    public InitApiDataprocessResponse initApiDataprocess(InitApiDataprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initApiDataprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 校验当前目标查询数据初始化接口
     * Summary: 校验当前目标查询数据初始化接口</p>
     */
    public InitApiDataprocessResponse initApiDataprocessEx(InitApiDataprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.dataprocess.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitApiDataprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转目标客户是否可用接口
     * Summary: 数据流转目标客户是否可用接口</p>
     */
    public JudgeApiDataprocessResponse judgeApiDataprocess(JudgeApiDataprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.judgeApiDataprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转目标客户是否可用接口
     * Summary: 数据流转目标客户是否可用接口</p>
     */
    public JudgeApiDataprocessResponse judgeApiDataprocessEx(JudgeApiDataprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.dataprocess.judge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new JudgeApiDataprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 初始化与查询合并统一执行接口
     * Summary: 初始化与查询合并统一执行接口</p>
     */
    public ExecApiDataprocessResponse execApiDataprocess(ExecApiDataprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execApiDataprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 初始化与查询合并统一执行接口
     * Summary: 初始化与查询合并统一执行接口</p>
     */
    public ExecApiDataprocessResponse execApiDataprocessEx(ExecApiDataprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.dataprocess.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecApiDataprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转通用执行接口
     * Summary: 数据流转通用执行接口</p>
     */
    public RunApiDataprocessResponse runApiDataprocess(RunApiDataprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runApiDataprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转通用执行接口
     * Summary: 数据流转通用执行接口</p>
     */
    public RunApiDataprocessResponse runApiDataprocessEx(RunApiDataprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.dataprocess.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunApiDataprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链发票信息持续取数查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式或者配置的指定地址进行通知
     * Summary: 区块链发票信息持续取数查询</p>
     */
    public QueryIcmInvoicecontinuedResponse queryIcmInvoicecontinued(QueryIcmInvoicecontinuedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIcmInvoicecontinuedEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链发票信息持续取数查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式或者配置的指定地址进行通知
     * Summary: 区块链发票信息持续取数查询</p>
     */
    public QueryIcmInvoicecontinuedResponse queryIcmInvoicecontinuedEx(QueryIcmInvoicecontinuedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.icm.invoicecontinued.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIcmInvoicecontinuedResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 票税RPA授权埋点数据查询
     * Summary: 票税RPA授权埋点数据查询</p>
     */
    public QueryApiAuthweblogResponse queryApiAuthweblog(QueryApiAuthweblogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiAuthweblogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 票税RPA授权埋点数据查询
     * Summary: 票税RPA授权埋点数据查询</p>
     */
    public QueryApiAuthweblogResponse queryApiAuthweblogEx(QueryApiAuthweblogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.api.authweblog.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiAuthweblogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 收入评估服务A
     * <a href="https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg">https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg</a>
     * Summary: 收入评估服务A</p>
     */
    public QueryPdataPersonalincomeResponse queryPdataPersonalincome(QueryPdataPersonalincomeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdataPersonalincomeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 收入评估服务A
     * <a href="https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg">https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg</a>
     * Summary: 收入评估服务A</p>
     */
    public QueryPdataPersonalincomeResponse queryPdataPersonalincomeEx(QueryPdataPersonalincomeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.pdata.personalincome.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdataPersonalincomeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 收入评估服务B
     * Summary: 收入评估服务B</p>
     */
    public QueryPdataSocialincomeResponse queryPdataSocialincome(QueryPdataSocialincomeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdataSocialincomeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 收入评估服务B
     * Summary: 收入评估服务B</p>
     */
    public QueryPdataSocialincomeResponse queryPdataSocialincomeEx(QueryPdataSocialincomeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.pdata.socialincome.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdataSocialincomeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 婚姻状况查验服务
     * <a href="https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp">https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp</a>
     * Summary: 婚姻状况查验</p>
     */
    public CheckPdataMarriageResponse checkPdataMarriage(CheckPdataMarriageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPdataMarriageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 婚姻状况查验服务
     * <a href="https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp">https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp</a>
     * Summary: 婚姻状况查验</p>
     */
    public CheckPdataMarriageResponse checkPdataMarriageEx(CheckPdataMarriageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.pdata.marriage.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckPdataMarriageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 断卡行动风险识别服务
     * Summary: 断卡行动风险识别服务</p>
     */
    public QueryPdataRiskResponse queryPdataRisk(QueryPdataRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdataRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 断卡行动风险识别服务
     * Summary: 断卡行动风险识别服务</p>
     */
    public QueryPdataRiskResponse queryPdataRiskEx(QueryPdataRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.pdata.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdataRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 核保医疗查询
     * Summary: 核保医疗查询</p>
     */
    public QueryPdataUnderwriteResponse queryPdataUnderwrite(QueryPdataUnderwriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdataUnderwriteEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 核保医疗查询
     * Summary: 核保医疗查询</p>
     */
    public QueryPdataUnderwriteResponse queryPdataUnderwriteEx(QueryPdataUnderwriteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.pdata.underwrite.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdataUnderwriteResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 经济画像
     * Summary: 财富洞察经济画像</p>
     */
    public QueryPortraiteconomyResponse queryPortraiteconomy(QueryPortraiteconomyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPortraiteconomyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 经济画像
     * Summary: 财富洞察经济画像</p>
     */
    public QueryPortraiteconomyResponse queryPortraiteconomyEx(QueryPortraiteconomyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.tax.portraiteconomy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPortraiteconomyResponse());
    }
}
