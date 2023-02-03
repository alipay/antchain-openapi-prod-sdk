// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_65dc341e24ab49cc946cb8691f4f94ee.models;

import com.aliyun.tea.*;

public class BindDemoAbilityQueryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoAbilityQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoAbilityQueryRequest self = new BindDemoAbilityQueryRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoAbilityQueryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoAbilityQueryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
