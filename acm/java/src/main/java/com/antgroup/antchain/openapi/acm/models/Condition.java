// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class Condition extends TeaModel {
    //  
    @NameInMap("key")
    public String key;

    //  
    @NameInMap("value")
    public java.util.List<String> value;

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

    public Condition setValue(java.util.List<String> value) {
        this.value = value;
        return this;
    }
    public java.util.List<String> getValue() {
        return this.value;
    }

}
