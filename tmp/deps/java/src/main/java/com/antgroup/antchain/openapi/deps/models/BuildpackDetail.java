// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackDetail extends TeaModel {
    // 使用该技术栈版本的appservice的数量
    @NameInMap("app_service_count")
    public Long appServiceCount;

    // 可以使用该技术栈版本的租户ID
    @NameInMap("available_tenant_names")
    public java.util.List<String> availableTenantNames;

    // buildCommand
    @NameInMap("build_command")
    public String buildCommand;

    // 分享给其他租户留下的联系信息
    @NameInMap("contact_info")
    public String contactInfo;

    // createdFrom
    @NameInMap("created_from")
    public String createdFrom;

    // creationChain
    @NameInMap("creation_chain")
    public java.util.List<String> creationChain;

    // creationTime
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // 当前技术栈版本是否是debug模式
    @NameInMap("debug_mode")
    public Boolean debugMode;

    // 废弃技术栈版本的原因
    @NameInMap("depracation_note")
    public String depracationNote;

    // 描述
    @NameInMap("description")
    public String description;

    // extraInfo
    @NameInMap("extra_info")
    public String extraInfo;

    // 技术栈版本号
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

    // modificationTime
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // 原始类型
    @NameInMap("origin_type")
    public String originType;

    // 补丁版本号
    @NameInMap("patch_version")
    public Long patchVersion;

    // 发布时间
    @NameInMap("publication_time")
    public String publicationTime;

    // 发布时间，日期格式
    @NameInMap("publication_time_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTimeDate;

    // 技术栈版本提供方所在域
    @NameInMap("scope")
    public String scope;

    // 技术栈版本的状态
    @NameInMap("status")
    public String status;

    // 支持的操作系统列表
    @NameInMap("supported_os")
    public java.util.List<BuildpackOS> supportedOs;

    // 支持的地域ID列表
    @NameInMap("supported_regions")
    public java.util.List<String> supportedRegions;

    // 支持的地域列表
    @NameInMap("supported_regions_list")
    public java.util.List<BuildpackRegionRelationDetail> supportedRegionsList;

    // techstack
    @NameInMap("techstack")
    public Techstack techstack;

    // 关联的 Techstack ID
    @NameInMap("techstack_id")
    public Long techstackId;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    public static BuildpackDetail build(java.util.Map<String, ?> map) throws Exception {
        BuildpackDetail self = new BuildpackDetail();
        return TeaModel.build(map, self);
    }

    public BuildpackDetail setAppServiceCount(Long appServiceCount) {
        this.appServiceCount = appServiceCount;
        return this;
    }
    public Long getAppServiceCount() {
        return this.appServiceCount;
    }

    public BuildpackDetail setAvailableTenantNames(java.util.List<String> availableTenantNames) {
        this.availableTenantNames = availableTenantNames;
        return this;
    }
    public java.util.List<String> getAvailableTenantNames() {
        return this.availableTenantNames;
    }

    public BuildpackDetail setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public BuildpackDetail setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public BuildpackDetail setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
        return this;
    }
    public String getCreatedFrom() {
        return this.createdFrom;
    }

    public BuildpackDetail setCreationChain(java.util.List<String> creationChain) {
        this.creationChain = creationChain;
        return this;
    }
    public java.util.List<String> getCreationChain() {
        return this.creationChain;
    }

    public BuildpackDetail setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public BuildpackDetail setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public BuildpackDetail setDepracationNote(String depracationNote) {
        this.depracationNote = depracationNote;
        return this;
    }
    public String getDepracationNote() {
        return this.depracationNote;
    }

    public BuildpackDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuildpackDetail setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public BuildpackDetail setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public BuildpackDetail setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BuildpackDetail setIndustryLabel(String industryLabel) {
        this.industryLabel = industryLabel;
        return this;
    }
    public String getIndustryLabel() {
        return this.industryLabel;
    }

    public BuildpackDetail setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public BuildpackDetail setMinorVersion(Long minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public Long getMinorVersion() {
        return this.minorVersion;
    }

    public BuildpackDetail setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public BuildpackDetail setOriginType(String originType) {
        this.originType = originType;
        return this;
    }
    public String getOriginType() {
        return this.originType;
    }

    public BuildpackDetail setPatchVersion(Long patchVersion) {
        this.patchVersion = patchVersion;
        return this;
    }
    public Long getPatchVersion() {
        return this.patchVersion;
    }

    public BuildpackDetail setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
        return this;
    }
    public String getPublicationTime() {
        return this.publicationTime;
    }

    public BuildpackDetail setPublicationTimeDate(String publicationTimeDate) {
        this.publicationTimeDate = publicationTimeDate;
        return this;
    }
    public String getPublicationTimeDate() {
        return this.publicationTimeDate;
    }

    public BuildpackDetail setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public BuildpackDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BuildpackDetail setSupportedOs(java.util.List<BuildpackOS> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }
    public java.util.List<BuildpackOS> getSupportedOs() {
        return this.supportedOs;
    }

    public BuildpackDetail setSupportedRegions(java.util.List<String> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<String> getSupportedRegions() {
        return this.supportedRegions;
    }

    public BuildpackDetail setSupportedRegionsList(java.util.List<BuildpackRegionRelationDetail> supportedRegionsList) {
        this.supportedRegionsList = supportedRegionsList;
        return this;
    }
    public java.util.List<BuildpackRegionRelationDetail> getSupportedRegionsList() {
        return this.supportedRegionsList;
    }

    public BuildpackDetail setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

    public BuildpackDetail setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public BuildpackDetail setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
