// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFederationConfigmapRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // List labelSelector
    @NameInMap("label_selector")
    public String labelSelector;

    // aaaa
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // workspace group name
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static ListFederationConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFederationConfigmapRequest self = new ListFederationConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public ListFederationConfigmapRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListFederationConfigmapRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListFederationConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListFederationConfigmapRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
