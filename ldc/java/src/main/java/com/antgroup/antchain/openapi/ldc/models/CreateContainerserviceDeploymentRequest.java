// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateContainerserviceDeploymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器服务列表。
    @NameInMap("container_services")
    @Validation(required = true)
    public SontainerServicesList containerServices;

    // 是否自动执行，默认false
    @NameInMap("is_auto_execute")
    public Boolean isAutoExecute;

    // 所属命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 默认CLOUD_NATIVE_GROUP_RELEASE
    @NameInMap("ops_type")
    public String opsType;

    // operator调用专用字段，ReleasePlan唯一标识
    @NameInMap("release_plan_unique_id")
    public String releasePlanUniqueId;

    // tenant 名字，operator调用专用字段
    @NameInMap("tenant_name")
    public String tenantName;

    // 发布单名称。
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 审批人账号id
    @NameInMap("assignee_ids")
    public java.util.List<String> assigneeIds;

    // 操作人账号，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

    // 灰度发布的参数，仅当ops_type为GRAY_RELEASE时生效
    @NameInMap("gray_release_config")
    public GrayReleaseConfig grayReleaseConfig;

    // 引流应用服务列表, 部署单元蓝绿专用
    @NameInMap("traffic_container_services")
    public java.util.List<String> trafficContainerServices;

    // cell列表，部署单元蓝绿专用，按顺序发布
    @NameInMap("cell_names")
    public java.util.List<String> cellNames;

    // 是否紧急发布，目前会自动跳过变更核心
    @NameInMap("emergent")
    public Boolean emergent;

    public static CreateContainerserviceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerserviceDeploymentRequest self = new CreateContainerserviceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerserviceDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContainerserviceDeploymentRequest setContainerServices(SontainerServicesList containerServices) {
        this.containerServices = containerServices;
        return this;
    }
    public SontainerServicesList getContainerServices() {
        return this.containerServices;
    }

    public CreateContainerserviceDeploymentRequest setIsAutoExecute(Boolean isAutoExecute) {
        this.isAutoExecute = isAutoExecute;
        return this;
    }
    public Boolean getIsAutoExecute() {
        return this.isAutoExecute;
    }

    public CreateContainerserviceDeploymentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateContainerserviceDeploymentRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public CreateContainerserviceDeploymentRequest setReleasePlanUniqueId(String releasePlanUniqueId) {
        this.releasePlanUniqueId = releasePlanUniqueId;
        return this;
    }
    public String getReleasePlanUniqueId() {
        return this.releasePlanUniqueId;
    }

    public CreateContainerserviceDeploymentRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateContainerserviceDeploymentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateContainerserviceDeploymentRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateContainerserviceDeploymentRequest setAssigneeIds(java.util.List<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }
    public java.util.List<String> getAssigneeIds() {
        return this.assigneeIds;
    }

    public CreateContainerserviceDeploymentRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateContainerserviceDeploymentRequest setGrayReleaseConfig(GrayReleaseConfig grayReleaseConfig) {
        this.grayReleaseConfig = grayReleaseConfig;
        return this;
    }
    public GrayReleaseConfig getGrayReleaseConfig() {
        return this.grayReleaseConfig;
    }

    public CreateContainerserviceDeploymentRequest setTrafficContainerServices(java.util.List<String> trafficContainerServices) {
        this.trafficContainerServices = trafficContainerServices;
        return this;
    }
    public java.util.List<String> getTrafficContainerServices() {
        return this.trafficContainerServices;
    }

    public CreateContainerserviceDeploymentRequest setCellNames(java.util.List<String> cellNames) {
        this.cellNames = cellNames;
        return this;
    }
    public java.util.List<String> getCellNames() {
        return this.cellNames;
    }

    public CreateContainerserviceDeploymentRequest setEmergent(Boolean emergent) {
        this.emergent = emergent;
        return this;
    }
    public Boolean getEmergent() {
        return this.emergent;
    }

}
