// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StartLoadbalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    public static StartLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLoadbalanceRequest self = new StartLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public StartLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartLoadbalanceRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
