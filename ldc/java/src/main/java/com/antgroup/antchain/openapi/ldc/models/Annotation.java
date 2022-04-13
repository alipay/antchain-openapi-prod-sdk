// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Annotation extends TeaModel {
    // annotation key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // annotation value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static Annotation build(java.util.Map<String, ?> map) throws Exception {
        Annotation self = new Annotation();
        return TeaModel.build(map, self);
    }

    public Annotation setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Annotation setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
