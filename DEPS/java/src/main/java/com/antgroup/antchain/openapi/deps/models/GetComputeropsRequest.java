// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetComputeropsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 运维单id
    @NameInMap("operation_id")
    public String operationId;

    public static GetComputeropsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComputeropsRequest self = new GetComputeropsRequest();
        return TeaModel.build(map, self);
    }

    public GetComputeropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetComputeropsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
