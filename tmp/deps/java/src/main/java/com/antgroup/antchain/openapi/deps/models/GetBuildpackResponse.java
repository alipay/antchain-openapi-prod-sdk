// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetBuildpackResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // buildpackParams
    @NameInMap("buildpack_params")
    public java.util.List<BuildpackParamTemplate> buildpackParams;

    // contactInfo
    @NameInMap("contact_info")
    public String contactInfo;

    // creatorId
    @NameInMap("creator_id")
    public String creatorId;

    // debugMode
    @NameInMap("debug_mode")
    public Boolean debugMode;

    // depracationNote
    @NameInMap("depracation_note")
    public String depracationNote;

    // description
    @NameInMap("description")
    public String description;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // publicationTime
    @NameInMap("publication_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTime;

    // publisherId
    @NameInMap("publisher_id")
    public String publisherId;

    // scope
    @NameInMap("scope")
    public String scope;

    // sharedTenants
    @NameInMap("shared_tenants")
    public java.util.List<String> sharedTenants;

    // status
    @NameInMap("status")
    public String status;

    // supportedOs
    @NameInMap("supported_os")
    public java.util.List<BuildpackOS> supportedOs;

    // supportedRegions
    @NameInMap("supported_regions")
    public java.util.List<String> supportedRegions;

    // techstackId
    @NameInMap("techstack_id")
    public String techstackId;

    public static GetBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpackResponse self = new GetBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public GetBuildpackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetBuildpackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBuildpackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetBuildpackResponse setBuildpackParams(java.util.List<BuildpackParamTemplate> buildpackParams) {
        this.buildpackParams = buildpackParams;
        return this;
    }
    public java.util.List<BuildpackParamTemplate> getBuildpackParams() {
        return this.buildpackParams;
    }

    public GetBuildpackResponse setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public GetBuildpackResponse setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public GetBuildpackResponse setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public GetBuildpackResponse setDepracationNote(String depracationNote) {
        this.depracationNote = depracationNote;
        return this;
    }
    public String getDepracationNote() {
        return this.depracationNote;
    }

    public GetBuildpackResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetBuildpackResponse setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public GetBuildpackResponse setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
        return this;
    }
    public String getPublicationTime() {
        return this.publicationTime;
    }

    public GetBuildpackResponse setPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }
    public String getPublisherId() {
        return this.publisherId;
    }

    public GetBuildpackResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetBuildpackResponse setSharedTenants(java.util.List<String> sharedTenants) {
        this.sharedTenants = sharedTenants;
        return this;
    }
    public java.util.List<String> getSharedTenants() {
        return this.sharedTenants;
    }

    public GetBuildpackResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetBuildpackResponse setSupportedOs(java.util.List<BuildpackOS> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }
    public java.util.List<BuildpackOS> getSupportedOs() {
        return this.supportedOs;
    }

    public GetBuildpackResponse setSupportedRegions(java.util.List<String> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<String> getSupportedRegions() {
        return this.supportedRegions;
    }

    public GetBuildpackResponse setTechstackId(String techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public String getTechstackId() {
        return this.techstackId;
    }

}
