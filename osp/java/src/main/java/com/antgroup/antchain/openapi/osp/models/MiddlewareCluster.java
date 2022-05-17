// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class MiddlewareCluster extends TeaModel {
    // 集群id 
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 集群名字
    @NameInMap("cluster_name")
    public String clusterName;

    // 支持的region 列表
    @NameInMap("enable_regions")
    @Validation(required = true)
    public java.util.List<String> enableRegions;

    // 支持的dataCenter 列表
    @NameInMap("enable_data_centers")
    public java.util.List<String> enableDataCenters;

    // 支持的zone 列表
    @NameInMap("enable_zones")
    public java.util.List<String> enableZones;

    // acvip 地址
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

    public MiddlewareCluster setEnableRegions(java.util.List<String> enableRegions) {
        this.enableRegions = enableRegions;
        return this;
    }
    public java.util.List<String> getEnableRegions() {
        return this.enableRegions;
    }

    public MiddlewareCluster setEnableDataCenters(java.util.List<String> enableDataCenters) {
        this.enableDataCenters = enableDataCenters;
        return this;
    }
    public java.util.List<String> getEnableDataCenters() {
        return this.enableDataCenters;
    }

    public MiddlewareCluster setEnableZones(java.util.List<String> enableZones) {
        this.enableZones = enableZones;
        return this;
    }
    public java.util.List<String> getEnableZones() {
        return this.enableZones;
    }

    public MiddlewareCluster setAcvipEndpoint(String acvipEndpoint) {
        this.acvipEndpoint = acvipEndpoint;
        return this;
    }
    public String getAcvipEndpoint() {
        return this.acvipEndpoint;
    }

}
