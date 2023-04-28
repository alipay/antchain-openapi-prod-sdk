// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ee637c8293f64104af9686dc12e0cd18.models;

import com.aliyun.tea.*;

public class QueryDemoXyzDemoXxxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoXyzDemoXxxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoXyzDemoXxxRequest self = new QueryDemoXyzDemoXxxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoXyzDemoXxxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoXyzDemoXxxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
