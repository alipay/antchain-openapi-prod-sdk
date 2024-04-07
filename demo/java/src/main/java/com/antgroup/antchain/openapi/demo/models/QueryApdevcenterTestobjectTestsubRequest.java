// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryApdevcenterTestobjectTestsubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("test")
    @Validation(required = true, maxLength = 200, minLength = 200)
    public String test;

    public static QueryApdevcenterTestobjectTestsubRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApdevcenterTestobjectTestsubRequest self = new QueryApdevcenterTestobjectTestsubRequest();
        return TeaModel.build(map, self);
    }

    public QueryApdevcenterTestobjectTestsubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApdevcenterTestobjectTestsubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApdevcenterTestobjectTestsubRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
