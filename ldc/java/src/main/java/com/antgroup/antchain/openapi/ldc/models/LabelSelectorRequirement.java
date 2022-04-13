// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LabelSelectorRequirement extends TeaModel {
    // label key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // label match operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // label match values
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<String> values;

    public static LabelSelectorRequirement build(java.util.Map<String, ?> map) throws Exception {
        LabelSelectorRequirement self = new LabelSelectorRequirement();
        return TeaModel.build(map, self);
    }

    public LabelSelectorRequirement setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LabelSelectorRequirement setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public LabelSelectorRequirement setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
