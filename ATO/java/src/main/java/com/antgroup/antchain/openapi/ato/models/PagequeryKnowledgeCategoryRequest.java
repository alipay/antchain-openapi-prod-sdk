// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryKnowledgeCategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 类型
    @NameInMap("type")
    public String type;

    // 问题
    @NameInMap("question")
    public String question;

    // 状态
    @NameInMap("status")
    public String status;

    // 分页信息
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    public static PagequeryKnowledgeCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryKnowledgeCategoryRequest self = new PagequeryKnowledgeCategoryRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryKnowledgeCategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryKnowledgeCategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryKnowledgeCategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryKnowledgeCategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PagequeryKnowledgeCategoryRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public PagequeryKnowledgeCategoryRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryKnowledgeCategoryRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
