// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SecretData extends TeaModel {
    // secret data key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // secret data value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static SecretData build(java.util.Map<String, ?> map) throws Exception {
        SecretData self = new SecretData();
        return TeaModel.build(map, self);
    }

    public SecretData setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SecretData setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
