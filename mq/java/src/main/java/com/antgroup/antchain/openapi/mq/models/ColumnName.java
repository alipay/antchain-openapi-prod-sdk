// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ColumnName extends TeaModel {
    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 唯一ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 值类型
    @NameInMap("value_type")
    @Validation(required = true)
    public String valueType;

    public static ColumnName build(java.util.Map<String, ?> map) throws Exception {
        ColumnName self = new ColumnName();
        return TeaModel.build(map, self);
    }

    public ColumnName setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ColumnName setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ColumnName setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
