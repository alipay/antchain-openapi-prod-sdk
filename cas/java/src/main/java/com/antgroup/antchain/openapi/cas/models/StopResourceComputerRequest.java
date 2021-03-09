// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StopResourceComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 需要停止的机器id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否强制停止
    @NameInMap("force")
    public Boolean force;

    public static StopResourceComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopResourceComputerRequest self = new StopResourceComputerRequest();
        return TeaModel.build(map, self);
    }

    public StopResourceComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopResourceComputerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopResourceComputerRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
