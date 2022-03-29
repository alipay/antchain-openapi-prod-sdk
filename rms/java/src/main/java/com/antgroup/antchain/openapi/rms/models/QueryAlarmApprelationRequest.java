// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmApprelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 开始时间 - 时间戳
    @NameInMap("from")
    @Validation(required = true)
    public Long from;

    // 结束时间 - 时间戳
    @NameInMap("to")
    @Validation(required = true)
    public Long to;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    public static QueryAlarmApprelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmApprelationRequest self = new QueryAlarmApprelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmApprelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmApprelationRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAlarmApprelationRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryAlarmApprelationRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public QueryAlarmApprelationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
