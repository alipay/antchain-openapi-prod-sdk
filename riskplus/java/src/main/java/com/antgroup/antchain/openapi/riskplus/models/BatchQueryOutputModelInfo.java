// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchQueryOutputModelInfo extends TeaModel {
    // 变量名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 变量值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 变量值类型
    @NameInMap("value_type")
    @Validation(required = true)
    public String valueType;

    public static BatchQueryOutputModelInfo build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryOutputModelInfo self = new BatchQueryOutputModelInfo();
        return TeaModel.build(map, self);
    }

    public BatchQueryOutputModelInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BatchQueryOutputModelInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public BatchQueryOutputModelInfo setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
