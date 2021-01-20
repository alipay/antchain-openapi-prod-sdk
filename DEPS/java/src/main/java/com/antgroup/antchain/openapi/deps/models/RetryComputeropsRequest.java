// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryComputeropsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 运维单id
    @NameInMap("operation_id")
    public String operationId;

    public static RetryComputeropsRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryComputeropsRequest self = new RetryComputeropsRequest();
        return TeaModel.build(map, self);
    }

    public RetryComputeropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryComputeropsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
