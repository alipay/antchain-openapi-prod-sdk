// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetConsumecardCommissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
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

    // 手续费支出方（0.卖家，1.买家，2.平台）
    @NameInMap("pay_commission_type")
    @Validation(required = true)
    public String payCommissionType;

    // 手续费一级分账。最长为6条
    @NameInMap("commission_rules")
    @Validation(required = true)
    public java.util.List<CommissionRule> commissionRules;

    public static SetConsumecardCommissionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumecardCommissionRequest self = new SetConsumecardCommissionRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumecardCommissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumecardCommissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumecardCommissionRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public SetConsumecardCommissionRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public SetConsumecardCommissionRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public SetConsumecardCommissionRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SetConsumecardCommissionRequest setPayCommissionType(String payCommissionType) {
        this.payCommissionType = payCommissionType;
        return this;
    }
    public String getPayCommissionType() {
        return this.payCommissionType;
    }

    public SetConsumecardCommissionRequest setCommissionRules(java.util.List<CommissionRule> commissionRules) {
        this.commissionRules = commissionRules;
        return this;
    }
    public java.util.List<CommissionRule> getCommissionRules() {
        return this.commissionRules;
    }

}
