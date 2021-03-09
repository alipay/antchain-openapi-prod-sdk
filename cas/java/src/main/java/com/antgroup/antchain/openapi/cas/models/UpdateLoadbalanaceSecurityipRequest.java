// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanaceSecurityipRequest extends TeaModel {
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

    // access_control
    @NameInMap("access_control")
    @Validation(required = true)
    public Boolean accessControl;

    public static UpdateLoadbalanaceSecurityipRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanaceSecurityipRequest self = new UpdateLoadbalanaceSecurityipRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanaceSecurityipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLoadbalanaceSecurityipRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLoadbalanaceSecurityipRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public UpdateLoadbalanaceSecurityipRequest setAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
        return this;
    }
    public Boolean getAccessControl() {
        return this.accessControl;
    }

}
