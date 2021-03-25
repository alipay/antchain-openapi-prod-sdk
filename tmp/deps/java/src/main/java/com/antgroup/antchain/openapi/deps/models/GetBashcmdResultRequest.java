// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetBashcmdResultRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 异步bash指令执行的任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static GetBashcmdResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBashcmdResultRequest self = new GetBashcmdResultRequest();
        return TeaModel.build(map, self);
    }

    public GetBashcmdResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBashcmdResultRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetBashcmdResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
