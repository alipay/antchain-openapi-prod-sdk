// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class UpdateAntchainDasKyaDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对本次更新有控制权的 DID
    @NameInMap("controller_did")
    @Validation(required = true)
    public String controllerDid;

    // 目标 DID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 正整数字符串；从 resolve 的 data.didDocumentMetadata.versionId 获取当前的，然后+1即为期望的版本号
    @NameInMap("expected_version_id")
    @Validation(required = true)
    public String expectedVersionId;

    // 密钥更新信息
    @NameInMap("verification_method_changes")
    public java.util.List<VerificationMethodChange> verificationMethodChanges;

    // 服务变更信息
    @NameInMap("service_changes")
    public java.util.List<ServiceChange> serviceChanges;

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

    // 更新后的完整 A2A 接入信息；覆盖原值
    @NameInMap("a2a")
    public AgentAtoAInfo a2a;

    // 更新后的业务实体标识，覆盖原值
    @NameInMap("entity_id")
    public String entityId;

    // 更新后的 Agent 名称，覆盖原值
    @NameInMap("entity_name")
    public String entityName;

    // 更新后的扩展资料 JSON，覆盖原值
    @NameInMap("extra_info")
    public String extraInfo;

    // 更新后的完整能力描述列表，覆盖原值
    @NameInMap("capabilities")
    public java.util.List<AgentCapabilityDTO> capabilities;

    public static UpdateAntchainDasKyaDidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntchainDasKyaDidRequest self = new UpdateAntchainDasKyaDidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntchainDasKyaDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntchainDasKyaDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAntchainDasKyaDidRequest setControllerDid(String controllerDid) {
        this.controllerDid = controllerDid;
        return this;
    }
    public String getControllerDid() {
        return this.controllerDid;
    }

    public UpdateAntchainDasKyaDidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateAntchainDasKyaDidRequest setExpectedVersionId(String expectedVersionId) {
        this.expectedVersionId = expectedVersionId;
        return this;
    }
    public String getExpectedVersionId() {
        return this.expectedVersionId;
    }

    public UpdateAntchainDasKyaDidRequest setVerificationMethodChanges(java.util.List<VerificationMethodChange> verificationMethodChanges) {
        this.verificationMethodChanges = verificationMethodChanges;
        return this;
    }
    public java.util.List<VerificationMethodChange> getVerificationMethodChanges() {
        return this.verificationMethodChanges;
    }

    public UpdateAntchainDasKyaDidRequest setServiceChanges(java.util.List<ServiceChange> serviceChanges) {
        this.serviceChanges = serviceChanges;
        return this;
    }
    public java.util.List<ServiceChange> getServiceChanges() {
        return this.serviceChanges;
    }

    public UpdateAntchainDasKyaDidRequest setControllerKeyId(String controllerKeyId) {
        this.controllerKeyId = controllerKeyId;
        return this;
    }
    public String getControllerKeyId() {
        return this.controllerKeyId;
    }

    public UpdateAntchainDasKyaDidRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public UpdateAntchainDasKyaDidRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

    public UpdateAntchainDasKyaDidRequest setA2a(AgentAtoAInfo a2a) {
        this.a2a = a2a;
        return this;
    }
    public AgentAtoAInfo getA2a() {
        return this.a2a;
    }

    public UpdateAntchainDasKyaDidRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public UpdateAntchainDasKyaDidRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public UpdateAntchainDasKyaDidRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateAntchainDasKyaDidRequest setCapabilities(java.util.List<AgentCapabilityDTO> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<AgentCapabilityDTO> getCapabilities() {
        return this.capabilities;
    }

}
