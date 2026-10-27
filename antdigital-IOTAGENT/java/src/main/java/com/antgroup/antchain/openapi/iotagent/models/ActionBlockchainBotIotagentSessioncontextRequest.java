// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ActionBlockchainBotIotagentSessioncontextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体 ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 会话ID
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 操作类型：COMPACT_CURRENT
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    public static ActionBlockchainBotIotagentSessioncontextRequest build(java.util.Map<String, ?> map) throws Exception {
        ActionBlockchainBotIotagentSessioncontextRequest self = new ActionBlockchainBotIotagentSessioncontextRequest();
        return TeaModel.build(map, self);
    }

    public ActionBlockchainBotIotagentSessioncontextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ActionBlockchainBotIotagentSessioncontextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ActionBlockchainBotIotagentSessioncontextRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ActionBlockchainBotIotagentSessioncontextRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ActionBlockchainBotIotagentSessioncontextRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ActionBlockchainBotIotagentSessioncontextRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

}
