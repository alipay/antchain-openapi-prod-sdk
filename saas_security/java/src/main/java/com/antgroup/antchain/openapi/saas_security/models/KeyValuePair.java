// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class KeyValuePair extends TeaModel {
    // 23
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("key")
    public String key;

    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
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
