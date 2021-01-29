// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SetServiceMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 分组数
    @NameInMap("group_mount")
    public Long groupMount;

    // groupStrategyType
    @NameInMap("group_strategy_type")
    public String groupStrategyType;

    // machine_groups
    @NameInMap("machine_groups")
    public java.util.List<String> machineGroups;

    // need_beta
    @NameInMap("need_beta")
    public Boolean needBeta;

    // service_id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // use_default_setup
    @NameInMap("use_default_setup")
    public Boolean useDefaultSetup;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static SetServiceMachinegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SetServiceMachinegroupRequest self = new SetServiceMachinegroupRequest();
        return TeaModel.build(map, self);
    }

    public SetServiceMachinegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetServiceMachinegroupRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SetServiceMachinegroupRequest setGroupMount(Long groupMount) {
        this.groupMount = groupMount;
        return this;
    }
    public Long getGroupMount() {
        return this.groupMount;
    }

    public SetServiceMachinegroupRequest setGroupStrategyType(String groupStrategyType) {
        this.groupStrategyType = groupStrategyType;
        return this;
    }
    public String getGroupStrategyType() {
        return this.groupStrategyType;
    }

    public SetServiceMachinegroupRequest setMachineGroups(java.util.List<String> machineGroups) {
        this.machineGroups = machineGroups;
        return this;
    }
    public java.util.List<String> getMachineGroups() {
        return this.machineGroups;
    }

    public SetServiceMachinegroupRequest setNeedBeta(Boolean needBeta) {
        this.needBeta = needBeta;
        return this;
    }
    public Boolean getNeedBeta() {
        return this.needBeta;
    }

    public SetServiceMachinegroupRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public SetServiceMachinegroupRequest setUseDefaultSetup(Boolean useDefaultSetup) {
        this.useDefaultSetup = useDefaultSetup;
        return this;
    }
    public Boolean getUseDefaultSetup() {
        return this.useDefaultSetup;
    }

    public SetServiceMachinegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
