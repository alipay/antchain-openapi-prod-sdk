// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5ea45460b65f4d169144dc74e621ec27.models;

import com.aliyun.tea.*;

public class ReplaceDemoSaasTestTestjRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ReplaceDemoSaasTestTestjRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDemoSaasTestTestjRequest self = new ReplaceDemoSaasTestTestjRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceDemoSaasTestTestjRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceDemoSaasTestTestjRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceDemoSaasTestTestjRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
