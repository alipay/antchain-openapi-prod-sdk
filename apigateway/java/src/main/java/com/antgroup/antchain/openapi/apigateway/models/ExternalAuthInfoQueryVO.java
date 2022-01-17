// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ExternalAuthInfoQueryVO extends TeaModel {
    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ExternalAuthInfoVO query;

    public static ExternalAuthInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ExternalAuthInfoQueryVO self = new ExternalAuthInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public ExternalAuthInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public ExternalAuthInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ExternalAuthInfoQueryVO setQuery(ExternalAuthInfoVO query) {
        this.query = query;
        return this;
    }
    public ExternalAuthInfoVO getQuery() {
        return this.query;
    }

}
