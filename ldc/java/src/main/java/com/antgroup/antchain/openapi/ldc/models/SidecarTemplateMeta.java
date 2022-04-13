// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarTemplateMeta extends TeaModel {
    // 名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar版本
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    // 具体的模板信息
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    // 工作空间
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 工作空间组id
    @NameInMap("workspace_group_id")
    @Validation(required = true)
    public String workspaceGroupId;

    // 镜像地址
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 保留扩展
    @NameInMap("extension")
    @Validation(required = true)
    public String extension;

    // 基线所应用的scope范围
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    public static SidecarTemplateMeta build(java.util.Map<String, ?> map) throws Exception {
        SidecarTemplateMeta self = new SidecarTemplateMeta();
        return TeaModel.build(map, self);
    }

    public SidecarTemplateMeta setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public SidecarTemplateMeta setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public SidecarTemplateMeta setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SidecarTemplateMeta setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SidecarTemplateMeta setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public SidecarTemplateMeta setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public SidecarTemplateMeta setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public SidecarTemplateMeta setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
