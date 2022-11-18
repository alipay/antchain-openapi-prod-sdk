// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1fef8815252948ebb01da07898dd0fb2.models;

import com.aliyun.tea.*;

public class ResetDemoSaasTestTestdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ResetDemoSaasTestTestdRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDemoSaasTestTestdRequest self = new ResetDemoSaasTestTestdRequest();
        return TeaModel.build(map, self);
    }

    public ResetDemoSaasTestTestdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetDemoSaasTestTestdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetDemoSaasTestTestdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
