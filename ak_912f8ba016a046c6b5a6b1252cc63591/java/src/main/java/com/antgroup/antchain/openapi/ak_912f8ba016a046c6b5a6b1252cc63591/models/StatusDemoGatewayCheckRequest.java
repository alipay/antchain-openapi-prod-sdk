// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_912f8ba016a046c6b5a6b1252cc63591.models;

import com.aliyun.tea.*;

public class StatusDemoGatewayCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static StatusDemoGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        StatusDemoGatewayCheckRequest self = new StatusDemoGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public StatusDemoGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StatusDemoGatewayCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
