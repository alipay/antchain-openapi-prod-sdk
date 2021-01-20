// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CountBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // buildpackId
    @NameInMap("buildpack_id")
    public String buildpackId;

    public static CountBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        CountBuildpackRequest self = new CountBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public CountBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountBuildpackRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

}
