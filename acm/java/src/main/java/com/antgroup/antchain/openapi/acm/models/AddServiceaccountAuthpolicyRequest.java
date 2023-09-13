// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class AddServiceaccountAuthpolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 服务账号对应的AccessKey
    @NameInMap("iam_access_key")
    @Validation(required = true)
    public String iamAccessKey;

    // 系统来源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // 能力ID（权限点或角色ID）
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    // 授权能力类型
    @NameInMap("ability_type")
    @Validation(required = true)
    public String abilityType;

    // 授权策略的限制条件
    // 
    @NameInMap("conditions")
    public java.util.List<Condition> conditions;

    public static AddServiceaccountAuthpolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddServiceaccountAuthpolicyRequest self = new AddServiceaccountAuthpolicyRequest();
        return TeaModel.build(map, self);
    }

    public AddServiceaccountAuthpolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddServiceaccountAuthpolicyRequest setIamAccessKey(String iamAccessKey) {
        this.iamAccessKey = iamAccessKey;
        return this;
    }
    public String getIamAccessKey() {
        return this.iamAccessKey;
    }

    public AddServiceaccountAuthpolicyRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public AddServiceaccountAuthpolicyRequest setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public AddServiceaccountAuthpolicyRequest setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public AddServiceaccountAuthpolicyRequest setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

}
