// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentVideotemplateAnalysisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryAntcloudMarketingagentVideotemplateAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentVideotemplateAnalysisRequest self = new QueryAntcloudMarketingagentVideotemplateAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentVideotemplateAnalysisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingagentVideotemplateAnalysisRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
