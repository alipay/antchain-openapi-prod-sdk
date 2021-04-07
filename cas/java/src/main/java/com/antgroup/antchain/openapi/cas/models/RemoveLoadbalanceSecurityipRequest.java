// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RemoveLoadbalanceSecurityipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的 ip
    @NameInMap("ips")
    @Validation(required = true)
    public java.util.List<String> ips;

    // 监听器端口
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // lb paas id
    @NameInMap("loadbalance_sequence")
    @Validation(required = true)
    public String loadbalanceSequence;

    public static RemoveLoadbalanceSecurityipRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLoadbalanceSecurityipRequest self = new RemoveLoadbalanceSecurityipRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLoadbalanceSecurityipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveLoadbalanceSecurityipRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public RemoveLoadbalanceSecurityipRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public RemoveLoadbalanceSecurityipRequest setLoadbalanceSequence(String loadbalanceSequence) {
        this.loadbalanceSequence = loadbalanceSequence;
        return this;
    }
    public String getLoadbalanceSequence() {
        return this.loadbalanceSequence;
    }

}
