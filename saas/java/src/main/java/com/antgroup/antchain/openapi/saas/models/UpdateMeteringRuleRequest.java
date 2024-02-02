// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class UpdateMeteringRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 技术产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 商业产品码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 方法匹配规则
    @NameInMap("method_matching_rules")
    @Validation(required = true)
    public java.util.List<MethodMatchingRule> methodMatchingRules;

    public static UpdateMeteringRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeteringRuleRequest self = new UpdateMeteringRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeteringRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeteringRuleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeteringRuleRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpdateMeteringRuleRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public UpdateMeteringRuleRequest setMethodMatchingRules(java.util.List<MethodMatchingRule> methodMatchingRules) {
        this.methodMatchingRules = methodMatchingRules;
        return this;
    }
    public java.util.List<MethodMatchingRule> getMethodMatchingRules() {
        return this.methodMatchingRules;
    }

}
