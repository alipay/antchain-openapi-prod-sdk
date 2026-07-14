// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class MapEntry extends TeaModel {
    // key
    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MapEntry build(java.util.Map<String, ?> map) throws Exception {
        MapEntry self = new MapEntry();
        return TeaModel.build(map, self);
    }

    public MapEntry setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapEntry setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
