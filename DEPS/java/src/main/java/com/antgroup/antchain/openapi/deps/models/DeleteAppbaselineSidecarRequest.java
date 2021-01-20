// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteAppbaselineSidecarRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用基线ID
    @NameInMap("appbaseline_id")
    public String appbaselineId;

    public static DeleteAppbaselineSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppbaselineSidecarRequest self = new DeleteAppbaselineSidecarRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppbaselineSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppbaselineSidecarRequest setAppbaselineId(String appbaselineId) {
        this.appbaselineId = appbaselineId;
        return this;
    }
    public String getAppbaselineId() {
        return this.appbaselineId;
    }

}
