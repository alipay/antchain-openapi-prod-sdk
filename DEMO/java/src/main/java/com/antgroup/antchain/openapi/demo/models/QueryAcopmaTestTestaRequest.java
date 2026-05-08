// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAcopmaTestTestaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryAcopmaTestTestaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAcopmaTestTestaRequest self = new QueryAcopmaTestTestaRequest();
        return TeaModel.build(map, self);
    }

    public QueryAcopmaTestTestaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAcopmaTestTestaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAcopmaTestTestaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
