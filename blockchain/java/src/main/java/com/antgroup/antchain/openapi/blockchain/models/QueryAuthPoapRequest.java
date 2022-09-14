// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthPoapRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // POAP徽章ID
    @NameInMap("poap_id")
    @Validation(required = true)
    public String poapId;

    public static QueryAuthPoapRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthPoapRequest self = new QueryAuthPoapRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthPoapRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthPoapRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthPoapRequest setPoapId(String poapId) {
        this.poapId = poapId;
        return this;
    }
    public String getPoapId() {
        return this.poapId;
    }

}
