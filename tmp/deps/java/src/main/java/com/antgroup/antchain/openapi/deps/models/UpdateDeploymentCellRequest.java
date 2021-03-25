// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateDeploymentCellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 蓝绿着色信息
    @NameInMap("color")
    public String color;

    // 是否灰度
    @NameInMap("is_gray")
    public Boolean isGray;

    // 部署单元名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 权重
    @NameInMap("weight")
    public Long weight;

    // 所属工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 所属环境组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateDeploymentCellRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentCellRequest self = new UpdateDeploymentCellRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDeploymentCellRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateDeploymentCellRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateDeploymentCellRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public UpdateDeploymentCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDeploymentCellRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public UpdateDeploymentCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public UpdateDeploymentCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
