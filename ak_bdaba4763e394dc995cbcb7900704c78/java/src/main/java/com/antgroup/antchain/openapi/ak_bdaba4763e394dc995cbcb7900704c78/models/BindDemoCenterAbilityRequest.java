// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bdaba4763e394dc995cbcb7900704c78.models;

import com.aliyun.tea.*;

public class BindDemoCenterAbilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoCenterAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoCenterAbilityRequest self = new BindDemoCenterAbilityRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoCenterAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoCenterAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
