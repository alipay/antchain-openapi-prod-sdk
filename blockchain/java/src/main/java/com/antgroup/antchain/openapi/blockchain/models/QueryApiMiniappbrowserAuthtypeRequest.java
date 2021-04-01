// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiMiniappbrowserAuthtypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链 ID
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    public static QueryApiMiniappbrowserAuthtypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiMiniappbrowserAuthtypeRequest self = new QueryApiMiniappbrowserAuthtypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiMiniappbrowserAuthtypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiMiniappbrowserAuthtypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiMiniappbrowserAuthtypeRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
