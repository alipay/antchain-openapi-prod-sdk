// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowEnvrelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 源环境
    @NameInMap("src")
    @Validation(required = true)
    public String src;

    // 关联类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QueryFlowEnvrelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowEnvrelRequest self = new QueryFlowEnvrelRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowEnvrelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowEnvrelRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryFlowEnvrelRequest setSrc(String src) {
        this.src = src;
        return this;
    }
    public String getSrc() {
        return this.src;
    }

    public QueryFlowEnvrelRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
