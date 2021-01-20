// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SkipGrayTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 进程 ID
    @NameInMap("process_id")
    public String processId;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static SkipGrayTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipGrayTaskRequest self = new SkipGrayTaskRequest();
        return TeaModel.build(map, self);
    }

    public SkipGrayTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SkipGrayTaskRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public SkipGrayTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SkipGrayTaskRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
