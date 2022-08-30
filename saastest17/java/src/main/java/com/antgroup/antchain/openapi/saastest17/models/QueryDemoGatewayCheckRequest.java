// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saastest17.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayCheckRequest self = new QueryDemoGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoGatewayCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
