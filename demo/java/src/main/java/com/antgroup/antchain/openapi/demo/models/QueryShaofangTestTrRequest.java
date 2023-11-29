// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryShaofangTestTrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryShaofangTestTrRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShaofangTestTrRequest self = new QueryShaofangTestTrRequest();
        return TeaModel.build(map, self);
    }

    public QueryShaofangTestTrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryShaofangTestTrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryShaofangTestTrRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
