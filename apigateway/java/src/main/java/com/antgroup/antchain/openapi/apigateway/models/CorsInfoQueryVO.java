// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CorsInfoQueryVO extends TeaModel {
    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public CorsInfoVO query;

    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static CorsInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        CorsInfoQueryVO self = new CorsInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public CorsInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public CorsInfoQueryVO setQuery(CorsInfoVO query) {
        this.query = query;
        return this;
    }
    public CorsInfoVO getQuery() {
        return this.query;
    }

    public CorsInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
