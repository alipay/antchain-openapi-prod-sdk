// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class KV extends TeaModel {
    // 键
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static KV build(java.util.Map<String, ?> map) throws Exception {
        KV self = new KV();
        return TeaModel.build(map, self);
    }

    public KV setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public KV setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
