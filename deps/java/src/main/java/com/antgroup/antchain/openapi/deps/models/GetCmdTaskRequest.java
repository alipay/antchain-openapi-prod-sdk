// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetCmdTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 异步指令执行的任务ID
    @NameInMap("task_id")
    @Validation(required = true)
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

    public GetCmdTaskRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetCmdTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
