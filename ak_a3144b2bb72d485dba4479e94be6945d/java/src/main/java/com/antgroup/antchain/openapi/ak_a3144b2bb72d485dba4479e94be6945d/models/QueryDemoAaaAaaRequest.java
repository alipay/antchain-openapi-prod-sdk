// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a3144b2bb72d485dba4479e94be6945d.models;

import com.aliyun.tea.*;

public class QueryDemoAaaAaaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoAaaAaaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAaaAaaRequest self = new QueryDemoAaaAaaRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoAaaAaaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoAaaAaaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
