// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运维单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static GetAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppopsRequest self = new GetAppopsRequest();
        return TeaModel.build(map, self);
    }

    public GetAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
