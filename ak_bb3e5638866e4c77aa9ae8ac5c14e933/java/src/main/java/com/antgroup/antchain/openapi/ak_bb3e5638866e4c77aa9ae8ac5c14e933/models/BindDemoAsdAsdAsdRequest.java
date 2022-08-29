// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bb3e5638866e4c77aa9ae8ac5c14e933.models;

import com.aliyun.tea.*;

public class BindDemoAsdAsdAsdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoAsdAsdAsdRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoAsdAsdAsdRequest self = new BindDemoAsdAsdAsdRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoAsdAsdAsdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoAsdAsdAsdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
