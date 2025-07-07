// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TaskCrowdMatchResp extends TeaModel {
    // 任务ID
    /**
     * <strong>example:</strong>
     * <p>NQYwDb1w5</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 人群匹配结果
    @NameInMap("crowd_match_result")
    @Validation(required = true)
    public CrowdMatchResult crowdMatchResult;

    public static TaskCrowdMatchResp build(java.util.Map<String, ?> map) throws Exception {
        TaskCrowdMatchResp self = new TaskCrowdMatchResp();
        return TeaModel.build(map, self);
    }

    public TaskCrowdMatchResp setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TaskCrowdMatchResp setCrowdMatchResult(CrowdMatchResult crowdMatchResult) {
        this.crowdMatchResult = crowdMatchResult;
        return this;
    }
    public CrowdMatchResult getCrowdMatchResult() {
        return this.crowdMatchResult;
    }

}
