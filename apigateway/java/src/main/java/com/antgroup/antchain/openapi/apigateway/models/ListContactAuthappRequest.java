// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ListContactAuthappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权App ID
    @NameInMap("auth_app_info_id")
    public String authAppInfoId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // param
    @NameInMap("param")
    public ContactInfoQueryVO param;

    public static ListContactAuthappRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactAuthappRequest self = new ListContactAuthappRequest();
        return TeaModel.build(map, self);
    }

    public ListContactAuthappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListContactAuthappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListContactAuthappRequest setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public ListContactAuthappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListContactAuthappRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListContactAuthappRequest setParam(ContactInfoQueryVO param) {
        this.param = param;
        return this;
    }
    public ContactInfoQueryVO getParam() {
        return this.param;
    }

}
