// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class KeyValueMap extends TeaModel {
    // key-value中的key
    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    @Validation(maxLength = 100, minLength = 1)
    public String key;

    // key-value中的value
    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("value")
    @Validation(maxLength = 1000, minLength = 1)
    public String value;

    public static KeyValueMap build(java.util.Map<String, ?> map) throws Exception {
        KeyValueMap self = new KeyValueMap();
        return TeaModel.build(map, self);
    }

    public KeyValueMap setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public KeyValueMap setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
