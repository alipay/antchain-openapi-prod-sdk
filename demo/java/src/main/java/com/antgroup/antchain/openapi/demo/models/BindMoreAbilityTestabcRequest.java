// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class BindMoreAbilityTestabcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindMoreAbilityTestabcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMoreAbilityTestabcRequest self = new BindMoreAbilityTestabcRequest();
        return TeaModel.build(map, self);
    }

    public BindMoreAbilityTestabcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindMoreAbilityTestabcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
