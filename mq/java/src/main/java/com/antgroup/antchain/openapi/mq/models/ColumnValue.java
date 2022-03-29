// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ColumnValue extends TeaModel {
    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static ColumnValue build(java.util.Map<String, ?> map) throws Exception {
        ColumnValue self = new ColumnValue();
        return TeaModel.build(map, self);
    }

    public ColumnValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ColumnValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
