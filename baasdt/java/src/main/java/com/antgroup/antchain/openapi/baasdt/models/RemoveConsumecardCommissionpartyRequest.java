// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class RemoveConsumecardCommissionpartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求结构
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 分类id（ffaaaaabbbbbb）
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 手续费类型（0:全局，1:商户）
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 一级分账方accountId
    @NameInMap("rule_account_id")
    @Validation(required = true)
    public String ruleAccountId;

    // 手续费归属的账户id,如果type为0 ，则该字段必须为空
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static RemoveConsumecardCommissionpartyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveConsumecardCommissionpartyRequest self = new RemoveConsumecardCommissionpartyRequest();
        return TeaModel.build(map, self);
    }

    public RemoveConsumecardCommissionpartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveConsumecardCommissionpartyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RemoveConsumecardCommissionpartyRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public RemoveConsumecardCommissionpartyRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public RemoveConsumecardCommissionpartyRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public RemoveConsumecardCommissionpartyRequest setRuleAccountId(String ruleAccountId) {
        this.ruleAccountId = ruleAccountId;
        return this;
    }
    public String getRuleAccountId() {
        return this.ruleAccountId;
    }

    public RemoveConsumecardCommissionpartyRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
