// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class TaskExecutionProgress extends TeaModel {
    // 任务名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 显示名
    @NameInMap("show_name")
    @Validation(required = true)
    public String showName;

    // 业务类型
    @NameInMap("business_entity_code")
    @Validation(required = true)
    public String businessEntityCode;

    // 错误代码
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 执行次数
    @NameInMap("execution_count")
    @Validation(required = true)
    public String executionCount;

    // 详细信息
    @NameInMap("detail_msg")
    @Validation(required = true)
    public String detailMsg;

    // 开始时间
    @NameInMap("started_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startedTime;

    // 结束时间
    @NameInMap("finished_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String finishedTime;

    // 是否可独立执行
    @NameInMap("standalone_executable")
    @Validation(required = true)
    public Boolean standaloneExecutable;

    // ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static TaskExecutionProgress build(java.util.Map<String, ?> map) throws Exception {
        TaskExecutionProgress self = new TaskExecutionProgress();
        return TeaModel.build(map, self);
    }

    public TaskExecutionProgress setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TaskExecutionProgress setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public TaskExecutionProgress setBusinessEntityCode(String businessEntityCode) {
        this.businessEntityCode = businessEntityCode;
        return this;
    }
    public String getBusinessEntityCode() {
        return this.businessEntityCode;
    }

    public TaskExecutionProgress setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaskExecutionProgress setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public TaskExecutionProgress setExecutionCount(String executionCount) {
        this.executionCount = executionCount;
        return this;
    }
    public String getExecutionCount() {
        return this.executionCount;
    }

    public TaskExecutionProgress setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
        return this;
    }
    public String getDetailMsg() {
        return this.detailMsg;
    }

    public TaskExecutionProgress setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public TaskExecutionProgress setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public TaskExecutionProgress setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public TaskExecutionProgress setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
