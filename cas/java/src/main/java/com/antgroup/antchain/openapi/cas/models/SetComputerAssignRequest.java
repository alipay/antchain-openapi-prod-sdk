// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SetComputerAssignRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    public String appId;

    // 应用服务实例
    @NameInMap("app_service_id")
    @Validation(required = true)
    public String appServiceId;

    // computer_ids
    @NameInMap("computer_ids")
    @Validation(required = true)
    public java.util.List<String> computerIds;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // cell信息
    @NameInMap("cell")
    public java.util.List<MapStringToStringEntity> cell;

    public static SetComputerAssignRequest build(java.util.Map<String, ?> map) throws Exception {
        SetComputerAssignRequest self = new SetComputerAssignRequest();
        return TeaModel.build(map, self);
    }

    public SetComputerAssignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetComputerAssignRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetComputerAssignRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public SetComputerAssignRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public SetComputerAssignRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SetComputerAssignRequest setCell(java.util.List<MapStringToStringEntity> cell) {
        this.cell = cell;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getCell() {
        return this.cell;
    }

}
