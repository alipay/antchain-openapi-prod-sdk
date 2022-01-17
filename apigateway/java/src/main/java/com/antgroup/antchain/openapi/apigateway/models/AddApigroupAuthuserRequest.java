// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AddApigroupAuthuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 	
    // API标识
    @NameInMap("api_group_id")
    @Validation(required = true)
    public String apiGroupId;

    // 用户标识列表
    @NameInMap("operator_id_list")
    @Validation(required = true)
    public java.util.List<String> operatorIdList;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AddApigroupAuthuserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddApigroupAuthuserRequest self = new AddApigroupAuthuserRequest();
        return TeaModel.build(map, self);
    }

    public AddApigroupAuthuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddApigroupAuthuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddApigroupAuthuserRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public AddApigroupAuthuserRequest setOperatorIdList(java.util.List<String> operatorIdList) {
        this.operatorIdList = operatorIdList;
        return this;
    }
    public java.util.List<String> getOperatorIdList() {
        return this.operatorIdList;
    }

    public AddApigroupAuthuserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddApigroupAuthuserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
