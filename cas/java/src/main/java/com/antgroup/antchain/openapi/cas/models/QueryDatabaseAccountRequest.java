// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // database_id
    @NameInMap("database_id")
    @Validation(required = true)
    public String databaseId;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseAccountRequest self = new QueryDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatabaseAccountRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDatabaseAccountRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public QueryDatabaseAccountRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
