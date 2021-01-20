// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackDetailVO extends TeaModel {
    // appServiceCount
    @NameInMap("app_service_count")
    public Long appServiceCount;

    // availableTenantNames
    @NameInMap("available_tenant_names")
    public java.util.List<String> availableTenantNames;

    // buildpack_params
    @NameInMap("buildpack_params")
    public java.util.List<BuildpackParamTemplate> buildpackParams;

    // buildCommand
    @NameInMap("build_command")
    public String buildCommand;

    // build_commandp_params
    @NameInMap("build_command_params")
    public java.util.List<BuildCommandParams> buildCommandParams;

    // contactInfo
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

    // creator
    @NameInMap("creator")
    public UserDTO creator;

    // debugMode
    @NameInMap("debug_mode")
    public Boolean debugMode;

    // depracationNote
    @NameInMap("depracation_note")
    public String depracationNote;

    // description
    @NameInMap("description")
    public String description;

    // extraInfo
    @NameInMap("extra_info")
    public String extraInfo;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // id
    @NameInMap("id")
    public String id;

    // industryLabel
    @NameInMap("industry_label")
    public String industryLabel;

    // majorVersion
    @NameInMap("major_version")
    public Long majorVersion;

    // minorVersion
    @NameInMap("minor_version")
    public Long minorVersion;

    // modificationTime
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // originType
    @NameInMap("origin_type")
    public String originType;

    // patchVersion
    @NameInMap("patch_version")
    public Long patchVersion;

    // publicationTime
    @NameInMap("publication_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTime;

    // publisher
    @NameInMap("publisher")
    public UserDTO publisher;

    // scope
    @NameInMap("scope")
    public String scope;

    // status
    @NameInMap("status")
    public String status;

    // storageUploadEndpoints
    @NameInMap("storage_upload_endpoints")
    public java.util.List<UploadEndpoint> storageUploadEndpoints;

    // supportedOS
    @NameInMap("supported_o_s")
    public java.util.List<BuildpackOS> supportedOS;

    // supportedRegions
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelationDetail> supportedRegions;

    // techstack
    @NameInMap("techstack")
    public Techstack techstack;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    public static BuildpackDetailVO build(java.util.Map<String, ?> map) throws Exception {
        BuildpackDetailVO self = new BuildpackDetailVO();
        return TeaModel.build(map, self);
    }

    public BuildpackDetailVO setAppServiceCount(Long appServiceCount) {
        this.appServiceCount = appServiceCount;
        return this;
    }
    public Long getAppServiceCount() {
        return this.appServiceCount;
    }

    public BuildpackDetailVO setAvailableTenantNames(java.util.List<String> availableTenantNames) {
        this.availableTenantNames = availableTenantNames;
        return this;
    }
    public java.util.List<String> getAvailableTenantNames() {
        return this.availableTenantNames;
    }

    public BuildpackDetailVO setBuildpackParams(java.util.List<BuildpackParamTemplate> buildpackParams) {
        this.buildpackParams = buildpackParams;
        return this;
    }
    public java.util.List<BuildpackParamTemplate> getBuildpackParams() {
        return this.buildpackParams;
    }

    public BuildpackDetailVO setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public BuildpackDetailVO setBuildCommandParams(java.util.List<BuildCommandParams> buildCommandParams) {
        this.buildCommandParams = buildCommandParams;
        return this;
    }
    public java.util.List<BuildCommandParams> getBuildCommandParams() {
        return this.buildCommandParams;
    }

    public BuildpackDetailVO setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public BuildpackDetailVO setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
        return this;
    }
    public String getCreatedFrom() {
        return this.createdFrom;
    }

    public BuildpackDetailVO setCreationChain(java.util.List<String> creationChain) {
        this.creationChain = creationChain;
        return this;
    }
    public java.util.List<String> getCreationChain() {
        return this.creationChain;
    }

    public BuildpackDetailVO setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public BuildpackDetailVO setCreator(UserDTO creator) {
        this.creator = creator;
        return this;
    }
    public UserDTO getCreator() {
        return this.creator;
    }

    public BuildpackDetailVO setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public BuildpackDetailVO setDepracationNote(String depracationNote) {
        this.depracationNote = depracationNote;
        return this;
    }
    public String getDepracationNote() {
        return this.depracationNote;
    }

    public BuildpackDetailVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuildpackDetailVO setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public BuildpackDetailVO setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public BuildpackDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BuildpackDetailVO setIndustryLabel(String industryLabel) {
        this.industryLabel = industryLabel;
        return this;
    }
    public String getIndustryLabel() {
        return this.industryLabel;
    }

    public BuildpackDetailVO setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public BuildpackDetailVO setMinorVersion(Long minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public Long getMinorVersion() {
        return this.minorVersion;
    }

    public BuildpackDetailVO setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public BuildpackDetailVO setOriginType(String originType) {
        this.originType = originType;
        return this;
    }
    public String getOriginType() {
        return this.originType;
    }

    public BuildpackDetailVO setPatchVersion(Long patchVersion) {
        this.patchVersion = patchVersion;
        return this;
    }
    public Long getPatchVersion() {
        return this.patchVersion;
    }

    public BuildpackDetailVO setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
        return this;
    }
    public String getPublicationTime() {
        return this.publicationTime;
    }

    public BuildpackDetailVO setPublisher(UserDTO publisher) {
        this.publisher = publisher;
        return this;
    }
    public UserDTO getPublisher() {
        return this.publisher;
    }

    public BuildpackDetailVO setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public BuildpackDetailVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BuildpackDetailVO setStorageUploadEndpoints(java.util.List<UploadEndpoint> storageUploadEndpoints) {
        this.storageUploadEndpoints = storageUploadEndpoints;
        return this;
    }
    public java.util.List<UploadEndpoint> getStorageUploadEndpoints() {
        return this.storageUploadEndpoints;
    }

    public BuildpackDetailVO setSupportedOS(java.util.List<BuildpackOS> supportedOS) {
        this.supportedOS = supportedOS;
        return this;
    }
    public java.util.List<BuildpackOS> getSupportedOS() {
        return this.supportedOS;
    }

    public BuildpackDetailVO setSupportedRegions(java.util.List<BuildpackRegionRelationDetail> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelationDetail> getSupportedRegions() {
        return this.supportedRegions;
    }

    public BuildpackDetailVO setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

    public BuildpackDetailVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
