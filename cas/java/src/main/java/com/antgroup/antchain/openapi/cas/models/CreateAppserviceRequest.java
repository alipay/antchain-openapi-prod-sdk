// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateAppserviceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_service
    @NameInMap("app_service")
    @Validation(required = true)
    public AppService appService;

    // 工作空间id，用于鉴权
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static CreateAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppserviceRequest self = new CreateAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppserviceRequest setAppService(AppService appService) {
        this.appService = appService;
        return this;
    }
    public AppService getAppService() {
        return this.appService;
    }

    public CreateAppserviceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
