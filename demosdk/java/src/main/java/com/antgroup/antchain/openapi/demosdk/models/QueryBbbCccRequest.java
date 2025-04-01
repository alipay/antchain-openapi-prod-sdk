// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class QueryBbbCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询条件
    @NameInMap("name")
    @Validation(required = true, maxLength = 32)
    public String name;

    public static QueryBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBbbCccRequest self = new QueryBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public QueryBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBbbCccRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
