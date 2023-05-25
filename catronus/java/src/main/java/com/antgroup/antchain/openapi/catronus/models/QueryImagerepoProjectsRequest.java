// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryImagerepoProjectsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 仓库ID
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    // 当前页
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 仓库名称
    @NameInMap("project_name")
    public String projectName;

    public static QueryImagerepoProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryImagerepoProjectsRequest self = new QueryImagerepoProjectsRequest();
        return TeaModel.build(map, self);
    }

    public QueryImagerepoProjectsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryImagerepoProjectsRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public QueryImagerepoProjectsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryImagerepoProjectsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryImagerepoProjectsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
