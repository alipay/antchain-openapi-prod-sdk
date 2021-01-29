// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Pair extends TeaModel {
    // 键
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static Pair build(java.util.Map<String, ?> map) throws Exception {
        Pair self = new Pair();
        return TeaModel.build(map, self);
    }

    public Pair setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Pair setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
