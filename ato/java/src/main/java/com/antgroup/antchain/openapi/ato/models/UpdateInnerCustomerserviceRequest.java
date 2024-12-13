// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerCustomerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商家社会统一信用代码，间联模式必传
    @NameInMap("merchant_id")
    public String merchantId;

    // 公司名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 处理类型:
    // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
    // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
    @NameInMap("process_type")
    @Validation(required = true)
    public String processType;

    // 服务商名称
    @NameInMap("service_provider_name")
    public String serviceProviderName;

    // 客诉处理员支付宝绑定手机号
    @NameInMap("alipay_bind_mobile")
    @Validation(required = true)
    public String alipayBindMobile;

    // 客诉处理员支付宝账号
    @NameInMap("alipay_logon_id")
    @Validation(required = true)
    public String alipayLogonId;

    // 客服电话
    @NameInMap("customer_service_phone")
    @Validation(required = true)
    public String customerServicePhone;

    // 客服人员名称
    @NameInMap("customer_service_name")
    @Validation(required = true)
    public String customerServiceName;

    // 在线客服网址
    @NameInMap("online_support_site_url")
    public String onlineSupportSiteUrl;

    // 投诉问题
    @NameInMap("customer_complaint_issues")
    @Validation(required = true)
    public String customerComplaintIssues;

    // 进件类型 
    // DIRECT("DIRECT", "直连进件模式"), AGENT("AGENT", "代理商进件模式"),
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    public static UpdateInnerCustomerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerCustomerserviceRequest self = new UpdateInnerCustomerserviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerCustomerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInnerCustomerserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInnerCustomerserviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInnerCustomerserviceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateInnerCustomerserviceRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public UpdateInnerCustomerserviceRequest setProcessType(String processType) {
        this.processType = processType;
        return this;
    }
    public String getProcessType() {
        return this.processType;
    }

    public UpdateInnerCustomerserviceRequest setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
        return this;
    }
    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

    public UpdateInnerCustomerserviceRequest setAlipayBindMobile(String alipayBindMobile) {
        this.alipayBindMobile = alipayBindMobile;
        return this;
    }
    public String getAlipayBindMobile() {
        return this.alipayBindMobile;
    }

    public UpdateInnerCustomerserviceRequest setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public UpdateInnerCustomerserviceRequest setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
        return this;
    }
    public String getCustomerServicePhone() {
        return this.customerServicePhone;
    }

    public UpdateInnerCustomerserviceRequest setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
        return this;
    }
    public String getCustomerServiceName() {
        return this.customerServiceName;
    }

    public UpdateInnerCustomerserviceRequest setOnlineSupportSiteUrl(String onlineSupportSiteUrl) {
        this.onlineSupportSiteUrl = onlineSupportSiteUrl;
        return this;
    }
    public String getOnlineSupportSiteUrl() {
        return this.onlineSupportSiteUrl;
    }

    public UpdateInnerCustomerserviceRequest setCustomerComplaintIssues(String customerComplaintIssues) {
        this.customerComplaintIssues = customerComplaintIssues;
        return this;
    }
    public String getCustomerComplaintIssues() {
        return this.customerComplaintIssues;
    }

    public UpdateInnerCustomerserviceRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

}
