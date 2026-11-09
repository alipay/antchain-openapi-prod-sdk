// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaBindingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // agent 的did
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // agent签名对应的keyId
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // agent签名的一个随机字符串
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // agent签名结果
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    // 查询目标agent的did
    @NameInMap("target_agent_did")
    @Validation(required = true)
    public String targetAgentDid;

    public static QueryAntchainDasKyaBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaBindingRequest self = new QueryAntchainDasKyaBindingRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaBindingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaBindingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaBindingRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaBindingRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QueryAntchainDasKyaBindingRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public QueryAntchainDasKyaBindingRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

    public QueryAntchainDasKyaBindingRequest setTargetAgentDid(String targetAgentDid) {
        this.targetAgentDid = targetAgentDid;
        return this;
    }
    public String getTargetAgentDid() {
        return this.targetAgentDid;
    }

}
