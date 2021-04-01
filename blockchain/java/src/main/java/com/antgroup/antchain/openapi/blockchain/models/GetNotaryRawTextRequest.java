// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetNotaryRawTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链的唯一性标示
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 存证哈希
    @NameInMap("transaction_hash")
    @Validation(required = true)
    public String transactionHash;

    public static GetNotaryRawTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryRawTextRequest self = new GetNotaryRawTextRequest();
        return TeaModel.build(map, self);
    }

    public GetNotaryRawTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetNotaryRawTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetNotaryRawTextRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public GetNotaryRawTextRequest setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

}
