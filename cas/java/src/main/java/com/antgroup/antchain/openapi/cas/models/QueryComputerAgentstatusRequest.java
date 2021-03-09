// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerAgentstatusRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer serial numbers
    @NameInMap("sn")
    @Validation(required = true)
    public java.util.List<String> sn;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryComputerAgentstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerAgentstatusRequest self = new QueryComputerAgentstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryComputerAgentstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComputerAgentstatusRequest setSn(java.util.List<String> sn) {
        this.sn = sn;
        return this;
    }
    public java.util.List<String> getSn() {
        return this.sn;
    }

    public QueryComputerAgentstatusRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
