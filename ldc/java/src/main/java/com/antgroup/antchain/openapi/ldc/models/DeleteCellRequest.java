// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单元名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属环境名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属工作空间名称。
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static DeleteCellRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCellRequest self = new DeleteCellRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
