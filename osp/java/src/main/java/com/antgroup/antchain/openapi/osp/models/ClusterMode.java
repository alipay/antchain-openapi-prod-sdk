// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class ClusterMode extends TeaModel {
    // 集群模式
    @NameInMap("cluster_mode")
    @Validation(required = true)
    public String clusterMode;

    // 区域
    @NameInMap("regions")
    @Validation(required = true)
    public java.util.List<ClusterMeta> regions;

    public static ClusterMode build(java.util.Map<String, ?> map) throws Exception {
        ClusterMode self = new ClusterMode();
        return TeaModel.build(map, self);
    }

    public ClusterMode setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public ClusterMode setRegions(java.util.List<ClusterMeta> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ClusterMeta> getRegions() {
        return this.regions;
    }

}
