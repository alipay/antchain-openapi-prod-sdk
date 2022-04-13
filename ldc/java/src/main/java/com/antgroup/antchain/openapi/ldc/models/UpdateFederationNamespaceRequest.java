// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFederationNamespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // fed namespace labels
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // Fed Namespace name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // workspace group name
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static UpdateFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFederationNamespaceRequest self = new UpdateFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFederationNamespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFederationNamespaceRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public UpdateFederationNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
