// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationRepositoryRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 待查询的应用名称。最大60个UTF-8字符
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    public static GetApplicationRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRepositoryRequest self = new GetApplicationRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationRepositoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationRepositoryRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetApplicationRepositoryRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

}
