// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowElasticvalueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static QueryFlowElasticvalueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowElasticvalueRequest self = new QueryFlowElasticvalueRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowElasticvalueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowElasticvalueRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
