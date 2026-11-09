// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaIdentityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // collaboration_id
    @NameInMap("collaboration_id")
    @Validation(required = true)
    public String collaborationId;

    // verifier_did
    @NameInMap("verifier_did")
    @Validation(required = true)
    public String verifierDid;

    // subject_did
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // challenge_id
    @NameInMap("challenge_id")
    @Validation(required = true)
    public String challengeId;

    // nonce
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // subject_key_id
    @NameInMap("subject_key_id")
    @Validation(required = true)
    public String subjectKeyId;

    // issued_at
    @NameInMap("issued_at")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String issuedAt;

    // expires_at
    @NameInMap("expires_at")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expiresAt;

    // signature
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static VerifyAntchainDasKyaIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaIdentityRequest self = new VerifyAntchainDasKyaIdentityRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaIdentityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainDasKyaIdentityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainDasKyaIdentityRequest setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
        return this;
    }
    public String getCollaborationId() {
        return this.collaborationId;
    }

    public VerifyAntchainDasKyaIdentityRequest setVerifierDid(String verifierDid) {
        this.verifierDid = verifierDid;
        return this;
    }
    public String getVerifierDid() {
        return this.verifierDid;
    }

    public VerifyAntchainDasKyaIdentityRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public VerifyAntchainDasKyaIdentityRequest setChallengeId(String challengeId) {
        this.challengeId = challengeId;
        return this;
    }
    public String getChallengeId() {
        return this.challengeId;
    }

    public VerifyAntchainDasKyaIdentityRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public VerifyAntchainDasKyaIdentityRequest setSubjectKeyId(String subjectKeyId) {
        this.subjectKeyId = subjectKeyId;
        return this;
    }
    public String getSubjectKeyId() {
        return this.subjectKeyId;
    }

    public VerifyAntchainDasKyaIdentityRequest setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }
    public String getIssuedAt() {
        return this.issuedAt;
    }

    public VerifyAntchainDasKyaIdentityRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public VerifyAntchainDasKyaIdentityRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
