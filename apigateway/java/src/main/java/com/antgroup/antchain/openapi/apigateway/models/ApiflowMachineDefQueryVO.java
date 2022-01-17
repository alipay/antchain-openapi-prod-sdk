// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowMachineDefQueryVO extends TeaModel {
    // fuzzy_search
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ApiflowMachineDefVO query;

    public static ApiflowMachineDefQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowMachineDefQueryVO self = new ApiflowMachineDefQueryVO();
        return TeaModel.build(map, self);
    }

    public ApiflowMachineDefQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public ApiflowMachineDefQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ApiflowMachineDefQueryVO setQuery(ApiflowMachineDefVO query) {
        this.query = query;
        return this;
    }
    public ApiflowMachineDefVO getQuery() {
        return this.query;
    }

}
