// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DebugParticipator extends TeaModel {
    // 主事务id
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    // 分支事务id
    @NameInMap("action_id")
    @Validation(required = true)
    public String actionId;

    // 参与者名称
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // 1：提交，2：回滚
    @NameInMap("action_type")
    @Validation(required = true)
    public Long actionType;

    // 主事务上下文
    @NameInMap("activity_context")
    @Validation(required = true)
    public String activityContext;

    // 分支事务上下文
    @NameInMap("action_context")
    @Validation(required = true)
    public String actionContext;

    public static DebugParticipator build(java.util.Map<String, ?> map) throws Exception {
        DebugParticipator self = new DebugParticipator();
        return TeaModel.build(map, self);
    }

    public DebugParticipator setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public DebugParticipator setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public DebugParticipator setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public DebugParticipator setActionType(Long actionType) {
        this.actionType = actionType;
        return this;
    }
    public Long getActionType() {
        return this.actionType;
    }

    public DebugParticipator setActivityContext(String activityContext) {
        this.activityContext = activityContext;
        return this;
    }
    public String getActivityContext() {
        return this.activityContext;
    }

    public DebugParticipator setActionContext(String actionContext) {
        this.actionContext = actionContext;
        return this;
    }
    public String getActionContext() {
        return this.actionContext;
    }

}
