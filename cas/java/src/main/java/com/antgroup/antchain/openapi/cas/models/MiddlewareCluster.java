// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class MiddlewareCluster extends TeaModel {
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

    public static MiddlewareCluster build(java.util.Map<String, ?> map) throws Exception {
        MiddlewareCluster self = new MiddlewareCluster();
        return TeaModel.build(map, self);
    }

    public MiddlewareCluster setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public MiddlewareCluster setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public MiddlewareCluster setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public MiddlewareCluster setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public MiddlewareCluster setAcvipEndpoint(String acvipEndpoint) {
        this.acvipEndpoint = acvipEndpoint;
        return this;
    }
    public String getAcvipEndpoint() {
        return this.acvipEndpoint;
    }

}
