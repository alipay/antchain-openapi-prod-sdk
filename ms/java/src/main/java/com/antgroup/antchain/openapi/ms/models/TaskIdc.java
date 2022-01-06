// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TaskIdc extends TeaModel {
    // 机房id
    @NameInMap("idc_id")
    public String idcId;

    // 机房执行状态
    @NameInMap("task_state")
    public String taskState;

    public static TaskIdc build(java.util.Map<String, ?> map) throws Exception {
        TaskIdc self = new TaskIdc();
        return TeaModel.build(map, self);
    }

    public TaskIdc setIdcId(String idcId) {
        this.idcId = idcId;
        return this;
    }
    public String getIdcId() {
        return this.idcId;
    }

    public TaskIdc setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

}
