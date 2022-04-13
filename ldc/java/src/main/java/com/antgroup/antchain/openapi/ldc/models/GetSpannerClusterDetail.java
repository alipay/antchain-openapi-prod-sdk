// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetSpannerClusterDetail extends TeaModel {
    // 联邦 spanner cluster 详细信息
    @NameInMap("cluster_detail")
    @Validation(required = true)
    public QuerySpannerClusterDetail clusterDetail;

    // 若干组本地集群信息
    @NameInMap("local_clusters")
    @Validation(required = true)
    public java.util.List<LocalSpannerClusterDetail> localClusters;

    public static GetSpannerClusterDetail build(java.util.Map<String, ?> map) throws Exception {
        GetSpannerClusterDetail self = new GetSpannerClusterDetail();
        return TeaModel.build(map, self);
    }

    public GetSpannerClusterDetail setClusterDetail(QuerySpannerClusterDetail clusterDetail) {
        this.clusterDetail = clusterDetail;
        return this;
    }
    public QuerySpannerClusterDetail getClusterDetail() {
        return this.clusterDetail;
    }

    public GetSpannerClusterDetail setLocalClusters(java.util.List<LocalSpannerClusterDetail> localClusters) {
        this.localClusters = localClusters;
        return this;
    }
    public java.util.List<LocalSpannerClusterDetail> getLocalClusters() {
        return this.localClusters;
    }

}
