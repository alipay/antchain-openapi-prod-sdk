// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppportraitAlertcounttrendRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 查询开始时间,utc毫秒
    @NameInMap("start_timestamp")
    @Validation(required = true)
    public Long startTimestamp;

    // 查询结束时间，utc毫秒
    @NameInMap("end_timestamp")
    @Validation(required = true)
    public Long endTimestamp;

    public static QueryAppportraitAlertcounttrendRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppportraitAlertcounttrendRequest self = new QueryAppportraitAlertcounttrendRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppportraitAlertcounttrendRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppportraitAlertcounttrendRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAppportraitAlertcounttrendRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAppportraitAlertcounttrendRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryAppportraitAlertcounttrendRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppportraitAlertcounttrendRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public QueryAppportraitAlertcounttrendRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

}
