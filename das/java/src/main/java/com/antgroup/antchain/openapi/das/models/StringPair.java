// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class StringPair extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 对应key的具体value
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
