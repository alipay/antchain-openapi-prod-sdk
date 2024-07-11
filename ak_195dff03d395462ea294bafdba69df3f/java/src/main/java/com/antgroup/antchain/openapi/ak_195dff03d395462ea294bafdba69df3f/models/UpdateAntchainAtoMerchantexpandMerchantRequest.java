// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class UpdateAntchainAtoMerchantexpandMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公司信息
    @NameInMap("company_info")
    @Validation(required = true)
    public CompanyInfoUpdate companyInfo;

    // 法人信息
    @NameInMap("legal_info")
    @Validation(required = true)
    public LegalInfo legalInfo;

    // 应用信息
    @NameInMap("application_info")
    @Validation(required = true)
    public ApplicationInfo applicationInfo;

    // 进件模式 DIRECT(直连进件) AGENT(代理进件)
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    // expand_mode=_AGENT_ 必填
    @NameInMap("sub_tenant_id")
    public String subTenantId;

    // 进件流水号
    @NameInMap("pay_expand_id")
    @Validation(required = true)
    public String payExpandId;

    public static UpdateAntchainAtoMerchantexpandMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntchainAtoMerchantexpandMerchantRequest self = new UpdateAntchainAtoMerchantexpandMerchantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setCompanyInfo(CompanyInfoUpdate companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public CompanyInfoUpdate getCompanyInfo() {
        return this.companyInfo;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setLegalInfo(LegalInfo legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setSubTenantId(String subTenantId) {
        this.subTenantId = subTenantId;
        return this;
    }
    public String getSubTenantId() {
        return this.subTenantId;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

}
