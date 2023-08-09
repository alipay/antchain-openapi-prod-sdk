// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class BindAbilityRequest extends TeaModel {
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

    // api信息
    @NameInMap("api_info_model")
    @Validation(required = true)
    public ApiInfoModel apiInfoModel;

    public static BindAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAbilityRequest self = new BindAbilityRequest();
        return TeaModel.build(map, self);
    }

    public BindAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindAbilityRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public BindAbilityRequest setAbilityIds(java.util.List<String> abilityIds) {
        this.abilityIds = abilityIds;
        return this;
    }
    public java.util.List<String> getAbilityIds() {
        return this.abilityIds;
    }

    public BindAbilityRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public BindAbilityRequest setApiInfoModel(ApiInfoModel apiInfoModel) {
        this.apiInfoModel = apiInfoModel;
        return this;
    }
    public ApiInfoModel getApiInfoModel() {
        return this.apiInfoModel;
    }

}
