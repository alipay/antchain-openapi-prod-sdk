// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class BusinessRuleItem extends TeaModel {
    // 规则表达式
    @NameInMap("condition")
    @Validation(required = true)
    public String condition;

    // 规则值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static BusinessRuleItem build(java.util.Map<String, ?> map) throws Exception {
        BusinessRuleItem self = new BusinessRuleItem();
        return TeaModel.build(map, self);
    }

    public BusinessRuleItem setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public BusinessRuleItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
