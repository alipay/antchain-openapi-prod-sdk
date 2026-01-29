// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerMerchantbasicinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
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

    // 流水号（编辑时需要提交）
    @NameInMap("biz_id")
    public String bizId;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static SubmitInnerMerchantbasicinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerMerchantbasicinfoRequest self = new SubmitInnerMerchantbasicinfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerMerchantbasicinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerMerchantbasicinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerMerchantbasicinfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerMerchantbasicinfoRequest setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public CompanyInfo getCompanyInfo() {
        return this.companyInfo;
    }

    public SubmitInnerMerchantbasicinfoRequest setLegalInfo(LegalInfo legalInfo) {
        this.legalInfo = legalInfo;
        return this;
    }
    public LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public SubmitInnerMerchantbasicinfoRequest setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public SubmitInnerMerchantbasicinfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitInnerMerchantbasicinfoRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
