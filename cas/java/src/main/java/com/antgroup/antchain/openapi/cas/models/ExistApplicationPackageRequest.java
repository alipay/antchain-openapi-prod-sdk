// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ExistApplicationPackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // version
    @NameInMap("app_version")
    @Validation(required = true)
    public String appVersion;

    // workspaceId
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static ExistApplicationPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistApplicationPackageRequest self = new ExistApplicationPackageRequest();
        return TeaModel.build(map, self);
    }

    public ExistApplicationPackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistApplicationPackageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExistApplicationPackageRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ExistApplicationPackageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
