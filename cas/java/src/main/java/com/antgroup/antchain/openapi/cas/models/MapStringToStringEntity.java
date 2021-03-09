// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class MapStringToStringEntity extends TeaModel {
    // 键名
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 键值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MapStringToStringEntity build(java.util.Map<String, ?> map) throws Exception {
        MapStringToStringEntity self = new MapStringToStringEntity();
        return TeaModel.build(map, self);
    }

    public MapStringToStringEntity setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapStringToStringEntity setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
