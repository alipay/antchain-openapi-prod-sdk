// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetLoadbalanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static GetLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoadbalanceRequest self = new GetLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public GetLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetLoadbalanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
