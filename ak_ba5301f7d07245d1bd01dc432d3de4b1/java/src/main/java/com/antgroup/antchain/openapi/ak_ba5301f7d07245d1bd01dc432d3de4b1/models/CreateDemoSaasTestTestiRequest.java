// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ba5301f7d07245d1bd01dc432d3de4b1.models;

import com.aliyun.tea.*;

public class CreateDemoSaasTestTestiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static CreateDemoSaasTestTestiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoSaasTestTestiRequest self = new CreateDemoSaasTestTestiRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemoSaasTestTestiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDemoSaasTestTestiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
