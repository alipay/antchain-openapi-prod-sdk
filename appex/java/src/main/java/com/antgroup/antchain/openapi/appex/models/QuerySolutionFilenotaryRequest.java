// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QuerySolutionFilenotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用did
    // 
    @NameInMap("app_did")
    @Validation(required = true)
    public String appDid;

    // 存证哈希
    // 
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static QuerySolutionFilenotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionFilenotaryRequest self = new QuerySolutionFilenotaryRequest();
        return TeaModel.build(map, self);
    }

    public QuerySolutionFilenotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySolutionFilenotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySolutionFilenotaryRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public QuerySolutionFilenotaryRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
