// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUsergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 联系人登录名称数组
    @NameInMap("user_login_names")
    public String userLoginNames;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 通知组名称
    @NameInMap("keyword")
    public String keyword;

    // 是否只查询当前操作者的
    @NameInMap("only_current_staff")
    public Boolean onlyCurrentStaff;

    public static QueryUsergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUsergroupRequest self = new QueryUsergroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryUsergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUsergroupRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUsergroupRequest setUserLoginNames(String userLoginNames) {
        this.userLoginNames = userLoginNames;
        return this;
    }
    public String getUserLoginNames() {
        return this.userLoginNames;
    }

    public QueryUsergroupRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUsergroupRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUsergroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUsergroupRequest setOnlyCurrentStaff(Boolean onlyCurrentStaff) {
        this.onlyCurrentStaff = onlyCurrentStaff;
        return this;
    }
    public Boolean getOnlyCurrentStaff() {
        return this.onlyCurrentStaff;
    }

}
