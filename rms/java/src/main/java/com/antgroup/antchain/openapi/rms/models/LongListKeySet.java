// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class LongListKeySet extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public java.util.List<String> value;

    public static LongListKeySet build(java.util.Map<String, ?> map) throws Exception {
        LongListKeySet self = new LongListKeySet();
        return TeaModel.build(map, self);
    }

    public LongListKeySet setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LongListKeySet setValue(java.util.List<String> value) {
        this.value = value;
        return this;
    }
    public java.util.List<String> getValue() {
        return this.value;
    }

}
