// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AuthPolicy extends TeaModel {
    // 授权能力Id
    @NameInMap("ability_id")
    public String abilityId;

    // 授权能力类型（ROLE：角色，ACTION：操作）
    @NameInMap("ability_type")
    public String abilityType;

    // 授权条件
    @NameInMap("conditions")
    public java.util.List<Condition> conditions;

    // 创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 权限策略描述
    @NameInMap("description")
    public String description;

    // 授权策略ID
    @NameInMap("id")
    public String id;

    // 授权策略名称
    @NameInMap("name")
    public String name;

    // 授权条件
    @NameInMap("scope_entities")
    public java.util.List<ScopeEntity> scopeEntities;

    // 授权策略归属租户
    @NameInMap("tenant")
    public String tenant;

    // 授权策略类型（CUSTOM：自定义授权策略）
    @NameInMap("type")
    public String type;

    // 更新时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static AuthPolicy build(java.util.Map<String, ?> map) throws Exception {
        AuthPolicy self = new AuthPolicy();
        return TeaModel.build(map, self);
    }

    public AuthPolicy setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public AuthPolicy setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public AuthPolicy setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

    public AuthPolicy setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AuthPolicy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AuthPolicy setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AuthPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthPolicy setScopeEntities(java.util.List<ScopeEntity> scopeEntities) {
        this.scopeEntities = scopeEntities;
        return this;
    }
    public java.util.List<ScopeEntity> getScopeEntities() {
        return this.scopeEntities;
    }

    public AuthPolicy setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public AuthPolicy setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AuthPolicy setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
