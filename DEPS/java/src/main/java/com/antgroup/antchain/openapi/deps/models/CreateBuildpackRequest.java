// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 技术栈所支持的租户名称列表
    @NameInMap("available_tenant_names")
    public java.util.List<String> availableTenantNames;

    // 技术栈的编译打包命令
    @NameInMap("build_command")
    public String buildCommand;

    // 分享给其他租户时留下的联系信息
    @NameInMap("contact_info")
    public String contactInfo;

    // 当前技术栈是否是debug模式
    @NameInMap("debug_mode")
    public Boolean debugMode;

    // 描述
    @NameInMap("description")
    public String description;

    // 环境变量
    @NameInMap("env_params")
    public java.util.List<BuildpackParamTemplate> envParams;

    // 技术栈的版本号
    @NameInMap("full_version")
    public String fullVersion;

    // 主版本号
    @NameInMap("major_version")
    public Long majorVersion;

    // 次版本号
    @NameInMap("minor_version")
    public Long minorVersion;

    // 补丁版本号
    @NameInMap("patch_version")
    public Long patchVersion;

    // 技术栈的作用域，可以是SYSTEM或者CUSTOM
    @NameInMap("scope")
    public String scope;

    // 支持的操作系统ID
    @NameInMap("supported_os")
    public java.util.List<Long> supportedOs;

    // 技术栈支持的地域信息
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelation> supportedRegions;

    // 技术栈大类的id
    @NameInMap("techstack_id")
    public Long techstackId;

    public static CreateBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackRequest self = new CreateBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBuildpackRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateBuildpackRequest setAvailableTenantNames(java.util.List<String> availableTenantNames) {
        this.availableTenantNames = availableTenantNames;
        return this;
    }
    public java.util.List<String> getAvailableTenantNames() {
        return this.availableTenantNames;
    }

    public CreateBuildpackRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public CreateBuildpackRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public CreateBuildpackRequest setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public CreateBuildpackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBuildpackRequest setEnvParams(java.util.List<BuildpackParamTemplate> envParams) {
        this.envParams = envParams;
        return this;
    }
    public java.util.List<BuildpackParamTemplate> getEnvParams() {
        return this.envParams;
    }

    public CreateBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public CreateBuildpackRequest setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public CreateBuildpackRequest setMinorVersion(Long minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public Long getMinorVersion() {
        return this.minorVersion;
    }

    public CreateBuildpackRequest setPatchVersion(Long patchVersion) {
        this.patchVersion = patchVersion;
        return this;
    }
    public Long getPatchVersion() {
        return this.patchVersion;
    }

    public CreateBuildpackRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateBuildpackRequest setSupportedOs(java.util.List<Long> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }
    public java.util.List<Long> getSupportedOs() {
        return this.supportedOs;
    }

    public CreateBuildpackRequest setSupportedRegions(java.util.List<BuildpackRegionRelation> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelation> getSupportedRegions() {
        return this.supportedRegions;
    }

    public CreateBuildpackRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

}
