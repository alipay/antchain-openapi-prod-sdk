// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class BindAntchainSaasAbilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 能力id列表
    @NameInMap("ability_ids")
    @Validation(required = true)
    public java.util.List<String> abilityIds;

    // 操作人的域账号
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static BindAntchainSaasAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAntchainSaasAbilityRequest self = new BindAntchainSaasAbilityRequest();
        return TeaModel.build(map, self);
    }

    public BindAntchainSaasAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAntchainSaasAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindAntchainSaasAbilityRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public BindAntchainSaasAbilityRequest setAbilityIds(java.util.List<String> abilityIds) {
        this.abilityIds = abilityIds;
        return this;
    }
    public java.util.List<String> getAbilityIds() {
        return this.abilityIds;
    }

    public BindAntchainSaasAbilityRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
