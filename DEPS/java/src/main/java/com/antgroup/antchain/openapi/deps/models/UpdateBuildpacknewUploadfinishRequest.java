// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateBuildpacknewUploadfinishRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // buildpackId
    @NameInMap("buildpack_id")
    public String buildpackId;

    // buildpackRegionRelation
    @NameInMap("buildpack_region_relation")
    public BuildpackRegionRelation buildpackRegionRelation;

    public static UpdateBuildpacknewUploadfinishRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBuildpacknewUploadfinishRequest self = new UpdateBuildpacknewUploadfinishRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBuildpacknewUploadfinishRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBuildpacknewUploadfinishRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public UpdateBuildpacknewUploadfinishRequest setBuildpackRegionRelation(BuildpackRegionRelation buildpackRegionRelation) {
        this.buildpackRegionRelation = buildpackRegionRelation;
        return this;
    }
    public BuildpackRegionRelation getBuildpackRegionRelation() {
        return this.buildpackRegionRelation;
    }

}
