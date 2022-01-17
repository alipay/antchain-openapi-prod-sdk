// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SystemConfigQueryVO extends TeaModel {
    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public SystemConfigVO query;

    public static SystemConfigQueryVO build(java.util.Map<String, ?> map) throws Exception {
        SystemConfigQueryVO self = new SystemConfigQueryVO();
        return TeaModel.build(map, self);
    }

    public SystemConfigQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public SystemConfigQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public SystemConfigQueryVO setQuery(SystemConfigVO query) {
        this.query = query;
        return this;
    }
    public SystemConfigVO getQuery() {
        return this.query;
    }

}
