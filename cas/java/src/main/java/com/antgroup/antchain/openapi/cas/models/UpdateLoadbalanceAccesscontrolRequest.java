// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanceAccesscontrolRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // lb paas id
    @NameInMap("loadbalance_sequence")
    @Validation(required = true)
    public String loadbalanceSequence;

    // 监听器端口
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // 是否打开访问控制
    @NameInMap("access_control")
    @Validation(required = true)
    public Boolean accessControl;

    public static UpdateLoadbalanceAccesscontrolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanceAccesscontrolRequest self = new UpdateLoadbalanceAccesscontrolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanceAccesscontrolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLoadbalanceAccesscontrolRequest setLoadbalanceSequence(String loadbalanceSequence) {
        this.loadbalanceSequence = loadbalanceSequence;
        return this;
    }
    public String getLoadbalanceSequence() {
        return this.loadbalanceSequence;
    }

    public UpdateLoadbalanceAccesscontrolRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public UpdateLoadbalanceAccesscontrolRequest setAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
        return this;
    }
    public Boolean getAccessControl() {
        return this.accessControl;
    }

}
