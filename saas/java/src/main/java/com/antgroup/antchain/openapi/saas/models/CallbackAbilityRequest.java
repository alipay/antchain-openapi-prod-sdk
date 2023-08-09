// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class CallbackAbilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api名称集合
    @NameInMap("api_names")
    @Validation(required = true)
    public java.util.List<String> apiNames;

    public static CallbackAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAbilityRequest self = new CallbackAbilityRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackAbilityRequest setApiNames(java.util.List<String> apiNames) {
        this.apiNames = apiNames;
        return this;
    }
    public java.util.List<String> getApiNames() {
        return this.apiNames;
    }

}
