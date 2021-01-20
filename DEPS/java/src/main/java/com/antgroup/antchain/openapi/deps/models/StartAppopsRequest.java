// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class StartAppopsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 运维单id
    @NameInMap("operation_id")
    public String operationId;

    public static StartAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAppopsRequest self = new StartAppopsRequest();
        return TeaModel.build(map, self);
    }

    public StartAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
