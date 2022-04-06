// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerAgentsetupcommandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // computer serial numbers
    @NameInMap("sn")
    public java.util.List<String> sn;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // zone_iaas_id
    @NameInMap("zone_iaas_id")
    public String zoneIaasId;

    public static QueryComputerAgentsetupcommandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerAgentsetupcommandRequest self = new QueryComputerAgentsetupcommandRequest();
        return TeaModel.build(map, self);
    }

    public QueryComputerAgentsetupcommandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComputerAgentsetupcommandRequest setSn(java.util.List<String> sn) {
        this.sn = sn;
        return this;
    }
    public java.util.List<String> getSn() {
        return this.sn;
    }

    public QueryComputerAgentsetupcommandRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryComputerAgentsetupcommandRequest setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public QueryComputerAgentsetupcommandRequest setZoneIaasId(String zoneIaasId) {
        this.zoneIaasId = zoneIaasId;
        return this;
    }
    public String getZoneIaasId() {
        return this.zoneIaasId;
    }

}
