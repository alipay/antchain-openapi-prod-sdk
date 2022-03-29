// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAppAlarmstatsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // end_time
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static QueryAppAlarmstatsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppAlarmstatsRequest self = new QueryAppAlarmstatsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppAlarmstatsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppAlarmstatsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryAppAlarmstatsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
