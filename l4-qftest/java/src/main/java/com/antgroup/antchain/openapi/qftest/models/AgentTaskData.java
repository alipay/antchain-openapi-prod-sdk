// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class AgentTaskData extends TeaModel {
    // 任务名称
    /**
     * <strong>example:</strong>
     * <p>任务名称</p>
     */
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 任务类型
    /**
     * <strong>example:</strong>
     * <p>任务类型</p>
     */
    @NameInMap("task_type")
    @Validation(required = true)
    public String taskType;

    // 任务状态
    /**
     * <strong>example:</strong>
     * <p>任务状态</p>
     */
    @NameInMap("task_status")
    @Validation(required = true)
    public String taskStatus;

    // 是否有未读的消息
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("message_flag")
    @Validation(required = true)
    public Boolean messageFlag;

    // 最后更新时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    // 单步骤任务直接关联消息id
    /**
     * <strong>example:</strong>
     * <p>202503060003000000000001</p>
     */
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 附加信息
    /**
     * <strong>example:</strong>
     * <p>附加信息</p>
     */
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 任务步骤列表
    /**
     * <strong>example:</strong>
     * <p>任务步骤列表</p>
     */
    @NameInMap("step_list")
    @Validation(required = true)
    public java.util.List<AgentTaskStepData> stepList;

    public static AgentTaskData build(java.util.Map<String, ?> map) throws Exception {
        AgentTaskData self = new AgentTaskData();
        return TeaModel.build(map, self);
    }

    public AgentTaskData setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public AgentTaskData setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public AgentTaskData setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public AgentTaskData setMessageFlag(Boolean messageFlag) {
        this.messageFlag = messageFlag;
        return this;
    }
    public Boolean getMessageFlag() {
        return this.messageFlag;
    }

    public AgentTaskData setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public AgentTaskData setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public AgentTaskData setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public AgentTaskData setStepList(java.util.List<AgentTaskStepData> stepList) {
        this.stepList = stepList;
        return this;
    }
    public java.util.List<AgentTaskStepData> getStepList() {
        return this.stepList;
    }

}
