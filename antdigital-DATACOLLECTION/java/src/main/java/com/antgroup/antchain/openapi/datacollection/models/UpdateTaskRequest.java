// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class UpdateTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 采集任务主键id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 任务名(空不更新)
    @NameInMap("task_name")
    public String taskName;

    // 任务描述(空不更新)
    @NameInMap("task_desc")
    public String taskDesc;

    // 触发类型(空不更新)
    @NameInMap("trigger_type")
    public Long triggerType;

    // 运行模式(空不更新)
    @NameInMap("mode")
    public Long mode;

    // 任务config JSON串(空不更新)
    @NameInMap("config")
    public String config;

    public static UpdateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskRequest self = new UpdateTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public UpdateTaskRequest setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }
    public String getTaskDesc() {
        return this.taskDesc;
    }

    public UpdateTaskRequest setTriggerType(Long triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public Long getTriggerType() {
        return this.triggerType;
    }

    public UpdateTaskRequest setMode(Long mode) {
        this.mode = mode;
        return this;
    }
    public Long getMode() {
        return this.mode;
    }

    public UpdateTaskRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
