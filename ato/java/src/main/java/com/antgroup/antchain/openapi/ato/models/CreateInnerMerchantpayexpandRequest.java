// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerMerchantpayexpandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

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
    @Validation(required = true)
    public ApplicationInfo applicationInfo;

    // 是否直接提交
    // SUBMITTED 直接提交
    // STAGE 暂存
    @NameInMap("submit")
    @Validation(required = true)
    public String submit;

    // 进件模式
    // DIRECT(直连进件)
    // AGENT(代理进件)
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    // expand_mode=_AGENT_ 必填
    @NameInMap("sub_tenant_id")
    public String subTenantId;

    // 操作人名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 第一次暂存或保存可以不传，后端直接生成
    @NameInMap("pay_expand_id")
    public String payExpandId;

    // true允许重复进件，false不允许重复进件
    @NameInMap("allow_duplicate")
    public Boolean allowDuplicate;

    public static CreateInnerMerchantpayexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerMerchantpayexpandRequest self = new CreateInnerMerchantpayexpandRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerMerchantpayexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerMerchantpayexpandRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerMerchantpayexpandRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerMerchantpayexpandRequest setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public CompanyInfo getCompanyInfo() {
        return this.companyInfo;
    }

    public CreateInnerMerchantpayexpandRequest setLegalInfo(LegalInfo legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public CreateInnerMerchantpayexpandRequest setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public CreateInnerMerchantpayexpandRequest setSubmit(String submit) {
        this.submit = submit;
        return this;
    }
    public String getSubmit() {
        return this.submit;
    }

    public CreateInnerMerchantpayexpandRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

    public CreateInnerMerchantpayexpandRequest setSubTenantId(String subTenantId) {
        this.subTenantId = subTenantId;
        return this;
    }
    public String getSubTenantId() {
        return this.subTenantId;
    }

    public CreateInnerMerchantpayexpandRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateInnerMerchantpayexpandRequest setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public CreateInnerMerchantpayexpandRequest setAllowDuplicate(Boolean allowDuplicate) {
        this.allowDuplicate = allowDuplicate;
        return this;
    }
    public Boolean getAllowDuplicate() {
        return this.allowDuplicate;
    }

}
