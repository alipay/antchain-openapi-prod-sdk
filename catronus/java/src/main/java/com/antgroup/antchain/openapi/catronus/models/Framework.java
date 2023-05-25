// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Framework extends TeaModel {
    // 策略id
    @NameInMap("id")
    public String id;

    // 框架名称
    @NameInMap("name")
    public String name;

    // 是否启用
    @NameInMap("enable")
    public Boolean enable;

    // 描述
    @NameInMap("describe")
    public String describe;

    public static Framework build(java.util.Map<String, ?> map) throws Exception {
        Framework self = new Framework();
        return TeaModel.build(map, self);
    }

    public Framework setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Framework setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Framework setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public Framework setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

}
