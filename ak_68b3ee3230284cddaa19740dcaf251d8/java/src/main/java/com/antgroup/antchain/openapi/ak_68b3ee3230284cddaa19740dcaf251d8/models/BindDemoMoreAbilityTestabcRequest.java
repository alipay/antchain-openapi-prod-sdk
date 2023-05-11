// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_68b3ee3230284cddaa19740dcaf251d8.models;

import com.aliyun.tea.*;

public class BindDemoMoreAbilityTestabcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoMoreAbilityTestabcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoMoreAbilityTestabcRequest self = new BindDemoMoreAbilityTestabcRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoMoreAbilityTestabcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoMoreAbilityTestabcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
