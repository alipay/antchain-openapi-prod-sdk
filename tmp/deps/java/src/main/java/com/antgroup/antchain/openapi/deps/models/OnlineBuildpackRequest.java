// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OnlineBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // buildpackId
    @NameInMap("id")
    public java.util.List<String> id;

    public static OnlineBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineBuildpackRequest self = new OnlineBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public OnlineBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineBuildpackRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public OnlineBuildpackRequest setId(java.util.List<String> id) {
        this.id = id;
        return this;
    }
    public java.util.List<String> getId() {
        return this.id;
    }

}
