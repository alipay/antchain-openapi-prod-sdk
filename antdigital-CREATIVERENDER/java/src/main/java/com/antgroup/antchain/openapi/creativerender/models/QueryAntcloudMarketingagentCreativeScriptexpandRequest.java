// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeScriptexpandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发起脚本扩写接口返回的任务标识
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryAntcloudMarketingagentCreativeScriptexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeScriptexpandRequest self = new QueryAntcloudMarketingagentCreativeScriptexpandRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeScriptexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingagentCreativeScriptexpandRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
