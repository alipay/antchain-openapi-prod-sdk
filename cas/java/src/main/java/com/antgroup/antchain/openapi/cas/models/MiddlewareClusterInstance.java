// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class MiddlewareClusterInstance extends TeaModel {
    // cluster_id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // cluster_name
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // region_ids
    @NameInMap("region_ids")
    @Validation(required = true)
    public java.util.List<String> regionIds;

    // zone_ids
    @NameInMap("zone_ids")
    public java.util.List<String> zoneIds;

    // acvip_endpoint
    @NameInMap("acvip_endpoint")
    @Validation(required = true)
    public String acvipEndpoint;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // workspace_group_name
    @NameInMap("workspace_group_name")
    public String workspaceGroupName;

    public static MiddlewareClusterInstance build(java.util.Map<String, ?> map) throws Exception {
        MiddlewareClusterInstance self = new MiddlewareClusterInstance();
        return TeaModel.build(map, self);
    }

    public MiddlewareClusterInstance setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public MiddlewareClusterInstance setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public MiddlewareClusterInstance setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public MiddlewareClusterInstance setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public MiddlewareClusterInstance setAcvipEndpoint(String acvipEndpoint) {
        this.acvipEndpoint = acvipEndpoint;
        return this;
    }
    public String getAcvipEndpoint() {
        return this.acvipEndpoint;
    }

    public MiddlewareClusterInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MiddlewareClusterInstance setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
