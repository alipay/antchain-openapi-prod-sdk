// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateTransactionsCorrectionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分支事务上下文
    @NameInMap("action_context")
    @Validation(required = true)
    public String actionContext;

    // PCREDITBILL_TRANS_TRANSFER_FOR_TRADE
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // 操作类型；1、提交，2、回滚
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

    // 1：提交，2：回滚
    @NameInMap("is_commit")
    @Validation(required = true)
    public Long isCommit;

    // 是否同步主账务；0、不同步，1、同步
    @NameInMap("sync_acctrans")
    @Validation(required = true)
    public Long syncAcctrans;

    // 是否同步统一支付；0、不同步，1同步
    @NameInMap("sync_paycore")
    @Validation(required = true)
    public Long syncPaycore;

    // 事务id
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    // tracer上下文
    @NameInMap("tracer_context")
    public String tracerContext;

    public static CreateTransactionsCorrectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionsCorrectionsRequest self = new CreateTransactionsCorrectionsRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransactionsCorrectionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTransactionsCorrectionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateTransactionsCorrectionsRequest setActionContext(String actionContext) {
        this.actionContext = actionContext;
        return this;
    }
    public String getActionContext() {
        return this.actionContext;
    }

    public CreateTransactionsCorrectionsRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public CreateTransactionsCorrectionsRequest setActionType(Long actionType) {
        this.actionType = actionType;
        return this;
    }
    public Long getActionType() {
        return this.actionType;
    }

    public CreateTransactionsCorrectionsRequest setActivityContext(String activityContext) {
        this.activityContext = activityContext;
        return this;
    }
    public String getActivityContext() {
        return this.activityContext;
    }

    public CreateTransactionsCorrectionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTransactionsCorrectionsRequest setIsCommit(Long isCommit) {
        this.isCommit = isCommit;
        return this;
    }
    public Long getIsCommit() {
        return this.isCommit;
    }

    public CreateTransactionsCorrectionsRequest setSyncAcctrans(Long syncAcctrans) {
        this.syncAcctrans = syncAcctrans;
        return this;
    }
    public Long getSyncAcctrans() {
        return this.syncAcctrans;
    }

    public CreateTransactionsCorrectionsRequest setSyncPaycore(Long syncPaycore) {
        this.syncPaycore = syncPaycore;
        return this;
    }
    public Long getSyncPaycore() {
        return this.syncPaycore;
    }

    public CreateTransactionsCorrectionsRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public CreateTransactionsCorrectionsRequest setTracerContext(String tracerContext) {
        this.tracerContext = tracerContext;
        return this;
    }
    public String getTracerContext() {
        return this.tracerContext;
    }

}
