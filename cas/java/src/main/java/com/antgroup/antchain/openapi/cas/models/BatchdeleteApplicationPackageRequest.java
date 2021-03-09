// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BatchdeleteApplicationPackageRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // List<String> versionIds
    @NameInMap("version_ids")
    @Validation(required = true)
    public java.util.List<String> versionIds;

    public static BatchdeleteApplicationPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteApplicationPackageRequest self = new BatchdeleteApplicationPackageRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteApplicationPackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteApplicationPackageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BatchdeleteApplicationPackageRequest setVersionIds(java.util.List<String> versionIds) {
        this.versionIds = versionIds;
        return this;
    }
    public java.util.List<String> getVersionIds() {
        return this.versionIds;
    }

}
