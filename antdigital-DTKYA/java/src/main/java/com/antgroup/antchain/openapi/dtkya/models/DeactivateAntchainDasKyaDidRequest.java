// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DeactivateAntchainDasKyaDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对本次停用有控制权的 DID
    @NameInMap("controller_did")
    @Validation(required = true)
    public String controllerDid;

    // 目标 DID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 停用原因
    @NameInMap("reason")
    public String reason;

    // controllerDid 最新权威 Document 中具有 capabilityInvocation 的完整 key ID
    @NameInMap("controller_key_id")
    @Validation(required = true)
    public String controllerKeyId;

    // 一次性随机数，同一 controller 不得重复使用
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 对 nonce UTF-8 字节的 Ed25519 签名，使用 base58-btc Multibase String
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static DeactivateAntchainDasKyaDidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactivateAntchainDasKyaDidRequest self = new DeactivateAntchainDasKyaDidRequest();
        return TeaModel.build(map, self);
    }

    public DeactivateAntchainDasKyaDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeactivateAntchainDasKyaDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeactivateAntchainDasKyaDidRequest setControllerDid(String controllerDid) {
        this.controllerDid = controllerDid;
        return this;
    }
    public String getControllerDid() {
        return this.controllerDid;
    }

    public DeactivateAntchainDasKyaDidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DeactivateAntchainDasKyaDidRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DeactivateAntchainDasKyaDidRequest setControllerKeyId(String controllerKeyId) {
        this.controllerKeyId = controllerKeyId;
        return this;
    }
    public String getControllerKeyId() {
        return this.controllerKeyId;
    }

    public DeactivateAntchainDasKyaDidRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public DeactivateAntchainDasKyaDidRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
