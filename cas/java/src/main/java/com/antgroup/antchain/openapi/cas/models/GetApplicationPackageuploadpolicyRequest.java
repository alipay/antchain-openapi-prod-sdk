// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetApplicationPackageuploadpolicyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // workspaceId
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // version
    @NameInMap("app_version")
    @Validation(required = true)
    public String appVersion;

    public static GetApplicationPackageuploadpolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationPackageuploadpolicyRequest self = new GetApplicationPackageuploadpolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationPackageuploadpolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationPackageuploadpolicyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetApplicationPackageuploadpolicyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetApplicationPackageuploadpolicyRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}
