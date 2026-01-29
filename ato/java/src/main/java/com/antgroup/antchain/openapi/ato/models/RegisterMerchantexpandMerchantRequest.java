// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RegisterMerchantexpandMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公司信息
    @NameInMap("company_info")
    @Validation(required = true)
    public CompanyInfo companyInfo;

    // 法人信息
    @NameInMap("legal_info")
    @Validation(required = true)
    public LegalInfo legalInfo;

    // 应用信息
    @NameInMap("application_info")
    public ApplicationInfo applicationInfo;

    // 进件模式 DIRECT(直连进件) AGENT(代理进件)
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    // expand_mode=_AGENT_ 必填
    @NameInMap("sub_tenant_id")
    public String subTenantId;

    // 京东商家控股信息
    @NameInMap("merchant_holding_info")
    public MerchantHoldingInfo merchantHoldingInfo;

    // 京东商家结算信息
    @NameInMap("merchant_settle_info")
    public MerchantSettleInfo merchantSettleInfo;

    // 支付渠道
    // ALIPAY（默认）
    // JDPAY
    @NameInMap("pay_channel")
    public String payChannel;

    // 角色
    // MERCHANT（默认）
    // FINANCIER
    @NameInMap("role")
    public String role;

    public static RegisterMerchantexpandMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMerchantexpandMerchantRequest self = new RegisterMerchantexpandMerchantRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMerchantexpandMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterMerchantexpandMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterMerchantexpandMerchantRequest setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public CompanyInfo getCompanyInfo() {
        return this.companyInfo;
    }

    public RegisterMerchantexpandMerchantRequest setLegalInfo(LegalInfo legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public RegisterMerchantexpandMerchantRequest setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public RegisterMerchantexpandMerchantRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

    public RegisterMerchantexpandMerchantRequest setSubTenantId(String subTenantId) {
        this.subTenantId = subTenantId;
        return this;
    }
    public String getSubTenantId() {
        return this.subTenantId;
    }

    public RegisterMerchantexpandMerchantRequest setMerchantHoldingInfo(MerchantHoldingInfo merchantHoldingInfo) {
        this.merchantHoldingInfo = merchantHoldingInfo;
        return this;
    }
    public MerchantHoldingInfo getMerchantHoldingInfo() {
        return this.merchantHoldingInfo;
    }

    public RegisterMerchantexpandMerchantRequest setMerchantSettleInfo(MerchantSettleInfo merchantSettleInfo) {
        this.merchantSettleInfo = merchantSettleInfo;
        return this;
    }
    public MerchantSettleInfo getMerchantSettleInfo() {
        return this.merchantSettleInfo;
    }

    public RegisterMerchantexpandMerchantRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public RegisterMerchantexpandMerchantRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
