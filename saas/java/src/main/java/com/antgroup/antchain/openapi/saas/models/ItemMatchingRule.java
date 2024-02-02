// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class ItemMatchingRule extends TeaModel {
    // 计量项匹配规则
    @NameInMap("metering_matching_rule")
    public String meteringMatchingRule;

    // 1
    @NameInMap("metering_value")
    @Validation(required = true)
    public String meteringValue;

    public static ItemMatchingRule build(java.util.Map<String, ?> map) throws Exception {
        ItemMatchingRule self = new ItemMatchingRule();
        return TeaModel.build(map, self);
    }

    public ItemMatchingRule setMeteringMatchingRule(String meteringMatchingRule) {
        this.meteringMatchingRule = meteringMatchingRule;
        return this;
    }
    public String getMeteringMatchingRule() {
        return this.meteringMatchingRule;
    }

    public ItemMatchingRule setMeteringValue(String meteringValue) {
        this.meteringValue = meteringValue;
        return this;
    }
    public String getMeteringValue() {
        return this.meteringValue;
    }

}
