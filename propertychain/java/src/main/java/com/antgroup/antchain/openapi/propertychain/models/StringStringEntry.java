// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class StringStringEntry extends TeaModel {
    // 键
    @NameInMap("key")
    public String key;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static StringStringEntry build(java.util.Map<String, ?> map) throws Exception {
        StringStringEntry self = new StringStringEntry();
        return TeaModel.build(map, self);
    }

    public StringStringEntry setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public StringStringEntry setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
