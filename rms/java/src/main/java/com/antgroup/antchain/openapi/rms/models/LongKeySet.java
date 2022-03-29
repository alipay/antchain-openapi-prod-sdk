// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class LongKeySet extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    public static LongKeySet build(java.util.Map<String, ?> map) throws Exception {
        LongKeySet self = new LongKeySet();
        return TeaModel.build(map, self);
    }

    public LongKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LongKeySet setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
