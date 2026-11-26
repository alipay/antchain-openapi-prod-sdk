// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaServiceAccessAgentRequest extends TeaModel {
    // 发起调用的 Agent DID
    /**
     * <strong>example:</strong>
     * <p>did:antchain:agent-a</p>
     */
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // Agent 签名所用公钥 ID
    /**
     * <strong>example:</strong>
     * <p>key-1</p>
     */
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 已生效的 AAP 授权实例 ID；服务要求授权时必传
    /**
     * <strong>example:</strong>
     * <p>AAP-001</p>
     */
    @NameInMap("aap_id")
    public String aapId;

    // 用户原始意图
    /**
     * <strong>example:</strong>
     * <p>查询杭州附近银行网点</p>
     */
    @NameInMap("original_intent")
    @Validation(required = true)
    public String originalIntent;

    // 实际业务参数的规范化 JSON 字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;city&quot;:&quot;杭州&quot;}</p>
     */
    @NameInMap("input_json")
    @Validation(required = true)
    public String inputJson;

    // 一次性随机值，用于防重放
    /**
     * <strong>example:</strong>
     * <p>N-001</p>
     */
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 签名请求时间，ISO 8601 UTC
    /**
     * <strong>example:</strong>
     * <p>2026-11-26T02:00:00Z</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 覆盖 service_id、operation 及 agent_request 除签名外字段的 Agent 签名
    /**
     * <strong>example:</strong>
     * <p>base64:...</p>
     */
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static KyaServiceAccessAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        KyaServiceAccessAgentRequest self = new KyaServiceAccessAgentRequest();
        return TeaModel.build(map, self);
    }

    public KyaServiceAccessAgentRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public KyaServiceAccessAgentRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public KyaServiceAccessAgentRequest setAapId(String aapId) {
        this.aapId = aapId;
        return this;
    }
    public String getAapId() {
        return this.aapId;
    }

    public KyaServiceAccessAgentRequest setOriginalIntent(String originalIntent) {
        this.originalIntent = originalIntent;
        return this;
    }
    public String getOriginalIntent() {
        return this.originalIntent;
    }

    public KyaServiceAccessAgentRequest setInputJson(String inputJson) {
        this.inputJson = inputJson;
        return this;
    }
    public String getInputJson() {
        return this.inputJson;
    }

    public KyaServiceAccessAgentRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public KyaServiceAccessAgentRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public KyaServiceAccessAgentRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
