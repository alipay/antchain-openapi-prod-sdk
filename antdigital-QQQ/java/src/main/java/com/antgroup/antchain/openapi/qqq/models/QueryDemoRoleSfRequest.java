// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class QueryDemoRoleSfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoRoleSfRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoRoleSfRequest self = new QueryDemoRoleSfRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoRoleSfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoRoleSfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
