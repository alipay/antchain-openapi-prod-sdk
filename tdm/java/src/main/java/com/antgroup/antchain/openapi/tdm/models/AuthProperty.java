// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class AuthProperty extends TeaModel {
    // 地区
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // {"山西","广东"}
    @NameInMap("value")
    @Validation(required = true)
    public java.util.List<String> value;

    public static AuthProperty build(java.util.Map<String, ?> map) throws Exception {
        AuthProperty self = new AuthProperty();
        return TeaModel.build(map, self);
    }

    public AuthProperty setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AuthProperty setValue(java.util.List<String> value) {
        this.value = value;
        return this;
    }
    public java.util.List<String> getValue() {
        return this.value;
    }

}
