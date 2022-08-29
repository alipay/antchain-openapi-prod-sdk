// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bb3e5638866e4c77aa9ae8ac5c14e933.models;

import com.aliyun.tea.*;

public class BindDemoAaaBbbCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoAaaBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoAaaBbbCccRequest self = new BindDemoAaaBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoAaaBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoAaaBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
