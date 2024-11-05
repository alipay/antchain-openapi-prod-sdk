// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryStreamNonstreamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryStreamNonstreamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamNonstreamRequest self = new QueryStreamNonstreamRequest();
        return TeaModel.build(map, self);
    }

    public QueryStreamNonstreamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStreamNonstreamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStreamNonstreamRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
