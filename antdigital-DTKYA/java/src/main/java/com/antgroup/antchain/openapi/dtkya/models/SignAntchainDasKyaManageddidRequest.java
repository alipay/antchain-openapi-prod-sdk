// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SignAntchainDasKyaManageddidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前租户下的托管did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 待签名原始字节的 Base64，解码后最大 1 MiB
    @NameInMap("message_base64")
    @Validation(required = true)
    public String messageBase64;

    public static SignAntchainDasKyaManageddidRequest build(java.util.Map<String, ?> map) throws Exception {
        SignAntchainDasKyaManageddidRequest self = new SignAntchainDasKyaManageddidRequest();
        return TeaModel.build(map, self);
    }

    public SignAntchainDasKyaManageddidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignAntchainDasKyaManageddidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignAntchainDasKyaManageddidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public SignAntchainDasKyaManageddidRequest setMessageBase64(String messageBase64) {
        this.messageBase64 = messageBase64;
        return this;
    }
    public String getMessageBase64() {
        return this.messageBase64;
    }

}
