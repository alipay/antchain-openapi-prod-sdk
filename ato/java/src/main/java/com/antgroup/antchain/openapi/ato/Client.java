// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.ato.models.*;

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
                    new TeaPair("sdk_version", "1.15.68"),
                    new TeaPair("_prod_code", "ATO"),
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
     * <p>Description: 数据提供方可以通过此接口传输数据，触达给消费方
     * Summary: 用户信息传输代理</p>
     */
    public TransferBrokerUserdataResponse transferBrokerUserdata(TransferBrokerUserdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferBrokerUserdataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据提供方可以通过此接口传输数据，触达给消费方
     * Summary: 用户信息传输代理</p>
     */
    public TransferBrokerUserdataResponse transferBrokerUserdataEx(TransferBrokerUserdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.broker.userdata.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferBrokerUserdataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方管理系统demo
     * Summary: 资方管理系统demo</p>
     */
    public QueryInnerFundmngdemoResponse queryInnerFundmngdemo(QueryInnerFundmngdemoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFundmngdemoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方管理系统demo
     * Summary: 资方管理系统demo</p>
     */
    public QueryInnerFundmngdemoResponse queryInnerFundmngdemoEx(QueryInnerFundmngdemoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngdemo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFundmngdemoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方管理系统融资订单列表
     * Summary: 资方管理系统融资订单列表</p>
     */
    public PagequeryInnerFundmngfinanceorderResponse pagequeryInnerFundmngfinanceorder(PagequeryInnerFundmngfinanceorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerFundmngfinanceorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方管理系统融资订单列表
     * Summary: 资方管理系统融资订单列表</p>
     */
    public PagequeryInnerFundmngfinanceorderResponse pagequeryInnerFundmngfinanceorderEx(PagequeryInnerFundmngfinanceorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngfinanceorder.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerFundmngfinanceorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方免研系分设计-提交数据下载申请
     * Summary: 资方免研-提交数据下载申请</p>
     */
    public SubmitInnerFundmngdatadownloadResponse submitInnerFundmngdatadownload(SubmitInnerFundmngdatadownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerFundmngdatadownloadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方免研系分设计-提交数据下载申请
     * Summary: 资方免研-提交数据下载申请</p>
     */
    public SubmitInnerFundmngdatadownloadResponse submitInnerFundmngdatadownloadEx(SubmitInnerFundmngdatadownloadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngdatadownload.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerFundmngdatadownloadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方免研-查询数据下载列表
     * Summary: 资方免研-查询数据下载列表</p>
     */
    public PagequeryInnerFundmngdatadownloadResponse pagequeryInnerFundmngdatadownload(PagequeryInnerFundmngdatadownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerFundmngdatadownloadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方免研-查询数据下载列表
     * Summary: 资方免研-查询数据下载列表</p>
     */
    public PagequeryInnerFundmngdatadownloadResponse pagequeryInnerFundmngdatadownloadEx(PagequeryInnerFundmngdatadownloadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngdatadownload.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerFundmngdatadownloadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方免研-删除下载任务
     * Summary: 资方免研-删除下载任务</p>
     */
    public DeleteInnerFundmngdatadownloadResponse deleteInnerFundmngdatadownload(DeleteInnerFundmngdatadownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInnerFundmngdatadownloadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方免研-删除下载任务
     * Summary: 资方免研-删除下载任务</p>
     */
    public DeleteInnerFundmngdatadownloadResponse deleteInnerFundmngdatadownloadEx(DeleteInnerFundmngdatadownloadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngdatadownload.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteInnerFundmngdatadownloadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户付款项目查询
     * Summary: 商户付款项目查询</p>
     */
    public QueryInnerFundmngmerchantpayitemResponse queryInnerFundmngmerchantpayitem(QueryInnerFundmngmerchantpayitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFundmngmerchantpayitemEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户付款项目查询
     * Summary: 商户付款项目查询</p>
     */
    public QueryInnerFundmngmerchantpayitemResponse queryInnerFundmngmerchantpayitemEx(QueryInnerFundmngmerchantpayitemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngmerchantpayitem.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFundmngmerchantpayitemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约承诺创建
     * Summary: 商户履约承诺创建</p>
     */
    public CreateInnerFundmngmerchantpromiseResponse createInnerFundmngmerchantpromise(CreateInnerFundmngmerchantpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerFundmngmerchantpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约承诺创建
     * Summary: 商户履约承诺创建</p>
     */
    public CreateInnerFundmngmerchantpromiseResponse createInnerFundmngmerchantpromiseEx(CreateInnerFundmngmerchantpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngmerchantpromise.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerFundmngmerchantpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方放款申请查询
     * Summary: 资方放款申请查询</p>
     */
    public QueryInnerFundmngloanapplyResponse queryInnerFundmngloanapply(QueryInnerFundmngloanapplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFundmngloanapplyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方放款申请查询
     * Summary: 资方放款申请查询</p>
     */
    public QueryInnerFundmngloanapplyResponse queryInnerFundmngloanapplyEx(QueryInnerFundmngloanapplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngloanapply.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFundmngloanapplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方账户信息查询
     * Summary: 资方账户信息查询</p>
     */
    public QueryInnerFundmngaccountinfoResponse queryInnerFundmngaccountinfo(QueryInnerFundmngaccountinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFundmngaccountinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方账户信息查询
     * Summary: 资方账户信息查询</p>
     */
    public QueryInnerFundmngaccountinfoResponse queryInnerFundmngaccountinfoEx(QueryInnerFundmngaccountinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngaccountinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFundmngaccountinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 放款结果同步
     * Summary: 放款结果同步</p>
     */
    public SyncInnerFundmngloanresultsResponse syncInnerFundmngloanresults(SyncInnerFundmngloanresultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerFundmngloanresultsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 放款结果同步
     * Summary: 放款结果同步</p>
     */
    public SyncInnerFundmngloanresultsResponse syncInnerFundmngloanresultsEx(SyncInnerFundmngloanresultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngloanresults.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerFundmngloanresultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
     * Summary: 资产凭证创建</p>
     */
    public CreateInnerFundmngcreditResponse createInnerFundmngcredit(CreateInnerFundmngcreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerFundmngcreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
     * Summary: 资产凭证创建</p>
     */
    public CreateInnerFundmngcreditResponse createInnerFundmngcreditEx(CreateInnerFundmngcreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngcredit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerFundmngcreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可以根据订单号查询资产凭证信息
     * Summary: 资产凭证查询</p>
     */
    public QueryInnerFundmngcreditResponse queryInnerFundmngcredit(QueryInnerFundmngcreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFundmngcreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可以根据订单号查询资产凭证信息
     * Summary: 资产凭证查询</p>
     */
    public QueryInnerFundmngcreditResponse queryInnerFundmngcreditEx(QueryInnerFundmngcreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngcredit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFundmngcreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
     * Summary: 资方管理系统订单详情查询</p>
     */
    public DetailInnerFundmngorderResponse detailInnerFundmngorder(DetailInnerFundmngorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerFundmngorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
     * Summary: 资方管理系统订单详情查询</p>
     */
    public DetailInnerFundmngorderResponse detailInnerFundmngorderEx(DetailInnerFundmngorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngorder.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerFundmngorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: （资方控制台）商户履约查询
     * Summary: 商户履约查询(资方控制台)</p>
     */
    public QueryInnerFundmngmerchantperformanceResponse queryInnerFundmngmerchantperformance(QueryInnerFundmngmerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFundmngmerchantperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: （资方控制台）商户履约查询
     * Summary: 商户履约查询(资方控制台)</p>
     */
    public QueryInnerFundmngmerchantperformanceResponse queryInnerFundmngmerchantperformanceEx(QueryInnerFundmngmerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.fundmngmerchantperformance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFundmngmerchantperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步</p>
     */
    public SyncFundSplittingResponse syncFundSplitting(SyncFundSplittingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundSplittingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步</p>
     */
    public SyncFundSplittingResponse syncFundSplittingEx(SyncFundSplittingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundSplittingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步</p>
     */
    public SyncFundOrderfinancialResponse syncFundOrderfinancial(SyncFundOrderfinancialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundOrderfinancialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步</p>
     */
    public SyncFundOrderfinancialResponse syncFundOrderfinancialEx(SyncFundOrderfinancialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundOrderfinancialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议</p>
     */
    public SyncFundWithholdingcontractResponse syncFundWithholdingcontract(SyncFundWithholdingcontractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundWithholdingcontractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议</p>
     */
    public SyncFundWithholdingcontractResponse syncFundWithholdingcontractEx(SyncFundWithholdingcontractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundWithholdingcontractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息</p>
     */
    public SyncFundOrderfulfillmentResponse syncFundOrderfulfillment(SyncFundOrderfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息</p>
     */
    public SyncFundOrderfulfillmentResponse syncFundOrderfulfillmentEx(SyncFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundOrderfulfillmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息</p>
     */
    public GetFundOrderfulfillmentResponse getFundOrderfulfillment(GetFundOrderfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundOrderfulfillmentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息</p>
     */
    public GetFundOrderfulfillmentResponse getFundOrderfulfillmentEx(GetFundOrderfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundOrderfulfillmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口</p>
     */
    public UploadFundFlowResponse uploadFundFlow(UploadFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口</p>
     */
    public UploadFundFlowResponse uploadFundFlowEx(UploadFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.fund.flow.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadFundFlowResponse uploadFundFlowResponse = UploadFundFlowResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadFundFlowResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口</p>
     */
    public GetFundFlowResponse getFundFlow(GetFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口</p>
     */
    public GetFundFlowResponse getFundFlowEx(GetFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知</p>
     */
    public RefuseFundFlowResponse refuseFundFlow(RefuseFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知</p>
     */
    public RefuseFundFlowResponse refuseFundFlowEx(RefuseFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口</p>
     */
    public AuthFundFlowResponse authFundFlow(AuthFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口</p>
     */
    public AuthFundFlowResponse authFundFlowEx(AuthFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消</p>
     */
    public CancelFundPlanResponse cancelFundPlan(CancelFundPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelFundPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消</p>
     */
    public CancelFundPlanResponse cancelFundPlanEx(CancelFundPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelFundPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通知回调
     * Summary: 通知回调</p>
     */
    public CallbackFundNotifyResponse callbackFundNotify(CallbackFundNotifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackFundNotifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通知回调
     * Summary: 通知回调</p>
     */
    public CallbackFundNotifyResponse callbackFundNotifyEx(CallbackFundNotifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackFundNotifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步</p>
     */
    public SyncFundMerchantpromiseResponse syncFundMerchantpromise(SyncFundMerchantpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundMerchantpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步</p>
     */
    public SyncFundMerchantpromiseResponse syncFundMerchantpromiseEx(SyncFundMerchantpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundMerchantpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款结果同步
     * Summary: 融资放款结果同步</p>
     */
    public SyncFundFinanceloanresultsResponse syncFundFinanceloanresults(SyncFundFinanceloanresultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundFinanceloanresultsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款结果同步
     * Summary: 融资放款结果同步</p>
     */
    public SyncFundFinanceloanresultsResponse syncFundFinanceloanresultsEx(SyncFundFinanceloanresultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundFinanceloanresultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户承诺
     * Summary: 查询用户承诺</p>
     */
    public GetFundUserpromiseResponse getFundUserpromise(GetFundUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户承诺
     * Summary: 查询用户承诺</p>
     */
    public GetFundUserpromiseResponse getFundUserpromiseEx(GetFundUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetFundUserperformanceResponse getFundUserperformance(GetFundUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundUserperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetFundUserperformanceResponse getFundUserperformanceEx(GetFundUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundUserperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetFundMerchantperformanceResponse getFundMerchantperformance(GetFundMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetFundMerchantperformanceResponse getFundMerchantperformanceEx(GetFundMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundMerchantperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询订单详情
     * Summary: 资方查询订单详情</p>
     */
    public GetFundOrderfullinfoResponse getFundOrderfullinfo(GetFundOrderfullinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundOrderfullinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询订单详情
     * Summary: 资方查询订单详情</p>
     */
    public GetFundOrderfullinfoResponse getFundOrderfullinfoEx(GetFundOrderfullinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundOrderfullinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口</p>
     */
    public NotifyFundFlowResponse notifyFundFlow(NotifyFundFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyFundFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口</p>
     */
    public NotifyFundFlowResponse notifyFundFlowEx(NotifyFundFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyFundFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传</p>
     */
    public UploadFundCreditResponse uploadFundCredit(UploadFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadFundCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传</p>
     */
    public UploadFundCreditResponse uploadFundCreditEx(UploadFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadFundCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询</p>
     */
    public QueryFundCreditResponse queryFundCredit(QueryFundCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询</p>
     */
    public QueryFundCreditResponse queryFundCreditEx(QueryFundCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资预审结果同步
     * Summary: 融资预审结果同步</p>
     */
    public SyncFundFinanceprecheckresultResponse syncFundFinanceprecheckresult(SyncFundFinanceprecheckresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundFinanceprecheckresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资预审结果同步
     * Summary: 融资预审结果同步</p>
     */
    public SyncFundFinanceprecheckresultResponse syncFundFinanceprecheckresultEx(SyncFundFinanceprecheckresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundFinanceprecheckresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询代偿户余额
     * Summary: 代偿户查询</p>
     */
    public QueryFundCompensateaccountResponse queryFundCompensateaccount(QueryFundCompensateaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundCompensateaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询代偿户余额
     * Summary: 代偿户查询</p>
     */
    public QueryFundCompensateaccountResponse queryFundCompensateaccountEx(QueryFundCompensateaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundCompensateaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询订单融资信息
     * Summary: 资方查询订单融资信息</p>
     */
    public GetFundOrderfinanceinfoResponse getFundOrderfinanceinfo(GetFundOrderfinanceinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundOrderfinanceinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方查询订单融资信息
     * Summary: 资方查询订单融资信息</p>
     */
    public GetFundOrderfinanceinfoResponse getFundOrderfinanceinfoEx(GetFundOrderfinanceinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundOrderfinanceinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系</p>
     */
    public AddFundDividerelationResponse addFundDividerelation(AddFundDividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFundDividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系</p>
     */
    public AddFundDividerelationResponse addFundDividerelationEx(AddFundDividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.dividerelation.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddFundDividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询</p>
     */
    public QueryFundDividerelationResponse queryFundDividerelation(QueryFundDividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundDividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询</p>
     */
    public QueryFundDividerelationResponse queryFundDividerelationEx(QueryFundDividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.dividerelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundDividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ● 本接口获取用信授权
     * ●本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
     * Summary: 用信申请接口</p>
     */
    public ApplyFundCreditutilizationResponse applyFundCreditutilization(ApplyFundCreditutilizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFundCreditutilizationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ● 本接口获取用信授权
     * ●本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
     * Summary: 用信申请接口</p>
     */
    public ApplyFundCreditutilizationResponse applyFundCreditutilizationEx(ApplyFundCreditutilizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFundCreditutilizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 小贷融资用信申请订单履约信息
     * Summary: 用信申请订单履约信息</p>
     */
    public ApplyFundAssertorderResponse applyFundAssertorder(ApplyFundAssertorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFundAssertorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 小贷融资用信申请订单履约信息
     * Summary: 用信申请订单履约信息</p>
     */
    public ApplyFundAssertorderResponse applyFundAssertorderEx(ApplyFundAssertorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.assertorder.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFundAssertorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用信查询订单履约信息
     * Summary: 用信查询订单履约信息</p>
     */
    public QueryFundAssertorderResponse queryFundAssertorder(QueryFundAssertorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundAssertorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用信查询订单履约信息
     * Summary: 用信查询订单履约信息</p>
     */
    public QueryFundAssertorderResponse queryFundAssertorderEx(QueryFundAssertorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.assertorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundAssertorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * ●本接口用于授信额度试算完成后同步授信结果。
     * Summary: 授信结果同步接口</p>
     */
    public SyncFundCreditgrantingResponse syncFundCreditgranting(SyncFundCreditgrantingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFundCreditgrantingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * ●本接口用于授信额度试算完成后同步授信结果。
     * Summary: 授信结果同步接口</p>
     */
    public SyncFundCreditgrantingResponse syncFundCreditgrantingEx(SyncFundCreditgrantingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.creditgranting.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFundCreditgrantingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
     * Summary: 授信授权申请接口</p>
     */
    public AuthFundCreditgrantingResponse authFundCreditgranting(AuthFundCreditgrantingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authFundCreditgrantingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
     * Summary: 授信授权申请接口</p>
     */
    public AuthFundCreditgrantingResponse authFundCreditgrantingEx(AuthFundCreditgrantingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.creditgranting.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthFundCreditgrantingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 小贷融资查询资产报告
     * Summary: 查询资产报告</p>
     */
    public QueryFundAssertreportResponse queryFundAssertreport(QueryFundAssertreportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundAssertreportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 小贷融资查询资产报告
     * Summary: 查询资产报告</p>
     */
    public QueryFundAssertreportResponse queryFundAssertreportEx(QueryFundAssertreportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.assertreport.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundAssertreportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口用于查询授信结果
     * Summary: 授信结果查询</p>
     */
    public QueryFundCreditgrantingResponse queryFundCreditgranting(QueryFundCreditgrantingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundCreditgrantingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口用于查询授信结果
     * Summary: 授信结果查询</p>
     */
    public QueryFundCreditgrantingResponse queryFundCreditgrantingEx(QueryFundCreditgrantingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.creditgranting.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundCreditgrantingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 授权信息查询
     * Summary: 授权信息查询</p>
     */
    public QueryFundCreditauthResponse queryFundCreditauth(QueryFundCreditauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundCreditauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 授权信息查询
     * Summary: 授权信息查询</p>
     */
    public QueryFundCreditauthResponse queryFundCreditauthEx(QueryFundCreditauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.creditauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundCreditauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产包详情查询
     * Summary: 资产包详情查询</p>
     */
    public QueryFundAssetpackageResponse queryFundAssetpackage(QueryFundAssetpackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFundAssetpackageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产包详情查询
     * Summary: 资产包详情查询</p>
     */
    public QueryFundAssetpackageResponse queryFundAssetpackageEx(QueryFundAssetpackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.assetpackage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFundAssetpackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * 1.资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
     * Summary: 允许用户取消(确认用户取消)</p>
     */
    public ConfirmFundUsercancelResponse confirmFundUsercancel(ConfirmFundUsercancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmFundUsercancelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * 1.资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
     * Summary: 允许用户取消(确认用户取消)</p>
     */
    public ConfirmFundUsercancelResponse confirmFundUsercancelEx(ConfirmFundUsercancelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.usercancel.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmFundUsercancelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * 1.当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
     * Summary: 商户履约其他方式还款（单期取消）</p>
     */
    public RepayFundPlanResponse repayFundPlan(RepayFundPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayFundPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用说明：
     * 1.当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
     * Summary: 商户履约其他方式还款（单期取消）</p>
     */
    public RepayFundPlanResponse repayFundPlanEx(RepayFundPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.plan.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayFundPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方代偿签约链接获取
     * Summary: 资方代偿签约链接获取</p>
     */
    public GetFundCompensatesignurlResponse getFundCompensatesignurl(GetFundCompensatesignurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFundCompensatesignurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方代偿签约链接获取
     * Summary: 资方代偿签约链接获取</p>
     */
    public GetFundCompensatesignurlResponse getFundCompensatesignurlEx(GetFundCompensatesignurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.compensatesignurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFundCompensatesignurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 转账代偿签约结果确认
     * Summary: 转账代偿签约结果确认</p>
     */
    public ConfirmFundCompensateResponse confirmFundCompensate(ConfirmFundCompensateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmFundCompensateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 转账代偿签约结果确认
     * Summary: 转账代偿签约结果确认</p>
     */
    public ConfirmFundCompensateResponse confirmFundCompensateEx(ConfirmFundCompensateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.fund.compensate.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmFundCompensateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部调用,商品信息获取
     * Summary: 商品信息获取</p>
     */
    public GetInnerProductResponse getInnerProduct(GetInnerProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部调用,商品信息获取
     * Summary: 商品信息获取</p>
     */
    public GetInnerProductResponse getInnerProductEx(GetInnerProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.product.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取</p>
     */
    public GetInnerTenantResponse getInnerTenant(GetInnerTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerTenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取</p>
     */
    public GetInnerTenantResponse getInnerTenantEx(GetInnerTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerTenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息</p>
     */
    public SyncInnerMeterforwholeorderResponse syncInnerMeterforwholeorder(SyncInnerMeterforwholeorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerMeterforwholeorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息</p>
     */
    public SyncInnerMeterforwholeorderResponse syncInnerMeterforwholeorderEx(SyncInnerMeterforwholeorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.meterforwholeorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerMeterforwholeorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口</p>
     */
    public SyncInnerMeterforagsignResponse syncInnerMeterforagsign(SyncInnerMeterforagsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerMeterforagsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口</p>
     */
    public SyncInnerMeterforagsignResponse syncInnerMeterforagsignEx(SyncInnerMeterforagsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.meterforagsign.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerMeterforagsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表</p>
     */
    public AllInnerTemplateResponse allInnerTemplate(AllInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表</p>
     */
    public AllInnerTemplateResponse allInnerTemplateEx(AllInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表</p>
     */
    public ListInnerTemplateResponse listInnerTemplate(ListInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表</p>
     */
    public ListInnerTemplateResponse listInnerTemplateEx(ListInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情</p>
     */
    public DetailInnerTemplateResponse detailInnerTemplate(DetailInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情</p>
     */
    public DetailInnerTemplateResponse detailInnerTemplateEx(DetailInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，创建魔法库模板
     * Summary: 创建模板</p>
     */
    public CreateInnerTemplateResponse createInnerTemplate(CreateInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，创建魔法库模板
     * Summary: 创建模板</p>
     */
    public CreateInnerTemplateResponse createInnerTemplateEx(CreateInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板</p>
     */
    public SaveInnerTemplateResponse saveInnerTemplate(SaveInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板</p>
     */
    public SaveInnerTemplateResponse saveInnerTemplateEx(SaveInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区</p>
     */
    public SaveInnerSignfieldsResponse saveInnerSignfields(SaveInnerSignfieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveInnerSignfieldsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区</p>
     */
    public SaveInnerSignfieldsResponse saveInnerSignfieldsEx(SaveInnerSignfieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.signfields.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveInnerSignfieldsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板</p>
     */
    public PublishInnerTemplateResponse publishInnerTemplate(PublishInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板</p>
     */
    public PublishInnerTemplateResponse publishInnerTemplateEx(PublishInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板</p>
     */
    public PreviewInnerTemplateResponse previewInnerTemplate(PreviewInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板</p>
     */
    public PreviewInnerTemplateResponse previewInnerTemplateEx(PreviewInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板</p>
     */
    public DeleteInnerTemplateResponse deleteInnerTemplate(DeleteInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板</p>
     */
    public DeleteInnerTemplateResponse deleteInnerTemplateEx(DeleteInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板</p>
     */
    public CloneInnerTemplateResponse cloneInnerTemplate(CloneInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板</p>
     */
    public CloneInnerTemplateResponse cloneInnerTemplateEx(CloneInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ato文件上传
     * Summary: ato文件上传</p>
     */
    public UploadInnerFileResponse uploadInnerFile(UploadInnerFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadInnerFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ato文件上传
     * Summary: ato文件上传</p>
     */
    public UploadInnerFileResponse uploadInnerFileEx(UploadInnerFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadInnerFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: ato文件下载
     * Summary: ato文件下载</p>
     */
    public DownloadInnerFileResponse downloadInnerFile(DownloadInnerFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadInnerFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: ato文件下载
     * Summary: ato文件下载</p>
     */
    public DownloadInnerFileResponse downloadInnerFileEx(DownloadInnerFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.file.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadInnerFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL</p>
     */
    public GetInnerTemplateofficeurlResponse getInnerTemplateofficeurl(GetInnerTemplateofficeurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerTemplateofficeurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL</p>
     */
    public GetInnerTemplateofficeurlResponse getInnerTemplateofficeurlEx(GetInnerTemplateofficeurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateofficeurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerTemplateofficeurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 魔法库控制台刷新token
     * Summary: 刷新token</p>
     */
    public RefreshInnerTemplatetokenResponse refreshInnerTemplatetoken(RefreshInnerTemplatetokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshInnerTemplatetokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 魔法库控制台刷新token
     * Summary: 刷新token</p>
     */
    public RefreshInnerTemplatetokenResponse refreshInnerTemplatetokenEx(RefreshInnerTemplatetokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatetoken.refresh", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefreshInnerTemplatetokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建文本域（组件）
     * Summary: 创建文本域</p>
     */
    public CreateInnerTemplatetextareaResponse createInnerTemplatetextarea(CreateInnerTemplatetextareaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerTemplatetextareaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建文本域（组件）
     * Summary: 创建文本域</p>
     */
    public CreateInnerTemplatetextareaResponse createInnerTemplatetextareaEx(CreateInnerTemplatetextareaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatetextarea.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerTemplatetextareaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表</p>
     */
    public QueryInnerTemplateimageResponse queryInnerTemplateimage(QueryInnerTemplateimageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateimageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表</p>
     */
    public QueryInnerTemplateimageResponse queryInnerTemplateimageEx(QueryInnerTemplateimageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateimageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息</p>
     */
    public CreateInnerFunddividerelationResponse createInnerFunddividerelation(CreateInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息</p>
     */
    public CreateInnerFunddividerelationResponse createInnerFunddividerelationEx(CreateInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerFunddividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交分账关系信息
     * Summary: 提交分账关系信息</p>
     */
    public SubmitInnerFunddividerelationResponse submitInnerFunddividerelation(SubmitInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交分账关系信息
     * Summary: 提交分账关系信息</p>
     */
    public SubmitInnerFunddividerelationResponse submitInnerFunddividerelationEx(SubmitInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerFunddividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询分账关系信息
     * Summary: 查询分账关系信息</p>
     */
    public QueryInnerFunddividerelationResponse queryInnerFunddividerelation(QueryInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询分账关系信息
     * Summary: 查询分账关系信息</p>
     */
    public QueryInnerFunddividerelationResponse queryInnerFunddividerelationEx(QueryInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerFunddividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表</p>
     */
    public PagequeryInnerFunddividerelationResponse pagequeryInnerFunddividerelation(PagequeryInnerFunddividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerFunddividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表</p>
     */
    public PagequeryInnerFunddividerelationResponse pagequeryInnerFunddividerelationEx(PagequeryInnerFunddividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividerelation.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerFunddividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存租户签约信息
     * Summary: 保存租户签约信息</p>
     */
    public CreateInnerMerchantagreementResponse createInnerMerchantagreement(CreateInnerMerchantagreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerMerchantagreementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存租户签约信息
     * Summary: 保存租户签约信息</p>
     */
    public CreateInnerMerchantagreementResponse createInnerMerchantagreementEx(CreateInnerMerchantagreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagreement.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerMerchantagreementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户签约信息
     * Summary: 查询租户签约信息</p>
     */
    public QueryInnerMerchantagreementResponse queryInnerMerchantagreement(QueryInnerMerchantagreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerMerchantagreementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户签约信息
     * Summary: 查询租户签约信息</p>
     */
    public QueryInnerMerchantagreementResponse queryInnerMerchantagreementEx(QueryInnerMerchantagreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerMerchantagreementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表</p>
     */
    public PagequeryInnerMerchantagreementResponse pagequeryInnerMerchantagreement(PagequeryInnerMerchantagreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerMerchantagreementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表</p>
     */
    public PagequeryInnerMerchantagreementResponse pagequeryInnerMerchantagreementEx(PagequeryInnerMerchantagreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagreement.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerMerchantagreementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息</p>
     */
    public CreateInnerMerchantpayexpandResponse createInnerMerchantpayexpand(CreateInnerMerchantpayexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerMerchantpayexpandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息</p>
     */
    public CreateInnerMerchantpayexpandResponse createInnerMerchantpayexpandEx(CreateInnerMerchantpayexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerMerchantpayexpandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交进件信息
     * Summary: 提交进件信息</p>
     */
    public SubmitInnerMerchantpayexpandResponse submitInnerMerchantpayexpand(SubmitInnerMerchantpayexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerMerchantpayexpandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交进件信息
     * Summary: 提交进件信息</p>
     */
    public SubmitInnerMerchantpayexpandResponse submitInnerMerchantpayexpandEx(SubmitInnerMerchantpayexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerMerchantpayexpandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询进件信息
     * Summary: 查询进件信息</p>
     */
    public QueryInnerMerchantpayexpandResponse queryInnerMerchantpayexpand(QueryInnerMerchantpayexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerMerchantpayexpandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询进件信息
     * Summary: 查询进件信息</p>
     */
    public QueryInnerMerchantpayexpandResponse queryInnerMerchantpayexpandEx(QueryInnerMerchantpayexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerMerchantpayexpandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用</p>
     */
    public PagequeryInnerMerchantagentResponse pagequeryInnerMerchantagent(PagequeryInnerMerchantagentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerMerchantagentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用</p>
     */
    public PagequeryInnerMerchantagentResponse pagequeryInnerMerchantagentEx(PagequeryInnerMerchantagentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantagent.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerMerchantagentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件</p>
     */
    public CloneInnerTemplatefileaddressResponse cloneInnerTemplatefileaddress(CloneInnerTemplatefileaddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneInnerTemplatefileaddressEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件</p>
     */
    public CloneInnerTemplatefileaddressResponse cloneInnerTemplatefileaddressEx(CloneInnerTemplatefileaddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatefileaddress.clone", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloneInnerTemplatefileaddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署区
     * Summary: 查询签署区</p>
     */
    public QueryInnerSignfieldsResponse queryInnerSignfields(QueryInnerSignfieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerSignfieldsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署区
     * Summary: 查询签署区</p>
     */
    public QueryInnerSignfieldsResponse queryInnerSignfieldsEx(QueryInnerSignfieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.signfields.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerSignfieldsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步已发布的模板
     * Summary: 同步已发布的模板</p>
     */
    public SyncInnerTemplateResponse syncInnerTemplate(SyncInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步已发布的模板
     * Summary: 同步已发布的模板</p>
     */
    public SyncInnerTemplateResponse syncInnerTemplateEx(SyncInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息</p>
     */
    public UpdateInnerTemplateResponse updateInnerTemplate(UpdateInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息</p>
     */
    public UpdateInnerTemplateResponse updateInnerTemplateEx(UpdateInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息</p>
     */
    public QueryInnerTemplateResponse queryInnerTemplate(QueryInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息</p>
     */
    public QueryInnerTemplateResponse queryInnerTemplateEx(QueryInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息</p>
     */
    public QueryInnerTemplateelementlinkResponse queryInnerTemplateelementlink(QueryInnerTemplateelementlinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateelementlinkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息</p>
     */
    public QueryInnerTemplateelementlinkResponse queryInnerTemplateelementlinkEx(QueryInnerTemplateelementlinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateelementlinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情</p>
     */
    public QueryInnerTemplateversionResponse queryInnerTemplateversion(QueryInnerTemplateversionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateversionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情</p>
     */
    public QueryInnerTemplateversionResponse queryInnerTemplateversionEx(QueryInnerTemplateversionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateversion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateversionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单消息查询
     * Summary: 订单消息查询</p>
     */
    public PagequeryInnerOrdermsgResponse pagequeryInnerOrdermsg(PagequeryInnerOrdermsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerOrdermsgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单消息查询
     * Summary: 订单消息查询</p>
     */
    public PagequeryInnerOrdermsgResponse pagequeryInnerOrdermsgEx(PagequeryInnerOrdermsgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.ordermsg.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerOrdermsgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单消息重试
     * Summary: 订单消息重试</p>
     */
    public RetryInnerOrdermsgResponse retryInnerOrdermsg(RetryInnerOrdermsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryInnerOrdermsgEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单消息重试
     * Summary: 订单消息重试</p>
     */
    public RetryInnerOrdermsgResponse retryInnerOrdermsgEx(RetryInnerOrdermsgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.ordermsg.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryInnerOrdermsgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务协议授权-  签署合同代扣前置授权查询接口
     * Summary: 签署合同代扣前置授权查询接口</p>
     */
    public QueryInnerAuthorizationResponse queryInnerAuthorization(QueryInnerAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerAuthorizationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务协议授权-  签署合同代扣前置授权查询接口
     * Summary: 签署合同代扣前置授权查询接口</p>
     */
    public QueryInnerAuthorizationResponse queryInnerAuthorizationEx(QueryInnerAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.authorization.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务协议授权 - 签署合同代扣前置同意授权接口
     * Summary: 签署合同代扣前置同意授权接口</p>
     */
    public SignInnerAuthorizationResponse signInnerAuthorization(SignInnerAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signInnerAuthorizationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务协议授权 - 签署合同代扣前置同意授权接口
     * Summary: 签署合同代扣前置同意授权接口</p>
     */
    public SignInnerAuthorizationResponse signInnerAuthorizationEx(SignInnerAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.authorization.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignInnerAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 小程序法务授权 - 商户补充协议状态查询接口
     * Summary: 商户补充协议状态查询接口</p>
     */
    public QueryInnerSupplementalResponse queryInnerSupplemental(QueryInnerSupplementalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerSupplementalEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 小程序法务授权 - 商户补充协议状态查询接口
     * Summary: 商户补充协议状态查询接口</p>
     */
    public QueryInnerSupplementalResponse queryInnerSupplementalEx(QueryInnerSupplementalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.supplemental.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerSupplementalResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务协议授权 - 商户补充协议状态同意接口
     * Summary: 商户补充协议状态同意接口</p>
     */
    public SignInnerSupplementalResponse signInnerSupplemental(SignInnerSupplementalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signInnerSupplementalEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务协议授权 - 商户补充协议状态同意接口
     * Summary: 商户补充协议状态同意接口</p>
     */
    public SignInnerSupplementalResponse signInnerSupplementalEx(SignInnerSupplementalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.supplemental.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignInnerSupplementalResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代扣计划
     * Summary: 代扣计划查询</p>
     */
    public QueryInnerWithholdplanResponse queryInnerWithholdplan(QueryInnerWithholdplanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerWithholdplanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代扣计划
     * Summary: 代扣计划查询</p>
     */
    public QueryInnerWithholdplanResponse queryInnerWithholdplanEx(QueryInnerWithholdplanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.withholdplan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerWithholdplanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建代扣协议
     * Summary: 创建代扣协议</p>
     */
    public CreateInnerWithholdsignResponse createInnerWithholdsign(CreateInnerWithholdsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerWithholdsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建代扣协议
     * Summary: 创建代扣协议</p>
     */
    public CreateInnerWithholdsignResponse createInnerWithholdsignEx(CreateInnerWithholdsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.withholdsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerWithholdsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约查询
     * Summary: 代扣签约查询</p>
     */
    public QueryInnerWithholdsignResponse queryInnerWithholdsign(QueryInnerWithholdsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerWithholdsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约查询
     * Summary: 代扣签约查询</p>
     */
    public QueryInnerWithholdsignResponse queryInnerWithholdsignEx(QueryInnerWithholdsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.withholdsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerWithholdsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取商户进件静态枚举数据
     * Summary: 获取商户进件静态枚举数据</p>
     */
    public GetInnerMerchantstaticdataResponse getInnerMerchantstaticdata(GetInnerMerchantstaticdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerMerchantstaticdataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取商户进件静态枚举数据
     * Summary: 获取商户进件静态枚举数据</p>
     */
    public GetInnerMerchantstaticdataResponse getInnerMerchantstaticdataEx(GetInnerMerchantstaticdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantstaticdata.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerMerchantstaticdataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询已有绑定关系分账方数据
     * 包括分账方名称，社会统一信用代码
     * Summary: 间连查询已有绑定关系分账方数据</p>
     */
    public GetInnerFunddividemerchantResponse getInnerFunddividemerchant(GetInnerFunddividemerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerFunddividemerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询已有绑定关系分账方数据
     * 包括分账方名称，社会统一信用代码
     * Summary: 间连查询已有绑定关系分账方数据</p>
     */
    public GetInnerFunddividemerchantResponse getInnerFunddividemerchantEx(GetInnerFunddividemerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.funddividemerchant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerFunddividemerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询商户和保司协议签署信息
     * Summary: 查询商户和保司协议签署信息</p>
     */
    public QueryInnerInsuresignResponse queryInnerInsuresign(QueryInnerInsuresignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerInsuresignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询商户和保司协议签署信息
     * Summary: 查询商户和保司协议签署信息</p>
     */
    public QueryInnerInsuresignResponse queryInnerInsuresignEx(QueryInnerInsuresignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.insuresign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerInsuresignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 生成商户和保司签约链接
     * Summary: 生成商户和保司签约链接</p>
     */
    public CreateInnerInsuresignResponse createInnerInsuresign(CreateInnerInsuresignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerInsuresignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 生成商户和保司签约链接
     * Summary: 生成商户和保司签约链接</p>
     */
    public CreateInnerInsuresignResponse createInnerInsuresignEx(CreateInnerInsuresignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.insuresign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerInsuresignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询保单信息
     * Summary: 查询保单信息</p>
     */
    public PagequeryInnerInsureorderResponse pagequeryInnerInsureorder(PagequeryInnerInsureorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerInsureorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询保单信息
     * Summary: 查询保单信息</p>
     */
    public PagequeryInnerInsureorderResponse pagequeryInnerInsureorderEx(PagequeryInnerInsureorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.insureorder.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerInsureorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台商品列表
     * Summary: 商品列表</p>
     */
    public PagequeryInnerProductResponse pagequeryInnerProduct(PagequeryInnerProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台商品列表
     * Summary: 商品列表</p>
     */
    public PagequeryInnerProductResponse pagequeryInnerProductEx(PagequeryInnerProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.product.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台首页通知栏
     * Summary: 首页通知栏</p>
     */
    public GetInnerHomepagenoticeResponse getInnerHomepagenotice(GetInnerHomepagenoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerHomepagenoticeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台首页通知栏
     * Summary: 首页通知栏</p>
     */
    public GetInnerHomepagenoticeResponse getInnerHomepagenoticeEx(GetInnerHomepagenoticeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.homepagenotice.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerHomepagenoticeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台通知列表
     * Summary: 通知列表</p>
     */
    public PagequeryInnerNoticeResponse pagequeryInnerNotice(PagequeryInnerNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerNoticeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台通知列表
     * Summary: 通知列表</p>
     */
    public PagequeryInnerNoticeResponse pagequeryInnerNoticeEx(PagequeryInnerNoticeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.notice.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerNoticeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台通知详情
     * Summary: 通知详情</p>
     */
    public DetailInnerNoticeResponse detailInnerNotice(DetailInnerNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerNoticeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台通知详情
     * Summary: 通知详情</p>
     */
    public DetailInnerNoticeResponse detailInnerNoticeEx(DetailInnerNoticeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.notice.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerNoticeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台订单列表
     * Summary: 订单列表</p>
     */
    public PagequeryInnerOrderResponse pagequeryInnerOrder(PagequeryInnerOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户控制台订单列表
     * Summary: 订单列表</p>
     */
    public PagequeryInnerOrderResponse pagequeryInnerOrderEx(PagequeryInnerOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.order.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单详情
     * Summary: 订单详情</p>
     */
    public DetailInnerOrderResponse detailInnerOrder(DetailInnerOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单详情
     * Summary: 订单详情</p>
     */
    public DetailInnerOrderResponse detailInnerOrderEx(DetailInnerOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.order.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同模板实例化渲染，文本域赋值
     * Summary: 合同模板实例化渲染</p>
     */
    public RenderInnerTemplateinstanceResponse renderInnerTemplateinstance(RenderInnerTemplateinstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renderInnerTemplateinstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同模板实例化渲染，文本域赋值
     * Summary: 合同模板实例化渲染</p>
     */
    public RenderInnerTemplateinstanceResponse renderInnerTemplateinstanceEx(RenderInnerTemplateinstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateinstance.render", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RenderInnerTemplateinstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量查询营销分
     * Summary: 批量查询营销分</p>
     */
    public BatchqueryInnerMarketingscoreResponse batchqueryInnerMarketingscore(BatchqueryInnerMarketingscoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryInnerMarketingscoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量查询营销分
     * Summary: 批量查询营销分</p>
     */
    public BatchqueryInnerMarketingscoreResponse batchqueryInnerMarketingscoreEx(BatchqueryInnerMarketingscoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.marketingscore.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryInnerMarketingscoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建客服信息
     * Summary: 创建客服信息</p>
     */
    public CreateInnerCustomerserviceResponse createInnerCustomerservice(CreateInnerCustomerserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerCustomerserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建客服信息
     * Summary: 创建客服信息</p>
     */
    public CreateInnerCustomerserviceResponse createInnerCustomerserviceEx(CreateInnerCustomerserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.customerservice.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerCustomerserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新客服信息
     * Summary: 更新客服信息</p>
     */
    public UpdateInnerCustomerserviceResponse updateInnerCustomerservice(UpdateInnerCustomerserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerCustomerserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新客服信息
     * Summary: 更新客服信息</p>
     */
    public UpdateInnerCustomerserviceResponse updateInnerCustomerserviceEx(UpdateInnerCustomerserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.customerservice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInnerCustomerserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询客服信息
     * Summary:  分页查询客服信息</p>
     */
    public PagequeryInnerCustomerserviceResponse pagequeryInnerCustomerservice(PagequeryInnerCustomerserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerCustomerserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询客服信息
     * Summary:  分页查询客服信息</p>
     */
    public PagequeryInnerCustomerserviceResponse pagequeryInnerCustomerserviceEx(PagequeryInnerCustomerserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.customerservice.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerCustomerserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取客服信息详情
     * Summary: 获取客服信息详情</p>
     */
    public DetailInnerCustomerserviceResponse detailInnerCustomerservice(DetailInnerCustomerserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerCustomerserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取客服信息详情
     * Summary: 获取客服信息详情</p>
     */
    public DetailInnerCustomerserviceResponse detailInnerCustomerserviceEx(DetailInnerCustomerserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.customerservice.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerCustomerserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取代理商客服信息模版
     * Summary: 获取代理商客服信息模版</p>
     */
    public GetInnerCustomerservicetemplateResponse getInnerCustomerservicetemplate(GetInnerCustomerservicetemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerCustomerservicetemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取代理商客服信息模版
     * Summary: 获取代理商客服信息模版</p>
     */
    public GetInnerCustomerservicetemplateResponse getInnerCustomerservicetemplateEx(GetInnerCustomerservicetemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.customerservicetemplate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerCustomerservicetemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板实例化后的模板信息，包括pdf下载链接
     * Summary: 获取模板实例化后的模板信息</p>
     */
    public QueryInnerTemplateinstanceResponse queryInnerTemplateinstance(QueryInnerTemplateinstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTemplateinstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取模板实例化后的模板信息，包括pdf下载链接
     * Summary: 获取模板实例化后的模板信息</p>
     */
    public QueryInnerTemplateinstanceResponse queryInnerTemplateinstanceEx(QueryInnerTemplateinstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templateinstance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTemplateinstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户类目信息详情
     * Summary: 查询租户类目信息详情</p>
     */
    public QueryInnerTenantindirectmainclassResponse queryInnerTenantindirectmainclass(QueryInnerTenantindirectmainclassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTenantindirectmainclassEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户类目信息详情
     * Summary: 查询租户类目信息详情</p>
     */
    public QueryInnerTenantindirectmainclassResponse queryInnerTenantindirectmainclassEx(QueryInnerTenantindirectmainclassRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.tenantindirectmainclass.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTenantindirectmainclassResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改租户间联类目类目信息
     * Summary: 修改租户间联类目类目信息</p>
     */
    public UpdateInnerTenantindirectmainclassResponse updateInnerTenantindirectmainclass(UpdateInnerTenantindirectmainclassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerTenantindirectmainclassEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改租户间联类目类目信息
     * Summary: 修改租户间联类目类目信息</p>
     */
    public UpdateInnerTenantindirectmainclassResponse updateInnerTenantindirectmainclassEx(UpdateInnerTenantindirectmainclassRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.tenantindirectmainclass.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInnerTenantindirectmainclassResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 模板同步上线时强管控字段校验未通过提交后台审核
     * Summary: 模板同步上线审核提交</p>
     */
    public SubmitInnerTemplatesyncreviewResponse submitInnerTemplatesyncreview(SubmitInnerTemplatesyncreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerTemplatesyncreviewEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 模板同步上线时强管控字段校验未通过提交后台审核
     * Summary: 模板同步上线审核提交</p>
     */
    public SubmitInnerTemplatesyncreviewResponse submitInnerTemplatesyncreviewEx(SubmitInnerTemplatesyncreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatesyncreview.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerTemplatesyncreviewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 待办事件处理
     * Summary: 待办事件处理</p>
     */
    public SubmitInnerPendingeventResponse submitInnerPendingevent(SubmitInnerPendingeventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerPendingeventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 待办事件处理
     * Summary: 待办事件处理</p>
     */
    public SubmitInnerPendingeventResponse submitInnerPendingeventEx(SubmitInnerPendingeventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.pendingevent.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerPendingeventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 待办事件详情查询
     * Summary: 待办事件详情查询</p>
     */
    public DetailInnerPendingeventResponse detailInnerPendingevent(DetailInnerPendingeventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerPendingeventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 待办事件详情查询
     * Summary: 待办事件详情查询</p>
     */
    public DetailInnerPendingeventResponse detailInnerPendingeventEx(DetailInnerPendingeventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.pendingevent.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerPendingeventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同模板制作根据已有模板新增合同模板文件
     * Summary: 根据已有模板新增合同模板文件</p>
     */
    public AddInnerTemplateResponse addInnerTemplate(AddInnerTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addInnerTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同模板制作根据已有模板新增合同模板文件
     * Summary: 根据已有模板新增合同模板文件</p>
     */
    public AddInnerTemplateResponse addInnerTemplateEx(AddInnerTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddInnerTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询待办列表
     * Summary: 查询待办列表</p>
     */
    public PagequeryInnerPendingeventResponse pagequeryInnerPendingevent(PagequeryInnerPendingeventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerPendingeventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询待办列表
     * Summary: 查询待办列表</p>
     */
    public PagequeryInnerPendingeventResponse pagequeryInnerPendingeventEx(PagequeryInnerPendingeventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.pendingevent.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerPendingeventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改进件信息
     * Summary: 修改进件信息</p>
     */
    public UpdateInnerMerchantpayexpandResponse updateInnerMerchantpayexpand(UpdateInnerMerchantpayexpandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerMerchantpayexpandEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改进件信息
     * Summary: 修改进件信息</p>
     */
    public UpdateInnerMerchantpayexpandResponse updateInnerMerchantpayexpandEx(UpdateInnerMerchantpayexpandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInnerMerchantpayexpandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户账号信息
     * Summary: 查询租户账号信息</p>
     */
    public QueryInnerTenantaccountinfoResponse queryInnerTenantaccountinfo(QueryInnerTenantaccountinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerTenantaccountinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户账号信息
     * Summary: 查询租户账号信息</p>
     */
    public QueryInnerTenantaccountinfoResponse queryInnerTenantaccountinfoEx(QueryInnerTenantaccountinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.tenantaccountinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerTenantaccountinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租户账号信息
     * Summary: 创建租户账号信息</p>
     */
    public CreateInnerTenantaccountinfoResponse createInnerTenantaccountinfo(CreateInnerTenantaccountinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerTenantaccountinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租户账号信息
     * Summary: 创建租户账号信息</p>
     */
    public CreateInnerTenantaccountinfoResponse createInnerTenantaccountinfoEx(CreateInnerTenantaccountinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.tenantaccountinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerTenantaccountinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代理商客服人员信息
     * Summary: 查询代理商客服人员信息</p>
     */
    public GetInnerAgentcustomerserviceResponse getInnerAgentcustomerservice(GetInnerAgentcustomerserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerAgentcustomerserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代理商客服人员信息
     * Summary: 查询代理商客服人员信息</p>
     */
    public GetInnerAgentcustomerserviceResponse getInnerAgentcustomerserviceEx(GetInnerAgentcustomerserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agentcustomerservice.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInnerAgentcustomerserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存代理商客服人员信息
     * Summary: 保存代理商客服人员信息</p>
     */
    public SaveInnerAgentcustomerserviceResponse saveInnerAgentcustomerservice(SaveInnerAgentcustomerserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveInnerAgentcustomerserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存代理商客服人员信息
     * Summary: 保存代理商客服人员信息</p>
     */
    public SaveInnerAgentcustomerserviceResponse saveInnerAgentcustomerserviceEx(SaveInnerAgentcustomerserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agentcustomerservice.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveInnerAgentcustomerserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询sls日志
     * Summary: 查询sls日志</p>
     */
    public QueryInnerLoggerResponse queryInnerLogger(QueryInnerLoggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerLoggerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询sls日志
     * Summary: 查询sls日志</p>
     */
    public QueryInnerLoggerResponse queryInnerLoggerEx(QueryInnerLoggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.logger.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerLoggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 离线数据下载
     * Summary: 离线数据下载</p>
     */
    public SubmitInnerDatadownloadResponse submitInnerDatadownload(SubmitInnerDatadownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerDatadownloadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 离线数据下载
     * Summary: 离线数据下载</p>
     */
    public SubmitInnerDatadownloadResponse submitInnerDatadownloadEx(SubmitInnerDatadownloadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.datadownload.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerDatadownloadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数据下载列表
     * Summary: 查询数据下载列表</p>
     */
    public PagequeryInnerDatadownloadResponse pagequeryInnerDatadownload(PagequeryInnerDatadownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerDatadownloadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数据下载列表
     * Summary: 查询数据下载列表</p>
     */
    public PagequeryInnerDatadownloadResponse pagequeryInnerDatadownloadEx(PagequeryInnerDatadownloadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.datadownload.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerDatadownloadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除下载任务
     * Summary: 删除下载任务</p>
     */
    public DeleteInnerDatadownloadResponse deleteInnerDatadownload(DeleteInnerDatadownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInnerDatadownloadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除下载任务
     * Summary: 删除下载任务</p>
     */
    public DeleteInnerDatadownloadResponse deleteInnerDatadownloadEx(DeleteInnerDatadownloadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.datadownload.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteInnerDatadownloadResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询公司信息
     * Summary: 分页查询公司信息</p>
     */
    public PagequeryInnerCompanyinfoResponse pagequeryInnerCompanyinfo(PagequeryInnerCompanyinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerCompanyinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询公司信息
     * Summary: 分页查询公司信息</p>
     */
    public PagequeryInnerCompanyinfoResponse pagequeryInnerCompanyinfoEx(PagequeryInnerCompanyinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.companyinfo.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerCompanyinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询商户进件流程节点
     * Summary: 查询商户进件流程节点</p>
     */
    public QueryInnerExpandprocessResponse queryInnerExpandprocess(QueryInnerExpandprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerExpandprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询商户进件流程节点
     * Summary: 查询商户进件流程节点</p>
     */
    public QueryInnerExpandprocessResponse queryInnerExpandprocessEx(QueryInnerExpandprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.expandprocess.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerExpandprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询</p>
     */
    public QueryKnowledgeBaseinfoResponse queryKnowledgeBaseinfo(QueryKnowledgeBaseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKnowledgeBaseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询</p>
     */
    public QueryKnowledgeBaseinfoResponse queryKnowledgeBaseinfoEx(QueryKnowledgeBaseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.baseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKnowledgeBaseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库</p>
     */
    public CreateKnowledgeCategoryResponse createKnowledgeCategory(CreateKnowledgeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库</p>
     */
    public CreateKnowledgeCategoryResponse createKnowledgeCategoryEx(CreateKnowledgeCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.category.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateKnowledgeCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-查询知识库信息列表
     * Summary: 商家自定义知识库-查询知识库信息列表</p>
     */
    public PagequeryKnowledgeCategoryResponse pagequeryKnowledgeCategory(PagequeryKnowledgeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryKnowledgeCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-查询知识库信息列表
     * Summary: 商家自定义知识库-查询知识库信息列表</p>
     */
    public PagequeryKnowledgeCategoryResponse pagequeryKnowledgeCategoryEx(PagequeryKnowledgeCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.category.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryKnowledgeCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息</p>
     */
    public AddKnowledgeCategoryResponse addKnowledgeCategory(AddKnowledgeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addKnowledgeCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息</p>
     */
    public AddKnowledgeCategoryResponse addKnowledgeCategoryEx(AddKnowledgeCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.category.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddKnowledgeCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除</p>
     */
    public BatchdeleteKnowledgeCategoryResponse batchdeleteKnowledgeCategory(BatchdeleteKnowledgeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteKnowledgeCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除</p>
     */
    public BatchdeleteKnowledgeCategoryResponse batchdeleteKnowledgeCategoryEx(BatchdeleteKnowledgeCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.category.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteKnowledgeCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点</p>
     */
    public UpdateKnowledgeCategoryResponse updateKnowledgeCategory(UpdateKnowledgeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点</p>
     */
    public UpdateKnowledgeCategoryResponse updateKnowledgeCategoryEx(UpdateKnowledgeCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.category.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateKnowledgeCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识点流程撤回/上线/下线
     * Summary: 商家自定义知识库-知识点相关功能</p>
     */
    public OperateKnowledgeCategoryResponse operateKnowledgeCategory(OperateKnowledgeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateKnowledgeCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识点流程撤回/上线/下线
     * Summary: 商家自定义知识库-知识点相关功能</p>
     */
    public OperateKnowledgeCategoryResponse operateKnowledgeCategoryEx(OperateKnowledgeCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.category.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateKnowledgeCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护</p>
     */
    public SubmitKnowledgeBaseinfoResponse submitKnowledgeBaseinfo(SubmitKnowledgeBaseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitKnowledgeBaseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护</p>
     */
    public SubmitKnowledgeBaseinfoResponse submitKnowledgeBaseinfoEx(SubmitKnowledgeBaseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.baseinfo.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitKnowledgeBaseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户知识库-知识点全量提交
     * Summary: 商户知识库-知识点全量提交</p>
     */
    public SubmitKnowledgeCategoryResponse submitKnowledgeCategory(SubmitKnowledgeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitKnowledgeCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户知识库-知识点全量提交
     * Summary: 商户知识库-知识点全量提交</p>
     */
    public SubmitKnowledgeCategoryResponse submitKnowledgeCategoryEx(SubmitKnowledgeCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.category.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitKnowledgeCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id</p>
     */
    public QueryKnowledgeCategorylibraryResponse queryKnowledgeCategorylibrary(QueryKnowledgeCategorylibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKnowledgeCategorylibraryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id</p>
     */
    public QueryKnowledgeCategorylibraryResponse queryKnowledgeCategorylibraryEx(QueryKnowledgeCategorylibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.knowledge.categorylibrary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKnowledgeCategorylibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护</p>
     */
    public SubmitInnerKnowledgebaseinfoResponse submitInnerKnowledgebaseinfo(SubmitInnerKnowledgebaseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerKnowledgebaseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护</p>
     */
    public SubmitInnerKnowledgebaseinfoResponse submitInnerKnowledgebaseinfoEx(SubmitInnerKnowledgebaseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgebaseinfo.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerKnowledgebaseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询</p>
     */
    public QueryInnerKnowledgebaseinfoResponse queryInnerKnowledgebaseinfo(QueryInnerKnowledgebaseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerKnowledgebaseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询</p>
     */
    public QueryInnerKnowledgebaseinfoResponse queryInnerKnowledgebaseinfoEx(QueryInnerKnowledgebaseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgebaseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerKnowledgebaseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 户知识库-知识点全量提交
     * Summary: 户知识库-知识点全量提交</p>
     */
    public SubmitInnerKnowledgecategoryResponse submitInnerKnowledgecategory(SubmitInnerKnowledgecategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitInnerKnowledgecategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 户知识库-知识点全量提交
     * Summary: 户知识库-知识点全量提交</p>
     */
    public SubmitInnerKnowledgecategoryResponse submitInnerKnowledgecategoryEx(SubmitInnerKnowledgecategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategory.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitInnerKnowledgecategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id</p>
     */
    public QueryInnerKnowledgecategorylibraryResponse queryInnerKnowledgecategorylibrary(QueryInnerKnowledgecategorylibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerKnowledgecategorylibraryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id</p>
     */
    public QueryInnerKnowledgecategorylibraryResponse queryInnerKnowledgecategorylibraryEx(QueryInnerKnowledgecategorylibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategorylibrary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerKnowledgecategorylibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库</p>
     */
    public CreateInnerKnowledgecategoryResponse createInnerKnowledgecategory(CreateInnerKnowledgecategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerKnowledgecategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库</p>
     */
    public CreateInnerKnowledgecategoryResponse createInnerKnowledgecategoryEx(CreateInnerKnowledgecategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategory.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerKnowledgecategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除</p>
     */
    public BatchdeleteInnerKnowledgecategoryResponse batchdeleteInnerKnowledgecategory(BatchdeleteInnerKnowledgecategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteInnerKnowledgecategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除</p>
     */
    public BatchdeleteInnerKnowledgecategoryResponse batchdeleteInnerKnowledgecategoryEx(BatchdeleteInnerKnowledgecategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategory.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteInnerKnowledgecategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识点相关功能
     * Summary: 商家自定义知识库-知识点相关功能</p>
     */
    public OperateInnerKnowledgecategoryResponse operateInnerKnowledgecategory(OperateInnerKnowledgecategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateInnerKnowledgecategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-知识点相关功能
     * Summary: 商家自定义知识库-知识点相关功能</p>
     */
    public OperateInnerKnowledgecategoryResponse operateInnerKnowledgecategoryEx(OperateInnerKnowledgecategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategory.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateInnerKnowledgecategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息</p>
     */
    public AddInnerKnowledgecategoryResponse addInnerKnowledgecategory(AddInnerKnowledgecategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addInnerKnowledgecategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息</p>
     */
    public AddInnerKnowledgecategoryResponse addInnerKnowledgecategoryEx(AddInnerKnowledgecategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategory.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddInnerKnowledgecategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 
     * 商家自定义知识库-查询知识库信息列表
     * Summary:  商家自定义知识库-查询知识库信息列表</p>
     */
    public PagequeryInnerKnowledgecategoryResponse pagequeryInnerKnowledgecategory(PagequeryInnerKnowledgecategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerKnowledgecategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 
     * 商家自定义知识库-查询知识库信息列表
     * Summary:  商家自定义知识库-查询知识库信息列表</p>
     */
    public PagequeryInnerKnowledgecategoryResponse pagequeryInnerKnowledgecategoryEx(PagequeryInnerKnowledgecategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategory.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerKnowledgecategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点</p>
     */
    public UpdateInnerKnowledgecategoryResponse updateInnerKnowledgecategory(UpdateInnerKnowledgecategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerKnowledgecategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点</p>
     */
    public UpdateInnerKnowledgecategoryResponse updateInnerKnowledgecategoryEx(UpdateInnerKnowledgecategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.knowledgecategory.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInnerKnowledgecategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
     * Summary: 分销渠道创建</p>
     */
    public CreateInnerSaleschannelResponse createInnerSaleschannel(CreateInnerSaleschannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerSaleschannelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
     * Summary: 分销渠道创建</p>
     */
    public CreateInnerSaleschannelResponse createInnerSaleschannelEx(CreateInnerSaleschannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.saleschannel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerSaleschannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询分销渠道code、名称、级别等信息
     * Summary: 分销渠道查询</p>
     */
    public QueryInnerSaleschannelResponse queryInnerSaleschannel(QueryInnerSaleschannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerSaleschannelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询分销渠道code、名称、级别等信息
     * Summary: 分销渠道查询</p>
     */
    public QueryInnerSaleschannelResponse queryInnerSaleschannelEx(QueryInnerSaleschannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.saleschannel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerSaleschannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分销渠道更新，当前支持修改渠道名称
     * Summary: 分销渠道更新</p>
     */
    public UpdateInnerSaleschannelResponse updateInnerSaleschannel(UpdateInnerSaleschannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInnerSaleschannelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分销渠道更新，当前支持修改渠道名称
     * Summary: 分销渠道更新</p>
     */
    public UpdateInnerSaleschannelResponse updateInnerSaleschannelEx(UpdateInnerSaleschannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.saleschannel.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInnerSaleschannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除所选的分销渠道
     * Summary: 分销渠道删除</p>
     */
    public DeleteInnerSaleschannelResponse deleteInnerSaleschannel(DeleteInnerSaleschannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInnerSaleschannelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除所选的分销渠道
     * Summary: 分销渠道删除</p>
     */
    public DeleteInnerSaleschannelResponse deleteInnerSaleschannelEx(DeleteInnerSaleschannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.saleschannel.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteInnerSaleschannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量创建文本域（组件）
     * Summary: 批量创建文本域</p>
     */
    public BatchcreateInnerTemplatetextareaResponse batchcreateInnerTemplatetextarea(BatchcreateInnerTemplatetextareaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateInnerTemplatetextareaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量创建文本域（组件）
     * Summary: 批量创建文本域</p>
     */
    public BatchcreateInnerTemplatetextareaResponse batchcreateInnerTemplatetextareaEx(BatchcreateInnerTemplatetextareaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.templatetextarea.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateInnerTemplatetextareaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 异步解约申请列表
     * Summary: 异步解约申请列表</p>
     */
    public PagequeryInnerAgreementterminateResponse pagequeryInnerAgreementterminate(PagequeryInnerAgreementterminateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInnerAgreementterminateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 异步解约申请列表
     * Summary: 异步解约申请列表</p>
     */
    public PagequeryInnerAgreementterminateResponse pagequeryInnerAgreementterminateEx(PagequeryInnerAgreementterminateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agreementterminate.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInnerAgreementterminateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约申请记录详情
     * Summary: 解约申请记录详情</p>
     */
    public DetailInnerAgreementterminateResponse detailInnerAgreementterminate(DetailInnerAgreementterminateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailInnerAgreementterminateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约申请记录详情
     * Summary: 解约申请记录详情</p>
     */
    public DetailInnerAgreementterminateResponse detailInnerAgreementterminateEx(DetailInnerAgreementterminateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agreementterminate.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailInnerAgreementterminateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣解约申请处理
     * Summary: 代扣解约申请处理</p>
     */
    public OperateInnerAgreementterminateResponse operateInnerAgreementterminate(OperateInnerAgreementterminateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateInnerAgreementterminateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣解约申请处理
     * Summary: 代扣解约申请处理</p>
     */
    public OperateInnerAgreementterminateResponse operateInnerAgreementterminateEx(OperateInnerAgreementterminateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agreementterminate.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateInnerAgreementterminateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户补充拒绝举证材料
     * Summary: 商户补充拒绝举证材料</p>
     */
    public ChargeInnerAgreementterminateevidenceResponse chargeInnerAgreementterminateevidence(ChargeInnerAgreementterminateevidenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.chargeInnerAgreementterminateevidenceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户补充拒绝举证材料
     * Summary: 商户补充拒绝举证材料</p>
     */
    public ChargeInnerAgreementterminateevidenceResponse chargeInnerAgreementterminateevidenceEx(ChargeInnerAgreementterminateevidenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agreementterminateevidence.charge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ChargeInnerAgreementterminateevidenceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣异步解约-支付宝是否直接解约
     * Summary: 代扣异步解约-支付宝是否直接解约</p>
     */
    public OperateInnerAgreementterminatezfbdirectResponse operateInnerAgreementterminatezfbdirect(OperateInnerAgreementterminatezfbdirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateInnerAgreementterminatezfbdirectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣异步解约-支付宝是否直接解约
     * Summary: 代扣异步解约-支付宝是否直接解约</p>
     */
    public OperateInnerAgreementterminatezfbdirectResponse operateInnerAgreementterminatezfbdirectEx(OperateInnerAgreementterminatezfbdirectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agreementterminatezfbdirect.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateInnerAgreementterminatezfbdirectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约申请配置详情
     * Summary: 解约申请配置详情</p>
     */
    public QueryInnerAgreementterminateconfigResponse queryInnerAgreementterminateconfig(QueryInnerAgreementterminateconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerAgreementterminateconfigEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约申请配置详情
     * Summary: 解约申请配置详情</p>
     */
    public QueryInnerAgreementterminateconfigResponse queryInnerAgreementterminateconfigEx(QueryInnerAgreementterminateconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agreementterminateconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerAgreementterminateconfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约申请商户各状态统计
     * Summary: 解约申请商户各状态统计</p>
     */
    public CountInnerAgreementterminateResponse countInnerAgreementterminate(CountInnerAgreementterminateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countInnerAgreementterminateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 解约申请商户各状态统计
     * Summary: 解约申请商户各状态统计</p>
     */
    public CountInnerAgreementterminateResponse countInnerAgreementterminateEx(CountInnerAgreementterminateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.agreementterminate.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountInnerAgreementterminateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 一键投保
     * Summary: 投保</p>
     */
    public CreateInsureResponse createInsure(CreateInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInsureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 一键投保
     * Summary: 投保</p>
     */
    public CreateInsureResponse createInsureEx(CreateInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.insure.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInsureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保单查询
     * Summary: 保单查询</p>
     */
    public QueryInsureResponse queryInsure(QueryInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInsureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保单查询
     * Summary: 保单查询</p>
     */
    public QueryInsureResponse queryInsureEx(QueryInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.insure.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInsureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险代扣重试
     * Summary: 保险代扣重试</p>
     */
    public RetryInsurePayResponse retryInsurePay(RetryInsurePayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryInsurePayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保险代扣重试
     * Summary: 保险代扣重试</p>
     */
    public RetryInsurePayResponse retryInsurePayEx(RetryInsurePayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.insure.pay.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryInsurePayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻
     * Summary: 商户入驻</p>
     */
    public RegisterMerchantexpandMerchantResponse registerMerchantexpandMerchant(RegisterMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻
     * Summary: 商户入驻</p>
     */
    public RegisterMerchantexpandMerchantResponse registerMerchantexpandMerchantEx(RegisterMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterMerchantexpandMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接</p>
     */
    public UploadMerchantexpandFileResponse uploadMerchantexpandFile(UploadMerchantexpandFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadMerchantexpandFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接</p>
     */
    public UploadMerchantexpandFileResponse uploadMerchantexpandFileEx(UploadMerchantexpandFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadMerchantexpandFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻查询
     * Summary: 商户入驻查询</p>
     */
    public QueryMerchantexpandMerchantResponse queryMerchantexpandMerchant(QueryMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻查询
     * Summary: 商户入驻查询</p>
     */
    public QueryMerchantexpandMerchantResponse queryMerchantexpandMerchantEx(QueryMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantexpandMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家信息修改
     * Summary: 商家信息修改</p>
     */
    public UpdateMerchantexpandMerchantResponse updateMerchantexpandMerchant(UpdateMerchantexpandMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMerchantexpandMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家信息修改
     * Summary: 商家信息修改</p>
     */
    public UpdateMerchantexpandMerchantResponse updateMerchantexpandMerchantEx(UpdateMerchantexpandMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMerchantexpandMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系</p>
     */
    public AddMerchantexpandDividerelationResponse addMerchantexpandDividerelation(AddMerchantexpandDividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMerchantexpandDividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系</p>
     */
    public AddMerchantexpandDividerelationResponse addMerchantexpandDividerelationEx(AddMerchantexpandDividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddMerchantexpandDividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询</p>
     */
    public QueryMerchantexpandDividerelationResponse queryMerchantexpandDividerelation(QueryMerchantexpandDividerelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantexpandDividerelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询</p>
     */
    public QueryMerchantexpandDividerelationResponse queryMerchantexpandDividerelationEx(QueryMerchantexpandDividerelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantexpandDividerelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信身份认证，创建认证
     * Summary: 创建认证</p>
     */
    public CreateRealpersonFacevrfResponse createRealpersonFacevrf(CreateRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信身份认证，创建认证
     * Summary: 创建认证</p>
     */
    public CreateRealpersonFacevrfResponse createRealpersonFacevrfEx(CreateRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRealpersonFacevrfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果</p>
     */
    public QueryRealpersonFacevrfResponse queryRealpersonFacevrf(QueryRealpersonFacevrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRealpersonFacevrfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果</p>
     */
    public QueryRealpersonFacevrfResponse queryRealpersonFacevrfEx(QueryRealpersonFacevrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRealpersonFacevrfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分</p>
     */
    public QueryRiskResponse queryRisk(QueryRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分</p>
     */
    public QueryRiskResponse queryRiskEx(QueryRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 云 api 发起风控分析，获取风险评估
     * Summary: 云 api 发起风控分析，获取风险评估</p>
     */
    public QueryRiskGoResponse queryRiskGo(QueryRiskGoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskGoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 云 api 发起风控分析，获取风险评估
     * Summary: 云 api 发起风控分析，获取风险评估</p>
     */
    public QueryRiskGoResponse queryRiskGoEx(QueryRiskGoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.risk.go.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskGoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 小程序云调用，上报计量信息
     * Summary: 小程序云调用，上报计量信息</p>
     */
    public UploadInnerRiskcallResponse uploadInnerRiskcall(UploadInnerRiskcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadInnerRiskcallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 小程序云调用，上报计量信息
     * Summary: 小程序云调用，上报计量信息</p>
     */
    public UploadInnerRiskcallResponse uploadInnerRiskcallEx(UploadInnerRiskcallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.inner.riskcall.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadInnerRiskcallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务</p>
     */
    public AllSignTemplateResponse allSignTemplate(AllSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allSignTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务</p>
     */
    public AllSignTemplateResponse allSignTemplateEx(AllSignTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllSignTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）</p>
     */
    public SubmitSignFlowResponse submitSignFlow(SubmitSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）</p>
     */
    public SubmitSignFlowResponse submitSignFlowEx(SubmitSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署流程详情
     * Summary: 查询签署流程详情</p>
     */
    public GetSignFlowResponse getSignFlow(GetSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署流程详情
     * Summary: 查询签署流程详情</p>
     */
    public GetSignFlowResponse getSignFlowEx(GetSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作</p>
     */
    public AuthSignFlowResponse authSignFlow(AuthSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作</p>
     */
    public AuthSignFlowResponse authSignFlowEx(AuthSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）</p>
     */
    public SubmitFrontSignResponse submitFrontSign(SubmitFrontSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitFrontSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）</p>
     */
    public SubmitFrontSignResponse submitFrontSignEx(SubmitFrontSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitFrontSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口</p>
     */
    public UploadSignFlowResponse uploadSignFlow(UploadSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口</p>
     */
    public UploadSignFlowResponse uploadSignFlowEx(UploadSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.sign.flow.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadSignFlowResponse uploadSignFlowResponse = UploadSignFlowResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadSignFlowResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传</p>
     */
    public UploadSignTemplateResponse uploadSignTemplate(UploadSignTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSignTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传</p>
     */
    public UploadSignTemplateResponse uploadSignTemplateEx(UploadSignTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.ato.sign.template.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadSignTemplateResponse uploadSignTemplateResponse = UploadSignTemplateResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadSignTemplateResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSignTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传</p>
     */
    public UploadSignCreditResponse uploadSignCredit(UploadSignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSignCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传</p>
     */
    public UploadSignCreditResponse uploadSignCreditEx(UploadSignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSignCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询</p>
     */
    public QuerySignCreditResponse querySignCredit(QuerySignCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySignCreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询</p>
     */
    public QuerySignCreditResponse querySignCreditEx(QuerySignCreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySignCreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 撤销签署流程
     * Summary: 撤销签署流程</p>
     */
    public CancelSignFlowResponse cancelSignFlow(CancelSignFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSignFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 撤销签署流程
     * Summary: 撤销签署流程</p>
     */
    public CancelSignFlowResponse cancelSignFlowEx(CancelSignFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSignFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取合同存证证明
     * Summary: 获取合同存证证明</p>
     */
    public GetSignContractcertificateResponse getSignContractcertificate(GetSignContractcertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSignContractcertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取合同存证证明
     * Summary: 获取合同存证证明</p>
     */
    public GetSignContractcertificateResponse getSignContractcertificateEx(GetSignContractcertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSignContractcertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口</p>
     */
    public SyncTradeResponse syncTrade(SyncTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口</p>
     */
    public SyncTradeResponse syncTradeEx(SyncTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取详情
     * Summary: 获取详情</p>
     */
    public GetTradeResponse getTrade(GetTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取详情
     * Summary: 获取详情</p>
     */
    public GetTradeResponse getTradeEx(GetTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单创建，前置签署
     * Summary: 前置签署订单创建</p>
     */
    public SyncFrontTradeResponse syncFrontTrade(SyncFrontTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFrontTradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单创建，前置签署
     * Summary: 前置签署订单创建</p>
     */
    public SyncFrontTradeResponse syncFrontTradeEx(SyncFrontTradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFrontTradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款申请接口
     * Summary: 融资放款申请接口</p>
     */
    public SyncTradeFinanceloanapplyResponse syncTradeFinanceloanapply(SyncTradeFinanceloanapplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeFinanceloanapplyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资放款申请接口
     * Summary: 融资放款申请接口</p>
     */
    public SyncTradeFinanceloanapplyResponse syncTradeFinanceloanapplyEx(SyncTradeFinanceloanapplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeFinanceloanapplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约查询
     * Summary: 商户履约查询</p>
     */
    public GetTradeMerchantfulfillmentResponse getTradeMerchantfulfillment(GetTradeMerchantfulfillmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeMerchantfulfillmentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约查询
     * Summary: 商户履约查询</p>
     */
    public GetTradeMerchantfulfillmentResponse getTradeMerchantfulfillmentEx(GetTradeMerchantfulfillmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeMerchantfulfillmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）</p>
     */
    public GetTradeUserperformanceResponse getTradeUserperformance(GetTradeUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeUserperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）</p>
     */
    public GetTradeUserperformanceResponse getTradeUserperformanceEx(GetTradeUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeUserperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetTradeMerchantperformanceResponse getTradeMerchantperformance(GetTradeMerchantperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeMerchantperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）</p>
     */
    public GetTradeMerchantperformanceResponse getTradeMerchantperformanceEx(GetTradeMerchantperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeMerchantperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改</p>
     */
    public UpdateTradeUserpromiseResponse updateTradeUserpromise(UpdateTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改</p>
     */
    public UpdateTradeUserpromiseResponse updateTradeUserpromiseEx(UpdateTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件</p>
     */
    public SyncFrontIndirectorderResponse syncFrontIndirectorder(SyncFrontIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFrontIndirectorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件</p>
     */
    public SyncFrontIndirectorderResponse syncFrontIndirectorderEx(SyncFrontIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFrontIndirectorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件</p>
     */
    public SyncTradeIndirectorderResponse syncTradeIndirectorder(SyncTradeIndirectorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeIndirectorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件</p>
     */
    public SyncTradeIndirectorderResponse syncTradeIndirectorderEx(SyncTradeIndirectorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeIndirectorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新</p>
     */
    public ReplaceTradeUserpromiseResponse replaceTradeUserpromise(ReplaceTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新</p>
     */
    public ReplaceTradeUserpromiseResponse replaceTradeUserpromiseEx(ReplaceTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口</p>
     */
    public ApplyTradeFinanceprecheckResponse applyTradeFinanceprecheck(ApplyTradeFinanceprecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTradeFinanceprecheckEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口</p>
     */
    public ApplyTradeFinanceprecheckResponse applyTradeFinanceprecheckEx(ApplyTradeFinanceprecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTradeFinanceprecheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 非融转融资
     * Summary: 非融转融资</p>
     */
    public TransferTradeFinanceResponse transferTradeFinance(TransferTradeFinanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferTradeFinanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 非融转融资
     * Summary: 非融转融资</p>
     */
    public TransferTradeFinanceResponse transferTradeFinanceEx(TransferTradeFinanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferTradeFinanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新订单信息
     * Summary: 更新订单信息</p>
     */
    public UpdateTradeOrderResponse updateTradeOrder(UpdateTradeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTradeOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新订单信息
     * Summary: 更新订单信息</p>
     */
    public UpdateTradeOrderResponse updateTradeOrderEx(UpdateTradeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTradeOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资订单追加预审资金方
     * Summary: 融资订单追加预审资金方</p>
     */
    public AddTradeFinanceprecheckResponse addTradeFinanceprecheck(AddTradeFinanceprecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTradeFinanceprecheckEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资订单追加预审资金方
     * Summary: 融资订单追加预审资金方</p>
     */
    public AddTradeFinanceprecheckResponse addTradeFinanceprecheckEx(AddTradeFinanceprecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTradeFinanceprecheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资信息查询接口
     * Summary: 订单融资信息查询接口</p>
     */
    public GetTradeOrderfinanceinfoResponse getTradeOrderfinanceinfo(GetTradeOrderfinanceinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTradeOrderfinanceinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单融资信息查询接口
     * Summary: 订单融资信息查询接口</p>
     */
    public GetTradeOrderfinanceinfoResponse getTradeOrderfinanceinfoEx(GetTradeOrderfinanceinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTradeOrderfinanceinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划延期
     * Summary: 订单代扣计划延期</p>
     */
    public SyncTradeUserpromisedelayResponse syncTradeUserpromisedelay(SyncTradeUserpromisedelayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeUserpromisedelayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划延期
     * Summary: 订单代扣计划延期</p>
     */
    public SyncTradeUserpromisedelayResponse syncTradeUserpromisedelayEx(SyncTradeUserpromisedelayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeUserpromisedelayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划暂停
     * Summary: 订单代扣计划暂停</p>
     */
    public PauseTradeUserpromiseResponse pauseTradeUserpromise(PauseTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单代扣计划暂停
     * Summary: 订单代扣计划暂停</p>
     */
    public PauseTradeUserpromiseResponse pauseTradeUserpromiseEx(PauseTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣计划重启
     * Summary: 代扣计划重启</p>
     */
    public ResumeTradeUserpromiseResponse resumeTradeUserpromise(ResumeTradeUserpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeTradeUserpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣计划重启
     * Summary: 代扣计划重启</p>
     */
    public ResumeTradeUserpromiseResponse resumeTradeUserpromiseEx(ResumeTradeUserpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeTradeUserpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单信息同步
     * Summary: 订单信息同步</p>
     */
    public SyncTradePromoorderinfoResponse syncTradePromoorderinfo(SyncTradePromoorderinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradePromoorderinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单信息同步
     * Summary: 订单信息同步</p>
     */
    public SyncTradePromoorderinfoResponse syncTradePromoorderinfoEx(SyncTradePromoorderinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.trade.promoorderinfo.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradePromoorderinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约创建
     * Summary: 代扣签约</p>
     */
    public CreateWithholdSignResponse createWithholdSign(CreateWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约创建
     * Summary: 代扣签约</p>
     */
    public CreateWithholdSignResponse createWithholdSignEx(CreateWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约查询
     * Summary: 代扣签约查询</p>
     */
    public QueryWithholdSignResponse queryWithholdSign(QueryWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约查询
     * Summary: 代扣签约查询</p>
     */
    public QueryWithholdSignResponse queryWithholdSignEx(QueryWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑</p>
     */
    public UnbindWithholdSignResponse unbindWithholdSign(UnbindWithholdSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindWithholdSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑</p>
     */
    public UnbindWithholdSignResponse unbindWithholdSignEx(UnbindWithholdSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindWithholdSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划</p>
     */
    public CancelWithholdPlanResponse cancelWithholdPlan(CancelWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWithholdPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划</p>
     */
    public CancelWithholdPlanResponse cancelWithholdPlanEx(CancelWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelWithholdPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 重要说明：
     * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期多期代扣取消</p>
     */
    public RepayWithholdPlanResponse repayWithholdPlan(RepayWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayWithholdPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 重要说明：
     * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期多期代扣取消</p>
     */
    public RepayWithholdPlanResponse repayWithholdPlanEx(RepayWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayWithholdPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试</p>
     */
    public RetryWithholdPlanResponse retryWithholdPlan(RetryWithholdPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryWithholdPlanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试</p>
     */
    public RetryWithholdPlanResponse retryWithholdPlanEx(RetryWithholdPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryWithholdPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认</p>
     */
    public ConfirmWithholdSignasyncunsignResponse confirmWithholdSignasyncunsign(ConfirmWithholdSignasyncunsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmWithholdSignasyncunsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认</p>
     */
    public ConfirmWithholdSignasyncunsignResponse confirmWithholdSignasyncunsignEx(ConfirmWithholdSignasyncunsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmWithholdSignasyncunsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付创建
     * Summary: 主动支付创建</p>
     */
    public CreateWithholdActivepayResponse createWithholdActivepay(CreateWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付创建
     * Summary: 主动支付创建</p>
     */
    public CreateWithholdActivepayResponse createWithholdActivepayEx(CreateWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdActivepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付查询
     * Summary: 主动支付查询</p>
     */
    public QueryWithholdActivepayResponse queryWithholdActivepay(QueryWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付查询
     * Summary: 主动支付查询</p>
     */
    public QueryWithholdActivepayResponse queryWithholdActivepayEx(QueryWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdActivepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付取消
     * Summary: 主动支付取消</p>
     */
    public CancelWithholdActivepayResponse cancelWithholdActivepay(CancelWithholdActivepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWithholdActivepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动支付取消
     * Summary: 主动支付取消</p>
     */
    public CancelWithholdActivepayResponse cancelWithholdActivepayEx(CancelWithholdActivepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelWithholdActivepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建退款请求
     * Summary: 创建退款申请</p>
     */
    public CreateWithholdRefundResponse createWithholdRefund(CreateWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建退款请求
     * Summary: 创建退款申请</p>
     */
    public CreateWithholdRefundResponse createWithholdRefundEx(CreateWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款申请结果查询
     * Summary: 退款申请结果查询</p>
     */
    public QueryWithholdRefundResponse queryWithholdRefund(QueryWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 退款申请结果查询
     * Summary: 退款申请结果查询</p>
     */
    public QueryWithholdRefundResponse queryWithholdRefundEx(QueryWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代偿户账户查询
     * Summary: 代偿户账户查询</p>
     */
    public QueryWithholdCompensateaccountResponse queryWithholdCompensateaccount(QueryWithholdCompensateaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdCompensateaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代偿户账户查询
     * Summary: 代偿户账户查询</p>
     */
    public QueryWithholdCompensateaccountResponse queryWithholdCompensateaccountEx(QueryWithholdCompensateaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdCompensateaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试pending状态的代扣计划
     * Summary: 重试pending状态的代扣计划</p>
     */
    public RetryWithholdPlanpendingResponse retryWithholdPlanpending(RetryWithholdPlanpendingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryWithholdPlanpendingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试pending状态的代扣计划
     * Summary: 重试pending状态的代扣计划</p>
     */
    public RetryWithholdPlanpendingResponse retryWithholdPlanpendingEx(RetryWithholdPlanpendingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.planpending.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryWithholdPlanpendingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账pending重试
     * Summary: 分账pending重试</p>
     */
    public RetryWithholdDividependingResponse retryWithholdDividepending(RetryWithholdDividependingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryWithholdDividependingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分账pending重试
     * Summary: 分账pending重试</p>
     */
    public RetryWithholdDividependingResponse retryWithholdDividependingEx(RetryWithholdDividependingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ato.withhold.dividepending.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryWithholdDividependingResponse());
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
