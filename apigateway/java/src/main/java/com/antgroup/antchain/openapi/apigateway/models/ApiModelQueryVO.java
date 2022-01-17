// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiModelQueryVO extends TeaModel {
    // 支持模糊查询
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ApiModelVO query;

    public static ApiModelQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ApiModelQueryVO self = new ApiModelQueryVO();
        return TeaModel.build(map, self);
    }

    public ApiModelQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public ApiModelQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ApiModelQueryVO setQuery(ApiModelVO query) {
        this.query = query;
        return this;
    }
    public ApiModelVO getQuery() {
        return this.query;
    }

}
