// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedImagePullSecret extends TeaModel {
    // annotations
    @NameInMap("annotations")
    public java.util.List<String> annotations;

    // image pull secret registry account info
    @NameInMap("data")
    @Validation(required = true)
    public RegistryAccout data;

    // labels
    @NameInMap("labels")
    public java.util.List<String> labels;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // namesapce
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // cell overrides
    @NameInMap("overrides")
    @Validation(required = true)
    public FedImagePullSecretOverrideList overrides;

    // workspace group name
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    // cell list
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<String> cells;

    public static FedImagePullSecret build(java.util.Map<String, ?> map) throws Exception {
        FedImagePullSecret self = new FedImagePullSecret();
        return TeaModel.build(map, self);
    }

    public FedImagePullSecret setAnnotations(java.util.List<String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<String> getAnnotations() {
        return this.annotations;
    }

    public FedImagePullSecret setData(RegistryAccout data) {
        this.data = data;
        return this;
    }
    public RegistryAccout getData() {
        return this.data;
    }

    public FedImagePullSecret setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public FedImagePullSecret setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedImagePullSecret setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FedImagePullSecret setOverrides(FedImagePullSecretOverrideList overrides) {
        this.overrides = overrides;
        return this;
    }
    public FedImagePullSecretOverrideList getOverrides() {
        return this.overrides;
    }

    public FedImagePullSecret setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public FedImagePullSecret setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

}
