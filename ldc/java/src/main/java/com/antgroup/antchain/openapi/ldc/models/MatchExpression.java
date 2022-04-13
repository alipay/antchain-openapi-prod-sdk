// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class MatchExpression extends TeaModel {
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
    public java.util.List<String> values;

    public static MatchExpression build(java.util.Map<String, ?> map) throws Exception {
        MatchExpression self = new MatchExpression();
        return TeaModel.build(map, self);
    }

    public MatchExpression setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MatchExpression setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public MatchExpression setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
