// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetAppopsApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待查询的应用名称，必须是运维单中包含的应用
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 运维单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static GetAppopsApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppopsApplicationRequest self = new GetAppopsApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetAppopsApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAppopsApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetAppopsApplicationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
