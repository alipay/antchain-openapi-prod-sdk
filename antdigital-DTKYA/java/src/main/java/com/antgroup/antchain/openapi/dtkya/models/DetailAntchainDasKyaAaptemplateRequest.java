// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DetailAntchainDasKyaAaptemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务详情返回的 AAP 模板资源 ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // agent did身份
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // nonce随机字符串
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // agent签名使用的keyId
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // agent的key对nonce值的签名结果
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static DetailAntchainDasKyaAaptemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAntchainDasKyaAaptemplateRequest self = new DetailAntchainDasKyaAaptemplateRequest();
        return TeaModel.build(map, self);
    }

    public DetailAntchainDasKyaAaptemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAntchainDasKyaAaptemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAntchainDasKyaAaptemplateRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DetailAntchainDasKyaAaptemplateRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public DetailAntchainDasKyaAaptemplateRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public DetailAntchainDasKyaAaptemplateRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DetailAntchainDasKyaAaptemplateRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
