// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceCommentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // wsg
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // fed namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // container service name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // specific container service revision
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 版本注释
    @NameInMap("comment")
    public String comment;

    public static UpdateContainerserviceCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceCommentRequest self = new UpdateContainerserviceCommentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceCommentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceCommentRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateContainerserviceCommentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateContainerserviceCommentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerserviceCommentRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateContainerserviceCommentRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
