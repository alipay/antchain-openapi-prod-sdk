// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UserGroup extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 通知组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 最后修改人
    @NameInMap("modifier")
    @Validation(required = true)
    public String modifier;

    // 最后修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 用户组关联关系
    @NameInMap("relations")
    @Validation(required = true)
    public java.util.List<UserGroupRelation> relations;

    // 全局订阅
    @NameInMap("scope_global")
    public Boolean scopeGlobal;

    // 0、当前workspace有效；
    // 1、租户有效；
    @NameInMap("valid_scope")
    public Long validScope;

    // 当前用户组的告警规则定阅数量
    @NameInMap("subscribe_count")
    public Long subscribeCount;

    public static UserGroup build(java.util.Map<String, ?> map) throws Exception {
        UserGroup self = new UserGroup();
        return TeaModel.build(map, self);
    }

    public UserGroup setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UserGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserGroup setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public UserGroup setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public UserGroup setRelations(java.util.List<UserGroupRelation> relations) {
        this.relations = relations;
        return this;
    }
    public java.util.List<UserGroupRelation> getRelations() {
        return this.relations;
    }

    public UserGroup setScopeGlobal(Boolean scopeGlobal) {
        this.scopeGlobal = scopeGlobal;
        return this;
    }
    public Boolean getScopeGlobal() {
        return this.scopeGlobal;
    }

    public UserGroup setValidScope(Long validScope) {
        this.validScope = validScope;
        return this;
    }
    public Long getValidScope() {
        return this.validScope;
    }

    public UserGroup setSubscribeCount(Long subscribeCount) {
        this.subscribeCount = subscribeCount;
        return this;
    }
    public Long getSubscribeCount() {
        return this.subscribeCount;
    }

}
