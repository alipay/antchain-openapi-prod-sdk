// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ea60128d3e1447918428343ec4193dc3.models;

import com.aliyun.tea.*;

public class QueryDemoComShareLiuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoComShareLiuRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoComShareLiuRequest self = new QueryDemoComShareLiuRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoComShareLiuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoComShareLiuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
