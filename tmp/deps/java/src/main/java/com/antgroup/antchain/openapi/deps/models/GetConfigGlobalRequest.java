// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigGlobalRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 要获取的全局参数 id
    @NameInMap("global_param_id")
    @Validation(required = true)
    public String globalParamId;

    public static GetConfigGlobalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigGlobalRequest self = new GetConfigGlobalRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigGlobalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetConfigGlobalRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetConfigGlobalRequest setGlobalParamId(String globalParamId) {
        this.globalParamId = globalParamId;
        return this;
    }
    public String getGlobalParamId() {
        return this.globalParamId;
    }

}
