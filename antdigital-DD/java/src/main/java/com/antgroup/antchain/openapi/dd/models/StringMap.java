// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class StringMap extends TeaModel {
    // key
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("key")
    public String key;

    // value
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("value")
    public String value;

    public static StringMap build(java.util.Map<String, ?> map) throws Exception {
        StringMap self = new StringMap();
        return TeaModel.build(map, self);
    }

    public StringMap setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public StringMap setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
