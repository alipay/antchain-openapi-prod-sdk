// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Extension extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public Long key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static Extension build(java.util.Map<String, ?> map) throws Exception {
        Extension self = new Extension();
        return TeaModel.build(map, self);
    }

    public Extension setKey(Long key) {
        this.key = key;
        return this;
    }
    public Long getKey() {
        return this.key;
    }

    public Extension setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
