// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // prviderIds
    @NameInMap("provider_ids")
    @Validation(required = true)
    public java.util.List<String> providerIds;

    // zoneIds
    @NameInMap("zone_ids")
    @Validation(required = true)
    public java.util.List<String> zoneIds;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryComputerSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerSpecRequest self = new QueryComputerSpecRequest();
        return TeaModel.build(map, self);
    }

    public QueryComputerSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComputerSpecRequest setProviderIds(java.util.List<String> providerIds) {
        this.providerIds = providerIds;
        return this;
    }
    public java.util.List<String> getProviderIds() {
        return this.providerIds;
    }

    public QueryComputerSpecRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public QueryComputerSpecRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
