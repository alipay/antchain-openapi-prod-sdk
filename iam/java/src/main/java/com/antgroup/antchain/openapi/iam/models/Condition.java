// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Condition extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("value")
    public String value;

    public static Condition build(java.util.Map<String, ?> map) throws Exception {
        Condition self = new Condition();
        return TeaModel.build(map, self);
    }

    public Condition setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Condition setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
