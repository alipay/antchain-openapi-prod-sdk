// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_24b462c17fab4e6998dcceeb37c41789.models;

import com.aliyun.tea.*;

public class QueryDemoTestGatewayTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoTestGatewayTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestGatewayTestRequest self = new QueryDemoTestGatewayTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestGatewayTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoTestGatewayTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
