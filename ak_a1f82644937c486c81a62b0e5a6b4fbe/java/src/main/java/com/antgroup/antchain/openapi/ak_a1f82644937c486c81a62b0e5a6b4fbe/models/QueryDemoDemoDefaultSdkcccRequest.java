// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class QueryDemoDemoDefaultSdkcccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoDemoDefaultSdkcccRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoDemoDefaultSdkcccRequest self = new QueryDemoDemoDefaultSdkcccRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoDemoDefaultSdkcccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoDemoDefaultSdkcccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
