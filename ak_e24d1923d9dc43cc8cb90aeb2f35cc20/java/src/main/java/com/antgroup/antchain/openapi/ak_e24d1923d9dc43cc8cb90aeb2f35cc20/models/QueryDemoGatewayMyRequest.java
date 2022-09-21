// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_e24d1923d9dc43cc8cb90aeb2f35cc20.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayMyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoGatewayMyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayMyRequest self = new QueryDemoGatewayMyRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayMyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoGatewayMyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
