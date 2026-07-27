// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class InitializeZolozmyRaasRealidReusableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static InitializeZolozmyRaasRealidReusableRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeZolozmyRaasRealidReusableRequest self = new InitializeZolozmyRaasRealidReusableRequest();
        return TeaModel.build(map, self);
    }

    public InitializeZolozmyRaasRealidReusableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitializeZolozmyRaasRealidReusableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
