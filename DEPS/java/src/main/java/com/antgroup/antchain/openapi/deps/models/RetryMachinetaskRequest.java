// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryMachinetaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 机器 ID
    @NameInMap("machine_id")
    @Validation(required = true)
    public String machineId;

    // retry_info
    @NameInMap("retry_info")
    @Validation(required = true)
    public RetryInfo retryInfo;

    // 任务 ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static RetryMachinetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryMachinetaskRequest self = new RetryMachinetaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryMachinetaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryMachinetaskRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public RetryMachinetaskRequest setMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }
    public String getMachineId() {
        return this.machineId;
    }

    public RetryMachinetaskRequest setRetryInfo(RetryInfo retryInfo) {
        this.retryInfo = retryInfo;
        return this;
    }
    public RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    public RetryMachinetaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RetryMachinetaskRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
