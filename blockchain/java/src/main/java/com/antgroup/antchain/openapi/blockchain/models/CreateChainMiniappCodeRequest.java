// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainMiniappCodeRequest extends TeaModel {
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

    // transaction_hash
    @NameInMap("transaction_hash")
    @Validation(required = true)
    public String transactionHash;

    // contract_id
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    public static CreateChainMiniappCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainMiniappCodeRequest self = new CreateChainMiniappCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainMiniappCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainMiniappCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainMiniappCodeRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CreateChainMiniappCodeRequest setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public CreateChainMiniappCodeRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

}
