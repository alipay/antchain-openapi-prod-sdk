// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSidecarVersionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // sidecar版本描述
    @NameInMap("description")
    public String description;

    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    @NameInMap("scope_identity")
    public String scopeIdentity;

    // sidecar名称
    @NameInMap("sidecar_name")
    public String sidecarName;

    // sidecar版本号
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 版本状态
    @NameInMap("status")
    public Long status;

    // sidecar模板内容
    @NameInMap("template")
    public String template;

    // sidecar模板配置
    @NameInMap("template_configs")
    public java.util.List<SidecarTemplateConfig> templateConfigs;

    // sidecar版本类型
    @NameInMap("type")
    public String type;

    // 版本周期：alpha/beta/release
    // 
    @NameInMap("version_period")
    public String versionPeriod;

    // 版本特性
    @NameInMap("release_note")
    public String releaseNote;

    public static UpdateSidecarVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecarVersionRequest self = new UpdateSidecarVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecarVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecarVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSidecarVersionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSidecarVersionRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public UpdateSidecarVersionRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public UpdateSidecarVersionRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public UpdateSidecarVersionRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateSidecarVersionRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdateSidecarVersionRequest setTemplateConfigs(java.util.List<SidecarTemplateConfig> templateConfigs) {
        this.templateConfigs = templateConfigs;
        return this;
    }
    public java.util.List<SidecarTemplateConfig> getTemplateConfigs() {
        return this.templateConfigs;
    }

    public UpdateSidecarVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateSidecarVersionRequest setVersionPeriod(String versionPeriod) {
        this.versionPeriod = versionPeriod;
        return this;
    }
    public String getVersionPeriod() {
        return this.versionPeriod;
    }

    public UpdateSidecarVersionRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

}
