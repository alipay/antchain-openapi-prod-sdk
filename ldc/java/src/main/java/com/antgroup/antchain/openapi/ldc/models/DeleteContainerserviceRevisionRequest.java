// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteContainerserviceRevisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 版本号
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 所属工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 操作人账号
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static DeleteContainerserviceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerserviceRevisionRequest self = new DeleteContainerserviceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContainerserviceRevisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteContainerserviceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteContainerserviceRevisionRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public DeleteContainerserviceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteContainerserviceRevisionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteContainerserviceRevisionRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
