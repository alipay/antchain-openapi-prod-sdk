// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属逻辑单元名称[单元化模式特有]。
    @NameInMap("cell_group")
    public String cellGroup;

    // 蓝绿着色信息[单元化模式特有]。
    @NameInMap("color")
    public String color;

    // 部署单元标识。
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 是否灰度[单元化模式特有]。
    @NameInMap("is_gray")
    public Boolean isGray;

    // 部署单元名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 部署单元类型[单元化模式特有]。
    @NameInMap("type")
    public String type;

    // 权重[单元化模式特有]。
    @NameInMap("weight")
    public Long weight;

    // 所属环境名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属机房。
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    // 所属工作空间名称。
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateCellRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCellRequest self = new CreateCellRequest();
        return TeaModel.build(map, self);
    }

    public CreateCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCellRequest setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public CreateCellRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateCellRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateCellRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public CreateCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCellRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCellRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public CreateCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateCellRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public CreateCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
