// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateBuildpacknewRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // available_tenant_names
    @NameInMap("available_tenant_names")
    public java.util.List<String> availableTenantNames;

    // buildpack_id
    @NameInMap("buildpack_id")
    public String buildpackId;

    // buildpack_params
    @NameInMap("buildpack_params")
    public java.util.List<BuildpackParamTemplate> buildpackParams;

    // contactInfo
    @NameInMap("contact_info")
    public String contactInfo;

    // description
    @NameInMap("description")
    public String description;

    // envParams
    @NameInMap("env_params")
    public java.util.List<BuildpackParamTemplate> envParams;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // id
    @NameInMap("id")
    public String id;

    // scope
    @NameInMap("scope")
    public String scope;

    // status
    @NameInMap("status")
    public String status;

    // supportedOs
    @NameInMap("supported_os")
    public java.util.List<Long> supportedOs;

    // supported_regions
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelation> supportedRegions;

    // techstack
    @NameInMap("techstack")
    public Techstack techstack;

    // techstack_id
    @NameInMap("techstack_id")
    public String techstackId;

    // BuildCommandParams
    @NameInMap("build_command_params")
    public java.util.List<BuildCommandParams> buildCommandParams;

    // creator
    @NameInMap("creator")
    public UserDTO creator;

    // publisher
    @NameInMap("publisher")
    public UserDTO publisher;

    // originType
    @NameInMap("origin_type")
    public String originType;

    // appServiceCount
    @NameInMap("app_service_count")
    public Long appServiceCount;

    // debugMode
    @NameInMap("debug_mode")
    public Boolean debugMode;

    // majorVersion
    @NameInMap("major_version")
    public Long majorVersion;

    // minorVersion
    @NameInMap("minor_version")
    public Long minorVersion;

    // patchVersion
    @NameInMap("patch_version")
    public Long patchVersion;

    // buildCommand
    @NameInMap("build_command")
    public String buildCommand;

    // createdFrom
    @NameInMap("created_from")
    public String createdFrom;

    // publicationTime
    @NameInMap("publication_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTime;

    // creationChain
    @NameInMap("creation_chain")
    public java.util.List<String> creationChain;

    // extraInfo
    @NameInMap("extra_info")
    public String extraInfo;

    // depracationNote
    @NameInMap("depracation_note")
    public String depracationNote;

    // industryLabel
    @NameInMap("industry_label")
    public String industryLabel;

    // creationTime
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // modificationTime
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    public static UpdateBuildpacknewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBuildpacknewRequest self = new UpdateBuildpacknewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBuildpacknewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBuildpacknewRequest setAvailableTenantNames(java.util.List<String> availableTenantNames) {
        this.availableTenantNames = availableTenantNames;
        return this;
    }
    public java.util.List<String> getAvailableTenantNames() {
        return this.availableTenantNames;
    }

    public UpdateBuildpacknewRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public UpdateBuildpacknewRequest setBuildpackParams(java.util.List<BuildpackParamTemplate> buildpackParams) {
        this.buildpackParams = buildpackParams;
        return this;
    }
    public java.util.List<BuildpackParamTemplate> getBuildpackParams() {
        return this.buildpackParams;
    }

    public UpdateBuildpacknewRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public UpdateBuildpacknewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBuildpacknewRequest setEnvParams(java.util.List<BuildpackParamTemplate> envParams) {
        this.envParams = envParams;
        return this;
    }
    public java.util.List<BuildpackParamTemplate> getEnvParams() {
        return this.envParams;
    }

    public UpdateBuildpacknewRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public UpdateBuildpacknewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateBuildpacknewRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateBuildpacknewRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateBuildpacknewRequest setSupportedOs(java.util.List<Long> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }
    public java.util.List<Long> getSupportedOs() {
        return this.supportedOs;
    }

    public UpdateBuildpacknewRequest setSupportedRegions(java.util.List<BuildpackRegionRelation> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelation> getSupportedRegions() {
        return this.supportedRegions;
    }

    public UpdateBuildpacknewRequest setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

    public UpdateBuildpacknewRequest setTechstackId(String techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public String getTechstackId() {
        return this.techstackId;
    }

    public UpdateBuildpacknewRequest setBuildCommandParams(java.util.List<BuildCommandParams> buildCommandParams) {
        this.buildCommandParams = buildCommandParams;
        return this;
    }
    public java.util.List<BuildCommandParams> getBuildCommandParams() {
        return this.buildCommandParams;
    }

    public UpdateBuildpacknewRequest setCreator(UserDTO creator) {
        this.creator = creator;
        return this;
    }
    public UserDTO getCreator() {
        return this.creator;
    }

    public UpdateBuildpacknewRequest setPublisher(UserDTO publisher) {
        this.publisher = publisher;
        return this;
    }
    public UserDTO getPublisher() {
        return this.publisher;
    }

    public UpdateBuildpacknewRequest setOriginType(String originType) {
        this.originType = originType;
        return this;
    }
    public String getOriginType() {
        return this.originType;
    }

    public UpdateBuildpacknewRequest setAppServiceCount(Long appServiceCount) {
        this.appServiceCount = appServiceCount;
        return this;
    }
    public Long getAppServiceCount() {
        return this.appServiceCount;
    }

    public UpdateBuildpacknewRequest setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public UpdateBuildpacknewRequest setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public UpdateBuildpacknewRequest setMinorVersion(Long minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public Long getMinorVersion() {
        return this.minorVersion;
    }

    public UpdateBuildpacknewRequest setPatchVersion(Long patchVersion) {
        this.patchVersion = patchVersion;
        return this;
    }
    public Long getPatchVersion() {
        return this.patchVersion;
    }

    public UpdateBuildpacknewRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public UpdateBuildpacknewRequest setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
        return this;
    }
    public String getCreatedFrom() {
        return this.createdFrom;
    }

    public UpdateBuildpacknewRequest setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
        return this;
    }
    public String getPublicationTime() {
        return this.publicationTime;
    }

    public UpdateBuildpacknewRequest setCreationChain(java.util.List<String> creationChain) {
        this.creationChain = creationChain;
        return this;
    }
    public java.util.List<String> getCreationChain() {
        return this.creationChain;
    }

    public UpdateBuildpacknewRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateBuildpacknewRequest setDepracationNote(String depracationNote) {
        this.depracationNote = depracationNote;
        return this;
    }
    public String getDepracationNote() {
        return this.depracationNote;
    }

    public UpdateBuildpacknewRequest setIndustryLabel(String industryLabel) {
        this.industryLabel = industryLabel;
        return this;
    }
    public String getIndustryLabel() {
        return this.industryLabel;
    }

    public UpdateBuildpacknewRequest setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public UpdateBuildpacknewRequest setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

}
