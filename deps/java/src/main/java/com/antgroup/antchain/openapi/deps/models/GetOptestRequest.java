// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetOptestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // ping
    @NameInMap("ping")
    @Validation(required = true)
    public String ping;

    public static GetOptestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOptestRequest self = new GetOptestRequest();
        return TeaModel.build(map, self);
    }

    public GetOptestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOptestRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetOptestRequest setPing(String ping) {
        this.ping = ping;
        return this;
    }
    public String getPing() {
        return this.ping;
    }

}
