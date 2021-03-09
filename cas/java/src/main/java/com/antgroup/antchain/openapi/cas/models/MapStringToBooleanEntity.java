// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class MapStringToBooleanEntity extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public Boolean value;

    public static MapStringToBooleanEntity build(java.util.Map<String, ?> map) throws Exception {
        MapStringToBooleanEntity self = new MapStringToBooleanEntity();
        return TeaModel.build(map, self);
    }

    public MapStringToBooleanEntity setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapStringToBooleanEntity setValue(Boolean value) {
        this.value = value;
        return this;
    }
    public Boolean getValue() {
        return this.value;
    }

}
