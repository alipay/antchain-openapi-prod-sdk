// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

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

    // 技术栈版本号
    @NameInMap("full_version")
    @Validation(required = true)
    public String fullVersion;

    // 技术栈id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 支持的操作系统ID
    @NameInMap("supported_os")
    @Validation(required = true)
    public java.util.List<Long> supportedOs;

    public static UpdateBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBuildpackRequest self = new UpdateBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBuildpackRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateBuildpackRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public UpdateBuildpackRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public UpdateBuildpackRequest setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public UpdateBuildpackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBuildpackRequest setEnvParams(java.util.List<BuildpackParamTemplate> envParams) {
        this.envParams = envParams;
        return this;
    }
    public java.util.List<BuildpackParamTemplate> getEnvParams() {
        return this.envParams;
    }

    public UpdateBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public UpdateBuildpackRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateBuildpackRequest setSupportedOs(java.util.List<Long> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }
    public java.util.List<Long> getSupportedOs() {
        return this.supportedOs;
    }

}
