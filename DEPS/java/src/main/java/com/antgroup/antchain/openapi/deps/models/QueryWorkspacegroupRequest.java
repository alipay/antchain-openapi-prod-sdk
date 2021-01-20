// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryWorkspacegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 环境组名称（唯一标识）
    @NameInMap("name")
    public String name;

    public static QueryWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspacegroupRequest self = new QueryWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWorkspacegroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
