// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ResourceValue extends TeaModel {
    // value
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // Ki、Mi、Gi、Ti、Pi、m、c
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static ResourceValue build(java.util.Map<String, ?> map) throws Exception {
        ResourceValue self = new ResourceValue();
        return TeaModel.build(map, self);
    }

    public ResourceValue setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public ResourceValue setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
