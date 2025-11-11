// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class StringPair extends TeaModel {
    // key
    /**
     * <strong>example:</strong>
     * <p>appid</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 对应key的具体value
    /**
     * <strong>example:</strong>
     * <p>12312312</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static StringPair build(java.util.Map<String, ?> map) throws Exception {
        StringPair self = new StringPair();
        return TeaModel.build(map, self);
    }

    public StringPair setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public StringPair setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
