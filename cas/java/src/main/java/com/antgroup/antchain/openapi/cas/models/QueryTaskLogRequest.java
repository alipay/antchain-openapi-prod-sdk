// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryTaskLogRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // execution_times
    @NameInMap("execution_times")
    public Long executionTimes;

    // task_id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskLogRequest self = new QueryTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskLogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTaskLogRequest setExecutionTimes(Long executionTimes) {
        this.executionTimes = executionTimes;
        return this;
    }
    public Long getExecutionTimes() {
        return this.executionTimes;
    }

    public QueryTaskLogRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
