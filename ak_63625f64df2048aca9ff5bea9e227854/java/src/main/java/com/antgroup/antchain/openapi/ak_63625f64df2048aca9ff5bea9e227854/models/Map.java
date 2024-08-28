// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class Map extends TeaModel {
    // 键
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 值
    @NameInMap("value")
    public String value;

    public static Map build(java.util.Map<String, ?> map) throws Exception {
        Map self = new Map();
        return TeaModel.build(map, self);
    }

    public Map setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Map setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
