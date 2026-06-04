// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class KeyContentPropertyPair extends TeaModel {
    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public ContentProperty value;

    public static KeyContentPropertyPair build(java.util.Map<String, ?> map) throws Exception {
        KeyContentPropertyPair self = new KeyContentPropertyPair();
        return TeaModel.build(map, self);
    }

    public KeyContentPropertyPair setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public KeyContentPropertyPair setValue(ContentProperty value) {
        this.value = value;
        return this;
    }
    public ContentProperty getValue() {
        return this.value;
    }

}
