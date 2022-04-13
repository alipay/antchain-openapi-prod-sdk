// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceDeployment extends TeaModel {
    // 容器服务名称。
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 容器服务版本号。
    @NameInMap("container_service_revision")
    @Validation(required = true)
    public String containerServiceRevision;

    // 依赖的容器应用服务名称。
    @NameInMap("depend_container_service_names")
    @Validation(required = true)
    public java.util.List<String> dependContainerServiceNames;

    // 限定需要发布的部署单元
    @NameInMap("restricted_cells")
    public java.util.List<String> restrictedCells;

    // 自定义发布批次
    @NameInMap("batches")
    public java.util.List<ReleaseBatchObj> batches;

    // 默认ByIndex
    @NameInMap("upgrade_policy")
    public String upgradePolicy;

    // 发布模板名称
    @NameInMap("deployment_template_name")
    public String deploymentTemplateName;

    public static ContainerServiceDeployment build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceDeployment self = new ContainerServiceDeployment();
        return TeaModel.build(map, self);
    }

    public ContainerServiceDeployment setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ContainerServiceDeployment setContainerServiceRevision(String containerServiceRevision) {
        this.containerServiceRevision = containerServiceRevision;
        return this;
    }
    public String getContainerServiceRevision() {
        return this.containerServiceRevision;
    }

    public ContainerServiceDeployment setDependContainerServiceNames(java.util.List<String> dependContainerServiceNames) {
        this.dependContainerServiceNames = dependContainerServiceNames;
        return this;
    }
    public java.util.List<String> getDependContainerServiceNames() {
        return this.dependContainerServiceNames;
    }

    public ContainerServiceDeployment setRestrictedCells(java.util.List<String> restrictedCells) {
        this.restrictedCells = restrictedCells;
        return this;
    }
    public java.util.List<String> getRestrictedCells() {
        return this.restrictedCells;
    }

    public ContainerServiceDeployment setBatches(java.util.List<ReleaseBatchObj> batches) {
        this.batches = batches;
        return this;
    }
    public java.util.List<ReleaseBatchObj> getBatches() {
        return this.batches;
    }

    public ContainerServiceDeployment setUpgradePolicy(String upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

    public ContainerServiceDeployment setDeploymentTemplateName(String deploymentTemplateName) {
        this.deploymentTemplateName = deploymentTemplateName;
        return this;
    }
    public String getDeploymentTemplateName() {
        return this.deploymentTemplateName;
    }

}
