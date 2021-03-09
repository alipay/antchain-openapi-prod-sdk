// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateApplicationPackageRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // manifest
    @NameInMap("manifest")
    @Validation(required = true)
    public AppManifest manifest;

    public static CreateApplicationPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationPackageRequest self = new CreateApplicationPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationPackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApplicationPackageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateApplicationPackageRequest setManifest(AppManifest manifest) {
        this.manifest = manifest;
        return this;
    }
    public AppManifest getManifest() {
        return this.manifest;
    }

}
