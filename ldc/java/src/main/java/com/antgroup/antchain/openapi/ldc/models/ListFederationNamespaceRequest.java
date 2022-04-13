// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFederationNamespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // k8s resource label selector
    @NameInMap("label_selector")
    public String labelSelector;

    // workspace group名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static ListFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFederationNamespaceRequest self = new ListFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ListFederationNamespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListFederationNamespaceRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
