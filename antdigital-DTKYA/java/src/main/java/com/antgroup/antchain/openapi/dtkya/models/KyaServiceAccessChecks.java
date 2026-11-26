// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaServiceAccessChecks extends TeaModel {
    // Agent DID、签名、nonce 与时效核验结果
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("agent_identity")
    @Validation(required = true)
    public String agentIdentity;

    // AAP 状态、有效期与用户确认核验结果
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("aap")
    @Validation(required = true)
    public String aap;

    // 原始意图和业务参数授权范围核验结果
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("intent_and_scope")
    @Validation(required = true)
    public String intentAndScope;

    public static KyaServiceAccessChecks build(java.util.Map<String, ?> map) throws Exception {
        KyaServiceAccessChecks self = new KyaServiceAccessChecks();
        return TeaModel.build(map, self);
    }

    public KyaServiceAccessChecks setAgentIdentity(String agentIdentity) {
        this.agentIdentity = agentIdentity;
        return this;
    }
    public String getAgentIdentity() {
        return this.agentIdentity;
    }

    public KyaServiceAccessChecks setAap(String aap) {
        this.aap = aap;
        return this;
    }
    public String getAap() {
        return this.aap;
    }

    public KyaServiceAccessChecks setIntentAndScope(String intentAndScope) {
        this.intentAndScope = intentAndScope;
        return this;
    }
    public String getIntentAndScope() {
        return this.intentAndScope;
    }

}
