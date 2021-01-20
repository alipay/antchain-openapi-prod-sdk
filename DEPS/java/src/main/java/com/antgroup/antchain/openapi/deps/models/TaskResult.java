// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class TaskResult extends TeaModel {
    // 任务执行结果。取值：
    //                     SUCCESSFUL：任务执行成功；
    //                     FAILED：任务执行失败
    //                 
    @NameInMap("result")
    public String result;

    // 任务目标id，如：一个Computer的id
    @NameInMap("target_id")
    public String targetId;

    public static TaskResult build(java.util.Map<String, ?> map) throws Exception {
        TaskResult self = new TaskResult();
        return TeaModel.build(map, self);
    }

    public TaskResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public TaskResult setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
