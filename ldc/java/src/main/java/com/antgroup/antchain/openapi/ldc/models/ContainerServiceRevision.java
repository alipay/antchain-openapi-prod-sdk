// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceRevision extends TeaModel {
    // 应用信息。
    @NameInMap("app_info")
    @Validation(required = true)
    public AppInfo appInfo;

    // 容器服务配置。
    @NameInMap("container_service_config")
    @Validation(required = true)
    public ContainerServiceConfig containerServiceConfig;

    // 容器服务服务名称。
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 容器服务发布信息
    @NameInMap("container_service_release_info")
    public ContainerServiceReleaseInfo containerServiceReleaseInfo;

    // 创建时间。
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 发布状态。
    @NameInMap("deploy_status")
    public String deployStatus;

    // container service description
    @NameInMap("description")
    public String description;

    // 关联的最近一次发布单。
    @NameInMap("last_plan_id")
    public String lastPlanId;

    // 元数据状态。
    @NameInMap("meta_status")
    public String metaStatus;

    // 更新时间。
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // 所属命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 版本提交人。
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 版本备注。
    @NameInMap("remarks")
    public String remarks;

    // 版本号。
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    public static ContainerServiceRevision build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceRevision self = new ContainerServiceRevision();
        return TeaModel.build(map, self);
    }

    public ContainerServiceRevision setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    public ContainerServiceRevision setContainerServiceConfig(ContainerServiceConfig containerServiceConfig) {
        this.containerServiceConfig = containerServiceConfig;
        return this;
    }
    public ContainerServiceConfig getContainerServiceConfig() {
        return this.containerServiceConfig;
    }

    public ContainerServiceRevision setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ContainerServiceRevision setContainerServiceReleaseInfo(ContainerServiceReleaseInfo containerServiceReleaseInfo) {
        this.containerServiceReleaseInfo = containerServiceReleaseInfo;
        return this;
    }
    public ContainerServiceReleaseInfo getContainerServiceReleaseInfo() {
        return this.containerServiceReleaseInfo;
    }

    public ContainerServiceRevision setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ContainerServiceRevision setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public ContainerServiceRevision setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ContainerServiceRevision setLastPlanId(String lastPlanId) {
        this.lastPlanId = lastPlanId;
        return this;
    }
    public String getLastPlanId() {
        return this.lastPlanId;
    }

    public ContainerServiceRevision setMetaStatus(String metaStatus) {
        this.metaStatus = metaStatus;
        return this;
    }
    public String getMetaStatus() {
        return this.metaStatus;
    }

    public ContainerServiceRevision setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public ContainerServiceRevision setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ContainerServiceRevision setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ContainerServiceRevision setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public ContainerServiceRevision setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

}
