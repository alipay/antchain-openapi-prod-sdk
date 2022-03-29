// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XCondition extends TeaModel {
    // 表达式
    @NameInMap("expr")
    @Validation(required = true)
    public String expr;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // value
    @NameInMap("value")
    public String value;

    //  
    @NameInMap("values")
    public java.util.List<String> values;

    //  
    @NameInMap("all")
    public Boolean all;

    public static XCondition build(java.util.Map<String, ?> map) throws Exception {
        XCondition self = new XCondition();
        return TeaModel.build(map, self);
    }

    public XCondition setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public XCondition setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public XCondition setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public XCondition setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

    public XCondition setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

}
