// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateBuildpacknewRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // availableTenantNames
    @NameInMap("available_tenant_names")
    public java.util.List<String> availableTenantNames;

    // buildpackParams
    @NameInMap("buildpack_params")
    public java.util.List<BuildpackParamTemplate> buildpackParams;

    // buildCommand
    @NameInMap("build_command")
    public String buildCommand;

    // buildCommandParams
    @NameInMap("build_command_params")
    public java.util.List<BuildCommandParams> buildCommandParams;

    // contact_info
    // 
    @NameInMap("contact_info")
    public String contactInfo;

    // debug_mode
    // 
    @NameInMap("debug_mode")
    public Boolean debugMode;

    // description
    @NameInMap("description")
    public String description;

    // full_version
    // 
    @NameInMap("full_version")
    public String fullVersion;

    // major_version
    // 
    @NameInMap("major_version")
    public Long majorVersion;

    // minor_version
    // 
    @NameInMap("minor_version")
    public Long minorVersion;

    // patch_version
    // 
    @NameInMap("patch_version")
    public Long patchVersion;

    // scope
    // 
    @NameInMap("scope")
    public String scope;

    // StorageUploadEndpoint
    @NameInMap("storage_upload_endpoints")
    public String storageUploadEndpoints;

    // supported_os
    // 
    @NameInMap("supported_os")
    public java.util.List<Long> supportedOs;

    // supported_regions
    // 
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelation> supportedRegions;

    // techstack_id
    // 
    @NameInMap("techstack_id")
    public Long techstackId;

    // techstack
    @NameInMap("techstack")
    public Techstack techstack;

    // status
    @NameInMap("status")
    public String status;

    // id
    @NameInMap("id")
    public String id;

    public static CreateBuildpacknewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpacknewRequest self = new CreateBuildpacknewRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuildpacknewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBuildpacknewRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateBuildpacknewRequest setAvailableTenantNames(java.util.List<String> availableTenantNames) {
        this.availableTenantNames = availableTenantNames;
        return this;
    }
    public java.util.List<String> getAvailableTenantNames() {
        return this.availableTenantNames;
    }

    public CreateBuildpacknewRequest setBuildpackParams(java.util.List<BuildpackParamTemplate> buildpackParams) {
        this.buildpackParams = buildpackParams;
        return this;
    }
    public java.util.List<BuildpackParamTemplate> getBuildpackParams() {
        return this.buildpackParams;
    }

    public CreateBuildpacknewRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public CreateBuildpacknewRequest setBuildCommandParams(java.util.List<BuildCommandParams> buildCommandParams) {
        this.buildCommandParams = buildCommandParams;
        return this;
    }
    public java.util.List<BuildCommandParams> getBuildCommandParams() {
        return this.buildCommandParams;
    }

    public CreateBuildpacknewRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public CreateBuildpacknewRequest setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public CreateBuildpacknewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBuildpacknewRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public CreateBuildpacknewRequest setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public CreateBuildpacknewRequest setMinorVersion(Long minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public Long getMinorVersion() {
        return this.minorVersion;
    }

    public CreateBuildpacknewRequest setPatchVersion(Long patchVersion) {
        this.patchVersion = patchVersion;
        return this;
    }
    public Long getPatchVersion() {
        return this.patchVersion;
    }

    public CreateBuildpacknewRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateBuildpacknewRequest setStorageUploadEndpoints(String storageUploadEndpoints) {
        this.storageUploadEndpoints = storageUploadEndpoints;
        return this;
    }
    public String getStorageUploadEndpoints() {
        return this.storageUploadEndpoints;
    }

    public CreateBuildpacknewRequest setSupportedOs(java.util.List<Long> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }
    public java.util.List<Long> getSupportedOs() {
        return this.supportedOs;
    }

    public CreateBuildpacknewRequest setSupportedRegions(java.util.List<BuildpackRegionRelation> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelation> getSupportedRegions() {
        return this.supportedRegions;
    }

    public CreateBuildpacknewRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public CreateBuildpacknewRequest setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

    public CreateBuildpacknewRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateBuildpacknewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
