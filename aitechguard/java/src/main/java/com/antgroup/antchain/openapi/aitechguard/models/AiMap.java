// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitechguard.models;

import com.aliyun.tea.*;

public class AiMap extends TeaModel {
    // 键
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 值
    @NameInMap("value")
    public String value;

    public static AiMap build(java.util.Map<String, ?> map) throws Exception {
        AiMap self = new AiMap();
        return TeaModel.build(map, self);
    }

    public AiMap setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AiMap setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
