// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 角色Id
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    // 授权能力类型（ROLE：角色)
    @NameInMap("ability_type")
    @Validation(required = true)
    public String abilityType;

    // 授权策略的限制条件
    @NameInMap("conditons")
    public java.util.List<Condition> conditons;

    // 策略的描述
    @NameInMap("description")
    public String description;

    // 授权策略名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 八位租户ID
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatePolicyRequest setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public CreatePolicyRequest setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public CreatePolicyRequest setConditons(java.util.List<Condition> conditons) {
        this.conditons = conditons;
        return this;
    }
    public java.util.List<Condition> getConditons() {
        return this.conditons;
    }

    public CreatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolicyRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
