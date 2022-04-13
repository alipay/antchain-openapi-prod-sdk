// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceOperation extends TeaModel {
    // 容器服务名称。
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 依赖的容器应用服务名称。
    @NameInMap("depend_container_service_names")
    public java.util.List<String> dependContainerServiceNames;

    // 待操作目标pods列表
    @NameInMap("selected_pods")
    public java.util.List<CellPods> selectedPods;

    // 自定义发布批次
    @NameInMap("batches")
    public java.util.List<ReleaseBatchObj> batches;

    // 缩放副本数量，扩缩容时使用
    @NameInMap("scale_replicas")
    public java.util.List<ReplicaCount> scaleReplicas;

    // 应用服务当前版本
    @NameInMap("container_service_revision")
    public String containerServiceRevision;

    // [huanyu场景使用]，灰度平台pods分批序列化为json的结果
    @NameInMap("graycore_batches")
    public String graycoreBatches;

    public static ContainerServiceOperation build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceOperation self = new ContainerServiceOperation();
        return TeaModel.build(map, self);
    }

    public ContainerServiceOperation setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ContainerServiceOperation setDependContainerServiceNames(java.util.List<String> dependContainerServiceNames) {
        this.dependContainerServiceNames = dependContainerServiceNames;
        return this;
    }
    public java.util.List<String> getDependContainerServiceNames() {
        return this.dependContainerServiceNames;
    }

    public ContainerServiceOperation setSelectedPods(java.util.List<CellPods> selectedPods) {
        this.selectedPods = selectedPods;
        return this;
    }
    public java.util.List<CellPods> getSelectedPods() {
        return this.selectedPods;
    }

    public ContainerServiceOperation setBatches(java.util.List<ReleaseBatchObj> batches) {
        this.batches = batches;
        return this;
    }
    public java.util.List<ReleaseBatchObj> getBatches() {
        return this.batches;
    }

    public ContainerServiceOperation setScaleReplicas(java.util.List<ReplicaCount> scaleReplicas) {
        this.scaleReplicas = scaleReplicas;
        return this;
    }
    public java.util.List<ReplicaCount> getScaleReplicas() {
        return this.scaleReplicas;
    }

    public ContainerServiceOperation setContainerServiceRevision(String containerServiceRevision) {
        this.containerServiceRevision = containerServiceRevision;
        return this;
    }
    public String getContainerServiceRevision() {
        return this.containerServiceRevision;
    }

    public ContainerServiceOperation setGraycoreBatches(String graycoreBatches) {
        this.graycoreBatches = graycoreBatches;
        return this;
    }
    public String getGraycoreBatches() {
        return this.graycoreBatches;
    }

}
