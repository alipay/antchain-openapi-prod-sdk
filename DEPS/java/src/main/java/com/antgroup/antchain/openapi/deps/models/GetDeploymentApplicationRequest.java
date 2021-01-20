// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetDeploymentApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 待查询的应用（服务）名称，必须是部署单中包含的应用（服务）
    @NameInMap("application_name")
    public String applicationName;

    // 部署单id
    @NameInMap("operation_id")
    public String operationId;

    public static GetDeploymentApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentApplicationRequest self = new GetDeploymentApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDeploymentApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetDeploymentApplicationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
