// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFederationConfigmapRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // Cell name list
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<String> cells;

    // FedConfigMap data
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<ConfigMapData> data;

    // FedConfigMap labels
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // FedConfigMap name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // Federation ConfigMap namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // FedCofigmap Cluster Overrides
    @NameInMap("overrides")
    public FedConfigMapOverrideList overrides;

    // workspace group 名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static CreateFederationConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFederationConfigmapRequest self = new CreateFederationConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public CreateFederationConfigmapRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFederationConfigmapRequest setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

    public CreateFederationConfigmapRequest setData(java.util.List<ConfigMapData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ConfigMapData> getData() {
        return this.data;
    }

    public CreateFederationConfigmapRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateFederationConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFederationConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateFederationConfigmapRequest setOverrides(FedConfigMapOverrideList overrides) {
        this.overrides = overrides;
        return this;
    }
    public FedConfigMapOverrideList getOverrides() {
        return this.overrides;
    }

    public CreateFederationConfigmapRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
