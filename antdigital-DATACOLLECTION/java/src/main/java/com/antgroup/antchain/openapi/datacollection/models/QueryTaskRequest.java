// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class QueryTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 采集任务主键id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRequest self = new QueryTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
