// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryProjectMemberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 操作者用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 用户名称（模糊搜索）
    @NameInMap("user_name")
    public String userName;

    // 当前页，默认为 1
    @NameInMap("current_page")
    public Long currentPage;

    // 每页大小，默认为 10
    @NameInMap("page_size")
    public Long pageSize;

    // 排序字段：UTC_CREATE（创建时间）、UTC_MODIFIED（更新时间），默认为 UTC_CREATE
    @NameInMap("sort_field")
    public String sortField;

    // 排序方式：ASC（升序）、DESC（降序），默认为 DESC
    @NameInMap("sort_order")
    public String sortOrder;

    public static QueryProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectMemberRequest self = new QueryProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProjectMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryProjectMemberRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryProjectMemberRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryProjectMemberRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryProjectMemberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryProjectMemberRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryProjectMemberRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
