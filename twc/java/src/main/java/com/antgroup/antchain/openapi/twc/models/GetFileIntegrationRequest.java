// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetFileIntegrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 完成存证接口中获取的交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static GetFileIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileIntegrationRequest self = new GetFileIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public GetFileIntegrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetFileIntegrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetFileIntegrationRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
