// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UploadApplicationPackageconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 应用id，用于鉴权
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    public static UploadApplicationPackageconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadApplicationPackageconfigRequest self = new UploadApplicationPackageconfigRequest();
        return TeaModel.build(map, self);
    }

    public UploadApplicationPackageconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadApplicationPackageconfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UploadApplicationPackageconfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
