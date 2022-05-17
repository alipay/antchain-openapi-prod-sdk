// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppportraitYearusabilityRequest extends TeaModel {
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

    // 查询的年份
    @NameInMap("year")
    @Validation(required = true)
    public Long year;

    public static GetAppportraitYearusabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppportraitYearusabilityRequest self = new GetAppportraitYearusabilityRequest();
        return TeaModel.build(map, self);
    }

    public GetAppportraitYearusabilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAppportraitYearusabilityRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetAppportraitYearusabilityRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetAppportraitYearusabilityRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetAppportraitYearusabilityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppportraitYearusabilityRequest setYear(Long year) {
        this.year = year;
        return this;
    }
    public Long getYear() {
        return this.year;
    }

}
