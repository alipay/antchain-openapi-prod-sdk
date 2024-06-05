// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class BindAntchainSaasAbilityApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 共享能力id
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    // qiujianglong.qjl
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // api模型集合
    @NameInMap("api_info_models")
    @Validation(required = true)
    public java.util.List<ApiInfoModel> apiInfoModels;

    public static BindAntchainSaasAbilityApiRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAntchainSaasAbilityApiRequest self = new BindAntchainSaasAbilityApiRequest();
        return TeaModel.build(map, self);
    }

    public BindAntchainSaasAbilityApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAntchainSaasAbilityApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindAntchainSaasAbilityApiRequest setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public BindAntchainSaasAbilityApiRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public BindAntchainSaasAbilityApiRequest setApiInfoModels(java.util.List<ApiInfoModel> apiInfoModels) {
        this.apiInfoModels = apiInfoModels;
        return this;
    }
    public java.util.List<ApiInfoModel> getApiInfoModels() {
        return this.apiInfoModels;
    }

}
