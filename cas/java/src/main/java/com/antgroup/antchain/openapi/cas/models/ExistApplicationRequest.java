// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ExistApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static ExistApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistApplicationRequest self = new ExistApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ExistApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
