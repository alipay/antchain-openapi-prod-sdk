// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FieldOverride extends TeaModel {
    // 部署单元名称
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 字段名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 字段值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static FieldOverride build(java.util.Map<String, ?> map) throws Exception {
        FieldOverride self = new FieldOverride();
        return TeaModel.build(map, self);
    }

    public FieldOverride setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public FieldOverride setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FieldOverride setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
