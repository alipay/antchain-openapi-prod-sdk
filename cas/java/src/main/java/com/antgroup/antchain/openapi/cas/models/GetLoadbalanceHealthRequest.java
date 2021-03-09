// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetLoadbalanceHealthRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // lb_id
    @NameInMap("lb_id")
    @Validation(required = true)
    public String lbId;

    public static GetLoadbalanceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoadbalanceHealthRequest self = new GetLoadbalanceHealthRequest();
        return TeaModel.build(map, self);
    }

    public GetLoadbalanceHealthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetLoadbalanceHealthRequest setLbId(String lbId) {
        this.lbId = lbId;
        return this;
    }
    public String getLbId() {
        return this.lbId;
    }

}
