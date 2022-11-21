// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models;

import com.aliyun.tea.*;

public class ResetDemoCjtestApiAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static ResetDemoCjtestApiAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDemoCjtestApiAuthorizeRequest self = new ResetDemoCjtestApiAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public ResetDemoCjtestApiAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetDemoCjtestApiAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
