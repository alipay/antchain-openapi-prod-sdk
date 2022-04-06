// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerAgentstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // computer serial numbers
    @NameInMap("sn")
    public java.util.List<String> sn;

    // workspace name
    @NameInMap("workspace")
    public String workspace;

    // iaas_ids
    @NameInMap("iaas_ids")
    public java.util.List<String> iaasIds;

    // zone_iaas_id
    @NameInMap("zone_iaas_id")
    public String zoneIaasId;

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

    public QueryComputerAgentstatusRequest setIaasIds(java.util.List<String> iaasIds) {
        this.iaasIds = iaasIds;
        return this;
    }
    public java.util.List<String> getIaasIds() {
        return this.iaasIds;
    }

    public QueryComputerAgentstatusRequest setZoneIaasId(String zoneIaasId) {
        this.zoneIaasId = zoneIaasId;
        return this;
    }
    public String getZoneIaasId() {
        return this.zoneIaasId;
    }

}
