// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class KeyValuePair extends TeaModel {
    // 键名
    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 值
    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("value")
    @Validation(required = true)
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
