// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class MapResourceNameToValue extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public ResourceValue value;

    public static MapResourceNameToValue build(java.util.Map<String, ?> map) throws Exception {
        MapResourceNameToValue self = new MapResourceNameToValue();
        return TeaModel.build(map, self);
    }

    public MapResourceNameToValue setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapResourceNameToValue setValue(ResourceValue value) {
        this.value = value;
        return this;
    }
    public ResourceValue getValue() {
        return this.value;
    }

}
