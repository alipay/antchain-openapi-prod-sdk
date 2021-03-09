// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteResourceComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的机器ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否强制删除
    @NameInMap("force")
    public Boolean force;

    public static DeleteResourceComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceComputerRequest self = new DeleteResourceComputerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteResourceComputerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteResourceComputerRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
