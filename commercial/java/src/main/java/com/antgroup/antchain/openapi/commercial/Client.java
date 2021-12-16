// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.commercial.models.*;
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
                    new TeaPair("sdk_version", "1.0.26")
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
     * Description: 发票信息查询
     * Summary: 发票信息查询
     */
    public QueryBillingcoreInvoiceResponse queryBillingcoreInvoice(QueryBillingcoreInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBillingcoreInvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 发票信息查询
     * Summary: 发票信息查询
     */
    public QueryBillingcoreInvoiceResponse queryBillingcoreInvoiceEx(QueryBillingcoreInvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBillingcoreInvoiceResponse());
    }

    /**
     * Description: 发票地址信息查询
     * Summary: 发票地址信息查询
     */
    public QueryBillingcoreInvoicelocResponse queryBillingcoreInvoiceloc(QueryBillingcoreInvoicelocRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBillingcoreInvoicelocEx(request, headers, runtime);
    }

    /**
     * Description: 发票地址信息查询
     * Summary: 发票地址信息查询
     */
    public QueryBillingcoreInvoicelocResponse queryBillingcoreInvoicelocEx(QueryBillingcoreInvoicelocRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceloc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBillingcoreInvoicelocResponse());
    }

    /**
     * Description: 新增发票信息
     * Summary: 新增发票信息
     */
    public AddBillingcoreInvoiceResponse addBillingcoreInvoice(AddBillingcoreInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBillingcoreInvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 新增发票信息
     * Summary: 新增发票信息
     */
    public AddBillingcoreInvoiceResponse addBillingcoreInvoiceEx(AddBillingcoreInvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoice.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBillingcoreInvoiceResponse());
    }

    /**
     * Description: 更新发票信息
     * Summary: 更新发票信息
     */
    public UpdateBillingcoreInvoiceResponse updateBillingcoreInvoice(UpdateBillingcoreInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBillingcoreInvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 更新发票信息
     * Summary: 更新发票信息
     */
    public UpdateBillingcoreInvoiceResponse updateBillingcoreInvoiceEx(UpdateBillingcoreInvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBillingcoreInvoiceResponse());
    }

    /**
     * Description: 新增发票地址
     * Summary: 新增发票地址
     */
    public AddBillingcoreInvoiceaddressResponse addBillingcoreInvoiceaddress(AddBillingcoreInvoiceaddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBillingcoreInvoiceaddressEx(request, headers, runtime);
    }

    /**
     * Description: 新增发票地址
     * Summary: 新增发票地址
     */
    public AddBillingcoreInvoiceaddressResponse addBillingcoreInvoiceaddressEx(AddBillingcoreInvoiceaddressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceaddress.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBillingcoreInvoiceaddressResponse());
    }

    /**
     * Description: 更新发票地址信息
     * Summary: 更新发票地址信息
     */
    public UpdateBillingcoreInvoiceaddressResponse updateBillingcoreInvoiceaddress(UpdateBillingcoreInvoiceaddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBillingcoreInvoiceaddressEx(request, headers, runtime);
    }

    /**
     * Description: 更新发票地址信息
     * Summary: 更新发票地址信息
     */
    public UpdateBillingcoreInvoiceaddressResponse updateBillingcoreInvoiceaddressEx(UpdateBillingcoreInvoiceaddressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceaddress.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBillingcoreInvoiceaddressResponse());
    }

    /**
     * Description: 新增发票电子邮箱
     * Summary: 新增发票电子邮箱
     */
    public AddBillingcoreInvoiceemailResponse addBillingcoreInvoiceemail(AddBillingcoreInvoiceemailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBillingcoreInvoiceemailEx(request, headers, runtime);
    }

    /**
     * Description: 新增发票电子邮箱
     * Summary: 新增发票电子邮箱
     */
    public AddBillingcoreInvoiceemailResponse addBillingcoreInvoiceemailEx(AddBillingcoreInvoiceemailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceemail.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBillingcoreInvoiceemailResponse());
    }

    /**
     * Description: 更新发票电子邮箱
     * Summary: 更新发票电子邮箱
     */
    public UpdateBillingcoreInvoiceemailResponse updateBillingcoreInvoiceemail(UpdateBillingcoreInvoiceemailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBillingcoreInvoiceemailEx(request, headers, runtime);
    }

    /**
     * Description: 更新发票电子邮箱
     * Summary: 更新发票电子邮箱
     */
    public UpdateBillingcoreInvoiceemailResponse updateBillingcoreInvoiceemailEx(UpdateBillingcoreInvoiceemailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceemail.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBillingcoreInvoiceemailResponse());
    }

    /**
     * Description: 商户开票申请
     * Summary: 商户开票申请
     */
    public ApplyBillingcoreMerchantinvoiceResponse applyBillingcoreMerchantinvoice(ApplyBillingcoreMerchantinvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyBillingcoreMerchantinvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 商户开票申请
     * Summary: 商户开票申请
     */
    public ApplyBillingcoreMerchantinvoiceResponse applyBillingcoreMerchantinvoiceEx(ApplyBillingcoreMerchantinvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.merchantinvoice.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyBillingcoreMerchantinvoiceResponse());
    }

    /**
     * Description: 商户开票查询
     * Summary: 商户开票查询
     */
    public QueryBillingcoreMerchantinvoiceResponse queryBillingcoreMerchantinvoice(QueryBillingcoreMerchantinvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBillingcoreMerchantinvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 商户开票查询
     * Summary: 商户开票查询
     */
    public QueryBillingcoreMerchantinvoiceResponse queryBillingcoreMerchantinvoiceEx(QueryBillingcoreMerchantinvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.merchantinvoice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBillingcoreMerchantinvoiceResponse());
    }

    /**
     * Description: 查询服务商账单
     * Summary: 查询服务商账单
     */
    public QueryBillingcoreSpbillResponse queryBillingcoreSpbill(QueryBillingcoreSpbillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBillingcoreSpbillEx(request, headers, runtime);
    }

    /**
     * Description: 查询服务商账单
     * Summary: 查询服务商账单
     */
    public QueryBillingcoreSpbillResponse queryBillingcoreSpbillEx(QueryBillingcoreSpbillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.spbill.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBillingcoreSpbillResponse());
    }

    /**
     * Description: 分页查询服务商账单
     * Summary: 分页查询服务商账单
     */
    public PagequeryBillingcoreSpbillResponse pagequeryBillingcoreSpbill(PagequeryBillingcoreSpbillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryBillingcoreSpbillEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询服务商账单
     * Summary: 分页查询服务商账单
     */
    public PagequeryBillingcoreSpbillResponse pagequeryBillingcoreSpbillEx(PagequeryBillingcoreSpbillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.spbill.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryBillingcoreSpbillResponse());
    }

    /**
     * Description: 服务商结算申请
     * Summary: 服务商结算申请
     */
    public ApplyBillingcoreSpinvoiceResponse applyBillingcoreSpinvoice(ApplyBillingcoreSpinvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyBillingcoreSpinvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 服务商结算申请
     * Summary: 服务商结算申请
     */
    public ApplyBillingcoreSpinvoiceResponse applyBillingcoreSpinvoiceEx(ApplyBillingcoreSpinvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.billingcore.spinvoice.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyBillingcoreSpinvoiceResponse());
    }

    /**
     * Description: 查询所有类目树
     * Summary: 查询所有类目树
     */
    public AllCommercialcoreCatalogResponse allCommercialcoreCatalog(AllCommercialcoreCatalogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allCommercialcoreCatalogEx(request, headers, runtime);
    }

    /**
     * Description: 查询所有类目树
     * Summary: 查询所有类目树
     */
    public AllCommercialcoreCatalogResponse allCommercialcoreCatalogEx(AllCommercialcoreCatalogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.catalog.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllCommercialcoreCatalogResponse());
    }

    /**
     * Description: 根据类目id查询产品列表
     * Summary: 查询产品列表
     */
    public ListCommercialcoreProductResponse listCommercialcoreProduct(ListCommercialcoreProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCommercialcoreProductEx(request, headers, runtime);
    }

    /**
     * Description: 根据类目id查询产品列表
     * Summary: 查询产品列表
     */
    public ListCommercialcoreProductResponse listCommercialcoreProductEx(ListCommercialcoreProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.product.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCommercialcoreProductResponse());
    }

    /**
     * Description: 根据产品Code查询商品列表
     * Summary: 查询商品列表
     */
    public ListCommercialcoreCommodityResponse listCommercialcoreCommodity(ListCommercialcoreCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCommercialcoreCommodityEx(request, headers, runtime);
    }

    /**
     * Description: 根据产品Code查询商品列表
     * Summary: 查询商品列表
     */
    public ListCommercialcoreCommodityResponse listCommercialcoreCommodityEx(ListCommercialcoreCommodityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCommercialcoreCommodityResponse());
    }

    /**
     * Description: 根据商品code查询规格列表
     * Summary: 查询规格列表
     */
    public ListCommercialcoreSpecResponse listCommercialcoreSpec(ListCommercialcoreSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCommercialcoreSpecEx(request, headers, runtime);
    }

    /**
     * Description: 根据商品code查询规格列表
     * Summary: 查询规格列表
     */
    public ListCommercialcoreSpecResponse listCommercialcoreSpecEx(ListCommercialcoreSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCommercialcoreSpecResponse());
    }

    /**
     * Description: 根据规格code查询规格定价计划
     * Summary: 查询规格定价计划
     */
    public QueryCommercialcoreSpecResponse queryCommercialcoreSpec(QueryCommercialcoreSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCommercialcoreSpecEx(request, headers, runtime);
    }

    /**
     * Description: 根据规格code查询规格定价计划
     * Summary: 查询规格定价计划
     */
    public QueryCommercialcoreSpecResponse queryCommercialcoreSpecEx(QueryCommercialcoreSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCommercialcoreSpecResponse());
    }

    /**
     * Description: 新增产品
     * Summary: 新增产品
     */
    public AddCommercialcoreProductResponse addCommercialcoreProduct(AddCommercialcoreProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCommercialcoreProductEx(request, headers, runtime);
    }

    /**
     * Description: 新增产品
     * Summary: 新增产品
     */
    public AddCommercialcoreProductResponse addCommercialcoreProductEx(AddCommercialcoreProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.product.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCommercialcoreProductResponse());
    }

    /**
     * Description: 更新产品
     * Summary: 更新产品
     */
    public UpdateCommercialcoreProductResponse updateCommercialcoreProduct(UpdateCommercialcoreProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCommercialcoreProductEx(request, headers, runtime);
    }

    /**
     * Description: 更新产品
     * Summary: 更新产品
     */
    public UpdateCommercialcoreProductResponse updateCommercialcoreProductEx(UpdateCommercialcoreProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.product.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCommercialcoreProductResponse());
    }

    /**
     * Description: 查询产品code列表
     * Summary: 查询产品code列表
     */
    public BatchqueryCommercialcoreProductResponse batchqueryCommercialcoreProduct(BatchqueryCommercialcoreProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryCommercialcoreProductEx(request, headers, runtime);
    }

    /**
     * Description: 查询产品code列表
     * Summary: 查询产品code列表
     */
    public BatchqueryCommercialcoreProductResponse batchqueryCommercialcoreProductEx(BatchqueryCommercialcoreProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.product.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryCommercialcoreProductResponse());
    }

    /**
     * Description: 根据产品code查询产品信息
     * Summary: 查询产品
     */
    public QueryCommercialcoreProductResponse queryCommercialcoreProduct(QueryCommercialcoreProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCommercialcoreProductEx(request, headers, runtime);
    }

    /**
     * Description: 根据产品code查询产品信息
     * Summary: 查询产品
     */
    public QueryCommercialcoreProductResponse queryCommercialcoreProductEx(QueryCommercialcoreProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.product.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCommercialcoreProductResponse());
    }

    /**
     * Description: 根据产品code查询商品来源
     * Summary: 查询商品来源
     */
    public QueryCommercialcoreCommodityResponse queryCommercialcoreCommodity(QueryCommercialcoreCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCommercialcoreCommodityEx(request, headers, runtime);
    }

    /**
     * Description: 根据产品code查询商品来源
     * Summary: 查询商品来源
     */
    public QueryCommercialcoreCommodityResponse queryCommercialcoreCommodityEx(QueryCommercialcoreCommodityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCommercialcoreCommodityResponse());
    }

    /**
     * Description: 新增商品
     * Summary: 新增商品
     */
    public AddCommercialcoreCommodityResponse addCommercialcoreCommodity(AddCommercialcoreCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCommercialcoreCommodityEx(request, headers, runtime);
    }

    /**
     * Description: 新增商品
     * Summary: 新增商品
     */
    public AddCommercialcoreCommodityResponse addCommercialcoreCommodityEx(AddCommercialcoreCommodityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCommercialcoreCommodityResponse());
    }

    /**
     * Description: 更新商品
     * Summary: 更新商品
     */
    public UpdateCommercialcoreCommodityResponse updateCommercialcoreCommodity(UpdateCommercialcoreCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCommercialcoreCommodityEx(request, headers, runtime);
    }

    /**
     * Description: 更新商品
     * Summary: 更新商品
     */
    public UpdateCommercialcoreCommodityResponse updateCommercialcoreCommodityEx(UpdateCommercialcoreCommodityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCommercialcoreCommodityResponse());
    }

    /**
     * Description: 根据商品code查询规格售卖模式
     * Summary: 查询规格售卖模式
     */
    public BatchqueryCommercialcoreSpecResponse batchqueryCommercialcoreSpec(BatchqueryCommercialcoreSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryCommercialcoreSpecEx(request, headers, runtime);
    }

    /**
     * Description: 根据商品code查询规格售卖模式
     * Summary: 查询规格售卖模式
     */
    public BatchqueryCommercialcoreSpecResponse batchqueryCommercialcoreSpecEx(BatchqueryCommercialcoreSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryCommercialcoreSpecResponse());
    }

    /**
     * Description: 新增规格与定价计划
     * Summary: 新增规格与定价计划
     */
    public AddCommercialcoreSpecResponse addCommercialcoreSpec(AddCommercialcoreSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCommercialcoreSpecEx(request, headers, runtime);
    }

    /**
     * Description: 新增规格与定价计划
     * Summary: 新增规格与定价计划
     */
    public AddCommercialcoreSpecResponse addCommercialcoreSpecEx(AddCommercialcoreSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCommercialcoreSpecResponse());
    }

    /**
     * Description: 更新规格
     * Summary: 更新规格
     */
    public UpdateCommercialcoreSpecResponse updateCommercialcoreSpec(UpdateCommercialcoreSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCommercialcoreSpecEx(request, headers, runtime);
    }

    /**
     * Description: 更新规格
     * Summary: 更新规格
     */
    public UpdateCommercialcoreSpecResponse updateCommercialcoreSpecEx(UpdateCommercialcoreSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCommercialcoreSpecResponse());
    }

    /**
     * Description: 修改规格状态
     * Summary: 修改规格状态
     */
    public AuthCommercialcoreSpecResponse authCommercialcoreSpec(AuthCommercialcoreSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authCommercialcoreSpecEx(request, headers, runtime);
    }

    /**
     * Description: 修改规格状态
     * Summary: 修改规格状态
     */
    public AuthCommercialcoreSpecResponse authCommercialcoreSpecEx(AuthCommercialcoreSpecRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthCommercialcoreSpecResponse());
    }

    /**
     * Description: 产品code查重校验
     * Summary: 产品code查重校验
     */
    public CheckCommercialcoreProductResponse checkCommercialcoreProduct(CheckCommercialcoreProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCommercialcoreProductEx(request, headers, runtime);
    }

    /**
     * Description: 产品code查重校验
     * Summary: 产品code查重校验
     */
    public CheckCommercialcoreProductResponse checkCommercialcoreProductEx(CheckCommercialcoreProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.commercialcore.product.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCommercialcoreProductResponse());
    }

    /**
     * Description: 新增签约接口
     * Summary: 新增签约接口
     */
    public AddPartnercoreSignResponse addPartnercoreSign(AddPartnercoreSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPartnercoreSignEx(request, headers, runtime);
    }

    /**
     * Description: 新增签约接口
     * Summary: 新增签约接口
     */
    public AddPartnercoreSignResponse addPartnercoreSignEx(AddPartnercoreSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.partnercore.sign.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddPartnercoreSignResponse());
    }

    /**
     * Description: 政策详情查询
     * Summary: 政策详情查询
     */
    public QueryPartnercorePolicyResponse queryPartnercorePolicy(QueryPartnercorePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPartnercorePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 政策详情查询
     * Summary: 政策详情查询
     */
    public QueryPartnercorePolicyResponse queryPartnercorePolicyEx(QueryPartnercorePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.partnercore.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPartnercorePolicyResponse());
    }

    /**
     * Description: 政策分页查询
     * Summary: 政策分页查询
     */
    public PagequeryPartnercorePolicyResponse pagequeryPartnercorePolicy(PagequeryPartnercorePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryPartnercorePolicyEx(request, headers, runtime);
    }

    /**
     * Description: 政策分页查询
     * Summary: 政策分页查询
     */
    public PagequeryPartnercorePolicyResponse pagequeryPartnercorePolicyEx(PagequeryPartnercorePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.partnercore.policy.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryPartnercorePolicyResponse());
    }

    /**
     * Description: 签约信息查询
     * Summary: 签约信息查询
     */
    public QueryPartnercoreSignResponse queryPartnercoreSign(QueryPartnercoreSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPartnercoreSignEx(request, headers, runtime);
    }

    /**
     * Description: 签约信息查询
     * Summary: 签约信息查询
     */
    public QueryPartnercoreSignResponse queryPartnercoreSignEx(QueryPartnercoreSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.partnercore.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPartnercoreSignResponse());
    }

    /**
     * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
     * Summary: 批量获取商户已购规格实例信息-控制台用
     */
    public BatchqueryTradecorePaidspecinstanceResponse batchqueryTradecorePaidspecinstance(BatchqueryTradecorePaidspecinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTradecorePaidspecinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
     * Summary: 批量获取商户已购规格实例信息-控制台用
     */
    public BatchqueryTradecorePaidspecinstanceResponse batchqueryTradecorePaidspecinstanceEx(BatchqueryTradecorePaidspecinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.paidspecinstance.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTradecorePaidspecinstanceResponse());
    }

    /**
     * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
     * Summary: 获取已售给商户的规格实例信息-开发商用 
     */
    public BatchqueryTradecoreSoldspecinstanceResponse batchqueryTradecoreSoldspecinstance(BatchqueryTradecoreSoldspecinstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryTradecoreSoldspecinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
     * Summary: 获取已售给商户的规格实例信息-开发商用 
     */
    public BatchqueryTradecoreSoldspecinstanceResponse batchqueryTradecoreSoldspecinstanceEx(BatchqueryTradecoreSoldspecinstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.soldspecinstance.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryTradecoreSoldspecinstanceResponse());
    }

    /**
     * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
     * Summary: 获取商户信息-开发商用
     */
    public QueryTradecoreMerchantinfoResponse queryTradecoreMerchantinfo(QueryTradecoreMerchantinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTradecoreMerchantinfoEx(request, headers, runtime);
    }

    /**
     * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
     * Summary: 获取商户信息-开发商用
     */
    public QueryTradecoreMerchantinfoResponse queryTradecoreMerchantinfoEx(QueryTradecoreMerchantinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.merchantinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTradecoreMerchantinfoResponse());
    }

    /**
     * Description: 创建支付单，调用支付宝接口获取收银台触发表单
     * Summary: 支付创建
     */
    public CreateTradecorePayResponse createTradecorePay(CreateTradecorePayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTradecorePayEx(request, headers, runtime);
    }

    /**
     * Description: 创建支付单，调用支付宝接口获取收银台触发表单
     * Summary: 支付创建
     */
    public CreateTradecorePayResponse createTradecorePayEx(CreateTradecorePayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.pay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTradecorePayResponse());
    }

    /**
     * Description: 支付宝支付结果回调
     * Summary: 支付结果回调
     */
    public ReceiveTradecorePayResponse receiveTradecorePay(ReceiveTradecorePayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveTradecorePayEx(request, headers, runtime);
    }

    /**
     * Description: 支付宝支付结果回调
     * Summary: 支付结果回调
     */
    public ReceiveTradecorePayResponse receiveTradecorePayEx(ReceiveTradecorePayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.pay.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveTradecorePayResponse());
    }

    /**
     * Description: 订单取消
     * Summary: 订单取消
     */
    public CancelTradecoreOrderResponse cancelTradecoreOrder(CancelTradecoreOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTradecoreOrderEx(request, headers, runtime);
    }

    /**
     * Description: 订单取消
     * Summary: 订单取消
     */
    public CancelTradecoreOrderResponse cancelTradecoreOrderEx(CancelTradecoreOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.order.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelTradecoreOrderResponse());
    }

    /**
     * Description: 订单创建
     * Summary: 订单创建
     */
    public CreateTradecoreOrderResponse createTradecoreOrder(CreateTradecoreOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTradecoreOrderEx(request, headers, runtime);
    }

    /**
     * Description: 订单创建
     * Summary: 订单创建
     */
    public CreateTradecoreOrderResponse createTradecoreOrderEx(CreateTradecoreOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTradecoreOrderResponse());
    }

    /**
     * Description: 订单查询
     * Summary: 订单查询
     */
    public QueryTradecoreOrderResponse queryTradecoreOrder(QueryTradecoreOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTradecoreOrderEx(request, headers, runtime);
    }

    /**
     * Description: 订单查询
     * Summary: 订单查询
     */
    public QueryTradecoreOrderResponse queryTradecoreOrderEx(QueryTradecoreOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTradecoreOrderResponse());
    }

    /**
     * Description: 订单分页查询
     * Summary: 订单分页查询
     */
    public PagequeryTradecoreOrderResponse pagequeryTradecoreOrder(PagequeryTradecoreOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTradecoreOrderEx(request, headers, runtime);
    }

    /**
     * Description: 订单分页查询
     * Summary: 订单分页查询
     */
    public PagequeryTradecoreOrderResponse pagequeryTradecoreOrderEx(PagequeryTradecoreOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.order.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTradecoreOrderResponse());
    }

    /**
     * Description: 服务商信息校验
     * Summary: 服务商信息校验
     */
    public CheckTradecoreSpResponse checkTradecoreSp(CheckTradecoreSpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkTradecoreSpEx(request, headers, runtime);
    }

    /**
     * Description: 服务商信息校验
     * Summary: 服务商信息校验
     */
    public CheckTradecoreSpResponse checkTradecoreSpEx(CheckTradecoreSpRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.commercial.tradecore.sp.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckTradecoreSpResponse());
    }
}
