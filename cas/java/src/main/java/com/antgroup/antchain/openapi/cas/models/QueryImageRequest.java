// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryImageRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // current page
    @NameInMap("current_page")
    public Long currentPage;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // status
    @NameInMap("statuses")
    public String statuses;

    public static QueryImageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryImageRequest self = new QueryImageRequest();
        return TeaModel.build(map, self);
    }

    public QueryImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryImageRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryImageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryImageRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryImageRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

}
