// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsCmdArg extends TeaModel {
    // 指令参数名称
    @NameInMap("name")
    public String name;

    // 指令参数值
    @NameInMap("value")
    public String value;

    public static OpsCmdArg build(java.util.Map<String, ?> map) throws Exception {
        OpsCmdArg self = new OpsCmdArg();
        return TeaModel.build(map, self);
    }

    public OpsCmdArg setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsCmdArg setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
