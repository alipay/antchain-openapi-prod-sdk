// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单元名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属环境信息。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属工作空间名称。
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static GetCellRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCellRequest self = new GetCellRequest();
        return TeaModel.build(map, self);
    }

    public GetCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public GetCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
