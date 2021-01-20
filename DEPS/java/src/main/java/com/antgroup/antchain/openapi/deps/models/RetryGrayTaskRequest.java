// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryGrayTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 进程 ID
    @NameInMap("process_id")
    public String processId;

    // retry_info
    @NameInMap("retry_info")
    public RetryInfo retryInfo;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static RetryGrayTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryGrayTaskRequest self = new RetryGrayTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryGrayTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryGrayTaskRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public RetryGrayTaskRequest setRetryInfo(RetryInfo retryInfo) {
        this.retryInfo = retryInfo;
        return this;
    }
    public RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    public RetryGrayTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RetryGrayTaskRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
