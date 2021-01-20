// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class StartComputeropsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 运维单id
    @NameInMap("operation_id")
    public String operationId;

    public static StartComputeropsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartComputeropsRequest self = new StartComputeropsRequest();
        return TeaModel.build(map, self);
    }

    public StartComputeropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartComputeropsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
