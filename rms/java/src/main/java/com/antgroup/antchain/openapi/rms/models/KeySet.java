// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class KeySet extends TeaModel {
    // key
    @NameInMap("key")
    public String key;

    // value
    @NameInMap("value")
    public String value;

    public static KeySet build(java.util.Map<String, ?> map) throws Exception {
        KeySet self = new KeySet();
        return TeaModel.build(map, self);
    }

    public KeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public KeySet setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
