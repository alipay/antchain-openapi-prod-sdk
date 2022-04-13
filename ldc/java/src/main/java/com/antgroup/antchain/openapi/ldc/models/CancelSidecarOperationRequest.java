// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CancelSidecarOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // Opeartion ID 
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static CancelSidecarOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSidecarOperationRequest self = new CancelSidecarOperationRequest();
        return TeaModel.build(map, self);
    }

    public CancelSidecarOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelSidecarOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
