// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelComputeropsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 运维单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 取消原因。长度不超过100个UTF-8字符
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    public static CancelComputeropsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelComputeropsRequest self = new CancelComputeropsRequest();
        return TeaModel.build(map, self);
    }

    public CancelComputeropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelComputeropsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CancelComputeropsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CancelComputeropsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
