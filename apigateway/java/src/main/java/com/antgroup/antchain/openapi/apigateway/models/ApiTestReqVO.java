// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiTestReqVO extends TeaModel {
    // API标识
    @NameInMap("api_id")
    public String apiId;

    // 应用标识
    @NameInMap("app_id")
    public String appId;

    // params
    @NameInMap("params")
    public java.util.List<ApiTestParamVO> params;

    // payload
    @NameInMap("payload")
    public String payload;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static ApiTestReqVO build(java.util.Map<String, ?> map) throws Exception {
        ApiTestReqVO self = new ApiTestReqVO();
        return TeaModel.build(map, self);
    }

    public ApiTestReqVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ApiTestReqVO setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApiTestReqVO setParams(java.util.List<ApiTestParamVO> params) {
        this.params = params;
        return this;
    }
    public java.util.List<ApiTestParamVO> getParams() {
        return this.params;
    }

    public ApiTestReqVO setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public ApiTestReqVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiTestReqVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
