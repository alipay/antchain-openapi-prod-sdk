// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchqueryChainBrowserTransactionRequest extends TeaModel {
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

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static BatchqueryChainBrowserTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryChainBrowserTransactionRequest self = new BatchqueryChainBrowserTransactionRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryChainBrowserTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryChainBrowserTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryChainBrowserTransactionRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public BatchqueryChainBrowserTransactionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
