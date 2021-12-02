// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class MapStringToStringEntry extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MapStringToStringEntry build(java.util.Map<String, ?> map) throws Exception {
        MapStringToStringEntry self = new MapStringToStringEntry();
        return TeaModel.build(map, self);
    }

    public MapStringToStringEntry setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapStringToStringEntry setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
