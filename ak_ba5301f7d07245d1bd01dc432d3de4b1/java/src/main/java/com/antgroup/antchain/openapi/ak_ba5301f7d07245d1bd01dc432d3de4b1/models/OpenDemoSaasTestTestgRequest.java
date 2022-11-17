// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ba5301f7d07245d1bd01dc432d3de4b1.models;

import com.aliyun.tea.*;

public class OpenDemoSaasTestTestgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static OpenDemoSaasTestTestgRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDemoSaasTestTestgRequest self = new OpenDemoSaasTestTestgRequest();
        return TeaModel.build(map, self);
    }

    public OpenDemoSaasTestTestgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenDemoSaasTestTestgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenDemoSaasTestTestgRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
