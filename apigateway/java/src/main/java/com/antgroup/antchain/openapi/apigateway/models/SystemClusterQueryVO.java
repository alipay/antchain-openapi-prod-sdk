// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SystemClusterQueryVO extends TeaModel {
    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public SystemClusterVO query;

    public static SystemClusterQueryVO build(java.util.Map<String, ?> map) throws Exception {
        SystemClusterQueryVO self = new SystemClusterQueryVO();
        return TeaModel.build(map, self);
    }

    public SystemClusterQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public SystemClusterQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public SystemClusterQueryVO setQuery(SystemClusterVO query) {
        this.query = query;
        return this;
    }
    public SystemClusterVO getQuery() {
        return this.query;
    }

}
