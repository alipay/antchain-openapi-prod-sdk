// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiInfoQueryVO extends TeaModel {
    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ApiInfoVO query;

    // 自定义查询条件
    @NameInMap("query_condition")
    public String queryCondition;

    public static ApiInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ApiInfoQueryVO self = new ApiInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public ApiInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    public ApiInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ApiInfoQueryVO setQuery(ApiInfoVO query) {
        this.query = query;
        return this;
    }
    public ApiInfoVO getQuery() {
        return this.query;
    }

    public ApiInfoQueryVO setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

}
