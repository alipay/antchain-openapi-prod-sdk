// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class BindAbilityApiRequest extends TeaModel {
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

    public static BindAbilityApiRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAbilityApiRequest self = new BindAbilityApiRequest();
        return TeaModel.build(map, self);
    }

    public BindAbilityApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAbilityApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindAbilityApiRequest setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public BindAbilityApiRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public BindAbilityApiRequest setApiInfoModels(java.util.List<ApiInfoModel> apiInfoModels) {
        this.apiInfoModels = apiInfoModels;
        return this;
    }
    public java.util.List<ApiInfoModel> getApiInfoModels() {
        return this.apiInfoModels;
    }

}
