// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackDeploymentApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 被回滚的应用（服务）名称，必须是部署单中包含的应用（服务）
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 回滚原因。长度不超过100个UTF-8字符
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    public static RollbackDeploymentApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackDeploymentApplicationRequest self = new RollbackDeploymentApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackDeploymentApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackDeploymentApplicationRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public RollbackDeploymentApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public RollbackDeploymentApplicationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RollbackDeploymentApplicationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
