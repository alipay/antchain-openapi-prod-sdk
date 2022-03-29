// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryKernelstackGeneratedconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 不带租户id和workspaceId的universalTableId后缀
    @NameInMap("simple_table_id")
    @Validation(required = true)
    public String simpleTableId;

    public static QueryKernelstackGeneratedconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKernelstackGeneratedconfigRequest self = new QueryKernelstackGeneratedconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryKernelstackGeneratedconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryKernelstackGeneratedconfigRequest setSimpleTableId(String simpleTableId) {
        this.simpleTableId = simpleTableId;
        return this;
    }
    public String getSimpleTableId() {
        return this.simpleTableId;
    }

}
