// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsSkuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 环境标识
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    public static QueryMypointsSkuRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsSkuRequest self = new QueryMypointsSkuRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypointsSkuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypointsSkuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypointsSkuRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMypointsSkuRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

}
