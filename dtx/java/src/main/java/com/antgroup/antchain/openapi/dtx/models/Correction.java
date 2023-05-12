// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class Correction extends TeaModel {
    // 分支事务上下文
    @NameInMap("action_context")
    @Validation(required = true)
    public String actionContext;

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

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 记录id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 0 已提交  4 已执行
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 是否同步主账务；0、不同步，1、同步
    @NameInMap("sync_acctrans")
    @Validation(required = true)
    public Long syncAcctrans;

    // 是否同步统一支付；0、不同步，1同步
    @NameInMap("sync_paycore")
    @Validation(required = true)
    public Long syncPaycore;

    // tracer上下文
    @NameInMap("tracer_context")
    public String tracerContext;

    // 事务id
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    public static Correction build(java.util.Map<String, ?> map) throws Exception {
        Correction self = new Correction();
        return TeaModel.build(map, self);
    }

    public Correction setActionContext(String actionContext) {
        this.actionContext = actionContext;
        return this;
    }
    public String getActionContext() {
        return this.actionContext;
    }

    public Correction setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public Correction setActionType(Long actionType) {
        this.actionType = actionType;
        return this;
    }
    public Long getActionType() {
        return this.actionType;
    }

    public Correction setActivityContext(String activityContext) {
        this.activityContext = activityContext;
        return this;
    }
    public String getActivityContext() {
        return this.activityContext;
    }

    public Correction setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public Correction setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Correction setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Correction setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Correction setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Correction setSyncAcctrans(Long syncAcctrans) {
        this.syncAcctrans = syncAcctrans;
        return this;
    }
    public Long getSyncAcctrans() {
        return this.syncAcctrans;
    }

    public Correction setSyncPaycore(Long syncPaycore) {
        this.syncPaycore = syncPaycore;
        return this;
    }
    public Long getSyncPaycore() {
        return this.syncPaycore;
    }

    public Correction setTracerContext(String tracerContext) {
        this.tracerContext = tracerContext;
        return this;
    }
    public String getTracerContext() {
        return this.tracerContext;
    }

    public Correction setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
