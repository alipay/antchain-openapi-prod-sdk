// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.models;

import com.aliyun.tea.*;

public class QueryDemoApdevcenterTestobjectTestsubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("test")
    @Validation(required = true, maxLength = 200, minLength = 200)
    public String test;

    public static QueryDemoApdevcenterTestobjectTestsubRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoApdevcenterTestobjectTestsubRequest self = new QueryDemoApdevcenterTestobjectTestsubRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoApdevcenterTestobjectTestsubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoApdevcenterTestobjectTestsubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoApdevcenterTestobjectTestsubRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
