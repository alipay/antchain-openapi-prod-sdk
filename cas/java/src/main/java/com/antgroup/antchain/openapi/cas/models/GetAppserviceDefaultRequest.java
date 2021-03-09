// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppserviceDefaultRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static GetAppserviceDefaultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppserviceDefaultRequest self = new GetAppserviceDefaultRequest();
        return TeaModel.build(map, self);
    }

    public GetAppserviceDefaultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAppserviceDefaultRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppserviceDefaultRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
