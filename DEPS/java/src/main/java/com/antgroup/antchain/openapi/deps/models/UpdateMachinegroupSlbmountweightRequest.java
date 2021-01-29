// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateMachinegroupSlbmountweightRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // from_aliyun
    @NameInMap("from_aliyun")
    public Boolean fromAliyun;

    // 分组 ID
    @NameInMap("machine_group_id")
    @Validation(required = true)
    public String machineGroupId;

    // 挂载权重信息列表
    @NameInMap("slb_mount_info_list")
    @Validation(required = true)
    public java.util.List<String> slbMountInfoList;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static UpdateMachinegroupSlbmountweightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMachinegroupSlbmountweightRequest self = new UpdateMachinegroupSlbmountweightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMachinegroupSlbmountweightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMachinegroupSlbmountweightRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateMachinegroupSlbmountweightRequest setFromAliyun(Boolean fromAliyun) {
        this.fromAliyun = fromAliyun;
        return this;
    }
    public Boolean getFromAliyun() {
        return this.fromAliyun;
    }

    public UpdateMachinegroupSlbmountweightRequest setMachineGroupId(String machineGroupId) {
        this.machineGroupId = machineGroupId;
        return this;
    }
    public String getMachineGroupId() {
        return this.machineGroupId;
    }

    public UpdateMachinegroupSlbmountweightRequest setSlbMountInfoList(java.util.List<String> slbMountInfoList) {
        this.slbMountInfoList = slbMountInfoList;
        return this;
    }
    public java.util.List<String> getSlbMountInfoList() {
        return this.slbMountInfoList;
    }

    public UpdateMachinegroupSlbmountweightRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
