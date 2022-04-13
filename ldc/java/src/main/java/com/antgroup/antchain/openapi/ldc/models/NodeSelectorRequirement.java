// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NodeSelectorRequirement extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // values
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<String> values;

    public static NodeSelectorRequirement build(java.util.Map<String, ?> map) throws Exception {
        NodeSelectorRequirement self = new NodeSelectorRequirement();
        return TeaModel.build(map, self);
    }

    public NodeSelectorRequirement setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public NodeSelectorRequirement setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public NodeSelectorRequirement setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
