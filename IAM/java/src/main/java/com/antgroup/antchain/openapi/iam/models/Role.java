// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Role extends TeaModel {
    // 操作点列表
    @NameInMap("actions")
    public java.util.List<Action> actions;

    // 创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 角色描述
    @NameInMap("description")
    public String description;

    // 角色ID
    @NameInMap("id")
    public String id;

    // 角色名称
    @NameInMap("name")
    public String name;

    // 角色归属租户
    @NameInMap("tenant")
    public String tenant;

    // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
    @NameInMap("type")
    public String type;

    // 更新时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static Role build(java.util.Map<String, ?> map) throws Exception {
        Role self = new Role();
        return TeaModel.build(map, self);
    }

    public Role setActions(java.util.List<Action> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<Action> getActions() {
        return this.actions;
    }

    public Role setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Role setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public Role setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public Role setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Role setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
