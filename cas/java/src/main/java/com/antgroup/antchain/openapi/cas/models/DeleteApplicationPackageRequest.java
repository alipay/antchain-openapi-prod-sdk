// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteApplicationPackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // version_id
    @NameInMap("version_id")
    @Validation(required = true)
    public String versionId;

    // 应用id，用于鉴权
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    public static DeleteApplicationPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationPackageRequest self = new DeleteApplicationPackageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationPackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteApplicationPackageRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DeleteApplicationPackageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
