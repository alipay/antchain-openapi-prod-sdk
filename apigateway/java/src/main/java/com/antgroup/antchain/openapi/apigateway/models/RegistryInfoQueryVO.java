// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RegistryInfoQueryVO extends TeaModel {
    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public RegistryInfoVO query;

    public static RegistryInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        RegistryInfoQueryVO self = new RegistryInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public RegistryInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public RegistryInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public RegistryInfoQueryVO setQuery(RegistryInfoVO query) {
        this.query = query;
        return this;
    }
    public RegistryInfoVO getQuery() {
        return this.query;
    }

}
