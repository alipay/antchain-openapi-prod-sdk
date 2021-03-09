// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListRegionGroupbyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // status
    @NameInMap("status")
    public String status;

    public static ListRegionGroupbyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionGroupbyRequest self = new ListRegionGroupbyRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionGroupbyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRegionGroupbyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
