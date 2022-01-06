// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CircuitRuleBaseConditionModel extends TeaModel {
    // 生效域
    @NameInMap("field")
    @Validation(required = true)
    public String field;

    // 生效条件
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public java.util.List<String> value;

    public static CircuitRuleBaseConditionModel build(java.util.Map<String, ?> map) throws Exception {
        CircuitRuleBaseConditionModel self = new CircuitRuleBaseConditionModel();
        return TeaModel.build(map, self);
    }

    public CircuitRuleBaseConditionModel setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public CircuitRuleBaseConditionModel setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CircuitRuleBaseConditionModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CircuitRuleBaseConditionModel setValue(java.util.List<String> value) {
        this.value = value;
        return this;
    }
    public java.util.List<String> getValue() {
        return this.value;
    }

}
