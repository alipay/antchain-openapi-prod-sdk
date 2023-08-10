// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class QueryDemoDemoDefaultSdkdddRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoDemoDefaultSdkdddRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoDemoDefaultSdkdddRequest self = new QueryDemoDemoDefaultSdkdddRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoDemoDefaultSdkdddRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoDemoDefaultSdkdddRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
