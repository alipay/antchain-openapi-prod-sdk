// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceBasicInfo extends TeaModel {
    // 镜像构建id。
    @NameInMap("app_build")
    public String appBuild;

    // 应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 应用名称。
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 创建时间。
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 当前最新镜像。
    @NameInMap("current_image")
    public String currentImage;

    // 发布中的版本。
    @NameInMap("deploying_revision")
    public String deployingRevision;

    // 发布部署状态。
    @NameInMap("deployment_status")
    public String deploymentStatus;

    // container service描述
    @NameInMap("description")
    public String description;

    // 当前应用服务草稿对应的版本号。
    @NameInMap("drafted_revision")
    public String draftedRevision;

    // 草稿更新时间。
    @NameInMap("drafted_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String draftedTime;

    // 最近一次发布的版本。
    @NameInMap("last_deployed_revision")
    public String lastDeployedRevision;

    // 最近一次发布的结束时间。
    @NameInMap("last_deploy_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastDeployEndTime;

    // 最近一次关联的发布单。
    @NameInMap("last_deploy_plan_id")
    public String lastDeployPlanId;

    // 最近一次发布的开始时间。
    @NameInMap("last_deploy_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastDeployStartTime;

    // 容器服务元数据状态。
    @NameInMap("metadata_status")
    @Validation(required = true)
    public String metadataStatus;

    // 创建时间。
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // 容器应用服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 负责人。
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 容器服务的Pod列表。
    @NameInMap("pod_list")
    @Validation(required = true)
    public java.util.List<PodInfo> podList;

    // 更新中pod数量
    @NameInMap("processing_count")
    public String processingCount;

    // replicas数量
    @NameInMap("replicas")
    @Validation(required = true)
    public String replicas;

    // runding pod数量
    @NameInMap("running_count")
    public String runningCount;

    // 运行时版本。
    @NameInMap("runtime_revision")
    public String runtimeRevision;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 容器服务Service列表。
    @NameInMap("service_list")
    public java.util.List<LoadBalancerService> serviceList;

    // message信息
    @NameInMap("message_detail")
    public String messageDetail;

    public static ContainerServiceBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceBasicInfo self = new ContainerServiceBasicInfo();
        return TeaModel.build(map, self);
    }

    public ContainerServiceBasicInfo setAppBuild(String appBuild) {
        this.appBuild = appBuild;
        return this;
    }
    public String getAppBuild() {
        return this.appBuild;
    }

    public ContainerServiceBasicInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ContainerServiceBasicInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ContainerServiceBasicInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ContainerServiceBasicInfo setCurrentImage(String currentImage) {
        this.currentImage = currentImage;
        return this;
    }
    public String getCurrentImage() {
        return this.currentImage;
    }

    public ContainerServiceBasicInfo setDeployingRevision(String deployingRevision) {
        this.deployingRevision = deployingRevision;
        return this;
    }
    public String getDeployingRevision() {
        return this.deployingRevision;
    }

    public ContainerServiceBasicInfo setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    public ContainerServiceBasicInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ContainerServiceBasicInfo setDraftedRevision(String draftedRevision) {
        this.draftedRevision = draftedRevision;
        return this;
    }
    public String getDraftedRevision() {
        return this.draftedRevision;
    }

    public ContainerServiceBasicInfo setDraftedTime(String draftedTime) {
        this.draftedTime = draftedTime;
        return this;
    }
    public String getDraftedTime() {
        return this.draftedTime;
    }

    public ContainerServiceBasicInfo setLastDeployedRevision(String lastDeployedRevision) {
        this.lastDeployedRevision = lastDeployedRevision;
        return this;
    }
    public String getLastDeployedRevision() {
        return this.lastDeployedRevision;
    }

    public ContainerServiceBasicInfo setLastDeployEndTime(String lastDeployEndTime) {
        this.lastDeployEndTime = lastDeployEndTime;
        return this;
    }
    public String getLastDeployEndTime() {
        return this.lastDeployEndTime;
    }

    public ContainerServiceBasicInfo setLastDeployPlanId(String lastDeployPlanId) {
        this.lastDeployPlanId = lastDeployPlanId;
        return this;
    }
    public String getLastDeployPlanId() {
        return this.lastDeployPlanId;
    }

    public ContainerServiceBasicInfo setLastDeployStartTime(String lastDeployStartTime) {
        this.lastDeployStartTime = lastDeployStartTime;
        return this;
    }
    public String getLastDeployStartTime() {
        return this.lastDeployStartTime;
    }

    public ContainerServiceBasicInfo setMetadataStatus(String metadataStatus) {
        this.metadataStatus = metadataStatus;
        return this;
    }
    public String getMetadataStatus() {
        return this.metadataStatus;
    }

    public ContainerServiceBasicInfo setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public ContainerServiceBasicInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerServiceBasicInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ContainerServiceBasicInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ContainerServiceBasicInfo setPodList(java.util.List<PodInfo> podList) {
        this.podList = podList;
        return this;
    }
    public java.util.List<PodInfo> getPodList() {
        return this.podList;
    }

    public ContainerServiceBasicInfo setProcessingCount(String processingCount) {
        this.processingCount = processingCount;
        return this;
    }
    public String getProcessingCount() {
        return this.processingCount;
    }

    public ContainerServiceBasicInfo setReplicas(String replicas) {
        this.replicas = replicas;
        return this;
    }
    public String getReplicas() {
        return this.replicas;
    }

    public ContainerServiceBasicInfo setRunningCount(String runningCount) {
        this.runningCount = runningCount;
        return this;
    }
    public String getRunningCount() {
        return this.runningCount;
    }

    public ContainerServiceBasicInfo setRuntimeRevision(String runtimeRevision) {
        this.runtimeRevision = runtimeRevision;
        return this;
    }
    public String getRuntimeRevision() {
        return this.runtimeRevision;
    }

    public ContainerServiceBasicInfo setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ContainerServiceBasicInfo setServiceList(java.util.List<LoadBalancerService> serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public java.util.List<LoadBalancerService> getServiceList() {
        return this.serviceList;
    }

    public ContainerServiceBasicInfo setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
        return this;
    }
    public String getMessageDetail() {
        return this.messageDetail;
    }

}
