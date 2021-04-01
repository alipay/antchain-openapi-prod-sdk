// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainMiniappTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // transaction_hash
    @NameInMap("transaction_hash")
    @Validation(required = true)
    public String transactionHash;

    // phone_hash
    @NameInMap("phone_hash")
    @Validation(required = true)
    public String phoneHash;

    public static QueryChainMiniappTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainMiniappTransactionRequest self = new QueryChainMiniappTransactionRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainMiniappTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainMiniappTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainMiniappTransactionRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public QueryChainMiniappTransactionRequest setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public QueryChainMiniappTransactionRequest setPhoneHash(String phoneHash) {
        this.phoneHash = phoneHash;
        return this;
    }
    public String getPhoneHash() {
        return this.phoneHash;
    }

}
