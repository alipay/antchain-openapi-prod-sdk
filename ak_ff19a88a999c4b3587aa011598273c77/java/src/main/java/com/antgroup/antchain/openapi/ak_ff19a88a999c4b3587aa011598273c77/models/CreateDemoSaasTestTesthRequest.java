// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models;

import com.aliyun.tea.*;

public class CreateDemoSaasTestTesthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CreateDemoSaasTestTesthRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoSaasTestTesthRequest self = new CreateDemoSaasTestTesthRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemoSaasTestTesthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDemoSaasTestTesthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDemoSaasTestTesthRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
