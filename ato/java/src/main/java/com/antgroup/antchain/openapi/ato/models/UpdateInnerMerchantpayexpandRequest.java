// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerMerchantpayexpandRequest extends TeaModel {
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

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 操作人名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static UpdateInnerMerchantpayexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerMerchantpayexpandRequest self = new UpdateInnerMerchantpayexpandRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerMerchantpayexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInnerMerchantpayexpandRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInnerMerchantpayexpandRequest setCompanyInfo(CompanyInfoUpdate companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public CompanyInfoUpdate getCompanyInfo() {
        return this.companyInfo;
    }

    public UpdateInnerMerchantpayexpandRequest setLegalInfo(LegalInfoUpdate legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfoUpdate getLegalInfo() {
        return this.legalInfo;
    }

    public UpdateInnerMerchantpayexpandRequest setApplicationInfo(ApplicationInfoUpdate applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfoUpdate getApplicationInfo() {
        return this.applicationInfo;
    }

    public UpdateInnerMerchantpayexpandRequest setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public UpdateInnerMerchantpayexpandRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateInnerMerchantpayexpandRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInnerMerchantpayexpandRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
