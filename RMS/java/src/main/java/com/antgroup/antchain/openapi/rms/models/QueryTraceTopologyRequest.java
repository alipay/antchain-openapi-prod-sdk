// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceTopologyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 结束毫秒时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 开始毫秒时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    // app
    @NameInMap("app")
    public String app;

    // trace_id
    @NameInMap("trace_id")
    public String traceId;

    public static QueryTraceTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceTopologyRequest self = new QueryTraceTopologyRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceTopologyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceTopologyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTraceTopologyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTraceTopologyRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryTraceTopologyRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryTraceTopologyRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
