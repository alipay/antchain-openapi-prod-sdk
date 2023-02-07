// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppportraitHealthscoretrendRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    public String tenantName;

    // 应用name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 查询开始时间
    @NameInMap("start_timestamp")
    @Validation(required = true)
    public Long startTimestamp;

    // 查询结束时间
    @NameInMap("end_timestamp")
    @Validation(required = true)
    public Long endTimestamp;

    public static QueryAppportraitHealthscoretrendRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppportraitHealthscoretrendRequest self = new QueryAppportraitHealthscoretrendRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppportraitHealthscoretrendRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppportraitHealthscoretrendRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAppportraitHealthscoretrendRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAppportraitHealthscoretrendRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryAppportraitHealthscoretrendRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppportraitHealthscoretrendRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public QueryAppportraitHealthscoretrendRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

}
