// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class AddConsumecardCommissionpartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求对象
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 收费规则归属方
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 手续费规则
    @NameInMap("commission_rule")
    @Validation(required = true)
    public CommissionRule commissionRule;

    // 手续费类型（0:全局，1:商户）
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 分类id（ffaaaaabbbbbb）
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    public static AddConsumecardCommissionpartyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddConsumecardCommissionpartyRequest self = new AddConsumecardCommissionpartyRequest();
        return TeaModel.build(map, self);
    }

    public AddConsumecardCommissionpartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddConsumecardCommissionpartyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddConsumecardCommissionpartyRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public AddConsumecardCommissionpartyRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AddConsumecardCommissionpartyRequest setCommissionRule(CommissionRule commissionRule) {
        this.commissionRule = commissionRule;
        return this;
    }
    public CommissionRule getCommissionRule() {
        return this.commissionRule;
    }

    public AddConsumecardCommissionpartyRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public AddConsumecardCommissionpartyRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

}
