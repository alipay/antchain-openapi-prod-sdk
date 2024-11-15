// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class BusinessRule extends TeaModel {
    // 规则类型（BUSINESS/INSTANCE/TENANT_WHITELIST）
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // 规则项列表
    @NameInMap("rule_items")
    @Validation(required = true)
    public java.util.List<BusinessRuleItem> ruleItems;

    public static BusinessRule build(java.util.Map<String, ?> map) throws Exception {
        BusinessRule self = new BusinessRule();
        return TeaModel.build(map, self);
    }

    public BusinessRule setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public BusinessRule setRuleItems(java.util.List<BusinessRuleItem> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }
    public java.util.List<BusinessRuleItem> getRuleItems() {
        return this.ruleItems;
    }

}
