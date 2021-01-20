// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryRoleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // from_aliyun
    @NameInMap("from_aliyun")
    public Boolean fromAliyun;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRoleRequest self = new QueryRoleRequest();
        return TeaModel.build(map, self);
    }

    public QueryRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRoleRequest setFromAliyun(Boolean fromAliyun) {
        this.fromAliyun = fromAliyun;
        return this;
    }
    public Boolean getFromAliyun() {
        return this.fromAliyun;
    }

    public QueryRoleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRoleRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
