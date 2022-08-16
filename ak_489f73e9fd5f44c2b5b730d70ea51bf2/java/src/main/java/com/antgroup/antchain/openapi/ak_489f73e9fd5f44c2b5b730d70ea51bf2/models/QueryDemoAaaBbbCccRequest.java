// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_489f73e9fd5f44c2b5b730d70ea51bf2.models;

import com.aliyun.tea.*;

public class QueryDemoAaaBbbCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoAaaBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAaaBbbCccRequest self = new QueryDemoAaaBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoAaaBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoAaaBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
