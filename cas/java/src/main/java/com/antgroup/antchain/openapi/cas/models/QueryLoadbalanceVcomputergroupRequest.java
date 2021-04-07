// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceVcomputergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // load_balance_ids
    @NameInMap("load_balance_ids")
    @Validation(required = true)
    public java.util.List<String> loadBalanceIds;

    // name
    @NameInMap("name")
    public String name;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryLoadbalanceVcomputergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceVcomputergroupRequest self = new QueryLoadbalanceVcomputergroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceVcomputergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalanceVcomputergroupRequest setLoadBalanceIds(java.util.List<String> loadBalanceIds) {
        this.loadBalanceIds = loadBalanceIds;
        return this;
    }
    public java.util.List<String> getLoadBalanceIds() {
        return this.loadBalanceIds;
    }

    public QueryLoadbalanceVcomputergroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLoadbalanceVcomputergroupRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryLoadbalanceVcomputergroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
