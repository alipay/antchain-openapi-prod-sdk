// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceMountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // loadbalance_id
    @NameInMap("loadbalance_id")
    @Validation(required = true)
    public String loadbalanceId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static AllLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceMountRequest self = new AllLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceMountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllLoadbalanceMountRequest setLoadbalanceId(String loadbalanceId) {
        this.loadbalanceId = loadbalanceId;
        return this;
    }
    public String getLoadbalanceId() {
        return this.loadbalanceId;
    }

    public AllLoadbalanceMountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
