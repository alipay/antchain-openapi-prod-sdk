// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryDeploymentCellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 部署单元名称
    @NameInMap("name")
    public String name;

    // 部署单元名称前缀
    @NameInMap("name_prefix")
    public String namePrefix;

    // 所属工作空间名称
    @NameInMap("workspace")
    public String workspace;

    // 所属环境组名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    public static QueryDeploymentCellRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeploymentCellRequest self = new QueryDeploymentCellRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeploymentCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeploymentCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDeploymentCellRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public QueryDeploymentCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryDeploymentCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
