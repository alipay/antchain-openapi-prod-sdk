// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsPlan extends TeaModel {
    // 是否自动执行
    @NameInMap("auto_execution")
    public Boolean autoExecution;

    // 上下文
    @NameInMap("context")
    public java.util.List<Pair> context;

    // 描述
    @NameInMap("description")
    public String description;

    // 是否开启通知
    @NameInMap("enable_notification")
    public Boolean enableNotification;

    // 执行人 ID
    @NameInMap("executor_id")
    public String executorId;

    // 执行人
    @NameInMap("executor_name")
    public String executorName;

    // 完成时间
    @NameInMap("finished_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String finishedTime;

    // ID
    @NameInMap("id")
    public String id;

    // last operator
    @NameInMap("last_operator")
    public String lastOperator;

    // 详情
    @NameInMap("message_detail")
    public java.util.List<Pair> messageDetail;

    // 信息
    @NameInMap("message_params")
    public String messageParams;

    // 名称
    @NameInMap("name")
    public String name;

    // 类型
    @NameInMap("ops_type")
    public String opsType;

    // 发布进程
    @NameInMap("process_definitions")
    public java.util.List<OpsProcessDefinition> processDefinitions;

    // release_mode
    @NameInMap("release_mode")
    public String releaseMode;

    // 回滚单ID
    @NameInMap("rollback_plan_id")
    public String rollbackPlanId;

    // 是否可独立执行
    @NameInMap("standalone_executable")
    public Boolean standaloneExecutable;

    // 开始时间
    @NameInMap("started_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startedTime;

    // 状态
    @NameInMap("state")
    public String state;

    // 发布单 ID
    @NameInMap("time_series_id")
    public String timeSeriesId;

    public static OpsPlan build(java.util.Map<String, ?> map) throws Exception {
        OpsPlan self = new OpsPlan();
        return TeaModel.build(map, self);
    }

    public OpsPlan setAutoExecution(Boolean autoExecution) {
        this.autoExecution = autoExecution;
        return this;
    }
    public Boolean getAutoExecution() {
        return this.autoExecution;
    }

    public OpsPlan setContext(java.util.List<Pair> context) {
        this.context = context;
        return this;
    }
    public java.util.List<Pair> getContext() {
        return this.context;
    }

    public OpsPlan setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpsPlan setEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
        return this;
    }
    public Boolean getEnableNotification() {
        return this.enableNotification;
    }

    public OpsPlan setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public OpsPlan setExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }
    public String getExecutorName() {
        return this.executorName;
    }

    public OpsPlan setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public OpsPlan setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpsPlan setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
        return this;
    }
    public String getLastOperator() {
        return this.lastOperator;
    }

    public OpsPlan setMessageDetail(java.util.List<Pair> messageDetail) {
        this.messageDetail = messageDetail;
        return this;
    }
    public java.util.List<Pair> getMessageDetail() {
        return this.messageDetail;
    }

    public OpsPlan setMessageParams(String messageParams) {
        this.messageParams = messageParams;
        return this;
    }
    public String getMessageParams() {
        return this.messageParams;
    }

    public OpsPlan setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsPlan setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public OpsPlan setProcessDefinitions(java.util.List<OpsProcessDefinition> processDefinitions) {
        this.processDefinitions = processDefinitions;
        return this;
    }
    public java.util.List<OpsProcessDefinition> getProcessDefinitions() {
        return this.processDefinitions;
    }

    public OpsPlan setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
        return this;
    }
    public String getReleaseMode() {
        return this.releaseMode;
    }

    public OpsPlan setRollbackPlanId(String rollbackPlanId) {
        this.rollbackPlanId = rollbackPlanId;
        return this;
    }
    public String getRollbackPlanId() {
        return this.rollbackPlanId;
    }

    public OpsPlan setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public OpsPlan setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public OpsPlan setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public OpsPlan setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

}
