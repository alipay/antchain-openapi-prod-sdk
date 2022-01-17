// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class DownloadApiSwaggerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识列表
    @NameInMap("api_info_id_list")
    public java.util.List<String> apiInfoIdList;

    // swaggerJson
    @NameInMap("swagger_json_str")
    public String swaggerJsonStr;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static DownloadApiSwaggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadApiSwaggerRequest self = new DownloadApiSwaggerRequest();
        return TeaModel.build(map, self);
    }

    public DownloadApiSwaggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadApiSwaggerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadApiSwaggerRequest setApiInfoIdList(java.util.List<String> apiInfoIdList) {
        this.apiInfoIdList = apiInfoIdList;
        return this;
    }
    public java.util.List<String> getApiInfoIdList() {
        return this.apiInfoIdList;
    }

    public DownloadApiSwaggerRequest setSwaggerJsonStr(String swaggerJsonStr) {
        this.swaggerJsonStr = swaggerJsonStr;
        return this;
    }
    public String getSwaggerJsonStr() {
        return this.swaggerJsonStr;
    }

    public DownloadApiSwaggerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DownloadApiSwaggerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
