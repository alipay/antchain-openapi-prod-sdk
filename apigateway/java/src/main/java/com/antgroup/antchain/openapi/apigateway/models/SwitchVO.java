// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SwitchVO extends TeaModel {
    // 唯一标识
    @NameInMap("id")
    public String id;

    // 键值
    @NameInMap("key")
    public String key;

    // 名称
    @NameInMap("name")
    public String name;

    // 开关
    @NameInMap("value")
    public String value;

    public static SwitchVO build(java.util.Map<String, ?> map) throws Exception {
        SwitchVO self = new SwitchVO();
        return TeaModel.build(map, self);
    }

    public SwitchVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SwitchVO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SwitchVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SwitchVO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
