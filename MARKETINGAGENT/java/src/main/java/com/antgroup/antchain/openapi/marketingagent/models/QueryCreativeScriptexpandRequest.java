// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryCreativeScriptexpandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发起脚本扩写接口返回的任务标识
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryCreativeScriptexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreativeScriptexpandRequest self = new QueryCreativeScriptexpandRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreativeScriptexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreativeScriptexpandRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
