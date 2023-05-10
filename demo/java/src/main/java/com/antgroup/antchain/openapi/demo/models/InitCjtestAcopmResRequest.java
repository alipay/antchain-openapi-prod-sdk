// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class InitCjtestAcopmResRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static InitCjtestAcopmResRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCjtestAcopmResRequest self = new InitCjtestAcopmResRequest();
        return TeaModel.build(map, self);
    }

    public InitCjtestAcopmResRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCjtestAcopmResRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
