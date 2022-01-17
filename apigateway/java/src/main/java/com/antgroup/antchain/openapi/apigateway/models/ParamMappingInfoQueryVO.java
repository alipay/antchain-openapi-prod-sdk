// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ParamMappingInfoQueryVO extends TeaModel {
    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ParamMappingInfoVO query;

    // 支持模糊查询
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static ParamMappingInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ParamMappingInfoQueryVO self = new ParamMappingInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public ParamMappingInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ParamMappingInfoQueryVO setQuery(ParamMappingInfoVO query) {
        this.query = query;
        return this;
    }
    public ParamMappingInfoVO getQuery() {
        return this.query;
    }

    public ParamMappingInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
