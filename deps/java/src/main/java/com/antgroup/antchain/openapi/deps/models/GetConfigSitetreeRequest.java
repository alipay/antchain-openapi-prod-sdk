// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigSitetreeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    public static GetConfigSitetreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigSitetreeRequest self = new GetConfigSitetreeRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigSitetreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetConfigSitetreeRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
