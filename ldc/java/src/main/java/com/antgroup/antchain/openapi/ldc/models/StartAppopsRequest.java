// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class StartAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单或运维单time_series_id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 操作人，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

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

    public StartAppopsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
