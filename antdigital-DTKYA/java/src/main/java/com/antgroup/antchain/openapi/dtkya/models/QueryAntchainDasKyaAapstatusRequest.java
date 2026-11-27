// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaAapstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待查询的授权 ID；一份授权可包含多个 AAP 协议。
    @NameInMap("authorization_id")
    @Validation(required = true)
    public String authorizationId;

    // 当前 Agent 的 DID；须与该授权归属的 Agent 一致。
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // Agent DID 文档中的签名密钥 ID。
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 本次查询的一次性随机值。
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // Agent 私钥对 nonce 的签名，用于身份核验。
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static QueryAntchainDasKyaAapstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaAapstatusRequest self = new QueryAntchainDasKyaAapstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaAapstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaAapstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaAapstatusRequest setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    public QueryAntchainDasKyaAapstatusRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaAapstatusRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QueryAntchainDasKyaAapstatusRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public QueryAntchainDasKyaAapstatusRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
