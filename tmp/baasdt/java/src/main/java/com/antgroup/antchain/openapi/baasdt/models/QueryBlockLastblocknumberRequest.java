// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockLastblocknumberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    public static QueryBlockLastblocknumberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockLastblocknumberRequest self = new QueryBlockLastblocknumberRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockLastblocknumberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockLastblocknumberRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockLastblocknumberRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

}
