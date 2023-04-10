// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetNetworkStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    public static GetNetworkStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkStatusRequest self = new GetNetworkStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetNetworkStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetNetworkStatusRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

}
