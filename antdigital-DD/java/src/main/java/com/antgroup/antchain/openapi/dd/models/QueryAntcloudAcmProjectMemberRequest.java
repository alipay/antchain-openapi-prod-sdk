// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudAcmProjectMemberRequest extends TeaModel {
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

    public static QueryAntcloudAcmProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudAcmProjectMemberRequest self = new QueryAntcloudAcmProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudAcmProjectMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudAcmProjectMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntcloudAcmProjectMemberRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryAntcloudAcmProjectMemberRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryAntcloudAcmProjectMemberRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAntcloudAcmProjectMemberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntcloudAcmProjectMemberRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryAntcloudAcmProjectMemberRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
