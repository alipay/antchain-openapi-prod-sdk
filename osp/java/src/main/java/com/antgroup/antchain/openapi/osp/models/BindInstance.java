// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class BindInstance extends TeaModel {
    // 集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 集群名字
    @NameInMap("cluster_name")
    public String clusterName;

    // 支持的region
    @NameInMap("regions")
    @Validation(required = true)
    public java.util.List<String> regions;

    // 支持的dataCenter 
    @NameInMap("data_centers")
    public String dataCenters;

    // 支持的zone 列表
    @NameInMap("zones")
    public String zones;

    // 绑定后的instanceId 信息
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // acvip 地址
    @NameInMap("acvip_endpoint")
    @Validation(required = true)
    public String acvipEndpoint;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static BindInstance build(java.util.Map<String, ?> map) throws Exception {
        BindInstance self = new BindInstance();
        return TeaModel.build(map, self);
    }

    public BindInstance setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public BindInstance setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public BindInstance setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public BindInstance setDataCenters(String dataCenters) {
        this.dataCenters = dataCenters;
        return this;
    }
    public String getDataCenters() {
        return this.dataCenters;
    }

    public BindInstance setZones(String zones) {
        this.zones = zones;
        return this;
    }
    public String getZones() {
        return this.zones;
    }

    public BindInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindInstance setAcvipEndpoint(String acvipEndpoint) {
        this.acvipEndpoint = acvipEndpoint;
        return this;
    }
    public String getAcvipEndpoint() {
        return this.acvipEndpoint;
    }

    public BindInstance setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public BindInstance setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
