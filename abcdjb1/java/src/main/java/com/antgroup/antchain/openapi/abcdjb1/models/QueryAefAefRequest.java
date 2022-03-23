// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abcdjb1.models;

import com.aliyun.tea.*;

public class QueryAefAefRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryAefAefRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAefAefRequest self = new QueryAefAefRequest();
        return TeaModel.build(map, self);
    }

    public QueryAefAefRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAefAefRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
