// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerCustomerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 公司社会统一信息代码,间联模式必传
    @NameInMap("merchant_id")
    public String merchantId;

    // 公司名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 处理类型:
    // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
    // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
    @NameInMap("process_type")
    @Validation(required = true)
    public String processType;

    // 服务商名称（已废弃）
    @NameInMap("service_provider_name")
    public String serviceProviderName;

    // 客服电话
    @NameInMap("customer_service_phone")
    @Validation(required = true)
    public String customerServicePhone;

    // 客诉处理员支付宝绑定手机号（已废弃）
    @NameInMap("alipay_bind_mobile")
    public String alipayBindMobile;

    // 客诉处理员支付宝账号（已废弃）
    @NameInMap("alipay_logon_id")
    public String alipayLogonId;

    // 客服人员名称（已废弃）
    @NameInMap("customer_service_name")
    public String customerServiceName;

    // 在线客服网址
    @NameInMap("online_support_site_url")
    public String onlineSupportSiteUrl;

    // 投诉问题
    @NameInMap("customer_complaint_issues")
    public String customerComplaintIssues;

    // 客诉人员信息，直连必填
    @NameInMap("customer_person_info_list")
    public java.util.List<CustomerPersonInfo> customerPersonInfoList;

    // 进件类型
    // DIRECT("DIRECT", "直连进件模式"),
    // AGENT("AGENT", "代理商进件模式"),
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    public static CreateInnerCustomerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerCustomerserviceRequest self = new CreateInnerCustomerserviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerCustomerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerCustomerserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerCustomerserviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerCustomerserviceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateInnerCustomerserviceRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateInnerCustomerserviceRequest setProcessType(String processType) {
        this.processType = processType;
        return this;
    }
    public String getProcessType() {
        return this.processType;
    }

    public CreateInnerCustomerserviceRequest setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
        return this;
    }
    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

    public CreateInnerCustomerserviceRequest setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
        return this;
    }
    public String getCustomerServicePhone() {
        return this.customerServicePhone;
    }

    public CreateInnerCustomerserviceRequest setAlipayBindMobile(String alipayBindMobile) {
        this.alipayBindMobile = alipayBindMobile;
        return this;
    }
    public String getAlipayBindMobile() {
        return this.alipayBindMobile;
    }

    public CreateInnerCustomerserviceRequest setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public CreateInnerCustomerserviceRequest setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
        return this;
    }
    public String getCustomerServiceName() {
        return this.customerServiceName;
    }

    public CreateInnerCustomerserviceRequest setOnlineSupportSiteUrl(String onlineSupportSiteUrl) {
        this.onlineSupportSiteUrl = onlineSupportSiteUrl;
        return this;
    }
    public String getOnlineSupportSiteUrl() {
        return this.onlineSupportSiteUrl;
    }

    public CreateInnerCustomerserviceRequest setCustomerComplaintIssues(String customerComplaintIssues) {
        this.customerComplaintIssues = customerComplaintIssues;
        return this;
    }
    public String getCustomerComplaintIssues() {
        return this.customerComplaintIssues;
    }

    public CreateInnerCustomerserviceRequest setCustomerPersonInfoList(java.util.List<CustomerPersonInfo> customerPersonInfoList) {
        this.customerPersonInfoList = customerPersonInfoList;
        return this;
    }
    public java.util.List<CustomerPersonInfo> getCustomerPersonInfoList() {
        return this.customerPersonInfoList;
    }

    public CreateInnerCustomerserviceRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

}
