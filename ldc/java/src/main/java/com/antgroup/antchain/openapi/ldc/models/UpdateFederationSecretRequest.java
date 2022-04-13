// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFederationSecretRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cell list
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

    // FedSecret命名空间
    // 
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // FedSecret overrides
    // 
    @NameInMap("overrides")
    public FedSecretOverrideList overrides;

    // workspaceGroup名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static UpdateFederationSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFederationSecretRequest self = new UpdateFederationSecretRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFederationSecretRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFederationSecretRequest setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

    public UpdateFederationSecretRequest setData(java.util.List<SecretData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SecretData> getData() {
        return this.data;
    }

    public UpdateFederationSecretRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public UpdateFederationSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFederationSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateFederationSecretRequest setOverrides(FedSecretOverrideList overrides) {
        this.overrides = overrides;
        return this;
    }
    public FedSecretOverrideList getOverrides() {
        return this.overrides;
    }

    public UpdateFederationSecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
