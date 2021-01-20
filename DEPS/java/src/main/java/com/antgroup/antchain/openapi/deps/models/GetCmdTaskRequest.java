// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetCmdTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 异步指令执行的任务ID
    @NameInMap("task_id")
    public String taskId;

    public static GetCmdTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCmdTaskRequest self = new GetCmdTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetCmdTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCmdTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
