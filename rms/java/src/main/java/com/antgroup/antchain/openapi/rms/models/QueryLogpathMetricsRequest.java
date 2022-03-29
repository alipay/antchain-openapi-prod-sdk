// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryLogpathMetricsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 日志路径
    @NameInMap("fullpath")
    @Validation(required = true)
    public String fullpath;

    // 工作空间名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 监控数据起始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 监控数据结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    public static QueryLogpathMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLogpathMetricsRequest self = new QueryLogpathMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLogpathMetricsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLogpathMetricsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLogpathMetricsRequest setFullpath(String fullpath) {
        this.fullpath = fullpath;
        return this;
    }
    public String getFullpath() {
        return this.fullpath;
    }

    public QueryLogpathMetricsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryLogpathMetricsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryLogpathMetricsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

}
