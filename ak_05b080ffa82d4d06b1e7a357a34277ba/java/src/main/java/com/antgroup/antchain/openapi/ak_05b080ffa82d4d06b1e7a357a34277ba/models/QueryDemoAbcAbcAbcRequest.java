// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_05b080ffa82d4d06b1e7a357a34277ba.models;

import com.aliyun.tea.*;

public class QueryDemoAbcAbcAbcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryDemoAbcAbcAbcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAbcAbcAbcRequest self = new QueryDemoAbcAbcAbcRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoAbcAbcAbcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoAbcAbcAbcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
