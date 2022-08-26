// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class QueryBaasOdatsBlockchainContractinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链id
    @NameInMap("blockchain_id")
    @Validation(required = true)
    public String blockchainId;

    public static QueryBaasOdatsBlockchainContractinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasOdatsBlockchainContractinfoRequest self = new QueryBaasOdatsBlockchainContractinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasOdatsBlockchainContractinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasOdatsBlockchainContractinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasOdatsBlockchainContractinfoRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

}
