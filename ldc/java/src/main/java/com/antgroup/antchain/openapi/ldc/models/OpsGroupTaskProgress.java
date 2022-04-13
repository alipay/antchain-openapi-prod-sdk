// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsGroupTaskProgress extends TeaModel {
    // 任务码
    @NameInMap("action_code")
    @Validation(required = true)
    public String actionCode;

    // 任务名称
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // 任务状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 任务开始时间
    @NameInMap("started_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startedTime;

    // 任务结束时间
    @NameInMap("finished_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String finishedTime;

    public static OpsGroupTaskProgress build(java.util.Map<String, ?> map) throws Exception {
        OpsGroupTaskProgress self = new OpsGroupTaskProgress();
        return TeaModel.build(map, self);
    }

    public OpsGroupTaskProgress setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public OpsGroupTaskProgress setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public OpsGroupTaskProgress setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public OpsGroupTaskProgress setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public OpsGroupTaskProgress setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

}
