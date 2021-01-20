// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SkipMachinetaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 机器 ID
    @NameInMap("machine_id")
    public String machineId;

    // 任务 ID
    @NameInMap("task_id")
    public String taskId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static SkipMachinetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipMachinetaskRequest self = new SkipMachinetaskRequest();
        return TeaModel.build(map, self);
    }

    public SkipMachinetaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SkipMachinetaskRequest setMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }
    public String getMachineId() {
        return this.machineId;
    }

    public SkipMachinetaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SkipMachinetaskRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
