// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class InitializeZolozsgRaasRealidReusableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static InitializeZolozsgRaasRealidReusableRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeZolozsgRaasRealidReusableRequest self = new InitializeZolozsgRaasRealidReusableRequest();
        return TeaModel.build(map, self);
    }

    public InitializeZolozsgRaasRealidReusableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitializeZolozsgRaasRealidReusableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
