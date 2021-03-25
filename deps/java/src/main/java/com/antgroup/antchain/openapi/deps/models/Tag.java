// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Tag extends TeaModel {
    // 可读键名
    @NameInMap("display_name")
    public String displayName;

    // 键名
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 映射类型，可选
    @NameInMap("type")
    public String type;

    // 键值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static Tag build(java.util.Map<String, ?> map) throws Exception {
        Tag self = new Tag();
        return TeaModel.build(map, self);
    }

    public Tag setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Tag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Tag setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Tag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
