// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GrayscaleConfigQueryVO extends TeaModel {
    // fuzzy_search
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public GrayscaleConfigVO query;

    public static GrayscaleConfigQueryVO build(java.util.Map<String, ?> map) throws Exception {
        GrayscaleConfigQueryVO self = new GrayscaleConfigQueryVO();
        return TeaModel.build(map, self);
    }

    public GrayscaleConfigQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public GrayscaleConfigQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GrayscaleConfigQueryVO setQuery(GrayscaleConfigVO query) {
        this.query = query;
        return this;
    }
    public GrayscaleConfigVO getQuery() {
        return this.query;
    }

}
