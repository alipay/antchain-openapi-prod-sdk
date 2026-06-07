// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_eed2ee0664ac41b78f2c14f3ffa051e7.models;

import com.aliyun.tea.*;

public class QueryDemoABCRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoABCRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoABCRequest self = new QueryDemoABCRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoABCRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoABCRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
