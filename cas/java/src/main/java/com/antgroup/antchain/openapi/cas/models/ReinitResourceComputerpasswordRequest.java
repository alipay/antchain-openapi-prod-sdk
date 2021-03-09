// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ReinitResourceComputerpasswordRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 需要修改的机器Id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 重置的密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static ReinitResourceComputerpasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitResourceComputerpasswordRequest self = new ReinitResourceComputerpasswordRequest();
        return TeaModel.build(map, self);
    }

    public ReinitResourceComputerpasswordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitResourceComputerpasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReinitResourceComputerpasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
