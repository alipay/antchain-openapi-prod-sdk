// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSidecarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // scope
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    // workspace_group_id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    public static ListSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarRequest self = new ListSidecarRequest();
        return TeaModel.build(map, self);
    }

    public ListSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSidecarRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSidecarRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSidecarRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ListSidecarRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

}
