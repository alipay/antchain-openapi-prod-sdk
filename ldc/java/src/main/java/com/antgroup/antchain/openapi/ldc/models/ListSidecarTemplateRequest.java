// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSidecarTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // sidecar_name
    @NameInMap("sidecar_name")
    public String sidecarName;

    // sidecar version
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 环境
    @NameInMap("workspace")
    public String workspace;

    // workspace_group_id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    public static ListSidecarTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarTemplateRequest self = new ListSidecarTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListSidecarTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSidecarTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSidecarTemplateRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSidecarTemplateRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public ListSidecarTemplateRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public ListSidecarTemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ListSidecarTemplateRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

}
