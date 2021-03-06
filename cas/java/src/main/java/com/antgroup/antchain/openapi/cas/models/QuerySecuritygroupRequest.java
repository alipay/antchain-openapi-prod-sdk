// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QuerySecuritygroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // current page
    @NameInMap("current_page")
    public Long currentPage;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    public static QuerySecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecuritygroupRequest self = new QuerySecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecuritygroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QuerySecuritygroupRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySecuritygroupRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
