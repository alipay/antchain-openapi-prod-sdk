// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceConfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    public static QueryTraceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceConfigRequest self = new QueryTraceConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceConfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
