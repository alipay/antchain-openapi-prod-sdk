// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ReinitDeploymentRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static ReinitDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitDeploymentRequest self = new ReinitDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public ReinitDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitDeploymentRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ReinitDeploymentRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
