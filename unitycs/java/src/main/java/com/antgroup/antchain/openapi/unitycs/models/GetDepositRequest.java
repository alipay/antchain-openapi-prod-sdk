// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unitycs.models;

import com.aliyun.tea.*;

public class GetDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 元数据编码
    @NameInMap("metadata_code")
    @Validation(required = true)
    public String metadataCode;

    // 交易hash，与identify两者必须至少传入一个，两者都输入时，以tx_hash为准
    @NameInMap("tx_hash")
    public String txHash;

    // 数据标识，与交易hash（tx_hash）两者必须至少传入一个，两者都输入时，以tx_hash为准
    @NameInMap("identify")
    public String identify;

    public static GetDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDepositRequest self = new GetDepositRequest();
        return TeaModel.build(map, self);
    }

    public GetDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDepositRequest setMetadataCode(String metadataCode) {
        this.metadataCode = metadataCode;
        return this;
    }
    public String getMetadataCode() {
        return this.metadataCode;
    }

    public GetDepositRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public GetDepositRequest setIdentify(String identify) {
        this.identify = identify;
        return this;
    }
    public String getIdentify() {
        return this.identify;
    }

}
