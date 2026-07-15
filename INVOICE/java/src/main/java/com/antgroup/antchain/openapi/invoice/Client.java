// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.invoice.models.*;

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
                    new TeaPair("sdk_version", "1.1.3"),
                    new TeaPair("_prod_code", "INVOICE"),
                    new TeaPair("_prod_channel", "default")
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
     * <p>Description: 国际开票场景下查询客户信息
     * Summary: 国际开票场景下查询客户信息</p>
     */
    public QueryIntlconfigUserinfoResponse queryIntlconfigUserinfo(QueryIntlconfigUserinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIntlconfigUserinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际开票场景下查询客户信息
     * Summary: 国际开票场景下查询客户信息</p>
     */
    public QueryIntlconfigUserinfoResponse queryIntlconfigUserinfoEx(QueryIntlconfigUserinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlconfig.userinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIntlconfigUserinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景果询可开票单据
     * Summary: 国际发票场景果询可开票单据</p>
     */
    public QueryIntlamountRcptResponse queryIntlamountRcpt(QueryIntlamountRcptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIntlamountRcptEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景果询可开票单据
     * Summary: 国际发票场景果询可开票单据</p>
     */
    public QueryIntlamountRcptResponse queryIntlamountRcptEx(QueryIntlamountRcptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlamount.rcpt.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIntlamountRcptResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景下查询开票申请列表
     * Summary: 国际发票场景下查询开票申请列表</p>
     */
    public QueryIntlinvoicesApplyResponse queryIntlinvoicesApply(QueryIntlinvoicesApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIntlinvoicesApplyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 国际发票场景下查询开票申请列表
     * Summary: 国际发票场景下查询开票申请列表</p>
     */
    public QueryIntlinvoicesApplyResponse queryIntlinvoicesApplyEx(QueryIntlinvoicesApplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlinvoices.apply.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIntlinvoicesApplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据业务号和发票ID获取国际发票文件下载地址
     * Summary: 根据业务号和发票ID获取国际发票文件下载地址</p>
     */
    public QueryIntlinvoicesFileurlResponse queryIntlinvoicesFileurl(QueryIntlinvoicesFileurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIntlinvoicesFileurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据业务号和发票ID获取国际发票文件下载地址
     * Summary: 根据业务号和发票ID获取国际发票文件下载地址</p>
     */
    public QueryIntlinvoicesFileurlResponse queryIntlinvoicesFileurlEx(QueryIntlinvoicesFileurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlinvoices.fileurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIntlinvoicesFileurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交国际形式发票开票申请
     * Summary: 提交国际形式发票开票申请</p>
     */
    public PushIntlinvoicesProformainvoiceResponse pushIntlinvoicesProformainvoice(PushIntlinvoicesProformainvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushIntlinvoicesProformainvoiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交国际形式发票开票申请
     * Summary: 提交国际形式发票开票申请</p>
     */
    public PushIntlinvoicesProformainvoiceResponse pushIntlinvoicesProformainvoiceEx(PushIntlinvoicesProformainvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.intlinvoices.proformainvoice.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushIntlinvoicesProformainvoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户合同下的发票列表
     * Summary: 查询发票列表</p>
     */
    public PagequeryInvoicesApplyResponse pagequeryInvoicesApply(PagequeryInvoicesApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryInvoicesApplyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户合同下的发票列表
     * Summary: 查询发票列表</p>
     */
    public PagequeryInvoicesApplyResponse pagequeryInvoicesApplyEx(PagequeryInvoicesApplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.invoices.apply.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryInvoicesApplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取发票电子文件
     * Summary: 获取发票电子文件</p>
     */
    public GetInvoicesFileurlResponse getInvoicesFileurl(GetInvoicesFileurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInvoicesFileurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取发票电子文件
     * Summary: 获取发票电子文件</p>
     */
    public GetInvoicesFileurlResponse getInvoicesFileurlEx(GetInvoicesFileurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.invoices.fileurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInvoicesFileurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发票预览申请
     * Summary: 发票预览申请</p>
     */
    public ApplyInvoicesPreviewResponse applyInvoicesPreview(ApplyInvoicesPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInvoicesPreviewEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发票预览申请
     * Summary: 发票预览申请</p>
     */
    public ApplyInvoicesPreviewResponse applyInvoicesPreviewEx(ApplyInvoicesPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.invoices.preview.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInvoicesPreviewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发票申请
     * Summary: 发票申请</p>
     */
    public ApplyInvoicesInstanceResponse applyInvoicesInstance(ApplyInvoicesInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInvoicesInstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发票申请
     * Summary: 发票申请</p>
     */
    public ApplyInvoicesInstanceResponse applyInvoicesInstanceEx(ApplyInvoicesInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.invoices.instance.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInvoicesInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发票退票申请
     * Summary: 发票退票申请</p>
     */
    public ApplyInvoicesReturnResponse applyInvoicesReturn(ApplyInvoicesReturnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInvoicesReturnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发票退票申请
     * Summary: 发票退票申请</p>
     */
    public ApplyInvoicesReturnResponse applyInvoicesReturnEx(ApplyInvoicesReturnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.invoices.return.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInvoicesReturnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据条件查询已开票记录
     * Summary: 查询已开票记录</p>
     */
    public QueryApplyRecordResponse queryApplyRecord(QueryApplyRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplyRecordEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据条件查询已开票记录
     * Summary: 查询已开票记录</p>
     */
    public QueryApplyRecordResponse queryApplyRecordEx(QueryApplyRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.apply.record.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApplyRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支持租户或合同号分页查询开票单据详细信息
     * Summary: 支持租户或合同号分页查询开票单据详细信息</p>
     */
    public PagequeryRcptDetailResponse pagequeryRcptDetail(PagequeryRcptDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryRcptDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支持租户或合同号分页查询开票单据详细信息
     * Summary: 支持租户或合同号分页查询开票单据详细信息</p>
     */
    public PagequeryRcptDetailResponse pagequeryRcptDetailEx(PagequeryRcptDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.rcpt.detail.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryRcptDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取租户的开票信息
     * Summary: 获取租户的开票信息</p>
     */
    public GetConfigUserinfoResponse getConfigUserinfo(GetConfigUserinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigUserinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取租户的开票信息
     * Summary: 获取租户的开票信息</p>
     */
    public GetConfigUserinfoResponse getConfigUserinfoEx(GetConfigUserinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.config.userinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConfigUserinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取开票允许的介质
     * Summary: 获取开票允许的介质</p>
     */
    public QueryConfigMaterialResponse queryConfigMaterial(QueryConfigMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConfigMaterialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取开票允许的介质
     * Summary: 获取开票允许的介质</p>
     */
    public QueryConfigMaterialResponse queryConfigMaterialEx(QueryConfigMaterialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.config.material.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConfigMaterialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存或更新客户开票信息
     * Summary: 保存或更新客户开票信息</p>
     */
    public SaveConfigUserinfoResponse saveConfigUserinfo(SaveConfigUserinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveConfigUserinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存或更新客户开票信息
     * Summary: 保存或更新客户开票信息</p>
     */
    public SaveConfigUserinfoResponse saveConfigUserinfoEx(SaveConfigUserinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.invoice.config.userinfo.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveConfigUserinfoResponse());
    }
}
