// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RouterInfoQueryVO extends TeaModel {
    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public RouterInfoVO query;

    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static RouterInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        RouterInfoQueryVO self = new RouterInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public RouterInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public RouterInfoQueryVO setQuery(RouterInfoVO query) {
        this.query = query;
        return this;
    }
    public RouterInfoVO getQuery() {
        return this.query;
    }

    public RouterInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
