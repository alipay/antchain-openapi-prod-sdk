// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RevokeAntchainDasKyaVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vcId
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 随机值
    @NameInMap("nonce")
    public String nonce;

    // 发起者did
    @NameInMap("did")
    public String did;

    // 发起者密钥 keyId
    @NameInMap("key_id")
    public String keyId;

    // 发起者密钥对 nonce 的独立签名
    @NameInMap("nonce_signature")
    public String nonceSignature;

    // 状态变更原因代码
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 详细说明
    @NameInMap("reason_detail")
    public String reasonDetail;

    public static RevokeAntchainDasKyaVcRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeAntchainDasKyaVcRequest self = new RevokeAntchainDasKyaVcRequest();
        return TeaModel.build(map, self);
    }

    public RevokeAntchainDasKyaVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RevokeAntchainDasKyaVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RevokeAntchainDasKyaVcRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public RevokeAntchainDasKyaVcRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public RevokeAntchainDasKyaVcRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public RevokeAntchainDasKyaVcRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public RevokeAntchainDasKyaVcRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

    public RevokeAntchainDasKyaVcRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RevokeAntchainDasKyaVcRequest setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
        return this;
    }
    public String getReasonDetail() {
        return this.reasonDetail;
    }

}
