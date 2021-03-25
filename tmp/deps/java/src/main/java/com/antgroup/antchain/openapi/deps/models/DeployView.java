// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeployView extends TeaModel {
    // 当前 workspace 下的所有应用服务
    @NameInMap("workspace_app_services")
    @Validation(required = true)
    public java.util.List<AppServiceEntity> workspaceAppServices;

    // workspace 显示名称
    @NameInMap("workspace_display_name")
    @Validation(required = true)
    public String workspaceDisplayName;

    // workspace id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // workspace 名称
    @NameInMap("workspace_name")
    public String workspaceName;

    public static DeployView build(java.util.Map<String, ?> map) throws Exception {
        DeployView self = new DeployView();
        return TeaModel.build(map, self);
    }

    public DeployView setWorkspaceAppServices(java.util.List<AppServiceEntity> workspaceAppServices) {
        this.workspaceAppServices = workspaceAppServices;
        return this;
    }
    public java.util.List<AppServiceEntity> getWorkspaceAppServices() {
        return this.workspaceAppServices;
    }

    public DeployView setWorkspaceDisplayName(String workspaceDisplayName) {
        this.workspaceDisplayName = workspaceDisplayName;
        return this;
    }
    public String getWorkspaceDisplayName() {
        return this.workspaceDisplayName;
    }

    public DeployView setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DeployView setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
