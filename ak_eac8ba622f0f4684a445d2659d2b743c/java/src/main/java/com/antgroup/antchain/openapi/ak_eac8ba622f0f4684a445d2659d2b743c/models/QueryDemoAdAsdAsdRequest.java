// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_eac8ba622f0f4684a445d2659d2b743c.models;

import com.aliyun.tea.*;

public class QueryDemoAdAsdAsdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoAdAsdAsdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAdAsdAsdRequest self = new QueryDemoAdAsdAsdRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoAdAsdAsdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoAdAsdAsdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
