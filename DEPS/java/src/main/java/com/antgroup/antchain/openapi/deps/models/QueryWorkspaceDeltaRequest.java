// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryWorkspaceDeltaRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 结束时间点
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String endTime;

    // 开始时间点
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startTime;

    public static QueryWorkspaceDeltaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceDeltaRequest self = new QueryWorkspaceDeltaRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceDeltaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWorkspaceDeltaRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryWorkspaceDeltaRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
