// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务 id 数组
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    // workspaceId 用于鉴权
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static QueryAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceRequest self = new QueryAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppserviceRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryAppserviceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
