// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class ClusterMeta extends TeaModel {
    // 集群唯一标识
    @NameInMap("cluster_id")
    public String clusterId;

    // 集群名字
    @NameInMap("cluster_name")
    public String clusterName;

    // 区域
    @NameInMap("region")
    public String region;

    public static ClusterMeta build(java.util.Map<String, ?> map) throws Exception {
        ClusterMeta self = new ClusterMeta();
        return TeaModel.build(map, self);
    }

    public ClusterMeta setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterMeta setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ClusterMeta setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
