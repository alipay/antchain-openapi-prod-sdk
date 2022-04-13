// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CancelAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运维单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 取消原因。长度不超过100个UTF-8字符
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 操作人账号，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

    public static CancelAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAppopsRequest self = new CancelAppopsRequest();
        return TeaModel.build(map, self);
    }

    public CancelAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CancelAppopsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CancelAppopsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
