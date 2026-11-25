// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class GrantAntchainDasKyaAapRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提交方 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // Agent 签名密钥 ID
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // Agent 本次请求的防重放值
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // Agent 对 nonce 的 Ed25519 签名
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    // AAP 授权模板 ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 授权用户引用
    @NameInMap("user_ref")
    public String userRef;

    // 用户原始自然语言要求
    @NameInMap("original_intent")
    @Validation(required = true)
    public String originalIntent;

    // 按 AAP 模板填写的授权字段 JSON 对象
    @NameInMap("field_values")
    @Validation(required = true)
    public String fieldValues;

    // 含时区的 ISO 8601 授权截止时间
    @NameInMap("expires_at")
    @Validation(required = true)
    public String expiresAt;

    // 可信用户确认凭据引用
    @NameInMap("confirmation_ref")
    public String confirmationRef;

    // 模板要求实人核验时提供的结果引用
    @NameInMap("real_person_verification_ref")
    public String realPersonVerificationRef;

    public static GrantAntchainDasKyaAapRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAntchainDasKyaAapRequest self = new GrantAntchainDasKyaAapRequest();
        return TeaModel.build(map, self);
    }

    public GrantAntchainDasKyaAapRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GrantAntchainDasKyaAapRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GrantAntchainDasKyaAapRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public GrantAntchainDasKyaAapRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GrantAntchainDasKyaAapRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public GrantAntchainDasKyaAapRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

    public GrantAntchainDasKyaAapRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GrantAntchainDasKyaAapRequest setUserRef(String userRef) {
        this.userRef = userRef;
        return this;
    }
    public String getUserRef() {
        return this.userRef;
    }

    public GrantAntchainDasKyaAapRequest setOriginalIntent(String originalIntent) {
        this.originalIntent = originalIntent;
        return this;
    }
    public String getOriginalIntent() {
        return this.originalIntent;
    }

    public GrantAntchainDasKyaAapRequest setFieldValues(String fieldValues) {
        this.fieldValues = fieldValues;
        return this;
    }
    public String getFieldValues() {
        return this.fieldValues;
    }

    public GrantAntchainDasKyaAapRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public GrantAntchainDasKyaAapRequest setConfirmationRef(String confirmationRef) {
        this.confirmationRef = confirmationRef;
        return this;
    }
    public String getConfirmationRef() {
        return this.confirmationRef;
    }

    public GrantAntchainDasKyaAapRequest setRealPersonVerificationRef(String realPersonVerificationRef) {
        this.realPersonVerificationRef = realPersonVerificationRef;
        return this;
    }
    public String getRealPersonVerificationRef() {
        return this.realPersonVerificationRef;
    }

}
