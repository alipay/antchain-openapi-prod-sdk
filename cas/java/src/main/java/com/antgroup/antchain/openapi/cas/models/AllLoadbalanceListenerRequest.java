// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceListenerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // lb_id
    @NameInMap("lb_id")
    @Validation(required = true)
    public String lbId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static AllLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceListenerRequest self = new AllLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceListenerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllLoadbalanceListenerRequest setLbId(String lbId) {
        this.lbId = lbId;
        return this;
    }
    public String getLbId() {
        return this.lbId;
    }

    public AllLoadbalanceListenerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
