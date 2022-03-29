// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmMonitorlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户名称
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 查询哪个技术栈下的告警指标。
    @NameInMap("stack_id")
    @Validation(required = true)
    public Long stackId;

    public static QueryUnifiedalarmMonitorlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmMonitorlistRequest self = new QueryUnifiedalarmMonitorlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmMonitorlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmMonitorlistRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryUnifiedalarmMonitorlistRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryUnifiedalarmMonitorlistRequest setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

}
