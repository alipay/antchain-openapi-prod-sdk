// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AuthenticateEvent extends TeaModel {
    // 鉴权操作列表
    @NameInMap("actions")
    @Validation(required = true)
    public java.util.List<String> actions;

    // 鉴权对象ID
    @NameInMap("actor_id")
    @Validation(required = true)
    public String actorId;

    // 鉴权条件
    @NameInMap("conditions")
    public java.util.List<Condition> conditions;

    // 唯一ID
    @NameInMap("id")
    public String id;

    public static AuthenticateEvent build(java.util.Map<String, ?> map) throws Exception {
        AuthenticateEvent self = new AuthenticateEvent();
        return TeaModel.build(map, self);
    }

    public AuthenticateEvent setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

    public AuthenticateEvent setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public AuthenticateEvent setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

    public AuthenticateEvent setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
