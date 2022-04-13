// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryDeploymentRollbackableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 待查询的应用名称，必须是部署单中包含的应用
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    public static QueryDeploymentRollbackableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeploymentRollbackableRequest self = new QueryDeploymentRollbackableRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeploymentRollbackableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeploymentRollbackableRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public QueryDeploymentRollbackableRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

}
