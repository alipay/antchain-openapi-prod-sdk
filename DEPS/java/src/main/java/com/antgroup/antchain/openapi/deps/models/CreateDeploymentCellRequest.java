// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateDeploymentCellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 所属逻辑单元名称[单元化模式特有]
    // 当type为"RZone"或"CZone"时，为必填项
    @NameInMap("cell_group")
    public String cellGroup;

    // 蓝绿着色信息[单元化模式特有]
    @NameInMap("color")
    public String color;

    // 部署单元唯一标识
    @NameInMap("identity")
    public String identity;

    // 是否灰度[单元化模式特有]
    @NameInMap("is_gray")
    public Boolean isGray;

    // 部署单元名称
    @NameInMap("name")
    public String name;

    // 部署单元类型:
    // RZone, CZone,GZone,default
    @NameInMap("type")
    public String type;

    // 权重[单元化模式特有]
    @NameInMap("weight")
    public Long weight;

    // 所属工作空间名称
    @NameInMap("workspace")
    public String workspace;

    // 所属环境组名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // 所属机房名称
    @NameInMap("zone")
    public String zone;

    public static CreateDeploymentCellRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentCellRequest self = new CreateDeploymentCellRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDeploymentCellRequest setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public CreateDeploymentCellRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateDeploymentCellRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateDeploymentCellRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public CreateDeploymentCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDeploymentCellRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDeploymentCellRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public CreateDeploymentCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateDeploymentCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateDeploymentCellRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
