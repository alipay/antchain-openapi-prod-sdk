// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListDashboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 大盘类型：MINE(我的大盘)、CORE(关键大盘)
    @NameInMap("dashboard_type")
    @Validation(required = true)
    public String dashboardType;

    public static ListDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardRequest self = new ListDashboardRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDashboardRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListDashboardRequest setDashboardType(String dashboardType) {
        this.dashboardType = dashboardType;
        return this;
    }
    public String getDashboardType() {
        return this.dashboardType;
    }

}
