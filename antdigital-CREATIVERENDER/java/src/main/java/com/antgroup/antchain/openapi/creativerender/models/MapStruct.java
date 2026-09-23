// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class MapStruct extends TeaModel {
    // 生图数量
    /**
     * <strong>example:</strong>
     * <p>generationCount</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // key对应的值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MapStruct build(java.util.Map<String, ?> map) throws Exception {
        MapStruct self = new MapStruct();
        return TeaModel.build(map, self);
    }

    public MapStruct setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapStruct setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
