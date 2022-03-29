// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryStackMonitoritemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 技术栈 ID
    @NameInMap("stack_id")
    @Validation(required = true)
    public Long stackId;

    public static QueryStackMonitoritemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStackMonitoritemRequest self = new QueryStackMonitoritemRequest();
        return TeaModel.build(map, self);
    }

    public QueryStackMonitoritemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStackMonitoritemRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryStackMonitoritemRequest setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

}
