// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceSecurityipRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // listener_port
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // load_balancer_id
    @NameInMap("load_balancer_id")
    @Validation(required = true)
    public String loadBalancerId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryLoadbalanceSecurityipRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceSecurityipRequest self = new QueryLoadbalanceSecurityipRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceSecurityipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalanceSecurityipRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public QueryLoadbalanceSecurityipRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public QueryLoadbalanceSecurityipRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
