// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RetryAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运维单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 操作人账号，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

    public static RetryAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryAppopsRequest self = new RetryAppopsRequest();
        return TeaModel.build(map, self);
    }

    public RetryAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RetryAppopsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
