// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DelayInfo extends TeaModel {
    // 延迟时间
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 值类型
    @NameInMap("value_type")
    @Validation(required = true)
    public String valueType;

    public static DelayInfo build(java.util.Map<String, ?> map) throws Exception {
        DelayInfo self = new DelayInfo();
        return TeaModel.build(map, self);
    }

    public DelayInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DelayInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DelayInfo setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
