// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAaaBbbCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static QueryAaaBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAaaBbbCccRequest self = new QueryAaaBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public QueryAaaBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAaaBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAaaBbbCccRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
