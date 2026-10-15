// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class ExecTaskTriggerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // taskid
    @NameInMap("task_id")
    public String taskId;

    // 额外参数
    @NameInMap("extra")
    public String extra;

    // 幂等 id，若传了，则unique_id=inst_id
    @NameInMap("unique_id")
    public String uniqueId;

    public static ExecTaskTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecTaskTriggerRequest self = new ExecTaskTriggerRequest();
        return TeaModel.build(map, self);
    }

    public ExecTaskTriggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecTaskTriggerRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecTaskTriggerRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public ExecTaskTriggerRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
