// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_98520c7e7d21426d90860804b9a37c5f.models;

import com.aliyun.tea.*;

public class GetTwcNotaryCertificateDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证哈希地址
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static GetTwcNotaryCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTwcNotaryCertificateDetailRequest self = new GetTwcNotaryCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetTwcNotaryCertificateDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTwcNotaryCertificateDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTwcNotaryCertificateDetailRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
