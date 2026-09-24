// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SubmitAntchainDasKyaEvidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 本次存证关联的DID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 稳定凭证编号
    @NameInMap("credential_id")
    @Validation(required = true)
    public String credentialId;

    // 链上payload原文JSON字符串
    @NameInMap("onchain_payload")
    @Validation(required = true)
    public String onchainPayload;

    // 授权DID验证密钥标识
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 毫秒级一次性授权nonce
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 对nonce UTF-8字节的DID签名
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static SubmitAntchainDasKyaEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainDasKyaEvidenceRequest self = new SubmitAntchainDasKyaEvidenceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainDasKyaEvidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainDasKyaEvidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainDasKyaEvidenceRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public SubmitAntchainDasKyaEvidenceRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public SubmitAntchainDasKyaEvidenceRequest setOnchainPayload(String onchainPayload) {
        this.onchainPayload = onchainPayload;
        return this;
    }
    public String getOnchainPayload() {
        return this.onchainPayload;
    }

    public SubmitAntchainDasKyaEvidenceRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public SubmitAntchainDasKyaEvidenceRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public SubmitAntchainDasKyaEvidenceRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
