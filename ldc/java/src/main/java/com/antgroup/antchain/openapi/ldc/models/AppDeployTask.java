// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppDeployTask extends TeaModel {
    // 操作code
    @NameInMap("action_code")
    @Validation(required = true)
    public String actionCode;

    // 当前任务的发布单元列表
    @NameInMap("app_deploy_cells")
    @Validation(required = true)
    public java.util.List<AppDeployCell> appDeployCells;

    // 是否支持确认操作
    @NameInMap("confirm_supported")
    @Validation(required = true)
    public Boolean confirmSupported;

    // 上下文数据，json字符串
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 是否支持跳过操作
    @NameInMap("ignore_supported")
    @Validation(required = true)
    public Boolean ignoreSupported;

    // 是否支持重试操作
    @NameInMap("retry_supported")
    @Validation(required = true)
    public Boolean retrySupported;

    // 当前状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 开始时间。
    @NameInMap("started_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startedTime;

    // 结束时间。
    @NameInMap("finished_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String finishedTime;

    // message detail
    @NameInMap("message_detail")
    public String messageDetail;

    // 任务类型
    @NameInMap("task_type")
    public String taskType;

    // 任务显示名称，自定义卡点任务才会有值
    @NameInMap("task_display_name")
    public String taskDisplayName;

    public static AppDeployTask build(java.util.Map<String, ?> map) throws Exception {
        AppDeployTask self = new AppDeployTask();
        return TeaModel.build(map, self);
    }

    public AppDeployTask setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public AppDeployTask setAppDeployCells(java.util.List<AppDeployCell> appDeployCells) {
        this.appDeployCells = appDeployCells;
        return this;
    }
    public java.util.List<AppDeployCell> getAppDeployCells() {
        return this.appDeployCells;
    }

    public AppDeployTask setConfirmSupported(Boolean confirmSupported) {
        this.confirmSupported = confirmSupported;
        return this;
    }
    public Boolean getConfirmSupported() {
        return this.confirmSupported;
    }

    public AppDeployTask setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AppDeployTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppDeployTask setIgnoreSupported(Boolean ignoreSupported) {
        this.ignoreSupported = ignoreSupported;
        return this;
    }
    public Boolean getIgnoreSupported() {
        return this.ignoreSupported;
    }

    public AppDeployTask setRetrySupported(Boolean retrySupported) {
        this.retrySupported = retrySupported;
        return this;
    }
    public Boolean getRetrySupported() {
        return this.retrySupported;
    }

    public AppDeployTask setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AppDeployTask setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public AppDeployTask setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public AppDeployTask setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
        return this;
    }
    public String getMessageDetail() {
        return this.messageDetail;
    }

    public AppDeployTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public AppDeployTask setTaskDisplayName(String taskDisplayName) {
        this.taskDisplayName = taskDisplayName;
        return this;
    }
    public String getTaskDisplayName() {
        return this.taskDisplayName;
    }

}
