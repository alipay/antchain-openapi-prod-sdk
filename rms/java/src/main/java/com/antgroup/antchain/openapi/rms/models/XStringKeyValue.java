// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XStringKeyValue extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static XStringKeyValue build(java.util.Map<String, ?> map) throws Exception {
        XStringKeyValue self = new XStringKeyValue();
        return TeaModel.build(map, self);
    }

    public XStringKeyValue setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public XStringKeyValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
