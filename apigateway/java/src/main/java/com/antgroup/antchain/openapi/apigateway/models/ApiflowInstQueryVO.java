// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowInstQueryVO extends TeaModel {
    // fuzzy_search
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ApiflowInstVO query;

    public static ApiflowInstQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowInstQueryVO self = new ApiflowInstQueryVO();
        return TeaModel.build(map, self);
    }

    public ApiflowInstQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public ApiflowInstQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ApiflowInstQueryVO setQuery(ApiflowInstVO query) {
        this.query = query;
        return this;
    }
    public ApiflowInstVO getQuery() {
        return this.query;
    }

}
