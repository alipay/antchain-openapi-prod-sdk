// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ConfigMapData extends TeaModel {
    // configmap data key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // configmap data value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static ConfigMapData build(java.util.Map<String, ?> map) throws Exception {
        ConfigMapData self = new ConfigMapData();
        return TeaModel.build(map, self);
    }

    public ConfigMapData setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ConfigMapData setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
