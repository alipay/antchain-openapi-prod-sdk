// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryWwwwEeeeRrrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryWwwwEeeeRrrRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWwwwEeeeRrrRequest self = new QueryWwwwEeeeRrrRequest();
        return TeaModel.build(map, self);
    }

    public QueryWwwwEeeeRrrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWwwwEeeeRrrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
