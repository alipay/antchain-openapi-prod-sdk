// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class RemoveConsumecardCommissionperiodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求对象
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 商品分类id（ffaaaaabbbbbb）
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 手续费归属的账户id,如果type为0 ，则该字段必须为空
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 一级分账方
    @NameInMap("rule_account_id")
    @Validation(required = true)
    public String ruleAccountId;

    // 手续费类型（0:全局，1:商户）
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 手续费开始时间,用于查找去除的手续费（无结束时间）
    @NameInMap("start_time_mills")
    @Validation(required = true)
    public Long startTimeMills;

    public static RemoveConsumecardCommissionperiodRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveConsumecardCommissionperiodRequest self = new RemoveConsumecardCommissionperiodRequest();
        return TeaModel.build(map, self);
    }

    public RemoveConsumecardCommissionperiodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveConsumecardCommissionperiodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RemoveConsumecardCommissionperiodRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public RemoveConsumecardCommissionperiodRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public RemoveConsumecardCommissionperiodRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public RemoveConsumecardCommissionperiodRequest setRuleAccountId(String ruleAccountId) {
        this.ruleAccountId = ruleAccountId;
        return this;
    }
    public String getRuleAccountId() {
        return this.ruleAccountId;
    }

    public RemoveConsumecardCommissionperiodRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public RemoveConsumecardCommissionperiodRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

}
