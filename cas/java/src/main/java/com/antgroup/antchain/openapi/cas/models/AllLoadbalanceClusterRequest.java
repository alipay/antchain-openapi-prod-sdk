// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // zone_id
    @NameInMap("zone_id")
    public String zoneId;

    public static AllLoadbalanceClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceClusterRequest self = new AllLoadbalanceClusterRequest();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllLoadbalanceClusterRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public AllLoadbalanceClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
