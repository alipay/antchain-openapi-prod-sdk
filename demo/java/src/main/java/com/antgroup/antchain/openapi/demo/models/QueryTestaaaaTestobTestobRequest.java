// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestaaaaTestobTestobRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryTestaaaaTestobTestobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestaaaaTestobTestobRequest self = new QueryTestaaaaTestobTestobRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestaaaaTestobTestobRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestaaaaTestobTestobRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
