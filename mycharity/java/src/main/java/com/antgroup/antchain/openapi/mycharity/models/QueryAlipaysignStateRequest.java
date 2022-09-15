// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class QueryAlipaysignStateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签约记录id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static QueryAlipaysignStateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlipaysignStateRequest self = new QueryAlipaysignStateRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlipaysignStateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlipaysignStateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAlipaysignStateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
