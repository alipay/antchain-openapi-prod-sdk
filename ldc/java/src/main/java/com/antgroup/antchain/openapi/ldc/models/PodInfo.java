// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodInfo extends TeaModel {
    // 部署单元名称
    @NameInMap("cell_display_name")
    @Validation(required = true)
    public String cellDisplayName;

    // 集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // pod containers info
    @NameInMap("containers")
    @Validation(required = true)
    public java.util.List<ContainerInfo> containers;

    // create time
    @NameInMap("created_time")
    @Validation(required = true)
    public String createdTime;

    // pod 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间名称
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // pod状态
    @NameInMap("status")
    @Validation(required = true)
    public PodStatus status;

    // pod uid
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // Pod volume信息。
    @NameInMap("volumes")
    public java.util.List<Volume> volumes;

    // pod唯一标识
    @NameInMap("pod_identity")
    public String podIdentity;

    public static PodInfo build(java.util.Map<String, ?> map) throws Exception {
        PodInfo self = new PodInfo();
        return TeaModel.build(map, self);
    }

    public PodInfo setCellDisplayName(String cellDisplayName) {
        this.cellDisplayName = cellDisplayName;
        return this;
    }
    public String getCellDisplayName() {
        return this.cellDisplayName;
    }

    public PodInfo setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public PodInfo setContainers(java.util.List<ContainerInfo> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<ContainerInfo> getContainers() {
        return this.containers;
    }

    public PodInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PodInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PodInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PodInfo setStatus(PodStatus status) {
        this.status = status;
        return this;
    }
    public PodStatus getStatus() {
        return this.status;
    }

    public PodInfo setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public PodInfo setVolumes(java.util.List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<Volume> getVolumes() {
        return this.volumes;
    }

    public PodInfo setPodIdentity(String podIdentity) {
        this.podIdentity = podIdentity;
        return this;
    }
    public String getPodIdentity() {
        return this.podIdentity;
    }

}
