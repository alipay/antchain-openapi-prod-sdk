// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetDeploymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static GetDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentRequest self = new GetDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDeploymentRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
