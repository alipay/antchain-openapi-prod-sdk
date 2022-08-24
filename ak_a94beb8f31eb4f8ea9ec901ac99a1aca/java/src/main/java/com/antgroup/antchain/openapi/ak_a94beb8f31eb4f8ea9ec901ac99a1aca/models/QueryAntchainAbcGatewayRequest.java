// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a94beb8f31eb4f8ea9ec901ac99a1aca.models;

import com.aliyun.tea.*;

public class QueryAntchainAbcGatewayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryAntchainAbcGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAbcGatewayRequest self = new QueryAntchainAbcGatewayRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAbcGatewayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAbcGatewayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
