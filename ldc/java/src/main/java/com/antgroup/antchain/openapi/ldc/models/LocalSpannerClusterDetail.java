// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LocalSpannerClusterDetail extends TeaModel {
    // 可用区
    @NameInMap("az")
    @Validation(required = true)
    public String az;

    // 本地集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 可能存在的错误信息
    @NameInMap("message")
    public String message;

    // 集群状态
    @NameInMap("phase")
    public String phase;

    // spanner cluster 集群id
    @NameInMap("spanner_cluster_id")
    public String spannerClusterId;

    // 描述spanner cluster健康状态
    @NameInMap("state")
    public String state;

    // 若干组容器信息
    @NameInMap("sub_clusters_details")
    public java.util.List<LocalSubClusterDetail> subClustersDetails;

    public static LocalSpannerClusterDetail build(java.util.Map<String, ?> map) throws Exception {
        LocalSpannerClusterDetail self = new LocalSpannerClusterDetail();
        return TeaModel.build(map, self);
    }

    public LocalSpannerClusterDetail setAz(String az) {
        this.az = az;
        return this;
    }
    public String getAz() {
        return this.az;
    }

    public LocalSpannerClusterDetail setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public LocalSpannerClusterDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LocalSpannerClusterDetail setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public LocalSpannerClusterDetail setSpannerClusterId(String spannerClusterId) {
        this.spannerClusterId = spannerClusterId;
        return this;
    }
    public String getSpannerClusterId() {
        return this.spannerClusterId;
    }

    public LocalSpannerClusterDetail setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public LocalSpannerClusterDetail setSubClustersDetails(java.util.List<LocalSubClusterDetail> subClustersDetails) {
        this.subClustersDetails = subClustersDetails;
        return this;
    }
    public java.util.List<LocalSubClusterDetail> getSubClustersDetails() {
        return this.subClustersDetails;
    }

}
