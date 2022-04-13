// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFederationDeploymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 环境组名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static ListFederationDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFederationDeploymentRequest self = new ListFederationDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public ListFederationDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListFederationDeploymentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListFederationDeploymentRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
