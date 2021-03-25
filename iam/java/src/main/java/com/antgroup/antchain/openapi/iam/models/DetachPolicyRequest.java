// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class DetachPolicyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 授权对象Id
    @NameInMap("actor_id")
    @Validation(required = true)
    public String actorId;

    // 授权对象类型
    @NameInMap("actor_type")
    @Validation(required = true)
    public String actorType;

    // 授权策略Id
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    public static DetachPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyRequest self = new DetachPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetachPolicyRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public DetachPolicyRequest setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }
    public String getActorType() {
        return this.actorType;
    }

    public DetachPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
