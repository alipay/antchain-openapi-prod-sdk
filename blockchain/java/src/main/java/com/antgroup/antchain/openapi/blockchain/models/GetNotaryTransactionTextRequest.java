// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetNotaryTransactionTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证凭据
    @NameInMap("transaction_hash")
    @Validation(required = true)
    public String transactionHash;

    public static GetNotaryTransactionTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryTransactionTextRequest self = new GetNotaryTransactionTextRequest();
        return TeaModel.build(map, self);
    }

    public GetNotaryTransactionTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetNotaryTransactionTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetNotaryTransactionTextRequest setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

}
