// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryGroupMemberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 成员组ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 页大小
    @NameInMap("page_size")
    @Validation(maximum = 100, minimum = 10)
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupMemberRequest self = new QueryGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public QueryGroupMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryGroupMemberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGroupMemberRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
