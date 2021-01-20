// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AggregatedTaskExecutionProgress extends TeaModel {
    // 错误节点信息
    @NameInMap("error_task_execution_nodes")
    public java.util.List<ErrorTaskExecutionNode> errorTaskExecutionNodes;

    // 任务执行进度
    @NameInMap("task_execution_progress")
    public TaskExecutionProgress taskExecutionProgress;

    public static AggregatedTaskExecutionProgress build(java.util.Map<String, ?> map) throws Exception {
        AggregatedTaskExecutionProgress self = new AggregatedTaskExecutionProgress();
        return TeaModel.build(map, self);
    }

    public AggregatedTaskExecutionProgress setErrorTaskExecutionNodes(java.util.List<ErrorTaskExecutionNode> errorTaskExecutionNodes) {
        this.errorTaskExecutionNodes = errorTaskExecutionNodes;
        return this;
    }
    public java.util.List<ErrorTaskExecutionNode> getErrorTaskExecutionNodes() {
        return this.errorTaskExecutionNodes;
    }

    public AggregatedTaskExecutionProgress setTaskExecutionProgress(TaskExecutionProgress taskExecutionProgress) {
        this.taskExecutionProgress = taskExecutionProgress;
        return this;
    }
    public TaskExecutionProgress getTaskExecutionProgress() {
        return this.taskExecutionProgress;
    }

}
