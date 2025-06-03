// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class SubDemoStruct extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static SubDemoStruct build(java.util.Map<String, ?> map) throws Exception {
        SubDemoStruct self = new SubDemoStruct();
        return TeaModel.build(map, self);
    }

    public SubDemoStruct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubDemoStruct setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
