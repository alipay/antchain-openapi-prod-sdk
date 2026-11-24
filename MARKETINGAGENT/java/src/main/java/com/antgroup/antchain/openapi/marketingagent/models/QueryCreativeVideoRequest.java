// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryCreativeVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 创建接口返回的任务 ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryCreativeVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreativeVideoRequest self = new QueryCreativeVideoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreativeVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreativeVideoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
