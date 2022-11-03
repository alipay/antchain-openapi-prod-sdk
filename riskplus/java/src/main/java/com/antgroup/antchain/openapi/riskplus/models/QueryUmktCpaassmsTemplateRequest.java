// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktCpaassmsTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 短信类型
    @NameInMap("sms_type")
    @Validation(required = true)
    public String smsType;

    // 行业标签
    @NameInMap("tenant_industry")
    @Validation(required = true)
    public String tenantIndustry;

    // 审批状态
    @NameInMap("status")
    public String status;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页记录数量
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryUmktCpaassmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktCpaassmsTemplateRequest self = new QueryUmktCpaassmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktCpaassmsTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktCpaassmsTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktCpaassmsTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryUmktCpaassmsTemplateRequest setSmsType(String smsType) {
        this.smsType = smsType;
        return this;
    }
    public String getSmsType() {
        return this.smsType;
    }

    public QueryUmktCpaassmsTemplateRequest setTenantIndustry(String tenantIndustry) {
        this.tenantIndustry = tenantIndustry;
        return this;
    }
    public String getTenantIndustry() {
        return this.tenantIndustry;
    }

    public QueryUmktCpaassmsTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryUmktCpaassmsTemplateRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryUmktCpaassmsTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
