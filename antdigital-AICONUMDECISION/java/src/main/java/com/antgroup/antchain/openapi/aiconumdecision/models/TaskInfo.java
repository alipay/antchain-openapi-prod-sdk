// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class TaskInfo extends TeaModel {
    // 投放任务ID（收单时作为 sceneStrategyId 传入）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("strategy_task_id")
    @Validation(required = true)
    public Long strategyTaskId;

    // 任务名称
    /**
     * <strong>example:</strong>
     * <p>hh</p>
     */
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 任务状态：2 启用中 / 4 已停止
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static TaskInfo build(java.util.Map<String, ?> map) throws Exception {
        TaskInfo self = new TaskInfo();
        return TeaModel.build(map, self);
    }

    public TaskInfo setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    public TaskInfo setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public TaskInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
