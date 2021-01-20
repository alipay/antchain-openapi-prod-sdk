// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组 ID
    @NameInMap("machine_group_id")
    public String machineGroupId;

    // 发布机器 ID
    @NameInMap("machine_ids")
    public java.util.List<String> machineIds;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static UpdateMachinegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMachinegroupRequest self = new UpdateMachinegroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMachinegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMachinegroupRequest setMachineGroupId(String machineGroupId) {
        this.machineGroupId = machineGroupId;
        return this;
    }
    public String getMachineGroupId() {
        return this.machineGroupId;
    }

    public UpdateMachinegroupRequest setMachineIds(java.util.List<String> machineIds) {
        this.machineIds = machineIds;
        return this;
    }
    public java.util.List<String> getMachineIds() {
        return this.machineIds;
    }

    public UpdateMachinegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
