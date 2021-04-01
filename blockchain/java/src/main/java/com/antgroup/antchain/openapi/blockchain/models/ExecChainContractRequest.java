// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecChainContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // transaction
    @NameInMap("transaction")
    @Validation(required = true)
    public String transaction;

    public static ExecChainContractRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecChainContractRequest self = new ExecChainContractRequest();
        return TeaModel.build(map, self);
    }

    public ExecChainContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecChainContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecChainContractRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecChainContractRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ExecChainContractRequest setTransaction(String transaction) {
        this.transaction = transaction;
        return this;
    }
    public String getTransaction() {
        return this.transaction;
    }

}
