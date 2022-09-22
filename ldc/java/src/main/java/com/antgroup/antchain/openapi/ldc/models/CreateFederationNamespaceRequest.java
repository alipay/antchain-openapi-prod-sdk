// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFederationNamespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // k8s resource labels
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // FedNamespace名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // workspaceGroup名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    // annotation,可以用来存放description等其他字段
    @NameInMap("annotations")
    public java.util.List<Annotation> annotations;

    public static CreateFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFederationNamespaceRequest self = new CreateFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateFederationNamespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFederationNamespaceRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateFederationNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public CreateFederationNamespaceRequest setAnnotations(java.util.List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<Annotation> getAnnotations() {
        return this.annotations;
    }

}
