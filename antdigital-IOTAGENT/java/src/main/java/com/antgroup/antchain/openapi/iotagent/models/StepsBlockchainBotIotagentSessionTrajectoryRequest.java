// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class StepsBlockchainBotIotagentSessionTrajectoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 会话ID
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 轮次ID或操作ID
    @NameInMap("turn_id")
    @Validation(required = true)
    public String turnId;

    // 分页游标，首次为空
    @NameInMap("cursor")
    public String cursor;

    // 每页大小 1-200，默认 100
    @NameInMap("page_size")
    public Long pageSize;

    // 定位步骤ID，首次定位用，不可与cursor同传
    @NameInMap("focus_step_id")
    public String focusStepId;

    public static StepsBlockchainBotIotagentSessionTrajectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        StepsBlockchainBotIotagentSessionTrajectoryRequest self = new StepsBlockchainBotIotagentSessionTrajectoryRequest();
        return TeaModel.build(map, self);
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public StepsBlockchainBotIotagentSessionTrajectoryRequest setFocusStepId(String focusStepId) {
        this.focusStepId = focusStepId;
        return this;
    }
    public String getFocusStepId() {
        return this.focusStepId;
    }

}
