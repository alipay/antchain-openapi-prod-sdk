// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListKubernetesResourcesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 标签选择器。
    @NameInMap("label_selector")
    public String labelSelector;

    // kubernetes资源路径。
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 命名空间名称。
    @NameInMap("namespace")
    public String namespace;

    public static ListKubernetesResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKubernetesResourcesRequest self = new ListKubernetesResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListKubernetesResourcesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListKubernetesResourcesRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ListKubernetesResourcesRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListKubernetesResourcesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListKubernetesResourcesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
