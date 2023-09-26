// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class MapEntry extends TeaModel {
    // Key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 声明 value 的类型，包括 String / Double / Long / Bool / JSONObject / JSONArray
    @NameInMap("type")
    public String type;

    public static MapEntry build(java.util.Map<String, ?> map) throws Exception {
        MapEntry self = new MapEntry();
        return TeaModel.build(map, self);
    }

    public MapEntry setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MapEntry setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public MapEntry setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
