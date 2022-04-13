// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSidecaropsTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // sidecar类型
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar版本
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 工作空间组
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // 工作空间组名
    @NameInMap("workspace_group_label")
    @Validation(required = true)
    public String workspaceGroupLabel;

    // 工作空间
    @NameInMap("workspace_id")
    public String workspaceId;

    // 镜像地址
    @NameInMap("image")
    public String image;

    // 可以根据租户名称筛选应用于该租户的基线模板
    @NameInMap("tenant_name")
    public String tenantName;

    public static ListSidecaropsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSidecaropsTemplateRequest self = new ListSidecaropsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListSidecaropsTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSidecaropsTemplateRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public ListSidecaropsTemplateRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public ListSidecaropsTemplateRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public ListSidecaropsTemplateRequest setWorkspaceGroupLabel(String workspaceGroupLabel) {
        this.workspaceGroupLabel = workspaceGroupLabel;
        return this;
    }
    public String getWorkspaceGroupLabel() {
        return this.workspaceGroupLabel;
    }

    public ListSidecaropsTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListSidecaropsTemplateRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ListSidecaropsTemplateRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
