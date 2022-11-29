// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ResetSaasTestTestdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ResetSaasTestTestdRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSaasTestTestdRequest self = new ResetSaasTestTestdRequest();
        return TeaModel.build(map, self);
    }

    public ResetSaasTestTestdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetSaasTestTestdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetSaasTestTestdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
