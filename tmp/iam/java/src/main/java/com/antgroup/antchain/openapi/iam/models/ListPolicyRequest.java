// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ListPolicyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 授权对象id
    @NameInMap("actor_id")
    @Validation(required = true)
    public String actorId;

    // 授权对象类型
    @NameInMap("actor_type")
    @Validation(required = true)
    public String actorType;

    // 授权策略所属租户
    @NameInMap("tenant")
    public String tenant;

    public static ListPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyRequest self = new ListPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListPolicyRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public ListPolicyRequest setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }
    public String getActorType() {
        return this.actorType;
    }

    public ListPolicyRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
