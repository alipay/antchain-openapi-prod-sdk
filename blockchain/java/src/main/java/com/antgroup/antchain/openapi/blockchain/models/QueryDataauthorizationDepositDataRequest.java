// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDataauthorizationDepositDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证交易hash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static QueryDataauthorizationDepositDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataauthorizationDepositDataRequest self = new QueryDataauthorizationDepositDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataauthorizationDepositDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataauthorizationDepositDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDataauthorizationDepositDataRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
