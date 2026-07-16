// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryIcmInvoicecontinuedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 纳税人识别号
    @NameInMap("nsrsbh")
    @Validation(required = true)
    public String nsrsbh;

    // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 数据通知地址接口 ，用于数据采集完毕后通知该接口如何取发票数据，也可以通过后台指定配置
    @NameInMap("callback_url")
    public String callbackUrl;

    // 贷款期限，格式:yyyy-MM-dd，不晚于当前时间，包含贷款截止日期当天
    @NameInMap("credit_term")
    @Validation(required = true)
    public String creditTerm;

    public static QueryIcmInvoicecontinuedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIcmInvoicecontinuedRequest self = new QueryIcmInvoicecontinuedRequest();
        return TeaModel.build(map, self);
    }

    public QueryIcmInvoicecontinuedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIcmInvoicecontinuedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIcmInvoicecontinuedRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryIcmInvoicecontinuedRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryIcmInvoicecontinuedRequest setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
        return this;
    }
    public String getNsrsbh() {
        return this.nsrsbh;
    }

    public QueryIcmInvoicecontinuedRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIcmInvoicecontinuedRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public QueryIcmInvoicecontinuedRequest setCreditTerm(String creditTerm) {
        this.creditTerm = creditTerm;
        return this;
    }
    public String getCreditTerm() {
        return this.creditTerm;
    }

}
