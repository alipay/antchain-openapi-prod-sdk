// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 更新镜像的完整地址
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 容器应用服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 容器服务所在命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 操作人。
    @NameInMap("operator")
    public String operator;

    // 容器应用服务版本。
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateContainerserviceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceImageRequest self = new UpdateContainerserviceImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceImageRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public UpdateContainerserviceImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerserviceImageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateContainerserviceImageRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateContainerserviceImageRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateContainerserviceImageRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
