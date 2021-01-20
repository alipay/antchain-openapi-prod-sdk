// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 目标租户名称
    @NameInMap("tenant")
    public String tenant;

    // 目标工作空间名称
    @NameInMap("workspace")
    public String workspace;

    // 目标环境名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    public static QueryCellRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCellRequest self = new QueryCellRequest();
        return TeaModel.build(map, self);
    }

    public QueryCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCellRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
