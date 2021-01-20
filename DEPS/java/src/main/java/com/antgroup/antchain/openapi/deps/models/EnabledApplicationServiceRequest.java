// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class EnabledApplicationServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 租户名称
    @NameInMap("tenant")
    public String tenant;

    public static EnabledApplicationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnabledApplicationServiceRequest self = new EnabledApplicationServiceRequest();
        return TeaModel.build(map, self);
    }

    public EnabledApplicationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnabledApplicationServiceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
