// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用参数 id
    @NameInMap("app_param_id")
    @Validation(required = true)
    public String appParamId;

    public static GetConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigAppRequest self = new GetConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetConfigAppRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetConfigAppRequest setAppParamId(String appParamId) {
        this.appParamId = appParamId;
        return this;
    }
    public String getAppParamId() {
        return this.appParamId;
    }

}
