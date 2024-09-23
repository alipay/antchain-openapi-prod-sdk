// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFunddividerelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 分页查询对象
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // 商户公司社会统一信用代码
    @NameInMap("subject_merchant_id")
    public String subjectMerchantId;

    // 商户公司名称
    @NameInMap("subject_company_name")
    public String subjectCompanyName;

    // 状态
    // NIT:待提交 
    // AUDIT:审批中 AUDIT_PASSED:审批通过
    // AUDIT_NOT_PASSED:审批不通过
    @NameInMap("status")
    public String status;

    public static PagequeryInnerFunddividerelationRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFunddividerelationRequest self = new PagequeryInnerFunddividerelationRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFunddividerelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerFunddividerelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerFunddividerelationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerFunddividerelationRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerFunddividerelationRequest setSubjectMerchantId(String subjectMerchantId) {
        this.subjectMerchantId = subjectMerchantId;
        return this;
    }
    public String getSubjectMerchantId() {
        return this.subjectMerchantId;
    }

    public PagequeryInnerFunddividerelationRequest setSubjectCompanyName(String subjectCompanyName) {
        this.subjectCompanyName = subjectCompanyName;
        return this;
    }
    public String getSubjectCompanyName() {
        return this.subjectCompanyName;
    }

    public PagequeryInnerFunddividerelationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
