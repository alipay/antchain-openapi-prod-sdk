// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayCheckEchotenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoGatewayCheckEchotenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayCheckEchotenRequest self = new QueryDemoGatewayCheckEchotenRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayCheckEchotenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoGatewayCheckEchotenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
