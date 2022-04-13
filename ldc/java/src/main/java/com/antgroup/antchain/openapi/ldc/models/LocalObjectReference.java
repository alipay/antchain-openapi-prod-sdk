// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LocalObjectReference extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static LocalObjectReference build(java.util.Map<String, ?> map) throws Exception {
        LocalObjectReference self = new LocalObjectReference();
        return TeaModel.build(map, self);
    }

    public LocalObjectReference setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
