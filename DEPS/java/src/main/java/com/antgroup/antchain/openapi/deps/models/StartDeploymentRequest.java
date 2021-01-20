// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class StartDeploymentRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 部署单id
    @NameInMap("operation_id")
    public String operationId;

    public static StartDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDeploymentRequest self = new StartDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public StartDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDeploymentRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
