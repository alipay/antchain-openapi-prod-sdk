// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abcdjb.models;

import com.aliyun.tea.*;

public class QueryTestTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("test")
    @Validation(required = true)
    public String test;

    public static QueryTestTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestTestRequest self = new QueryTestTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestTestRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
