// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainBrowserReceiptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // hash
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static QueryChainBrowserReceiptRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainBrowserReceiptRequest self = new QueryChainBrowserReceiptRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainBrowserReceiptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainBrowserReceiptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainBrowserReceiptRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public QueryChainBrowserReceiptRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public QueryChainBrowserReceiptRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
