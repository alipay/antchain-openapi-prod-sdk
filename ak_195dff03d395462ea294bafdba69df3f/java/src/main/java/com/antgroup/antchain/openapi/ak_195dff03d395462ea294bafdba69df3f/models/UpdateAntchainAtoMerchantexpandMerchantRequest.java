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
    public LegalInfoUpdate legalInfo;

    // 应用信息
    @NameInMap("application_info")
    @Validation(required = true)
    public ApplicationInfoUpdate applicationInfo;

    // 进件流水号
    @NameInMap("pay_expand_id")
    @Validation(required = true)
    public String payExpandId;

    // 社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

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

    public UpdateAntchainAtoMerchantexpandMerchantRequest setLegalInfo(LegalInfoUpdate legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfoUpdate getLegalInfo() {
        return this.legalInfo;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setApplicationInfo(ApplicationInfoUpdate applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfoUpdate getApplicationInfo() {
        return this.applicationInfo;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public UpdateAntchainAtoMerchantexpandMerchantRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
