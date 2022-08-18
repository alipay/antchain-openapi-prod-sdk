// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_58d0e6ac9a1f4c75b8220234c093d952.models;

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
