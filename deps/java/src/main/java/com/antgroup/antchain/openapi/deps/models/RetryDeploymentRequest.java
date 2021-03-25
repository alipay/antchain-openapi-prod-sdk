// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryDeploymentRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static RetryDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDeploymentRequest self = new RetryDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public RetryDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryDeploymentRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public RetryDeploymentRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
