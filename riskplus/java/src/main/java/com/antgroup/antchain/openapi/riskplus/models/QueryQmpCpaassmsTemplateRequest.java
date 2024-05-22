// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpCpaassmsTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

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

    public static QueryQmpCpaassmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpCpaassmsTemplateRequest self = new QueryQmpCpaassmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryQmpCpaassmsTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQmpCpaassmsTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryQmpCpaassmsTemplateRequest setSmsType(String smsType) {
        this.smsType = smsType;
        return this;
    }
    public String getSmsType() {
        return this.smsType;
    }

    public QueryQmpCpaassmsTemplateRequest setTenantIndustry(String tenantIndustry) {
        this.tenantIndustry = tenantIndustry;
        return this;
    }
    public String getTenantIndustry() {
        return this.tenantIndustry;
    }

    public QueryQmpCpaassmsTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryQmpCpaassmsTemplateRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryQmpCpaassmsTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
