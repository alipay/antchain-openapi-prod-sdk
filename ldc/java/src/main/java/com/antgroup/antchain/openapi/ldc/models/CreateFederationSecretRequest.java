// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFederationSecretRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cell name list
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<String> cells;

    // FedSecret data
    // 
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<SecretData> data;

    // FedSecret labels
    // 
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // FedSecret name
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // Federation Secret namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // FedSecret Cluster Overrides
    // 
    @NameInMap("overrides")
    public FedSecretOverrideList overrides;

    // Fed Secret type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // workspace group 名称
    // 
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static CreateFederationSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFederationSecretRequest self = new CreateFederationSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateFederationSecretRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFederationSecretRequest setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

    public CreateFederationSecretRequest setData(java.util.List<SecretData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SecretData> getData() {
        return this.data;
    }

    public CreateFederationSecretRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateFederationSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFederationSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateFederationSecretRequest setOverrides(FedSecretOverrideList overrides) {
        this.overrides = overrides;
        return this;
    }
    public FedSecretOverrideList getOverrides() {
        return this.overrides;
    }

    public CreateFederationSecretRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateFederationSecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
