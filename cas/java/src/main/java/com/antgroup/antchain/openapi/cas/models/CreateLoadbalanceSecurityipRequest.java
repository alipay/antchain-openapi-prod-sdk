// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateLoadbalanceSecurityipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // lb id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // listener_port
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // ips
    @NameInMap("ips")
    @Validation(required = true)
    public java.util.List<String> ips;

    public static CreateLoadbalanceSecurityipRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadbalanceSecurityipRequest self = new CreateLoadbalanceSecurityipRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadbalanceSecurityipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLoadbalanceSecurityipRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLoadbalanceSecurityipRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadbalanceSecurityipRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

}
