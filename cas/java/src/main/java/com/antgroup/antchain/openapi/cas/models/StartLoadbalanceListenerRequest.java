// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StartLoadbalanceListenerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // load_balancer_id
    @NameInMap("load_balancer_id")
    @Validation(required = true)
    public String loadBalancerId;

    // listener_port
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    public static StartLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLoadbalanceListenerRequest self = new StartLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public StartLoadbalanceListenerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartLoadbalanceListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public StartLoadbalanceListenerRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

}
