// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateMerchantUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 用户的did信息
    @NameInMap("did")
    public String did;

    // 用户名
    @NameInMap("local_id")
    @Validation(required = true)
    public String localId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static CreateMerchantUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMerchantUserRequest self = new CreateMerchantUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateMerchantUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMerchantUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMerchantUserRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateMerchantUserRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateMerchantUserRequest setLocalId(String localId) {
        this.localId = localId;
        return this;
    }
    public String getLocalId() {
        return this.localId;
    }

    public CreateMerchantUserRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
