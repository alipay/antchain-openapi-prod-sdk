// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.models;

import com.aliyun.tea.*;

public class BindDemoAaaBbbCcdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoAaaBbbCcdRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoAaaBbbCcdRequest self = new BindDemoAaaBbbCcdRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoAaaBbbCcdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoAaaBbbCcdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
