// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StartResourceComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 机器id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static StartResourceComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartResourceComputerRequest self = new StartResourceComputerRequest();
        return TeaModel.build(map, self);
    }

    public StartResourceComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartResourceComputerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
