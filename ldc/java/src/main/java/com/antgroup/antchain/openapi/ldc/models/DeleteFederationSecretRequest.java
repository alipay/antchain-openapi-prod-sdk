// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteFederationSecretRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // FedSecret name
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // workspaceGroupName
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    // 所属命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    public static DeleteFederationSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFederationSecretRequest self = new DeleteFederationSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFederationSecretRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteFederationSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteFederationSecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public DeleteFederationSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
