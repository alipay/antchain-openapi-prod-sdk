// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class Role extends TeaModel {
    // 角色ID
    @NameInMap("id")
    public String id;

    // 角色名称
    // 
    @NameInMap("name")
    public String name;

    // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
    @NameInMap("type")
    public String type;

    // 角色描述
    // 
    @NameInMap("description")
    public String description;

    // 状态
    @NameInMap("status")
    public String status;

    // 所有者
    @NameInMap("owner")
    public String owner;

    public static Role build(java.util.Map<String, ?> map) throws Exception {
        Role self = new Role();
        return TeaModel.build(map, self);
    }

    public Role setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Role setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Role setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Role setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Role setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
