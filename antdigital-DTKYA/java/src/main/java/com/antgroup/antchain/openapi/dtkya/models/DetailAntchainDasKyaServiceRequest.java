// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DetailAntchainDasKyaServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // Search 返回的稳定服务 ID，不接受服务名称或 Agent DID 替代
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 一个随机字符
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // agent身份id
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // agent签名使用的keyId
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // agent的key对nonce的签名结果
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static DetailAntchainDasKyaServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAntchainDasKyaServiceRequest self = new DetailAntchainDasKyaServiceRequest();
        return TeaModel.build(map, self);
    }

    public DetailAntchainDasKyaServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAntchainDasKyaServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAntchainDasKyaServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DetailAntchainDasKyaServiceRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public DetailAntchainDasKyaServiceRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public DetailAntchainDasKyaServiceRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DetailAntchainDasKyaServiceRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
