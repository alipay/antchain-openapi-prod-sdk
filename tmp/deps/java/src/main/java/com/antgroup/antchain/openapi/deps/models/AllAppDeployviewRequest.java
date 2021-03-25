// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AllAppDeployviewRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static AllAppDeployviewRequest build(java.util.Map<String, ?> map) throws Exception {
        AllAppDeployviewRequest self = new AllAppDeployviewRequest();
        return TeaModel.build(map, self);
    }

    public AllAppDeployviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllAppDeployviewRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public AllAppDeployviewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
