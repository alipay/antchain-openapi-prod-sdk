// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UploadfinishBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 技术栈的ID
    @NameInMap("buildpack_id")
    @Validation(required = true)
    public String buildpackId;

    // supportedRegions
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelation> supportedRegions;

    public static UploadfinishBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadfinishBuildpackRequest self = new UploadfinishBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public UploadfinishBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadfinishBuildpackRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UploadfinishBuildpackRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public UploadfinishBuildpackRequest setSupportedRegions(java.util.List<BuildpackRegionRelation> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelation> getSupportedRegions() {
        return this.supportedRegions;
    }

}
