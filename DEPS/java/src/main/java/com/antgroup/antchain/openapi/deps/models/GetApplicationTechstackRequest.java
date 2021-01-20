// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationTechstackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("application_name")
    public String applicationName;

    public static GetApplicationTechstackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationTechstackRequest self = new GetApplicationTechstackRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationTechstackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationTechstackRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

}
