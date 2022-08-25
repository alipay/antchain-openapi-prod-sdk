// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6efc6591476e4813ac8f7c9b6359c0b7.models;

import com.aliyun.tea.*;

public class KeyValuePair extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    public String value;

    public static KeyValuePair build(java.util.Map<String, ?> map) throws Exception {
        KeyValuePair self = new KeyValuePair();
        return TeaModel.build(map, self);
    }

    public KeyValuePair setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public KeyValuePair setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
