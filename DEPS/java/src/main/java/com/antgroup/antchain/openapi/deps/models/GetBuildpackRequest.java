// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 技术栈版本的ID
    @NameInMap("buildpack_id")
    public String buildpackId;

    public static GetBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpackRequest self = new GetBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public GetBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBuildpackRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

}
