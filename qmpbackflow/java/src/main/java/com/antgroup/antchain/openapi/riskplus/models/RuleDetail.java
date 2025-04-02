// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RuleDetail extends TeaModel {
    // 规则细节名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 规则细节值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static RuleDetail build(java.util.Map<String, ?> map) throws Exception {
        RuleDetail self = new RuleDetail();
        return TeaModel.build(map, self);
    }

    public RuleDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RuleDetail setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
