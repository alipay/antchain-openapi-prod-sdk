// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppportraitHealthscoretrendRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    public String tenantName;

    // 应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 查询开始时间
    @NameInMap("start_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTimestamp;

    // 查询结束时间
    @NameInMap("end_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTimestamp;

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

    public QueryAppportraitHealthscoretrendRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
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

    public QueryAppportraitHealthscoretrendRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryAppportraitHealthscoretrendRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public QueryAppportraitHealthscoretrendRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

}
