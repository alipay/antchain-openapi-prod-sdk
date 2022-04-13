// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFederationImagepullsecretRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cells
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<String> cells;

    // labels
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // image pull secret name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // image pull secret namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // fed image pull secret list
    @NameInMap("overrides")
    @Validation(required = true)
    public FedImagePullSecretOverrideList overrides;

    // registry account
    @NameInMap("registry_account")
    @Validation(required = true)
    public RegistryAccout registryAccount;

    // workspace group name
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static CreateFederationImagepullsecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFederationImagepullsecretRequest self = new CreateFederationImagepullsecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateFederationImagepullsecretRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFederationImagepullsecretRequest setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

    public CreateFederationImagepullsecretRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateFederationImagepullsecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFederationImagepullsecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateFederationImagepullsecretRequest setOverrides(FedImagePullSecretOverrideList overrides) {
        this.overrides = overrides;
        return this;
    }
    public FedImagePullSecretOverrideList getOverrides() {
        return this.overrides;
    }

    public CreateFederationImagepullsecretRequest setRegistryAccount(RegistryAccout registryAccount) {
        this.registryAccount = registryAccount;
        return this;
    }
    public RegistryAccout getRegistryAccount() {
        return this.registryAccount;
    }

    public CreateFederationImagepullsecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
