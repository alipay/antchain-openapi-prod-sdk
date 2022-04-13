// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetFederationSecretRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // FedSecretname
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // workspaceGroup 名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static GetFederationSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFederationSecretRequest self = new GetFederationSecretRequest();
        return TeaModel.build(map, self);
    }

    public GetFederationSecretRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetFederationSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetFederationSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetFederationSecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
