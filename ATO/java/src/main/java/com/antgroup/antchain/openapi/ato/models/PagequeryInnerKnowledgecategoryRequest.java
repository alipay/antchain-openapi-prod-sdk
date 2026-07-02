// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerKnowledgecategoryRequest extends TeaModel {
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
    @Validation(required = true)
    public String type;

    // 问题
    @NameInMap("question")
    public String question;

    // 状态	
    @NameInMap("status")
    public String status;

    // 分页信息
    // 
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    public static PagequeryInnerKnowledgecategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerKnowledgecategoryRequest self = new PagequeryInnerKnowledgecategoryRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerKnowledgecategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerKnowledgecategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerKnowledgecategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerKnowledgecategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PagequeryInnerKnowledgecategoryRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public PagequeryInnerKnowledgecategoryRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryInnerKnowledgecategoryRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
