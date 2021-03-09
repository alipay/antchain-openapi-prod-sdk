// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetApplicationDetailRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 工作空间ID
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static GetApplicationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationDetailRequest self = new GetApplicationDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetApplicationDetailRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
