// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RetrySidecarOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // operation ID
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static RetrySidecarOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrySidecarOperationRequest self = new RetrySidecarOperationRequest();
        return TeaModel.build(map, self);
    }

    public RetrySidecarOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetrySidecarOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
