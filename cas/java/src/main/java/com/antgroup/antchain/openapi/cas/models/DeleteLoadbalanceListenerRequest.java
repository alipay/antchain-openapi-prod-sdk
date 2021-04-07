// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteLoadbalanceListenerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // listener 端口
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // lb id
    @NameInMap("loadbalance_sequence")
    @Validation(required = true)
    public String loadbalanceSequence;

    public static DeleteLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadbalanceListenerRequest self = new DeleteLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadbalanceListenerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteLoadbalanceListenerRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public DeleteLoadbalanceListenerRequest setLoadbalanceSequence(String loadbalanceSequence) {
        this.loadbalanceSequence = loadbalanceSequence;
        return this;
    }
    public String getLoadbalanceSequence() {
        return this.loadbalanceSequence;
    }

}
