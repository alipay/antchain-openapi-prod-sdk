// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaInvocationAgentRequest extends TeaModel {
    // 发起调用的 Agent DID。
    /**
     * <strong>example:</strong>
     * <p>did:antchain:agent-a</p>
     */
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // Agent 签名所用的公钥 ID。
    /**
     * <strong>example:</strong>
     * <p>key-1</p>
     */
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 已生效的 AAP 授权实例 ID；服务要求授权时必传。
    /**
     * <strong>example:</strong>
     * <p>AAP-001</p>
     */
    @NameInMap("aap_id")
    public String aapId;

    // 用户原始意图，须与 AAP 授权记录及签名内容一致。
    /**
     * <strong>example:</strong>
     * <p>帮我查询附近的银行网点</p>
     */
    @NameInMap("original_intent")
    @Validation(required = true)
    public String originalIntent;

    // 实际业务参数的规范化 JSON 字符串，纳入签名并与授权范围比对。
    /**
     * <strong>example:</strong>
     * <p>{&quot;city&quot;:&quot;杭州&quot;}</p>
     */
    @NameInMap("input_json")
    @Validation(required = true)
    public String inputJson;

    // 一次性随机值，用于防重放。
    /**
     * <strong>example:</strong>
     * <p>N-7f8c</p>
     */
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // Agent 签名请求时间，ISO 8601 UTC。
    /**
     * <strong>example:</strong>
     * <p>2026-11-24T09:00:00Z</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 覆盖 service_id、operation 及 agent_request 除本字段外所有字段的 Agent 签名。
    /**
     * <strong>example:</strong>
     * <p>base64:...</p>
     */
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static KyaInvocationAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        KyaInvocationAgentRequest self = new KyaInvocationAgentRequest();
        return TeaModel.build(map, self);
    }

    public KyaInvocationAgentRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public KyaInvocationAgentRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public KyaInvocationAgentRequest setAapId(String aapId) {
        this.aapId = aapId;
        return this;
    }
    public String getAapId() {
        return this.aapId;
    }

    public KyaInvocationAgentRequest setOriginalIntent(String originalIntent) {
        this.originalIntent = originalIntent;
        return this;
    }
    public String getOriginalIntent() {
        return this.originalIntent;
    }

    public KyaInvocationAgentRequest setInputJson(String inputJson) {
        this.inputJson = inputJson;
        return this;
    }
    public String getInputJson() {
        return this.inputJson;
    }

    public KyaInvocationAgentRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public KyaInvocationAgentRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public KyaInvocationAgentRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
