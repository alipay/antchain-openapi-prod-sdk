// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryImageReposcanstrategiesRequest extends TeaModel {
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

    public static QueryImageReposcanstrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryImageReposcanstrategiesRequest self = new QueryImageReposcanstrategiesRequest();
        return TeaModel.build(map, self);
    }

    public QueryImageReposcanstrategiesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryImageReposcanstrategiesRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public QueryImageReposcanstrategiesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryImageReposcanstrategiesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
