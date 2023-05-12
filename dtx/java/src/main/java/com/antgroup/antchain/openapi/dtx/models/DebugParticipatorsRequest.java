// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DebugParticipatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分支事务上下文
    @NameInMap("action_context")
    @Validation(required = true)
    public String actionContext;

    // 分支事务id
    @NameInMap("action_id")
    @Validation(required = true)
    public String actionId;

    // 参与者名称
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // 操作类型，提交或回滚
    @NameInMap("action_type")
    @Validation(required = true)
    public Long actionType;

    // 主事务上下文
    @NameInMap("activity_context")
    @Validation(required = true)
    public String activityContext;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 主事务id
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    public static DebugParticipatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugParticipatorsRequest self = new DebugParticipatorsRequest();
        return TeaModel.build(map, self);
    }

    public DebugParticipatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DebugParticipatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DebugParticipatorsRequest setActionContext(String actionContext) {
        this.actionContext = actionContext;
        return this;
    }
    public String getActionContext() {
        return this.actionContext;
    }

    public DebugParticipatorsRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public DebugParticipatorsRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public DebugParticipatorsRequest setActionType(Long actionType) {
        this.actionType = actionType;
        return this;
    }
    public Long getActionType() {
        return this.actionType;
    }

    public DebugParticipatorsRequest setActivityContext(String activityContext) {
        this.activityContext = activityContext;
        return this;
    }
    public String getActivityContext() {
        return this.activityContext;
    }

    public DebugParticipatorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DebugParticipatorsRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
