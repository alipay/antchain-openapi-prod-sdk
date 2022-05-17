// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppportraitMonthusabilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称Id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    public String tenantName;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 查询的月份
    @NameInMap("month")
    @Validation(required = true)
    public Long month;

    public static GetAppportraitMonthusabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppportraitMonthusabilityRequest self = new GetAppportraitMonthusabilityRequest();
        return TeaModel.build(map, self);
    }

    public GetAppportraitMonthusabilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAppportraitMonthusabilityRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetAppportraitMonthusabilityRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetAppportraitMonthusabilityRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetAppportraitMonthusabilityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppportraitMonthusabilityRequest setMonth(Long month) {
        this.month = month;
        return this;
    }
    public Long getMonth() {
        return this.month;
    }

}
