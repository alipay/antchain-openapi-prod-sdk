// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaLtworeviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务幂等请求 ID；相同审核决定重试时保持不变
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 待审核 Agent 的 DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 待审核事项唯一标识，同时标识本次问题
    @NameInMap("review_id")
    @Validation(required = true)
    public String reviewId;

    // 控制者结论：NORMAL 或 ABNORMAL
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // 本次确认的 Turn 引用 JSON 数组，顺序须与签名原文一致
    @NameInMap("turn_refs")
    @Validation(required = true)
    public String turnRefs;

    // 作出审核决定的控制者 DID
    @NameInMap("controller_did")
    @Validation(required = true)
    public String controllerDid;

    // 控制者用于签名的有效密钥 ID
    @NameInMap("controller_key_id")
    @Validation(required = true)
    public String controllerKeyId;

    // 本次签名随机数，用于防止重放
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 签名签发时间，UTC RFC3339
    @NameInMap("issued_at")
    @Validation(required = true)
    public String issuedAt;

    // 签名过期时间，最长有效期五分钟
    @NameInMap("expires_at")
    @Validation(required = true)
    public String expiresAt;

    // 完整签名 JSON 原文，须覆盖审核请求全部关键字段
    @NameInMap("signed_payload")
    @Validation(required = true)
    public String signedPayload;

    // 控制者对 signed_payload 原始字节的 Ed25519 Multibase 签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static PushAntchainDasKyaLtworeviewRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaLtworeviewRequest self = new PushAntchainDasKyaLtworeviewRequest();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaLtworeviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntchainDasKyaLtworeviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAntchainDasKyaLtworeviewRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushAntchainDasKyaLtworeviewRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaLtworeviewRequest setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

    public PushAntchainDasKyaLtworeviewRequest setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public PushAntchainDasKyaLtworeviewRequest setTurnRefs(String turnRefs) {
        this.turnRefs = turnRefs;
        return this;
    }
    public String getTurnRefs() {
        return this.turnRefs;
    }

    public PushAntchainDasKyaLtworeviewRequest setControllerDid(String controllerDid) {
        this.controllerDid = controllerDid;
        return this;
    }
    public String getControllerDid() {
        return this.controllerDid;
    }

    public PushAntchainDasKyaLtworeviewRequest setControllerKeyId(String controllerKeyId) {
        this.controllerKeyId = controllerKeyId;
        return this;
    }
    public String getControllerKeyId() {
        return this.controllerKeyId;
    }

    public PushAntchainDasKyaLtworeviewRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public PushAntchainDasKyaLtworeviewRequest setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }
    public String getIssuedAt() {
        return this.issuedAt;
    }

    public PushAntchainDasKyaLtworeviewRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public PushAntchainDasKyaLtworeviewRequest setSignedPayload(String signedPayload) {
        this.signedPayload = signedPayload;
        return this;
    }
    public String getSignedPayload() {
        return this.signedPayload;
    }

    public PushAntchainDasKyaLtworeviewRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
