// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9468e09a21e84cc8b9a8d4a2de18c792.models;

import com.aliyun.tea.*;

public class BindDemoGatewayAbcTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoGatewayAbcTestRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoGatewayAbcTestRequest self = new BindDemoGatewayAbcTestRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoGatewayAbcTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoGatewayAbcTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
