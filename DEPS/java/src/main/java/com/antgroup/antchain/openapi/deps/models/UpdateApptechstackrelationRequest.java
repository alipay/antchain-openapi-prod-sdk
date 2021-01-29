// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateApptechstackrelationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appId
    @NameInMap("app_id")
    public String appId;

    // buildpackArch
    @NameInMap("buildpack_arch")
    public String buildpackArch;

    // creationTime
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // extraInfo
    @NameInMap("extra_info")
    public String extraInfo;

    // id
    @NameInMap("id")
    public String id;

    // modificationTime
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // techstackId
    @NameInMap("techstack_id")
    public Long techstackId;

    // techstackIdentity
    @NameInMap("techstack_identity")
    public String techstackIdentity;

    // techstackName
    @NameInMap("techstack_name")
    public String techstackName;

    public static UpdateApptechstackrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApptechstackrelationRequest self = new UpdateApptechstackrelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApptechstackrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApptechstackrelationRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateApptechstackrelationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApptechstackrelationRequest setBuildpackArch(String buildpackArch) {
        this.buildpackArch = buildpackArch;
        return this;
    }
    public String getBuildpackArch() {
        return this.buildpackArch;
    }

    public UpdateApptechstackrelationRequest setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public UpdateApptechstackrelationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateApptechstackrelationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateApptechstackrelationRequest setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public UpdateApptechstackrelationRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public UpdateApptechstackrelationRequest setTechstackIdentity(String techstackIdentity) {
        this.techstackIdentity = techstackIdentity;
        return this;
    }
    public String getTechstackIdentity() {
        return this.techstackIdentity;
    }

    public UpdateApptechstackrelationRequest setTechstackName(String techstackName) {
        this.techstackName = techstackName;
        return this;
    }
    public String getTechstackName() {
        return this.techstackName;
    }

}
