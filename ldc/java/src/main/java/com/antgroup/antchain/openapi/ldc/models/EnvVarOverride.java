// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EnvVarOverride extends TeaModel {
    // 部署单元名称。
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 环境变量名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 环境变量取值。
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static EnvVarOverride build(java.util.Map<String, ?> map) throws Exception {
        EnvVarOverride self = new EnvVarOverride();
        return TeaModel.build(map, self);
    }

    public EnvVarOverride setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public EnvVarOverride setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnvVarOverride setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
