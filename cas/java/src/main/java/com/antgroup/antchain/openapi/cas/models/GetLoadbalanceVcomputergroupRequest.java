// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetLoadbalanceVcomputergroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static GetLoadbalanceVcomputergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoadbalanceVcomputergroupRequest self = new GetLoadbalanceVcomputergroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLoadbalanceVcomputergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetLoadbalanceVcomputergroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLoadbalanceVcomputergroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
