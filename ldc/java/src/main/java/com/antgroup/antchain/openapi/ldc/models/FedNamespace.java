// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedNamespace extends TeaModel {
    // fed namespace annotations
    @NameInMap("annotations")
    @Validation(required = true)
    public java.util.List<Annotation> annotations;

    // fed namespace clusters
    @NameInMap("clusters")
    @Validation(required = true)
    public java.util.List<String> clusters;

    // fed namespace cluster state map
    @NameInMap("cluster_state_map")
    @Validation(required = true)
    public java.util.List<ClusterState> clusterStateMap;

    // fed namespace labels
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<Label> labels;

    // fed namespace name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // Fed CRD namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 创建时间
    @NameInMap("create_time_stamp")
    @Validation(required = true)
    public String createTimeStamp;

    // fed 资源的状态
    @NameInMap("status")
    public String status;

    // 导致 fed 资源处于该状态的原因
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
