// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 蓝绿着色信息。
    @NameInMap("color")
    public String color;

    // 是否灰度。
    @NameInMap("is_gray")
    public Boolean isGray;

    // 部署单元名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 默认权重。
    @NameInMap("weight")
    public Long weight;

    // 所属环境信息。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属工作空间名称。
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static UpdateCellRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCellRequest self = new UpdateCellRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCellRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateCellRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public UpdateCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCellRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public UpdateCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
