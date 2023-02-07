// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppportraitYearusabilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    public String tenantName;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

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

    public GetAppportraitYearusabilityRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
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

    public GetAppportraitYearusabilityRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppportraitYearusabilityRequest setYear(Long year) {
        this.year = year;
        return this;
    }
    public Long getYear() {
        return this.year;
    }

}
