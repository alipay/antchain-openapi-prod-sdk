// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // buildpackId
    @NameInMap("buildpack_id")
    public String buildpackId;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // techstackId
    @NameInMap("techstack_id")
    public Long techstackId;

    public static ExistBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistBuildpackRequest self = new ExistBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public ExistBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistBuildpackRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public ExistBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public ExistBuildpackRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

}
