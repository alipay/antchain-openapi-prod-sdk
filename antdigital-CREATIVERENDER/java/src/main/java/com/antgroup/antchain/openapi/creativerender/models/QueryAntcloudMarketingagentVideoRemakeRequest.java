// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentVideoRemakeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 生视频返回的task_id回传
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryAntcloudMarketingagentVideoRemakeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentVideoRemakeRequest self = new QueryAntcloudMarketingagentVideoRemakeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentVideoRemakeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingagentVideoRemakeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
