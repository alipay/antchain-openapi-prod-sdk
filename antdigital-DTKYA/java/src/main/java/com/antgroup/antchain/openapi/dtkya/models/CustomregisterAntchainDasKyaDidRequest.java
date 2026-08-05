// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class CustomregisterAntchainDasKyaDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对目标 DID 有控制权的 DID；自控制场景填写与 did 相同的值
    @NameInMap("controller_did")
    @Validation(required = true)
    public String controllerDid;

    // 枚举：INSTITUTION、AGENT、COMMON
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 1～128；租户内稳定业务实体标识
    @NameInMap("entity_id")
    public String entityId;

    // 1～256；entityType=INSTITUTION 时必填，其他类型可选
    @NameInMap("entity_name")
    public String entityName;

    // 业务方指定的自定义 DID，method需要跟服务提供方报备
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 密钥信息
    @NameInMap("verification_methods")
    @Validation(required = true)
    public java.util.List<VerificationMethodInput> verificationMethods;

    // 暴露的服务能力端点
    @NameInMap("services")
    public java.util.List<ServiceInput> services;

    // 业务扩展文本，仅由 dtkya 保存；建议传“JSON 对象序列化后的字符串”，但字段类型保持 String，dtkya 不解析其内部结构
    @NameInMap("extra_info")
    public String extraInfo;

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

    public static CustomregisterAntchainDasKyaDidRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomregisterAntchainDasKyaDidRequest self = new CustomregisterAntchainDasKyaDidRequest();
        return TeaModel.build(map, self);
    }

    public CustomregisterAntchainDasKyaDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CustomregisterAntchainDasKyaDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CustomregisterAntchainDasKyaDidRequest setControllerDid(String controllerDid) {
        this.controllerDid = controllerDid;
        return this;
    }
    public String getControllerDid() {
        return this.controllerDid;
    }

    public CustomregisterAntchainDasKyaDidRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CustomregisterAntchainDasKyaDidRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CustomregisterAntchainDasKyaDidRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public CustomregisterAntchainDasKyaDidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CustomregisterAntchainDasKyaDidRequest setVerificationMethods(java.util.List<VerificationMethodInput> verificationMethods) {
        this.verificationMethods = verificationMethods;
        return this;
    }
    public java.util.List<VerificationMethodInput> getVerificationMethods() {
        return this.verificationMethods;
    }

    public CustomregisterAntchainDasKyaDidRequest setServices(java.util.List<ServiceInput> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ServiceInput> getServices() {
        return this.services;
    }

    public CustomregisterAntchainDasKyaDidRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CustomregisterAntchainDasKyaDidRequest setControllerKeyId(String controllerKeyId) {
        this.controllerKeyId = controllerKeyId;
        return this;
    }
    public String getControllerKeyId() {
        return this.controllerKeyId;
    }

    public CustomregisterAntchainDasKyaDidRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public CustomregisterAntchainDasKyaDidRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
