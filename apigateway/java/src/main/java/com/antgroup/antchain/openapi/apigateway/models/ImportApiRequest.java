// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ImportApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分组id
    @NameInMap("api_group_id")
    public String apiGroupId;

    // api_transfer_list字符串
    @NameInMap("api_transfer_list")
    public String apiTransferList;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // null效验api及配置是否重复，true覆盖，false跳过
    @NameInMap("update_flag")
    public Boolean updateFlag;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static ImportApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportApiRequest self = new ImportApiRequest();
        return TeaModel.build(map, self);
    }

    public ImportApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportApiRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public ImportApiRequest setApiTransferList(String apiTransferList) {
        this.apiTransferList = apiTransferList;
        return this;
    }
    public String getApiTransferList() {
        return this.apiTransferList;
    }

    public ImportApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ImportApiRequest setUpdateFlag(Boolean updateFlag) {
        this.updateFlag = updateFlag;
        return this;
    }
    public Boolean getUpdateFlag() {
        return this.updateFlag;
    }

    public ImportApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
