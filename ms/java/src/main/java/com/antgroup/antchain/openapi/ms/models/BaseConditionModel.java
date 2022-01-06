// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class BaseConditionModel extends TeaModel {
    // 匹配字段
    @NameInMap("field")
    public String field;

    // 操作符
    @NameInMap("operation")
    public String operation;

    // SYSTEM、CUSTOM系统字段还是自定义字段
    @NameInMap("type")
    public String type;

    // 匹配值
    @NameInMap("value")
    public java.util.List<String> value;

    public static BaseConditionModel build(java.util.Map<String, ?> map) throws Exception {
        BaseConditionModel self = new BaseConditionModel();
        return TeaModel.build(map, self);
    }

    public BaseConditionModel setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public BaseConditionModel setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public BaseConditionModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BaseConditionModel setValue(java.util.List<String> value) {
        this.value = value;
        return this;
    }
    public java.util.List<String> getValue() {
        return this.value;
    }

}
