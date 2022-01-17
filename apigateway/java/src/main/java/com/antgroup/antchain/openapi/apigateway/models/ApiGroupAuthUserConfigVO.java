// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiGroupAuthUserConfigVO extends TeaModel {
    // api授权管理开关
    @NameInMap("api_auth_user_switch")
    public String apiAuthUserSwitch;

    // 是否是管理员
    @NameInMap("check_master")
    public Boolean checkMaster;

    // 需要api授权管理
    @NameInMap("need_api_auth_user")
    public Boolean needApiAuthUser;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static ApiGroupAuthUserConfigVO build(java.util.Map<String, ?> map) throws Exception {
        ApiGroupAuthUserConfigVO self = new ApiGroupAuthUserConfigVO();
        return TeaModel.build(map, self);
    }

    public ApiGroupAuthUserConfigVO setApiAuthUserSwitch(String apiAuthUserSwitch) {
        this.apiAuthUserSwitch = apiAuthUserSwitch;
        return this;
    }
    public String getApiAuthUserSwitch() {
        return this.apiAuthUserSwitch;
    }

    public ApiGroupAuthUserConfigVO setCheckMaster(Boolean checkMaster) {
        this.checkMaster = checkMaster;
        return this;
    }
    public Boolean getCheckMaster() {
        return this.checkMaster;
    }

    public ApiGroupAuthUserConfigVO setNeedApiAuthUser(Boolean needApiAuthUser) {
        this.needApiAuthUser = needApiAuthUser;
        return this;
    }
    public Boolean getNeedApiAuthUser() {
        return this.needApiAuthUser;
    }

    public ApiGroupAuthUserConfigVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiGroupAuthUserConfigVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
