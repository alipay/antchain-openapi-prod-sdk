// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TaskInfo extends TeaModel {
    // 升级计划Id
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("plan_id")
    public Long planId;

    // 刷库计划步骤id
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("plan_step_id")
    public Long planStepId;

    // 任务id
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("task_id")
    public Long taskId;

    // action_id
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("action_id")
    public Long actionId;

    // 任务类型
    /**
     * <strong>example:</strong>
     * <p>升级，溯源</p>
     */
    @NameInMap("task_type")
    @Validation(required = true)
    public String taskType;

    public static TaskInfo build(java.util.Map<String, ?> map) throws Exception {
        TaskInfo self = new TaskInfo();
        return TeaModel.build(map, self);
    }

    public TaskInfo setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public TaskInfo setPlanStepId(Long planStepId) {
        this.planStepId = planStepId;
        return this;
    }
    public Long getPlanStepId() {
        return this.planStepId;
    }

    public TaskInfo setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public TaskInfo setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public TaskInfo setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
