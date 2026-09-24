// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaEvidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易哈希，与credential_id必须且只能填写一个
    @NameInMap("tx_hash")
    public String txHash;

    // 提交存证时的业务ID，与tx_hash二选一
    @NameInMap("credential_id")
    public String credentialId;

    // 待核验原始JSON字符串，UTF8字节精确比对，最大16384字节
    @NameInMap("onchain_payload")
    @Validation(required = true)
    public String onchainPayload;

    public static VerifyAntchainDasKyaEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaEvidenceRequest self = new VerifyAntchainDasKyaEvidenceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaEvidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainDasKyaEvidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainDasKyaEvidenceRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public VerifyAntchainDasKyaEvidenceRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public VerifyAntchainDasKyaEvidenceRequest setOnchainPayload(String onchainPayload) {
        this.onchainPayload = onchainPayload;
        return this;
    }
    public String getOnchainPayload() {
        return this.onchainPayload;
    }

}
