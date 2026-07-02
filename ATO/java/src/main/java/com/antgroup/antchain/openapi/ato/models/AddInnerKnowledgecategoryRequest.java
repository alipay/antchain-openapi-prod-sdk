// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AddInnerKnowledgecategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 问题
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 答案
    @NameInMap("answer")
    @Validation(required = true)
    public String answer;

    // 是否选择订单
    @NameInMap("has_order")
    public Boolean hasOrder;

    // 是否带小程序跳转链接
    @NameInMap("has_app_link")
    public Boolean hasAppLink;

    // 是否转人工
    @NameInMap("has_manual")
    public Boolean hasManual;

    public static AddInnerKnowledgecategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInnerKnowledgecategoryRequest self = new AddInnerKnowledgecategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddInnerKnowledgecategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddInnerKnowledgecategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddInnerKnowledgecategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddInnerKnowledgecategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddInnerKnowledgecategoryRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public AddInnerKnowledgecategoryRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public AddInnerKnowledgecategoryRequest setHasOrder(Boolean hasOrder) {
        this.hasOrder = hasOrder;
        return this;
    }
    public Boolean getHasOrder() {
        return this.hasOrder;
    }

    public AddInnerKnowledgecategoryRequest setHasAppLink(Boolean hasAppLink) {
        this.hasAppLink = hasAppLink;
        return this;
    }
    public Boolean getHasAppLink() {
        return this.hasAppLink;
    }

    public AddInnerKnowledgecategoryRequest setHasManual(Boolean hasManual) {
        this.hasManual = hasManual;
        return this;
    }
    public Boolean getHasManual() {
        return this.hasManual;
    }

}
