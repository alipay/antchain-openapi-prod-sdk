// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyRbbCompanyCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称、统一社会信用代码
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    // 规则ID，需提前在蚁盾中进行配置
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    // 额外参数，与规则有关
    @NameInMap("params")
    public String params;

    public static ApplyRbbCompanyCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRbbCompanyCreditRequest self = new ApplyRbbCompanyCreditRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRbbCompanyCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyRbbCompanyCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyRbbCompanyCreditRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ApplyRbbCompanyCreditRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ApplyRbbCompanyCreditRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
