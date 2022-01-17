// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class StrategyInfoQueryVO extends TeaModel {
    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public StrategyInfoVO query;

    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static StrategyInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        StrategyInfoQueryVO self = new StrategyInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public StrategyInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public StrategyInfoQueryVO setQuery(StrategyInfoVO query) {
        this.query = query;
        return this;
    }
    public StrategyInfoVO getQuery() {
        return this.query;
    }

    public StrategyInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
