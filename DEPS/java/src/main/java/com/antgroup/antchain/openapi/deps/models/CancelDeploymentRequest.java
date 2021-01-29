// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelDeploymentRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 取消原因。长度不超过100个UTF-8字符
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    public static CancelDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDeploymentRequest self = new CancelDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CancelDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelDeploymentRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CancelDeploymentRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CancelDeploymentRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
