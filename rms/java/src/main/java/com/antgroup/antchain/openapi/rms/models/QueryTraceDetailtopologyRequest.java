// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceDetailtopologyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // trace_id
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryTraceDetailtopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceDetailtopologyRequest self = new QueryTraceDetailtopologyRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceDetailtopologyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceDetailtopologyRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryTraceDetailtopologyRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
