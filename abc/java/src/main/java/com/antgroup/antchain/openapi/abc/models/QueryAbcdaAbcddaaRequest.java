// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class QueryAbcdaAbcddaaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryAbcdaAbcddaaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAbcdaAbcddaaRequest self = new QueryAbcdaAbcddaaRequest();
        return TeaModel.build(map, self);
    }

    public QueryAbcdaAbcddaaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAbcdaAbcddaaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
