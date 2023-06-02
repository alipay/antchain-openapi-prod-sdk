// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class DetachPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 授权对象Id
    @NameInMap("actor_id")
    public String actorId;

    // 授权对象类型
    @NameInMap("actor_type")
    public String actorType;

    // 授权策略Id
    @NameInMap("policy_id")
    public String policyId;

    // 授权操作员的登录名，当配置actor_id与actor_type时可不填
    @NameInMap("login_name")
    public String loginName;

    // 授权策略的唯一名称，当配置policy_id时可不填
    @NameInMap("policy_name")
    public String policyName;

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

    public DetachPolicyRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public DetachPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
