// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListCloudconnectorConnectionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    public static ListCloudconnectorConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudconnectorConnectionRequest self = new ListCloudconnectorConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudconnectorConnectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCloudconnectorConnectionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
