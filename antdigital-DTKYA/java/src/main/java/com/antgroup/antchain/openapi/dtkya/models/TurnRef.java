// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class TurnRef extends TeaModel {
    // agent_did
    /**
     * <strong>example:</strong>
     * <p>did:kya:subject</p>
     */
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // session_id
    /**
     * <strong>example:</strong>
     * <p>session-001</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // turn_id
    /**
     * <strong>example:</strong>
     * <p>turn-001</p>
     */
    @NameInMap("turn_id")
    @Validation(required = true)
    public String turnId;

    public static TurnRef build(java.util.Map<String, ?> map) throws Exception {
        TurnRef self = new TurnRef();
        return TeaModel.build(map, self);
    }

    public TurnRef setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public TurnRef setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public TurnRef setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

}
