// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiGroupQueryVO extends TeaModel {
    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ApiGroupVO query;

    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static ApiGroupQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ApiGroupQueryVO self = new ApiGroupQueryVO();
        return TeaModel.build(map, self);
    }

    public ApiGroupQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ApiGroupQueryVO setQuery(ApiGroupVO query) {
        this.query = query;
        return this;
    }
    public ApiGroupVO getQuery() {
        return this.query;
    }

    public ApiGroupQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
