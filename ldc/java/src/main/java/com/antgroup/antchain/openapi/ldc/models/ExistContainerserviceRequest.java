// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExistContainerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 容器服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ExistContainerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistContainerserviceRequest self = new ExistContainerserviceRequest();
        return TeaModel.build(map, self);
    }

    public ExistContainerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistContainerserviceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ExistContainerserviceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ExistContainerserviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
