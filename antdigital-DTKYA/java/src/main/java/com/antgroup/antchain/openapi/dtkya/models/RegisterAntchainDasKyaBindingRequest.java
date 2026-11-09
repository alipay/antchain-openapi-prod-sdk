// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaBindingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 关联实体对应的did
    @NameInMap("controller_did")
    @Validation(required = true)
    public String controllerDid;

    // agent对应的did
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 控制实体对应的key Id
    @NameInMap("controller_key_id")
    @Validation(required = true)
    public String controllerKeyId;

    // 实体名称
    @NameInMap("controller_name")
    @Validation(required = true)
    public String controllerName;

    // 调用方生成的单次随机原文
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 对 nonce UTF-8 字节的 Ed25519 签名
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static RegisterAntchainDasKyaBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaBindingRequest self = new RegisterAntchainDasKyaBindingRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaBindingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAntchainDasKyaBindingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAntchainDasKyaBindingRequest setControllerDid(String controllerDid) {
        this.controllerDid = controllerDid;
        return this;
    }
    public String getControllerDid() {
        return this.controllerDid;
    }

    public RegisterAntchainDasKyaBindingRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public RegisterAntchainDasKyaBindingRequest setControllerKeyId(String controllerKeyId) {
        this.controllerKeyId = controllerKeyId;
        return this;
    }
    public String getControllerKeyId() {
        return this.controllerKeyId;
    }

    public RegisterAntchainDasKyaBindingRequest setControllerName(String controllerName) {
        this.controllerName = controllerName;
        return this;
    }
    public String getControllerName() {
        return this.controllerName;
    }

    public RegisterAntchainDasKyaBindingRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public RegisterAntchainDasKyaBindingRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
