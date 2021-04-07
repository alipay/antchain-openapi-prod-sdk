// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BatchdeleteApplicationBuildRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // build_ids
    @NameInMap("build_ids")
    @Validation(required = true)
    public java.util.List<String> buildIds;

    public static BatchdeleteApplicationBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteApplicationBuildRequest self = new BatchdeleteApplicationBuildRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteApplicationBuildRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteApplicationBuildRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BatchdeleteApplicationBuildRequest setBuildIds(java.util.List<String> buildIds) {
        this.buildIds = buildIds;
        return this;
    }
    public java.util.List<String> getBuildIds() {
        return this.buildIds;
    }

}
