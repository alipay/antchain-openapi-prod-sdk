// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsMerchantbalanceRequest extends TeaModel {
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

    // 环境标识
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    public static QueryMypointsMerchantbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsMerchantbalanceRequest self = new QueryMypointsMerchantbalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypointsMerchantbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypointsMerchantbalanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypointsMerchantbalanceRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMypointsMerchantbalanceRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

}
