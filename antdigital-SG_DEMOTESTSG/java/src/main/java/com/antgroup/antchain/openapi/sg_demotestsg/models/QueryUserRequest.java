// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sg_demotestsg.models;

import com.aliyun.tea.*;

public class QueryUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1123
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserRequest self = new QueryUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
