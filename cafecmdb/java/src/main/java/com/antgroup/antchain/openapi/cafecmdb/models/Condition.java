// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class Condition extends TeaModel {
    // 用于查询条件的字段
    @NameInMap("field")
    @Validation(required = true)
    public String field;

    // 查询操作符
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 由于OP限制，此字段无法直接使用数组。请务必使用能够解析的JSON数组
    @NameInMap("values")
    @Validation(required = true)
    public String values;

    public static Condition build(java.util.Map<String, ?> map) throws Exception {
        Condition self = new Condition();
        return TeaModel.build(map, self);
    }

    public Condition setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public Condition setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Condition setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
