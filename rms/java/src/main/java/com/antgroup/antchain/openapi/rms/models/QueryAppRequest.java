// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 应用名称模糊搜索
    @NameInMap("keyword")
    public String keyword;

    // 应用名称列表 
    @NameInMap("app_names")
    public java.util.List<String> appNames;

    // 为true时表示查询我的应用
    @NameInMap("only_mine")
    public Boolean onlyMine;

    public static QueryAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppRequest self = new QueryAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAppRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryAppRequest setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

    public QueryAppRequest setOnlyMine(Boolean onlyMine) {
        this.onlyMine = onlyMine;
        return this;
    }
    public Boolean getOnlyMine() {
        return this.onlyMine;
    }

}
