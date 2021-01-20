// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Buildpack extends TeaModel {
    // 可以使用该技术栈版本的租户名称
    @NameInMap("available_tenant_names")
    public java.util.List<String> availableTenantNames;

    // 技术栈版本的编译打包命令
    @NameInMap("build_command")
    public String buildCommand;

    // 分享给其他租户时留下的联系信息
    @NameInMap("contact_info")
    public String contactInfo;

    // 当前技术栈版本是否是debug模式
    @NameInMap("debug_mode")
    public Boolean debugMode;

    // 废弃技术栈版本的原因
    @NameInMap("depracation_note")
    public String depracationNote;

    // 描述
    @NameInMap("description")
    public String description;

    // 技术栈的版本号
    @NameInMap("full_version")
    public String fullVersion;

    // 技术栈版本ID
    @NameInMap("id")
    public String id;

    // 行业标志,I(金区)或者N(非金区)
    @NameInMap("industry_label")
    public String industryLabel;

    // 主要版本号
    @NameInMap("major_version")
    public Long majorVersion;

    // 次要版本号
    @NameInMap("minor_version")
    public Long minorVersion;

    // 补丁版本号
    @NameInMap("patch_version")
    public Long patchVersion;

    // 发布时间
    @NameInMap("publication_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTime;

    // 技术栈版本是系统系统的还是用户自定义的
    @NameInMap("scope")
    public String scope;

    // 技术栈版本的状态
    @NameInMap("status")
    public String status;

    public static Buildpack build(java.util.Map<String, ?> map) throws Exception {
        Buildpack self = new Buildpack();
        return TeaModel.build(map, self);
    }

    public Buildpack setAvailableTenantNames(java.util.List<String> availableTenantNames) {
        this.availableTenantNames = availableTenantNames;
        return this;
    }
    public java.util.List<String> getAvailableTenantNames() {
        return this.availableTenantNames;
    }

    public Buildpack setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public Buildpack setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public Buildpack setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public Buildpack setDepracationNote(String depracationNote) {
        this.depracationNote = depracationNote;
        return this;
    }
    public String getDepracationNote() {
        return this.depracationNote;
    }

    public Buildpack setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Buildpack setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public Buildpack setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Buildpack setIndustryLabel(String industryLabel) {
        this.industryLabel = industryLabel;
        return this;
    }
    public String getIndustryLabel() {
        return this.industryLabel;
    }

    public Buildpack setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public Buildpack setMinorVersion(Long minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public Long getMinorVersion() {
        return this.minorVersion;
    }

    public Buildpack setPatchVersion(Long patchVersion) {
        this.patchVersion = patchVersion;
        return this;
    }
    public Long getPatchVersion() {
        return this.patchVersion;
    }

    public Buildpack setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
        return this;
    }
    public String getPublicationTime() {
        return this.publicationTime;
    }

    public Buildpack setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public Buildpack setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
