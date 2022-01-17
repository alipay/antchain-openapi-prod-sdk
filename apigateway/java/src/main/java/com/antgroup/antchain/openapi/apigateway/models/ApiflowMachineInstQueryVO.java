// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowMachineInstQueryVO extends TeaModel {
    // fuzzy_search
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ApiflowMachineInstVO query;

    public static ApiflowMachineInstQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowMachineInstQueryVO self = new ApiflowMachineInstQueryVO();
        return TeaModel.build(map, self);
    }

    public ApiflowMachineInstQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public ApiflowMachineInstQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ApiflowMachineInstQueryVO setQuery(ApiflowMachineInstVO query) {
        this.query = query;
        return this;
    }
    public ApiflowMachineInstVO getQuery() {
        return this.query;
    }

}
