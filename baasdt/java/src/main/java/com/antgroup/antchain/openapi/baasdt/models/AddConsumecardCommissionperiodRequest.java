// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class AddConsumecardCommissionperiodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础结构体
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

    // 手续费归属的账户id,如果type为0 ，则该字段必须为空
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 一级分账方
    @NameInMap("rule_account_id")
    @Validation(required = true)
    public String ruleAccountId;

    // 手续费周期
    @NameInMap("commission_period")
    @Validation(required = true)
    public CommissionPeriod commissionPeriod;

    public static AddConsumecardCommissionperiodRequest build(java.util.Map<String, ?> map) throws Exception {
        AddConsumecardCommissionperiodRequest self = new AddConsumecardCommissionperiodRequest();
        return TeaModel.build(map, self);
    }

    public AddConsumecardCommissionperiodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddConsumecardCommissionperiodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddConsumecardCommissionperiodRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public AddConsumecardCommissionperiodRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public AddConsumecardCommissionperiodRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public AddConsumecardCommissionperiodRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AddConsumecardCommissionperiodRequest setRuleAccountId(String ruleAccountId) {
        this.ruleAccountId = ruleAccountId;
        return this;
    }
    public String getRuleAccountId() {
        return this.ruleAccountId;
    }

    public AddConsumecardCommissionperiodRequest setCommissionPeriod(CommissionPeriod commissionPeriod) {
        this.commissionPeriod = commissionPeriod;
        return this;
    }
    public CommissionPeriod getCommissionPeriod() {
        return this.commissionPeriod;
    }

}
