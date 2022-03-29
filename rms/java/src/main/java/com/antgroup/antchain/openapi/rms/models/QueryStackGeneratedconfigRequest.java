// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryStackGeneratedconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 栈实体对象复合ID
    @NameInMap("stack_universal_table_id")
    @Validation(required = true)
    public String stackUniversalTableId;

    public static QueryStackGeneratedconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStackGeneratedconfigRequest self = new QueryStackGeneratedconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryStackGeneratedconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStackGeneratedconfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryStackGeneratedconfigRequest setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

}
