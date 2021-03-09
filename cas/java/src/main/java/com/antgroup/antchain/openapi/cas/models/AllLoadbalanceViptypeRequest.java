// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceViptypeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static AllLoadbalanceViptypeRequest build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceViptypeRequest self = new AllLoadbalanceViptypeRequest();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceViptypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
