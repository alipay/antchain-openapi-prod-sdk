// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ee637c8293f64104af9686dc12e0cd18.models;

import com.aliyun.tea.*;

public class BindDemoSdfSssSssRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoSdfSssSssRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoSdfSssSssRequest self = new BindDemoSdfSssSssRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoSdfSssSssRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoSdfSssSssRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
