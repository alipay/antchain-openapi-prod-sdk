// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateSidecarVersionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // sidecar版本描述
    @NameInMap("description")
    public String description;

    // release note
    @NameInMap("release_note")
    public String releaseNote;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace_name
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar版本号
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    // 模板内容
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    // sidecar模板配置
    @NameInMap("template_configs")
    @Validation(required = true)
    public java.util.List<SidecarTemplateConfig> templateConfigs;

    // sidecar版本类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 版本周期：alpha/beta/release
    @NameInMap("version_period")
    public String versionPeriod;

    public static CreateSidecarVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSidecarVersionRequest self = new CreateSidecarVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSidecarVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSidecarVersionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateSidecarVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSidecarVersionRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public CreateSidecarVersionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateSidecarVersionRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public CreateSidecarVersionRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public CreateSidecarVersionRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public CreateSidecarVersionRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public CreateSidecarVersionRequest setTemplateConfigs(java.util.List<SidecarTemplateConfig> templateConfigs) {
        this.templateConfigs = templateConfigs;
        return this;
    }
    public java.util.List<SidecarTemplateConfig> getTemplateConfigs() {
        return this.templateConfigs;
    }

    public CreateSidecarVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSidecarVersionRequest setVersionPeriod(String versionPeriod) {
        this.versionPeriod = versionPeriod;
        return this;
    }
    public String getVersionPeriod() {
        return this.versionPeriod;
    }

}
