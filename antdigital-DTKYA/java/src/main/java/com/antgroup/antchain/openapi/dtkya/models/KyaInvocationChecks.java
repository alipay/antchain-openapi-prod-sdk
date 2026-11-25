// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaInvocationChecks extends TeaModel {
    // 核验 Agent DID、签名、nonce 与时效的结果。
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("agent_identity")
    @Validation(required = true)
    public String agentIdentity;

    // 核验 AAP 状态、有效期及必要实人确认的结果。
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("aap")
    @Validation(required = true)
    public String aap;

    // 核验原始意图、服务操作及业务参数是否在 AAP 授权范围内的结果。
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("intent_and_scope")
    @Validation(required = true)
    public String intentAndScope;

    public static KyaInvocationChecks build(java.util.Map<String, ?> map) throws Exception {
        KyaInvocationChecks self = new KyaInvocationChecks();
        return TeaModel.build(map, self);
    }

    public KyaInvocationChecks setAgentIdentity(String agentIdentity) {
        this.agentIdentity = agentIdentity;
        return this;
    }
    public String getAgentIdentity() {
        return this.agentIdentity;
    }

    public KyaInvocationChecks setAap(String aap) {
        this.aap = aap;
        return this;
    }
    public String getAap() {
        return this.aap;
    }

    public KyaInvocationChecks setIntentAndScope(String intentAndScope) {
        this.intentAndScope = intentAndScope;
        return this;
    }
    public String getIntentAndScope() {
        return this.intentAndScope;
    }

}
