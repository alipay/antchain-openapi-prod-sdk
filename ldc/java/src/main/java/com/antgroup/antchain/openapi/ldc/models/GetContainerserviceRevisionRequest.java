// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetContainerserviceRevisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器应用服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 版本号。
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // fed namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    public static GetContainerserviceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContainerserviceRevisionRequest self = new GetContainerserviceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public GetContainerserviceRevisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetContainerserviceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetContainerserviceRevisionRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public GetContainerserviceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public GetContainerserviceRevisionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
