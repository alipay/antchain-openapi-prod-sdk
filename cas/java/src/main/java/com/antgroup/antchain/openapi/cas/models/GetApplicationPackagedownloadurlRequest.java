// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetApplicationPackagedownloadurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // versionId
    @NameInMap("version_id")
    @Validation(required = true)
    public String versionId;

    // 应用id，用于鉴权
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    public static GetApplicationPackagedownloadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationPackagedownloadurlRequest self = new GetApplicationPackagedownloadurlRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationPackagedownloadurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationPackagedownloadurlRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetApplicationPackagedownloadurlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
