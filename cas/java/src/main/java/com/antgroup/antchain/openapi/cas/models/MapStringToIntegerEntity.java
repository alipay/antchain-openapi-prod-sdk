// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class MapStringToIntegerEntity extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    public static MapStringToIntegerEntity build(java.util.Map<String, ?> map) throws Exception {
        MapStringToIntegerEntity self = new MapStringToIntegerEntity();
        return TeaModel.build(map, self);
    }

    public MapStringToIntegerEntity setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapStringToIntegerEntity setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
