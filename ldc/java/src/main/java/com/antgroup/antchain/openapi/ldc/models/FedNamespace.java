// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedNamespace extends TeaModel {
    // 命名空间的注解
    @NameInMap("annotations")
    @Validation(required = true)
    public java.util.List<Annotation> annotations;

    // 分发的集群列表
    @NameInMap("clusters")
    @Validation(required = true)
    public java.util.List<String> clusters;

    // 分发状态
    @NameInMap("cluster_state_map")
    @Validation(required = true)
    public java.util.List<ClusterState> clusterStateMap;

    // 命名空间的标签
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<Label> labels;

    // 命名空间名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联邦命名空间所在命名空间，和命名空间自身名称保持一致
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 创建时间
    @NameInMap("create_time_stamp")
    @Validation(required = true)
    public String createTimeStamp;

    // 分发状态，成功 True，失败 False，删除中 Deleting
    @NameInMap("status")
    public String status;

    // 导致该分发状态的原因
    @NameInMap("reason")
    public String reason;

    public static FedNamespace build(java.util.Map<String, ?> map) throws Exception {
        FedNamespace self = new FedNamespace();
        return TeaModel.build(map, self);
    }

    public FedNamespace setAnnotations(java.util.List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public FedNamespace setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    public FedNamespace setClusterStateMap(java.util.List<ClusterState> clusterStateMap) {
        this.clusterStateMap = clusterStateMap;
        return this;
    }
    public java.util.List<ClusterState> getClusterStateMap() {
        return this.clusterStateMap;
    }

    public FedNamespace setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public FedNamespace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedNamespace setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FedNamespace setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public String getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public FedNamespace setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FedNamespace setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
